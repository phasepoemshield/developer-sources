package zenith;

import net.minecraft.util.Formatting;
import net.minecraft.screen.GenericContainerScreenHandler;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.text.Text;
import net.minecraft.client.gui.screen.ingame.GenericContainerScreen;
import net.minecraft.network.packet.s2c.play.GameMessageS2CPacket;

public class TimerUtilHolder_2 implements ZenithInternal140 {
   private final TimerUtil IIl111I1I11Il = new TimerUtil();
   private boolean ll1llIllIl11;
   private int llII1I11ll1I1lI1IIIll1l1I1lI1;

   public TimerUtilHolder_2() {
      EventBus.StringHolder_8(this);
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      if (this.llII1I11ll1I1lI1IIIll1l1I1lI1 != 0 && ii1l11il1i1i.Swinganimation() instanceof GameMessageS2CPacket GameMessageS2CPacket && ii1l11il1i1i.longHolder_8()) {
         String s = GameMessageS2CPacket.content().getString().toLowerCase();
         if (!s.contains("хаб") && s.contains("не удалось")) {
            NotificationsHolder.ZenithInternal076()
               .StringHolder_8("0", Text.literal(" На данную анархию " + Formatting.RED + "нельзя" + Formatting.RESET + " зайти"));
            this.llII1I11ll1I1lI1IIIll1l1I1lI1 = 0;
         }
      }
   }

   @EventTarget
   public void EventBus(EventImpl_22 l11llilil1) {
      if (this.llII1I11ll1I1lI1IIIll1l1I1lI1 != 0) {
         StringHolder_25 li1l11l1iiil1l1liilliiii = ZenithClient.getInstance().SupplierHolder();
         if (li1l11l1iiil1l1liilliiii.III11I1lI1I() && !li1l11l1iiil1l1liilliiii.I1l1Illl1l11()) {
            int i = li1l11l1iiil1l1liilliiii.lIl1l1l11ll1lI1I1I();
            if (this.ll1llIllIl11) {
               if (i == -1) {
                  this.ll1llIllIl11 = false;
               } else {
                  l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand("hub");
               }
            } else if (i == this.llII1I11ll1I1lI1IIIll1l1I1lI1) {
               this.llII1I11ll1I1lI1IIIll1l1I1lI1 = 0;
            } else {
               if (l11I1I1ll1Illll1I1l1111l1II.currentScreen instanceof GenericContainerScreen GenericContainerScreen && GenericContainerScreen.getTitle().getString().equals("Выбор Лайт анархии:")) {
                  if (!this.IIl111I1I11Il.ZenithInternal042(500.0)) {
                     return;
                  }

                  boolean flag = ((GenericContainerScreenHandler)GenericContainerScreen.getScreenHandler()).getInventory().size() < 10;
                  int[] aint = this.llII1I11ll1I1lI1IIIll1l1I1lI1 < 16
                     ? new int[]{0, 1}
                     : (
                        this.llII1I11ll1I1lI1IIIll1l1I1lI1 < 32
                           ? new int[]{1, 16}
                           : (this.llII1I11ll1I1lI1IIIll1l1I1lI1 < 48 ? new int[]{2, 32} : new int[]{3, 48})
                     );
                  if (flag) {
                     ListHolder_5.StringHolder_8(aint[0], 0, SlotActionType.PICKUP, false);
                  } else {
                     TextHolder.EventImpl_27("afssf " + (18 + this.llII1I11ll1I1lI1IIIll1l1I1lI1 - aint[1]));
                     ListHolder_5.StringHolder_8(18 + this.llII1I11ll1I1lI1IIIll1l1I1lI1 - aint[1], 0, SlotActionType.PICKUP, false);
                     l11I1I1ll1Illll1I1l1111l1II.player.closeHandledScreen();
                  }

                  return;
               }

               if (this.IIl111I1I11Il.ZenithInternal042(1500.0)) {
                  l11I1I1ll1Illll1I1l1111l1II.player.networkHandler.sendChatCommand("lite");
               }
            }
         } else {
            this.llII1I11ll1I1lI1IIIll1l1I1lI1 = 0;
         }
      }
   }

   public void longHolder_7(int i) {
      if (i > 0 && i <= 69) {
         this.llII1I11ll1I1lI1IIIll1l1I1lI1 = i;
         this.ll1llIllIl11 = true;
         this.IIl111I1I11Il.reset();
      } else {
         NotificationsHolder.ZenithInternal076().StringHolder_8("[RCT]", Text.literal(" Не верный " + Formatting.RED + "лайт"));
      }
   }
}
