package Nursultan;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class class09212 {
   public static Object N_0 = new class09212()::N;
   public static Object N_1;

   private static void L() {
   }

   private class09212() {
   }

   static {
      L();
      y();
   }

   private static List<List<Entry<class11165, List<class11882>>>> i() {
      EnumMap var0 = new EnumMap<>(class11165.class);
      class11938.n().L().forEach(var1x -> var0.computeIfAbsent(var1x.i(), var0xx -> new ArrayList()).add(var1x));
      ArrayList var1 = new ArrayList(2);
      var1.add(new ArrayList());
      var1.add(new ArrayList());
      int[] var2 = new int[2];

      for (class11165 var6 : class11165.values()) {
         List var7 = (List)var0.get(var6);
         if (var7 != null && !var7.isEmpty()) {
            int var8 = var2[0] <= var2[1] ? 0 : 1;
            ((List)var1.get(var8)).add(Map.entry(var6, var7));
            var2[var8] += class09189.N(var7.size()) + 20;
         }
      }

      return var1;
   }

   private static void y() {
   }

   private class09798 N(Void var1, class09809 var2) {
      List<List<Entry<class11165, List<class11882>>>> var3 = N();
      return class09778.N((class09991)class09198.N_0, var2x -> {
         var2x.N_3((class09991)class09198.N_1, var2xx -> N(var2xx, var3.get(0), var2));
         var2x.N_3((class09991)class09198.N_1, var2xx -> N(var2xx, var3.get(1), var2));
      });
   }

   private static List<List<Entry<class11165, List<class11882>>>> N() {
      if ((List)N_1 == null) {
         N_1 = i();
      }

      return (List<List<Entry<class11165, List<class11882>>>>)N_1;
   }

   private static void N(class09784 var0, List<Entry<class11165, List<class11882>>> var1, class09809 var2) {
      for (Entry var4 : var1) {
         class11165 var5 = (class11165)var4.getKey();
         List var6 = (List)var4.getValue();
         class09785 var7 = var2.y("nursultan:autoBuyExpanded:" + var5.name(), true);
         var0.y(var2.N("autoBuy" + var5.name(), (class09788<class11859>)class09189.y_0, new class11859(var7, var5, var6)));
      }
   }
}
