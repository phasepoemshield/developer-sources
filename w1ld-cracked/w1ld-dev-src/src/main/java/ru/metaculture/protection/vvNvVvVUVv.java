package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;

public final class vvNvVvVUVv {
   private final int UuUVuuUu;
   private final int C00OOC00oO;
   private final List<vvNvVvVUVv.VUnuUnnuNvVu> uUnuvNvvNU;
   private final List<vvNvVvVUVv.NVnVnNnN> vVvUvVVuuNvV;
   private float uNNnnnuuuN = Float.MAX_VALUE;
   private float nuUnNvnuUu = Float.MAX_VALUE;
   private float VVuuUN = Float.MAX_VALUE;
   private float vNUvnnVnUvu = -Float.MAX_VALUE;
   private float uVUuuVnNVU = -Float.MAX_VALUE;
   private float vuuuNvNuv = -Float.MAX_VALUE;
   private boolean nvUVNnuu;

   public vvNvVvVUVv(int var1, int var2, List<vvNvVvVUVv.VUnuUnnuNvVu> var3, List<vvNvVvVUVv.NVnVnNnN> var4) {
      this.UuUVuuUu = Math.max(1, var1);
      this.C00OOC00oO = Math.max(1, var2);
      this.uUnuvNvvNU = (List<vvNvVvVUVv.VUnuUnnuNvVu>)(var3 == null ? new ArrayList<>() : var3);
      this.vVvUvVVuuNvV = (List<vvNvVvVUVv.NVnVnNnN>)(var4 == null ? new ArrayList<>() : var4);
   }

   public int UuUVuuUu() {
      return this.UuUVuuUu;
   }

   public int C00OOC00oO() {
      return this.C00OOC00oO;
   }

   public List<vvNvVvVUVv.VUnuUnnuNvVu> uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public List<vvNvVvVUVv.NVnVnNnN> vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public vvNvVvVUVv.VUnuUnnuNvVu UuUVuuUu(int var1) {
      if (var1 >= 0 && var1 < this.uUnuvNvvNU.size()) {
         return this.uUnuvNvvNU.get(var1);
      } else {
         return this.uUnuvNvvNU.isEmpty() ? null : this.uUnuvNvvNU.get(0);
      }
   }

   public float uNNnnnuuuN() {
      this.UnUNVVVNuv();
      return this.nuUnNvnuUu;
   }

   public float nuUnNvnuUu() {
      this.UnUNVVVNuv();
      return this.uVUuuVnNVU;
   }

   public float VVuuUN() {
      this.UnUNVVVNuv();
      return (this.uNNnnnuuuN + this.vNUvnnVnUvu) * 0.5F;
   }

   public float vNUvnnVnUvu() {
      this.UnUNVVVNuv();
      return (this.nuUnNvnuUu + this.uVUuuVnNVU) * 0.5F;
   }

   public float uVUuuVnNVU() {
      this.UnUNVVVNuv();
      return (this.VVuuUN + this.vuuuNvNuv) * 0.5F;
   }

   public float vuuuNvNuv() {
      this.UnUNVVVNuv();
      float var1 = this.uVUuuVnNVU - this.nuUnNvnuUu;
      return var1 <= 0.0F ? 32.0F : var1;
   }

   public int nvUVNnuu() {
      int[] var1 = new int[]{0};

      for (vvNvVvVUVv.NVnVnNnN var3 : this.vVvUvVVuuNvV) {
         this.UuUVuuUu(var3, var1);
      }

      return var1[0];
   }

   private void UuUVuuUu(vvNvVvVUVv.NVnVnNnN var1, int[] var2) {
      var2[0] += var1.vuuuNvNuv().size();

      for (vvNvVvVUVv.NVnVnNnN var4 : var1.uVUuuVnNVU()) {
         this.UuUVuuUu(var4, var2);
      }
   }

   public float UuuNnUvUuv() {
      this.UnUNVVVNuv();
      float var1 = this.vNUvnnVnUvu - this.uNNnnnuuuN;
      return var1 <= 0.0F ? 16.0F : var1;
   }

   public float nUUVuvU() {
      this.UnUNVVVNuv();
      float var1 = this.vuuuNvNuv - this.VVuuUN;
      return var1 <= 0.0F ? 16.0F : var1;
   }

   private void UnUNVVVNuv() {
      if (!this.nvUVNnuu) {
         this.nvUVNnuu = true;

         for (vvNvVvVUVv.NVnVnNnN var2 : this.vVvUvVVuuNvV) {
            this.UuUVuuUu(var2);
         }

         if (this.nuUnNvnuUu > this.uVUuuVnNVU) {
            this.uNNnnnuuuN = this.nuUnNvnuUu = this.VVuuUN = 0.0F;
            this.vNUvnnVnUvu = this.uVUuuVnNVU = this.vuuuNvNuv = 32.0F;
         }
      }
   }

   private void UuUVuuUu(vvNvVvVUVv.NVnVnNnN var1) {
      for (vvNvVvVUVv.nvnNNunvv var3 : var1.vuuuNvNuv()) {
         this.UuUVuuUu(var3.UuUVuuUu(), var3.C00OOC00oO(), var3.uUnuvNvvNU());
         this.UuUVuuUu(var3.vVvUvVVuuNvV(), var3.uNNnnnuuuN(), var3.nuUnNvnuUu());
      }

      for (vvNvVvVUVv.uunvUUVnuNn var8 : var1.nvUVNnuu()) {
         float[] var4 = var8.VVuuUN();

         for (byte var5 = 0; var5 + 2 < var4.length; var5 += 3) {
            this.UuUVuuUu(var8.UuUVuuUu() + var4[var5], var8.C00OOC00oO() + var4[var5 + 1], var8.uUnuvNvvNU() + var4[var5 + 2]);
         }
      }

      for (vvNvVvVUVv.NVnVnNnN var9 : var1.uVUuuVnNVU()) {
         this.UuUVuuUu(var9);
      }
   }

   private void UuUVuuUu(float var1, float var2, float var3) {
      if (var1 < this.uNNnnnuuuN) {
         this.uNNnnnuuuN = var1;
      }

      if (var2 < this.nuUnNvnuUu) {
         this.nuUnNvnuUu = var2;
      }

      if (var3 < this.VVuuUN) {
         this.VVuuUN = var3;
      }

      if (var1 > this.vNUvnnVnUvu) {
         this.vNUvnnVnUvu = var1;
      }

      if (var2 > this.uVUuuVnNVU) {
         this.uVUuuVnNVU = var2;
      }

      if (var3 > this.vuuuNvNuv) {
         this.vuuuNvNuv = var3;
      }
   }

   public static final class NVnVnNnN {
      private final String UuUVuuUu;
      private final float C00OOC00oO;
      private final float uUnuvNvvNU;
      private final float vVvUvVVuuNvV;
      private final float uNNnnnuuuN;
      private final float nuUnNvnuUu;
      private final float VVuuUN;
      private final List<vvNvVvVUVv.NVnVnNnN> vNUvnnVnUvu = new ArrayList<>();
      private final List<vvNvVvVUVv.nvnNNunvv> uVUuuVnNVU = new ArrayList<>();
      private final List<vvNvVvVUVv.uunvUUVnuNn> vuuuNvNuv = new ArrayList<>();

      public NVnVnNnN(String var1, float var2, float var3, float var4, float var5, float var6, float var7) {
         this.UuUVuuUu = var1 == null ? "" : var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
      }

      public String UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public float C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public float uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public float vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }

      public float uNNnnnuuuN() {
         return this.uNNnnnuuuN;
      }

      public float nuUnNvnuUu() {
         return this.nuUnNvnuUu;
      }

      public float VVuuUN() {
         return this.VVuuUN;
      }

      public boolean vNUvnnVnUvu() {
         return this.uNNnnnuuuN != 0.0F || this.nuUnNvnuUu != 0.0F || this.VVuuUN != 0.0F;
      }

      public List<vvNvVvVUVv.NVnVnNnN> uVUuuVnNVU() {
         return this.vNUvnnVnUvu;
      }

      public List<vvNvVvVUVv.nvnNNunvv> vuuuNvNuv() {
         return this.uVUuuVnNVU;
      }

      public List<vvNvVvVUVv.uunvUUVnuNn> nvUVNnuu() {
         return this.vuuuNvNuv;
      }
   }

   public static final class VUnuUnnuNvVu {
      private final String UuUVuuUu;
      private final byte[] C00OOC00oO;
      private final int uUnuvNvvNU;
      private final int vVvUvVVuuNvV;

      public VUnuUnnuNvVu(String var1, byte[] var2, int var3, int var4) {
         this.UuUVuuUu = var1 == null ? "texture" : var1;
         this.C00OOC00oO = var2 == null ? new byte[0] : var2;
         this.uUnuvNvvNU = Math.max(1, var3);
         this.vVvUvVVuuNvV = Math.max(1, var4);
      }

      public String UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public byte[] C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public int uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public int vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }
   }

   public static final class VvunVVUvUNnv {
      private final int UuUVuuUu;
      private final float C00OOC00oO;
      private final float uUnuvNvvNU;
      private final float vVvUvVVuuNvV;
      private final float uNNnnnuuuN;

      public VvunVVUvUNnv(int var1, float var2, float var3, float var4, float var5) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
      }

      public int UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public float C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public float uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public float vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }

      public float uNNnnnuuuN() {
         return this.uNNnnnuuuN;
      }
   }

   public static final class nvUnvV {
      private final int UuUVuuUu;
      private final int[] C00OOC00oO;
      private final float[] uUnuvNvvNU;
      private final float[] vVvUvVVuuNvV;
      private final int uNNnnnuuuN;

      public nvUnvV(int var1, int[] var2, float[] var3, float[] var4, int var5) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
      }

      public int UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public int UuUVuuUu(int var1) {
         return this.C00OOC00oO[var1];
      }

      public float C00OOC00oO(int var1) {
         return this.uUnuvNvvNU[var1];
      }

      public float uUnuvNvvNU(int var1) {
         return this.vVvUvVVuuNvV[var1];
      }

      public int C00OOC00oO() {
         return this.uNNnnnuuuN;
      }
   }

   public static final class nvnNNunvv {
      private final float UuUVuuUu;
      private final float C00OOC00oO;
      private final float uUnuvNvvNU;
      private final float vVvUvVVuuNvV;
      private final float uNNnnnuuuN;
      private final float nuUnNvnuUu;
      private final float VVuuUN;
      private final float vNUvnnVnUvu;
      private final float uVUuuVnNVU;
      private final float vuuuNvNuv;
      private final float nvUVNnuu;
      private final float UuuNnUvUuv;
      private final float nUUVuvU;
      private final vvNvVvVUVv.VvunVVUvUNnv[] UnUNVVVNuv;

      public nvnNNunvv(
         float var1,
         float var2,
         float var3,
         float var4,
         float var5,
         float var6,
         float var7,
         float var8,
         float var9,
         float var10,
         float var11,
         float var12,
         float var13,
         vvNvVvVUVv.VvunVVUvUNnv[] var14
      ) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
         this.uVUuuVnNVU = var9;
         this.vuuuNvNuv = var10;
         this.nvUVNnuu = var11;
         this.UuuNnUvUuv = var12;
         this.nUUVuvU = var13;
         this.UnUNVVVNuv = var14;
      }

      public float UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public float C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public float uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public float vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }

      public float uNNnnnuuuN() {
         return this.uNNnnnuuuN;
      }

      public float nuUnNvnuUu() {
         return this.nuUnNvnuUu;
      }

      public float VVuuUN() {
         return this.VVuuUN;
      }

      public float vNUvnnVnUvu() {
         return this.vNUvnnVnUvu;
      }

      public float uVUuuVnNVU() {
         return this.uVUuuVnNVU;
      }

      public float vuuuNvNuv() {
         return this.vuuuNvNuv;
      }

      public float nvUVNnuu() {
         return this.nvUVNnuu;
      }

      public float UuuNnUvUuv() {
         return this.UuuNnUvUuv;
      }

      public float nUUVuvU() {
         return this.nUUVuvU;
      }

      public boolean UnUNVVVNuv() {
         return this.vuuuNvNuv != 0.0F || this.nvUVNnuu != 0.0F || this.UuuNnUvUuv != 0.0F;
      }

      public vvNvVvVUVv.VvunVVUvUNnv UuUVuuUu(int var1) {
         return var1 >= 0 && var1 < this.UnUNVVVNuv.length ? this.UnUNVVVNuv[var1] : null;
      }
   }

   public static final class uunvUUVnuNn {
      private final float UuUVuuUu;
      private final float C00OOC00oO;
      private final float uUnuvNvvNU;
      private final float vVvUvVVuuNvV;
      private final float uNNnnnuuuN;
      private final float nuUnNvnuUu;
      private final float[] VVuuUN;
      private final vvNvVvVUVv.nvUnvV[] vNUvnnVnUvu;

      public uunvUUVnuNn(float var1, float var2, float var3, float var4, float var5, float var6, float[] var7, vvNvVvVUVv.nvUnvV[] var8) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
         this.uNNnnnuuuN = var5;
         this.nuUnNvnuUu = var6;
         this.VVuuUN = var7;
         this.vNUvnnVnUvu = var8;
      }

      public float UuUVuuUu() {
         return this.UuUVuuUu;
      }

      public float C00OOC00oO() {
         return this.C00OOC00oO;
      }

      public float uUnuvNvvNU() {
         return this.uUnuvNvvNU;
      }

      public float vVvUvVVuuNvV() {
         return this.vVvUvVVuuNvV;
      }

      public float uNNnnnuuuN() {
         return this.uNNnnnuuuN;
      }

      public float nuUnNvnuUu() {
         return this.nuUnNvnuUu;
      }

      public float[] VVuuUN() {
         return this.VVuuUN;
      }

      public vvNvVvVUVv.nvUnvV[] vNUvnnVnUvu() {
         return this.vNUvnnVnUvu;
      }

      public boolean uVUuuVnNVU() {
         return this.vVvUvVVuuNvV != 0.0F || this.uNNnnnuuuN != 0.0F || this.nuUnNvnuUu != 0.0F;
      }

      public float UuUVuuUu(int var1) {
         return this.VVuuUN[var1 * 3];
      }

      public float C00OOC00oO(int var1) {
         return this.VVuuUN[var1 * 3 + 1];
      }

      public float uUnuvNvvNU(int var1) {
         return this.VVuuUN[var1 * 3 + 2];
      }
   }
}
