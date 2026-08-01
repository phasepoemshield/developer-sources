package ru.metaculture.protection;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ClickPearl",
   O0000000000 = Category.Player,
   O000000000 = "Зажми бинд — превью траектории (Predictions), отпусти — бросок жемчуга"
)
public class ClickPearl extends Module {
   public static KeybindSetting O000000000O = new KeybindSetting("Кнопка жемчуга", -1, true);
   public static boolean O000000000O0 = false;
   private static final long O000000000O000 = 100L;
   private static final String O000000000O00O = "MiddleClick_Pearl";
   private static final long O000000000O0O = 900L;
   private static final int O000000000O0O0 = 3;
   private static final long O000000000O0OO = 150L;
   private static ItemStack O000000000OO = ItemStack.EMPTY;
   public static boolean O000000000O00 = false;
   private boolean O000000000OO0 = false;
   private boolean O000000000OO00 = false;
   private int O000000000OO0O = -1;
   private int O000000000OOO = -1;
   private int O000000000OOO0 = -1;
   private Item O000000000OOOO = null;
   private long O00000000O = 0L;
   private int O00000000O0 = 0;
   private int O00000000O00 = 0;
   private boolean O00000000O000 = false;
   private int O00000000O0000 = 0;
   private long O00000000O000O = 0L;
   private long O00000000O00O = 0L;

   public ClickPearl() {
      this.O00000000(new Setting[]{O000000000O});
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player != null && O0000000000.interactionManager != null && O0000000000.world != null) {
         this.O000000000O();
         if (this.O00000000O0 > 0) {
            this.O0000000000OO();
         } else {
            boolean var2 = O000000000O.O0000000000() != -1 && KeybindSetting.O000000000(O000000000O.O0000000000()) && O0000000000.currentScreen == null;
            if (var2 && this.O0000000000O00()) {
               this.O000000000OO0 = true;
               O000000000O0 = true;
            } else if (this.O000000000OO0) {
               this.O000000000OO0 = false;
               O000000000O0 = false;
               if (O0000000000.currentScreen == null) {
                  this.O0000000000O0O();
               }
            } else {
               O000000000O0 = false;
            }
         }
      } else {
         O000000000O0 = false;
         this.O000000000O00();
      }
   }

   private boolean O0000000000O00() {
      int var1 = O0000O00O000O0.O00000000(Items.ENDER_PEARL);
      if (var1 == -1) {
         return false;
      } else {
         ItemStack var2 = this.O000000000(var1);
         return !var2.isEmpty() && !O0000000000.player.getItemCooldownManager().isCoolingDown(var2);
      }
   }

   private void O0000000000O0O() {
      if (System.currentTimeMillis() - this.O00000000O >= 100L) {
         int var1 = O0000O00O000O0.O00000000(Items.ENDER_PEARL);
         if (var1 != -1) {
            ItemStack var2 = this.O000000000(var1);
            if (!var2.isEmpty() && !O0000000000.player.getItemCooldownManager().isCoolingDown(var2)) {
               O000000000OO = var2.copy();
               this.O000000000OOO = O0000000000.player.getInventory().getSelectedSlot();
               this.O00000000O000 = false;
               O000000000O00 = true;
               if (this.O0000000000(var1)) {
                  this.O000000000OO0O = this.O00000000000(var1);
                  this.O000000000OO00 = false;
               } else {
                  this.O000000000OOO0 = var1;
                  this.O000000000OOOO = O0000000000.player.getInventory().getStack(this.O000000000OOO).getItem();
                  this.O000000000OO00 = true;
               }

               this.O00000000O0 = 1;
               this.O00000000O00 = 0;
            }
         }
      }
   }

   private void O0000000000OO() {
      this.O000000000O0();
      if (this.O00000000O00 > 0) {
         this.O00000000O00--;
      } else {
         if (!this.O000000000OO00) {
            switch (this.O00000000O0) {
               case 1:
                  if (this.O000000000OO0O != this.O000000000OOO) {
                     this.O00000000(this.O000000000OO0O);
                  }

                  this.O00000000O0 = 2;
                  this.O00000000O00 = 0;
                  break;
               case 2:
                  this.O0000000000OO0();
                  this.O00000000O0 = 3;
                  this.O00000000O00 = 0;
                  break;
               case 3:
                  if (this.O000000000OO0O != this.O000000000OOO) {
                     this.O00000000(this.O000000000OOO);
                  }

                  this.O0000000000OOO();
            }
         } else {
            switch (this.O00000000O0) {
               case 1:
                  this.O00000000O0 = 2;
                  this.O00000000O00 = 0;
                  break;
               case 2:
                  O0000000000.interactionManager
                     .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O000000000OOO0, this.O000000000OOO, SlotActionType.SWAP, O0000000000.player);
                  this.O00000000O0 = 3;
                  this.O00000000O00 = 0;
                  break;
               case 3:
                  this.O0000000000OO0();
                  this.O00000000O0 = 4;
                  this.O00000000O00 = 0;
                  break;
               case 4:
                  O0000000000.interactionManager
                     .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O000000000OOO0, this.O000000000OOO, SlotActionType.SWAP, O0000000000.player);
                  this.O00000000O0 = 5;
                  this.O00000000O00 = 1;
                  break;
               case 5:
                  if (O0000000000.getNetworkHandler() != null) {
                     O0000000000.getNetworkHandler().sendPacket(new CloseHandledScreenC2SPacket(O0000000000.player.playerScreenHandler.syncId));
                  }

                  this.O00000000O000 = true;
                  this.O00000000O0000 = 3;
                  this.O00000000O000O = System.currentTimeMillis();
                  this.O00000000O00O = this.O00000000O000O;
                  this.O0000000000OOO();
            }
         }
      }
   }

   private void O0000000000OO0() {
      O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
      O0000000000.player.swingHand(Hand.MAIN_HAND);
   }

   private void O0000000000OOO() {
      this.O00000000O = System.currentTimeMillis();
      O0000O00O00O.O00000000().O000000000("MiddleClick_Pearl");
      this.O00000000O0 = 0;
      this.O00000000O00 = 0;
      this.O000000000OO00 = false;
      O000000000O00 = false;
   }

   private void O000000000O() {
      if (this.O00000000O000) {
         if (O0000000000.player != null && O0000000000.interactionManager != null) {
            long var1 = System.currentTimeMillis();
            if (var1 - this.O00000000O000O < 900L && this.O00000000O0000 > 0 && this.O000000000OOOO != null) {
               Item var3 = O0000000000.player.getInventory().getStack(this.O000000000OOO).getItem();
               if (var3 != this.O000000000OOOO) {
                  if (var1 - this.O00000000O00O >= 150L) {
                     O0000000000.interactionManager
                        .clickSlot(
                           O0000000000.player.playerScreenHandler.syncId, this.O000000000OOO0, this.O000000000OOO, SlotActionType.SWAP, O0000000000.player
                        );
                     this.O00000000O0000--;
                     this.O00000000O00O = var1;
                  }
               }
            } else {
               this.O00000000O000 = false;
            }
         } else {
            this.O00000000O000 = false;
         }
      }
   }

   private void O00000000(int i) {
      if (i >= 0 && i <= 8 && O0000000000.player != null) {
         O0000000000.player.getInventory().setSelectedSlot(i);
      }
   }

   private void O000000000O0() {
      Sprint.O000000000O000 = 2;
      O0000000000.options.sprintKey.setPressed(false);
      O0000000000.player.setSprinting(false);
      O0000O00O00O.O00000000().O00000000("MiddleClick_Pearl");
   }

   private void O000000000O00() {
      if (this.O00000000O0 > 0) {
         O0000O00O00O.O00000000().O000000000("MiddleClick_Pearl");
      }

      this.O000000000OO0 = false;
      this.O000000000OO00 = false;
      this.O00000000O0 = 0;
      this.O00000000O00 = 0;
      this.O00000000O000 = false;
      O000000000O00 = false;
   }

   private ItemStack O000000000(int i) {
      if (O0000000000.player == null) {
         return ItemStack.EMPTY;
      } else if (i >= 36 && i <= 44) {
         return O0000000000.player.getInventory().getStack(i - 36);
      } else {
         return i >= 0 && i < 36 ? O0000000000.player.getInventory().getStack(i) : ItemStack.EMPTY;
      }
   }

   public static ItemStack O0000000000O0() {
      return O000000000OO.copy();
   }

   @Override
   public void O000000000() {
      O000000000O0 = false;
      this.O000000000O00();
      super.O000000000();
   }

   private boolean O0000000000(int i) {
      return i >= 0 && i <= 8 || i >= 36 && i <= 44;
   }

   private int O00000000000(int i) {
      if (i >= 0 && i <= 8) {
         return i;
      } else {
         return i >= 36 && i <= 44 ? i - 36 : -1;
      }
   }
}
