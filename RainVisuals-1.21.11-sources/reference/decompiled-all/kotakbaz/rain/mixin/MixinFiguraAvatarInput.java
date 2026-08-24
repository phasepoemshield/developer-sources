package kotakbaz.rain.mixin;

import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Pseudo;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import other.figura.math.matrix.FiguraMat4;
import other.figura.model.rendering.EntityRenderMode;
import oxxxde.شآ;

// $VF: Compiled from MixinFiguraAvatarInput.java
@Pseudo
@Mixin(targets = "other/figura/avatar/Avatar", remap = false)
public abstract class MixinFiguraAvatarInput {
   @Shadow(remap = false)
   public EntityRenderMode renderMode;

   @Inject(method = {"mouseScrollEvent", "mouseMoveEvent", "mousePressEvent", "keyPressEvent"}, at = @At("HEAD"), cancellable = true, remap = false)
   private void rain$blockFiguraAvatarInput(CallbackInfoReturnable<Boolean> cir) {
      cir.setReturnValue(false);
   }

   @Inject(method = "renderEvent", at = @At("HEAD"), cancellable = true, remap = false)
   private void rain$freezeFiguraPreviewRenderEvent(float delta, FiguraMat4 ci, CallbackInfo poseMatrix) {
      if (شآ.isRenderingPreview()) {
         ci.cancel();
      }
   }

   @Inject(method = "charTypedEvent", at = @At("HEAD"), cancellable = true, remap = false)
   private void rain$blockFiguraAvatarTextInput(CallbackInfo ci) {
      ci.cancel();
   }

   @Inject(method = "applyAnimations", at = @At("HEAD"), cancellable = true, remap = false)
   private void rain$freezeFiguraPreviewAnimations(CallbackInfo ci) {
      if (شآ.isRenderingPreview()) {
         ci.cancel();
      }
   }

   @Inject(method = "tick", at = @At("HEAD"), cancellable = true, remap = false)
   private void rain$freezeFiguraPreviewTick(CallbackInfo ci) {
      if (شآ.isRenderingPreview()) {
         ci.cancel();
      }
   }

   @Inject(method = "postRenderEvent", at = @At("HEAD"), cancellable = true, remap = false)
   private void rain$freezeFiguraPreviewPostRenderEvent(float ci, FiguraMat4 poseMatrix, CallbackInfo delta) {
      if (شآ.isRenderingPreview()) {
         this.renderMode = EntityRenderMode.OTHER;
         ci.cancel();
      }
   }
}
