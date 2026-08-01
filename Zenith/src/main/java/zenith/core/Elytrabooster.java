package zenith;

import net.minecraft.util.math.MathHelper;

@ModuleInfo(
   name = "ElytraBooster",
   category = Category.MOVEMENT,
   description = "Усиливает ваш фейерверк"
)
public final class Elytrabooster extends Module {
   public static final Elytrabooster l1lllIl1IIllI1l1l11IlI = new Elytrabooster();

   public double Il11I1Il1lI11lllll1I1I1l() {
      float f = 1.5F;
      Elytratarget il1lll1ili11iii1 = Elytratarget.Il1I1IIIl11I1IIlI;
      int[] aint = new int[]{-45, 45, 135, (char)-135};
      int[] aint1 = new int[]{-90, 90, 180, (char)-180, 0};
      int[] aint2 = new int[]{-45, 45};
      float f1 = l11I1I1ll1Illll1I1l1111l1II.player.lastYaw;
      float f2 = l11I1I1ll1Illll1I1l1111l1II.player.lastPitch;
      int i = StringHolder_8(f1, aint);
      float f3 = Math.abs(MathHelper.wrapDegrees(f1) - (float)aint[i]);
      int j = StringHolder_8(f1, aint1);
      float f4 = Math.abs(MathHelper.wrapDegrees(f1) - (float)aint1[j]);
      f = 2.06F - f3 * 0.56F / 45.0F;
      if (f4 < 10.0F) {
         f += 0.1F - 0.1F * f4 / 10.0F;
      }

      int k = StringHolder_8(f2, aint2);
      float f5 = Math.abs(Math.abs(f2) - (float)Math.abs(aint2[k]));
      if (f5 < 26.0F) {
         f = Math.max(1.94F, f);
         f += 0.05F - f5 * 0.05F / 26.0F;
      }

      f = Math.min(2.045F, f);
      if (l11I1I1ll1Illll1I1l1111l1II.player.lastPitch > -55.0F && l11I1I1ll1Illll1I1l1111l1II.player.lastPitch < -19.0F) {
         f = 1.91F;
      } else if (l11I1I1ll1Illll1I1l1111l1II.player.lastPitch < -55.0F) {
         f = 1.54F;
      }

      if (l11I1I1ll1Illll1I1l1111l1II.player.lastPitch > 19.0F && l11I1I1ll1Illll1I1l1111l1II.player.lastPitch < 55.0F) {
         f = 1.8F;
      } else if (l11I1I1ll1Illll1I1l1111l1II.player.lastPitch > 55.0F) {
         f = 1.54F;
      }

      return (double)f;
   }

   private static int StringHolder_8(float f, int[] aint) {
      int i = 0;
      int j = -1;
      float f1 = Float.MAX_VALUE;

      for (int k : aint) {
         float f2 = Math.abs(MathHelper.wrapDegrees(f) - (float)k);
         if (f2 < f1) {
            f1 = f2;
            j = i;
         }

         i++;
      }

      return j;
   }
}
