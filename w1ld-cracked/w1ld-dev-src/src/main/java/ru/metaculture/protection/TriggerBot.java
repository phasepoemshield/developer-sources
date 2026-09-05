package ru.metaculture.protection;

import java.util.Locale;
import java.util.concurrent.ThreadLocalRandom;
import net.minecraft.class_1268;
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
import net.minecraft.class_1802;
import net.minecraft.class_1819;
import net.minecraft.class_3489;
import net.minecraft.class_3988;
import net.minecraft.class_746;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "TriggerBot",
   C00OOC00oO = "Бьет энтити при наведении на него",
   uUnuvNvvNU = oOOOo0.Combat,
   vVvUvVVuuNvV = {uVUNNUnNvU.RISKY, uVUNNUnNvU.GRIM}
)
public class TriggerBot extends Module {
   public static nNUuNvVn NVNnnvnuunNv = new nNUuNvVn("Дистанция", 4.5F, 3.0F, 8.0F, 0.1F, false);
   public static VUVnvvnNN uVunuUNVVUUV = new VUVnvvnNN(
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
   public static VUVnvvnNN UNnVVNvvnVvU = new VUVnvvnNN(
      "Проверки до удара",
      new vvNnnUNnVvn("Бить через блоки", false),
      new vvNnnUNnVvn("Бить только оружием", false),
      new vvNnnUNnVvn("Не бить если кушаешь", true),
      new vvNnnUNnVvn("Не бить в контейнерах ", false),
      new vvNnnUNnVvn("Ломать щит", false),
      new vvNnnUNnVvn("Отжим щита", false)
   );
   public static VUVnvvnNN uNnUnnuNUnNu = new VUVnvvnNN(
      "Дополнительные настройки",
      new vvNnnUNnVvn("Расширенная настройки для атаки", false),
      new vvNnnUNnVvn("Умные криты", false),
      new vvNnnUNnVvn("Увеличенная дистанция удара", false)
   );
   public static nNUuNvVn NnUuNNU = new nNUuNvVn("Радиус атаки для мобов", 4.5F, 3.0F, 8.0F, 0.1F, false)
      .UuUVuuUu(() -> !uNnUnnuNUnNu.C00OOC00oO("Расширенная настройки для атаки"));
   public static nNUuNvVn nNvNUVU = new nNUuNvVn("Радиус атаки для игроков", 4.5F, 3.0F, 8.0F, 0.1F, false)
      .UuUVuuUu(() -> !uNnUnnuNUnNu.C00OOC00oO("Расширенная настройки для атаки"));
   public static class_1309 UnUNuUU;
   private static long uUVuVvuNUvnu = 0L;
   private static boolean UvUvUNuvNU = false;
   private static float c0oOOCcCoC0 = 0.0F;

   public TriggerBot() {
      this.UuUVuuUu(new nvUuvVvuuN[]{NVNnnvnuunNv, uVunuUNVVUUV, UNnVVNvvnVvU, uNnUnnuNUnNu, NnUuNNU, nNvNUVU});
   }

   public static class_1309 UuuNnUvUuv() {
      return UnUNuUU;
   }

   @Override
   public void C00OOC00oO() {
      UnUNuUU = null;
      UvUvUNuvNU = false;
      c0oOOCcCoC0 = 0.0F;
      uUVuVvuNUvnu = 0L;
      super.C00OOC00oO();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      if (uUnuvNvvNU.field_1724 != null && uUnuvNvvNU.field_1687 != null) {
         this.nUUVuvU();
         if (!AttackAura.vNVuvnUUnuUn()) {
            class_1309 var2 = this.UnUNVVVNuv();
            if (var2 != null) {
               if (!this.vNVuvnUUnuUn()) {
                  float var3 = UuUVuuUu(var2);
                  float[] var4 = new float[]{var3, 0.0F, var3};
                  oCCO0cc0C0Oc.UuUVuuUu(var2, true, true, false);
                  boolean var5 = !uNnUnnuNUnNu.C00OOC00oO("Умные криты");
                  if (oCCO0cc0C0Oc.UuUVuuUu(var2, false, true, var5, 0L, var4)) {
                     Runnable[] var6 = oCCO0cc0C0Oc.UuUVuuUu(var2, UNnVVNvvnVvU.C00OOC00oO("Ломать щит"));
                     Runnable[] var7 = oCCO0cc0C0Oc.UuUVuuUu(true);
                     Runnable[] var8 = oCCO0cc0C0Oc.C00OOC00oO(false);
                     Runnable var9 = () -> {
                        var8[0].run();
                        var7[0].run();
                        var6[0].run();
                     };
                     Runnable var10 = () -> {
                        var6[1].run();
                        var7[1].run();
                        var8[1].run();
                     };
                     if (UNnVVNvvnVvU.C00OOC00oO("Отжим щита")
                        && uUnuvNvvNU.field_1724.method_6030().method_7909().equals(class_1802.field_8255)
                        && uUnuvNvvNU.field_1724.method_6115()) {
                        uUnuvNvvNU.field_1761.method_2897(uUnuvNvvNU.field_1724);
                     }

                     if (oCCO0cc0C0Oc.UuUVuuUu(var2, var9, var10, class_1268.field_5808, true)) {
                        UnUNuUU = var2;
                     }
                  }
               }
            }
         }
      } else {
         UnUNuUU = null;
      }
   }

   private void nUUVuvU() {
      if (UnUNuUU != null) {
         if (!UnUNuUU.method_5805()
            || UnUNuUU.method_31481()
            || uUnuvNvvNU.field_1724 == null
            || uUnuvNvvNU.field_1724.method_5739(UnUNuUU) > UuUVuuUu(UnUNuUU) + 2.0F) {
            UnUNuUU = null;
         }
      }
   }

   private class_1309 UnUNVVVNuv() {
      class_1309 var1 = null;
      double var2 = Double.MAX_VALUE;
      float var4 = uUnuvNvvNU.field_1724.method_36454();
      float var5 = uUnuvNvvNU.field_1724.method_36455();
      boolean var6 = UNnVVNvvnVvU.C00OOC00oO("Бить через блоки");

      for (class_1297 var8 : uUnuvNvvNU.field_1687.method_18112()) {
         if (var8 instanceof class_1309 var9 && this.C00OOC00oO(var9) && VuUVUvnU.uUnuvNvvNU(var4, var5, UuUVuuUu(var9), var9, var6)) {
            double var10 = uUnuvNvvNU.field_1724.method_5858(var9);
            if (var10 < var2) {
               var2 = var10;
               var1 = var9;
            }
         }
      }

      return var1;
   }

   public static float UuUVuuUu(class_1309 var0) {
      if (var0 == null) {
         return NVNnnvnuunNv.uUnuvNvvNU();
      } else {
         float var1 = NVNnnvnuunNv.uUnuvNvvNU();
         if (uNnUnnuNUnNu.C00OOC00oO("Расширенная настройки для атаки")) {
            var1 = var0 instanceof class_1657 ? nNvNUVU.uUnuvNvvNU() : NnUuNNU.uUnuvNvvNU();
         }

         if (uNnUnnuNUnNu.C00OOC00oO("Увеличенная дистанция удара")) {
            float var2 = var0.method_6032() + var0.method_6067();
            if (var2 >= 10.0F && var2 <= 12.0F) {
               long var3 = System.currentTimeMillis();
               if (var3 >= uUVuVvuNUvnu) {
                  if (ThreadLocalRandom.current().nextInt(100) < 25) {
                     UvUvUNuvNU = true;
                     c0oOOCcCoC0 = 0.1F + ThreadLocalRandom.current().nextFloat() * 0.05F;
                     uUVuVvuNUvnu = var3 + ThreadLocalRandom.current().nextLong(400L, 700L);
                  } else {
                     UvUvUNuvNU = false;
                     c0oOOCcCoC0 = 0.0F;
                     uUVuVvuNUvnu = var3 + ThreadLocalRandom.current().nextLong(1500L, 2500L);
                  }
               }

               if (UvUvUNuvNU) {
                  return var1 + c0oOOCcCoC0;
               }
            } else {
               UvUvUNuvNU = false;
               c0oOOCcCoC0 = 0.0F;
            }
         }

         return var1;
      }
   }

   private boolean vNVuvnUUnuUn() {
      return uUnuvNvvNU.field_1724.method_6115()
            && UNnVVNvvnVvU.C00OOC00oO("Не бить если кушаешь")
            && !(uUnuvNvvNU.field_1724.method_6030().method_7909() instanceof class_1819)
         || uUnuvNvvNU.field_1755 != null && UNnVVNvvnVvU.C00OOC00oO("Не бить в контейнерах ")
         || !uUnuvNvvNU.field_1724.method_6047().method_31573(class_3489.field_42611)
            && !uUnuvNvvNU.field_1724.method_6047().method_31573(class_3489.field_42612)
            && UNnVVNvvnVvU.C00OOC00oO("Бить только оружием");
   }

   private boolean C00OOC00oO(class_1309 var1) {
      if (var1 instanceof class_746 || var1 == uUnuvNvvNU.field_1724) {
         return false;
      } else if (var1.method_5805() && !var1.method_5655() && !(var1 instanceof class_1531)) {
         if (uUnuvNvvNU.field_1724.method_5739(var1) > UuUVuuUu(var1)) {
            return false;
         } else if (!UNnVVNvvnVvU.C00OOC00oO("Бить через блоки") && !uUnuvNvvNU.field_1724.method_6057(var1)) {
            return false;
         } else if (!uVunuUNVVUUV.C00OOC00oO("NPC") && this.uUnuvNvvNU(var1)) {
            return false;
         } else if (var1 instanceof class_1657 var6) {
            if (!var6.method_68878() && !var6.method_7325()) {
               boolean var7 = uNvUVUNvuUVV.UuUVuuUu(var6.method_5477().getString());
               if (var7 && !uVunuUNVVUUV.C00OOC00oO("Друзья")) {
                  return false;
               } else if (!var7 && !uVunuUNVVUUV.C00OOC00oO("Игроки")) {
                  return false;
               } else if (AntiBot.UuUVuuUu(var6)) {
                  return false;
               } else {
                  boolean var8 = !this.UuUVuuUu(var6);
                  boolean var5 = var6.method_5767();
                  if (var5) {
                     return var8 ? uVunuUNVVUUV.C00OOC00oO("Голые невидимки") : uVunuUNVVUUV.C00OOC00oO("Невидимки");
                  } else {
                     return !var8 || uVunuUNVVUUV.C00OOC00oO("Голые");
                  }
               }
            } else {
               return false;
            }
         } else {
            boolean var2 = var1 instanceof class_1569 || var1 instanceof class_1621;
            boolean var3 = var1 instanceof class_1646 || var1 instanceof class_3988;
            boolean var4 = var1 instanceof class_1429 || var1 instanceof class_1646 || var1 instanceof class_1480 || var1 instanceof class_1421;
            if (var2 && uVunuUNVVUUV.C00OOC00oO("Мобы")) {
               return true;
            } else {
               return var3 && uVunuUNVVUUV.C00OOC00oO("Жители") ? true : var4 && uVunuUNVVUUV.C00OOC00oO("Животные");
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

   private boolean uUnuvNvvNU(class_1309 var1) {
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
}
