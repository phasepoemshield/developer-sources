package oxxxde

// $VF: Compiled from heavy
public object شص : دِ("NoFluid", ظن.getRENDER(), "Убирает размытие под жидкостями") {
   public final val lava: خذ = دِ.boolean$default(شص.INSTANCE, "Под лавой", true, null, 4, null)
   public final val water: خذ = دِ.boolean$default(INSTANCE, "Под водой", true, null, 4, null)

   public fun shouldClearWaterFog(): Boolean {
      return this.isEnabled() && water.getValue()
   }

   fun getLava(): خذ {
      lava
   }

   public fun shouldClearLavaFog(): Boolean {
      return this.isEnabled() && lava.getValue()
   }

   fun getWater(): خذ {
      water
   }

   public fun shouldClearWaterOverlay(): Boolean {
      return this.isEnabled() && water.getValue()
   }
}
