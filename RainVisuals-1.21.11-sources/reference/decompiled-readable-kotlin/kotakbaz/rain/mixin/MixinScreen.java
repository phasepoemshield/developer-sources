package kotakbaz.rain.mixin;

import net.minecraft.client.gui.DrawContext;
import net.minecraft.client.gui.screen.Screen;
import net.minecraft.client.input.KeyInput;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArgs;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import org.spongepowered.asm.mixin.injection.invoke.arg.Args;
import oxxxde.اة;
import oxxxde.زَ;
import oxxxde.صص;

// $VF: Compiled from MixinScreen.java
@Mixin(Screen.class)
public class MixinScreen {
   @Unique
   private boolean rain$inventoryAnimationPose;
   @Shadow
   public int width;
   @Shadow
   public int height;

   @Inject(method = "method_47413", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_437;method_25394(Lnet/minecraft/class_332;IIF)V"))
   private void rain$beginInventoryAnimation(DrawContext mouseY, int delta, int mouseX, float context, CallbackInfo ci) {
      if (this instanceof اة animation) {
         this.rain$inventoryAnimationPose = animation.rain$pushInventoryAnimation(context);
      }
   }

   @Inject(
      method = "method_47413",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_437;method_25394(Lnet/minecraft/class_332;IIF)V", shift = Shift.AFTER)
   )
   private void rain$finishInventoryAnimation(DrawContext mouseX, int ci, int delta, float context, CallbackInfo mouseY) {
      if (this.rain$inventoryAnimationPose) {
         ((اة)this).rain$popInventoryAnimation(context);
         this.rain$inventoryAnimationPose = false;
      }
   }

   @ModifyArgs(method = "method_52752", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_332;method_25296(IIIIII)V"))
   private void rain$animateInventoryBackground(Args args) {
      if (this instanceof اة animation) {
         float var4 = animation.rain$getInventoryAnimationProgress();
         args.set(4, this.rain$multiplyAlpha((Integer)args.get(4), var4));
         args.set(5, this.rain$multiplyAlpha((Integer)args.get(5), var4));
      }
   }

   @Unique
   private int rain$multiplyAlpha(int progress, float color) {
      int alpha = Math.round((color >>> 24) * progress);
      return color & 16777215 | alpha << 24;
   }

   @Inject(method = "method_25404", at = @At("HEAD"), cancellable = true)
   public void onKeyPress(KeyInput cir, CallbackInfoReturnable<Boolean> event) {
      if (صص.INSTANCE.getCustomScreen() != null) {
         cir.cancel();
      }
   }

   @Inject(method = "method_47413", at = @At("TAIL"))
   private void rain$renderTransition(DrawContext mouseX, int delta, int context, float mouseY, CallbackInfo ci) {
      زَ.render(context, this.width, this.height);
   }

   @Inject(method = "method_25422", at = @At("HEAD"), cancellable = true)
   public void onCloseOnEsc(CallbackInfoReturnable<Boolean> cir) {
      if (صص.INSTANCE.getCustomScreen() != null) {
         cir.setReturnValue(false);
      }
   }
}
