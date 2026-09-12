package Nursultan;

public class class11624 {
   private static String[] I;
   public static Object N_0 = new class11624()::N;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3;
   public static Object N_4;
   public static Object N_5;
   public static Object N_6;
   public static Object N_7;
   public static Object y_0 = class09227.N(var0 -> class09991.N().u(104.0F, 6.0F).Z(999.0F).y(var0.i()));
   public static Object y_1 = class09227.N(var0 -> class09991.N().y(class09962.y(6.0F)).Z(999.0F).y(var0.B()));
   public static Object y_2 = new class11863(360.0F, 27.0F, 1.0F, 0.1F, 2.0F, 0.008333334F);
   public static Object y_3 = class09991.N().N(class09692.N(class09994.E((class09743)y_2)));
   public static Object y_4 = class09227.N(
      var0 -> class09991.N().u(16.0F, 10.0F).Z(999.0F).N(class09969.FLOATING).v(8.0F).L(class09662.N(-16777216, 0.2F)).N(-8.0F, -2.0F).y(var0.N())
   );
   public static Object y_5 = class09991.N().N(class09692.N(class09994.E((class09743)y_2), class09994.W((class09743)y_2), class09994.B((class09743)y_2)));
   public static Object y_6;
   public static Object y_7;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2 = class09991.N().N(class09962.N()).B(12.0F).y(class09973.CENTER).y(class09962.y(26.0F));
   public static Object L_3 = class09991.N().N(class09962.N()).y(class09973.CENTER).y(class09962.y(26.0F));

   private static void L() {
      I = new String[6];
      I[0] = "sliderDrag";
      I[1] = "sliderValue";
      I[2] = "sliderDragOffset";
      I[3] = "sliderClickAnimating";
      I[4] = "sliderInputText";
      I[5] = "";
   }

   private class11624() {
   }

   static {
      N();
      y();
      L();
      u();
      class09991 var74 = class09991.N()
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
      y_6 = class09991.N(var74.u(var0 -> var0.i((Integer)class09181.N_0)), class09221.N(14, class09079.REGULAR));
      class09991 var75 = class09991.N();
      y_7 = class09991.N((class09991)y_6, var75.i((Integer)class09181.N_0));
   }

   private static void u() {
      N_1 = 104.0F;
      N_2 = 6.0F;
      N_3 = 16;
      N_4 = 10;
      N_5 = -8.0F;
      N_6 = -2.0F;
      N_7 = 3.0F;
      L_0 = 4.0F;
      L_1 = 999;
   }

   private static void y() {
   }

   private boolean N(float var1, float var2) {
      float var3 = var2 * 104.0F + -8.0F;
      float var4 = var3 + 16.0F;
      return var1 >= var3 && var1 <= var4;
   }

   private float N(float var1, class11830 var2) {
      return Math.clamp(class11908.N(var1 * var2.L() + var2.i(), var2.y()), var2.i(), var2.R());
   }

   private static void N() {
   }

   private void N(class09785<Float> var1, class11830 var2, float var3, float var4, float var5, boolean var6) {
      float var7 = Math.clamp((var3 - var5) / var4, 0.0F, 1.0F);
      if (var6) {
         var1.N((class11908.N(var7 * var2.L() + var2.i(), var2.y()) - var2.i()) / var2.L());
      } else {
         var1.N(var7);
      }
   }

   private class09798 N(class11830 var1, class09809 var2) {
      class09211 var3 = var2.N((class09804<class09211>)class09211.N_6);
      class09785 var4 = var2.N(I[0], false);
      class09785 var5 = var2.N(I[1], var1.N());
      class09785 var6 = var2.N(I[2], 0.0F);
      class09785 var7 = var2.N(I[3], false);
      class09785 var8 = var2.N(I[4], (String)null);
      return class09778.N((class09991)L_2, var8x -> {
         var8x.N_3((class09991)L_3, var7xx -> {
            var7xx.N(class09867.POINTER_DOWN, var6xxx -> {
               class09864 var7xxx = (class09864)var6xxx;
               if (var7xxx.L() == 0) {
                  var4.N(true);
                  class09904 var8xx = var7xxx.z();
                  float var9 = var7xxx.N() - var8xx.c().y();
                  float var10 = var1.N() * 104.0F;
                  if (this.N(var9, var1.N())) {
                     var7.N(false);
                     var6.N(var9 - var10);
                  } else {
                     var7.N(true);
                     var1.M().N(false);
                     var6.N(0.0F);
                     this.N(var5, var1, var9, var8xx.c().u(), 0.0F, true);
                     var1.Z().accept(this.N((Float)var5.L(), var1));
                  }
               }
            });
            var7xx.N(class09867.POINTER_UP, var6xxx -> {
               class09864 var7xxx = (class09864)var6xxx;
               if (var7xxx.L() == 0) {
                  var4.N(false);
                  if (var1.M().L()) {
                     class09904 var8xx = var7xxx.z();
                     float var9 = var7xxx.N() - var8xx.c().y();
                     this.N(var5, var1, var9, var8xx.c().u(), (Float)var6.L(), true);
                     var1.Z().accept(this.N((Float)var5.L(), var1));
                  }

                  var1.M().N(false);
                  var6.N(0.0F);
                  var7.N(false);
               }
            });
            var7xx.N(class09867.POINTER_MOVE, var6xxx -> {
               if ((Boolean)var4.L()) {
                  class09864 var7xxx = (class09864)var6xxx;
                  class09904 var8xx = var7xxx.z();
                  float var9 = var7xxx.N() - var8xx.c().y();
                  if ((Boolean)var7.L() && this.N(var8xx, var9)) {
                     var7.N(false);
                  }

                  this.N(var5, var1, var9, var8xx.c().u(), (Float)var6.L(), false);
                  var1.Z().accept(this.N((Float)var5.L(), var1));
                  if (!(Boolean)var7.L()) {
                     var1.M().N(true);
                  }
               }
            });
            var7xx.N_3(((class09227)y_0).N(var3), var5xxx -> {
               class09991 var6xxx = class09991.N(((class09227)y_1).N(var3), class09991.N().N(class09962.N((var4.L() ? (Float)var5.L() : var1.N()) * 100.0F)));
               if ((Boolean)var7.L() || !var1.M().L()) {
                  var6xxx = class09991.N(var6xxx, (class09991)y_3);
               }

               var5xxx.N_3(var6xxx, var1xxxx -> var1xxxx.N(class09867.TRANSITION_END, var1xxxxx -> {
                     if (((class09842)var1xxxxx).y()) {
                        var7.N(false);
                     }
                  }));
               class09991 var9 = class09991.N(((class09227)y_4).N(var3), class09991.N().u(16.0F, 10.0F).N(-8.0F, -2.0F), (class09991)y_5);
               var5xxx.N(var1xxxx -> var1xxxx.y(var9));
            });
         });
         var8x.u(var5xx -> {
            String var6xx = this.N(var1);
            var5xx.L(var8.L() != null ? (String)var8.L() : class11602.N(var4.L() ? this.N((Float)var5.L(), var1) : var1.B(), var6xx));
            var5xx.N(var1.M().L() ? (class09991)y_7 : (class09991)y_6);
            var5xx.N(class09867.INPUT, var2xxx -> {
               class09844 var3xxx = (class09844)var2xxx;
               String var4xxx = var3xxx.y();
               var8.N(var4xxx);
               String var5xxx = class11602.N(var4xxx, var6xx);
               if (!class11602.N(var5xxx)) {
                  try {
                     Float.parseFloat(var5xxx);
                  } catch (NumberFormatException var7xx) {
                     var8.N(var3xxx.N());
                     var3xxx.b();
                     var3xxx.j();
                     var2xxx.z().N(var3xxx.N());
                  }
               }
            });
            var5xx.N(class09867.BLUR, var4xxx -> {
               String var5xxx = class11602.N(var4xxx.z().B(), var6xx);
               var8.N(null);
               if (!var5xxx.isBlank() && !class11602.N(var5xxx)) {
                  try {
                     float var7xx = Math.clamp(class11908.N(Float.parseFloat(var5xxx), var1.y()), var1.i(), var1.R());
                     var1.Z().accept(var7xx);
                     var5.N((var7xx - var1.i()) / var1.L());
                  } catch (NumberFormatException var8xx) {
                  }
               } else {
                  var1.Z().accept(var1.i());
                  var5.N(0.0F);
               }
            });
            var5xx.N(class09867.WHEEL, var3xxx -> {
               if (var3xxx.z().W()) {
                  class09837 var4xxx = (class09837)var3xxx;
                  var3xxx.T();
                  var3xxx.j();
                  float var5xxx = Math.clamp(class11908.N(var1.B() + Math.signum(var4xxx.L()) * var1.y(), var1.y()), var1.i(), var1.R());
                  var1.Z().accept(var5xxx);
                  var5.N((var5xxx - var1.i()) / var1.L());
                  var8.N(null);
               }
            });
         });
      });
   }

   private boolean N(class09904 var1, float var2) {
      if (var1.L().isEmpty()) {
         return false;
      } else {
         class09904 var3 = var1.L().getFirst();
         if (var3.L().isEmpty()) {
            return false;
         } else {
            class09904 var4 = var3.L().getFirst();
            float var6 = var3.c().y() - var1.c().y() + var4.c().u();
            return Math.abs(var2 - var6) <= 4.0F;
         }
      }
   }

   private String N(class11830 var1) {
      String var2 = var1.u().get();
      return var2 == null ? I[5] : var2;
   }
}
