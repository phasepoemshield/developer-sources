package Nursultan;

import java.util.List;
import java.util.Optional;
import org.joml.Vector4f;
import org.joml.Vector4fc;

public class class11620 {
   public static Object[] N;
   private static byte[] L;

   public static void L() {
      class11635 var4 = (class11635)N[0];
      N[1] = var4;
   }

   private class11620() {
   }

   static {
      i();
      R();
      N[0] = class11635.i();
      N[1] = N[0];
   }

   private static void i() {
      L = new byte[1];
      L[0] = 2;
   }

   public static Optional<class11599> u() {
      return ((class11635)N[1]).L();
   }

   public static class11635 y() {
      return (class11635)N[1];
   }

   public static void N(List<Vector4f> var0, List<Vector4f> var1, class11599 var2, class11599 var3) {
      int var4 = Math.min(var0.size(), var1.size());
      Vector4f[] var5 = new Vector4f[var4];
      Vector4f[] var6 = new Vector4f[var4];

      for (int var7 = 0; var7 < var4; var7++) {
         var5[var7] = new Vector4f((Vector4fc)var0.get(var7));
         var6[var7] = new Vector4f((Vector4fc)var1.get(var7));
      }

      class11635 var12 = new class11635(List.of(var5), List.of(var6), Optional.ofNullable(var2), Optional.ofNullable(var3));
      N[1] = var12;
   }

   public static Optional<class11599> N() {
      return ((class11635)N[1]).u();
   }

   private static void R() {
      N = new Object[L[0]];
   }
}
