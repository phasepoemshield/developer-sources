package Nursultan;

import java.awt.geom.Area;
import java.awt.geom.PathIterator;
import java.awt.geom.Path2D.Double;
import java.util.ArrayList;
import java.util.List;
import org.lwjgl.PointerBuffer;
import org.lwjgl.system.MemoryStack;
import org.lwjgl.util.msdfgen.MSDFGen;
import org.lwjgl.util.msdfgen.MSDFGenVector2;

public final class class09716 {
   private static final double N = 1.0E-6;
   private static final double y = 1.0E-7;
   private static volatile class09747 L = class09747.JTS;

   static long L(long var0) {
      MemoryStack var2 = MemoryStack.stackPush();

      long var4;
      try {
         PointerBuffer var3 = var2.mallocPointer(1);
         N(MSDFGen.msdf_shape_add_contour(var0, var3), "add_contour");
         var4 = var3.get(0);
      } catch (Throwable var7) {
         if (var2 != null) {
            try {
               var2.close();
            } catch (Throwable var6) {
               var7.addSuppressed(var6);
            }
         }

         throw var7;
      }

      if (var2 != null) {
         var2.close();
      }

      return var4;
   }

   private class09716() {
   }

   private static long u(long var0) {
      Double var2 = y(var0);
      return var2 == null ? 0L : N(new Area(var2));
   }

   static Double y(long var0) {
      MemoryStack var2 = MemoryStack.stackPush();

      Double var25;
      label78: {
         Double var26;
         try {
            PointerBuffer var3 = var2.mallocPointer(1);
            N(MSDFGen.msdf_shape_get_contour_count(var0, var3), "contour_count");
            long var4 = var3.get(0);
            if (var4 == 0L) {
               var25 = null;
               break label78;
            }

            var25 = new Double(1);
            MSDFGenVector2 var7 = MSDFGenVector2.malloc(var2);

            for (long var8 = 0L; var8 < var4; var8++) {
               PointerBuffer var10 = var2.mallocPointer(1);
               N(MSDFGen.msdf_shape_get_contour(var0, var8, var10), "get_contour");
               long var11 = var10.get(0);
               PointerBuffer var13 = var2.mallocPointer(1);
               N(MSDFGen.msdf_contour_get_edge_count(var11, var13), "edge_count");
               long var14 = var13.get(0);
               if (var14 != 0L) {
                  boolean var16 = false;

                  for (long var17 = 0L; var17 < var14; var17++) {
                     PointerBuffer var19 = var2.mallocPointer(1);
                     N(MSDFGen.msdf_contour_get_edge(var11, var17, var19), "get_edge");
                     double[] var22 = N(var19.get(0), var7);
                     if (!var16) {
                        var25.moveTo(var22[0], var22[1]);
                        var16 = true;
                     }

                     switch ((var22.length - 2) / 2) {
                        case 1:
                           var25.lineTo(var22[2], var22[3]);
                           break;
                        case 2:
                           var25.quadTo(var22[2], var22[3], var22[4], var22[5]);
                           break;
                        case 3:
                           var25.curveTo(var22[2], var22[3], var22[4], var22[5], var22[6], var22[7]);
                           break;
                        default:
                           throw new IllegalStateException("unexpected point count " + var22.length);
                     }
                  }

                  if (var16) {
                     var25.closePath();
                  }
               }
            }

            var26 = var25;
         } catch (Throwable var24) {
            if (var2 != null) {
               try {
                  var2.close();
               } catch (Throwable var23) {
                  var24.addSuppressed(var23);
               }
            }

            throw var24;
         }

         if (var2 != null) {
            var2.close();
         }

         return var26;
      }

      if (var2 != null) {
         var2.close();
      }

      return var25;
   }

   static long y() {
      MemoryStack var0 = MemoryStack.stackPush();

      long var2;
      try {
         PointerBuffer var1 = var0.mallocPointer(1);
         N(MSDFGen.msdf_shape_alloc(var1), "shape_alloc");
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

   private static void N(long var0, int var2, MSDFGenVector2 var3, double var4, double var6) {
      var3.set(var4, var6);
      N(MSDFGen.msdf_segment_set_point(var0, (long)var2, var3), "set_point");
   }

   private static long N(MemoryStack var0, int var1) {
      PointerBuffer var2 = var0.mallocPointer(1);
      N(MSDFGen.msdf_segment_alloc(var1, var2), "segment_alloc");
      return var2.get(0);
   }

   static void N(long var0, double var2, double var4, double var6, double var8, double var10, double var12, double var14, double var16) {
      MemoryStack var18 = MemoryStack.stackPush();

      try {
         long var19 = N(var18, 2);
         MSDFGenVector2 var21 = MSDFGenVector2.malloc(var18);
         N(var19, 0, var21, var2, var4);
         N(var19, 1, var21, var6, var8);
         N(var19, 2, var21, var10, var12);
         N(var19, 3, var21, var14, var16);
         N(MSDFGen.msdf_contour_add_edge(var0, var19), "add_edge");
      } catch (Throwable var23) {
         if (var18 != null) {
            try {
               var18.close();
            } catch (Throwable var22) {
               var23.addSuppressed(var22);
            }
         }

         throw var23;
      }

      if (var18 != null) {
         var18.close();
      }
   }

   static void N(long var0, double var2, double var4, double var6, double var8, double var10, double var12) {
      MemoryStack var14 = MemoryStack.stackPush();

      try {
         long var15 = N(var14, 1);
         MSDFGenVector2 var17 = MSDFGenVector2.malloc(var14);
         N(var15, 0, var17, var2, var4);
         N(var15, 1, var17, var6, var8);
         N(var15, 2, var17, var10, var12);
         N(MSDFGen.msdf_contour_add_edge(var0, var15), "add_edge");
      } catch (Throwable var19) {
         if (var14 != null) {
            try {
               var14.close();
            } catch (Throwable var18) {
               var19.addSuppressed(var18);
            }
         }

         throw var19;
      }

      if (var14 != null) {
         var14.close();
      }
   }

   private static boolean N(double var0, double var2, double var4, double var6) {
      return Math.abs(var0 - var4) < 1.0E-6 && Math.abs(var2 - var6) < 1.0E-6;
   }

   static void N(int var0, String var1) {
      if (var0 != 0) {
         throw new IllegalStateException("msdfgen " + var1 + " failed (err=" + var0 + ")");
      }
   }

   public static long N(long var0) {
      return switch (L) {
         case JTS -> class09737.N(var0);
         case AWT_AREA -> u(var0);
      };
   }

   private static void N(long var0, List<class09739> var2) {
      long var3 = L(var0);
      double var5 = 0.0;
      double var7 = 0.0;
      double var9 = 0.0;
      double var11 = 0.0;

      for (class09739 var14 : var2) {
         double[] var15 = var14.y();
         switch (var14.N()) {
            case 0:
               var5 = var9 = var15[0];
               var7 = var11 = var15[1];
               break;
            case 1:
               if (!N(var5, var7, var15[0], var15[1])) {
                  N(var3, var5, var7, var15[0], var15[1]);
               }

               var5 = var15[0];
               var7 = var15[1];
               break;
            case 2:
               N(var3, var5, var7, var15[0], var15[1], var15[2], var15[3]);
               var5 = var15[2];
               var7 = var15[3];
               break;
            case 3:
               N(var3, var5, var7, var15[0], var15[1], var15[2], var15[3], var15[4], var15[5]);
               var5 = var15[4];
               var7 = var15[5];
               break;
            case 4:
               if (!N(var5, var7, var9, var11)) {
                  N(var3, var5, var7, var9, var11);
               }

               var5 = var9;
               var7 = var11;
         }
      }
   }

   private static double N(List<class09739> var0) {
      double var1 = 0.0;
      double var3 = 0.0;
      double var5 = 0.0;
      double var7 = 0.0;
      double var9 = 0.0;

      for (class09739 var12 : var0) {
         double var13;
         double var15;
         switch (var12.N()) {
            case 0:
               var1 = var5 = var12.y()[0];
               var3 = var7 = var12.y()[1];
               continue;
            case 1:
               var13 = var12.y()[0];
               var15 = var12.y()[1];
               break;
            case 2:
               var13 = var12.y()[2];
               var15 = var12.y()[3];
               break;
            case 3:
               var13 = var12.y()[4];
               var15 = var12.y()[5];
               break;
            case 4:
               var13 = var1;
               var15 = var3;
               break;
            default:
               continue;
         }

         var9 += var5 * var15 - var13 * var7;
         var5 = var13;
         var7 = var15;
      }

      return var9 * 0.5;
   }

   private static long N(Area var0) {
      MemoryStack var3 = MemoryStack.stackPush();

      long var1;
      try {
         PointerBuffer var4 = var3.mallocPointer(1);
         N(MSDFGen.msdf_shape_alloc(var4), "shape_alloc");
         var1 = var4.get(0);
      } catch (Throwable var10) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var9) {
               var10.addSuppressed(var9);
            }
         }

         throw var10;
      }

      if (var3 != null) {
         var3.close();
      }

      ArrayList var11 = new ArrayList();
      ArrayList var12 = null;
      PathIterator var5 = var0.getPathIterator(null);

      for (double[] var6 = new double[6]; !var5.isDone(); var5.next()) {
         int var7 = var5.currentSegment(var6);
         if (var7 == 0) {
            var12 = new ArrayList();
            var11.add(var12);
         }

         if (var12 != null) {
            var12.add(new class09739(var7, (double[])var6.clone()));
         }
      }

      for (List var8 : var11) {
         if (!(Math.abs(N(var8)) < 1.0E-7)) {
            N(var1, var8);
         }
      }

      return var1;
   }

   private static double[] N(long var0, MSDFGenVector2 var2) {
      MemoryStack var3 = MemoryStack.stackPush();

      double[] var10;
      try {
         PointerBuffer var4 = var3.mallocPointer(1);
         N(MSDFGen.msdf_segment_get_point_count(var0, var4), "point_count");
         int var5 = (int)var4.get(0);
         double[] var6 = new double[var5 * 2];

         for (int var7 = 0; var7 < var5; var7++) {
            N(MSDFGen.msdf_segment_get_point(var0, (long)var7, var2), "get_point");
            var6[var7 * 2] = var2.x();
            var6[var7 * 2 + 1] = var2.y();
         }

         var10 = var6;
      } catch (Throwable var9) {
         if (var3 != null) {
            try {
               var3.close();
            } catch (Throwable var8) {
               var9.addSuppressed(var8);
            }
         }

         throw var9;
      }

      if (var3 != null) {
         var3.close();
      }

      return var10;
   }

   public static class09747 N() {
      return L;
   }

   public static void N(class09747 var0) {
      L = var0;
   }

   static void N(long var0, double var2, double var4, double var6, double var8) {
      MemoryStack var10 = MemoryStack.stackPush();

      try {
         long var11 = N(var10, 0);
         MSDFGenVector2 var13 = MSDFGenVector2.malloc(var10);
         N(var11, 0, var13, var2, var4);
         N(var11, 1, var13, var6, var8);
         N(MSDFGen.msdf_contour_add_edge(var0, var11), "add_edge");
      } catch (Throwable var15) {
         if (var10 != null) {
            try {
               var10.close();
            } catch (Throwable var14) {
               var15.addSuppressed(var14);
            }
         }

         throw var15;
      }

      if (var10 != null) {
         var10.close();
      }
   }
}
