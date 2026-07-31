package fat.releon.mixins.player.entity;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import l.Helper124;
import l.Helper160;
import l.Helper351;
import l.Event26;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.projectile.FireworkRocketEntity;
import net.minecraft.util.math.Vec3d;
import org.jetbrains.annotations.Nullable;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;

@Mixin({FireworkRocketEntity.class})
public class FireworkRocketEntityMixin implements Helper160 {
   @Shadow
   @Nullable
   private LivingEntity shooter;

   public FireworkRocketEntityMixin() {
   }

   @WrapOperation(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   public Vec3d getRotationVectorHook(LivingEntity var1, Operation<Vec3d> var2) {
      return this.shooter == mc.player ? Helper351.INSTANCE.method3496().method3329() : (Vec3d)var2.call(new Object[]{var1});
   }

   @WrapOperation(
      method = {"tick"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/LivingEntity;getVelocity()Lnet/minecraft/util/math/Vec3d;",
         ordinal = 0
      )}
   )
   public Vec3d getVelocityHook(LivingEntity var1, Operation<Vec3d> var2) {
      if (this.shooter == mc.player) {
         Event26 var3 = new Event26((Vec3d)var2.call(new Object[]{var1}));
         Helper124.method1026(var3);
         return var3.method4143();
      } else {
         return (Vec3d)var2.call(new Object[]{var1});
      }
   }
}
