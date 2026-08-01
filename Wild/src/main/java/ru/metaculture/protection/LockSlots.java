package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "LockSlots",
   O0000000000 = Category.Misc,
   O000000000 = "Блокирует выкидывание выбранных слотов хотбара"
)
public class LockSlots extends Module {
   public final GroupSetting O000000000O = new GroupSetting(
      "Слоты: ",
      new BooleanSetting("1", false),
      new BooleanSetting("2", false),
      new BooleanSetting("3", false),
      new BooleanSetting("4", false),
      new BooleanSetting("5", false),
      new BooleanSetting("6", false),
      new BooleanSetting("7", false),
      new BooleanSetting("8", false),
      new BooleanSetting("9", false)
   );
   private final BooleanSetting O000000000O0 = new BooleanSetting("Работать только в КД", false);

   public LockSlots() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0});
   }

   public boolean O00000000(int i) {
      if (i < 0 || i > 8) {
         return false;
      } else {
         return !this.O0000000000O0() ? false : this.O000000000O.O00000000(i);
      }
   }

   private boolean O0000000000O0() {
      return !this.O000000000O0.O0000000000() || O0000O000OOOO.O000000000();
   }
}
