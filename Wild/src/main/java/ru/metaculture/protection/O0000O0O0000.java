package ru.metaculture.protection;

import java.util.function.Function;

public enum O0000O0O0000 {
   LINEAR(double_ -> double_),
   SIGMOID(double_ -> 1.0 / (1.0 + Math.exp(-double_))),
   EASE_IN_QUAD(double_ -> double_ * double_),
   EASE_OUT_QUAD(double_ -> double_ * (2.0 - double_)),
   EASE_IN_OUT_QUAD(double_ -> double_ < 0.5 ? 2.0 * double_ * double_ : -1.0 + (4.0 - 2.0 * double_) * double_),
   EASE_IN_CUBIC(double_ -> double_ * double_ * double_),
   EASE_OUT_CUBIC(double_ -> {
      Double var1;
      return (var1 = double_ - 1.0) * var1 * var1 + 1.0;
   }),
   EASE_IN_OUT_CUBIC(double_ -> double_ < 0.5 ? 4.0 * double_ * double_ * double_ : (double_ - 1.0) * (2.0 * double_ - 2.0) * (2.0 * double_ - 2.0) + 1.0),
   EASE_IN_QUART(double_ -> double_ * double_ * double_ * double_),
   EASE_OUT_QUART(double_ -> {
      Double var1;
      return 1.0 - (var1 = double_ - 1.0) * var1 * var1 * var1;
   }),
   EASE_IN_OUT_QUART(double_ -> {
      Double var1;
      return double_ < 0.5 ? 8.0 * double_ * double_ * double_ * double_ : 1.0 - 8.0 * (var1 = double_ - 1.0) * var1 * var1 * var1;
   }),
   EASE_IN_QUINT(double_ -> double_ * double_ * double_ * double_ * double_),
   EASE_OUT_QUINT(double_ -> {
      Double var1;
      return 1.0 + (var1 = double_ - 1.0) * var1 * var1 * var1 * var1;
   }),
   EASE_IN_OUT_QUINT(double_ -> {
      Double var1;
      return double_ < 0.5 ? 16.0 * double_ * double_ * double_ * double_ * double_ : 1.0 + 16.0 * (var1 = double_ - 1.0) * var1 * var1 * var1 * var1;
   }),
   EASE_IN_SINE(double_ -> 1.0 - Math.cos(double_ * Math.PI / 2.0)),
   EASE_OUT_SINE(double_ -> Math.sin(double_ * Math.PI / 2.0)),
   EASE_IN_OUT_SINE(double_ -> 1.0 - Math.cos(Math.PI * double_ / 2.0)),
   EASE_IN_EXPO(double_ -> double_ == 0.0 ? 0.0 : Math.pow(2.0, 10.0 * double_ - 10.0)),
   EASE_OUT_EXPO(double_ -> double_ == 1.0 ? 1.0 : 1.0 - Math.pow(2.0, -10.0 * double_)),
   EASE_IN_OUT_EXPO(
      double_ -> double_ == 0.0
         ? 0.0
         : (double_ == 1.0 ? 1.0 : (double_ < 0.5 ? Math.pow(2.0, 20.0 * double_ - 10.0) / 2.0 : (2.0 - Math.pow(2.0, -20.0 * double_ + 10.0)) / 2.0))
   ),
   EASE_IN_CIRC(double_ -> 1.0 - Math.sqrt(1.0 - double_ * double_)),
   EASE_OUT_CIRC(double_ -> {
      Double var1;
      return Math.sqrt(1.0 - (var1 = double_ - 1.0) * var1);
   }),
   EASE_IN_OUT_CIRC(
      double_ -> double_ < 0.5 ? (1.0 - Math.sqrt(1.0 - 4.0 * double_ * double_)) / 2.0 : (Math.sqrt(1.0 - 4.0 * (double_ - 1.0) * double_) + 1.0) / 2.0
   ),
   EASE_IN_BACK(double_ -> 2.70158 * double_ * double_ * double_ - 1.70158 * double_ * double_),
   EASE_OUT_BACK(double_ -> 1.0 + 2.70158 * Math.pow(double_ - 1.0, 3.0) + 1.70158 * Math.pow(double_ - 1.0, 2.0)),
   EASE_IN_OUT_BACK(
      double_ -> double_ < 0.5
         ? Math.pow(2.0 * double_, 2.0) * (7.189819 * double_ - 2.5949095) / 2.0
         : (Math.pow(2.0 * double_ - 2.0, 2.0) * (3.5949095 * (double_ * 2.0 - 2.0) + 2.5949095) + 2.0) / 2.0
   ),
   EASE_IN_ELASTIC(
      double_ -> double_ == 0.0
         ? 0.0
         : (double_ == 1.0 ? 1.0 : -Math.pow(2.0, 10.0 * double_ - 10.0) * Math.sin((double_ * 10.0 - 10.75) * (Math.PI * 2.0 / 3.0)))
   ),
   EASE_OUT_ELASTIC(
      double_ -> double_ == 0.0
         ? 0.0
         : (double_ == 1.0 ? 1.0 : Math.pow(2.0, -10.0 * double_) * Math.sin((double_ * 10.0 - 0.75) * (Math.PI * 2.0 / 3.0)) * 0.5 + 1.0)
   ),
   EASE_IN_OUT_ELASTIC(
      double_ -> double_ == 0.0
         ? 0.0
         : (
            double_ == 1.0
               ? 1.0
               : (
                  double_ < 0.5
                     ? -(Math.pow(2.0, 20.0 * double_ - 10.0) * Math.sin((20.0 * double_ - 11.125) * (Math.PI * 4.0 / 9.0))) / 2.0
                     : Math.pow(2.0, -20.0 * double_ + 10.0) * Math.sin((20.0 * double_ - 11.125) * (Math.PI * 4.0 / 9.0)) / 2.0 + 1.0
               )
         )
   ),
   SHRINK_EASING(double_ -> {
      float var1 = 1.3F;
      float var2 = var1 + 1.0F;
      return Math.max(0.0, 1.0 + var2 * Math.pow(double_ - 1.0, 3.0) + var1 * Math.pow(double_ - 1.0, 2.0));
   });

   private final Function<Double, Double> O00000000;

   private O0000O0O0000(Function<Double, Double> function) {
      this.O00000000 = function;
   }

   public Function<Double, Double> O00000000() {
      return this.O00000000;
   }

   public double O00000000(double d) {
      return this.O00000000().apply(d);
   }

   public float O00000000(float f) {
      return this.O00000000().apply((double)f).floatValue();
   }

   public static String O00000000(String string) {
      int var1;
      if (string != null && (var1 = string.length()) != 0) {
         char var2 = string.charAt(0);
         char var3 = Character.toTitleCase(var2);
         if (var2 == var3) {
            return string;
         } else {
            char[] var4 = new char[var1];
            var4[0] = var3;
            string.getChars(1, var1, var4, 1);
            return String.valueOf(var4);
         }
      } else {
         return string;
      }
   }

   @Override
   public String toString() {
      return O00000000(super.toString().toLowerCase().replace("_", " "));
   }
}
