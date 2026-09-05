package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import net.minecraft.class_408;
import org.wild.module.api.Module;

@vuUuvvvNnVV(
   UuUVuuUu = "ArrayList",
   C00OOC00oO = "n"
)
public final class cOC0cc0cO00o extends nnvNuuNvvuu {
   private static final String c0oOOCcCoC0 = "Прямоугольник";
   private static final String VVnVNnunVvu = "Обволакивание";
   private static final String unNNVVNnvvV = "Классический";
   private static final String NuunnvnN = "Новый";
   private static final String NVUunUNUN = "Ferrofluid SDF";
   private static final cOC0cc0cO00o UUVNuUNUvUnV = new cOC0cc0cO00o();
   private static final int vuvnUnVnUNnV = 96;
   private static final List<cOC0cc0cO00o.NVnVnNnN> nnuUVNUuvvVU = new ArrayList<>(64);
   private static final Map<Module, cOC0cc0cO00o.NVnVnNnN> nVVUuvuNnUN = new IdentityHashMap<>(128);
   private static final Cc0cOoOcC0o nNnVnUNVV = new Cc0cOoOcC0o(0.068F, 0.72F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o nuunNvv = new Cc0cOoOcC0o(0.105F, 0.84F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o uUVVvVVNvvn = new Cc0cOoOcC0o(0.064F, 0.76F, 0.01F, 0.01F);
   private static final Cc0cOoOcC0o vvUVNVvvNUv = new Cc0cOoOcC0o(0.075F, 0.7F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o UuNnnVnuNNV = new Cc0cOoOcC0o(0.082F, 0.62F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o uUVvnUuNvvN = new Cc0cOoOcC0o(0.12F, 0.82F, 0.001F, 0.001F);
   static final Cc0cOoOcC0o UUuUnNVNuuv = new Cc0cOoOcC0o(0.07F, 0.68F, 0.01F, 0.01F);
   static final Cc0cOoOcC0o NVuNUuVnVUN = new Cc0cOoOcC0o(0.078F, 0.66F, 0.01F, 0.01F);
   private static final Cc0cOoOcC0o NVuunNnvvvVu = new Cc0cOoOcC0o(0.09F, 0.74F, 0.001F, 0.001F);
   private static final Cc0cOoOcC0o vNnNuuvVn = new Cc0cOoOcC0o(0.062F, 0.8F, 0.001F, 0.001F);
   private static final UUNnvUVnnnnN VUuuVUnun = new UUNnvUVnnnnN(0.0F);
   private static final UUNnvUVnnnnN vVVuuVVv = new UUNnvUVnnnnN(0.0F);
   private static final UUNnvUVnnnnN VuunNUUUvu = new UUNnvUVnnnnN(0.0F);
   private static final UUNnvUVnnnnN NNUUNUuVNNVn = new UUNnvUVnnnnN(0.0F);
   private static final UUNnvUVnnnnN VvVvnNUnvuvV = new UUNnvUVnnnnN(0.0F);
   private static final UUNnvUVnnnnN ccOO0COcoco0 = new UUNnvUVnnnnN(0.0F);
   private static final VVnnnnN NUVvUUVuVNVv = new VVnnnnN();
   private static final VVnnnnN nNuVunNUVu = new VVnnnnN();
   private static final VVnnnnN UNvvunVVn = new VVnnnnN();
   private static final VVnnnnN UnvuVuVnNuvu = new VVnnnnN();
   private static final float[] UvNNVUVNVuvV = new float[384];
   private static final float[] NnunUUnU = new float[384];
   private static float[] nvuVvuNnNUnv = new float[96];
   private static float[] NnVnNVN = new float[96];
   private static boolean vnvvNvUnVv;
   public static final ArrayList<Module> UuUVuuUu = new ArrayList<>(64);
   private final VUVnvvnNN OCOocoOoOO = new VUVnvvnNN(
      "Фильтр", new vvNnnUNnVvn("Combat", true), new vvNnnUNnVvn("Movement", true), new vvNnnUNnVvn("Player", true), new vvNnnUNnVvn("Misc", true)
   );
   private final VUVnvvnNN o0Ooc0COOoc = new VUVnvvnNN(
      "Вид",
      new vvNnnUNnVvn("Иконки категорий", true),
      new vvNnnUNnVvn("Индикатор", true),
      new vvNnnUNnVvn("Мягкое свечение", true),
      new vvNnnUNnVvn("Показывать бинд", false)
   );
   private final UvNnUnuNUUU nvvnUnUn = new UvNnUnuNUUU("Стиль отображения", "Новый", "Классический", "Новый");
   private final UvNnUnuNUUU UnUUVuVunvVu = new UvNnUnuNUUU("Форма фона", "Прямоугольник", "Прямоугольник", "Обволакивание");
   private final nNUuNvVn nnvuvUNuUnN = new nNUuNvVn("Интервал строк", 0.0F, 0.0F, 8.0F, 0.5F, false);
   private final vvNnnUNnVvn UVnuVUUVnnU = new vvNnnUNnVvn("Ferrofluid SDF", true);
   private final nNUuNvVn VunnVNvNV = new nNUuNvVn("Слияние капель", 12.0F, 4.0F, 24.0F, 0.5F, false)
      .UuUVuuUu(() -> !this.UVnuVUUVnnU.uUnuvNvvNU() && !this.UuuNnUvUuv());

   private cOC0cc0cO00o() {
      this.UuUVuuUu(new nvUuvVvuuN[]{this.OCOocoOoOO, this.o0Ooc0COOoc, this.nvvnUnUn, this.UVnuVUUVnnU, this.VunnVNvNV, this.UnUUVuVunvVu, this.nnvuvUNuUnN});
      uNvNvUNUnuu.UuUVuuUu(this);
   }

   public static cOC0cc0cO00o C00OOC00oO() {
      return UUVNuUNUvUnV;
   }

   public static void UuUVuuUu(UnVNvNnU var0) {
      UUVNuUNUvUnV.C00OOC00oO(var0);
   }

   private void C00OOC00oO(UnVNvNnU var1) {
      if (O000c0oocoo.a_.field_1724 != null
         && ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null
         && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null) {
         this.uVUVnuvnuVuv();
         if (this.UvnvNVnnnnNU()) {
            this.uUnuvNvvNU(var1);
         } else {
            this.vVvUvVVuuNvV(var1);
         }
      }
   }

   private boolean UvnvNVnnnnNU() {
      return this.nvvnUnUn.C00OOC00oO("Классический");
   }

   private void uUnuvNvvNU(UnVNvNnU var1) {
      boolean var2 = !nnuUVNUuvvVU.isEmpty() || O000c0oocoo.a_.field_1755 instanceof class_408;
      NUVvUUVuVNVv.UuUVuuUu();
      NUVvUUVuVNVv.UuUVuuUu(var2 ? 1.0 : 0.0, 0.22F, VvVUUNUu.UnUNVVVNuv, false);
      float var3 = NUVvUUVuVNVv.uNNnnnuuuN();
      if (!(var3 <= 0.01F)) {
         boolean var4 = this.o0Ooc0COOoc.C00OOC00oO("Иконки категорий");
         boolean var5 = this.o0Ooc0COOoc.C00OOC00oO("Индикатор");
         boolean var6 = this.o0Ooc0COOoc.C00OOC00oO("Мягкое свечение");
         boolean var7 = this.o0Ooc0COOoc.C00OOC00oO("Показывать бинд");
         float var8 = 24.0F;
         float var9 = 32.0F;
         float var10 = this.nnvuvUNuUnN.uUnuvNvvNU();
         float var11 = 13.0F;
         float var12 = 4.0F;
         float var13 = 0.0F;
         float var14 = 0.0F;
         int var15 = 0;

         for (cOC0cc0cO00o.NVnVnNnN var17 : nnuUVNUuvvVU) {
            float var18 = var17.uUnuvNvvNU.uNNnnnuuuN();
            if (!(var18 <= 0.01F)) {
               var15++;
               var13 = Math.max(var13, var17.UuUVuuUu(var8, var11, var5, var4, var7));
               var14 += var9 * var18;
               if (var15 > 1) {
                  var14 += var10 * var18;
               }
            }
         }

         boolean var51 = var15 > 0;
         if (!var51) {
            var13 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, "Нет активных модулей ", var8) + var11 * 2.0F;
            var14 = var9;
         }

         float var52 = var13 + var12 * 2.0F;
         float var53 = var14 + var12 * 2.0F;
         nNuVunNUVu.UuUVuuUu();
         UNvvunVVn.UuUVuuUu();
         nNuVunNUVu.UuUVuuUu(var52, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
         UNvvunVVn.UuUVuuUu(var53, 0.18F, VvVUUNUu.UnUNVVVNuv, false);
         float var19 = Math.max(32.0F, nNuVunNUVu.uNNnnnuuuN());
         float var20 = Math.max(32.0F, UNvvunVVn.uNNnnnuuuN());
         float var21 = O000c0oocoo.a_.method_22683().method_4489();
         float var22 = Math.max(10.0F, var21 - var19 - 10.0F);
         float var23 = 120.0F;
         nNuUNVu.nvnNNunvv var24 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_ArrayList", var22, var23, var19, var20);
         float var25 = var24.C00OOC00oO;
         float var26 = var24.uUnuvNvvNU;
         float var27 = var24.vVvUvVVuuNvV;
         float var28 = var24.uNNnnnuuuN;
         this.UuUVuuUu(var25, var26, var27, var28);
         float var29 = var27 / Math.max(1.0F, var19);
         float var30 = var28 / Math.max(1.0F, var20);
         float var31 = Math.min(var29, var30);
         float var32 = var9 * var30;
         float var33 = var10 * var30;
         float var34 = var11 * var29;
         float var35 = var12 * var29;
         float var36 = var12 * var30;
         float var37 = var8 * var31;
         float var38 = var3 * this.uVunuUNVVUUV.uUnuvNvvNU();
         int var39 = this.uNNnnnuuuN(var38);
         int var40 = this.nuUnNvnuUu(var38);
         float var41 = var25 + var27 * 0.5F > var21 * 0.5F ? 1.0F : 0.0F;
         UnvuVuVnNuvu.UuUVuuUu();
         UnvuVuVnNuvu.UuUVuuUu(var41, 0.26F, VvVUUNUu.UnUNVVVNuv, false);
         float var42 = UnvuVuVnNuvu.uNNnnnuuuN();
         float var43 = var13 * var29;
         float var44 = var26 + var36;
         if (var51) {
            this.UuUVuuUu(var1, var25 + var35, var44, var32, var33, var11, var8, var29, var30, var38, var5, var4, var7, var6, var42);

            for (cOC0cc0cO00o.NVnVnNnN var46 : nnuUVNUuvvVU) {
               float var47 = var46.uUnuvNvvNU.uNNnnnuuuN();
               if (!(var47 <= 0.01F)) {
                  float var48 = var46.UuUVuuUu(var8, var11, var5, var4, var7);
                  float var49 = Math.max(1.0F, var48 * var29 * var47);
                  float var50 = var25 + var35 + (var43 - var49) * var42;
                  this.UuUVuuUu(var1, var46, var50, var44, var49, var32, var34, var37, var29, var30, var38, var47, var39, var40, var5, var4, var7, var42);
                  var44 += var32 * var47 + var33 * var47;
               }
            }
         } else {
            this.UuUVuuUu(var1, var25 + var35, var44, Math.max(1.0F, var27 - var35 * 2.0F), var32, var34, var37, var38, var40, true);
         }

         nNuUNVu.UuUVuuUu().UuUVuuUu(var24);
         UuUuVnVvnvn.UuUVuuUu(var1, this, var24, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502());
      }
   }

   private void vVvUvVVuuNvV(UnVNvNnU var1) {
      boolean var2 = !nnuUVNUuvvVU.isEmpty() || O000c0oocoo.a_.field_1755 instanceof class_408;
      if (var2 && !vnvvNvUnVv) {
         ccOO0COcoco0.uUnuvNvvNU(Math.max(ccOO0COcoco0.C00OOC00oO(), 1.2F));
         VvVvnNUnvuvV.UuUVuuUu(0.0F);
      }

      vnvvNvUnVv = var2;
      float var3 = UnUNVVVNuv(VUuuVUnun.UuUVuuUu(var2 ? 1.0F : 0.0F, var2 ? nNnVnUNVV : nuunNvv));
      float var4 = UnUNVVVNuv(VvVvnNUnvuvV.UuUVuuUu(var2 ? 1.0F : 0.0F, NVuunNnvvvVu));
      float var5 = Math.max(0.0F, ccOO0COcoco0.UuUVuuUu(0.0F, vNnNuuvVn));
      if (!(var3 <= 0.01F)) {
         boolean var6 = this.o0Ooc0COOoc.C00OOC00oO("Иконки категорий");
         boolean var7 = this.o0Ooc0COOoc.C00OOC00oO("Индикатор");
         boolean var8 = this.o0Ooc0COOoc.C00OOC00oO("Мягкое свечение");
         boolean var9 = this.o0Ooc0COOoc.C00OOC00oO("Показывать бинд");
         float var10 = 24.0F;
         float var11 = 32.0F;
         float var12 = this.nnvuvUNuUnN.uUnuvNvvNU();
         float var13 = 13.0F;
         float var14 = 4.0F;
         float var15 = 0.0F;
         float var16 = 0.0F;
         int var17 = 0;

         for (cOC0cc0cO00o.NVnVnNnN var19 : nnuUVNUuvvVU) {
            float var20 = UnUNVVVNuv(var19.vVvUvVVuuNvV.C00OOC00oO());
            if (!(var20 <= 0.01F) || !(Math.abs(var19.vVvUvVVuuNvV.uUnuvNvvNU()) <= 0.01F)) {
               var17++;
               var15 = Math.max(var15, var19.UuUVuuUu(var10, var13, var7, var6, var9));
               var16 += var11 * var20;
               if (var17 > 1) {
                  var16 += var12 * var20;
               }
            }
         }

         boolean var56 = var17 > 0;
         if (!var56) {
            var15 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, "Нет активных модулей ", var10) + var13 * 2.0F;
            var16 = var11;
         }

         float var57 = var15 + var14 * 2.0F;
         float var58 = var16 + var14 * 2.0F;
         float var21 = Math.max(32.0F, vVVuuVVv.UuUVuuUu(var57, uUVVvVVNvvn));
         float var22 = Math.max(32.0F, VuunNUUUvu.UuUVuuUu(var58, uUVVvVVNvvn));
         float var23 = O000c0oocoo.a_.method_22683().method_4489();
         float var24 = Math.max(10.0F, var23 - var21 - 10.0F);
         float var25 = 120.0F;
         nNuUNVu.nvnNNunvv var26 = nNuUNVu.UuUVuuUu().UuUVuuUu("HUD_ArrayList", var24, var25, var21, var22);
         float var27 = var26.C00OOC00oO;
         float var28 = var26.uUnuvNvvNU;
         float var29 = var26.vVvUvVVuuNvV;
         float var30 = var26.uNNnnnuuuN;
         this.UuUVuuUu(var27, var28, var29, var30);
         float var31 = var29 / Math.max(1.0F, var21);
         float var32 = var30 / Math.max(1.0F, var22);
         float var33 = Math.min(var31, var32);
         float var34 = var11 * var32;
         float var35 = var12 * var32;
         float var36 = var13 * var31;
         float var37 = var14 * var31;
         float var38 = var14 * var32;
         float var39 = var10 * var33;
         float var40 = var3 * this.uVunuUNVVUUV.uUnuvNvvNU();
         int var41 = this.uNNnnnuuuN(var40);
         int var42 = this.nuUnNvnuUu(var40);
         float var43 = var27 + var29 * 0.5F > var23 * 0.5F ? 1.0F : 0.0F;
         float var44 = UnUNVVVNuv(NNUUNUuVNNVn.UuUVuuUu(var43, vvUVNVvvNUv));
         float var45 = var15 * var31;
         float var46 = var27 + var37;
         float var47 = var28 + var38;
         nNuUNVu var48 = nNuUNVu.UuUVuuUu();
         float var49 = var48.VVuuUN();
         float var50 = var48.vNUvnnVnUvu();
         float var51 = O000c0oocoo.a_.field_1755 instanceof class_408 && UuUVuuUu(var49, var50, var27, var28, var29, var30) ? 1.0F : 0.0F;
         boolean var52 = this.nvUVNnuu() && !this.UnUUVuVunvVu.C00OOC00oO("Обволакивание");
         int var53 = var56 ? this.UuUVuuUu(var46, var47, var45, var34, var35, var10, var13, var31, var44, var7, var6, var9, var17, var52) : 0;
         if (var56 && var53 > 0) {
            this.UuUVuuUu(var1, var32, var40 * (0.82F + var4 * 0.18F), var7, var8, var44, var49, var50, var51, var5);

            for (cOC0cc0cO00o.NVnVnNnN var55 : nnuUVNUuvvVU) {
               if (var55.UuUVuuUu()) {
                  this.C00OOC00oO(
                     var1,
                     var55,
                     var55.uVUVnuvnuVuv,
                     var55.NVNnnvnuunNv,
                     var55.uVunuUNVVUUV,
                     var55.UNnVVNvvnVvU,
                     var36,
                     var39,
                     var31,
                     var32,
                     var40,
                     UnUNVVVNuv(var55.vVvUvVVuuNvV.C00OOC00oO()),
                     var41,
                     var42,
                     var7,
                     var6,
                     var9,
                     var44
                  );
               }
            }
         } else {
            this.UuUVuuUu(var1, var46, var47, Math.max(1.0F, var29 - var37 * 2.0F), var34, var36, var39, var40, var42, false);
         }

         nNuUNVu.UuUVuuUu().UuUVuuUu(var26);
         UuUuVnVvnvn.UuUVuuUu(var1, this, var26, nNuUNVu.UuUVuuUu(), O000c0oocoo.a_.method_22683().method_4486(), O000c0oocoo.a_.method_22683().method_4502());
      }
   }

   private int UuUVuuUu(
      float var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      boolean var10,
      boolean var11,
      boolean var12,
      int var13,
      boolean var14
   ) {
      float var15 = var2;
      int var16 = 0;

      for (cOC0cc0cO00o.NVnVnNnN var18 : nnuUVNUuvvVU) {
         float var19 = UnUNVVVNuv(var18.vVvUvVVuuNvV.C00OOC00oO());
         if (var19 <= 0.01F && Math.abs(var18.vVvUvVVuuNvV.uUnuvNvvNU()) <= 0.01F) {
            var18.UnUNuUU = false;
         } else {
            float var20 = Math.max(1.0F, var18.UuUVuuUu(var6, var7, var10, var11, var12) * var8);
            float var21 = var14 ? var3 : Math.max(1.0F, var20 * (0.32F + var19 * 0.68F));
            float var22 = Math.max(0.0F, var4 * var19);
            float var23 = var1 + (var3 - var21) * var9;
            var18.UuUVuuUu(var23, var15, var21, var22);
            var18.UnUNuUU = var18.uVunuUNVVUUV > 0.75F && var18.UNnVVNvvnVvU > 0.75F;
            var15 += var4 * var19;
            if (++var16 < var13) {
               var15 += var5 * var19;
            }
         }
      }

      return var16;
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, boolean var4, boolean var5, float var6, float var7, float var8, float var9, float var10) {
      int var11 = 0;
      float var12 = Float.MAX_VALUE;
      float var13 = Float.MAX_VALUE;
      float var14 = -Float.MAX_VALUE;
      float var15 = -Float.MAX_VALUE;
      float var16 = Float.MAX_VALUE;
      float var17 = 0.0F;
      float var18 = 0.0F;

      for (cOC0cc0cO00o.NVnVnNnN var20 : nnuUVNUuvvVU) {
         if (var20.UuUVuuUu() && var11 < 96) {
            var11++;
            var12 = Math.min(var12, var20.uVUVnuvnuVuv);
            var13 = Math.min(var13, var20.NVNnnvnuunNv);
            var14 = Math.max(var14, var20.uVUVnuvnuVuv + var20.uVunuUNVVUUV);
            var15 = Math.max(var15, var20.NVNnnvnuunNv + var20.UNnVVNvvnVvU);
            var16 = Math.min(var16, var20.uVunuUNVVUUV);
            var17 = Math.max(var17, var20.uVunuUNVVUUV);
            var18 = Math.max(var18, Math.min(1.0F, (Math.abs(var20.VVuuUN.uUnuvNvvNU()) + Math.abs(var20.vNUvnnVnUvu.uUnuvNvvNU())) * 0.012F));
         }
      }

      if (var11 > 0 && var12 != Float.MAX_VALUE && var13 != Float.MAX_VALUE && !(var14 <= var12) && !(var15 <= var13)) {
         boolean var34 = this.UnUUVuVunvVu.C00OOC00oO("Обволакивание");
         boolean var35 = this.UVnuVUUVnnU.uUnuvNvvNU() || this.UuuNnUvUuv();
         float var21 = Math.max(1.0F, var15 - var13);
         float var22 = Math.max(1.0F, var21 / var11);
         float var23 = Math.min(15.0F * var2, var22 * 0.5F);
         if (nvuVvuNnNUnv.length < var11) {
            nvuVvuNnNUnv = new float[var11];
            NnVnNVN = new float[var11];
         }

         float[] var24 = nvuVvuNnNUnv;
         float[] var25 = NnVnNVN;
         float var26 = var34 ? var17 : var14 - var12;
         float var27 = Math.max(var10, var18);
         int var28 = 0;

         for (cOC0cc0cO00o.NVnVnNnN var30 : nnuUVNUuvvVU) {
            if (var30.UuUVuuUu() && var28 < var11) {
               int var31 = var28 * 4;
               float var32 = var34 ? var30.uVUVnuvnuVuv : var12;
               float var33 = var34 ? var30.uVunuUNVVUUV : var26;
               UvNNVUVNVuvV[var31] = var32;
               UvNNVUVNVuvV[var31 + 1] = var30.NVNnnvnuunNv;
               UvNNVUVNVuvV[var31 + 2] = var33;
               UvNNVUVNVuvV[var31 + 3] = var30.UNnVVNvvnVvU;
               NnunUUnU[var31] = var30.VVuuUN.uUnuvNvvNU();
               NnunUUnU[var31 + 1] = var30.vNUvnnVnUvu.uUnuvNvvNU();
               NnunUUnU[var31 + 2] = Math.max(0.0F, var30.nuUnNvnuUu.C00OOC00oO());
               NnunUUnU[var31 + 3] = UnUNVVVNuv(var30.uNNnnnuuuN.C00OOC00oO());
               var24[var28] = var33;
               var25[var28] = Math.max(1.0F, var30.NVNnnvnuunNv - var13 + var30.UNnVVNvvnVvU);
               var27 = Math.max(var27, NnunUUnU[var31 + 2]);
               var28++;
            }
         }

         int var36 = this.UuuNnUvUuv(var3);
         float var37 = this.vNVuvnUUnuUn();
         if (var35) {
            float var38 = Math.max(2.0F, this.VunnVNvNV.uUnuvNvvNU() * var2);
            float var40 = this.nvUVNnuu() ? 1.0F : 0.0F;
            boolean var41 = vUUnNuuU.UuUVuuUu(
               var1,
               O000c0oocoo.a_.method_22683().method_4489(),
               O000c0oocoo.a_.method_22683().method_4506(),
               UvNNVUVNVuvV,
               NnunUUnU,
               var11,
               var23,
               var6,
               var3,
               var36,
               this.vVvUvVVuuNvV(var3),
               this.vNUvnnVnUvu(var3),
               this.uVUuuVnNVU(var3),
               this.uNNnnnuuuN() || this.UuuNnUvUuv(),
               var5 || this.vVvUvVVuuNvV(),
               var4,
               var37,
               var7,
               var8,
               var9,
               var27,
               var38,
               var40
            );
            if (var41) {
               return;
            }
         }

         if (this.nvUVNnuu()) {
            this.UuUVuuUu(var1, var12, var13, var26, var21, var23, var3);
         } else if (this.nUUVuvU()) {
            this.UuUVuuUu(var1, var12, var13, var26, var21, var23, var3);
         } else {
            float var39 = Math.max(1.5F, 2.0F * var2);
            if (var5) {
               this.UuUVuuUu(
                  var1,
                  var12,
                  var13,
                  var26,
                  var24,
                  var25,
                  var11,
                  var16,
                  var21,
                  var22,
                  var2,
                  var23,
                  var39,
                  VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(var3), Math.round(52.0F * var3)),
                  Math.max(8.0F, 10.0F * var2),
                  Math.max(1.0F, 1.4F * var2),
                  var6
               );
               this.UuUVuuUu(
                  var1,
                  var12,
                  var13,
                  var26,
                  var24,
                  var25,
                  var11,
                  var16,
                  var21,
                  var22,
                  var2,
                  var23,
                  var39,
                  VnVnuUn.UuUVuuUu(this.uVUuuVnNVU(var3), Math.round(32.0F * var3)),
                  Math.max(16.0F, 22.0F * var2),
                  Math.max(2.0F, 3.0F * var2),
                  var6
               );
            }

            if (this.UvUvUNuvNU.C00OOC00oO("Тень")) {
               this.UuUVuuUu(
                  var1,
                  var12,
                  var13,
                  var26,
                  var24,
                  var25,
                  var11,
                  var16,
                  var21,
                  var22,
                  var2,
                  var23,
                  var39,
                  this.nvUVNnuu(var3),
                  Math.max(4.0F, 4.0F * var2),
                  Math.max(1.0F, 1.0F * var2),
                  var6
               );
            }

            this.UuUVuuUu(var1, var12, var13, var26, var24, var25, var11, var16, var21, var22, var2, var23, var39, var36, var3, false, true, var6);
            if (this.uNNnnnuuuN()) {
               this.UuUVuuUu(
                  var1,
                  var12,
                  var13,
                  var26,
                  var24,
                  var25,
                  var11,
                  var16,
                  var21,
                  var22,
                  var2,
                  var23,
                  this.vVvUvVVuuNvV(var3),
                  Math.max(1.0F, this.uUnuvNvvNU() * 0.55F),
                  var6
               );
            }
         }
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float var5,
      float var6,
      float var7,
      float var8,
      float var9,
      float var10,
      boolean var11,
      boolean var12,
      boolean var13,
      boolean var14,
      float var15
   ) {
      int var16 = 0;

      for (cOC0cc0cO00o.NVnVnNnN var18 : nnuUVNUuvvVU) {
         float var19 = var18.uUnuvNvvNU.uNNnnnuuuN();
         if (!(var19 <= 0.01F)) {
            var16++;
         }
      }

      if (var16 > 0) {
         if (nvuVvuNnNUnv.length < var16) {
            nvuVvuNnNUnv = new float[var16];
            NnVnNVN = new float[var16];
         }

         float[] var31 = nvuVvuNnNUnv;
         float[] var32 = NnVnNVN;
         float var33 = 0.0F;
         float var20 = Float.MAX_VALUE;
         float var21 = 0.0F;
         int var22 = 0;

         for (cOC0cc0cO00o.NVnVnNnN var24 : nnuUVNUuvvVU) {
            float var25 = var24.uUnuvNvvNU.uNNnnnuuuN();
            if (!(var25 <= 0.01F)) {
               float var26 = Math.max(1.0F, var24.UuUVuuUu(var7, var6, var11, var12, var13) * var8);
               float var27 = var4 * var25 + (var22 < var16 - 1 ? var5 * var25 : 0.0F);
               var33 += var27;
               var31[var22] = var26;
               var32[var22] = var33;
               var20 = Math.min(var20, var26);
               var21 = Math.max(var21, var26);
               var22++;
            }
         }

         if (!(var20 <= 1.0F) && !(var33 <= 1.0F)) {
            float var34 = Math.min(15.0F * var9, var4 * 0.5F);
            int var35 = this.nUUVuvU(var10);
            float var36 = Math.max(1.5F, 2.0F * var8);
            boolean var37 = this.UnUUVuVunvVu.C00OOC00oO("Обволакивание");
            if (this.nUUVuvU()) {
               this.UuUVuuUu(var1, var2, var3, var21, var33, var34, var10);
               if (var11) {
                  float var39 = Math.max(1.35F, 1.8F * var8);
                  float var40 = var2 + UuUVuuUu(5.0F * var8, var21 - 5.0F * var8 - var39, var15);
                  var1.C00OOC00oO(
                     var40, var3 + 5.0F * var9, var39, Math.max(1.0F, var33 - 10.0F * var9), var39, this.vNUvnnVnUvu(var10), this.uVUuuVnNVU(var10)
                  );
               }
            } else {
               if (var14) {
                  if (var37) {
                     this.UuUVuuUu(
                        var1,
                        var2,
                        var3,
                        var21,
                        var31,
                        var32,
                        var16,
                        var20,
                        var33,
                        var4,
                        var9,
                        var34,
                        var36,
                        VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(var10), Math.round(52.0F * var10)),
                        Math.max(8.0F, 10.0F * var9),
                        Math.max(1.0F, 1.4F * var9),
                        var15
                     );
                     this.UuUVuuUu(
                        var1,
                        var2,
                        var3,
                        var21,
                        var31,
                        var32,
                        var16,
                        var20,
                        var33,
                        var4,
                        var9,
                        var34,
                        var36,
                        VnVnuUn.UuUVuuUu(this.uVUuuVnNVU(var10), Math.round(32.0F * var10)),
                        Math.max(16.0F, 22.0F * var9),
                        Math.max(2.0F, 3.0F * var9),
                        var15
                     );
                  } else {
                     var1.UuUVuuUu(
                        var2,
                        var3,
                        var21,
                        var33,
                        var34,
                        Math.max(8.0F, 10.0F * var9),
                        Math.max(1.0F, 1.4F * var9),
                        VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(var10), Math.round(52.0F * var10))
                     );
                     var1.UuUVuuUu(
                        var2,
                        var3,
                        var21,
                        var33,
                        var34,
                        Math.max(16.0F, 22.0F * var9),
                        Math.max(2.0F, 3.0F * var9),
                        VnVnuUn.UuUVuuUu(this.uVUuuVnNVU(var10), Math.round(32.0F * var10))
                     );
                  }
               }

               if (this.UvUvUNuvNU.C00OOC00oO("Тень")) {
                  if (var37) {
                     this.UuUVuuUu(
                        var1,
                        var2,
                        var3,
                        var21,
                        var31,
                        var32,
                        var16,
                        var20,
                        var33,
                        var4,
                        var9,
                        var34,
                        var36,
                        this.nvUVNnuu(var10),
                        Math.max(4.0F, 4.0F * var9),
                        Math.max(1.0F, 1.0F * var9),
                        var15
                     );
                  } else {
                     var1.UuUVuuUu(var2, var3, var21, var33, var34, Math.max(4.0F, 4.0F * var9), Math.max(1.0F, 1.0F * var9), this.nvUVNnuu(var10));
                  }
               }

               if (this.vuuuNvNuv()) {
                  if (var37) {
                     this.UuUVuuUu(var1, var2, var3, var21, var31, var32, var16, var20, var33, var4, var9, var34, var36, var35, var10, true, false, var15);
                  } else {
                     var1.UuUVuuUu(23.0F);
                     var1.UuUVuuUu(var2, var3, var21, var33, var34, var10);
                  }
               }

               if (var37) {
                  this.UuUVuuUu(var1, var2, var3, var21, var31, var32, var16, var20, var33, var4, var9, var34, var36, var35, var10, false, true, var15);
               } else {
                  var1.UuUVuuUu(var2, var3, var21, var33, var34, var35);
               }

               if (this.uNNnnnuuuN()) {
                  if (var37) {
                     this.UuUVuuUu(
                        var1,
                        var2,
                        var3,
                        var21,
                        var31,
                        var32,
                        var16,
                        var20,
                        var33,
                        var4,
                        var9,
                        var34,
                        this.vVvUvVVuuNvV(var10),
                        Math.max(1.0F, this.uUnuvNvvNU() * 0.55F),
                        var15
                     );
                  } else {
                     var1.UuUVuuUu(var2, var3, var21, var33, var34, this.vVvUvVVuuNvV(var10), Math.max(1.0F, this.uUnuvNvvNU() * 0.55F));
                  }
               }

               if (var11) {
                  float var38 = Math.max(1.35F, 1.8F * var8);
                  float var28 = var2 + UuUVuuUu(5.0F * var8, var21 - 5.0F * var8 - var38, var15);
                  int var29 = this.vNUvnnVnUvu(var10);
                  int var30 = this.uVUuuVnNVU(var10);
                  var1.C00OOC00oO(var28, var3 + 5.0F * var9, var38, Math.max(1.0F, var33 - 10.0F * var9), var38, var29, var30);
               }
            }
         }
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float[] var5,
      float[] var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13,
      float var14,
      float var15
   ) {
      if (var7 > 0 && VnVnuUn.UuUVuuUu(var13) > 0) {
         float var16 = Math.max(1.0F, var14);
         float var17 = var16 * 0.5F;
         UuUVuuUu(var1, var2, var4, 0.0F, var3 + var12, var16, Math.max(1.0F, var9 - var12 * 2.0F), var17, var13, var15);
         UuUVuuUu(var1, var2, var4, var12, var3, Math.max(1.0F, var5[0] - var12 * 2.0F), var16, var17, var13, var15);

         for (int var18 = 0; var18 < var7; var18++) {
            float var19 = var18 == 0 ? 0.0F : var6[var18 - 1];
            float var20 = var6[var18];
            float var21 = var18 == 0 ? var5[var18] : var5[var18 - 1];
            float var22 = var18 == var7 - 1 ? var5[var18] : var5[var18 + 1];
            float var23 = var18 == 0 ? var12 : (var5[var18] > var21 + 0.5F ? this.C00OOC00oO(var12, var5[var18] - var21, var10, var11) : 0.0F);
            float var24 = var18 == var7 - 1 ? var12 : (var5[var18] > var22 + 0.5F ? this.C00OOC00oO(var12, var5[var18] - var22, var10, var11) : 0.0F);
            float var25 = var3 + var19 + var23;
            float var26 = var3 + var20 - var24;
            if (var26 > var25) {
               UuUVuuUu(var1, var2, var4, var5[var18] - var16, var25, var16, var26 - var25, var17, var13, var15);
            }

            if (var18 < var7 - 1 && Math.abs(var5[var18] - var5[var18 + 1]) > 0.5F) {
               float var27 = Math.min(var5[var18], var5[var18 + 1]);
               float var28 = Math.max(var5[var18], var5[var18 + 1]);
               float var29 = var28 - var27;
               float var30 = this.C00OOC00oO(var12, var29, var10, var11);
               UuUVuuUu(var1, var2, var4, var27 + var30 * 0.35F, var3 + var20 - var17, Math.max(1.0F, var29 - var30 * 0.7F), var16, var17, var13, var15);
            }
         }

         float var31 = var5[var7 - 1];
         UuUVuuUu(var1, var2, var4, var12, var3 + var9 - var16, Math.max(1.0F, var31 - var12 * 2.0F), var16, var17, var13, var15);
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float[] var5,
      float[] var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      float var15,
      boolean var16,
      boolean var17,
      float var18
   ) {
      for (int var19 = 0; var19 < var7; var19++) {
         float var20 = var19 == 0 ? 0.0F : var6[var19 - 1];
         float var21 = var6[var19] - var20;
         float var22 = var19 == 0 ? var5[var19] : var5[var19 - 1];
         float var23 = var19 == var7 - 1 ? var5[var19] : var5[var19 + 1];
         float var24 = var19 == 0 ? var12 : 0.0F;
         float var25 = var19 == var7 - 1 ? var12 : 0.0F;
         float var26 = var19 == 0 ? var12 : (var5[var19] > var22 + 0.5F ? this.C00OOC00oO(var12, var5[var19] - var22, var10, var11) : 0.0F);
         float var27 = var19 == var7 - 1 ? var12 : (var5[var19] > var23 + 0.5F ? this.C00OOC00oO(var12, var5[var19] - var23, var10, var11) : 0.0F);
         this.UuUVuuUu(var1, var2, var3 + var20, var4, 0.0F, var5[var19], var21, var24, var26, var27, var25, var14, var15, var16, var17, var18);
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float[] var5,
      float[] var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      int var13,
      float var14
   ) {
      int var15 = VnVnuUn.UuUVuuUu(var13);
      if (var15 > 0) {
         float var16 = 0.0F;
         this.UuUVuuUu(var1, var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var16, var13, 1.0F, false, true, var14);
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      float var2,
      float var3,
      float var4,
      float[] var5,
      float[] var6,
      int var7,
      float var8,
      float var9,
      float var10,
      float var11,
      float var12,
      float var13,
      int var14,
      float var15,
      float var16,
      float var17
   ) {
      if (VnVnuUn.UuUVuuUu(var14) > 0 && !(var15 <= 0.0F) && !(var16 <= 0.0F)) {
         for (int var18 = 0; var18 < var7; var18++) {
            float var19 = var18 == 0 ? 0.0F : var6[var18 - 1];
            float var20 = var6[var18] - var19;
            float var21 = var18 == 0 ? var5[var18] : var5[var18 - 1];
            float var22 = var18 == var7 - 1 ? var5[var18] : var5[var18 + 1];
            float var23 = var18 == 0 ? var12 : 0.0F;
            float var24 = var18 == var7 - 1 ? var12 : 0.0F;
            float var25 = var18 == 0 ? var12 : (var5[var18] > var21 + 0.5F ? this.C00OOC00oO(var12, var5[var18] - var21, var10, var11) : 0.0F);
            float var26 = var18 == var7 - 1 ? var12 : (var5[var18] > var22 + 0.5F ? this.C00OOC00oO(var12, var5[var18] - var22, var10, var11) : 0.0F);
            this.UuUVuuUu(var1, var2, var3 + var19, var4, 0.0F, var5[var18], var20, var23, var25, var26, var24, var14, var15, var16, var17);
         }
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
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
      int var12,
      float var13,
      float var14,
      float var15
   ) {
      if (!(var6 <= 0.5F) && !(var7 <= 0.5F)) {
         float var16 = var2 + UuUVuuUu(var5, var4 - var5 - var6, var15);
         float var17 = UuUVuuUu(var8, var9, var15);
         float var18 = UuUVuuUu(var9, var8, var15);
         float var19 = UuUVuuUu(var10, var11, var15);
         float var20 = UuUVuuUu(var11, var10, var15);
         var1.UuUVuuUu(var16, var3, var6, var7, var17, var18, var19, var20, var13, var14, var12);
      }
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
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
      int var12,
      float var13,
      boolean var14,
      boolean var15,
      float var16
   ) {
      if (!(var6 <= 0.5F) && !(var7 <= 0.5F)) {
         float var17 = var2 + UuUVuuUu(var5, var4 - var5 - var6, var16);
         float var18 = UuUVuuUu(var8, var9, var16);
         float var19 = UuUVuuUu(var9, var8, var16);
         float var20 = UuUVuuUu(var10, var11, var16);
         float var21 = UuUVuuUu(var11, var10, var16);
         if (var14) {
            var1.UuUVuuUu(23.0F);
            var1.UuUVuuUu(var17, var3, var6, var7, var18, var19, var20, var21, var13);
         }

         if (var15) {
            var1.UuUVuuUu(var17, var3, var6, var7, var18, var19, var20, var21, var12);
         }
      }
   }

   private float C00OOC00oO(float var1, float var2, float var3, float var4) {
      float var5 = Math.max(4.0F * var4, 3.0F);
      float var6 = Math.max(0.0F, var2) * 0.72F;
      float var7 = var3 * 0.42F;
      return Math.min(var1, Math.max(var5, Math.min(var6, var7)));
   }

   private int UuuNnUvUuv(float var1) {
      int var2 = this.UuUVuuUu(var1);
      if (!"Тёмный".equals(this.uNnUnnuNUnNu.uUnuvNvvNU()) && (this.UvnvNVnnnnNU() || !this.UuuNnUvUuv())) {
         return var2;
      } else {
         int var3 = Math.round((210.0F - 92.0F * this.vNVuvnUUnuUn()) * var1);
         return VnVnuUn.UuUVuuUu(var2, Math.max(VnVnuUn.UuUVuuUu(var2), var3));
      }
   }

   private int nUUVuvU(float var1) {
      int var2 = this.UuUVuuUu(var1);
      if ("Тёмный".equals(this.uNnUnnuNUnNu.uUnuvNvvNU())) {
         int var3 = Math.round(210.0F * var1);
         return VnVnuUn.UuUVuuUu(var2, Math.max(VnVnuUn.UuUVuuUu(var2), var3));
      } else {
         return var2;
      }
   }

   private void uVUVnuvnuVuv() {
      UuUVuuUu.clear();
      nnuUVNUuvvVU.clear();
      boolean var1 = this.UvnvNVnnnnNU();

      for (Module var3 : ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO()) {
         if (var3 != null && var3.vNUvnnVnUvu != oOOOo0.Visuals && !"Menu".equals(var3.vVvUvVVuuNvV) && this.UuUVuuUu(var3.vNUvnnVnUvu)) {
            cOC0cc0cO00o.NVnVnNnN var4 = nVVUuvuNnUN.computeIfAbsent(var3, cOC0cc0cO00o.NVnVnNnN::new);
            var4.UuUVuuUu(var3);
            if (var1) {
               var4.uUnuvNvvNU.UuUVuuUu();
               var4.uUnuvNvvNU.UuUVuuUu(var3.nuUnNvnuUu ? 1.0 : 0.0, 0.23F, VvVUUNUu.UnUNVVVNuv, false);
               if (var3.nuUnNvnuUu) {
                  UuUVuuUu.add(var3);
               }

               if (var3.nuUnNvnuUu || var4.uUnuvNvvNU.uNNnnnuuuN() > 0.01F) {
                  nnuUVNUuvvVU.add(var4);
               }
            } else {
               float var5 = var4.vVvUvVVuuNvV.UuUVuuUu(var3.nuUnNvnuUu ? 1.0F : 0.0F, var3.nuUnNvnuUu ? UuNnnVnuNNV : uUVvnUuNvvN);
               var4.uNNnnnuuuN.UuUVuuUu(var3.nuUnNvnuUu ? 1.0F : 0.0F, NVuunNnvvvVu);
               var4.nuUnNvnuUu.UuUVuuUu(0.0F, vNnNuuvVn);
               if (var3.nuUnNvnuUu) {
                  UuUVuuUu.add(var3);
               }

               if (var3.nuUnNvnuUu || var5 > 0.01F || Math.abs(var4.vVvUvVVuuNvV.uUnuvNvvNU()) > 0.01F) {
                  nnuUVNUuvvVU.add(var4);
               }
            }
         }
      }

      nnuUVNUuvvVU.sort(cOC0cc0cO00o.NVnVnNnN.UuUVuuUu);
   }

   private boolean UuUVuuUu(oOOOo0 var1) {
      return switch (var1 == null ? oOOOo0.Misc : var1) {
         case Combat -> this.OCOocoOoOO.C00OOC00oO("Combat");
         case Movement -> this.OCOocoOoOO.C00OOC00oO("Movement");
         case Player -> this.OCOocoOoOO.C00OOC00oO("Player");
         case Misc -> this.OCOocoOoOO.C00OOC00oO("Misc");
         case Visuals -> false;
      };
   }

   private void UuUVuuUu(
      UnVNvNnU var1,
      cOC0cc0cO00o.NVnVnNnN var2,
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
      int var13,
      int var14,
      boolean var15,
      boolean var16,
      boolean var17,
      float var18
   ) {
      int var19 = Math.round(255.0F * var11 * var12);
      int var20 = VnVnuUn.UuUVuuUu(var13, var19);
      int var21 = VnVnuUn.UuUVuuUu(var14, Math.round(VnVnuUn.UuUVuuUu(var14) * var12));
      float var22 = var15 ? 8.0F * var9 : 0.0F;
      float var23 = var8 * 0.92F;
      float var24 = var16 && var2.UuuNnUvUuv != null ? vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vNUvnnVnUvu, var2.UuuNnUvUuv, var23) : 0.0F;
      float var25 = var16 && var2.UuuNnUvUuv != null ? 7.0F * var9 : 0.0F;
      String var26 = var17 ? var2.nUUVuvU : "";
      boolean var27 = !var26.isEmpty();
      float var28 = var27 ? 6.0F * var9 : 0.0F;
      float var29 = var27 ? vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var26, var8) : 0.0F;
      float var30 = Math.max(12.0F * var9, var5 - var7 * 2.0F - var22 - var24 - var25 - var28 - var29);
      String var31 = UuUVuuUu(var2.nvUVNnuu, var8, var30);
      float var32 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var31, var8);
      float var33 = var24 + var25 + var32 + var28 + var29;
      float var34 = var3 + var7 + var22;
      float var35 = var34 + (var24 > 0.0F ? var24 + var25 : 0.0F);
      float var36 = var3 + var5 - var7 - var22 - var33;
      float var37 = var36 + (var24 > 0.0F ? var24 + var25 : 0.0F);
      float var38 = UuUVuuUu(var34, var36, var18);
      float var39 = UuUVuuUu(var35, var37, var18);
      float var40 = var39 + var32 + var28;
      if (var16 && var2.UuuNnUvUuv != null) {
         int var41 = VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(var11), var19);
         var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var38, var4 + var6 * 0.5F + 5.0F * var10, var23, var2.UuuNnUvUuv, var41);
      }

      float var43 = var4 + var6 * 0.5F + 5.0F * var10;
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var39, var43, var8, var31, var20);
      if (var27) {
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var40, var43, var8, var26, var21);
      }

      if (var12 < 0.98F) {
         float var42 = 3.0F * var10;
         var1.C00OOC00oO(var3 + var5 - var7 * 0.5F, var4 + var6 * 0.5F, var42, 0.0F, 360.0F, var21);
      }
   }

   private void C00OOC00oO(
      UnVNvNnU var1,
      cOC0cc0cO00o.NVnVnNnN var2,
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
      int var13,
      int var14,
      boolean var15,
      boolean var16,
      boolean var17,
      float var18
   ) {
      if (!(var5 <= 2.0F) && !(var6 <= 4.0F) && !(var12 <= 0.005F)) {
         float var19 = UnUNVVVNuv(var2.uNNnnnuuuN.C00OOC00oO());
         float var20 = Math.min(1.0F, Math.max(0.0F, var2.nuUnNvnuUu.C00OOC00oO()));
         int var21 = Math.round(255.0F * var11 * var12 * (0.58F + var19 * 0.42F));
         int var22 = VnVnuUn.UuUVuuUu(var13, var21);
         int var23 = VnVnuUn.UuUVuuUu(var14, Math.round(VnVnuUn.UuUVuuUu(var14) * var12));
         float var24 = var15 ? 8.0F * var9 : 0.0F;
         float var25 = var8 * 0.92F;
         float var26 = var16 && var2.UuuNnUvUuv != null ? vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vNUvnnVnUvu, var2.UuuNnUvUuv, var25) : 0.0F;
         float var27 = var16 && var2.UuuNnUvUuv != null ? 7.0F * var9 : 0.0F;
         String var28 = var17 ? var2.nUUVuvU : "";
         boolean var29 = !var28.isEmpty();
         float var30 = var29 ? 6.0F * var9 : 0.0F;
         float var31 = var29 ? vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var28, var8) : 0.0F;
         float var32 = Math.max(12.0F * var9, var5 - var7 * 2.0F - var24 - var26 - var27 - var30 - var31);
         String var33 = UuUVuuUu(var2.nvUVNnuu, var8, var32);
         float var34 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var33, var8);
         float var35 = var26 + var27 + var34 + var30 + var31;
         float var36 = var3 + var7 + var24;
         float var37 = var36 + (var26 > 0.0F ? var26 + var27 : 0.0F);
         float var38 = var3 + var5 - var7 - var24 - var35;
         float var39 = var38 + (var26 > 0.0F ? var26 + var27 : 0.0F);
         float var40 = UuUVuuUu(var36, var38, var18);
         float var41 = UuUVuuUu(var37, var39, var18);
         float var42 = var41 + var34 + var30;
         float var43 = var4 + var6 * 0.5F + 5.0F * var10 + C00OOC00oO(var2.vNUvnnVnUvu.uUnuvNvvNU() * 0.018F, -2.8F * var10, 2.8F * var10);
         float var44 = Math.min(12.0F * var10, Math.max(1.0F, var6 * 0.5F));
         var1.UuUVuuUu(var3 + 1.0F, var4 + 1.0F, Math.max(1.0F, var5 - 2.0F), Math.max(1.0F, var6 - 2.0F), var44, var44, var44, var44);

         try {
            if (var16 && var2.UuuNnUvUuv != null) {
               int var45 = VnVnuUn.uUnuvNvvNU(VnVnuUn.UuUVuuUu(this.vNUvnnVnUvu(var11), var21), VnVnuUn.uUnuvNvvNU(255, 255, 255, var21), var20 * 0.22F);
               var1.UuUVuuUu(vNvnnVvvVUu.vNUvnnVnUvu, var40, var43, var25, var2.UuuNnUvUuv, var45);
            }

            int var49 = VnVnuUn.uUnuvNvvNU(var22, VnVnuUn.uUnuvNvvNU(255, 255, 255, var21), var20 * 0.14F);
            var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var41, var43, var8, var33, var49);
            if (var29) {
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var42, var43, var8, var28, var23);
            }
         } finally {
            var1.nuUnNvnuUu();
         }

         if (var12 < 0.98F) {
            float var50 = 3.0F * var10;
            var1.C00OOC00oO(var3 + var5 - var7 * 0.5F, var4 + var6 * 0.5F, var50, 0.0F, 360.0F, var23);
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7, float var8, int var9, boolean var10) {
      float var11 = Math.min(10.0F, var5 * 0.45F);
      this.UuUVuuUu(var1, var2, var3, var4, var5, var11, var8, var10);
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2 + var6, var3 + var5 * 0.5F + 5.0F, var7, "Нет активных модулей ", var9);
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float var6, float var7, boolean var8) {
      if (this.UvUvUNuvNU.C00OOC00oO("Тень")) {
         if (var8) {
            var1.UuUVuuUu(var2, var3, var4, var5, var6, 4.0F, 1.0F, VnVnuUn.uUnuvNvvNU(0, 0, 0, Math.round(80.0F * var7)));
         } else {
            var1.UuUVuuUu(var2, var3, var4, var5, var6, this.UnUNVVVNuv() ? 6.0F : 4.0F, 1.0F, this.nvUVNnuu(var7));
         }
      }

      if (this.vuuuNvNuv()) {
         var1.UuUVuuUu(23.0F);
         var1.UuUVuuUu(var2, var3, var4, var5, var6, var7);
      }

      if (!var8 && this.UuuNnUvUuv()) {
         this.C00OOC00oO(var1, var2, var3, var4, var5, var6, var7);
      } else if (this.nvUVNnuu()) {
         var1.UuUVuuUu(var2, var3, var4, var5, var6, this.UuUVuuUu(var7));
      } else {
         var1.UuUVuuUu(var2, var3, var4, var5, var6, this.vNUvnnVnUvu() ? this.uUnuvNvvNU(var7) : this.UuUVuuUu(var7));
         if (this.uNNnnnuuuN()) {
            var1.UuUVuuUu(var2, var3, var4, var5, var6, this.vVvUvVVuuNvV(var7), Math.max(1.0F, this.uUnuvNvvNU() * 0.55F));
         }
      }
   }

   private static void UuUVuuUu(UnVNvNnU var0, float var1, float var2, float var3, float var4, float var5, float var6, float var7, int var8, float var9) {
      var0.UuUVuuUu(var1 + UuUVuuUu(var3, var2 - var3 - var5, var9), var4, var5, var6, var7, var8);
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return var0 + (var1 - var0) * Math.max(0.0F, Math.min(1.0F, var2));
   }

   private static float UnUNVVVNuv(float var0) {
      return Math.max(0.0F, Math.min(1.0F, var0));
   }

   private static float C00OOC00oO(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static boolean UuUVuuUu(float var0, float var1, float var2, float var3, float var4, float var5) {
      return var0 >= var2 && var0 <= var2 + var4 && var1 >= var3 && var1 <= var3 + var5;
   }

   private static String UuUVuuUu(String var0, float var1, float var2) {
      if (var0 != null && !var0.isEmpty() && !(vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var0, var1) <= var2)) {
         String var3 = "...";
         float var4 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var3, var1);
         if (var4 >= var2) {
            return var3;
         } else {
            int var5 = 0;
            int var6 = var0.length();

            while (var5 < var6) {
               int var7 = var5 + var6 + 1 >>> 1;
               if (vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, var0.substring(0, var7), var1) + var4 <= var2) {
                  var5 = var7;
               } else {
                  var6 = var7 - 1;
               }
            }

            return var5 <= 0 ? var3 : var0.substring(0, var5) + var3;
         }
      } else {
         return var0 == null ? "" : var0;
      }
   }

   static final class NVnVnNnN {
      static final Comparator<cOC0cc0cO00o.NVnVnNnN> UuUVuuUu = (var0, var1) -> {
         int var2 = Float.compare(var1.UnUNVVVNuv, var0.UnUNVVVNuv);
         return var2 != 0 ? var2 : var0.nvUVNnuu.compareToIgnoreCase(var1.nvUVNnuu);
      };
      private final Module C00OOC00oO;
      final VVnnnnN uUnuvNvvNU = new VVnnnnN();
      final UUNnvUVnnnnN vVvUvVVuuNvV = new UUNnvUVnnnnN(0.0F);
      final UUNnvUVnnnnN uNNnnnuuuN = new UUNnvUVnnnnN(0.0F);
      final UUNnvUVnnnnN nuUnNvnuUu = new UUNnvUVnnnnN(0.0F);
      final UUNnvUVnnnnN VVuuUN = new UUNnvUVnnnnN(0.0F);
      final UUNnvUVnnnnN vNUvnnVnUvu = new UUNnvUVnnnnN(0.0F);
      private final UUNnvUVnnnnN uVUuuVnNVU = new UUNnvUVnnnnN(1.0F);
      private final UUNnvUVnnnnN vuuuNvNuv = new UUNnvUVnnnnN(1.0F);
      String nvUVNnuu = "";
      String UuuNnUvUuv;
      String nUUVuvU = "";
      private float UnUNVVVNuv;
      private float vNVuvnUUnuUn;
      private float UvnvNVnnnnNU;
      float uVUVnuvnuVuv;
      float NVNnnvnuunNv;
      float uVunuUNVVUUV = 1.0F;
      float UNnVVNvvnVvU = 1.0F;
      private boolean uNnUnnuNUnNu;
      private boolean NnUuNNU;
      private boolean nNvNUVU;
      boolean UnUNuUU;

      private NVnVnNnN(Module var1) {
         this.C00OOC00oO = var1;
      }

      void UuUVuuUu(Module var1) {
         boolean var2 = var1.nuUnNvnuUu;
         if (!this.uNnUnnuNUnNu) {
            this.vVvUvVVuuNvV.UuUVuuUu(var2 ? 1.0F : 0.0F);
            this.uNNnnnuuuN.UuUVuuUu(var2 ? 1.0F : 0.0F);
            this.nNvNUVU = var2;
            this.uNnUnnuNUnNu = true;
         } else if (var2 != this.nNvNUVU) {
            this.nuUnNvnuUu.uUnuvNvvNU(Math.min(2.25F, this.nuUnNvnuUu.C00OOC00oO() + (var2 ? 1.2F : 0.72F)));
            if (var2) {
               this.uNNnnnuuuN.UuUVuuUu(0.0F);
            }

            this.nNvNUVU = var2;
         }

         String var3 = var1.vuuuNvNuv();
         if (var3 == null || var3.isEmpty()) {
            var3 = var1.vVvUvVVuuNvV;
         }

         if (!var3.equals(this.nvUVNnuu)) {
            this.nvUVNnuu = var3;
            this.UnUNVVVNuv = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, this.nvUVNnuu, 24.0F);
         }

         String var4 = var1.vNUvnnVnUvu == null ? null : var1.vNUvnnVnUvu.UuUVuuUu();
         if (var4 == null) {
            this.UuuNnUvUuv = null;
            this.vNVuvnUUnuUn = 0.0F;
         } else if (!var4.equals(this.UuuNnUvUuv)) {
            this.UuuNnUvUuv = var4;
            this.vNVuvnUUnuUn = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vNUvnnVnUvu, this.UuuNnUvUuv, 22.08F);
         }

         String var5 = var1.uNNnnnuuuN == -1 ? "" : "[" + UuNVnuUvunN.UuUVuuUu(var1.uNNnnnuuuN) + "]";
         if (!var5.equals(this.nUUVuvU)) {
            this.nUUVuvU = var5;
            this.UvnvNVnnnnNU = this.nUUVuvU.isEmpty() ? 0.0F : vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, this.nUUVuvU, 24.0F);
         }
      }

      float UuUVuuUu(float var1, float var2, boolean var3, boolean var4, boolean var5) {
         float var6 = var4 && this.UuuNnUvUuv != null ? vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vNUvnnVnUvu, this.UuuNnUvUuv, var1 * 0.92F) + 7.0F : 0.0F;
         float var7 = var5 && !this.nUUVuvU.isEmpty() ? vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, this.nUUVuvU, var1) + 6.0F : 0.0F;
         return vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.vVvUvVVuuNvV, this.nvUVNnuu, var1) + var6 + var7 + var2 * 2.0F + (var3 ? 8.0F : 0.0F);
      }

      void UuUVuuUu(float var1, float var2, float var3, float var4) {
         if (!this.NnUuNNU) {
            this.VVuuUN.UuUVuuUu(var1);
            this.vNUvnnVnUvu.UuUVuuUu(var2);
            this.uVUuuVnNVU.UuUVuuUu(var3);
            this.vuuuNvNuv.UuUVuuUu(var4);
            this.NnUuNNU = true;
         } else {
            this.VVuuUN.UuUVuuUu(var1, cOC0cc0cO00o.UUuUnNVNuuv);
            this.vNUvnnVnUvu.UuUVuuUu(var2, cOC0cc0cO00o.UUuUnNVNuuv);
            this.uVUuuVnNVU.UuUVuuUu(var3, cOC0cc0cO00o.NVuNUuVnVUN);
            this.vuuuNvNuv.UuUVuuUu(var4, cOC0cc0cO00o.NVuNUuVnVUN);
         }

         this.uVUVnuvnuVuv = this.VVuuUN.C00OOC00oO();
         this.NVNnnvnuunNv = this.vNUvnnVnUvu.C00OOC00oO();
         this.uVunuUNVVUUV = Math.max(0.0F, this.uVUuuVnNVU.C00OOC00oO());
         this.UNnVVNvvnVvU = Math.max(0.0F, this.vuuuNvNuv.C00OOC00oO());
      }

      boolean UuUVuuUu() {
         return this.UnUNuUU;
      }
   }
}
