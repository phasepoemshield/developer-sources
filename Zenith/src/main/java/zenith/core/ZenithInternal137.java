package zenith;

import net.minecraft.util.math.MathHelper;

public class ZenithInternal137 extends ZenithInternal057 {
   float[] values = new float[]{0.0123967F, 0.053719F, 0.109504F, 0.17562F, 0.21281F, 0.272727F, 0.11157F, 0.0392562F, 0.0103306F, 0.00206612F};
   int index = 0;

   public floatHolder_6 EventTarget(floatHolder_6 il1ll111liili1ll11liil) {
      if (this.values == null) {
         this.values = new float[]{0.0123967F, 0.053719F, 0.109504F, 0.17562F, 0.21281F, 0.272727F, 0.11157F, 0.0392562F, 0.0103306F, 0.00206612F};
      }

      float f = this.values[this.index] * 2.0F;
      this.index++;
      if (this.index >= this.values.length) {
         this.index = 0;
      }

      floatHolder_6 il1ll111liili1ll11liil1 = II1ll1II1l11lI.ll1ll1l11l1lllIIIIl1();
      floatHolder_9 li11l1lilili1l = new floatHolder_9(
         MathHelper.wrapDegrees(il1ll111liili1ll11liil.AutoBrewing() - il1ll111liili1ll11liil1.AutoBrewing()) * f,
         (il1ll111liili1ll11liil.Basefinder() - il1ll111liili1ll11liil1.Basefinder()) * f
      );
      return il1ll111liili1ll11liil1.StringHolder_8(li11l1lilili1l);
   }
}
