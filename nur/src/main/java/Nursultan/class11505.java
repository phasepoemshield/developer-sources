package Nursultan;

import minecraft.class03386;
import minecraft.class04453;
import minecraft.class04995;
import minecraft.class05363;
import minecraft.class06202;
import minecraft.class06889;
import minecraft.class07049;

public class class11505 {
   private static String[] u;
   public static Object N_0 = class06202.Nq();

   public static class11499 L() {
      class11534 var0 = class11938.v();
      return !var0.u() ? N() : new class11499(var0.M(), var0.N());
   }

   private static void M() {
   }

   private class11505() {
      throw new UnsupportedOperationException(u[0]);
   }

   static {
      R();
      M();
   }

   public static class11499 y() {
      class05363 var0 = ((class03386)((class06202)N_0).i_5).s();
      return new class11499(var0.R(), var0.i());
   }

   public static class11499 N(class07049 var0) {
      return new class11499(var0.method_36454(), var0.method_36455());
   }

   public static class11499 N(class11499 var0, class06889 var1) {
      return N(var1).y(var0);
   }

   public static class11499 N() {
      return N((class04453)((class06202)N_0).T_4);
   }

   public static class11499 N(class06889 var0) {
      class06889 var1 = var0.u(((class04453)((class06202)N_0).T_4).method_33571());
      return new class11499(class04995.R(class11908.y(class04995.u(var1.Z, var1.M)) - 90.0F), -class11908.y(class04995.u(var1.B, Math.hypot(var1.M, var1.Z))));
   }

   private static void R() {
      u = new String[1];
      u[0] = "This is a utility class and cannot be instantiated";
   }
}
