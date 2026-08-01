package ru.metaculture.protection;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class ColorSetting extends Setting {
   public static final int O00000000000 = 8;
   public float O000000000000;
   public float O0000000000000;
   public float O000000000000O;
   public float O00000000000O;
   public float O00000000000O0;
   public boolean O00000000000OO;
   public String O0000000000O;
   public O0000O00OOO00 O0000000000O0 = new O0000O0O0000O(300, 1.0);
   public float O0000000000O00 = 1.0F;
   public float O0000000000O0O = 1.0F;
   public float O0000000000OO = 1.0F;
   public final List<Integer> O0000000000OO0 = new ArrayList<>();
   protected float O0000000000OOO;
   protected float O000000000O;
   protected float O000000000O0;
   protected float O000000000O00;

   public ColorSetting(String string, float f) {
      this.O00000000 = string;
      this.O0000000000000 = 0.0F;
      this.O000000000000O = 106.0F;
      this.O00000000000O = 1.0F;
      if (!(f < this.O0000000000000) && !(f > this.O000000000000O)) {
         this.O000000000000 = f;
         this.O0000000000O00 = 1.0F;
         this.O0000000000O0O = 1.0F;
         this.O0000000000OO = 1.0F;
      } else {
         this.O00000000((int)f);
      }

      this.O00000000000OO();
   }

   public ColorSetting(String string, float f, float g, float h) {
      this(string, f, g, h, 1.0F);
   }

   public ColorSetting(String string, float f, float g, float h, float i) {
      this.O00000000 = string;
      this.O0000000000000 = 0.0F;
      this.O000000000000 = f;
      this.O000000000000O = 106.0F;
      this.O00000000000O = 1.0F;
      this.O0000000000O00 = O0000000000(g);
      this.O0000000000O0O = O0000000000(h);
      this.O0000000000OO = O0000000000(i);
      this.O00000000000OO();
   }

   public ColorSetting O000000000(Supplier<Boolean> supplier) {
      this.O000000000 = supplier;
      return this;
   }

   public Color O0000000000() {
      float var1 = this.O00000000000();
      Color var2 = Color.getHSBColor(var1, this.O0000000000O00, this.O0000000000O0O);
      return new Color(var2.getRed(), var2.getGreen(), var2.getBlue(), Math.round(this.O0000000000OO * 255.0F));
   }

   public void O00000000(Color color) {
      float[] var2 = Color.RGBtoHSB(color.getRed(), color.getGreen(), color.getBlue(), null);
      this.O000000000000 = var2[0] * this.O000000000000O;
      this.O0000000000O00 = var2[1];
      this.O0000000000O0O = var2[2];
      this.O0000000000OO = color.getAlpha() / 255.0F;
   }

   public void O00000000(int i) {
      int var2 = i >= 0 && i <= 16777215 ? 0xFF000000 | i : i;
      this.O00000000(new Color(var2, true));
   }

   public float O00000000000() {
      return O0000000000(this.O000000000000 / this.O000000000000O);
   }

   public float O000000000000() {
      return this.O00000000000() * 360.0F;
   }

   public void O00000000(float f) {
      float var2 = f % 360.0F;
      if (var2 < 0.0F) {
         var2 += 360.0F;
      }

      this.O000000000000 = var2 / 360.0F * this.O000000000000O;
   }

   public void O000000000(float f) {
      this.O0000000000OO = O0000000000(f);
   }

   public void O000000000(int i) {
      this.O0000000000OO0.removeIf(integer -> integer == i);
      this.O0000000000OO0.add(0, i);

      while (this.O0000000000OO0.size() > 8) {
         this.O0000000000OO0.remove(this.O0000000000OO0.size() - 1);
      }
   }

   public void O000000000000O() {
      this.O000000000(this.O00000000000O0());
   }

   public void O0000000000(int i) {
      if (i >= 0 && i < this.O0000000000OO0.size()) {
         this.O00000000(this.O0000000000OO0.get(i));
      }
   }

   public void O00000000000(int i) {
      if (i >= 0 && i < this.O0000000000OO0.size()) {
         this.O0000000000OO0.remove(i);
      }
   }

   public int O00000000000O() {
      return this.O0000000000().getRGB();
   }

   public int O00000000000O0() {
      return this.O0000000000().getRGB();
   }

   public int O000000000000(int i) {
      Color var2 = this.O0000000000();
      return i << 24 | var2.getRed() << 16 | var2.getGreen() << 8 | var2.getBlue();
   }

   private static float O0000000000(float f) {
      return Float.isFinite(f) && !(f <= 0.0F) ? Math.min(f, 1.0F) : 0.0F;
   }

   protected void O00000000000OO() {
      this.O0000000000OOO = this.O000000000000;
      this.O000000000O = this.O0000000000O00;
      this.O000000000O0 = this.O0000000000O0O;
      this.O000000000O00 = this.O0000000000OO;
   }

   @Override
   public void O000000000() {
      this.O000000000000 = this.O0000000000OOO;
      this.O0000000000O00 = this.O000000000O;
      this.O0000000000O0O = this.O000000000O0;
      this.O0000000000OO = this.O000000000O00;
      this.O00000000000OO = false;
   }
}
