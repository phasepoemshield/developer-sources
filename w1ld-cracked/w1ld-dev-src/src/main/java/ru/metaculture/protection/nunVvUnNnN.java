package ru.metaculture.protection;

import java.util.Comparator;
import java.util.EnumMap;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import lombok.Generated;
import net.minecraft.class_332;
import org.wild.module.api.Module;

public final class nunVvUnNnN {
   static final float UuUVuuUu = 120.0F;
   static final float C00OOC00oO = 14.0F;
   static final uNNnVuNunvU uUnuvNvvNU = uNNnVuNunvU.UuUVuuUu((float)(Math.sqrt(120.0) / (Math.PI * 2)), 14.0F / (2.0F * (float)Math.sqrt(120.0)));
   static final Cc0cOoOcC0o vVvUvVVuuNvV = Cc0cOoOcC0o.vNUvnnVnUvu();
   static final float uNNnnnuuuN = (float) (Math.PI * 2.0 / 3.0);
   static final float nuUnNvnuUu = (float) (Math.PI * 2.0 / 9.0);
   static final float VVuuUN = 1.35F;
   static final float vNUvnnVnUvu = 15.12F;
   static final float uVUuuVnNVU = 26.0F;
   private final UNVVvNuuNNN vuuuNvNuv;
   private final Map<Module, uNuuunuNvuN> nvUVNnuu = new IdentityHashMap<>();
   private final Map<Module, List<uVUNNUnNvU>> UuuNnUvUuv = new IdentityHashMap<>();
   private final Map<Module, EnumMap<uVUNNUnNvU, String>> nUUVuvU = new IdentityHashMap<>();
   private final Map<uVUNNUnNvU, String> UnUNVVVNuv = new EnumMap<>(uVUNNUnNvU.class);

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, VvvVunn var4, nUVuuNUVnV var5, float var6) {
      Module var7 = var4.UuUVuuUu();
      nUvnuVnNUU var8 = var5.uNNnnnuuuN();
      unuVuVnUNVv var9 = unuVuVnUNVv.resolve(var3, var4, var8);
      if (var9.visible()) {
         NUunUunuNV var10 = var5.nuUnNvnuUu();
         float var11 = var4.C00OOC00oO();
         float var12 = var4.uUnuvNvvNU();
         float var13 = var4.vVvUvVVuuNvV();
         String var14 = vnvnUnVnuunn.C00OOC00oO(var7);
         float var15 = var3.UuUVuuUu(var14);
         float var16 = var3.UuUVuuUu(vnvnUnVnuunn.uUnuvNvvNU(var7));
         float var17 = var3.UuUVuuUu(vnvnUnVnuunn.vNUvnnVnUvu(var7));
         float var18 = var9.searchVisibility();
         float var19 = var18 * Math.min(1.0F, var9.cardEntry());
         float var20 = var9.pivotX();
         float var21 = var9.pivotY();
         var1.uNNnnnuuuN(var19);

         try {
            var1.UuUVuuUu(0.0F, var9.slideY());

            try {
               var1.UuUVuuUu(var9.scale(), var20, var21);

               try {
                  float var22 = var9.lift();
                  float var23 = var12 - var22;
                  float var24 = var4.uNNnnnuuuN();
                  float var25 = var8.UuUVuuUu(8.0F);
                  boolean var26 = var3.NvUVUvVVnUu();
                  float var27 = var26 ? 1.0F : this.uUnuvNvvNU(Math.min(var18, var17));
                  float var28 = this.UuUVuuUu();
                  float var29 = this.UuUVuuUu(0.02F, 0.9F, var6);
                  boolean var30 = Menu.UuUVuuUu(Menu.vuvnUnVnUNnV);
                  if (!var26 && var30) {
                     this.UuUVuuUu(var1, var8, var10, var11, var23, var13, var24, var25, var27);
                  }

                  if (var10.uNnUnnuNUnNu()) {
                     int var31 = NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(6.0F + 4.0F * var15 + 2.0F * var29));
                     var1.UuUVuuUu(
                        var11, var23 + var8.UuUVuuUu(2.0F), var13, var24, var25, var8.UuUVuuUu(5.0F + 2.0F * var29 + var15), var8.UuUVuuUu(0.9F), var31
                     );
                  }

                  if (var16 > 0.3F) {
                     int var105 = var10.uNnUnnuNUnNu()
                        ? NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(8.0F * var16))
                        : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(14.0F * var16));
                     var1.UuUVuuUu(
                        var11,
                        var23,
                        var13,
                        var24,
                        var25,
                        var8.UuUVuuUu(var10.uNnUnnuNUnNu() ? 6.0F : 4.0F) * var16,
                        var8.UuUVuuUu(var10.uNnUnnuNUnNu() ? 1.0F : 0.75F),
                        var105
                     );
                  }

                  if (var15 > 0.01F) {
                     var1.UuUVuuUu(
                        var11,
                        var23,
                        var13,
                        var24,
                        var25,
                        var8.UuUVuuUu(var10.uNnUnnuNUnNu() ? 6.0F : 4.0F) * var15,
                        var8.UuUVuuUu(var10.uNnUnnuNUnNu() ? 1.0F : 0.75F),
                        var10.uNnUnnuNUnNu()
                           ? NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(10.0F * var15))
                           : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(22.0F * var15))
                     );
                  }

                  float var106 = var9.scale();
                  float var32 = var20 + (var3.unnUnUNVnN() - var20) / var106;
                  float var33 = var21 + (var3.NnuUnUNnu() - var9.slideY() - var21) / var106;
                  float var34 = var15 > 0.001F ? this.uUnuvNvvNU((var32 - var11) / Math.max(1.0F, var13), 0.07F, 0.93F) : 0.5F;
                  float var35 = var15 > 0.001F ? this.uUnuvNvvNU((var33 - var23) / Math.max(1.0F, var24), 0.1F, 0.84F) : 0.5F;
                  float var36 = vvUUNnVVuUu.UuUVuuUu(var27);
                  var1.uNNnnnuuuN(var36);
                  boolean var97 = false /* VF: Semaphore variable */;

                  try {
                     var97 = true;
                     this.UuUVuuUu(var1, var7, var11, var23, var13, var24, var25, var34, var35, var15, var5);
                     var97 = false;
                  } finally {
                     if (var97) {
                        var1.vuuuNvNuv();
                     }
                  }

                  var1.vuuuNvNuv();
                  boolean var37 = !var26 && var30 && var27 < 0.995F;
                  UnVNvNnU.uunvUUVnuNn var38 = var37 ? var1.C00OOC00oO(var11, var23, var13, var24) : null;
                  boolean var39 = false;
                  if (var38 != null) {
                     try {
                        this.UuUVuuUu(var1, var2, var3, var4, var7, var11, var23, var13, var24, var16, var15, var32, var33, var5);
                     } finally {
                        var1.UuUVuuUu(var38);
                     }

                     float var40 = vvUUNnVVuUu.C00OOC00oO(var27);
                     float var41 = Math.max(vvUUNnVVuUu.uUnuvNvvNU(var27), vvUUNnVVuUu.vVvUvVVuuNvV(var27));
                     int var42 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var10.UNnVVNvvnVvU(), var10.uVunuUNVVUUV(), 0.5F), Math.round(255.0F * var41));
                     var1.uNNnnnuuuN(var40);

                     try {
                        var39 = var1.UuUVuuUu(
                           var38, var11, var23, var13, var24, var25, NUunUunuNV.UuUVuuUu(var10.uVunuUNVVUUV(), 255), var10.UNnVVNvvnVvU(), var42, var27, var28
                        );
                     } finally {
                        var1.vuuuNvNuv();
                     }
                  }

                  if (!var39) {
                     float var107 = var37 ? vvUUNnVVuUu.C00OOC00oO(var27) : 1.0F;
                     var1.uNNnnnuuuN(var107);

                     try {
                        this.UuUVuuUu(var1, var2, var3, var4, var7, var11, var23, var13, var24, var16, var15, var32, var33, var5);
                     } finally {
                        var1.vuuuNvNuv();
                     }
                  }

                  if (var37) {
                     this.C00OOC00oO(var1, var8, var10, var11, var23, var13, var24, var25, var27);
                  }

                  float var108 = (1.0F - var16) * (1.0F - var15 * 0.55F);
                  if (var108 > 0.01F) {
                     int var109 = NUunUunuNV.UuUVuuUu(var10.NVNnnvnuunNv(), Math.round(34.0F * var108));
                     var1.UuUVuuUu(var11, var23, var13, var24, var25, var109, 0.5F);
                  }
               } finally {
                  var1.uVUuuVnNVU();
               }
            } finally {
               var1.vNUvnnVnUvu();
            }
         } finally {
            var1.vuuuNvNuv();
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = vvUUNnVVuUu.vVvUvVVuuNvV(var9);
      if (!(var10 <= 1.0E-4F)) {
         float var11 = var10 / 0.085F;
         int var12 = NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), var3.uVunuUNVVUUV(), 0.42F);
         int var13 = NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), var3.NVNnnvnuunNv(), 0.2F);
         if (var3.uNnUnnuNUnNu()) {
            var1.UuUVuuUu(
               var4,
               var5 + var2.UuUVuuUu(2.0F),
               var6,
               var7,
               var8,
               var2.UuUVuuUu(20.0F) * var11,
               var2.UuUVuuUu(3.2F),
               NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(178.0F * var10))
            );
            var1.UuUVuuUu(
               var4,
               var5 + var2.UuUVuuUu(5.0F),
               var6,
               var7,
               var8,
               var2.UuUVuuUu(34.0F) * var11,
               var2.UuUVuuUu(4.2F),
               NUunUunuNV.UuUVuuUu(77, 91, 104, Math.round(64.0F * var10))
            );
         } else {
            var1.vVvUvVVuuNvV();

            try {
               var1.UuUVuuUu(
                  var4, var5, var6, var7, var8, var2.UuUVuuUu(18.0F) * var11, var2.UuUVuuUu(3.2F), NUunUunuNV.UuUVuuUu(var13, Math.round(196.0F * var10))
               );
               var1.UuUVuuUu(
                  var4, var5, var6, var7, var8, var2.UuUVuuUu(9.0F) * var11, var2.UuUVuuUu(1.4F), NUunUunuNV.UuUVuuUu(var12, Math.round(255.0F * var10))
               );
            } finally {
               var1.uNNnnnuuuN();
            }
         }
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, nUvnuVnNUU var2, NUunUunuNV var3, float var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = vvUUNnVVuUu.uUnuvNvvNU(var9);
      if (!(var10 <= 1.0E-4F)) {
         float var11 = var2.UuUVuuUu(1.25F);
         int var12 = NUunUunuNV.UuUVuuUu(var3.UNnVVNvvnVvU(), var3.uVunuUNVVUUV(), 0.56F);
         if (!var3.uNnUnnuNUnNu()) {
            var1.vVvUvVVuuNvV();
         }

         try {
            var1.UuUVuuUu(
               var4 + var11,
               var5 + var11,
               var6 - var11 * 2.0F,
               var7 - var11 * 2.0F,
               Math.max(0.0F, var8 - var11),
               NUunUunuNV.UuUVuuUu(var12, Math.round(255.0F * var10)),
               0.5F
            );
         } finally {
            if (!var3.uNnUnnuNUnNu()) {
               var1.uNNnnnuuuN();
            }
         }
      }
   }

   private float UuUVuuUu(float var1, float var2, float var3) {
      float var4 = this.vVvUvVVuuNvV((var3 - var1) / Math.max(1.0E-5F, var2 - var1));
      return var4 * var4 * (3.0F - 2.0F * var4);
   }

   private float UuUVuuUu(float var1) {
      float var2 = this.vVvUvVVuuNvV(var1);
      return var2 * var2 * var2 * (var2 * (var2 * 6.0F - 15.0F) + 10.0F);
   }

   private float C00OOC00oO(float var1) {
      float var2 = this.UuUVuuUu(var1);
      float var3 = this.UuUVuuUu(0.08F, 0.92F, var2);
      return UuvVnuU.vuuuNvNuv(var2 * 0.72F + var3 * 0.28F, 0.0F, 1.0F);
   }

   private float uUnuvNvvNU(float var1) {
      float var2 = this.vVvUvVVuuNvV(var1);
      return (float)Math.pow(var2, 1.42F);
   }

   private void UuUVuuUu(
      UnVNvNnU var1, Module var2, float var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, nUVuuNUVnV var11
   ) {
      NUunUunuNV var12 = var11.nuUnNvnuUu();
      int var13 = var12.uNnUnnuNUnNu()
         ? NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var12, var10), 242)
         : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var12.VVuuUN(), var12.nuUnNvnuUu(), var2.nuUnNvnuUu ? 0.18F : 0.24F), 242);
      var1.UuUVuuUu(var3, var4, var5, var6, var7, var13, var13, var12.uVunuUNVVUUV(), var12.UNnVVNvvnVvU(), var8, var9, var10, 0.0F, false, 6);
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      class_332 var2,
      vNvvVnNuUVvv var3,
      VvvVunn var4,
      Module var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      nUVuuNUVnV var14
   ) {
      nUvnuVnNUU var15 = var14.uNNnnnuuuN();
      NUunUunuNV var16 = var14.nuUnNvnuUu();
      if (var10 > 0.01F) {
         int var17 = NUunUunuNV.UuUVuuUu(
            NUunUunuNV.UuUVuuUu(var16.uVunuUNVVUUV(), var16.UNnVVNvvnVvU(), var16.uNnUnnuNUnNu() ? 0.38F : 0.0F),
            Math.round((var16.uNnUnnuNUnNu() ? 26 : 20) * var10)
         );
         var1.UuUVuuUu(
            var6 + var15.UuUVuuUu(1.0F), var7, var8 - var15.UuUVuuUu(2.0F), var15.UuUVuuUu(1.0F), var15.UuUVuuUu(8.0F), var15.UuUVuuUu(8.0F), 0.0F, 0.0F, var17
         );
      }

      this.UuUVuuUu(var1, var3, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
      if (var4.nuUnNvnuUu() > 0.01F) {
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var14);
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, VvvVunn var4, Module var5, float var6, float var7, float var8, float var9, nUVuuNUVnV var10
   ) {
      nUvnuVnNUU var11 = var10.uNNnnnuuuN();
      NUunUunuNV var12 = var10.nuUnNvnuUu();
      float var13 = this.vVvUvVVuuNvV(var3.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var5)));
      float var14 = this.UuUVuuUu(var5, var8, var10);
      float var15 = var7 + var14;
      float var16 = Math.max(var11.UuUVuuUu(1.0F), var9 - var14);
      boolean var17 = Menu.UuUVuuUu(Menu.vuvnUnVnUNnV);
      boolean var18 = !var3.NvUVUvVVnUu() && var17 && var13 < 0.995F;
      if (!var18) {
         nunvNNUnvU.UuUVuuUu(var1, var6, var15, var8, var16, var11.UuUVuuUu(7.0F), () -> {
            var1.uNNnnnuuuN(var13);
            boolean var14x = false /* VF: Semaphore variable */;

            try {
               var14x = true;
               this.C00OOC00oO(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
               var14x = false;
            } finally {
               if (var14x) {
                  var1.vuuuNvNuv();
               }
            }

            var1.vuuuNvNuv();
         });
      } else {
         UnVNvNnU.uunvUUVnuNn var19 = var1.C00OOC00oO(var6, var15, var8, var16);
         boolean var20 = false;
         if (var19 != null) {
            try {
               this.C00OOC00oO(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
            } finally {
               var1.UuUVuuUu(var19);
            }

            int var21 = var12.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(var12.uVunuUNVVUUV(), var12.NVNnnvnuunNv(), 0.45F) : var12.uVunuUNVVUUV();
            int var22 = var12.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(var12.UNnVVNvvnVvU(), var12.NVNnnvnuunNv(), 0.45F) : var12.UNnVVNvvnVvU();
            int var23 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var22, var21, 0.5F), Math.round(200.0F * var13));
            boolean var24 = var3.vNnNuuvVn().contains(var5);
            float var25 = 0.988F + 0.012F * this.UuUVuuUu(0.0F, 0.6F, var13);
            var1.UuUVuuUu(var25, var6 + var8 * 0.5F, var15);
            var1.uNNnnnuuuN(this.UuUVuuUu(0.02F, 0.3F, var13));

            try {
               var20 = var1.UuUVuuUu(
                  var19,
                  var6,
                  var15,
                  var8,
                  var16,
                  var11.UuUVuuUu(7.0F),
                  NUunUunuNV.UuUVuuUu(var21, var24 ? 255 : 0),
                  NUunUunuNV.UuUVuuUu(var22, 255),
                  var23,
                  var13,
                  this.UuUVuuUu()
               );
            } finally {
               var1.vuuuNvNuv();
               var1.uVUuuVnNVU();
            }
         }

         if (!var20) {
            nunvNNUnvU.UuUVuuUu(var1, var6, var15, var8, var16, var11.UuUVuuUu(7.0F), () -> {
               var1.uNNnnnuuuN(var13);
               boolean var14x = false /* VF: Semaphore variable */;

               try {
                  var14x = true;
                  this.C00OOC00oO(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10);
                  var14x = false;
               } finally {
                  if (var14x) {
                     var1.vuuuNvNuv();
                  }
               }

               var1.vuuuNvNuv();
            });
         }
      }
   }

   private void C00OOC00oO(
      UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, VvvVunn var4, Module var5, float var6, float var7, float var8, float var9, nUVuuNUVnV var10
   ) {
      nUvnuVnNUU var11 = var10.uNNnnnuuuN();
      NUunUunuNV var12 = var10.nuUnNvnuUu();
      float var13 = this.UuUVuuUu(var5, var8, var10);
      var1.UuUVuuUu(
         var6 + var11.UuUVuuUu(1.0F), var7 + var13, var8 - var11.UuUVuuUu(2.0F), var11.UuUVuuUu(1.0F), var5.nuUnNvnuUu ? var12.UuuNnUvUuv() : var12.vuuuNvNuv()
      );
      UvUuUvUVUU var14 = NvuUvVNVuuu.UuUVuuUu(var5);
      if (var14 != null) {
         VvvVunn var15 = new VvvVunn(var5, var6, var7, var8, var9, var4.nuUnNvnuUu());
         var14.UuUVuuUu(var1, var2, var3, var15, var10);
      } else {
         this.UuUVuuUu(var1, var3, var5, var6 + var11.UuUVuuUu(16.0F), var7 + var13 + var11.UuUVuuUu(10.0F), var8 - var11.UuUVuuUu(32.0F), var10);
      }
   }

   private float UuUVuuUu() {
      return (float)(System.currentTimeMillis() % 1000000L) / 1000.0F;
   }

   private float vVvUvVVuuNvV(float var1) {
      return Math.max(0.0F, Math.min(1.0F, var1));
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      vNvvVnNuUVvv var2,
      Module var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      nUVuuNUVnV var12
   ) {
      nUvnuVnNUU var13 = var12.uNNnnnuuuN();
      NUunUunuNV var14 = var12.nuUnNvnuUu();
      float var15 = var4 + var13.UuUVuuUu(16.0F);
      float var16 = var5 + var13.UuUVuuUu(16.0F);
      int var17 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var14), nunvNNUnvU.UuUVuuUu(var14), Math.max(var8, var9 * 0.45F));
      if (var8 > 0.01F) {
         var1.C00OOC00oO(
            var15,
            var16 + var13.UuUVuuUu(2.0F),
            var13.UuUVuuUu(1.0F),
            var13.UuUVuuUu(10.0F),
            var13.UuUVuuUu(1.0F),
            NUunUunuNV.UuUVuuUu(var14.uVunuUNVVUUV(), Math.round(255.0F * var8)),
            NUunUunuNV.UuUVuuUu(var14.UNnVVNvvnVvU(), Math.round(255.0F * var8))
         );
      }

      float var18 = var15 + var13.UuUVuuUu(9.0F) * var8;
      nunvNNUnvU.UuUVuuUu(var1, var13, vNvnnVvvVUu.vVvUvVVuuNvV, var18, var16, var13.UuUVuuUu(14.0F), 12.0F, var3.uVUuuVnNVU, var17);
      this.UuUVuuUu(var1, var2, var3, var4, var6, var16, var10, var11, var12);
      this.UuUVuuUu(var1, var2, var3, var4, var6, var16, var8, var9, var10, var11, var12);
      this.UuUVuuUu(var1, var3, var4, var5, var6, NUunUunuNV.UuUVuuUu(nunvNNUnvU.uUnuvNvvNU(var14), nunvNNUnvU.C00OOC00oO(var14), var8), var12);
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, Module var3, float var4, float var5, float var6, float var7, float var8, nUVuuNUVnV var9) {
      if (!var3.VVuuUN().isEmpty()) {
         nUvnuVnNUU var10 = var9.uNNnnnuuuN();
         NUunUunuNV var11 = var9.nuUnNvnuUu();
         uNuuunuNvuN var12 = this.nvUVNnuu.computeIfAbsent(var3, var1x -> this.C00OOC00oO());
         var12.uUnuvNvvNU(1.0F);
         float var13 = UuvVnuU.vuuuNvNuv(var12.UuUVuuUu(), 0.0F, 1.0F);
         List var14 = this.UuUVuuUu(var3);
         float var15 = var4 + var5 - var10.UuUVuuUu(16.0F) - var10.UuUVuuUu(24.0F);
         float var16 = var15 - var10.UuUVuuUu(this.C00OOC00oO(var3) ? 32.0F : 9.0F);
         float var17 = var4 + var10.UuUVuuUu(90.0F);
         float var18 = var16 - var17;
         float var19 = var10.UuUVuuUu(15.5F);
         float var20 = var10.UuUVuuUu(4.0F);
         float var21 = var6 + var10.UuUVuuUu(7.0F);
         float var22 = var10.UuUVuuUu(5.0F);
         float var23 = var10.UuUVuuUu(17.4F);
         float var24 = var22 * Math.max(0, var14.size() - 1);

         for (uVUNNUnNvU var26 : var14) {
            var24 += this.UuUVuuUu(var10, var26);
         }

         boolean var50 = var24 <= var18;
         int var51 = var14.size();
         float var27 = var51 <= 1 ? 0.0F : Math.min(0.42F, 0.07F * (var51 - 1)) / (var51 - 1);
         float var28 = Math.max(0.001F, 1.0F - var27 * Math.max(0, var51 - 1));
         float var29 = var16;

         for (int var30 = 0; var30 < var51; var30++) {
            uVUNNUnNvU var31 = (uVUNNUnNvU)var14.get(var30);
            float var32 = var50 ? this.UuUVuuUu(var10, var31) : var23;
            float var33 = var29 - var32;
            if (var33 < var17 && var30 > 0) {
               break;
            }

            float var34 = UuvVnuU.vuuuNvNuv((var13 - var30 * var27) / var28, 0.0F, 1.0F);
            float var35 = this.C00OOC00oO(var34);
            float var36 = NNNunUNVuv.UuUVuuUu(var32, var20, var35);
            float var37 = NNNunUNVuv.C00OOC00oO(var19, var20, var35);
            float var38 = var33 + var32 - var36;
            float var39 = var21 - var37 * 0.5F;
            float var40 = Math.min(var36, NNNunUNVuv.uUnuvNvvNU(var19, var20, var35));
            float var41 = NNNunUNVuv.uNNnnnuuuN(var37, var19, var20);
            float var42 = NNNunUNVuv.nuUnNvnuUu(var36, var40, var20);
            float var43 = NNNunUNVuv.VVuuUN(var37, var41, var42);
            float var44 = NNNunUNVuv.vVvUvVVuuNvV(var37, var41);
            float var45 = NNNunUNVuv.uNNnnnuuuN(var37, var41);
            float var46 = NNNunUNVuv.vNUvnnVnUvu(var37, var41, var42);
            String var47 = this.UuUVuuUu(var3, var31);
            boolean var48 = !var2.NvUVUvVVnUu() && NNNunUNVuv.C00OOC00oO(var7, var8, var38, var39, var36, var37, var43, var44, var45, var46);
            float var49 = var2.UuUVuuUu(var47, var48 ? 1.0F : 0.0F, vVvUvVVuuNvV);
            this.UuUVuuUu(var1, var10, var11, var31, var38, var39, var36, var37, var40, var43, var44, var45, var46, var50, var35, var49, var7, var8);
            var29 -= var32 + var22;
         }
      }
   }

   private uNuuunuNvuN C00OOC00oO() {
      uNuuunuNvuN var1 = new uNuuunuNvuN(vvUnNVVnV.UuUVuuUu(), uUnuvNvvNU, 0.0F, 0.0F, 1.0F, 6.0E-4F, 6.0E-4F);
      var1.UuUVuuUu(this::UuUVuuUu);
      return var1;
   }

   private List<uVUNNUnNvU> UuUVuuUu(Module var1) {
      return this.UuuNnUvUuv
         .computeIfAbsent(var1, var0 -> var0.VVuuUN().stream().sorted(Comparator.comparingInt(uVUNNUnNvU::vVvUvVVuuNvV).thenComparing(Enum::name)).toList());
   }

   private String UuUVuuUu(Module var1, uVUNNUnNvU var2) {
      return this.nUUVuvU
         .computeIfAbsent(var1, var0 -> new EnumMap<>(uVUNNUnNvU.class))
         .computeIfAbsent(var2, var2x -> "module:tag:hover:" + System.identityHashCode(var1) + ":" + var2.name());
   }

   private String UuUVuuUu(uVUNNUnNvU var1) {
      return this.UnUNVVVNuv.computeIfAbsent(var1, var0 -> var0.UuUVuuUu().toUpperCase(Locale.ROOT));
   }

   private float UuUVuuUu(nUvnuVnNUU var1, uVUNNUnNvU var2) {
      String var3 = this.UuUVuuUu(var2);
      float var4 = nunvNNUnvU.UuUVuuUu(var1, vNvnnVvvVUu.vVvUvVVuuNvV, var3, 8.0F);
      return Math.max(var1.UuUVuuUu(29.0F), var4 + var1.UuUVuuUu(27.0F));
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      nUvnuVnNUU var2,
      NUunUunuNV var3,
      uVUNNUnNvU var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      boolean var14,
      float var15,
      float var16,
      float var17,
      float var18
   ) {
      if (!(var15 <= 0.001F)) {
         boolean var19 = var3.uNnUnnuNUnNu();
         int var20 = var4.C00OOC00oO();
         float var21 = NNNunUNVuv.uVUuuVnNVU(var15);
         float var22 = NNNunUNVuv.UuUVuuUu(var15);
         float var23 = NNNunUNVuv.C00OOC00oO(var15);
         float var24 = NNNunUNVuv.uUnuvNvvNU(var16);
         float var25 = var5 + var7 - var9;
         float var26 = NNNunUNVuv.vVvUvVVuuNvV(var17, var5, var7);
         float var27 = NNNunUNVuv.vVvUvVVuuNvV(var18, var6, var8);
         float var28 = var24 * NNNunUNVuv.C00OOC00oO(var17, var18, var5, var6, var7, var8);
         float var29 = var28 * var28;
         if (var29 > 0.001F) {
            var1.UuUVuuUu(
               var5,
               var6 + var2.UuUVuuUu(0.4F),
               var7,
               var8,
               var10,
               var11,
               var12,
               var13,
               var2.UuUVuuUu(4.4F) * var29,
               var2.UuUVuuUu(0.45F),
               NUunUunuNV.UuUVuuUu(var20, Math.round(24.0F * var29 * var21))
            );
         }

         int var30 = var19
            ? NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var3, var28 * 0.16F), var20, 0.18F), Math.round(234.0F * var21))
            : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var3.VVuuUN(), var20, 0.24F), Math.round(240.0F * var21));
         int var31 = var19
            ? NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(nunvNNUnvU.UuUVuuUu(var3, 0.0F), var20, 0.15F), Math.round(230.0F * var21))
            : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var3.nuUnNvnuUu(), var20, 0.14F), Math.round(238.0F * var21));
         int var32 = NUunUunuNV.UuUVuuUu(var20, var3.NVNnnvnuunNv(), var19 ? 0.16F : 0.32F);
         int var33 = NUunUunuNV.UuUVuuUu(var20, var3.NVNnnvnuunNv(), var19 ? 0.05F : 0.14F);
         var1.UuUVuuUu(var5, var6, var7, var8, var10, var11, var12, var13, var30, var31, var32, var33, var26, var27, var28, 0.0F, false, 6);
         NNNunUNVuv.NVnVnNnN var34 = NNNunUNVuv.UuUVuuUu(var4.UuUVuuUu());
         String var35 = var34 == NNNunUNVuv.NVnVnNnN.NONE ? var4.uUnuvNvvNU() : var34.UuUVuuUu();
         if (var22 > 0.001F) {
            int var36 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var20, var3.NVNnnvnuunNv(), var19 ? 0.42F : 0.76F), Math.round(248.0F * var22));
            this.UuUVuuUu(var1, var2, var34, var35, var25, var6, var9, var8, var36, var28);
         }

         if (var14 && var23 > 0.001F) {
            String var50 = this.UuUVuuUu(var4);
            float var37 = var5 + var2.UuUVuuUu(5.2F);
            float var38 = var25 - var2.UuUVuuUu(1.8F);
            float var39 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.vVvUvVVuuNvV, var50, 8.0F);
            float var40 = NNNunUNVuv.uVUuuVnNVU(Math.max(0.0F, var38 - var37), var39, var2.UuUVuuUu(3.0F));
            float var41 = var23 * var40;
            int var42 = (int)Math.floor(var37);
            int var43 = (int)Math.floor(var6);
            int var44 = (int)Math.ceil(var38);
            int var45 = (int)Math.ceil(var6 + var8);
            if (var41 > 0.001F && var44 > var42 && var45 > var43) {
               int var46 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(nunvNNUnvU.C00OOC00oO(var3), var20, var19 ? 0.3F : 0.42F), Math.round(244.0F * var41));
               var1.UuUVuuUu(var42, var43, var44 - var42, var45 - var43);

               try {
                  nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.vVvUvVVuuNvV, var37, var6, var8, 8.0F, var50, var46);
               } finally {
                  var1.nuUnNvnuUu();
               }
            }
         }
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, nUvnuVnNUU var2, NNNunUNVuv.NVnVnNnN var3, String var4, float var5, float var6, float var7, float var8, int var9, float var10
   ) {
      float var11 = Math.min(var7 * 0.56F, var8 * 0.6F);
      float var12 = var11 * var3.uUnuvNvvNU() * (1.0F + var10 * 0.045F);
      float var13 = var5 + (var7 - var12) * 0.5F + var2.UuUVuuUu(var3.vVvUvVVuuNvV());
      float var14 = var6 + (var8 - var12) * 0.5F + var2.UuUVuuUu(var3.uNNnnnuuuN());
      if (!var3.C00OOC00oO().isEmpty()) {
         int var15 = UNnnUuUuuNuN.UuUVuuUu(var3);
         if (var15 > 0) {
            var1.UuUVuuUu(var15, var13, var14, var12, var12, var9, false);
            return;
         }
      }

      float var18 = var3 == NNNunUNVuv.NVnVnNnN.NONE ? 7.2F : 8.1F;
      float var16 = nunvNNUnvU.UuUVuuUu(var2, vNvnnVvvVUu.uUnuvNvvNU(), var4, var18);
      float var17 = var5 + (var7 - var16) * 0.5F;
      nunvNNUnvU.UuUVuuUu(var1, var2, vNvnnVvvVUu.uUnuvNvvNU(), var17, var6, var8, var18, var4, var9);
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, Module var3, float var4, float var5, float var6, float var7, float var8, float var9, float var10, nUVuuNUVnV var11
   ) {
      nUvnuVnNUU var12 = var11.uNNnnnuuuN();
      NUunUunuNV var13 = var11.nuUnNvnuUu();
      float var14 = var12.UuUVuuUu(24.0F);
      float var15 = var12.UuUVuuUu(14.0F);
      float var16 = var4 + var5 - var12.UuUVuuUu(16.0F) - var14;
      int var18 = var13.UnUNVVVNuv();
      int var19 = NUunUunuNV.UuUVuuUu(var13.UNnVVNvvnVvU(), var13.uVunuUNVVUUV(), 0.5F);
      int var20 = NUunUunuNV.UuUVuuUu(var18, var19, var7);
      if (var7 > 0.01F) {
         int var21 = var13.uNnUnnuNUnNu()
            ? NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(24.0F * var7))
            : NUunUunuNV.UuUVuuUu(var13.UNnVVNvvnVvU(), Math.round(40.0F * var7));
         var1.UuUVuuUu(
            var16,
            var6,
            var14,
            var15,
            var15 * 0.5F,
            var12.UuUVuuUu(var13.uNnUnnuNUnNu() ? 8.0F : 4.0F) * var7,
            var12.UuUVuuUu(var13.uNnUnnuNUnNu() ? 1.5F : 1.0F),
            var21
         );
      }

      if (var7 > 0.5F) {
         var1.UuUVuuUu(var16, var6, var14, var15, var15 * 0.5F, var13.UNnVVNvvnVvU(), var13.uVunuUNVVUUV());
      } else {
         var1.UuUVuuUu(var16, var6, var14, var15, var15 * 0.5F, NUunUunuNV.UuUVuuUu(var18, var20, var7 * 2.0F));
      }

      float var25 = var12.UuUVuuUu(10.0F);
      float var22 = var12.UuUVuuUu(2.0F);
      float var23 = NNNunUNVuv.C00OOC00oO(var16, var14, var25, var22, var7);
      int var24 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.nuUnNvnuUu(var13), nunvNNUnvU.uNNnnnuuuN(var13), var7);
      var1.UuUVuuUu(
         var23,
         var6 + var22,
         var25,
         var25,
         var25 * 0.5F,
         var12.UuUVuuUu(3.0F),
         var12.UuUVuuUu(0.5F),
         NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(60.0F * (0.5F + var7 * 0.5F)))
      );
      var1.UuUVuuUu(var23, var6 + var22, var25, var25, var25 * 0.5F, var24);
      if (this.C00OOC00oO(var3)) {
         this.UuUVuuUu(var1, var2, var3, var16, var6, var7, var8, var9, var10, var11);
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, Module var3, float var4, float var5, float var6, float var7, float var8, float var9, nUVuuNUVnV var10
   ) {
      nUvnuVnNUU var11 = var10.uNNnnnuuuN();
      NUunUunuNV var12 = var10.nuUnNvnuUu();
      float var13 = var4 - var11.UuUVuuUu(22.0F);
      float var14 = var11.UuUVuuUu(20.0F);
      boolean var15 = !var2.NvUVUvVVnUu() && nunvNNUnvU.UuUVuuUu(var8, var9, var13 - var11.UuUVuuUu(3.0F), var5 - var11.UuUVuuUu(3.0F), var14, var14);
      float var16 = var2.UuUVuuUu(vnvnUnVnuunn.uNNnnnuuuN(var3), var15 ? 1.0F : 0.0F, vVvUvVVuuNvV);
      float var17 = var2.UuUVuuUu(vnvnUnVnuunn.vVvUvVVuuNvV(var3));
      float var18 = var2.UuUVuuUu(vnvnUnVnuunn.UuUVuuUu(var3));
      float var19 = var2.C00OOC00oO(vnvnUnVnuunn.UuUVuuUu(var3));
      float var20 = Math.max(this.vVvUvVVuuNvV(var17), Math.max(var7 * 0.3F, var16 * 0.55F));
      int var21 = NUunUunuNV.UuUVuuUu(nunvNNUnvU.uUnuvNvvNU(var12), nunvNNUnvU.C00OOC00oO(var12), var6);
      int var22 = NUunUunuNV.UuUVuuUu(var21, var12.uVunuUNVVUUV(), var20 * 0.45F);
      int var23 = NUunUunuNV.UuUVuuUu(var21, var12.UNnVVNvvnVvU(), var20 * 0.3F);
      float var24 = Math.max(1.0F, var11.C00OOC00oO());
      float var25 = 15.12F * var24;
      float var26 = 26.0F * var24;
      float var27 = var13 + 0.5003F * var25;
      float var28 = var5 + var11.UuUVuuUu(7.0F) - 0.04587F * var25;
      float var29 = var18 * (float) (Math.PI * 2.0 / 3.0);
      float var30 = Math.min((float) (Math.PI * 2.0 / 9.0), Math.abs(var19) * 240.0F * (float) (Math.PI * 2.0 / 3.0) * UUNnvUVnnnnN.UuUVuuUu() * 1.35F);
      var1.UuUVuuUu(
         var27 - var26 * 0.5F,
         var28 - var26 * 0.5F,
         var26,
         var26,
         var26 * 0.5F,
         var22,
         var23,
         var12.uVunuUNVVUUV(),
         var12.UNnVVNvvnVvU(),
         var29,
         var30,
         var16,
         this.vVvUvVVuuNvV(var18),
         var12.uNnUnnuNUnNu(),
         7
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, Module var2, float var3, float var4, float var5, int var6, nUVuuNUVnV var7) {
      nUvnuVnNUU var8 = var7.uNNnnnuuuN();
      NUunUunuNV var9 = var7.nuUnNvnuUu();
      float var10 = var4 + var8.UuUVuuUu(38.0F);
      List var11 = nunvNNUnvU.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu, var2.vuuuNvNuv == null ? "" : var2.vuuuNvNuv, 10.0F, Math.max(var8.UuUVuuUu(160.0F), var5 - var8.UuUVuuUu(90.0F)), 10
      );

      for (int var12 = 0; var12 < var11.size(); var12++) {
         nunvNNUnvU.UuUVuuUu(
            var1,
            var8,
            vNvnnVvvVUu.UuUVuuUu,
            var3 + var8.UuUVuuUu(16.0F),
            var10 + var12 * var8.UuUVuuUu(12.0F),
            var8.UuUVuuUu(12.0F),
            10.0F,
            (String)var11.get(var12),
            var6
         );
      }

      if (var2.nvUVNnuu || var2.uNNnnnuuuN != -1) {
         String var14 = var2.nvUVNnuu ? "..." : UuNVnuUvunN.UuUVuuUu(var2.uNNnnnuuuN);
         float var13 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var14, 10.0F);
         nunvNNUnvU.UuUVuuUu(
            var1, var8, vNvnnVvvVUu.UuUVuuUu, var3 + var8.vNVuvnUUnuUn() - var8.UuUVuuUu(30.0F) - var13, var10, var8.UuUVuuUu(12.0F), 10.0F, var14, var6
         );
         nunvNNUnvU.UuUVuuUu(
            var1,
            var8,
            vNvnnVvvVUu.uNNnnnuuuN,
            var3 + var8.vNVuvnUUnuUn() - var8.UuUVuuUu(26.0F),
            var10,
            var8.UuUVuuUu(12.0F),
            10.0F,
            "g",
            NUunUunuNV.UuUVuuUu(var9.UnUNVVVNuv(), nunvNNUnvU.uUnuvNvvNU(var9), this.UuUVuuUu(var6))
         );
      }
   }

   private float UuUVuuUu(int var1) {
      return (var1 >>> 24 & 0xFF) / 255.0F;
   }

   private float C00OOC00oO(float var1, float var2, float var3) {
      float var4 = this.vVvUvVVuuNvV(var3);
      return var1 + (var2 - var1) * var4;
   }

   private float uUnuvNvvNU(float var1, float var2, float var3) {
      return Math.max(var2, Math.min(var3, var1));
   }

   private float UuUVuuUu(Module var1, float var2, nUVuuNUVnV var3) {
      nUvnuVnNUU var4 = var3.uNNnnnuuuN();
      String var5 = var1.vuuuNvNuv == null ? "" : var1.vuuuNvNuv;
      if (var5.isBlank()) {
         return var4.UvnvNVnnnnNU();
      } else {
         int var6 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var5, 10.0F, Math.max(var4.UuUVuuUu(160.0F), var2 - var4.UuUVuuUu(90.0F)), 10).size();
         return Math.max(var4.UvnvNVnnnnNU(), var4.UuUVuuUu(54.0F) + Math.max(1, var6) * var4.UuUVuuUu(12.0F));
      }
   }

   private boolean C00OOC00oO(Module var1) {
      return NvuUvVNVuuu.C00OOC00oO(var1) || !var1.nuUnNvnuUu().isEmpty();
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, Module var3, float var4, float var5, float var6, nUVuuNUVnV var7) {
      nUvnuVnNUU var8 = var7.uNNnnnuuuN();
      float var9 = var5;

      for (nvUuvVvuuN var11 : var3.nuUnNvnuUu()) {
         if (var11 instanceof VnnUVUVvV var12) {
            var9 += var8.UuUVuuUu(var12.uUnuvNvvNU());
         } else {
            float var21 = var2.UuUVuuUu(vnvnUnVnuunn.vVvUvVVuuNvV(var11));
            if (!(var21 < 0.01F)) {
               float var13 = (1.0F - var21) * var8.UuUVuuUu(8.0F);
               var1.uNNnnnuuuN(var21);

               try {
                  this.vuuuNvNuv.UuUVuuUu(var1, var2, var11, var4, var9 + var13, var6, var7);
               } finally {
                  var1.vuuuNvNuv();
               }

               float var14 = this.vuuuNvNuv.UuUVuuUu(var11, var8, var2);
               float var15 = 0.0F;
               if (var11 instanceof UvNnUnuNUUU var16) {
                  float var18 = var2.UuUVuuUu(vnvnUnVnuunn.uNNnnnuuuN(var16));
                  if (var18 > 0.01F) {
                     var15 = (var8.UuUVuuUu(6.0F) + var16.vVvUvVVuuNvV.size() * var8.UuUVuuUu(18.0F) + var8.UuUVuuUu(4.0F)) * var18;
                  }
               } else if (var11 instanceof ili11Iii1Ii var17) {
                  float var22 = var2.UuUVuuUu(vnvnUnVnuunn.uNNnnnuuuN(var17));
                  if (var22 > 0.01F) {
                     var15 = UNVVvNuuNNN.UuUVuuUu(var17, var8) * var22;
                  }
               }

               var9 += (var14 + var15 + var8.UuUVuuUu(12.0F)) * var21;
            }
         }
      }
   }

   @Generated
   public nunVvUnNnN(UNVVvNuuNNN var1) {
      this.vuuuNvNuv = var1;
   }
}
