package ru.metaculture.protection;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import net.minecraft.class_2561;
import net.minecraft.class_310;
import net.minecraft.class_332;
import net.minecraft.class_3532;
import net.minecraft.class_437;

public final class UNVnvUUUVv extends class_437 {
   private static volatile boolean UuUVuuUu;
   private static final String[] C00OOC00oO = new String[]{"Аналитика", "Обучение", "Сравнение"};
   private static final float uUnuvNvvNU = 52.0F;
   private static final float vVvUvVVuuNvV = 28.0F;
   private static final float uNNnnnuuuN = 30.0F;
   private static final float nuUnNvnuUu = 28.0F;
   private static final float VVuuUN = 28.0F;
   private static final float vNUvnnVnUvu = 24.0F;
   private static final float uVUuuVnNVU = 22.0F;
   private static final float vuuuNvNuv = 28.0F;
   private final VVnnnnN nvUVNnuu = new VVnnnnN();
   private final List<UNVnvUUUVv.nvnNNunvv> UuuNnUvUuv = new ArrayList<>();
   private final List<UNVnvUUUVv.nvUnvV> nUUVuvU = new ArrayList<>();
   private float UnUNVVVNuv;
   private float vNVuvnUUnuUn;
   private float UvnvNVnnnnNU = 1.0F;
   private float uVUVnuvnuVuv;
   private float NVNnnvnuunNv;
   private boolean uVunuUNVVUUV;
   private int UNnVVNvvnVvU;
   private UNVnvUUUVv.nvUnvV uNnUnnuNUnNu;
   private VNVuNNvvuNnu NnUuNNU;
   private long nNvNUVU;
   private UNVnvUUUVv.NVnVnNnN UnUNuUU = new UNVnvUUUVv.NVnVnNnN(0.0F, 0.0F, 0.0F, 0.0F);
   private UNVnvUUUVv.NVnVnNnN uUVuVvuNUvnu = new UNVnvUUUVv.NVnVnNnN(0.0F, 0.0F, 0.0F, 0.0F);
   private final UNVnvUUUVv.NVnVnNnN[] UvUvUNuvNU = new UNVnvUUUVv.NVnVnNnN[]{
      new UNVnvUUUVv.NVnVnNnN(0.0F, 0.0F, 0.0F, 0.0F), new UNVnvUUUVv.NVnVnNnN(0.0F, 0.0F, 0.0F, 0.0F), new UNVnvUUUVv.NVnVnNnN(0.0F, 0.0F, 0.0F, 0.0F)
   };

   public UNVnvUUUVv() {
      super(class_2561.method_43470("AI Lab"));
      uUnuvNvvNU();
      this.UuUVuuUu();
   }

   private void UuUVuuUu() {
      this.NnUuNNU = VuUvvnuUu.nuUnNvnuUu();
      this.nNvNUVU = System.currentTimeMillis();
   }

   public void method_25394(class_332 var1, int var2, int var3, float var4) {
      this.UuUVuuUu(this.UuUVuuUu((double)var2), this.C00OOC00oO((double)var3));
      super.method_25394(var1, var2, var3, var4);
   }

   public void method_25420(class_332 var1, int var2, int var3, float var4) {
   }

   public void method_52752(class_332 var1) {
   }

   public void UuUVuuUu(UnVNvNnU var1, int var2, int var3) {
      if (var1 != null && var2 > 0 && var3 > 0) {
         this.vVvUvVVuuNvV();
         long var4 = System.currentTimeMillis();
         if (!VuUvvnuUu.uUVuVvuNUvnu() && var4 - this.nNvNUVU > 2000L) {
            this.UuUVuuUu();
         }

         this.nvUVNnuu.UuUVuuUu();
         this.nvUVNnuu
            .UuUVuuUu(this.uVunuUNVVUUV ? 0.0 : 1.0, this.uVunuUNVVUUV ? 0.18F : 0.22F, this.uVunuUNVVUUV ? VvVUUNUu.nUUVuvU : VvVUUNUu.UUVNuUNUvUnV, false);
         float var6 = UuUVuuUu(this.nvUVNnuu.uNNnnnuuuN(), 0.0F, 1.0F);
         var1.UuUVuuUu(0.0F, 0.0F, (float)var2, (float)var3, 0.0F, UuUVuuUu(0, 0, 0, Math.round(170.0F * var6)));
         var1.uNNnnnuuuN(var6);
         float var7 = (0.97F + 0.03F * var6) * 0.9F;
         this.UvnvNVnnnnNU = var7;
         this.uVUVnuvnuVuv = var2 * 0.5F;
         this.NVNnnvnuunNv = var3 * 0.5F;
         var1.uUnuvNvvNU(var7, var7, var2 * 0.5F, var3 * 0.5F);
         float var8 = UuUVuuUu(var2 - 80.0F, 900.0F, 1120.0F);
         float var9 = UuUVuuUu(var3 - 70.0F, 600.0F, 780.0F);
         float var10 = (var2 - var8) * 0.5F;
         float var11 = (var3 - var9) * 0.5F;
         this.UnUNuUU = new UNVnvUUUVv.NVnVnNnN(var10, var11, var8, var9);
         var1.UuUVuuUu(20.0F);
         var1.UuUVuuUu(var10, var11, var8, var9, 18.0F, 1.0F);
         var1.UuUVuuUu(var10, var11, var8, var9, 18.0F, UuUVuuUu(13, 15, 21, 186));
         var1.UuUVuuUu(var10, var11, var8, var9, 18.0F, UuUVuuUu(255, 255, 255, 26), 2.0F);
         this.UuuNnUvUuv.clear();
         this.nUUVuvU.clear();
         this.UuUVuuUu(var1);
         this.C00OOC00oO(var1);
         float var12 = var10 + 24.0F;
         float var13 = var11 + 170.0F;
         float var14 = var8 - 48.0F;
         float var15 = var9 - 170.0F - 24.0F;
         switch (this.UNnVVNvvnVvU) {
            case 1:
               this.C00OOC00oO(var1, var12, var13, var14, var15);
               break;
            case 2:
               this.uUnuvNvvNU(var1, var12, var13, var14, var15);
               break;
            default:
               this.UuUVuuUu(var1, var12, var13, var14, var15);
         }

         var1.uVUuuVnNVU();
         var1.vuuuNvNuv();
         if (this.uVunuUNVVUUV && var6 <= 0.015F) {
            class_310.method_1551().execute(() -> {
               if (class_310.method_1551().field_1755 == this) {
                  class_310.method_1551().method_1507(null);
               }
            });
         }
      }
   }

   private void UuUVuuUu(UnVNvNnU var1) {
      float var2 = this.UnUNuUU.UuUVuuUu + 24.0F;
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var2, this.UnUNuUU.C00OOC00oO + 54.0F, 52.0F, "AI Lab", UuUVuuUu(245, 248, 255, 246));
      String var3 = "Профиль " + VuUvvnuUu.UUVNuUNUvUnV() + "  •  " + VuUvvnuUu.VVnVNnunVvu();
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2, this.UnUNuUU.C00OOC00oO + 88.0F, 28.0F, var3, UuUVuuUu(150, 160, 178, 220));
      float var4 = 44.0F;
      this.uUVuVvuNUvnu = new UNVnvUUUVv.NVnVnNnN(this.UnUNuUU.UuUVuuUu + this.UnUNuUU.uUnuvNvvNU - var4 - 18.0F, this.UnUNuUU.C00OOC00oO + 18.0F, var4, var4);
      boolean var5 = this.uUVuVvuNUvnu.UuUVuuUu(this.UnUNVVVNuv, this.vNVuvnUUnuUn);
      var1.UuUVuuUu(
         this.uUVuVvuNUvnu.UuUVuuUu,
         this.uUVuVvuNUvnu.C00OOC00oO,
         var4,
         var4,
         10.0F,
         UuUVuuUu(var5 ? 235 : 40, var5 ? 80 : 44, var5 ? 92 : 52, var5 ? 235 : 150)
      );
      this.UuUVuuUu(var1, "X", this.uUVuVvuNUvnu, 30.0F, UuUVuuUu(245, 245, 250, 240));
   }

   private void C00OOC00oO(UnVNvNnU var1) {
      float var2 = this.UnUNuUU.UuUVuuUu + 24.0F;
      float var3 = this.UnUNuUU.C00OOC00oO + 108.0F;
      float var4 = 200.0F;
      float var5 = 46.0F;

      for (int var6 = 0; var6 < C00OOC00oO.length; var6++) {
         UNVnvUUUVv.NVnVnNnN var7 = new UNVnvUUUVv.NVnVnNnN(var2 + var6 * (var4 + 10.0F), var3, var4, var5);
         this.UvUvUNuvNU[var6] = var7;
         boolean var8 = this.UNnVVNvvnVvU == var6;
         boolean var9 = var7.UuUVuuUu(this.UnUNVVVNuv, this.vNVuvnUUnuUn);
         int var10 = var8 ? UuUVuuUu(96, 150, 240, 210) : UuUVuuUu(255, 255, 255, var9 ? 26 : 14);
         var1.UuUVuuUu(var7.UuUVuuUu, var7.C00OOC00oO, var7.uUnuvNvvNU, var7.vVvUvVVuuNvV, 10.0F, var10);
         this.UuUVuuUu(var1, C00OOC00oO[var6], var7, 30.0F, var8 ? UuUVuuUu(255, 255, 255, 246) : UuUVuuUu(180, 188, 204, 220));
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      VNVuNNvvuNnu var6 = this.NnUuNNU;
      if (var6 != null && var6.UuUVuuUu) {
         var1.UuUVuuUu(
            vNvnnVvvVUu.UuUVuuUu,
            var2,
            var3 + 22.0F,
            28.0F,
            "Кадров "
               + var6.uUnuvNvvNU
               + "   Удары "
               + var6.vVvUvVVuuNvV
               + "   Промахи "
               + Math.round(var6.VVuuUN * 100.0F)
               + "%   Сенса "
               + String.format(Locale.ROOT, "%.2f", var6.vNUvnnVnUvu)
               + "   Дист "
               + uUnuvNvvNU(var6.uVUuuVnNVU)
               + "-"
               + uUnuvNvvNU(var6.vuuuNvNuv)
               + "м",
            UuUVuuUu(200, 208, 222, 230)
         );
         float var7 = (var4 - 18.0F) * 0.5F;
         float var8 = var3 + 44.0F;
         float var9 = (var5 - 44.0F - 18.0F) * 0.5F - 9.0F;
         this.UuUVuuUu(var1, var2, var8, var7, var9, var6);
         this.C00OOC00oO(var1, var2 + var7 + 18.0F, var8, var7, var9, var6);
         float var10 = var8 + var9 + 18.0F;
         this.UuUVuuUu(var1, var2, var10, var7, var9, "Yaw дельты", var6.NVNnnvnuunNv, var6.UNnVVNvvnVvU, UuUVuuUu(110, 200, 255, 255));
         this.UuUVuuUu(var1, var2 + var7 + 18.0F, var10, var7, var9, "Pitch дельты", var6.uVunuUNVVUUV, var6.uNnUnnuNUnNu, UuUVuuUu(255, 156, 86, 255));
      } else {
         this.C00OOC00oO(var1, var2, var3, var4, var5, "Нет записи. Вкладка Обучение -> Запись, затем вернись.");
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, VNVuNNvvuNnu var6) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, "Дистанция: распределение");
      float var7 = var2 + 16.0F;
      float var8 = var3 + 44.0F;
      float var9 = var4 - 32.0F;
      float var10 = var5 - 58.0F;
      int var11 = Math.max(1, var6.nUUVuvU[0] + var6.nUUVuvU[1] + var6.nUUVuvU[2]);
      String[] var12 = new String[]{"Близко <" + uUnuvNvvNU(var6.nvUVNnuu), "Средне", "Далеко >" + uUnuvNvvNU(var6.UuuNnUvUuv)};
      int[] var13 = new int[]{UuUVuuUu(92, 235, 182, 255), UuUVuuUu(110, 200, 255, 255), UuUVuuUu(255, 156, 86, 255)};
      float var14 = var9 / 3.0F - 14.0F;

      for (int var15 = 0; var15 < 3; var15++) {
         float var16 = (float)var6.nUUVuvU[var15] / var11;
         float var17 = var7 + var15 * (var9 / 3.0F) + 7.0F;
         float var18 = Math.max(3.0F, var16 * (var10 - 28.0F));
         var1.UuUVuuUu(var17, var8 + var10 - 26.0F - var18, var14, var18, 5.0F, var13[var15]);
         String var19 = Math.round(var16 * 100.0F) + "%";
         var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var17, var8 + var10 - 2.0F, 22.0F, var12[var15], UuUVuuUu(170, 178, 194, 220));
         var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var17, var8 + var10 - 30.0F - var18, 24.0F, var19, UuUVuuUu(235, 240, 250, 235));
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, float var2, float var3, float var4, float var5, VNVuNNvvuNnu var6) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, "Скорость аима <-> дистанция");
      float var7 = var2 + 16.0F;
      float var8 = var3 + 44.0F;
      float var9 = var4 - 32.0F;
      float var10 = var5 - 64.0F;
      float var11 = Math.max(1.0F, var6.UvnvNVnnnnNU);
      int var12 = var6.vNVuvnUUnuUn == null ? 0 : var6.vNVuvnUUnuUn.length;
      float var13 = var12 > 0 ? var9 / var12 : var9;

      for (int var14 = 0; var14 < var12; var14++) {
         float var15 = var6.vNVuvnUUnuUn[var14] / var11;
         float var16 = Math.max(1.0F, var15 * (var10 - 4.0F));
         var1.UuUVuuUu(var7 + var14 * var13, var8 + var10 - var16, Math.max(1.0F, var13 * 0.85F), var16, 0.0F, UuUVuuUu(120, 170, 255, 230));
      }

      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var7, var8 + var10 + 18.0F, 22.0F, uUnuvNvvNU(var6.uVUuuVnNVU) + "м", UuUVuuUu(150, 158, 174, 200));
      String var17 = uUnuvNvvNU(var6.vuuuNvNuv) + "м";
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         var7 + var9 - vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var17, 22.0F),
         var8 + var10 + 18.0F,
         22.0F,
         var17,
         UuUVuuUu(150, 158, 174, 200)
      );
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, String var6, int[] var7, int var8, int var9) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6);
      if (var7 != null) {
         float var10 = var2 + 16.0F;
         float var11 = var3 + 44.0F;
         float var12 = var4 - 32.0F;
         float var13 = var5 - 58.0F;
         float var14 = var12 / var7.length;
         float var15 = Math.max(1.0F, (float)var8);

         for (int var16 = 0; var16 < var7.length; var16++) {
            float var17 = Math.max(1.0F, var7[var16] / var15 * (var13 - 2.0F));
            var1.UuUVuuUu(var10 + var16 * var14, var11 + var13 - var17, Math.max(1.0F, var14 * 0.8F), var17, 0.0F, var9);
         }

         var1.UuUVuuUu(var10 + var12 * 0.5F - 0.5F, var11, 1.0F, var13, UuUVuuUu(255, 255, 255, 40));
      }
   }

   private void C00OOC00oO(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      List var6 = VuUvvnuUu.vuvnUnVnUNnV();
      String var7 = VuUvvnuUu.UUVNuUNUvUnV();
      this.UuUVuuUu(var1, var2, var3, var4, 86.0F, "Профиль");
      UNVnvUUUVv.NVnVnNnN var8 = new UNVnvUUUVv.NVnVnNnN(var2 + 16.0F, var3 + 40.0F, 38.0F, 34.0F);
      UNVnvUUUVv.NVnVnNnN var9 = new UNVnvUUUVv.NVnVnNnN(var2 + 16.0F + 44.0F, var3 + 40.0F, 220.0F, 34.0F);
      UNVnvUUUVv.NVnVnNnN var10 = new UNVnvUUUVv.NVnVnNnN(var9.UuUVuuUu + var9.uUnuvNvvNU + 8.0F, var3 + 40.0F, 38.0F, 34.0F);
      this.UuUVuuUu(var1, var8, "<", false, false, () -> this.UuUVuuUu(var6, -1));
      var1.UuUVuuUu(var9.UuUVuuUu, var9.C00OOC00oO, var9.uUnuvNvvNU, var9.vVvUvVVuuNvV, 7.0F, UuUVuuUu(255, 255, 255, 16));
      this.UuUVuuUu(var1, var7, var9, 28.0F, UuUVuuUu(235, 240, 250, 235));
      this.UuUVuuUu(var1, var10, ">", false, false, () -> this.UuUVuuUu(var6, 1));
      float var11 = var3 + 104.0F;
      float var12 = (var4 - 24.0F) / 4.0F - 8.0F;
      boolean var13 = VuUvvnuUu.uUVuVvuNUvnu();
      boolean var14 = VuUvvnuUu.UvUvUNuvNU();
      boolean var15 = VuUvvnuUu.NVUunUNUN();
      this.UuUVuuUu(var1, new UNVnvUUUVv.NVnVnNnN(var2, var11, var12, 42.0F), var13 ? "Запись..." : "Запись", false, var13, VuUvvnuUu::UuUVuuUu);
      this.UuUVuuUu(var1, new UNVnvUUUVv.NVnVnNnN(var2 + (var12 + 10.0F), var11, var12, 42.0F), "Стоп", true, false, () -> {
         VuUvvnuUu.C00OOC00oO();
         this.UuUVuuUu();
      });
      this.UuUVuuUu(
         var1,
         new UNVnvUUUVv.NVnVnNnN(var2 + (var12 + 10.0F) * 2.0F, var11, var12, 42.0F),
         var15 ? "Обучение..." : "Обучить",
         false,
         var15,
         VuUvvnuUu::vVvUvVVuuNvV
      );
      this.UuUVuuUu(
         var1, new UNVnvUUUVv.NVnVnNnN(var2 + (var12 + 10.0F) * 3.0F, var11, var12, 42.0F), var14 ? "Идёт" : "Запуск", false, var14, this::C00OOC00oO
      );
      float var16 = var11 + 58.0F;
      this.UuUVuuUu(var1, var2, var16, var4, 120.0F, "Параметры");
      this.UuUVuuUu(
         var1,
         new UNVnvUUUVv.NVnVnNnN(var2 + 16.0F, var16 + 46.0F, var4 - 32.0F, 30.0F),
         "AI Jitter (сила твоей тряски)",
         0.0F,
         2.0F,
         false,
         AttackAura.NnUuNNU::uUnuvNvvNU,
         AttackAura.NnUuNNU::UuUVuuUu
      );
      UNVnvUUUVv.NVnVnNnN var17 = new UNVnvUUUVv.NVnVnNnN(var2 + 16.0F, var16 + 84.0F, 230.0F, 28.0F);
      boolean var18 = AttackAura.nNvNUVU.uUnuvNvvNU();
      this.UuUVuuUu(var1, var17, var18 ? "Логи: ВКЛ" : "Логи: ВЫКЛ", false, var18, () -> AttackAura.nNvNUVU.C00OOC00oO(!AttackAura.nNvNUVU.uUnuvNvvNU()));
      UNVnvUUUVv.NVnVnNnN var19 = new UNVnvUUUVv.NVnVnNnN(var17.UuUVuuUu + var17.uUnuvNvvNU + 12.0F, var16 + 84.0F, 260.0F, 28.0F);
      boolean var20 = AttackAura.UnUNuUU.uUnuvNvvNU();
      this.UuUVuuUu(var1, var19, var20 ? "Промахи: ВКЛ" : "Промахи: ВЫКЛ", false, var20, () -> AttackAura.UnUNuUU.C00OOC00oO(!AttackAura.UnUNuUU.uUnuvNvvNU()));
      VNVuNNvvuNnu var21 = this.NnUuNNU;
      float var22 = var16 + 132.0F;
      String var23 = var21 != null && var21.UuUVuuUu ? String.valueOf(var21.uUnuvNvvNU) : "-";
      String var24 = VuUvvnuUu.UnUNVVVNuv() < 0.0F ? "-" : String.format(Locale.ROOT, "%.4f", VuUvvnuUu.UnUNVVVNuv());
      String var25 = var21 != null && var21.UuUVuuUu ? "[" + var21.nUUVuvU[0] + "," + var21.nUUVuvU[1] + "," + var21.nUUVuvU[2] + "]" : "-";
      String var26 = var21 != null && var21.UuUVuuUu ? Math.round(var21.VVuuUN * 100.0F) + "%" : "-";
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         var2,
         var22 + 12.0F,
         28.0F,
         "Кадров " + var23 + "   Loss " + var24 + "   Бакеты " + var25 + "   Промахи " + var26,
         UuUVuuUu(195, 204, 220, 230)
      );
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         var2,
         var22 + 44.0F,
         24.0F,
         "Совет: пиши на РАЗНЫХ дистанциях и веди по таргету плавно, не только флик.",
         UuUVuuUu(150, 158, 176, 205)
      );
   }

   private void uUnuvNvvNU(UnVNvNnU var1, float var2, float var3, float var4, float var5) {
      VNVuNNvvuNnu var6 = this.NnUuNNU;
      if (var6 != null && var6.UuUVuuUu) {
         float var7 = (var5 - 18.0F) * 0.5F - 6.0F;
         this.UuUVuuUu(var1, var2, var3, var4, var7, "Yaw: ты vs нейросеть", var6.UnUNuUU, var6.VVnVNnunVvu ? var6.UvUvUNuvNU : null);
         this.UuUVuuUu(var1, var2, var3 + var7 + 18.0F, var4, var7, "Pitch: ты vs нейросеть", var6.uUVuVvuNUvnu, var6.VVnVNnunVvu ? var6.c0oOOCcCoC0 : null);
         if (!var6.VVnVNnunVvu) {
            var1.UuUVuuUu(
               vNvnnVvvVUu.UuUVuuUu, var2 + 16.0F, var3 + 34.0F, 24.0F, "Модель не обучена — оранжевой линии нет. Жми Обучить.", UuUVuuUu(255, 180, 110, 230)
            );
         } else {
            String var8 = var6.unNNVVNnvvV < 0.0F ? "-" : String.format(Locale.ROOT, "%.4f", var6.unNNVVNnvvV);
            String var9 = "Loss " + var8;
            var1.UuUVuuUu(
               vNvnnVvvVUu.UuUVuuUu,
               var2 + var4 - vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var9, 24.0F) - 16.0F,
               var3 + 34.0F,
               24.0F,
               var9,
               UuUVuuUu(150, 200, 255, 230)
            );
         }
      } else {
         this.C00OOC00oO(var1, var2, var3, var4, var5, "Нет данных. Сначала запись и обучение.");
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, String var6, float[] var7, float[] var8) {
      this.UuUVuuUu(var1, var2, var3, var4, var5, var6);
      float var9 = var2 + 14.0F;
      float var10 = var3 + 42.0F;
      float var11 = var4 - 28.0F;
      float var12 = var5 - 64.0F;
      float var13 = var10 + var12 * 0.5F;
      var1.UuUVuuUu(var9, var13 - 0.5F, var11, 1.0F, UuUVuuUu(255, 255, 255, 36));
      float var14 = 6.0F;
      if (var7 != null) {
         for (float var18 : var7) {
            var14 = Math.max(var14, Math.abs(var18));
         }
      }

      if (var8 != null) {
         for (float var23 : var8) {
            var14 = Math.max(var14, Math.abs(var23));
         }
      }

      var14 = Math.min(var14, 35.0F);
      this.UuUVuuUu(var1, var9, var13, var11, var12 * 0.5F - 2.0F, var7, var14, UuUVuuUu(120, 210, 255, 235));
      this.UuUVuuUu(var1, var9, var13, var11, var12 * 0.5F - 2.0F, var8, var14, UuUVuuUu(255, 150, 90, 235));
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var9, var10 + var12 + 18.0F, 22.0F, "ты", UuUVuuUu(120, 210, 255, 220));
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var9 + 48.0F, var10 + var12 + 18.0F, 22.0F, "нейросеть", UuUVuuUu(255, 150, 90, 220));
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, float[] var6, float var7, int var8) {
      if (var6 != null && var6.length != 0) {
         float var9 = var4 / var6.length;
         float var10 = var5 / var7;

         for (int var11 = 0; var11 < var6.length; var11++) {
            float var12 = class_3532.method_15363(var6[var11] * var10, -var5, var5);
            if (var12 >= 0.0F) {
               var1.UuUVuuUu(var2 + var11 * var9, var3 - var12, Math.max(1.0F, var9 * 0.8F), var12, var8);
            } else {
               var1.UuUVuuUu(var2 + var11 * var9, var3, Math.max(1.0F, var9 * 0.8F), -var12, var8);
            }
         }
      }
   }

   private void C00OOC00oO() {
      VuUvvnuUu.uUnuvNvvNU();
      if (ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null
         && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null
         && AttackAura.UNnVVNvvnVvU.vVvUvVVuuNvV.contains("AI")) {
         AttackAura.UNnVVNvvnVvU.uNNnnnuuuN = "AI";
         AttackAura.UNnVVNvvnVvU.vNUvnnVnUvu = AttackAura.UNnVVNvvnVvU.vVvUvVVuuNvV.indexOf("AI");
         AttackAura var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(AttackAura.class);
         if (var1 != null && !var1.nuUnNvnuUu) {
            var1.UuUVuuUu(true);
         }
      }
   }

   private void UuUVuuUu(List<String> var1, int var2) {
      if (var1 != null && !var1.isEmpty()) {
         int var3 = var1.indexOf(VuUvvnuUu.UUVNuUNUvUnV());
         var3 = Math.floorMod((var3 < 0 ? 0 : var3) + var2, var1.size());
         VuUvvnuUu.C00OOC00oO((String)var1.get(var3));
         this.UuUVuuUu();
      }
   }

   private void UuUVuuUu(UnVNvNnU var1, float var2, float var3, float var4, float var5, String var6) {
      var1.UuUVuuUu(var2, var3, var4, var5, 12.0F, UuUVuuUu(255, 255, 255, 12));
      var1.UuUVuuUu(var2, var3, var4, var5, 12.0F, UuUVuuUu(255, 255, 255, 22), 1.0F);
      var1.UuUVuuUu(vNvnnVvvVUu.vVvUvVVuuNvV, var2 + 16.0F, var3 + 26.0F, 28.0F, var6, UuUVuuUu(210, 218, 232, 235));
   }

   private void C00OOC00oO(UnVNvNnU var1, float var2, float var3, float var4, float var5, String var6) {
      float var7 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var6, 28.0F);
      var1.UuUVuuUu(vNvnnVvvVUu.UuUVuuUu, var2 + (var4 - var7) * 0.5F, var3 + var5 * 0.5F, 28.0F, var6, UuUVuuUu(170, 178, 196, 220));
   }

   private void UuUVuuUu(UnVNvNnU var1, UNVnvUUUVv.NVnVnNnN var2, String var3, boolean var4, boolean var5, Runnable var6) {
      boolean var7 = var2.UuUVuuUu(this.UnUNVVVNuv, this.vNVuvnUUnuUn);
      int var8;
      if (var5) {
         var8 = UuUVuuUu(96, 150, 240, 220);
      } else if (var4) {
         var8 = UuUVuuUu(var7 ? 230 : 150, var7 ? 78 : 52, var7 ? 90 : 60, var7 ? 230 : 170);
      } else {
         var8 = UuUVuuUu(255, 255, 255, var7 ? 34 : 18);
      }

      var1.UuUVuuUu(var2.UuUVuuUu, var2.C00OOC00oO, var2.uUnuvNvvNU, var2.vVvUvVVuuNvV, 8.0F, var8);
      this.UuUVuuUu(var1, var3, var2, 28.0F, UuUVuuUu(238, 242, 250, 240));
      this.UuuNnUvUuv.add(new UNVnvUUUVv.nvnNNunvv(var2, var6));
   }

   private void UuUVuuUu(
      UnVNvNnU var1, UNVnvUUUVv.NVnVnNnN var2, String var3, float var4, float var5, boolean var6, UNVnvUUUVv.VvunVVUvUNnv var7, UNVnvUUUVv.uunvUUVnuNn var8
   ) {
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu,
         var2.UuUVuuUu,
         var2.C00OOC00oO - 6.0F,
         24.0F,
         var3 + "  " + String.format(Locale.ROOT, "%.2f", var7.get()),
         UuUVuuUu(190, 198, 214, 225)
      );
      float var9 = var2.C00OOC00oO + 16.0F;
      var1.UuUVuuUu(var2.UuUVuuUu, var9, var2.uUnuvNvvNU, 6.0F, 3.0F, UuUVuuUu(255, 255, 255, 30));
      float var10 = UuUVuuUu((var7.get() - var4) / (var5 - var4), 0.0F, 1.0F);
      var1.UuUVuuUu(var2.UuUVuuUu, var9, var2.uUnuvNvvNU * var10, 6.0F, 3.0F, UuUVuuUu(110, 170, 255, 235));
      var1.C00OOC00oO(var2.UuUVuuUu + var2.uUnuvNvvNU * var10, var9 + 3.0F, 8.0F, 0.0F, 360.0F, UuUVuuUu(235, 242, 255, 245));
      this.nUUVuvU.add(new UNVnvUUUVv.nvUnvV(var3, var4, var5, var6, var7, var8, new UNVnvUUUVv.NVnVnNnN(var2.UuUVuuUu, var9 - 12.0F, var2.uUnuvNvvNU, 30.0F)));
   }

   private void UuUVuuUu(UnVNvNnU var1, String var2, UNVnvUUUVv.NVnVnNnN var3, float var4, int var5) {
      float var6 = vVVUUuunVVV.C00OOC00oO(vNvnnVvvVUu.UuUVuuUu, var2, var4);
      var1.UuUVuuUu(
         vNvnnVvvVUu.UuUVuuUu, var3.UuUVuuUu + (var3.uUnuvNvvNU - var6) * 0.5F, var3.C00OOC00oO + var3.vVvUvVVuuNvV * 0.5F + var4 * 0.2F, var4, var2, var5
      );
   }

   public boolean method_25402(double var1, double var3, int var5) {
      float var6 = this.UuUVuuUu(this.UuUVuuUu(var1));
      float var7 = this.C00OOC00oO(this.C00OOC00oO(var3));
      if (this.uUVuVvuNUvnu.UuUVuuUu(var6, var7)) {
         this.method_25419();
         return true;
      } else {
         for (int var8 = 0; var8 < this.UvUvUNuvNU.length; var8++) {
            if (this.UvUvUNuvNU[var8].UuUVuuUu(var6, var7)) {
               this.UNnVVNvvnVvU = var8;
               return true;
            }
         }

         for (UNVnvUUUVv.nvUnvV var9 : this.nUUVuvU) {
            if (var9.VVuuUN.UuUVuuUu(var6, var7)) {
               this.uNnUnnuNUnNu = var9;
               var9.UuUVuuUu(var6);
               return true;
            }
         }

         for (UNVnvUUUVv.nvnNNunvv var12 : this.UuuNnUvUuv) {
            if (var12.bounds().UuUVuuUu(var6, var7)) {
               var12.action().run();
               return true;
            }
         }

         return super.method_25402(var1, var3, var5);
      }
   }

   public boolean method_25406(double var1, double var3, int var5) {
      this.uNnUnnuNUnNu = null;
      return super.method_25406(var1, var3, var5);
   }

   public boolean method_25403(double var1, double var3, int var5, double var6, double var8) {
      if (this.uNnUnnuNUnNu != null) {
         this.uNnUnnuNUnNu.UuUVuuUu(this.UuUVuuUu(this.UuUVuuUu(var1)));
         return true;
      } else {
         return super.method_25403(var1, var3, var5, var6, var8);
      }
   }

   public boolean method_25404(int var1, int var2, int var3) {
      if (var1 == 256) {
         this.method_25419();
         return true;
      } else {
         return super.method_25404(var1, var2, var3);
      }
   }

   public void method_25419() {
      this.uVunuUNVVUUV = true;
   }

   public boolean method_25421() {
      return false;
   }

   private static void uUnuvNvvNU() {
      if (!UuUVuuUu) {
         UuUVuuUu = true;
         NUvnVVNvvu.UuUVuuUu(new Object() {
            @vuVvUNNvVNV
            public void UuUVuuUu(O0C0OC0OCcCO var1) {
               if (var1.uUnuvNvvNU() != null && var1.uUnuvNvvNU().field_1755 instanceof UNVnvUUUVv var2) {
                  var2.UuUVuuUu(var1.vVvUvVVuuNvV(), var1.nuUnNvnuUu(), var1.VVuuUN());
                  if (var1.vVvUvVVuuNvV() != null) {
                     var1.vVvUvVVuuNvV().uUnuvNvvNU();
                  }
               }
            }
         });
      }
   }

   private void UuUVuuUu(float var1, float var2) {
      this.UnUNVVVNuv = this.UuUVuuUu(var1);
      this.vNVuvnUUnuUn = this.C00OOC00oO(var2);
   }

   private float UuUVuuUu(float var1) {
      return this.UvnvNVnnnnNU <= 0.0F ? var1 : (var1 - this.uVUVnuvnuVuv) / this.UvnvNVnnnnNU + this.uVUVnuvnuVuv;
   }

   private float C00OOC00oO(float var1) {
      return this.UvnvNVnnnnNU <= 0.0F ? var1 : (var1 - this.NVNnnvnuunNv) / this.UvnvNVnnnnNU + this.NVNnnvnuunNv;
   }

   private void vVvUvVVuuNvV() {
      class_310 var1 = class_310.method_1551();
      if (var1 != null && var1.method_22683() != null && var1.field_1729 != null) {
         double var2 = var1.method_22683().method_4489();
         double var4 = var1.method_22683().method_4506();
         if (!(var2 <= 0.0) && !(var4 <= 0.0)) {
            double var6 = var1.field_1729.method_1603();
            double var8 = var1.field_1729.method_1604();
            if (var6 >= 0.0 && var8 >= 0.0 && var6 <= var2 + 2.0 && var8 <= var4 + 2.0) {
               this.UuUVuuUu((float)var6, (float)var8);
            }
         }
      }
   }

   private float UuUVuuUu(double var1) {
      class_310 var3 = class_310.method_1551();
      if (var3 != null && var3.method_22683() != null) {
         int var4 = var3.method_22683().method_4489();
         int var5 = var3.method_22683().method_4486();
         return var4 > 0 && var5 > 0 ? (float)(var1 * var4 / Math.max(1.0, (double)var5)) : (float)var1;
      } else {
         return (float)var1;
      }
   }

   private float C00OOC00oO(double var1) {
      class_310 var3 = class_310.method_1551();
      if (var3 != null && var3.method_22683() != null) {
         int var4 = var3.method_22683().method_4506();
         int var5 = var3.method_22683().method_4502();
         return var4 > 0 && var5 > 0 ? (float)(var1 * var4 / Math.max(1.0, (double)var5)) : (float)var1;
      } else {
         return (float)var1;
      }
   }

   private static String uUnuvNvvNU(float var0) {
      return String.format(Locale.ROOT, "%.1f", var0);
   }

   static float UuUVuuUu(float var0, float var1, float var2) {
      return !Float.isFinite(var0) ? var1 : Math.max(var1, Math.min(var2, var0));
   }

   private static int UuUVuuUu(int var0, int var1, int var2, int var3) {
      return UnVNvNnU.VvunVVUvUNnv.vVvUvVVuuNvV(var0, var1, var2, Math.max(0, Math.min(255, var3)));
   }

   static final class NVnVnNnN {
      final float UuUVuuUu;
      final float C00OOC00oO;
      final float uUnuvNvvNU;
      final float vVvUvVVuuNvV;

      NVnVnNnN(float var1, float var2, float var3, float var4) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
         this.uUnuvNvvNU = var3;
         this.vVvUvVVuuNvV = var4;
      }

      boolean UuUVuuUu(float var1, float var2) {
         return var1 >= this.UuUVuuUu && var1 <= this.UuUVuuUu + this.uUnuvNvvNU && var2 >= this.C00OOC00oO && var2 <= this.C00OOC00oO + this.vVvUvVVuuNvV;
      }
   }

   interface VvunVVUvUNnv {
      float get();
   }

   final class nvUnvV {
      final String UuUVuuUu;
      final float C00OOC00oO;
      final float uUnuvNvvNU;
      final boolean vVvUvVVuuNvV;
      final UNVnvUUUVv.VvunVVUvUNnv uNNnnnuuuN;
      final UNVnvUUUVv.uunvUUVnuNn nuUnNvnuUu;
      final UNVnvUUUVv.NVnVnNnN VVuuUN;

      nvUnvV(String var2, float var3, float var4, boolean var5, UNVnvUUUVv.VvunVVUvUNnv var6, UNVnvUUUVv.uunvUUVnuNn var7, UNVnvUUUVv.NVnVnNnN var8) {
         this.UuUVuuUu = var2;
         this.C00OOC00oO = var3;
         this.uUnuvNvvNU = var4;
         this.vVvUvVVuuNvV = var5;
         this.uNNnnnuuuN = var6;
         this.nuUnNvnuUu = var7;
         this.VVuuUN = var8;
      }

      void UuUVuuUu(float var1) {
         float var2 = UNVnvUUUVv.UuUVuuUu((var1 - this.VVuuUN.UuUVuuUu) / this.VVuuUN.uUnuvNvvNU, 0.0F, 1.0F);
         float var3 = this.C00OOC00oO + var2 * (this.uUnuvNvvNU - this.C00OOC00oO);
         if (this.vVvUvVVuuNvV) {
            var3 = Math.round(var3);
         } else {
            var3 = Math.round(var3 * 100.0F) / 100.0F;
         }

         this.nuUnNvnuUu.set(UNVnvUUUVv.UuUVuuUu(var3, this.C00OOC00oO, this.uUnuvNvvNU));
      }
   }

   record nvnNNunvv(UNVnvUUUVv.NVnVnNnN bounds, Runnable action) {
   }

   interface uunvUUVnuNn {
      void set(float var1);
   }
}
