package l;

import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.util.Formatting;

public class Helper2 implements Helper94, Helper160 {
   private final Helper339 stopWatch = new Helper339();
   private boolean lobby;
   private int anarchy;

   public Helper2(Helper124 var1) {
      var1.method1016(this);
   }

   @Helper104
   public void onPacket(Helper386 var1) {
      if (this.anarchy != 0 && var1.method3895() instanceof GameMessageS2CPacket var2) {
         String var4 = var2.content().getString().toLowerCase();
         if (!var4.contains("хаб") && var4.contains("не удалось")) {
            Notifications.method1666().method1668("[RCT] На данную анархию " + Formatting.RED + "нельзя" + Formatting.RESET + " зайти", 3000L);
            this.anarchy = 0;
         }
      }
   }

   @Helper104
   public void onTick(Event8 var1) {
      if (this.anarchy != 0) {
         if (!Helper128.method1055()) {
            this.anarchy = 0;
         } else {
            int var2 = Helper128.method1059();
            if (this.lobby) {
               if (var2 == -1) {
                  this.lobby = false;
               } else {
                  mc.player.networkHandler.sendChatCommand("hub");
               }
            } else if (var2 == this.anarchy) {
               this.anarchy = 0;
            } else if (mc.currentScreen instanceof GenericContainerScreen var3 && var3.getTitle().getString().equals("Выбор Лайт анархии:")) {
               boolean var6 = var3.getScreenHandler().getInventory().size() < 10;
               int[] var5 = this.anarchy < 15
                  ? new int[]{0, 0}
                  : (this.anarchy < 33 ? new int[]{1, 14} : (this.anarchy < 48 ? new int[]{2, 32} : new int[]{3, 47}));
               if (var6) {
                  Helper66.method703(var5[0], 0, SlotActionType.PICKUP, false);
               } else {
                  Helper66.method703(17 + this.anarchy - var5[1], 0, SlotActionType.PICKUP, false);
               }
            } else {
               if (this.stopWatch.method3357(500.0)) {
                  mc.player.networkHandler.sendChatCommand("lite");
               }
            }
         }
      }
   }

   public void method254(int var1) {
      if (var1 > 0 && var1 < 64) {
         this.anarchy = var1;
         this.lobby = true;
      } else {
         Notifications.method1666().method1668("[RCT] Не верный " + Formatting.RED + "лайт", 3000L);
      }
   }
}
