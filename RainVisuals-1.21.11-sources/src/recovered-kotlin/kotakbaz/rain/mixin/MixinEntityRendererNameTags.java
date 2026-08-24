package kotakbaz.rain.mixin;

import net.minecraft.client.render.command.OrderedRenderCommandQueue;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.render.state.CameraRenderState;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Vec3d;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;
import oxxxde.حغ;
import oxxxde.را;

// $VF: Compiled from MixinEntityRendererNameTags.java
@Mixin(EntityRenderer.class)
public class MixinEntityRendererNameTags {
   @Inject(method = "method_62426", at = @At("RETURN"), cancellable = true)
   private void rain$addSocialMarker(Entity cir, CallbackInfoReturnable<Text> entity) {
      if (entity instanceof PlayerEntity && حغ.INSTANCE.isRainUser(entity.getUuid())) {
         cir.setReturnValue(را.mark((Text)cir.getReturnValue()));
      }
   }

   @Redirect(
      method = "method_3926",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11659;method_73482(Lnet/minecraft/class_4587;Lnet/minecraft/class_243;ILnet/minecraft/class_2561;ZIDLnet/minecraft/class_12075;)V"
      )
   )
   private void rain$redirectLabelDraw(
      OrderedRenderCommandQueue showBackground,
      MatrixStack text,
      Vec3d attachment,
      int yOffset,
      Text collector,
      boolean light,
      int cameraState,
      double poseStack,
      CameraRenderState distanceToCameraSq
   ) {
      collector.submitLabel(poseStack, attachment, yOffset, text, showBackground, light, distanceToCameraSq, cameraState);
   }
}
