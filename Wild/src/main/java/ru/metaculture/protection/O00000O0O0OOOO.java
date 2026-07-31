package ru.metaculture.protection;

import net.minecraft.util.math.Vec3d;

public final class O00000O0O0OOOO {
   private final double O00000000;
   private final double O000000000;
   private final double O0000000000;
   private final double O00000000000;
   private final double O000000000000;
   private final double O0000000000000;
   private final long O000000000000O;
   private final long O00000000000O;
   private final float O00000000000O0;
   private final float O00000000000OO;
   private final int O0000000000O;

   public O00000O0O0OOOO(Vec3d vec3d, Vec3d vec3d2, long l, long m, float f, float g, int i) {
      this.O00000000 = vec3d.x;
      this.O000000000 = vec3d.y;
      this.O0000000000 = vec3d.z;
      double var10 = vec3d2.x;
      double var12 = vec3d2.y;
      double var14 = vec3d2.z;
      double var16 = Math.sqrt(var10 * var10 + var12 * var12 + var14 * var14);
      if (var16 < 1.0E-6) {
         var10 = 0.0;
         var12 = 0.0;
         var14 = 1.0;
      } else {
         var10 /= var16;
         var12 /= var16;
         var14 /= var16;
      }

      this.O00000000000 = var10;
      this.O000000000000 = var12;
      this.O0000000000000 = var14;
      this.O000000000000O = l;
      this.O00000000000O = Math.max(1L, m);
      this.O00000000000O0 = f;
      this.O00000000000OO = g;
      this.O0000000000O = i & 16777215;
   }

   public double O00000000() {
      return this.O00000000;
   }

   public double O000000000() {
      return this.O000000000;
   }

   public double O0000000000() {
      return this.O0000000000;
   }

   public double O00000000000() {
      return this.O00000000000;
   }

   public double O000000000000() {
      return this.O000000000000;
   }

   public double O0000000000000() {
      return this.O0000000000000;
   }

   public long O000000000000O() {
      return this.O000000000000O;
   }

   public long O00000000000O() {
      return this.O00000000000O;
   }

   public float O00000000000O0() {
      return this.O00000000000O0;
   }

   public float O00000000000OO() {
      return this.O00000000000OO;
   }

   public int O0000000000O() {
      return this.O0000000000O;
   }

   public float O00000000(long l) {
      float var3 = (float)(l - this.O000000000000O) / (float)this.O00000000000O;
      return var3 < 0.0F ? 0.0F : Math.min(var3, 1.0F);
   }

   public boolean O000000000(long l) {
      return l - this.O000000000000O >= this.O00000000000O;
   }
}
