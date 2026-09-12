package Nursultan;

import it.unimi.dsi.fastutil.ints.IntOpenHashSet;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_MM_Var;
import org.lwjgl.util.freetype.FT_Var_Axis;
import org.lwjgl.util.freetype.FT_Vector;
import org.lwjgl.util.freetype.FreeType;

public final class class09742 implements AutoCloseable {
   private static final int[] N;
   private final class09734 y;
   private final byte[] L;
   private final long u;
   private final class09735 i;
   private final int R;
   private final double M;
   private final double B;
   private final int Z = 1;
   private final long z;
   private final ByteBuffer U;
   private final FT_Face E;
   private final int W;
   private final boolean m;
   private final class09730 P;
   private final class09718 s;
   private final class09752 T = new class09752();
   private final class09731 b = new class09731();
   private class09726 j;
   private int[] v = new int[64];
   private int n;
   private class09726 t;
   private final IntOpenHashSet G = new IntOpenHashSet(256);
   private int[] l = new int[256];
   private int[] d = new int[256];
   private int[] w = new int[256];
   private int[] k = new int[256];
   private int[] Y = new int[256];
   private int Q;
   private final int[] O = new int[2];
   private int[] g;
   private class09761[] I;
   private final BlockingQueue<int[]> J = new LinkedBlockingQueue<>();
   private final Queue<class09724> o = new ConcurrentLinkedQueue<>();
   private final Executor q;
   private final Queue<class09745> K = new ConcurrentLinkedQueue<>();
   private final List<class09745> V = Collections.synchronizedList(new ArrayList<>());
   private volatile boolean e;
   private Thread H;

   public ByteBuffer L() {
      return this.j.u();
   }

   public boolean L(int var1) {
      return FreeType.FT_Get_Char_Index(this.E, (long)var1) != 0;
   }

   public int M() {
      return 1;
   }

   private void P() {
      int var1 = this.t.N();
      if (var1 >= this.y.R()) {
         throw new IllegalStateException("atlas exceeded max page size " + this.y.R() + "px");
      } else {
         int var2 = Math.min(this.y.R(), var1 * 2);
         class09726 var3 = new class09726(var2, var2, this.R);
         int[] var4 = this.s();

         for (int var5 = 0; var5 < this.Q; var5++) {
            int var6 = var4[var5];
            if (this.d[var6] != 0) {
               if (!var3.N(this.d[var6], this.w[var6], 1, this.O)) {
                  throw new IllegalStateException("repack failed at " + var2 + "px");
               }

               var3.N(this.t, this.k[var6], this.Y[var6], this.d[var6], this.w[var6], this.O[0], this.O[1]);
               this.k[var6] = this.O[0];
               this.Y[var6] = this.O[1];
            }
         }

         class09726 var7 = this.t;
         this.t = var3;
         int var8 = this.Q;
         this.o
            .offer(
               new class09720(
                  var3,
                  var7,
                  var2,
                  var2,
                  Arrays.copyOf(this.l, var8),
                  Arrays.copyOf(this.k, var8),
                  Arrays.copyOf(this.Y, var8),
                  Arrays.copyOf(this.d, var8),
                  Arrays.copyOf(this.w, var8),
                  var8
               )
            );
      }
   }

   private class09742(byte[] var1, class09734 var2, Executor var3) {
      if (var3 == null) {
         throw new IllegalArgumentException("bakeExecutor");
      } else {
         this.y = var2;
         this.L = var1;
         this.q = var3;
         this.i = var2.y();
         this.R = this.i.N();
         this.M = var2.L();
         this.B = var2.u();
         this.u = N(var1);
         MemoryStack var4 = MemoryStack.stackPush();

         try {
            PointerBuffer var5 = var4.mallocPointer(1);
            if (FreeType.FT_Init_FreeType(var5) != 0) {
               throw new IllegalStateException("FT_Init_FreeType failed");
            }

            this.z = var5.get(0);
         } catch (Throwable var10) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var8) {
                  var10.addSuppressed(var8);
               }
            }

            throw var10;
         }

         if (var4 != null) {
            var4.close();
         }

         this.U = MemoryUtil.memAlloc(var1.length);
         this.U.put(var1).flip();
         var4 = MemoryStack.stackPush();

         try {
            PointerBuffer var13 = var4.mallocPointer(1);
            if (FreeType.FT_New_Memory_Face(this.z, this.U, 0L, var13) != 0) {
               MemoryUtil.memFree(this.U);
               FreeType.FT_Done_FreeType(this.z);
               throw new IllegalStateException("FT_New_Memory_Face failed");
            }

            this.E = FT_Face.create(var13.get(0));
         } catch (Throwable var9) {
            if (var4 != null) {
               try {
                  var4.close();
               } catch (Throwable var7) {
                  var9.addSuppressed(var7);
               }
            }

            throw var9;
         }

         if (var4 != null) {
            var4.close();
         }

         this.W = Math.max(1, this.E.units_per_EM() & '\uffff');
         this.E();
         this.m = FreeType.FT_HAS_KERNING(this.E);
         this.P = class09730.N(var1);
         this.s = new class09718(
            (double)this.E.ascender() / (double)this.W, (double)this.E.descender() / (double)this.W, (double)this.E.height() / (double)this.W
         );
         class09726 var12 = new class09726(var2.i(), var2.i(), this.R);
         this.j = var12;
         this.t = var12;
      }
   }

   public class09734 B() {
      return this.y;
   }

   public long Z() {
      return this.u;
   }

   public int i() {
      return this.j.y();
   }

   private int[] s() {
      int var1 = this.Q;
      int[] var2 = new int[var1];
      int var3 = 0;

      while (var3 < var1) {
         var2[var3] = var3++;
      }

      for (int var7 = 1; var7 < var1; var7++) {
         int var4 = var2[var7];
         int var5 = this.w[var4];

         int var6;
         for (var6 = var7 - 1; var6 >= 0 && this.w[var2[var6]] < var5; var6--) {
            var2[var6 + 1] = var2[var6];
         }

         var2[var6 + 1] = var4;
      }

      return var2;
   }

   private class09745 m() {
      class09745 var1 = this.K.poll();
      if (var1 != null) {
         return var1;
      } else {
         var1 = class09745.N(this.L);
         this.y(var1);
         this.V.add(var1);
         return var1;
      }
   }

   private void U() {
      this.e = true;
      this.H = N(this::W, "msdf-atlas-coordinator");
      this.H.start();
   }

   @Override
   public void close() {
      this.e = false;
      this.J.offer(N);

      try {
         this.H.join();
      } catch (InterruptedException var5) {
         Thread.currentThread().interrupt();
      }

      synchronized (this.V) {
         Iterator<class09745> var2 = this.V.iterator();

         while (var2.hasNext()) {
            var2.next().close();
         }

         this.V.clear();
      }

      this.K.clear();
      this.N();
      this.j.i();
      FreeType.FT_Done_Face(this.E);
      FreeType.FT_Done_FreeType(this.z);
      MemoryUtil.memFree(this.U);
   }

   public class09718 z() {
      return this.s;
   }

   private class09761 u(int var1) {
      class09745 var2 = this.m();

      class09761 var3;
      try {
         var3 = var2.N(var1, this.M, this.B, this.i);
      } finally {
         this.N(var2);
      }

      return var3;
   }

   public int u() {
      return this.j.N();
   }

   private void y(Path var1) {
      class09746 var2 = class09758.N(var1);
      if (var2 != null) {
         if (var2.N() == this.u
            && var2.y() == this.i.ordinal()
            && var2.L() == this.M
            && var2.u() == this.B
            && var2.R() == this.R
            && Double.compare(var2.i(), this.y.M()) == 0) {
            this.g = var2.M();
            this.I = var2.B();
         }
      }
   }

   public double y(int var1) {
      int var2 = FreeType.FT_Get_Char_Index(this.E, (long)var1);
      if (var2 == 0) {
         return 0.0;
      } else {
         MemoryStack var3 = MemoryStack.stackPush();

         double var9;
         label47: {
            try {
               CLongBuffer var4 = var3.mallocCLong(1);
               if (FreeType.FT_Get_Advance(this.E, var2, 1, var4) != 0) {
                  var9 = 0.0;
                  break label47;
               }

               var9 = (double)var4.get(0) / (double)this.W;
            } catch (Throwable var8) {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var7) {
                     var8.addSuppressed(var7);
                  }
               }

               throw var8;
            }

            if (var3 != null) {
               var3.close();
            }

            return var9;
         }

         if (var3 != null) {
            var3.close();
         }

         return var9;
      }
   }

   private void y(class09745 var1) {
      double var2 = this.y.M();
      if (!Double.isNaN(var2) && var1.y() != null) {
         var1.N((float)var2);
      }
   }

   public boolean y() {
      return this.b.N();
   }

   private void E() {
      double var1 = this.y.M();
      if (!Double.isNaN(var1)) {
         MemoryStack var3 = MemoryStack.stackPush();

         label128: {
            label129: {
               try {
                  PointerBuffer var4 = var3.mallocPointer(1);
                  if (FreeType.FT_Get_MM_Var(this.E, var4) != 0) {
                     break label128;
                  }

                  FT_MM_Var var5 = FT_MM_Var.create(var4.get(0));

                  try {
                     int var6 = var5.num_axis();
                     long var7 = var5.axis().address();
                     long[] var9 = new long[var6];
                     int var10 = -1;

                     for (int var11 = 0; var11 < var6; var11++) {
                        FT_Var_Axis var12 = FT_Var_Axis.create(var7 + (long)var11 * (long)FT_Var_Axis.SIZEOF);
                        var9[var11] = var12.def();
                        if (var12.tag() == 2003265652L) {
                           var10 = var11;
                        }
                     }

                     if (var10 < 0) {
                        break label129;
                     }

                     var9[var10] = Math.round(var1 * 65536.0);
                     CLongBuffer var20 = var3.mallocCLong(var6);
                     var20.put(var9).flip();
                     FreeType.FT_Set_Var_Design_Coordinates(this.E, var20);
                  } finally {
                     FreeType.FT_Done_MM_Var(this.z, var5);
                  }
               } catch (Throwable var19) {
                  if (var3 != null) {
                     try {
                        var3.close();
                     } catch (Throwable var17) {
                        var19.addSuppressed(var17);
                     }
                  }

                  throw var19;
               }

               if (var3 != null) {
                  var3.close();
               }

               return;
            }

            if (var3 != null) {
               var3.close();
            }

            return;
         }

         if (var3 != null) {
            var3.close();
         }
      }
   }

   private void N(int var1, int var2, int var3, int var4, int var5) {
      if (this.Q == this.l.length) {
         int var6 = this.l.length * 2;
         this.l = Arrays.copyOf(this.l, var6);
         this.d = Arrays.copyOf(this.d, var6);
         this.w = Arrays.copyOf(this.w, var6);
         this.k = Arrays.copyOf(this.k, var6);
         this.Y = Arrays.copyOf(this.Y, var6);
      }

      this.l[this.Q] = var1;
      this.d[this.Q] = var2;
      this.w[this.Q] = var3;
      this.k[this.Q] = var4;
      this.Y[this.Q] = var5;
      this.Q++;
   }

   private static int[] N(class09761[] var0) {
      int var1 = var0.length;
      int[] var2 = new int[var1];
      int var3 = 0;

      while (var3 < var1) {
         var2[var3] = var3++;
      }

      for (int var7 = 1; var7 < var1; var7++) {
         int var4 = var2[var7];
         int var5 = var0[var4] == null ? -1 : var0[var4].u();

         int var6;
         for (var6 = var7 - 1; var6 >= 0 && (var0[var2[var6]] == null ? -1 : var0[var2[var6]].u()) < var5; var6--) {
            var2[var6 + 1] = var2[var6];
         }

         var2[var6 + 1] = var4;
      }

      return var2;
   }

   private void N(int var1, class09761 var2) {
      if (this.G.add(var1)) {
         if (var2.N()) {
            this.N(var1, 0, 0, 0, 0);
            this.o.offer(N(var1, var2, 0, 0, 0, 0));
         } else {
            int var3 = var2.L();
            int var4 = var2.u();

            while (!this.t.N(var3, var4, 1, this.O)) {
               this.P();
            }

            int var5 = this.O[0];
            int var6 = this.O[1];
            this.t.N(var2.y(), var3, var4, var5, var6);
            this.N(var1, var3, var4, var5, var6);
            this.o.offer(N(var1, var2, var5, var6, var3, var4));
         }
      }
   }

   public static class09742 N(Path var0, class09734 var1, Executor var2) throws IOException {
      class09742 var3 = new class09742(Files.readAllBytes(var0), var1, var2);
      var3.U();
      return var3;
   }

   private static class09750 N(int var0, class09761 var1, int var2, int var3, int var4, int var5) {
      return new class09750(var0, (float)var1.R(), (float)var1.M(), (float)var1.B(), (float)var1.Z(), (float)var1.z(), var2, var3, var4, var5, 0);
   }

   public void N(Path var1) throws IOException {
      class09758.N(var1, this.u, this.y, this.T, this.j);
   }

   private static Thread N(Runnable var0, String var1) {
      Thread var2 = new Thread(var0, var1);
      var2.setDaemon(true);
      return var2;
   }

   private static long N(byte[] var0) {
      long var1 = -3750763034362895579L;

      for (byte var6 : var0) {
         var1 ^= (long)(var6 & 255);
         var1 *= 1099511628211L;
      }

      return var1;
   }

   private static void N(int var0, Exception var1) {
      System.err.println("[FontAtlas] failed to bake U+" + Integer.toHexString(var0) + ": " + var1);
   }

   public void N(int var1) {
      if (this.T.N(var1) == -2) {
         this.T.y(var1);
         if (this.n == this.v.length) {
            this.v = Arrays.copyOf(this.v, this.v.length * 2);
         }

         this.v[this.n++] = var1;
      }
   }

   public class09731 N() {
      this.b.B();
      this.b.u = this.R;
      this.b.i = 0;
      this.b.y = this.j.N();
      this.b.L = this.j.y();

      class09724 var1;
      while ((var1 = this.o.poll()) != null) {
         if (var1 instanceof class09750) {
            class09750 var2 = (class09750)var1;
            this.T.N(var2);
            if (var2.Z() > 0) {
               this.b.N(var2.M(), var2.B(), var2.Z(), var2.z());
            }
         } else if (var1 instanceof class09720 var3) {
            this.N(var3);
         }
      }

      if (this.n > 0) {
         this.J.offer(Arrays.copyOf(this.v, this.n));
         this.n = 0;
      }

      return this.b;
   }

   public double N(int var1, int var2) {
      int var3 = FreeType.FT_Get_Char_Index(this.E, (long)var1);
      int var4 = FreeType.FT_Get_Char_Index(this.E, (long)var2);
      if (var3 == 0 || var4 == 0) {
         return 0.0;
      } else if (!this.P.N()) {
         return (double)this.P.N(var3, var4) / (double)this.W;
      } else if (this.m) {
         MemoryStack var5 = MemoryStack.stackPush();

         double var11;
         label58: {
            try {
               FT_Vector var6 = FT_Vector.malloc(var5);
               if (FreeType.FT_Get_Kerning(this.E, var3, var4, 2, var6) != 0) {
                  var11 = 0.0;
                  break label58;
               }

               var11 = (double)var6.x() / (double)this.W;
            } catch (Throwable var10) {
               if (var5 != null) {
                  try {
                     var5.close();
                  } catch (Throwable var9) {
                     var10.addSuppressed(var9);
                  }
               }

               throw var10;
            }

            if (var5 != null) {
               var5.close();
            }

            return var11;
         }

         if (var5 != null) {
            var5.close();
         }

         return var11;
      } else {
         return 0.0;
      }
   }

   public static class09742 N(byte[] var0, class09734 var1, Executor var2) {
      class09742 var3 = new class09742((byte[])var0.clone(), var1, var2);
      var3.U();
      return var3;
   }

   private void N(class09720 var1) {
      this.j = var1.N();
      int[] var2 = var1.i();
      int[] var3 = var1.R();
      int[] var4 = var1.M();
      int[] var5 = var1.B();
      int[] var6 = var1.Z();

      for (int var7 = 0; var7 < var1.z(); var7++) {
         int var8 = this.T.L(var2[var7]);
         if (var8 >= 0) {
            this.T.N(var8, var3[var7], var4[var7], var5[var7], var6[var7], 0);
         }
      }

      if (var1.y() != null) {
         var1.y().i();
      }

      this.b.N = true;
      this.b.y = this.j.N();
      this.b.L = this.j.y();
      this.b.Z();

      for (int var9 = 0; var9 < var1.z(); var9++) {
         if (var5[var9] > 0) {
            this.b.N(var3[var9], var4[var9], var5[var9], var6[var9]);
         }
      }
   }

   public static class09742 N(Path var0, class09734 var1, Path var2, Executor var3) throws IOException {
      class09742 var4 = new class09742(Files.readAllBytes(var0), var1, var3);
      var4.y(var2);
      var4.U();
      return var4;
   }

   public boolean N(int var1, float var2, class09719 var3) {
      int var4 = this.T.L(var1);
      if (var4 >= 0) {
         this.T.N(var4, var2, this.j.N(), this.j.y(), (float)this.B, (float)this.M, var3);
         return true;
      } else if (var4 == -1) {
         return false;
      } else {
         this.N(var1);
         return false;
      }
   }

   public static class09742 N(byte[] var0, class09734 var1, Path var2, Executor var3) {
      class09742 var4 = new class09742((byte[])var0.clone(), var1, var3);
      var4.y(var2);
      var4.U();
      return var4;
   }

   private void N(int[] var1) {
      int var2 = 0;

      for (int var6 : var1) {
         if (!this.G.contains(var6)) {
            var1[var2++] = var6;
         }
      }

      if (var2 != 0) {
         class09761[] var9 = new class09761[var2];
         CompletableFuture[] var10 = new CompletableFuture[var2];

         for (int var11 = 0; var11 < var2; var11++) {
            int var14 = var1[var11];
            var10[var11] = CompletableFuture.supplyAsync(() -> this.u(var14), this.q);
         }

         for (int var12 = 0; var12 < var2; var12++) {
            try {
               var9[var12] = (class09761)var10[var12].get();
            } catch (Exception var8) {
               var9[var12] = null;
               N(var1[var12], var8);
            }
         }

         int[] var13 = N(var9);

         for (int var15 = 0; var15 < var2; var15++) {
            int var7 = var13[var15];
            if (var9[var7] != null) {
               this.N(var1[var7], var9[var7]);
            }
         }
      }
   }

   private void N(class09745 var1) {
      this.K.offer(var1);
   }

   private void W() {
      try {
         if (this.I != null) {
            int[] var1 = N(this.I);

            for (int var2 = 0; var2 < this.I.length; var2++) {
               int var3 = var1[var2];
               if (this.I[var3] != null) {
                  this.N(this.g[var3], this.I[var3]);
               }
            }

            this.I = null;
            this.g = null;
         }

         while (true) {
            int[] var5 = this.J.take();
            if (var5 == N) {
               break;
            }

            this.N(var5);
         }
      } catch (InterruptedException var4) {
         Thread.currentThread().interrupt();
      }
   }

   public int R() {
      return this.R;
   }
}
