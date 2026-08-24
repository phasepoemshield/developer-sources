package oxxxde

import com.mojang.blaze3d.systems.ProjectionType
import com.mojang.blaze3d.systems.RenderSystem
import net.minecraft.client.render.ProjectionMatrix2
import org.jetbrains.annotations.NotNull
import org.joml.Matrix4fStack
import org.joml.Vector3f

// $VF: Compiled from heavy
public object بد {
   @NotNull
   @JvmField
   public final val matrix4fStack: Matrix4fStack

   @JvmStatic
   private ProjectionMatrix2 matrix = ProjectionMatrix2("${CLIENT_ID}-projection-matrix", -1000.0F, 1000.0F, true);

   public fun scaledProjection() {
      RenderSystem.setProjectionMatrix(
         matrix.set((float)ضك.getMc().getWindow().getScaledWidth() / (float)2, (float)ضك.getMc().getWindow().getScaledHeight() / (float)2),
         ProjectionType.PERSPECTIVE
      )
   }

   public fun popMatrix() {
      matrix4fStack.popMatrix()
   }

   public fun unscaledProjection() {
      RenderSystem.setProjectionMatrix(
         matrix.set((float)ضك.getMc().getWindow().getScaledWidth(), (float)ضك.getMc().getWindow().getScaledHeight()), ProjectionType.ORTHOGRAPHIC
      )
   }

   public fun reset() {
      matrix4fStack.identity()
   }

   @JvmStatic
   fun {
      val var0: Matrix4fStack = Matrix4fStack(16)
      var0.identity()
      matrix4fStack = var0
   }

   public fun transformPosition(position: Vector3f) {
      if ((matrix4fStack.properties() and 4) == 0) {
         matrix4fStack.transformPosition(position)
      }
   }

   public fun startScale(x: Float, y: Float, scale: Float) {
      matrix4fStack.translate(x, y, 0.0F)
      matrix4fStack.scale(scale, scale, 1.0F)
      matrix4fStack.translate(-x, -y, 0.0F)
   }

   public fun pushMatrix() {
      matrix4fStack.pushMatrix()
   }
}
