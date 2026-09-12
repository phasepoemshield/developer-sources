package Nursultan;

import java.awt.geom.PathIterator;
import java.awt.geom.Path2D.Double;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.locationtech.jts.geom.Coordinate;
import org.locationtech.jts.geom.Geometry;
import org.locationtech.jts.geom.GeometryFactory;
import org.locationtech.jts.geom.Point;
import org.locationtech.jts.geom.Polygon;
import org.locationtech.jts.operation.polygonize.Polygonizer;
import org.locationtech.jts.operation.union.UnaryUnionOp;

final class class09737 {
   private static final double N = 6.0E-4;
   private static final double y = 1.0E-7;
   private static final GeometryFactory L = new GeometryFactory();

   private class09737() {
   }

   private static void N(List<Coordinate[]> var0, List<Coordinate> var1) {
      if (var1 != null && var1.size() >= 3) {
         Coordinate var2 = (Coordinate)var1.get(0);
         Coordinate var3 = (Coordinate)var1.get(var1.size() - 1);
         if (var2.x != var3.x || var2.y != var3.y) {
            var1.add(new Coordinate(var2.x, var2.y));
         }

         if (var1.size() >= 4) {
            var0.add(var1.toArray(new Coordinate[0]));
         }
      }
   }

   private static long N(Geometry var0) {
      long var1 = class09716.y();

      for (int var3 = 0; var3 < var0.getNumGeometries(); var3++) {
         Geometry var5 = var0.getGeometryN(var3);
         if (var5 instanceof Polygon) {
            Polygon var4 = (Polygon)var5;
            N(var1, var4.getExteriorRing().getCoordinates());

            for (int var6 = 0; var6 < var4.getNumInteriorRing(); var6++) {
               N(var1, var4.getInteriorRingN(var6).getCoordinates());
            }
         }
      }

      return var1;
   }

   private static void N(long var0, Coordinate[] var2) {
      if (var2.length >= 4) {
         long var3 = class09716.L(var0);

         for (int var5 = 0; var5 < var2.length - 1; var5++) {
            Coordinate var6 = var2[var5];
            Coordinate var7 = var2[var5 + 1];
            if (Math.abs(var6.x - var7.x) >= 1.0E-7 || Math.abs(var6.y - var7.y) >= 1.0E-7) {
               class09716.N(var3, var6.x, var6.y, var7.x, var7.y);
            }
         }
      }
   }

   private static List<Coordinate[]> N(Double var0) {
      ArrayList var1 = new ArrayList();
      PathIterator var2 = var0.getPathIterator(null, 6.0E-4);
      double[] var3 = new double[6];

      ArrayList var4;
      for (var4 = null; !var2.isDone(); var2.next()) {
         switch (var2.currentSegment(var3)) {
            case 0:
               N(var1, var4);
               var4 = new ArrayList();
               var4.add(new Coordinate(var3[0], var3[1]));
               break;
            case 1:
               if (var4 != null) {
                  var4.add(new Coordinate(var3[0], var3[1]));
               }
            case 2:
            case 3:
            default:
               break;
            case 4:
               N(var1, var4);
               var4 = null;
         }
      }

      N(var1, var4);
      return var1;
   }

   static long N(long var0) {
      Double var2 = class09716.y(var0);
      if (var2 == null) {
         return 0L;
      } else {
         List<Coordinate[]> var3 = N(var2);
         if (var3.isEmpty()) {
            return 0L;
         } else {
            ArrayList var4 = new ArrayList(var3.size());

            for (Coordinate[] var6 : var3) {
               var4.add(L.createLineString(var6));
            }

            Geometry var14;
            try {
               var14 = L.buildGeometry(var4).union();
            } catch (RuntimeException var13) {
               return 0L;
            }

            Polygonizer var15 = new Polygonizer();
            var15.add(var14);
            Collection var7 = var15.getPolygons();
            if (var7.isEmpty()) {
               return 0L;
            } else {
               ArrayList var8 = new ArrayList();

               for (Polygon var10 : var7) {
                  Point var11 = var10.getInteriorPoint();
                  if (N(var11.getX(), var11.getY(), var3) != 0) {
                     var8.add(var10);
                  }
               }

               if (var8.isEmpty()) {
                  return 0L;
               } else {
                  Geometry var16;
                  try {
                     var16 = UnaryUnionOp.union(var8);
                  } catch (RuntimeException var12) {
                     var16 = L.buildGeometry(var8).buffer(0.0);
                  }

                  return var16 != null && !var16.isEmpty() ? N(var16) : 0L;
               }
            }
         }
      }
   }

   private static double N(Coordinate var0, Coordinate var1, double var2, double var4) {
      return (var1.x - var0.x) * (var4 - var0.y) - (var2 - var0.x) * (var1.y - var0.y);
   }

   private static int N(double var0, double var2, List<Coordinate[]> var4) {
      int var5 = 0;

      for (Coordinate[] var7 : var4) {
         for (int var8 = 0; var8 < var7.length - 1; var8++) {
            Coordinate var9 = var7[var8];
            Coordinate var10 = var7[var8 + 1];
            if (var9.y <= var2) {
               if (var10.y > var2 && N(var9, var10, var0, var2) > 0.0) {
                  var5++;
               }
            } else if (var10.y <= var2 && N(var9, var10, var0, var2) < 0.0) {
               var5--;
            }
         }
      }

      return var5;
   }
}
