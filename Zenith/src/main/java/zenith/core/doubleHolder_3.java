package zenith;

import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.entity.Entity;
import net.minecraft.util.math.MathHelper;
import org.joml.Vector3d;

public final class doubleHolder_3 implements ZenithInternal076 {
   public static double l1lIIIllIlI1lI11I1IIIl111I = Math.PI * 2;
   private static final int Il11I11IIIl11l1I1 = 65536;
   private static final double llllI11l1lI1IlIIllI11I = Math.PI * 2;
   private static final double[] I11llIllllIlI1Ill1lI1IlIl1l;

   private doubleHolder_3() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   public static net.minecraft.util.math.Vec3d ZenithInternal021(Entity Entity) {
      return Entity == null
         ? net.minecraft.util.math.Vec3d.ZERO
         : new net.minecraft.util.math.Vec3d(
            byteHolder_2(Entity.prevX, Entity.getX()),
            byteHolder_2(Entity.prevY, Entity.getY()),
            byteHolder_2(Entity.prevZ, Entity.getZ())
         );
   }

   public static float ZenithInternal084(float f, float f1) {
      return MathHelper.lerp(l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getTickDelta(false), f, f1);
   }

   public static double byteHolder_2(double d0, double d1) {
      return MathHelper.lerp((double)l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getTickDelta(false), d0, d1);
   }

   public static int StringHolder_8(double d0, int i, int j) {
      return (int)MathHelper.lerp((double)l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getLastDuration() / d0, (double)i, (double)j);
   }

   public static float StringHolder_8(double d0, float f, float f1) {
      return (float)MathHelper.lerp((double)l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getLastDuration() / d0, (double)f, (double)f1);
   }

   public static double EventImpl_13(double d0, double d1, double d2) {
      return MathHelper.lerp((double)l11I1I1ll1Illll1I1l1111l1II.getRenderTickCounter().getLastDuration() / d0, d1, d2);
   }

   public static double byteHolder_2(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      double d0 = Vec3d.getX() - Vec3dx.getX();
      double d1 = Vec3d.getY() - Vec3dx.getY();
      double d2 = Vec3d.getZ() - Vec3dx.getZ();
      return (double)MathHelper.sqrt((float)(d0 * d0 + d1 * d1 + d2 * d2));
   }

   public static double CallableImpl(double d0) {
      return Math.abs(1.0 + Math.sin(d0)) / 2.0;
   }

   public static float StringHolder_10(float f) {
      return (float)Math.sin((double)f * Math.PI / 2.0);
   }

   // $VF: renamed from: sin (double) double
   public static double getPlayerMarkerPacket(double d0) {
      int i = (int)(d0 * 10430.378350470453) & 65535;
      return I11llIllllIlI1Ill1lI1IlIl1l[i];
   }

   // $VF: renamed from: cos (double) double
   public static double getPlayerSyncData(double d0) {
      int i = (int)(d0 * 10430.378350470453 + 16384.0) & 65535;
      return I11llIllllIlI1Ill1lI1IlIl1l[i];
   }

   public static float byteHolder_2(float f, float f1, float f2) {
      float f3 = Math.min(f2 / f1, 1.0F);
      return f * (1.0F + f3 * f3 * 0.5F);
   }

   public static float ZenithInternal028(double d0, double d1) {
      return (float)(d0 + (d1 - d0) * Math.random());
   }

   public static double StringHolder_8(double d0, double d1, double d2, double d3, double d4) {
      return Math.pow(1.0 - d0, 3.0) * d1 + 3.0 * d0 * Math.pow(1.0 - d0, 2.0) * d2 + 3.0 * Math.pow(d0, 2.0) * (1.0 - d0) * d3 + Math.pow(d0, 3.0) * d4;
   }

   public static int longHolder_7(String s, String s1) {
      int i = s.length();
      int j = s1.length();
      int[] aint = new int[j + 1];
      int k = 0;

      while (k <= j) {
         aint[k] = k++;
      }

      for (int l1 = 1; l1 <= i; l1++) {
         int l = aint[0];
         aint[0] = l1;

         for (int i1 = 1; i1 <= j; i1++) {
            int j1 = aint[i1];
            int k1 = s.charAt(l1 - 1) == s1.charAt(i1 - 1) ? 0 : 1;
            aint[i1] = Math.min(Math.min(aint[i1] + 1, aint[i1 - 1] + 1), l + k1);
            l = j1;
         }
      }

      return aint[j];
   }

   public static float CallableImpl(float f, float f1) {
      float f2 = (f - f1) % 360.0F;
      if (f2 < -180.0F) {
         f2 += 360.0F;
      } else if (f2 > 180.0F) {
         f2 -= 360.0F;
      }

      return f2;
   }

   public static boolean StringHolder_8(double d0, double d1, double d2, double d3, double d4, double d5) {
      return d0 >= d2 && d0 <= d2 + d4 && d1 >= d3 && d1 <= d3 + d5;
   }

   public static boolean StringHolder_8(double d0, double d1, int i, int j, int k, int l) {
      return d0 >= (double)i && d0 <= (double)k && d1 >= (double)j && d1 <= (double)l;
   }

   public static float EventImpl_21(double d0, double d1, double d2) {
      return (float)(d0 + (d1 - d0) * d2);
   }

   public static float ZenithInternal101(float f, float f1) {
      return Math.max(f, f1) - Math.min(f, f1);
   }

   public static double EventImpl_21(double d0, double d1) {
      if (d0 == d1) {
         return d0;
      } else {
         if (d0 > d1) {
            double d2 = d0;
            d0 = d1;
            d1 = d2;
         }

         return ThreadLocalRandom.current().nextDouble() * (d1 - d0) + d0;
      }
   }

   public static double round(double d0) {
      return (double)((float)Math.round(d0 * 10.0) / 10.0F);
   }

   public static float round(float f) {
      return (float)Math.round(f * 10.0F) / 10.0F;
   }

   public static double EventImpl_13(double d0, double d1) {
      double d2 = (double)Math.round(d0 / d1) * d1;
      return (double)Math.round(d2 * 100.0) / 100.0;
   }

   public static net.minecraft.util.math.Vec3d StringHolder_8(float f, float f1, double d0) {
      float f2 = Math.min(f, f1);
      float f3 = (float)(Math.cos((double)f2 * l1lIIIllIlI1lI11I1IIIl111I / (double)f1) * d0);
      float f4 = (float)(-Math.sin((double)f2 * l1lIIIllIlI1lI11I1IIIl111I / (double)f1) * d0);
      return new net.minecraft.util.math.Vec3d((double)f3, 0.0, (double)f4);
   }

   public static Vector3d StringHolder_8(Vector3d vector3d, Vector3d vector3d1) {
      return new Vector3d(byteHolder_2(vector3d.x, vector3d1.x), byteHolder_2(vector3d.y, vector3d1.y), byteHolder_2(vector3d.z, vector3d1.z));
   }

   public static net.minecraft.util.math.Vec3d EventImpl_13(net.minecraft.util.math.Vec3d Vec3d, net.minecraft.util.math.Vec3d Vec3d) {
      return new net.minecraft.util.math.Vec3d(
         byteHolder_2(Vec3d.x, Vec3dx.x),
         byteHolder_2(Vec3d.y, Vec3dx.y),
         byteHolder_2(Vec3d.z, Vec3dx.z)
      );
   }

   static {
      double[] adouble = new double[65536];

      for (int i = 0; i < 65536; i++) {
         adouble[i] = Math.sin((double)i * 9.587379924285257E-5);
      }

      I11llIllllIlI1Ill1lI1IlIl1l = adouble;
   }
}
