package oxxxde

import kotakbaz.rain.client.draggable.animation.Easing

// $VF: Compiled from heavy
// $VF: local visibility outside of methodSupplier
internal class ظة : Easing {
   fun ظة(`$enum$name`: java.lang.String, `$enum$ordinal`: Int) {
      super(null)
   }

   public override fun apply(x: Double): Double {
      return Math.sin(x * Math.PI / 2.0)
   }
}
