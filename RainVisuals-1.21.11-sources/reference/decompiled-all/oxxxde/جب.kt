package oxxxde

import java.awt.Color
import org.joml.Vector4f

// $VF: Compiled from RectRenderer.kt
public abstract class جب : طء {
   protected final val cachedCoords: Vector4f

   protected final var currentPipeline: صؤ = صؤ.LOW
      private set

   protected final val cachedColor: سة
   protected final val cachedRadius: Vector4f = Vector4f()

   fun getCurrentPipeline(): صؤ {
      this.currentPipeline
   }

   open fun جب() {
      val var10003: Color = Color.WHITE
      this.cachedColor = سة(var10003)
      this.cachedCoords = Vector4f()
   }

   protected fun calcSmoothness(x: Float, y: Float, width: Float, height: Float): Vector4f {
      val var10000: Vector4f = this.cachedCoords.set(x, y, width, height)
      return var10000
   }

   fun setCurrentPipeline(`<set-?>`: صؤ) {
      this.currentPipeline = `<set-?>`
   }

   fun getCachedColor(): سة {
      this.cachedColor
   }

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
