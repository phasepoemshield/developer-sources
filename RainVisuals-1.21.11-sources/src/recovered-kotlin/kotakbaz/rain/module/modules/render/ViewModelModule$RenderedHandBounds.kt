package kotakbaz.rain.module.modules.render

import org.joml.Matrix4f

// $VF: Compiled from heavy
private class `ViewModelModule$RenderedHandBounds` {
   public final var settingY: Float
   public final var jacobianYX: Double
   public final var offsetBaseReady: Boolean
   public final var jacobianXY: Double
   public final var updatedAt: Long
   public final var minX: Double
   public final var minY: Double
   public final val offsetBasePose: Matrix4f = Matrix4f()
   public final var maxX: Double
   public final var settingX: Float
   public final var centerX: Double
   public final var centerY: Double
   public final var jacobianXX: Double
   public final var jacobianYY: Double
   public final var maxY: Double

   public fun invalidate() {
      this.offsetBaseReady = false
      this.updatedAt = java.lang.Long.MIN_VALUE
   }

   public fun update(
      minX: Double,
      minY: Double,
      maxX: Double,
      maxY: Double,
      centerX: Double,
      centerY: Double,
      jacobianXX: Double,
      jacobianXY: Double,
      jacobianYX: Double,
      jacobianYY: Double,
      settingX: Float,
      settingY: Float
   ) {
      this.minX = minX
      this.minY = minY
      this.maxX = maxX
      this.maxY = maxY
      this.centerX = centerX
      this.centerY = centerY
      this.jacobianXX = jacobianXX
      this.jacobianXY = jacobianXY
      this.jacobianYX = jacobianYX
      this.jacobianYY = jacobianYY
      this.settingX = settingX
      this.settingY = settingY
      this.updatedAt = System.nanoTime()
   }

   init {
      this.updatedAt = java.lang.Long.MIN_VALUE
   }

   public fun isFresh(): Boolean {
      if (this.updatedAt != java.lang.Long.MIN_VALUE) {
         val var1: Long = System.nanoTime() - this.updatedAt
         if (0L <= var1 && var1 < 250000001L) {
            return true
         }
      }

      return false
   }
}
