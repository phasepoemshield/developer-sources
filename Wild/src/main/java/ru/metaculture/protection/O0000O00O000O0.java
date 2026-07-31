package ru.metaculture.protection;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.slot.SlotActionType;

public class O0000O00O000O0 implements MinecraftAccessor {
   public static void O00000000(int i) {
      if (a_.player != null && i >= 0 && i <= 8) {
         if (a_.player.getInventory().getSelectedSlot() != i) {
            a_.player.getInventory().setSelectedSlot(i);
            a_.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(i));
         }
      }
   }

   public static void O00000000(int i, int j) {
      if (a_.player != null && a_.interactionManager != null) {
         int var2 = a_.player.playerScreenHandler.syncId;
         if (i >= 36 && i <= 44) {
            a_.interactionManager.clickSlot(var2, j, i % 9, SlotActionType.SWAP, a_.player);
         } else {
            int var3 = a_.player.getInventory().getSelectedSlot();
            a_.interactionManager.clickSlot(var2, i, var3, SlotActionType.SWAP, a_.player);
            a_.interactionManager.clickSlot(var2, j, var3, SlotActionType.SWAP, a_.player);
            a_.interactionManager.clickSlot(var2, i, var3, SlotActionType.SWAP, a_.player);
         }
      }
   }

   public static int O00000000(Item item) {
      if (a_.player == null) {
         return -1;
      } else {
         int var1 = -1;

         for (int var2 = 0; var2 < 36; var2++) {
            ItemStack var3 = a_.player.getInventory().getStack(var2);
            if (!var3.isEmpty() && var3.getItem() == item) {
               var1 = var2;
               break;
            }
         }

         if (var1 < 9 && var1 != -1) {
            var1 += 36;
         }

         return var1;
      }
   }

   public static int O00000000(Item item, boolean bl) {
      return O00000000(item, bl, false);
   }

   public static int O00000000(Item item, boolean bl, boolean bl2) {
      if (a_.player == null) {
         return -1;
      } else {
         int var3 = -1;
         if (bl2) {
            for (int var4 = 0; var4 < 36; var4++) {
               ItemStack var5 = a_.player.getInventory().getStack(var4);
               if (!var5.isEmpty() && var5.getItem() == item && var5.hasEnchantments()) {
                  var3 = var4;
                  break;
               }
            }
         } else {
            for (int var6 = 0; var6 < 36; var6++) {
               ItemStack var8 = a_.player.getInventory().getStack(var6);
               if (!var8.isEmpty() && var8.getItem() == item && !var8.hasEnchantments()) {
                  var3 = var6;
                  break;
               }
            }

            if (var3 == -1 && !bl) {
               for (int var7 = 0; var7 < 36; var7++) {
                  ItemStack var9 = a_.player.getInventory().getStack(var7);
                  if (!var9.isEmpty() && var9.getItem() == item) {
                     var3 = var7;
                     break;
                  }
               }
            }
         }

         if (var3 < 9 && var3 != -1) {
            var3 += 36;
         }

         return var3;
      }
   }
}
