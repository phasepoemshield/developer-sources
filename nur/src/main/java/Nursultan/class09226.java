package Nursultan;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map.Entry;

public class class09226 {
   private static String[] P;
   public static Object N_0 = new class09226()::N;
   public static Object N_1;
   public static Object N_2 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).u(20.0F).i(20.0F).B(20.0F).N(class09975.COLUMN).N(class09983.BORDER_BOX);
   public static Object N_3 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.N())
      .Z(12.0F)
      .z(1.0F)
      .M(1.0F)
      .N(class09983.BORDER_BOX)
      .N(class09975.COLUMN)
      .u((Integer)class09181.y_1)
      .y((Integer)class09181.y_0);
   public static Object y_0 = class09991.N()
      .N(class09962.N(100.0F))
      .y(class09962.y(60.0F))
      .y(class09973.CENTER)
      .u(17.0F)
      .i(17.0F)
      .N(class09983.BORDER_BOX)
      .N(new class09965(12.0F, 12.0F, 0.0F, 0.0F))
      .y((Integer)class09181.y_3);
   public static Object y_1 = class09227.N(var0 -> class09991.N(class09991.N().i(var0.M()), class09221.N(18, class09079.SEMI_BOLD)));
   public static Object y_2 = class09991.N().N(class09962.N(100.0F)).y(class09962.N()).u(18.0F).i(18.0F).N(class09975.COLUMN).N(class09983.BORDER_BOX);
   public static Object y_3 = class09991.N().N(class09962.N(100.0F)).y(class09962.y(60.0F)).N(class09973.CENTER).y(class09973.CENTER);
   public static Object y_4 = class09991.N(class09991.N().i(-7171438), class09221.N(18, class09079.REGULAR));

   private class09226() {
   }

   static {
      N();
      y();
      i();
      u();
   }

   private static void i() {
      P = new String[4];
      P[0] = "settingUpdater";
      P[1] = " » ";
      P[2] = "search.nothing-found";
      P[3] = " » ";
   }

   private static void u() {
      N_1 = P[3];
   }

   private static void y() {
   }

   private static int N(class11854 var0) {
      if (var0 == class11854.CONFIGS) {
         return 4;
      } else if (var0 == class11854.AUTO_BUY) {
         return 8;
      } else if (var0 == class11854.ACCOUNTS) {
         return 16;
      } else {
         return var0.N() != null ? 3 : 0;
      }
   }

   private static int N(Entry<String, List<class11510>> var0) {
      int var1 = Integer.MIN_VALUE;

      for (class11510 var3 : (List)var0.getValue()) {
         var1 = Math.max(var1, var3.L());
      }

      return var1;
   }

   private static List<Entry<String, List<class11510>>> N(class09214 var0) {
      List<class11510> var1 = class11503.N(var0.N(), N(var0.y()));
      LinkedHashMap var2 = new LinkedHashMap();

      for (class11510 var4 : var1) {
         if (var4.N() instanceof class11067
            || var4.N() instanceof class11536
            || var4.N() instanceof class11290
            || var4.N() instanceof class11882
            || var4.N() instanceof class09250) {
            var2.computeIfAbsent(String.join(P[1], var4.y()), var0x -> new ArrayList<>()).add(var4);
         }
      }

      ArrayList var5 = new ArrayList(var2.entrySet());
      Iterator var6 = var5.iterator();

      while (var6.hasNext()) {
         ((List)((Entry)var6.next()).getValue()).sort(Comparator.comparingInt(class11510::L).reversed());
      }

      var5.sort(Comparator.<Entry<String, List<class11510>>>comparingInt(class09226::N).reversed());
      return var5;
   }

   private class09798 N(class09214 var1, class09809 var2) {
      class09211 var3 = var2.N((class09804<class09211>)class09211.N_6);
      class09785 var4 = var2.N(P[0], null);
      List<Entry<String, List<class11510>>> var5 = N(var1);
      if (var5.isEmpty()) {
         return class09778.N((class09991)N_2, var0 -> var0.N_3((class09991)y_3, var0x -> var0x.N(class12020.N(P[2]), (class09991)y_4)));
      } else {
         class09991 var6 = ((class09227)y_1).N(var3);
         return class09778.N((class09991)N_2, var4x -> {
            for (Entry var6x : var5) {
               String var7 = (String)var6x.getKey();
               List var8 = (List)var6x.getValue();
               var4x.N_3((class09991)N_3, var5x -> {
                  var5x.N("searchGroup:" + var7);
                  var5x.N(class09867.POINTER_DOWN, class09860::T);
                  var5x.N_3((class09991)y_0, var2xxx -> var2xxx.N(var7, var6));
                  var5x.y((class09991)class09180.N_2);
                  var5x.N_3((class09991)y_2, var3xxx -> N(var3xxx, var8, var4, var2));
               });
            }
         });
      }
   }

   private static void N() {
   }

   private static void N(class09784 var0, List<class11510> var1, class09785<Void> var2, class09809 var3) {
      for (int var4 = 0; var4 < var1.size(); var4++) {
         Object var5 = ((class11510)var1.get(var4)).N();
         if (var5 instanceof class11067 var6) {
            var0.y(var3.N("moduleHit:" + var6.N(), (class09788<class11067>)class09213.y_1, var6));
         } else if (var5 instanceof class11536 var7) {
            var0.y(var3.N("settingHit:" + var7.P().N(), (class09788<class11844>)class09219.N_0, new class11844(var7, var2)));
         } else if (var5 instanceof class11290 var8) {
            var0.y(var3.N("presetHit:" + var8.u(), (class09788<class11290>)class09184.L_2, var8));
         } else if (var5 instanceof class11882 var9) {
            var0.y(var3.N("autoBuyHit:" + var9.L().N(), (class09788<class11882>)class09224.u_0, var9));
         } else if (var5 instanceof class09250 var10) {
            var0.y(var3.N("accountHit:" + var10.R(), (class09788<class09250>)class11727.u_0, var10));
         }

         if (var4 < var1.size() - 1) {
            var0.y((class09991)class09180.N_2);
         }
      }
   }
}
