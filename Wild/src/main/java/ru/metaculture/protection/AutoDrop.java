package ru.metaculture.protection;

import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.screen.slot.Slot;
import net.minecraft.screen.slot.SlotActionType;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "AutoDrop",
   O0000000000 = Category.Misc,
   O000000000 = "Автоматически выбрасывает мусор"
)
public class AutoDrop extends Module {
   private final BooleanSetting O000000000O = new BooleanSetting("Камень", false);
   private final BooleanSetting O000000000O0 = new BooleanSetting("Булыжник", false);
   private final BooleanSetting O000000000O00 = new BooleanSetting("Гранит", false);
   private final BooleanSetting O000000000O000 = new BooleanSetting("Палки", false);
   private final BooleanSetting O000000000O00O = new BooleanSetting("Сланец", false);
   private final BooleanSetting O000000000O0O = new BooleanSetting("Андезит", false);
   private final BooleanSetting O000000000O0O0 = new BooleanSetting("Незерак", false);
   private final BooleanSetting O000000000O0OO = new BooleanSetting("Базальт", false);
   private final BooleanSetting O000000000OO = new BooleanSetting("Чернит", false);
   private final BooleanSetting O000000000OO0 = new BooleanSetting("Блоки душ", false);
   private final BooleanSetting O000000000OO00 = new BooleanSetting("Руды ада", false);
   private final BooleanSetting O000000000OO0O = new BooleanSetting("Гравий", false);
   private int O000000000OOO = 9;
   private final O0000O00O0000 O000000000OOO0 = new O0000O00O0000();

   public AutoDrop() {
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
            this.O000000000OO0O
         }
      );
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      this.O0000000000O0();
   }

   private void O0000000000O0() {
      if (this.O000000000OOO > 44) {
         this.O000000000OOO = 9;
      } else {
         Slot var1 = O0000000000.player.playerScreenHandler.getSlot(this.O000000000OOO);
         if (!var1.hasStack()) {
            this.O000000000OOO++;
         } else {
            Item var2 = var1.getStack().getItem();
            if (this.O00000000(var2)) {
               int var3 = O0000000000.player.playerScreenHandler.syncId;
               O0000000000.interactionManager.clickSlot(var3, this.O000000000OOO, 1, SlotActionType.THROW, O0000000000.player);
               this.O000000000OOO++;
            } else {
               this.O000000000OOO++;
            }
         }
      }
   }

   private boolean O00000000(Item item) {
      if (item == Items.STONE && this.O000000000O.O0000000000()) {
         return true;
      } else if (item == Items.COBBLESTONE && this.O000000000O0.O0000000000()) {
         return true;
      } else if (item == Items.GRANITE && this.O000000000O00.O0000000000()) {
         return true;
      } else if (item == Items.STICK && this.O000000000O000.O0000000000()) {
         return true;
      } else if (item == Items.ANDESITE && this.O000000000O0O.O0000000000()) {
         return true;
      } else if ((item == Items.DEEPSLATE || item == Items.COBBLED_DEEPSLATE) && this.O000000000O00O.O0000000000()) {
         return true;
      } else if (item == Items.NETHERRACK && this.O000000000O0O0.O0000000000()) {
         return true;
      } else if ((item == Items.BASALT || item == Items.SMOOTH_BASALT || item == Items.POLISHED_BASALT) && this.O000000000O0OO.O0000000000()) {
         return true;
      } else if ((item == Items.BLACKSTONE || item == Items.GILDED_BLACKSTONE) && this.O000000000OO.O0000000000()) {
         return true;
      } else if ((item == Items.SOUL_SAND || item == Items.SOUL_SOIL) && this.O000000000OO0.O0000000000()) {
         return true;
      } else {
         return (item == Items.NETHER_QUARTZ_ORE || item == Items.NETHER_GOLD_ORE || item == Items.QUARTZ || item == Items.GOLD_NUGGET)
               && this.O000000000OO00.O0000000000()
            ? true
            : item == Items.GRAVEL && this.O000000000OO0O.O0000000000();
      }
   }
}
