package Nursultan;

import it.unimi.dsi.fastutil.ints.Int2IntOpenHashMap;
import java.util.Arrays;

final class class09752 {
   static final int N = -2;
   static final int y = -1;
   private final Int2IntOpenHashMap L = new Int2IntOpenHashMap(256, 0.7F);
   private int[] u;
   private float[] i;
   private float[] R;
   private float[] M;
   private float[] B;
   private float[] Z;
   private int[] z;
   private int[] U;
   private int[] E;
   private int[] W;
   private int[] m;
   private int P;

   int L(int var1) {
      return this.L.get(var1);
   }

   float M(int var1) {
      return this.M[var1];
   }

   private void P(int var1) {
      if (var1 > this.u.length) {
         int var2 = Math.max(var1, this.u.length * 2);
         this.u = Arrays.copyOf(this.u, var2);
         this.i = Arrays.copyOf(this.i, var2);
         this.R = Arrays.copyOf(this.R, var2);
         this.M = Arrays.copyOf(this.M, var2);
         this.B = Arrays.copyOf(this.B, var2);
         this.Z = Arrays.copyOf(this.Z, var2);
         this.z = Arrays.copyOf(this.z, var2);
         this.U = Arrays.copyOf(this.U, var2);
         this.E = Arrays.copyOf(this.E, var2);
         this.W = Arrays.copyOf(this.W, var2);
         this.m = Arrays.copyOf(this.m, var2);
      }
   }

   class09752() {
      this.L.defaultReturnValue(-2);
      short var1 = 256;
      this.u = new int[var1];
      this.i = new float[var1];
      this.R = new float[var1];
      this.M = new float[var1];
      this.B = new float[var1];
      this.Z = new float[var1];
      this.z = new int[var1];
      this.U = new int[var1];
      this.E = new int[var1];
      this.W = new int[var1];
      this.m = new int[var1];
   }

   float B(int var1) {
      return this.B[var1];
   }

   float Z(int var1) {
      return this.Z[var1];
   }

   float i(int var1) {
      return this.i[var1];
   }

   int m(int var1) {
      return this.m[var1];
   }

   int U(int var1) {
      return this.U[var1];
   }

   int z(int var1) {
      return this.z[var1];
   }

   int u(int var1) {
      return this.u[var1];
   }

   void y(int var1) {
      this.L.put(var1, -1);
   }

   int E(int var1) {
      return this.E[var1];
   }

   void N(int var1, float var2, int var3, int var4, float var5, float var6, class09719 var7) {
      var7.N = this.i[var1] * var2;
      var7.y = this.R[var1] * var2;
      var7.L = this.M[var1] * var2;
      var7.u = this.B[var1] * var2;
      if (this.E[var1] > 0) {
         float var8 = 1.0F / (float)var3;
         float var9 = 1.0F / (float)var4;
         var7.i = (float)this.z[var1] * var8;
         var7.R = (float)this.U[var1] * var9;
         var7.M = (float)(this.z[var1] + this.E[var1]) * var8;
         var7.B = (float)(this.U[var1] + this.W[var1]) * var9;
      } else {
         var7.i = var7.R = var7.M = var7.B = 0.0F;
      }

      var7.Z = this.Z[var1] * var2;
      var7.z = var5 * var2 / var6;
      var7.U = this.m[var1];
   }

   void N(int var1, int var2, int var3, int var4, int var5, int var6) {
      this.z[var1] = var2;
      this.U[var1] = var3;
      this.E[var1] = var4;
      this.W[var1] = var5;
      this.m[var1] = var6;
   }

   int N(int var1, float var2, float var3, float var4, float var5, float var6, int var7, int var8, int var9, int var10, int var11) {
      int var12 = this.P++;
      this.P(this.P);
      this.u[var12] = var1;
      this.i[var12] = var2;
      this.R[var12] = var3;
      this.M[var12] = var4;
      this.B[var12] = var5;
      this.Z[var12] = var6;
      this.z[var12] = var7;
      this.U[var12] = var8;
      this.E[var12] = var9;
      this.W[var12] = var10;
      this.m[var12] = var11;
      this.L.put(var1, var12);
      return var12;
   }

   int N() {
      return this.P;
   }

   int N(int var1) {
      return this.L.get(var1);
   }

   int N(class09750 var1) {
      int var2 = this.P++;
      this.P(this.P);
      this.u[var2] = var1.N();
      this.i[var2] = var1.y();
      this.R[var2] = var1.L();
      this.M[var2] = var1.u();
      this.B[var2] = var1.i();
      this.Z[var2] = var1.R();
      this.z[var2] = var1.M();
      this.U[var2] = var1.B();
      this.E[var2] = var1.Z();
      this.W[var2] = var1.z();
      this.m[var2] = var1.U();
      this.L.put(var1.N(), var2);
      return var2;
   }

   int W(int var1) {
      return this.W[var1];
   }

   float R(int var1) {
      return this.R[var1];
   }
}
