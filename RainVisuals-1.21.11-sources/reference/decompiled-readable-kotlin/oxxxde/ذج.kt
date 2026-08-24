package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting

// $VF: Compiled from heavy
public object ذج : Module("BetterHUD", RENDER, "Планые анимации интерйфейса") {
   @JvmStatic
   private BooleanSetting animateChat = Module.boolean$default(ذج.INSTANCE, "Анимировать чат", true, null, 4, null);
   @JvmStatic
   private BooleanSetting smoothTab = Module.boolean$default(ذج.INSTANCE, "Анимировать таб", true, null, 4, null);

   public final var tabProgress: Float
      private set

   @JvmStatic
   private BooleanSetting animateInventory = Module.boolean$default(INSTANCE, "Анимировать инвентарь", true, null, 4, null);
   @JvmStatic
   private BooleanSetting animateHotbar = Module.boolean$default(INSTANCE, "Анимировать хотбар", false, null, 4, null);

   public fun setTabProgress(value: Float) {
      tabProgress = RangesKt.coerceIn(value, 0.0F, 1.0F)
   }

   public final val animateChat: خذ

   public final val smoothTab: خذ

   public final val animateInventory: خذ

   public final val animateHotbar: خذ
}
