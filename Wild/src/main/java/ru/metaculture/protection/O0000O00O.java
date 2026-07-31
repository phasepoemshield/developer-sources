package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;

public class O0000O00O {
   public static float O00000000 = 2.0F;

   public static void O00000000(RenderManager o0000O00OO0O0) {
      O0000O00OOO var1 = new O0000O00OOO(MinecraftClient.getInstance());
      float var2 = (float)(O0000O00OOO.O000000000000() / Math.pow(O0000O00OOO.O000000000000(), 2.0));
      o0000O00OO0O0.O00000000(var2 * O00000000, var2 * O00000000, var2 * O00000000);
   }

   public static void O000000000(RenderManager o0000O00OO0O0) {
      o0000O00OO0O0.O00000000(O00000000, O00000000, O00000000);
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
}
