package l;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.screen.slot.SlotActionType;

public class Helper325 {
   private static MinecraftClient mc = MinecraftClient.getInstance();

   public Helper325() {
   }

   public static void method3233() {
      if (mc.currentScreen instanceof GenericContainerScreen var0) {
         int var2 = var0.getScreenHandler().syncId;
         mc.interactionManager.clickSlot(var2, 49, 0, SlotActionType.QUICK_MOVE, mc.player);
      }
   }
}
