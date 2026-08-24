package kotakbaz.rain.mixin;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.font.TextRenderer.TextLayerType;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.VertexConsumerProvider.Immediate;
import net.minecraft.client.render.command.BatchingRenderCommandQueue;
import net.minecraft.client.render.command.LabelCommandRenderer;
import net.minecraft.text.Text;
import org.joml.Matrix4f;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Unique;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.Redirect;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import oxxxde.را;
import oxxxde.زت;

// $VF: Compiled from MixinNameTagFeatureRenderer.java
@Mixin(LabelCommandRenderer.class)
public class MixinNameTagFeatureRenderer {
   @Unique
   private final List<MixinNameTagFeatureRenderer.RainSocialOverlay> rain$socialOverlays = new ArrayList<>();

   @Inject(method = "method_73014", at = @At("TAIL"))
   private void rain$finishNameTagRender(BatchingRenderCommandQueue font, Immediate nodes, TextRenderer ci, CallbackInfo buffers) {
      if (!this.rain$socialOverlays.isEmpty()) {
         buffers.draw();
         Text icon = را.icon();

         for (MixinNameTagFeatureRenderer.RainSocialOverlay overlay : this.rain$socialOverlays) {
            font.draw(icon, overlay.x, overlay.y, -1, false, overlay.pose, buffers, TextLayerType.NORMAL, 0, overlay.light);
         }

         buffers.draw();
         this.rain$socialOverlays.clear();
      }
   }

   @Inject(method = "method_73014", at = @At("HEAD"))
   private void rain$beginNameTagRender(BatchingRenderCommandQueue buffers, Immediate nodes, TextRenderer font, CallbackInfo ci) {
      this.rain$socialOverlays.clear();
   }

   @Redirect(
      method = "method_73014",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_327;method_27522(Lnet/minecraft/class_2561;FFIZLorg/joml/Matrix4f;Lnet/minecraft/class_4597;Lnet/minecraft/class_327$class_6415;II)V"
      )
   )
   private void rain$renderNameTag(
      TextRenderer color,
      Text text,
      float font,
      float pose,
      int light,
      boolean displayMode,
      Matrix4f shadow,
      VertexConsumerProvider y,
      TextLayerType backgroundColor,
      int x,
      int buffers
   ) {
      boolean renderedShadow = زت.INSTANCE.isEnabled() && زت.INSTANCE.getAddShadow().getValue() || shadow;
      int renderedBackground = زت.INSTANCE.isEnabled() && زت.INSTANCE.getRemoveBackground().getValue() ? 0 : backgroundColor;
      font.draw(text, x, y, color, renderedShadow, pose, buffers, displayMode, renderedBackground, light);
      if (را.isMarked(text) && displayMode == TextLayerType.NORMAL) {
         this.rain$socialOverlays.add(new MixinNameTagFeatureRenderer.RainSocialOverlay(x, y, new Matrix4f(pose), light));
      }
   }

   // $VF: Compiled from heavy
   @Unique
   private record RainSocialOverlay(float x, float y, Matrix4f pose, int light) {
   }
}
