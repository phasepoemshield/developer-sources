package Nursultan;

import java.awt.Color;
import java.util.LinkedList;
import java.util.OptionalInt;

public class class11595 {
   private static String[] T;
   private static String[] l;
   private static String[] Ny;
   private static String[] Ni;
   public static Object N_0;
   public static Object N_1;
   public static Object N_2;
   public static Object N_3 = class09991.N().N(class09962.N()).y(class09962.y(24.0F)).B(8.0F).N(class09975.ROW);
   public static Object N_4 = class09991.N().u(24.0F, 24.0F).z(1.0F).u((Integer)class09181.L_2).Z(9999.0F);
   public static Object N_5 = class11629.N();
   public static Object N_6 = class09991.N().N(class09969.FLOATING).U(-8.0F).u(0.0F, 0.0F);
   public static Object N_7;
   public static Object y_0 = new class11595()::N;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object y_4;
   public static Object y_5;
   public static Object y_6;
   public static Object y_7;
   public static Object L_0 = class09991.N().u(248.0F, 186.0F).N(class09994.s((class09743)class11644.N_0)).N(var0 -> var0.l(0.0F)).y(var0 -> var0.l(0.0F));
   public static Object L_1 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).B(6.0F).N(class09975.COLUMN);
   public static Object L_2 = class09991.N().N(class09962.N(100.0F)).y(class09962.y(14.0F));
   public static Object L_3 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.y(10.0F))
      .Z(9999.0F)
      .y((Integer)class09181.L_1)
      .N(class09994.s((class09743)class11644.N_0))
      .N(var0 -> var0.l(0.0F))
      .y(var0 -> var0.l(0.0F));
   public static Object L_4 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.y(10.0F))
      .Z(9999.0F)
      .y((Integer)class09181.L_1)
      .N(class09994.s((class09743)class11644.N_0))
      .N(var0 -> var0.l(0.0F))
      .y(var0 -> var0.l(0.0F));
   public static Object u_0;
   public static Object u_1;
   public static Object i_0;
   public static Object i_1;
   public static Object i_2;
   public static Object R_0 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).B(6.0F).y(class09973.CENTER);
   public static Object R_1 = class09991.N()
      .u(32.0F, 32.0F)
      .y((Integer)class09181.L_1)
      .z(1.0F)
      .u((Integer)class09181.L_2)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .Z(8.0F);
   public static Object R_2 = class09991.N().u(16.0F, 16.0F);
   public static Object M_0;
   public static Object M_1;
   public static Object M_2;
   public static Object M_3 = new LinkedList();
   public static Object M_4 = class09991.N()
      .N(class09962.N())
      .y(class09962.N())
      .y(-16119286)
      .N(8.0F)
      .u((Integer)class09181.y_1)
      .v(20.0F)
      .L(class11300.L(0, 25.0F))
      .z(1.0F)
      .Z(15.0F)
      .B(8.0F)
      .N(class09975.COLUMN)
      .l(1.0F)
      .N(class09994.s((class09743)class11644.N_0))
      .N(var0 -> var0.l(0.0F))
      .y(var0 -> var0.l(0.0F));

   private static OptionalInt L(String var0) {
      String var1 = var0.trim();
      if (var1.endsWith(Ni[4])) {
         var1 = var1.substring(0, var1.length() - 1);
      }

      if (!var1.isEmpty() && var1.chars().allMatch(Character::isDigit)) {
         try {
            return OptionalInt.of(Math.round((float)Math.clamp((long)Integer.parseInt(var1), 0, 100) * 255.0F / 100.0F));
         } catch (NumberFormatException var3) {
            return OptionalInt.empty();
         }
      } else {
         return OptionalInt.empty();
      }
   }

   private static void L() {
   }

   private static float M(int var0) {
      return (float)(248 - var0) - 0.0F;
   }

   private static void M() {
   }

   private static boolean Q(String var0) {
      if (!var0.isEmpty() && !var0.equals(Ni[0])) {
         String var1 = var0.startsWith(Ni[1]) ? var0.substring(1) : var0;
         return var1.length() <= 6 && var1.chars().allMatch(class11595::y);
      } else {
         return true;
      }
   }

   private class11595() {
   }

   static {
      y();
      M();
      u();
      B();
      L();
      R();
      N();
      class09991 var97 = class09991.N()
         .y(class09962.y(32.0F))
         .y((Integer)class09181.L_1)
         .z(1.0F)
         .u((Integer)class09181.L_2)
         .i(-7171438)
         .N(class09973.CENTER)
         .y(class09973.CENTER)
         .N(class09983.BORDER_BOX)
         .Z(8.0F);
      N_0 = class09991.N(var97.u(var0 -> var0.i((Integer)class09181.N_0)), class09221.N(14, class09079.REGULAR));
      class09991 var98 = class09991.N();
      N_1 = class09991.N((class09991)N_0, var98.N(class09962.y(0.0F, Float.POSITIVE_INFINITY)));
      class09991 var99 = class09991.N();
      N_2 = class09991.N((class09991)N_0, var99.N(class09962.y(54.0F)));
   }

   private static void B() {
   }

   private static float Z(int var0) {
      return (float)class11300.y(var0) / 255.0F;
   }

   private static OptionalInt Z(String var0) {
      String var1 = var0.trim();
      if (var1.startsWith(Ni[2])) {
         var1 = var1.substring(1);
      }

      if (var1.length() == 6 && Q(var1)) {
         try {
            return OptionalInt.of(0xFF000000 | Integer.parseInt(var1, 16));
         } catch (NumberFormatException var3) {
            return OptionalInt.empty();
         }
      } else {
         return OptionalInt.empty();
      }
   }

   private static float Z() {
      return 238.0F;
   }

   private static float i() {
      return 176.0F;
   }

   private static String m(int var0) {
      return String.format(Ni[5], class11300.u(var0), class11300.N(var0), class11300.i(var0));
   }

   private static void U(int var0) {
      ((LinkedList)M_3).removeFirstOccurrence(var0);
      ((LinkedList)M_3).addFirst(var0);

      while (((LinkedList)M_3).size() > 8) {
         ((LinkedList)M_3).removeLast();
      }
   }

   private static String z(int var0) {
      return Math.round((float)class11300.y(var0) * 100.0F / 255.0F) + "%";
   }

   private static boolean z(String var0) {
      String var1 = var0.endsWith(Ni[3]) ? var0.substring(0, var0.length() - 1) : var0;
      return var1.isEmpty() || var1.length() <= 3 && var1.chars().allMatch(Character::isDigit);
   }

   private static float u(int var0) {
      return Color.RGBtoHSB(class11300.u(var0), class11300.N(var0), class11300.i(var0), null)[0];
   }

   private static void u() {
   }

   private static boolean y(int var0) {
      return var0 >= 48 && var0 <= 57 || var0 >= 97 && var0 <= 102 || var0 >= 65 && var0 <= 70;
   }

   private static float y(class11872 var0) {
      return var0.L() ? 0.5F : 1.0F;
   }

   private static int y(float var0, int var1) {
      return class11300.N(Color.HSBtoRGB(var0, 1.0F, 1.0F), var1);
   }

   private static void y() {
   }

   private static void y(
      class11872 var0, class09785<Float> var1, class09785<Float> var2, class09785<Float> var3, class09785<String> var4, class09785<String> var5, int var6
   ) {
      int var7 = N(var0, class11300.N(var6, class11300.y(var0.y())));
      N(var0, var7, var1, var2, var3);
      N(var0, var7, var4, var5);
   }

   private static void N(class11872 var0, class09785<Float> var1, class09785<String> var2, class09785<String> var3, class09864 var4) {
      float var5 = N(var4, 14);
      var1.N(var5);
      N(var0, class11300.N(var0.y(), Math.round(var5 * 255.0F)), var2, var3);
   }

   private static int N(float var0, float var1, float var2) {
      return class11300.N(Color.HSBtoRGB(var0, var1, var2), 255);
   }

   private static void N(class11872 var0, class09785<Float> var1, class09785<String> var2, class09785<String> var3, String var4) {
      L(var4).ifPresentOrElse(var4x -> {
         var1.N((float)var4x / 255.0F);
         N(var0, class11300.N(var0.y(), var4x), var2, var3);
      }, () -> var3.N(z(var0.y())));
   }

   public static void N(class11872 var0, int var1, class09785<Float> var2, class09785<Float> var3, class09785<Float> var4) {
      float[] var5 = Color.RGBtoHSB(class11300.u(var1), class11300.N(var1), class11300.i(var1), null);
      float var6 = y(var0);
      float var7 = N(var0);
      float var8 = Math.min(var5[1], var6) / var6;
      float var9 = Math.max(var5[2], var7);
      var2.N(var5[0]);
      var3.N(var8 * Z());
      var4.N((1.0F - var9) / (1.0F - var7) * i());
   }

   private static void N(int var0, class09785<String> var1, class09785<String> var2) {
      var1.N(m(var0));
      var2.N(z(var0));
   }

   private static void N(
      class11872 var0,
      class09785<class11619> var1,
      class09785<Boolean> var2,
      class09785<Float> var3,
      class09785<Float> var4,
      class09785<Float> var5,
      class09785<String> var6,
      class09785<String> var7
   ) {
      N(var1, var2);
      class11619 var8 = new class11619(var0, var1, var2, var3, var4, var5, var6, var7);
      var1.N(var8);
      var2.N(true);
      class11938.L().y(var8);
   }

   public static void N(class11872 var0, int var1, class09785<String> var2, class09785<String> var3) {
      var1 = N(var0, var1);
      var0.i().accept(var1);
      N(var1, var2, var3);
   }

   private static float N(class09864 var0, int var1) {
      float var2 = var0.N() - var0.z().c().y() - 0.0F - (float)var1 / 2.0F;
      float var3 = Math.max(1.0F, var0.z().c().u() - (float)var1 - 0.0F);
      return Math.clamp(var2 / var3, 0.0F, 1.0F);
   }

   private static class09991 N(int var0, float var1) {
      return class09991.N()
         .u(8.0F, 14.0F)
         .N(class09969.FLOATING)
         .U(N(var1, 8))
         .E(-2.0F)
         .v(6.0F)
         .L(class09662.N(-16777216, 0.1F))
         .y(y(var1, class11300.y(var0)))
         .z(2.0F)
         .u(-1)
         .Z(9999.0F);
   }

   private static void L(
      class11872 var0,
      class09785<Float> var1,
      class09785<Float> var2,
      class09785<Float> var3,
      class09785<String> var4,
      class09785<String> var5,
      class09844 var6
   ) {
      String var7 = var6.y().trim();
      if (!Q(var7)) {
         var6.z().N(var6.N());
         var4.N(var6.N());
      } else {
         var4.N(var7);
         Z(var7).ifPresent(var6x -> y(var0, var1, var2, var3, var4, var5, var6x));
      }
   }

   private class09798 N(class11872 var1, class09809 var2) {
      class09785 var3 = var2.N(l[0], false);
      class09785 var4 = var2.N(l[1], false);
      class09785 var5 = var2.N(l[2], false);
      class09785 var6 = var2.N(l[3], false);
      class09785 var7 = var2.N(l[4], (class11619)null);
      class09785 var8 = var2.N(l[5], u(var1.y()));
      class09785 var9 = var2.N(l[6], Z(var1.y()));
      class09785 var10 = var2.N(l[7], 0.0F);
      class09785 var11 = var2.N(Ny[0], 0.0F);
      class09785 var12 = var2.N(Ny[1], false);
      class09785 var13 = var2.N(Ny[2], m(var1.y()));
      class09785 var14 = var2.N(Ny[3], z(var1.y()));
      boolean var15 = var1.N().L();
      if (!var15) {
         if ((Boolean)var12.L()) {
            var12.N(false);
         }
      } else if (!(Boolean)var12.L()) {
         N(var1, var1.y(), var8, var10, var11);
         var9.N(Z(var1.y()));
         N(var1.y(), var13, var14);
         var12.N(true);
      }

      String var16 = "colorPickerAnchor" + System.identityHashCode(var1.N());
      return class11629.N(
         (class09991)N_5,
         var14x -> {
            var14x.N(Ni[6]);
            var14x.N_3((class09991)N_6, var1xx -> var1xx.N(var16));
            if (var15) {
               var14x.y(class11629.N(T[0], 2000, () -> {
                  U(var1.y());
                  var3.N(false);
                  var4.N(false);
                  var5.N(false);
                  N(var7, var6);
                  var1.N().N(false);
               }));
               var14x.N_3(
                  class09991.N((class09991)M_4, class11629.N(var16, 0.0F, 2001)),
                  var12xx -> {
                     var12xx.N(T[1]);
                     var12xx.N_3(
                        (class09991)L_0,
                        var7xxx -> {
                           var7xxx.N(class09867.POINTER_DOWN, var7xxxx -> {
                              class09864 var8xxx = (class09864)var7xxxx;
                              if (var8xxx.L() == 0) {
                                 var3.N(true);
                                 N(var1, (Float)var8.L(), var10, var11, var13, var14, var8xxx);
                              }
                           });
                           var7xxx.N(class09867.POINTER_MOVE, var7xxxx -> {
                              if ((Boolean)var3.L()) {
                                 N(var1, (Float)var8.L(), var10, var11, var13, var14, (class09864)var7xxxx);
                              }
                           });
                           var7xxx.N(class09867.POINTER_UP, var7xxxx -> {
                              class09864 var8xxx = (class09864)var7xxxx;
                              if (var8xxx.L() == 0) {
                                 var3.N(false);
                                 N(var1, (Float)var8.L(), var10, var11, var13, var14, var8xxx);
                              }
                           });
                           var7xxx.i(
                              var2xxxx -> var2xxxx.N((class09991)L_0)
                                    .y(
                                       var2xxxxx -> class11611.N(
                                             N((Float)var8.L(), 0.0F, 1.0F),
                                             N((Float)var8.L(), y(var1), 1.0F),
                                             N((Float)var8.L(), 0.0F, N(var1)),
                                             N((Float)var8.L(), y(var1), N(var1)),
                                             var2xxxxx.N(),
                                             var2xxxxx.y(),
                                             var2xxxxx.L(),
                                             var2xxxxx.u()
                                          )
                                    )
                           );
                           var7xxx.y(N(var1.y(), (Float)var10.L(), (Float)var11.L()));
                        }
                     );
                     var12xx.N_3(
                        (class09991)L_1,
                        var9xxx -> {
                           var9xxx.N_3(
                              (class09991)L_2,
                              var7xxxx -> {
                                 var7xxxx.N(class09867.POINTER_DOWN, var7xxxxx -> {
                                    class09864 var8xxxx = (class09864)var7xxxxx;
                                    if (var8xxxx.L() == 0) {
                                       var4.N(true);
                                       N(var1, var8, var10, var11, var13, var14, var8xxxx);
                                    }
                                 });
                                 var7xxxx.N(class09867.POINTER_MOVE, var7xxxxx -> {
                                    if ((Boolean)var4.L()) {
                                       N(var1, var8, var10, var11, var13, var14, (class09864)var7xxxxx);
                                    }
                                 });
                                 var7xxxx.N(class09867.POINTER_UP, var7xxxxx -> {
                                    class09864 var8xxxx = (class09864)var7xxxxx;
                                    if (var8xxxx.L() == 0) {
                                       var4.N(false);
                                       N(var1, var8, var10, var11, var13, var14, var8xxxx);
                                    }
                                 });
                                 var7xxxx.i(
                                    var0xxxx -> var0xxxx.N((class09991)L_3)
                                          .y(var0xxxxx -> class11606.N(var0xxxxx.N(), var0xxxxx.y(), var0xxxxx.L(), var0xxxxx.u()))
                                 );
                                 var7xxxx.y(N(var1.y(), (Float)var8.L()));
                              }
                           );
                           var9xxx.N(
                              var1.u(),
                              () -> class09778.N(
                                    (class09991)L_2,
                                    var5xxxx -> {
                                       var5xxxx.N(class09867.POINTER_DOWN, var5xxxxx -> {
                                          class09864 var6xxxx = (class09864)var5xxxxx;
                                          if (var6xxxx.L() == 0) {
                                             var5.N(true);
                                             N(var1, var9, var13, var14, var6xxxx);
                                          }
                                       });
                                       var5xxxx.N(class09867.POINTER_MOVE, var5xxxxx -> {
                                          if ((Boolean)var5.L()) {
                                             N(var1, var9, var13, var14, (class09864)var5xxxxx);
                                          }
                                       });
                                       var5xxxx.N(class09867.POINTER_UP, var5xxxxx -> {
                                          class09864 var6xxxx = (class09864)var5xxxxx;
                                          if (var6xxxx.L() == 0) {
                                             var5.N(false);
                                             N(var1, var9, var13, var14, var6xxxx);
                                          }
                                       });
                                       var5xxxx.i(
                                          var1xxxxxx -> var1xxxxxx.N((class09991)L_4)
                                                .y(var1xxxxxxx -> class11640.N(var1.y(), var1xxxxxxx.N(), var1xxxxxxx.y(), var1xxxxxxx.L(), var1xxxxxxx.u()))
                                       );
                                       var5xxxx.y(N((Float)var9.L()));
                                    }
                                 )
                           );
                        }
                     );
                     var12xx.N_3(
                        (class09991)R_0,
                        var9xxx -> {
                           var9xxx.N_3((class09991)R_1, var8xxxx -> {
                              var8xxxx.L(var1xxxxx -> {
                                 var1xxxxx.N(T[4]);
                                 var1xxxxx.L(T[5]);
                                 var1xxxxx.N(class09991.N((class09991)R_2, class09991.N().i(var6.L() ? (Integer)class09181.N_0 : -7171438)));
                              });
                              var8xxxx.N_1(var8xxxxx -> N(var1, var7, var6, var8, var10, var11, var13, var14));
                           });
                           var9xxx.u(var6xxxx -> {
                              var6xxxx.N(T[3]);
                              var6xxxx.L((String)var13.L());
                              var6xxxx.N((class09991)N_1);
                              var6xxxx.N(class09867.INPUT, var6xxxxx -> L(var1, var8, var10, var11, var13, var14, (class09844)var6xxxxx));
                              var6xxxx.N(class09867.CHANGE, var6xxxxx -> N(var1, var8, var10, var11, var13, var14, var6xxxxx.z().B()));
                              var6xxxx.N(class09867.BLUR, var6xxxxx -> N(var1, var8, var10, var11, var13, var14, var6xxxxx.z().B()));
                           });
                           var9xxx.N(
                              var1.u(),
                              () -> class09778.i()
                                    .N(T[2])
                                    .L((String)var14.L())
                                    .N((class09991)N_2)
                                    .N(class09867.INPUT, var1xxxxx -> N(var14, (class09844)var1xxxxx))
                                    .N(class09867.CHANGE, var4xxxx -> N(var1, var9, var13, var14, var4xxxx.z().B()))
                                    .N(class09867.BLUR, var4xxxx -> N(var1, var9, var13, var14, var4xxxx.z().B()))
                                    .i()
                           );
                        }
                     );
                     if (!((LinkedList)M_3).isEmpty()) {
                        var12xx.N_3(
                           (class09991)N_3,
                           var7xxx -> {
                              for (int var9xxx : (LinkedList)M_3) {
                                 var7xxx.N_3(
                                    class09991.N((class09991)N_4, class09991.N().y(var9xxx)),
                                    var8xxx -> var8xxx.N_1(var8xxxx -> N(var1, var9xxx, var8, var9, var10, var11, var13, var14))
                                 );
                              }
                           }
                        );
                     }
                  }
               );
            }
         }
      );
   }

   private static void N(
      class11872 var0,
      int var1,
      class09785<Float> var2,
      class09785<Float> var3,
      class09785<Float> var4,
      class09785<Float> var5,
      class09785<String> var6,
      class09785<String> var7
   ) {
      if (!var0.u()) {
         var1 = class11300.N(var1, class11300.y(var0.y()));
      }

      var1 = N(var0, var1);
      N(var0, var1, var2, var4, var5);
      var3.N(Z(var1));
      N(var0, var1, var6, var7);
   }

   private static void N(class09785<class11619> var0, class09785<Boolean> var1) {
      class11619 var2 = (class11619)var0.L();
      if (var2 != null) {
         var2.N();
      }
   }

   private static void N(class11872 var0, float var1, float var2, float var3, float var4, float var5, class09785<String> var6, class09785<String> var7) {
      float var8 = (var4 <= 0.0F ? 0.0F : var2 / var4) * y(var0);
      float var9 = N(var0);
      float var10 = var5 <= 0.0F ? 1.0F : 1.0F - var3 / var5 * (1.0F - var9);
      int var11 = Color.HSBtoRGB(var1, var8, var10);
      N(var0, class11300.N(var11, class11300.y(var0.y())), var6, var7);
   }

   private static float N(class11872 var0) {
      return var0.L() ? 0.5F : 0.0F;
   }

   private static void N() {
      y_1 = 8;
      y_2 = 248;
      y_3 = 186;
      y_4 = 10;
      y_5 = 10;
      y_6 = 32;
      y_7 = 54;
      u_0 = 8;
      u_1 = 14;
      i_0 = 14;
      i_1 = 0;
      i_2 = -2;
      M_0 = 8;
      M_1 = 0.5F;
      M_2 = 0.5F;
      N_7 = T[6];
   }

   private static void N(
      class11872 var0,
      class09785<Float> var1,
      class09785<Float> var2,
      class09785<Float> var3,
      class09785<String> var4,
      class09785<String> var5,
      class09864 var6
   ) {
      float var7 = Math.min(N(var6, 8), Math.nextDown(1.0F));
      var1.N(var7);
      N(var0, var7, (Float)var2.L(), (Float)var3.L(), Z(), i(), var4, var5);
   }

   private static class09991 N(float var0) {
      return class09991.N().u(14.0F, 14.0F).N(class09969.FLOATING).U(N(var0, 14)).E(-2.0F).v(6.0F).L(class09662.N(-16777216, 0.1F)).y(-1).Z(9999.0F);
   }

   private static void N(
      class11872 var0, class09785<Float> var1, class09785<Float> var2, class09785<Float> var3, class09785<String> var4, class09785<String> var5, String var6
   ) {
      Z(var6).ifPresentOrElse(var6x -> y(var0, var1, var2, var3, var4, var5, var6x), () -> var4.N(m(var0.y())));
   }

   private static float N(float var0, int var1) {
      return 0.0F + Math.clamp(var0, 0.0F, 1.0F) * M(var1);
   }

   private static class09991 N(int var0, float var1, float var2) {
      return class09991.N()
         .u(10.0F, 10.0F)
         .N(class09969.FLOATING)
         .U(var1)
         .E(var2)
         .y(var0)
         .v(6.0F)
         .L(class09662.N(-16777216, 0.1F))
         .z(1.0F)
         .u(-1)
         .Z(9999.0F)
         .N(class09983.BORDER_BOX);
   }

   private static void N(class09785<String> var0, class09844 var1) {
      String var2 = var1.y().trim();
      if (!z(var2)) {
         var1.z().N(var1.N());
         var0.N(var1.N());
      } else {
         var0.N(var2);
      }
   }

   private static void N(
      class11872 var0, float var1, class09785<Float> var2, class09785<Float> var3, class09785<String> var4, class09785<String> var5, class09864 var6
   ) {
      float var7 = Math.max(0.0F, var6.z().c().u() - 10.0F);
      float var8 = Math.max(0.0F, var6.z().c().i() - 10.0F);
      var2.N(Math.clamp(var6.N() - var6.z().c().y() - 5.0F, 0.0F, var7));
      var3.N(Math.clamp(var6.y() - var6.z().c().L() - 5.0F, 0.0F, var8));
      N(var0, var1, (Float)var2.L(), (Float)var3.L(), var7, var8, var4, var5);
   }

   private static int N(class11872 var0, int var1) {
      if (!var0.L()) {
         return var1;
      } else {
         float[] var2 = Color.RGBtoHSB(class11300.u(var1), class11300.N(var1), class11300.i(var1), null);
         float var3 = Math.min(var2[1], 0.5F);
         float var4 = Math.max(var2[2], 0.5F);
         return var3 == var2[1] && var4 == var2[2] ? var1 : class11300.N(Color.HSBtoRGB(var2[0], var3, var4), class11300.y(var1));
      }
   }

   private static void R() {
      l = new String[8];
      l[0] = "gradientDragging";
      l[1] = "hueDragging";
      l[2] = "alphaDragging";
      l[3] = "pipetteActive";
      l[4] = "pipetteListener";
      l[5] = "selectedHue";
      l[6] = "selectedAlpha";
      l[7] = "gradientSelectorX";
      Ny = new String[4];
      Ny[0] = "gradientSelectorY";
      Ny[1] = "gradientSyncedOnOpen";
      Ny[2] = "hexInput";
      Ny[3] = "alphaInput";
      Ni = new String[7];
      Ni[0] = "#";
      Ni[1] = "#";
      Ni[2] = "#";
      Ni[3] = "%";
      Ni[4] = "%";
      Ni[5] = "#%02X%02X%02X";
      Ni[6] = "colorPickerMount";
      T = new String[7];
      T[0] = "colorPickerCatcher";
      T[1] = "colorPickerPanel";
      T[2] = "alphaColorInput";
      T[3] = "hexColorInput";
      T[4] = "eye-dropper";
      T[5] = "icon:menu/eye-dropper";
      T[6] = "colorPickerAnchor";
   }
}
