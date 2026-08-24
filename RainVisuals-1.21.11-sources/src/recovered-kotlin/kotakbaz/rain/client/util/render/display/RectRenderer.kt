package kotakbaz.rain.client.util.render.display

import java.awt.Color
import kotakbaz.rain.client.util.color.QuadColor
import kotakbaz.rain.client.util.render.engine.Renderable
import kotakbaz.rain.client.util.render.engine.controls.ClientRenderPipeline
import org.joml.Vector4f
import oxxxde.ان
import oxxxde.جب
import oxxxde.سة
import oxxxde.صؤ

// $VF: Compiled from RectRenderer.kt
public abstract class RectRenderer : Renderable {
   protected final val cachedCoords: Vector4f
   private ClientRenderPipeline currentPipeline = ClientRenderPipeline.LOW;
   private QuadColor cachedColor;
   protected final val cachedRadius: Vector4f = Vector4f()

   protected final var currentPipeline: صؤ

   open fun RectRenderer() {
      val var10003: Color = Color.WHITE
      this.cachedColor = QuadColor(var10003)
      this.cachedCoords = Vector4f()
   }

   protected fun calcSmoothness(x: Float, y: Float, width: Float, height: Float): Vector4f {
      val var10000: Vector4f = this.cachedCoords.set(x, y, width, height)
      return var10000
   }

   protected final val cachedColor: سة

   protected fun buildQuad(builder: ان, x: Float, y: Float, width: Float, height: Float, radius: Vector4f, extra: FloatArray) {
      this.uploadVertex(builder, x, y, width, height, radius.x, 0, extra)
      this.uploadVertex(builder, x, y + height, width, height, radius.z, 1, extra)
      this.uploadVertex(builder, x + width, y + height, width, height, radius.w, 2, extra)
      this.uploadVertex(builder, x + width, y, width, height, radius.y, 3, extra)
   }

   public fun priority(pipeline: صؤ): جب {
      this.currentPipeline = pipeline
      return this
   }

   protected abstract fun uploadVertex(builder: ان, x: Float, y: Float, width: Float, height: Float, radius: Float, index: Int, extra: FloatArray) {
   }
}
