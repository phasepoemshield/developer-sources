package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.LivingEntityRenderer;
import net.minecraft.client.render.entity.feature.FeatureRenderer;
import net.minecraft.client.render.entity.state.EntityRenderState;
import net.minecraft.client.render.entity.state.LivingEntityRenderState;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.با;
import oxxxde.رإ;
import oxxxde.صً;
import oxxxde.ضذ;

// $VF: Compiled from MixinLivingEntityRendererHitColor.java
@Mixin(LivingEntityRenderer.class)
public abstract class MixinLivingEntityRendererHitColor {
   @Unique
   private int rain$currentEntityId = Integer.MIN_VALUE;

   @Inject(method = "method_4054", at = @At("HEAD"))
   private void rain$beginRender(
      LivingEntityRenderState state, MatrixStack ci, OrderedRenderCommandQueue cameraState, CameraRenderState submitter, CallbackInfo matrices
   ) {
      this.rain$currentEntityId = ((ضذ)state).rain$getEntityId();
   }

   @Shadow
   public static int getOverlay(LivingEntityRenderState state, float whiteOverlayProgress) {
      throw new AssertionError();
   }

   @ModifyArg(
      method = "method_4054",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11659;method_73490(Lnet/minecraft/class_3879;Ljava/lang/Object;Lnet/minecraft/class_4587;Lnet/minecraft/class_1921;IIILnet/minecraft/class_1058;ILnet/minecraft/class_11683$class_11792;)V"
      ),
      index = 5
   )
   private int rain$replaceEntityOverlay(int overlay) {
      return رإ.INSTANCE.resolveOverlay(this.rain$currentEntityId, overlay);
   }

   @Inject(method = "method_62355", at = @At("TAIL"))
   private void rain$captureEntityId(LivingEntity state, LivingEntityRenderState entity, float ci, CallbackInfo tickProgress) {
      ((ضذ)state).rain$setEntityId(entity.getId());
   }

   @Shadow
   protected abstract float getAnimationCounter(LivingEntityRenderState var1);

   @Inject(method = "method_4054", at = @At("RETURN"))
   private void rain$endRender(
      LivingEntityRenderState submitter, MatrixStack matrices, OrderedRenderCommandQueue ci, CameraRenderState cameraState, CallbackInfo state
   ) {
      this.rain$currentEntityId = Integer.MIN_VALUE;
   }

   @WrapOperation(
      method = "method_4054",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_3887;method_4199(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;ILnet/minecraft/class_10017;FF)V"
      )
   )
   private void rain$passOverlayToEveryFeature(
      FeatureRenderer<?, ?> instance,
      MatrixStack original,
      OrderedRenderCommandQueue matrices,
      int livingState,
      EntityRenderState relativeHeadYaw,
      float state,
      float pitch,
      Operation<Void> light,
      LivingEntityRenderState submitter
   ) {
      boolean previousArmorOverlayActive = با.isArmorOverlayActive();
      int previousArmorOverlay = با.getArmorOverlay();
      int overlay = getOverlay(livingState, this.getAnimationCounter(livingState));
      int resolvedOverlay = رإ.INSTANCE.resolveOverlay(this.rain$currentEntityId, overlay);
      if (instance instanceof صً overlayAware) {
         overlayAware.rain$setOverlayCoords(resolvedOverlay);
      }

      با.setArmorOverlay(resolvedOverlay);

      try {
         original.call(new Object[]{instance, matrices, submitter, light, state, relativeHeadYaw, pitch});
      } finally {
         با.restoreArmorOverlay(previousArmorOverlayActive, previousArmorOverlay);
      }
   }
}
