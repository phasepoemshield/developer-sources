package ru.metaculture.protection;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public final class ooOCCooc {
   private static final SimpleDateFormat UuUVuuUu = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.ROOT);
   private final uNuuunuNvuN C00OOC00oO = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(2.5F, 0.82F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F);
   private final uNuuunuNvuN uUnuvNvvNU = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(2.2F, 0.86F), 0.0F, 0.0F, 100000.0F, 0.01F, 0.01F);
   private final List<File> vVvUvVVuuNvV = new ArrayList<>();
   private boolean uNNnnnuuuN;
   private String nuUnNvnuUu = "";
   private int VVuuUN = -1;
   private int vNUvnnVnUvu = -1;
   private float uVUuuVnNVU;
   private File vuuuNvNuv;

   public void UuUVuuUu(List<File> var1) {
      this.vVvUvVVuuNvV.clear();
      if (var1 != null) {
         this.vVvUvVVuuNvV.addAll(var1);
      }

      this.uNNnnnuuuN = true;
      this.nuUnNvnuUu = "";
      this.VVuuUN = -1;
      this.vNUvnnVnUvu = this.vVvUvVVuuNvV.isEmpty() ? -1 : 0;
      this.vuuuNvNuv = null;
      this.uVUuuVnNVU = 0.0F;
      this.uUnuvNvvNU.C00OOC00oO(0.0F);
      this.C00OOC00oO.uUnuvNvvNU(1.0F);
   }

   public void UuUVuuUu() {
      this.uNNnnnuuuN = false;
      this.C00OOC00oO.uUnuvNvvNU(0.0F);
   }

   public boolean C00OOC00oO() {
      return this.uNNnnnuuuN;
   }

   public File uUnuvNvvNU() {
      File var1 = this.vuuuNvNuv;
      this.vuuuNvNuv = null;
      return var1;
   }

   public boolean UuUVuuUu(float var1, float var2, int var3, nUvnuVnNUU var4, int var5, int var6) {
      if (!this.uNNnnnuuuN) {
         return false;
      } else if (var3 != 0) {
         return true;
      } else {
         vnvNNVNU var7 = this.UuUVuuUu(var4, var5, var6);
         vnvNNVNU var8 = this.uUnuvNvvNU(var7, var4);
         vnvNNVNU var9 = this.vVvUvVVuuNvV(var7, var4);
         if (!var9.contains(var1, var2) && var7.contains(var1, var2)) {
            List var10 = this.vVvUvVVuuNvV();
            if (var8.contains(var1, var2)) {
               if (this.vNUvnnVnUvu >= 0 && this.vNUvnnVnUvu < var10.size()) {
                  this.vuuuNvNuv = (File)var10.get(this.vNUvnnVnUvu);
                  this.UuUVuuUu();
               }

               return true;
            } else {
               vnvNNVNU var11 = this.C00OOC00oO(var7, var4);
               if (var11.contains(var1, var2)) {
                  float var12 = var4.UuUVuuUu(42.0F);
                  int var13 = (int)Math.floor((var2 - var11.y() + this.uUnuvNvvNU.UuUVuuUu()) / var12);
                  if (var13 >= 0 && var13 < var10.size()) {
                     this.vNUvnnVnUvu = var13;
                  }

                  return true;
               } else {
                  return true;
               }
            }
         } else {
            this.UuUVuuUu();
            return true;
         }
      }
   }

   public boolean UuUVuuUu(double var1, nUvnuVnNUU var3, int var4, int var5) {
      if (!this.uNNnnnuuuN) {
         return false;
      } else {
         vnvNNVNU var6 = this.C00OOC00oO(this.UuUVuuUu(var3, var4, var5), var3);
         float var7 = this.vVvUvVVuuNvV().size() * var3.UuUVuuUu(42.0F);
         float var8 = Math.max(0.0F, var7 - var6.h());
         this.uVUuuVnNVU = Math.max(0.0F, Math.min(var8, this.uVUuuVnNVU - (float)var1 * var3.UuUVuuUu(42.0F)));
         this.uUnuvNvvNU.uUnuvNvvNU(this.uVUuuVnNVU);
         return true;
      }
   }

   public boolean UuUVuuUu(char var1) {
      if (!this.uNNnnnuuuN) {
         return false;
      } else {
         if ((Character.isLetterOrDigit(var1) || var1 == ' ' || var1 == '_' || var1 == '-' || var1 == '.') && this.nuUnNvnuUu.length() < 64) {
            this.nuUnNvnuUu = this.nuUnNvnuUu + var1;
            this.vNUvnnVnUvu = this.vVvUvVVuuNvV().isEmpty() ? -1 : 0;
            this.uVUuuVnNVU = 0.0F;
            this.uUnuvNvvNU.C00OOC00oO(0.0F);
         }

         return true;
      }
   }

   public boolean UuUVuuUu(int var1) {
      if (!this.uNNnnnuuuN) {
         return false;
      } else {
         List var2 = this.vVvUvVVuuNvV();
         if (var1 == 256) {
            this.UuUVuuUu();
            return true;
         } else if (var1 == 259) {
            if (!this.nuUnNvnuUu.isEmpty()) {
               this.nuUnNvnuUu = this.nuUnNvnuUu.substring(0, this.nuUnNvnuUu.length() - 1);
               this.vNUvnnVnUvu = this.vVvUvVVuuNvV().isEmpty() ? -1 : 0;
               this.uVUuuVnNVU = 0.0F;
               this.uUnuvNvvNU.C00OOC00oO(0.0F);
            }

            return true;
         } else if (var1 == 264) {
            if (!var2.isEmpty()) {
               this.vNUvnnVnUvu = Math.min(var2.size() - 1, Math.max(0, this.vNUvnnVnUvu + 1));
            }

            return true;
         } else if (var1 == 265) {
            if (!var2.isEmpty()) {
               this.vNUvnnVnUvu = Math.max(0, this.vNUvnnVnUvu - 1);
            }

            return true;
         } else if (var1 != 257 && var1 != 335) {
            return true;
         } else {
            if (this.vNUvnnVnUvu >= 0 && this.vNUvnnVnUvu < var2.size()) {
               this.vuuuNvNuv = (File)var2.get(this.vNUvnnVnUvu);
               this.UuUVuuUu();
            }

            return true;
         }
      }
   }

   public void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, int var6, int var7) {
      float var8 = this.C00OOC00oO.UuUVuuUu();
      if (!(var8 <= 0.001F) && var1 != null && var2 != null && var3 != null) {
         vnvNNVNU var9 = this.UuUVuuUu(var2, var6, var7);
         float var10 = var2.UuUVuuUu(14.0F) * (1.0F - var8);
         var9 = new vnvNNVNU(var9.x(), var9.y() + var10, var9.w(), var9.h());
         var1.uNNnnnuuuN(var8);

         try {
            var1.UuUVuuUu(0.0F, 0.0F, (float)var6, (float)var7, 0.0F, NUunUunuNV.UuUVuuUu(0, 0, 0, var3.uNnUnnuNUnNu() ? 72 : 116));
            float var11 = var2.UuUVuuUu(14.0F);
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var11, var2.UuUVuuUu(26.0F), var2.UuUVuuUu(2.0F), NUunUunuNV.UuUVuuUu(0, 0, 0, 164));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var11, this.UuUVuuUu(var3, 238));
            var1.UuUVuuUu(var9.x(), var9.y(), var9.w(), var9.h(), var11, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 92), 0.8F);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var2,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var9.x() + var2.UuUVuuUu(20.0F),
               var9.y() + var2.UuUVuuUu(18.0F),
               13.0F,
               "Import Foundry Shader",
               var3.NVNnnvnuunNv()
            );
            this.UuUVuuUu(var1, var2, var3, var9);
            this.UuUVuuUu(var1, var2, var3, var9, var4, var5);
            this.C00OOC00oO(var1, var2, var3, var9, var4, var5);
         } finally {
            var1.vuuuNvNuv();
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4) {
      vnvNNVNU var5 = this.UuUVuuUu(var4, var2);
      var1.UuUVuuUu(var5.x(), var5.y(), var5.w(), var5.h(), var2.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(255, 255, 255, var3.uNnUnnuNUnNu() ? 126 : 16));
      var1.UuUVuuUu(var5.x(), var5.y(), var5.w(), var5.h(), var2.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 82), 0.7F);
      String var6 = this.nuUnNvnuUu.isBlank() ? "Search" : this.nuUnNvnuUu;
      int var7 = this.nuUnNvnuUu.isBlank() ? var3.uVUVnuvnuVuv() : var3.NVNnnvnuunNv();
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var5.x() + var2.UuUVuuUu(12.0F), var5.y(), var5.h(), 10.0F, var6, var7);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, float var5, float var6) {
      vnvNNVNU var7 = this.C00OOC00oO(var4, var2);
      List var8 = this.vVvUvVVuuNvV();
      float var9 = var2.UuUVuuUu(42.0F);
      this.VVuuUN = -1;
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var7.x(), var7.y(), var7.w(), var7.h(), var2.UuUVuuUu(8.0F), var2.UuUVuuUu(8.0F), var2.UuUVuuUu(8.0F), var2.UuUVuuUu(8.0F));

      try {
         var1.UuUVuuUu(var7.x(), var7.y(), var7.w(), var7.h(), var2.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(255, 255, 255, var3.uNnUnnuNUnNu() ? 82 : 10));
         float var10 = this.uUnuvNvvNU.UuUVuuUu();
         if (var8.isEmpty()) {
            String var11 = this.vVvUvVVuuNvV.isEmpty() ? "No shared shaders" : "No matches";
            float var12 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var11, 10.0F);
            nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var7.x() + (var7.w() - var12) * 0.5F, var7.y(), var7.h(), 10.0F, var11, var3.uVUVnuvnuVuv());
         }

         for (int var22 = 0; var22 < var8.size(); var22++) {
            float var23 = var7.y() + var22 * var9 - var10;
            if (!(var23 > var7.y() + var7.h()) && !(var23 + var9 < var7.y())) {
               boolean var13 = var5 >= var7.x() && var5 < var7.x() + var7.w() && var6 >= var23 && var6 < var23 + var9;
               if (var13) {
                  this.VVuuUN = var22;
               }

               boolean var14 = var22 == this.vNUvnnVnUvu;
               float var15 = var14 ? 1.0F : (var13 ? 0.62F : 0.0F);
               var1.UuUVuuUu(
                  var7.x() + var2.UuUVuuUu(6.0F),
                  var23 + var2.UuUVuuUu(4.0F),
                  var7.w() - var2.UuUVuuUu(12.0F),
                  var9 - var2.UuUVuuUu(8.0F),
                  var2.UuUVuuUu(7.0F),
                  NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, var3.uNnUnnuNUnNu() ? 86 : 10), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 76), var15)
               );
               File var16 = (File)var8.get(var22);
               String var17 = this.UuUVuuUu(var2, var16.getName(), var7.w() - var2.UuUVuuUu(132.0F), 10.0F);
               String var18 = UuUVuuUu.format(new Date(var16.lastModified()));
               nunvNNUnvU.UuUVuuUu(
                  var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var7.x() + var2.UuUVuuUu(18.0F), var23 + var2.UuUVuuUu(10.0F), 10.0F, var17, var3.NVNnnvnuunNv()
               );
               nunvNNUnvU.UuUVuuUu(
                  var1, var2, vNvnnVvvVUu.UuUVuuUu, var7.x() + var2.UuUVuuUu(18.0F), var23 + var2.UuUVuuUu(24.0F), 8.0F, var18, var3.uVUVnuvnuVuv()
               );
            }
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, float var5, float var6) {
      this.UuUVuuUu(var1, var2, var3, this.vVvUvVVuuNvV(var4, var2), "Cancel", var5, var6, false);
      this.UuUVuuUu(var1, var2, var3, this.uUnuvNvvNU(var4, var2), "Open", var5, var6, true);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4, String var5, float var6, float var7, boolean var8) {
      boolean var9 = var4.contains(var6, var7);
      int var10 = NUunUunuNV.UuUVuuUu(
         NUunUunuNV.UuUVuuUu(255, 255, 255, var3.uNnUnnuNUnNu() ? 92 : 18),
         NUunUunuNV.UuUVuuUu(var8 ? var3.uVunuUNVVUUV() : var3.UNnVVNvvnVvU(), 94),
         var9 ? 1.0F : 0.0F
      );
      var1.UuUVuuUu(var4.x(), var4.y(), var4.w(), var4.h(), var2.UuUVuuUu(8.0F), var10);
      var1.UuUVuuUu(
         var4.x(),
         var4.y(),
         var4.w(),
         var4.h(),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(var8 ? var3.uVunuUNVVUUV() : var3.UNnVVNvvnVvU(), var9 ? 148 : 78),
         0.7F
      );
      float var11 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var5, 10.0F);
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var4.x() + (var4.w() - var11) * 0.5F, var4.y(), var4.h(), 10.0F, var5, var3.NVNnnvnuunNv());
   }

   private List<File> vVvUvVVuuNvV() {
      if (this.nuUnNvnuUu != null && !this.nuUnNvnuUu.isBlank()) {
         String var1 = this.nuUnNvnuUu.toLowerCase(Locale.ROOT);
         ArrayList var2 = new ArrayList();

         for (File var4 : this.vVvUvVVuuNvV) {
            if (var4.getName().toLowerCase(Locale.ROOT).contains(var1)) {
               var2.add(var4);
            }
         }

         if (this.vNUvnnVnUvu >= var2.size()) {
            this.vNUvnnVnUvu = var2.isEmpty() ? -1 : var2.size() - 1;
         }

         return var2;
      } else {
         return new ArrayList<>(this.vVvUvVVuuNvV);
      }
   }

   private vnvNNVNU UuUVuuUu(nUvnuVnNUU var1, int var2, int var3) {
      float var4 = Math.min(var1.UuUVuuUu(480.0F), var2 - var1.UuUVuuUu(48.0F));
      float var5 = Math.min(var1.UuUVuuUu(360.0F), var3 - var1.UuUVuuUu(64.0F));
      return new vnvNNVNU((var2 - var4) * 0.5F, (var3 - var5) * 0.5F, var4, var5);
   }

   private vnvNNVNU UuUVuuUu(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(20.0F), var1.y() + var2.UuUVuuUu(52.0F), var1.w() - var2.UuUVuuUu(40.0F), var2.UuUVuuUu(34.0F));
   }

   private vnvNNVNU C00OOC00oO(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var2.UuUVuuUu(20.0F), var1.y() + var2.UuUVuuUu(98.0F), var1.w() - var2.UuUVuuUu(40.0F), var1.h() - var2.UuUVuuUu(158.0F));
   }

   private vnvNNVNU uUnuvNvvNU(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var1.w() - var2.UuUVuuUu(112.0F), var1.y() + var1.h() - var2.UuUVuuUu(48.0F), var2.UuUVuuUu(92.0F), var2.UuUVuuUu(30.0F));
   }

   private vnvNNVNU vVvUvVVuuNvV(vnvNNVNU var1, nUvnuVnNUU var2) {
      return new vnvNNVNU(var1.x() + var1.w() - var2.UuUVuuUu(214.0F), var1.y() + var1.h() - var2.UuUVuuUu(48.0F), var2.UuUVuuUu(92.0F), var2.UuUVuuUu(30.0F));
   }

   private String UuUVuuUu(nUvnuVnNUU var1, String var2, float var3, float var4) {
      if (var2 == null) {
         return "";
      } else if (nunvNNUnvU.UuUVuuUu(var1, vNvnnVvvVUu.vVvUvVVuuNvV, var2, var4) <= var3) {
         return var2;
      } else {
         String var5 = "...";
         String var6 = var2;

         while (!var6.isEmpty() && nunvNNUnvU.UuUVuuUu(var1, vNvnnVvvVUu.vVvUvVVuuNvV, var6 + var5, var4) > var3) {
            var6 = var6.substring(0, var6.length() - 1);
         }

         return var6.isEmpty() ? var5 : var6 + var5;
      }
   }

   private int UuUVuuUu(NUunUunuNV var1, int var2) {
      return var1.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, Math.min(255, var2 + 8)) : NUunUunuNV.UuUVuuUu(10, 12, 18, var2);
   }
}
