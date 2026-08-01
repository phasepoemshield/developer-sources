package zenith;

import zenith.hud.*;

public class ZenithInternal053$Helper extends floatHolder$Event {
   public ZenithInternal053$Helper(float f, float f1) {
      super(f, f1);
   }

   public ZenithInternal053$Helper() {
   }

   @Override
   public float ease(float f, float f1, float f2, float f3) {
      float f4 = this.ItemBinds();
      float f5 = this.Keybinds();
      if (f == 0.0F) {
         return f1;
      } else if ((f = f / f3) == 1.0F) {
         return f1 + f2;
      } else {
         if (f5 == 0.0F) {
            f5 = f3 * 0.3F;
         }

         float f6 = 0.0F;
         if (f4 < Math.abs(f2)) {
            f4 = f2;
            f6 = f5 / 4.0F;
         } else {
            f6 = f5 / (float) (Math.PI * 2) * (float)Math.asin((double)(f2 / f4));
         }

         return -(f4 * (float)Math.pow(2.0, (double)(10.0F * --f)) * (float)doubleHolder_3.getPlayerMarkerPacket((double)(f * f3 - f6) * (Math.PI * 2) / (double)f5)) + f1;
      }
   }
}
