package org.zenith.core;

import org.zenith.event.Event20;

public class EaseLinearStep extends EaseBase {
   public EaseLinearStep() {
   }

   public EaseLinearStep(float var1) {
      super(var1);
   }

   @Override
   public float ease(float var1, float var2, float var3, float var4) {
      float f = this.Event20();
      float f1;
      return var3 * (f1 = var1 / var4) * f1 * ((f + 1.0F) * f1 - f) + var2;
   }
}
