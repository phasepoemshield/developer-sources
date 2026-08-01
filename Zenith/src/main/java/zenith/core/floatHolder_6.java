package zenith;

import net.minecraft.util.math.MathHelper;

public class floatHolder_6 {
   private final float I11IlIlIlIllI11lIIlll;
   private final float Il11IIlllIIII11ll1lI1I1II;
   private boolean II1IIIIIII1lIlIl1;
   public static final floatHolder_6 lIlI1Il11lIl = new floatHolder_6(0.0F, 0.0F);

   public floatHolder_6(float f, float f1) {
      this(f, f1, false);
   }

   public floatHolder_6(float f, float f1, boolean flag) {
      this.I11IlIlIlIllI11lIIlll = f;
      this.Il11IIlllIIII11ll1lI1I1II = MathHelper.clamp(f1, -90.0F, 90.0F);
      this.II1IIIIIII1lIlIl1 = flag;
   }

   public static floatHolder_6 EventImpl_21(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      return longHolder_3(Vec3d.subtract(Vec3dx));
   }

   public static floatHolder_6 longHolder_3(net.minecraft.util.math.Vec3d Vec3d) {
      double d0 = Vec3d.x;
      double d1 = Vec3d.y;
      double d2 = Vec3d.z;
      return new floatHolder_6(
         (float)MathHelper.wrapDegrees(Math.toDegrees(Math.atan2(d2, d0)) - 90.0),
         (float)MathHelper.wrapDegrees(-Math.toDegrees(Math.atan2(d1, Math.sqrt(d0 * d0 + d2 * d2))))
      );
   }

   public float ZenithInternal070(floatHolder_6 il1ll111liili1ll11liil1) {
      return Math.min(this.longHolder_6(il1ll111liili1ll11liil1).III1IIII111l(), 180.0F);
   }

   public floatHolder_9 longHolder_6(floatHolder_6 il1ll111liili1ll11liil1) {
      return new floatHolder_9(
         this.CallableImpl(il1ll111liili1ll11liil1.I11IlIlIlIllI11lIIlll, this.I11IlIlIlIllI11lIIlll),
         this.CallableImpl(il1ll111liili1ll11liil1.Il11IIlllIIII11ll1lI1I1II, this.Il11IIlllIIII11ll1lI1I1II)
      );
   }

   private float CallableImpl(float f, float f1) {
      return MathHelper.wrapDegrees(f - f1);
   }

   public boolean StringHolder_8(floatHolder_6 il1ll111liili1ll11liil1, float f) {
      return this.ZenithInternal070(il1ll111liili1ll11liil1) <= f;
   }

   public boolean lIl1llI11IlII1Il() {
      return this.II1IIIIIII1lIlIl1;
   }

   public net.minecraft.util.math.Vec3d lllIl11IIIlIIlI1() {
      return net.minecraft.util.math.Vec3d.fromPolar(this.Il11IIlllIIII11ll1lI1I1II, this.I11IlIlIlIllI11lIIlll);
   }

   public floatHolder_6 StringHolder_8(floatHolder_6 il1ll111liili1ll11liil1, float f, float f1) {
      floatHolder_9 li11l1lilili1l = this.longHolder_6(il1ll111liili1ll11liil1);
      float f2 = li11l1lilili1l.III1IIII111l();
      float f3 = Math.abs(li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI() / f2) * f;
      float f4 = Math.abs(li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1() / f2) * f1;
      float f5 = MathHelper.clamp(li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI(), -f3, f3);
      float f6 = MathHelper.clamp(li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1(), -f4, f4);
      return new floatHolder_6(this.I11IlIlIlIllI11lIIlll + f5, this.Il11IIlllIIII11ll1lI1I1II + f6);
   }

   public boolean lI1lI1II1l() {
      return Float.isInfinite(this.I11IlIlIlIllI11lIIlll)
         || Float.isNaN(this.I11IlIlIlIllI11lIIlll)
         || Float.isInfinite(this.Il11IIlllIIII11ll1lI1I1II)
         || Float.isNaN(this.Il11IIlllIIII11ll1lI1I1II);
   }

   public static float III1III1l() {
      double d0 = (Double)net.minecraft.client.MinecraftClient.getInstance().options.getMouseSensitivity().getValue() * 0.6F + 0.2F;
      return (float)(d0 * d0 * d0 * 8.0 * 0.15F);
   }

   public floatHolder_6 ListHolder_6(floatHolder_6 il1ll111liili1ll11liil1) {
      if (!this.II1IIIIIII1lIlIl1 && !this.equals(il1ll111liili1ll11liil1)) {
         floatHolder_9 li11l1lilili1l = il1ll111liili1ll11liil1.longHolder_6(this);
         float f = III1III1l();
         if (!Float.isNaN(f) && !Float.isInfinite(f) && !(f <= 0.0F)) {
            float f1 = (float)Math.round(li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI() / f) * f;
            float f2 = (float)Math.round(li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1() / f) * f;
            return new floatHolder_6(il1ll111liili1ll11liil1.AutoBrewing() + f1, il1ll111liili1ll11liil1.Basefinder() + f2, true);
         } else {
            return this;
         }
      } else {
         return this;
      }
   }

   public floatHolder_6 longHolder_5(float f, float f1) {
      return new floatHolder_6(this.I11IlIlIlIllI11lIIlll + f, MathHelper.clamp(this.Il11IIlllIIII11ll1lI1I1II + f1, -90.0F, 90.0F));
   }

   public floatHolder_6 StringHolder_8(floatHolder_9 li11l1lilili1l) {
      return new floatHolder_6(
         this.I11IlIlIlIllI11lIIlll + li11l1lilili1l.IlI1ll1l11IlllI111lIlIll111llI(),
         MathHelper.clamp(this.Il11IIlllIIII11ll1lI1I1II + li11l1lilili1l.I1II1IlI1I1ll1l1I11I1ll1(), -90.0F, 90.0F)
      );
   }

   @Override
   public boolean equals(Object object) {
      return !(object instanceof floatHolder_6 il1ll111liili1ll11liil1)
         ? false
         : il1ll111liili1ll11liil1.I11IlIlIlIllI11lIIlll == this.I11IlIlIlIllI11lIIlll
            && il1ll111liili1ll11liil1.Il11IIlllIIII11ll1lI1I1II == this.Il11IIlllIIII11ll1lI1I1II;
   }

   public float AutoBrewing() {
      return this.I11IlIlIlIllI11lIIlll;
   }

   public float Basefinder() {
      return this.Il11IIlllIIII11ll1lI1I1II;
   }
}
