package ru.metaculture.protection;

public final class O0000O0O00 {
   public static final double O00000000 = 1.70158;
   public static final double O000000000 = 2.5949095;
   public static final double O0000000000 = 2.70158;
   public static final double O00000000000 = Math.PI * 2.0 / 3.0;
   public static final double O000000000000 = Math.PI * 4.0 / 9.0;
   public static final O0000O0O0 O0000000000000 = d -> d;
   public static final O0000O0O0 O000000000000O = O00000000(2);
   public static final O0000O0O0 O00000000000O = O000000000(2);
   public static final O0000O0O0 O00000000000O0 = O0000000000(2.0);
   public static final O0000O0O0 O00000000000OO = O00000000(3);
   public static final O0000O0O0 O0000000000O = O000000000(3);
   public static final O0000O0O0 O0000000000O0 = O0000000000(3.0);
   public static final O0000O0O0 O0000000000O00 = O00000000(4);
   public static final O0000O0O0 O0000000000O0O = O000000000(4);
   public static final O0000O0O0 O0000000000OO = O0000000000(4.0);
   public static final O0000O0O0 O0000000000OO0 = O00000000(5);
   public static final O0000O0O0 O0000000000OOO = O000000000(5);
   public static final O0000O0O0 O000000000O = O0000000000(5.0);
   public static final O0000O0O0 O000000000O0 = d -> 1.0 - Math.cos(d * Math.PI / 2.0);
   public static final O0000O0O0 O000000000O00 = d -> Math.sin(d * Math.PI / 2.0);
   public static final O0000O0O0 O000000000O000 = d -> -(Math.cos(Math.PI * d) - 1.0) / 2.0;
   public static final O0000O0O0 O000000000O00O = d -> 1.0 - Math.sqrt(1.0 - Math.pow(d, 2.0));
   public static final O0000O0O0 O000000000O0O = d -> Math.sqrt(1.0 - Math.pow(d - 1.0, 2.0));
   public static final O0000O0O0 O000000000O0O0 = d -> d < 0.5
      ? (1.0 - Math.sqrt(1.0 - Math.pow(2.0 * d, 2.0))) / 2.0
      : (Math.sqrt(1.0 - Math.pow(-2.0 * d + 2.0, 2.0)) + 1.0) / 2.0;
   public static final O0000O0O0 O000000000O0OO = d -> d != 0.0 && d != 1.0
      ? Math.pow(-2.0, 10.0 * d - 10.0) * Math.sin((d * 10.0 - 10.75) * (Math.PI * 2.0 / 3.0))
      : d;
   public static final O0000O0O0 O000000000OO = d -> d != 0.0 && d != 1.0
      ? Math.pow(2.0, -10.0 * d) * Math.sin((d * 10.0 - 0.75) * (Math.PI * 2.0 / 3.0)) + 1.0
      : d;
   public static final O0000O0O0 O000000000OO0 = d -> {
      if (d != 0.0 && d != 1.0) {
         return d < 0.5
            ? -(Math.pow(2.0, 20.0 * d - 10.0) * Math.sin((20.0 * d - 11.125) * (Math.PI * 4.0 / 9.0))) / 2.0
            : Math.pow(2.0, -20.0 * d + 10.0) * Math.sin((20.0 * d - 11.125) * (Math.PI * 4.0 / 9.0)) / 2.0 + 1.0;
      } else {
         return d;
      }
   };
   public static final O0000O0O0 O000000000OO00 = d -> d != 0.0 ? Math.pow(2.0, 10.0 * d - 10.0) : d;
   public static final O0000O0O0 O000000000OO0O = d -> d != 1.0 ? 1.0 - Math.pow(2.0, -10.0 * d) : d;
   public static final O0000O0O0 O000000000OOO = d -> {
      if (d != 0.0 && d != 1.0) {
         return d < 0.5 ? Math.pow(2.0, 20.0 * d - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * d + 10.0)) / 2.0;
      } else {
         return d;
      }
   };
   public static final O0000O0O0 O000000000OOO0 = d -> 2.70158 * Math.pow(d, 3.0) - 1.70158 * Math.pow(d, 2.0);
   public static final O0000O0O0 O000000000OOOO = d -> 1.0 + 2.70158 * Math.pow(d - 1.0, 3.0) + 1.70158 * Math.pow(d - 1.0, 2.0);
   public static final O0000O0O0 O00000000O = d -> d < 0.5
      ? Math.pow(2.0 * d, 2.0) * (7.189819 * d - 2.5949095) / 2.0
      : (Math.pow(2.0 * d - 2.0, 2.0) * (3.5949095 * (d * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0;
   public static final O0000O0O0 O00000000O0 = d -> {
      double var2 = 7.5625;
      double var4 = 2.75;
      if (d < 1.0 / var4) {
         return var2 * Math.pow(d, 2.0);
      } else if (d < 2.0 / var4) {
         return var2 * Math.pow(d - 1.5 / var4, 2.0) + 0.75;
      } else {
         return d < 2.5 / var4 ? var2 * Math.pow(d - 2.25 / var4, 2.0) + 0.9375 : var2 * Math.pow(d - 2.625 / var4, 2.0) + 0.984375;
      }
   };
   public static final O0000O0O0 O00000000O00 = d -> 1.0 - O00000000O0.ease(1.0 - d);
   public static final O0000O0O0 O00000000O000 = d -> d < 0.5 ? (1.0 - O00000000O0.ease(1.0 - 2.0 * d)) / 2.0 : (1.0 + O00000000O0.ease(2.0 * d - 1.0)) / 2.0;

   private O0000O0O00() {
   }

   public static O0000O0O0 O00000000(double d) {
      return e -> Math.pow(e, d);
   }

   public static O0000O0O0 O00000000(int i) {
      return O00000000((double)i);
   }

   public static O0000O0O0 O000000000(double d) {
      return e -> 1.0 - Math.pow(1.0 - e, d);
   }

   public static O0000O0O0 O000000000(int i) {
      return O000000000((double)i);
   }

   public static O0000O0O0 O0000000000(double d) {
      return e -> e < 0.5 ? Math.pow(2.0, d - 1.0) * Math.pow(e, d) : 1.0 - Math.pow(-2.0 * e + 2.0, d) / 2.0;
   }
}
