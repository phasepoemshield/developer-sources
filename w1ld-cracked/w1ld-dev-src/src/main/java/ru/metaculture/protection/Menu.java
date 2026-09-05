package ru.metaculture.protection;

import net.minecraft.class_310;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Menu",
   C00OOC00oO = "Настройки клиента",
   uUnuvNvvNU = oOOOo0.Visuals
)
public class Menu extends Module {
   public static Menu NVNnnvnuunNv;
   private static final float NnuUnUNnu = 0.86F;
   private static final float UnnnvvU = 0.86F;
   public static final String uVunuUNVVUUV = "Графика";
   public static final String UNnVVNvvnVvU = "Эффекты";
   public static final String uNnUnnuNUnNu = "Темы";
   public static final String NnUuNNU = "Производительность";
   public static final UvNnUnuNUUU nNvNUVU = new UvNnUnuNUUU("Категория", "Графика", "Графика", "Эффекты", "Темы", "Производительность");
   public static final nNUuNvVn UnUNuUU = new nNUuNvVn("Качество графики", 2.0F, 0.0F, 3.0F, 1.0F, false)
      .UuUVuuUu(uUuuvNuvVn.C00OOC00oO())
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Графика"));
   public static final vvNnnUNnVvn uUVuVvuNUvnu = new vvNnnUNnVvn("Применять пресет автоматически", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Графика"));
   public static final UvNnUnuNUUU UvUvUNuvNU = new UvNnUnuNUUU("Стиль анимаций", "Smooth", "Smooth", "Snappy", "Bouncy", "Cinematic", "Linear")
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Графика"));
   public static final nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("Масштаб GUI", 0.86F, 0.55F, 1.7F, 0.01F, false).UuUVuuUu(() -> true);
   public static final nNUuNvVn VVnVNnunVvu = new nNUuNvVn("Масштаб панели темы", 0.86F, 0.55F, 1.7F, 0.01F, false).UuUVuuUu(() -> true);
   public static final vvNnnUNnVvn unNNVVNnvvV = new vvNnnUNnVvn("Волны клика", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn NuunnvnN = new vvNnnUNnVvn("Волны темы", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn NVUunUNUN = new vvNnnUNnVvn("Ударная волна темы", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn UUVNuUNUvUnV = new vvNnnUNnVvn("Размытие скролла", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn vuvnUnVnUNnV = new vvNnnUNnVvn("Переходы карт", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn nnuUVNUuvvVU = new vvNnnUNnVvn("Переходы экрана", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn nVVUuvuNnUN = new vvNnnUNnVvn("Дрейф цвета темы", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn nNnVnUNVV = new vvNnnUNnVvn("Внутреннее свечение", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn nuunNvv = new vvNnnUNnVvn("Зерно плёнки", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn uUVVvVVNvvn = new vvNnnUNnVvn("Пульсация хотбара", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn vvUVNVvvNUv = new vvNnnUNnVvn("Анимации статусов", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn UuNnnVnuNNV = new vvNnnUNnVvn("Вспышка урона", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn uUVvnUuNvvN = new vvNnnUNnVvn("Пульсация регенерации", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn UUuUnNVNuuv = new vvNnnUNnVvn("Тряска при низком здоровье", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn NVuNUuVnVUN = new vvNnnUNnVvn("След курсора в меню", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final vvNnnUNnVvn NVuunNnvvvVu = new vvNnnUNnVvn("Параллакс главного меню", true).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Эффекты"));
   public static final VnnUvVNuNuVv vNnNuuvVn = new VnnUvVNuNuVv("Акцент темы", 66.0F, 0.64F, 1.0F).C00OOC00oO(() -> !nNvNUVU.C00OOC00oO("Темы"));
   public static final VnnUvVNuNuVv VUuuVUnun = new VnnUvVNuNuVv("Цвет панели", 68.0F, 0.28F, 0.08F).C00OOC00oO(() -> !nNvNUVU.C00OOC00oO("Темы"));
   public static final VnnUvVNuNuVv vVVuuVVv = new VnnUvVNuNuVv("Цвет поверхности", 68.0F, 0.24F, 0.12F).C00OOC00oO(() -> !nNvNUVU.C00OOC00oO("Темы"));
   public static final VnnUvVNuNuVv VuunNUUUvu = new VnnUvVNuNuVv("Цвет обводки", 68.0F, 0.32F, 0.38F).C00OOC00oO(() -> !nNvNUVU.C00OOC00oO("Темы"));
   public static final VnnUvVNuNuVv NNUUNUuVNNVn = new VnnUvVNuNuVv("Цвет текста", 0.0F, 0.0F, 1.0F).C00OOC00oO(() -> !nNvNUVU.C00OOC00oO("Темы"));
   public static final VnnUvVNuNuVv VvVvnNUnvuvV = new VnnUvVNuNuVv("Цвет приглушённого текста", 68.0F, 0.14F, 0.62F)
      .C00OOC00oO(() -> !nNvNUVU.C00OOC00oO("Темы"));
   public static final String ccOO0COcoco0 = "Стандарт";
   public static final String NUVvUUVuVNVv = "Голограмма";
   public static final UvNnUnuNUUU nNuVunNUVu = new UvNnUnuNUUU("Фон ClickGUI", "Голограмма", "Стандарт", "Голограмма")
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы"));
   public static final ili11Iii1Ii UNvvunVVn = new ili11Iii1Ii("Foundry Shader", VnuVUNUv.BACKGROUND).uUnuvNvvNU(() -> !nNvNUVU.C00OOC00oO("Темы"));
   public static final nNUuNvVn UnvuVuVnNuvu = new nNUuNvVn("Максимальный блюр", 32.0F, 8.0F, 64.0F, 1.0F, false)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final nNUuNvVn UvNNVUVNVuvV = new nNUuNvVn("Иридисцентный отлив", 0.6F, 0.0F, 1.0F, 0.01F, true)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final nNUuNvVn NnunUUnU = new nNUuNvVn("Притяжение к курсору", 0.18F, 0.0F, 0.4F, 0.01F, false)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final nNUuNvVn nvuVvuNnNUnv = new nNUuNvVn("Радиус прозрачности у курсора", 0.28F, 0.05F, 0.6F, 0.01F, false)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final nNUuNvVn NnVnNVN = new nNUuNvVn("Размер островков", 1.8F, 0.8F, 3.5F, 0.05F, false)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final nNUuNvVn vnvvNvUnVv = new nNUuNvVn("Скорость течения", 0.55F, 0.0F, 1.5F, 0.01F, false)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final nNUuNvVn OCOocoOoOO = new nNUuNvVn("Контраст островков", 0.55F, 0.0F, 1.0F, 0.01F, true)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final nNUuNvVn o0Ooc0COOoc = new nNUuNvVn("Виньетка", 0.35F, 0.0F, 1.0F, 0.01F, true)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final nNUuNvVn nvvnUnUn = new nNUuNvVn("Яркость", 0.55F, 0.0F, 1.0F, 0.01F, true)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final nNUuNvVn UnUUVuVunvVu = new nNUuNvVn("Насыщенность", 0.45F, 0.0F, 1.0F, 0.01F, true)
      .UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Темы") || !nNuVunNUVu.C00OOC00oO("Голограмма"));
   public static final vvNnnUNnVvn nnvuvUNuUnN = new vvNnnUNnVvn("Упрощённые тени HUD", false).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Производительность"));
   public static final vvNnnUNnVvn UVnuVUUVnnU = new vvNnnUNnVvn("Отключить блюр", false).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Производительность"));
   public static final vvNnnUNnVvn VunnVNvNV = new vvNnnUNnVvn("Быстрые анимации", false).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Производительность"));
   public static final vvNnnUNnVvn NvUVUvVVnUu = new vvNnnUNnVvn("Пропускать частицы клиента", false).UuUVuuUu(() -> !nNvNUVU.C00OOC00oO("Производительность"));
   private static int VUUnuVvVu = -1;
   public static final vvNnnUNnVvn unnUnUNVnN = new vvNnnUNnVvn("Auto GUI scale initialized", false).UuUVuuUu(() -> true);

   public Menu() {
      NVNnnvnuunNv = this;
      this.uVUuuVnNVU = "Menu";
      this.uNNnnnuuuN = 344;
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            nNvNUVU,
            UnUNuUU,
            uUVuVvuNUvnu,
            UvUvUNuvNU,
            c0oOOCcCoC0,
            VVnVNnunVvu,
            unnUnUNVnN,
            unNNVVNnvvV,
            NuunnvnN,
            NVUunUNUN,
            UUVNuUNUvUnV,
            vuvnUnVnUNnV,
            nnuUVNUuvvVU,
            nVVUuvuNnUN,
            nNnVnUNVV,
            nuunNvv,
            uUVVvVVNvvn,
            vvUVNVvvNUv,
            UuNnnVnuNNV,
            uUVvnUuNvvN,
            UUuUnNVNuuv,
            NVuNUuVnVUN,
            NVuunNnvvvVu,
            vNnNuuvVn,
            VUuuVUnun,
            vVVuuVVv,
            VuunNUUUvu,
            NNUUNUuVNNVn,
            VvVvnNUnvuvV,
            nNuVunNUVu,
            UNvvunVVn,
            UnvuVuVnNuvu,
            UvNNVUVNVuvV,
            NnunUUnU,
            nvuVvuNnNUnv,
            NnVnNVN,
            vnvvNvUnVv,
            OCOocoOoOO,
            o0Ooc0COOoc,
            nvvnUnUn,
            UnUUVuVunvVu,
            nnvuvUNuUnN,
            UVnuVUUVnnU,
            VunnVNvNV,
            NvUVUvVVnUu
         }
      );
   }

   public static boolean UuUVuuUu(vvNnnUNnVvn var0) {
      UuuNnUvUuv();

      try {
         return var0 == null || var0.uUnuvNvvNU();
      } catch (Throwable var2) {
         return true;
      }
   }

   public static void UuuNnUvUuv() {
      try {
         if (!uUVuVvuNUvnu.uUnuvNvvNU()) {
            VUUnuVvVu = (int)UnUNuUU.vVvUvVVuuNvV;
            return;
         }

         int var0 = Math.round(UnUNuUU.vVvUvVVuuNvV);
         if (var0 != VUUnuVvVu) {
            VUUnuVvVu = var0;
            uUuuvNuvVn.UuUVuuUu(var0).uUnuvNvvNU();
         }
      } catch (Throwable var1) {
      }
   }

   public static uUuuvNuvVn nUUVuvU() {
      return uUuuvNuvVn.UuUVuuUu(Math.round(UnUNuUU.vVvUvVVuuNvV));
   }

   public static void UuUVuuUu(int var0) {
      int var1 = Math.max(0, Math.min(uUuuvNuvVn.values().length - 1, var0));
      UnUNuUU.vVvUvVVuuNvV = var1;
      if (uUVuVvuNUvnu.uUnuvNvvNU()) {
         VUUnuVvVu = var1;
         uUuuvNuvVn.UuUVuuUu(var1).uUnuvNvvNU();
      }
   }

   public static void UnUNVVVNuv() {
      int var0 = uUuuvNuvVn.ULTRA.ordinal();
      UnUNuUU.vVvUvVVuuNvV = var0;
      VUUnuVvVu = var0;
   }

   public static Menu vNVuvnUUnuUn() {
      return NVNnnvnuunNv;
   }

   public static void UvnvNVnnnnNU() {
      NvVNvUvunNNu.CUSTOM
         .UuUVuuUu(
            vNnNuuvVn.uUnuvNvvNU(),
            VUuuVUnun.uUnuvNvvNU(),
            vVVuuVVv.uUnuvNvvNU(),
            VuunNUUUvu.uUnuvNvvNU(),
            NNUUNUuVNNVn.uUnuvNvvNU(),
            VvVvnNUnvuvV.uUnuvNvvNU()
         );
   }

   public static void UuUVuuUu(class_310 var0, VvuVNnN var1) {
      if (unnUnUNVnN != null && !unnUnUNVnN.uUnuvNvvNU()) {
         if (var0 != null && var0.method_22683() != null && var1 != null) {
            int var2 = var0.method_22683().method_4489();
            int var3 = var0.method_22683().method_4506();
            if (var2 > 0 && var3 > 0) {
               if (!(Math.abs(c0oOOCcCoC0.uUnuvNvvNU() - 0.86F) > 0.005F) && !(Math.abs(VVnVNnunVvu.uUnuvNvvNU() - 0.86F) > 0.005F)) {
                  float var4 = UuUVuuUu(var0);
                  float var5 = Math.min(var2, var3);
                  float var6 = UuUVuuUu(var5 * 0.025F, 18.0F, 42.0F);
                  float var7 = Math.min((var2 - var6 * 2.0F) / var1.uUnuvNvvNU(), (var3 - var6 * 2.0F) / var1.vVvUvVVuuNvV());
                  float var8 = var2 / Math.max(1.0F, (float)var3);
                  float var9 = var8 > 2.05F ? 0.58F : (var8 < 1.45F ? 0.74F : 0.68F);
                  float var10 = var8 > 2.05F ? 0.8F : 0.76F;
                  float var11 = Math.min(var2 * var9 / var1.uUnuvNvvNU(), var3 * var10 / var1.vVvUvVVuuNvV());
                  var11 = UuUVuuUu(Math.min(var11, var7), var1.UNnVVNvvnVvU(), var1.uNnUnnuNUnNu());
                  float var12 = UuUVuuUu(var11 / Math.max(0.001F, var4), c0oOOCcCoC0.uNNnnnuuuN, c0oOOCcCoC0.nuUnNvnuUu);
                  c0oOOCcCoC0.UuUVuuUu(var12);
                  VVnVNnunVvu.UuUVuuUu(UuUVuuUu(var12 * 0.94F, VVnVNnunVvu.uNNnnnuuuN, VVnVNnunVvu.nuUnNvnuUu));
                  unnUnUNVnN.C00OOC00oO(true);
                  uVUVnuvnuVuv();
               } else {
                  unnUnUNVnN.C00OOC00oO(true);
                  uVUVnuvnuVuv();
               }
            }
         }
      }
   }

   private static float UuUVuuUu(class_310 var0) {
      float var1;
      try {
         var1 = Math.max(1.0F, (float)var0.method_22683().method_4495());
      } catch (Throwable var4) {
         int var3 = Math.max(1, var0.method_22683().method_4486());
         var1 = Math.max(1.0F, (float)var0.method_22683().method_4489() / var3);
      }

      return 0.68F + Math.min(var1, 2.0F) * 0.28F;
   }

   private static float UuUVuuUu(float var0, float var1, float var2) {
      return Math.max(var1, Math.min(var2, var0));
   }

   private static void uVUVnuvnuVuv() {
      if (NVnVnNnN.UuUVuuUu != null && NVnVnNnN.UuUVuuUu.nUUVuvU != null) {
         NVnVnNnN.UuUVuuUu.nUUVuvU.uUnuvNvvNU();
      }
   }
}
