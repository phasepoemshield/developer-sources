package zenith;

import net.minecraft.util.Hand;
import net.minecraft.item.Items;

@ModuleInfo(
   name = "ElytraMotion",
   description = "",
   category = Category.MOVEMENT
)
public final class Elytramotion extends Module {
   public static final Elytramotion I1111l1Illl1I111 = new Elytramotion();
   private final ModeSetting I1llIIIlIl1I1IIIl = new ModeSetting(
      "module.elytraMotion.mode", "module.elytraMotion.mode.desc", "module.elytraMotion.mode.distance", "module.elytraMotion.mode.smart"
   );
   private final NumberSetting IllIllIII1lI11II1Il11lIll1II = new NumberSetting(
      "module.elytraMotion.distance",
      0.1F,
      0.1F,
      4.0F,
      1.0F,
      "module.elytraMotion.distance.desc",
      "b",
      () -> this.I1llIIIlIl1I1IIIl.ClearHeadersHandler(0),
      null
   );
   private boolean ll1lIl = false;
   private final longHolder I1I1IIlII111llI1IIIIllll11 = new longHolder();

   private Elytramotion() {
   }

   @Override
   public void onEnable() {
      this.ll1lIl = false;
      super.l11l1lII();
   }

   @EventTarget
   public void EventTarget(KeyEvent i111liliill1iii1iiii1) {
   }

   @EventTarget
   public void byteHolder_2(EventImpl_22 l11llilil1) {
      if (!l11I1I1ll1Illll1I1l1111l1II.player.isGliding()) {
         this.ll1lIl = false;
      } else {
         if (this.IlII1IIll1()) {
            if (ZenithInternal066.llI1I11llIIl1lIII1I11IlllI() != null) {
               this.ll1lIl = true;
            } else if (this.I1I1IIlII111llI1IIIIllll11.HostnameVerifierImpl(300L) && !this.ll1lIl) {
               ListHolder_5.StringHolder_8(Items.FIREWORK_ROCKET, Hand.OFF_HAND);
               this.I1I1IIlII111llI1IIIIllll11.reset();
            }
         } else {
            this.ll1lIl = false;
         }
      }
   }

   public boolean IlII1IIll1() {
      net.minecraft.util.math.Box Box = Elytratarget.Il1I1IIIl11I1IIlI.l1ll1111lllI1l();
      if (Box == null) {
         return false;
      } else {
         return this.I1llIIIlIl1I1IIIl.ClearHeadersHandler(0)
            ? l11I1I1ll1Illll1I1l1111l1II.player.squaredDistanceTo(Box.getCenter())
               <= (double)(this.IllIllIII1lI11II1Il11lIll1II.lll1lI1llll1IIllIIIII1lll() * this.IllIllIII1lI11II1Il11lIll1II.lll1lI1llll1IIllIIIII1lll())
            : l11I1I1ll1Illll1I1l1111l1II.player.getBoundingBox().intersects(Elytratarget.Il1I1IIIl11I1IIlI.l1ll1111lllI1l());
      }
   }

   @EventTarget
   public void EventBus(Vec3dHolder_2 ll1lii1ii1l11ii11lil111lili11) {
      if (this.ll1lIl) {
         ll1lii1ii1l11ii11lil111lili11.StringHolder_8(net.minecraft.util.math.Vec3d.ZERO);
      }
   }

   @EventTarget
   public void byteHolder(PacketHolder ii1l11il1i1i) {
   }

   public boolean II1lIIlll1llII1lI1II1Illl1l() {
      return this.ll1lIl;
   }
}
