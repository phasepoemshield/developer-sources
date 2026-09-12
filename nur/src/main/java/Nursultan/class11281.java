package Nursultan;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Optional;
import java.util.OptionalInt;
import java.util.stream.Stream;
import minecraft.class00743;
import minecraft.class02834;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07043;
import minecraft.class07085;
import minecraft.class08044;

public class class11281 {
   public static Object N_0 = class06202.Nq();
   public static Object N_1;
   public static Object N_2;

   public static Stream<class11297> L(class06581 var0) {
      return i(class11328.N(var0));
   }

   public static int L(int var0) {
      if (!y(var0)) {
         return u(var0) ? var0 + 36 : var0;
      } else {
         return -1;
      }
   }

   public static Stream<class11297> L(class11328 var0) {
      Objects.requireNonNull((class04453)((class06202)N_0).T_4);
      ArrayList var1 = new ArrayList();
      class00743<class06584> var2 = ((class04453)((class06202)N_0).T_4).method_31548().u();

      for (int var3 = 0; var3 < var2.size(); var3++) {
         class06584 var4 = (class06584)var2.get(var3);
         if (var0.test(var4)) {
            var1.add(new class11297(var4, var3));
         }
      }

      return var1.stream();
   }

   public static int M(class11328 var0) {
      int var1 = 0;

      for (class06584 var3 : ((class04453)((class06202)N_0).T_4).method_31548().u()) {
         if (var0.test(var3)) {
            var1 += var3.c();
         }
      }

      return var1;
   }

   private class11281() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      u();
   }

   public static Stream<class11297> i(class11328 var0) {
      Objects.requireNonNull((class04453)((class06202)N_0).T_4);
      ArrayList var1 = new ArrayList();
      class00743<class06584> var2 = ((class04453)((class06202)N_0).T_4).method_31548().u();

      for (int var3 = 0; var3 < 9; var3++) {
         class06584 var4 = (class06584)var2.get(var3);
         if (var0.test(var4)) {
            var1.add(new class11297(var4, var3));
         }
      }

      return var1.stream();
   }

   public static Stream<class11297> i(class06581 var0) {
      return L(class11328.N(var0));
   }

   private static void u() {
      N_0 = null;
      N_1 = -1;
      N_2 = 9;
   }

   public static int u(class06581 var0) {
      return M(class11328.N(var0));
   }

   public static boolean u(int var0) {
      return var0 < 9 && var0 >= 0;
   }

   public static boolean u(class11328 var0) {
      Objects.requireNonNull((class04453)((class06202)N_0).T_4);

      for (class07085 var2 : class02834.field_49224) {
         if (var2.N() == class07043.field_6178) {
            class06584 var3 = ((class04453)((class06202)N_0).T_4).method_6118(var2);
            if (var0.test(var3)) {
               return true;
            }
         }
      }

      return false;
   }

   public static boolean y(int var0) {
      return var0 == -1;
   }

   public static int y(class11328 var0) {
      Objects.requireNonNull((class04453)((class06202)N_0).T_4);
      class08044 var1 = ((class04453)((class06202)N_0).T_4).method_31548();

      for (int var2 = 0; var2 < 9; var2++) {
         if (var0.test(var1.method_5438(var2))) {
            return var2;
         }
      }

      return -1;
   }

   public static boolean y(class06581 var0) {
      return u(class11328.N(var0));
   }

   public static boolean y() {
      Objects.requireNonNull((class04453)((class06202)N_0).T_4);
      return ((class04453)((class06202)N_0).T_4).method_31548().u().stream().allMatch(class06584::R);
   }

   public static boolean N() {
      Objects.requireNonNull((class04453)((class06202)N_0).T_4);
      return ((class04453)((class06202)N_0).T_4).method_31548().u().stream().noneMatch(class06584::R);
   }

   public static class11297 N(class11328 var0) {
      Objects.requireNonNull((class04453)((class06202)N_0).T_4);
      Optional<class11297> var1 = L(var0).findFirst();
      if (var1.isEmpty()) {
         return null;
      } else {
         class11297 var2 = var1.get();
         return !var2.N().R() && !((class04453)((class06202)N_0).T_4).method_7357().N(var2.N()) ? var2 : null;
      }
   }

   public static OptionalInt N(int var0) {
      return var0 == -1 ? OptionalInt.empty() : OptionalInt.of(var0);
   }

   public static int N(class06581 var0) {
      return R(class11328.N(var0));
   }

   public static int R(class06581 var0) {
      return y(class11328.N(var0));
   }

   public static int R(class11328 var0) {
      Objects.requireNonNull((class04453)((class06202)N_0).T_4);
      class00743<class06584> var1 = ((class04453)((class06202)N_0).T_4).method_31548().u();

      for (int var2 = 0; var2 < var1.size(); var2++) {
         if (var0.test((class06584)var1.get(var2))) {
            return var2;
         }
      }

      return -1;
   }
}
