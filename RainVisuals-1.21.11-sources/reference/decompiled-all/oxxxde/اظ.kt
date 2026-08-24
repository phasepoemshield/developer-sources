package oxxxde

// $VF: Compiled from heavy
public open class اظ : ذب {
   public final var padding: Float
   public final var height: Float
   public final var alpha: Float = 1.0F
   public final var y: Float
   public final var x: Float
   public final var width: Float

   fun getDefaultFont(): جً {
      رَ.INSTANCE.getGS_REGULAR()
   }

   fun getIconFont(): جً {
      رَ.INSTANCE.getICON()
   }

   public fun calcMidY(y: Float, height: Float, size: Float): Float {
      return y + (height - size) / 2.0F
   }

   public fun centerText(size: Float, height: Float): Float {
      return this.calcMidY(0.0F, height, size)
   }
}
