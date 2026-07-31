package ru.metaculture.protection;

import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "NoPush",
   O000000000 = "Убирает отталкивания от игроков, мобов и блоков",
   O0000000000 = Category.Player
)
public class NoPush extends Module {
   public BooleanSetting O000000000O = new BooleanSetting("Players", true);
   public BooleanSetting O000000000O0 = new BooleanSetting("Mobs", true);
   public BooleanSetting O000000000O00 = new BooleanSetting("Blocks", true);

   public NoPush() {
      this.O00000000(new Setting[]{this.O000000000O, this.O000000000O0, this.O000000000O00});
   }
}
