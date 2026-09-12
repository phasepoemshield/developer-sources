package Nursultan;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class class09191 {
   private static String[] u;
   public static Object N_0 = new class09191()::N;

   private class09191() {
   }

   static {
      N();
      y();
   }

   private static void y() {
   }

   private static void N() {
      u = new String[1];
      u[0] = "accountsRevision";
   }

   private class09798 N(Void var1, class09809 var2) {
      class10945 var3 = class11938.s();
      var2.L(u[0], var3::N);
      List<class09250> var4 = var3.u()
         .stream()
         .sorted(Comparator.<class09250>comparingInt(var0 -> var0.y() ? 0 : 1).thenComparing(Comparator.comparingLong(class09250::M).reversed()))
         .toList();
      class11727.N(var4.stream().map(class09250::R).collect(Collectors.toSet()));
      return class09778.N((class09991)class09198.N_0, var2x -> var2x.N_3((class09991)class09198.N_2, var2xx -> {
            for (class09250 var4x : var4) {
               var2xx.y(var2.N("account:" + var4x.R(), (class09788<class11757>)class11727.B_1, new class11757(var4x)));
            }
         }));
   }
}
