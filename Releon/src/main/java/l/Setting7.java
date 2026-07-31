package l;

import java.awt.Color;
import java.util.function.Supplier;

public class Setting7 extends Helper264 {
   private float hue = 0.0F;
   private float saturation = 1.0F;
   private float brightness = 1.0F;
   private float alpha = 1.0F;
   private int[] presets = new int[0];

   public Setting7(String var1, String var2) {
      super(var1, var2);
   }

   public Setting7 method2550(int var1) {
      this.method2555(var1);
      return this;
   }

   public Setting7 method2551(int... var1) {
      this.presets = var1;
      return this;
   }

   public Setting7 method2552(Supplier<Boolean> var1) {
      this.method2704(var1);
      return this;
   }

   public int method2553() {
      return this.method2554() & 16777215 | Math.round(this.alpha * 255.0F) << 24;
   }

   public int method2554() {
      return Color.HSBtoRGB(this.hue, this.saturation, this.brightness);
   }

   public Setting7 method2555(int var1) {
      float[] var2 = Color.RGBtoHSB(Helper147.method1237(var1), Helper147.method1238(var1), Helper147.method1239(var1), null);
      this.hue = var2[0];
      this.saturation = var2[1];
      this.brightness = var2[2];
      this.alpha = Helper147.method1240(var1) / 255.0F;
      return this;
   }

   public float method2556() {
      return this.hue;
   }

   public float method2557() {
      return this.saturation;
   }

   public float method2558() {
      return this.brightness;
   }

   public float method2559() {
      return this.alpha;
   }

   public int[] method2560() {
      return this.presets;
   }

   public void method2561(float var1) {
      this.hue = var1;
   }

   public void method2562(float var1) {
      this.saturation = var1;
   }

   public void method2563(float var1) {
      this.brightness = var1;
   }

   public void method2564(float var1) {
      this.alpha = var1;
   }

   public void method2565(int[] var1) {
      this.presets = var1;
   }
}
