package ru.metaculture.protection;

public enum uUuuvNuvVn {
   LOW("Низкое"),
   MEDIUM("Баланс"),
   HIGH("Высокое"),
   ULTRA("Ультра");

   private final String UuUVuuUu;

   private uUuuvNuvVn(String var3) {
      this.UuUVuuUu = var3;
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public static String[] C00OOC00oO() {
      uUuuvNuvVn[] var0 = values();
      String[] var1 = new String[var0.length];

      for (int var2 = 0; var2 < var0.length; var2++) {
         var1[var2] = var0[var2].UuUVuuUu;
      }

      return var1;
   }

   public static uUuuvNuvVn UuUVuuUu(int var0) {
      uUuuvNuvVn[] var1 = values();
      int var2 = Math.max(0, Math.min(var1.length - 1, var0));
      return var1[var2];
   }

   public void uUnuvNvvNU() {
      boolean var1 = this == LOW;
      boolean var2 = this == MEDIUM;
      boolean var3 = this == HIGH;
      boolean var4 = this == ULTRA;
      boolean var5 = var2 || var3 || var4;
      boolean var6 = var3 || var4;
      Menu.unNNVVNnvvV.C00OOC00oO(var5);
      Menu.NuunnvnN.C00OOC00oO(var6);
      Menu.NVUunUNUN.C00OOC00oO(var4);
      Menu.UUVNuUNUvUnV.C00OOC00oO(var6);
      Menu.vuvnUnVnUNnV.C00OOC00oO(var5);
      Menu.nnuUVNUuvvVU.C00OOC00oO(var5);
      Menu.nVVUuvuNnUN.C00OOC00oO(var6);
      Menu.nNnVnUNVV.C00OOC00oO(var4);
      Menu.nuunNvv.C00OOC00oO(var6);
      Menu.uUVVvVVNvvn.C00OOC00oO(var5);
      Menu.vvUVNVvvNUv.C00OOC00oO(var5);
      Menu.UuNnnVnuNNV.C00OOC00oO(var5);
      Menu.uUVvnUuNvvN.C00OOC00oO(var6);
      Menu.UUuUnNVNuuv.C00OOC00oO(var6);
      Menu.NVuNUuVnVUN.C00OOC00oO(var5);
      Menu.NVuunNnvvvVu.C00OOC00oO(var5);
      Menu.UnvuVuVnNuvu.UuUVuuUu(var1 ? 12.0F : (var2 ? 26.0F : (var3 ? 42.0F : 58.0F)));
      Menu.UvNNVUVNVuvV.UuUVuuUu(var1 ? 0.26F : (var2 ? 0.46F : (var3 ? 0.64F : 0.82F)));
      Menu.NnunUUnU.UuUVuuUu(var1 ? 0.06F : (var2 ? 0.16F : (var3 ? 0.27F : 0.36F)));
      Menu.nvuVvuNnNUnv.UuUVuuUu(var1 ? 0.18F : (var2 ? 0.26F : (var3 ? 0.36F : 0.48F)));
      Menu.NnVnNVN.UuUVuuUu(var1 ? 1.05F : (var2 ? 1.55F : (var3 ? 2.15F : 2.8F)));
      Menu.vnvvNvUnVv.UuUVuuUu(var1 ? 0.18F : (var2 ? 0.46F : (var3 ? 0.72F : 1.02F)));
      Menu.OCOocoOoOO.UuUVuuUu(var1 ? 0.32F : (var2 ? 0.52F : (var3 ? 0.68F : 0.82F)));
      Menu.o0Ooc0COOoc.UuUVuuUu(var1 ? 0.2F : (var2 ? 0.34F : (var3 ? 0.46F : 0.58F)));
      Menu.nvvnUnUn.UuUVuuUu(var1 ? 0.48F : (var2 ? 0.56F : (var3 ? 0.62F : 0.7F)));
      Menu.UnUUVuVunvVu.UuUVuuUu(var1 ? 0.32F : (var2 ? 0.48F : (var3 ? 0.62F : 0.78F)));
      Menu.UVnuVUUVnnU.C00OOC00oO(var1);
      Menu.nnvuvUNuUnN.C00OOC00oO(var1 || var2);
      Menu.VunnVNvNV.C00OOC00oO(var1);
      Menu.NvUVUvVVnUu.C00OOC00oO(var1);
   }
}
