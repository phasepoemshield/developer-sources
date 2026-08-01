package l;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import net.minecraft.client.network.SequencedPacketCreator;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.slot.SlotActionType;

public final class Helper70 implements Helper160 {
   private static int cachedSlot = -1;

   public Helper70() {
   }

   public static int method754(Item var0) {
      for (ItemStack var2 : mc.player.getInventory().armor) {
         if (var2.getItem() == var0 && var2.getDamage() < 430) {
            return -2;
         }
      }

      int var4 = -1;

      for (int var5 = 0; var5 < 36; var5++) {
         ItemStack var3 = mc.player.getInventory().getStack(var5);
         if (var3.getItem() == var0 && var3.getDamage() < 430) {
            var4 = var5;
            break;
         }
      }

      if (var4 < 9 && var4 != -1) {
         var4 += 36;
      }

      return var4;
   }

   public static void method755(int var0, ItemStack var1, int var2) {
      if (!Objects.isNull(var1)) {
         mc.interactionManager.clickSlot(var0, mc.player.getInventory().getSlotWithStack(var1), 0, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(var0, var2, 0, SlotActionType.PICKUP, mc.player);
      }
   }

   public static Helper35 method756(Helper69 var0) {
      if (mc.player != null) {
         for (ItemStack var2 : mc.player.getInventory().armor) {
            if (var0.isValid(var2) && var2.getDamage() < 430) {
               return new Helper35(-2, true, var2);
            }
         }

         for (int var3 = 36; var3 >= 0; var3--) {
            ItemStack var4 = mc.player.getInventory().getStack(var3);
            if (var0.isValid(var4) && var4.getDamage() < 430) {
               if (var3 < 9) {
                  var3 += 36;
               }

               return new Helper35(var3, true, var4);
            }
         }
      }

      return Helper35.method498();
   }

   public static Helper35 method757(List<Item> var0) {
      return method756(var1 -> var0.contains(var1.getItem()));
   }

   public static Helper35 method758(Item... var0) {
      return method757(Arrays.asList(var0));
   }

   public static int method759() {
      for (int var0 = 0; var0 < 9; var0++) {
         ItemStack var1 = mc.player.getInventory().getStack(var0);
         if (var1.getItem() instanceof AxeItem) {
            return var0;
         }
      }

      return -1;
   }

   public static Helper35 method760(Item var0) {
      if (mc.player == null) {
         return Helper35.method498();
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            ItemStack var2 = mc.player.getInventory().getStack(var1);
            if (var2.getItem() == var0 && var2.getDamage() < 430) {
               return new Helper35(var1, true, var2);
            }
         }

         return Helper35.method498();
      }
   }

   public static Helper35 method761(Item var0) {
      if (mc.player == null) {
         return Helper35.method498();
      } else {
         for (ItemStack var2 : mc.player.getInventory().armor) {
            if (var2.getItem() == var0 && var2.getDamage() < 430) {
               return new Helper35(-2, true, var2);
            }
         }

         for (int var3 = 36; var3 >= 0; var3--) {
            ItemStack var4 = mc.player.getInventory().getStack(var3);
            if (var4.getItem() == var0 && var4.getDamage() < 430) {
               if (var3 < 9) {
                  var3 += 36;
               }

               return new Helper35(var3, true, var4);
            }
         }

         return Helper35.method498();
      }
   }

   public static Helper35 method762(Helper69 var0) {
      if (mc.player != null) {
         for (int var1 = 0; var1 < 9; var1++) {
            ItemStack var2 = mc.player.getInventory().getStack(var1);
            if (var0.isValid(var2) && var2.getDamage() < 430) {
               return new Helper35(var1, true, var2);
            }
         }
      }

      return Helper35.method498();
   }

   public static Helper35 method763(List<Item> var0) {
      return method762(var1 -> var0.contains(var1.getItem()));
   }

   public static Helper35 method764(Item... var0) {
      return method763(Arrays.asList(var0));
   }

   public static void method765() {
      cachedSlot = mc.player.getInventory().selectedSlot;
   }

   public static void method766() {
      if (cachedSlot != -1) {
         method767(cachedSlot);
      }

      cachedSlot = -1;
   }

   public static void method767(int var0) {
      if (mc.player != null && mc.getNetworkHandler() != null) {
         if (mc.player.getInventory().selectedSlot != var0) {
            mc.player.getInventory().selectedSlot = var0;
         }
      }
   }

   public static void method768(int var0) {
      if (mc.player != null && mc.getNetworkHandler() != null) {
         mc.getNetworkHandler().sendPacket(new UpdateSelectedSlotC2SPacket(var0));
      }
   }

   public static void method769(SequencedPacketCreator var0) {
      if (mc.getNetworkHandler() != null && mc.world != null) {
         mc.getNetworkHandler().sendPacket(var0.predict(0));
      }
   }

   public static void method770(Packet<?> var0) {
      if (mc.getNetworkHandler() != null) {
         mc.getNetworkHandler().sendPacket(var0);
      }
   }

   public static void method771(int var0) {
      if (var0 != -1 && mc.interactionManager != null && mc.player != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var0, 0, SlotActionType.PICKUP, mc.player);
      }
   }

   public static void method772(int var0, SlotActionType var1) {
      if (var0 != -1 && mc.interactionManager != null && mc.player != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var0, 0, var1, mc.player);
      }
   }

   public static void method773(int var0, int var1, SlotActionType var2) {
      if (var0 != -1 && mc.interactionManager != null && mc.player != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var0, var1, var2, mc.player);
      }
   }

   public static ItemStack method774(Item var0) {
      for (int var1 = 0; var1 < mc.player.getInventory().size(); var1++) {
         ItemStack var2 = mc.player.getInventory().getStack(var1);
         if (var2.getItem().equals(var0) && var2.getDamage() < 430) {
            return var2;
         }
      }

      return null;
   }

   public static boolean method775(int var0, int var1) {
      if (var0 != -1 && var1 != -1 && mc.interactionManager != null && mc.player != null) {
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var0, 0, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var1, 0, SlotActionType.PICKUP, mc.player);
         mc.interactionManager.clickSlot(mc.player.currentScreenHandler.syncId, var0, 0, SlotActionType.PICKUP, mc.player);
         return true;
      } else {
         return false;
      }
   }

   public static int method776(ItemStack var0) {
      if (var0 != null && !var0.isEmpty()) {
         for (int var1 = 0; var1 < mc.player.getInventory().size(); var1++) {
            ItemStack var2 = mc.player.getInventory().getStack(var1);
            if (ItemStack.areEqual(var2, var0)) {
               return var1;
            }
         }

         return -1;
      } else {
         return -1;
      }
   }
}
