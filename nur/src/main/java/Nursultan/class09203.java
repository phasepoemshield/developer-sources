package Nursultan;

public class class09203 {
   public static Object N_0;
   public static Object N_1;
   public static Object N_2 = class09991.N().N(class09962.N(100.0F)).y(class09962.N(100.0F)).N(class09975.COLUMN);
   public static Object N_3 = class09991.N()
      .N(class09976.SELF)
      .N(class09993.AUTO)
      .N(class09970.OVERLAY)
      .N(class09180.N(20.0F, 8.0F).L(4.0F))
      .N(class09975.COLUMN)
      .N(class09962.N(100.0F))
      .y(class09962.y(659.0F));
   public static Object N_4 = class09991.N().y(class09962.y(20.0F));
   public static Object N_5 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).N(class09975.COLUMN);
   public static Object N_6 = class09991.N((class09991)N_5, class09991.N().N(class09969.FLOATING).M());
   public static Object N_7 = class09203::N;
   public static Object y_0;
   public static Object y_1;
   public static Object y_2;
   public static Object y_3;
   public static Object L_0 = new class09203()::y;
   public static Object L_1 = new class11863(220.0F, 20.0F, 1.0F, 0.2F, 4.0F, 0.008333334F);
   public static Object L_2;
   public static Object L_3 = class09759.EASE_OUT;
   public static Object L_4 = new class09728(0.25F, (class09759)L_3);
   public static Object L_5;

   private class09203() {
   }

   static {
      y();
      N();
   }

   private class09798 y(class09785<class11854> var1, class09809 var2) {
      return class09778.N(
         (class09991)N_2,
         var2x -> var2x.N(
               new Object[]{
                  var2.N("header", (class09788<class09785>)class09216.i_0, var1),
                  class09778.N((class09991)class09180.N_2),
                  var2.N("container", (class09788<class09785>)N_7, var1)
               }
            )
      );
   }

   private static void y() {
   }

   private static String N(String var0, int var1, class11854 var2) {
      return var0 + "_" + var1 + "_" + var2.name();
   }

   private static class09798 N(class09785<class11854> var0, class09809 var1) {
      String var3 = var1.y("nursultan:searchQuery", "").L();
      if (var3 != null && !var3.isBlank()) {
         return N(var0, var1, var3);
      } else {
         class09785 var4 = var1.N("contentTransition", () -> class09229.y((class11854)var0.L()));
         class11854 var5 = var0.L();
         class09229 var6 = (class09229)var4.L();
         if (var5 != var6.y()) {
            var6 = var6.N(var5);
            var4.N(var6);
         }

         class11854 var7 = var6.y();
         int var8 = var6.N();
         boolean var9 = var6.B();
         class09798 var10;
         float var11;
         if (var9) {
            class11854 var12 = var6.L();
            int var13 = Math.abs(var7.ordinal() - var12.ordinal());
            float var14 = Math.min(1.0F, (float)Math.max(0, var13 - 1) * 0.5F);
            float var15 = 659.0F * (1.0F + var14);
            int var16 = var6.u();
            var11 = (float)var16 * var15;
            var10 = N(N("prev", var8, var12), var12, (float)(-var16) * var15, 0.0F, 0.0F, 1.0F, var1, "prev_", null, var8, false);
         } else {
            var11 = 0.0F;
            var10 = null;
         }

         class09798 var17 = N(N("new", var8, var7), var7, 0.0F, 1.0F, var11, var9 ? 0.0F : 1.0F, var1, "", var9 ? var4 : null, var8, true);
         return class09778.N((class09991)N_3, var3x -> {
            var3x.N("content:" + var7.name());
            if (var10 != null) {
               var3x.y(var10);
            }

            var3x.y(var17);
         });
      }
   }

   private static class09798 N(class09809 var0, class11854 var1, String var2) {
      String var3 = var2 + "tab:" + var1.name();
      class11072 var4 = var1.N();
      if (var4 != null) {
         return var0.N(var3, (class09788<class11072>)class09223.N_0, var4);
      } else if (var1 == class11854.CONFIGS) {
         return var0.N(var3, (class09788)class09179.N_0, null);
      } else {
         return var1 == class11854.AUTO_BUY ? var0.N(var3, (class09788)class09212.N_0, null) : var0.N(var3, (class09788)class09191.N_0, null);
      }
   }

   private static class09798 N(
      String var0,
      class11854 var1,
      float var2,
      float var3,
      float var4,
      float var5,
      class09809 var6,
      String var7,
      class09785<class09229> var8,
      int var9,
      boolean var10
   ) {
      return class09778.N(
         class09991.N(
            var10 ? (class09991)N_5 : (class09991)N_6,
            class09991.N().m(var2).l(var3).N(class09692.N(class09994.Z((class11863)L_1), class09994.s((class09728)L_4))).N(var2x -> var2x.m(var4).l(var5))
         ),
         var6x -> {
            var6x.N(var0);
            if (var8 != null) {
               var6x.N(class09867.TRANSITION_END, var3xx -> {
                  class09842 var4xx = (class09842)var3xx;
                  if (var4xx.N() == class09736.VISUAL_TRANSLATE_Y && var4xx.y()) {
                     var8.N(var2xxx -> var2xxx.N() == var9 && var2xxx.y() == var1 ? var2xxx.R() : var2xxx);
                  }
               });
            }

            var6x.y((class09991)N_4);
            var6x.y(N(var6, var1, var7));
            if (var1 != class11854.ACCOUNTS) {
               var6x.y((class09991)N_4);
            }
         }
      );
   }

   private static void N() {
      L_0 = null;
      L_1 = null;
      L_2 = 0.25F;
      L_3 = null;
      L_4 = null;
      L_5 = 659;
      y_0 = 4;
      y_1 = 8;
      y_2 = 4;
      y_3 = 659.0F;
      N_0 = 0.5F;
      N_1 = 1.0F;
      N_2 = null;
      N_3 = null;
      N_4 = null;
      N_5 = null;
      N_6 = null;
      N_7 = null;
   }

   private static class09798 N(class09785<class11854> var0, class09809 var1, String var2) {
      return class09778.N(
         (class09991)N_3,
         var3 -> var3.N("content:search")
               .N(
                  new Object[]{
                     class09778.N((class09991)N_4),
                     var1.N("searchResults", (class09788<class09214>)class09226.N_0, new class09214(var2, (class11854)var0.L())),
                     class09778.N((class09991)N_4)
                  }
               )
      );
   }
}
