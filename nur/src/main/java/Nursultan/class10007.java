package Nursultan;

import java.util.List;
import org.joml.Vector4f;

final class class10007 {
   private final class09828 N;

   class10007(class09781 var1) {
      this.N = class09828.N(var1);
   }

   private static int N(class10029 var0, int var1, int var2, int var3) {
      return switch (var0) {
         case NORMAL -> var1;
         case HOVER -> var2;
         case ACTIVE -> var3;
      };
   }

   void N(class10021 var1, class09980 var2, class09830 var3, List<class09924> var4) {
      if (var1.y() != class10049.CANVAS) {
         if (var2.k() != class09970.HIDDEN && var3 != null) {
            class10001 var5 = var2.Y();
            float var6 = var3.M() * 0.5F;
            float var7 = var3.U() * 0.5F;
            int var8 = N(this.N.y(var1), var5.i(), var5.R(), var5.M());
            if (class09662.R(var8)) {
               var4.add(new class09925(var3.i(), var3.R(), var3.M(), var3.B(), new Vector4f(var6, var6, var6, var6), var8, 0, 0.0F, 0, 0.0F));
            }

            int var9 = N(this.N.L(var1), var5.B(), var5.Z(), var5.z());
            if (class09662.R(var9)) {
               var4.add(new class09925(var3.Z(), var3.z(), var3.U(), var3.E(), new Vector4f(var7, var7, var7, var7), var9, 0, 0.0F, 0, 0.0F));
            }
         }
      }
   }

   boolean N(class10021 var1, class09980 var2, class09830 var3) {
      if (var2.k() != class09970.HIDDEN && var3 != null) {
         class10001 var4 = var2.Y();
         int var5 = N(this.N.y(var1), var4.i(), var4.R(), var4.M());
         if (var3.L() > 0.0F && var3.u() > 0.0F && class09662.R(var5)) {
            return true;
         } else {
            int var6 = N(this.N.L(var1), var4.B(), var4.Z(), var4.z());
            return var3.U() > 0.0F && var3.E() > 0.0F && class09662.R(var6);
         }
      } else {
         return false;
      }
   }

   class09830 N(class10021 var1, class09980 var2) {
      if (var1 == null || var2 == null) {
         return null;
      } else if (!var2.y()) {
         return null;
      } else if (var2.k() == class09970.HIDDEN) {
         return null;
      } else if (var1.c().P() <= 0.0F) {
         return null;
      } else if (var1.c().B() <= 0.0F || var1.c().Z() <= 0.0F) {
         return null;
      } else {
         return var2.Y().N() <= 0.0F ? null : this.N.u(var1);
      }
   }
}
