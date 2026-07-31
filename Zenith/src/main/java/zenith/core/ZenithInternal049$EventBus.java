package zenith;

import zenith.hud.*;

public class ZenithInternal049$EventBus extends floatHolder$Helper {
   public ZenithInternal049$EventBus() {
   }

   public ZenithInternal049$EventBus(float f) {
      super(f);
   }

   @Override
   public float ease(float f, float f1, float f2, float f3) {
      float f4 = this.Inventory();
      float f5;
      return f2 * (f5 = f / f3) * f5 * ((f4 + 1.0F) * f5 - f4) + f1;
   }
}
