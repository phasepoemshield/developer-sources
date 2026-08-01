package zenith;

import java.util.ArrayList;
import java.util.List;
import net.minecraft.network.packet.c2s.play.PlayerMoveC2SPacket.PostEffectPass0;
import zenith.zov.base.font.Fonts;

@ModuleInfo(
   name = "PathTeleport",
   description = "",
   category = Category.MISC
)
public final class Pathteleport extends Module {
   public static final Pathteleport II1I1l1I1l11II1lI = new Pathteleport();
   private static final float IIllIlIl11Il1I1Il11l1I1l111lI1 = 10.0F;
   private static final float l11lIIl1I1 = 20.0F;
   private static final float llI11IIllI1II1lI111lllI = 15.0F;
   private final BindSetting I1l1ll1I111IIl1lIl = new BindSetting("Start/Stop Recording", "empty", -1);
   private final BindSetting I1lIII1111II1I1lIIII111 = new BindSetting("Start/Stop Moving", "empty", -1);
   private final List<Pathteleport$II1Il11l111II11IIl> llll11IlII1llI11llIlI1 = new ArrayList<>();
   private boolean lll1lllI1IlI = false;
   private boolean ll1I1III111ll11II1I1I1I1I1 = false;
   private int IlIIII11IIllII1ll11l = 0;

   private Pathteleport() {
   }

   @Override
   public void onEnable() {
      this.lll1lllI1IlI = false;
      this.ll1I1III111ll11II1I1I1I1I1 = false;
      this.IlIIII11IIllII1ll11l = 0;
      super.l11l1lII();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      this.lll1lllI1IlI = false;
      this.ll1I1III111ll11II1I1I1I1I1 = false;
      this.IlIIII11IIllII1ll11l = 0;
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void StringHolder_8(KeyEvent i111liliill1iii1iiii1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null) {
         if (i111liliill1iii1iiii1.StringHolder_5(this.I1l1ll1I111IIl1lIl.Elytramotion())) {
            this.llI11lIl1lIII11();
         }

         if (i111liliill1iii1iiii1.StringHolder_5(this.I1lIII1111II1I1lIIII111.Elytramotion())) {
            this.l1I1ll1llIIIIllIIllIl1I();
         }
      }
   }

   @EventTarget
   public void EventImpl_21(PlayerInputHolder ili11i1il11) {
      if (this.ll1I1III111ll11II1I1I1I1I1) {
         ili11i1il11.Creeperfarm();
      }
   }

   @EventTarget
   public void EventTarget(EventImpl_37 llllii1liii1i1ll1liiil) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         this.StringHolder_8(
            llllii1liii1i1ll1liiil,
            "Recording " + this.lll1lllI1IlI + "  " + StringHolder_3.doubleHolder_2(this.I1l1ll1I111IIl1lIl.Elytramotion()),
            20.0F
         );
         this.StringHolder_8(
            llllii1liii1i1ll1liiil,
            "Moving "
               + this.ll1I1III111ll11II1I1I1I1I1
               + "  "
               + StringHolder_3.doubleHolder_2(this.I1lIII1111II1I1lIIII111.Elytramotion()),
            35.0F
         );
         this.StringHolder_8(llllii1liii1i1ll1liiil, "Points " + this.llll11IlII1llI11llIlI1.size(), 50.0F);
      }
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_22 l11llilil1) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && l11I1I1ll1Illll1I1l1111l1II.world != null) {
         if (this.lll1lllI1IlI) {
            this.l1Il1lIl1Il1IlI1l1IIIIl1l1();
         } else if (!this.ll1I1III111ll11II1I1I1I1I1) {
            this.IlIIII11IIllII1ll11l = 0;
         } else if (this.llll11IlII1llI11llIlI1.isEmpty()) {
            this.ll1I1III111ll11II1I1I1I1I1 = false;
            this.IlIIII11IIllII1ll11l = 0;
         } else if (this.IlIIII11IIllII1ll11l >= this.llll11IlII1llI11llIlI1.size()) {
            this.ll1I1III111ll11II1I1I1I1I1 = false;
            this.IlIIII11IIllII1ll11l = 0;
         } else {
            this.StringHolder_8(this.llll11IlII1llI11llIlI1.get(this.IlIIII11IIllII1ll11l));
            this.IlIIII11IIllII1ll11l++;
         }
      }
   }

   private void llI11lIl1lIII11() {
      this.lll1lllI1IlI = !this.lll1lllI1IlI;
      if (this.lll1lllI1IlI) {
         this.ll1I1III111ll11II1I1I1I1I1 = false;
         this.IlIIII11IIllII1ll11l = 0;
         this.llll11IlII1llI11llIlI1.clear();
         this.l1Il1lIl1Il1IlI1l1IIIIl1l1();
      }
   }

   private void l1I1ll1llIIIIllIIllIl1I() {
      if (this.ll1I1III111ll11II1I1I1I1I1) {
         this.ll1I1III111ll11II1I1I1I1I1 = false;
         this.IlIIII11IIllII1ll11l = 0;
      } else if (this.llll11IlII1llI11llIlI1.isEmpty()) {
         TextHolder.StringHolder_26("PathTeleport: сначала запиши маршрут");
      } else {
         this.lll1lllI1IlI = false;
         this.ll1I1III111ll11II1I1I1I1I1 = true;
         this.IlIIII11IIllII1ll11l = 0;
      }
   }

   private void l1Il1lIl1Il1IlI1l1IIIIl1l1() {
      Pathteleport$II1Il11l111II11IIl lili1i111iili11i1i1l$ii1il11l111ii11iil = new Pathteleport$II1Il11l111II11IIl(
         l11I1I1ll1Illll1I1l1111l1II.player.getX(),
         l11I1I1ll1Illll1I1l1111l1II.player.getY(),
         l11I1I1ll1Illll1I1l1111l1II.player.getZ(),
         l11I1I1ll1Illll1I1l1111l1II.player.getYaw(),
         l11I1I1ll1Illll1I1l1111l1II.player.getPitch(),
         l11I1I1ll1Illll1I1l1111l1II.player.isOnGround()
      );
      this.llll11IlII1llI11llIlI1.add(lili1i111iili11i1i1l$ii1il11l111ii11iil);
   }

   private boolean StringHolder_8(
      Pathteleport$II1Il11l111II11IIl lili1i111iili11i1i1l$ii1il11l111ii11iil,
      Pathteleport$II1Il11l111II11IIl lili1i111iili11i1i1l$ii1il11l111ii11iil
   ) {
      return Math.abs(lili1i111iili11i1i1l$ii1il11l111ii11iilx.llI1Il11 - lili1i111iili11i1i1l$ii1il11l111ii11iil.llI1Il11) > 0.001
         || Math.abs(lili1i111iili11i1i1l$ii1il11l111ii11iilx.llll1l1I1IllIIIlI1Il1I1l - lili1i111iili11i1i1l$ii1il11l111ii11iil.llll1l1I1IllIIIlI1Il1I1l)
            > 0.001
         || Math.abs(lili1i111iili11i1i1l$ii1il11l111ii11iilx.IlI11lIl11l1Il1Il1lll1llll - lili1i111iili11i1i1l$ii1il11l111ii11iil.IlI11lIl11l1Il1Il1lll1llll)
            > 0.001
         || Math.abs(lili1i111iili11i1i1l$ii1il11l111ii11iilx.lIIllII1lllIIl1IlI1l111l - lili1i111iili11i1i1l$ii1il11l111ii11iil.lIIllII1lllIIl1IlI1l111l)
            > 0.05F
         || Math.abs(lili1i111iili11i1i1l$ii1il11l111ii11iilx.I1lI11l1I1II - lili1i111iili11i1i1l$ii1il11l111ii11iil.I1lI11l1I1II) > 0.05F
         || lili1i111iili11i1i1l$ii1il11l111ii11iilx.I11II1ll1I1lll1l != lili1i111iili11i1i1l$ii1il11l111ii11iil.I11II1ll1I1lll1l;
   }

   private void StringHolder_8(Pathteleport$II1Il11l111II11IIl lili1i111iili11i1i1l$ii1il11l111ii11iil) {
      l11I1I1ll1Illll1I1l1111l1II.player.setVelocity(0.0, 0.0, 0.0);
      l11I1I1ll1Illll1I1l1111l1II.player.setOnGround(lili1i111iili11i1i1l$ii1il11l111ii11iil.I11II1ll1I1lll1l);
      l11I1I1ll1Illll1I1l1111l1II.player
         .setPosition(
            lili1i111iili11i1i1l$ii1il11l111ii11iil.llI1Il11,
            lili1i111iili11i1i1l$ii1il11l111ii11iil.llll1l1I1IllIIIlI1Il1I1l,
            lili1i111iili11i1i1l$ii1il11l111ii11iil.IlI11lIl11l1Il1Il1lll1llll
         );
      ZenithInternal066.byteHolder(
         new PostEffectPass0(
            lili1i111iili11i1i1l$ii1il11l111ii11iil.llI1Il11,
            lili1i111iili11i1i1l$ii1il11l111ii11iil.llll1l1I1IllIIIlI1Il1I1l,
            lili1i111iili11i1i1l$ii1il11l111ii11iil.IlI11lIl11l1Il1Il1lll1llll,
            lili1i111iili11i1i1l$ii1il11l111ii11iil.lIIllII1lllIIl1IlI1l111l,
            lili1i111iili11i1i1l$ii1il11l111ii11iil.I1lI11l1I1II,
            lili1i111iili11i1i1l$ii1il11l111ii11iil.I11II1ll1I1lll1l,
            l11I1I1ll1Illll1I1l1111l1II.player.horizontalCollision
         )
      );
   }

   private void StringHolder_8(EventImpl_37 llllii1liii1i1ll1liiil, String s, float f) {
      float f1 = (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() - Fonts.NEW_MEDIUM.getWidth(s, 10.0F) - 20.0F;
      llllii1liii1i1ll1liiil.Predictions().StringHolder_8(Fonts.NEW_MEDIUM.getFont(10.0F), s, f1, f, ByteBufferHolder.ll1lIllll111I1lIIl1lIl);
   }
}
