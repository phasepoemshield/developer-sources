package Nursultan;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class class09179 {
   private static String[] L;
   public static Object N_0 = new class09179()::N;

   private class09179() {
   }

   static {
      y();
      u();
      N();
   }

   private static void u() {
      L = new String[1];
      L[0] = "presetsRevision";
   }

   private static void y() {
   }

   private static void N() {
   }

   private class09798 N(Void var1, class09809 var2) {
      var2.L(L[0], class11938.G()::N);
      ArrayList var3 = new ArrayList();

      for (class11290 var5 : class11938.G().L()) {
         if (var5.M() != class11296.DELETING) {
            var3.add(var5);
         }
      }

      var3.sort((var0, var1x) -> Long.compare(var1x.B(), var0.B()));
      class09184.N(var3.stream().map(class11290::u).collect(Collectors.toSet()));
      return class09778.N((class09991)class09198.N_0, var2x -> var2x.N_3((class09991)class09198.N_2, var2xx -> {
            for (int var3x = 0; var3x < var3.size(); var3x++) {
               class11290 var4 = (class11290)var3.get(var3x);
               var2xx.y(var2.N("preset:" + var4.u(), (class09788<class09207>)class09184.L_1, new class09207(var4, var3x == var3.size() - 1)));
            }
         }));
   }
}
