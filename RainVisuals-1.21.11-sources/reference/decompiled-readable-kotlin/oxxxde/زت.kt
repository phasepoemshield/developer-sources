package oxxxde

import kotakbaz.rain.module.Module
import kotakbaz.rain.module.setting.settings.BooleanSetting

// $VF: Compiled from heavy
public object زت : Module("NameTags", RENDER, "Настройки визуала неймтэга") {
   @JvmStatic
   private BooleanSetting addShadow = Module.boolean$default(INSTANCE, "Добавить тени", true, null, 4, null);
   @JvmStatic
   private BooleanSetting removeBackground = Module.boolean$default(INSTANCE, "Убрать фон", true, null, 4, null);

   public final val removeBackground: خذ

   public final val addShadow: خذ
}
