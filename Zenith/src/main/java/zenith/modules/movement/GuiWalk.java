// Module: Gui Walk
// Category: movement
// Original class: GuiWalk
// Decompiled from Zenith client (Minecraft 1.21.4 Fabric)

package zenith.modules.movement;

import zenith.hud.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import net.minecraft.screen.slot.SlotActionType;
import net.minecraft.screen.PlayerScreenHandler;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;

@ModuleInfo(
   name = "Gui Walk",
   category = Category.MOVEMENT,
   description = "Можно ходить в инвентаре или контейнере"
)
public final class GuiWalk extends Module {
   public static final GuiWalk l11IIIl1ll1II1I1I = new GuiWalk();
   private SlotActionType I11lI1II1 = null;
   private final List<Packet<?>> I11Il11I11llI1111l1I1ll1l = new ArrayList<>();
   boolean IlI1ll1lIIl1 = false;

   private GuiWalk() {
   }

   @EventTarget
   public void StringHolder_8(PacketHolder ii1l11il1i1i) {
      try {
         if (ZenithInternal066.lII1IlIll11()) {
            return;
         }

         if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler) {
            if (!this.IlI1ll1lIIl1) {
               return;
            }

            this.IlI1ll1lIIl1 = false;
            if (Objects.requireNonNull(ii1l11il1i1i.Swinganimation()) instanceof ClickSlotC2SPacket ClickSlotC2SPacket
               && (!this.I11Il11I11llI1111l1I1ll1l.isEmpty() || ZenithInternal047.IlIllI1lI11Ill11llII1111l())
               && ListHolder_8.IIlII1II1lI()) {
               this.I11Il11I11llI1111l1I1ll1l.add(ClickSlotC2SPacket);
               this.I11lI1II1 = ClickSlotC2SPacket.getActionType();
               ii1l11il1i1i.EventBus(true);
            }
         }
      } catch (Exception exception) {
         exception.printStackTrace();
      }
   }

   @EventTarget
   public void EventBus(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler
         && ListHolder_8.IIlII1II1lI()
         && (!this.I11Il11I11llI1111l1I1ll1l.isEmpty() || l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getCursorStack().isEmpty())) {
         ListHolder_8.Il111lI1lllIIIIll11Il1IIlI();
      }
   }

   @EventTarget
   public void StringHolder_8(GetSlotIdHandler ill1i11lii11111li1ii1l) {
      if (ill1i11lii11111li1ii1l.getSlotId() >= 0) {
         System.out.println(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.slots.size() + " " + ill1i11lii11111li1ii1l.getSlotId() + " ");
      }

      if (l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler) {
         SlotActionType SlotActionType = ill1i11lii11111li1ii1l.Shulkerjump();
         if (!this.I11Il11I11llI1111l1I1ll1l.isEmpty() || ZenithInternal047.IlIllI1lI11Ill11llII1111l()) {
            if ((ill1i11lii11111li1ii1l.Elytratarget() != 1 || !SlotActionType.equals(SlotActionType.PICKUP))
               && (this.I11lI1II1 != SlotActionType.PICKUP || ill1i11lii11111li1ii1l.Shulkerjump() != SlotActionType.QUICK_MOVE)
               && (this.I11lI1II1 != SlotActionType.QUICK_MOVE || ill1i11lii11111li1ii1l.Shulkerjump() != SlotActionType.PICKUP)
               && (this.I11lI1II1 != SlotActionType.QUICK_MOVE || ill1i11lii11111li1ii1l.Shulkerjump() != SlotActionType.PICKUP_ALL)
               && (this.I11lI1II1 != SlotActionType.PICKUP_ALL || ill1i11lii11111li1ii1l.Shulkerjump() != SlotActionType.QUICK_MOVE)) {
               this.IlI1ll1lIIl1 = true;
            } else {
               ill1i11lii11111li1ii1l.EventBus(true);
            }
         }
      }
   }

   @EventTarget
   public void StringHolder_8(ScreenHolder ll1iliil1l1li11li111l) {
      if (ZenithInternal047.IlIllI1lI11Ill11llII1111l() || !this.I11Il11I11llI1111l1I1ll1l.isEmpty()) {
         ll1iliil1l1li11li111l.EventBus(true);
      }

      if (!this.I11Il11I11llI1111l1I1ll1l.isEmpty()) {
         this.I11lI1II1 = null;
         this.IlI1ll1lIIl1 = false;
         ArrayList arraylist = new ArrayList<>(this.I11Il11I11llI1111l1I1ll1l);
         this.I11Il11I11llI1111l1I1ll1l.clear();
         AtomicLongHolder$EventBus illlli1liiiil1i1lll111$l1i1illlili = new AtomicLongHolder$EventBus(GuiWalk.class);
         if (Inventorysetting.ll11II1111ll11I1llI.lIlI1I11111I11lI1()) {
            illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(
               PlayerInputHolder.class,
               ili11i1il11 -> {
                  ili11i1il11.Creeperfarm();
                  if (!l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                     arraylist.forEach(Packet -> l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendPacket(Packetx));
                     ListHolder_5.IIl1IlI1l11Il();
                     return true;
                  } else {
                     return false;
                  }
               }
            );
         } else {
            for (int i = 0; i < arraylist.size(); i++) {
               Packet Packet = (Packet)arraylist.get(i);
               illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(
                  EventImpl_29.class,
                  ll1i1ii1il -> {
                     if (!(l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler instanceof PlayerScreenHandler)) {
                        ListHolder_5.IIl1IlI1l11Il();
                     }

                     if (!l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                        && !l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                        && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                        && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                        && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                        && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                        l11I1I1ll1Illll1I1l1111l1II.getNetworkHandler().sendPacket(Packet);
                        return true;
                     } else {
                        return false;
                     }
                  }
               );
            }

            illlli1liiiil1i1lll111$l1i1illlili.StringHolder_8(
               PlayerInputHolder.class,
               ili11i1il11 -> {
                  if (!l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.jump()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.isSprinting()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.forward()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.backward()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.left()
                     && !l11I1I1ll1Illll1I1l1111l1II.player.lastPlayerInput.right()) {
                     ListHolder_5.IIl1IlI1l11Il();
                     return true;
                  } else {
                     return false;
                  }
               }
            );
            illlli1liiiil1i1lll111$l1i1illlili.EventBus(PlayerInputHolder.class, ili11i1il11 -> {
               ili11i1il11.Creeperfarm();
               return true;
            });
         }

         ZenithClient.getInstance().ModuleHolder().StringHolder_8(illlli1liiiil1i1lll111$l1i1illlili);
      }
   }
}
