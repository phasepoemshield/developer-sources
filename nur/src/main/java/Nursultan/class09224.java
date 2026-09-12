package Nursultan;

public class class09224 {
   private static String[] z;
   public static Object N_0 = class09991.N()
      .N(class09962.y(0.0F, Float.POSITIVE_INFINITY))
      .y(class09962.N(100.0F))
      .B(8.0F)
      .y(class09973.CENTER)
      .i(20.0F)
      .N(class09983.BORDER_BOX)
      .N(class09975.ROW);
   public static Object N_1 = class09991.N().u(32.0F, 32.0F);
   public static Object y_0 = class09991.N().N(class09962.y(0.0F, Float.POSITIVE_INFINITY)).N(class09964.WORDS);
   public static Object y_1;
   public static Object L_0 = class09991.N((class09991)y_0, (class09991)class09224.u_6, class09991.N().i(-7171438), class09221.N(20, class09079.REGULAR));
   public static Object L_1 = class09991.N().N(class09692.N(class09994.L((class09743)class11644.N_0)));
   public static Object L_2;
   public static Object L_3;
   public static Object L_4;
   public static Object L_5 = class09227.N(var0 -> class09991.N(class09991.N().i(var0.M()), (class09991)L_1));
   public static Object L_6 = class09991.N().y(class09962.N()).N(class09962.N()).B(20.0F).y(class09973.CENTER);
   public static Object L_7 = class09991.N().N(class09962.N()).y(class09962.N(100.0F)).y(class09973.CENTER);
   public static Object u_0 = new class09224()::N;
   public static Object u_1;
   public static Object u_2;
   public static Object u_3;
   public static Object u_4;
   public static Object u_5;
   public static Object u_6 = class09991.N().N(class09692.N(class09994.L((class09743)class11644.N_0)));
   public static Object u_7 = class09991.N().N(class09962.N(100.0F)).y(class09962.y(66.0F)).N(class09975.ROW).y(class09973.CENTER);
   public static Object i_0 = class09991.N().u(24.0F, 24.0F);

   private static void L() {
      u_1 = 20;
      u_2 = 24;
      u_3 = 24;
      u_4 = 32;
      u_5 = 8;
   }

   private class09224() {
   }

   static {
      N();
      R();
      L();
      class09991 var70 = class09991.N();
      y_1 = class09991.N((class09991)y_0, (class09991)u_6, var70.i((Integer)class09181.N_0), class09221.N(20, class09079.REGULAR));
      class09991 var72 = class09991.N();
      L_2 = class09991.N((class09991)L_1, var72.L(var0 -> var0.i((Integer)class09181.N_0)));
      class09991 var73 = class09991.N();
      L_3 = class09991.N((class09991)L_2, var73.i((Integer)class09181.N_0));
      L_4 = class09991.N((class09991)L_2, class09991.N().i(-7171438));
   }

   private class09798 N(class11882 var1, class09809 var2) {
      class09211 var3 = var2.N((class09804<class09211>)class09211.N_6);
      class09785 var4 = var2.N(z[0], false);
      class09785 var5 = var2.N(z[1], null);
      boolean var6 = var2.L("itemEnabled:" + var1.L().N(), var1::M);
      class09991 var7 = var6 ? (class09991)y_1 : (class09991)L_0;
      return class09778.N((class09991)u_7, var7x -> {
         var7x.N("ab" + var1.L().N());
         var7x.N(class09867.POINTER_DOWN, var2xx -> {
            if (((class09864)var2xx).L() == 1 && !var1.w().isEmpty()) {
               var4.N(true);
            }
         });
         var7x.N_3((class09991)N_0, var2xx -> {
            var2xx.N("abName" + var1.L().N());
            class11867 var3xx = class11938.k().N(var1.U());
            if (var3xx.L()) {
               class09991 var4xx = class09991.N((class09991)N_1, class09991.N().N(var3xx.y(), var3xx.N(), var3xx.R(), var3xx.i()));
               var2xx.L(var2xxx -> var2xxx.N("abIcon" + var1.L().N()).L(class11938.k().y()).N(var4xx));
            } else {
               var2xx.y((class09991)N_1);
            }

            var2xx.N(var1.y(), var7);
         });
         var7x.N_3((class09991)L_6, var6xx -> {
            if (!var1.w().isEmpty()) {
               var6xx.N_3((class09991)L_7, var5xxx -> {
                  var5xxx.N_1(var1xxxx -> var4.N(true));
                  var5xxx.L(var4xxxx -> {
                     var4xxxx.N("abDots" + var1.L().N());
                     var4xxxx.L(z[3]);
                     class09991 var5xxxx = var4.L() ? ((class09227)L_5).N(var3) : (var6 ? (class09991)L_3 : (class09991)L_4);
                     var4xxxx.N(class09991.N(var5xxxx, (class09991)i_0));
                  });
                  var5xxx.y(var2.N("abModal" + var1.L().N(), (class09788<class11862>)class09202.y_0, new class11862(var1, var4)));
               });
            }

            var6xx.y(var2.N(z[2], (class09788<class11861>)class11622.N_0, new class11861(var1.M(), var2xxx -> {
               var1.N(var2xxx);
               class11519.y(class11516.class);
               var5.y();
            })));
         });
      });
   }

   private static void N() {
   }

   private static void R() {
      z = new String[4];
      z[0] = "opened";
      z[1] = "updater";
      z[2] = "switch";
      z[3] = "icon:menu/dots";
   }
}
