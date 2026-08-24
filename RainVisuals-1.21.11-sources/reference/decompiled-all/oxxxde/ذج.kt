package oxxxde

// $VF: Compiled from heavy
public object ذج : دِ("BetterHUD", ظن.getRENDER(), "Планые анимации интерйфейса") {
   public final val animateChat: خذ = دِ.boolean$default(ذج.INSTANCE, "Анимировать чат", true, null, 4, null)
   public final val smoothTab: خذ = دِ.boolean$default(ذج.INSTANCE, "Анимировать таб", true, null, 4, null)

   public final var tabProgress: Float
      private set

   public final val animateInventory: خذ = دِ.boolean$default(INSTANCE, "Анимировать инвентарь", true, null, 4, null)
   public final val animateHotbar: خذ = دِ.boolean$default(INSTANCE, "Анимировать хотбар", false, null, 4, null)

   public fun setTabProgress(value: Float) {
      tabProgress = RangesKt.coerceIn(value, 0.0F, 1.0F)
   }

   fun getAnimateChat(): خذ {
      animateChat
   }

   fun getSmoothTab(): خذ {
      smoothTab
   }

   fun getAnimateInventory(): خذ {
      animateInventory
   }

   fun getAnimateHotbar(): خذ {
      animateHotbar
   }
}
