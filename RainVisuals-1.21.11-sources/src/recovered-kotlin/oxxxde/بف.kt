package oxxxde

// $VF: Compiled from heavy
public object بف {
   public fun linear(t: Float): Float {
      return RangesKt.coerceIn(t, 0.0F, 1.0F)
   }

   public fun emphasizedDecelerate(t: Float): Float {
      return this.cubicBezier(t, 0.05F, 0.7F, 0.1F, 1.0F)
   }

   public fun cubicBezier(t: Float, x1: Float, y1: Float, x2: Float, y2: Float): Float {
      return RangesKt.coerceIn(this.sampleCurveY(this.solveCurveX(RangesKt.coerceIn(t, 0.0F, 1.0F), x1, x2), y1, y2), 0.0F, 1.0F)
   }

   public fun standard(t: Float): Float {
      return this.cubicBezier(t, 0.2F, 0.0F, 0.0F, 1.0F)
   }

   public fun standardAccelerate(t: Float): Float {
      return this.cubicBezier(t, 0.3F, 0.0F, 1.0F, 1.0F)
   }

   public fun standardDecelerate(t: Float): Float {
      return this.cubicBezier(t, 0.0F, 0.0F, 0.0F, 1.0F)
   }

   private fun sampleCurveX(t: Float, x1: Float, x2: Float): Float {
      return 3.0F * (1.0F - t) * (1.0F - t) * t * x1 + 3.0F * (1.0F - t) * t * t * x2 + t * t * t
   }

   private fun solveCurveX(x: Float, x1: Float, x2: Float): Float {
      var t: Float = 0.0F
      t = x
      val t0: Byte = 6

      repeat(t0) { t1 ->
         val xEst: Float = INSTANCE.sampleCurveX(t, x1, x2) - x
         if (Math.abs(xEst) < 1.0E-5F) {
            return t
         }

         val d: Float = INSTANCE.sampleCurveDerivativeX(t, x1, x2)
         if (!(Math.abs(d) < 1.0E-6F)) {
            t -= xEst / d
         }
      }

      var var12: Float = 0.0F
      var var13: Float = 1.0F

      // $VF: Unable to resugar Kotlin loop from Java for loop
      t2 = x
      while (true) {
         if (var12 < var13) break
         val var14: Float = this.sampleCurveX(t2, x1, x2)
         if (Math.abs(var14 - x) < 1.0E-5F) {
            return t2
         }

         if (x > var14) {
            var12 = t2
         } else {
            var13 = t2
         }

         t2 = (var13 + var12) * 0.5F
      }

      return t2
   }

   private fun sampleCurveY(t: Float, y1: Float, y2: Float): Float {
      return 3.0F * (1.0F - t) * (1.0F - t) * t * y1 + 3.0F * (1.0F - t) * t * t * y2 + t * t * t
   }

   public fun emphasized(t: Float): Float {
      return this.cubicBezier(t, 0.2F, 0.0F, 0.0F, 1.0F)
   }

   public fun emphasizedAccelerate(t: Float): Float {
      return this.cubicBezier(t, 0.3F, 0.0F, 0.8F, 0.15F)
   }

   private fun sampleCurveDerivativeX(t: Float, x1: Float, x2: Float): Float {
      return 3.0F * (1.0F - t) * (1.0F - t) * x1 + 6.0F * (1.0F - t) * t * (x2 - x1) + 3.0F * t * t * (1.0F - x2)
   }
}
