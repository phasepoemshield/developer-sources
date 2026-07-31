package zenith;

import zenith.hud.*;

public class ZenithInternal050$EventTarget extends floatHolder$Helper {
   public ZenithInternal050$EventTarget() {
   }

   public ZenithInternal050$EventTarget(float f) {
      super(f);
   }

   @Override
   public float ease(float f, float f1, float f2, float f3) {
      float f4 = this.Inventory();
      float f5;
      float f6;
      float f7;
      float f8;
      return (f5 = f / (f3 / 2.0F)) < 1.0F
         ? f2 / 2.0F * f5 * f5 * (((f7 = f4 * 1.525F) + 1.0F) * f5 - f7) + f1
         : f2 / 2.0F * ((f6 = f5 - 2.0F) * f6 * (((f8 = f4 * 1.525F) + 1.0F) * f6 + f8) + 2.0F) + f1;
   }
}
