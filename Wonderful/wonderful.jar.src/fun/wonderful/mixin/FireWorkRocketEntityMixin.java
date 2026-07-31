package fun.wonderful.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import fun.wonderful.api.events.implement.EventFireWork;
import fun.wonderful.api.events.implement.EventFireworkMotion;
import fun.wonderful.api.storages.implement.helpertstorages.enumvar.ModuleClass;
import fun.wonderful.api.utils.player.BoostUtils;
import fun.wonderful.client.modules.impl.combat.Aura;
import fun.wonderful.client.modules.impl.combat.ElytraTarget;
import fun.wonderful.client.modules.impl.combat.components.rotations.КомпонентЭлитры;
import fun.wonderful.client.modules.impl.movement.ElytraBoost;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.entity.projectile.ProjectileEntity;
import net.minecraft.world.World;
import net.minecraft.util.math.Vec2f;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

@Mixin(value={FireworkRocketEntity.class})
public abstract class FireWorkRocketEntityMixin
extends ProjectileEntity {
    @Unique
    private Vec3d rotation;
    @Shadow
    private LivingEntity shooter;

    public FireWorkRocketEntityMixin(EntityType<? extends ProjectileEntity> entityType, World world) {
        super(entityType, world);
    }

    @Inject(method={"tick"}, at={@At(value="HEAD")})
    public void tick(CallbackInfo ci) {
        new EventFireWork((FireworkRocketEntity)this).call();
    }

    @ModifyExpressionValue(method={"tick"}, at={@At(value="INVOKE", target="Lnet/minecraft/LivingEntity;getRotationVector()Lnet/minecraft/Vec3d;")})
    public Vec3d captureRotation(Vec3d original) {
        Vec3d pursuit;
        this.rotation = pursuit = this.getElytraTargetFireworkVector(original);
        return this.rotation;
    }

    @Unique
    private Vec3d getElytraTargetFireworkVector(Vec3d fallback) {
        MinecraftClient mc = MinecraftClient.getInstance();
        if (mc.player == null || !mc.player.isGliding() || this.shooter != mc.player) {
            return fallback;
        }
        Aura aura = Aura.INSTANCE;
        ElytraTarget elytraTarget = ModuleClass.elytraTarget;
        if (aura == null || !aura.isEnable() || elytraTarget == null || !elytraTarget.isEnable()) {
            return fallback;
        }
        LivingEntity target = aura.getTarget();
        if (target == null || !elytraTarget.shouldTarget(target)) {
            return fallback;
        }
        Vec3d vector = КомпонентЭлитры.AIComputeFireworkVector((LivingEntity)mc.player, target, elytraTarget);
        return vector.lengthSquared() > 1.0E-6 ? vector.normalize() : fallback;
    }

    @Redirect(method={"tick"}, at=@At(value="INVOKE", target="Lnet/minecraft/Vec3d;add(DDD)Lnet/minecraft/Vec3d;", ordinal=0))
    public Vec3d modifyBoost(Vec3d velocity, double x2, double y2, double z2) {
        MinecraftClient mc = MinecraftClient.getInstance();
        ElytraBoost elytraBoost = ElytraBoost.INSTANCE;
        if (mc.player == null || !mc.player.isGliding()) {
            return this.defaultBoost(velocity, x2, y2, z2);
        }
        if (this.shooter == mc.player) {
            EventFireworkMotion event = new EventFireworkMotion((LivingEntity)mc.player, (FireworkRocketEntity)this, new Vec3d(x2, y2, z2));
            event.call();
            if (event.isCancelled()) {
                Vec3d modified = event.getVector3d();
                return this.defaultBoost(velocity, modified.x, modified.y, modified.z);
            }
        }
        if (elytraBoost == null || !elytraBoost.isEnable()) {
            return this.defaultBoost(velocity, x2, y2, z2);
        }
        return this.handleElytraBoost(mc, elytraBoost, velocity, x2, y2, z2);
    }

    @Unique
    private Vec3d handleElytraBoost(MinecraftClient mc, ElytraBoost elytraBoost, Vec3d velocity, double vanillaX, double vanillaY, double vanillaZ) {
        String modeName;
        if (this.rotation == null) {
            return this.defaultBoost(velocity, vanillaX, vanillaY, vanillaZ);
        }
        Vec3d boost = switch (modeName = elytraBoost.getMode().getCurrent()) {
            case "LonyGrief" -> BoostUtils.getBoost((LivingEntity)mc.player);
            case "SlimeWorld" -> BoostUtils.getBoostslime((LivingEntity)mc.player);
            case "BravoHVH" -> BoostUtils.getBoostbravo((LivingEntity)mc.player);
            case "ReallyWorld" -> BoostUtils.getBoostrw((LivingEntity)mc.player);
            default -> {
                Vec2f customBoost = elytraBoost.getBoostV2();
                yield new Vec3d((double)customBoost.x, (double)customBoost.y, (double)customBoost.x);
            }
        };
        boost = elytraBoost.adaptBoost(boost);
        double jx = (Math.random() - 0.5) * 0.001;
        double jy = (Math.random() - 0.5) * 5.0E-4;
        double jz = (Math.random() - 0.5) * 0.001;
        return velocity.add(this.rotation.x * 0.1 + (this.rotation.x * boost.x - velocity.x) * 0.5 + jx, this.rotation.y * 0.1 + (this.rotation.y * boost.y - velocity.y) * 0.5 + jy, this.rotation.z * 0.1 + (this.rotation.z * boost.z - velocity.z) * 0.5 + jz);
    }

    @Unique
    private Vec3d defaultBoost(Vec3d velocity, double x2, double y2, double z2) {
        return velocity.add(x2, y2, z2);
    }
}