package Nursultan;

import minecraft.class04568;
import minecraft.class06202;

public class class11715 {
   private static String[] L;
   public static Object N_0;

   private static void L() {
      L = new String[2];
      L[0] = "localhost";
      L[1] = "localhost";
   }

   private class11715() {
   }

   static {
      L();
      u();
   }

   private static void u() {
      N_0 = L[1];
   }

   public static String y() {
      return class06202.Nq().Ny().L();
   }

   public static String N() {
      class04568 var0 = class06202.Nq().yN();
      return var0 == null ? L[0] : var0.y;
   }
}
