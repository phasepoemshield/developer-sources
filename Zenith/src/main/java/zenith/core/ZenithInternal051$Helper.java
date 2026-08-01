package zenith;

import zenith.hud.*;

public class ZenithInternal051$Helper extends floatHolder$Event {
   public ZenithInternal051$Helper(float f, float f1) {
      super(f, f1);
   }

   public ZenithInternal051$Helper() {
   }

   @Override
   public float ease(float f, float f1, float f2, float f3) {
      float f4 = this.ItemBinds();
      float f5 = this.Keybinds();
      if (f == 0.0F) {
         return f1;
      } else if ((f = f / (f3 / 2.0F)) == 2.0F) {
         return f1 + f2;
      } else {
         if (f5 == 0.0F) {
            f5 = f3 * 0.45000002F;
         }

         float f6 = 0.0F;
         if (f4 < Math.abs(f2)) {
            f4 = f2;
            f6 = f5 / 4.0F;
         } else {
            f6 = f5 / (float) (Math.PI * 2) * (float)Math.asin((double)(f2 / f4));
         }

         return f < 1.0F
            ? -0.5F * f4 * (float)Math.pow(2.0, (double)(10.0F * --f)) * (float)doubleHolder_3.getPlayerMarkerPacket((double)(f * f3 - f6) * (Math.PI * 2) / (double)f5)
               + f1
            : f4 * (float)Math.pow(2.0, (double)(-10.0F * --f)) * (float)doubleHolder_3.getPlayerMarkerPacket((double)(f * f3 - f6) * (Math.PI * 2) / (double)f5) * 0.5F
               + f2
               + f1;
      }
   }
}
