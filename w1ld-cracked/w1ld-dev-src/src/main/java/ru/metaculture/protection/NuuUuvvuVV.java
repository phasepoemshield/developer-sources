package ru.metaculture.protection;

import java.util.Locale;
import java.util.Map;

public final class NuuUuvvuVV {
   private final nuVVnvn UuUVuuUu;
   private final nvvuUNnNvN C00OOC00oO;
   private final Map<String, String> uUnuvNvvNU;
   private final Map<String, String> vVvUvVVuuNvV;
   private final VnuVUNUv uNNnnnuuuN;

   NuuUuvvuVV(nuVVnvn var1, nvvuUNnNvN var2, Map<String, String> var3, Map<String, String> var4, VnuVUNUv var5) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
      this.uNNnnnuuuN = var5 == null ? VnuVUNUv.PREVIEW_ONLY : var5.vVvUvVVuuNvV();
   }

   public String UuUVuuUu(VUnvuNuVUUn var1, String var2) {
      nNuNNVuNUu var3 = this.UuUVuuUu.C00OOC00oO(var1.UuUVuuUu(), var2);
      if (var3 != null) {
         String var4 = this.uUnuvNvvNU.get(var3.uNNnnnuuuN());
         if (var4 != null) {
            return var4;
         }
      }

      uuUnNVuuVUu var6 = this.C00OOC00oO.UuUVuuUu(var1.C00OOC00oO());
      if (var6 != null) {
         NUuvnUuVU var5 = var6.UuUVuuUu(var2);
         if (var5 != null && var5.defaultExpression() != null && !var5.defaultExpression().isBlank()) {
            return var5.defaultExpression();
         }
      }

      return "0.0";
   }

   public String UuUVuuUu(float var1) {
      if (!Float.isFinite(var1)) {
         return "0.0";
      } else {
         String var2 = String.format(Locale.ROOT, "%.6f", var1);

         while (var2.contains(".") && var2.endsWith("0")) {
            var2 = var2.substring(0, var2.length() - 1);
         }

         if (var2.endsWith(".")) {
            var2 = var2 + "0";
         }

         return var2;
      }
   }

   public String C00OOC00oO(VUnvuNuVUUn var1, String var2) {
      return "n_" + UuUVuuUu(var1.UuUVuuUu()) + "_" + UuUVuuUu(var2);
   }

   public String UuUVuuUu(VUnvuNuVUUn var1) {
      return var1 == null ? "u_Value" : this.vVvUvVVuuNvV.getOrDefault(var1.UuUVuuUu(), "u_" + UuUVuuUu(var1.UuUVuuUu("name", "Value")));
   }

   public VnuVUNUv UuUVuuUu() {
      return this.uNNnnnuuuN;
   }

   public boolean C00OOC00oO() {
      return this.uNNnnnuuuN == VnuVUNUv.HUD;
   }

   private static String UuUVuuUu(String var0) {
      if (var0 != null && !var0.isBlank()) {
         String var1 = var0.replaceAll("[^A-Za-z0-9_]", "_");
         return Character.isDigit(var1.charAt(0)) ? "_" + var1 : var1;
      } else {
         return "x";
      }
   }
}
