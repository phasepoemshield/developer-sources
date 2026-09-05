package ru.metaculture.protection;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1268;
import net.minecraft.class_1294;
import net.minecraft.class_1297;
import net.minecraft.class_1304;
import net.minecraft.class_1309;
import net.minecraft.class_1421;
import net.minecraft.class_1429;
import net.minecraft.class_1480;
import net.minecraft.class_1531;
import net.minecraft.class_1569;
import net.minecraft.class_1621;
import net.minecraft.class_1646;
import net.minecraft.class_1657;
import net.minecraft.class_1713;
import net.minecraft.class_1792;
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_2338;
import net.minecraft.class_238;
import net.minecraft.class_243;
import net.minecraft.class_2680;
import net.minecraft.class_2868;
import net.minecraft.class_2879;
import net.minecraft.class_304;
import net.minecraft.class_3489;
import net.minecraft.class_3532;
import net.minecraft.class_3988;
import net.minecraft.class_746;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "AttackAura",
   C00OOC00oO = "Автоматически бьет энтити - таргетов",
   uUnuvNvvNU = oOOOo0.Combat,
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.GRIM}
)
public class AttackAura extends Module {
   public static nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Радиус атаки", 3.0F, 3.0F, 6.0F, 0.1F, false);
   public static nNUuNvVn uVunuUNVVUUV = new nNUuNvVn("Радиус обнаружения", 1.0F, 0.0F, 5.0F, 0.1F, false);
   public static UvNnUnuNUUU UNnVVNvvnVvU = new UvNnUnuNUUU("Режим ротации", "Smooth", uVUVnuvnuVuv());
   public static vNnVvvNU uNnUnnuNUnNu = new vNnVvvNU("Конструктор ротации", 0)
      .C00OOC00oO("Открыть")
      .UuUVuuUu(AttackAura::NnunUUnU)
      .UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("Custom"));
   public static nNUuNvVn NnUuNNU = new nNUuNvVn("AI Jitter", 1.0F, 0.0F, 2.0F, 0.05F, false).UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("AI"));
   public static vvNnnUNnVvn nNvNUVU = new vvNnnUNnVvn("AI Debug Log", false).UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("AI"));
   public static vvNnnUNnVvn UnUNuUU = new vvNnnUNnVvn("AI Human Misses", false).UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("AI"));
   public static vNnVvvNU uUVuVvuNUvnu = new vNnVvvNU("AI Lab", 0)
      .C00OOC00oO("Открыть")
      .UuUVuuUu(AttackAura::nvuVvuNnNUnv)
      .UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("AI"));
   public static UvNnUnuNUUU UvUvUNuvNU = new UvNnUnuNUUU("Режим снапа", "Fast", "Fast", "Smooth", "Random")
      .UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("Snap") && !UNnVVNvvnVvU.C00OOC00oO("FOV"));
   public static nNUuNvVn c0oOOCcCoC0 = new nNUuNvVn("FOV", 90.0F, 5.0F, 180.0F, 1.0F, true).UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("FOV"));
   public static vvNnnUNnVvn VVnVNnunVvu = new vvNnnUNnVvn("Отображать FOV", true).UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("FOV"));
   public static nNUuNvVn unNNVVNnvvV = new nNUuNvVn("Скорость Legit", 0.08F, 0.02F, 0.4F, 0.01F, false).UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("Legit"));
   public static vvNnnUNnVvn NuunnvnN = new vvNnnUNnVvn("SidePoint Extra Checks", false).UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("Side Point"));
   public static UNNVUuvVNNuv NVUunUNUN = new UNNVUuvVNNuv("Neuro Status", 0, NuUvVVvUVVUV::uUnuvNvvNU)
      .C00OOC00oO(() -> !UNnVVNvvnVvU.C00OOC00oO("Neuro") || !NVNnnvnuunNv());
   public static vvNnnUNnVvn UUVNuUNUvUnV = new vvNnnUNnVvn("Neuro Debug", false).UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("Neuro") || !NVNnnvnuunNv());
   public static UvNnUnuNUUU vuvnUnVnUNnV = new UvNnUnuNUUU("Neuro Profile", "Human", "Stable", "Human", "Dynamic")
      .UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("Neuro") || !NVNnnvnuunNv());
   public static nNUuNvVn nnuUVNUuvvVU = new nNUuNvVn("Neuro Strength", 1.25F, 0.0F, 2.0F, 0.05F, false)
      .UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("Neuro") || !NVNnnvnuunNv());
   public static vvNnnUNnVvn nVVUuvuNnUN = new vvNnnUNnVvn("Neuro Client Finish", false).UuUVuuUu(() -> !UNnVVNvvnVvU.C00OOC00oO("Neuro") || !NVNnnvnuunNv());
   public static VUVnvvnNN nNnVnUNVV = new VUVnvvnNN(
      "Цели",
      new vvNnnUNnVvn("Игроки", true),
      new vvNnnUNnVvn("Голые", true),
      new vvNnnUNnVvn("Невидимки", true),
      new vvNnnUNnVvn("Голые невидимки", false),
      new vvNnnUNnVvn("Друзья", false),
      new vvNnnUNnVvn("NPC", true),
      new vvNnnUNnVvn("Мобы", false),
      new vvNnnUNnVvn("Животные", false),
      new vvNnnUNnVvn("Жители", false)
   );
   public static UvNnUnuNUUU nuunNvv = new UvNnUnuNUUU("Тайминг удара", "Быстрый", "Быстрый", "Динамичный");
   public static vvNnnUNnVvn uUVVvVVNvvn = new vvNnnUNnVvn("Адаптивный тайминг", false);
   public static UvNnUnuNUUU vvUVNVvvNUv = new UvNnUnuNUUU("Режим спринта", "Обычный", "Обычный", "Обновленный", "Тестовый", "Легит");
   public static VUVnvvnNN UuNnnVnuNNV = new VUVnvvnNN(
      "Проверки до удара",
      new vvNnnUNnVvn("Бить через блоки", false),
      new vvNnnUNnVvn("Бить только оружием", false),
      new vvNnnUNnVvn("Не бить если кушаешь", true),
      new vvNnnUNnVvn("Не бить в контейнерах ", false),
      new vvNnnUNnVvn("Ломать щит", false),
      new vvNnnUNnVvn("Отжим щита", false)
   );
   public static VUVnvvnNN uUVvnUuNvvN = new VUVnvvnNN(
      "Дополнительные настройки",
      new vvNnnUNnVvn("Расширенная настройки для атаки", true),
      new vvNnnUNnVvn("Умные криты", false),
      new vvNnnUNnVvn("Увеличенная дистанция удара", false),
      new vvNnnUNnVvn("Приоритет ближайшей цели", false)
   );
   public static nNUuNvVn UUuUnNVNuuv = new nNUuNvVn("Радиус атаки для мобов", 3.0F, 3.0F, 6.0F, 0.1F, false)
      .UuUVuuUu(() -> !uUVvnUuNvvN.C00OOC00oO("Расширенная настройки для атаки") && !nNnVnUNVV.C00OOC00oO("Мобы"));
   public static nNUuNvVn NVuNUuVnVUN = new nNUuNvVn("Радиус атаки для игроков", 3.0F, 3.0F, 6.0F, 0.1F, false)
      .UuUVuuUu(() -> !uUVvnUuNvvN.C00OOC00oO("Расширенная настройки для атаки") && !nNnVnUNVV.C00OOC00oO("Игроки"));
   public static UvNnUnuNUUU NVuunNnvvvVu = new UvNnUnuNUUU("Режим движения", "Default", "Default", "Free", "Target", "Преследование");
   public static vvNnnUNnVvn vNnNuuvVn = new vvNnnUNnVvn("Булава", false);
   public static UvNnUnuNUUU VUuuVUnun = new UvNnUnuNUUU("Режим булавы", "Авто", "Авто", "Бинд").UuUVuuUu(() -> !vNnNuuvVn.uUnuvNvvNU());
   public static uVNuNUVvn vVVuuVVv = new uVNuNUVvn("Кнопка булавы", -1).UuUVuuUu(() -> !vNnNuuvVn.uUnuvNvvNU() || !VUuuVUnun.C00OOC00oO("Бинд"));
   public static nNUuNvVn VuunNUUUvu = new nNUuNvVn("Высота булавы", 2.0F, 0.5F, 6.0F, 0.1F, false)
      .UuUVuuUu(() -> !vNnNuuvVn.uUnuvNvvNU() || !VUuuVUnun.C00OOC00oO("Авто"));
   public static vvNnnUNnVvn NNUUNUuVNNVn = new vvNnnUNnVvn("Усиление урона", false).UuUVuuUu(() -> !vNnNuuvVn.uUnuvNvvNU());
   public static vvNnnUNnVvn VvVvnNUnvuvV = new vvNnnUNnVvn("Отладка булавы", false).UuUVuuUu(() -> !vNnNuuvVn.uUnuvNvvNU());
   public static class_1309 ccOO0COcoco0;
   public static boolean NUVvUUVuVNVv = false;
   private static final Runnable NnVnNVN = VVnuUunUv::UuUVuuUu;
   private static final Runnable vnvvNvUnVv = VUnvVvUNvv::UuUVuuUu;
   private static long OCOocoOoOO = 0L;
   private static boolean o0Ooc0COOoc = false;
   private static float nvvnUnUn = 0.0F;
   private static long UnUUVuVunvVu = 0L;
   private static float nnvuvUNuUnN = 0.0F;
   private static long UVnuVUUVnnU = 0L;
   private static long VunnVNvNV = 0L;
   private static int NvUVUvVVnUu = Integer.MIN_VALUE;
   private boolean unnUnUNVnN = false;
   private boolean NnuUnUNnu = false;
   private static final String UnnnvvU = "AuraMace";
   private static final int VUUnuVvVu = 40;
   private static final int VvVuvUvvNNVv = 4;
   private static final long UnnNNvuvvUU = 300L;
   static int VNNnnVUuvv = 0;
   private static int vUvUvUNNuNvn = 0;
   private static boolean uuVuUuuVVNvN = false;
   private static int VvuUUUNNNv = -1;
   private static int uuuVnuvnnNnU = -1;
   private static boolean nNunUnVN = false;
   private static int VnVuuvVvnNv = -1;
   private static boolean vuvvuVuVv = false;
   private static boolean uunNUuunVU = false;
   private static int NvnuuuvnVV = 0;
   private static int NnUVNnuvUv = 0;
   private static long UuuuNNunN = 0L;
   public static long nNuVunNUVu = 0L;
   public static long UNvvunVVn = ThreadLocalRandom.current().nextLong(90000L, 180000L);
   public static boolean UnvuVuVnNuvu = false;
   public static long UvNNVUVNVuvV = 0L;
   public static int NnunUUnU = 0;

   private static String[] uVUVnuvnuVuv() {
      return NVNnnvnuunNv()
         ? new String[]{
            "Matrix", "Random Smooth ", "Snap", "FOV", "Smooth ", "FunTime", "FT-New", "FTTESTT", "SpookyTime", "ST-Test", "Legit", "Custom", "AI", "Neuro"
         }
         : new String[]{"Matrix", "Random Smooth ", "Snap", "FOV", "Smooth ", "FunTime", "FT-New", "SpookyTime", "ST-Test", "Legit", "Custom", "AI"};
   }

   private static boolean NVNnnvnuunNv() {
      return uVvnVvvUVUv.UuUVuuUu(AttackAura.NVnVnNnN.class.getAnnotation(uNUunUnnnVu.class));
   }

   private static boolean uVunuUNVVUUV() {
      return (UNnVVNvvnVvU.C00OOC00oO("Neuro") || UNnVVNvvnVvU.C00OOC00oO("FTTESTT")) && !NVNnnvnuunNv();
   }

   public AttackAura() {
      oCCO0cc0C0Oc.vuuuNvNuv();
      this.UuUVuuUu(
         new nvUuvVvuuN[]{
            NVNnnvnuunNv,
            uVunuUNVVUUV,
            UNnVVNvvnVvU,
            uNnUnnuNUnNu,
            NnUuNNU,
            nNvNUVU,
            UnUNuUU,
            uUVuVvuNUvnu,
            UvUvUNuvNU,
            c0oOOCcCoC0,
            VVnVNnunVvu,
            unNNVVNnvvV,
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
            ElytraTarget.uNnUnnuNUnNu
         }
      );
   }

   public static boolean UuuNnUvUuv() {
      return VNNnnVUuvv != 0;
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(O0C0OC0OCcCO var1) {
      if (this.nuUnNvnuUu && !vNVuvnUUnuUn() && UNnVVNvvnVvU.C00OOC00oO("FOV") && var1.vVvUvVVuuNvV() != null && VVnVNnunVvu.uUnuvNvvNU()) {
         NuunNNvUNun.UuUVuuUu(var1.vVvUvVVuuNvV(), c0oOOCcCoC0.uUnuvNvvNU(), var1.nuUnNvnuUu(), var1.VVuuUN());
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVUVuNnVvU var1) {
      vNUnvuN.uUnuvNvvNU();
      if (vNVuvnUUnuUn()) {
         VVnuUunUv.uUnuvNvvNU();
         nvNVUnVUUnun.UuUVuuUu();
         VUnvVvUNvv.C00OOC00oO();
         this.NnVnNVN();
         this.vnvvNvUnVv();
      } else if (ccOO0COcoco0 != null && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         this.nNuVunNUVu();
         if (!UNnVVNvvnVvU.C00OOC00oO("Legit")) {
            this.NnUuNNU();
         }
      } else {
         VVnuUunUv.uUnuvNvvNU();
         nvNVUnVUUnun.UuUVuuUu();
         VUnvVvUNvv.C00OOC00oO();
         this.NnVnNVN();
         this.vnvvNvUnVv();
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(UUvNUNvUVnu var1) {
      if (!vNVuvnUUnuUn() && UNnVVNvvnVvU.C00OOC00oO("Legit")) {
         if (ccOO0COcoco0 != null && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
            VvVvuVVU.UuUVuuUu(ccOO0COcoco0, var1);
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNVVnVUNun var1) {
      if (!vNVuvnUUnuUn() && vvUVNVvvNUv.C00OOC00oO("Тестовый")) {
         if (ccOO0COcoco0 != null && uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1755 == null) {
            class_243 var2 = ccOO0COcoco0.method_19538()
               .method_1031(0.0, ccOO0COcoco0.method_17682() * 0.5, 0.0)
               .method_1020(uUnuvNvvNU.field_1724.method_33571());
            float var3 = (float)Math.toDegrees(Math.atan2(-var2.field_1352, var2.field_1350));
            UNnnNuVnu.UuUVuuUu(var1, var3);
            if (oCCO0cc0C0Oc.C00OOC00oO(ccOO0COcoco0, C00OOC00oO(ccOO0COcoco0))) {
               var1.UuUVuuUu(0.0F);
               var1.C00OOC00oO(0.0F);
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uNNNVVvnnNUN var1) {
      if (!vNVuvnUUnuUn()) {
         if (UuNnnVnuNNV.C00OOC00oO("Синхрон с ТПС")) {
            this.nNuVunNUVu();
            if (!vvUVNVvvNUv.C00OOC00oO("Легит") && this.c0oOOCcCoC0()) {
               uUnuvNvvNU.field_1724.method_5728(false);
               uUnuvNvvNU.field_1690.field_1867.method_23481(false);
            }

            if (!this.vuvnUnVnUNnV()) {
               this.UnUNVVVNuv();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      this.nVVUuvuNnUN();
      if (vNVuvnUUnuUn()) {
         this.NnVnNVN();
         this.UnUNuUU();
         this.VVnVNnunVvu();
         UNnnNuVnu.uUnuvNvvNU();
      } else if (!uUnuvNvvNU.field_1724.method_5805()) {
         this.NnVnNVN();
         this.UnUNuUU();
         this.VVnVNnunVvu();
         UNnnNuVnu.uUnuvNvvNU();
         this.a_();
      } else {
         if (ccOO0COcoco0 == null || !this.uUnuvNvvNU(ccOO0COcoco0)) {
            this.NuunnvnN();
         }

         if (ccOO0COcoco0 == null) {
            VVnuUunUv.uUnuvNvvNU();
            NVVuvnNVvvn.vVvUvVVuuNvV();
            VUnvVvUNvv.C00OOC00oO();
            this.NnVnNVN();
            this.vnvvNvUnVv();
            this.UnUNuUU();
            this.VVnVNnunVvu();
            UNnnNuVnu.uUnuvNvvNU();
         } else if (uUnuvNvvNU.field_1755 != null) {
            this.UnUNuUU();
            this.VVnVNnunVvu();
            this.unNNVVNnvvV();
         } else if (VNNnnVUuvv != 0) {
            this.UnUNuUU();
            this.VVnVNnunVvu();
            UNnnNuVnu.uUnuvNvvNU();
            NVnVnU.UuUVuuUu().UuUVuuUu("AuraMace");
         } else {
            this.uUVuVvuNUvnu();
            if (NVuunNnvvvVu.C00OOC00oO("Free")) {
               this.UnUNuUU();
               UNnnNuVnu.UuUVuuUu(uUnuvNvvNU.field_1773.method_19418().method_19330());
            } else if (NVuunNnvvvVu.C00OOC00oO("Target")) {
               this.UnUNuUU();
               UNnnNuVnu.UuUVuuUu(uUnuvNvvNU.field_1724.method_36454(), ccOO0COcoco0.method_19538());
            } else {
               UNnnNuVnu.uUnuvNvvNU();
            }

            if (NVuunNnvvvVu.C00OOC00oO("Преследование")) {
               this.nNvNUVU();
            } else {
               this.UnUNuUU();
            }

            if (!UuNnnVnuNNV.C00OOC00oO("Синхрон с ТПС")) {
               this.nNuVunNUVu();
               if (!vvUVNVvvNUv.C00OOC00oO("Легит") && this.c0oOOCcCoC0()) {
                  uUnuvNvvNU.field_1724.method_5728(false);
                  uUnuvNvvNU.field_1690.field_1867.method_23481(false);
               }

               if (!this.vuvnUnVnUNnV()) {
                  this.UnUNVVVNuv();
               }
            }
         }
      }
   }

   public static float UuUVuuUu(class_1309 var0) {
      if (var0 == null) {
         return NVNnnvnuunNv.uUnuvNvvNU();
      } else {
         float var1 = NVNnnvnuunNv.uUnuvNvvNU();
         if (uUVvnUuNvvN.C00OOC00oO("Расширенная настройки для атаки")) {
            if (var0 instanceof class_1657) {
               var1 = NVuNUuVnVUN.uUnuvNvvNU();
            } else {
               var1 = UUuUnNVNuuv.uUnuvNvvNU();
            }
         }

         if (uUVvnUuNvvN.C00OOC00oO("Увеличенная дистанция удара")) {
            float var2 = var0.method_6032() + var0.method_6067();
            if (var2 >= 10.0F && var2 <= 12.0F) {
               long var3 = System.currentTimeMillis();
               if (var3 >= OCOocoOoOO) {
                  if (ThreadLocalRandom.current().nextInt(100) < 25) {
                     o0Ooc0COOoc = true;
                     nvvnUnUn = 0.1F + ThreadLocalRandom.current().nextFloat() * 0.05F;
                     OCOocoOoOO = var3 + ThreadLocalRandom.current().nextLong(400L, 700L);
                  } else {
                     o0Ooc0COOoc = false;
                     nvvnUnUn = 0.0F;
                     OCOocoOoOO = var3 + ThreadLocalRandom.current().nextLong(1500L, 2500L);
                  }
               }

               if (o0Ooc0COOoc) {
                  return var1 + nvvnUnUn;
               }
            } else {
               o0Ooc0COOoc = false;
               nvvnUnUn = 0.0F;
            }
         }

         return var1;
      }
   }

   public static float[] C00OOC00oO(class_1309 var0) {
      float var1 = UuUVuuUu(var0);
      return new float[]{var1, uVunuUNVVUUV.uUnuvNvvNU(), var1 + uVunuUNVVUUV.uUnuvNvvNU()};
   }

   @Override
   public boolean nUUVuvU() {
      return true;
   }

   @Override
   public void UnUNVVVNuv() {
      assert uUnuvNvvNU.field_1724 != null;

      if (VNNnnVUuvv == 0) {
         float var1 = UuUVuuUu(ccOO0COcoco0);
         if (!(uvnuUUnunNn.UuUVuuUu((class_1297)ccOO0COcoco0) >= var1)) {
            float[] var2 = C00OOC00oO(ccOO0COcoco0);
            var2 = new float[]{var2[0], var2[1], var2[0] + var2[1]};
            if (!uUnuvNvvNU.field_1724.method_6059(class_1294.field_5919) && !uUnuvNvvNU.field_1724.method_70987() && vvUVNVvvNUv.C00OOC00oO("Обычный")) {
               boolean var20 = true;
            } else {
               boolean var10000 = false;
            }

            if (ccOO0COcoco0 != null) {
               if (!UNnVVNvvnVvU.C00OOC00oO("FOV") || NuunNNvUNun.UuUVuuUu(ccOO0COcoco0, c0oOOCcCoC0.uUnuvNvvNU())) {
                  if (!UNnVVNvvnVvU.C00OOC00oO("AI") || VuUvvnuUu.NnUuNNU()) {
                     oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, true, this.nUUVuvU(), false);
                     boolean var4 = UNnVVNvvnVvU.C00OOC00oO("FT-New");
                     boolean var5 = vNnNuuvVn.uUnuvNvvNU() && uUnuvNvvNU.field_1724.method_6047().method_7909() == class_1802.field_49814;
                     boolean var6 = var5 && NNUUNUuVNNVn.uUnuvNvvNU();
                     if (!var6 || this.UNnVVNvvnVvU()) {
                        boolean var7;
                        if (var5 && uuVuUuuVVNvN) {
                           long var8 = VUuuVUnun.C00OOC00oO("Авто") ? -2000L : 0L;
                           boolean var10 = uvnuUUnunNn.UuUVuuUu(ccOO0COcoco0, var2[0], true);
                           boolean var11 = oCCO0cc0C0Oc.UuUVuuUu(var8);
                           boolean var12 = !this.nUUVuvU() || oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, var2[0]);
                           boolean var13 = !VUuuVUnun.C00OOC00oO("Авто") || !uunNUuunVU;
                           var7 = VNNnnVUuvv == 0 && !vuvvuVuVv && var13 && var10 && var11 && var12;
                        } else if (var4) {
                           var7 = vNUnvuN.UuUVuuUu(ccOO0COcoco0, 0) && (!this.nUUVuvU() || oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, var2[0]));
                        } else {
                           var7 = oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, this.nUUVuvU(), true, true, UnvuVuVnNuvu(), var2);
                        }

                        if (var7) {
                           if (var4) {
                              if (!vNUnvuN.C00OOC00oO(ccOO0COcoco0)) {
                                 return;
                              }

                              if (!vNUnvuN.UuUVuuUu(UuNnnVnuNNV.C00OOC00oO("Отжим щита"))) {
                                 return;
                              }
                           }

                           if (var4 || !uUVVvVVNvvn.uUnuvNvvNU() || var6 || !oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0)) {
                              Runnable[] var15 = oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, !var4 && UuNnnVnuNNV.C00OOC00oO("Ломать щит"));
                              Runnable[] var9 = oCCO0cc0C0Oc.UuUVuuUu(!var4);
                              Runnable[] var16 = oCCO0cc0C0Oc.C00OOC00oO(false);
                              Runnable var17 = () -> {
                                 var16[0].run();
                                 var9[0].run();
                                 var15[0].run();
                              };
                              Runnable var18 = () -> {
                                 var15[1].run();
                                 var9[1].run();
                                 var16[1].run();
                              };
                              if (!var4
                                 && UuNnnVnuNNV.C00OOC00oO("Отжим щита")
                                 && uUnuvNvvNU.field_1724.method_6030().method_7909().equals(class_1802.field_8255)
                                 && uUnuvNvvNU.field_1724.method_6115()) {
                                 uUnuvNvvNU.field_1761.method_2897(uUnuvNvvNU.field_1724);
                              }

                              if (!var4 && uUVVvVVNvvn.uUnuvNvvNU() && !var6) {
                                 Runnable var19 = UNnVVNvvnVvU.C00OOC00oO("FunTime") ? NnVnNVN : (UNnVVNvvnVvU.C00OOC00oO("ST-Test") ? vnvvNvUnVv : null);
                                 oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, var17, var18, class_1268.field_5808, true, var19);
                              } else {
                                 if (oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, var17, var18, class_1268.field_5808, true)) {
                                    if (UNnVVNvvnVvU.C00OOC00oO("FunTime")) {
                                       VVnuUunUv.UuUVuuUu();
                                    } else if (var4) {
                                       vNUnvuN.vVvUvVVuuNvV();
                                    } else if (UNnVVNvvnVvU.C00OOC00oO("SpookyTime")) {
                                       o0oo00COOco.UuUVuuUu();
                                    } else if (UNnVVNvvnVvU.C00OOC00oO("ST-Test")) {
                                       VUnvVvUNvv.UuUVuuUu();
                                    }

                                    this.NNUUNUuVNNVn();
                                 }
                              }
                           }
                        }
                     }
                  }
               }
            }
         }
      }
   }

   private boolean UNnVVNvvnVvU() {
      if (uUnuvNvvNU.field_1687 != null && this.uNnUnnuNUnNu()) {
         class_243 var1 = uUnuvNvvNU.field_1724.method_18798();
         class_238 var2 = uUnuvNvvNU.field_1724.method_5829();
         class_243 var3 = class_1297.method_20736(
            uUnuvNvvNU.field_1724, var1, var2, uUnuvNvvNU.field_1687, uUnuvNvvNU.field_1687.method_20743(uUnuvNvvNU.field_1724, var2.method_18804(var1))
         );
         return var3.field_1351 > var1.field_1351 + 1.0E-7;
      } else {
         return true;
      }
   }

   private boolean uNnUnnuNUnNu() {
      return uUnuvNvvNU.field_1724 != null
         && !uUnuvNvvNU.field_1724.method_24828()
         && !uUnuvNvvNU.field_1724.method_6128()
         && uUnuvNvvNU.field_1724.method_18798().field_1351 < -1.0E-4;
   }

   private void NnUuNNU() {
      if (ccOO0COcoco0 != null && !vNVuvnUUnuUn() && !uVunuUNVVUUV() && (VNNnnVUuvv == 0 || nNunUnVN)) {
         if (!UNnVVNvvnVvU.C00OOC00oO("FT-New")) {
            nNVUnNnn.uUnuvNvvNU();
            nvNVUnVUUnun.C00OOC00oO();
         }

         if (!UNnVVNvvnVvU.C00OOC00oO("ST-Test")) {
            VUnvVvUNvv.C00OOC00oO();
         }

         this.nNuVunNUVu();
         double var1 = uUnuvNvvNU.field_1724.method_23318() - ccOO0COcoco0.method_23318();
         boolean var3 = uUnuvNvvNU.field_1724.method_6047().method_7909() == class_1802.field_49814;
         boolean var4 = !uUnuvNvvNU.field_1724.method_24828() && (var1 >= 2.0 || var3);
         if (!UNnVVNvvnVvU.C00OOC00oO("Legit") && var3 && var4 && uUnuvNvvNU.field_1724.method_23318() > ccOO0COcoco0.method_23318()) {
            VvUNVunnuu.UuUVuuUu(ccOO0COcoco0);
         } else if (!UNnVVNvvnVvU.C00OOC00oO("Legit") && vNnNuuvVn.uUnuvNvvNU() && var3) {
            NUnUNvUunVVN.UuUVuuUu(ccOO0COcoco0);
         } else {
            float[] var5 = C00OOC00oO(ccOO0COcoco0);
            var5 = new float[]{var5[0], var5[1], var5[0] + var5[1]};
            boolean var6 = oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, false, true, true, UnvuVuVnNuvu(), var5);
            String var7 = UNnVVNvvnVvU.uUnuvNvvNU();
            switch (var7) {
               case "Random Smooth ":
                  UVvNuUUUVVnV.UuUVuuUu(
                     ccOO0COcoco0, oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, false, true, true, UuUVuuUu(-50L), var5), UuUVuuUu(ccOO0COcoco0), this.vuvnUnVnUNnV()
                  );
                  break;
               case "Matrix":
                  if (VUUuVvvnNVUu.UuUVuuUu("spookytime")) {
                     VvUNVunnuu.UuUVuuUu(ccOO0COcoco0, var6);
                  } else if (VUUuVvvnNVUu.UuUVuuUu("holy")) {
                     VvUNVunnuu.C00OOC00oO(ccOO0COcoco0, var6);
                  } else if (VUUuVvvnNVUu.UuUVuuUu("ares")) {
                     VvUNVunnuu.uUnuvNvvNU(ccOO0COcoco0, var6);
                  } else {
                     VvUNVunnuu.UuUVuuUu(ccOO0COcoco0, var6);
                  }
                  break;
               case "Snap":
                  VvUNVunnuu.UuUVuuUu(ccOO0COcoco0, oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, false, true, true, UuUVuuUu(-50L), var5), UvUvUNuvNU.uUnuvNvvNU());
                  break;
               case "FOV":
                  boolean var9 = NuunNNvUNun.UuUVuuUu(ccOO0COcoco0, c0oOOCcCoC0.uUnuvNvvNU());
                  boolean var10 = var9 && oCCO0cc0C0Oc.UuUVuuUu(ccOO0COcoco0, false, true, true, UuUVuuUu(-50L), var5);
                  VvUNVunnuu.C00OOC00oO(ccOO0COcoco0, var10, UvUvUNuvNU.uUnuvNvvNU());
                  break;
               case "Smooth ":
                  NUnUNvUunVVN.UuUVuuUu(ccOO0COcoco0);
                  break;
               case "FunTime":
                  VVnuUunUv.UuUVuuUu(ccOO0COcoco0);
                  break;
               case "FT-New":
                  nvNVUnVUUnun.UuUVuuUu(ccOO0COcoco0);
                  break;
               case "FTTESTT":
                  NVVuvnNVvvn.UuUVuuUu(ccOO0COcoco0);
                  break;
               case "SpookyTime":
                  o0oo00COOco.UuUVuuUu(ccOO0COcoco0);
                  break;
               case "ST-Test":
                  VUnvVvUNvv.UuUVuuUu(ccOO0COcoco0, var6);
                  break;
               case "Custom":
                  NNvnNNUuVvV.UuUVuuUu(ccOO0COcoco0);
                  break;
               case "Lony Grief":
                  CO0oc0oC.UuUVuuUu(ccOO0COcoco0);
                  break;
               case "Side Point":
                  vvNVnVNvUvV.UuUVuuUu(ccOO0COcoco0);
                  break;
               case "AI":
                  VuUvvnuUu.UuUVuuUu(ccOO0COcoco0);
                  break;
               case "Neuro":
                  NuUvVVvUVVUV.UuUVuuUu(ccOO0COcoco0, var6, this.vuvnUnVnUNnV(), UUVNuUNUvUnV.uUnuvNvvNU());
            }
         }
      }
   }

   private void nNvNUVU() {
      if (uUnuvNvvNU.field_1724 != null && ccOO0COcoco0 != null && uUnuvNvvNU.field_1690 != null && uUnuvNvvNU.method_22683() != null) {
         if (!uUnuvNvvNU.field_1724.method_6115()
            && !uUnuvNvvNU.field_1724.method_5715()
            && !uUnuvNvvNU.field_1724.method_5765()
            && uUnuvNvvNU.field_1755 == null) {
            float[] var1 = UNnnNuVnu.C00OOC00oO();
            float var2 = var1[0];
            float var3 = var1[1];
            class_243 var4 = ccOO0COcoco0.method_19538();
            if (var2 != 0.0F || var3 != 0.0F) {
               class_243 var5 = this.UuUVuuUu(ccOO0COcoco0.method_36454());
               class_243 var6 = this.UuUVuuUu(ccOO0COcoco0.method_36454() + 90.0F);
               var4 = var4.method_1019(var5.method_1021(var2)).method_1019(var6.method_1021(-var3));
            }

            class_243 var16 = var4.method_1020(uUnuvNvvNU.field_1724.method_19538());
            if (var16.field_1352 * var16.field_1352 + var16.field_1350 * var16.field_1350 < 1.0E-4) {
               this.UuUVuuUu(1.0F, 0.0F, true, false);
            } else {
               float var17 = (float)class_3532.method_15338(Math.toDegrees(Math.atan2(var16.field_1350, var16.field_1352)) - 90.0);
               float var7 = nVuVUNvVV.UuUVuuUu(uUnuvNvvNU.field_1724.method_36454());
               float var8 = 0.0F;
               float var9 = 0.0F;
               float var10 = Float.MAX_VALUE;

               for (float var11 = -1.0F; var11 <= 1.0F; var11++) {
                  for (float var12 = -1.0F; var12 <= 1.0F; var12++) {
                     if (var11 != 0.0F || var12 != 0.0F) {
                        double var13 = class_3532.method_15338(Math.toDegrees(UNnnNuVnu.UuUVuuUu(var7, var11, var12)));
                        float var15 = this.UuUVuuUu(var17, (float)var13);
                        if (var15 < var10) {
                           var10 = var15;
                           var8 = var11;
                           var9 = var12;
                        }
                     }
                  }
               }

               boolean var18 = uUnuvNvvNU.field_1724.field_5976 && uUnuvNvvNU.field_1724.method_24828();
               this.UuUVuuUu(var8, var9, true, var18);
            }
         } else {
            this.UnUNuUU();
         }
      } else {
         this.UnUNuUU();
      }
   }

   private class_243 UuUVuuUu(float var1) {
      double var2 = Math.toRadians(var1);
      return new class_243(-Math.sin(var2), 0.0, Math.cos(var2));
   }

   private float UuUVuuUu(float var1, float var2) {
      return Math.abs(class_3532.method_15393(var1 - var2));
   }

   private void UuUVuuUu(float var1, float var2, boolean var3, boolean var4) {
      if (uUnuvNvvNU.field_1690 != null) {
         this.unnUnUNVnN = true;
         uUnuvNvvNU.field_1690.field_1894.method_23481(var1 > 0.0F);
         uUnuvNvvNU.field_1690.field_1881.method_23481(var1 < 0.0F);
         uUnuvNvvNU.field_1690.field_1913.method_23481(var2 > 0.0F);
         uUnuvNvvNU.field_1690.field_1849.method_23481(var2 < 0.0F);
         boolean var5 = var3;
         if (vvUVNVvvNUv.C00OOC00oO("Легит") && ccOO0COcoco0 != null && oCCO0cc0C0Oc.C00OOC00oO(ccOO0COcoco0, C00OOC00oO(ccOO0COcoco0))) {
            uUnuvNvvNU.field_1724.method_5728(false);
            var5 = false;
         }

         uUnuvNvvNU.field_1690.field_1867.method_23481(var5);
         if (var4) {
            uUnuvNvvNU.field_1690.field_1903.method_23481(true);
         } else if (!this.C00OOC00oO(uUnuvNvvNU.field_1690.field_1903)) {
            uUnuvNvvNU.field_1690.field_1903.method_23481(false);
         }
      }
   }

   private void UnUNuUU() {
      if (this.unnUnUNVnN && uUnuvNvvNU.field_1690 != null) {
         this.unnUnUNVnN = false;
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1894);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1881);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1913);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1849);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1903);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1867);
      }
   }

   private void uUVuVvuNUvnu() {
      if (vvUVNVvvNUv.C00OOC00oO("Легит")
         && uUnuvNvvNU.field_1724 != null
         && uUnuvNvvNU.field_1687 != null
         && uUnuvNvvNU.field_1690 != null
         && uUnuvNvvNU.field_1755 == null) {
         this.NnuUnUNnu = true;
         boolean var1 = this.c0oOOCcCoC0();
         if (var1) {
            uUnuvNvvNU.field_1724.method_5728(false);
            uUnuvNvvNU.field_1690.field_1867.method_23481(false);
         } else {
            uUnuvNvvNU.field_1690.field_1867.method_23481(this.UvUvUNuvNU());
         }
      } else {
         this.VVnVNnunVvu();
      }
   }

   private boolean UvUvUNuvNU() {
      return uUnuvNvvNU.field_1690 == null ? false : this.C00OOC00oO(uUnuvNvvNU.field_1690.field_1894) && !this.C00OOC00oO(uUnuvNvvNU.field_1690.field_1881);
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(uvUUuvnunU var1) {
      if (UNnVVNvvnVvU.C00OOC00oO("FT-New") && var1.uUnuvNvvNU()) {
         if (var1.vVvUvVVuuNvV() instanceof class_2879 || var1.vVvUvVVuuNvV() instanceof class_2868) {
            vNUnvuN.uNNnnnuuuN();
         }
      }
   }

   private boolean c0oOOCcCoC0() {
      if (ccOO0COcoco0 == null || uUnuvNvvNU.field_1724 == null) {
         return false;
      } else {
         return UNnVVNvvnVvU.C00OOC00oO("FT-New") ? vNUnvuN.UuUVuuUu(ccOO0COcoco0) : oCCO0cc0C0Oc.C00OOC00oO(ccOO0COcoco0, C00OOC00oO(ccOO0COcoco0));
      }
   }

   private void VVnVNnunVvu() {
      if (this.NnuUnUNnu && uUnuvNvvNU.field_1690 != null) {
         this.NnuUnUNnu = false;
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1867);
      }
   }

   private void unNNVVNnvvV() {
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1894.method_23481(false);
         uUnuvNvvNU.field_1690.field_1881.method_23481(false);
         uUnuvNvvNU.field_1690.field_1913.method_23481(false);
         uUnuvNvvNU.field_1690.field_1849.method_23481(false);
         uUnuvNvvNU.field_1690.field_1903.method_23481(false);
         this.UuUVuuUu(uUnuvNvvNU.field_1690.field_1867);
      }
   }

   private void UuUVuuUu(class_304 var1) {
      if (var1 != null) {
         var1.method_23481(this.C00OOC00oO(var1));
      }
   }

   private boolean C00OOC00oO(class_304 var1) {
      return var1 == null ? false : var1.method_1434();
   }

   private void NuunnvnN() {
      class_1309 var1 = ccOO0COcoco0;
      class_1309 var2 = null;
      double var3 = Double.MAX_VALUE;
      class_243 var5 = uUnuvNvvNU.field_1724.method_33571();
      class_243 var6 = uUnuvNvvNU.field_1724.method_5828(1.0F).method_1029();

      for (class_1297 var8 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var8 instanceof class_1309 var9 && this.uUnuvNvvNU(var9)) {
            double var10;
            if (uUVvnUuNvvN.C00OOC00oO("Приоритет ближайшей цели")) {
               var10 = uUnuvNvvNU.field_1724.method_5858(var9);
            } else {
               class_243 var12 = var9.method_19538().method_1031(0.0, var9.method_17682() * 0.5, 0.0);
               class_243 var13 = var12.method_1020(var5).method_1029();
               var10 = Math.acos(class_3532.method_15350(var6.method_1026(var13), -1.0, 1.0));
            }

            if (var10 < var3) {
               var3 = var10;
               var2 = var9;
            }
         }
      }

      ccOO0COcoco0 = var2;
      if (UNnVVNvvnVvU.C00OOC00oO("FunTime") && var1 != null && var2 == null) {
         VVnuUunUv.C00OOC00oO();
      }
   }

   private float NVUunUNUN() {
      return UuUVuuUu(ccOO0COcoco0) + uVunuUNVVUUV.uUnuvNvvNU();
   }

   private boolean uUnuvNvvNU(class_1309 var1) {
      return this.UuUVuuUu(var1, UuUVuuUu(var1) + uVunuUNVVUUV.uUnuvNvvNU());
   }

   private boolean UuUVuuUu(class_1309 var1, float var2) {
      if (var1 instanceof class_746 || var1 == uUnuvNvvNU.field_1724) {
         return false;
      } else if (var1.method_5805() && !var1.method_5655() && !(var1 instanceof class_1531)) {
         if (uUnuvNvvNU.field_1724.method_5739(var1) > var2) {
            return false;
         } else if (!UuNnnVnuNNV.C00OOC00oO("Бить через блоки") && !uUnuvNvvNU.field_1724.method_6057(var1)) {
            return false;
         } else if (!nNnVnUNVV.C00OOC00oO("NPC") && this.vVvUvVVuuNvV(var1)) {
            return false;
         } else if (var1 instanceof class_1657 var7) {
            if (!var7.method_68878() && !var7.method_7325()) {
               boolean var8 = uNvUVUNvuUVV.UuUVuuUu(var7.method_5477().getString());
               if (var8 && !nNnVnUNVV.C00OOC00oO("Друзья")) {
                  return false;
               } else if (!var8 && !nNnVnUNVV.C00OOC00oO("Игроки")) {
                  return false;
               } else {
                  boolean var9 = !this.UuUVuuUu(var7);
                  boolean var6 = var7.method_5767();
                  if (AntiBot.UuUVuuUu(var7)) {
                     return false;
                  } else if (var6) {
                     return var9 ? nNnVnUNVV.C00OOC00oO("Голые невидимки") : nNnVnUNVV.C00OOC00oO("Невидимки");
                  } else {
                     return !var9 || nNnVnUNVV.C00OOC00oO("Голые");
                  }
               }
            } else {
               return false;
            }
         } else {
            boolean var3 = var1 instanceof class_1569 || var1 instanceof class_1621;
            boolean var4 = var1 instanceof class_1646 || var1 instanceof class_3988;
            boolean var5 = var1 instanceof class_1429 || var1 instanceof class_1646 || var1 instanceof class_1480 || var1 instanceof class_1421;
            if (var3 && nNnVnUNVV.C00OOC00oO("Мобы")) {
               return true;
            } else {
               return var4 && nNnVnUNVV.C00OOC00oO("Жители") ? true : var5 && nNnVnUNVV.C00OOC00oO("Животные");
            }
         }
      } else {
         return false;
      }
   }

   private boolean UuUVuuUu(class_1657 var1) {
      return !var1.method_6118(class_1304.field_6169).method_7960()
         || !var1.method_6118(class_1304.field_6174).method_7960()
         || !var1.method_6118(class_1304.field_6172).method_7960()
         || !var1.method_6118(class_1304.field_6166).method_7960();
   }

   private boolean vVvUvVVuuNvV(class_1309 var1) {
      String var2 = this.C00OOC00oO(var1.method_5477().getString());
      String var3 = this.C00OOC00oO(var1.method_5476().getString());
      String var4 = var1.method_5797() == null ? "" : this.C00OOC00oO(var1.method_5797().getString());
      String var5 = "";
      String var6 = "";
      if (var1.method_5781() != null) {
         var5 = this.C00OOC00oO(var1.method_5781().method_1144().getString());
         var6 = this.C00OOC00oO(var1.method_5781().method_1136().getString());
      }

      if (this.UuUVuuUu(var2) || this.UuUVuuUu(var3) || this.UuUVuuUu(var4) || this.UuUVuuUu(var5) || this.UuUVuuUu(var6)) {
         return true;
      } else if (!(var1 instanceof class_1657 var7)) {
         return false;
      } else {
         boolean var8 = uUnuvNvvNU.method_1562() != null && uUnuvNvvNU.method_1562().method_2871(var7.method_5667()) == null;
         boolean var9 = var2.matches("\\d{1,8}") || var2.startsWith("cit-");
         return var8 || var9 && (!var3.equals(var2) || !var5.isEmpty() || !var6.isEmpty());
      }
   }

   private boolean UuUVuuUu(String var1) {
      return var1.contains("npc") || var1.contains("znpc") || var1.contains("нпс") || var1.contains("наставник");
   }

   private String C00OOC00oO(String var1) {
      return var1 == null ? "" : var1.replaceAll("(?i)§.", "").replaceAll("(?i)&.", "").replaceAll("\\p{Cntrl}", "").trim().toLowerCase(Locale.ROOT);
   }

   @Override
   public void UuUVuuUu() {
      FreeLock var1 = ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null
         ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(FreeLock.class)
         : null;
      if (var1 != null && var1.nuUnNvnuUu && var1.UuuNnUvUuv()) {
         this.nuUnNvnuUu = false;
         vVnvuVVUunuv.UuUVuuUu("Отключите FreeLock перед включением AttackAura");
      } else {
         vNUnvuN.UuUVuuUu();
         super.UuUVuuUu();
      }
   }

   @Override
   public void a_() {
      super.a_();
      this.UUVNuUNUvUnV();
   }

   private void UUVNuUNUvUnV() {
      this.VvVvnNUnvuvV();
      this.NnVnNVN();
      this.vnvvNvUnVv();
      oCCO0cc0C0Oc.nvUVNnuu();
      this.UnUNuUU();
      this.VVnVNnunVvu();
      VuUvvnuUu.nNvNUVU();
      VVnuUunUv.C00OOC00oO();
      nNVUnNnn.uUnuvNvvNU();
      NVVuvnNVvvn.uNNnnnuuuN();
      o0oo00COOco.C00OOC00oO();
      VUnvVvUNvv.uUnuvNvvNU();
      ccOO0COcoco0 = null;
      NVnVnU.UuUVuuUu().C00OOC00oO("Aura");
      if (uUnuvNvvNU.field_1724 != null) {
         UnvuVuVnNuvu = false;
         UvNNVUVNVuvV = 0L;
      }

      o0Ooc0COOoc = false;
      nvvnUnUn = 0.0F;
      OCOocoOoOO = 0L;
      nnvuvUNuUnN = 0.0F;
      UnUUVuVunvVu = 0L;
      UVnuVUUVnnU = 0L;
      VunnVNvNV = 0L;
      NvUVUvVVnUu = Integer.MIN_VALUE;
   }

   private boolean vuvnUnVnUNnV() {
      return vNVuvnUUnuUn()
         ? true
         : uUnuvNvvNU.field_1724.method_6115()
               && UuNnnVnuNNV.C00OOC00oO("Не бить если кушаешь")
               && !(uUnuvNvvNU.field_1724.method_6030().method_7909() instanceof class_1819)
            || uUnuvNvvNU.field_1755 != null && UuNnnVnuNNV.C00OOC00oO("Не бить в контейнерах ")
            || !uUnuvNvvNU.field_1724.method_6047().method_31573(class_3489.field_42611)
               && !uUnuvNvvNU.field_1724.method_6047().method_31573(class_3489.field_42612)
               && uUnuvNvvNU.field_1724.method_6047().method_7909() != class_1802.field_49814
               && UuNnnVnuNNV.C00OOC00oO("Бить только оружием");
   }

   private int UuUVuuUu(class_1792 var1) {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var2 = 0; var2 < 9; var2++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var2).method_7909() == var1) {
               return var2;
            }
         }

         return -1;
      }
   }

   private int nnuUVNUuvvVU() {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 9; var1++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_31573(class_3489.field_42611)) {
               return var1;
            }
         }

         return -1;
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(vVvuNVUVvNv var1) {
      if (this.nuUnNvnuUu && vNnNuuvVn.uUnuvNvvNU() && VUuuVUnun.C00OOC00oO("Бинд")) {
         if (vVVuuVVv.uUnuvNvvNU() != -1 && var1.vVvUvVVuuNvV() == vVVuuVVv.uUnuvNvvNU() && var1.nuUnNvnuUu() == 1) {
            if (uUnuvNvvNU.field_1755 == null && !vNVuvnUUnuUn()) {
               this.uUVVvVVNvvn();
            }
         }
      }
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(VnuuuuVvVnN var1) {
      if (!var1.uVUuuVnNVU()) {
         if (this.nuUnNvnuUu && vNnNuuvVn.uUnuvNvvNU() && VUuuVUnun.C00OOC00oO("Бинд")) {
            int var2 = -100 - var1.vVvUvVVuuNvV();
            if (vVVuuVVv.uUnuvNvvNU() != -1 && vVVuuVVv.uUnuvNvvNU() == var2 && var1.vuuuNvNuv()) {
               if (uUnuvNvvNU.field_1755 == null && !vNVuvnUUnuUn()) {
                  this.uUVVvVVNvvn();
               }
            }
         }
      }
   }

   private void nVVUuvuNnUN() {
      if (uUnuvNvvNU.field_1724 == null || uUnuvNvvNU.field_1687 == null || uUnuvNvvNU.field_1761 == null) {
         this.ccOO0COcoco0();
      } else if (VNNnnVUuvv != 0) {
         this.uUVvnUuNvvN();
      } else if (vNnNuuvVn.uUnuvNvvNU() && !vNVuvnUUnuUn()) {
         if (uUnuvNvvNU.field_1755 == null) {
            if (VUuuVUnun.C00OOC00oO("Авто")) {
               this.nNnVnUNVV();
            }
         }
      } else {
         if (uuVuUuuVVNvN) {
            this.UuNnnVnuNNV();
         }
      }
   }

   private void nNnVnUNVV() {
      class_1309 var1 = this.nuunNvv();
      boolean var2 = var1 != null && uUnuvNvvNU.field_1724.method_23318() - var1.method_23318() >= VuunNUUUvu.uUnuvNvvNU();
      if (!uuVuUuuVVNvN) {
         if (!var2) {
            uunNUuunVU = false;
         } else {
            if (!uunNUuunVU && uUnuvNvvNU.field_1724.method_6047().method_7909() != class_1802.field_49814 && this.NUVvUUVuVNVv() != -1) {
               NvnuuuvnVV = 0;
               this.vvUVNVvvNUv();
            }
         }
      } else {
         NvnuuuvnVV++;
         if (vuvvuVuVv || NvnuuuvnVV > 40 && (!NNUUNUuVNNVn.uUnuvNvvNU() || !this.uNnUnnuNUnNu())) {
            uunNUuunVU = true;
            this.UuNnnVnuNNV();
         }
      }
   }

   private class_1309 nuunNvv() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         float var1 = UuUVuuUu(null) + uVunuUNVVUUV.uUnuvNvvNU() + VuunNUUUvu.uUnuvNvvNU() + 2.0F;
         double var2 = UuUVuuUu(null) + uVunuUNVVUUV.uUnuvNvvNU() + 1.5;
         double var4 = var2 * var2;
         class_1309 var6 = null;
         double var7 = Double.MAX_VALUE;

         for (class_1297 var10 : uUnuvNvvNU.field_1687.method_18112()) {
            if (var10 instanceof class_1309 var11 && !(uUnuvNvvNU.field_1724.method_23318() - var11.method_23318() < VuunNUUUvu.uUnuvNvvNU())) {
               double var12 = var11.method_23317() - uUnuvNvvNU.field_1724.method_23317();
               double var14 = var11.method_23321() - uUnuvNvvNU.field_1724.method_23321();
               double var16 = var12 * var12 + var14 * var14;
               if (!(var16 > var4) && this.UuUVuuUu(var11, var1) && var16 < var7) {
                  var7 = var16;
                  var6 = var11;
               }
            }
         }

         return var6;
      } else {
         return null;
      }
   }

   private void uUVVvVVNvvn() {
      if (VNNnnVUuvv == 0 && uUnuvNvvNU.field_1724 != null) {
         if (uuVuUuuVVNvN) {
            this.UuNnnVnuNNV();
         } else {
            this.vvUVNVvvNUv();
         }
      }
   }

   private boolean vvUVNVvvNUv() {
      if (!uuVuUuuVVNvN && VNNnnVUuvv == 0 && uUnuvNvvNU.field_1724 != null) {
         if (VUuuVUnun.C00OOC00oO("Авто") && System.currentTimeMillis() < UuuuNNunN) {
            return false;
         } else if (uUnuvNvvNU.field_1724.method_6047().method_7909() == class_1802.field_49814) {
            return false;
         } else {
            int var1 = this.NUVvUUVuVNVv();
            if (var1 == -1) {
               return false;
            } else {
               int var2 = uUnuvNvvNU.field_1724.method_31548().method_67532();
               if (var1 == var2) {
                  return false;
               } else {
                  uuuVnuvnnNnU = var2;
                  if (var1 < 9) {
                     nNunUnVN = true;
                     VnVuuvVvnNv = var1;
                     VvuUUUNNNv = -1;
                  } else {
                     nNunUnVN = false;
                     VnVuuvVvnNv = -1;
                     VvuUUUNNNv = var1;
                  }

                  this.uUnuvNvvNU(nNunUnVN ? "свап IN хотбар слот=" + var1 : "свап IN инвентарь слот=" + var1);
                  VNNnnVUuvv = 1;
                  vUvUvUNNuNvn = 0;
                  this.vVVuuVVv();
                  return true;
               }
            }
         }
      } else {
         return false;
      }
   }

   private boolean UuNnnVnuNNV() {
      if (uuVuUuuVVNvN && VNNnnVUuvv == 0) {
         this.uUnuvNvvNU("свап OUT старт");
         VNNnnVUuvv = 11;
         vUvUvUNNuNvn = 0;
         this.vVVuuVVv();
         return true;
      } else {
         return false;
      }
   }

   private void uUVvnUuNvvN() {
      NVnVnU.UuUVuuUu().UuUVuuUu("AuraMace");
      this.VuunNUUUvu();
      if (vUvUvUNNuNvn > 0) {
         vUvUvUNNuNvn--;
      } else {
         switch (VNNnnVUuvv) {
            case 1:
               VNNnnVUuvv = 2;
               vUvUvUNNuNvn = 0;
               break;
            case 2:
               this.NVuunNnvvvVu();
               uuVuUuuVVNvN = true;
               VNNnnVUuvv = 3;
               vUvUvUNNuNvn = 1;
               break;
            case 3:
               this.VUuuVUnun();
               break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            default:
               this.VUuuVUnun();
               break;
            case 11:
               VNNnnVUuvv = 12;
               vUvUvUNNuNvn = 0;
               break;
            case 12:
               this.vNnNuuvVn();
               NnUVNnuvUv = 4;
               VNNnnVUuvv = 13;
               vUvUvUNNuNvn = 1;
               break;
            case 13:
               if (this.UUuUnNVNuuv()) {
                  this.NVuNUuVnVUN();
               } else if (NnUVNnuvUv > 0) {
                  NnUVNnuvUv--;
                  this.vNnNuuvVn();
                  vUvUvUNNuNvn = 1;
               } else {
                  this.NVuNUuVnVUN();
               }
         }
      }
   }

   private boolean UUuUnNVNuuv() {
      return uUnuvNvvNU.field_1724 == null ? true : uUnuvNvvNU.field_1724.method_6047().method_7909() != class_1802.field_49814;
   }

   private void NVuNUuVnVUN() {
      this.uUnuvNvvNU("восстановлено");
      uuVuUuuVVNvN = false;
      VvuUUUNNNv = -1;
      uuuVnuvnnNnU = -1;
      nNunUnVN = false;
      VnVuuvVvnNv = -1;
      NnUVNnuvUv = 0;
      vuvvuVuVv = false;
      UuuuNNunN = System.currentTimeMillis() + 300L;
      this.VUuuVUnun();
   }

   private void NVuunNnvvvVu() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         if (nNunUnVN) {
            if (VnVuuvVvnNv >= 0 && VnVuuvVvnNv <= 8) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(VnVuuvVvnNv);
            }
         } else if (VvuUUUNNNv >= 0 && uuuVnuvnnNnU >= 0 && uuuVnuvnnNnU <= 8) {
            this.uUnuvNvvNU("clickSlot IN");
            uUnuvNvvNU.field_1761
               .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, VvuUUUNNNv, uuuVnuvnnNnU, class_1713.field_7791, uUnuvNvvNU.field_1724);
         }
      }
   }

   private void vNnNuuvVn() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         if (nNunUnVN) {
            if (uuuVnuvnnNnU >= 0 && uuuVnuvnnNnU <= 8) {
               uUnuvNvvNU.field_1724.method_31548().method_61496(uuuVnuvnnNnU);
            }
         } else if (VvuUUUNNNv >= 0 && uuuVnuvnnNnU >= 0 && uuuVnuvnnNnU <= 8) {
            this.uUnuvNvvNU("clickSlot OUT");
            uUnuvNvvNU.field_1761
               .method_2906(uUnuvNvvNU.field_1724.field_7498.field_7763, VvuUUUNNNv, uuuVnuvnnNnU, class_1713.field_7791, uUnuvNvvNU.field_1724);
         }
      }
   }

   private void VUuuVUnun() {
      VNNnnVUuvv = 0;
      vUvUvUNNuNvn = 0;
      NVnVnU.UuUVuuUu().C00OOC00oO("AuraMace");
   }

   private void vVVuuVVv() {
      oCCO0cc0C0Oc.nvUVNnuu();
      NVnVnU.UuUVuuUu().UuUVuuUu("AuraMace");
      this.VuunNUUUvu();
   }

   private void VuunNUUUvu() {
      Sprint.NnUuNNU = 2;
      if (uUnuvNvvNU.field_1690 != null) {
         uUnuvNvvNU.field_1690.field_1867.method_23481(false);
      }

      if (uUnuvNvvNU.field_1724 != null) {
         uUnuvNvvNU.field_1724.method_5728(false);
      }
   }

   private void uUnuvNvvNU(String var1) {
      if (VvVvnNUnvuvV.uUnuvNvvNU()) {
         int var2 = 0;
         int var3 = 0;
         if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1724.field_3913 != null) {
            var2 = (uUnuvNvvNU.field_1724.field_3913.field_54155.comp_3159() ? 1 : 0) - (uUnuvNvvNU.field_1724.field_3913.field_54155.comp_3160() ? 1 : 0);
            var3 = (uUnuvNvvNU.field_1724.field_3913.field_54155.comp_3161() ? 1 : 0) - (uUnuvNvvNU.field_1724.field_3913.field_54155.comp_3162() ? 1 : 0);
         }

         vVnvuVVUunuv.UuUVuuUu("[Булава] " + var1 + " (fwd=" + var2 + " str=" + var3 + ")");
      }
   }

   private void NNUUNUuVNNVn() {
      if (vNnNuuvVn.uUnuvNvvNU() && VUuuVUnun.C00OOC00oO("Авто") && uuVuUuuVVNvN && uUnuvNvvNU.field_1724 != null) {
         if (uUnuvNvvNU.field_1724.method_6047().method_7909() == class_1802.field_49814) {
            vuvvuVuVv = true;
            uunNUuunVU = true;
         }
      }
   }

   private void VvVvnNUnvuvV() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1761 != null) {
         if (uuVuUuuVVNvN) {
            this.vNnNuuvVn();
         }

         this.ccOO0COcoco0();
      } else {
         this.ccOO0COcoco0();
      }
   }

   private void ccOO0COcoco0() {
      if (VNNnnVUuvv != 0) {
         NVnVnU.UuUVuuUu().C00OOC00oO("AuraMace");
      }

      VNNnnVUuvv = 0;
      vUvUvUNNuNvn = 0;
      uuVuUuuVVNvN = false;
      VvuUUUNNNv = -1;
      uuuVnuvnnNnU = -1;
      nNunUnVN = false;
      VnVuuvVvnNv = -1;
      vuvvuVuVv = false;
      uunNUuunVU = false;
      NvnuuuvnVV = 0;
      NnUVNnuvUv = 0;
      UuuuNNunN = 0L;
   }

   private int NUVvUUVuVNVv() {
      if (uUnuvNvvNU.field_1724 == null) {
         return -1;
      } else {
         for (int var1 = 0; var1 < 36; var1++) {
            if (uUnuvNvvNU.field_1724.method_31548().method_5438(var1).method_7909() == class_1802.field_49814) {
               return var1;
            }
         }

         return -1;
      }
   }

   public static boolean vNVuvnUUnuUn() {
      return ServerHelper.ccOO0COcoco0 || ClickPearl.UNnVVNvvnVvU || AutoSwap.UnUNuUU || AutoTotem.NVNnnvnuunNv;
   }

   private void nNuVunNUVu() {
      if (!UNvvunVVn()) {
         nnvuvUNuUnN = 0.0F;
         UnUUVuVunvVu = 0L;
      } else {
         long var1 = System.currentTimeMillis();
         if (var1 >= UnUUVuVunvVu || nnvuvUNuUnN <= 0.0F) {
            nnvuvUNuUnN = ThreadLocalRandom.current().nextFloat(0.08F, 0.32F);
            UnUUVuVunvVu = var1 + ThreadLocalRandom.current().nextLong(55L, 130L);
         }

         uUnuvNvvNU.field_1724.field_6017 = nnvuvUNuUnN;
      }
   }

   private static boolean UNvvunVVn() {
      return uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null && uUnuvNvvNU.field_1724.method_24828() && UvnvNVnnnnNU();
   }

   public static boolean UvnvNVnnnnNU() {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         class_2338 var0 = class_2338.method_49637(
            uUnuvNvvNU.field_1724.method_23317(), uUnuvNvvNU.field_1724.method_5829().field_1322 - 0.05, uUnuvNvvNU.field_1724.method_23321()
         );
         class_2338 var1 = class_2338.method_49637(
            uUnuvNvvNU.field_1724.method_23317(), uUnuvNvvNU.field_1724.method_5829().field_1325 + 0.2, uUnuvNvvNU.field_1724.method_23321()
         );
         return UuUVuuUu(var0) && UuUVuuUu(var1);
      } else {
         return false;
      }
   }

   private static boolean UuUVuuUu(class_2338 var0) {
      class_2680 var1 = uUnuvNvvNU.field_1687.method_8320(var0);
      return !var1.method_26220(uUnuvNvvNU.field_1687, var0).method_1110();
   }

   private static long UnvuVuVnNuvu() {
      return UuUVuuUu(0L);
   }

   private static long UuUVuuUu(long var0) {
      if (uUVvnUuNvvN.C00OOC00oO("Умные криты") && uUnuvNvvNU.field_1724 != null && ccOO0COcoco0 != null) {
         long var2 = System.currentTimeMillis();
         int var4 = ccOO0COcoco0.method_5628();
         if (var4 != NvUVUvVVnUu || var2 >= UVnuVUUVnnU || oCCO0cc0C0Oc.vNVuvnUUnuUn() < 75.0F) {
            NvUVUvVVnUu = var4;
            VunnVNvNV = UvNNVUVNVuvV();
            UVnuVUUVnnU = var2 + ThreadLocalRandom.current().nextLong(95L, 180L);
         }

         return var0 + VunnVNvNV;
      } else {
         return var0;
      }
   }

   private static long UvNNVUVNVuvV() {
      long var0 = -35L;
      long var2 = 28L;
      boolean var4 = uUnuvNvvNU.field_1724.field_6017 > 0.0 || uUnuvNvvNU.field_1724.method_18798().field_1351 < -0.0784;
      if (var4) {
         var0 -= 18L;
         var2 -= 8L;
      }

      if (UNvvunVVn()) {
         var0 -= 22L;
         var2 -= 6L;
      } else if (uUnuvNvvNU.field_1724.method_24828()) {
         var0 += 8L;
         var2 += 18L;
      }

      if (ccOO0COcoco0.field_6235 > 0) {
         var0 = Math.max(var0, 4L);
         var2 += 34L;
      }

      double var5 = UuUVuuUu(ccOO0COcoco0) - uvnuUUnunNn.UuUVuuUu((class_1297)ccOO0COcoco0);
      if (var5 < 0.35F) {
         var0 += 10L;
         var2 += 22L;
      } else if (var5 > 1.0) {
         var0 -= 8L;
      }

      if (var2 < var0) {
         var2 = var0;
      }

      return ThreadLocalRandom.current().nextLong(var0, var2 + 1L);
   }

   @Override
   public void C00OOC00oO() {
      UNnnNuVnu.uUnuvNvvNU();
      this.VvVvnNUnvuvV();
      this.NnVnNVN();
      this.vnvvNvUnVv();
      oCCO0cc0C0Oc.nvUVNnuu();
      this.VVnVNnunVvu();
      VVnuUunUv.C00OOC00oO();
      NVVuvnNVvvn.vVvUvVVuuNvV();
      VUnvVvUNvv.C00OOC00oO();
      vNUnvuN.C00OOC00oO();
      nNVUnNnn.uUnuvNvvNU();
      super.C00OOC00oO();
   }

   private static void NnunUUnU() {
      if (uUnuvNvvNU != null) {
         uUnuvNvvNU.execute(() -> uUnuvNvvNU.method_1507(new wvVWvvWvww()));
      }
   }

   private static void nvuVvuNnNUnv() {
      if (uUnuvNvvNU != null) {
         uUnuvNvvNU.execute(() -> uUnuvNvvNU.method_1507(new UNVnvUUUVv()));
      }
   }

   private void NnVnNVN() {
      if (UNnVVNvvnVvU.C00OOC00oO("Lony Grief")) {
         CO0oc0oC.UuUVuuUu();
      }

      if (UNnVVNvvnVvU.C00OOC00oO("Side Point")) {
         vvNVnVNvUvV.UuUVuuUu();
      }
   }

   private void vnvvNvUnVv() {
      if (UNnVVNvvnVvU.C00OOC00oO("Neuro")) {
         NuUvVVvUVVUV.UuUVuuUu(nVVUuvuNnUN.uUnuvNvvNU());
      }
   }

   @uNUunUnnnVu(
      uUnuvNvvNU = {"lichoday", "bitrixtime", "oblamovvv"}
   )
   static final class NVnVnNnN {
      private NVnVnNnN() {
      }
   }
}
