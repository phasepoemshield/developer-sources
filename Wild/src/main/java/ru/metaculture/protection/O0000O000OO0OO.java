package ru.metaculture.protection;

import net.minecraft.client.util.math.MatrixStack;

public class O0000O000OO0OO implements MinecraftAccessor {
   public static float O00000000 = 2.0F;

   public static void O00000000(MatrixStack matrixStack) {
      matrixStack.push();
      double var1 = a_.getWindow().getScaleFactor();
      double var3 = var1 / (var1 * var1);
      matrixStack.scale((float)(var3 * O00000000), (float)(var3 * O00000000), 1.0F);
   }

   public static void O000000000(MatrixStack matrixStack) {
      matrixStack.pop();
   }

   public static void O00000000(MatrixStack matrixStack, float f, float g, float h) {
      matrixStack.push();
      matrixStack.translate(f, g, 0.0F);
      matrixStack.scale(h, h, 1.0F);
      matrixStack.translate(-f, -g, 0.0F);
   }

   public static void O0000000000(MatrixStack matrixStack) {
      matrixStack.pop();
   }

   public static int O00000000(int i) {
      return (int)(i * a_.getWindow().getScaleFactor() / O00000000);
   }

   public static int O00000000(float f) {
      return (int)(f * a_.getWindow().getScaleFactor() / O00000000);
   }

   public static float O000000000(float f) {
      return f * a_.getWindow().getScaleFactor() / O00000000;
   }

   public static float[] O00000000(float f, float g) {
      double var2 = a_.getWindow().getScaleFactor();
      f = (float)(f * var2 / O00000000);
      g = (float)(g * var2 / O00000000);
      return new float[]{f, g};
   }

   public static void O000000000(MatrixStack matrixStack, float f, float g, float h) {
      matrixStack.translate(f, g, 0.0F);
      matrixStack.scale(h, h, 1.0F);
      matrixStack.translate(-f, -g, 0.0F);
   }
}
