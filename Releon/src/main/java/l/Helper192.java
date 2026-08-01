package l;

public class Helper192 {
   public static final double c1 = 1.70158;
   public static final double c2 = 2.5949095;
   public static final double c3 = 2.70158;
   public static final double c4 = Math.PI * 2.0 / 3.0;
   public static final double c5 = Math.PI * 4.0 / 9.0;
   public static final Helper191 SINE_IN = var0 -> (float)(1.0 - Math.cos(var0 * Math.PI / 2.0));
   public static final Helper191 SINE_OUT = var0 -> (float)Math.sin(var0 * Math.PI / 2.0);
   public static final Helper191 SINE_BOTH = var0 -> (float)(-(Math.cos(Math.PI * var0) - 1.0) / 2.0);
   public static final Helper191 CIRC_IN = var0 -> (float)(1.0 - Math.sqrt(1.0 - Math.pow(var0, 2.0)));
   public static final Helper191 CIRC_OUT = var0 -> (float)Math.sqrt(1.0 - Math.pow(var0 - 1.0, 2.0));
   public static final Helper191 CIRC_BOTH = var0 -> (float)(
      var0 < 0.5 ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * var0, 2.0))) / 2.0 : (Math.sqrt(1.0 - Math.pow(-2.0 * var0 + 2.0, 2.0)) + 1.0) / 2.0
   );
   public static final Helper191 ELASTIC_IN = var0 -> var0 != 0.0 && var0 != 1.0
      ? (float)(Math.pow(-2.0, 10.0 * var0 - 10.0) * Math.sin((var0 * 10.0 - 10.75) * (Math.PI * 2.0 / 3.0)))
      : var0;
   public static final Helper191 ELASTIC_OUT = var0 -> var0 != 0.0 && var0 != 1.0
      ? (float)(Math.pow(2.0, -10.0 * var0) * Math.sin((var0 * 10.0 - 0.75) * (Math.PI * 2.0 / 3.0)) + 1.0)
      : var0;
   public static final Helper191 ELASTIC_BOTH = var0 -> var0 != 0.0 && var0 != 1.0
      ? (float)(
         var0 < 0.5
            ? -(Math.pow(2.0, 20.0 * var0 - 10.0) * Math.sin((20.0 * var0 - 11.125) * (Math.PI * 4.0 / 9.0))) / 2.0
            : Math.pow(2.0, -20.0 * var0 + 10.0) * Math.sin((20.0 * var0 - 11.125) * (Math.PI * 4.0 / 9.0)) / 2.0 + 1.0
      )
      : var0;
   public static final Helper191 EXPO_IN = var0 -> var0 != 0.0 ? (float)Math.pow(2.0, 10.0 * var0 - 10.0) : var0;
   public static final Helper191 EXPO_OUT = var0 -> var0 != 1.0 ? (float)(1.0 - Math.pow(2.0, -10.0 * var0)) : var0;
   public static final Helper191 EXPO_BOTH = var0 -> var0 != 0.0 && var0 != 1.0
      ? (float)(var0 < 0.5 ? Math.pow(2.0, 20.0 * var0 - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * var0 + 10.0)) / 2.0)
      : var0;
   public static final Helper191 BACK_IN = var0 -> (float)(2.70158 * Math.pow(var0, 3.0) - 1.70158 * Math.pow(var0, 2.0));
   public static final Helper191 BACK_OUT = var0 -> (float)(1.0 + 2.70158 * Math.pow(var0 - 1.0, 3.0) + 1.70158 * Math.pow(var0 - 1.0, 2.0));
   public static final Helper191 NONE = var0 -> var0;
   public static final Helper191 BACK_BOTH = var0 -> (float)(
      var0 < 0.5
         ? Math.pow(2.0 * var0, 2.0) * (7.189819 * var0 - 2.5949095) / 2.0
         : (Math.pow(2.0 * var0 - 2.0, 2.0) * (3.5949095 * (var0 * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0
   );
   public static final Helper191 BOUNCE_OUT = var0 -> {
      float var1 = 7.5625F;
      float var2 = 2.75F;
      if (var0 < 1.0 / var2) {
         return (float)(var1 * Math.pow(var0, 2.0));
      } else {
         return var0 < 2.0 / var2
            ? (float)(var1 * Math.pow(var0 - 1.5 / var2, 2.0) + 0.75)
            : (float)(var0 < 2.5 / var2 ? var1 * Math.pow(var0 - 2.25 / var2, 2.0) + 0.9375 : var1 * Math.pow(var0 - 2.625 / var2, 2.0) + 0.984375);
      }
   };
   public static final Helper191 BOUNCE_IN = var0 -> (float)(1.0 - BOUNCE_OUT.ease((float)(1.0 - var0)));
   public static final Helper191 BOUNCE_BOTH = var0 -> (float)(
      var0 < 0.5 ? (1.0 - BOUNCE_OUT.ease((float)(1.0 - 2.0 * var0))) / 2.0 : (1.0 + BOUNCE_OUT.ease((float)(2.0 * var0 - 1.0))) / 2.0
   );
   public static final Helper191 QUINT_IN = var0 -> var0 < 0.5
      ? 16.0F * var0 * var0 * var0 * var0 * var0
      : (float)(1.0 - Math.pow(-2.0F * var0 + 2.0F, 5.0) / 2.0);

   public Helper192() {
   }
}
