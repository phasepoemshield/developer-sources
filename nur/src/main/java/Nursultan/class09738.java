package Nursultan;

import java.util.Objects;

public final class class09738 {
   private final class09736 N;
   private final class09743 y;
   private final int L;
   private final int u;
   private final float i;
   private final float R;
   private final class09962 M;
   private final class09962 B;
   private final class09666 Z;
   private final class09666 z;
   private final class09733 U;
   private final class09780 E;
   private class09753 W;
   private float m;

   public float L() {
      return this.U == class09733.RUNTIME_VALUE ? this.u().y() : class09712.N(this.i, this.R, this.y());
   }

   int M() {
      return this.u;
   }

   private class09738(
      class09736 var1,
      class09743 var2,
      int var3,
      int var4,
      float var5,
      float var6,
      class09962 var7,
      class09962 var8,
      class09666 var9,
      class09666 var10,
      class09733 var11,
      class09780 var12,
      class09753 var13
   ) {
      this.N = var1;
      this.y = Objects.requireNonNull(var2, "spec");
      this.L = var3;
      this.u = var4;
      this.i = var5;
      this.R = var6;
      this.M = var7;
      this.B = var8;
      this.Z = var9;
      this.z = var10;
      this.U = var11;
      this.E = var12;
      this.W = Objects.requireNonNull(var13, "targetValue");
   }

   float B() {
      return this.i;
   }

   float Z() {
      return this.R;
   }

   public class09736 i() {
      return this.N;
   }

   class09733 m() {
      return this.U;
   }

   class09962 U() {
      return this.B;
   }

   class09962 z() {
      return this.M;
   }

   public class09753 u() {
      if (this.U == class09733.RUNTIME_VALUE) {
         return Objects.requireNonNull(this.E.N(), "transitionValue");
      } else {
         return switch (this.U) {
            case COLOR -> class09753.N(this.u);
            case FLOAT -> class09753.N(this.L());
            case RUNTIME_VALUE -> throw new IllegalStateException("Runtime value handled above");
            case AXIS_SIZE -> class09753.N(this.B);
            case TRANSLATE_LENGTH -> class09753.N(this.z);
         };
      }
   }

   public boolean y(class09743 var1) {
      return this.U == class09733.RUNTIME_VALUE && this.N(var1);
   }

   public boolean y(class09753 var1) {
      if (this.U != class09733.RUNTIME_VALUE) {
         return false;
      } else {
         boolean var2 = this.E.N(var1);
         if (var2) {
            this.W = var1;
         }

         return var2;
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public float y() {
      if (this.y instanceof class09728 var4) {
         class09728 var10000 = var4;

         float var6;
         label46: {
            label51: {
               try {
                  var15 = var10000.N();
               } catch (Throwable var9) {
                  var14 = var9;
                  boolean var10001 = false;
                  break label51;
               }

               var6 = var15;
               var10000 = var4;

               try {
                  var17 = var10000.y();
               } catch (Throwable var8) {
                  var14 = var8;
                  boolean var20 = false;
                  break label51;
               }

               var12 = var17;
               var10000 = var4;

               try {
                  var19 = var10000.L();
                  break label46;
               } catch (Throwable var7) {
                  var14 = var7;
                  boolean var21 = false;
               }
            }

            Throwable var11 = var14;
            throw new MatchException(var11.toString(), var11);
         }

         var6 = var19;
         if (!(var6 <= 0.0F)) {
            float var10 = (this.m - var6) / var6;
            if (var10 <= 0.0F) {
               return 0.0F;
            }

            if (var10 >= 1.0F) {
               return 1.0F;
            }

            return var12.N(var10);
         }
      }

      return 1.0F;
   }

   class09666 E() {
      return this.Z;
   }

   public static class09738 N(class09736 var0, class09743 var1, int var2, int var3) {
      Objects.requireNonNull(var1, "spec");
      class09753 var4 = class09753.N(var2);
      class09753 var5 = class09753.N(var3);
      return var1 instanceof class09815
         ? N(var0, var1, var4, var5, var2, var3, 0.0F, 0.0F, null, null, null, null)
         : new class09738(var0, var1, var2, var3, 0.0F, 0.0F, null, null, null, null, class09733.COLOR, null, var5);
   }

   public static class09738 N(class09736 var0, class09743 var1, float var2, float var3) {
      Objects.requireNonNull(var1, "spec");
      class09753 var4 = class09753.N(var2);
      class09753 var5 = class09753.N(var3);
      return var1 instanceof class09815
         ? N(var0, var1, var4, var5, 0, 0, var2, var3, null, null, null, null)
         : new class09738(var0, var1, 0, 0, var2, var3, null, null, null, null, class09733.FLOAT, null, var5);
   }

   public static class09738 N(class09736 var0, class09743 var1, class09962 var2, class09962 var3) {
      Objects.requireNonNull(var1, "spec");
      class09753 var4 = class09753.N(var2);
      class09753 var5 = class09753.N(var3);
      return var1 instanceof class09815
         ? N(var0, var1, var4, var5, 0, 0, 0.0F, 0.0F, var2, var3, null, null)
         : new class09738(var0, var1, 0, 0, 0.0F, 0.0F, var2, var3, null, null, class09733.AXIS_SIZE, null, var5);
   }

   public boolean N(float var1) {
      if (var1 <= 0.0F || this.N()) {
         return false;
      } else if (this.U == class09733.RUNTIME_VALUE) {
         return this.E.N(var1);
      } else {
         float var2 = this.y();
         this.m += var1;
         float var3 = this.y();
         return Float.compare(var2, var3) != 0;
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   public boolean N() {
      if (this.U == class09733.RUNTIME_VALUE) {
         return this.E.y();
      } else if (this.y instanceof class09728 var1) {
         class09728 var10000 = var1;

         float var6;
         label40: {
            label48: {
               try {
                  var13 = var10000.N();
               } catch (Throwable var9) {
                  var12 = var9;
                  boolean var10001 = false;
                  break label48;
               }

               var6 = var13;
               var10000 = var1;

               try {
                  var10000.y();
               } catch (Throwable var8) {
                  var12 = var8;
                  boolean var17 = false;
                  break label48;
               }

               var10000 = var1;

               try {
                  var16 = var10000.L();
                  break label40;
               } catch (Throwable var7) {
                  var12 = var7;
                  boolean var18 = false;
               }
            }

            Throwable var10 = var12;
            throw new MatchException(var10.toString(), var10);
         }

         float var11 = var16;
         return this.m >= var11 + var6;
      } else {
         return true;
      }
   }

   public boolean N(class09743 var1) {
      class09743 var2 = var1 == null ? class09743.Z() : var1;
      return this.y.equals(var2);
   }

   public boolean N(class09753 var1) {
      return this.W.equals(var1);
   }

   public static class09738 N(class09736 var0, class09743 var1, class09666 var2, class09666 var3) {
      Objects.requireNonNull(var1, "spec");
      class09753 var4 = class09753.N(var2);
      class09753 var5 = class09753.N(var3);
      return var1 instanceof class09815
         ? N(var0, var1, var4, var5, 0, 0, 0.0F, 0.0F, null, null, var2, var3)
         : new class09738(var0, var1, 0, 0, 0.0F, 0.0F, null, null, var2, var3, class09733.TRANSLATE_LENGTH, null, var5);
   }

   private static class09738 N(
      class09736 var0,
      class09743 var1,
      class09753 var2,
      class09753 var3,
      int var4,
      int var5,
      float var6,
      float var7,
      class09962 var8,
      class09962 var9,
      class09666 var10,
      class09666 var11
   ) {
      class09815 var12 = (class09815)var1;
      return new class09738(
         var0,
         var1,
         var4,
         var5,
         var6,
         var7,
         var8,
         var9,
         var10,
         var11,
         class09733.RUNTIME_VALUE,
         Objects.requireNonNull(var12.N(var0, var2, var3), "valueTransitionRuntime"),
         var3
      );
   }

   class09666 W() {
      return this.z;
   }

   int R() {
      return this.L;
   }
}
