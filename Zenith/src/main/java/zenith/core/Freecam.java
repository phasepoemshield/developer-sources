package zenith;

import net.minecraft.client.option.Perspective;
import zenith.zov.base.font.Fonts;

@ModuleInfo(
   name = "FreeCam",
   description = "Свободный обзор камеры летать можно",
   category = Category.MISC
)
public final class Freecam extends Module {
   public static final Freecam IlIl11lIIl = new Freecam();
   private final NumberSetting llIll11111Il11II1lI = new NumberSetting(
      "module.freeCam.speedSetting", 2.0F, 0.5F, 5.0F, 0.5F, "module.freeCam.speedSetting.desc", "x"
   );
   public net.minecraft.util.math.Vec3d l1l111I11I1I;
   public net.minecraft.util.math.Vec3d I1I111ll;

   public net.minecraft.util.math.Vec3d llllllIllIIl1Il1lIlI1I1lIIl11l() {
      return this.Spider() ? this.l1l111I11I1I : l11I1I1ll1Illll1I1l1111l1II.getCameraEntity().getEyePos();
   }

   private Freecam() {
   }

   @Override
   public void onEnable() {
      this.I1I111ll = this.l1l111I11I1I = new net.minecraft.util.math.Vec3d(l11I1I1ll1Illll1I1l1111l1II.getEntityRenderDispatcher().camera.getPos().toVector3f());
      super.l11l1lII();
   }

   @Override
   public void l1l1lI111l1II1Illl111l1l1ll1l() {
      l11I1I1ll1Illll1I1l1111l1II.options.setPerspective(Perspective.FIRST_PERSON);
      super.l1l1lI111l1II1Illl111l1l1ll1l();
   }

   @EventTarget
   public void ZenithInternal095(EventImpl_34 ll1li1l111llllli1) {
      ListHolder_2.StringHolder_8(
         l11I1I1ll1Illll1I1l1111l1II.player
            .getBoundingBox()
            .offset(doubleHolder_3.ZenithInternal021(l11I1I1ll1Illll1I1l1111l1II.player).subtract(l11I1I1ll1Illll1I1l1111l1II.player.getPos())),
         II1l111II1Il11II111llllIl1.floatHolder_3().getClientColor(90).lllIlll1Ill111l111Il11II11lII(),
         1.0F
      );
   }

   @EventTarget
   public void StringHolder_8(EventImpl_5 i1iilll1lili11lll11l11li1l) {
      String s = doubleHolder_3.round((float)this.l1l111I11I1I.x)
         + "   "
         + doubleHolder_3.round((float)this.l1l111I11I1I.y)
         + "   "
         + doubleHolder_3.round((float)this.l1l111I11I1I.z);
      float f = Fonts.MEDIUM.getWidth(s, 7.0F);
      i1iilll1lili11lll11l11li1l.HitParticles()
         .StringHolder_8(
            Fonts.MEDIUM.getFont(7.0F),
            s,
            (float)l11I1I1ll1Illll1I1l1111l1II.getWindow().getScaledWidth() / 2.0F - f / 2.0F,
            10.0F,
            ZenithClient.getInstance()
               .floatHolder_3()
               .getCurrentStyle()
               .getTextEnable()
               .l1IllIl1l1llIlI11I11Il1l1l1lI1()
         );
   }

   @EventTarget
   public void ZenithInternal028(PlayerInputHolder ili11i1il11) {
      float f = this.llIll11111Il11II1lI.lll1lI1llll1IIllIIIII1lll();
      double[] adouble = ZenithInternal047.byteHolder((double)f);
      this.I1I111ll = this.l1l111I11I1I;
      this.l1l111I11I1I = this.l1l111I11I1I
         .add(
            adouble[0],
            ili11i1il11.Netherwartfarm().jump() ? (double)f : (ili11i1il11.Netherwartfarm().sneak() ? (double)(-f) : 0.0),
            adouble[1]
         );
      ili11i1il11.Creeperfarm();
   }

   @EventTarget
   public void StringHolder_8(EventImpl_18 illlil1iiii) {
      if (this.I1I111ll != null && this.l1l111I11I1I != null) {
         illlil1iiii.EventBus(doubleHolder_3.EventImpl_13(this.I1I111ll, this.l1l111I11I1I));
         l11I1I1ll1Illll1I1l1111l1II.options.setPerspective(Perspective.THIRD_PERSON_BACK);
      }
   }
}
