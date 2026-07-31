package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import net.minecraft.client.util.math.MatrixStack;
import org.lwjgl.opengl.GL11;

public class O0000O00OO0OOO {
   private MinecraftClient O000000000 = MinecraftClient.getInstance();
   public static float O00000000 = 2.0F;

   public static void O00000000() {
      O0000O00OOO var0 = new O0000O00OOO(MinecraftClient.getInstance());
      double var1 = O0000O00OOO.O000000000000() / Math.pow(O0000O00OOO.O000000000000(), 2.0);
      GL11.glPushMatrix();
      GL11.glScaled(var1 * O00000000, var1 * O00000000, var1 * O00000000);
   }

   public static void O000000000() {
      GL11.glScaled(O00000000, O00000000, O00000000);
      GL11.glPopMatrix();
   }

   public static void O00000000(float f, float g, float h) {
      MatrixStack var3 = new MatrixStack();
      var3.push();
      var3.translate(f, g, 0.0F);
      var3.scale(h, h, 1.0F);
      var3.translate(-f, -g, 0.0F);
   }

   public static void O0000000000() {
      MatrixStack var0 = new MatrixStack();
      var0.pop();
   }

   public static int O00000000(int i) {
      O0000O00OOO var1 = new O0000O00OOO(MinecraftClient.getInstance());
      return (int)(i * O0000O00OOO.O000000000000() / O00000000);
   }

   public static int O00000000(float f) {
      O0000O00OOO var1 = new O0000O00OOO(MinecraftClient.getInstance());
      return (int)(f * O0000O00OOO.O000000000000() / O00000000);
   }

   public static float[] O00000000(float f, float g) {
      O0000O00OOO var2 = new O0000O00OOO(MinecraftClient.getInstance());
      f = f * O0000O00OOO.O000000000000() / O00000000;
      g = g * O0000O00OOO.O000000000000() / O00000000;
      return new float[]{f, g};
   }

   public static void O000000000(float f, float g, float h) {
      MatrixStack var3 = new MatrixStack();
      var3.translate(f, g, 0.0F);
      var3.scale(h, h, 1.0F);
      var3.translate(-f, -g, 0.0F);
   }
}
