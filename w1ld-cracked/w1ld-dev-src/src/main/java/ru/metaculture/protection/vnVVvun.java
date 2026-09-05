package ru.metaculture.protection;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import net.minecraft.class_1293;
import net.minecraft.class_1294;
import net.minecraft.class_1320;
import net.minecraft.class_1322;
import net.minecraft.class_1799;
import net.minecraft.class_1802;
import net.minecraft.class_1844;
import net.minecraft.class_2487;
import net.minecraft.class_2561;
import net.minecraft.class_5134;
import net.minecraft.class_6880;
import net.minecraft.class_9279;
import net.minecraft.class_9285;
import net.minecraft.class_9290;
import net.minecraft.class_9334;
import net.minecraft.class_9285.class_9287;

public class vnVVvun {
   private static final List<class_1293> UuUVuuUu = List.of(
      new class_1293(class_1294.field_5909, 200, 9),
      new class_1293(class_1294.field_5904, 400, 4),
      new class_1293(class_1294.field_5919, 100, 9),
      new class_1293(class_1294.field_5912, 3600, 0)
   );
   private static final List<class_1293> C00OOC00oO = List.of(new class_1293(class_1294.field_5910, 600, 4), new class_1293(class_1294.field_5909, 600, 3));
   private static final List<class_1293> uUnuvNvvNU = List.of(
      new class_1293(class_1294.field_5907, 12000, 0),
      new class_1293(class_1294.field_5918, 12000, 0),
      new class_1293(class_1294.field_5914, 1200, 2),
      new class_1293(class_1294.field_5905, 18000, 0)
   );
   private static final List<class_1293> vVvUvVVuuNvV = List.of(
      new class_1293(class_1294.field_5924, 900, 1), new class_1293(class_1294.field_5905, 12000, 1), new class_1293(class_1294.field_5915, 0, 1)
   );
   private static final List<class_1293> uNNnnnuuuN = List.of(
      new class_1293(class_1294.field_5910, 1200, 3),
      new class_1293(class_1294.field_5904, 6000, 2),
      new class_1293(class_1294.field_5917, 1200, 0),
      new class_1293(class_1294.field_5921, 0, 1)
   );
   private static final List<class_1293> nuUnNvnuUu = List.of(
      new class_1293(class_1294.field_5899, 1200, 1),
      new class_1293(class_1294.field_5920, 1200, 1),
      new class_1293(class_1294.field_5909, 1800, 2),
      new class_1293(class_1294.field_5903, 1200, 4),
      new class_1293(class_1294.field_5912, 2400, 0)
   );
   private static final List<class_1293> VVuuUN = List.of(
      new class_1293(class_1294.field_5911, 1800, 1),
      new class_1293(class_1294.field_5901, 200, 1),
      new class_1293(class_1294.field_5920, 1800, 2),
      new class_1293(class_1294.field_5919, 200, 0)
   );
   private static final List<class_1293> vNUvnnVnUvu = List.of(
      new class_1293(class_1294.field_5918, 3600, 0),
      new class_1293(class_1294.field_5913, 3600, 1),
      new class_1293(class_1294.field_5926, 3600, 0),
      new class_1293(class_1294.field_5917, 3600, 1)
   );
   private static final List<vnVVvun.NVnVnNnN> uVUuuVnNVU = List.of(
      new vnVVvun.NVnVnNnN("Хлопушка", UuUVuuUu),
      new vnVVvun.NVnVnNnN("Зелье Гнева", C00OOC00oO),
      new vnVVvun.NVnVnNnN("Зелье Палладина", uUnuvNvvNU),
      new vnVVvun.NVnVnNnN("Святая Вода", vVvUvVVuuNvV),
      new vnVVvun.NVnVnNnN("Зелье Ассасина", uNNnnnuuuN),
      new vnVVvun.NVnVnNnN("Зелье Радиации", nuUnNvnuUu),
      new vnVVvun.NVnVnNnN("Снотворное", VVuuUN)
   );

   public static List<vnVVvun.NVnVnNnN> UuUVuuUu() {
      return uVUuuVnNVU;
   }

   private static Map<class_6880<class_1320>, Double> UNvvunVVn(class_1799 var0) {
      class_9285 var1 = (class_9285)var0.method_58694(class_9334.field_49636);
      HashMap var2 = new HashMap();
      if (var1 == null) {
         return var2;
      } else {
         for (class_9287 var4 : var1.comp_2393()) {
            class_1322 var5 = var4.comp_2396();
            var2.put(var4.comp_2395(), var5.comp_2449());
         }

         return var2;
      }
   }

   private static boolean UuUVuuUu(Map<class_6880<class_1320>, Double> var0, class_6880<class_1320> var1, double var2) {
      return Math.abs(var0.getOrDefault(var1, 0.0) - var2) < 1.0E-4;
   }

   private static boolean UuUVuuUu(class_1799 var0, String var1) {
      if (!var0.method_31574(class_1802.field_8575)) {
         return false;
      } else {
         class_9279 var2 = (class_9279)var0.method_58694(class_9334.field_49628);
         if (var2 == null) {
            return false;
         } else {
            class_2487 var3 = var2.method_57461();
            return var3.method_10562("SkullOwner")
               .flatMap(var0x -> var0x.method_10562("Properties"))
               .flatMap(var0x -> var0x.method_10554("textures"))
               .filter(var0x -> !var0x.isEmpty())
               .flatMap(var0x -> var0x.method_10602(0))
               .flatMap(var0x -> var0x.method_10558("Value"))
               .map(var1x -> var1x.equals(var1))
               .orElse(false);
         }
      }
   }

   private static boolean UuUVuuUu(class_1799 var0, List<class_1293> var1) {
      class_1844 var2 = (class_1844)var0.method_58694(class_9334.field_49651);
      if (var2 == null) {
         return false;
      } else {
         List var3 = var2.comp_2380();

         for (class_1293 var5 : var1) {
            boolean var6 = false;

            for (class_1293 var8 : var3) {
               if (var8.method_5579().equals(var5.method_5579()) && var8.method_5578() == var5.method_5578()) {
                  var6 = true;
                  break;
               }
            }

            if (!var6) {
               return false;
            }
         }

         return true;
      }
   }

   private static boolean C00OOC00oO(class_1799 var0, String var1) {
      return var0.method_7964().getString().contains(var1);
   }

   private static boolean uUnuvNvvNU(class_1799 var0, String var1) {
      return var0.method_7964().getString().toLowerCase(Locale.ROOT).contains(var1.toLowerCase(Locale.ROOT));
   }

   private static boolean vVvUvVVuuNvV(class_1799 var0, String var1) {
      class_9290 var2 = (class_9290)var0.method_58694(class_9334.field_49632);
      if (var2 == null) {
         return false;
      } else {
         for (class_2561 var4 : var2.comp_2400()) {
            if (var4.getString().contains(var1)) {
               return true;
            }
         }

         return false;
      }
   }

   private static boolean uNNnnnuuuN(class_1799 var0, String var1) {
      String var2 = var1.toLowerCase(Locale.ROOT);
      if (var0.method_7964().getString().toLowerCase(Locale.ROOT).contains(var2)) {
         return true;
      } else {
         class_9290 var3 = (class_9290)var0.method_58694(class_9334.field_49632);
         if (var3 == null) {
            return false;
         } else {
            for (class_2561 var5 : var3.comp_2400()) {
               if (var5.getString().toLowerCase(Locale.ROOT).contains(var2)) {
                  return true;
               }
            }

            return false;
         }
      }
   }

   public static boolean UuUVuuUu(class_1799 var0) {
      Map var1 = UNvvunVVn(var0);
      return UuUVuuUu(var1, class_5134.field_23716, -4.0)
         && UuUVuuUu(var1, class_5134.field_23724, 1.5)
         && UuUVuuUu(var1, class_5134.field_23721, 2.5)
         && UuUVuuUu(var1, class_5134.field_23719, 0.07)
         && UuUVuuUu(var1, class_5134.field_23723, 0.13)
         && UuUVuuUu(var1, class_5134.field_49078, 0.09);
   }

   public static boolean C00OOC00oO(class_1799 var0) {
      Map var1 = UNvvunVVn(var0);
      return UuUVuuUu(var1, class_5134.field_23724, 2.5) && UuUVuuUu(var1, class_5134.field_23725, 2.5) && UuUVuuUu(var1, class_5134.field_23719, -0.15);
   }

   public static boolean uUnuvNvvNU(class_1799 var0) {
      Map var1 = UNvvunVVn(var0);
      return UuUVuuUu(var1, class_5134.field_23721, 6.0) && UuUVuuUu(var1, class_5134.field_23724, -2.0) && UuUVuuUu(var1, class_5134.field_23716, -2.0);
   }

   public static boolean vVvUvVVuuNvV(class_1799 var0) {
      Map var1 = UNvvunVVn(var0);
      return UuUVuuUu(var1, class_5134.field_23724, 1.0)
         && UuUVuuUu(var1, class_5134.field_23716, 4.0)
         && UuUVuuUu(var1, class_5134.field_23719, 0.1)
         && UuUVuuUu(var1, class_5134.field_23723, 0.1);
   }

   public static boolean uNNnnnuuuN(class_1799 var0) {
      Map var1 = UNvvunVVn(var0);
      return UuUVuuUu(var1, class_5134.field_23716, 4.0)
         && UuUVuuUu(var1, class_5134.field_23724, 2.0)
         && UuUVuuUu(var1, class_5134.field_51576, 0.5)
         && UuUVuuUu(var1, class_5134.field_51583, 0.5);
   }

   public static boolean nuUnNvnuUu(class_1799 var0) {
      Map var1 = UNvvunVVn(var0);
      return UuUVuuUu(var1, class_5134.field_23721, 2.0) && UuUVuuUu(var1, class_5134.field_23716, 2.0);
   }

   public static boolean VVuuUN(class_1799 var0) {
      Map var1 = UNvvunVVn(var0);
      return UuUVuuUu(var1, class_5134.field_23726, 1.0) && UuUVuuUu(var1, class_5134.field_23716, 2.0) && UuUVuuUu(var1, class_5134.field_47758, 1.0);
   }

   public static boolean vNUvnnVnUvu(class_1799 var0) {
      Map var1 = UNvvunVVn(var0);
      return UuUVuuUu(var1, class_5134.field_23721, 2.0) && UuUVuuUu(var1, class_5134.field_23728, -0.1) && UuUVuuUu(var1, class_5134.field_23723, 0.15);
   }

   public static boolean uVUuuVnNVU(class_1799 var0) {
      return var0.method_31574(class_1802.field_8575) && C00OOC00oO(var0, "Сфера Мороза") && vVvUvVVuuNvV(var0, "Вечная мерзлота");
   }

   public static boolean vuuuNvNuv(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8288)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         return UuUVuuUu(var1, class_5134.field_23721, 2.5) && UuUVuuUu(var1, class_5134.field_23723, 0.1);
      }
   }

   public static boolean nvUVNnuu(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8288)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         return UuUVuuUu(var1, class_5134.field_23721, 7.0) && UuUVuuUu(var1, class_5134.field_23716, -4.0) && UuUVuuUu(var1, class_5134.field_23719, 0.1);
      }
   }

   public static boolean UuuNnUvUuv(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8288)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         return UuUVuuUu(var1, class_5134.field_23724, 1.5) && UuUVuuUu(var1, class_5134.field_23716, 1.5);
      }
   }

   public static boolean nUUVuvU(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8288)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         return UuUVuuUu(var1, class_5134.field_23721, 5.0) && UuUVuuUu(var1, class_5134.field_23716, -4.0);
      }
   }

   public static boolean UnUNVVVNuv(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8288)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         return UuUVuuUu(var1, class_5134.field_23721, 2.0) && UuUVuuUu(var1, class_5134.field_23724, 2.0) && UuUVuuUu(var1, class_5134.field_23716, -4.0);
      }
   }

   public static boolean vNVuvnUUnuUn(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8288)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         return UuUVuuUu(var1, class_5134.field_23716, 4.0)
            && UuUVuuUu(var1, class_5134.field_23721, 3.0)
            && UuUVuuUu(var1, class_5134.field_23725, 2.0)
            && UuUVuuUu(var1, class_5134.field_23724, 2.0);
      }
   }

   public static boolean UvnvNVnnnnNU(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8288)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         return UuUVuuUu(var1, class_5134.field_23721, 4.0)
            && UuUVuuUu(var1, class_5134.field_23716, 2.0)
            && UuUVuuUu(var1, class_5134.field_23719, 0.1)
            && UuUVuuUu(var1, class_5134.field_23723, 0.1)
            && UuUVuuUu(var1, class_5134.field_23724, -3.0);
      }
   }

   public static boolean uVUVnuvnuVuv(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8288)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         return UuUVuuUu(var1, class_5134.field_23716, 2.0);
      }
   }

   public static String NVNnnvnuunNv(class_1799 var0) {
      if (vuuuNvNuv(var0)) {
         return "Талисман Демона";
      } else if (nvUVNnuu(var0)) {
         return "Талисман Карателя";
      } else if (UuuNnUvUuv(var0)) {
         return "Талисман Мрака";
      } else if (nUUVuvU(var0)) {
         return "Талисман Ярости";
      } else if (UnUNVVVNuv(var0)) {
         return "Талисман Тирана";
      } else if (vNVuvnUUnuUn(var0)) {
         return "Талисман Крушителя";
      } else if (UvnvNVnnnnNU(var0)) {
         return "Талисман Раздора";
      } else {
         return uVUVnuvnuVuv(var0) ? "Талисман Сары" : "";
      }
   }

   public static boolean uVunuUNVVUUV(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8436)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         boolean var2 = UuUVuuUu(var1, class_5134.field_23721, 12.0)
            && UuUVuuUu(var1, class_5134.field_23719, 0.6)
            && UuUVuuUu(var1, class_5134.field_23723, 0.1);
         return var2 || UuUVuuUu(var0, uNNnnnuuuN);
      }
   }

   public static boolean UNnVVNvvnVvU(class_1799 var0) {
      if (!var0.method_31574(class_1802.field_8436)) {
         return false;
      } else {
         Map var1 = UNvvunVVn(var0);
         boolean var2 = UuUVuuUu(var1, class_5134.field_23721, 5.0);
         return var2 && UuUVuuUu(var0, C00OOC00oO);
      }
   }

   public static boolean uNnUnnuNUnNu(class_1799 var0) {
      return !var0.method_31574(class_1802.field_8436) ? false : UuUVuuUu(var0, UuUVuuUu);
   }

   public static boolean NnUuNNU(class_1799 var0) {
      return !var0.method_31574(class_1802.field_8436) ? false : UuUVuuUu(var0, vVvUvVVuuNvV) || C00OOC00oO(var0, "Святая вода");
   }

   public static boolean nNvNUVU(class_1799 var0) {
      return !var0.method_31574(class_1802.field_8436) ? false : UuUVuuUu(var0, uUnuvNvvNU);
   }

   public static boolean UnUNuUU(class_1799 var0) {
      return !var0.method_31574(class_1802.field_8436) ? false : UuUVuuUu(var0, nuUnNvnuUu);
   }

   public static boolean uUVuVvuNUvnu(class_1799 var0) {
      return !var0.method_31574(class_1802.field_8436) ? false : UuUVuuUu(var0, VVuuUN);
   }

   public static boolean UvUvUNuvNU(class_1799 var0) {
      return var0.method_31574(class_1802.field_8479) && C00OOC00oO(var0, "Явная пыль") && vVvUvVVuuNvV(var0, "Каст: Световая вспышка");
   }

   public static boolean c0oOOCcCoC0(class_1799 var0) {
      return var0.method_31574(class_1802.field_8449) && C00OOC00oO(var0, "Дезориентация") && vVvUvVVuuNvV(var0, "Чем ближе цель");
   }

   public static boolean VVnVNnunVvu(class_1799 var0) {
      return var0.method_31574(class_1802.field_22021) && C00OOC00oO(var0, "Трапка") && vVvUvVVuuNvV(var0, "Каст: Нерушимая клетка");
   }

   public static boolean unNNVVNnvvV(class_1799 var0) {
      return var0.method_31574(class_1802.field_8366) && C00OOC00oO(var0, "Отмычка к Сферам") && vVvUvVVuuNvV(var0, "Открыть хранилище с Сферам");
   }

   public static boolean NuunnvnN(class_1799 var0) {
      return var0.method_31574(class_1802.field_8551) && C00OOC00oO(var0, "Пласт") && vVvUvVVuuNvV(var0, "Каст: Нерушимая стена");
   }

   public static boolean NVUunUNUN(class_1799 var0) {
      return var0.method_31574(class_1802.field_8287) && (uNNnnnuuuN(var0, "Опыт с уровнем 15") || uNNnnnuuuN(var0, "15 ур"));
   }

   public static boolean UUVNuUNUvUnV(class_1799 var0) {
      return var0.method_31574(class_1802.field_8287) && (uNNnnnuuuN(var0, "Опыт с уровнем 30") || uNNnnnuuuN(var0, "30 ур"));
   }

   public static boolean vuvnUnVnUNnV(class_1799 var0) {
      return var0.method_31574(class_1802.field_8287) && (uNNnnnuuuN(var0, "Опыт с уровнем 50") || uNNnnnuuuN(var0, "50 ур"));
   }

   public static boolean nnuUVNUuvvVU(class_1799 var0) {
      return var0.method_31574(class_1802.field_8287) && (uNNnnnuuuN(var0, "Опыт с уровнем 45") || uNNnnnuuuN(var0, "45 ур"));
   }

   public static boolean nVVUuvuNnUN(class_1799 var0) {
      return var0.method_31574(class_1802.field_8626) && C00OOC00oO(var0, "WHITE") && vVvUvVVuuNvV(var0, "в 10 раз сильнее");
   }

   public static boolean nNnVnUNVV(class_1799 var0) {
      return var0.method_31574(class_1802.field_8626) && C00OOC00oO(var0, "BLACK") && vVvUvVVuuNvV(var0, "взорвать обсидиан");
   }

   public static boolean nuunNvv(class_1799 var0) {
      return var0.method_31574(class_1802.field_17346) && C00OOC00oO(var0, "Случайный") && vVvUvVVuuNvV(var0, "Уровень лута: Случайный");
   }

   public static boolean uUVVvVVNvvn(class_1799 var0) {
      return var0.method_31574(class_1802.field_17346) && C00OOC00oO(var0, "Обычный") && vVvUvVVuuNvV(var0, "Уровень лута: Обычный");
   }

   public static boolean vvUVNVvvNUv(class_1799 var0) {
      return var0.method_31574(class_1802.field_17346) && C00OOC00oO(var0, "Богатый") && vVvUvVVuuNvV(var0, "Уровень лута: Богатый");
   }

   public static boolean UuNnnVnuNNV(class_1799 var0) {
      return var0.method_31574(class_1802.field_23842) && C00OOC00oO(var0, "Легендарный") && vVvUvVVuuNvV(var0, "Уровень лута: Легендарный");
   }

   public static boolean uUVvnUuNvvN(class_1799 var0) {
      return var0.method_31574(class_1802.field_16538) && C00OOC00oO(var0, "Блок дамагер") && vVvUvVVuuNvV(var0, "Каст: Нанесение урона");
   }

   public static boolean UUuUnNVNuuv(class_1799 var0) {
      return var0.method_31574(class_1802.field_8238) && C00OOC00oO(var0, "1x1") && vVvUvVVuuNvV(var0, "(1x1)");
   }

   public static boolean NVuNUuVnVUN(class_1799 var0) {
      return var0.method_31574(class_1802.field_8668) && C00OOC00oO(var0, "Маяк") && vVvUvVVuuNvV(var0, "раздающий Монеты");
   }

   public static boolean NVuunNnvvvVu(class_1799 var0) {
      return var0.method_31574(class_1802.field_22016) && C00OOC00oO(var0, "Проклятая душа") && vVvUvVVuuNvV(var0, "Обменяй души");
   }

   public static boolean vNnNuuvVn(class_1799 var0) {
      return var0.method_31574(class_1802.field_8407) && C00OOC00oO(var0, "Драконий скин") && vVvUvVVuuNvV(var0, "Драконий скин взамен");
   }

   public static boolean VUuuVUnun(class_1799 var0) {
      return var0.method_31574(class_1802.field_8814) && C00OOC00oO(var0, "Огненный смерч") && vVvUvVVuuNvV(var0, "Каст: Огненная волна");
   }

   public static boolean vVVuuVVv(class_1799 var0) {
      return var0.method_31574(class_1802.field_8543) && C00OOC00oO(var0, "Снежок заморозка") && vVvUvVVuuNvV(var0, "Каст: Ледяная сфера");
   }

   public static boolean VuunNUUUvu(class_1799 var0) {
      return var0.method_31574(class_1802.field_8614) && C00OOC00oO(var0, "Божья аура") && vVvUvVVuuNvV(var0, "Каст: Божественная аура");
   }

   public static boolean NNUUNUuVNNVn(class_1799 var0) {
      return var0.method_31574(class_1802.field_8675) && C00OOC00oO(var0, "Серебро");
   }

   public static boolean VvVvnNUnvuvV(class_1799 var0) {
      return var0.method_31574(class_1802.field_8335) && uUnuvNvvNU(var0, "Божье касание") && vVvUvVVuuNvV(var0, "Может добыть спавнер");
   }

   public static boolean ccOO0COcoco0(class_1799 var0) {
      return var0.method_31574(class_1802.field_8335) && C00OOC00oO(var0, "Мощный удар") && vVvUvVVuuNvV(var0, "Может разрушить бедрок");
   }

   public static boolean NUVvUUVuVNVv(class_1799 var0) {
      return var0.method_31574(class_1802.field_22024) && C00OOC00oO(var0, "мега-бульдозер") && vVvUvVVuuNvV(var0, "Вскапывает территорию");
   }

   public static boolean nNuVunNUVu(class_1799 var0) {
      return var0.method_31574(class_1802.field_8833) && C00OOC00oO(var0, "Нерушимые элитры") && vVvUvVVuuNvV(var0, "Нерушимый предмет");
   }

   public record NVnVnNnN(String name, List<class_1293> effects) {
   }
}
