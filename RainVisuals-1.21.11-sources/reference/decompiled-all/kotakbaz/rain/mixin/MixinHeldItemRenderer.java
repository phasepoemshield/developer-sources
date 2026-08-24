package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperation;
import net.minecraft.client.MinecraftClient;
import net.minecraft.client.network.AbstractClientPlayerEntity;
import net.minecraft.client.network.ClientPlayerEntity;
import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.item.HeldItemRenderer;
import net.minecraft.client.render.item.ItemRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;
import net.minecraft.item.ItemDisplayContext;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Arm;
import net.minecraft.util.Hand;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import org.spongepowered.asm.mixin.injection.At.Shift;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.ثِ;
import oxxxde.رأ;
import oxxxde.رظ;
import oxxxde.زأ;
import oxxxde.سع;
import oxxxde.صِ;
import oxxxde.طق;

// $VF: Compiled from MixinHeldItemRenderer.java
@Mixin(HeldItemRenderer.class)
public abstract class MixinHeldItemRenderer {
   @ModifyArg(
      method = "method_22976",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_7833;rotationDegrees(F)Lorg/joml/Quaternionf;", ordinal = 0),
      index = 0
   )
   private float rain$removeVerticalHandSway(float degrees) {
      return this.rain$shouldRemoveHandSway() ? 0.0F : degrees;
   }

   private boolean rain$shouldRemoveHandSway() {
      return صِ.INSTANCE.isEnabled() && صِ.INSTANCE.getNoHandSway().getValue();
   }

   @ModifyArg(
      method = "method_22976",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_7833;rotationDegrees(F)Lorg/joml/Quaternionf;", ordinal = 1),
      index = 0
   )
   private float rain$removeHorizontalHandSway(float degrees) {
      return this.rain$shouldRemoveHandSway() ? 0.0F : degrees;
   }

   @WrapOperation(
      method = "method_3228",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_759;method_3224(Lnet/minecraft/class_4587;Lnet/minecraft/class_1306;F)V", ordinal = 4)
   )
   private void rain$skipVanillaEquipOffsetForSwingAnimation(
      HeldItemRenderer equipProgress, MatrixStack original, Arm instance, float poseStack, Operation<Void> arm
   ) {
      ClientPlayerEntity player = MinecraftClient.getInstance().player;
      if (!ثِ.INSTANCE.isEnabled() || player == null || !arm.equals(player.getMainArm())) {
         original.call(new Object[]{instance, poseStack, arm, equipProgress});
      }
   }

   @Inject(method = "method_3228", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_4587;method_22903()V", shift = Shift.AFTER, ordinal = 0))
   private void onRenderFirstPersonItem(
      AbstractClientPlayerEntity item,
      float matrices,
      float pitch,
      Hand equipProgress,
      float tickProgress,
      ItemStack swingProgress,
      float player,
      MatrixStack light,
      OrderedRenderCommandQueue submitter,
      int hand,
      CallbackInfo ci
   ) {
      زأ.INSTANCE.captureHandOffsetBase(hand, matrices.peek());
      رظ.INSTANCE.post(new سع(matrices, item, hand));
   }

   @WrapOperation(
      method = "method_3228",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_759;method_3233(Lnet/minecraft/class_1309;Lnet/minecraft/class_1799;Lnet/minecraft/class_811;Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;I)V"
      )
   )
   private void rain$scaleFirstPersonItem(
      HeldItemRenderer tickProgress,
      LivingEntity submitter,
      ItemStack player,
      ItemDisplayContext pitch,
      MatrixStack entity,
      OrderedRenderCommandQueue hand,
      int poseStack,
      Operation<Void> stack,
      AbstractClientPlayerEntity original,
      float displayContext,
      float light,
      Hand instance
   ) {
      float scale = زأ.INSTANCE.animatedScale(hand);
      زأ.INSTANCE.beginItemBoundsCapture(hand, tickProgress);

      try {
         if (scale != 1.0F) {
            poseStack.push();
            poseStack.scale(scale, scale, scale);

            try {
               original.call(new Object[]{instance, entity, stack, displayContext, poseStack, submitter, light});
               return;
            } finally {
               poseStack.pop();
            }
         }

         original.call(new Object[]{instance, entity, stack, displayContext, poseStack, submitter, light});
      } finally {
         زأ.INSTANCE.endItemBoundsCapture(hand);
      }
   }

   @WrapOperation(
      method = "method_3228",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_759;method_65816(FLnet/minecraft/class_4587;ILnet/minecraft/class_1306;)V", ordinal = 2)
   )
   private void rain$dispatchSwingAnimation(HeldItemRenderer instance, float original, MatrixStack swingProgress, int arm, Arm poseStack, Operation<Void> armX) {
      رأ event = new رأ(poseStack, arm, swingProgress, 0.0F);
      رظ.INSTANCE.post(event);
      if (!event.getCancel()) {
         original.call(new Object[]{instance, swingProgress, poseStack, armX, arm});
      }
   }

   @WrapOperation(
      method = "method_3233",
      at = @At(value = "INVOKE", target = "Lnet/minecraft/class_10444;method_65604(Lnet/minecraft/class_4587;Lnet/minecraft/class_11659;III)V")
   )
   private void rain$captureViewModelItemBounds(
      ItemRenderState seed, MatrixStack original, OrderedRenderCommandQueue state, int submitter, int overlay, int light, Operation<Void> poseStack
   ) {
      زأ.INSTANCE.captureRenderedBounds(state, poseStack.peek());
      original.call(new Object[]{state, poseStack, submitter, light, overlay, seed});
   }

   @Inject(method = "method_3219", at = @At("HEAD"), cancellable = true)
   private void rain$hideVanillaArmsWhileApplyingAvatar(
      MatrixStack matrices, OrderedRenderCommandQueue submitter, int light, float ci, float swingProgress, Arm equipProgress, CallbackInfo arm
   ) {
      if (طق.isApplyingAnyAvatar()) {
         ci.cancel();
      }
   }
}
