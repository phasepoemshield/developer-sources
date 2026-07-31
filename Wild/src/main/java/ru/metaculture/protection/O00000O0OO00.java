package ru.metaculture.protection;

import net.minecraft.util.math.Vec3d;

public final class O00000O0OO00 {
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
   private final float O0000000000O;
   private final float O0000000000O0;
   private final float O0000000000O00;
   private final int O0000000000O0O;

   public O00000O0OO00(Vec3d vec3d, Vec3d vec3d2, long l, long m, float f, float g, float h, float i, int j) {
      this.O00000000 = vec3d.x;
      this.O000000000 = vec3d.y;
      this.O0000000000 = vec3d.z;
      double var12 = vec3d2.x;
      double var14 = vec3d2.y;
      double var16 = vec3d2.z;
      double var18 = Math.sqrt(var12 * var12 + var14 * var14 + var16 * var16);
      if (var18 < 1.0E-6) {
         var12 = 0.0;
         var14 = 0.0;
         var16 = 1.0;
      } else {
         var12 /= var18;
         var14 /= var18;
         var16 /= var18;
      }

      this.O00000000000 = var12;
      this.O000000000000 = var14;
      this.O0000000000000 = var16;
      this.O000000000000O = l;
      this.O00000000000O = Math.max(1L, m);
      this.O00000000000O0 = Math.max(0.1F, f);
      this.O00000000000OO = Math.max(0.1F, g);
      this.O0000000000O = Math.max(0.05F, h);
      this.O0000000000O0 = i;
      this.O0000000000O00 = this.O00000000000O0 * 1.8F + 0.5F;
      this.O0000000000O0O = j & 16777215;
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

   public float O0000000000O() {
      return this.O0000000000O;
   }

   public float O0000000000O0() {
      return this.O0000000000O0;
   }

   public float O0000000000O00() {
      return this.O0000000000O00;
   }

   public int O0000000000O0O() {
      return this.O0000000000O0O;
   }

   public float O00000000(long l) {
      float var3 = (float)(l - this.O000000000000O) / (float)this.O00000000000O;
      return var3 < 0.0F ? 0.0F : Math.min(var3, 1.0F);
   }

   public boolean O000000000(long l) {
      return l - this.O000000000000O >= this.O00000000000O;
   }
}
