package kotakbaz.rain.mixin;

import com.llamalad7.mixinextras.injector.ModifyExpressionValue;
import net.minecraft.client.gl.Framebuffer;
import net.minecraft.client.gui.render.GuiRenderer;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import oxxxde.ائ;

// $VF: Compiled from MixinGuiRendererFiguraPreviewTarget.java
@Mixin(GuiRenderer.class)
public class MixinGuiRendererFiguraPreviewTarget {
   @ModifyExpressionValue(method = "method_71291", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_1041;method_4489()I"))
   private int rain$useFiguraPreviewWidth(int original) {
      return ائ.physicalWidthOr(original);
   }

   @ModifyExpressionValue(method = {"method_70893", "method_71291"}, at = @At(value = "INVOKE", target = "Lnet/minecraft/class_1041;method_4495()I"))
   private int rain$useFiguraPreviewGuiScale(int original) {
      return ائ.guiScaleOr(original);
   }

   @ModifyExpressionValue(method = "method_71291", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_1041;method_4506()I"))
   private int rain$useFiguraPreviewHeight(int original) {
      return ائ.physicalHeightOr(original);
   }

   @ModifyExpressionValue(method = "method_71291", at = @At(value = "INVOKE", target = "Lnet/minecraft/class_310;method_1522()Lnet/minecraft/class_276;"))
   private Framebuffer rain$useFiguraPreviewTarget(Framebuffer original) {
      return ائ.targetOr(original);
   }
}
