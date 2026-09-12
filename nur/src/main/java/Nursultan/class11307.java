package Nursultan;

import minecraft.class06202;
import minecraft.class08844;
import org.joml.Vector2i;

public class class11307 {
   public static Object N_0 = class06202.Nq();

   private static void L() {
      N_0 = null;
   }

   private class11307() {
      throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
   }

   static {
      L();
   }

   public static class09857 N(int var0) {
      boolean var1 = (var0 & 2) != 0;
      boolean var2 = (var0 & 1) != 0;
      boolean var3 = (var0 & 4) != 0;
      boolean var4 = (var0 & 8) != 0;
      return new class09857(var1, var2, var3, var4);
   }

   public static Vector2i N(double var0, double var2) {
      class08844 var4 = ((class06202)N_0).Nt();
      double var5 = (double)var4.U() / (double)var4.W();
      double var7 = (double)var4.E() / (double)var4.m();
      return new Vector2i((int)(var0 * var5), (int)(var2 * var7));
   }

   public static boolean N(int var0, int var1, int var2, int var3, int var4, int var5) {
      return var4 >= var0 && var4 <= var0 + var2 && var5 >= var1 && var5 <= var1 + var3;
   }
}
