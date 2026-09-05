package ru.metaculture.protection;

import net.minecraft.class_1268;
import net.minecraft.class_1306;
import net.minecraft.class_3532;
import net.minecraft.class_4587;
import net.minecraft.class_7833;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Swing Animation",
   C00OOC00oO = "Кастомизация анимации руки",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class Swing_Animation extends Module {
   public static UvNnUnuNUUU NVNnnvnuunNv = new UvNnUnuNUUU("Анимация", "Smooth", "Smooth", "Swipe", "Swipe back", "SwipeD", "Down", "Spin", "Off");
   public static nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Скорость анимации", 1.0F, 0.1F, 3.0F, 0.1F, false);
   public static nNUuNvVn UNnVVNvvnVvU = new nNUuNvVn("Размер анимации", 3.7F, 1.0F, 10.0F, 0.1F, false).UuUVuuUu(() -> NVNnnvnuunNv.C00OOC00oO("Off"));
   public static nNUuNvVn uNnUnnuNUnNu = new nNUuNvVn("Размер предмета справа", 1.0F, 0.2F, 2.5F, 0.05F, false);
   public static nNUuNvVn NnUuNNU = new nNUuNvVn("Размер предмета слева", 1.0F, 0.2F, 2.5F, 0.05F, false);
   public static vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("Только Аура", false);
   public static vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("Модель Руки", false);
   public static vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Менять обе руки", false).UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU());
   public static nNUuNvVn UvUvUNuvNU = new nNUuNvVn("X", 0.0F, -2.0F, 2.0F, 0.01F, false).UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU() || !uUVuVvuNUvnu.uUnuvNvvNU());
   public static nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Y", 0.0F, -2.0F, 2.0F, 0.01F, false).UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU() || !uUVuVvuNUvnu.uUnuvNvvNU());
   public static nNUuNvVn VVnVNnunVvu = new nNUuNvVn("Z", 0.0F, -2.0F, 2.0F, 0.01F, false).UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU() || !uUVuVvuNUvnu.uUnuvNvvNU());
   public static nNUuNvVn unNNVVNnvvV = new nNUuNvVn("X правая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU() || uUVuVvuNUvnu.uUnuvNvvNU());
   public static nNUuNvVn NuunnvnN = new nNUuNvVn("Y правая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU() || uUVuVvuNUvnu.uUnuvNvvNU());
   public static nNUuNvVn NVUunUNUN = new nNUuNvVn("Z правая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU() || uUVuVvuNUvnu.uUnuvNvvNU());
   public static nNUuNvVn UUVNuUNUvUnV = new nNUuNvVn("X левая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU() || uUVuVvuNUvnu.uUnuvNvvNU());
   public static nNUuNvVn vuvnUnVnUNnV = new nNUuNvVn("Y левая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU() || uUVuVvuNUvnu.uUnuvNvvNU());
   public static nNUuNvVn nnuUVNUuvvVU = new nNUuNvVn("Z левая", 0.0F, -2.0F, 2.0F, 0.01F, false)
      .UuUVuuUu(() -> !UnUNuUU.uUnuvNvvNU() || uUVuVvuNUvnu.uUnuvNvvNU());

   public Swing_Animation() {
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            NVNnnvnuunNv,
            uVunuUNVVUUV,
            uNnUnnuNUnNu,
            NnUuNNU,
            UNnVVNvvnVvU,
            nNvNUVU,
            UnUNuUU,
            uUVuVvuNUvnu,
            UvUvUNuvNU,
            c0oOOCcCoC0,
            VVnVNnunVvu,
            unNNVVNnvvV,
            NuunnvnN,
            NVUunUNUN,
            UUVNuUNUvUnV,
            vuvnUnVnUNnV,
            nnuUVNUuvvVU
         }
      );
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(NNvunVVuvV var1) {
      if (this.nuUnNvnuUu && !NVNnnvnuunNv.C00OOC00oO("Off")) {
         if (UuuNnUvUuv() && var1.vVvUvVVuuNvV().equals(class_1268.field_5808)) {
            String var2 = NVNnnvnuunNv.uUnuvNvvNU();
            if (!var2.equals("Off")) {
               if (var1.vVvUvVVuuNvV().equals(class_1268.field_5808)) {
                  class_4587 var3 = var1.uUnuvNvvNU();
                  float var4 = var1.uNNnnnuuuN();
                  int var5 = uUnuvNvvNU.field_1724.method_6068().equals(class_1306.field_6183) ? 1 : -1;
                  float var6 = (float)Math.sin(var4 * (Math.PI / 2) * 2.0);
                  float var7 = (float)Math.sin(var4 * (Math.PI / 2) * 2.0);
                  float var8 = (float)(Math.sin(var4 * Math.PI) * 0.5);
                  float var9 = class_3532.method_15374(var4 * var4 * (float) Math.PI);
                  float var10 = class_3532.method_15374(class_3532.method_15355(var4) * (float) Math.PI);
                  String var11 = NVNnnvnuunNv.uUnuvNvvNU();
                  switch (var11) {
                     case "Swipe":
                        var3.method_46416(var5 * 0.67F, -0.32F, -1.0F);
                        var3.method_22907(class_7833.field_40716.rotationDegrees(90 * var5));
                        var3.method_22907(class_7833.field_40718.rotationDegrees(-60 * var5));
                        var3.method_22907(class_7833.field_40714.rotationDegrees(var6 * -UNnVVNvvnVvU.uUnuvNvvNU() * 10.0F));
                        var3.method_22907(class_7833.field_40714.rotationDegrees(-90.0F));
                        break;
                     case "Swipe back":
                        var3.method_46416(var5 * 0.67F, -0.32F, -1.0F);
                        var3.method_22907(class_7833.field_40716.rotationDegrees(90 * var5));
                        var3.method_22907(class_7833.field_40718.rotationDegrees(-60 * var5));
                        var3.method_22907(class_7833.field_40714.rotationDegrees(var6 * UNnVVNvvnVvU.uUnuvNvvNU() * 10.0F));
                        var3.method_22907(class_7833.field_40714.rotationDegrees(-90.0F));
                        break;
                     case "SwipeD":
                        var3.method_46416(var5 * 0.67F, -0.32F, -1.0F);
                        var3.method_46416(var10 * -UNnVVNvvnVvU.uUnuvNvvNU() / 35.0F, 0.0F, var10 * -UNnVVNvvnVvU.uUnuvNvvNU() / 35.0F);
                        var3.method_22907(class_7833.field_40716.rotationDegrees(25.0F));
                        var3.method_22907(class_7833.field_40714.rotationDegrees(var10 * -UNnVVNvvnVvU.uUnuvNvvNU() * 5.0F));
                        var3.method_22907(class_7833.field_40716.rotationDegrees(30.0F));
                        var3.method_22907(class_7833.field_40714.rotationDegrees(-90.0F));
                        var3.method_22907(class_7833.field_40716.rotationDegrees(50.0F));
                        break;
                     case "Down":
                        var3.method_46416(var5 * 0.67F, -0.32F, -1.0F);
                        var3.method_22907(class_7833.field_40716.rotationDegrees(80 * var5));
                        var3.method_22907(class_7833.field_40718.rotationDegrees(-30 * var5));
                        var3.method_22907(class_7833.field_40714.rotationDegrees(var6 * -UNnVVNvvnVvU.uUnuvNvvNU() * 10.0F));
                        var3.method_22907(class_7833.field_40714.rotationDegrees(-100.0F));
                        break;
                     case "Spin":
                        var3.method_46416(var5 * 0.56F, -0.42F, -0.72F);
                        var3.method_22907(class_7833.field_40714.rotationDegrees(0.0F + var4 * 360.0F));
                        var3.method_22904(0.0, -0.1, 0.0);
                        break;
                     case "Smooth":
                        var3.method_46416(var5 * 0.56F, -0.42F, -0.72F);
                        var3.method_22907(class_7833.field_40716.rotationDegrees(var5 * (45.0F + var6 * -UNnVVNvvnVvU.uUnuvNvvNU() * 3.0F)));
                        var3.method_22907(class_7833.field_40718.rotationDegrees(var5 * var7 * -UNnVVNvvnVvU.uUnuvNvvNU() * 2.0F));
                        var3.method_22907(class_7833.field_40714.rotationDegrees(var7 * -UNnVVNvvnVvU.uUnuvNvvNU() * 10.0F));
                        var3.method_22907(class_7833.field_40716.rotationDegrees(var5 * -45.0F));
                        var3.method_22904(0.0, -0.1, 0.0);
                  }

                  var1.C00OOC00oO();
               }
            }
         }
      }
   }

   public static boolean UuuNnUvUuv() {
      if (!nNvNUVU.uUnuvNvvNU()) {
         return true;
      } else {
         AttackAura var0 = (AttackAura)NVnVnNnN.UuUVuuUu.C00OOC00oO.C00OOC00oO(AttackAura.class);
         return var0 != null && var0.nuUnNvnuUu && AttackAura.ccOO0COcoco0 != null;
      }
   }

   public static float UuUVuuUu(class_1268 var0) {
      if (var0 != null && NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.C00OOC00oO != null && uUnuvNvvNU.field_1724 != null) {
         Swing_Animation var1 = NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(Swing_Animation.class);
         if (var1 != null && var1.nuUnNvnuUu) {
            class_1306 var2 = var0 == class_1268.field_5808
               ? uUnuvNvvNU.field_1724.method_6068()
               : (uUnuvNvvNU.field_1724.method_6068() == class_1306.field_6183 ? class_1306.field_6182 : class_1306.field_6183);
            return var2 == class_1306.field_6183 ? uNnUnnuNUnNu.uUnuvNvvNU() : NnUuNNU.uUnuvNvvNU();
         } else {
            return 1.0F;
         }
      } else {
         return 1.0F;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vNUuUNVun var1) {
      boolean var2 = var1.uNNnnnuuuN();
      class_4587 var3 = var1.uUnuvNvvNU();
      if (UnUNuUU.uUnuvNvvNU() && uUVuVvuNUvnu.uUnuvNvvNU()) {
         if (var2) {
            var3.method_46416(UvUvUNuvNU.uUnuvNvvNU(), c0oOOCcCoC0.uUnuvNvvNU(), VVnVNnunVvu.uUnuvNvvNU());
         } else {
            var3.method_46416(-UvUvUNuvNU.uUnuvNvvNU(), c0oOOCcCoC0.uUnuvNvvNU(), VVnVNnunVvu.uUnuvNvvNU());
         }
      }

      if (UnUNuUU.uUnuvNvvNU() && !uUVuVvuNUvnu.uUnuvNvvNU()) {
         if (var2) {
            var3.method_46416(unNNVVNnvvV.uUnuvNvvNU(), NuunnvnN.uUnuvNvvNU(), NVUunUNUN.uUnuvNvvNU());
         } else {
            var3.method_46416(UUVNuUNUvUnV.uUnuvNvvNU(), vuvnUnVnUNnV.uUnuvNvvNU(), nnuUVNUuvvVU.uUnuvNvvNU());
         }
      }
   }
}
