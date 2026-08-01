package l;

import net.minecraft.item.Item;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Hand;

public class Helper340 implements Helper160 {
   public Helper340() {
   }

   public static int method3371(Item var0) {
      if (mc.player == null) {
         return -1;
      } else {
         for (int var1 = 9; var1 < 36; var1++) {
            if (mc.player.getInventory().getStack(var1).getItem() == var0) {
               return var1;
            }
         }

         return -1;
      }
   }

   public static void method3372(Item var0, boolean var1) {
      if (mc.player != null && mc.interactionManager != null) {
         int var2 = method3371(var0);
         if (var2 != -1) {
            int var3 = mc.player.getInventory().selectedSlot;
            mc.interactionManager.clickSlot(mc.player.playerScreenHandler.syncId, var2, var3, SlotActionType.SWAP, mc.player);
            mc.player.networkHandler.sendPacket(new UpdateSelectedSlotC2SPacket(var3));
            mc.player.getInventory().selectedSlot = var3;
            mc.player.networkHandler.sendPacket(new PlayerInteractItemC2SPacket(Hand.MAIN_HAND, 0, mc.player.getYaw(), mc.player.getPitch()));
            mc.interactionManager.clickSlot(mc.player.playerScreenHandler.syncId, var2, var3, SlotActionType.SWAP, mc.player);
         }
      }
   }
}
