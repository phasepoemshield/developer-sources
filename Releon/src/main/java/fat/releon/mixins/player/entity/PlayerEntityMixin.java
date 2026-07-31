package fat.releon.mixins.player.entity;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import l.Helper124;
import l.Helper160;
import l.Helper351;
import l.Helper368;
import l.Helper369;
import l.Helper376;
import l.Event15;
import l.Helper387;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

@Mixin({PlayerEntity.class})
public abstract class PlayerEntityMixin implements Helper160 {
   public PlayerEntityMixin() {
   }

   @Inject(
      method = {"isPushedByFluids"},
      at = {@At("HEAD")},
      cancellable = true
   )
   public void isPushedByFluids(CallbackInfoReturnable<Boolean> var1) {
      Helper369 var2 = new Helper369(Helper368.WATER);
      Helper124.method1026(var2);
      if (var2.method581()) {
         var1.setReturnValue(false);
      }
   }

   @Inject(
      method = {"attack"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;setSprinting(Z)V",
         shift = Shift.AFTER
      )}
   )
   public void attackHook(CallbackInfo var1) {
      Helper124.method1026(new Event15());
   }

   @ModifyExpressionValue(
      method = {"attack"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;getYaw()F"
      )}
   )
   private float hookFixRotation(float var1) {
      return Helper351.INSTANCE.method3496().method3333();
   }

   @ModifyExpressionValue(
      method = {"travel"},
      at = {@At(
         value = "INVOKE",
         target = "Lnet/minecraft/entity/player/PlayerEntity;getRotationVector()Lnet/minecraft/util/math/Vec3d;"
      )}
   )
   public Vec3d travelHook(Vec3d var1) {
      Helper376 var2 = new Helper376(var1);
      Helper124.method1026(var2);
      return var2.method3699();
   }

   @Inject(
      method = {"travel"},
      at = {@At("HEAD")},
      cancellable = true
   )
   private void onTravelPre(Vec3d var1, CallbackInfo var2) {
      if (mc.player != null) {
         Helper387 var3 = new Helper387(var1, true);
         Helper124.method1026(var3);
         if (var3.method581()) {
            var2.cancel();
         }
      }
   }

   @Inject(
      method = {"travel"},
      at = {@At("RETURN")},
      cancellable = true
   )
   private void onTravelPost(Vec3d var1, CallbackInfo var2) {
      if (mc.player != null) {
         Helper387 var3 = new Helper387(var1, false);
         Helper124.method1026(var3);
         if (var3.method581()) {
         }
      }
   }
}
