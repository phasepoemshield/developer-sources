package Nursultan;

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import minecraft.class05216;
import minecraft.class05410;
import minecraft.class06922;
import minecraft.class06937;
import minecraft.class07482;
import minecraft.class07490;
import minecraft.class07510;

public class class11305 {
   private static String[] N;

   private static void L() {
   }

   private static boolean L(class07482 var0, int var1) {
      return IntStream.range(0, var1).noneMatch(var1x -> var0.L(var1x).R());
   }

   public static class11284 L(class06922 var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.N.method_5439();
      return N(N[2], var1, var2, var3, var4, 25, var2x -> y(var0, var5, var2x.booleanValue()));
   }

   public static class11284 L(class07490 var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.E().method_5439();
      return N(N[4], var1, var2, var3, var4, 0, var2x -> L(var0, var5, var2x.booleanValue()));
   }

   private static void L(class07482 var0, int var1, boolean var2) {
      N(var0, 0, var1, 1, class07510.field_7795, var2, class06937::R);
   }

   private class11305() {
      throw new UnsupportedOperationException(N[7]);
   }

   static {
      L();
      y();
      N();
   }

   private static void y() {
   }

   private static void y(class07482 var0, int var1, boolean var2) {
      N(var0, 0, var1, 0, class07510.field_7794, var2, class06937::R);
   }

   public static boolean y(class06922 var0) {
      return L(var0, var0.N.method_5439());
   }

   private static boolean y(class07482 var0, int var1) {
      for (int var2 = var1; var2 < var1 + 36; var2++) {
         class06937 var3 = var0.L(var2);
         if (var3.R() && !class11929.y(var3.i())) {
            return false;
         }
      }

      return true;
   }

   public static class11284 y(class07490 var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.E().method_5439();
      return N(N[6], var1, var2, var3, var4, 50, var2x -> N(var0, var5, var2x.booleanValue()));
   }

   public static class11284 y(class06922 var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.N.method_5439();
      return N(N[1], var1, var2, var3, var4, 0, var2x -> L(var0, var5, var2x.booleanValue()));
   }

   public static boolean y(class07490 var0) {
      return y(var0, var0.E().method_5439());
   }

   private static class11284 N(String var0, int var1, int var2, int var3, int var4, int var5, Consumer<Boolean> var6) {
      class05216 var7 = class11921.N(var0);
      return new class11279(var7, var0x -> {
      }).N(100, 20).y((var1 - var3) / 2 + var3 + 5, (var2 - var4) / 2 + var5).N(var1x -> var6.accept(true)).y(var1x -> var6.accept(false)).N();
   }

   public static class11284 N(class05410 var0, int var1, int var2) {
      class05216 var3 = class11921.N(N[0]);
      return new class11279(var3, var0x -> {
      }).N(100, 20).y(var1 / 2 - 50, var2 / 2 - 105).N(var1x -> N(var0, true)).y(var1x -> N(var0, false)).N();
   }

   public static boolean N(class07490 var0) {
      return L(var0, var0.E().method_5439());
   }

   public static class11284 N(class07490 var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.E().method_5439();
      return N(N[5], var1, var2, var3, var4, 25, var2x -> y(var0, var5, var2x.booleanValue()));
   }

   public static class11284 N(class06922 var0, int var1, int var2, int var3, int var4) {
      int var5 = var0.N.method_5439();
      return N(N[3], var1, var2, var3, var4, 50, var2x -> N(var0, var5, var2x.booleanValue()));
   }

   public static boolean N(class06922 var0) {
      return y(var0, var0.N.method_5439());
   }

   private static void N(class05410 var0, boolean var1) {
      N(var0.E(), 0, 46, 1, class07510.field_7795, var1, class06937::R);
   }

   private static void N(class07482 var0, int var1, int var2, int var3, class07510 var4, boolean var5, Predicate<class06937> var6) {
      for (int var7 = var1; var7 < var2; var7++) {
         class06937 var8 = var0.L(var7);
         if (var6.test(var8)) {
            class11938.m().N(var0.b, var7, var3, var4).y();
            if (var5) {
               break;
            }
         }
      }
   }

   private static void N(class07482 var0, int var1, boolean var2) {
      N(var0, var1, var1 + 36, 0, class07510.field_7794, var2, var0x -> var0x.R() && !class11929.y(var0x.i()));
   }

   private static void N() {
      N = new String[8];
      N[0] = "inventory.throw-all";
      N[1] = "inventory.throw-all";
      N[2] = "inventory.take-all";
      N[3] = "inventory.put-all";
      N[4] = "inventory.throw-all";
      N[5] = "inventory.take-all";
      N[6] = "inventory.put-all";
      N[7] = "This is a utility class and cannot be instantiated";
   }
}
