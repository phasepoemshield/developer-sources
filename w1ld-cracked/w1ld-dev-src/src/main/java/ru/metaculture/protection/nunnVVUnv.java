package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

public final class nunnVVUnv {
   private static final float UuUVuuUu = 16.0F;
   private static final int C00OOC00oO = 40;
   private static final float uUnuvNvvNU = 22.0F;
   private static final float vVvUvVVuuNvV = 34.0F;
   private final nvvuUNnNvN uNNnnnuuuN;
   private final uNuuunuNvuN nuUnNvnuUu = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uNNnVuNunvU.UuUVuuUu(3.4F, 0.82F), 0.0F, 0.0F, 1.0F, 0.001F, 0.001F);
   private final UUNnvUVnnnnN VVuuUN = new UUNnvUVnnnnN(0.0F);
   private final Map<String, UUNnvUVnnnnN> vNUvnnVnUvu = new HashMap<>();
   private final Map<String, Boolean> uVUuuVnNVU = new LinkedHashMap<>();
   private boolean vuuuNvNuv;
   private float nvUVNnuu;
   private float UuuNnUvUuv;
   private String nUUVuvU = "";
   private int UnUNVVVNuv;
   private float vNVuvnUUnuUn;
   private float UvnvNVnnnnNU;
   private boolean uVUVnuvnuVuv;
   private long NVNnnvnuunNv;
   private nnNVVnNnnV uVunuUNVVUUV;
   private List<VNUUuvNvNVu.NVnVnNnN> UNnVVNvvnVvU = new ArrayList<>();
   private List<uuUnNVuuVUu> uNnUnnuNUnNu = new ArrayList<>();

   public nunnVVUnv(nvvuUNnNvN var1) {
      this.uNNnnnuuuN = var1;
   }

   public boolean UuUVuuUu() {
      return this.vuuuNvNuv;
   }

   public nnNVVnNnnV C00OOC00oO() {
      return this.uVunuUNVVUUV;
   }

   public float uUnuvNvvNU() {
      return this.nvUVNnuu;
   }

   public float vVvUvVVuuNvV() {
      return this.UuuNnUvUuv;
   }

   public void UuUVuuUu(float var1, float var2, nnNVVnNnnV var3) {
      this.vuuuNvNuv = true;
      this.nvUVNnuu = var1;
      this.UuuNnUvUuv = var2;
      this.nUUVuvU = "";
      this.UnUNVVVNuv = 0;
      this.vNVuvnUUnuUn = 0.0F;
      this.VVuuUN.UuUVuuUu(0.0F);
      this.NVNnnvnuunNv = System.currentTimeMillis();
      this.uVunuUNVVUUV = var3;
      this.nuUnNvnuUu.uUnuvNvvNU(1.0F);
      this.vuuuNvNuv();
   }

   public void uNNnnnuuuN() {
      this.vuuuNvNuv = false;
      this.uVunuUNVVUUV = null;
      this.nuUnNvnuUu.uUnuvNvvNU(0.0F);
   }

   public void UuUVuuUu(char var1) {
      if (this.vuuuNvNuv) {
         if ((
               var1 >= '0' && var1 <= '9'
                  || var1 >= 'a' && var1 <= 'z'
                  || var1 >= 'A' && var1 <= 'Z'
                  || var1 == ' '
                  || var1 == '_'
                  || var1 == '.'
                  || var1 == '-'
            )
            && this.nUUVuvU.length() < 40) {
            this.nUUVuvU = this.nUUVuvU + var1;
            this.UnUNVVVNuv = 0;
            this.vNVuvnUUnuUn = 0.0F;
            this.NVNnnvnuunNv = System.currentTimeMillis();
            this.vuuuNvNuv();
         }
      }
   }

   public void nuUnNvnuUu() {
      if (this.vuuuNvNuv && !this.nUUVuvU.isEmpty()) {
         this.nUUVuvU = this.nUUVuvU.substring(0, this.nUUVuvU.length() - 1);
         this.UnUNVVVNuv = 0;
         this.vNVuvnUUnuUn = 0.0F;
         this.NVNnnvnuunNv = System.currentTimeMillis();
         this.vuuuNvNuv();
      }
   }

   public void VVuuUN() {
      if (this.vuuuNvNuv) {
         this.nUUVuvU = "";
         this.UnUNVVVNuv = 0;
         this.vNVuvnUUnuUn = 0.0F;
         this.NVNnnvnuunNv = System.currentTimeMillis();
         this.vuuuNvNuv();
      }
   }

   public void UuUVuuUu(int var1) {
      if (this.vuuuNvNuv && !this.uNnUnnuNUnNu.isEmpty() && var1 != 0) {
         int var2 = var1 < 0 ? -1 : 1;
         int var3 = Math.floorMod(this.UnUNVVVNuv + var1, this.uNnUnnuNUnNu.size());
         if (this.nUUVuvU.isBlank()) {
            for (int var4 = 0; var4 < this.uNnUnnuNUnNu.size() && this.C00OOC00oO(this.uNnUnnuNUnNu.get(var3).uUnuvNvvNU()); var4++) {
               var3 = Math.floorMod(var3 + var2, this.uNnUnnuNUnNu.size());
            }

            if (this.C00OOC00oO(this.uNnUnnuNUnNu.get(var3).uUnuvNvvNU())) {
               return;
            }
         }

         this.UnUNVVVNuv = var3;
         this.uVUVnuvnuVuv = true;
      }
   }

   public uuUnNVuuVUu vNUvnnVnUvu() {
      return this.uNnUnnuNUnNu.isEmpty() ? null : this.uNnUnnuNUnNu.get(Math.min(this.UnUNVVVNuv, this.uNnUnnuNUnNu.size() - 1));
   }

   public List<uuUnNVuuVUu> uVUuuVnNVU() {
      return this.uNnUnnuNUnNu;
   }

   public void UuUVuuUu(double var1) {
      if (this.vuuuNvNuv) {
         this.vNVuvnUUnuUn = Math.max(0.0F, Math.min(this.vNVuvnUUnuUn - (float)var1 * 28.0F, Math.max(0.0F, this.UvnvNVnnnnNU)));
      }
   }

   public void UuUVuuUu(String var1) {
      if (var1 != null) {
         boolean var2 = !this.uVUuuVnNVU.getOrDefault(var1, false);
         this.uVUuuVnNVU.put(var1, var2);
         if (var2 && this.nUUVuvU.isBlank() && !this.uNnUnnuNUnNu.isEmpty()) {
            uuUnNVuuVUu var3 = this.uNnUnnuNUnNu.get(Math.min(this.UnUNVVVNuv, this.uNnUnnuNUnNu.size() - 1));
            if (var1.equals(var3.uUnuvNvvNU())) {
               this.UuUVuuUu(1);
            }
         }
      }
   }

   public boolean C00OOC00oO(String var1) {
      return this.uVUuuVnNVU.getOrDefault(var1, false);
   }

   public vnvNNVNU UuUVuuUu(nUvnuVnNUU var1, int var2, int var3) {
      float var4 = Math.min(var1.UuUVuuUu(520.0F), var2 - var1.UuUVuuUu(64.0F));
      float var5 = Math.max(var1.UuUVuuUu(28.0F), var3 * 0.14F);
      float var6 = Math.min(var1.UuUVuuUu(500.0F), var3 - var5 - var1.UuUVuuUu(28.0F));
      float var7 = (var2 - var4) * 0.5F;
      return new vnvNNVNU(var7, var5, var4, var6);
   }

   public vnvNNVNU C00OOC00oO(nUvnuVnNUU var1, int var2, int var3) {
      vnvNNVNU var4 = this.UuUVuuUu(var1, var2, var3);
      return new vnvNNVNU(var4.x() + var1.UuUVuuUu(16.0F), var4.y() + var1.UuUVuuUu(16.0F), var4.w() - var1.UuUVuuUu(32.0F), var1.UuUVuuUu(46.0F));
   }

   public uuUnNVuuVUu UuUVuuUu(nUvnuVnNUU var1, int var2, int var3, float var4, float var5) {
      nunnVVUnv.NVnVnNnN var6 = this.uUnuvNvvNU(var1, var2, var3, var4, var5);
      return var6 == null ? null : var6.definition;
   }

   public String C00OOC00oO(nUvnuVnNUU var1, int var2, int var3, float var4, float var5) {
      if (this.vuuuNvNuv && this.nUUVuvU.isBlank()) {
         nunnVVUnv.NVnVnNnN var6 = this.uUnuvNvvNU(var1, var2, var3, var4, var5);
         return var6 == null ? null : var6.category;
      } else {
         return null;
      }
   }

   private nunnVVUnv.NVnVnNnN uUnuvNvvNU(nUvnuVnNUU var1, int var2, int var3, float var4, float var5) {
      if (!this.vuuuNvNuv) {
         return null;
      } else {
         vnvNNVNU var6 = this.UuUVuuUu(var1, var2, var3);
         float var7 = this.UuUVuuUu(var1, var6);
         float var8 = this.C00OOC00oO(var1, var6);
         if (!(var4 < var6.x()) && !(var4 > var6.x() + var6.w()) && !(var5 < var7) && !(var5 > var8)) {
            float var9 = var7 - this.VVuuUN.C00OOC00oO();
            String var10 = "";
            boolean var11 = !this.nUUVuvU.isBlank();

            for (VNUUuvNvNVu.NVnVnNnN var13 : this.UNnVVNvvnVvU) {
               uuUnNVuuVUu var14 = var13.def();
               if (!var11 && !var14.uUnuvNvvNU().equals(var10)) {
                  var10 = var14.uUnuvNvvNU();
                  if (var5 >= var9 && var5 < var9 + var1.UuUVuuUu(22.0F)) {
                     return new nunnVVUnv.NVnVnNnN(null, var10);
                  }

                  var9 += var1.UuUVuuUu(22.0F);
                  if (this.C00OOC00oO(var10)) {
                     continue;
                  }
               } else if (!var11 && this.C00OOC00oO(var14.uUnuvNvvNU())) {
                  continue;
               }

               float var15 = var1.UuUVuuUu(34.0F);
               if (var5 >= var9 && var5 < var9 + var15) {
                  return new nunnVVUnv.NVnVnNnN(var14, null);
               }

               var9 += var15;
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

   private float UuUVuuUu(nUvnuVnNUU var1, vnvNNVNU var2) {
      return var2.y() + var1.UuUVuuUu(76.0F);
   }

   private float C00OOC00oO(nUvnuVnNUU var1, vnvNNVNU var2) {
      return var2.y() + var2.h() - var1.UuUVuuUu(34.0F);
   }

   private void vuuuNvNuv() {
      String var1 = this.nUUVuvU == null ? "" : this.nUUVuvU.toLowerCase(Locale.ROOT).trim();
      ArrayList var2 = new ArrayList<>(this.uNNnnnuuuN.UuUVuuUu());
      if (this.uVunuUNVVUUV != null) {
         ArrayList var3 = new ArrayList();

         for (uuUnNVuuVUu var5 : var2) {
            for (NUuvnUuVU var7 : var5.uNNnnnuuuN()) {
               if (var7.type() == this.uVunuUNVVUUV) {
                  var3.add(var5);
                  break;
               }
            }
         }

         var2 = var3;
      }

      ArrayList var8 = new ArrayList();
      if (var1.isEmpty()) {
         var2.sort(Comparator.comparing(uuUnNVuuVUu::uUnuvNvvNU).thenComparing(uuUnNVuuVUu::C00OOC00oO));

         for (uuUnNVuuVUu var12 : var2) {
            var8.add(new VNUUuvNvNVu.NVnVnNnN(var12, 0, new int[0]));
         }
      } else {
         for (uuUnNVuuVUu var13 : var2) {
            VNUUuvNvNVu.NVnVnNnN var15 = VNUUuvNvNVu.UuUVuuUu(var13, var1);
            if (var15 != null) {
               var8.add(var15);
            }
         }

         var8.sort(Comparator.<VNUUuvNvNVu.NVnVnNnN>comparingInt(var0 -> -var0.score()).thenComparing(var0 -> var0.def().C00OOC00oO()));
      }

      this.UNnVVNvvnVvU = var8;
      ArrayList var11 = new ArrayList(var8.size());

      for (VNUUuvNvNVu.NVnVnNnN var16 : var8) {
         var11.add(var16.def());
      }

      this.uNnUnnuNUnNu = var11;
      if (this.UnUNVVVNuv >= this.uNnUnnuNUnNu.size()) {
         this.UnUNVVVNuv = Math.max(0, this.uNnUnnuNUnNu.size() - 1);
      }
   }

   public void UuUVuuUu(UnVNvNnU var1, nUVuuNUVnV var2, vNvvVnNuUVvv var3, int var4, int var5) {
      float var6 = this.nuUnNvnuUu.UuUVuuUu();
      if (!(var6 <= 0.004F)) {
         nUvnuVnNUU var7 = var2.uNNnnnuuuN();
         NUunUunuNV var8 = var2.nuUnNvnuUu();
         boolean var9 = var8.uNnUnnuNUnNu();
         vnvNNVNU var10 = this.UuUVuuUu(var7, var4, var5);
         float var11 = this.VVuuUN.UuUVuuUu(Math.max(0.0F, Math.min(this.vNVuvnUUnuUn, Math.max(0.0F, this.UvnvNVnnnnNU))), Cc0cOoOcC0o.VVuuUN());
         var1.UuUVuuUu(16.0F);
         var1.UuUVuuUu(0.0F, 0.0F, (float)var4, (float)var5, 0.0F, var6);
         var1.UuUVuuUu(
            0.0F,
            0.0F,
            (float)var4,
            (float)var5,
            0.0F,
            var9 ? NUunUunuNV.UuUVuuUu(236, 239, 246, Math.round(96.0F * var6)) : NUunUunuNV.UuUVuuUu(3, 5, 9, Math.round(150.0F * var6))
         );
         float var12 = var10.x() + var10.w() * 0.5F;
         float var13 = var10.y() + var10.h() * 0.42F;
         var1.UuUVuuUu(0.92F + 0.08F * var6, var12, var13);
         var1.uNNnnnuuuN(var6);

         try {
            float var14 = var7.UuUVuuUu(18.0F);
            var1.UuUVuuUu(
               var10.x(),
               var10.y(),
               var10.w(),
               var10.h(),
               var14,
               var7.UuUVuuUu(36.0F),
               var7.UuUVuuUu(2.0F),
               var9 ? NUunUunuNV.UuUVuuUu(24, 32, 48, 44) : NUunUunuNV.UuUVuuUu(0, 0, 0, 196)
            );
            var1.UuUVuuUu(
               var10.x(), var10.y(), var10.w(), var10.h(), var14, var9 ? NUunUunuNV.UuUVuuUu(250, 251, 254, 246) : NUunUunuNV.UuUVuuUu(9, 11, 17, 244)
            );
            var1.UuUVuuUu(var10.x(), var10.y(), var10.w(), var10.h(), var14, NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 96), 0.9F);
            var1.UuUVuuUu(
               var10.x() + var14,
               var10.y(),
               var10.w() - var14 * 2.0F,
               1.2F,
               NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 0),
               NUunUunuNV.UuUVuuUu(var8.uVunuUNVVUUV(), 170)
            );
            this.UuUVuuUu(var1, var7, var8, var9, var10);
            this.UuUVuuUu(var1, var7, var8, var3, var10, var11, var9);
            this.UuUVuuUu(var1, var7, var8, var10);
         } finally {
            var1.vuuuNvNuv();
            var1.uVUuuVnNVU();
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, boolean var4, vnvNNVNU var5) {
      vnvNNVNU var6 = new vnvNNVNU(var5.x() + var2.UuUVuuUu(16.0F), var5.y() + var2.UuUVuuUu(16.0F), var5.w() - var2.UuUVuuUu(32.0F), var2.UuUVuuUu(46.0F));
      float var7 = var2.UuUVuuUu(11.0F);
      var1.UuUVuuUu(var6.x(), var6.y(), var6.w(), var6.h(), var7, var2.UuUVuuUu(18.0F), 0.0F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 64));
      var1.UuUVuuUu(var6.x(), var6.y(), var6.w(), var6.h(), var7, var4 ? NUunUunuNV.UuUVuuUu(255, 255, 255, 244) : NUunUunuNV.UuUVuuUu(14, 16, 24, 240));
      var1.UuUVuuUu(var6.x(), var6.y(), var6.w(), var6.h(), var7, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 188), 1.1F);
      float var8 = var6.x() + var2.UuUVuuUu(19.0F);
      float var9 = var6.y() + var6.h() * 0.5F - var2.UuUVuuUu(1.0F);
      var1.UuUVuuUu(var8, var9, var2.UuUVuuUu(4.4F), 0.0F, 1.0F, 1.4F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 230));
      var1.UuUVuuUu(var8 + var2.UuUVuuUu(3.2F), var9 + var2.UuUVuuUu(3.2F), var2.UuUVuuUu(5.4F), 1.4F, 0.7F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 230));
      float var10 = var6.x() + var2.UuUVuuUu(34.0F);
      float var11 = var6.y() + (var6.h() - var2.UuUVuuUu(15.0F)) * 0.5F;
      String var12 = this.nUUVuvU.isBlank() ? "Search nodes…" : this.nUUVuvU;
      int var13 = this.nUUVuvU.isBlank() ? var3.uVUVnuvnuVuv() : var3.NVNnnvnuunNv();
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.UuUVuuUu, var10, var11, 12.0F, var12, var13);
      boolean var14 = (System.currentTimeMillis() - this.NVNnnvnuunNv) / 500L % 2L == 0L;
      if (var14) {
         float var15 = var10 + (this.nUUVuvU.isBlank() ? 0.0F : nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, this.nUUVuvU, 12.0F) + 1.5F);
         var1.UuUVuuUu(var15, var6.y() + var2.UuUVuuUu(11.0F), 1.2F, var6.h() - var2.UuUVuuUu(22.0F), 0.0F, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 240));
      }

      if (this.uVunuUNVVUUV != null) {
         int var20 = unNvUUUUNVn.VUnuUnnuNvVu.C00OOC00oO(this.uVunuUNVVUUV);
         String var16 = "Connect → " + this.uVunuUNVVUUV.UuUVuuUu();
         float var17 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var16, 9.0F) + var2.UuUVuuUu(22.0F);
         float var18 = var6.x() + var6.w() - var17 - var2.UuUVuuUu(10.0F);
         float var19 = var6.y() + (var6.h() - var2.UuUVuuUu(20.0F)) * 0.5F;
         var1.UuUVuuUu(var18, var19, var17, var2.UuUVuuUu(20.0F), var2.UuUVuuUu(10.0F), NUunUunuNV.UuUVuuUu(var20, 46));
         var1.C00OOC00oO(var18 + var2.UuUVuuUu(9.0F), var19 + var2.UuUVuuUu(10.0F), var2.UuUVuuUu(2.6F), 0.0F, 1.0F, var20);
         nunvNNUnvU.UuUVuuUu(
            var1, var2, vNvnnVvvVUu.UuUVuuUu, var18 + var2.UuUVuuUu(16.0F), var19 + var2.UuUVuuUu(5.5F), 9.0F, var16, NUunUunuNV.UuUVuuUu(var20, 245)
         );
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vNvvVnNuUVvv var4, vnvNNVNU var5, float var6, boolean var7) {
      float var8 = this.UuUVuuUu(var2, var5);
      float var9 = this.C00OOC00oO(var2, var5);
      float var10 = var5.x() + var2.UuUVuuUu(10.0F);
      float var11 = var5.w() - var2.UuUVuuUu(20.0F);
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(var10, var8, var11, var9 - var8, var2.UuUVuuUu(8.0F), var2.UuUVuuUu(8.0F), var2.UuUVuuUu(8.0F), var2.UuUVuuUu(8.0F));

      try {
         float var12 = var8 - var6;
         float var13 = 0.0F;
         float var14 = -1.0F;
         String var15 = "";
         int var16 = 0;
         boolean var17 = !this.nUUVuvU.isBlank();
         String var18 = this.nUUVuvU.toLowerCase(Locale.ROOT).trim();

         for (VNUUuvNvNVu.NVnVnNnN var20 : this.UNnVVNvvnVvU) {
            uuUnNVuuVUu var21 = var20.def();
            if (!var17 && !var21.uUnuvNvvNU().equals(var15)) {
               var15 = var21.uUnuvNvvNU();
               boolean var22 = this.C00OOC00oO(var15);
               if (var12 + var2.UuUVuuUu(22.0F) > var8 && var12 < var9) {
                  nunvNNUnvU.UuUVuuUu(
                     var1,
                     var2,
                     vNvnnVvvVUu.vVvUvVVuuNvV,
                     var10 + var2.UuUVuuUu(12.0F),
                     var12 + var2.UuUVuuUu(7.0F),
                     9.0F,
                     (var22 ? "▸ " : "▾ ") + var15.toUpperCase(Locale.ROOT),
                     NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 215)
                  );
               }

               var12 += var2.UuUVuuUu(22.0F);
               var13 += var2.UuUVuuUu(22.0F);
               if (var22) {
                  var16++;
                  continue;
               }
            } else if (!var17 && this.C00OOC00oO(var21.uUnuvNvvNU())) {
               var16++;
               continue;
            }

            float var31 = var2.UuUVuuUu(34.0F);
            if (var16 == this.UnUNVVVNuv) {
               var14 = var13;
            }

            if (var12 + var31 > var8 && var12 < var9) {
               this.UuUVuuUu(var1, var2, var3, var4, var21, var20, var18, var10, var12, var11, var31, var16 == this.UnUNVVVNuv, var7);
            }

            var12 += var31;
            var13 += var31;
            var16++;
         }

         this.UvnvNVnnnnNU = Math.max(0.0F, var13 - (var9 - var8));
         if (this.uVUVnuvnuVuv && var14 >= 0.0F) {
            float var29 = var9 - var8;
            float var30 = var2.UuUVuuUu(34.0F);
            if (var14 < this.vNVuvnUUnuUn) {
               this.vNVuvnUUnuUn = Math.max(0.0F, var14 - var2.UuUVuuUu(22.0F));
            } else if (var14 + var30 > this.vNVuvnUUnuUn + var29) {
               this.vNVuvnUUnuUn = Math.min(this.UvnvNVnnnnNU, var14 + var30 - var29 + var2.UuUVuuUu(6.0F));
            }

            this.uVUVnuvnuVuv = false;
         }

         if (this.UNnVVNvvnVvU.isEmpty()) {
            nunvNNUnvU.UuUVuuUu(
               var1, var2, vNvnnVvvVUu.UuUVuuUu, var10 + var2.UuUVuuUu(14.0F), var8 + var2.UuUVuuUu(18.0F), 11.0F, "no matching nodes", var3.uVUVnuvnuVuv()
            );
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }

      if (this.UvnvNVnnnnNU > 0.0F) {
         float var26 = var9 - var8;
         float var27 = Math.max(var2.UuUVuuUu(26.0F), var26 * var26 / (var26 + this.UvnvNVnnnnNU));
         float var28 = var8 + (var26 - var27) * (this.UvnvNVnnnnNU <= 0.0F ? 0.0F : Math.min(1.0F, var6 / this.UvnvNVnnnnNU));
         var1.UuUVuuUu(
            var5.x() + var5.w() - var2.UuUVuuUu(6.0F), var28, var2.UuUVuuUu(2.4F), var27, var2.UuUVuuUu(1.2F), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 130)
         );
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      nUvnuVnNUU var2,
      NUunUunuNV var3,
      vNvvVnNuUVvv var4,
      uuUnNVuuVUu var5,
      VNUUuvNvNVu.NVnVnNnN var6,
      String var7,
      float var8,
      float var9,
      float var10,
      float var11,
      boolean var12,
      boolean var13
   ) {
      boolean var14 = var4 != null
         && var4.unnUnUNVnN() >= var8
         && var4.unnUnUNVnN() <= var8 + var10
         && var4.NnuUnUNnu() >= var9
         && var4.NnuUnUNnu() < var9 + var11;
      UUNnvUVnnnnN var15 = this.vNUvnnVnUvu.computeIfAbsent(var5.UuUVuuUu(), var0 -> new UUNnvUVnnnnN(0.0F));
      float var16 = var15.UuUVuuUu(Math.max(var14 ? 0.72F : 0.0F, var12 ? 1.0F : 0.0F), Cc0cOoOcC0o.nvUVNnuu());
      var1.UuUVuuUu(
         var8 + var2.UuUVuuUu(4.0F),
         var9 + var2.UuUVuuUu(1.5F),
         var10 - var2.UuUVuuUu(8.0F),
         var11 - var2.UuUVuuUu(3.0F),
         var2.UuUVuuUu(8.0F),
         NUunUunuNV.UuUVuuUu(
            var13 ? NUunUunuNV.UuUVuuUu(10, 14, 22, 5) : NUunUunuNV.UuUVuuUu(255, 255, 255, 5), NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 62), var16
         )
      );
      if (var12) {
         var1.UuUVuuUu(
            var8 + var2.UuUVuuUu(4.0F),
            var9 + var2.UuUVuuUu(7.0F),
            var2.UuUVuuUu(2.4F),
            var11 - var2.UuUVuuUu(14.0F),
            var2.UuUVuuUu(1.2F),
            NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 235)
         );
      }

      int var17 = var5.nuUnNvnuUu().isEmpty() ? var3.UvnvNVnnnnNU() : unNvUUUUNVn.VUnuUnnuNvVu.C00OOC00oO(var5.nuUnNvnuUu().get(0).type());
      float var18 = var8 + var2.UuUVuuUu(18.0F);
      float var19 = var9 + var11 * 0.5F;
      var1.C00OOC00oO(var18, var19, var2.UuUVuuUu(3.4F) + var16 * var2.UuUVuuUu(0.8F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var17, 235));
      var1.C00OOC00oO(var18, var19, var2.UuUVuuUu(1.4F), 0.0F, 1.0F, var13 ? NUunUunuNV.UuUVuuUu(255, 255, 255, 235) : NUunUunuNV.UuUVuuUu(9, 11, 17, 235));
      int var20 = NUunUunuNV.UuUVuuUu(var3.uVUVnuvnuVuv(), var3.NVNnnvnuunNv(), 0.62F + var16 * 0.38F);
      this.UuUVuuUu(var1, var2, var3, var5.C00OOC00oO(), var6.titlePositions(), var7, var8 + var2.UuUVuuUu(32.0F), var9 + var2.UuUVuuUu(7.0F), 11.0F, var20);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var8 + var2.UuUVuuUu(32.0F),
         var9 + var2.UuUVuuUu(20.0F),
         7.5F,
         var5.uUnuvNvvNU(),
         NUunUunuNV.UuUVuuUu(var3.uVUVnuvnuVuv(), 200)
      );
      float var21 = var8 + var10 - var2.UuUVuuUu(14.0F);
      int var22 = Math.min(var5.uNNnnnuuuN().size(), 4);

      for (int var23 = var22 - 1; var23 >= 0; var23--) {
         int var24 = unNvUUUUNVn.VUnuUnnuNvVu.C00OOC00oO(var5.uNNnnnuuuN().get(var23).type());
         var1.C00OOC00oO(var21, var19, var2.UuUVuuUu(2.2F), 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(var24, 225));
         var21 -= var2.UuUVuuUu(7.0F);
      }

      String var25 = var5.nuUnNvnuUu().isEmpty() ? "sink" : var5.nuUnNvnuUu().get(0).type().UuUVuuUu();
      float var26 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var25, 8.0F);
      nunvNNUnvU.UuUVuuUu(
         var1, var2, vNvnnVvvVUu.UuUVuuUu, var21 - var26 - var2.UuUVuuUu(8.0F), var9 + var2.UuUVuuUu(11.0F), 8.0F, var25, NUunUunuNV.UuUVuuUu(var17, 240)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, String var4, int[] var5, String var6, float var7, float var8, float var9, int var10) {
      if (var5 != null && var5.length != 0 && !var6.isEmpty()) {
         int var11 = NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), 250);
         float var12 = var7;
         int var13 = 0;
         int var14 = 0;

         while (var13 < var4.length()) {
            boolean var15 = var14 < var5.length && var5[var14] == var13;
            int var16 = var13;
            if (var15) {
               while (var14 < var5.length && var5[var14] == var16) {
                  var14++;
                  var16++;
               }
            } else {
               int var17 = var14 < var5.length ? var5[var14] : var4.length();
               var16 = Math.max(var13 + 1, var17);
            }

            var16 = Math.min(var16, var4.length());
            String var19 = var4.substring(var13, var16);
            nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var12, var8, var9, var19, var15 ? var11 : var10);
            var12 += nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var19, var9);
            var13 = var16;
         }
      } else {
         nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var7, var8, var9, var4, var10);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, vnvNNVNU var4) {
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var4.x() + var2.UuUVuuUu(16.0F),
         var4.y() + var4.h() - var2.UuUVuuUu(24.0F),
         8.0F,
         "↑↓ navigate • Enter spawn • LMB on category to toggle • Esc close",
         NUunUunuNV.UuUVuuUu(var3.NVNnnvnuunNv(), 150)
      );
      String var5 = this.uNnUnnuNUnNu.size() + (this.uNnUnnuNUnNu.size() == 1 ? " node" : " nodes");
      float var6 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.UuUVuuUu, var5, 8.0F);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var2,
         vNvnnVvvVUu.UuUVuuUu,
         var4.x() + var4.w() - var6 - var2.UuUVuuUu(16.0F),
         var4.y() + var4.h() - var2.UuUVuuUu(24.0F),
         8.0F,
         var5,
         NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), 210)
      );
   }

   record NVnVnNnN(uuUnNVuuVUu definition, String category) {
   }
}
