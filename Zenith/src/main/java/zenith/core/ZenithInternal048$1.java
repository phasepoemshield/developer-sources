package zenith;

class ZenithInternal048$1 implements IReturn {
   ZenithInternal048$1(double d0, double d1, double d2, double d3) {
      this.MinecraftClientHolder_2 = d0;
      this.SetColorHandler_2 = d1;
      this.SetColorHandler = d2;
      this.MinecraftClientHolder = d3;
   }

   @Override
   public float ease(float f, float f1, float f2, float f3) {
      if (f3 <= 0.0F || f <= 0.0F) {
         return f1;
      } else if (f >= f3) {
         return f1 + f2;
      } else {
         float f4 = f / f3;
         float f5 = this.StringHolder_8((float)this.MinecraftClientHolder_2, (float)this.SetColorHandler_2, f4);
         float f6 = this.ZenithInternal095(f5, (float)this.SetColorHandler, (float)this.MinecraftClientHolder);
         return f1 + f2 * f6;
      }
   }

   private float StringHolder_8(float f, float f1, float f2) {
      float f3 = f2;
      byte b0 = 8;
      float f4 = 1.0E-5F;

      for (int i = 0; i < 8; i++) {
         float f5 = this.EventBus(f3, f, f1);
         float f6 = this.EventTarget(f3, f, f1);
         if (Math.abs(f5 - f2) < 1.0E-5F || Math.abs(f6) < 1.0E-6F) {
            break;
         }

         f3 -= (f5 - f2) / f6;
         f3 = Math.max(0.0F, Math.min(1.0F, f3));
      }

      return f3;
   }

   private float EventBus(float f, float f1, float f2) {
      return 3.0F * (1.0F - f) * (1.0F - f) * f * f1 + 3.0F * (1.0F - f) * f * f * f2 + f * f * f;
   }

   private float EventTarget(float f, float f1, float f2) {
      return 3.0F * ((1.0F - f) * (1.0F - 3.0F * f) * f1 + (2.0F * f - 3.0F * f * f) * f2) + 3.0F * f * f;
   }

   private float ZenithInternal095(float f, float f1, float f2) {
      return 3.0F * (1.0F - f) * (1.0F - f) * f * f1 + 3.0F * (1.0F - f) * f * f * f2 + f * f * f;
   }
}
