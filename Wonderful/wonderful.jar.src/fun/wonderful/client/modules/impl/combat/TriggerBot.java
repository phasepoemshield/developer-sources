package fun.wonderful.client.modules.impl.combat;

import fun.wonderful.Wonderful;
import fun.wonderful.api.events.EventLink;
import fun.wonderful.api.events.implement.EventMoveInput;
import fun.wonderful.api.events.implement.EventUpdate;
import fun.wonderful.api.utils.math.TimerUtils;
import fun.wonderful.client.modules.Module;
import fun.wonderful.client.modules.impl.movement.Sprint;
import fun.wonderful.client.modules.settings.implement.BooleanSetting;
import fun.wonderful.client.modules.settings.implement.FloatSetting;
import fun.wonderful.client.modules.settings.implement.ListSetting;
import lombok.Generated;
import net.minecraft.util.Hand;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.entity.passive.PassiveEntity;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.passive.CodEntity;
import net.minecraft.entity.decoration.ArmorStandEntity;
import net.minecraft.entity.mob.HostileEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.projectile.ProjectileUtil;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;
import net.minecraft.block.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Box;
import net.minecraft.util.math.Vec3d;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.hit.EntityHitResult;
import ru.ocz.protection.annotation.Compile;

public class TriggerBot
extends Module {
    public static TriggerBot INSTANCE = new TriggerBot();
    private final FloatSetting range = new FloatSetting("Дистанция атаки", 3.0f, 0.0f, 6.0f, 0.05f);
    private final ListSetting options = new ListSetting("Опции", new BooleanSetting("Умные криты", true), new BooleanSetting("Сброс спринта", true), new BooleanSetting("Бить через стены", false), new BooleanSetting("Проверка на наведение", true), new BooleanSetting("Отжимать щит", false), new BooleanSetting("Ломать щит", true));
    private final ListSetting targets = new ListSetting("Таргеты", new BooleanSetting("Игроки", true), new BooleanSetting("Невидимки", true), new BooleanSetting("Мирные", false), new BooleanSetting("Мобы", true));
    private LivingEntity target;
    private final TimerUtils attackTimer = new TimerUtils();
    private boolean needSprintReset = false;
    private boolean sprintResetDone = false;
    private int sprintResetTicks = 0;

    public TriggerBot() {
        super("TriggerBot", "Автоматически атакует при наведении", Module.ModuleCategory.COMBAT);
        this.addSettings(this.range, this.options, this.targets);
    }

    @EventLink
    public void onMoveInput(EventMoveInput event) {
        if (this.needSprintReset) {
            event.setForward(0.0f);
            event.setStrafe(0.0f);
            this.needSprintReset = false;
            this.sprintResetDone = true;
            this.sprintResetTicks = 0;
        }
    }

    @EventLink
    @Compile
    public native void onUpdate(EventUpdate var1);

    @Compile
    private native void processAttack();

    private LivingEntity getTargetUnderCrosshair() {
        LivingEntity living;
        Entity class_12972;
        float rangeValue;
        Vec3d lookVec;
        Vec3d reachVec;
        Vec3d eyePos = TriggerBot.mc.player.getCameraPosVec(1.0f);
        EntityHitResult result = ProjectileUtil.raycast((Entity)TriggerBot.mc.player, (Vec3d)eyePos, (Vec3d)(reachVec = eyePos.add((lookVec = TriggerBot.mc.player.getRotationVec(1.0f)).multiply((double)(rangeValue = this.range.getValue().floatValue())))), (Box)TriggerBot.mc.player.getBoundingBox().expand((double)rangeValue), entity -> entity != TriggerBot.mc.player && entity.isAlive() && entity instanceof LivingEntity, (double)(rangeValue * rangeValue));
        if (result != null && (class_12972 = result.getEntity()) instanceof LivingEntity && this.isValidTarget(living = (LivingEntity)class_12972)) {
            return living;
        }
        return null;
    }

    @Compile
    private native void attack();

    private void shieldBreak(PlayerEntity entity) {
        int axeSlot = this.findAxeSlot();
        if (axeSlot != -1) {
            int prevSlot = TriggerBot.mc.player.getInventory().selectedSlot;
            TriggerBot.mc.player.getInventory().selectedSlot = axeSlot;
            TriggerBot.mc.interactionManager.attackEntity((PlayerEntity)TriggerBot.mc.player, (Entity)entity);
            TriggerBot.mc.player.swingHand(Hand.MAIN_HAND);
            TriggerBot.mc.player.getInventory().selectedSlot = prevSlot;
        } else {
            TriggerBot.mc.interactionManager.attackEntity((PlayerEntity)TriggerBot.mc.player, (Entity)entity);
        }
    }

    private int findAxeSlot() {
        for (int i2 = 0; i2 < 9; ++i2) {
            if (!(TriggerBot.mc.player.getInventory().getStack(i2).getItem() instanceof AxeItem)) continue;
            return i2;
        }
        return -1;
    }

    private boolean isValidTarget(LivingEntity entity) {
        if (entity == null || entity == TriggerBot.mc.player) {
            return false;
        }
        if (!entity.isAlive() || entity.getHealth() <= 0.0f) {
            return false;
        }
        if (entity instanceof ArmorStandEntity) {
            return false;
        }
        if (entity instanceof PlayerEntity) {
            PlayerEntity player = (PlayerEntity)entity;
            if (!this.targets.is("Игроки")) {
                return false;
            }
            if (player.hasStatusEffect(StatusEffects.INVISIBILITY) && !this.targets.is("Невидимки")) {
                return false;
            }
            if (Wonderful.INSTANCE.friendStorage.isFriend(entity.getName().getString())) {
                return false;
            }
        } else if (entity instanceof PassiveEntity || entity instanceof CodEntity ? !this.targets.is("Мирные") : entity instanceof HostileEntity && !this.targets.is("Мобы")) {
            return false;
        }
        if (TriggerBot.mc.player.getEyePos().distanceTo(entity.getBoundingBox().getCenter()) > (double)this.range.getValue().floatValue()) {
            return false;
        }
        return this.options.is("Бить через стены") || TriggerBot.mc.player.canSee((Entity)entity);
    }

    private boolean shouldAttack() {
        float rangeValue;
        Vec3d lookVec;
        Vec3d reachVec;
        Vec3d eyePos;
        EntityHitResult result;
        if (TriggerBot.mc.player.getAttackCooldownProgress(1.5f) < this.getAICooldown()) {
            return false;
        }
        if (this.options.is("Проверка на наведение") && ((result = ProjectileUtil.raycast((Entity)TriggerBot.mc.player, (Vec3d)(eyePos = TriggerBot.mc.player.getCameraPosVec(1.0f)), (Vec3d)(reachVec = eyePos.add((lookVec = TriggerBot.mc.player.getRotationVec(1.0f)).multiply((double)(rangeValue = this.range.getValue().floatValue())))), (Box)TriggerBot.mc.player.getBoundingBox().expand((double)rangeValue), ex -> ex != TriggerBot.mc.player && ex.isAlive(), (double)(rangeValue * rangeValue))) == null || result.getEntity() != this.target)) {
            return false;
        }
        return !this.options.is("Умные криты") || this.canCritical();
    }

    private float getAICooldown() {
        Item item = TriggerBot.mc.player.getMainHandStack().getItem();
        if (item == Items.AIR) {
            return 0.9f;
        }
        if (item instanceof AxeItem || item instanceof ShovelItem) {
            return 0.95f;
        }
        return 0.93f;
    }

    private boolean canCritical() {
        boolean isCritPossible;
        boolean bl = isCritPossible = !TriggerBot.mc.player.isOnGround() && TriggerBot.mc.player.getVelocity().y < 0.0 && TriggerBot.mc.player.fallDistance > 0.0f;
        if (this.cannotPerformCrit()) {
            return true;
        }
        return isCritPossible;
    }

    private boolean cannotPerformCrit() {
        return TriggerBot.mc.player.isInLava() || TriggerBot.mc.player.isClimbing() || TriggerBot.mc.player.hasStatusEffect(StatusEffects.LEVITATION) || TriggerBot.mc.player.hasStatusEffect(StatusEffects.SLOW_FALLING) || TriggerBot.mc.player.hasStatusEffect(StatusEffects.BLINDNESS) || this.isInCobweb() || TriggerBot.mc.player.isGliding() || TriggerBot.mc.player.hasVehicle() || TriggerBot.mc.player.getAbilities().flying || TriggerBot.mc.player.isTouchingWater() || TriggerBot.mc.player.isSubmergedInWater();
    }

    private boolean isInCobweb() {
        if (TriggerBot.mc.player == null || TriggerBot.mc.world == null) {
            return false;
        }
        Box box = TriggerBot.mc.player.getBoundingBox();
        for (BlockPos pos : BlockPos.iterate((int)MathHelper.floor((double)box.minX), (int)MathHelper.floor((double)box.minY), (int)MathHelper.floor((double)box.minZ), (int)MathHelper.floor((double)box.maxX), (int)MathHelper.floor((double)box.maxY), (int)MathHelper.floor((double)box.maxZ))) {
            if (!TriggerBot.mc.world.getBlockState(pos).isOf(Blocks.COBWEB)) continue;
            return true;
        }
        return false;
    }

    private void resetSprintState() {
        this.sprintResetDone = false;
        this.sprintResetTicks = 0;
    }

    private boolean shouldSkipSprintResetInWater() {
        return TriggerBot.mc.player != null && (TriggerBot.mc.player.isTouchingWater() || TriggerBot.mc.player.isSubmergedInWater()) && Sprint.INSTANCE != null && Sprint.INSTANCE.shouldKeepSprintInWater();
    }

    @Override
    public void onDisable() {
        super.onDisable();
        this.target = null;
        this.needSprintReset = false;
        this.sprintResetDone = false;
        this.sprintResetTicks = 0;
    }

    @Override
    public void onEnable() {
        super.onEnable();
        this.needSprintReset = false;
        this.sprintResetDone = false;
        this.sprintResetTicks = 0;
    }

    @Generated
    public LivingEntity getTarget() {
        return this.target;
    }
}