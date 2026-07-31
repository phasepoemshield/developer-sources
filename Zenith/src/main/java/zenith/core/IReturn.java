package zenith;

public interface IReturn {
   IReturn SecureRandomHolder = new ZenithInternal048$1(0.45F, 0.49F, 1.45F, 1.15F);
   IReturn ZenithInternal032 = new ZenithInternal048$1(0.45F, 0.43F, 1.45F, 0.91F);
   IReturn ZenithInternal001 = new ZenithInternal048$1(0.1F, 0.34F, 1.07F, 1.04F);
   IReturn StringHolder_9 = new ZenithInternal048$1(0.27F, 0.49F, 1.09F, 1.06F);
   IReturn ZenithInternal120 = new ZenithInternal048$1(0.62, 0.8, -0.16, 0.37);
   IReturn TextHolder = new ZenithInternal048$1(0.25, 0.11, 1.07, 1.1);
   IReturn ZenithInternal068 = new ZenithInternal048$1(0.42, 0.58, 0.0, 1.0);
   IReturn ZenithInternal147 = (f, f1, f2, f3) -> {
      float f4 = f2 * f / f3 + f1;
      return (float)(-2.0 * Math.pow((double)f4, 3.0) + 3.0 * Math.pow((double)f4, 2.0));
   };
   IReturn StringHolder_21 = (f, f1, f2, f3) -> {
      float f4 = f2 * f / f3 + f1;
      return (double)f4 < 0.5 ? 4.0F * f4 * f4 * f4 : (float)(1.0 - Math.pow((double)(-2.0F * f4 + 2.0F), 3.0) / 2.0);
   };
   IReturn ScreenImpl = (f, f1, f2, f3) -> f2 * f / f3 + f1;
   IReturn ZenithInternal047 = (f, f1, f2, f3) -> {
      float f4;
      return f2 * (f4 = f / f3) * f4 + f1;
   };
   IReturn ZenithInternal066 = (f, f1, f2, f3) -> {
      float f4;
      return -f2 * (f4 = f / f3) * (f4 - 2.0F) + f1;
   };
   IReturn ListHolder_8 = (f, f1, f2, f3) -> {
      float f4;
      return (f4 = f / (f3 / 2.0F)) < 1.0F ? f2 / 2.0F * f4 * f4 + f1 : -f2 / 2.0F * (--f4 * (f4 - 2.0F) - 1.0F) + f1;
   };
   IReturn ListHolder_5 = (f, f1, f2, f3) -> {
      float f4;
      return f2 * (f4 = f / f3) * f4 * f4 + f1;
   };
   IReturn doubleHolder_4 = (f, f1, f2, f3) -> {
      float f4;
      return f2 * ((f4 = f / f3 - 1.0F) * f4 * f4 + 1.0F) + f1;
   };
   IReturn ZenithInternal088 = (f, f1, f2, f3) -> {
      float f4;
      float f5;
      return (f4 = f / (f3 / 2.0F)) < 1.0F ? f2 / 2.0F * f4 * f4 * f4 + f1 : f2 / 2.0F * ((f5 = f4 - 2.0F) * f5 * f5 + 2.0F) + f1;
   };
   IReturn TimerUtilHolder = (f, f1, f2, f3) -> {
      float f4;
      return f2 * (f4 = f / f3) * f4 * f4 * f4 + f1;
   };
   IReturn ZenithInternal022 = (f, f1, f2, f3) -> {
      float f4;
      return -f2 * ((f4 = f / f3 - 1.0F) * f4 * f4 * f4 - 1.0F) + f1;
   };
   IReturn PlayerEntityHolder = (f, f1, f2, f3) -> {
      float f4;
      float f5;
      return (f4 = f / (f3 / 2.0F)) < 1.0F ? f2 / 2.0F * f4 * f4 * f4 * f4 + f1 : -f2 / 2.0F * ((f5 = f4 - 2.0F) * f5 * f5 * f5 - 2.0F) + f1;
   };
   IReturn LivingEntityHolder = (f, f1, f2, f3) -> {
      float f4;
      return f2 * (f4 = f / f3) * f4 * f4 * f4 * f4 + f1;
   };
   IReturn floatHolder = (f, f1, f2, f3) -> {
      float f4;
      return f2 * ((f4 = f / f3 - 1.0F) * f4 * f4 * f4 * f4 + 1.0F) + f1;
   };
   IReturn floatHolder_6 = (f, f1, f2, f3) -> {
      float f4;
      float f5;
      return (f4 = f / (f3 / 2.0F)) < 1.0F ? f2 / 2.0F * f4 * f4 * f4 * f4 * f4 + f1 : f2 / 2.0F * ((f5 = f4 - 2.0F) * f5 * f5 * f5 * f5 + 2.0F) + f1;
   };
   IReturn floatHolder_9 = (f, f1, f2, f3) -> -f2 * (float)zenith.doubleHolder_3.getPlayerSyncData((double)(f / f3) * (Math.PI / 2)) + f2 + f1;
   IReturn ZenithInternal131 = (f, f1, f2, f3) -> f2 * (float)zenith.doubleHolder_3.getPlayerMarkerPacket((double)(f / f3) * (Math.PI / 2)) + f1;
   IReturn PatternHolder_2 = (f, f1, f2, f3) -> -f2
            / 2.0F
            * ((float)zenith.doubleHolder_3.getPlayerSyncData(Math.PI * (double)f / (double)f3) - 1.0F)
         + f1;
   IReturn StringHolder_25 = (f, f1, f2, f3) -> f == 0.0F ? f1 : f2 * (float)Math.pow(2.0, (double)(10.0F * (f / f3 - 1.0F))) + f1;
   IReturn ZenithInternal135 = (f, f1, f2, f3) -> f == f3 ? f1 + f2 : f2 * (-((float)Math.pow(2.0, (double)(-10.0F * f / f3))) + 1.0F) + f1;
   IReturn ZenithInternal140 = (f, f1, f2, f3) -> {
      if (f == 0.0F) {
         return f1;
      } else if (f == f3) {
         return f1 + f2;
      } else {
         float f4;
         return (f4 = f / (f3 / 2.0F)) < 1.0F
            ? f2 / 2.0F * (float)Math.pow(2.0, (double)(10.0F * (f4 - 1.0F))) + f1
            : f2 / 2.0F * (-((float)Math.pow(2.0, (double)(-10.0F * --f4))) + 2.0F) + f1;
      }
   };
   IReturn ZenithInternal076 = (f, f1, f2, f3) -> {
      float f4;
      return -f2 * ((float)Math.sqrt((double)(1.0F - (f4 = f / f3) * f4)) - 1.0F) + f1;
   };
   IReturn ZenithInternal151 = (f, f1, f2, f3) -> {
      float f4;
      return f2 * (float)Math.sqrt((double)(1.0F - (f4 = f / f3 - 1.0F) * f4)) + f1;
   };
   IReturn ZenithInternal089 = (f, f1, f2, f3) -> {
      float f4;
      float f5;
      return (f4 = f / (f3 / 2.0F)) < 1.0F
         ? -f2 / 2.0F * ((float)Math.sqrt((double)(1.0F - f4 * f4)) - 1.0F) + f1
         : f2 / 2.0F * ((float)Math.sqrt((double)(1.0F - (f5 = f4 - 2.0F) * f5)) + 1.0F) + f1;
   };
   floatHolder$Event ZenithInternal083 = new ZenithInternal053$Helper();
   floatHolder$Event ZenithInternal037 = new ZenithInternal052$Helper();
   floatHolder$Event RandomHolder = new ZenithInternal051$Helper();
   floatHolder$Helper doubleHolder_3 = new ZenithInternal049$EventBus();
   floatHolder$Helper ZenithInternal094 = new ZenithInternal054$Helper();
   floatHolder$Helper ZenithInternal091 = new ZenithInternal050$EventTarget();
   IReturn TimerUtil = (f, f1, f2, f3) -> {
      if ((f = f / f3) < 0.36363637F) {
         return f2 * 7.5625F * f * f + f1;
      } else if (f < 0.72727275F) {
         float f6;
         return f2 * (7.5625F * (f6 = f - 0.54545456F) * f6 + 0.75F) + f1;
      } else {
         float f4;
         float f5;
         return f < 0.90909094F ? f2 * (7.5625F * (f4 = f - 0.8181818F) * f4 + 0.9375F) + f1 : f2 * (7.5625F * (f5 = f - 0.95454544F) * f5 + 0.984375F) + f1;
      }
   };
   IReturn longHolder = (f, f1, f2, f3) -> f2 - TimerUtil.ease(f3 - f, 0.0F, f2, f3) + f1;
   IReturn booleanHolder_5 = (f, f1, f2, f3) -> f < f3 / 2.0F
         ? longHolder.ease(f * 2.0F, 0.0F, f2, f3) * 0.5F + f1
         : TimerUtil.ease(f * 2.0F - f3, 0.0F, f2, f3) * 0.5F + f2 * 0.5F + f1;

   static IReturn StringHolder_8(double d0, double d1, double d2, double d3) {
      return new ZenithInternal048$1(d0, d2, d1, d3);
   }

   float ease(float f, float f1, float f2, float f3);
}
