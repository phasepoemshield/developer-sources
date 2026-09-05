package ru.metaculture.protection;

import java.io.File;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import net.minecraft.class_310;
import net.minecraft.class_437;

public final class Cco0c0CoOcC {
   private nUvnuVnNUU UuUVuuUu;
   private float C00OOC00oO;
   private float uUnuvNvvNU;
   private float vVvUvVVuuNvV;
   private float uNNnnnuuuN;
   private UvnnvunNNuVV nuUnNvnuUu = UvnnvunNNuVV.MODELS;
   private float VVuuUN;
   private float vNUvnnVnUvu;
   private float uVUuuVnNVU = 200.0F;
   private float vuuuNvNuv = -8.0F;
   private float nvUVNnuu = 1.0F;
   private boolean UuuNnUvUuv;
   private float nUUVuvU;
   private float UnUNVVVNuv;
   private String vNVuvnUUnuUn = "";
   private boolean UvnvNVnnnnNU;
   private boolean uVUVnuvnuVuv;
   private final ArrayList<Long> NVNnnvnuunNv = new ArrayList<>();
   private final ArrayList<Cco0c0CoOcC.NVnVnNnN> uVunuUNVVUUV = new ArrayList<>();
   private static final float UNnVVNvvnVvU = 170.0F;
   private boolean uNnUnnuNUnNu;
   private String NnUuNNU = "";
   private boolean nNvNUVU;
   private String UnUNuUU = "";
   private boolean uUVuVvuNUvnu;
   private long UvUvUNuvNU;
   private String c0oOOCcCoC0 = "";
   private float VVnVNnunVvu;
   private float unNNVVNnvvV = 1.0F;
   private int NuunnvnN = 1;
   private float NVUunUNUN;
   private float UUVNuUNUvUnV;
   private boolean vuvnUnVnUNnV;
   private long nnuUVNUuvvVU;
   private long nVVUuvuNnUN;
   private final HashMap<String, Long> nNnVnUNVV = new HashMap<>();
   private static final String[] nuunNvv = new String[]{"chip0", "chip1", "chip2", "chip3"};
   private String uUVVvVVNvvn = "";
   private long vvUVNVvvNUv;

   public boolean UuUVuuUu(vNvvVnNuUVvv var1) {
      return var1 != null && var1.UvNNVUVNVuvV();
   }

   public boolean C00OOC00oO(vNvvVnNuUVvv var1) {
      return var1 != null && var1.UvNNVUVNVuvV();
   }

   public boolean UuUVuuUu() {
      return this.UvnvNVnnnnNU || this.uNnUnnuNUnNu || this.nNvNUVU;
   }

   public void C00OOC00oO() {
      this.UuuNnUvUuv = false;
      this.UvnvNVnnnnNU = false;
      this.uVUVnuvnuVuv = false;
      this.uNnUnnuNUnNu = false;
      this.nNvNUVU = false;
      this.uUVuVvuNUvnu = false;
   }

   public void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, float var4, float var5, float var6, float var7) {
      if (var1 != null && var2 != null && var3 != null && !(var6 <= 0.0F) && !(var7 <= 0.0F)) {
         nUvnuVnNUU var8 = var3.uNNnnnuuuN();
         NUunUunuNV var9 = var3.nuUnNvnuUu();
         this.UuUVuuUu = var8;
         this.C00OOC00oO = var4;
         this.uUnuvNvvNU = var5;
         this.vVvUvVVuuNvV = var6;
         this.uNNnnnuuuN = var7;
         this.VVuuUN = this.VVuuUN + (this.vNUvnnVnUvu - this.VVuuUN) * 0.32F;
         this.VVnVNnunVvu = this.VVnVNnunVvu + ((this.c0oOOCcCoC0.isEmpty() ? 0.0F : 1.0F) - this.VVnVNnunVvu) * 0.3F;
         this.unNNVVNnvvV = this.unNNVVNnvvV + (1.0F - this.unNNVVNnvvV) * 0.18F;
         if (this.unNNVVNnvvV > 0.999F) {
            this.unNNVVNnvvV = 1.0F;
         }

         long var10 = System.currentTimeMillis();
         if (var10 - this.nVVUuvuNnUN > 240L) {
            this.nnuUVNUuvvVU = var10;
         }

         this.nVVUuvuNnUN = var10;
         float var12 = Math.min(1.0F, (float)(var10 - this.nnuUVNUuvvVU) / 360.0F);
         float var13 = 1.0F - (1.0F - var12) * (1.0F - var12) * (1.0F - var12);
         Cco0c0CoOcC.nvnNNunvv var14 = new Cco0c0CoOcC.nvnNNunvv(var4, var5, var6, var7);
         boolean var15 = var13 < 0.999F;
         if (var15) {
            var1.uNNnnnuuuN(Math.max(0.0F, var13));
         }

         try {
            this.UuUVuuUu(var1, var2, var8, var9, var14, 1.0F);
            this.C00OOC00oO(var1, var2, var8, var9, var14, 1.0F);
            this.UuUVuuUu(var1, var2, var3, var8, var9, var14, 1.0F);
            this.C00OOC00oO(var1, var2, var3, var8, var9, var14, 1.0F);
         } finally {
            if (var15) {
               var1.vuuuNvNuv();
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, Cco0c0CoOcC.nvnNNunvv var5, float var6) {
      float var7 = var3.UuUVuuUu(18.0F);
      float var8 = var3.UuUVuuUu(44.0F);
      float var9 = var3.UuUVuuUu(18.0F);
      nunvNNUnvU.UuUVuuUu(
         var1, var3, vNvnnVvvVUu.vNUvnnVnUvu, var5.x + var7, var5.y, var8, 13.0F, "a", NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round(255.0F * var6))
      );
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var5.x + var7 + var9,
         var5.y,
         var8,
         15.0F,
         "Studio",
         NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var4), Math.round(255.0F * var6))
      );
      Cco0c0CoOcC.nvnNNunvv var10 = this.UuUVuuUu(var3, var5);
      boolean var11 = nunvNNUnvU.UuUVuuUu(var2, var10.x, var10.y, var10.w, var10.h);
      var1.UuUVuuUu(
         var10.x,
         var10.y,
         var10.w,
         var10.h,
         var10.h * 0.5F,
         NUunUunuNV.UuUVuuUu(this.UvnvNVnnnnNU ? var4.nvUVNnuu() : var4.uVUuuVnNVU(), Math.round(255.0F * var6))
      );
      if (this.UvnvNVnnnnNU || var11) {
         var1.UuUVuuUu(
            var10.x,
            var10.y,
            var10.w,
            var10.h,
            var10.h * 0.5F,
            NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round((this.UvnvNVnnnnNU ? 150 : 80) * var6)),
            0.7F
         );
      }

      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.uNNnnnuuuN,
         var10.x + var3.UuUVuuUu(10.0F),
         var10.y,
         var10.h,
         10.0F,
         "m",
         NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var4), Math.round(200.0F * var6))
      );
      float var12 = this.UvnvNVnnnnNU ? (float)((Math.sin(System.currentTimeMillis() * 0.006) + 1.0) * 0.5) : 0.0F;
      long var13 = System.currentTimeMillis();
      var1.UuUVuuUu((int)(var10.x + var3.UuUVuuUu(26.0F)), (int)var10.y, (int)(var10.w - var3.UuUVuuUu(34.0F)), (int)var10.h);
      if (this.vNVuvnUUnuUn.isEmpty() && !this.UvnvNVnnnnNU) {
         nunvNNUnvU.UuUVuuUu(
            var1,
            var3,
            vNvnnVvvVUu.UuUVuuUu,
            var10.x + var3.UuUVuuUu(26.0F),
            var10.y,
            var10.h,
            10.0F,
            "Поиск...",
            NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var4), Math.round(255.0F * var6))
         );
      } else {
         if (this.uVUVnuvnuVuv && !this.vNVuvnUUnuUn.isEmpty()) {
            float var15 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, this.vNVuvnUUnuUn, 10.0F);
            var1.UuUVuuUu(
               var10.x + var3.UuUVuuUu(24.0F),
               var10.y + (var10.h - var3.UuUVuuUu(16.0F)) * 0.5F,
               var15 + var3.UuUVuuUu(5.0F),
               var3.UuUVuuUu(16.0F),
               var3.UuUVuuUu(3.0F),
               NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round(70.0F * var6))
            );
         }

         float var25 = var10.x + var3.UuUVuuUu(26.0F);

         for (int var16 = 0; var16 < this.vNVuvnUUnuUn.length(); var16++) {
            String var17 = String.valueOf(this.vNVuvnUUnuUn.charAt(var16));
            float var18 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var17, 10.0F);
            long var19 = var16 < this.NVNnnvnuunNv.size() ? this.NVNnnvnuunNv.get(var16) : 0L;
            float var21 = (float)(var13 - var19) / 170.0F;
            float var22 = 0.0F;
            float var23 = 1.0F;
            if (var21 < 1.0F) {
               float var24 = 1.0F - (1.0F - var21) * (1.0F - var21);
               var22 = (1.0F - var24) * var3.UuUVuuUu(6.0F);
               var23 = var24;
            }

            nunvNNUnvU.UuUVuuUu(
               var1,
               var3,
               vNvnnVvvVUu.UuUVuuUu,
               var25,
               var10.y + var22,
               var10.h,
               10.0F,
               var17,
               NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var4), Math.round(255.0F * var23 * var6))
            );
            var25 += var18;
         }

         if (this.UvnvNVnnnnNU && !this.uVUVnuvnuVuv) {
            nunvNNUnvU.UuUVuuUu(
               var1,
               var3,
               vNvnnVvvVUu.UuUVuuUu,
               var25,
               var10.y,
               var10.h,
               10.0F,
               "|",
               NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round(255.0F * var12 * var6))
            );
         }
      }

      for (int var26 = this.uVunuUNVVUUV.size() - 1; var26 >= 0; var26--) {
         Cco0c0CoOcC.NVnVnNnN var28 = this.uVunuUNVVUUV.get(var26);
         float var29 = (float)(var13 - var28.born()) / 170.0F;
         if (var29 >= 1.0F) {
            this.uVunuUNVVUUV.remove(var26);
         } else {
            float var30 = 1.0F - (1.0F - var29) * (1.0F - var29);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var3,
               vNvnnVvvVUu.UuUVuuUu,
               var28.x(),
               var10.y + var30 * var3.UuUVuuUu(7.0F),
               var10.h,
               10.0F,
               var28.ch(),
               NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var4), Math.round(255.0F * (1.0F - var30) * var6))
            );
         }
      }

      var1.nuUnNvnuUu();
      if (!this.vNVuvnUUnuUn.isEmpty()) {
         boolean var27 = nunvNNUnvU.UuUVuuUu(var2, var10.x + var10.w - var3.UuUVuuUu(28.0F), var10.y, var3.UuUVuuUu(28.0F), var10.h);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var3,
            vNvnnVvvVUu.uNNnnnuuuN,
            var10.x + var10.w - var3.UuUVuuUu(20.0F),
            var10.y,
            var10.h,
            9.0F,
            "l",
            NUunUunuNV.UuUVuuUu(var27 ? var4.uVunuUNVVUUV() : nunvNNUnvU.C00OOC00oO(var4), Math.round(220.0F * var6))
         );
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, nUvnuVnNUU var3, NUunUunuNV var4, Cco0c0CoOcC.nvnNNunvv var5, float var6) {
      UvnnvunNNuVV[] var7 = UvnnvunNNuVV.values();
      float var8 = var5.y + var3.UuUVuuUu(44.0F);
      float var9 = var3.UuUVuuUu(34.0F);
      float var10 = var3.UuUVuuUu(18.0F);
      float var11 = var3.UuUVuuUu(26.0F);
      float var12 = var8 + (var9 - var11) * 0.5F;
      float var13 = var5.x + var10;
      float var14 = var13;
      float var15 = var3.UuUVuuUu(40.0F);

      for (UvnnvunNNuVV var19 : var7) {
         float var20 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var19.C00OOC00oO(), 11.0F) + var3.UuUVuuUu(20.0F);
         if (var19 == this.nuUnNvnuUu) {
            var14 = var13;
            var15 = var20;
         }

         var13 += var20 + var3.UuUVuuUu(6.0F);
      }

      if (!this.vuvnUnVnUNnV) {
         this.NVUunUNUN = var14;
         this.UUVNuUNUvUnV = var15;
         this.vuvnUnVnUNnV = true;
      } else {
         this.NVUunUNUN = this.NVUunUNUN + (var14 - this.NVUunUNUN) * 0.3F;
         this.UUVNuUNUvUnV = this.UUVNuUNUvUnV + (var15 - this.UUVNuUNUvUnV) * 0.3F;
      }

      var1.UuUVuuUu(
         this.NVUunUNUN,
         var12,
         this.UUVNuUNUvUnV,
         var11,
         var11 * 0.5F,
         NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round((var4.uNnUnnuNUnNu() ? 60 : 86) * var6))
      );
      var13 = var5.x + var10;

      for (UvnnvunNNuVV var47 : var7) {
         float var49 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var47.C00OOC00oO(), 11.0F) + var3.UuUVuuUu(20.0F);
         boolean var21 = var47 == this.nuUnNvnuUu;
         boolean var22 = nunvNNUnvU.UuUVuuUu(var2, var13, var12, var49, var11);
         boolean var23 = this.UuUVuuUu(var1, var47.name(), var13 + var49 * 0.5F, var12 + var11 * 0.5F);

         try {
            if (!var21 && var22) {
               var1.UuUVuuUu(var13, var12, var49, var11, var11 * 0.5F, NUunUunuNV.UuUVuuUu(var4.nvUVNnuu(), Math.round(255.0F * var6)));
            }

            nunvNNUnvU.UuUVuuUu(
               var1,
               var3,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var13 + var3.UuUVuuUu(11.0F),
               var12,
               var11,
               11.0F,
               var47.C00OOC00oO(),
               NUunUunuNV.UuUVuuUu(var21 ? nunvNNUnvU.UuUVuuUu(var4) : nunvNNUnvU.C00OOC00oO(var4), Math.round(255.0F * var6))
            );
         } finally {
            this.UuUVuuUu(var1, var23);
         }

         var13 += var49 + var3.UuUVuuUu(6.0F);
      }

      Cco0c0CoOcC.nvnNNunvv var42 = this.C00OOC00oO(var3, var5);
      Cco0c0CoOcC.nvnNNunvv var44 = this.uUnuvNvvNU(var3, var5);
      boolean var46 = nunvNNUnvU.UuUVuuUu(var2, var44.x, var44.y, var44.w, var44.h);
      boolean var48 = this.UuUVuuUu(var1, "import", var44.x + var44.w * 0.5F, var44.y + var44.h * 0.5F);
      boolean var36 = false /* VF: Semaphore variable */;

      try {
         var36 = true;
         var1.UuUVuuUu(
            var44.x,
            var44.y,
            var44.w,
            var44.h,
            var44.h * 0.5F,
            NUunUunuNV.UuUVuuUu(var46 ? var4.uVunuUNVVUUV() : var4.nvUVNnuu(), Math.round((var46 ? 70 : 255) * var6))
         );
         var1.UuUVuuUu(var44.x, var44.y, var44.w, var44.h, var44.h * 0.5F, NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round(110.0F * var6)), 0.7F);
         String var50 = "Импорт";
         float var52 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var50, 10.0F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var3,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var44.x + (var44.w - var52) * 0.5F,
            var44.y,
            var44.h,
            10.0F,
            var50,
            NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var4), Math.round(255.0F * var6))
         );
         var36 = false;
      } finally {
         if (var36) {
            this.UuUVuuUu(var1, var48);
         }
      }

      this.UuUVuuUu(var1, var48);
      boolean var51 = nunvNNUnvU.UuUVuuUu(var2, var42.x, var42.y, var42.w, var42.h);
      boolean var53 = this.UuUVuuUu(var1, "reload", var42.x + var42.w * 0.5F, var42.y + var42.h * 0.5F);

      try {
         var1.UuUVuuUu(
            var42.x, var42.y, var42.w, var42.h, var42.h * 0.5F, NUunUunuNV.UuUVuuUu(var51 ? var4.nvUVNnuu() : var4.uVUuuVnNVU(), Math.round(255.0F * var6))
         );
         float var54 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.uNNnnnuuuN, "r", 10.0F);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var3,
            vNvnnVvvVUu.uNNnnnuuuN,
            var42.x + (var42.w - var54) * 0.5F,
            var42.y,
            var42.h,
            10.0F,
            "r",
            NUunUunuNV.UuUVuuUu(var51 ? var4.uVunuUNVVUUV() : nunvNNUnvU.C00OOC00oO(var4), Math.round(255.0F * var6))
         );
      } finally {
         this.UuUVuuUu(var1, var53);
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, nUvnuVnNUU var4, NUunUunuNV var5, Cco0c0CoOcC.nvnNNunvv var6, float var7) {
      Cco0c0CoOcC.nvnNNunvv var8 = this.nuUnNvnuUu(var4, var6);
      this.UuUVuuUu(var1, var4, var5, var8.x, var8.y, var8.w, var8.h, var4.UuUVuuUu(10.0F), var7);
      List var9 = this.vNUvnnVnUvu();
      int var10 = this.nUUVuvU(var4, var8);
      float var11 = var4.UuUVuuUu(10.0F);
      float var12 = (var8.w - var4.UuUVuuUu(12.0F) - (var10 - 1) * var11) / var10;
      float var13 = var12;
      float var14 = var12 + var4.UuUVuuUu(20.0F);
      float var15 = var4.UuUVuuUu(10.0F);
      int var16 = (var9.size() + var10 - 1) / var10;
      float var17 = var16 * (var14 + var15) + var4.UuUVuuUu(6.0F);
      float var18 = Math.max(0.0F, var17 - var8.h);
      this.vNUvnnVnUvu = UuUVuuUu(this.vNUvnnVnUvu, 0.0F, var18);
      this.VVuuUN = UuUVuuUu(this.VVuuUN, 0.0F, var18);
      VuNVnnuuUun var19 = vnvnVnV.UuUVuuUu().nuUnNvnuUu();
      var1.UuUVuuUu(var8.x, var8.y, var8.w, var8.h, var4.UuUVuuUu(10.0F), var4.UuUVuuUu(10.0F), var4.UuUVuuUu(10.0F), var4.UuUVuuUu(10.0F));

      try {
         boolean var20 = this.unNNVVNnvvV < 0.999F;
         if (var20) {
            var1.uNNnnnuuuN(Math.max(0.0F, this.unNNVVNnvvV));
            var1.UuUVuuUu((1.0F - this.unNNVVNnvvV) * this.NuunnvnN * var8.w * 0.16F, 0.0F);
         }

         try {
            float var21 = var8.x + var4.UuUVuuUu(6.0F);
            float var22 = var8.y + var4.UuUVuuUu(6.0F) - this.VVuuUN;
            String var23 = "";

            for (int var24 = 0; var24 < var9.size(); var24++) {
               int var25 = var24 % var10;
               int var26 = var24 / var10;
               float var27 = var21 + var25 * (var12 + var11);
               float var28 = var22 + var26 * (var14 + var15);
               if (!(var28 + var14 < var8.y) && !(var28 > var8.y + var8.h)) {
                  VuNVnnuuUun var29 = (VuNVnnuuUun)var9.get(var24);
                  if (nunvNNUnvU.UuUVuuUu(var2, var27, var28, var12, var14)) {
                     var23 = var29.UuUVuuUu();
                  }

                  float var30 = var29.UuUVuuUu().equals(this.c0oOOCcCoC0) ? this.VVnVNnunVvu : 0.0F;
                  float var31 = 1.0F;
                  float var32 = var28;
                  long var33 = System.currentTimeMillis() - this.nnuUVNUuvvVU - var24 * 26L;
                  if (var33 < 240L) {
                     float var35 = Math.max(0.0F, (float)var33) / 240.0F;
                     float var36 = 1.0F - (1.0F - var35) * (1.0F - var35);
                     var31 = var36;
                     var32 = var28 + (1.0F - var36) * var4.UuUVuuUu(14.0F);
                  }

                  boolean var54 = this.UuUVuuUu(var1, var29.UuUVuuUu(), var27 + var12 * 0.5F, var32 + var14 * 0.5F);

                  try {
                     this.UuUVuuUu(var1, var2, var4, var5, var29, var27, var32, var12, var14, var13, var19, var7 * var31, var30);
                  } finally {
                     this.UuUVuuUu(var1, var54);
                  }
               }
            }

            this.c0oOOCcCoC0 = var23;
            if (var9.isEmpty()) {
               String var52 = this.vNVuvnUUnuUn.isEmpty() ? "Пусто. Нажмите «Импорт»" : "Ничего не найдено";
               float var53 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var52, 10.0F);
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var4,
                  vNvnnVvvVUu.UuUVuuUu,
                  var8.x + (var8.w - var53) * 0.5F,
                  var8.y + var8.h * 0.42F,
                  var4.UuUVuuUu(14.0F),
                  10.0F,
                  var52,
                  NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var5), Math.round(190.0F * var7))
               );
            }
         } finally {
            if (var20) {
               var1.vNUvnnVnUvu();
               var1.vuuuNvNuv();
            }
         }
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      nUvnuVnNUU var3,
      NUunUunuNV var4,
      VuNVnnuuUun var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      VuNVnnuuUun var11,
      float var12,
      float var13
   ) {
      boolean var14 = var11 != null && var11.UuUVuuUu().equals(var5.UuUVuuUu());
      boolean var15 = var14 && vnvnVnV.UuUVuuUu().VVuuUN();
      float var16 = var3.UuUVuuUu(10.0F);
      if (!var14 && var13 > 0.01F) {
         var1.UuUVuuUu(
            var6,
            var7,
            var8,
            var9,
            var16,
            var3.UuUVuuUu(12.0F) * var13,
            var3.UuUVuuUu(1.0F),
            NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round(46.0F * var13 * var12))
         );
      }

      int var17 = var14
         ? NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round((var4.uNnUnnuNUnNu() ? 40 : 54) * var12))
         : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var4.uVUuuVnNVU(), var4.UuuNnUvUuv(), var13), Math.round(255.0F * var12));
      var1.UuUVuuUu(var6, var7, var8, var9, var16, var17);
      if (var14) {
         var1.UuUVuuUu(
            var6, var7, var8, var9, var16, var3.UuUVuuUu(14.0F), var3.UuUVuuUu(1.0F), NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round(60.0F * var12))
         );
         var1.UuUVuuUu(var6, var7, var8, var9, var16, NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round(180.0F * var12)), 0.9F);
      } else if (var13 > 0.01F) {
         var1.UuUVuuUu(var6, var7, var8, var9, var16, NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round(80.0F * var13 * var12)), 0.7F);
      }

      var1.UuUVuuUu(
         var6 + var3.UuUVuuUu(4.0F),
         var7 + var3.UuUVuuUu(4.0F),
         var8 - var3.UuUVuuUu(8.0F),
         var10 - var3.UuUVuuUu(2.0F),
         var16 * 0.7F,
         var16 * 0.7F,
         0.0F,
         0.0F
      );

      try {
         var1.UuUVuuUu(
            var6 + var3.UuUVuuUu(4.0F),
            var7 + var3.UuUVuuUu(4.0F),
            var8 - var3.UuUVuuUu(8.0F),
            var10 - var3.UuUVuuUu(2.0F),
            0.0F,
            NUunUunuNV.UuUVuuUu(10, 12, 18, Math.round(230.0F * var12))
         );
         vunUuUUNnN.UuUVuuUu(
            var1,
            var5.nUUVuvU(),
            var5.UuUVuuUu(),
            var6 + var3.UuUVuuUu(4.0F),
            var7 + var3.UuUVuuUu(4.0F),
            var8 - var3.UuUVuuUu(8.0F),
            var10 - var3.UuUVuuUu(2.0F),
            var12
         );
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }

      String var18 = var5.uVUuuVnNVU();
      if (var18 != null && !var18.isEmpty()) {
         String var19 = UuUVuuUu(var18, 10);
         float var20 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var19, 8.0F) + var3.UuUVuuUu(8.0F);
         var1.UuUVuuUu(
            var6 + var3.UuUVuuUu(6.0F),
            var7 + var3.UuUVuuUu(6.0F),
            var20,
            var3.UuUVuuUu(13.0F),
            var3.UuUVuuUu(6.0F),
            NUunUunuNV.UuUVuuUu(var4.uVunuUNVVUUV(), Math.round(210.0F * var12))
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var3,
            vNvnnVvvVUu.UuUVuuUu,
            var6 + var3.UuUVuuUu(10.0F),
            var7 + var3.UuUVuuUu(6.0F),
            var3.UuUVuuUu(13.0F),
            8.0F,
            var19,
            NUunUunuNV.UuUVuuUu(-1, Math.round(255.0F * var12))
         );
      }

      float var23 = var7 + var10;
      nunvNNUnvU.UuUVuuUu(
         var1,
         var3,
         vNvnnVvvVUu.UuUVuuUu,
         var6 + var3.UuUVuuUu(8.0F),
         var23,
         var3.UuUVuuUu(20.0F),
         9.0F,
         UuUVuuUu(var5.vVvUvVVuuNvV(), 16),
         NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var4), Math.round(255.0F * var12))
      );
      Cco0c0CoOcC.nvnNNunvv var24 = this.UuUVuuUu(var3, var6, var7, var8, var10);
      this.UuUVuuUu(var1, var3, var4, var24, var15, var12);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      var1.UuUVuuUu(var4, var5, var6, var7, var8, var2.UuUVuuUu(9.0F), var2.UuUVuuUu(1.4F), NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(46.0F * var9)));
      var1.UuUVuuUu(var4, var5, var6, var7, var8, NUunUunuNV.UuUVuuUu(var3.uVUuuVnNVU(), Math.round(255.0F * var9)));
      var1.UuUVuuUu(var4, var5, var6, var7, var8, NUunUunuNV.UuUVuuUu(var3.uVunuUNVVUUV(), Math.round(48.0F * var9)), 0.8F);
      float var10 = Math.max(0.0F, (var6 - var8 * 2.0F) * 0.5F);
      int var11 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(-1, var3.uVunuUNVVUUV(), 0.35F), Math.round(48.0F * var9));
      int var12 = NUunUunuNV.UuUVuuUu(var11, Math.round(8.0F * var9));
      var1.UuUVuuUu(var4 + var8, var5 + var2.UuUVuuUu(1.0F), var10, Math.max(1.0F, var2.UuUVuuUu(1.0F)), 0.0F, var12, var11);
      var1.UuUVuuUu(var4 + var8 + var10, var5 + var2.UuUVuuUu(1.0F), var10, Math.max(1.0F, var2.UuUVuuUu(1.0F)), 0.0F, var11, var12);
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, Cco0c0CoOcC.nvnNNunvv var4, boolean var5, float var6) {
      var1.UuUVuuUu(
         var4.x,
         var4.y,
         var4.w,
         var4.h,
         var4.h * 0.5F,
         NUunUunuNV.UuUVuuUu(var5 ? var3.uVunuUNVVUUV() : var3.UvnvNVnnnnNU(), Math.round((var5 ? 220 : 255) * var6))
      );
      float var7 = var4.h - var2.UuUVuuUu(3.0F);
      float var8 = var5 ? var4.x + var4.w - var7 - var2.UuUVuuUu(1.5F) : var4.x + var2.UuUVuuUu(1.5F);
      var1.C00OOC00oO(var8 + var7 * 0.5F, var4.y + var4.h * 0.5F, var7 * 0.5F, 0.0F, 1.0F, NUunUunuNV.UuUVuuUu(-1, Math.round(255.0F * var6)));
   }

   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, nUVuuNUVnV var3, nUvnuVnNUU var4, NUunUunuNV var5, Cco0c0CoOcC.nvnNNunvv var6, float var7) {
      Cco0c0CoOcC.nvnNNunvv var8 = this.uNNnnnuuuN(var4, var6);
      this.UuUVuuUu(var1, var4, var5, var8.x, var8.y, var8.w, var8.h, var4.UuUVuuUu(12.0F), var7);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var4,
         vNvnnVvvVUu.vVvUvVVuuNvV,
         var8.x + var4.UuUVuuUu(14.0F),
         var8.y,
         var4.UuUVuuUu(34.0F),
         11.0F,
         "Превью",
         NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var5), Math.round(235.0F * var7))
      );
      VuNVnnuuUun var9 = vnvnVnV.UuUVuuUu().nuUnNvnuUu();
      Cco0c0CoOcC.nvnNNunvv var10 = this.VVuuUN(var4, var6);
      vunUuUUNnN.UuUVuuUu(var1, var3, var10.x, var10.y, var10.w, var10.h, var9, this.uVUuuVnNVU, this.vuuuNvNuv, this.nvUVNnuu, var7);
      Cco0c0CoOcC.nvnNNunvv var11 = this.vNUvnnVnUvu(var4, var6);
      if (this.uNnUnnuNUnNu && var9 != null) {
         Cco0c0CoOcC.nvnNNunvv var42 = this.nvUVNnuu(var4, var6);
         var1.UuUVuuUu(var42.x, var42.y, var42.w, var42.h, var4.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var5.nvUVNnuu(), Math.round(255.0F * var7)));
         var1.UuUVuuUu(var42.x, var42.y, var42.w, var42.h, var4.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round(170.0F * var7)), 0.8F);
         float var44 = (float)((Math.sin(System.currentTimeMillis() * 0.006) + 1.0) * 0.5);
         float var14 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, this.NnUuNNU, 11.0F);
         var1.UuUVuuUu((int)(var42.x + var4.UuUVuuUu(7.0F)), (int)var42.y, (int)(var42.w - var4.UuUVuuUu(12.0F)), (int)var42.h);
         nunvNNUnvU.UuUVuuUu(
            var1,
            var4,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var42.x + var4.UuUVuuUu(7.0F),
            var42.y,
            var42.h,
            11.0F,
            this.NnUuNNU,
            NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var5), Math.round(255.0F * var7))
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var4,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var42.x + var4.UuUVuuUu(7.0F) + var14,
            var42.y,
            var42.h,
            11.0F,
            "|",
            NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round(255.0F * var44 * var7))
         );
         var1.nuUnNvnuUu();
      } else {
         String var12 = var9 == null ? "Ничего не выбрано" : var9.vVvUvVVuuNvV();
         boolean var13 = var9 != null && nunvNNUnvU.UuUVuuUu(var2, var11.x, var11.y, var11.w * 0.7F, var4.UuUVuuUu(16.0F));
         nunvNNUnvU.UuUVuuUu(
            var1,
            var4,
            vNvnnVvvVUu.vVvUvVVuuNvV,
            var11.x,
            var11.y,
            var4.UuUVuuUu(18.0F),
            12.0F,
            UuUVuuUu(var12, 22),
            NUunUunuNV.UuUVuuUu(var13 ? var5.uVunuUNVVUUV() : nunvNNUnvU.UuUVuuUu(var5), Math.round(255.0F * var7))
         );
      }

      String var43 = this.vVvUvVVuuNvV(var9);
      nunvNNUnvU.UuUVuuUu(
         var1,
         var4,
         vNvnnVvvVUu.UuUVuuUu,
         var11.x,
         var11.y + var4.UuUVuuUu(17.0F),
         var4.UuUVuuUu(15.0F),
         9.0F,
         UuUVuuUu(var43, 40),
         NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var5), Math.round(200.0F * var7))
      );
      if (var9 != null) {
         UvnnvunNNuVV[] var45 = UvnnvunNNuVV.values();
         float var46 = var4.UuUVuuUu(20.0F);
         float var15 = var11.y + var4.UuUVuuUu(34.0F);
         float var16 = var11.x;

         for (UvnnvunNNuVV var20 : var45) {
            String var21 = var20.C00OOC00oO();
            float var22 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var21, 9.0F) + var4.UuUVuuUu(12.0F);
            boolean var23 = var9.vNUvnnVnUvu() == var20;
            boolean var24 = this.UuUVuuUu(var1, nuunNvv[var20.ordinal()], var16 + var22 * 0.5F, var15 + var46 * 0.5F);

            try {
               var1.UuUVuuUu(
                  var16,
                  var15,
                  var22,
                  var46,
                  var46 * 0.5F,
                  NUunUunuNV.UuUVuuUu(var23 ? var5.uVunuUNVVUUV() : var5.uVUuuVnNVU(), Math.round((var23 ? 70 : 255) * var7))
               );
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var4,
                  vNvnnVvvVUu.UuUVuuUu,
                  var16 + var4.UuUVuuUu(6.0F),
                  var15,
                  var46,
                  9.0F,
                  var21,
                  NUunUunuNV.UuUVuuUu(var23 ? nunvNNUnvU.UuUVuuUu(var5) : nunvNNUnvU.C00OOC00oO(var5), Math.round(255.0F * var7))
               );
            } finally {
               this.UuUVuuUu(var1, var24);
            }

            var16 += var22 + var4.UuUVuuUu(4.0F);
         }

         Cco0c0CoOcC.nvnNNunvv var47 = this.UuuNnUvUuv(var4, var6);
         if (this.nNvNUVU) {
            var1.UuUVuuUu(var47.x, var47.y, var47.w, var47.h, var4.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var5.nvUVNnuu(), Math.round(255.0F * var7)));
            var1.UuUVuuUu(var47.x, var47.y, var47.w, var47.h, var4.UuUVuuUu(5.0F), NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round(170.0F * var7)), 0.8F);
            float var49 = (float)((Math.sin(System.currentTimeMillis() * 0.006) + 1.0) * 0.5);
            float var52 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, this.UnUNuUU, 9.0F);
            var1.UuUVuuUu((int)(var47.x + var4.UuUVuuUu(7.0F)), (int)var47.y, (int)(var47.w - var4.UuUVuuUu(12.0F)), (int)var47.h);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var4,
               vNvnnVvvVUu.UuUVuuUu,
               var47.x + var4.UuUVuuUu(7.0F),
               var47.y,
               var47.h,
               9.0F,
               this.UnUNuUU,
               NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var5), Math.round(255.0F * var7))
            );
            nunvNNUnvU.UuUVuuUu(
               var1,
               var4,
               vNvnnVvvVUu.UuUVuuUu,
               var47.x + var4.UuUVuuUu(7.0F) + var52,
               var47.y,
               var47.h,
               9.0F,
               "|",
               NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round(255.0F * var49 * var7))
            );
            var1.nuUnNvnuUu();
         } else {
            boolean var48 = nunvNNUnvU.UuUVuuUu(var2, var47.x, var47.y, var47.w, var47.h);
            var1.UuUVuuUu(
               var47.x,
               var47.y,
               var47.w,
               var47.h,
               var4.UuUVuuUu(5.0F),
               NUunUunuNV.UuUVuuUu(var48 ? var5.nvUVNnuu() : var5.uVUuuVnNVU(), Math.round(255.0F * var7))
            );
            String var51 = var9.uVUuuVnNVU();
            if (var51 != null && !var51.isEmpty()) {
               float var54 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "Префикс: ", 9.0F);
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var4,
                  vNvnnVvvVUu.UuUVuuUu,
                  var47.x + var4.UuUVuuUu(7.0F),
                  var47.y,
                  var47.h,
                  9.0F,
                  "Префикс: ",
                  NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var5), Math.round(200.0F * var7))
               );
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var4,
                  vNvnnVvvVUu.UuUVuuUu,
                  var47.x + var4.UuUVuuUu(7.0F) + var54,
                  var47.y,
                  var47.h,
                  9.0F,
                  UuUVuuUu(var51, 18),
                  NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round(255.0F * var7))
               );
            } else {
               nunvNNUnvU.UuUVuuUu(
                  var1,
                  var4,
                  vNvnnVvvVUu.UuUVuuUu,
                  var47.x + var4.UuUVuuUu(7.0F),
                  var47.y,
                  var47.h,
                  9.0F,
                  "+ префикс",
                  NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var5), Math.round(180.0F * var7))
               );
            }
         }

         Cco0c0CoOcC.nvnNNunvv var50 = this.uVUuuVnNVU(var4, var6);
         boolean var53 = vnvnVnV.UuUVuuUu().VVuuUN();
         boolean var55 = nunvNNUnvU.UuUVuuUu(var2, var50.x, var50.y, var50.w, var50.h);
         boolean var56 = this.UuUVuuUu(var1, "equip", var50.x + var50.w * 0.5F, var50.y + var50.h * 0.5F);

         try {
            int var57 = var53
               ? NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round((var55 ? 200 : 160) * var7))
               : NUunUunuNV.UuUVuuUu(var55 ? var5.nvUVNnuu() : var5.uVUuuVnNVU(), Math.round(255.0F * var7));
            var1.UuUVuuUu(var50.x, var50.y, var50.w, var50.h, var4.UuUVuuUu(8.0F), var57);
            var1.UuUVuuUu(var50.x, var50.y, var50.w, var50.h, var4.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var5.uVunuUNVVUUV(), Math.round(140.0F * var7)), 0.7F);
            String var59 = var53 ? "Снять" : "Надеть";
            float var61 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var59, 11.0F);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var4,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var50.x + (var50.w - var61) * 0.5F,
               var50.y,
               var50.h,
               11.0F,
               var59,
               NUunUunuNV.UuUVuuUu(var53 ? nunvNNUnvU.UuUVuuUu(var5) : nunvNNUnvU.C00OOC00oO(var5), Math.round(255.0F * var7))
            );
         } finally {
            this.UuUVuuUu(var1, var56);
         }

         Cco0c0CoOcC.nvnNNunvv var58 = this.vuuuNvNuv(var4, var6);
         boolean var60 = nunvNNUnvU.UuUVuuUu(var2, var58.x, var58.y, var58.w, var58.h);
         boolean var62 = this.uUVuVvuNUvnu && System.currentTimeMillis() - this.UvUvUNuvNU < 2600L;
         boolean var25 = this.UuUVuuUu(var1, "delete", var58.x + var58.w * 0.5F, var58.y + var58.h * 0.5F);

         try {
            int var26 = var62
               ? NUunUunuNV.UuUVuuUu(196, 64, 64, Math.round(235.0F * var7))
               : NUunUunuNV.UuUVuuUu(var60 ? var5.UuuNnUvUuv() : var5.uVUuuVnNVU(), Math.round(255.0F * var7));
            var1.UuUVuuUu(var58.x, var58.y, var58.w, var58.h, var4.UuUVuuUu(8.0F), var26);
            var1.UuUVuuUu(
               var58.x,
               var58.y,
               var58.w,
               var58.h,
               var4.UuUVuuUu(8.0F),
               var62 ? NUunUunuNV.UuUVuuUu(255, 120, 120, Math.round(220.0F * var7)) : NUunUunuNV.UuUVuuUu(var5.UnUNVVVNuv(), Math.round(190.0F * var7)),
               0.7F
            );
            String var27 = var62 ? "Точно?" : "Удалить";
            float var28 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var27, 10.0F);
            nunvNNUnvU.UuUVuuUu(
               var1,
               var4,
               vNvnnVvvVUu.vVvUvVVuuNvV,
               var58.x + (var58.w - var28) * 0.5F,
               var58.y,
               var58.h,
               10.0F,
               var27,
               NUunUunuNV.UuUVuuUu(var62 ? -1 : nunvNNUnvU.C00OOC00oO(var5), Math.round(255.0F * var7))
            );
         } finally {
            this.UuUVuuUu(var1, var25);
         }
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, nUVuuNUVnV var2, float var3, float var4, int var5) {
      if (this.UuUVuuUu(var1) && this.UuUVuuUu != null) {
         nUvnuVnNUU var6 = this.UuUVuuUu;
         Cco0c0CoOcC.nvnNNunvv var7 = this.uVUuuVnNVU();
         if (!var7.contains(var3, var4)) {
            return false;
         } else if (var5 != 0) {
            return true;
         } else {
            this.UvnvNVnnnnNU = false;
            if (this.uNnUnnuNUnNu && !this.nvUVNnuu(var6, var7).contains(var3, var4)) {
               this.nuUnNvnuUu();
            }

            if (this.nNvNUVU && !this.UuuNnUvUuv(var6, var7).contains(var3, var4)) {
               this.vVvUvVVuuNvV();
            }

            if (this.UuUVuuUu(var6, var7).contains(var3, var4)) {
               Cco0c0CoOcC.nvnNNunvv var18 = this.UuUVuuUu(var6, var7);
               if (!this.vNVuvnUUnuUn.isEmpty() && var3 >= var18.x + var18.w - var6.UuUVuuUu(28.0F)) {
                  this.nvUVNnuu();
               }

               this.UvnvNVnnnnNU = true;
               this.uVUVnuvnuVuv = false;
               return true;
            } else if (this.uUnuvNvvNU(var6, var7).contains(var3, var4)) {
               this.C00OOC00oO("import");
               this.VVuuUN();
               return true;
            } else if (this.C00OOC00oO(var6, var7).contains(var3, var4)) {
               this.C00OOC00oO("reload");
               vnvnVnV.UuUVuuUu().vVvUvVVuuNvV();
               this.UuUVuuUu("Обновлено");
               return true;
            } else {
               UvnnvunNNuVV[] var8 = UvnnvunNNuVV.values();
               float var9 = var7.y + var6.UuUVuuUu(44.0F);
               float var10 = var6.UuUVuuUu(26.0F);
               float var11 = var9 + (var6.UuUVuuUu(34.0F) - var10) * 0.5F;
               float var12 = var7.x + var6.UuUVuuUu(18.0F);

               for (UvnnvunNNuVV var16 : var8) {
                  float var17 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var16.C00OOC00oO(), 11.0F) + var6.UuUVuuUu(20.0F);
                  if (var3 >= var12 && var3 <= var12 + var17 && var4 >= var11 && var4 <= var11 + var10) {
                     this.C00OOC00oO(var16.name());
                     if (this.nuUnNvnuUu != var16) {
                        this.NuunnvnN = var16.ordinal() > this.nuUnNvnuUu.ordinal() ? 1 : -1;
                        this.unNNVVNnvvV = 0.0F;
                        this.nuUnNvnuUu = var16;
                        this.VVuuUN = this.vNUvnnVnUvu = 0.0F;
                     }

                     return true;
                  }

                  var12 += var17 + var6.UuUVuuUu(6.0F);
               }

               if (this.nuUnNvnuUu(var6, var7).contains(var3, var4)) {
                  this.UuUVuuUu(var6, var7, var3, var4);
                  return true;
               } else if (this.VVuuUN(var6, var7).contains(var3, var4)) {
                  this.UuuNnUvUuv = true;
                  this.nUUVuvU = var3;
                  this.UnUNVVVNuv = var4;
                  return true;
               } else {
                  this.C00OOC00oO(var6, var7, var3, var4);
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   private void UuUVuuUu(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2, float var3, float var4) {
      Cco0c0CoOcC.nvnNNunvv var5 = this.nuUnNvnuUu(var1, var2);
      List var6 = this.vNUvnnVnUvu();
      int var7 = this.nUUVuvU(var1, var5);
      float var8 = var1.UuUVuuUu(10.0F);
      float var9 = (var5.w - var1.UuUVuuUu(12.0F) - (var7 - 1) * var8) / var7;
      float var11 = var9 + var1.UuUVuuUu(20.0F);
      float var12 = var1.UuUVuuUu(10.0F);
      float var13 = var5.x + var1.UuUVuuUu(6.0F);
      float var14 = var5.y + var1.UuUVuuUu(6.0F) - this.VVuuUN;
      int var15 = (int)Math.floor((var3 - var13) / (var9 + var8));
      int var16 = (int)Math.floor((var4 - var14) / (var11 + var12));
      if (var15 >= 0 && var15 < var7 && var16 >= 0) {
         int var17 = var16 * var7 + var15;
         if (var17 < var6.size()) {
            float var18 = var13 + var15 * (var9 + var8);
            float var19 = var14 + var16 * (var11 + var12);
            if (!(var3 > var18 + var9) && !(var4 > var19 + var11)) {
               VuNVnnuuUun var20 = (VuNVnnuuUun)var6.get(var17);
               VuNVnnuuUun var21 = vnvnVnV.UuUVuuUu().nuUnNvnuUu();
               this.C00OOC00oO(var20.UuUVuuUu());
               Cco0c0CoOcC.nvnNNunvv var22 = this.UuUVuuUu(var1, var18, var19, var9, var9);
               if (!var22.contains(var3, var4)) {
                  this.UuUVuuUu(var20);
               } else {
                  if (var21 != null && var21.UuUVuuUu().equals(var20.UuUVuuUu())) {
                     vnvnVnV.UuUVuuUu().UuUVuuUu(!vnvnVnV.UuUVuuUu().VVuuUN());
                  } else {
                     this.UuUVuuUu(var20);
                  }
               }
            }
         }
      }
   }

   private void UuUVuuUu(VuNVnnuuUun var1) {
      vnvnVnV.UuUVuuUu().UuUVuuUu(var1);
      nvNNvnVvNVU.UuUVuuUu().UuUVuuUu(var1.UuUVuuUu());
      this.uVUuuVnNVU = 200.0F;
      this.vuuuNvNuv = -8.0F;
      this.nvUVNnuu = 1.0F;
      this.uNNnnnuuuN();
      this.uUnuvNvvNU();
      this.uUVuVvuNUvnu = false;
   }

   private void C00OOC00oO(VuNVnnuuUun var1) {
      this.nNvNUVU = true;
      this.UnUNuUU = var1.uVUuuVnNVU() == null ? "" : var1.uVUuuVnNVU();
      this.uNnUnnuNUnNu = false;
      this.uUVuVvuNUvnu = false;
   }

   private void uUnuvNvvNU() {
      this.nNvNUVU = false;
      this.UnUNuUU = "";
   }

   private void vVvUvVVuuNvV() {
      if (this.nNvNUVU) {
         VuNVnnuuUun var1 = vnvnVnV.UuUVuuUu().nuUnNvnuUu();
         if (var1 != null) {
            vnvnVnV.UuUVuuUu().C00OOC00oO(var1, this.UnUNuUU);
            this.UuUVuuUu("Префикс сохранён");
         }

         this.nNvNUVU = false;
         this.UnUNuUU = "";
      }
   }

   private void uUnuvNvvNU(VuNVnnuuUun var1) {
      this.uNnUnnuNUnNu = true;
      this.NnUuNNU = var1.vVvUvVVuuNvV() == null ? "" : var1.vVvUvVVuuNvV();
      this.uUVuVvuNUvnu = false;
   }

   private void uNNnnnuuuN() {
      this.uNnUnnuNUnNu = false;
      this.NnUuNNU = "";
   }

   private void nuUnNvnuUu() {
      if (this.uNnUnnuNUnNu) {
         VuNVnnuuUun var1 = vnvnVnV.UuUVuuUu().nuUnNvnuUu();
         if (var1 != null) {
            vnvnVnV.UuUVuuUu().UuUVuuUu(var1, this.NnUuNNU);
            this.UuUVuuUu("Переименовано");
         }

         this.uNnUnnuNUnNu = false;
         this.NnUuNNU = "";
      }
   }

   private void C00OOC00oO(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2, float var3, float var4) {
      VuNVnnuuUun var5 = vnvnVnV.UuUVuuUu().nuUnNvnuUu();
      if (var5 != null) {
         if (this.nvUVNnuu(var1, var2).contains(var3, var4)) {
            this.uUnuvNvvNU(var5);
         } else if (this.UuuNnUvUuv(var1, var2).contains(var3, var4)) {
            this.C00OOC00oO(var5);
         } else {
            Cco0c0CoOcC.nvnNNunvv var6 = this.vNUvnnVnUvu(var1, var2);
            UvnnvunNNuVV[] var7 = UvnnvunNNuVV.values();
            float var8 = var1.UuUVuuUu(20.0F);
            float var9 = var6.y + var1.UuUVuuUu(34.0F);
            float var10 = var6.x;

            for (UvnnvunNNuVV var14 : var7) {
               float var15 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var14.C00OOC00oO(), 9.0F) + var1.UuUVuuUu(12.0F);
               if (var3 >= var10 && var3 <= var10 + var15 && var4 >= var9 && var4 <= var9 + var8) {
                  this.C00OOC00oO(nuunNvv[var14.ordinal()]);
                  vnvnVnV.UuUVuuUu().UuUVuuUu(var5, var14);
                  this.UuUVuuUu("Категория: " + var14.C00OOC00oO());
                  return;
               }

               var10 += var15 + var1.UuUVuuUu(4.0F);
            }

            Cco0c0CoOcC.nvnNNunvv var16 = this.uVUuuVnNVU(var1, var2);
            if (var16.contains(var3, var4)) {
               this.C00OOC00oO("equip");
               vnvnVnV.UuUVuuUu().UuUVuuUu(!vnvnVnV.UuUVuuUu().VVuuUN());
            } else {
               Cco0c0CoOcC.nvnNNunvv var17 = this.vuuuNvNuv(var1, var2);
               if (var17.contains(var3, var4)) {
                  this.C00OOC00oO("delete");
                  if (this.uUVuVvuNUvnu && System.currentTimeMillis() - this.UvUvUNuvNU < 2600L) {
                     vnvnVnV.UuUVuuUu().C00OOC00oO(var5);
                     nvNNvnVvNVU.UuUVuuUu().UuUVuuUu("");
                     this.uUVuVvuNUvnu = false;
                     this.UuUVuuUu("Удалено");
                  } else {
                     this.uUVuVvuNUvnu = true;
                     this.UvUvUNuvNU = System.currentTimeMillis();
                  }
               }
            }
         }
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, float var2, float var3) {
      this.UuuNnUvUuv = false;
      return this.UuUVuuUu(var1);
   }

   public boolean C00OOC00oO(vNvvVnNuUVvv var1, float var2, float var3) {
      if (!this.UuuNnUvUuv) {
         return false;
      } else {
         this.uVUuuVnNVU = this.uVUuuVnNVU + (var2 - this.nUUVuvU) * 0.55F;
         this.vuuuNvNuv = UuUVuuUu(this.vuuuNvNuv + (var3 - this.UnUNVVVNuv) * 0.55F, -89.0F, 89.0F);
         this.nUUVuvU = var2;
         this.UnUNVVVNuv = var3;
         return true;
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, float var2, float var3, double var4) {
      if (this.UuUVuuUu(var1) && this.UuUVuuUu != null) {
         nUvnuVnNUU var6 = this.UuUVuuUu;
         Cco0c0CoOcC.nvnNNunvv var7 = this.uVUuuVnNVU();
         if (this.VVuuUN(var6, var7).contains(var2, var3)) {
            this.nvUVNnuu = UuUVuuUu(this.nvUVNnuu * (float)(1.0 + var4 * 0.12), 0.35F, 4.0F);
            return true;
         } else if (this.nuUnNvnuUu(var6, var7).contains(var2, var3)) {
            this.vNUvnnVnUvu = this.vNUvnnVnUvu - (float)var4 * var6.UuUVuuUu(52.0F);
            return true;
         } else {
            return var7.contains(var2, var3);
         }
      } else {
         return false;
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, int var2) {
      if (!this.UuUVuuUu(var1)) {
         return false;
      } else if (this.uNnUnnuNUnNu) {
         if (var2 == 256) {
            this.uNNnnnuuuN();
            return true;
         } else if (var2 == 257) {
            this.nuUnNvnuUu();
            return true;
         } else if (var2 == 259) {
            if (!this.NnUuNNU.isEmpty()) {
               this.NnUuNNU = this.NnUuNNU.substring(0, this.NnUuNNU.length() - 1);
            }

            return true;
         } else {
            return true;
         }
      } else if (this.nNvNUVU) {
         if (var2 == 256) {
            this.uUnuvNvvNU();
            return true;
         } else if (var2 == 257) {
            this.vVvUvVVuuNvV();
            return true;
         } else if (var2 == 259) {
            if (!this.UnUNuUU.isEmpty()) {
               this.UnUNuUU = this.UnUNuUU.substring(0, this.UnUNuUU.length() - 1);
            }

            return true;
         } else {
            return true;
         }
      } else if (!this.UvnvNVnnnnNU) {
         return false;
      } else if (var2 != 256 && var2 != 257) {
         if (class_437.method_25441()) {
            if (var2 == 65) {
               this.uVUVnuvnuVuv = !this.vNVuvnUUnuUn.isEmpty();
               return true;
            }

            if (var2 == 86) {
               if (this.uVUVnuvnuVuv) {
                  this.nvUVNnuu();
                  this.uVUVnuvnuVuv = false;
               }

               String var3 = class_310.method_1551().field_1774.method_1460();
               if (var3 != null) {
                  for (int var4 = 0; var4 < var3.length(); var4++) {
                     this.UuUVuuUu(var3.charAt(var4));
                  }
               }

               return true;
            }

            if (var2 == 67 && !this.vNVuvnUUnuUn.isEmpty()) {
               class_310.method_1551().field_1774.method_1455(this.vNVuvnUUnuUn);
               this.UuUVuuUu("Скопировано");
               return true;
            }

            if (var2 == 88) {
               if (!this.vNVuvnUUnuUn.isEmpty()) {
                  class_310.method_1551().field_1774.method_1455(this.vNVuvnUUnuUn);
                  this.UuUVuuUu("Вырезано");
               }

               this.nvUVNnuu();
               this.uVUVnuvnuVuv = false;
               return true;
            }

            if (var2 == 259) {
               this.nvUVNnuu();
               this.uVUVnuvnuVuv = false;
               return true;
            }
         }

         if (var2 == 259) {
            if (this.uVUVnuvnuVuv) {
               this.nvUVNnuu();
               this.uVUVnuvnuVuv = false;
            } else {
               this.vuuuNvNuv();
            }

            return true;
         } else if (var2 != 263 && var2 != 262) {
            return true;
         } else {
            this.uVUVnuvnuVuv = false;
            return true;
         }
      } else {
         this.UvnvNVnnnnNU = false;
         this.uVUVnuvnuVuv = false;
         return true;
      }
   }

   public boolean UuUVuuUu(vNvvVnNuUVvv var1, char var2) {
      if (!this.UuUVuuUu(var1)) {
         return false;
      } else if (this.uNnUnnuNUnNu) {
         if (var2 >= ' ' && var2 != 127 && this.NnUuNNU.length() < 40) {
            this.NnUuNNU = this.NnUuNNU + var2;
         }

         return true;
      } else if (this.nNvNUVU) {
         if (var2 >= ' ' && var2 != 127 && this.UnUNuUU.length() < 24) {
            this.UnUNuUU = this.UnUNuUU + var2;
         }

         return true;
      } else if (!this.UvnvNVnnnnNU) {
         return false;
      } else {
         if (this.uVUVnuvnuVuv) {
            this.nvUVNnuu();
            this.uVUVnuvnuVuv = false;
         }

         this.UuUVuuUu(var2);
         return true;
      }
   }

   private void VVuuUN() {
      File var1 = uuNnVVUUUN.UuUVuuUu();
      if (var1 != null) {
         this.UuUVuuUu(vnvnVnV.UuUVuuUu().UuUVuuUu(var1, this.nuUnNvnuUu));
      } else {
         uuNnVVUUUN.C00OOC00oO();
         this.UuUVuuUu("Бросьте .zip в папку и нажмите обновить");
      }
   }

   private List<VuNVnnuuUun> vNUvnnVnUvu() {
      List var1 = vnvnVnV.UuUVuuUu().UuUVuuUu(this.nuUnNvnuUu);
      if (this.vNVuvnUUnuUn.isEmpty()) {
         return var1;
      } else {
         String var2 = this.vNVuvnUUnuUn.toLowerCase();
         ArrayList var3 = new ArrayList();

         for (VuNVnnuuUun var5 : var1) {
            String var6 = var5.vVvUvVVuuNvV() == null ? "" : var5.vVvUvVVuuNvV().toLowerCase();
            String var7 = var5.uVUuuVnNVU() == null ? "" : var5.uVUuuVnNVU().toLowerCase();
            String var8 = var5.nuUnNvnuUu() == null ? "" : var5.nuUnNvnuUu().toLowerCase();
            if (var6.contains(var2) || var7.contains(var2) || var8.contains(var2)) {
               var3.add(var5);
            }
         }

         return var3;
      }
   }

   private void UuUVuuUu(String var1) {
      this.uUVVvVVNvvn = var1 == null ? "" : var1;
      this.vvUVNVvvNUv = System.currentTimeMillis();
   }

   private String vVvUvVVuuNvV(VuNVnnuuUun var1) {
      if (!this.uUVVvVVNvvn.isEmpty() && System.currentTimeMillis() - this.vvUVNVvvNUv < 4200L) {
         return this.uUVVvVVNvvn;
      } else if (var1 == null) {
         return "Тяните — вращать · колесо — зум";
      } else {
         return var1.nuUnNvnuUu() != null && !var1.nuUnNvnuUu().isEmpty() ? "Автор: " + var1.nuUnNvnuUu() : "";
      }
   }

   private Cco0c0CoOcC.nvnNNunvv uVUuuVnNVU() {
      return new Cco0c0CoOcC.nvnNNunvv(this.C00OOC00oO, this.uUnuvNvvNU, this.vVvUvVVuuNvV, this.uNNnnnuuuN);
   }

   private void C00OOC00oO(String var1) {
      this.nNnVnUNVV.put(var1, System.currentTimeMillis());
   }

   private float uUnuvNvvNU(String var1) {
      Long var2 = this.nNnVnUNVV.get(var1);
      if (var2 == null) {
         return 1.0F;
      } else {
         float var3 = (float)(System.currentTimeMillis() - var2) / 320.0F;
         if (var3 >= 1.0F) {
            return 1.0F;
         } else {
            float var4 = (float)Math.exp(-var3 * 4.0);
            float var5 = (float)Math.cos(var3 * Math.PI * 2.2);
            return 1.0F - 0.14F * var4 * var5;
         }
      }
   }

   private boolean UuUVuuUu(UnVNvNnU var1, String var2, float var3, float var4) {
      float var5 = this.uUnuvNvvNU(var2);
      if (var5 > 0.999F && var5 < 1.001F) {
         return false;
      } else {
         var1.UuUVuuUu(var5, var3, var4);
         return true;
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, boolean var2) {
      if (var2) {
         var1.uVUuuVnNVU();
      }
   }

   private void UuUVuuUu(char var1) {
      if (var1 >= ' ' && var1 != 127 && this.vNVuvnUUnuUn.length() < 48) {
         this.vNVuvnUUnuUn = this.vNVuvnUUnuUn + var1;
         this.NVNnnvnuunNv.add(System.currentTimeMillis());
         this.vNUvnnVnUvu = 0.0F;
      }
   }

   private void vuuuNvNuv() {
      if (!this.vNVuvnUUnuUn.isEmpty()) {
         int var1 = this.vNVuvnUUnuUn.length() - 1;
         this.UuUVuuUu(var1);
         this.vNVuvnUUnuUn = this.vNVuvnUUnuUn.substring(0, var1);
         if (var1 < this.NVNnnvnuunNv.size()) {
            this.NVNnnvnuunNv.remove(var1);
         }

         this.vNUvnnVnUvu = 0.0F;
      }
   }

   private void nvUVNnuu() {
      for (int var1 = 0; var1 < this.vNVuvnUUnuUn.length(); var1++) {
         this.UuUVuuUu(var1);
      }

      this.vNVuvnUUnuUn = "";
      this.NVNnnvnuunNv.clear();
      this.vNUvnnVnUvu = 0.0F;
   }

   private void UuUVuuUu(int var1) {
      if (this.UuUVuuUu != null && var1 >= 0 && var1 < this.vNVuvnUUnuUn.length()) {
         Cco0c0CoOcC.nvnNNunvv var2 = this.UuUVuuUu(this.UuUVuuUu, this.uVUuuVnNVU());
         float var3 = var2.x + this.UuUVuuUu.UuUVuuUu(26.0F) + nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, this.vNVuvnUUnuUn.substring(0, var1), 10.0F);
         this.uVunuUNVVUUV.add(new Cco0c0CoOcC.NVnVnNnN(String.valueOf(this.vNVuvnUUnuUn.charAt(var1)), var3, System.currentTimeMillis()));
      }
   }

   private Cco0c0CoOcC.nvnNNunvv UuUVuuUu(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      float var3 = var1.UuUVuuUu(220.0F);
      float var4 = var1.UuUVuuUu(28.0F);
      float var5 = var2.x + var2.w - var1.UuUVuuUu(18.0F) - var3;
      return new Cco0c0CoOcC.nvnNNunvv(var5, var2.y + (var1.UuUVuuUu(44.0F) - var4) * 0.5F, var3, var4);
   }

   private Cco0c0CoOcC.nvnNNunvv C00OOC00oO(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      float var3 = var1.UuUVuuUu(28.0F);
      float var4 = var2.y + var1.UuUVuuUu(44.0F) + (var1.UuUVuuUu(34.0F) - var3) * 0.5F;
      return new Cco0c0CoOcC.nvnNNunvv(var2.x + var2.w - var1.UuUVuuUu(18.0F) - var3, var4, var3, var3);
   }

   private Cco0c0CoOcC.nvnNNunvv uUnuvNvvNU(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      float var3 = var1.UuUVuuUu(28.0F);
      float var4 = var1.UuUVuuUu(86.0F);
      Cco0c0CoOcC.nvnNNunvv var5 = this.C00OOC00oO(var1, var2);
      return new Cco0c0CoOcC.nvnNNunvv(var5.x - var1.UuUVuuUu(8.0F) - var4, var5.y, var4, var3);
   }

   private Cco0c0CoOcC.nvnNNunvv vVvUvVVuuNvV(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      float var3 = var1.UuUVuuUu(18.0F);
      float var4 = var2.y + var1.UuUVuuUu(44.0F) + var1.UuUVuuUu(34.0F) + var1.UuUVuuUu(6.0F);
      return new Cco0c0CoOcC.nvnNNunvv(var2.x + var3, var4, var2.w - var3 * 2.0F, var2.y + var2.h - var3 - var4);
   }

   private Cco0c0CoOcC.nvnNNunvv uNNnnnuuuN(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      Cco0c0CoOcC.nvnNNunvv var3 = this.vVvUvVVuuNvV(var1, var2);
      float var4 = UuUVuuUu(var3.w * 0.33F, var1.UuUVuuUu(280.0F), var1.UuUVuuUu(420.0F));
      return new Cco0c0CoOcC.nvnNNunvv(var3.x + var3.w - var4, var3.y, var4, var3.h);
   }

   private Cco0c0CoOcC.nvnNNunvv nuUnNvnuUu(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      Cco0c0CoOcC.nvnNNunvv var3 = this.vVvUvVVuuNvV(var1, var2);
      Cco0c0CoOcC.nvnNNunvv var4 = this.uNNnnnuuuN(var1, var2);
      float var5 = var4.x - var1.UuUVuuUu(12.0F) - var3.x;
      return new Cco0c0CoOcC.nvnNNunvv(var3.x, var3.y, var5, var3.h);
   }

   private Cco0c0CoOcC.nvnNNunvv VVuuUN(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      Cco0c0CoOcC.nvnNNunvv var3 = this.uNNnnnuuuN(var1, var2);
      Cco0c0CoOcC.nvnNNunvv var4 = this.vNUvnnVnUvu(var1, var2);
      float var5 = var3.y + var1.UuUVuuUu(34.0F);
      return new Cco0c0CoOcC.nvnNNunvv(
         var3.x + var1.UuUVuuUu(10.0F), var5, var3.w - var1.UuUVuuUu(20.0F), Math.max(var1.UuUVuuUu(40.0F), var4.y - var5 - var1.UuUVuuUu(8.0F))
      );
   }

   private Cco0c0CoOcC.nvnNNunvv vNUvnnVnUvu(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      Cco0c0CoOcC.nvnNNunvv var3 = this.uNNnnnuuuN(var1, var2);
      float var4 = var1.UuUVuuUu(120.0F);
      return new Cco0c0CoOcC.nvnNNunvv(var3.x + var1.UuUVuuUu(14.0F), var3.y + var3.h - var1.UuUVuuUu(12.0F) - var4, var3.w - var1.UuUVuuUu(28.0F), var4);
   }

   private Cco0c0CoOcC.nvnNNunvv uVUuuVnNVU(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      Cco0c0CoOcC.nvnNNunvv var3 = this.vNUvnnVnUvu(var1, var2);
      float var4 = var1.UuUVuuUu(28.0F);
      float var5 = var3.w * 0.6F;
      return new Cco0c0CoOcC.nvnNNunvv(var3.x, var3.y + var3.h - var4, var5, var4);
   }

   private Cco0c0CoOcC.nvnNNunvv vuuuNvNuv(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      Cco0c0CoOcC.nvnNNunvv var3 = this.vNUvnnVnUvu(var1, var2);
      Cco0c0CoOcC.nvnNNunvv var4 = this.uVUuuVnNVU(var1, var2);
      float var5 = var3.w - var4.w - var1.UuUVuuUu(8.0F);
      return new Cco0c0CoOcC.nvnNNunvv(var4.x + var4.w + var1.UuUVuuUu(8.0F), var4.y, var5, var4.h);
   }

   private Cco0c0CoOcC.nvnNNunvv nvUVNnuu(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      Cco0c0CoOcC.nvnNNunvv var3 = this.vNUvnnVnUvu(var1, var2);
      return new Cco0c0CoOcC.nvnNNunvv(var3.x, var3.y - var1.UuUVuuUu(2.0F), var3.w, var1.UuUVuuUu(16.0F));
   }

   private Cco0c0CoOcC.nvnNNunvv UuuNnUvUuv(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      Cco0c0CoOcC.nvnNNunvv var3 = this.vNUvnnVnUvu(var1, var2);
      return new Cco0c0CoOcC.nvnNNunvv(var3.x, var3.y + var1.UuUVuuUu(58.0F), var3.w, var1.UuUVuuUu(16.0F));
   }

   private Cco0c0CoOcC.nvnNNunvv UuUVuuUu(nUvnuVnNUU var1, float var2, float var3, float var4, float var5) {
      float var6 = var1.UuUVuuUu(28.0F);
      float var7 = var1.UuUVuuUu(15.0F);
      return new Cco0c0CoOcC.nvnNNunvv(var2 + var4 - var6 - var1.UuUVuuUu(8.0F), var3 + var5 + (var1.UuUVuuUu(20.0F) - var7) * 0.5F, var6, var7);
   }

   private int nUUVuvU(nUvnuVnNUU var1, Cco0c0CoOcC.nvnNNunvv var2) {
      return Math.max(3, Math.min(5, Math.round((var2.w - var1.UuUVuuUu(12.0F)) / var1.UuUVuuUu(132.0F))));
   }

   private static String UuUVuuUu(String var0, int var1) {
      if (var0 == null) {
         return "";
      } else {
         return var0.length() <= var1 ? var0 : var0.substring(0, var1 - 1) + "…";
      }
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 < var1 ? var1 : Math.min(var0, var2);
   }

   record NVnVnNnN(String ch, float x, long born) {
   }

   record nvnNNunvv(float x, float y, float w, float h) {

      boolean contains(float var1, float var2) {
         return var1 >= this.x && var2 >= this.y && var1 < this.x + this.w && var2 < this.y + this.h;
      }
   }
}
