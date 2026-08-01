package ru.metaculture.protection;

import net.minecraft.client.render.Camera;
import net.minecraft.util.math.Vec3d;
import org.joml.Quaternionf;

final class O00000O0OO00O {
   private static Camera O00000000;
   private static double O000000000 = Double.NaN;
   private static double O0000000000 = Double.NaN;
   private static double O00000000000 = Double.NaN;
   private static float O000000000000 = Float.NaN;
   private static float O0000000000000 = Float.NaN;
   private static float O000000000000O = Float.NaN;
   private static float O00000000000O = Float.NaN;
   private static double O00000000000O0;
   private static double O00000000000OO;
   private static double O0000000000O;
   private static float O0000000000O0;
   private static float O0000000000O00;
   private static float O0000000000O0O;
   private static float O0000000000OO;
   private static float O0000000000OO0;
   private static float O0000000000OOO;

   private O00000O0OO00O() {
   }

   static void O00000000(Camera camera) {
      Vec3d var1 = camera.getPos();
      Quaternionf var2 = camera.getRotation();
      float var3 = var2.x();
      float var4 = var2.y();
      float var5 = var2.z();
      float var6 = var2.w();
      if (camera != O00000000
         || var1.x != O000000000
         || var1.y != O0000000000
         || var1.z != O00000000000
         || var3 != O000000000000
         || var4 != O0000000000000
         || var5 != O000000000000O
         || var6 != O00000000000O) {
         O00000000 = camera;
         O000000000 = var1.x;
         O0000000000 = var1.y;
         O00000000000 = var1.z;
         O000000000000 = var3;
         O0000000000000 = var4;
         O000000000000O = var5;
         O00000000000O = var6;
         O00000000000O0 = var1.x;
         O00000000000OO = var1.y;
         O0000000000O = var1.z;
         O0000000000O0 = 1.0F - 2.0F * (var4 * var4 + var5 * var5);
         O0000000000O00 = 2.0F * (var3 * var4 + var5 * var6);
         O0000000000O0O = 2.0F * (var3 * var5 - var4 * var6);
         O0000000000OO = 2.0F * (var3 * var4 - var5 * var6);
         O0000000000OO0 = 1.0F - 2.0F * (var3 * var3 + var5 * var5);
         O0000000000OOO = 2.0F * (var4 * var5 + var3 * var6);
      }
   }

   static double O00000000() {
      return O00000000000O0;
   }

   static double O000000000() {
      return O00000000000OO;
   }

   static double O0000000000() {
      return O0000000000O;
   }

   static float O00000000000() {
      return O0000000000O0;
   }

   static float O000000000000() {
      return O0000000000O00;
   }

   static float O0000000000000() {
      return O0000000000O0O;
   }

   static float O000000000000O() {
      return O0000000000OO;
   }

   static float O00000000000O() {
      return O0000000000OO0;
   }

   static float O00000000000O0() {
      return O0000000000OOO;
   }
}
