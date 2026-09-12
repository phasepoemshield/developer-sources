package Nursultan;

import java.nio.ByteBuffer;
import java.nio.DoubleBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.lwjgl.CLongBuffer;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.system.MemoryUtil;
import org.lwjgl.util.freetype.FT_Face;
import org.lwjgl.util.freetype.FT_MM_Var;
import org.lwjgl.util.freetype.FT_Var_Axis;
import org.lwjgl.util.freetype.FreeType;
import org.lwjgl.util.msdfgen.MSDFGen;
import org.lwjgl.util.msdfgen.MSDFGenBitmap;
import org.lwjgl.util.msdfgen.MSDFGenBounds;
import org.lwjgl.util.msdfgen.MSDFGenExt;
import org.lwjgl.util.msdfgen.MSDFGenRange;
import org.lwjgl.util.msdfgen.MSDFGenTransform;
import org.lwjgl.util.msdfgen.MSDFGenVector2;

public final class class09745 implements AutoCloseable {
   public static final double N = 3.0;
   private static final long y = 2003265652L;
   private final FT_Face L;
   private long u;
   private long i;
   private ByteBuffer R;
   private boolean M = true;
   private final class09749 B;
   private final int Z;
   private final long[] z;
   private float U;

   public float L() {
      return this.U;
   }

   public class09755 L(int var1, int var2, int var3, double var4) {
      return this.N(0, 1, false, var1, var2, var3, var4, var4);
   }

   private void L(float var1) {
      MemoryStack var2 = MemoryStack.stackPush();

      try {
         CLongBuffer var3 = var2.mallocCLong(this.z.length);
         var3.put(this.z);
         var3.put(this.Z, u(var1));
         var3.flip();
         y(FreeType.FT_Set_Var_Design_Coordinates(this.L, var3), "FT_Set_Var_Design_Coordinates");
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }
   }

   private class09745(long var1, FT_Face var3, long var4, ByteBuffer var6, class09757 var7) {
      this.u = var1;
      this.L = var3;
      this.i = var4;
      this.R = var6;
      if (var7 != null) {
         this.B = var7.N();
         this.Z = var7.y();
         this.z = var7.L();
         this.U = var7.N().y();
      } else {
         this.B = null;
         this.Z = -1;
         this.z = null;
         this.U = Float.NaN;
      }
   }

   @Override
   public void close() {
      if (this.i != 0L) {
         MSDFGenExt.msdf_ft_font_destroy(this.i);
         this.i = 0L;
      }

      if (this.u != 0L) {
         FreeType.FT_Done_Face(this.L);
         FreeType.FT_Done_FreeType(this.u);
         this.u = 0L;
      }

      if (this.R != null) {
         MemoryUtil.memFree(this.R);
         this.R = null;
      }
   }

   private static long u() {
      MemoryStack var0 = MemoryStack.stackPush();

      long var2;
      try {
         PointerBuffer var1 = var0.mallocPointer(1);
         y(FreeType.FT_Init_FreeType(var1), "FT_Init_FreeType");
         var2 = var1.get(0);
      } catch (Throwable var5) {
         if (var0 != null) {
            try {
               var0.close();
            } catch (Throwable var4) {
               var5.addSuppressed(var4);
            }
         }

         throw var5;
      }

      if (var0 != null) {
         var0.close();
      }

      return var2;
   }

   private static long u(float var0) {
      return Math.round((double)var0 * 65536.0);
   }

   private static byte[] y(MSDFGenBitmap var0, int var1) {
      MemoryStack var2 = MemoryStack.stackPush();

      byte[] var9;
      try {
         PointerBuffer var3 = var2.mallocPointer(1);
         N(MSDFGen.msdf_bitmap_get_pixels(var0, var3), "get_pixels");
         FloatBuffer var4 = MemoryUtil.memFloatBuffer(var3.get(0), var1);
         byte[] var5 = new byte[var1];

         for (int var6 = 0; var6 < var1; var6++) {
            var5[var6] = y(var4.get(var6));
         }

         var9 = var5;
      } catch (Throwable var8) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var2 != null) {
         var2.close();
      }

      return var9;
   }

   private static void y(int var0, String var1) {
      if (var0 != 0) {
         throw new IllegalStateException("FreeType " + var1 + " failed (err=" + var0 + ")");
      }
   }

   public class09755 y(int var1, int var2, int var3, double var4) {
      return this.N(3, 4, true, var1, var2, var3, var4, var4);
   }

   public class09749 y() {
      return this.B;
   }

   public static byte y(float var0) {
      int var1 = (int)(var0 * 256.0F);
      if (var1 < 0) {
         var1 = 0;
      } else if (var1 > 255) {
         var1 = 255;
      }

      return (byte)var1;
   }

   private class09755 N(int var1, int var2, boolean var3, int var4, int var5, int var6, double var7, double var9) {
      MemoryStack var11 = MemoryStack.stackPush();

      class09755 var32;
      try {
         DoubleBuffer var12 = var11.mallocDouble(1);
         PointerBuffer var13 = var11.mallocPointer(1);
         N(MSDFGenExt.msdf_ft_font_load_glyph(this.i, var4, 1, var12, var13), "load_glyph");
         long var14 = var13.get(0);
         long var16 = this.M ? class09716.N(var14) : 0L;
         long var18 = var16 != 0L ? var16 : var14;

         try {
            N(MSDFGen.msdf_shape_normalize(var18), "shape_normalize");
            if (var16 != 0L) {
               N(MSDFGen.msdf_shape_orient_contours(var18), "orient_contours");
            }

            if (var3) {
               N(MSDFGen.msdf_shape_edge_colors_simple(var18, 3.0), "edge_colors");
            }

            MSDFGenBounds var20 = MSDFGenBounds.malloc(var11);
            N(MSDFGen.msdf_shape_get_bounds(var18, var20), "get_bounds");
            double var21 = Math.max(var20.r() - var20.l(), var20.t() - var20.b());
            double var23 = var21 > 0.0 ? ((double)Math.min(var5, var6) - 2.0 * var9) / var21 : 1.0;
            MSDFGenBitmap var25 = MSDFGenBitmap.malloc(var11);
            N(MSDFGen.msdf_bitmap_alloc(var1, var5, var6, var25), "bitmap_alloc");

            try {
               MSDFGenVector2 var26 = MSDFGenVector2.malloc(var11).set(var23, var23);
               MSDFGenVector2 var27 = MSDFGenVector2.malloc(var11).set(var9 / var23 - var20.l(), var9 / var23 - var20.b());
               double var28 = var7 / var23;
               MSDFGenRange var30 = MSDFGenRange.malloc(var11).set(-var28 / 2.0, var28 / 2.0);
               MSDFGenTransform var31 = MSDFGenTransform.malloc(var11);
               var31.set(var26, var27, var30);
               N(var1, var25, var18, var31);
               var32 = new class09755(N(var25, var5 * var6 * var2), var5, var6, var2, var12.get(0));
            } finally {
               MSDFGen.msdf_bitmap_free(var25);
            }
         } finally {
            if (var16 != 0L) {
               MSDFGen.msdf_shape_free(var16);
            }

            MSDFGen.msdf_shape_free(var14);
         }
      } catch (Throwable var46) {
         if (var11 != null) {
            try {
               var11.close();
            } catch (Throwable var43) {
               var46.addSuppressed(var43);
            }
         }

         throw var46;
      }

      if (var11 != null) {
         var11.close();
      }

      return var32;
   }

   public class09745 N(boolean var1) {
      this.M = var1;
      return this;
   }

   private static class09757 N(long var0, FT_Face var2) {
      MemoryStack var3 = MemoryStack.stackPush();

      Object var21;
      label129: {
         class09757 var23;
         label130: {
            try {
               PointerBuffer var4 = var3.mallocPointer(1);
               if (FreeType.FT_Get_MM_Var(var2, var4) != 0) {
                  var21 = null;
                  break label129;
               }

               FT_MM_Var var5 = FT_MM_Var.create(var4.get(0));

               try {
                  int var6 = var5.num_axis();
                  long var7 = var5.axis().address();
                  long[] var9 = new long[var6];
                  int var10 = -1;
                  class09749 var11 = null;

                  for (int var12 = 0; var12 < var6; var12++) {
                     FT_Var_Axis var13 = FT_Var_Axis.create(var7 + (long)var12 * (long)FT_Var_Axis.SIZEOF);
                     var9[var12] = var13.def();
                     if (var13.tag() == 2003265652L) {
                        var10 = var12;
                        var11 = new class09749(N(var13.minimum()), N(var13.def()), N(var13.maximum()));
                     }
                  }

                  if (var10 < 0) {
                     var23 = null;
                     break label130;
                  }

                  var23 = new class09757(var11, var10, var9);
               } finally {
                  FreeType.FT_Done_MM_Var(var0, var5);
               }
            } catch (Throwable var20) {
               if (var3 != null) {
                  try {
                     var3.close();
                  } catch (Throwable var18) {
                     var20.addSuppressed(var18);
                  }
               }

               throw var20;
            }

            if (var3 != null) {
               var3.close();
            }

            return var23;
         }

         if (var3 != null) {
            var3.close();
         }

         return var23;
      }

      if (var3 != null) {
         var3.close();
      }

      return (class09757)var21;
   }

   private static float[] N(MSDFGenBitmap var0, int var1) {
      MemoryStack var2 = MemoryStack.stackPush();

      float[] var6;
      try {
         PointerBuffer var3 = var2.mallocPointer(1);
         N(MSDFGen.msdf_bitmap_get_pixels(var0, var3), "get_pixels");
         FloatBuffer var4 = MemoryUtil.memFloatBuffer(var3.get(0), var1);
         float[] var5 = new float[var1];
         var4.get(var5);
         var6 = var5;
      } catch (Throwable var8) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var7) {
               var8.addSuppressed(var7);
            }
         }

         throw var8;
      }

      if (var2 != null) {
         var2.close();
      }

      return var6;
   }

   public class09761 N(int var1, double var2, double var4, class09735 var6) {
      int var7 = (int)Math.ceil(var4 / 2.0) + 1;
      double var8 = var2;
      MemoryStack var10 = MemoryStack.stackPush();

      class09761 var46;
      label188: {
         class09761 var32;
         try {
            DoubleBuffer var11 = var10.mallocDouble(1);
            PointerBuffer var12 = var10.mallocPointer(1);
            N(MSDFGenExt.msdf_ft_font_load_glyph(this.i, var1, 1, var11, var12), "load_glyph");
            long var13 = var12.get(0);
            long var15 = this.M ? class09716.N(var13) : 0L;
            long var17 = var15 != 0L ? var15 : var13;

            try {
               N(MSDFGen.msdf_shape_normalize(var17), "shape_normalize");
               if (var15 != 0L) {
                  N(MSDFGen.msdf_shape_orient_contours(var17), "orient_contours");
               }

               if (var6.L()) {
                  N(MSDFGen.msdf_shape_edge_colors_simple(var17, 3.0), "edge_colors");
               }

               MSDFGenBounds var19 = MSDFGenBounds.malloc(var10);
               N(MSDFGen.msdf_shape_get_bounds(var17, var19), "get_bounds");
               double var20 = var19.l();
               double var22 = var19.b();
               double var24 = var19.r();
               double var26 = var19.t();
               double var28 = var24 - var20;
               double var30 = var26 - var22;
               if (var28 > 0.0 && var30 > 0.0) {
                  int var61 = (int)Math.ceil(var28 * var8) + 2 * var7;
                  int var33 = (int)Math.ceil(var30 * var8) + 2 * var7;
                  MSDFGenBitmap var34 = MSDFGenBitmap.malloc(var10);
                  N(MSDFGen.msdf_bitmap_alloc(var6.y(), var61, var33, var34), "bitmap_alloc");

                  try {
                     MSDFGenVector2 var35 = MSDFGenVector2.malloc(var10).set(var8, var8);
                     MSDFGenVector2 var36 = MSDFGenVector2.malloc(var10).set((double)var7 / var8 - var20, (double)var7 / var8 - var22);
                     double var37 = var4 / var8;
                     MSDFGenRange var39 = MSDFGenRange.malloc(var10).set(-var37 / 2.0, var37 / 2.0);
                     MSDFGenTransform var40 = MSDFGenTransform.malloc(var10);
                     var40.set(var35, var36, var39);
                     N(var6.y(), var34, var17, var40);
                     byte[] var41 = y(var34, var61 * var33 * var6.N());
                     double var42 = var20 - (double)var7 / var8;
                     double var44 = var22 - (double)var7 / var8;
                     var46 = new class09761(
                        var41, var61, var33, var6.N(), var42, var44, var42 + (double)var61 / var8, var44 + (double)var33 / var8, var11.get(0)
                     );
                     break label188;
                  } finally {
                     MSDFGen.msdf_bitmap_free(var34);
                  }
               }

               var32 = new class09761(new byte[0], 0, 0, var6.N(), 0.0, 0.0, 0.0, 0.0, var11.get(0));
            } finally {
               if (var15 != 0L) {
                  MSDFGen.msdf_shape_free(var15);
               }

               MSDFGen.msdf_shape_free(var13);
            }
         } catch (Throwable var60) {
            if (var10 != null) {
               try {
                  var10.close();
               } catch (Throwable var57) {
                  var60.addSuppressed(var57);
               }
            }

            throw var60;
         }

         if (var10 != null) {
            var10.close();
         }

         return var32;
      }

      if (var10 != null) {
         var10.close();
      }

      return var46;
   }

   private static void N(int var0, MSDFGenBitmap var1, long var2, MSDFGenTransform var4) {
      switch (var0) {
         case 0:
            N(MSDFGen.msdf_generate_sdf(var1, var2, var4), "generate_sdf");
            break;
         case 1:
            N(MSDFGen.msdf_generate_psdf(var1, var2, var4), "generate_psdf");
            break;
         case 2:
            N(MSDFGen.msdf_generate_msdf(var1, var2, var4), "generate_msdf");
            break;
         case 3:
            N(MSDFGen.msdf_generate_mtsdf(var1, var2, var4), "generate_mtsdf");
            break;
         default:
            throw new IllegalArgumentException("unsupported bitmap type " + var0);
      }
   }

   private static class09745 N(long var0, long var2, ByteBuffer var4) {
      FT_Face var5 = FT_Face.create(var2);
      class09757 var6 = N(var0, var5);
      MemoryStack var7 = MemoryStack.stackPush();

      class09745 var10;
      try {
         PointerBuffer var8 = var7.mallocPointer(1);
         int var9 = MSDFGenExt.msdf_ft_adopt_font(var2, var8);
         if (var9 != 0) {
            FreeType.FT_Done_Face(var5);
            FreeType.FT_Done_FreeType(var0);
            if (var4 != null) {
               MemoryUtil.memFree(var4);
            }

            throw new IllegalStateException("msdf_ft_adopt_font failed (err=" + var9 + ")");
         }

         var10 = new class09745(var0, var5, var8.get(0), var4, var6);
      } catch (Throwable var12) {
         if (var7 != null) {
            try {
               var7.close();
            } catch (Throwable var11) {
               var12.addSuppressed(var11);
            }
         }

         throw var12;
      }

      if (var7 != null) {
         var7.close();
      }

      return var10;
   }

   public static class09745 N(byte[] var0) {
      long var1 = u();
      ByteBuffer var3 = MemoryUtil.memAlloc(var0.length);
      var3.put(var0).flip();
      MemoryStack var4 = MemoryStack.stackPush();

      class09745 var7;
      try {
         PointerBuffer var5 = var4.mallocPointer(1);
         int var6 = FreeType.FT_New_Memory_Face(var1, var3, 0L, var5);
         if (var6 != 0) {
            MemoryUtil.memFree(var3);
            FreeType.FT_Done_FreeType(var1);
            throw new IllegalStateException("FT_New_Memory_Face failed (err=" + var6 + ")");
         }

         var7 = N(var1, var5.get(0), var3);
      } catch (Throwable var9) {
         if (var4 != null) {
            try {
               var4.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var4 != null) {
         var4.close();
      }

      return var7;
   }

   public static class09745 N(String var0) {
      long var1 = u();
      MemoryStack var3 = MemoryStack.stackPush();

      class09745 var6;
      try {
         PointerBuffer var4 = var3.mallocPointer(1);
         int var5 = FreeType.FT_New_Face(var1, var0, 0L, var4);
         if (var5 != 0) {
            FreeType.FT_Done_FreeType(var1);
            throw new IllegalStateException("FT_New_Face failed for '" + var0 + "' (err=" + var5 + ")");
         }

         var6 = N(var1, var4.get(0), null);
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

      return var6;
   }

   private static void N(int var0, String var1) {
      if (var0 != 0) {
         throw new IllegalStateException("msdfgen " + var1 + " failed (err=" + var0 + ")");
      }
   }

   public class09745 N(float var1) {
      if (!Float.isFinite(var1) || var1 <= 0.0F) {
         throw new IllegalArgumentException("weight must be finite and positive");
      } else if (this.B == null) {
         throw new IllegalStateException("font has no variable 'wght' axis; weight cannot be applied");
      } else {
         float var2 = Math.max(this.B.N(), Math.min(this.B.L(), var1));
         this.L(var2);
         this.U = var2;
         return this;
      }
   }

   public class09755 N(int var1, int var2, int var3, double var4) {
      return this.N(2, 3, true, var1, var2, var3, var4, var4);
   }

   public int N(int var1) {
      MemoryStack var2 = MemoryStack.stackPush();

      int var4;
      try {
         IntBuffer var3 = var2.mallocInt(1);
         N(MSDFGenExt.msdf_ft_font_get_glyph_index(this.i, var1, var3), "get_glyph_index");
         var4 = var3.get(0);
      } catch (Throwable var6) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var5) {
               var6.addSuppressed(var5);
            }
         }

         throw var6;
      }

      if (var2 != null) {
         var2.close();
      }

      return var4;
   }

   private static float N(long var0) {
      return (float)((double)var0 / 65536.0);
   }

   public boolean N() {
      return this.M;
   }
}
