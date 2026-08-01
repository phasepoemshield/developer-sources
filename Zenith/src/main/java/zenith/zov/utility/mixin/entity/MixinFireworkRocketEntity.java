package zenith.zov.utility.mixin.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import com.llamalad7.mixinextras.sugar.Local;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.util.math.Vec3d;
import net.minecraft.client.MinecraftClient;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import zenith.ZenithClient;
import zenith.floatHolder_6;
import zenith.Elytrabooster;

@Mixin({FireworkRocketEntity.class})
public abstract class MixinFireworkRocketEntity {
   @Shadow
   private LivingEntity shooter;

   @ModifyExpressionValue(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   private Vec3d getRotationVector(Vec3d Vec3d) {
      if (this.shooter != MinecraftClient.getInstance().player) {
         return Vec3d;
      } else {
         floatHolder_6 il1ll111liili1ll11liil = ZenithClient.getInstance()
            .ZenithInternal057()
            .I111Ill1lIllIIIl();
         return il1ll111liili1ll11liil == null ? Vec3d : il1ll111liili1ll11liil.lllIl11IIIlIIlI1();
      }
   }

   @ModifyArgs(
      method = {"tick"},
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/util/math/Vec3d;add(DDD)Lnet/minecraft/util/math/Vec3d;",
         ordinal = 0
      )
   )
   private void hookExtendedFirework(Args args, @Local(ordinal = 0) Vec3d Vec3d, @Local(ordinal = 1) Vec3d Vec3d) {
      if (this.shooter == MinecraftClient.getInstance().player && Elytrabooster.l1lllIl1IIllI1l1l11IlI.Spider()) {
         args.set(
            0,
            Vec3dx.x * 0.1
               + (Vec3dx.x * Elytrabooster.l1lllIl1IIllI1l1l11IlI.Il11I1Il1lI11lllll1I1I1l() - Vec3d.x) * 0.5
         );
         args.set(
            1,
            Vec3dx.y * 0.1
               + (Vec3dx.y * Elytrabooster.l1lllIl1IIllI1l1l11IlI.Il11I1Il1lI11lllll1I1I1l() - Vec3d.y) * 0.5
         );
         args.set(
            2,
            Vec3dx.z * 0.1
               + (Vec3dx.z * Elytrabooster.l1lllIl1IIllI1l1l11IlI.Il11I1Il1lI11lllll1I1I1l() - Vec3d.z) * 0.5
         );
      }
   }
}
