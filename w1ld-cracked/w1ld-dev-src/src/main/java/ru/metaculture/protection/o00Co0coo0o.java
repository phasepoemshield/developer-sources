package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_437;

public class o00Co0coo0o extends class_437 {
   private static volatile boolean UuUVuuUu = false;
   private static final String[] C00OOC00oO = new String[]{"FunTime", "SpookyTime", "HolyWorld"};
   private static final String[] uUnuvNvvNU = new String[]{"FT", "SP", "HW"};
   private final List<String> vVvUvVVuuNvV = Arrays.asList(
      "Сфера Хаоса",
      "Сфера Титана",
      "Сфера Ареса",
      "Сфера Бестии",
      "Талисман Демона",
      "Талисман Карателя",
      "Шлем Крушителя",
      "Нагрудник Крушителя",
      "Поножи Крушителя",
      "Ботинки Крушителя",
      "Меч Крушителя",
      "Кирка Крушителя",
      "Лук Крушителя",
      "Арбалет Крушителя",
      "Трезубец Крушителя",
      "Булава Крушителя",
      "Элитры Крушителя",
      "Удочка Крушителя"
   );
   private final List<String> uNNnnnuuuN = Arrays.asList("Явная Пыль", "Дезориентация", "Трапка", "Отмычка к Сферам");
   private final List<String> nuUnNvnuUu = vNnnVNUVU.UuUVuuUu().stream().map(vNnnVNUVU.nvUnvV::key).toList();
   private final List<o00Co0coo0o.NVnVnNnN> VVuuUN = new ArrayList<>();
   private final List<o00Co0coo0o.NVnVnNnN> vNUvnnVnUvu = new ArrayList<>();
   private o00Co0coo0o.NVnVnNnN uVUuuVnNVU = null;
   private float vuuuNvNuv = 0.0F;
   private float nvUVNnuu = 0.0F;
   private float UuuNnUvUuv = 0.0F;
   private String nUUVuvU = null;
   private float UnUNVVVNuv;
   private float vNVuvnUUnuUn;
   private float UvnvNVnnnnNU;
   private float uVUVnuvnuVuv;
   private final int NVNnnvnuunNv = UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(21, 23, 30, 120);
   private final int uVunuUNVVUUV = UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(12, 43, 64, 150);
   private final int UNnVVNvvnVvU = UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(24, 88, 124, 255);
   private final int uNnUnnuNUnNu = UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(0, 0, 0, 70);

   public o00Co0coo0o() {
      super(class_2561.method_43470("AutoBuy Panel"));
      this.C00OOC00oO();
      UuUVuuUu();
   }

   private void C00OOC00oO() {
      this.VVuuUN.clear();
      this.vNUvnnVnUvu.clear();
      AutoBuy.UuNnnVnuNNV.forEach((var1, var2) -> this.VVuuUN.add(new o00Co0coo0o.NVnVnNnN(var1, String.valueOf(var2))));
      AutoBuy.NVuunNnvvvVu.forEach(var1 -> this.vNUvnnVnUvu.add(new o00Co0coo0o.NVnVnNnN(var1, "")));
   }

   public static void UuUVuuUu() {
      if (!UuUVuuUu) {
         UuUVuuUu = true;
         NUvnVVNvvu.UuUVuuUu(
            new Object() {
               // $VF: Could not verify finally blocks. A semaphore variable has been added to preserve control flow.
               // Please report this to the Vineflower issue tracker, at https://github.com/Vineflower/vineflower/issues with a copy of the class file (if you have the rights to distribute it!)
               @vuVvUNNvVNV
               public void UuUVuuUu(O0C0OC0OCcCO var1) {
                  class_310 var2 = var1.uUnuvNvvNU();
                  if (var2 != null && var2.field_1755 instanceof o00Co0coo0o var3 && var2.method_22683() != null) {
                     int var12 = (int)(var2.field_1729.method_1603() * var2.method_22683().method_4486() / var2.method_22683().method_4489());
                     int var5 = (int)(var2.field_1729.method_1604() * var2.method_22683().method_4502() / var2.method_22683().method_4506());
                     oocOO0CCC0O var6 = oocOO0CCC0O.UuUVuuUu();
                     boolean var7 = var6.UuUVuuUu((Object)var3) && var6.UuUVuuUu(var2.method_22683().method_4489(), var2.method_22683().method_4506());
                     boolean var10 = false /* VF: Semaphore variable */;

                     try {
                        var10 = true;
                        var3.UuUVuuUu(var1.vVvUvVVuuNvV(), var1.vNUvnnVnUvu(), var12, var5);
                        var1.vVvUvVVuuNvV().uUnuvNvvNU();
                        var10 = false;
                     } finally {
                        if (var10) {
                           if (var7) {
                              var6.uUnuvNvvNU();
                           }
                        }
                     }

                     if (var7) {
                        var6.uUnuvNvvNU();
                     }
                  }
               }
            }
         );
      }
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
      super.method_25394(var1, var2, var3, var4);
   }

   public void UuUVuuUu(UnVNvNnU var1, class_332 var2, int var3, int var4) {
      AutoBuy var5 = (AutoBuy)ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(AutoBuy.class);
      if (var5 != null && var5.nuUnNvnuUu) {
         float var6 = (float)this.field_22787.method_22683().method_4489() / this.field_22787.method_22683().method_4486();
         float var7 = 350.0F;
         float var8 = 180.0F;
         float var9 = 15.0F;
         float var10 = var7 + var9 + var8;
         float var11 = 260.0F;
         float var12 = (this.field_22787.method_22683().method_4486() - var10) / 2.0F;
         float var13 = (this.field_22787.method_22683().method_4502() - var11) / 2.0F;
         var1.uUnuvNvvNU(var6);
         float var15 = var13;
         var1.UuUVuuUu(23.0F);
         var1.UuUVuuUu(var12, var13, var7, var11, 6.0F, (float)this.NVNnnvnuunNv);
         var1.UuUVuuUu(var12, var13, var7, var11, 6.0F, this.NVNnnvnuunNv);
         float var16 = var12 + var7 + var9;
         var1.UuUVuuUu(23.0F);
         var1.UuUVuuUu(var16, var13, var8, var11, 6.0F, (float)this.NVNnnvnuunNv);
         var1.UuUVuuUu(var16, var13, var8, var11, 6.0F, this.NVNnnvnuunNv);
         float var18 = 13.0F;
         float var19 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, "D", var18).UuUVuuUu;
         float var20 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "Autobuy |", var18).UuUVuuUu;
         float var21 = var19 + 4.0F + var20 + 8.0F;

         for (String var25 : uUnuvNvvNU) {
            var21 += UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var25, var18).UuUVuuUu + 12.0F;
         }

         var1.UuUVuuUu(var12 + 10.0F, var13 + 10.0F, var21 + 10.0F, 24.0F, 6.0F, UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(20, 20, 25, 200));
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var12 + 18.0F, var13 + 15.0F, var18, "D", UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(80, 90, 160, 255));
         var1.UuUVuuUu(
            vNvnnVvvVUu.UuUVuuUu, var12 + 18.0F + var19 + 4.0F, var13 + 15.0F, var18, "Autobuy |", UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(100, 100, 100, 255)
         );
         float var46 = var12 + 18.0F + var19 + 4.0F + var20 + 10.0F;

         for (int var47 = 0; var47 < C00OOC00oO.length; var47++) {
            boolean var49 = var5.NnUuNNU.uUnuvNvvNU().equals(C00OOC00oO[var47]);
            var1.UuUVuuUu(
               vNvnnVvvVUu.vVvUvVVuuNvV, var46, var15 + 15.0F, var18, uUnuvNvvNU[var47], var49 ? -1 : UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(120, 120, 120, 255)
            );
            var46 += UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, uUnuvNvvNU[var47], var18).UuUVuuUu + 12.0F;
         }

         float var48 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "Autopars", var18).UuUVuuUu;
         var1.UuUVuuUu(var16 + 10.0F, var13 + 10.0F, var19 + 4.0F + var48 + 16.0F, 24.0F, 6.0F, UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(20, 20, 25, 200));
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var16 + 18.0F, var13 + 15.0F, var18, "D", UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(80, 90, 160, 255));
         var1.UuUVuuUu(
            vNvnnVvvVUu.UuUVuuUu, var16 + 18.0F + var19 + 4.0F, var13 + 15.0F, var18, "Autopars", UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(100, 100, 100, 255)
         );
         float var50 = var15 + 45.0F;
         float var51 = var11 - 55.0F;
         float var26 = 160.0F;
         float var27 = 160.0F;
         float var28 = var12 + 10.0F;
         float var29 = var28 + var26 + 10.0F;
         float var30 = var16 + 10.0F;
         float var31 = var8 - 20.0F;
         var1.UuUVuuUu(var28, var50, var26 + 10.0F + var27, var51, 6.0F, this.uVunuUNVVUUV);
         var1.UuUVuuUu(var30, var50, var31, var51, 6.0F, this.uVunuUNVVUUV);
         List var32 = this.UuUVuuUu(var5);
         var1.UuUVuuUu(var28, var50, var26, var51, 8.0F, 8.0F, 8.0F, 8.0F);
         float var33 = 32.0F;
         float var34 = 8.0F;
         int var35 = (int)((var26 - 16.0F) / (var33 + var34));
         float var36 = var28 + 10.0F;
         float var37 = var50 + 10.0F + this.vuuuNvNuv;

         for (int var38 = 0; var38 < var32.size(); var38++) {
            float var39 = var36 + var38 % var35 * (var33 + var34);
            float var40 = var37 + var38 / var35 * (var33 + var34);
            var1.UuUVuuUu(var39, var40, var33, var33, 6.0F, this.uNnUnnuNUnNu);
            if (var2 != null) {
               VnuunNV.UuUVuuUu(var2, (String)var32.get(var38), var39 + 8.0F, var40 + 8.0F);
            }
         }

         var1.nuUnNvnuUu();
         var1.UuUVuuUu(var29, var50, var27, var51, 8.0F, 8.0F, 8.0F, 8.0F);
         float var52 = var50 + 10.0F + this.nvUVNnuu;

         for (int var53 = this.VVuuUN.size() - 1; var53 >= 0; var53--) {
            o00Co0coo0o.NVnVnNnN var56 = this.VVuuUN.get(var53);
            var56.uUnuvNvvNU.UuUVuuUu();
            var56.uUnuvNvvNU.UuUVuuUu(var56.vVvUvVVuuNvV ? 0.0 : 1.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
            if (var56.vVvUvVVuuNvV && var56.uUnuvNvvNU.uNNnnnuuuN() < 0.01F) {
               AutoBuy.UuNnnVnuNNV.remove(var56.UuUVuuUu);
               this.VVuuUN.remove(var53);
            } else {
               float var41 = 46.0F * var56.uUnuvNvvNU.uNNnnnuuuN();
               float var42 = var29 + 8.0F;
               var1.UuUVuuUu(var42, var52, var27 - 16.0F, var41, 6.0F, this.UNnVVNvvnVvU);
               var1.UuUVuuUu(var42 + 6.0F, var52 + 6.0F, 34.0F, 34.0F, 4.0F, this.uNnUnnuNUnNu);
               if (var2 != null) {
                  VnuunNV.UuUVuuUu(var2, var56.UuUVuuUu, var42 + 15.0F, var52 + 15.0F);
               }

               var1.UuUVuuUu(var42, var52, var27 - 16.0F, var41, 6.0F, 6.0F, 6.0F, 6.0F);
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var42 + 48.0F, var52 + 10.0F, var18, vNnnVNUVU.vVvUvVVuuNvV(var56.UuUVuuUu), -1);
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var42 + 48.0F, var52 + 26.0F, 11.0F, "Цена: ", UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(180, 180, 180, 255));
               float var43 = var42 + 48.0F + UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "Цена: ", 11.0F).UuUVuuUu;
               boolean var44 = this.uVUuuVnNVU == var56;
               var1.UuUVuuUu(var43, var52 + 24.0F, 60.0F, 16.0F, 4.0F, UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(15, 20, 25, 200));
               if (var44) {
                  var1.UuUVuuUu(var43, var52 + 24.0F, 60.0F, 16.0F, 4.0F, UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(80, 150, 220, 255), 1.0F);
               }

               String var45 = var56.C00OOC00oO + (var44 && System.currentTimeMillis() % 1000L > 500L ? "_" : "");
               var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var43 + 4.0F, var52 + 26.0F, 11.0F, var45, -1);
               var1.nuUnNvnuUu();
               var52 += var41 + 8.0F;
            }
         }

         var1.nuUnNvnuUu();
         var1.UuUVuuUu(var30, var50, var31, var51, 8.0F, 8.0F, 8.0F, 8.0F);
         if (this.vNUvnnVnUvu.isEmpty()) {
            float var54 = var30 + var31 / 2.0F;
            var1.UuUVuuUu(
               vNvnnVvvVUu.UuUVuuUu,
               var54 - UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "ДЛЯ ПАРСА ЦЕНЫ У", 11.0F).UuUVuuUu / 2.0F,
               var50 + var51 / 2.0F - 18.0F,
               11.0F,
               "ДЛЯ ПАРСА ЦЕНЫ У",
               UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(80, 110, 130, 180)
            );
            var1.UuUVuuUu(
               vNvnnVvvVUu.UuUVuuUu,
               var54 - UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "ПРЕДМЕТА,", 11.0F).UuUVuuUu / 2.0F,
               var50 + var51 / 2.0F - 4.0F,
               11.0F,
               "ПРЕДМЕТА,",
               UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(80, 110, 130, 180)
            );
            var1.UuUVuuUu(
               vNvnnVvvVUu.UuUVuuUu,
               var54 - UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "ПЕРЕМЕСТИТЕ ЕГО В", 11.0F).UuUVuuUu / 2.0F,
               var50 + var51 / 2.0F + 10.0F,
               11.0F,
               "ПЕРЕМЕСТИТЕ ЕГО В",
               UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(80, 110, 130, 180)
            );
            var1.UuUVuuUu(
               vNvnnVvvVUu.UuUVuuUu,
               var54 - UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "ОДНУ ИЗ ЯЧЕЕК", 11.0F).UuUVuuUu / 2.0F,
               var50 + var51 / 2.0F + 24.0F,
               11.0F,
               "ОДНУ ИЗ ЯЧЕЕК",
               UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(80, 110, 130, 180)
            );
         } else {
            float var55 = var50 + 10.0F + this.UuuNnUvUuv;

            for (int var57 = this.vNUvnnVnUvu.size() - 1; var57 >= 0; var57--) {
               o00Co0coo0o.NVnVnNnN var58 = this.vNUvnnVnUvu.get(var57);
               var58.uUnuvNvvNU.UuUVuuUu();
               var58.uUnuvNvvNU.UuUVuuUu(var58.vVvUvVVuuNvV ? 0.0 : 1.0, 0.2F, VvVUUNUu.UnUNVVVNuv, false);
               if (var58.vVvUvVVuuNvV && var58.uUnuvNvvNU.uNNnnnuuuN() < 0.01F) {
                  AutoBuy.NVuunNnvvvVu.remove(var58.UuUVuuUu);
                  this.vNUvnnVnUvu.remove(var57);
               } else {
                  float var59 = 46.0F * var58.uUnuvNvvNU.uNNnnnuuuN();
                  float var60 = var30 + 8.0F;
                  var1.UuUVuuUu(var60, var55, var31 - 16.0F, var59, 6.0F, this.UNnVVNvvnVvU);
                  var1.UuUVuuUu(var60 + 6.0F, var55 + 6.0F, 34.0F, 34.0F, 4.0F, this.uNnUnnuNUnNu);
                  if (var2 != null) {
                     VnuunNV.UuUVuuUu(var2, var58.UuUVuuUu, var60 + 15.0F, var55 + 15.0F);
                  }

                  var1.UuUVuuUu(var60, var55, var31 - 16.0F, var59, 6.0F, 6.0F, 6.0F, 6.0F);
                  var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var60 + 48.0F, var55 + 17.0F, var18, vNnnVNUVU.vVvUvVVuuNvV(var58.UuUVuuUu), -1);
                  var1.nuUnNvnuUu();
                  var55 += var59 + 8.0F;
               }
            }
         }

         var1.nuUnNvnuUu();
         if (this.nUUVuvU != null) {
            var1.UuUVuuUu(this.UnUNVVVNuv, this.vNVuvnUUnuUn, 32.0F, 32.0F, 6.0F, UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(255, 255, 255, 180));
            if (var2 != null) {
               VnuunNV.UuUVuuUu(var2, this.nUUVuvU, this.UnUNVVVNuv + 8.0F, this.vNVuvnUUnuUn + 8.0F);
            }

            this.UnUNVVVNuv = var3 - this.UvnvNVnnnnNU;
            this.vNVuvnUUnuUn = var4 - this.uVUVnuvnuVuv;
         }

         var1.vNUvnnVnUvu();
      } else {
         this.field_22787.method_1507(null);
      }
   }

   public boolean method_25402(double var1, double var3, int var5) {
      AutoBuy var6 = (AutoBuy)ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(AutoBuy.class);
      float var7 = 350.0F;
      float var8 = 180.0F;
      float var9 = 15.0F;
      float var10 = var7 + var9 + var8;
      float var11 = 260.0F;
      float var12 = (this.field_22789 - var10) / 2.0F;
      float var13 = (this.field_22790 - var11) / 2.0F;
      float var15 = var13;
      float var16 = var12 + var7 + var9;
      float var17 = 13.0F;
      float var18 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, "Litka", var17).UuUVuuUu;
      float var19 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, "Autobuy |", var17).UuUVuuUu;
      float var20 = var12 + 18.0F + var18 + 4.0F + var19 + 10.0F;

      for (int var21 = 0; var21 < C00OOC00oO.length; var21++) {
         float var22 = UnVNvNnU.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, uUnuvNvvNU[var21], var17).UuUVuuUu;
         if (var1 >= var20 - 4.0F && var1 <= var20 + var22 + 6.0F && var3 >= var15 + 10.0F && var3 <= var15 + 34.0F) {
            var6.NnUuNNU.uNNnnnuuuN = C00OOC00oO[var21];
            var6.NnUuNNU.vNUvnnVnUvu = var6.NnUuNNU.vVvUvVVuuNvV.indexOf(C00OOC00oO[var21]);
            return true;
         }

         var20 += var22 + 12.0F;
      }

      float var38 = var15 + 45.0F;
      float var39 = var11 - 55.0F;
      float var23 = var12 + 10.0F;
      float var24 = 160.0F;
      float var25 = var23 + var24 + 10.0F;
      float var26 = 160.0F;
      float var27 = var16 + 10.0F;
      float var28 = var8 - 20.0F;
      if (var5 == 1) {
         if (var1 >= var25 && var1 <= var25 + var26 && var3 >= var38 && var3 <= var38 + var39) {
            float var29 = var38 + 10.0F + this.nvUVNnuu;

            for (o00Co0coo0o.NVnVnNnN var31 : this.VVuuUN) {
               if (var3 >= var29 && var3 <= var29 + 46.0F) {
                  var31.vVvUvVVuuNvV = true;
                  return true;
               }

               var29 += 54.0F;
            }
         }

         if (var1 >= var27 && var1 <= var27 + var28 && var3 >= var38 && var3 <= var38 + var39) {
            float var40 = var38 + 10.0F + this.UuuNnUvUuv;

            for (o00Co0coo0o.NVnVnNnN var46 : this.vNUvnnVnUvu) {
               if (var3 >= var40 && var3 <= var40 + 46.0F) {
                  var46.vVvUvVVuuNvV = true;
                  return true;
               }

               var40 += 54.0F;
            }
         }
      }

      this.uVUuuVnNVU = null;
      if (var5 == 0) {
         float var41 = var38 + 10.0F + this.nvUVNnuu;

         for (o00Co0coo0o.NVnVnNnN var47 : this.VVuuUN) {
            if (var3 >= var41 + 24.0F && var3 <= var41 + 40.0F && var1 >= var25 + 48.0F && var1 <= var25 + 150.0F) {
               this.uVUuuVnNVU = var47;
               return true;
            }

            var41 += 54.0F;
         }
      }

      if (var5 == 0 && var1 >= var23 && var1 <= var23 + var24 && var3 >= var38 && var3 <= var38 + var39) {
         List var42 = this.UuUVuuUu(var6);
         float var45 = 32.0F;
         float var48 = 8.0F;
         int var32 = (int)((var24 - 16.0F) / (var45 + var48));
         float var33 = var23 + 10.0F;
         float var34 = var38 + 10.0F + this.vuuuNvNuv;

         for (int var35 = 0; var35 < var42.size(); var35++) {
            float var36 = var33 + var35 % var32 * (var45 + var48);
            float var37 = var34 + var35 / var32 * (var45 + var48);
            if (var1 >= var36 && var1 <= var36 + var45 && var3 >= var37 && var3 <= var37 + var45) {
               this.nUUVuvU = (String)var42.get(var35);
               this.UvnvNVnnnnNU = (float)var1 - var36;
               this.uVUVnuvnuVuv = (float)var3 - var37;
               this.UnUNVVVNuv = var36;
               this.vNVuvnUUnuUn = var37;
               return true;
            }
         }
      }

      return super.method_25402(var1, var3, var5);
   }

   public boolean method_25406(double var1, double var3, int var5) {
      if (this.nUUVuvU != null && var5 == 0) {
         float var6 = 350.0F;
         float var7 = 180.0F;
         float var8 = 15.0F;
         float var9 = var6 + var8 + var7;
         float var10 = 260.0F;
         float var11 = (this.field_22789 - var9) / 2.0F;
         float var12 = (this.field_22790 - var10) / 2.0F;
         float var13 = var12 + 45.0F;
         float var14 = var10 - 55.0F;
         float var15 = var11 + 10.0F + 160.0F + 10.0F;
         float var16 = 160.0F;
         float var17 = var11 + var6 + var8 + 10.0F;
         float var18 = var7 - 20.0F;
         if (var1 >= var15 && var1 <= var15 + var16 && var3 >= var13 && var3 <= var13 + var14) {
            if (this.VVuuUN.stream().noneMatch(var1x -> var1x.UuUVuuUu.equals(this.nUUVuvU))) {
               this.VVuuUN.add(new o00Co0coo0o.NVnVnNnN(this.nUUVuvU, ""));
               AutoBuy.UuNnnVnuNNV.put(this.nUUVuvU, 0L);
            }
         } else if (var1 >= var17
            && var1 <= var17 + var18
            && var3 >= var13
            && var3 <= var13 + var14
            && this.vNUvnnVnUvu.stream().noneMatch(var1x -> var1x.UuUVuuUu.equals(this.nUUVuvU))) {
            this.vNUvnnVnUvu.add(new o00Co0coo0o.NVnVnNnN(this.nUUVuvU, ""));
            if (!AutoBuy.NVuunNnvvvVu.contains(this.nUUVuvU)) {
               AutoBuy.NVuunNnvvvVu.add(this.nUUVuvU);
            }
         }

         this.nUUVuvU = null;
         return true;
      } else {
         return super.method_25406(var1, var3, var5);
      }
   }

   public boolean method_25401(double var1, double var3, double var5, double var7) {
      float var9 = 350.0F;
      float var10 = 180.0F;
      float var11 = 15.0F;
      float var12 = var9 + var11 + var10;
      float var13 = 260.0F;
      float var14 = (this.field_22789 - var12) / 2.0F;
      float var15 = (this.field_22790 - var13) / 2.0F;
      float var16 = var15 + 45.0F;
      float var17 = var13 - 55.0F;
      float var18 = var14 + 10.0F;
      float var19 = 160.0F;
      float var20 = var18 + var19 + 10.0F;
      float var21 = 160.0F;
      float var22 = var14 + var9 + var11 + 10.0F;
      float var23 = var10 - 20.0F;
      if (var1 >= var18 && var1 <= var18 + var19 && var3 >= var16 && var3 <= var16 + var17) {
         this.vuuuNvNuv += (float)(var7 * 22.0);
         if (this.vuuuNvNuv > 0.0F) {
            this.vuuuNvNuv = 0.0F;
         }
      } else if (var1 >= var20 && var1 <= var20 + var21 && var3 >= var16 && var3 <= var16 + var17) {
         this.nvUVNnuu += (float)(var7 * 22.0);
         if (this.nvUVNnuu > 0.0F) {
            this.nvUVNnuu = 0.0F;
         }
      } else if (var1 >= var22 && var1 <= var22 + var23 && var3 >= var16 && var3 <= var16 + var17) {
         this.UuuNnUvUuv += (float)(var7 * 22.0);
         if (this.UuuNnUvUuv > 0.0F) {
            this.UuuNnUvUuv = 0.0F;
         }
      }

      return super.method_25401(var1, var3, var5, var7);
   }

   public boolean method_25400(char var1, int var2) {
      if (this.uVUuuVnNVU != null && Character.isDigit(var1) && this.uVUuuVnNVU.C00OOC00oO.length() < 12) {
         this.uVUuuVnNVU.C00OOC00oO = this.uVUuuVnNVU.C00OOC00oO + var1;
         this.UuUVuuUu(this.uVUuuVnNVU);
         return true;
      } else {
         return super.method_25400(var1, var2);
      }
   }

   public boolean method_25404(int var1, int var2, int var3) {
      if (this.uVUuuVnNVU != null) {
         if (var1 == 259 && !this.uVUuuVnNVU.C00OOC00oO.isEmpty()) {
            this.uVUuuVnNVU.C00OOC00oO = this.uVUuuVnNVU.C00OOC00oO.substring(0, this.uVUuuVnNVU.C00OOC00oO.length() - 1);
            this.UuUVuuUu(this.uVUuuVnNVU);
            return true;
         }

         if (var1 == 257 || var1 == 256) {
            this.uVUuuVnNVU = null;
            return true;
         }
      }

      return super.method_25404(var1, var2, var3);
   }

   private List<String> UuUVuuUu(AutoBuy var1) {
      if (var1.NnUuNNU.uUnuvNvvNU().equals("SpookyTime")) {
         return this.uNNnnnuuuN;
      } else {
         return var1.NnUuNNU.uUnuvNvvNU().equals("HolyWorld") ? this.nuUnNvnuUu : this.vVvUvVVuuNvV;
      }
   }

   private void UuUVuuUu(o00Co0coo0o.NVnVnNnN var1) {
      try {
         if (this.VVuuUN.contains(var1)) {
            long var2 = var1.C00OOC00oO.isEmpty() ? 0L : Long.parseLong(var1.C00OOC00oO);
            AutoBuy.UuNnnVnuNNV.put(var1.UuUVuuUu, var2);
         }

         if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
            ru.metaculture.protection.NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
         }
      } catch (Exception var4) {
      }
   }

   public boolean method_25421() {
      return false;
   }

   class NVnVnNnN {
      String UuUVuuUu;
      String C00OOC00oO;
      VVnnnnN uUnuvNvvNU = new VVnnnnN();
      boolean vVvUvVVuuNvV = false;

      NVnVnNnN(String var2, String var3) {
         this.UuUVuuUu = var2;
         this.C00OOC00oO = var3;
      }
   }
}
