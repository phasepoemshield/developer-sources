package Nursultan;

import java.util.List;

public class class09189 {
   private static String[] d;
   public static Object N_0;
   public static Object N_1 = class09991.N().N(class09692.N(class09994.L((class09743)class09189.u_2)));
   public static Object N_2 = class09991.N()
      .N(class09962.N(100.0F))
      .N(class09692.N(class09994.W((class09743)class09189.u_2)))
      .Z(12.0F)
      .z(1.0F)
      .N(class09975.COLUMN)
      .u((Integer)class09181.y_1)
      .y((Integer)class09181.y_0);
   public static Object N_3 = class09991.N().N(class09976.SELF);
   public static Object N_4 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.y(60.0F))
      .y(class09973.CENTER)
      .u(17.0F)
      .i(17.0F)
      .y()
      .N(class09983.BORDER_BOX)
      .N(new class09965(12.0F, 12.0F, 0.0F, 0.0F))
      .y((Integer)class09181.y_3);
   public static Object y_0 = new class09189()::N;
   public static Object y_1;
   public static Object y_2;
   public static Object L_0;
   public static Object L_1 = class09991.N().u(24.0F, 24.0F);
   public static Object L_2 = class09991.N().u(24.0F, 24.0F);
   public static Object L_3;
   public static Object u_0;
   public static Object u_1;
   public static Object u_2 = new class11863(260.0F, 30.0F, 1.4F, 0.2F, 4.0F, 0.008333334F);

   private class09189() {
   }

   static {
      N();
      R();
      u();
      float var64 = ((class11863)u_2).L();
      float var65 = ((class11863)u_2).i();
      float var66 = ((class11863)u_2).M();
      N_0 = new class11863(var64, var65, var66, 0.05F, 1.0F, ((class11863)u_2).R());
      L_0 = class09991.N()
         .N(class09962.N(100.0F))
         .y(class09962.N())
         .u(18.0F)
         .i(18.0F)
         .N(class09975.COLUMN)
         .N(class09983.BORDER_BOX)
         .N(class09692.N(class09994.s((class09743)N_0)));
      L_3 = class09991.N().N(class09969.FLOATING).N(0.0F, 0.0F).u(24.0F, 24.0F).N(class09692.N(class09994.s((class09743)N_0), class09994.L((class09743)N_0)));
   }

   private static void u() {
      y_1 = 1;
      y_2 = 2;
      u_0 = 12;
      u_1 = 24;
   }

   private static class09991 y(boolean var0) {
      return class09991.N((class09991)L_0, class09991.N().l(var0 ? 1.0F : 0.0F));
   }

   private static void N(class09784 var0, List<class11882> var1, class09809 var2) {
      int var3 = var1.size();

      for (int var4 = 0; var4 < var3; var4++) {
         class11882 var5 = (class11882)var1.get(var4);
         var0.N(
            new Object[]{
               var2.N(var5.L().N(), (class09788<class11882>)class09224.u_0, var5), var4 == var3 - 1 ? null : class09778.N((class09991)class09180.N_2)
            }
         );
      }
   }

   public static int N(int var0) {
      return N(var0, true);
   }

   private static class09991 N(boolean var0, boolean var1, class09211 var2) {
      int var3 = var0 ? var2.M() : -7171438;
      return class09991.N((class09991)L_3, class09991.N().i(var3).l(var0 ? 1.0F : 0.0F).N(var1));
   }

   private class09798 N(class11859 var1, class09809 var2) {
      class09211 var3 = var2.N((class09804<class09211>)class09211.N_6);
      boolean var4 = var1.L().L();
      class09785 var5 = var2.N(d[0], var4);
      class09785 var6 = var2.N(d[1], false);
      class09785 var7 = var2.N(d[2], !var4);
      class09785 var8 = var2.N(d[3], var4);
      if (var4) {
         if (!(Boolean)var5.L()) {
            var5.N(true);
         }

         if (!(Boolean)var8.L()) {
            var8.N(true);
         }
      } else if (!(Boolean)var7.L()) {
         var7.N(true);
      }

      return class09778.N(N(var1.N().size(), var4, (Boolean)var6.L()), var8x -> {
         var8x.N("autoBuyCategoryCard" + var1.y().name());
         var8x.N(class09867.POINTER_DOWN, class09860::T);
         var8x.N(class09867.TRANSITION_END, var3xx -> {
            if (((class09842)var3xx).N() == class09736.HEIGHT) {
               var6.N(false);
               if (!var1.L().L()) {
                  var5.N(false);
               }
            }
         });
         var8x.N_3((class09991)N_4, var7xx -> {
            var7xx.N(class12020.N(var1.y().N()), N(var4, var3));
            var7xx.N_3((class09991)L_1, var7xxx -> {
               var7xxx.N(class09867.POINTER_DOWN, class09860::T);
               var7xxx.N_1(var5xxxx -> {
                  boolean var6xxxx = !var1.L().L();
                  var6.N(true);
                  if (var6xxxx) {
                     var5.N(true);
                     var8.N(true);
                  } else {
                     var7.N(true);
                  }

                  var1.L().N(var6xxxx);
               });
               var7xxx.L(var6xxxx -> {
                  var6xxxx.L(d[4]);
                  var6xxxx.N(N((Boolean)var7.L()));
                  var7xxx.L(var5xxxxx -> {
                     var5xxxxx.L(d[5]);
                     var5xxxxx.N(N(var4, (Boolean)var8.L(), var3));
                     var5xxxxx.N(class09867.TRANSITION_END, var3xxxxxx -> {
                        if (((class09842)var3xxxxxx).N() == class09736.OPACITY) {
                           if (var1.L().L()) {
                              var7.N(false);
                           } else {
                              var8.N(false);
                           }
                        }
                     });
                  });
               });
            });
         });
         var8x.y((class09991)class09180.N_2);
         if ((Boolean)var5.L()) {
            var8x.N_3(y(var4), var2xx -> N(var2xx, var1.N(), var2));
         }
      });
   }

   private static class09991 N(boolean var0) {
      return class09991.N((class09991)L_2, class09991.N().i(-7171438).N(var0));
   }

   private static void N() {
   }

   public static int N(int var0, boolean var1) {
      int var2 = Math.max(0, var0);
      int var3 = var2 * 66 + Math.max(0, var2 - 1);
      int var4 = var1 ? var3 : 12;
      return 61 + var4 + 2;
   }

   private static class09991 N(int var0, boolean var1, boolean var2) {
      class09991 var3 = class09991.N((class09991)N_2, class09991.N().y(class09962.y((float)N(var0, var1))));
      return var2 ? class09991.N(var3, (class09991)N_3) : var3;
   }

   private static class09991 N(boolean var0, class09211 var1) {
      int var2 = var0 ? var1.M() : -7171438;
      return class09991.N((class09991)N_1, class09991.N().i(var2), class09221.N(22, class09079.SEMI_BOLD));
   }

   private static void R() {
      d = new String[6];
      d[0] = "renderList";
      d[1] = "animatingHeight";
      d[2] = "baseIconVisible";
      d[3] = "overlayIconVisible";
      d[4] = "icon:menu/expand";
      d[5] = "icon:menu/squeeze";
   }
}
