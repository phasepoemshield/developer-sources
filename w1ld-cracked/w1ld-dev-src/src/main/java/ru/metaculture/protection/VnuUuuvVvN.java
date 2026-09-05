package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class VnuUuuvVvN {
   private final nvvuUNnNvN UuUVuuUu;
   private boolean C00OOC00oO;
   private float uUnuvNvvNU;
   private float vVvUvVVuuNvV;
   private String uNNnnnuuuN = "";
   private int nuUnNvnuUu;
   private float VVuuUN;
   private long vNUvnnVnUvu;
   private nnNVVnNnnV uVUuuVnNVU;
   private List<uuUnNVuuVUu> vuuuNvNuv = new ArrayList<>();
   private final Map<String, Boolean> nvUVNnuu = new LinkedHashMap<>();

   public VnuUuuvVvN(nvvuUNnNvN var1) {
      this.UuUVuuUu = var1;
   }

   public boolean UuUVuuUu() {
      return this.C00OOC00oO;
   }

   public nnNVVnNnnV C00OOC00oO() {
      return this.uVUuuVnNVU;
   }

   public float uUnuvNvvNU() {
      return this.uUnuvNvvNU;
   }

   public float vVvUvVVuuNvV() {
      return this.vVvUvVVuuNvV;
   }

   public void UuUVuuUu(float var1, float var2, nnNVVnNnnV var3) {
      this.C00OOC00oO = true;
      this.uUnuvNvvNU = var1;
      this.vVvUvVVuuNvV = var2;
      this.uNNnnnuuuN = "";
      this.nuUnNvnuUu = 0;
      this.VVuuUN = 0.0F;
      this.vNUvnnVnUvu = System.currentTimeMillis();
      this.uVUuuVnNVU = var3;
      this.vuuuNvNuv();
   }

   public void uNNnnnuuuN() {
      this.C00OOC00oO = false;
      this.uVUuuVnNVU = null;
   }

   public void UuUVuuUu(char var1) {
      if (this.C00OOC00oO) {
         if ((var1 >= '0' && var1 <= '9' || var1 >= 'a' && var1 <= 'z' || var1 >= 'A' && var1 <= 'Z' || var1 == ' ' || var1 == '_' || var1 == '.')
            && this.uNNnnnuuuN.length() < 32) {
            this.uNNnnnuuuN = this.uNNnnnuuuN + var1;
            this.nuUnNvnuUu = 0;
            this.VVuuUN = 0.0F;
            this.vNUvnnVnUvu = System.currentTimeMillis();
            this.vuuuNvNuv();
         }
      }
   }

   public void nuUnNvnuUu() {
      if (this.C00OOC00oO && !this.uNNnnnuuuN.isEmpty()) {
         this.uNNnnnuuuN = this.uNNnnnuuuN.substring(0, this.uNNnnnuuuN.length() - 1);
         this.nuUnNvnuUu = 0;
         this.VVuuUN = 0.0F;
         this.vNUvnnVnUvu = System.currentTimeMillis();
         this.vuuuNvNuv();
      }
   }

   public void VVuuUN() {
      if (this.C00OOC00oO) {
         this.uNNnnnuuuN = "";
         this.nuUnNvnuUu = 0;
         this.VVuuUN = 0.0F;
         this.vNUvnnVnUvu = System.currentTimeMillis();
         this.vuuuNvNuv();
      }
   }

   public void UuUVuuUu(int var1) {
      if (this.C00OOC00oO && !this.vuuuNvNuv.isEmpty()) {
         this.nuUnNvnuUu = Math.floorMod(this.nuUnNvnuUu + var1, this.vuuuNvNuv.size());
      }
   }

   public uuUnNVuuVUu vNUvnnVnUvu() {
      return this.vuuuNvNuv.isEmpty() ? null : this.vuuuNvNuv.get(Math.min(this.nuUnNvnuUu, this.vuuuNvNuv.size() - 1));
   }

   public List<uuUnNVuuVUu> uVUuuVnNVU() {
      return this.vuuuNvNuv;
   }

   public void UuUVuuUu(double var1) {
      if (this.C00OOC00oO) {
         this.VVuuUN = Math.max(0.0F, this.VVuuUN - (float)var1 * 24.0F);
      }
   }

   public void UuUVuuUu(String var1) {
      if (var1 != null) {
         this.nvUVNnuu.put(var1, !this.nvUVNnuu.getOrDefault(var1, false));
      }
   }

   public boolean C00OOC00oO(String var1) {
      return this.nvUVNnuu.getOrDefault(var1, false);
   }

   public vnvNNVNU UuUVuuUu(nUvnuVnNUU var1, int var2, int var3) {
      float var4 = var1.UuUVuuUu(340.0F);
      float var5 = var1.UuUVuuUu(440.0F);
      float var6 = Math.max(var1.UuUVuuUu(16.0F), Math.min(this.uUnuvNvvNU - var4 * 0.18F, var2 - var4 - var1.UuUVuuUu(16.0F)));
      float var7 = Math.max(var1.UuUVuuUu(16.0F), Math.min(this.vVvUvVVuuNvV - var1.UuUVuuUu(28.0F), var3 - var5 - var1.UuUVuuUu(16.0F)));
      return new vnvNNVNU(var6, var7, var4, var5);
   }

   public vnvNNVNU C00OOC00oO(nUvnuVnNUU var1, int var2, int var3) {
      vnvNNVNU var4 = this.UuUVuuUu(var1, var2, var3);
      return new vnvNNVNU(var4.x() + var1.UuUVuuUu(12.0F), var4.y() + var1.UuUVuuUu(38.0F), var4.w() - var1.UuUVuuUu(24.0F), var1.UuUVuuUu(30.0F));
   }

   public uuUnNVuuVUu UuUVuuUu(nUvnuVnNUU var1, int var2, int var3, float var4, float var5) {
      if (!this.C00OOC00oO) {
         return null;
      } else {
         vnvNNVNU var6 = this.UuUVuuUu(var1, var2, var3);
         float var7 = var6.y() + var1.UuUVuuUu(80.0F);
         float var8 = var6.y() + var6.h() - var1.UuUVuuUu(40.0F);
         if (!(var4 < var6.x()) && !(var4 > var6.x() + var6.w()) && !(var5 < var7) && !(var5 > var8)) {
            float var9 = var7 - this.VVuuUN;
            String var10 = "";

            for (uuUnNVuuVUu var12 : this.vuuuNvNuv) {
               if (!var12.uUnuvNvvNU().equals(var10)) {
                  var10 = var12.uUnuvNvvNU();
                  if (var5 >= var9 && var5 < var9 + var1.UuUVuuUu(20.0F)) {
                     return null;
                  }

                  var9 += var1.UuUVuuUu(20.0F);
                  if (this.C00OOC00oO(var10) && this.uNNnnnuuuN.isBlank()) {
                     continue;
                  }
               } else if (this.C00OOC00oO(var10) && this.uNNnnnuuuN.isBlank()) {
                  continue;
               }

               float var13 = var1.UuUVuuUu(28.0F);
               if (var5 >= var9 && var5 < var9 + var13) {
                  return var12;
               }

               var9 += var13;
               if (var9 > var8) {
                  break;
               }
            }

            return null;
         } else {
            return null;
         }
      }
   }

   public String C00OOC00oO(nUvnuVnNUU var1, int var2, int var3, float var4, float var5) {
      if (this.C00OOC00oO && this.uNNnnnuuuN.isBlank()) {
         vnvNNVNU var6 = this.UuUVuuUu(var1, var2, var3);
         float var7 = var6.y() + var1.UuUVuuUu(80.0F);
         float var8 = var6.y() + var6.h() - var1.UuUVuuUu(40.0F);
         if (!(var4 < var6.x()) && !(var4 > var6.x() + var6.w()) && !(var5 < var7) && !(var5 > var8)) {
            float var9 = var7 - this.VVuuUN;
            String var10 = "";

            for (uuUnNVuuVUu var12 : this.vuuuNvNuv) {
               if (!var12.uUnuvNvvNU().equals(var10)) {
                  var10 = var12.uUnuvNvvNU();
                  if (var5 >= var9 && var5 < var9 + var1.UuUVuuUu(20.0F)) {
                     return var10;
                  }

                  var9 += var1.UuUVuuUu(20.0F);
                  if (this.C00OOC00oO(var10)) {
                     continue;
                  }
               } else if (this.C00OOC00oO(var10)) {
                  continue;
               }

               var9 += var1.UuUVuuUu(28.0F);
               if (var9 > var8) {
                  break;
               }
            }

            return null;
         } else {
            return null;
         }
      } else {
         return null;
      }
   }

   private void vuuuNvNuv() {
      String var1 = this.uNNnnnuuuN == null ? "" : this.uNNnnnuuuN.toLowerCase(Locale.ROOT).trim();
      ArrayList var2 = new ArrayList<>(this.UuUVuuUu.UuUVuuUu());
      if (this.uVUuuVnNVU != null) {
         ArrayList var3 = new ArrayList();

         for (uuUnNVuuVUu var5 : var2) {
            for (NUuvnUuVU var7 : var5.uNNnnnuuuN()) {
               if (var7.type() == this.uVUuuVnNVU) {
                  var3.add(var5);
                  break;
               }
            }
         }

         var2 = var3;
      }

      if (var1.isEmpty()) {
         var2.sort(Comparator.comparing(uuUnNVuuVUu::uUnuvNvvNU).thenComparing(uuUnNVuuVUu::C00OOC00oO));
         this.vuuuNvNuv = var2;
      } else {
         ArrayList var8 = new ArrayList();

         for (uuUnNVuuVUu var11 : var2) {
            int var13 = UuUVuuUu(var11, var1);
            if (var13 > 0) {
               var8.add(new VnuUuuvVvN.NVnVnNnN(var11, var13));
            }
         }

         var8.sort(Comparator.<VnuUuuvVvN.NVnVnNnN>comparingInt(var0 -> -var0.score).thenComparing(var0 -> var0.def.C00OOC00oO()));
         ArrayList var10 = new ArrayList();

         for (VnuUuuvVvN.NVnVnNnN var14 : var8) {
            var10.add(var14.def);
         }

         this.vuuuNvNuv = var10;
      }
   }

   private static int UuUVuuUu(uuUnNVuuVUu var0, String var1) {
      String var2 = var0.C00OOC00oO().toLowerCase(Locale.ROOT);
      String var3 = var0.uUnuvNvvNU().toLowerCase(Locale.ROOT);
      String var4 = var0.UuUVuuUu().toLowerCase(Locale.ROOT);
      byte var5 = 0;
      if (var2.startsWith(var1)) {
         var5 += 80;
      }

      if (var2.contains(var1)) {
         var5 += 40;
      }

      if (var4.contains(var1)) {
         var5 += 30;
      }

      if (var3.contains(var1)) {
         var5 += 15;
      }

      int var6 = 0;
      int var7 = 0;

      for (int var8 = 0; var8 < var1.length(); var8++) {
         int var9 = var2.indexOf(var1.charAt(var8), var7);
         if (var9 < 0) {
            break;
         }

         var6++;
         var7 = var9 + 1;
      }

      if (var6 == var1.length()) {
         var5 += 25;
      }

      return var5;
   }

   public void UuUVuuUu(UnVNvNnU var1, nUVuuNUVnV var2, vNvvVnNuUVvv var3, int var4, int var5) {
      if (this.C00OOC00oO) {
         nUvnuVnNUU var6 = var2.uNNnnnuuuN();
         NUunUunuNV var7 = var2.nuUnNvnuUu();
         vnvNNVNU var8 = this.UuUVuuUu(var6, var4, var5);
         float var9 = var6.UuUVuuUu(12.0F);
         var1.UuUVuuUu(
            var8.x(),
            var8.y(),
            var8.w(),
            var8.h(),
            var9,
            var6.UuUVuuUu(28.0F),
            var6.UuUVuuUu(2.0F),
            var7.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(10, 31, 10, 30) : NUunUunuNV.UuUVuuUu(0, 0, 0, 168)
         );
         var1.UuUVuuUu(
            var8.x(),
            var8.y(),
            var8.w(),
            var8.h(),
            var9,
            var7.uNnUnnuNUnNu()
               ? NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 246), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 246), 0.035F)
               : NUunUunuNV.UuUVuuUu(8, 10, 16, 240)
         );
         var1.UuUVuuUu(var8.x(), var8.y(), var8.w(), var8.h(), var9, NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 108), 0.9F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var6,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var8.x() + var6.UuUVuuUu(14.0F),
            var8.y() + var6.UuUVuuUu(14.0F),
            12.0F,
            this.uVUuuVnNVU != null ? "Connect → " + this.uVUuuVnNVU.UuUVuuUu() : "Node Browser",
            var7.NVNnnvnuunNv()
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var6,
            vNvnnVvvVUu.UuUVuuUu,
            var8.x() + var8.w() - var6.UuUVuuUu(70.0F),
            var8.y() + var6.UuUVuuUu(16.0F),
            8.0F,
            "Enter • Esc",
            NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 200)
         );
         vnvNNVNU var10 = this.C00OOC00oO(var6, var4, var5);
         var1.UuUVuuUu(
            var10.x(),
            var10.y(),
            var10.w(),
            var10.h(),
            var6.UuUVuuUu(7.0F),
            var7.uNnUnnuNUnNu()
               ? NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 242), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 242), 0.028F)
               : NUunUunuNV.UuUVuuUu(14, 16, 22, 232)
         );
         var1.UuUVuuUu(var10.x(), var10.y(), var10.w(), var10.h(), var6.UuUVuuUu(7.0F), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 156), 0.8F);
         var1.C00OOC00oO(
            var10.x() + var6.UuUVuuUu(11.0F), var10.y() + var10.h() * 0.5F, var6.UuUVuuUu(3.4F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 220)
         );
         var1.UuUVuuUu(
            var10.x() + var6.UuUVuuUu(13.5F),
            var10.y() + var10.h() * 0.5F + var6.UuUVuuUu(1.4F),
            var6.UuUVuuUu(6.0F),
            1.1F,
            0.0F,
            NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 220)
         );
         String var11 = this.uNNnnnuuuN.isBlank() ? "type to search…" : this.uNNnnnuuuN;
         int var12 = this.uNNnnnuuuN.isBlank() ? var7.uVUVnuvnuVuv() : var7.NVNnnvnuunNv();
         nunvNNUnvU.UuUVuuUu(var1, var6, vNvnnVvvVUu.UuUVuuUu, var10.x() + var6.UuUVuuUu(22.0F), var10.y() + var6.UuUVuuUu(8.0F), 10.0F, var11, var12);
         if (!this.uNNnnnuuuN.isBlank()) {
            float var13 = nunvNNUnvU.UuUVuuUu(var6, vNvnnVvvVUu.UuUVuuUu, this.uNNnnnuuuN, 10.0F);
            boolean var14 = (System.currentTimeMillis() - this.vNUvnnVnUvu) / 500L % 2L == 0L;
            if (var14) {
               var1.UuUVuuUu(
                  var10.x() + var6.UuUVuuUu(22.0F) + var13 + 1.0F,
                  var10.y() + var6.UuUVuuUu(6.0F),
                  1.0F,
                  var10.h() - var6.UuUVuuUu(12.0F),
                  0.0F,
                  NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 240)
               );
            }
         }

         float var29 = var8.y() + var6.UuUVuuUu(80.0F);
         float var30 = var8.y() + var8.h() - var6.UuUVuuUu(40.0F);
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(
            var8.x() + var6.UuUVuuUu(8.0F),
            var29,
            var8.w() - var6.UuUVuuUu(16.0F),
            var30 - var29,
            var6.UuUVuuUu(6.0F),
            var6.UuUVuuUu(6.0F),
            var6.UuUVuuUu(6.0F),
            var6.UuUVuuUu(6.0F)
         );

         try {
            float var15 = var29 - this.VVuuUN;
            String var16 = "";
            int var17 = 0;
            String var18 = this.uNNnnnuuuN.toLowerCase(Locale.ROOT);

            for (uuUnNVuuVUu var20 : this.vuuuNvNuv) {
               if (!var20.uUnuvNvvNU().equals(var16)) {
                  var16 = var20.uUnuvNvvNU();
                  boolean var21 = this.uNNnnnuuuN.isBlank() && this.C00OOC00oO(var16);
                  nunvNNUnvU.UuUVuuUu(
                     var1,
                     var6,
                     vNvnnVvvVUu.vVvUvVVuuNvV,
                     var8.x() + var6.UuUVuuUu(20.0F),
                     var15 + var6.UuUVuuUu(6.0F),
                     9.0F,
                     (var21 ? "▸ " : "▾ ") + var16.toUpperCase(Locale.ROOT),
                     NUunUunuNV.UuUVuuUu(var7.UNnVVNvvnVvU(), 220)
                  );
                  var15 += var6.UuUVuuUu(20.0F);
                  if (var21) {
                     continue;
                  }
               } else if (this.uNNnnnuuuN.isBlank() && this.C00OOC00oO(var16)) {
                  continue;
               }

               float var31 = var6.UuUVuuUu(28.0F);
               boolean var22 = var3 != null
                  && var3.unnUnUNVnN() >= var8.x() + var6.UuUVuuUu(12.0F)
                  && var3.unnUnUNVnN() <= var8.x() + var8.w() - var6.UuUVuuUu(12.0F)
                  && var3.NnuUnUNnu() >= var15
                  && var3.NnuUnUNnu() < var15 + var31;
               boolean var23 = var17 == this.nuUnNvnuUu;
               float var24 = Math.max(var22 ? 0.7F : 0.0F, var23 ? 1.0F : 0.0F);
               var1.UuUVuuUu(
                  var8.x() + var6.UuUVuuUu(12.0F),
                  var15,
                  var8.w() - var6.UuUVuuUu(24.0F),
                  var31 - var6.UuUVuuUu(2.0F),
                  var6.UuUVuuUu(6.0F),
                  NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 6), NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), 72), var24)
               );
               var1.C00OOC00oO(
                  var8.x() + var6.UuUVuuUu(22.0F),
                  var15 + var31 * 0.5F - var6.UuUVuuUu(1.0F),
                  var6.UuUVuuUu(2.6F),
                  0.0F,
                  1.0F,
                  NUunUunuNV.UuUVuuUu(var7.UvnvNVnnnnNU(), var7.uVunuUNVVUUV(), var24)
               );
               this.UuUVuuUu(var1, var6, var7, var20.C00OOC00oO(), var18, var8.x() + var6.UuUVuuUu(34.0F), var15 + var6.UuUVuuUu(5.0F), 10.0F, var24);
               String var25 = var20.nuUnNvnuUu().isEmpty() ? "output ✕" : var20.nuUnNvnuUu().get(0).type().UuUVuuUu();
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var6,
                  vNvnnVvvVUu.UuUVuuUu,
                  var8.x() + var8.w() - var6.UuUVuuUu(60.0F),
                  var15 + var6.UuUVuuUu(8.0F),
                  8.0F,
                  var25,
                  NUunUunuNV.UuUVuuUu(var7.UNnVVNvvnVvU(), 220)
               );
               var15 += var31;
               var17++;
               if (var15 > var30 + var31) {
                  break;
               }
            }

            if (this.vuuuNvNuv.isEmpty()) {
               nunvNNUnvU.UuUVuuUu(
                  var1, var6, vNvnnVvvVUu.UuUVuuUu, var8.x() + var6.UuUVuuUu(20.0F), var29 + var6.UuUVuuUu(20.0F), 10.0F, "no matches", var7.uVUVnuvnuVuv()
               );
            }
         } finally {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }

         nunvNNUnvU.UuUVuuUu(
            var1,
            var6,
            vNvnnVvvVUu.UuUVuuUu,
            var8.x() + var6.UuUVuuUu(14.0F),
            var8.y() + var8.h() - var6.UuUVuuUu(20.0F),
            8.0F,
            "↑↓ navigate • Enter spawn • LMB on category to toggle • Wheel scroll",
            NUunUunuNV.UuUVuuUu(var7.NVNnnvnuunNv(), 156)
         );
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, String var4, String var5, float var6, float var7, float var8, float var9) {
      int var10 = NUunUunuNV.UuUVuuUu(var3.uVUVnuvnuVuv(), var3.NVNnnvnuunNv(), 0.6F + var9 * 0.4F);
      if (var5 != null && !var5.isEmpty()) {
         String var11 = var4.toLowerCase(Locale.ROOT);
         int var12 = var11.indexOf(var5);
         if (var12 < 0) {
            nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var6, var7, var8, var4, var10);
         } else {
            String var13 = var4.substring(0, var12);
            String var14 = var4.substring(var12, var12 + var5.length());
            String var15 = var4.substring(var12 + var5.length());
            float var16 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var13, var8);
            float var17 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var14, var8);
            nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var6, var7, var8, var13, var10);
            nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var6 + var16, var7, var8, var14, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 245));
            nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var6 + var16 + var17, var7, var8, var15, var10);
         }
      } else {
         nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var6, var7, var8, var4, var10);
      }
   }

   record NVnVnNnN(uuUnNVuuVUu def, int score) {
   }
}
