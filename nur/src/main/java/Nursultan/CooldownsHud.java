package Nursultan;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.Map.Entry;
import minecraft.class01894;
import minecraft.class03448;
import minecraft.class04206;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06556;
import minecraft.class06570;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class08044;

@class11761(
   u = "cooldowns",
   i = 100.0F,
   N = 380.0F,
   L = true
)
public class CooldownsHud extends class11769 {
   public static Object N_0 = class06202.Nq();
   public static Object N_1 = class06570.nz.E();
   public static Object N_2;
   public static Object N_3 = class01894.y("nursultan_example_ender_pearl");
   public static Object N_4;
   public static Object N_5;
   public static Object N_6;
   public static Object N_7;
   public static Object y_0;
   public static Object y_1;
   public static Object L_0 = class09991.N()
      .N(class09962.N())
      .y(class09962.N(100.0F))
      .N(11.0F)
      .i(11.0F)
      .N(class09973.CENTER)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX);
   public static Object L_1 = class09227.N(var0 -> class09991.N().u(16.0F, 16.0F).i(var0.M()));
   public static Object L_2 = class09991.N()
      .y(class09962.N(38.0F, Float.POSITIVE_INFINITY))
      .N(10.0F)
      .i(9.0F)
      .M(9.0F)
      .N(class09975.COLUMN)
      .N(class09983.BORDER_BOX);
   public static Object L_3 = class09991.N()
      .N(class09962.N(0.0F, Float.POSITIVE_INFINITY))
      .y(class09962.N())
      .N(class09975.ROW)
      .B(4.0F)
      .y(class09973.CENTER)
      .N(class09983.BORDER_BOX);
   public static Object L_4 = class09991.N().u(16.0F, 16.0F);
   public static Object L_5;
   public static Object L_6 = class09227.N(var0 -> class09991.N(class09991.N().i(var0.M()), class09221.N(14, class09079.MEDIUM)));
   public static Object L_7 = class09991.N().N(class09962.N(45.0F, Float.POSITIVE_INFINITY)).y(class09962.N()).N(class09973.END).y(class09973.CENTER);
   public static Object u_0;
   public static Object u_1;
   public Object i_0;

   public CooldownsHud() {
      super(CooldownsHud::N);
      this.t();
      this.i_0 = new class11740(120.0F);
   }

   static {
      d();
      class09991 var65 = class09991.N().N(class09962.N());
      y_1 = class09991.N((class09991)class11756.y_1, var65.y(class09962.N()).N(class09975.ROW).N(class09976.SELF).N(1.0F));
      class09991 var71 = class09991.N();
      L_5 = class09991.N(var71.i((Integer)class09181.N_0), class09221.N(14, class09079.REGULAR));
   }

   private static String i(int var0) {
      float var1 = (class03448)((class06202)N_0).T_3 != null ? ((class03448)((class06202)N_0).T_3).method_54719().R() : 20.0F;
      int var2 = Math.max(0, (int)Math.ceil((double)((float)var0 / Math.max(1.0F, var1))));
      int var3 = var2 / 60;
      int var4 = var2 % 60;
      return var3 + ":" + (var4 < 10 ? "0" + var4 : Integer.toString(var4));
   }

   private static List<class11751> b() {
      if ((class04453)((class06202)N_0).T_4 == null) {
         return List.of();
      } else {
         class06556 var0 = ((class04453)((class06202)N_0).T_4).method_7357();
         Set var1 = class11938.u().G().m() ? N(var0) : null;
         int var2 = var0.y;
         ArrayList var3 = new ArrayList();

         for (Entry var5 : var0.N.entrySet()) {
            int var6 = ((class10621)var5.getValue()).y() - var2;
            if (var6 > 0 && (var1 == null || var1.contains(var5.getKey()))) {
               class06581 var7 = (class06581)class04206.B.N((class01894)var5.getKey());
               if (var7 != class06570.N) {
                  var3.add(new class11751((class01894)var5.getKey(), var7.E(), var6));
               }
            }
         }

         return var3;
      }
   }

   private static void d() {
      N_0 = null;
      N_1 = null;
      N_2 = 600;
      N_3 = null;
      N_4 = 10;
      N_5 = 16;
      N_6 = 120;
      N_7 = 14;
      u_0 = 4;
      u_1 = 20;
      y_0 = 45;
      y_1 = null;
      L_0 = null;
      L_1 = null;
      L_2 = null;
      L_3 = null;
      L_4 = null;
      L_5 = null;
      L_6 = null;
      L_7 = null;
   }

   private void t() {
   }

   private static List<String> j() {
      return b().stream().map(var0 -> var0.y() + " " + i(var0.N())).toList();
   }

   @Override
   public boolean y() {
      return class11938.u().G().U();
   }

   private static float N(String var0, String var1) {
      class11753 var2 = class11938.i();
      float var3 = var2.N(var0, 14.0F, class09079.REGULAR);
      float var4 = Math.max(45.0F, var2.N(var1, 14.0F, class09079.MEDIUM));
      return 59.0F + var3 + var4;
   }

   private static class09798 N(String var0, class06584 var1) {
      class11867 var2 = class11938.k().N(var1);
      return class09778.N((class09991)L_4, var2x -> {
         var2x.N(var0 + "-iconSlot");
         if (var2.L()) {
            class09991 var3 = class09991.N((class09991)L_4, class09991.N().N(var2.y(), var2.N(), var2.R(), var2.i()));
            var2x.L(var2xx -> var2xx.N(var0 + "-icon").L(class11938.k().y()).N(var3));
         }
      });
   }

   private static class09798 N(String var0, String var1, class09211 var2) {
      return class09778.N((class09991)L_7, var3 -> {
         var3.N(var0 + "-durationBox");
         var3.y(var3x -> var3x.N(var0 + "-duration").L(var1).N(((class09227)L_6).N(var2)));
      });
   }

   private static class09798 N(Void var0, class09809 var1) {
      class09211 var2 = var1.N((class09804<class09211>)class09211.N_6);
      CooldownsHud var3 = (CooldownsHud)class11730.N_5;
      var1.u("cooldownsTicker", () -> (class11740)var3.i_0);
      var1.L("cooldownsDurations", CooldownsHud::j);
      List var4 = ((class11740)var3.i_0).N(b(), class11751::y);
      boolean var5 = class11753.y();
      boolean var6 = !var4.isEmpty() || var5;
      boolean var7 = ((class11740)var3.i_0).N(var6);
      float var8 = ((class11740)var3.i_0).N(var6, N(var4, var5));
      return class09778.N((class09991)y_1, var5x -> {
         var5x.N("cooldownsWindow");
         var5x.N_3((class09991)L_0, var1xx -> {
            var1xx.N("cooldownsIconArea");
            var1xx.L(var1xxx -> var1xxx.N("hud-cooldowns").L("icon:hud/cooldowns").N(((class09227)L_1).N(var2)));
         });
         var5x.N(var0xx -> var0xx.N("cooldownsDivider").N((class09991)class09180.N_3));
         var5x.y(N(var4, var5, var2, var7, var8));
      });
   }

   @Override
   public boolean N() {
      return !b().isEmpty() || class11753.y();
   }

   private static String N(class01894 var0) {
      return "cooldownRow-" + var0.toString().replace(':', '-');
   }

   private static class09798 N(List<class11751> var0, boolean var1, class09211 var2, boolean var3, float var4) {
      return class09778.N(
         var3 ? class11756.N((class09991)L_2, var4, 120.0F, (class09728)class11644.N_0) : class11756.N((class09991)L_2, var4, 120.0F), var4x -> {
            var4x.N("cooldownsContentBox");
            if (var0.isEmpty() && var1) {
               String var10 = N((class01894)N_3);
               var4x.N_3(class11756.N(true, var3), var2xx -> {
                  var2xx.N(var10);
                  var2xx.y(N(var10, (class06584)N_1, ((class06584)N_1).d().getString()));
                  var2xx.y(N(var10, i(600), var2));
               });
            } else {
               int var5 = 0;

               for (class11751 var7 : var0) {
                  String var8 = N(var7.y());
                  class09991 var9 = ((class11740)((CooldownsHud)class11730.N_5).i_0).N(var7.y()) ? (class09991)class11756.L_5 : class11756.N(var5++ == 0, var3);
                  var4x.N_3(var9, var3xx -> {
                     var3xx.N(var8);
                     var3xx.y(N(var8, var7.L(), var7.L().d().getString()));
                     var3xx.y(N(var8, i(var7.N()), var2));
                  });
               }
            }
         }
      );
   }

   private static float N(List<class11751> var0, boolean var1) {
      if (var0.isEmpty() && var1) {
         return N(((class06584)N_1).d().getString(), i(600));
      } else {
         float var2 = 0.0F;

         for (class11751 var4 : var0) {
            var2 = Math.max(var2, N(var4.L().d().getString(), i(var4.N())));
         }

         return var2;
      }
   }

   private static Set<class01894> N(class06556 var0) {
      HashSet var1 = new HashSet();
      class08044 var2 = ((class04453)((class06202)N_0).T_4).method_31548();

      for (int var3 = 0; var3 < var2.method_5439(); var3++) {
         class06584 var4 = var2.method_5438(var3);
         if (!var4.R()) {
            class01894 var5 = var0.y(var4);
            if (var5 != null) {
               var1.add(var5);
            }
         }
      }

      return var1;
   }

   private static class09798 N(String var0, class06584 var1, String var2) {
      return class09778.N((class09991)L_3, var3 -> {
         var3.N(var0 + "-left");
         var3.y(N(var0, var1));
         var3.y(var2xx -> var2xx.N(var0 + "-name").L(var2).N((class09991)L_5));
      });
   }
}
