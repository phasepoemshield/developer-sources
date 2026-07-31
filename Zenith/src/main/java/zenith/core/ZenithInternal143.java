package zenith;

import net.minecraft.client.util.math.Vector2f;

public final class ZenithInternal143 implements ZenithInternal076 {
   public static boolean StringHolder_8(double d0, double d1, double d2, double d3, int i, int j) {
      return (double)i >= d0 && (double)i < d0 + d2 && (double)j >= d1 && (double)j < d1 + d3;
   }

   public static boolean StringHolder_8(double d0, double d1, double d2, double d3, floatHolder_4 iiii1ilili1l1l1lilli1liliii) {
      return StringHolder_8(d0, d1, d2, d3, iiii1ilili1l1l1lilli1liliii.l111IIlIl1l1(), iiii1ilili1l1l1lilli1liliii.Ill1lI1III1());
   }

   public static boolean StringHolder_8(double d0, double d1, double d2, double d3, double d4, double d5) {
      return d4 >= d0 && d4 < d0 + d2 && d5 >= d1 && d5 < d1 + d3;
   }

   public static Vector2f ZenithInternal064(double d0) {
      return new Vector2f(
         (float)(l11I1I1ll1Illll1I1l1111l1II.mouse.getX() / d0), (float)(l11I1I1ll1Illll1I1l1111l1II.mouse.getY() / d0)
      );
   }

   private ZenithInternal143() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }
}
