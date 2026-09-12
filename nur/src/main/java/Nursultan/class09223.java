package Nursultan;

import java.util.EnumMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class class09223 {
   public static Object N_0 = new class09223()::N;
   public static Object N_1 = new EnumMap<>(class11072.class);
   public static Object N_2 = new HashMap();

   private static void L() {
   }

   private class09223() {
   }

   static {
      L();
      u();
   }

   private static void u() {
      N_0 = null;
      N_1 = null;
      N_2 = null;
   }

   private static void N(class09784 var0, List<Entry<class11106, List<class11067>>> var1, class09809 var2, class11072 var3) {
      for (Entry var5 : var1) {
         class11106 var6 = (class11106)var5.getKey();
         List var7 = (List)var5.getValue();
         String var8 = var6.N().N();
         String var9 = var8 + "expanded" + var3.N().N();
         class09785 var10 = var2.y("nursultan:subcategoryExpanded:" + var9, () -> {
            Boolean var1x = class11938.M().N(class11292.class).y(var9);
            return var1x != null ? var1x : true;
         });
         ((Map)N_2).put(var9, var10);
         var0.y(var2.N(var8, (class09788<class11838>)class09187.N_0, new class11838(var10, var6, var7)));
      }
   }

   private class09798 N(class11072 var1, class09809 var2) {
      List var3 = ((Map)N_1).computeIfAbsent(var1, class09223::N);
      return class09778.N((class09991)class09198.N_0, var3x -> {
         var3x.N_3((class09991)class09198.N_1, var3xx -> N(var3xx, (List<Entry<class11106, List<class11067>>>)var3.get(0), var2, var1));
         var3x.N_3((class09991)class09198.N_1, var3xx -> N(var3xx, (List<Entry<class11106, List<class11067>>>)var3.get(1), var2, var1));
      });
   }

   public static Map<String, class09785<Boolean>> N() {
      return (Map<String, class09785<Boolean>>)N_2;
   }

   private static List<List<Entry<class11106, List<class11067>>>> N(class11072 var0) {
      Map var1 = class11938.u()
         .a()
         .filter(var1x -> var1x.M() == var0)
         .collect(Collectors.groupingBy(class11067::z, () -> new EnumMap<>(class11106.class), Collectors.toList()));
      return class09186.N(var0, var1, 20);
   }
}
