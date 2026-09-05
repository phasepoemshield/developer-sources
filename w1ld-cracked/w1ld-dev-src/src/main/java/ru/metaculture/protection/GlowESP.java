package ru.metaculture.protection;

import com.mojang.blaze3d.systems.RenderSystem;
import java.util.function.Predicate;
import net.minecraft.class_1297;
import net.minecraft.class_1309;
import net.minecraft.class_1542;
import net.minecraft.class_1657;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_4184;
import org.joml.Matrix4f;
import org.joml.Vector3f;
import org.joml.Vector4f;
import org.lwjgl.glfw.GLFW;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "GlowESP",
   C00OOC00oO = "Шейдерная градиентная обводка игроков",
   uUnuvNvvNU = oOOOo0.Visuals
)
public final class GlowESP extends Module {
   private static final String UUVNuUNUvUnV = "glow_esp";
   private static final String vuvnUnVnUNnV = "glow_esp_friends";
   private static final C0cc0cCOo0O.NVnVnNnN nnuUVNUuvvVU = new C0cc0cCOo0O.NVnVnNnN(0, 0, Integer.MAX_VALUE, Integer.MAX_VALUE);
   public final VUVnvvnNN NVNnnvnuunNv = new VUVnvvnNN(
      "Цели", new vvNnnUNnVvn("Игроки", true), new vvNnnUNnVvn("Мобы", false), new vvNnnUNnVvn("Предметы", false), new vvNnnUNnVvn("Себя", false)
   );
   public final vvNnnUNnVvn uVunuUNVVUUV = new vvNnnUNnVvn("Невидимые", true);
   public final nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Дистанция", 96.0F, 8.0F, 256.0F, 1.0F, false);
   public final UvNnUnuNUUU uNnUnnuNUnNu = new UvNnUnuNUUU("Эффект", "Свечение + контур", "Свечение + контур", "Свечение", "Контур");
   public final nNUuNvVn NnUuNNU = new nNUuNvVn("Размер свечения", 10.0F, 2.0F, 32.0F, 1.0F, false).UuUVuuUu(this::vNVuvnUUnuUn);
   public final nNUuNvVn nNvNUVU = new nNUuNvVn("Яркость свечения", 2.0F, 0.25F, 5.0F, 0.05F, false).UuUVuuUu(this::vNVuvnUUnuUn);
   public final nNUuNvVn UnUNuUU = new nNUuNvVn("Толщина контура", 2.0F, 0.5F, 6.0F, 0.5F, false).UuUVuuUu(this::UnUNVVVNuv);
   public final nNUuNvVn uUVuVvuNUvnu = new nNUuNvVn("Прозрачность", 0.92F, 0.05F, 1.0F, 0.01F, true);
   public final UvNnUnuNUUU UvUvUNuvNU = new UvNnUnuNUUU("Режим цвета", "Градиент", "Градиент", "Статичный");
   public final UvNnUnuNUUU c0oOOCcCoC0 = new UvNnUnuNUUU("Источник цвета", "Тема", "Тема", "Свой");
   public final VnnUvVNuNuVv VVnVNnunVvu = new VnnUvVNuNuVv("Основной цвет", 55.0F, 0.72F, 1.0F).C00OOC00oO(() -> this.c0oOOCcCoC0.C00OOC00oO("Тема"));
   public final VnnUvVNuNuVv unNNVVNnvvV = new VnnUvVNuNuVv("Второй цвет", 76.0F, 0.78F, 1.0F)
      .C00OOC00oO(() -> this.c0oOOCcCoC0.C00OOC00oO("Тема") || this.UvUvUNuvNU.C00OOC00oO("Статичный"));
   public final vvNnnUNnVvn NuunnvnN = new vvNnnUNnVvn("Выделять друзей", true);
   public final VnnUvVNuNuVv NVUunUNUN = new VnnUvVNuNuVv("Цвет друзей", 40.0F, 0.8F, 1.0F).C00OOC00oO(() -> !this.NuunnvnN.uUnuvNvvNU());
   private final Predicate<class_1297> nVVUuvuNnUN = this::UuUVuuUu;
   private final Predicate<class_1297> nNnVnUNVV = var1 -> this.UuUVuuUu(var1) && this.C00OOC00oO(var1);
   private C0cc0cCOo0O nuunNvv;
   private static final int uUVVvVVNvvn = 0;
   private static final int vvUVNVvvNUv = 1;
   private static final int UuNnnVnuNNV = 2;
   private final Matrix4f uUVvnUuNvvN = new Matrix4f();
   private final Matrix4f UUuUnNVNuuv = new Matrix4f();
   private final Vector4f NVuNUuVnVUN = new Vector4f();
   private final Vector3f NVuunNnvvvVu = new Vector3f();
   private final int[] vNnNuuvVn = new int[]{0, 0, 0, 0};
   private final float[] VUuuVUnun = new float[4];
   private final float[] vVVuuVVv = new float[3];
   private final float[] VuunNUUUvu = new float[3];
   private final float[] NNUUNUuVNNVn = new float[3];
   private final float[] VvVvnNUnvuvV = new float[4];
   private boolean ccOO0COcoco0;
   private C0cc0cCOo0O.NVnVnNnN NUVvUUVuVNVv;

   public GlowESP() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            this.NVNnnvnuunNv,
            this.uVunuUNVVUUV,
            this.UNnVVNvvnVvU,
            this.uNnUnnuNUnNu,
            this.NnUuNNU,
            this.nNvNUVU,
            this.UnUNuUU,
            this.uUVuVvuNUvnu,
            this.UvUvUNuvNU,
            this.c0oOOCcCoC0,
            this.VVnVNnunVvu,
            this.unNNVVNnvvV,
            this.NuunnvnN,
            this.NVUunUNUN
         }
      );
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.nUUVuvU();
   }

   @Override
   public void C00OOC00oO() {
      nuVUnVnVvV var1 = nuVUnVnVvV.UuUVuuUu();
      var1.C00OOC00oO("glow_esp_friends");
      var1.UuUVuuUu("glow_esp");
      this.UvnvNVnnnnNU();
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VvuuvuVVvvn var1) {
      this.nUUVuvU();
   }

   @vuVvUNNvVNV(
      UuUVuuUu = 0
   )
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      this.nUUVuvU();
      if (!NnuVnuNVV.UuUVuuUu()) {
         if (var1 != null
            && var1.uUnuvNvvNU() != null
            && uUnuvNvvNU.field_1687 != null
            && uUnuvNvvNU.field_1724 != null
            && uUnuvNvvNU.method_22683() != null
            && !uUnuvNvvNU.method_22683().method_65966()) {
            int var2 = var1.nuUnNvnuUu();
            int var3 = var1.VVuuUN();
            if (var2 > 0 && var3 > 0) {
               this.UuUVuuUu(var2, var3, var1.vVvUvVVuuNvV());
            }
         }
      }
   }

   @Override
   public void UuuNnUvUuv() {
      if (this.nuUnNvnuUu
         && NnuVnuNVV.UuUVuuUu()
         && uUnuvNvvNU.field_1687 != null
         && uUnuvNvvNU.field_1724 != null
         && uUnuvNvvNU.method_22683() != null
         && !uUnuvNvvNU.method_22683().method_65966()) {
         int var1 = uUnuvNvvNU.method_22683().method_4489();
         int var2 = uUnuvNvvNU.method_22683().method_4506();
         if (var1 > 0 && var2 > 0) {
            this.UuUVuuUu(var1, var2, null);
         }
      }
   }

   private void UuUVuuUu(int var1, int var2, UnVNvNnU var3) {
      nuVUnVnVvV var4 = nuVUnVnVvV.UuUVuuUu();
      int var5 = var4.vVvUvVVuuNvV();
      int var6 = var4.uNNnnnuuuN();
      if (var5 > 0) {
         int var7 = 0;
         int var8 = 0;
         if (this.NuunnvnN.uUnuvNvvNU() && var6 > 0) {
            var7 = var4.VVuuUN();
            var8 = var4.vNUvnnVnUvu();
         }

         boolean var9 = var7 > 0 && var8 > 0;
         float var10 = this.NnUuNNU.uUnuvNvvNU() * 2.0F;
         float var11 = this.UnUNuUU.uUnuvNvvNU();
         C0cc0cCOo0O.NVnVnNnN var12 = this.UuUVuuUu(var1, var2, this.vNVuvnUUnuUn() ? 0.0F : var10, this.UnUNVVVNuv() ? 0.0F : var11);
         if (var12 != null) {
            C0cc0cCOo0O.NVnVnNnN var13 = var12 == nnuUVNUuvvVU ? null : var12;
            if (this.nuunNvv == null) {
               this.nuunNvv = new C0cc0cCOo0O();
            }

            if (var3 != null) {
               var3.uUnuvNvvNU();
            }

            this.C00OOC00oO(this.vVVuuVVv, this.VuunNUUUvu);
            this.nuunNvv.UuUVuuUu(var5, var6, var1, var2, this.UuUVuuUu(this.vVVuuVVv, this.VuunNUUUvu), var13, var7, var8, var9 ? 1 : 0);
            if (var9) {
               UuUVuuUu(this.NVUunUNUN.uUnuvNvvNU().getRGB(), this.NNUUNUuVNNVn);
               this.nuunNvv.UuUVuuUu(var5, var6, var1, var2, this.UuUVuuUu(this.NNUUNUuVNNVn, this.NNUUNUuVNNVn), this.NUVvUUVuVNVv, var7, var8, 2);
            }

            if (var3 != null) {
               var3.uUnuvNvvNU();
            }
         }
      }
   }

   private C0cc0cCOo0O.nvnNNunvv UuUVuuUu(float[] var1, float[] var2) {
      return new C0cc0cCOo0O.nvnNNunvv(
         this.NnUuNNU.uUnuvNvvNU() * 2.0F,
         this.UnUNuUU.uUnuvNvvNU(),
         this.vNVuvnUUnuUn() ? 0.0F : this.nNvNUVU.uUnuvNvvNU() * 2.0F,
         this.UnUNVVVNuv() ? 0.0F : 1.35F,
         this.uUVuVvuNUvnu.uUnuvNvvNU(),
         0,
         this.UvUvUNuvNU.C00OOC00oO("Статичный") ? 1 : 0,
         0,
         var1[0],
         var1[1],
         var1[2],
         var2[0],
         var2[1],
         var2[2]
      );
   }

   private boolean UuUVuuUu(class_1297 var1) {
      if (!this.nuUnNvnuUu || uUnuvNvvNU.field_1724 == null || var1 == null || !var1.method_5805() || var1.method_31481()) {
         return false;
      } else if (var1.method_5767() && !this.uVunuUNVVUUV.uUnuvNvvNU()) {
         return false;
      } else {
         float var2 = Math.max(1.0F, this.UNnVVNvvnVvU.uUnuvNvvNU());
         if (uUnuvNvvNU.field_1724.method_5858(var1) > var2 * var2) {
            return false;
         } else if (var1 == uUnuvNvvNU.field_1724) {
            return this.NVNnnvnuunNv.C00OOC00oO("Себя");
         } else if (var1 instanceof class_1657) {
            return this.NVNnnvnuunNv.C00OOC00oO("Игроки");
         } else {
            return var1 instanceof class_1542 ? this.NVNnnvnuunNv.C00OOC00oO("Предметы") : var1 instanceof class_1309 && this.NVNnnvnuunNv.C00OOC00oO("Мобы");
         }
      }
   }

   private C0cc0cCOo0O.NVnVnNnN UuUVuuUu(int var1, int var2, float var3, float var4) {
      this.NUVvUUVuVNVv = null;
      this.ccOO0COcoco0 = false;
      if (uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1773 != null && var1 > 0 && var2 > 0) {
         class_4184 var5 = uUnuvNvvNU.field_1773.method_19418();
         if (var5 == null) {
            return nnuUVNUuvvVU;
         } else {
            class_243 var6 = var5.method_19326();
            this.uUVvnUuNvvN.set(VnNnNnvuvn.uUnuvNvvNU);
            this.UUuUnNVNuuv.set(VnNnNnvuvn.UuUVuuUu).mul(VnNnNnvuvn.C00OOC00oO);
            this.vNnNuuvVn[0] = 0;
            this.vNnNuuvVn[1] = 0;
            this.vNnNuuvVn[2] = var1;
            this.vNnNuuvVn[3] = var2;
            float var7 = uUnuvNvvNU.method_61966().method_60637(true);
            boolean var8 = this.NuunnvnN.uUnuvNvvNU();
            float var9 = Float.POSITIVE_INFINITY;
            float var10 = Float.POSITIVE_INFINITY;
            float var11 = Float.NEGATIVE_INFINITY;
            float var12 = Float.NEGATIVE_INFINITY;
            boolean var13 = false;

            for (class_1297 var15 : uUnuvNvvNU.field_1687.method_18112()) {
               if (this.UuUVuuUu(var15)) {
                  int var16 = this.UuUVuuUu(var15, var7, var1, var2, var6);
                  if (var16 == 2) {
                     return nnuUVNUuvvVU;
                  }

                  if (var16 != 1) {
                     var9 = Math.min(var9, this.VUuuVUnun[0]);
                     var10 = Math.min(var10, this.VUuuVUnun[1]);
                     var11 = Math.max(var11, this.VUuuVUnun[2]);
                     var12 = Math.max(var12, this.VUuuVUnun[3]);
                     var13 = true;
                     if (var8 && this.C00OOC00oO(var15)) {
                        if (this.ccOO0COcoco0) {
                           this.VvVvnNUnvuvV[0] = Math.min(this.VvVvnNUnvuvV[0], this.VUuuVUnun[0]);
                           this.VvVvnNUnvuvV[1] = Math.min(this.VvVvnNUnvuvV[1], this.VUuuVUnun[1]);
                           this.VvVvnNUnvuvV[2] = Math.max(this.VvVvnNUnvuvV[2], this.VUuuVUnun[2]);
                           this.VvVvnNUnvuvV[3] = Math.max(this.VvVvnNUnvuvV[3], this.VUuuVUnun[3]);
                        } else {
                           this.VvVvnNUnvuvV[0] = this.VUuuVUnun[0];
                           this.VvVvnNUnvuvV[1] = this.VUuuVUnun[1];
                           this.VvVvnNUnvuvV[2] = this.VUuuVUnun[2];
                           this.VvVvnNUnvuvV[3] = this.VUuuVUnun[3];
                           this.ccOO0COcoco0 = true;
                        }
                     }
                  }
               }
            }

            if (this.ccOO0COcoco0) {
               this.NUVvUUVuVNVv = this.UuUVuuUu(this.VvVvnNUnvuvV, var1, var2, var3, var4);
            }

            if (var13 && Float.isFinite(var9) && Float.isFinite(var10) && Float.isFinite(var11) && Float.isFinite(var12)) {
               int var21 = (int)Math.ceil(Math.max(8.0F, var3 + var4 * 4.0F + 18.0F));
               int var22 = Math.max(0, (int)Math.floor(var9) - var21);
               int var23 = Math.max(0, (int)Math.floor(var10) - var21);
               int var17 = Math.min(var1, (int)Math.ceil(var11) + var21);
               int var18 = Math.min(var2, (int)Math.ceil(var12) + var21);
               int var19 = var17 - var22;
               int var20 = var18 - var23;
               return var19 > 2 && var20 > 2 ? new C0cc0cCOo0O.NVnVnNnN(var22, var23, var19, var20) : nnuUVNUuvvVU;
            } else {
               return null;
            }
         }
      } else {
         return nnuUVNUuvvVU;
      }
   }

   private int UuUVuuUu(class_1297 var1, float var2, int var3, int var4, class_243 var5) {
      class_243 var6 = var1.method_30950(var2);
      class_243 var7 = var1.method_19538();
      double var8 = var6.field_1352 - var7.field_1352;
      double var10 = var6.field_1351 - var7.field_1351;
      double var12 = var6.field_1350 - var7.field_1350;
      double var14 = var1 instanceof class_1542 ? 0.45 : 0.18;
      double var16 = Math.max(0.1, var14 * 0.65);
      class_238 var18 = var1.method_5829();
      double var19 = var18.field_1323 + var8 - var14;
      double var21 = var18.field_1320 + var8 + var14;
      double var23 = var18.field_1322 + var10 - var16;
      double var25 = var18.field_1325 + var10 + var16;
      double var27 = var18.field_1321 + var12 - var14;
      double var29 = var18.field_1324 + var12 + var14;
      float var31 = Float.POSITIVE_INFINITY;
      float var32 = Float.POSITIVE_INFINITY;
      float var33 = Float.NEGATIVE_INFINITY;
      float var34 = Float.NEGATIVE_INFINITY;

      for (int var35 = 0; var35 < 2; var35++) {
         double var36 = var35 == 0 ? var19 : var21;

         for (int var38 = 0; var38 < 2; var38++) {
            double var39 = var38 == 0 ? var23 : var25;

            for (int var41 = 0; var41 < 2; var41++) {
               double var42 = var41 == 0 ? var27 : var29;
               if (!this.UuUVuuUu(var36, var39, var42, var5)) {
                  return 2;
               }

               float var44 = this.NVuunNnvvvVu.z;
               if (var44 <= 0.001F || var44 > 1.0F) {
                  return 2;
               }

               float var45 = this.NVuunNnvvvVu.x;
               float var46 = var4 - this.NVuunNnvvvVu.y;
               var31 = Math.min(var31, var45);
               var32 = Math.min(var32, var46);
               var33 = Math.max(var33, var45);
               var34 = Math.max(var34, var46);
            }
         }
      }

      if (!Float.isFinite(var31) || !Float.isFinite(var32) || !Float.isFinite(var33) || !Float.isFinite(var34)) {
         return 1;
      } else if (!(var33 < 0.0F) && !(var34 < 0.0F) && !(var31 > var3) && !(var32 > var4)) {
         int var47 = Math.max(0, (int)Math.floor(var31));
         int var48 = Math.max(0, (int)Math.floor(var32));
         int var37 = Math.min(var3, (int)Math.ceil(var33));
         int var49 = Math.min(var4, (int)Math.ceil(var34));
         if (var37 - var47 > 0 && var49 - var48 > 0) {
            this.VUuuVUnun[0] = var47;
            this.VUuuVUnun[1] = var48;
            this.VUuuVUnun[2] = var37;
            this.VUuuVUnun[3] = var49;
            return 0;
         } else {
            return 1;
         }
      } else {
         return 1;
      }
   }

   private boolean UuUVuuUu(double var1, double var3, double var5, class_243 var7) {
      this.NVuNUuVnVUN.set((float)(var1 - var7.field_1352), (float)(var3 - var7.field_1351), (float)(var5 - var7.field_1350), 1.0F).mul(this.uUVvnUuNvvN);
      this.UUuUnNVNuuv.project(this.NVuNUuVnVUN.x(), this.NVuNUuVnVUN.y(), this.NVuNUuVnVUN.z(), this.vNnNuuvVn, this.NVuunNnvvvVu);
      return Float.isFinite(this.NVuunNnvvvVu.x) && Float.isFinite(this.NVuunNnvvvVu.y) && Float.isFinite(this.NVuunNnvvvVu.z);
   }

   private void nUUVuvU() {
      nuVUnVnVvV var1 = nuVUnVnVvV.UuUVuuUu();
      var1.UuUVuuUu("glow_esp", this.nuUnNvnuUu, this.nVVUuvuNnUN);
      boolean var2 = this.nuUnNvnuUu && this.NuunnvnN.uUnuvNvvNU() && !uNvUVUNvuUVV.vVvUvVVuuNvV().isEmpty();
      var1.C00OOC00oO("glow_esp_friends", var2, this.nNnVnUNVV);
   }

   private boolean UnUNVVVNuv() {
      return this.uNnUnnuNUnNu.C00OOC00oO("Свечение");
   }

   private boolean vNVuvnUUnuUn() {
      return this.uNnUnnuNUnNu.C00OOC00oO("Контур");
   }

   private boolean C00OOC00oO(class_1297 var1) {
      if (var1 instanceof class_1657 var2 && var1 != uUnuvNvvNU.field_1724) {
         String var3 = var2.method_7334() != null ? var2.method_7334().getName() : var2.method_5477().getString();
         return uNvUVUNvuUVV.UuUVuuUu(var3);
      } else {
         return false;
      }
   }

   private C0cc0cCOo0O.NVnVnNnN UuUVuuUu(float[] var1, int var2, int var3, float var4, float var5) {
      int var6 = (int)Math.ceil(Math.max(8.0F, var4 + var5 * 4.0F + 18.0F));
      int var7 = Math.max(0, (int)Math.floor(var1[0]) - var6);
      int var8 = Math.max(0, (int)Math.floor(var1[1]) - var6);
      int var9 = Math.min(var2, (int)Math.ceil(var1[2]) + var6);
      int var10 = Math.min(var3, (int)Math.ceil(var1[3]) + var6);
      int var11 = var9 - var7;
      int var12 = var10 - var8;
      return var11 > 2 && var12 > 2 ? new C0cc0cCOo0O.NVnVnNnN(var7, var8, var11, var12) : null;
   }

   private void C00OOC00oO(float[] var1, float[] var2) {
      if (this.c0oOOCcCoC0.C00OOC00oO("Свой")) {
         UuUVuuUu(this.VVnVNnunVvu.uUnuvNvvNU().getRGB(), var1);
         UuUVuuUu(this.unNNVVNnvvV.uUnuvNvvNU().getRGB(), var2);
      } else {
         NvVNvUvunNNu var3 = NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nvUVNnuu != null ? NVnVnNnN.UuUVuuUu.nvUVNnuu.C00OOC00oO() : NvVNvUvunNNu.WILD;
         NUunUunuNV var4 = NUunUunuNV.UuUVuuUu(var3, VVNunVNVuuu.vVvUvVVuuNvV());
         UuUVuuUu(var4.uVunuUNVVUUV(), var1);
         UuUVuuUu(var4.UNnVVNvvnVvU(), var2);
      }
   }

   private static void UuUVuuUu(int var0, float[] var1) {
      var1[0] = (var0 >> 16 & 0xFF) / 255.0F;
      var1[1] = (var0 >> 8 & 0xFF) / 255.0F;
      var1[2] = (var0 & 0xFF) / 255.0F;
   }

   private void UvnvNVnnnnNU() {
      C0cc0cCOo0O var1 = this.nuunNvv;
      this.nuunNvv = null;
      if (var1 != null) {
         if (RenderSystem.isOnRenderThread() && GLFW.glfwGetCurrentContext() != 0L) {
            var1.close();
         } else {
            if (uUnuvNvvNU != null) {
               uUnuvNvvNU.execute(var1::close);
            }
         }
      }
   }
}
