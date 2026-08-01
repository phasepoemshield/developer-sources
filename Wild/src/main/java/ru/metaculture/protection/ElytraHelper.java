package ru.metaculture.protection;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.network.packet.c2s.play.CloseHandledScreenC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "ElytraHelper",
   O000000000 = "Автоматически юзает фейерверки/свапает на элики",
   O0000000000 = Category.Player
)
public class ElytraHelper extends Module {
   public static ElytraHelper O000000000O;
   public static KeybindSetting O000000000O0 = new KeybindSetting("Свап на нагрудник", -1);
   public static KeybindSetting O000000000O00 = new KeybindSetting("Фейерверк", -1);
   public final BooleanSetting O000000000O000 = new BooleanSetting("Свапать при КД", false);
   private int O000000000O00O = 0;
   private int O000000000O0O = 0;
   private int O000000000O0O0 = -1;
   private int O000000000O0OO = -1;
   private boolean O000000000OO = false;

   public ElytraHelper() {
      this.O00000000(new Setting[]{O000000000O0, O000000000O00, this.O000000000O000});
      O000000000O = this;
   }

   @EventHandler
   private void O00000000(O0000000O0O0 o0000000O0O0) {
      if (o0000000O0O0.O0000000000000() == 1 && O0000000000.player != null) {
         if (o0000000O0O0.O00000000000() == O000000000O0.O0000000000()
            && this.O000000000O00O == 0
            && (!O0000000000.player.isUsingItem() || O0000000000.player.getOffHandStack().getItem() == Items.SHIELD)) {
            ItemStack var2 = O0000000000.player.getEquippedStack(EquipmentSlot.CHEST);
            int var3 = var2.getItem() == Items.ELYTRA ? this.O000000000O0() : O0000O00O000O0.O00000000(Items.ELYTRA);
            if (var3 >= 0) {
               this.O000000000O0O0 = var3;
               this.O000000000OO = false;
               this.O000000000O00O = 1;
               this.O0000000000OO();
            }
         }

         if (o0000000O0O0.O00000000000() == O000000000O00.O0000000000() && this.O000000000O00O == 0) {
            int var4 = O0000O00O000O0.O00000000(Items.FIREWORK_ROCKET);
            if (var4 != -1) {
               this.O000000000O0O0 = var4;
               this.O000000000OO = true;
               this.O000000000O00O = 1;
               this.O0000000000OO();
            }
         }
      }
   }

   @EventHandler
   private void O00000000(O0000000O00O00 o0000000O00O00) {
      if (O0000000000.player == null || O0000000000.currentScreen != null) {
         this.O000000000O();
      } else if (this.O000000000O00O > 0) {
         if (this.O000000000O0O > 0) {
            this.O000000000O0O--;
         } else {
            this.O0000000000OO();
         }
      } else {
         if (this.O000000000O000.O0000000000()) {
            boolean var2 = O0000000000.player.getEquippedStack(EquipmentSlot.CHEST).getItem() == Items.ELYTRA;
            if (var2 && O0000O000OOOO.O000000000()) {
               int var3 = this.O000000000O0();
               if (var3 != -1) {
                  this.O000000000O0O0 = var3;
                  this.O000000000OO = false;
                  this.O000000000O00O = 1;
                  this.O0000000000OO();
               }
            }
         }
      }
   }

   private void O0000000000OO() {
      if (this.O000000000OO) {
         this.O0000000000OO0();
      } else {
         this.O0000000000OOO();
      }
   }

   private void O0000000000OO0() {
      switch (this.O000000000O00O) {
         case 1:
            O0000O00O00O.O00000000().O00000000("ElytraHelper_FW");
            if (O0000000000.player.isSprinting()) {
               O0000000000.player.setSprinting(false);
            }

            this.O000000000O00O = 2;
            this.O000000000O0O = 1;
            break;
         case 2:
            this.O000000000O0OO = O0000000000.player.getInventory().getSelectedSlot();
            if (this.O000000000O0O0 < 9) {
               O0000O00O000O0.O00000000(this.O000000000O0O0);
            } else {
               O0000000000.interactionManager
                  .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O000000000O0O0, this.O000000000O0OO, SlotActionType.SWAP, O0000000000.player);
            }

            this.O000000000O00O = 3;
            this.O000000000O0O = 1;
            break;
         case 3:
            O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            O0000000000.player.swingHand(Hand.MAIN_HAND);
            this.O000000000O00O = 4;
            this.O000000000O0O = 1;
            break;
         case 4:
            if (this.O000000000O0O0 < 9) {
               O0000O00O000O0.O00000000(this.O000000000O0OO);
            } else {
               O0000000000.interactionManager
                  .clickSlot(O0000000000.player.playerScreenHandler.syncId, this.O000000000O0O0, this.O000000000O0OO, SlotActionType.SWAP, O0000000000.player);
            }

            O0000O00O00O.O00000000().O000000000("ElytraHelper_FW");
            this.O000000000O00O = 0;
      }
   }

   private void O0000000000OOO() {
      switch (this.O000000000O00O) {
         case 1:
            O0000O00O00O.O00000000().O00000000("ElytraHelper");
            if (O0000000000.player.isSprinting()) {
               O0000000000.player.setSprinting(false);
            }

            this.O000000000O00O = 2;
            this.O000000000O0O = 1;
            break;
         case 2:
            O0000O00O000O0.O00000000(this.O000000000O0O0, 6);
            if (O0000000000.getNetworkHandler() != null) {
               O0000000000.getNetworkHandler().sendPacket(new CloseHandledScreenC2SPacket(O0000000000.player.playerScreenHandler.syncId));
            }

            this.O000000000O00O = 3;
            this.O000000000O0O = 1;
            break;
         case 3:
            O0000O00O00O.O00000000().O000000000("ElytraHelper");
            this.O000000000O00O = 0;
      }
   }

   private void O000000000O() {
      if (this.O000000000O00O > 0) {
         O0000O00O00O.O00000000().O000000000(this.O000000000OO ? "ElytraHelper_FW" : "ElytraHelper");
      }

      this.O000000000O00O = 0;
      this.O000000000O0O = 0;
      this.O000000000O0O0 = -1;
   }

   private int O000000000O0() {
      Item[] var1 = new Item[]{
         Items.NETHERITE_CHESTPLATE,
         Items.DIAMOND_CHESTPLATE,
         Items.CHAINMAIL_CHESTPLATE,
         Items.GOLDEN_CHESTPLATE,
         Items.IRON_CHESTPLATE,
         Items.LEATHER_CHESTPLATE
      };

      for (Item var5 : var1) {
         int var6 = O0000O00O000O0.O00000000(var5);
         if (var6 != -1) {
            return var6;
         }
      }

      return -1;
   }

   public static boolean O0000000000O0() {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         if (O0000000000.player.getEquippedStack(EquipmentSlot.CHEST).getItem() == Items.ELYTRA) {
            return true;
         } else {
            int var0 = O0000O00O000O0.O00000000(Items.ELYTRA);
            if (var0 == -1) {
               return false;
            } else {
               O0000O00O000O0.O00000000(var0, 6);
               if (O0000000000.getNetworkHandler() != null) {
                  O0000000000.getNetworkHandler().sendPacket(new CloseHandledScreenC2SPacket(O0000000000.player.playerScreenHandler.syncId));
               }

               return true;
            }
         }
      } else {
         return false;
      }
   }

   public static boolean O0000000000O00() {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         Item[] var0 = new Item[]{
            Items.NETHERITE_CHESTPLATE,
            Items.DIAMOND_CHESTPLATE,
            Items.IRON_CHESTPLATE,
            Items.CHAINMAIL_CHESTPLATE,
            Items.GOLDEN_CHESTPLATE,
            Items.LEATHER_CHESTPLATE
         };

         for (Item var4 : var0) {
            int var5 = O0000O00O000O0.O00000000(var4);
            if (var5 != -1) {
               O0000O00O000O0.O00000000(var5, 6);
               if (O0000000000.getNetworkHandler() != null) {
                  O0000000000.getNetworkHandler().sendPacket(new CloseHandledScreenC2SPacket(O0000000000.player.playerScreenHandler.syncId));
               }

               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   public static boolean O0000000000O0O() {
      return O00000000(Items.FIREWORK_ROCKET);
   }

   private static boolean O00000000(Item item) {
      if (O0000000000.player != null && O0000000000.interactionManager != null) {
         int var1 = O0000O00O000O0.O00000000(item);
         if (var1 == -1) {
            return false;
         } else {
            int var2 = O0000000000.player.getInventory().getSelectedSlot();
            boolean var3 = var1 >= 36 && var1 <= 44;
            if (var3) {
               O0000O00O000O0.O00000000(var1 - 36);
            } else {
               O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var1, var2, SlotActionType.SWAP, O0000000000.player);
            }

            O0000000000.interactionManager.interactItem(O0000000000.player, Hand.MAIN_HAND);
            O0000000000.player.swingHand(Hand.MAIN_HAND);
            if (var3) {
               O0000O00O000O0.O00000000(var2);
            } else {
               O0000000000.interactionManager.clickSlot(O0000000000.player.playerScreenHandler.syncId, var1, var2, SlotActionType.SWAP, O0000000000.player);
            }

            return true;
         }
      } else {
         return false;
      }
   }

   @Override
   public void O000000000() {
      this.O000000000O();
      super.O000000000();
   }
}
