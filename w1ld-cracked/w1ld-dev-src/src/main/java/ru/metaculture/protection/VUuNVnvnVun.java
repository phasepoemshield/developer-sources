package ru.metaculture.protection;

import java.util.function.Function;

public enum VUuNVnvnVun {
   LINEAR(var0 -> var0),
   SIGMOID(var0 -> 1.0 / (1.0 + Math.exp(-var0))),
   EASE_IN_QUAD(var0 -> var0 * var0),
   EASE_OUT_QUAD(var0 -> var0 * (2.0 - var0)),
   EASE_IN_OUT_QUAD(var0 -> var0 < 0.5 ? 2.0 * var0 * var0 : -1.0 + (4.0 - 2.0 * var0) * var0),
   EASE_IN_CUBIC(var0 -> var0 * var0 * var0),
   EASE_OUT_CUBIC(var0 -> {
      Double var1;
      return var1 = var0 - 1.0 * var1 * var1 + 1.0;
   }),
   EASE_IN_OUT_CUBIC(var0 -> var0 < 0.5 ? 4.0 * var0 * var0 * var0 : (var0 - 1.0) * (2.0 * var0 - 2.0) * (2.0 * var0 - 2.0) + 1.0),
   EASE_IN_QUART(var0 -> var0 * var0 * var0 * var0),
   EASE_OUT_QUART(var0 -> {
      Double var1;
      return 1.0 - var1 = var0 - 1.0 * var1 * var1 * var1;
   }),
   EASE_IN_OUT_QUART(var0 -> {
      Double var1;
      return var0 < 0.5 ? 8.0 * var0 * var0 * var0 * var0 : 1.0 - 8.0 * var1 = var0 - 1.0 * var1 * var1 * var1;
   }),
   EASE_IN_QUINT(var0 -> var0 * var0 * var0 * var0 * var0),
   EASE_OUT_QUINT(var0 -> {
      Double var1;
      return 1.0 + var1 = var0 - 1.0 * var1 * var1 * var1 * var1;
   }),
   EASE_IN_OUT_QUINT(var0 -> {
      Double var1;
      return var0 < 0.5 ? 16.0 * var0 * var0 * var0 * var0 * var0 : 1.0 + 16.0 * var1 = var0 - 1.0 * var1 * var1 * var1 * var1;
   }),
   EASE_IN_SINE(var0 -> 1.0 - Math.cos(var0 * Math.PI / 2.0)),
   EASE_OUT_SINE(var0 -> Math.sin(var0 * Math.PI / 2.0)),
   EASE_IN_OUT_SINE(var0 -> 1.0 - Math.cos(Math.PI * var0 / 2.0)),
   EASE_IN_EXPO(var0 -> var0 == 0.0 ? 0.0 : Math.pow(2.0, 10.0 * var0 - 10.0)),
   EASE_OUT_EXPO(var0 -> var0 == 1.0 ? 1.0 : 1.0 - Math.pow(2.0, -10.0 * var0)),
   EASE_IN_OUT_EXPO(
      var0 -> var0 == 0.0
         ? 0.0
         : (var0 == 1.0 ? 1.0 : (var0 < 0.5 ? Math.pow(2.0, 20.0 * var0 - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * var0 + 10.0)) / 2.0))
   ),
   EASE_IN_CIRC(var0 -> 1.0 - Math.sqrt(1.0 - var0 * var0)),
   EASE_OUT_CIRC(var0 -> {
      Double var1;
      return Math.sqrt(1.0 - var1 = var0 - 1.0 * var1);
   }),
   EASE_IN_OUT_CIRC(var0 -> var0 < 0.5 ? (1.0 - Math.sqrt(1.0 - 4.0 * var0 * var0)) / 2.0 : (Math.sqrt(1.0 - 4.0 * (var0 - 1.0) * var0) + 1.0) / 2.0),
   EASE_IN_BACK(var0 -> 2.70158 * var0 * var0 * var0 - 1.70158 * var0 * var0),
   EASE_OUT_BACK(var0 -> 1.0 + 2.70158 * Math.pow(var0 - 1.0, 3.0) + 1.70158 * Math.pow(var0 - 1.0, 2.0)),
   EASE_IN_OUT_BACK(
      var0 -> var0 < 0.5
         ? Math.pow(2.0 * var0, 2.0) * (7.189819 * var0 - 2.5949095) / 2.0
         : (Math.pow(2.0 * var0 - 2.0, 2.0) * (3.5949095 * (var0 * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0
   ),
   EASE_IN_ELASTIC(
      var0 -> var0 == 0.0 ? 0.0 : (var0 == 1.0 ? 1.0 : -Math.pow(2.0, 10.0 * var0 - 10.0) * Math.sin((var0 * 10.0 - 10.75) * (Math.PI * 2.0 / 3.0)))
   ),
   EASE_OUT_ELASTIC(
      var0 -> var0 == 0.0 ? 0.0 : (var0 == 1.0 ? 1.0 : Math.pow(2.0, -10.0 * var0) * Math.sin((var0 * 10.0 - 0.75) * (Math.PI * 2.0 / 3.0)) * 0.5 + 1.0)
   ),
   EASE_IN_OUT_ELASTIC(
      var0 -> var0 == 0.0
         ? 0.0
         : (
            var0 == 1.0
               ? 1.0
               : (
                  var0 < 0.5
                     ? -(Math.pow(2.0, 20.0 * var0 - 10.0) * Math.sin((20.0 * var0 - 11.125) * (Math.PI * 4.0 / 9.0))) / 2.0
                     : Math.pow(2.0, -20.0 * var0 + 10.0) * Math.sin((20.0 * var0 - 11.125) * (Math.PI * 4.0 / 9.0)) / 2.0 + 1.0
               )
         )
   ),
   SHRINK_EASING(var0 -> {
      float var1 = 1.3F;
      float var2 = var1 + 1.0F;
      return Math.max(0.0, 1.0 + var2 * Math.pow(var0 - 1.0, 3.0) + var1 * Math.pow(var0 - 1.0, 2.0));
   });

   private final Function<Double, Double> UuUVuuUu;

   private VUuNVnvnVun(Function<Double, Double> var3) {
      this.UuUVuuUu = var3;
   }

   public Function<Double, Double> UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public double UuUVuuUu(double var1) {
      return this.UuUVuuUu().apply(var1);
   }

   public float UuUVuuUu(float var1) {
      return this.UuUVuuUu().apply((double)var1).floatValue();
   }

   public static String UuUVuuUu(String var0) {
      int var1;
      if (var0 != null && (var1 = var0.length()) != 0) {
         char var2 = var0.charAt(0);
         char var3 = Character.toTitleCase(var2);
         if (var2 == var3) {
            return var0;
         } else {
            char[] var4 = new char[var1];
            var4[0] = var3;
            var0.getChars(1, var1, var4, 1);
            return String.valueOf(var4);
         }
      } else {
         return var0;
      }
   }

   @Override
   public String toString() {
      return UuUVuuUu(super.toString().toLowerCase().replace("_", " "));
   }
}
