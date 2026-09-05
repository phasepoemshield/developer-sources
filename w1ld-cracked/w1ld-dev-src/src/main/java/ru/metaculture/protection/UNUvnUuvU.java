package ru.metaculture.protection;

import lombok.Generated;
import net.minecraft.class_332;
import org.lwjgl.opengl.GL11;

public final class UNUvnUuvU {
   private final UnvnNuNuuuNV UuUVuuUu;
   private final uUuuVVUuuVuN C00OOC00oO;
   private final UvnNNnvNnVn uUnuvNvvNU;
   private final uuNUnv vVvUvVVuuNvV;
   private final nUUNvUVNv uNNnnnuuuN;
   private final NuVVvuuU nuUnNvnuUu;
   private static final VvNNUnNNVn VVuuUN = new VvNNUnNNVn();

   public Cco0c0CoOcC UuUVuuUu() {
      return this.vVvUvVVuuNvV.UuUVuuUu();
   }

   public nvvnuuv C00OOC00oO() {
      return this.vVvUvVVuuNvV.C00OOC00oO();
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   public void UuUVuuUu(UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, uVUvuUUNVUv var4, CCCo0o0cCCo var5, nUVuuNUVnV var6, int var7, int var8) {
      if (var1 != null && var3 != null && var4 != null && var5 != null && var6 != null && var7 > 0 && var8 > 0) {
         float var9 = var3.vVvUvVVuuNvV();
         if (!(var9 <= 0.001F)) {
            nUvnuVnNUU var10 = var6.uNNnnnuuuN();
            if (var10 != null) {
               vVnvuVuVvnun.UuUVuuUu().UuUVuuUu(var7, var8);

               try {
                  boolean var11 = var6.UuUVuuUu();
                  boolean var12 = var6.vVvUvVVuuNvV() == NvVNvUvunNNu.SAKURA_BREEZE;
                  boolean var13 = var6.vVvUvVVuuNvV() == NvVNvUvunNNu.VERNAL_SOLSTICE;
                  boolean var14 = var6.vVvUvVVuuNvV() == NvVNvUvunNNu.MIDNIGHT_AZURE;
                  boolean var15 = var6.vVvUvVVuuNvV() == NvVNvUvunNNu.FRUTIGER_AERO;
                  boolean var16 = var6.vVvUvVVuuNvV() == NvVNvUvunNNu.PORCELAIN_DAWN;
                  boolean var17 = var6.vVvUvVVuuNvV() == NvVNvUvunNNu.VELVET_DUSK;
                  boolean var18 = var6.vVvUvVVuuNvV() == NvVNvUvunNNu.OBSIDIAN_EMBER;
                  boolean var19 = var6.vVvUvVVuuNvV() == NvVNvUvunNNu.GLACIER_VEIL;
                  boolean var20 = VuuUvnvnuu.UuUVuuUu(var11);

                  try {
                     oocOO0CCC0O.UuUVuuUu()
                        .UuUVuuUu(
                           var4.UuUVuuUu(),
                           var4.C00OOC00oO(),
                           var10.vVvUvVVuuNvV(),
                           var10.uNNnnnuuuN(),
                           var10.UuUVuuUu(24.0F),
                           var3.nvvVNNnnUvVN() ? var4.UvUvUNuvNU() : var4.UuUVuuUu(),
                           var3.nvvVNNnnUvVN() ? var4.c0oOOCcCoC0() : var4.C00OOC00oO(),
                           var3.nvvVNNnnUvVN() ? var10.uVunuUNVVUUV() : 0.0F,
                           var3.nvvVNNnnUvVN() ? var10.UNnVVNvvnVvU() : 0.0F,
                           var10.UuUVuuUu(14.0F)
                        );
                     if (cCOo0cOcO.UuUVuuUu()) {
                        var1.UuUVuuUu(32.0F);
                     }

                     float var21 = (float)(System.currentTimeMillis() % 10000L) / 10000.0F;
                     float var22 = var3.UuNnnVnuNNV();
                     var1.uNNnnnuuuN(var9);
                     boolean var68 = false /* VF: Semaphore variable */;

                     try {
                        var68 = true;
                        boolean var23 = false;

                        try {
                           var23 = !var14 && Menu.nNuVunNUVu.C00OOC00oO("Голограмма") && cCOo0cOcO.UuUVuuUu();
                        } catch (Throwable var78) {
                        }

                        if (!var23) {
                           var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, 0.0F, 0.92F);
                        }

                        if (var23) {
                           try {
                              var1.uUnuvNvvNU();
                              OoCO0OO0OcO.UuUVuuUu()
                                 .UuUVuuUu(
                                    var7,
                                    var8,
                                    var3.unnUnUNVnN(),
                                    var3.NnuUnUNnu(),
                                    var9,
                                    Menu.UnvuVuVnNuvu.uUnuvNvvNU(),
                                    Menu.UvNNVUVNVuvV.uUnuvNvvNU(),
                                    Menu.NnunUUnU.uUnuvNvvNU(),
                                    Menu.nvuVvuNnNUnv.uUnuvNvvNU(),
                                    Menu.NnVnNVN.uUnuvNvvNU(),
                                    Menu.vnvvNvUnVv.uUnuvNvvNU(),
                                    Menu.OCOocoOoOO.uUnuvNvvNU(),
                                    Menu.o0Ooc0COOoc.uUnuvNvvNU(),
                                    Menu.nvvnUnUn.uUnuvNvvNU(),
                                    Menu.UnUUVuVunvVu.uUnuvNvvNU()
                                 );
                           } catch (Throwable var77) {
                              vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("GuiRenderer.holoBlur", var77);
                           }

                           var1.UuUVuuUu(
                              0.0F,
                              0.0F,
                              (float)var7,
                              (float)var8,
                              var11 ? NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round(26.0F * var9)) : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(14.0F * var9))
                           );
                        } else {
                           var1.UuUVuuUu(
                              0.0F,
                              0.0F,
                              (float)var7,
                              (float)var8,
                              var11
                                 ? NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round((var12 ? 22 : (var13 ? 34 : (var15 ? 24 : (var16 ? 26 : 112)))) * var9))
                                 : (
                                    var14
                                       ? NUunUunuNV.UuUVuuUu(3, 7, 18, Math.round(36.0F * var9))
                                       : (
                                          var17
                                             ? NUunUunuNV.UuUVuuUu(19, 12, 32, Math.round(36.0F * var9))
                                             : (
                                                var18
                                                   ? NUunUunuNV.UuUVuuUu(12, 10, 11, Math.round(34.0F * var9))
                                                   : (
                                                      var19
                                                         ? NUunUunuNV.UuUVuuUu(7, 19, 32, Math.round(36.0F * var9))
                                                         : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(100.0F * var9))
                                                   )
                                             )
                                       )
                                 )
                           );
                        }

                        var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, var11 ? NUunUunuNV.UuUVuuUu(248, 250, 255, 154) : NUunUunuNV.UuUVuuUu(1, 3, 9, 126));
                        if (var12) {
                           try {
                              var1.uUnuvNvvNU();
                              UVNvVnuN.UuUVuuUu().UuUVuuUu(var7, var8, var3.unnUnUNVnN(), var3.NnuUnUNnu(), var6.nuUnNvnuUu(), var9);
                              var1.uUnuvNvvNU();
                              var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round(4.0F * var9)));
                           } catch (Throwable var76) {
                              vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("GuiRenderer.sakuraBreeze", var76);
                           }
                        }

                        if (var13) {
                           try {
                              var1.uUnuvNvvNU();
                              vNnNVnnVuNU.UuUVuuUu().UuUVuuUu(var7, var8, var3.unnUnUNVnN(), var3.NnuUnUNnu(), var6.nuUnNvnuUu(), var9);
                              var1.uUnuvNvvNU();
                              var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round(5.0F * var9)));
                           } catch (Throwable var75) {
                              vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("GuiRenderer.vernalSolstice", var75);
                           }
                        }

                        if (var14) {
                           try {
                              var1.uUnuvNvvNU();
                              UnuNNUnvu.UuUVuuUu().UuUVuuUu(var7, var8, var3.unnUnUNVnN(), var3.NnuUnUNnu(), var6.nuUnNvnuUu(), var9);
                              var1.uUnuvNvvNU();
                              var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, NUunUunuNV.UuUVuuUu(3, 7, 18, Math.round(18.0F * var9)));
                           } catch (Throwable var74) {
                              vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("GuiRenderer.midnightAzure", var74);
                           }
                        }

                        if (var15) {
                           try {
                              var1.uUnuvNvvNU();
                              VUNnnv.UuUVuuUu().UuUVuuUu(var7, var8, var3.unnUnUNVnN(), var3.NnuUnUNnu(), var6.nuUnNvnuUu(), var9);
                              var1.uUnuvNvvNU();
                              var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round(4.0F * var9)));
                           } catch (Throwable var73) {
                              vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("GuiRenderer.frutigerAero", var73);
                           }
                        }

                        if (var16) {
                           try {
                              var1.uUnuvNvvNU();
                              vVVnnuvuuV.UuUVuuUu().UuUVuuUu(var7, var8, var3.unnUnUNVnN(), var3.NnuUnUNnu(), var6.nuUnNvnuUu(), var9);
                              var1.uUnuvNvvNU();
                              var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round(5.0F * var9)));
                           } catch (Throwable var72) {
                              vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("GuiRenderer.porcelainDawn", var72);
                           }
                        }

                        if (var17) {
                           try {
                              var1.uUnuvNvvNU();
                              UnNNUUUVUUvu.UuUVuuUu().UuUVuuUu(var7, var8, var3.unnUnUNVnN(), var3.NnuUnUNnu(), var6.nuUnNvnuUu(), var9);
                              var1.uUnuvNvvNU();
                              var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, NUunUunuNV.UuUVuuUu(19, 12, 32, Math.round(18.0F * var9)));
                           } catch (Throwable var71) {
                              vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("GuiRenderer.velvetDusk", var71);
                           }
                        }

                        if (var18) {
                           try {
                              var1.uUnuvNvvNU();
                              vwWWWwWw.UuUVuuUu().UuUVuuUu(var7, var8, var3.unnUnUNVnN(), var3.NnuUnUNnu(), var6.nuUnNvnuUu(), var9);
                              var1.uUnuvNvvNU();
                              var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, NUunUunuNV.UuUVuuUu(12, 10, 11, Math.round(16.0F * var9)));
                           } catch (Throwable var70) {
                              vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("GuiRenderer.obsidianEmber", var70);
                           }
                        }

                        if (var19) {
                           try {
                              var1.uUnuvNvvNU();
                              nVnUnuvuV.UuUVuuUu().UuUVuuUu(var7, var8, var3.unnUnUNVnN(), var3.NnuUnUNnu(), var6.nuUnNvnuUu(), var9);
                              var1.uUnuvNvvNU();
                              var1.UuUVuuUu(0.0F, 0.0F, (float)var7, (float)var8, NUunUunuNV.UuUVuuUu(7, 19, 32, Math.round(18.0F * var9)));
                           } catch (Throwable var69) {
                              vVnvuVuVvnun.UuUVuuUu().C00OOC00oO("GuiRenderer.glacierVeil", var69);
                           }
                        }

                        String var24 = this.uUnuvNvvNU();
                        if (!var24.isBlank()) {
                           var1.uUnuvNvvNU();
                           boolean var25 = uVNnuvnVvvu.UuUVuuUu(
                              var24, 0.0F, 0.0F, (float)var7, (float)var8, var7, var8, var3.unnUnUNVnN(), var3.NnuUnUNnu(), var6.nuUnNvnuUu(), var9
                           );
                           var1.uUnuvNvvNU();
                           if (var25) {
                              var1.UuUVuuUu(
                                 0.0F,
                                 0.0F,
                                 (float)var7,
                                 (float)var8,
                                 var11 ? NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round(10.0F * var9)) : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(16.0F * var9))
                              );
                           }
                        }

                        float var82 = 0.94F + var9 * 0.06F;
                        this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var82, var21, var22, var9, var7, var8);
                        this.nuUnNvnuUu.UuUVuuUu(var1, var3, var6, var7, var8);
                        var68 = false;
                     } finally {
                        if (var68) {
                           var1.vuuuNvNuv();
                        }
                     }

                     var1.vuuuNvNuv();
                  } finally {
                     VuuUvnvnuu.UuUVuuUu(var20);
                  }
               } finally {
                  vVnvuVuVvnun.UuUVuuUu().vNUvnnVnUvu();
               }
            }
         }
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      class_332 var2,
      vNvvVnNuUVvv var3,
      uVUvuUUNVUv var4,
      CCCo0o0cCCo var5,
      nUVuuNUVnV var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12
   ) {
      nUvnuVnNUU var13 = var6.uNNnnnuuuN();
      NUunUunuNV var14 = var6.nuUnNvnuUu();
      float var15 = var3.UuUVuuUu("panel:z:lift", var3.uUuvNUN() ? 1.0F : 0.0F, Cc0cOoOcC0o.UuUVuuUu());
      if (var3.uUuvNUN()) {
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, 1.0F - var15);
         this.UuUVuuUu(var1, var3, var4, var6, var7, var8, var10, var13, var14, var15);
      } else {
         this.UuUVuuUu(var1, var3, var4, var6, var7, var8, var10, var13, var14, 1.0F - var15);
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14, var15);
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUVuuNUVnV var4, float var5, float var6, float var7, nUvnuVnNUU var8, NUunUunuNV var9, float var10
   ) {
      float var11 = var2.UuUVuuUu(vnvnUnVnuunn.UnUNVVVNuv());
      if (!(var11 <= 0.005F)) {
         float var12 = var3.UvUvUNuvNU() + var8.uVunuUNVVUUV() * 0.5F;
         float var13 = var3.c0oOOCcCoC0() + var8.UNnVVNvvnVvU() * 0.5F;
         nUvnuVnNUU var14 = var8.uUnuvNvvNU(var8.uUnuvNvvNU());
         float var15 = 1.0F;
         float var16 = var2.unnUnUNVnN();
         float var17 = var2.NnuUnUNnu();
         NNnNvVnvu.VvunVVUvUNnv var18 = new NNnNvVnvu.VvunVVUvUNnv(
            var3.UvUvUNuvNU(), var3.c0oOOCcCoC0(), var8.uVunuUNVVUUV(), var8.UNnVVNvvnVvU(), var8.C00OOC00oO(14.0F), var15 * var5
         );
         var2.VVuuUN(var18.localX(var16));
         var2.vNUvnnVnUvu(var18.localY(var17));
         var1.UuUVuuUu(var15 * var5, var12, var13);

         try {
            float var19 = var7 * var11 * (1.0F + var10 * 0.3F);
            this.UuUVuuUu(
               var1, var3.UvUvUNuvNU(), var3.c0oOOCcCoC0(), var8.uVunuUNVVUUV(), var8.UNnVVNvvnVvU(), var8.C00OOC00oO(14.0F), var14, var4, var19, var6
            );
            this.UuUVuuUu.UuUVuuUu(var1, var2, var3, var4, var6);
            this.UuUVuuUu(var1, var3.UvUvUNuvNU(), var3.c0oOOCcCoC0(), var8.uVunuUNVVUUV(), var8.UNnVVNvvnVvU(), var8.C00OOC00oO(14.0F), var9, var11);
            this.UuUVuuUu(
               var1, var3.UvUvUNuvNU(), var3.c0oOOCcCoC0(), var8.uVunuUNVVUUV(), var8.UNnVVNvvnVvU(), var8.C00OOC00oO(14.0F), var4, var11, var6, var14
            );
            this.UuUVuuUu(var1, var2, var3, var8, var9, var6);
         } finally {
            var1.uVUuuVnNVU();
            var2.VVuuUN(var16);
            var2.vNUvnnVnUvu(var17);
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(
      UnVNvNnU var1,
      class_332 var2,
      vNvvVnNuUVvv var3,
      uVUvuUUNVUv var4,
      CCCo0o0cCCo var5,
      nUVuuNUVnV var6,
      float var7,
      float var8,
      float var9,
      float var10,
      int var11,
      int var12,
      nUvnuVnNUU var13,
      NUunUunuNV var14,
      float var15
   ) {
      float var16 = var4.UuUVuuUu() + var13.vVvUvVVuuNvV() * 0.5F;
      float var17 = var4.C00OOC00oO() + var13.uNNnnnuuuN() * 0.5F;
      float var18 = 1.0F;
      float var19 = var3.unnUnUNVnN();
      float var20 = var3.NnuUnUNnu();
      NNnNvVnvu.VvunVVUvUNnv var21 = new NNnNvVnvu.VvunVVUvUNnv(
         var4.UuUVuuUu(), var4.C00OOC00oO(), var13.vVvUvVVuuNvV(), var13.uNNnnnuuuN(), var13.UuUVuuUu(24.0F), var7 * var18
      );
      var3.VVuuUN(var21.localX(var19));
      var3.vNUvnnVnUvu(var21.localY(var20));
      var1.UuUVuuUu(var7 * var18, var16, var17);
      boolean var25 = false /* VF: Semaphore variable */;

      try {
         var25 = true;
         float var22 = var10 * (1.0F + var15 * 0.3F);
         this.UuUVuuUu(var1, var4.UuUVuuUu(), var4.C00OOC00oO(), var13.vVvUvVVuuNvV(), var13.uNNnnnuuuN(), var13.UuUVuuUu(24.0F), var13, var6, var22, var8);
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var8, var11, var12);
         this.UuUVuuUu(var1, var4.UuUVuuUu(), var4.C00OOC00oO(), var13.vVvUvVVuuNvV(), var13.uNNnnnuuuN(), var13.UuUVuuUu(24.0F), var14);
         this.UuUVuuUu(var1, var4.UuUVuuUu(), var4.C00OOC00oO(), var13.vVvUvVVuuNvV(), var13.uNNnnnuuuN(), var13.UuUVuuUu(24.0F), var6, 1.0F, var8, var13);
         this.UuUVuuUu(var1, var4, var13, var9);
         this.C00OOC00oO(var1, var3, var4, var13, var14, var8);
         var25 = false;
      } finally {
         if (var25) {
            var1.uVUuuVnNVU();
            var3.VVuuUN(var19);
            var3.vNUvnnVnUvu(var20);
         }
      }

      var1.uVUuuVnNVU();
      var3.VVuuUN(var19);
      var3.vNUvnnVnUvu(var20);
   }

   private void UuUVuuUu(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUvnuVnNUU var4, NUunUunuNV var5, float var6) {
      boolean var7 = UUnNvUuNVnvN.C00OOC00oO(var3, var4, var2.unnUnUNVnN(), var2.NnuUnUNnu());
      var2.uUnuvNvvNU(var7);
      boolean var8 = var2.nUununvNvvn();
      float var9 = var2.UuUVuuUu(vnvnUnVnuunn.NnUuNNU(), !var7 && !var8 ? 0.0F : 1.0F, Cc0cOoOcC0o.vuuuNvNuv());
      float var10 = var2.UuUVuuUu(vnvnUnVnuunn.nNvNUVU(), var8 ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(
         var3.UvUvUNuvNU(),
         var3.c0oOOCcCoC0(),
         var4.uVunuUNVVUUV(),
         var4.UNnVVNvvnVvU(),
         var4.C00OOC00oO(14.0F),
         var4.C00OOC00oO(14.0F),
         var4.C00OOC00oO(14.0F),
         var4.C00OOC00oO(14.0F)
      );

      try {
         this.UuUVuuUu(
            var1,
            var3.UvUvUNuvNU() + var4.uVunuUNVVUUV() - var4.C00OOC00oO(7.5F),
            var3.c0oOOCcCoC0() + var4.UNnVVNvvnVvU() - var4.C00OOC00oO(7.5F),
            var4.C00OOC00oO(1.0F),
            Math.max(var9, var10),
            var5
         );
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUvnuVnNUU var4, NUunUunuNV var5, float var6) {
      boolean var7 = UUnNvUuNVnvN.UuUVuuUu(var3, var4, var2.unnUnUNVnN(), var2.NnuUnUNnu());
      var2.C00OOC00oO(var7);
      boolean var8 = var2.VnnnvUunNvuu();
      float var9 = var2.UuUVuuUu(vnvnUnVnuunn.UNnVVNvvnVvU(), !var7 && !var8 ? 0.0F : 1.0F, Cc0cOoOcC0o.vuuuNvNuv());
      float var10 = var2.UuUVuuUu(vnvnUnVnuunn.uNnUnnuNUnNu(), var8 ? 1.0F : 0.0F, Cc0cOoOcC0o.vuuuNvNuv());
      var1.uUnuvNvvNU();
      var1.UuUVuuUu(
         var3.UuUVuuUu(),
         var3.C00OOC00oO(),
         var4.vVvUvVVuuNvV(),
         var4.uNNnnnuuuN(),
         var4.UuUVuuUu(24.0F),
         var4.UuUVuuUu(24.0F),
         var4.UuUVuuUu(24.0F),
         var4.UuUVuuUu(24.0F)
      );

      try {
         this.UuUVuuUu(
            var1,
            var3.UuUVuuUu() + var4.vVvUvVVuuNvV() - var4.UuUVuuUu(8.5F),
            var3.C00OOC00oO() + var4.uNNnnnuuuN() - var4.UuUVuuUu(8.5F),
            var4.UuUVuuUu(1.0F),
            Math.max(var9, var10),
            var5
         );
      } finally {
         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, NUunUunuNV var6) {
      float var7 = Math.max(0.0F, Math.min(1.0F, var5));
      if (!(var7 <= 0.001F)) {
         float var8 = var7 * var7 * (3.0F - 2.0F * var7);
         int var9 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var6.uVunuUNVVUUV(), var6.UNnVVNvvnVvU(), 0.5F), Math.round(172.0F * var8));
         float var10 = Math.max(1.0F, var4);

         for (int var11 = 0; var11 < 3; var11++) {
            float var12 = var4 * (2.6F + var11 * 1.7F);
            float var13 = Math.round(var2 - var12);
            float var14 = Math.round(var3 - var11 * var4 * 2.25F);
            var1.UuUVuuUu(var13, var14, Math.max(1.0F, (float)Math.round(var12)), var10, var10 * 0.5F, var9);
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, nUvnuVnNUU var7, nUVuuNUVnV var8, float var9, float var10) {
      if (nNuUNVu.UuUVuuUu().UuUVuuUu.vNUvnnVnUvu.C00OOC00oO("Тень")) {
         NUunUunuNV var11 = var8.nuUnNvnuUu();
         if (var11.uNnUnnuNUnNu()) {
            var1.UuUVuuUu(
               var2,
               var3 + var7.UuUVuuUu(0.9F),
               var4,
               var5,
               var6,
               var7.UuUVuuUu(9.0F),
               var7.UuUVuuUu(0.9F),
               NUunUunuNV.UuUVuuUu(46, 59, 70, Math.round(16.0F * var9))
            );
            var1.UuUVuuUu(
               var2,
               var3 + var7.UuUVuuUu(2.6F),
               var4,
               var5,
               var6,
               var7.UuUVuuUu(20.0F),
               var7.UuUVuuUu(2.6F),
               NUunUunuNV.UuUVuuUu(77, 91, 104, Math.round(5.0F * var9))
            );
         } else {
            var1.UuUVuuUu(var2, var3, var4, var5, var6, var7.UuUVuuUu(14.0F), var7.UuUVuuUu(1.0F), NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(180.0F * var9)));
            if (var8.vVvUvVVuuNvV() == NvVNvUvunNNu.MIDNIGHT_AZURE) {
               float var14 = 0.78F + 0.22F * (float)Math.sin(var10 * Math.PI * 2.0);
               var1.UuUVuuUu(
                  var2,
                  var3 + var7.UuUVuuUu(2.0F),
                  var4,
                  var5,
                  var6,
                  var7.UuUVuuUu(44.0F) * var14,
                  var7.UuUVuuUu(5.5F),
                  NUunUunuNV.UuUVuuUu(var11.uVunuUNVVUUV(), Math.round(28.0F * var9 * var14))
               );
               var1.UuUVuuUu(
                  var2,
                  var3,
                  var4,
                  var5,
                  var6,
                  var7.UuUVuuUu(92.0F) * var14,
                  var7.UuUVuuUu(11.0F),
                  NUunUunuNV.UuUVuuUu(var11.UNnVVNvvnVvU(), Math.round(18.0F * var9 * var14))
               );
            } else {
               float var12 = 0.85F + 0.15F * (float)Math.sin(var10 * Math.PI * 2.0);
               int var13 = NUunUunuNV.UuUVuuUu(var11.UNnVVNvvnVvU(), var11.uVunuUNVVUUV(), 0.5F);
               var1.UuUVuuUu(
                  var2, var3, var4, var5, var6, var7.UuUVuuUu(60.0F) * var12, var7.UuUVuuUu(8.0F), NUunUunuNV.UuUVuuUu(var13, Math.round(5.0F * var9 * var12))
               );
            }
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, nUVuuNUVnV var7, float var8, float var9, nUvnuVnNUU var10) {
      if (var7.vVvUvVVuuNvV() == NvVNvUvunNNu.VERNAL_SOLSTICE && !(var8 <= 0.001F)) {
         NUunUunuNV var11 = var7.nuUnNvnuUu();
         float var12 = Math.max(0.0F, Math.min(1.0F, var8));
         float var13 = Math.max(var10.UuUVuuUu(80.0F), var4 * 0.22F);
         float var14 = var4 + var13 * 2.0F;
         float var15 = (var9 * 0.075F + var2 * 3.1E-4F + var3 * 1.9E-4F) % 1.0F;
         if (var15 < 0.0F) {
            var15++;
         }

         float var16 = var2 - var13 + var14 * var15;
         int var17 = NUunUunuNV.UuUVuuUu(var11.UNnVVNvvnVvU(), Math.round(42.0F * var12));
         int var18 = NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(var11.UNnVVNvvnVvU(), NUunUunuNV.UuUVuuUu(255, 255, 255, 255), 0.42F), Math.round(60.0F * var12));
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(var2, var3, var4, var5, var6, var6, var6, var6);

         try {
            var1.UuUVuuUu(var16, var3 + var10.UuUVuuUu(1.0F), var13 * 0.5F, Math.max(1.0F, var10.UuUVuuUu(1.1F)), 0.0F, 0, var17);
            var1.UuUVuuUu(var16 + var13 * 0.5F, var3 + var10.UuUVuuUu(1.0F), var13 * 0.5F, Math.max(1.0F, var10.UuUVuuUu(1.1F)), 0.0F, var18, 0);
            var1.C00OOC00oO(
               var2 + var10.UuUVuuUu(1.0F),
               var3 + var6 * 0.35F,
               Math.max(1.0F, var10.UuUVuuUu(1.0F)),
               Math.max(1.0F, var5 - var6 * 0.7F),
               0.0F,
               NUunUunuNV.UuUVuuUu(var11.uVunuUNVVUUV(), Math.round(14.0F * var12)),
               NUunUunuNV.UuUVuuUu(var11.UNnVVNvvnVvU(), Math.round(10.0F * var12))
            );
         } finally {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, NUunUunuNV var7) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, 1.0F);
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, NUunUunuNV var7, float var8) {
      float var9 = Math.max(0.0F, Math.min(1.0F, var8));
      float var10 = Math.round(var2);
      float var11 = Math.round(var3);
      float var12 = Math.max(1.0F, var6 * 0.72F);
      float var13 = Math.max(0.0F, var4 - var12 * 2.0F);
      if (!(var13 <= 0.5F)) {
         int var14 = var7.uNnUnnuNUnNu()
            ? NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round(46.0F * var9))
            : NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(NUunUunuNV.UuUVuuUu(255, 255, 255, 255), var7.uVunuUNVVUUV(), 0.16F), Math.round(30.0F * var9));
         int var15 = NUunUunuNV.UuUVuuUu(var14, 0);
         float var16 = var13 * 0.5F;
         var1.UuUVuuUu(var10 + var12, var11 + 1.0F, var16, 1.0F, 0.0F, var15, var14);
         var1.UuUVuuUu(var10 + var12 + var16, var11 + 1.0F, var16, 1.0F, 0.0F, var14, var15);
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, class_332 var2, vNvvVnNuUVvv var3, uVUvuUUNVUv var4, CCCo0o0cCCo var5, nUVuuNUVnV var6, float var7, int var8, int var9) {
      nUvnuVnNUU var10 = var6.uNNnnnuuuN();
      NUunUunuNV var11 = var6.nuUnNvnuUu();
      float var12 = var4.UuUVuuUu();
      float var13 = var4.C00OOC00oO();
      float var14 = var10.vVvUvVVuuNvV();
      float var15 = var10.uNNnnnuuuN();
      float var16 = var10.UuUVuuUu(24.0F);
      int var17 = var11.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, 212) : NUunUunuNV.UuUVuuUu(15, 16, 19, 255);
      var1.UuUVuuUu(var12, var13, var14, var15, var16, nunvNNUnvU.VVuuUN(var11), var11.uNnUnnuNUnNu() ? 0.96F : 0.92F, var17);
      if (var11.uNnUnnuNUnNu()) {
         var1.UuUVuuUu(
            var12 + 1.0F,
            var13 + 1.0F,
            Math.max(1.0F, var14 - 2.0F),
            Math.max(1.0F, var15 - 2.0F),
            Math.max(0.0F, var16 - 1.0F),
            nunvNNUnvU.C00OOC00oO(var11, 0.96F),
            1.0F
         );
      }

      if (uNNnUu.UuUVuuUu().uNNnnnuuuN(VnuVUNUv.MENU_PANEL_BG)) {
         boolean var18 = this.UuUVuuUu(var1, VnuVUNUv.MENU_PANEL_BG, null, var12, var13, var14, var15, var16, var8, var9, var3, var11, 1.0F);
         if (var18) {
            var1.UuUVuuUu(
               var12,
               var13,
               var14,
               var15,
               var16,
               var11.uNnUnnuNUnNu()
                  ? NUunUunuNV.UuUVuuUu(nunvNNUnvU.VVuuUN(var11), 58)
                  : NUunUunuNV.UuUVuuUu(var11.nuUnNvnuUu(), this.UuUVuuUu(var11) ? 74 : 42)
            );
         }
      }

      String var34 = this.uUnuvNvvNU();
      if (!var34.isBlank()) {
         boolean var19 = this.UuUVuuUu(var1, null, var34, var12, var13, var14, var15, var16, var8, var9, var3, var11, 0.94F);
         if (var19) {
            var1.UuUVuuUu(
               var12,
               var13,
               var14,
               var15,
               var16,
               var11.uNnUnnuNUnNu()
                  ? NUunUunuNV.UuUVuuUu(nunvNNUnvU.VVuuUN(var11), 54)
                  : NUunUunuNV.UuUVuuUu(var11.nuUnNvnuUu(), this.UuUVuuUu(var11) ? 68 : 38)
            );
         }
      }

      this.C00OOC00oO(var1, var12, var13, var14, var15, var16, var11, var7);
      this.C00OOC00oO.UuUVuuUu(var1, var3, var4, var6);
      this.uUnuvNvvNU.UuUVuuUu(var1, var3, var4, var6);
      float var35 = var3.UuUVuuUu(vnvnUnVnuunn.uVUVnuvnuVuv());
      if (var35 > 0.01F) {
         float var20 = this.uNNnnnuuuN.C00OOC00oO(var10);
         float var21 = (var20 + var10.UuUVuuUu(48.0F)) * var35;
         float var22 = 1.0F - var35 * 0.04F;
         float var23 = var4.vNVuvnUUnuUn() + var4.uVUVnuvnuVuv() * 0.5F + var21 * 0.5F;
         float var24 = var4.UvnvNVnnnnNU() + var4.NVNnnvnuunNv() * 0.5F;
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(
            var4.vNVuvnUUnuUn(),
            var4.UvnvNVnnnnNU(),
            var4.uVUVnuvnuVuv(),
            var4.NVNnnvnuunNv(),
            var10.UuUVuuUu(4.0F),
            var10.UuUVuuUu(4.0F),
            var10.UuUVuuUu(16.0F),
            var10.UuUVuuUu(4.0F)
         );

         try {
            var1.UuUVuuUu(var22, var23, var24);
            var1.UuUVuuUu(var21, 0.0F);
            var1.uNNnnnuuuN(1.0F - var35 * 0.5F);
            boolean var31 = false /* VF: Semaphore variable */;

            try {
               var31 = true;
               this.vVvUvVVuuNvV.UuUVuuUu(var1, var2, var3, var4, var5, var6);
               var31 = false;
            } finally {
               if (var31) {
                  var1.vuuuNvNuv();
                  var1.vNUvnnVnUvu();
                  var1.uVUuuVnNVU();
               }
            }

            var1.vuuuNvNuv();
            var1.vNUvnnVnUvu();
            var1.uVUuuVnNVU();
            var1.UuUVuuUu(
               var4.vNVuvnUUnuUn(),
               var4.UvnvNVnnnnNU(),
               var4.uVUVnuvnuVuv(),
               var4.NVNnnvnuunNv(),
               var11.uNnUnnuNUnNu() ? NUunUunuNV.UuUVuuUu(255, 255, 255, Math.round(74.0F * var35)) : NUunUunuNV.UuUVuuUu(0, 0, 0, Math.round(60.0F * var35))
            );
         } finally {
            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      } else {
         this.vVvUvVVuuNvV.UuUVuuUu(var1, var2, var3, var4, var5, var6);
      }

      this.uNNnnnuuuN.UuUVuuUu(var1, var3, var4, var6, var35);
   }

   private void C00OOC00oO(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, NUunUunuNV var7, float var8) {
      if (Menu.UuUVuuUu(Menu.nNnVnUNVV)) {
         if (!var7.uNnUnnuNUnNu()) {
            var1.uUnuvNvvNU();
            var1.UuUVuuUu(var2, var3, var4, var5, var6, var6, var6, var6);

            try {
               float var9 = var8 * (float) (Math.PI * 2);
               float var10 = 0.8F + 0.2F * (float)Math.sin(var9 * 0.2);
               float var11 = var4 * 0.8F;
               float var12 = var5 * 0.65F;
               float var13 = Math.min(var11, var12) * 0.5F;
               float var14 = var2 + var4 * 0.06F + (float)Math.cos(var9 * 0.08) * var4 * 0.03F;
               float var15 = var3 + var5 * 0.04F + (float)Math.sin(var9 * 0.06) * var5 * 0.02F;
               var1.UuUVuuUu(var14, var15, var11, var12, var13, var11 * 0.5F, var11 * 0.15F, NUunUunuNV.UuUVuuUu(var7.uVunuUNVVUUV(), Math.round(3.0F * var10)));
               float var16 = 0.75F + 0.25F * (float)Math.sin(var9 * 0.25 + 2.094F);
               float var17 = var4 * 0.7F;
               float var18 = var5 * 0.6F;
               float var19 = Math.min(var17, var18) * 0.5F;
               float var20 = var2 + var4 * 0.35F + (float)Math.cos(var9 * 0.1 + 1.5) * var4 * 0.05F;
               float var21 = var3 + var5 * 0.45F + (float)Math.sin(var9 * 0.07 + 0.8F) * var5 * 0.04F;
               var1.UuUVuuUu(var20, var21, var17, var18, var19, var17 * 0.45F, var17 * 0.1F, NUunUunuNV.UuUVuuUu(var7.UNnVVNvvnVvU(), Math.round(2.0F * var16)));
            } finally {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }
         }
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private boolean UuUVuuUu(
      UnVNvNnU var1,
      VnuVUNUv var2,
      String var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      int var9,
      int var10,
      vNvvVnNuUVvv var11,
      NUunUunuNV var12,
      float var13
   ) {
      VVuuUN.UuUVuuUu(var9, var10);
      if (!VVuuUN.nuUnNvnuUu()) {
         return false;
      } else {
         var1.uUnuvNvvNU();
         VvuuVNVUn.NVnVnNnN var15 = VvuuVNVUn.UuUVuuUu();
         float[] var16 = new float[4];
         GL11.glGetFloatv(3106, var16);
         boolean var22 = false /* VF: Semaphore variable */;

         boolean var14;
         try {
            var22 = true;
            VVuuUN.UuUVuuUu();
            GL11.glDisable(3089);
            GL11.glClearColor(0.0F, 0.0F, 0.0F, 0.0F);
            GL11.glClear(16384);
            var14 = var3 != null
               ? uVNnuvnVvvu.UuUVuuUu(var3, var4, var5, var6, var7, var9, var10, var11.unnUnUNVnN(), var11.NnuUnUNnu(), var12, var13)
               : uVNnuvnVvvu.UuUVuuUu(var2, var4, var5, var6, var7, var9, var10, var11.unnUnUNVnN(), var11.NnuUnUNnu(), var12, var13);
            var22 = false;
         } finally {
            if (var22) {
               GL11.glClearColor(var16[0], var16[1], var16[2], var16[3]);
               VvuuVNVUn.uUnuvNvvNU(var15);
            }
         }

         GL11.glClearColor(var16[0], var16[1], var16[2], var16[3]);
         VvuuVNVUn.uUnuvNvvNU(var15);
         if (!var14) {
            return false;
         } else {
            var1.uUnuvNvvNU();
            float var17 = var4 / Math.max(1.0F, (float)var9);
            float var18 = 1.0F - var5 / Math.max(1.0F, (float)var10);
            float var19 = (var4 + var6) / Math.max(1.0F, (float)var9);
            float var20 = 1.0F - (var5 + var7) / Math.max(1.0F, (float)var10);
            var1.C00OOC00oO(VVuuUN.uUnuvNvvNU(), var4, var5, var6, var7, var17, var18, var19, var20, var8);
            return true;
         }
      }
   }

   private String uUnuvNvvNU() {
      try {
         return Menu.UNvvunVVn.UnUNVVVNuv();
      } catch (Throwable var2) {
         return "";
      }
   }

   private boolean UuUVuuUu(NUunUunuNV var1) {
      return var1 != null && (var1.uVunuUNVVUUV() & 16777215) == 61695 && (var1.UNnVVNvvnVvU() & 16777215) == 17663;
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7) {
      if (Menu.UuUVuuUu(Menu.nuunNvv)) {
         var1.uUnuvNvvNU();
         var1.UuUVuuUu(var2, var3, var4, var5, var6, var6, var6, var6);
         boolean var26 = false /* VF: Semaphore variable */;

         try {
            var26 = true;
            long var8 = (long)(var7 * 10000.0F);
            float var10 = 40.0F;
            float var11 = 40.0F;
            int var12 = (int)Math.ceil(var4 / var10) + 1;
            int var13 = (int)Math.ceil(var5 / var11) + 1;

            for (int var14 = 0; var14 < var13; var14++) {
               for (int var15 = 0; var15 < var12; var15++) {
                  long var16 = var8 + var15 * 73856093L + var14 * 19349663L ^ 25214903917L;
                  var16 = var16 * 6364136223846793005L + 1442695040888963407L;
                  int var18 = (int)(var16 >>> 48 & 15L);
                  if (var18 <= 5) {
                     int var19 = 3 + (var18 & 3);
                     float var20 = var2 + var15 * var10 + (float)(var16 >>> 32 & 31L) - 16.0F;
                     float var21 = var3 + var14 * var11 + (float)(var16 >>> 16 & 31L) - 16.0F;
                     float var22 = 1.0F + (var18 & 1);
                     int var23 = (var18 & 1) == 0 ? NUunUunuNV.UuUVuuUu(255, 255, 255, var19) : NUunUunuNV.UuUVuuUu(0, 0, 0, var19 + 1);
                     var1.UuUVuuUu(var20, var21, var22, var22, 0.5F, var23);
                  }
               }
            }

            var26 = false;
         } finally {
            if (var26) {
               var1.uUnuvNvvNU();
               var1.nuUnNvnuUu();
            }
         }

         var1.uUnuvNvvNU();
         var1.nuUnNvnuUu();
      }
   }

   // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
   // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
   private void UuUVuuUu(UnVNvNnU var1, uVUvuUUNVUv var2, nUvnuVnNUU var3, float var4) {
      if (!(var4 <= 0.0F) && !(var4 >= 1.0F)) {
         float var5 = var2.UuUVuuUu();
         float var6 = var2.C00OOC00oO();
         float var7 = var3.vVvUvVVuuNvV();
         float var8 = var3.uNNnnnuuuN();
         float var9 = var3.UuUVuuUu(24.0F);
         float var10 = var7 * 0.18F;
         float var11 = var5 + (var7 + var10 * 2.0F) * var4 - var10;
         float var12 = Math.max(var5, var11 - var10 * 0.5F);
         float var13 = Math.min(var5 + var7, var11 + var10 * 0.5F);
         if (!(var13 <= var12)) {
            float var14 = (float)Math.sin(var4 * Math.PI);
            float var15 = 0.08F * var14;
            float var16 = var4 * 360.0F;
            int var17 = nunvNNUnvU.C00OOC00oO(var16, 0.7F, 0.6F, var15);
            int var18 = nunvNNUnvU.C00OOC00oO((var16 + 60.0F) % 360.0F, 0.7F, 0.6F, var15 * 0.5F);
            var1.uUnuvNvvNU();
            var1.UuUVuuUu(var5, var6, var7, var8, var9, var9, var9, var9);
            boolean var21 = false /* VF: Semaphore variable */;

            try {
               var21 = true;
               var1.UuUVuuUu(var12, var6, var13 - var12, var8, var17, var18);
               var21 = false;
            } finally {
               if (var21) {
                  var1.uUnuvNvvNU();
                  var1.nuUnNvnuUu();
               }
            }

            var1.uUnuvNvvNU();
            var1.nuUnNvnuUu();
         }
      }
   }

   @Generated
   public UNUvnUuvU(UnvnNuNuuuNV var1, uUuuVVUuuVuN var2, UvnNNnvNnVn var3, uuNUnv var4, nUUNvUVNv var5, NuVVvuuU var6) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
      this.vVvUvVVuuNvV = var4;
      this.uNNnnnuuuN = var5;
      this.nuUnNvnuUu = var6;
   }
}
