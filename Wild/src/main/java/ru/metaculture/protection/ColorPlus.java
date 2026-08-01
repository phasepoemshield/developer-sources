package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ColorPlus",
   O0000000000 = Category.Visuals,
   O000000000 = "Цветокоррекция мира — пресеты и тонкая настройка"
)
public class ColorPlus extends Module {
   public final ModeSetting O000000000O = new ModeSetting("Пресет", "Cinematic", O00000O0O0OOO.O00000000());
   public final NumberSetting O000000000O0 = new NumberSetting("Сила эффекта", 1.0F, 0.0F, 1.0F, 0.01F, true);
   public final BooleanSetting O000000000O00 = new BooleanSetting("Резкость (CAS)", true);
   public final NumberSetting O000000000O000 = new NumberSetting("Экспозиция", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final NumberSetting O000000000O00O = new NumberSetting("Контраст", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final NumberSetting O000000000O0O = new NumberSetting("Насыщенность", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final NumberSetting O000000000O0O0 = new NumberSetting("Vibrance", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final NumberSetting O000000000O0OO = new NumberSetting("Гамма", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final NumberSetting O000000000OO = new NumberSetting("Температура", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final NumberSetting O000000000OO0 = new NumberSetting("Оттенок (зелёный/маджента)", 0.0F, -0.5F, 0.5F, 0.01F, false);
   public final NumberSetting O000000000OO00 = new NumberSetting("Интенсивность Bloom", 0.0F, -0.3F, 0.3F, 0.01F, false);
   public final NumberSetting O000000000OO0O = new NumberSetting("Сила резкости", 0.0F, -0.3F, 0.3F, 0.01F, false);
   public final NumberSetting O000000000OOO = new NumberSetting("Виньетка", 0.0F, -0.3F, 0.3F, 0.01F, false);

   public ColorPlus() {
      this.O00000000(
         new Setting[]{
            this.O000000000O,
            this.O000000000O0,
            this.O000000000O00,
            this.O000000000O000,
            this.O000000000O00O,
            this.O000000000O0O,
            this.O000000000O0O0,
            this.O000000000O0OO,
            this.O000000000OO,
            this.O000000000OO0,
            this.O000000000OO00,
            this.O000000000OO0O,
            this.O000000000OOO
         }
      );
   }

   public O00000O0O0OOO O0000000000O0() {
      return O00000O0O0OOO.O00000000(this.O000000000O.O0000000000());
   }
}
