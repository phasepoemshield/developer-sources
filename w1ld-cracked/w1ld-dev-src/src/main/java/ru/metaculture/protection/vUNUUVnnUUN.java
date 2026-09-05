package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import lombok.Generated;
import org.wild.module.api.Module;

public final class vUNUUVnnUUN {
   private final UvNNVuVnUn UuUVuuUu;
   private final UUnunVVvvNN C00OOC00oO;
   private final nUUNvUVNv uUnuvNvvNU;

   public List<NVUVNNunvvNN> UuUVuuUu(vNvvVnNuUVvv var1, uVUvuUUNVUv var2, CCCo0o0cCCo var3, nUvnuVnNUU var4, float var5) {
      ArrayList var6 = new ArrayList();
      this.nuUnNvnuUu(var6, var2, var4);
      this.UuUVuuUu(var6, var2, var4);
      this.uUnuvNvvNU(var6, var2, var4);
      this.VVuuUN(var6, var2, var4);
      this.vVvUvVVuuNvV(var6, var2, var4);
      this.uNNnnnuuuN(var6, var2, var4);
      this.vNUvnnVnUvu(var6, var2, var4);
      this.UuUVuuUu(var6, var1, var2, var4);
      float var7 = var1.UuUVuuUu(vnvnUnVnuunn.uVUVnuvnuVuv());
      O0oC0cc0O0Oo var8 = O0oC0cc0O0Oo.resolve(var7, var2, var4);
      if (!var1.vvNvvuUUUVvv() && !var8.visible()) {
         if (var1.UnvuVuVnNuvu()) {
            this.nUUVuvU(var6, var2, var4);
            this.nvUVNnuu(var6, var2, var4);
         } else if (var1.UNvvunVVn()) {
            this.C00OOC00oO(var6, var1, var2, var4);
         } else if (!var1.UvNNVUVNVuvV() && !var1.NnunUUnU()) {
            this.UuUVuuUu(var6, var1, var3, var2, var4, var5);
         }

         return var6;
      } else {
         int var9 = var6.size();
         if (var1.vvNvvuUUUVvv() && var7 > 0.35F) {
            this.UuuNnUvUuv(var6, var2, var4);
            this.uVUuuVnNVU(var6, var2, var4);
         }

         this.UuUVuuUu(var6, var9, var8, var2, var4);
         int var10 = var6.size();
         this.vuuuNvNuv(var6, var2, var4);
         this.UuUVuuUu(var6, var10, var8, var2, var4);
         return var6;
      }
   }

   public List<NVUVNNunvvNN> UuUVuuUu(vNvvVnNuUVvv var1, uVUvuUUNVUv var2, nUvnuVnNUU var3, OO0OCoOC var4) {
      ArrayList var5 = new ArrayList();
      this.UuUVuuUu(var5, var1, var2, var3, var4);
      return var5;
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUvnuVnNUU var4, OO0OCoOC var5) {
      if (var2.nvvVNNnnUvVN()) {
         float var6 = var4.C00OOC00oO(20.0F);
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var3.UvUvUNuvNU() + var4.uVunuUNVVUUV() - var4.C00OOC00oO(16.0F) - var6)
               .C00OOC00oO(var3.c0oOOCcCoC0() + var4.C00OOC00oO(20.0F))
               .uUnuvNvvNU(var6)
               .vVvUvVVuuNvV(var6)
               .UuUVuuUu(vNvvVnNuUVvv::UvUvUNuvNU)
               .UuUVuuUu()
         );
         VnvNUvNN var7 = VnvNUvNN.UuUVuuUu(var3, var4);
         if (!var2.nvvnUnUn().isEmpty()) {
            var1.add(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var7.uVUuuVnNVU())
                  .C00OOC00oO(var7.nuUnNvnuUu())
                  .uUnuvNvvNU(var7.vuuuNvNuv())
                  .vVvUvVVuuNvV(var7.vNUvnnVnUvu())
                  .UuUVuuUu(vNvvVnNuUVvv::UnUNuUU)
                  .UuUVuuUu()
            );
         }

         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var7.uNNnnnuuuN())
               .C00OOC00oO(var7.nuUnNvnuUu())
               .uUnuvNvvNU(var7.VVuuUN())
               .vVvUvVVuuNvV(var7.vNUvnnVnUvu())
               .UuUVuuUu(vNvvVnNuUVvv::nNvNUVU)
               .UuUVuuUu()
         );
         float var8 = var7.C00OOC00oO();
         float var9 = var8 + var7.vVvUvVVuuNvV();
         float var10 = var2.UNnVVNvvnVvU();
         List var11 = var2.UuUVuuUu(var5);

         for (int var12 = 0; var12 < var11.size(); var12++) {
            int var13 = (Integer)var11.get(var12);
            VnvNUvNN.NVnVnNnN var14 = var7.UuUVuuUu(var12, var10);
            if (!(var14.y() + var14.height() < var8) && !(var14.y() > var9)) {
               var1.add(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(0)
                     .UuUVuuUu(var14.x())
                     .C00OOC00oO(var14.y())
                     .uUnuvNvvNU(var14.width())
                     .vVvUvVVuuNvV(var14.height())
                     .uNNnnnuuuN(var7.UuUVuuUu())
                     .nuUnNvnuUu(var8)
                     .VVuuUN(var7.uUnuvNvvNU())
                     .vNUvnnVnUvu(var9 - var8)
                     .UuUVuuUu(var2x -> var2x.UuUVuuUu(var5.uUnuvNvvNU().get(var13).uUnuvNvvNU(), var13))
                     .UuUVuuUu()
               );
            }
         }
      }
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(UvnNNnvNnVn.nuUnNvnuUu(var2, var3))
            .C00OOC00oO(UvnNNnvNnVn.VVuuUN(var2, var3))
            .uUnuvNvvNU(UvnNNnvNnVn.UuUVuuUu(var3))
            .vVvUvVVuuNvV(UvnNNnvNnVn.uNNnnnuuuN(var2, var3))
            .UuUVuuUu(var0 -> {
               var0.uVUuuVnNVU(false);
               var0.UuUVuuUu(null);
               var0.UuUVuuUu(false);
               var0.uUVuVvuNUvnu(!var0.VnuUuUVUnnNn());
            })
            .UuUVuuUu()
      );
   }

   private void C00OOC00oO(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      float var4 = UvnNNnvNnVn.vuuuNvNuv(var2, var3);
      float var5 = UvnNNnvNnVn.uVUuuVnNVU(var2, var3);
      float var6 = UvnNNnvNnVn.C00OOC00oO(var3);
      float var7 = UvnNNnvNnVn.vNUvnnVnUvu(var2, var3);
      var1.add(
         NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var4).C00OOC00oO(var5).uUnuvNvvNU(var6).vVvUvVVuuNvV(var7).UuUVuuUu(var0 -> var0.UuUVuuUu(1)).UuUVuuUu()
      );
      var1.add(
         NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(1).UuUVuuUu(var4).C00OOC00oO(var5).uUnuvNvvNU(var6).vVvUvVVuuNvV(var7).UuUVuuUu(var0 -> var0.UuUVuuUu(-1)).UuUVuuUu()
      );
   }

   private void uUnuvNvvNU(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      if (nUvNVVNvUNv.UuUVuuUu()) {
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(UvnNNnvNnVn.uUnuvNvvNU(var2, var3))
               .C00OOC00oO(UvnNNnvNnVn.vVvUvVVuuNvV(var2, var3))
               .uUnuvNvvNU(UvnNNnvNnVn.UuUVuuUu(var2, var3))
               .vVvUvVVuuNvV(UvnNNnvNnVn.C00OOC00oO(var2, var3))
               .UuUVuuUu(var0 -> {
                  var0.uVUuuVnNVU(false);
                  var0.UuUVuuUu(null);
                  var0.UuUVuuUu(false);
                  var0.uUVuVvuNUvnu(false);
                  var0.nUUVuvU();
               })
               .UuUVuuUu()
         );
      }
   }

   private void vVvUvVVuuNvV(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      float var4 = uUuuVVUuuVuN.uUnuvNvvNU(var2, var3);
      float var5 = uUuuVVUuuVuN.nuUnNvnuUu(var2, var3);
      float var6 = uUuuVVUuuVuN.C00OOC00oO(var3);
      var1.add(
         NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var4).C00OOC00oO(var5).uUnuvNvvNU(var6).vVvUvVVuuNvV(var6).UuUVuuUu(vNvvVnNuUVvv::uVUuuVnNVU).UuUVuuUu()
      );
   }

   private void uNNnnnuuuN(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      float var4 = uUuuVVUuuVuN.uUnuvNvvNU(var2, var3);
      float var5 = uUuuVVUuuVuN.VVuuUN(var2, var3);
      float var6 = uUuuVVUuuVuN.C00OOC00oO(var3);
      var1.add(
         NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var4).C00OOC00oO(var5).uUnuvNvvNU(var6).vVvUvVVuuNvV(var6).UuUVuuUu(vNvvVnNuUVvv::UnUNVVVNuv).UuUVuuUu()
      );
   }

   private void nuUnNvnuUu(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(uUuuVVUuuVuN.UuUVuuUu(var2, var3))
            .C00OOC00oO(uUuuVVUuuVuN.C00OOC00oO(var2, var3))
            .uUnuvNvvNU(uUuuVVUuuVuN.UuUVuuUu(var3))
            .vVvUvVVuuNvV(uUuuVVUuuVuN.UuUVuuUu(var3))
            .UuUVuuUu(var0 -> {
               boolean var1x = !var0.nvvVNNnnUvVN();
               var0.UuUVuuUu(var1x);
               if (var1x) {
                  var0.UnUNuUU(true);
               }
            })
            .UuUVuuUu()
      );
   }

   private void VVuuUN(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      float var4 = uUuuVVUuuVuN.uUnuvNvvNU(var2, var3);
      float var5 = uUuuVVUuuVuN.uNNnnnuuuN(var2, var3);
      oOOOo0[] var6 = oOOOo0.values();

      for (int var7 = 0; var7 < var6.length; var7++) {
         oOOOo0 var8 = var6[var7];
         float var9 = var5 + var7 * uUuuVVUuuVuN.uUnuvNvvNU(var3);
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var4)
               .C00OOC00oO(var9)
               .uUnuvNvvNU(uUuuVVUuuVuN.C00OOC00oO(var3))
               .vVvUvVVuuNvV(uUuuVVUuuVuN.C00OOC00oO(var3))
               .UuUVuuUu(var1x -> var1x.UuUVuuUu(var8))
               .UuUVuuUu()
         );
      }
   }

   private void vNUvnnVnUvu(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      float var4 = uUuuVVUuuVuN.uUnuvNvvNU(var2, var3);
      float var5 = uUuuVVUuuVuN.vVvUvVVuuNvV(var2, var3);
      float var6 = uUuuVVUuuVuN.C00OOC00oO(var3);
      var1.add(
         NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var4).C00OOC00oO(var5).uUnuvNvvNU(var6).vVvUvVVuuNvV(var6).UuUVuuUu(vNvvVnNuUVvv::NVUunUNUN).UuUVuuUu()
      );
   }

   private void uVUuuVnNVU(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(this.uUnuvNvvNU.nuUnNvnuUu(var2, var3))
            .C00OOC00oO(this.uUnuvNvvNU.VVuuUN(var2, var3))
            .uUnuvNvvNU(this.uUnuvNvvNU.uNNnnnuuuN(var3))
            .vVvUvVVuuNvV(this.uUnuvNvvNU.nuUnNvnuUu(var3))
            .UuUVuuUu(vNvvVnNuUVvv::NVUunUNUN)
            .UuUVuuUu()
      );
   }

   private void vuuuNvNuv(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(nUUNvUVNv.UuUVuuUu(var2, var3))
            .C00OOC00oO(nUUNvUVNv.C00OOC00oO(var2, var3))
            .uUnuvNvvNU(this.uUnuvNvvNU.C00OOC00oO(var3))
            .vVvUvVVuuNvV(nUUNvUVNv.uUnuvNvvNU(var2, var3))
            .UuUVuuUu(var0 -> {})
            .UuUVuuUu()
      );
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUvnuVnNUU var4) {
      if (!var2.OCOocoOoOO().isEmpty() || var2.o0Ooc0COOoc()) {
         var1.add(
            NVUVNNunvvNN.UuUVuuUu()
               .UuUVuuUu(0)
               .UuUVuuUu(var3.nUUVuvU() + var3.UnUNVVVNuv() - var4.UuUVuuUu(34.0F))
               .C00OOC00oO(var3.vuuuNvNuv())
               .uUnuvNvvNU(var4.UuUVuuUu(34.0F))
               .vVvUvVVuuNvV(var3.nvUVNnuu())
               .UuUVuuUu(var0 -> {
                  var0.uNnUnnuNUnNu();
                  var0.uVUuuVnNVU(false);
               })
               .UuUVuuUu()
         );
      }

      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(var3.nUUVuvU())
            .C00OOC00oO(var3.vuuuNvNuv())
            .uUnuvNvvNU(var3.UnUNVVVNuv())
            .vVvUvVVuuNvV(var3.nvUVNnuu())
            .UuUVuuUu(var0 -> {
               var0.uVUuuVnNVU(true);
               var0.vuuuNvNuv(false);
               var0.UuUVuuUu(null);
            })
            .UuUVuuUu()
      );
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, vNvvVnNuUVvv var2, CCCo0o0cCCo var3, uVUvuUUNVUv var4, nUvnuVnNUU var5, float var6) {
      float var7 = var4.vNVuvnUUnuUn();
      float var8 = var4.UvnvNVnnnnNU();
      float var9 = var4.uVUVnuvnuVuv();
      float var10 = var4.NVNnnvnuunNv();
      float var11 = var8 + var10;
      List var12 = var3.C00OOC00oO();

      for (int var13 = var12.size() - 1; var13 >= 0; var13--) {
         VvvVunn var14 = (VvvVunn)var12.get(var13);
         unuVuVnUNVv var15 = unuVuVnUNVv.resolve(var2, var14, var5);
         if (var15.visible()) {
            float var16 = var15.pivotY() + (var14.uUnuvNvvNU() - var15.pivotY()) * var15.scale() + var15.hitTranslateY();
            float var17 = var16 + var14.uNNnnnuuuN() * var15.scale();
            if (!(var16 >= var11) && !(var17 <= var8)) {
               int var18 = var1.size();
               float var19 = var15.pivotX() + (var6 - var15.pivotX()) / var15.scale();
               if (var2.vNnNuuvVn().contains(var14.UuUVuuUu())) {
                  if (NvuUvVNVuuu.C00OOC00oO(var14.UuUVuuUu())) {
                     NvuUvVNVuuu.UuUVuuUu(var1, var2, var14, var5);
                  } else {
                     this.UuUVuuUu(var1, var2, var14, var5, var19, var7, var8, var9, var10);
                  }
               }

               this.UuUVuuUu(var1, var14, var5, var7, var8, var9, var10);

               for (int var20 = var18; var20 < var1.size(); var20++) {
                  NVUVNNunvvNN var21 = ((NVUVNNunvvNN)var1.get(var20))
                     .C00OOC00oO(var7, var8, var9, var10)
                     .UuUVuuUu(var14.C00OOC00oO(), var14.uUnuvNvvNU(), var14.vVvUvVVuuNvV(), var14.uNNnnnuuuN())
                     .UuUVuuUu(var15.scale(), var15.pivotX(), var15.pivotY(), 0.0F, var15.hitTranslateY());
                  var1.set(var20, var21);
               }
            }
         }
      }
   }

   private void C00OOC00oO(List<NVUVNNunvvNN> var1, vNvvVnNuUVvv var2, uVUvuUUNVUv var3, nUvnuVnNUU var4) {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         AutoBuy var5 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AutoBuy.class);
         if (var5 != null && NvuUvVNVuuu.C00OOC00oO(var5)) {
            int var6 = var1.size();
            NvuUvVNVuuu.UuUVuuUu(var1, var2, NvuUvVNVuuu.UuUVuuUu(var5, var3, var4), var4);

            for (int var7 = var6; var7 < var1.size(); var7++) {
               var1.set(
                  var7,
                  ((NVUVNNunvvNN)var1.get(var7))
                     .C00OOC00oO(var3.vNVuvnUUnuUn(), var3.UvnvNVnnnnNU(), var3.uVUVnuvnuVuv(), var3.NVNnnvnuunNv())
                     .UuUVuuUu(var3.vNVuvnUUnuUn(), var3.UvnvNVnnnnNU(), var3.uVUVnuvnuVuv(), var3.NVNnnvnuunNv())
               );
            }
         }
      }
   }

   private void nvUVNnuu(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(var2.vNVuvnUUnuUn())
            .C00OOC00oO(var2.UvnvNVnnnnNU())
            .uUnuvNvvNU(var2.uVUVnuvnuVuv())
            .vVvUvVVuuNvV(var2.NVNnnvnuunNv())
            .UuUVuuUu(var0 -> {})
            .UuUVuuUu()
      );
   }

   private void UuuNnUvUuv(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(this.uUnuvNvvNU.vVvUvVVuuNvV(var2, var3))
            .C00OOC00oO(this.uUnuvNvvNU.uNNnnnuuuN(var2, var3))
            .uUnuvNvvNU(this.uUnuvNvvNU.uUnuvNvvNU(var3))
            .vVvUvVVuuNvV(this.uUnuvNvvNU.vVvUvVVuuNvV(var3))
            .UuUVuuUu(vNvvVnNuUVvv::nvUVNnuu)
            .UuUVuuUu()
      );
   }

   private void nUUVuvU(List<NVUVNNunvvNN> var1, uVUvuUUNVUv var2, nUvnuVnNUU var3) {
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(C0CoOc0Oo.UuUVuuUu(var2, var3))
            .C00OOC00oO(C0CoOc0Oo.vVvUvVVuuNvV(var2, var3))
            .uUnuvNvvNU(C0CoOc0Oo.UuUVuuUu(var3))
            .vVvUvVVuuNvV(C0CoOc0Oo.vVvUvVVuuNvV(var3))
            .UuUVuuUu(var0 -> vVnvuVuVvnun.UuUVuuUu().vuuuNvNuv())
            .UuUVuuUu()
      );
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(C0CoOc0Oo.C00OOC00oO(var2, var3))
            .C00OOC00oO(C0CoOc0Oo.vVvUvVVuuNvV(var2, var3))
            .uUnuvNvvNU(C0CoOc0Oo.C00OOC00oO(var3))
            .vVvUvVVuuNvV(C0CoOc0Oo.vVvUvVVuuNvV(var3))
            .UuUVuuUu(var0 -> vVnvuVuVvnun.UuUVuuUu().nvUVNnuu())
            .UuUVuuUu()
      );
      var1.add(
         NVUVNNunvvNN.UuUVuuUu()
            .UuUVuuUu(0)
            .UuUVuuUu(C0CoOc0Oo.uUnuvNvvNU(var2, var3))
            .C00OOC00oO(C0CoOc0Oo.vVvUvVVuuNvV(var2, var3))
            .uUnuvNvvNU(C0CoOc0Oo.uUnuvNvvNU(var3))
            .vVvUvVVuuNvV(C0CoOc0Oo.vVvUvVVuuNvV(var3))
            .UuUVuuUu(var0 -> vVnvuVuVvnun.UuUVuuUu().UnUNVVVNuv())
            .UuUVuuUu()
      );
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, VvvVunn var2, nUvnuVnNUU var3, float var4, float var5, float var6, float var7) {
      Module var8 = var2.UuUVuuUu();
      float var9 = this.UuUVuuUu.UuUVuuUu(var8, var2.vVvUvVVuuNvV(), var3);
      float var10 = var2.uUnuvNvvNU() + var3.UuUVuuUu(16.0F);
      float var11 = var2.C00OOC00oO() + var2.vVvUvVVuuNvV() - var3.UuUVuuUu(16.0F) - var3.UuUVuuUu(24.0F);
      float var12 = var11 - var3.UuUVuuUu(22.0F);
      boolean var13 = NvuUvVNVuuu.C00OOC00oO(var8) || !var8.nuUnNvnuUu().isEmpty();
      if (var13) {
         var1.add(
            this.UuUVuuUu(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(0)
                     .UuUVuuUu(var12 - var3.UuUVuuUu(3.0F))
                     .C00OOC00oO(var10 - var3.UuUVuuUu(3.0F))
                     .uUnuvNvvNU(var3.UuUVuuUu(20.0F))
                     .vVvUvVVuuNvV(var3.UuUVuuUu(20.0F))
                     .UuUVuuUu(var1x -> var1x.UuUVuuUu(var8)),
                  var4,
                  var5,
                  var6,
                  var7
               )
               .UuUVuuUu()
         );
      }

      var1.add(
         this.UuUVuuUu(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(2)
                  .UuUVuuUu(var2.C00OOC00oO())
                  .C00OOC00oO(var2.uUnuvNvvNU())
                  .uUnuvNvvNU(var2.vVvUvVVuuNvV())
                  .vVvUvVVuuNvV(var9)
                  .UuUVuuUu(var1x -> var1x.C00OOC00oO(var8)),
               var4,
               var5,
               var6,
               var7
            )
            .UuUVuuUu()
      );
      if (var13) {
         var1.add(
            this.UuUVuuUu(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(1)
                     .UuUVuuUu(var2.C00OOC00oO())
                     .C00OOC00oO(var2.uUnuvNvvNU())
                     .uUnuvNvvNU(var2.vVvUvVVuuNvV())
                     .vVvUvVVuuNvV(var9)
                     .UuUVuuUu(var1x -> var1x.UuUVuuUu(var8)),
                  var4,
                  var5,
                  var6,
                  var7
               )
               .UuUVuuUu()
         );
      }

      var1.add(
         this.UuUVuuUu(
               NVUVNNunvvNN.UuUVuuUu()
                  .UuUVuuUu(0)
                  .UuUVuuUu(var2.C00OOC00oO())
                  .C00OOC00oO(var2.uUnuvNvvNU())
                  .uUnuvNvvNU(var2.vVvUvVVuuNvV())
                  .vVvUvVVuuNvV(var9)
                  .UuUVuuUu(var1x -> {
                     vUNVNUnuv var2x = var1x.VVuuUN();
                     if (var2x != null) {
                        var2x.UuuNnUvUuv().UuUVuuUu(var8.vVvUvVVuuNvV, !var2x.UuuNnUvUuv().C00OOC00oO(var8.vVvUvVVuuNvV));
                     } else if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null && NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO().contains(var8)) {
                        var8.a_();
                     }
                  }),
               var4,
               var5,
               var6,
               var7
            )
            .UuUVuuUu()
      );
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, vNvvVnNuUVvv var2, VvvVunn var3, nUvnuVnNUU var4, float var5, float var6, float var7, float var8, float var9) {
      float var10 = var3.C00OOC00oO() + var4.UuUVuuUu(16.0F);
      float var11 = var3.uUnuvNvvNU() + this.UuUVuuUu.UuUVuuUu(var3.UuUVuuUu(), var3.vVvUvVVuuNvV(), var4) + var4.UuUVuuUu(10.0F);
      float var12 = var3.vVvUvVVuuNvV() - var4.UuUVuuUu(32.0F);

      for (nvUuvVvuuN var14 : var3.UuUVuuUu().nuUnNvnuUu()) {
         if (var14 instanceof VnnUVUVvV var57) {
            var11 += var4.UuUVuuUu(var57.uUnuvNvvNU());
         } else {
            float var15 = var2.UuUVuuUu(vnvnUnVnuunn.vVvUvVVuuNvV(var14));
            float var16 = this.UuUVuuUu.UuUVuuUu(var14, var4, var2);
            float var17 = this.UuUVuuUu.UuUVuuUu(var14, var2, var4);
            if (var15 < 0.5F) {
               var11 += (var16 + var17 + var4.UuUVuuUu(12.0F)) * var15;
            } else {
               float var18 = (1.0F - var15) * var4.UuUVuuUu(8.0F);
               if (var14 instanceof VnnUvVNuNuVv var19 && var2.NvNUuuuvUvu() == var19) {
                  float var61 = var4.UuUVuuUu(16.0F);
                  var1.add(
                     this.UuUVuuUu(
                           NVUVNNunvvNN.UuUVuuUu()
                              .UuUVuuUu(0)
                              .UuUVuuUu(UNVVvNuuNNN.C00OOC00oO(var10, var12, var4))
                              .C00OOC00oO(UNVVvNuuNNN.vVvUvVVuuNvV(var11 + var18, var4))
                              .uUnuvNvvNU(UNVVvNuuNNN.uNNnnnuuuN(var4))
                              .vVvUvVVuuNvV(UNVVvNuuNNN.uNNnnnuuuN(var4))
                              .UuUVuuUu(var5x -> this.C00OOC00oO.UuUVuuUu(var5x, var14, var5, var10, var12)),
                           var6,
                           var7,
                           var8,
                           var9
                        )
                        .UuUVuuUu()
                  );
                  float var63 = var2.vNnNNNuVVnUv();
                  float var26 = var2.UVUnUvUNU();
                  float var27 = var2.UvUnnnn();
                  float var28 = var2.occOCoc0OcO();
                  if (var27 > 1.0F && var28 > 1.0F) {
                     var1.add(
                        this.UuUVuuUu(
                              NVUVNNunvvNN.UuUVuuUu()
                                 .UuUVuuUu(0)
                                 .UuUVuuUu(var63)
                                 .C00OOC00oO(var26)
                                 .uUnuvNvvNU(var27)
                                 .vVvUvVVuuNvV(var28)
                                 .UuUVuuUu(var2x -> this.C00OOC00oO.UuUVuuUu(var2x, var19, var2x.unnUnUNVnN(), var2x.NnuUnUNnu())),
                              var6,
                              var7,
                              var8,
                              var9
                           )
                           .UuUVuuUu()
                     );
                  }

                  float var29 = var2.VnvunuuvUNu();
                  float var30 = var2.nuVuunUn();
                  float var31 = var2.NvNvVNUv();
                  float var32 = var2.vNUUvuuVU();
                  if (var31 > 1.0F && var32 > 1.0F) {
                     var1.add(
                        this.UuUVuuUu(
                              NVUVNNunvvNN.UuUVuuUu()
                                 .UuUVuuUu(0)
                                 .UuUVuuUu(var29)
                                 .C00OOC00oO(var30)
                                 .uUnuvNvvNU(var31)
                                 .vVvUvVVuuNvV(var32)
                                 .UuUVuuUu(var2x -> this.C00OOC00oO.C00OOC00oO(var2x, var19, var2x.unnUnUNVnN(), var2x.NnuUnUNnu())),
                              var6,
                              var7,
                              var8,
                              var9
                           )
                           .UuUVuuUu()
                     );
                  }

                  float var33 = var2.unNuVNVUnV();
                  float var34 = var2.UvNNNUvNnUUV();
                  float var35 = var2.vVuNvnVUvvv();
                  float var36 = var2.OCCc0co0OOC();
                  if (var35 > 1.0F && var36 > 1.0F) {
                     var1.add(
                        this.UuUVuuUu(
                              NVUVNNunvvNN.UuUVuuUu()
                                 .UuUVuuUu(0)
                                 .UuUVuuUu(var33)
                                 .C00OOC00oO(var34)
                                 .uUnuvNvvNU(var35)
                                 .vVvUvVVuuNvV(var36)
                                 .UuUVuuUu(var2x -> this.C00OOC00oO.UuUVuuUu(var2x, var19, var2x.unnUnUNVnN())),
                              var6,
                              var7,
                              var8,
                              var9
                           )
                           .UuUVuuUu()
                     );
                  }

                  float var37 = var2.unUvvVVVVUu();
                  float var38 = var2.nnUunUnNUN();
                  float var39 = var2.UNuUVVuUuU();
                  float var40 = var2.NunnVUUuvUV();
                  if (var39 > 1.0F && var40 > 1.0F) {
                     var1.add(
                        this.UuUVuuUu(
                              NVUVNNunvvNN.UuUVuuUu()
                                 .UuUVuuUu(0)
                                 .UuUVuuUu(var37)
                                 .C00OOC00oO(var38)
                                 .uUnuvNvvNU(var39)
                                 .vVvUvVVuuNvV(var40)
                                 .UuUVuuUu(var2x -> this.C00OOC00oO.C00OOC00oO(var2x, var19, var2x.unnUnUNVnN())),
                              var6,
                              var7,
                              var8,
                              var9
                           )
                           .UuUVuuUu()
                     );
                  }

                  float var41 = var2.nVUNnUuU();
                  float var42 = var2.VNvuVnvnun();
                  float var43 = var2.unVVnuunNU();
                  float var44 = var2.vVnuVVvVNuNu();
                  if (var43 > 1.0F && var44 > 1.0F) {
                     var1.add(
                        this.UuUVuuUu(
                              NVUVNNunvvNN.UuUVuuUu()
                                 .UuUVuuUu(0)
                                 .UuUVuuUu(var41)
                                 .C00OOC00oO(var42)
                                 .uUnuvNvvNU(var43)
                                 .vVvUvVVuuNvV(var44)
                                 .UuUVuuUu(var2x -> this.C00OOC00oO.UuUVuuUu(var2x, var19, var2x.unnUnUNVnN(), false)),
                              var6,
                              var7,
                              var8,
                              var9
                           )
                           .UuUVuuUu()
                     );
                     var1.add(
                        this.UuUVuuUu(
                              NVUVNNunvvNN.UuUVuuUu()
                                 .UuUVuuUu(1)
                                 .UuUVuuUu(var41)
                                 .C00OOC00oO(var42)
                                 .uUnuvNvvNU(var43)
                                 .vVvUvVVuuNvV(var44)
                                 .UuUVuuUu(var2x -> this.C00OOC00oO.UuUVuuUu(var2x, var19, var2x.unnUnUNVnN(), true)),
                              var6,
                              var7,
                              var8,
                              var9
                           )
                           .UuUVuuUu()
                     );
                  }

                  float var45 = var2.NvUVuUNUUNvv();
                  float var46 = var2.nvnUvvnUUN();
                  float var47 = var2.NnvVNVnn();
                  float var48 = var2.VnUvVu();
                  if (var47 > 1.0F && var48 > 1.0F) {
                     var1.add(
                        this.UuUVuuUu(
                              NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var45).C00OOC00oO(var46).uUnuvNvvNU(var47).vVvUvVVuuNvV(var48).UuUVuuUu(var1x -> {
                                 var19.UuUVuuUu(var1x.C00OOC00oO(var19));
                                 var1x.NuunnvnN();
                                 var1x.uUVvnUuNvvN();
                              }), var6, var7, var8, var9
                           )
                           .UuUVuuUu()
                     );
                  }

                  float var49 = var2.O0ooccOc0();
                  float var50 = var2.nvuVnuvUVvVu();
                  float var51 = var2.coOocCcoOc0();
                  float var52 = var2.uvNnUuvvNU();
                  if (var51 > 1.0F && var52 > 1.0F) {
                     var1.add(
                        this.UuUVuuUu(
                              NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var49).C00OOC00oO(var50).uUnuvNvvNU(var51).vVvUvVVuuNvV(var52).UuUVuuUu(var1x -> {
                                 var1x.nuUnNvnuUu(null);
                                 var1x.VVuuUN("");
                                 var1x.uNNnnnuuuN(var19);
                                 var1x.nuUnNvnuUu(String.format("%06X", var19.uVUuuVnNVU() & 16777215));
                              }), var6, var7, var8, var9
                           )
                           .UuUVuuUu()
                     );
                  }

                  float var53 = var2.UuUUvvVunV();
                  float var54 = var2.VuNNvnVVUUn();
                  float var55 = var2.UnVvNNuNu();
                  float var56 = var2.vuNunNnvnunv();
                  if (var55 > 1.0F && var56 > 1.0F) {
                     var1.add(
                        this.UuUVuuUu(
                              NVUVNNunvvNN.UuUVuuUu().UuUVuuUu(0).UuUVuuUu(var53).C00OOC00oO(var54).uUnuvNvvNU(var55).vVvUvVVuuNvV(var56).UuUVuuUu(var1x -> {
                                 var1x.uNNnnnuuuN(null);
                                 var1x.nuUnNvnuUu("");
                                 var1x.nuUnNvnuUu(var19);
                                 var1x.VVuuUN(Integer.toString(Math.round(var19.vNVuvnUUnuUn * 100.0F)));
                              }), var6, var7, var8, var9
                           )
                           .UuUVuuUu()
                     );
                  }
               } else if (var14 instanceof VUVnvvnNN var20) {
                  this.UuUVuuUu(var1, var20, var10, var11 + var18, var12, var16, var4, var6, var7, var8, var9);
               } else if (var14 instanceof ili11Iii1Ii var21) {
                  float var24 = UNVVvNuuNNN.UuUVuuUu(var21, var10, var12, var4);
                  float var25 = UNVVvNuuNNN.C00OOC00oO(var11 + var18, var4);
                  var1.add(
                     this.UuUVuuUu(
                           NVUVNNunvvNN.UuUVuuUu()
                              .UuUVuuUu(0)
                              .UuUVuuUu(var24)
                              .C00OOC00oO(var25)
                              .uUnuvNvvNU(UNVVvNuuNNN.UuUVuuUu(var21, var12, var4))
                              .vVvUvVVuuNvV(UNVVvNuuNNN.C00OOC00oO(var4))
                              .UuUVuuUu(var1x -> var1x.UuUVuuUu(var21)),
                           var6,
                           var7,
                           var8,
                           var9
                        )
                        .UuUVuuUu()
                  );
                  if (var21.uNNnnnuuuN) {
                     this.UuUVuuUu(var1, var21, var10, var11 + var18, var12, var4, var6, var7, var8, var9);
                  }
               } else if (var14 instanceof UvNnUnuNUUU var22) {
                  float var58 = UNVVvNuuNNN.UuUVuuUu(var22, var10, var12, var4);
                  float var62 = UNVVvNuuNNN.UuUVuuUu(var11 + var18, var4);
                  var1.add(
                     this.UuUVuuUu(
                           NVUVNNunvvNN.UuUVuuUu()
                              .UuUVuuUu(0)
                              .UuUVuuUu(var58)
                              .C00OOC00oO(var62)
                              .uUnuvNvvNU(UNVVvNuuNNN.UuUVuuUu(var22, var12, var4))
                              .vVvUvVVuuNvV(UNVVvNuuNNN.UuUVuuUu(var4))
                              .UuUVuuUu(var1x -> var1x.UuUVuuUu(var22)),
                           var6,
                           var7,
                           var8,
                           var9
                        )
                        .UuUVuuUu()
                  );
                  if (var22.uVUuuVnNVU) {
                     this.UuUVuuUu(var1, var22, var10, var11 + var18, var12, var4, var6, var7, var8, var9);
                  }
               } else if (var14 instanceof vvNnnUNnVvn var23) {
                  float var59 = UNVVvNuuNNN.vVvUvVVuuNvV(var4);
                  var1.add(
                     this.UuUVuuUu(
                           NVUVNNunvvNN.UuUVuuUu()
                              .UuUVuuUu(0)
                              .UuUVuuUu(UNVVvNuuNNN.UuUVuuUu(var10, var12, var4))
                              .C00OOC00oO(UNVVvNuuNNN.uUnuvNvvNU(var11 + var18, var4))
                              .uUnuvNvvNU(var59)
                              .vVvUvVVuuNvV(var59)
                              .UuUVuuUu(var5x -> this.C00OOC00oO.UuUVuuUu(var5x, var14, var5, var10, var12)),
                           var6,
                           var7,
                           var8,
                           var9
                        )
                        .UuUVuuUu()
                  );
                  var1.add(
                     this.UuUVuuUu(
                           NVUVNNunvvNN.UuUVuuUu()
                              .UuUVuuUu(2)
                              .UuUVuuUu(var10)
                              .C00OOC00oO(var11 + var18 - var4.UuUVuuUu(2.0F))
                              .uUnuvNvvNU(var12)
                              .vVvUvVVuuNvV(var16 + var4.UuUVuuUu(4.0F))
                              .UuUVuuUu(var1x -> var1x.UuUVuuUu(var23)),
                           var6,
                           var7,
                           var8,
                           var9
                        )
                        .UuUVuuUu()
                  );
                  var1.add(
                     this.UuUVuuUu(
                           NVUVNNunvvNN.UuUVuuUu()
                              .UuUVuuUu(1)
                              .UuUVuuUu(var10)
                              .C00OOC00oO(var11 + var18 - var4.UuUVuuUu(2.0F))
                              .uUnuvNvvNU(var12)
                              .vVvUvVVuuNvV(var16 + var4.UuUVuuUu(4.0F))
                              .UuUVuuUu(var1x -> {
                                 if (var23.nuUnNvnuUu != -1) {
                                    var23.VVuuUN = !var23.VVuuUN;
                                    var1x.uUVvnUuNvvN();
                                 }
                              }),
                           var6,
                           var7,
                           var8,
                           var9
                        )
                        .UuUVuuUu()
                  );
               } else if (var14 instanceof VnnUvVNuNuVv) {
                  float var60 = UNVVvNuuNNN.uNNnnnuuuN(var4);
                  var1.add(
                     this.UuUVuuUu(
                           NVUVNNunvvNN.UuUVuuUu()
                              .UuUVuuUu(0)
                              .UuUVuuUu(UNVVvNuuNNN.C00OOC00oO(var10, var12, var4))
                              .C00OOC00oO(UNVVvNuuNNN.vVvUvVVuuNvV(var11 + var18, var4))
                              .uUnuvNvvNU(var60)
                              .vVvUvVVuuNvV(var60)
                              .UuUVuuUu(var5x -> this.C00OOC00oO.UuUVuuUu(var5x, var14, var5, var10, var12)),
                           var6,
                           var7,
                           var8,
                           var9
                        )
                        .UuUVuuUu()
                  );
               } else if (var14 instanceof nNUuNvVn) {
                  var1.add(
                     this.UuUVuuUu(
                           NVUVNNunvvNN.UuUVuuUu()
                              .UuUVuuUu(0)
                              .UuUVuuUu(var10)
                              .C00OOC00oO(var11 + var18 + var4.UuUVuuUu(3.0F))
                              .uUnuvNvvNU(var12)
                              .vVvUvVVuuNvV(var4.UuUVuuUu(26.0F))
                              .UuUVuuUu(var5x -> this.C00OOC00oO.UuUVuuUu(var5x, var14, var5, var10, var12)),
                           var6,
                           var7,
                           var8,
                           var9
                        )
                        .UuUVuuUu()
                  );
               } else {
                  var1.add(
                     this.UuUVuuUu(
                           NVUVNNunvvNN.UuUVuuUu()
                              .UuUVuuUu(0)
                              .UuUVuuUu(var10)
                              .C00OOC00oO(var11 + var18 - var4.UuUVuuUu(2.0F))
                              .uUnuvNvvNU(var12)
                              .vVvUvVVuuNvV(var16 + var4.UuUVuuUu(4.0F))
                              .UuUVuuUu(var5x -> this.C00OOC00oO.UuUVuuUu(var5x, var14, var5, var10, var12)),
                           var6,
                           var7,
                           var8,
                           var9
                        )
                        .UuUVuuUu()
                  );
               }

               var11 += (var16 + var17 + var4.UuUVuuUu(12.0F)) * var15;
            }
         }
      }
   }

   private void UuUVuuUu(
      List<NVUVNNunvvNN> var1,
      VUVnvvnNN var2,
      float var3,
      float var4,
      float var5,
      float var6,
      nUvnuVnNUU var7,
      float var8,
      float var9,
      float var10,
      float var11
   ) {
      float var12 = var5 * 0.7F;
      float var13 = var3 + var5 - var12;
      float var14 = var7.UuUVuuUu(3.0F);
      float var15 = var7.UuUVuuUu(14.0F);
      float var16 = var7.UuUVuuUu(3.0F);
      float var17 = 0.0F;
      int var18 = 0;

      for (int var19 = 0; var19 < var2.vVvUvVVuuNvV.size(); var19++) {
         vvNnnUNnVvn var21 = var2.vVvUvVVuuNvV.get(var19);
         float var22 = nunvNNUnvU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, nunvNNUnvU.UuUVuuUu(var21), 8.0F);
         float var23 = Math.max(var7.UuUVuuUu(18.0F), var22 + var7.UuUVuuUu(8.0F));
         if (var17 > 0.0F && var17 + var23 > var12) {
            var18++;
            var17 = 0.0F;
         }

         float var24 = var13 + var17;
         float var25 = var4 + var7.UuUVuuUu(1.0F) + var18 * (var15 + var16);
         var1.add(
            this.UuUVuuUu(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(0)
                     .UuUVuuUu(var24)
                     .C00OOC00oO(var25 - var7.UuUVuuUu(1.0F))
                     .uUnuvNvvNU(var23)
                     .vVvUvVVuuNvV(var15 + var7.UuUVuuUu(2.0F))
                     .UuUVuuUu(var1x -> {
                        var21.C00OOC00oO(!var21.vVvUvVVuuNvV());
                        var1x.uUVvnUuNvvN();
                     }),
                  var8,
                  var9,
                  var10,
                  var11
               )
               .UuUVuuUu()
         );
         var1.add(
            this.UuUVuuUu(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(2)
                     .UuUVuuUu(var24)
                     .C00OOC00oO(var25 - var7.UuUVuuUu(1.0F))
                     .uUnuvNvvNU(var23)
                     .vVvUvVVuuNvV(var15 + var7.UuUVuuUu(2.0F))
                     .UuUVuuUu(var1x -> var1x.UuUVuuUu(var21)),
                  var8,
                  var9,
                  var10,
                  var11
               )
               .UuUVuuUu()
         );
         var1.add(
            this.UuUVuuUu(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(1)
                     .UuUVuuUu(var24)
                     .C00OOC00oO(var25 - var7.UuUVuuUu(1.0F))
                     .uUnuvNvvNU(var23)
                     .vVvUvVVuuNvV(var15 + var7.UuUVuuUu(2.0F))
                     .UuUVuuUu(var1x -> {
                        if (var21.nuUnNvnuUu != -1) {
                           var21.VVuuUN = !var21.VVuuUN;
                           var1x.uUVvnUuNvvN();
                        }
                     }),
                  var8,
                  var9,
                  var10,
                  var11
               )
               .UuUVuuUu()
         );
         var17 += var23 + var14;
      }
   }

   private void UuUVuuUu(
      List<NVUVNNunvvNN> var1, UvNnUnuNUUU var2, float var3, float var4, float var5, nUvnuVnNUU var6, float var7, float var8, float var9, float var10
   ) {
      float var11 = UNVVvNuuNNN.UuUVuuUu(var5);
      float var12 = UNVVvNuuNNN.UuUVuuUu(var3, var5);
      float var13 = var4 + var6.UuUVuuUu(14.0F) + var6.UuUVuuUu(4.0F);
      float var14 = var6.UuUVuuUu(18.0F);

      for (int var15 = 0; var15 < var2.vVvUvVVuuNvV.size(); var15++) {
         int var16 = var15;
         float var17 = var13 + var6.UuUVuuUu(2.0F) + var15 * var14;
         var1.add(
            this.UuUVuuUu(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(0)
                     .UuUVuuUu(var12)
                     .C00OOC00oO(var17)
                     .uUnuvNvvNU(var11)
                     .vVvUvVVuuNvV(var14)
                     .UuUVuuUu(var2x -> var2x.UuUVuuUu(var2, var16)),
                  var7,
                  var8,
                  var9,
                  var10
               )
               .UuUVuuUu()
         );
      }
   }

   private void UuUVuuUu(
      List<NVUVNNunvvNN> var1, ili11Iii1Ii var2, float var3, float var4, float var5, nUvnuVnNUU var6, float var7, float var8, float var9, float var10
   ) {
      var2.uUnuvNvvNU();
      float var11 = UNVVvNuuNNN.C00OOC00oO(var5);
      float var12 = UNVVvNuuNNN.C00OOC00oO(var3, var5);
      float var13 = var4 + var6.UuUVuuUu(18.0F) + var6.UuUVuuUu(5.0F);
      float var14 = UNVVvNuuNNN.uUnuvNvvNU(var6);
      float var15 = var6.UuUVuuUu(4.0F);

      for (int var16 = 0; var16 < var2.vVvUvVVuuNvV.size(); var16++) {
         int var17 = var16;
         float var18 = var13 + var15 + var16 * var14;
         var1.add(
            this.UuUVuuUu(
                  NVUVNNunvvNN.UuUVuuUu()
                     .UuUVuuUu(0)
                     .UuUVuuUu(var12)
                     .C00OOC00oO(var18)
                     .uUnuvNvvNU(var11)
                     .vVvUvVVuuNvV(var14)
                     .UuUVuuUu(var2x -> var2x.UuUVuuUu(var2, var17)),
                  var7,
                  var8,
                  var9,
                  var10
               )
               .UuUVuuUu()
         );
      }
   }

   private NVUVNNunvvNN.NVnVnNnN UuUVuuUu(NVUVNNunvvNN.NVnVnNnN var1, float var2, float var3, float var4, float var5) {
      return var1.uNNnnnuuuN(var2).nuUnNvnuUu(var3).VVuuUN(var4).vNUvnnVnUvu(var5);
   }

   private void UuUVuuUu(List<NVUVNNunvvNN> var1, int var2, O0oC0cc0O0Oo var3, uVUvuUUNVUv var4, nUvnuVnNUU var5) {
      if (var3.visible()) {
         float var6 = nUUNvUVNv.UuUVuuUu(var4, var5);
         float var7 = nUUNvUVNv.C00OOC00oO(var4, var5);
         float var8 = this.uUnuvNvvNU.C00OOC00oO(var5);
         float var9 = nUUNvUVNv.uUnuvNvvNU(var4, var5);

         for (int var10 = var2; var10 < var1.size(); var10++) {
            var1.set(
               var10,
               ((NVUVNNunvvNN)var1.get(var10))
                  .UuUVuuUu(var6, var7, var8, var9)
                  .UuUVuuUu(var3.scale(), var3.pivotX(), var3.pivotY(), var3.translateX(), var3.translateY())
            );
         }
      }
   }

   @Generated
   public vUNUUVnnUUN(UvNNVuVnUn var1, UUnunVVvvNN var2, nUUNvUVNv var3) {
      this.UuUVuuUu = var1;
      this.C00OOC00oO = var2;
      this.uUnuvNvvNU = var3;
   }
}
