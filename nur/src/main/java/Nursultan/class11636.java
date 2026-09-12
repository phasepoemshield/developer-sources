package Nursultan;

import java.util.function.Consumer;

public class class11636 {
   private static String[] R;
   private static String[] o;
   public static Object N_0;
   public static Object N_1;
   public static Object y_0 = class09227.N(var0 -> class09991.N().u(104.0F, 6.0F).Z(999.0F).y(var0.i()));
   public static Object y_1 = class09227.N(var0 -> class09991.N().y(class09962.y(6.0F)).Z(999.0F).N(class09969.FLOATING).E(0.0F).y(var0.B()));
   public static Object y_2 = class09991.N().N(class09692.N(class09994.E((class09743)class11636.u_1), class09994.B((class09743)class11636.u_1)));
   public static Object y_3 = class09227.N(var0 -> class09991.N().u(16.0F, 10.0F).Z(999.0F).N(class09969.FLOATING).N(-8.0F, -2.0F).y(var0.N()));
   public static Object y_4;
   public static Object y_5;
   public static Object L_0;
   public static Object L_1;
   public static Object u_0;
   public static Object u_1 = new class11863(360.0F, 27.0F, 1.0F, 0.1F, 2.0F, 0.008333334F);
   public static Object u_2 = class09991.N().N(class09962.N()).B(12.0F).y(class09973.CENTER).y(class09962.y(26.0F));
   public static Object u_3 = class09991.N().N(class09962.N()).y(class09973.CENTER).y(class09962.y(26.0F));
   public static Object i_0 = new class11636()::N;
   public static Object i_1;
   public static Object i_2;
   public static Object i_3;
   public static Object i_4;

   private static void L() {
      i_1 = 104.0F;
      i_2 = 6.0F;
      i_3 = 16;
      i_4 = 10;
      N_0 = -8.0F;
      N_1 = -2.0F;
      L_0 = 4.0F;
      L_1 = 999;
      u_0 = 1.0E-4F;
   }

   private class11636() {
   }

   static {
      N();
      y();
      L();
      class09991 var73 = class09991.N()
         .u(40.0F, 26.0F)
         .y((Integer)class09181.L_1)
         .z(1.0F)
         .u((Integer)class09181.y_1)
         .i((Integer)class09181.N_4)
         .y(class09973.CENTER)
         .N(class09973.CENTER)
         .u(2.0F)
         .i(2.0F)
         .Z(8.0F)
         .N(class09692.N(class09994.L((class09743)class11644.N_0)));
      y_4 = class09991.N(var73.u(var0 -> var0.i((Integer)class09181.N_0)), class09221.N(14, class09079.REGULAR));
      class09991 var74 = class09991.N();
      y_5 = class09991.N((class09991)y_4, var74.i((Integer)class09181.N_0));
   }

   private static void y() {
      o = new String[5];
      o[0] = "rangeSliderDrag";
      o[1] = "rangeSliderMinValue";
      o[2] = "rangeSliderMaxValue";
      o[3] = "rangeSliderActiveThumb";
      o[4] = "rangeSliderPointerDownX";
      R = new String[5];
      R[0] = "rangeSliderDragOffset";
      R[1] = "rangeSliderClickAnimating";
      R[2] = "rangeSliderMinInputText";
      R[3] = "rangeSliderMaxInputText";
      R[4] = "";
   }

   private float y(float var1, class11871 var2) {
      return Math.clamp((var1 - var2.u()) / var2.L(), 0.0F, 1.0F);
   }

   private float y(float var1, float var2) {
      return Math.clamp(var1 / var2, 0.0F, 1.0F);
   }

   private class09991 N(class09211 var1, float var2, float var3, boolean var4) {
      float var5 = Math.clamp(Math.min(var2, var3), 0.0F, 1.0F);
      float var6 = Math.clamp(Math.max(var2, var3), 0.0F, 1.0F);
      class09991 var7 = class09991.N(((class09227)y_1).N(var1), class09991.N().N(class09962.y((var6 - var5) * 104.0F)).U(var5 * 104.0F));
      if (!var4) {
         var7 = class09991.N(var7, (class09991)y_2);
      }

      return var7;
   }

   private void N(
      Consumer<Consumer<class09814>> var1,
      class11871 var2,
      class09785<Boolean> var3,
      class09785<Float> var4,
      class09785<Float> var5,
      class09785<class11604> var6,
      class09785<String> var7,
      boolean var8
   ) {
      var1.accept(var8x -> {
         String var9 = this.N(var2);
         class11604 var10 = var8 ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 : class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
         float var11 = var3.L() ? this.N(var8 ? (Float)var4.L() : (Float)var5.L(), var2) : (var8 ? var2.B().N() : var2.B().L());
         var8x.L(var7.L() != null ? (String)var7.L() : class11602.N(var11, var9));
         var8x.N(var2.i().L() && var6.L() == var10 ? (class09991)y_5 : (class09991)y_4);
         var8x.N(class09867.INPUT, var2xx -> {
            class09844 var3xx = (class09844)var2xx;
            String var4xx = var3xx.y();
            var7.N(var4xx);
            String var5xx = class11602.N(var4xx, var9);
            if (!class11602.N(var5xx)) {
               try {
                  Float.parseFloat(var5xx);
               } catch (NumberFormatException var7xx) {
                  var7.N(var3xx.N());
                  var3xx.b();
                  var3xx.j();
                  var2xx.z().N(var3xx.N());
               }
            }
         });
         var8x.N(class09867.BLUR, var7xx -> {
            String var8xx = class11602.N(var7xx.z().B(), var9);
            var7.N(null);
            if (!var8xx.isBlank() && !class11602.N(var8xx)) {
               try {
                  this.N(Float.parseFloat(var8xx), var2, var4, var5, var8);
               } catch (NumberFormatException var10x) {
               }
            } else {
               this.N(var8 ? var2.u() : var2.N(), var2, var4, var5, var8);
            }
         });
         var8x.N(class09867.WHEEL, var6xx -> {
            if (var6xx.z().W()) {
               class09837 var7xx = (class09837)var6xx;
               var6xx.T();
               var6xx.j();
               float var8xx = this.N(var8 ? (Float)var4.L() : (Float)var5.L(), var2);
               this.N(var8xx + Math.signum(var7xx.L()) * var2.M(), var2, var4, var5, var8);
               var7.N(null);
            }
         });
      });
   }

   private class11604 N(float var1, class09785<Float> var2, class09785<Float> var3) {
      float var4 = Math.abs(var1 - (Float)var2.L());
      float var5 = Math.abs(var1 - (Float)var3.L());
      return var4 <= var5 ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 : class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
   }

   private boolean N(class09904 var1, float var2, class11604 var3) {
      if (var3 != null && !var1.L().isEmpty()) {
         class09904 var4 = var1.L().get(0);
         if (var4.L().isEmpty()) {
            return false;
         } else {
            class09904 var5 = var4.L().get(0);
            float var6 = var4.c().y() - var1.c().y();
            float var7 = var5.c().y() - var1.c().y();
            float var8 = var3 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 ? var7 : var7 + var5.c().u();
            if (!Float.isFinite(var8)) {
               var8 = var6;
            }

            return Math.abs(var2 - var8) <= 4.0F;
         }
      } else {
         return false;
      }
   }

   private class09991 N(class09211 var1, float var2, boolean var3) {
      class09991 var4 = class09991.N(((class09227)y_3).N(var1), class09991.N().U(Math.clamp(var2, 0.0F, 1.0F) * 104.0F + -8.0F));
      if (!var3) {
         var4 = class09991.N(var4, (class09991)y_2);
      }

      return var4;
   }

   private static void N() {
   }

   private float N(float var1, class11871 var2) {
      return Math.clamp(class11908.N(var1 * var2.L() + var2.u(), var2.M()), var2.u(), var2.N());
   }

   private void N(class09785<Float> var1, class09785<Float> var2, class11871 var3, float var4, float var5, float var6, class11604 var7, boolean var8) {
      float var9 = Math.clamp((var4 - var6) / var5, 0.0F, 1.0F);
      if (var7 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0) {
         var9 = Math.min(var9, (Float)var2.L());
         var1.N(var8 ? this.y(this.N(var9, var3), var3) : var9);
      } else if (var7 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1) {
         var9 = Math.max(var9, (Float)var1.L());
         var2.N(var8 ? this.y(this.N(var9, var3), var3) : var9);
      }
   }

   private class11494 N(class09785<Float> var1, class09785<Float> var2, class11871 var3) {
      float var4 = this.N(Math.min((Float)var1.L(), (Float)var2.L()), var3);
      float var5 = this.N(Math.max((Float)var1.L(), (Float)var2.L()), var3);
      return new class11494(var4, var5);
   }

   private boolean N(float var1, float var2) {
      float var3 = var2 * 104.0F + -8.0F;
      float var4 = var3 + 16.0F;
      return var1 >= var3 && var1 <= var4;
   }

   private class09798 N(class11871 var1, class09809 var2) {
      class09211 var3 = var2.N((class09804<class09211>)class09211.N_6);
      class09785 var4 = var2.N(o[0], false);
      class09785 var5 = var2.N(o[1], var1.U());
      class09785 var6 = var2.N(o[2], var1.y());
      class09785 var7 = var2.N(o[3], (class11604)null);
      class09785 var8 = var2.N(o[4], 0.0F);
      class09785 var9 = var2.N(R[0], 0.0F);
      class09785 var10 = var2.N(R[1], false);
      class09785 var11 = var2.N(R[2], (String)null);
      class09785 var12 = var2.N(R[3], (String)null);
      return class09778.N((class09991)u_2, var12x -> {
         this.N(var12x::u, var1, var4, var5, var6, var7, var11, true);
         var12x.N_3((class09991)u_3, var10xx -> {
            var10xx.N(class09867.POINTER_DOWN, var9xxx -> {
               class09864 var10xxx = (class09864)var9xxx;
               if (var10xxx.L() == 0) {
                  var4.N(true);
                  var8.N(var10xxx.N());
                  class09904 var11xx = var10xxx.z();
                  float var12xx = var10xxx.N() - var11xx.c().y();
                  boolean var13 = this.N(var5, var6);
                  class11604 var14 = var13 ? null : this.N(var12xx, (Float)var5.L(), (Float)var6.L());
                  if (var14 != null) {
                     var7.N(var14);
                     var10.N(false);
                     float var15 = var14 == class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 ? (Float)var5.L() : (Float)var6.L() * 104.0F;
                     var9.N(var12xx - var15);
                  } else {
                     var9.N(0.0F);
                     if (var13) {
                        var7.N(null);
                        var10.N(false);
                     } else {
                        class11604 var16 = this.N(this.y(var12xx, var11xx.c().u()), var5, var6);
                        var7.N(var16);
                        var10.N(true);
                        var1.i().N(false);
                        this.N(var5, var6, var1, var12xx, var11xx.c().u(), 0.0F, var16, true);
                        var1.R().accept(this.N(var5, var6, var1));
                     }
                  }
               }
            });
            var10xx.N(class09867.POINTER_UP, var8xxx -> {
               class09864 var9xxx = (class09864)var8xxx;
               if (var9xxx.L() == 0) {
                  var4.N(false);
                  if (var1.i().L() && var7.L() != null) {
                     class09904 var10xxx = var9xxx.z();
                     float var11xx = var9xxx.N() - var10xxx.c().y();
                     this.N(var5, var6, var1, var11xx, var10xxx.c().u(), (Float)var9.L(), (class11604)var7.L(), true);
                     var1.R().accept(this.N(var5, var6, var1));
                  }

                  var7.N(null);
                  var1.i().N(false);
                  var9.N(0.0F);
                  var10.N(false);
               }
            });
            var10xx.N(class09867.POINTER_MOVE, var9xxx -> {
               if ((Boolean)var4.L()) {
                  class09864 var10xxx = (class09864)var9xxx;
                  class09904 var11xx = var10xxx.z();
                  float var12xx = var10xxx.N() - var11xx.c().y();
                  if (var7.L() == null) {
                     float var13 = var10xxx.N() - (Float)var8.L();
                     if (var13 > 0.0F) {
                        var7.N(class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1);
                     } else {
                        if (!(var13 < 0.0F)) {
                           return;
                        }

                        var7.N(class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0);
                     }

                     var9.N(0.0F);
                  }

                  if ((Boolean)var10.L() && this.N(var11xx, var12xx, (class11604)var7.L())) {
                     var10.N(false);
                  }

                  this.N(var5, var6, var1, var12xx, var11xx.c().u(), (Float)var9.L(), (class11604)var7.L(), false);
                  var1.R().accept(this.N(var5, var6, var1));
                  if (!(Boolean)var10.L()) {
                     var1.i().N(true);
                  }
               }
            });
            var10xx.N_3(((class09227)y_0).N(var3), var7xxx -> {
               float var8xxx = var4.L() ? (Float)var5.L() : var1.U();
               float var9xxx = var4.L() ? (Float)var6.L() : var1.y();
               boolean var10xxx = var1.i().L() && !(Boolean)var10.L();
               var7xxx.N_3(this.N(var3, var8xxx, var9xxx, var10xxx), var1xxxx -> var1xxxx.N(class09867.TRANSITION_END, var1xxxxx -> {
                     if (((class09842)var1xxxxx).y()) {
                        var10.N(false);
                     }
                  }));
               var7xxx.y(this.N(var3, var8xxx, var10xxx));
               var7xxx.y(this.N(var3, var9xxx, var10xxx));
            });
         });
         this.N(var12x::u, var1, var4, var5, var6, var7, var12, false);
      });
   }

   private class11604 N(float var1, float var2, float var3) {
      boolean var4 = this.N(var1, var3);
      boolean var5 = this.N(var1, var2);
      if (var4 && var5) {
         float var6 = var3 * 104.0F;
         float var7 = var2 * 104.0F;
         return Math.abs(var1 - var6) <= Math.abs(var1 - var7)
            ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1
            : class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0;
      } else if (var4) {
         return class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_1;
      } else {
         return var5 ? class11604.staticFields_0c70c7610ba0d3622a5bd78dbcf202bb2_0 : null;
      }
   }

   private void N(float var1, class11871 var2, class09785<Float> var3, class09785<Float> var4, boolean var5) {
      float var6 = Math.clamp(class11908.N(var1, var2.M()), var2.u(), var2.N());
      if (var5) {
         var6 = Math.min(var6, this.N((Float)var4.L(), var2));
         var3.N(this.y(var6, var2));
      } else {
         var6 = Math.max(var6, this.N((Float)var3.L(), var2));
         var4.N(this.y(var6, var2));
      }

      var2.R().accept(this.N(var3, var4, var2));
   }

   private String N(class11871 var1) {
      String var2 = var1.Z().get();
      return var2 == null ? R[4] : var2;
   }

   private boolean N(class09785<Float> var1, class09785<Float> var2) {
      return Math.abs((Float)var1.L() - (Float)var2.L()) < 1.0E-4F;
   }
}
