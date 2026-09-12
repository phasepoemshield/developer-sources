package Nursultan;

import java.util.Objects;

final class class10039 {
   private final class09743 N;
   private final float y;
   private final float L;
   private final class09780 u;
   private float i;

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   private float L() {
      if (this.N instanceof class09728 var4) {
         class09728 var10000 = var4;

         float var6;
         label46: {
            label51: {
               try {
                  var14 = var10000.N();
               } catch (Throwable var9) {
                  var13 = var9;
                  boolean var10001 = false;
                  break label51;
               }

               var6 = var14;
               var10000 = var4;

               try {
                  var10000.y();
               } catch (Throwable var8) {
                  var13 = var8;
                  boolean var18 = false;
                  break label51;
               }

               var10000 = var4;

               try {
                  var17 = var10000.L();
                  break label46;
               } catch (Throwable var7) {
                  var13 = var7;
                  boolean var19 = false;
               }
            }

            Throwable var11 = var13;
            throw new MatchException(var11.toString(), var11);
         }

         var6 = var17;
         if (!(var6 <= 0.0F)) {
            float var10 = (this.i - var6) / var6;
            if (var10 <= 0.0F) {
               return 0.0F;
            }

            if (var10 >= 1.0F) {
               return 1.0F;
            }

            return var10;
         }
      }

      return 1.0F;
   }

   private class10039(class09743 var1, float var2, float var3, class09780 var4) {
      this.N = Objects.requireNonNull(var1, "spec");
      this.y = var2;
      this.L = var3;
      this.u = var4;
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   float y() {
      if (this.u != null) {
         return this.u.N().y();
      } else if (this.N instanceof class09728 var4) {
         class09728 var10000 = var4;

         class09759 var6;
         label36: {
            label44: {
               try {
                  var10000.N();
               } catch (Throwable var9) {
                  var12 = var9;
                  boolean var10001 = false;
                  break label44;
               }

               var10000 = var4;

               try {
                  var14 = var10000.y();
               } catch (Throwable var8) {
                  var12 = var8;
                  boolean var16 = false;
                  break label44;
               }

               var6 = var14;
               var10000 = var4;

               try {
                  var10000.L();
                  break label36;
               } catch (Throwable var7) {
                  var12 = var7;
                  boolean var17 = false;
               }
            }

            Throwable var11 = var12;
            throw new MatchException(var11.toString(), var11);
         }

         float var10 = var6.N(this.L());
         return this.y + (this.L - this.y) * var10;
      } else {
         return this.L;
      }
   }

   // $VF: Inserted dummy exception handlers to handle obfuscated exceptions
   boolean N() {
      if (this.u != null) {
         return this.u.y();
      } else if (this.N instanceof class09728 var1) {
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
         return this.i >= var11 + var6;
      } else {
         return true;
      }
   }

   boolean N(float var1) {
      if (this.u != null) {
         return this.u.N(var1);
      } else if (!(var1 <= 0.0F) && !this.N()) {
         float var2 = this.L();
         this.i += var1;
         return Float.compare(var2, this.L()) != 0;
      } else {
         return false;
      }
   }

   static class10039 N(class09736 var0, class09743 var1, float var2, float var3) {
      if (var1 instanceof class09815) {
         class09780 var5 = Objects.requireNonNull(((class09815)var1).N(var0, class09753.N(var2), class09753.N(var3)), "valueTransitionRuntime");
         return new class10039(var1, var2, var3, var5);
      } else {
         return new class10039(var1, var2, var3, null);
      }
   }
}
