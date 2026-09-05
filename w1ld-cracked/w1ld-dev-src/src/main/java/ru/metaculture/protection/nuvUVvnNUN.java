package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public final class nuvUVvnNUN {
   public static final List<nuvUVvnNUN.NVnVnNnN> UuUVuuUu = new ArrayList<>();

   private static boolean UuUVuuUu(VnuVUNUv var0) {
      for (VnuVUNUv var4 : VnuVUNUv.UnUNVVVNuv()) {
         if (var4 == var0) {
            return true;
         }
      }

      return false;
   }

   private nuvUVvnNUN() {
   }

   public static nuVVnvn UuUVuuUu(nuvUVvnNUN.NVnVnNnN var0, nvvuUNnNvN var1) {
      return var0.nuUnNvnuUu.apply(var1);
   }

   static {
      for (nNVvuuVvnvV.nvnNNunvv var1 : nNVvuuVvnvV.UuUVuuUu) {
         if (UuUVuuUu(var1.target())) {
            UuUVuuUu.add(new nuvUVvnNUN.NVnVnNnN(var1.title(), var1.description(), var1.target(), var1.complexity(), var1.nodes(), var1.builder()));
         }
      }
   }

   public static final class NVnVnNnN {
      public final String UuUVuuUu;
      public final String C00OOC00oO;
      public final VnuVUNUv uUnuvNvvNU;
      public final String vVvUvVVuuNvV;
      public final List<String> uNNnnnuuuN;
      final Function<nvvuUNnNvN, nuVVnvn> nuUnNvnuUu;

      public NVnVnNnN(String var1, String var2, VnuVUNUv var3, String var4, List<String> var5, Function<nvvuUNnNvN, nuVVnvn> var6) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4 != null && !var4.isBlank() ? var4 : "Custom";
         this.uNNnnnuuuN = var5 == null ? List.of() : List.copyOf(var5);
         this.nuUnNvnuUu = var6;
      }
   }
}
