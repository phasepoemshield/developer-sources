package oxxxde

import org.joml.Vector3f

// $VF: Compiled from heavy
private class ضخ {
   public final var minY: Double
   public final var maxY: Double
   public final var maxX: Double
   public final var minX: Double = java.lang.Double.POSITIVE_INFINITY

   init {
      this.minY = java.lang.Double.POSITIVE_INFINITY
      this.maxX = java.lang.Double.NEGATIVE_INFINITY
      this.maxY = java.lang.Double.NEGATIVE_INFINITY
   }

   public fun include(point: Vector3f, halfWidth: Double, halfHeight: Double, projectionTan: Double) {
      if (!(point.z >= -0.01F)) {
         val screenX: Double = halfWidth + point.x * (halfHeight / (-point.z * projectionTan))
         val screenY: Double = halfHeight - point.y * (halfHeight / (-point.z * projectionTan))
         if (Math.abs(screenX) <= java.lang.Double.MAX_VALUE && Math.abs(screenY) <= java.lang.Double.MAX_VALUE) {
            this.minX = Math.min(this.minX, screenX)
            this.minY = Math.min(this.minY, screenY)
            this.maxX = Math.max(this.maxX, screenX)
            this.maxY = Math.max(this.maxY, screenY)
         }
      }
   }

   public fun reset() {
      this.minX = java.lang.Double.POSITIVE_INFINITY
      this.minY = java.lang.Double.POSITIVE_INFINITY
      this.maxX = java.lang.Double.NEGATIVE_INFINITY
      this.maxY = java.lang.Double.NEGATIVE_INFINITY
   }

   public final val centerY: Double
      public final get() {
         return (this.minY + this.maxY) * 0.5
      }


   public final val centerX: Double
      public final get() {
         return (this.minX + this.maxX) * 0.5
      }


   public final val isValid: Boolean
      public final get() {
         return Math.abs(this.minX) <= java.lang.Double.MAX_VALUE
            && Math.abs(this.minY) <= java.lang.Double.MAX_VALUE
            && Math.abs(this.maxX) <= java.lang.Double.MAX_VALUE
            && Math.abs(this.maxY) <= java.lang.Double.MAX_VALUE
         }

}
