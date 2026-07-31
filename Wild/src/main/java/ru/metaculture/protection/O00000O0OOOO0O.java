package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import org.joml.Matrix4f;
import org.joml.Vector3f;

public final class O00000O0OOOO0O {
   private static final float O0000000000 = 1.0F;
   private static final float O00000000000 = 0.5F;
   private static final float O000000000000 = 0.82F;
   private static final float O0000000000000 = 0.66F;
   private static final float O000000000000O = 0.86F;
   private static final int O00000000000O = 1;
   private final Vector3f O00000000000O0 = new Vector3f();
   private final Vector3f O00000000000OO = new Vector3f();
   private final Vector3f O0000000000O = new Vector3f();
   private final Matrix4f O0000000000O0 = new Matrix4f();
   private final float[] O0000000000O00 = new float[3];
   private final List<O00000O0OOOO0O.W202> O0000000000O0O = new ArrayList<>(256);
   private float O0000000000OO;
   private boolean O0000000000OO0;
   private O00000O0OOOO0 O0000000000OOO;
   private String O000000000O;
   private O00000O0OOOOO O000000000O0;
   private float O000000000O00;
   private float O000000000O000;
   private float O000000000O00O;
   private float O000000000O0O;
   private float O000000000O0O0;
   private float O000000000O0OO;
   public int O00000000;
   public int O000000000;

   public void O00000000(
      RenderManager o0000O00OO0O0, O00000O0OOOO0 o00000O0OOOO0, String string, float f, float g, float h, float i, float j, float k, float l, boolean bl
   ) {
      if (o0000O00OO0O0 != null && o00000O0OOOO0 != null) {
         this.O0000000000OO = l;
         this.O0000000000OO0 = bl;
         this.O0000000000OOO = o00000O0OOOO0;
         this.O000000000O = string;
         this.O000000000O0 = O00000O0OOOOO.O00000000();
         this.O000000000O00 = f;
         this.O000000000O000 = g;
         this.O000000000O00O = h;
         this.O000000000O0O = o00000O0OOOO0.O000000000000O();
         this.O000000000O0O0 = o00000O0OOOO0.O00000000000O();
         this.O000000000O0OO = o00000O0OOOO0.O00000000000O0();
         this.O0000000000O0.identity().rotateX((float)Math.toRadians(j)).rotateY((float)Math.toRadians(i));
         this.O0000000000O0O.clear();
         Matrix4f var12 = new Matrix4f();

         for (O00000O0OOOO0.W196 var14 : o00000O0OOOO0.O00000000000()) {
            this.O00000000(var14, var12);
         }

         this.O0000000000O0O.sort(Comparator.comparingDouble(o00000000 -> o00000000.O0000000000));
         this.O00000000 = this.O0000000000O0O.size();
         int var16 = 0;

         for (O00000O0OOOO0O.W202 var15 : this.O0000000000O0O) {
            if (this.O00000000(o0000O00OO0O0, var15, k)) {
               var16++;
            }
         }

         this.O000000000 = var16;
         this.O0000000000O0O.clear();
      }
   }

   private void O00000000(O00000O0OOOO0.W196 o00000000, Matrix4f matrix4f) {
      Matrix4f var3 = new Matrix4f(matrix4f);
      if (o00000000.O00000000000O()) {
         O00000000(
            var3,
            o00000000.O000000000(),
            o00000000.O0000000000(),
            o00000000.O00000000000(),
            o00000000.O000000000000O(),
            o00000000.O0000000000000(),
            o00000000.O000000000000()
         );
      }

      if (this.O0000000000OO0 && this.O00000000(o00000000.O00000000())) {
         var3.translate(o00000000.O000000000(), o00000000.O0000000000(), o00000000.O00000000000())
            .rotateZYX(this.O0000000000O00[2], this.O0000000000O00[1], this.O0000000000O00[0])
            .translate(-o00000000.O000000000(), -o00000000.O0000000000(), -o00000000.O00000000000());
      }

      for (O00000O0OOOO0.W197 var5 : o00000000.O00000000000OO()) {
         this.O00000000(var5, var3);
      }

      for (O00000O0OOOO0.W199 var8 : o00000000.O0000000000O()) {
         this.O00000000(var8, var3);
      }

      for (O00000O0OOOO0.W196 var9 : o00000000.O00000000000O0()) {
         this.O00000000(var9, var3);
      }
   }

   private static void O00000000(Matrix4f matrix4f, float f, float g, float h, float i, float j, float k) {
      matrix4f.translate(f, g, h).rotateZYX((float)Math.toRadians(i), (float)Math.toRadians(j), (float)Math.toRadians(k)).translate(-f, -g, -h);
   }

   private boolean O00000000(String string) {
      if (string != null && !string.isEmpty()) {
         String var2 = string.toLowerCase();
         float var3 = Math.abs(string.hashCode()) % 1000 * 0.0123F;
         this.O0000000000O00[0] = this.O0000000000O00[1] = this.O0000000000O00[2] = 0.0F;
         if (var2.contains("tail") || var2.startsWith("seg")) {
            this.O0000000000O00[0] = (float)Math.sin(this.O0000000000OO * 1.9F + var3) * 0.16F;
            this.O0000000000O00[1] = (float)Math.sin(this.O0000000000OO * 1.3F + var3) * 0.1F;
            return true;
         } else if (var2.contains("ear")) {
            float var4 = var2.contains("left") ? 1.0F : -1.0F;
            this.O0000000000O00[2] = var4 * (0.05F + (float)Math.sin(this.O0000000000OO * 2.4F + var3) * 0.08F);
            return true;
         } else if (var2.contains("cape") || var2.contains("wing")) {
            this.O0000000000O00[0] = -0.08F + (float)Math.sin(this.O0000000000OO * 1.6F + var3) * 0.13F;
            return true;
         } else if (var2.equals("head")) {
            this.O0000000000O00[1] = (float)Math.sin(this.O0000000000OO * 0.5F) * 0.1F;
            this.O0000000000O00[0] = (float)Math.sin(this.O0000000000OO * 0.4F) * 0.04F;
            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   private void O00000000(O00000O0OOOO0.W197 o000000000, Matrix4f matrix4f) {
      Matrix4f var3 = new Matrix4f(matrix4f);
      if (o000000000.O0000000000O0O()) {
         O00000000(
            var3,
            o000000000.O000000000000O(),
            o000000000.O00000000000O(),
            o000000000.O00000000000O0(),
            o000000000.O0000000000O0(),
            o000000000.O0000000000O(),
            o000000000.O00000000000OO()
         );
      }

      float var4 = o000000000.O0000000000O00();
      float var5 = o000000000.O00000000() - var4;
      float var6 = o000000000.O000000000() - var4;
      float var7 = o000000000.O0000000000() - var4;
      float var8 = o000000000.O00000000000() + var4;
      float var9 = o000000000.O000000000000() + var4;
      float var10 = o000000000.O0000000000000() + var4;
      this.O00000000(o000000000.O00000000(0), var3, 0.82F, 0.0F, 0.0F, -1.0F, var8, var9, var7, var5, var9, var7, var5, var6, var7, var8, var6, var7);
      this.O00000000(o000000000.O00000000(2), var3, 0.82F, 0.0F, 0.0F, 1.0F, var5, var9, var10, var8, var9, var10, var8, var6, var10, var5, var6, var10);
      this.O00000000(o000000000.O00000000(1), var3, 0.66F, 1.0F, 0.0F, 0.0F, var8, var9, var10, var8, var9, var7, var8, var6, var7, var8, var6, var10);
      this.O00000000(o000000000.O00000000(3), var3, 0.66F, -1.0F, 0.0F, 0.0F, var5, var9, var7, var5, var9, var10, var5, var6, var10, var5, var6, var7);
      this.O00000000(o000000000.O00000000(4), var3, 1.0F, 0.0F, 1.0F, 0.0F, var5, var9, var7, var8, var9, var7, var8, var9, var10, var5, var9, var10);
      this.O00000000(o000000000.O00000000(5), var3, 0.5F, 0.0F, -1.0F, 0.0F, var5, var6, var10, var8, var6, var10, var8, var6, var7, var5, var6, var7);
   }

   private void O00000000(
      O00000O0OOOO0.W198 o0000000000,
      Matrix4f matrix4f,
      float f,
      float g,
      float h,
      float i,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      float p,
      float q,
      float r,
      float s,
      float t,
      float u
   ) {
      if (o0000000000 != null) {
         this.O00000000(
            matrix4f,
            o0000000000.O00000000(),
            f,
            g,
            h,
            i,
            o0000000000.O000000000(),
            o0000000000.O0000000000(),
            o0000000000.O00000000000(),
            o0000000000.O0000000000(),
            o0000000000.O00000000000(),
            o0000000000.O000000000000(),
            o0000000000.O000000000(),
            o0000000000.O000000000000(),
            j,
            k,
            l,
            m,
            n,
            o,
            p,
            q,
            r,
            s,
            t,
            u,
            false
         );
      }
   }

   private void O00000000(O00000O0OOOO0.W199 o00000000000, Matrix4f matrix4f) {
      Matrix4f var3 = new Matrix4f(matrix4f);
      var3.translate(o00000000000.O00000000(), o00000000000.O000000000(), o00000000000.O0000000000());
      if (o00000000000.O00000000000O0()) {
         var3.rotateZYX(
            (float)Math.toRadians(o00000000000.O0000000000000()),
            (float)Math.toRadians(o00000000000.O000000000000()),
            (float)Math.toRadians(o00000000000.O00000000000())
         );
      }

      for (O00000O0OOOO0.W200 var7 : o00000000000.O00000000000O()) {
         int var8 = var7.O00000000(0);
         int var9 = var7.O00000000(1);
         int var10 = var7.O00000000(2);
         int var11 = var7.O00000000() >= 4 ? var7.O00000000(3) : var10;
         float var12 = o00000000000.O00000000(var8);
         float var13 = o00000000000.O000000000(var8);
         float var14 = o00000000000.O0000000000(var8);
         float var15 = o00000000000.O00000000(var9);
         float var16 = o00000000000.O000000000(var9);
         float var17 = o00000000000.O0000000000(var9);
         float var18 = o00000000000.O00000000(var10);
         float var19 = o00000000000.O000000000(var10);
         float var20 = o00000000000.O0000000000(var10);
         float var21 = o00000000000.O00000000(var11);
         float var22 = o00000000000.O000000000(var11);
         float var23 = o00000000000.O0000000000(var11);
         this.O00000000000OO.set(var15 - var12, var16 - var13, var17 - var14);
         this.O0000000000O.set(var18 - var12, var19 - var13, var20 - var14);
         this.O00000000000OO.cross(this.O0000000000O);
         float var24 = var7.O00000000() >= 4 ? 3.0F : 2.0F;
         this.O00000000(
            var3,
            var7.O000000000(),
            0.86F,
            this.O00000000000OO.x,
            this.O00000000000OO.y,
            this.O00000000000OO.z,
            var7.O000000000(0),
            var7.O0000000000(0),
            var7.O000000000(1),
            var7.O0000000000(1),
            var7.O000000000((int)var24),
            var7.O0000000000((int)var24),
            var7.O000000000(var7.O00000000() >= 4 ? 3 : 2),
            var7.O0000000000(var7.O00000000() >= 4 ? 3 : 2),
            var12,
            var13,
            var14,
            var15,
            var16,
            var17,
            var18,
            var19,
            var20,
            var21,
            var22,
            var23,
            true
         );
      }
   }

   private void O00000000(
      Matrix4f matrix4f,
      int i,
      float f,
      float g,
      float h,
      float j,
      float k,
      float l,
      float m,
      float n,
      float o,
      float p,
      float q,
      float r,
      float s,
      float t,
      float u,
      float v,
      float w,
      float x,
      float y,
      float z,
      float aa,
      float ab,
      float ac,
      float ad,
      boolean bl
   ) {
      this.O00000000000O0.set(g, h, j);
      matrix4f.transformDirection(this.O00000000000O0);
      this.O0000000000O0.transformDirection(this.O00000000000O0);
      boolean var28 = this.O00000000000O0.z * 1.0F > 0.02F;
      if (var28 || bl) {
         if (!var28 && bl) {
            f *= 0.78F;
         }

         O00000O0OOOO0O.W202 var29 = new O00000O0OOOO0O.W202();
         float var30 = 0.0F;
         var30 += this.O00000000(matrix4f, s, t, u, var29, 0);
         var30 += this.O00000000(matrix4f, v, w, x, var29, 1);
         var30 += this.O00000000(matrix4f, y, z, aa, var29, 2);
         var30 += this.O00000000(matrix4f, ab, ac, ad, var29, 3);
         var29.O0000000000 = var30 * 0.25F * 1.0F;
         var29.O00000000000 = f;
         O00000O0OOOO0.W201 var31 = this.O0000000000OOO.O00000000(i);
         float var32 = var31 == null ? this.O0000000000OOO.O00000000() : var31.O0000000000();
         float var33 = var31 == null ? this.O0000000000OOO.O000000000() : var31.O00000000000();
         var29.O0000000000000 = k / var32;
         var29.O000000000000O = l / var33;
         var29.O00000000000O = o / var32;
         var29.O00000000000O0 = p / var33;
         var29.O000000000000 = this.O000000000O0.O00000000(this.O000000000O, i, this.O0000000000OOO);
         this.O0000000000O0O.add(var29);
      }
   }

   private float O00000000(Matrix4f matrix4f, float f, float g, float h, O00000O0OOOO0O.W202 o00000000, int i) {
      this.O00000000000O0.set(f, g, h);
      matrix4f.transformPosition(this.O00000000000O0);
      this.O00000000000O0.sub(this.O000000000O0O, this.O000000000O0O0, this.O000000000O0OO);
      this.O0000000000O0.transformPosition(this.O00000000000O0);
      o00000000.O00000000[i] = this.O000000000O00 + this.O00000000000O0.x * this.O000000000O00O;
      o00000000.O000000000[i] = this.O000000000O000 - this.O00000000000O0.y * this.O000000000O00O;
      return this.O00000000000O0.z;
   }

   private boolean O00000000(RenderManager o0000O00OO0O0, O00000O0OOOO0O.W202 o00000000, float f) {
      float var4 = o00000000.O00000000[0];
      float var5 = o00000000.O000000000[0];
      float var6 = o00000000.O00000000[1] - var4;
      float var7 = o00000000.O000000000[1] - var5;
      float var8 = o00000000.O00000000[3] - var4;
      float var9 = o00000000.O000000000[3] - var5;
      if (Math.abs(var6 * var9 - var7 * var8) < 0.05F) {
         return false;
      } else {
         float[] var10 = new float[]{var6, var8, var4, var7, var9, var5, 0.0F, 0.0F, 1.0F};
         o0000O00OO0O0.O000000000(var10);

         try {
            if (o00000000.O000000000000 > 0) {
               o0000O00OO0O0.O00000000(
                  o00000000.O000000000000,
                  0.0F,
                  0.0F,
                  1.0F,
                  1.0F,
                  o00000000.O0000000000000,
                  o00000000.O000000000000O,
                  o00000000.O00000000000O,
                  o00000000.O00000000000O0
               );
               float var11 = (1.0F - o00000000.O00000000000) * 0.55F;
               if (var11 > 0.01F) {
                  o0000O00OO0O0.O00000000(0.0F, 0.0F, 1.0F, 1.0F, 0.0F, O00000000(0, 0, 0, Math.round(var11 * 255.0F)));
               }
            } else {
               int var15 = Math.round(205.0F * o00000000.O00000000000);
               o0000O00OO0O0.O00000000(0.0F, 0.0F, 1.0F, 1.0F, 0.0F, O00000000(var15, var15, Math.min(255, var15 + 12), 255));
            }
         } finally {
            o0000O00OO0O0.O00000000000O();
         }

         return true;
      }
   }

   private static int O00000000(int i, int j, int k, int l) {
      return l << 24 | i << 16 | j << 8 | k;
   }

   static final class W202 {
      final float[] O00000000 = new float[4];
      final float[] O000000000 = new float[4];
      float O0000000000;
      float O00000000000;
      int O000000000000;
      float O0000000000000;
      float O000000000000O;
      float O00000000000O;
      float O00000000000O0;
   }
}
