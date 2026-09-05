package ru.metaculture.protection;

public final class UVVNvnVNvN {
   private String UuUVuuUu = "";
   private String C00OOC00oO = "";
   private String uUnuvNvvNU = "";
   private String vVvUvVVuuNvV = "Custom";
   private String uNNnnnuuuN = "local";
   private String nuUnNvnuUu = "Host Rectangle";
   private String VVuuUN = "";
   private long vNUvnnVnUvu;
   private long uVUuuVnNVU;
   private boolean vuuuNvNuv;

   public UVVNvnVNvN() {
      long var1 = System.currentTimeMillis();
      this.vNUvnnVnUvu = var1;
      this.uVUuuVnNVU = var1;
   }

   public UVVNvnVNvN UuUVuuUu() {
      UVVNvnVNvN var1 = new UVVNvnVNvN();
      var1.UuUVuuUu(this);
      return var1;
   }

   public void UuUVuuUu(UVVNvnVNvN var1) {
      if (var1 != null) {
         this.UuUVuuUu = var1.UuUVuuUu;
         this.C00OOC00oO = var1.C00OOC00oO;
         this.uUnuvNvvNU = var1.uUnuvNvvNU;
         this.vVvUvVVuuNvV = var1.vVvUvVVuuNvV;
         this.uNNnnnuuuN = var1.uNNnnnuuuN;
         this.nuUnNvnuUu = var1.nuUnNvnuUu;
         this.VVuuUN = var1.VVuuUN;
         this.vNUvnnVnUvu = var1.vNUvnnVnUvu;
         this.uVUuuVnNVU = var1.uVUuuVnNVU;
         this.vuuuNvNuv = var1.vuuuNvNuv;
      }
   }

   public String C00OOC00oO() {
      return this.UuUVuuUu;
   }

   public void UuUVuuUu(String var1) {
      this.UuUVuuUu = vNUvnnVnUvu(var1);
   }

   public String uUnuvNvvNU() {
      return this.C00OOC00oO;
   }

   public void C00OOC00oO(String var1) {
      this.C00OOC00oO = vNUvnnVnUvu(var1);
   }

   public String vVvUvVVuuNvV() {
      return this.uUnuvNvvNU;
   }

   public void uUnuvNvvNU(String var1) {
      this.uUnuvNvvNU = vNUvnnVnUvu(var1);
   }

   public String uNNnnnuuuN() {
      return this.vVvUvVVuuNvV;
   }

   public void vVvUvVVuuNvV(String var1) {
      String var2 = vNUvnnVnUvu(var1);
      this.vVvUvVVuuNvV = var2.isBlank() ? "Custom" : var2;
   }

   public String nuUnNvnuUu() {
      return this.uNNnnnuuuN;
   }

   public void uNNnnnuuuN(String var1) {
      String var2 = vNUvnnVnUvu(var1);
      this.uNNnnnuuuN = var2.isBlank() ? "local" : var2;
   }

   public String VVuuUN() {
      return this.nuUnNvnuUu;
   }

   public void nuUnNvnuUu(String var1) {
      String var2 = vNUvnnVnUvu(var1);
      if (!"Inset Shape".equals(var2) && !"Full Quad".equals(var2)) {
         this.nuUnNvnuUu = "Host Rectangle";
      } else {
         this.nuUnNvnuUu = var2;
      }
   }

   public String vNUvnnVnUvu() {
      return this.VVuuUN;
   }

   public void VVuuUN(String var1) {
      this.VVuuUN = vNUvnnVnUvu(var1);
   }

   public long uVUuuVnNVU() {
      return this.vNUvnnVnUvu;
   }

   public void UuUVuuUu(long var1) {
      this.vNUvnnVnUvu = Math.max(0L, var1);
   }

   public long vuuuNvNuv() {
      return this.uVUuuVnNVU;
   }

   public void C00OOC00oO(long var1) {
      this.uVUuuVnNVU = Math.max(0L, var1);
   }

   public boolean nvUVNnuu() {
      return this.vuuuNvNuv;
   }

   public void UuUVuuUu(boolean var1) {
      this.vuuuNvNuv = var1;
   }

   public void UuUVuuUu(String var1, String var2) {
      long var3 = System.currentTimeMillis();
      if (this.vNUvnnVnUvu <= 0L) {
         this.vNUvnnVnUvu = var3;
      }

      if (this.uVUuuVnNVU <= 0L) {
         this.uVUuuVnNVU = var3;
      }

      if (this.UuUVuuUu.isBlank()) {
         this.UuUVuuUu(var1);
      }

      if (this.C00OOC00oO.isBlank()) {
         this.C00OOC00oO(var2);
      }

      if (this.vVvUvVVuuNvV.isBlank()) {
         this.vVvUvVVuuNvV = "Custom";
      }

      if (this.uNNnnnuuuN.isBlank()) {
         this.uNNnnnuuuN = "local";
      }

      if (this.nuUnNvnuUu.isBlank()) {
         this.nuUnNvnuUu = "Host Rectangle";
      }
   }

   private static String vNUvnnVnUvu(String var0) {
      if (var0 == null) {
         return "";
      } else {
         String var1 = var0.trim().replaceAll("\\s+", " ");
         return var1.length() > 128 ? var1.substring(0, 128) : var1;
      }
   }
}
