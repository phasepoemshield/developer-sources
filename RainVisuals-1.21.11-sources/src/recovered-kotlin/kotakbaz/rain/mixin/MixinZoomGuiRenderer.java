package kotakbaz.rain.mixin;

import net.minecraft.client.gui.render.GuiRenderer;
import org.joml.Matrix4f;
import org.joml.Matrix4fc;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.ModifyArg;
import oxxxde.شز;

// $VF: Compiled from MixinZoomGuiRenderer.java
@Mixin(GuiRenderer.class)
public class MixinZoomGuiRenderer {
   @ModifyArg(
      method = "method_71291",
      at = @At(
         value = "INVOKE",
         target = "Lnet/minecraft/class_11282;method_71106(Lorg/joml/Matrix4fc;Lorg/joml/Vector4fc;Lorg/joml/Vector3fc;Lorg/joml/Matrix4fc;)Lcom/mojang/blaze3d/buffers/GpuBufferSlice;"
      ),
      index = 0
   )
   private Matrix4fc rain$applyZoomTransform(Matrix4fc modelView) {
      Matrix4f transform = new Matrix4f();
      transform.mul(modelView);
      transform.mul(شز.INSTANCE.getRenderTransform());
      return transform;
   }
}
