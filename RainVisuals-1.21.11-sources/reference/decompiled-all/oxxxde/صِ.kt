package oxxxde

// $VF: Compiled from heavy
public object صِ : دِ("RenderTweaks", ظن.getRENDER(), "Разные настройки рендера") {
   public final val noStatusEffects: خذ = صِ.INSTANCE.boolean("Убрать ванильные эффекты", false, "noStatusEffects").setVisible({ 
      !بآ.INSTANCE.isEnabled()
   })

   public final val noHurtCam: خذ = صِ.INSTANCE.boolean("Убрать тряску экрана", false, "noHurtCam")
   public final val noBossBar: خذ = صِ.INSTANCE.boolean("Убрать босс бар", false, "noBossBar")
   public final val noTotemAnimation: خذ = صِ.INSTANCE.boolean("Отключить анимацию тотема", false, "noTotemAnimation")
   public final val noHandSway: خذ = صِ.INSTANCE.boolean("Убрать тряску рук", false, "noHandSway")
   public final val noBlackHearts: خذ = صِ.INSTANCE.boolean("Убрать чёрные сердца", false, "noBlackHearts")
   public final val noGlow: خذ = صِ.INSTANCE.boolean("Убрать свечение", false, "noGlow")
   public final val hideMobs: خذ = صِ.INSTANCE.boolean("Убрать мобов", false, "hideMobs")
   public final val noFire: خذ = INSTANCE.boolean("Убрать огонь", false, "noFire")
   public final val removeVignette: خذ = INSTANCE.boolean("Отключить виньетку", false, "removeVignette")

   fun getHideMobs(): خذ {
      hideMobs
   }

   fun getNoHurtCam(): خذ {
      noHurtCam
   }

   fun getNoStatusEffects(): خذ {
      noStatusEffects
   }

   fun getNoTotemAnimation(): خذ {
      noTotemAnimation
   }

   fun getRemoveVignette(): خذ {
      removeVignette
   }

   fun getNoGlow(): خذ {
      noGlow
   }

   fun getNoBlackHearts(): خذ {
      noBlackHearts
   }

   fun getNoBossBar(): خذ {
      noBossBar
   }

   fun getNoFire(): خذ {
      noFire
   }

   fun getNoHandSway(): خذ {
      noHandSway
   }
}
