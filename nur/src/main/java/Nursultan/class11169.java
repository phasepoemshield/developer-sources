package Nursultan;

import java.nio.FloatBuffer;
import java.util.Collection;
import java.util.Iterator;
import java.util.Locale;
import org.joml.Vector2fc;
import org.joml.Vector3fc;
import org.joml.Vector4fc;

public enum class11169 {
   FLOAT("FLOAT", "float", false),
   INT("INT", "int", false),
   BOOL("BOOL", "bool", false),
   VEC2("VEC2", "vec2", false),
   VEC3("VEC3", "vec3", false),
   VEC4("VEC4", "vec4", false),
   FLOAT_ARRAY("FLOAT_ARRAY", "float", true);

   public String fields_07f967a3f78943be5b7036c4e47452c9b_0;
   public String fields_07f967a3f78943be5b7036c4e47452c9b_1;
   public Boolean fields_07f967a3f78943be5b7036c4e47452c9b_2;
   public boolean fields_07f967a3f78943be5b7036c4e47452c9b_init;

   private static boolean L(Object var0) {
      if (var0 instanceof Boolean var3) {
         return var3;
      } else {
         if (var0 instanceof Number var1) {
            int var2 = y(var1);
            if (var2 == 0 || var2 == 1) {
               return var2 == 1;
            }
         }

         throw new IllegalArgumentException("Expected boolean or 0/1 number, got " + i(var0));
      }
   }

   private static void L() {
   }

   private class11169(String var3, String var4, boolean var5) {
      this.u();
      this.fields_07f967a3f78943be5b7036c4e47452c9b_0 = var3;
      this.fields_07f967a3f78943be5b7036c4e47452c9b_1 = var4;
      this.fields_07f967a3f78943be5b7036c4e47452c9b_2 = var5;
   }

   static {
      L();
   }

   private static String i(Object var0) {
      return var0 == null ? "null" : var0.getClass().getName();
   }

   private void u() {
      if (!this.fields_07f967a3f78943be5b7036c4e47452c9b_init) {
         this.fields_07f967a3f78943be5b7036c4e47452c9b_init = true;
         this.fields_07f967a3f78943be5b7036c4e47452c9b_2 = false;
      }
   }

   private static Number u(Object var0) {
      if (var0 instanceof Number) {
         return (Number)var0;
      } else {
         throw new IllegalArgumentException("Expected number, got " + i(var0));
      }
   }

   private static int y(Object var0) {
      Number var1 = u(var0);
      double var2 = var1.doubleValue();
      int var4 = var1.intValue();
      if (var2 != (double)var4) {
         throw new IllegalArgumentException("Expected integer number, got " + var0);
      } else {
         return var4;
      }
   }

   public String y() {
      return this.fields_07f967a3f78943be5b7036c4e47452c9b_0;
   }

   private static String y(Object var0, int var1) {
      StringBuilder var2 = new StringBuilder();
      N(var2, var0, var1);
      return var2.toString();
   }

   private static String y(String var0, Object var1, int var2) {
      float[] var3 = N(var1, var2);
      StringBuilder var4 = new StringBuilder(var0).append('(');

      for (int var5 = 0; var5 < var2; var5++) {
         if (var5 > 0) {
            var4.append(", ");
         }

         var4.append(N(var3[var5]));
      }

      return var4.append(')').toString();
   }

   private static void N(StringBuilder var0, Object var1, int var2) {
      if (var1 instanceof FloatBuffer var9) {
         int var12 = var9.limit();
         if (var12 != var2) {
            throw new IllegalArgumentException("Expected float buffer with limit " + var2 + ", got " + var12);
         } else {
            for (int var13 = 0; var13 < var2; var13++) {
               N(var0, var13, var9.get(var13));
            }
         }
      } else if (var1 instanceof float[] var8) {
         if (var8.length != var2) {
            throw new IllegalArgumentException("Expected float array length " + var2 + ", got " + var8.length);
         } else {
            for (int var11 = 0; var11 < var2; var11++) {
               N(var0, var11, var8[var11]);
            }
         }
      } else if (var1 instanceof double[] var7) {
         if (var7.length != var2) {
            throw new IllegalArgumentException("Expected double array length " + var2 + ", got " + var7.length);
         } else {
            for (int var10 = 0; var10 < var2; var10++) {
               N(var0, var10, (float)var7[var10]);
            }
         }
      } else if (!(var1 instanceof Collection var3)) {
         throw new IllegalArgumentException("Expected float array, FloatBuffer, double array or number collection, got " + i(var1));
      } else if (var3.size() != var2) {
         throw new IllegalArgumentException("Expected collection size " + var2 + ", got " + var3.size());
      } else {
         int var4 = 0;

         for (Object var6 : var3) {
            N(var0, var4++, u(var6).floatValue());
         }
      }
   }

   private static void N(StringBuilder var0, int var1, float var2) {
      if (var1 > 0) {
         var0.append(", ");
      }

      var0.append(N(var2));
   }

   public String N(String var1, int var2) {
      if (this.fields_07f967a3f78943be5b7036c4e47452c9b_2) {
         if (var2 <= 0) {
            throw new IllegalArgumentException("Array template uniform needs a positive size: " + var1);
         } else {
            return "uniform " + this.fields_07f967a3f78943be5b7036c4e47452c9b_1 + " " + var1 + "[" + var2 + "];";
         }
      } else {
         return "uniform " + this.fields_07f967a3f78943be5b7036c4e47452c9b_1 + " " + var1 + ";";
      }
   }

   public String N(Object var1) {
      return switch (this) {
         case FLOAT -> N(u(var1));
         case INT -> Integer.toString(y(var1));
         case BOOL -> L(var1) ? "1" : "0";
         case VEC2 -> y("vec2", var1, 2);
         case VEC3 -> y("vec3", var1, 3);
         case VEC4 -> y("vec4", var1, 4);
         case FLOAT_ARRAY -> throw new IllegalArgumentException("FLOAT_ARRAY needs defineDeclaration with array size");
      };
   }

   private static String N(Number var0) {
      return N(var0.floatValue());
   }

   public boolean N() {
      return this.fields_07f967a3f78943be5b7036c4e47452c9b_2;
   }

   public String N(String var1, Object var2, int var3) {
      if (this.fields_07f967a3f78943be5b7036c4e47452c9b_2) {
         if (var3 <= 0) {
            throw new IllegalArgumentException("Array template define needs a positive size: " + var1);
         } else {
            return "const "
               + this.fields_07f967a3f78943be5b7036c4e47452c9b_1
               + " "
               + var1
               + "["
               + var3
               + "] = "
               + this.fields_07f967a3f78943be5b7036c4e47452c9b_1
               + "["
               + var3
               + "]("
               + y(var2, var3)
               + ");";
         }
      } else {
         return "#define " + var1 + " " + this.N(var2);
      }
   }

   private static String N(float var0) {
      if (!Float.isFinite(var0)) {
         throw new IllegalArgumentException("GLSL float literal must be finite: " + var0);
      } else {
         String var1 = String.format(Locale.ROOT, "%s", var0);
         return var1.indexOf(46) < 0 && var1.indexOf(69) < 0 && var1.indexOf(101) < 0 ? var1 + ".0" : var1;
      }
   }

   private static float[] N(Object var0, int var1) {
      if (var0 instanceof Vector2fc var2 && var1 == 2) {
         return new float[]{var2.x(), var2.y()};
      }

      if (var0 instanceof Vector3fc var6 && var1 == 3) {
         return new float[]{var6.x(), var6.y(), var6.z()};
      }

      if (var0 instanceof Vector4fc var7 && var1 == 4) {
         return new float[]{var7.x(), var7.y(), var7.z(), var7.w()};
      }

      if (var0 instanceof float[] var8 && var8.length == var1) {
         return (float[])var8.clone();
      }

      if (var0 instanceof double[] var9 && var9.length == var1) {
         float[] var11 = new float[var1];

         for (int var12 = 0; var12 < var1; var12++) {
            var11[var12] = (float)var9[var12];
         }

         return var11;
      }

      if (var0 instanceof Collection var10 && var10.size() == var1) {
         float[] var3 = new float[var1];
         Iterator var4 = var10.iterator();

         for (int var5 = 0; var5 < var1; var5++) {
            var3[var5] = u(var4.next()).floatValue();
         }

         return var3;
      }

      throw new IllegalArgumentException("Expected " + var1 + " float values, got " + i(var0));
   }

   public static class11169 N(String var0) {
      for (class11169 var4 : values()) {
         if (var4.fields_07f967a3f78943be5b7036c4e47452c9b_0.equals(var0)) {
            return var4;
         }
      }

      throw new IllegalArgumentException("Unknown shader template marker type: " + var0);
   }
}
