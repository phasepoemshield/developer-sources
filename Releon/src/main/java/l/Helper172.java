package l;

import java.awt.Color;

public class Helper172 {
   private final int color1;
   private final int color2;
   private final int color3;
   private final int color4;
   public static final Helper172 TRANSPARENT = new Helper172(0, 0, 0, 0);
   public static final Helper172 WHITE = new Helper172(-1, -1, -1, -1);

   public Helper172(Color var1, Color var2, Color var3, Color var4) {
      this(var1.getRGB(), var2.getRGB(), var3.getRGB(), var4.getRGB());
   }

   public Helper172(Color var1) {
      this(var1, var1, var1, var1);
   }

   public Helper172(int var1) {
      this(var1, var1, var1, var1);
   }

   public Helper172(int var1, int var2, int var3, int var4) {
      this.color1 = var1;
      this.color2 = var2;
      this.color3 = var3;
      this.color4 = var4;
   }

   public static Helper172 method1454(int var0, int var1, int var2, int var3) {
      int var4 = (var3 & 0xFF) << 24 | (var0 & 0xFF) << 16 | (var1 & 0xFF) << 8 | var2 & 0xFF;
      return new Helper172(var4);
   }

   private static Color method1455(Color var0, Color var1, float var2) {
      var2 = Math.max(0.0F, Math.min(1.0F, var2));
      int var3 = (int)(var0.getRed() * (1.0F - var2) + var1.getRed() * var2);
      int var4 = (int)(var0.getGreen() * (1.0F - var2) + var1.getGreen() * var2);
      int var5 = (int)(var0.getBlue() * (1.0F - var2) + var1.getBlue() * var2);
      int var6 = (int)(var0.getAlpha() * (1.0F - var2) + var1.getAlpha() * var2);
      return new Color(var3, var4, var5, var6);
   }

   public static Helper172 method1456(Color var0, Color var1) {
      return new Helper172(var0, var1, var1, var0);
   }

   public static Helper172 method1457(int var0, int var1) {
      return new Helper172(var0, var1, var1, var0);
   }

   public static Helper172 method1458(Color var0, Color var1) {
      return new Helper172(var0, var0, var1, var1);
   }

   public static Helper172 method1459(int var0, int var1) {
      return new Helper172(var0, var0, var1, var1);
   }

   public static Helper172 method1460(Color var0, Color var1, double var2) {
      double var4 = System.currentTimeMillis() % (var2 * 1000.0) / (var2 * 1000.0);
      float var6 = (float)(Math.sin(var4 * 2.0 * Math.PI) * 0.5 + 0.5);
      Color var7 = method1455(var0, var1, var6);
      Color var8 = method1455(var1, var0, var6);
      return method1456(var7, var8);
   }

   public static Helper172 method1461(Color var0, Color var1, double var2) {
      double var4 = System.currentTimeMillis() % (var2 * 1000.0) / (var2 * 1000.0);
      float var6 = (float)(Math.sin(var4 * 2.0 * Math.PI) * 0.5 + 0.5);
      Color var7 = method1455(var0, var1, var6);
      Color var8 = method1455(var1, var0, var6);
      return method1458(var7, var8);
   }

   public int method1462() {
      return this.color1;
   }

   public int method1463() {
      return this.color2;
   }

   public int method1464() {
      return this.color3;
   }

   public int method1465() {
      return this.color4;
   }
}
