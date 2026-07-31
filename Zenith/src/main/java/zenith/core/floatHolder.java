package zenith;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.util.math.MathHelper;

public final class floatHolder implements ZenithInternal076 {
   private static floatHolder_6 I1lIllII1lllI1l1II11I11;
   private static float lIl11Ill1111111l1llII11lllI;
   private static float IIl1Il1llI11l11I;
   private static float I1IIIlIIl1IllIlll1lIlllIII1I1 = 1.0F;
   private static float l11l11lIlII1l = 1.0F;
   private static float Il1lIIIl1IlI;
   private static float IllIIl111lllIIIll1IIl11I1I1;
   private static float Ill1IlllIIIl1Ill1l1l1;
   private static float I1IIIlII11;
   private static int ll1llI1l1;

   public static floatHolder_6 StringHolder_5(floatHolder_6 il1ll111liili1ll11liil) {
      return StringHolder_8(il1ll111liili1ll11liil, 34.0F, 18.0F, 0.55F);
   }

   public static void reset() {
      I1lIllII1lllI1l1II11I11 = null;
      lIl11Ill1111111l1llII11lllI = 0.0F;
      IIl1Il1llI11l11I = 0.0F;
      I1IIIlIIl1IllIlll1lIlllIII1I1 = 1.0F;
      l11l11lIlII1l = 1.0F;
      Il1lIIIl1IlI = 0.0F;
      IllIIl111lllIIIll1IIl11I1I1 = 0.0F;
      Ill1IlllIIIl1Ill1l1l1 = 0.0F;
      I1IIIlII11 = 0.0F;
      ll1llI1l1 = 0;
   }

   private static void l11l1ll111() {
      if (ll1llI1l1-- <= 0) {
         ll1llI1l1 = ByteBufferHolder_2(3, 9);
         I1IIIlIIl1IllIlll1lIlllIII1I1 = ConnectThread(0.86F, 1.18F);
         l11l11lIlII1l = ConnectThread(0.82F, 1.08F);
         Il1lIIIl1IlI = ZenithInternal148(0.18F);
         IllIIl111lllIIIll1IIl11I1I1 = ZenithInternal148(0.11F);
      }
   }

   private static float EventImpl_21(float f, float f1, float f2) {
      float f3 = Math.signum(f);
      float f4 = 0.0F;
      if (Math.abs(f) > 8.0F) {
         f4 = MathHelper.clamp(f * ConnectThread(0.01F, 0.035F), -1.15F, 1.15F);
      }

      return f4 + f1 * f2 + f3 * ConnectThread(0.0F, 0.018F) * f2;
   }

   private static float EventImpl_13(float f, float f1, float f2) {
      return !(f2 > 2.0F) && Math.signum(f) != Math.signum(f1) ? f * ConnectThread(0.35F, 0.7F) : f;
   }

   public static floatHolder_6 StringHolder_8(floatHolder_6 il1ll111liili1ll11liil, float f, float f1, float f2) {
      floatHolder_6 il1ll111liili1ll11liil1 = I1lIllII1lllI1l1II11I11 == null ? ZenithInternal131.ll1II1l1lII11IlII1() : I1lIllII1lllI1l1II11I11;
      floatHolder_6 il1ll111liili1ll11liil2 = StringHolder_8(il1ll111liili1ll11liil1, il1ll111liili1ll11liil, f, f1, f2);
      I1lIllII1lllI1l1II11I11 = il1ll111liili1ll11liil2;
      return il1ll111liili1ll11liil2;
   }

   public static floatHolder_6 StringHolder_8(
      floatHolder_6 il1ll111liili1ll11liil, floatHolder_6 il1ll111liili1ll11liil1, float f, float f1, float f2
   ) {
      l11l1ll111();
      float f3 = MathHelper.wrapDegrees(il1ll111liili1ll11liil1.AutoBrewing() - il1ll111liili1ll11liil.AutoBrewing());
      float f4 = il1ll111liili1ll11liil1.Basefinder() - il1ll111liili1ll11liil.Basefinder();
      float f5 = (float)Math.hypot((double)f3, (double)f4);
      float f6 = MathHelper.clamp(f5 / 12.0F, 0.0F, 1.0F);
      float f7 = MathHelper.clamp(f5 / 45.0F, 0.18F, 1.0F);
      ZenithInternal023(f6);
      float f8 = MathHelper.clamp(f2 * l11l11lIlII1l, 0.08F, 0.95F);
      float f9 = ZenithInternal070(f3, f * I1IIIlIIl1IllIlll1lIlllIII1I1, f8, f7);
      float f10 = ZenithInternal070(f4, f1 * I1IIIlIIl1IllIlll1lIlllIII1I1, f8, f7);
      float f11 = EventImpl_21(f3, Il1lIIIl1IlI + Ill1IlllIIIl1Ill1l1l1, f6);
      float f12 = EventImpl_21(f4, IllIIl111lllIIIll1IIl11I1I1 + I1IIIlII11, f6);
      float f13 = MathHelper.clamp(f3 + f11, -f9, f9);
      float f14 = MathHelper.clamp(f4 + f12, -f10, f10);
      lIl11Ill1111111l1llII11lllI = MathHelper.lerp(f8, lIl11Ill1111111l1llII11lllI, f13);
      IIl1Il1llI11l11I = MathHelper.lerp(f8, IIl1Il1llI11l11I, f14);
      lIl11Ill1111111l1llII11lllI = EventImpl_13(lIl11Ill1111111l1llII11lllI, f3, f5);
      IIl1Il1llI11l11I = EventImpl_13(IIl1Il1llI11l11I, f4, f5);
      floatHolder_6 il1ll111liili1ll11liil2 = il1ll111liili1ll11liil.hasTimeElapsed(lIl11Ill1111111l1llII11lllI, IIl1Il1llI11l11I);
      return il1ll111liili1ll11liil2.ListHolder_6(il1ll111liili1ll11liil);
   }

   public static void longHolder_3(floatHolder_6 il1ll111liili1ll11liil) {
      if (l11I1I1ll1Illll1I1l1111l1II.player != null && il1ll111liili1ll11liil != null) {
         l11I1I1ll1Illll1I1l1111l1II.player.setYaw(il1ll111liili1ll11liil.AutoBrewing());
         l11I1I1ll1Illll1I1l1111l1II.player.setPitch(il1ll111liili1ll11liil.Basefinder());
      }
   }

   private static void ZenithInternal023(float f) {
      float f1 = 0.025F + f * 0.08F;
      Ill1IlllIIIl1Ill1l1l1 = MathHelper.lerp(0.22F, Ill1IlllIIIl1Ill1l1l1, ZenithInternal148(f1));
      I1IIIlII11 = MathHelper.lerp(0.22F, I1IIIlII11, ZenithInternal148(f1 * 0.65F));
   }

   private static float ZenithInternal070(float f, float f1, float f2, float f3) {
      float f4 = Math.abs(f);
      float f5 = Math.max(0.1F, f1);
      float f6 = MathHelper.clamp(f4 / 35.0F, 0.22F, 1.0F);
      float f7 = 0.72F + f3 * ConnectThread(0.22F, 0.38F);
      return Math.max(floatHolder_6.III1III1l(), f5 * f6 * f2 * f7);
   }

   private static int ByteBufferHolder_2(int i, int j) {
      return ThreadLocalRandom.current().nextInt(i, j + 1);
   }

   private static float ConnectThread(float f, float f1) {
      return (float)ThreadLocalRandom.current().nextDouble((double)f, (double)f1);
   }

   private static float ZenithInternal148(float f) {
      return ConnectThread(-f, f);
   }

   public static floatHolder_6 StringHolder_5(net.minecraft.util.math.Vec3d Vec3d) {
      return StringHolder_5(ZenithInternal131.longHolder_6(Vec3d));
   }

   private floatHolder() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
