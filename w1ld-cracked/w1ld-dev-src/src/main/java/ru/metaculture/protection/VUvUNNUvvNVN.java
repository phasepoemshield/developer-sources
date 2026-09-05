package ru.metaculture.protection;

public final class VUvUNNUvvNVN {
   private final String UuUVuuUu;
   private String C00OOC00oO;
   private String uUnuvNvvNU;
   private String vVvUvVVuuNvV;
   private String uNNnnnuuuN;
   private String nuUnNvnuUu;
   private String VVuuUN;
   private String vNUvnnVnUvu;
   private String uVUuuVnNVU;
   private long vuuuNvNuv;
   private long nvUVNnuu;
   private boolean UuuNnUvUuv;

   public VUvUNNUvvNVN(String var1, String var2, String var3, String var4, long var5) {
      this(var1, var2, var3, var4, "", "", "Custom", "user", "saved", var5, var5, false);
   }

   public VUvUNNUvvNVN(String var1, String var2, String var3, String var4, String var5, String var6, String var7, long var8, long var10, boolean var12) {
      this(var1, var2, var3, var4, var5, var6, var7, "user", "saved", var8, var10, var12);
   }

   public VUvUNNUvvNVN(
      String var1,
      String var2,
      String var3,
      String var4,
      String var5,
      String var6,
      String var7,
      String var8,
      String var9,
      long var10,
      long var12,
      boolean var14
   ) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
      this.uNNnnnuuuN = var5 == null ? "" : var5;
      this.nuUnNvnuUu = var6 == null ? "" : var6;
      this.VVuuUN = var7 != null && !var7.isBlank() ? var7 : "Custom";
      this.vNUvnnVnUvu = var8 != null && !var8.isBlank() ? var8 : "user";
      this.uVUuuVnNVU = var9 != null && !var9.isBlank() ? var9 : "saved";
      this.vuuuNvNuv = var10;
      this.nvUVNnuu = var12;
      this.UuuNnUvUuv = var14;
   }

   public String UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public String C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public void UuUVuuUu(String var1) {
      if (var1 != null && !var1.isBlank()) {
         this.C00OOC00oO = var1;
      }
   }

   public String uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public void C00OOC00oO(String var1) {
      this.uUnuvNvvNU = var1;
   }

   public String vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public void uUnuvNvvNU(String var1) {
      this.vVvUvVVuuNvV = var1;
   }

   public String uNNnnnuuuN() {
      return this.uNNnnnuuuN;
   }

   public void vVvUvVVuuNvV(String var1) {
      this.uNNnnnuuuN = var1 == null ? "" : var1;
   }

   public String nuUnNvnuUu() {
      return this.nuUnNvnuUu;
   }

   public void uNNnnnuuuN(String var1) {
      this.nuUnNvnuUu = var1 == null ? "" : var1;
   }

   public String VVuuUN() {
      return this.VVuuUN;
   }

   public void nuUnNvnuUu(String var1) {
      this.VVuuUN = var1 != null && !var1.isBlank() ? var1 : "Custom";
   }

   public String vNUvnnVnUvu() {
      return this.vNUvnnVnUvu;
   }

   public void VVuuUN(String var1) {
      this.vNUvnnVnUvu = var1 != null && !var1.isBlank() ? var1 : "user";
   }

   public String uVUuuVnNVU() {
      return this.uVUuuVnNVU;
   }

   public void vNUvnnVnUvu(String var1) {
      this.uVUuuVnNVU = var1 != null && !var1.isBlank() ? var1 : "saved";
   }

   public long vuuuNvNuv() {
      return this.vuuuNvNuv;
   }

   public void UuUVuuUu(long var1) {
      this.vuuuNvNuv = var1;
   }

   public long nvUVNnuu() {
      return this.nvUVNnuu;
   }

   public void C00OOC00oO(long var1) {
      this.nvUVNnuu = var1;
   }

   public boolean UuuNnUvUuv() {
      return this.UuuNnUvUuv;
   }

   public void UuUVuuUu(boolean var1) {
      this.UuuNnUvUuv = var1;
   }
}
