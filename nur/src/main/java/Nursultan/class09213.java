package Nursultan;

import java.util.Objects;

public class class09213 {
   public static Object N_0 = class09991.N().u(24.0F, 24.0F);
   public static Object N_1 = class09991.N().N(class09969.FLOATING).N(class09962.N(100.0F)).y(class09962.y(0.0F)).N(class09975.ROW).N(class09973.END);
   public static Object N_2 = class09991.N().u(0.0F, 0.0F);
   public static Object y_0 = new class09213();
   public static Object y_1 = ((class09213)y_0)::N;
   public static Object y_2;
   public static Object L_0;
   public static Object L_1;
   public static Object L_2;
   public static Object L_3;
   public static Object L_4 = class09992.N("module.keyboard.icon");
   public static Object L_5 = class09991.N().N(class09962.N(100.0F)).y(class09962.y(66.0F)).y().y(class09973.CENTER).N((class09992)L_4, var0 -> var0.l(1.0F));
   public static Object L_6 = class09991.N().N(class09692.N(class09994.L((class09743)class11644.N_0)));
   public static Object L_7 = class09991.N((class09991)L_6, class09221.N(20, class09079.REGULAR));
   public static Object u_0 = class09991.N().u(20.0F, 20.0F);
   public static Object u_1 = class09991.N().N(class09692.N(class09994.L((class09743)class11644.N_0), class09994.s((class09743)class11644.N_0)));
   public static Object u_2 = class09991.N((class09991)u_1, class09991.N().N((class09992)L_4).l(0.0F));
   public static Object u_3;
   public static Object u_4;
   public static Object u_5 = class09227.N(var0 -> class09991.N((class09991)u_2, class09991.N().i(var0.M())));
   public static Object u_6 = class09991.N().y(class09962.N()).N(class09962.N()).B(20.0F).y(class09973.CENTER);
   public static Object u_7 = class09991.N().N(class09962.N()).y(class09962.N(100.0F)).y(class09973.CENTER);
   public static Object i_0;
   public static Object i_1 = class09991.N((class09991)L_7, class09991.N().i(-7171438));
   public static Object i_2 = class09991.N().N(class09692.N(class09994.L((class09743)class11644.N_0)));
   public static Object i_3;
   public static Object i_4;
   public static Object i_5;
   public static Object i_6 = class09227.N(var0 -> class09991.N(class09991.N().i(var0.M()), (class09991)i_2));
   public static Object i_7 = class09991.N().u(20.0F, 20.0F).N(class09973.CENTER).y(class09973.CENTER);

   private static void L() {
   }

   private class09213() {
   }

   static {
      L();
      u();
      N();
      Objects.requireNonNull(y_0);
      class09991 var68 = class09991.N();
      i_0 = class09991.N((class09991)L_7, var68.i((Integer)class09181.N_0));
      class09991 var70 = class09991.N();
      i_3 = class09991.N((class09991)i_2, var70.L(var0 -> var0.i((Integer)class09181.N_0)));
      class09991 var71 = class09991.N();
      i_4 = class09991.N((class09991)i_3, var71.i((Integer)class09181.N_0));
      i_5 = class09991.N((class09991)i_3, class09991.N().i(-7171438));
      class09991 var74 = class09991.N().i((Integer)class09181.N_0);
      u_3 = class09991.N((class09991)u_2, var74.L(var0 -> var0.i((Integer)class09181.N_0)));
      class09991 var75 = class09991.N().i(-7171438);
      u_4 = class09991.N((class09991)u_2, var75.L(var0 -> var0.i((Integer)class09181.N_0)));
   }

   private static void u() {
   }

   private class09798 N(class11067 var1, class09809 var2) {
      class09211 var3 = var2.N((class09804<class09211>)class09211.N_6);
      class09785 var4 = var2.N("opened", false);
      class09785 var5 = var2.N("bindOpened", false);
      class09785 var6 = var2.N("tooltipShown", false);
      class09785 var7 = var2.y("nursultan:clientSettingsOpened", false);
      class09785 var8 = var2.y("nursultan:openModuleSettings", "");
      if ((Boolean)var4.L() && !var1.N().equals(var8.L())) {
         var8.N(var1.N());
      } else if (!(Boolean)var4.L() && var1.N().equals(var8.L())) {
         var8.N("");
      }

      class09225 var9 = var2.u("tooltipDelay", () -> new class09225(0.5F));
      var9.N(() -> var6.N(true));
      String var10 = class12020.N(var1.B());
      boolean var11 = !var10.equals(var1.B().N());
      boolean var12 = var2.L("moduleEnabled:" + var1.N(), var1::U);
      class09991 var13 = var12 ? (class09991)i_0 : (class09991)i_1;
      return class09778.N(
         (class09991)L_5,
         var13x -> {
            var13x.N("m" + var1.N());
            var13x.N(class09867.POINTER_DOWN, var4xx -> {
               class09864 var5xx = (class09864)var4xx;
               if (var5xx.L() == 2) {
                  var5.N(true);
                  var9.y();
                  var6.N(false);
                  var4xx.j();
                  var4xx.T();
               } else if (var5xx.L() == 1) {
                  var4.N(true);
                  var9.y();
                  var6.N(false);
               }
            });
            if (var11) {
               var13x.N(class09867.HOVER_ENTER, var5xx -> {
                  class09834 var6xx = (class09834)var5xx;
                  if (!N(var5xx.z(), var6xx.L())) {
                     if (!(Boolean)var4.L() && !(Boolean)var5.L() && !(Boolean)var7.L() && ((String)var8.L()).isEmpty() && class11938.B().y()) {
                        var9.i();
                     }
                  }
               }, class09876.N());
               var13x.N(class09867.HOVER_LEAVE, var2xx -> {
                  class09834 var3xx = (class09834)var2xx;
                  if (!N(var2xx.z(), var3xx.L())) {
                     var9.y();
                     var6.N(false);
                  }
               }, class09876.N());
            }

            var13x.N(var1.L(), var13);
            var13x.N_3((class09991)u_6, var8xx -> {
               var8xx.N_3((class09991)i_7, var7xxx -> {
                  var7xxx.N("keyboard" + var1.N());
                  var7xxx.N(class09867.POINTER_DOWN, class09860::T);
                  var7xxx.N_1(var3xxxx -> {
                     var5.N(true);
                     var9.y();
                     var6.N(false);
                     var3xxxx.T();
                  });
                  var7xxx.L(var4xxxx -> {
                     var4xxxx.N("keyboardIcon" + var1.N());
                     var4xxxx.L("icon:menu/bind");
                     class09991 var5xxxx = var5.L() ? ((class09227)u_5).N(var3) : (var12 ? (class09991)u_3 : (class09991)u_4);
                     var4xxxx.N(class09991.N(var5xxxx, (class09991)u_0));
                  });
                  var7xxx.y(var2.N("bindModal" + var1.N(), (class09788<class11866>)class09190.L_0, new class11866(var1, var5)));
               });
               if (!var1.w().isEmpty()) {
                  var8xx.N_3((class09991)u_7, var7xxx -> {
                     var7xxx.N_1(var3xxxx -> {
                        var4.N(true);
                        var9.y();
                        var6.N(false);
                     });
                     var7xxx.L(var4xxxx -> {
                        var4xxxx.N("dots" + var1.N());
                        var4xxxx.L("icon:menu/dots");
                        class09991 var5xxxx = var4.L() ? ((class09227)i_6).N(var3) : (var12 ? (class09991)i_4 : (class09991)i_5);
                        var4xxxx.N(class09991.N(var5xxxx, (class09991)N_0));
                     });
                     var7xxx.y(var2.N("modal" + var1.N(), (class09788<class11862>)class09202.y_0, new class11862(var1, var4)));
                  });
               }

               var8xx.y(var2.N("switch", (class09788<class11861>)class11622.N_0, new class11861(var12, var1::N)));
            });
            boolean var14 = var11
               && (Boolean)var6.L()
               && !(Boolean)var4.L()
               && !(Boolean)var5.L()
               && !(Boolean)var7.L()
               && ((String)var8.L()).isEmpty()
               && class11938.B().y();
            var13x.N_3((class09991)N_1, var4xx -> {
               var4xx.N_3((class09991)N_2, var1xxx -> var1xxx.N("tooltipAnchor" + var1.N()));
               if (var14) {
                  var4xx.y(var2.N("tooltipContent" + var1.N(), (class09788<class11846>)class09217.y_0, new class11846(var1, var10, "tooltipAnchor" + var1.N())));
               }
            });
         }
      );
   }

   private static void N() {
      y_0 = null;
      y_1 = null;
      y_2 = 0.5F;
      L_0 = 20;
      L_1 = 24;
      L_2 = 24;
      L_3 = 20;
      L_4 = null;
      L_5 = null;
      L_6 = null;
      L_7 = null;
      i_0 = null;
      i_1 = null;
      i_2 = null;
      i_3 = null;
      i_4 = null;
      i_5 = null;
      i_6 = null;
      i_7 = null;
      u_0 = null;
      u_1 = null;
      u_2 = null;
      u_3 = null;
      u_4 = null;
      u_5 = null;
      u_6 = null;
      u_7 = null;
      N_0 = null;
      N_1 = null;
      N_2 = null;
   }

   private static boolean N(class09904 var0, class09904 var1) {
      for (class09904 var2 = var1; var2 != null; var2 = var2.X()) {
         if (var2 == var0) {
            return true;
         }
      }

      return false;
   }
}
