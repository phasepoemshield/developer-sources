package zenith;

import net.minecraft.util.Hand;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.item.Item;
import net.minecraft.network.packet.c2s.play.UpdateSelectedSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.HandSwingC2SPacket;

@Deprecated
public class ZenithInternal120 implements ZenithInternal076 {
   public static int EventImpl_24(Item Item) {
      return StringHolder_8(Item, 0, 35);
   }

   public static int ZenithInternal028(Item Item) {
      return StringHolder_8(Item, 0, 8);
   }

   public static int EventImpl_21(Item Item) {
      return StringHolder_8(Item, 9, 35);
   }

   public static int StringHolder_8(Item Item, int i, int j) {
      for (int k = j; k >= i; k--) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(k).getItem() == Item) {
            return k;
         }
      }

      return -1;
   }

   public static int EventImpl_21(int i, int j) {
      for (int k = j; k >= i; k--) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.getInventory().getStack(k).isEmpty()) {
            return k;
         }
      }

      return -1;
   }

   public static void StringHolder_8(ZenithInternal118$EventBus liililll1ilil1$l1i1illlili, int i, int j) {
      if (i != -1 && j != -1) {
         switch (liililll1ilil1$l1i1illlili) {
            case ll11III1llI:
               l11I1I1ll1Illll1I1l1111l1II.player.getInventory().selectedSlot = i;
               break;
            case IlIlll111lll:
               l11I1I1ll1Illll1I1l1111l1II.player.getInventory().selectedSlot = i;
               ZenithInternal147.byteHolder_2(new UpdateSelectedSlotC2SPacket(i));
               break;
            case l1Ill111Illllll11lIIII1lll1II:
               EventImpl_13(i, j);
         }
      }
   }

   public static void EventBus(ZenithInternal118$EventBus liililll1ilil1$l1i1illlili, int i, int j) {
      if (i != -1 && j != -1) {
         switch (liililll1ilil1$l1i1illlili) {
            case ll11III1llI:
               l11I1I1ll1Illll1I1l1111l1II.player.getInventory().selectedSlot = j;
               break;
            case IlIlll111lll:
               l11I1I1ll1Illll1I1l1111l1II.player.getInventory().selectedSlot = j;
               ZenithInternal147.byteHolder_2(new UpdateSelectedSlotC2SPacket(j));
               break;
            case l1Ill111Illllll11lIIII1lll1II:
               EventImpl_13(i, j);
         }
      }
   }

   public static void EventImpl_13(int i, int j) {
      if (i != -1 && j != -1) {
         l11I1I1ll1Illll1I1l1111l1II.interactionManager
            .clickSlot(l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler.syncId, i, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
         l11I1I1ll1Illll1I1l1111l1II.interactionManager
            .clickSlot(l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler.syncId, j, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
         l11I1I1ll1Illll1I1l1111l1II.interactionManager
            .clickSlot(l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler.syncId, i, 0, SlotActionType.PICKUP, l11I1I1ll1Illll1I1l1111l1II.player);
      }
   }

   public static void byteHolder_2(int i, int j) {
      if (i != -1 && j != -1) {
         l11I1I1ll1Illll1I1l1111l1II.interactionManager
            .clickSlot(
               l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler.syncId,
               SecretKeySpecHolder(i),
               0,
               SlotActionType.PICKUP,
               l11I1I1ll1Illll1I1l1111l1II.player
            );
         l11I1I1ll1Illll1I1l1111l1II.interactionManager
            .clickSlot(
               l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler.syncId,
               SecretKeySpecHolder(j),
               0,
               SlotActionType.PICKUP,
               l11I1I1ll1Illll1I1l1111l1II.player
            );
         l11I1I1ll1Illll1I1l1111l1II.interactionManager
            .clickSlot(
               l11I1I1ll1Illll1I1l1111l1II.player.playerScreenHandler.syncId,
               SecretKeySpecHolder(i),
               0,
               SlotActionType.PICKUP,
               l11I1I1ll1Illll1I1l1111l1II.player
            );
      }
   }

   public static void byteHolder(int i, int j) {
      if (i != -1 && j != -1) {
         byteHolder_2(i, j);
      }
   }

   public static int SecretKeySpecHolder(int i) {
      return i >= 0 && i <= 8 ? 36 + i : i;
   }

   public static void StringHolder_8(ZenithInternal119$Helper liililll1ilil1$ii1il11l111ii11iil) {
      switch (liililll1ilil1$ii1il11l111ii11iil) {
         case lIIIII111Ill1l11l:
            l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand.MAIN_HAND);
            break;
         case ll1Ill111I1lI:
            l11I1I1ll1Illll1I1l1111l1II.player.swingHand(Hand.OFF_HAND);
            break;
         case l1IllIllIIIll:
            ZenithInternal147.byteHolder_2(new HandSwingC2SPacket(Hand.MAIN_HAND));
      }
   }
}
