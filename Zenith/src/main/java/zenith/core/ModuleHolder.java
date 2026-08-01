package zenith;

import zenith.hud.*;

import java.util.Objects;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.s2c.play.InventoryS2CPacket;
import net.minecraft.network.packet.s2c.play.ScreenHandlerSlotUpdateS2CPacket;
import net.minecraft.network.packet.s2c.play.PlayerPositionLookS2CPacket;
import net.minecraft.network.packet.c2s.play.ClickSlotC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket;
import net.minecraft.network.packet.c2s.play.PlayerInteractItemC2SPacket;
import net.minecraft.util.math.MathHelper;
import net.minecraft.network.packet.c2s.common.CommonPongC2SPacket;

public class ModuleHolder implements ZenithInternal076 {
   private floatHolder_6 l111l1IllIlI1l1 = new floatHolder_6(0.0F, 0.0F);
   private floatHolder_6 IlI1Il111Il1I1I1I1lII = new floatHolder_6(0.0F, 0.0F);
   private final ZenithInternal141<SupplierHolder> lIllllI1IlI1l11III1IIl = new ZenithInternal141<>();
   private final ZenithInternal041 llIIlIllI1llI1l1 = new ZenithInternal041();
   private SupplierHolder IIIl1lllllIl1lIIIlI1lI = new SupplierHolder(
      this.l111l1IllIlI1l1, () -> this.l111l1IllIlI1l1, this.llIIlIllI1llI1l1.lIIIl1IllIlIIll1II()
   );
   private Module I111IIl1I111IIII = null;
   private floatHolder_6 ll1l111lI1IIll = floatHolder_6.lIlI1Il11lIl;
   private int lIlI1I1IlI1 = 0;

   public floatHolder_6 ll1ll1l11l1lllIIIIl1() {
      return this.l111l1IllIlI1l1 == null
         ? new floatHolder_6(l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch(), true)
         : this.l111l1IllIlI1l1;
   }

   public boolean IllIlII1l1IIII11lllll1III1() {
      return this.l111l1IllIlI1l1 == null;
   }

   public ModuleHolder() {
      EventBus.StringHolder_8(this);
   }

   @EventTarget(
      ZenithInternal095 = 3
   )
   public void EventBus(EventImpl_16 illil11l111il11ili1il) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (l11I1I1ll1Illll1I1l1111l1II.player.isDead()) {
            if (this.l111l1IllIlI1l1 != null) {
               l11I1I1ll1Illll1I1l1111l1II.player
                  .setYaw(
                     this.l111l1IllIlI1l1.AutoBrewing()
                        + MathHelper.wrapDegrees(l11I1I1ll1Illll1I1l1111l1II.player.getYaw() - this.l111l1IllIlI1l1.AutoBrewing())
                  );
               l11I1I1ll1Illll1I1l1111l1II.player.renderYaw = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
               this.lIlI1I1IlI1 = 2;
               this.l111l1IllIlI1l1 = null;
            }
         } else {
            EventBus.StringHolder_8((Event)(new EventImpl_30()));
            floatHolder_6 il1ll111liili1ll11liil = new floatHolder_6(
               l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch(), true
            );
            ModuleHolder$Helper lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil = this.lIllllI1IlI1l11III1IIl
               .ListHolder_4();
            if (lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil != null) {
               SupplierHolder iiil1l1l1li11ii = (SupplierHolder)lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.I1IIlI11I;
               floatHolder_6 il1ll111liili1ll11liil1 = iiil1l1l1li11ii.I1111lII1IIl1Il1I1lIIIlI11llI().get();
               this.IlI1Il111Il1I1I1I1lII = this.l111l1IllIlI1l1 == null ? il1ll111liili1ll11liil : this.l111l1IllIlI1l1;
               this.l111l1IllIlI1l1 = il1ll111liili1ll11liil1;
               this.IIIl1lllllIl1lIIIlI1lI = iiil1l1l1li11ii;
               this.I111IIl1I111IIII = lli11il1ii1ll1i1iiiii11$ii1il11l111ii11iil.I1I1111111I1l1lIll11;
               this.l111l1IllIlI1l1 = new floatHolder_6(
                  this.l111l1IllIlI1l1.AutoBrewing(), MathHelper.clamp(this.l111l1IllIlI1l1.Basefinder(), -90.0F, 90.0F)
               );
               this.lIlI1I1IlI1--;
            } else if (this.l111l1IllIlI1l1 != null) {
               this.I111IIl1I111IIII = null;
               floatHolder_6 il1ll111liili1ll11liil2 = this.llIIlIllI1llI1l1
                  .StringHolder_8(this.IIIl1lllllIl1lIIIlI1lI.IIlI1lI1lI1Il1l111lIl111IIlll(), il1ll111liili1ll11liil);
               this.IlI1Il111Il1I1I1I1lII = this.l111l1IllIlI1l1;
               this.l111l1IllIlI1l1 = il1ll111liili1ll11liil2;
               if (il1ll111liili1ll11liil.longHolder_6(il1ll111liili1ll11liil2).ZenithException(9.0F)) {
                  l11I1I1ll1Illll1I1l1111l1II.player
                     .setYaw(
                        il1ll111liili1ll11liil2.AutoBrewing()
                           + MathHelper.wrapDegrees(l11I1I1ll1Illll1I1l1111l1II.player.getYaw() - il1ll111liili1ll11liil2.AutoBrewing())
                     );
                  l11I1I1ll1Illll1I1l1111l1II.player.renderYaw = l11I1I1ll1Illll1I1l1111l1II.player.getYaw();
                  this.lIlI1I1IlI1 = 2;
                  this.l111l1IllIlI1l1 = null;
               } else {
                  this.l111l1IllIlI1l1 = new floatHolder_6(
                     this.l111l1IllIlI1l1.AutoBrewing(), MathHelper.clamp(this.l111l1IllIlI1l1.Basefinder(), -90.0F, 90.0F)
                  );
               }
            }

            this.lIllllI1IlI1l11III1IIl.tick();
            l11I1I1ll1Illll1I1l1111l1II.gameRenderer.updateCrosshairTarget(1.0F);
            EventBus.StringHolder_8((Event)(new EventImpl_20()));
            if (this.l111l1IllIlI1l1 != null && this.IlI1Il111Il1I1I1I1lII != null) {
            }
         }
      }
   }

   @EventTarget
   public void EventTarget(PacketHolder ii1l11il1i1i) {
      Packet Packet = ii1l11il1i1i.Swinganimation();
      Objects.requireNonNull(Packet);
      Object object = Packet;
      switch (object) {
         case PlayerMoveC2SPacket PlayerMoveC2SPacket:
            if (PlayerMoveC2SPacket.getYaw(2.1474836E9F) != 2.1474836E9F) {
               EventImpl_8 ii1ll11lil1l1i1ll1llli1l = new EventImpl_8(
                  this.l111l1IllIlI1l1 != null
                     ? new floatHolder_6(this.ll1l111lI1IIll.AutoBrewing(), this.ll1l111lI1IIll.Basefinder(), true)
                     : new floatHolder_6(
                        l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch(), true
                     )
               );
               this.ll1l111lI1IIll = new floatHolder_6(PlayerMoveC2SPacket.getYaw(0.0F), PlayerMoveC2SPacket.getPitch(0.0F), true);
               EventBus.StringHolder_8((Event)ii1ll11lil1l1i1ll1llli1l);
               this.lIlI1I1IlI1--;
            }
            break;
         case PlayerPositionLookS2CPacket PlayerPositionLookS2CPacket:
            if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
               EventImpl_8 ii1ll11lil1l1i1ll1llli1l1 = new EventImpl_8(
                  this.l111l1IllIlI1l1 != null
                     ? new floatHolder_6(this.ll1l111lI1IIll.AutoBrewing(), this.ll1l111lI1IIll.Basefinder(), true)
                     : new floatHolder_6(
                        l11I1I1ll1Illll1I1l1111l1II.player.getYaw(), l11I1I1ll1Illll1I1l1111l1II.player.getPitch(), true
                     )
               );
               this.ll1l111lI1IIll = new floatHolder_6(PlayerPositionLookS2CPacket.change().yaw(), PlayerPositionLookS2CPacket.change().pitch(), true);
               EventBus.StringHolder_8((Event)ii1ll11lil1l1i1ll1llli1l1);
               this.lIlI1I1IlI1--;
            }
            break;
         case CommonPongC2SPacket CommonPongC2SPacket:
            CommonPongC2SPacket.parameter = CommonPongC2SPacket.parameter;
            break;
         case PlayerInteractItemC2SPacket PlayerInteractItemC2SPacket:
            EventImpl_8 ii1ll11lil1l1i1ll1llli1l2 = new EventImpl_8(
               new floatHolder_6(this.ll1l111lI1IIll.AutoBrewing(), this.ll1l111lI1IIll.Basefinder(), true)
            );
            this.ll1l111lI1IIll = new floatHolder_6(PlayerInteractItemC2SPacket.getYaw(), PlayerInteractItemC2SPacket.getPitch(), true);
            EventBus.StringHolder_8((Event)ii1ll11lil1l1i1ll1llli1l2);
            break;
         case ScreenHandlerSlotUpdateS2CPacket ScreenHandlerSlotUpdateS2CPacket:
            break;
         case InventoryS2CPacket InventoryS2CPacket:
            break;
         case ClickSlotC2SPacket ClickSlotC2SPacket:
            ClickSlotC2SPacket.revision = l11I1I1ll1Illll1I1l1111l1II.player.currentScreenHandler.getRevision();
            break;
      }
   }

   public void StringHolder_8(SupplierHolder iiil1l1l1li11ii, int i, Module ll111il1lliill11, int j) {
      this.lIllllI1IlI1l11III1IIl.StringHolder_8(new ModuleHolder$Helper<>(j, i, ll111il1lliill11, iiil1l1l1li11ii));
   }

   public void StringHolder_8(SupplierHolder iiil1l1l1li11ii, int i, Module ll111il1lliill11) {
      this.lIllllI1IlI1l11III1IIl.StringHolder_8(new ModuleHolder$Helper<>(1, i, ll111il1lliill11, iiil1l1l1li11ii));
   }

   public floatHolder_6 I111Ill1lIllIIIl() {
      return this.l111l1IllIlI1l1;
   }

   public floatHolder_6 l1lII1IllIII() {
      return this.IlI1Il111Il1I1I1I1lII;
   }

   public ZenithInternal141<SupplierHolder> IIlIl1Il1IIIl() {
      return this.lIllllI1IlI1l11III1IIl;
   }

   public ZenithInternal041 I1IlIlIlllI1III1l1l1I1l1IlI111() {
      return this.llIIlIllI1llI1l1;
   }

   public SupplierHolder IIIlI11IllIIlIllII1l1() {
      return this.IIIl1lllllIl1lIIIlI1lI;
   }

   public Module lIIII11lIIl1() {
      return this.I111IIl1I111IIII;
   }

   public floatHolder_6 lI1Il11l1I11lI1lI111I() {
      return this.ll1l111lI1IIll;
   }

   public int IIl11I11lI1lI() {
      return this.lIlI1I1IlI1;
   }

   public void EventBus(floatHolder_6 il1ll111liili1ll11liil) {
      this.l111l1IllIlI1l1 = il1ll111liili1ll11liil;
   }
}
