package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.class_11469;
import net.minecraft.class_1291;
import net.minecraft.class_1294;
import net.minecraft.class_2394;
import net.minecraft.class_2960;
import net.minecraft.class_366;
import net.minecraft.class_367;
import net.minecraft.class_368;
import net.minecraft.class_372;
import net.minecraft.class_6880;
import net.minecraft.class_7923;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   UuUVuuUu = "Removals",
   C00OOC00oO = "Гибкое отключение мешающих оверлеев, эффектов, частиц и звуков",
   uUnuvNvvNU = oOOOo0.Misc
)
public class Removals extends Module {
   public static final String NVNnnvnuunNv = "Огонь";
   public static final String uVunuUNVVUUV = "Вода";
   public static final String UNnVVNvvnVvU = "Стена в глазах";
   public static final String uNnUnnuNUnNu = "Тыква";
   public static final String NnUuNNU = "Порошковый снег";
   public static final String nNvNUVU = "Подзорная труба";
   public static final String UnUNuUU = "Портал";
   public static final String uUVuVvuNUvnu = "Тошнота (экран)";
   public static final String UvUvUNuvNU = "Виньетка";
   public static final String c0oOOCcCoC0 = "Тряска от урона";
   public static final String VVnVNnunVvu = "Тьма";
   public static final String unNNVVNnvvV = "Слепота";
   public static final String NuunnvnN = "Тошнота (эффект)";
   public static final String NVUunUNUN = "Туман";
   public static final String UUVNuUNUvUnV = "Иконки эффектов";
   public static final String vuvnUnVnUNnV = "Взрывы";
   public static final String nnuUVNUuvvVU = "Тотем";
   public static final String nVVUuvuNnUN = "Эффекты зелий";
   public static final String nNnVnUNVV = "Криты и удары";
   public static final String nuunNvv = "Чары стола";
   public static final String uUVVvVVNvvn = "Капли и вода";
   public static final String vvUVNVvvNUv = "Редстоун";
   public static final String UuNnnVnuNNV = "Дым и огонь";
   public static final String uUVvnUuNvvN = "Сердечки и деревня";
   public static final String UUuUnNVNuuv = "Порталы (частицы)";
   public static final String NVuNUuVnVUN = "Фейерверки (частицы)";
   public static final String NVuunNnvvvVu = "Дракон и скалк";
   public static final String vNnNuuvVn = "Природный эмбиент";
   public static final String VUuuVUnun = "Ветрозаряд";
   public static final String vVVuuVVv = "Взрывы (звук)";
   public static final String VuunNUUUvu = "Поршни";
   public static final String NNUUNUuVNNVn = "Вода и лава";
   public static final String VvVvnNUnvuvV = "Эмбиент (пещеры, мобы)";
   public static final String ccOO0COcoco0 = "Порталы (звук)";
   public static final String NUVvUUVuVNVv = "Маяк";
   public static final String nNuVunNUVu = "Опыт и уровень";
   public static final String UNvvunVVn = "Подбор предметов";
   public static final String UnvuVuVnNuvu = "Фейерверки (звук)";
   public static final String UvNNVUVNVuvV = "Нот-блоки";
   public static final String NnunUUnU = "Двери и контейнеры";
   public static final String nvuVvuNnNUnv = "Гром и молния";
   public static final String NnVnNVN = "Колокол";
   public static final String vnvvNvUnVv = "Тотемы (звук)";
   public static final String OCOocoOoOO = "Наковальня";
   public static final String o0Ooc0COOoc = "Элитра";
   public static final String nvvnUnUn = "Боссы (рёв)";
   public static final String UnUUVuVunvVu = "Ветрозаряд и Мейс";
   public static final String nnvuvUNuUnN = "Трава";
   public static final String UVnuVUUVnnU = "Растения и цветы";
   public static final String VunnVNvNV = "Листва";
   public static final String NvUVUvVVnUu = "Снег (покров)";
   public static final String unnUnUNVnN = "Стойки брони";
   public static final String NnuUnUNnu = "Рамки";
   public static final String UnnnvvU = "Картины";
   public static final String VUUnuVvVu = "Дроп предметов";
   public static final String VvVuvUvvNNVv = "Опыт-орбы";
   public static final String UnnNNvuvvUU = "Погода (дождь/снег)";
   public static final String VNNnnVUuvv = "Вода (жидкость)";
   public static final String vUvUvUNNuNvn = "Лава (жидкость)";
   public static final String uuVuUuuVVNvN = "Диктор";
   public static final String VvuUUUNNNv = "Тосты и ачивки";
   public static final String uuuVnuvnnNnU = "Анимация тотема";
   public static final VUVnvvnNN nNunUnVN = new VUVnvvnNN(
      "Оверлеи экрана",
      new vvNnnUNnVvn("Огонь", false),
      new vvNnnUNnVvn("Вода", false),
      new vvNnnUNnVvn("Стена в глазах", false),
      new vvNnnUNnVvn("Тыква", false),
      new vvNnnUNnVvn("Порошковый снег", false),
      new vvNnnUNnVvn("Подзорная труба", false),
      new vvNnnUNnVvn("Портал", false),
      new vvNnnUNnVvn("Тошнота (экран)", false),
      new vvNnnUNnVvn("Виньетка", false),
      new vvNnnUNnVvn("Тряска от урона", false)
   );
   public static final VUVnvvnNN VnVuuvVvnNv = new VUVnvvnNN(
      "Эффекты и туман",
      new vvNnnUNnVvn("Тьма", false),
      new vvNnnUNnVvn("Слепота", false),
      new vvNnnUNnVvn("Тошнота (эффект)", false),
      new vvNnnUNnVvn("Туман", false),
      new vvNnnUNnVvn("Иконки эффектов", false)
   );
   public static final VUVnvvnNN vuvvuVuVv = new VUVnvvnNN(
      "Частицы",
      new vvNnnUNnVvn("Взрывы", false),
      new vvNnnUNnVvn("Тотем", false),
      new vvNnnUNnVvn("Эффекты зелий", false),
      new vvNnnUNnVvn("Криты и удары", false),
      new vvNnnUNnVvn("Чары стола", false),
      new vvNnnUNnVvn("Капли и вода", false),
      new vvNnnUNnVvn("Редстоун", false),
      new vvNnnUNnVvn("Дым и огонь", false),
      new vvNnnUNnVvn("Сердечки и деревня", false),
      new vvNnnUNnVvn("Порталы (частицы)", false),
      new vvNnnUNnVvn("Фейерверки (частицы)", false),
      new vvNnnUNnVvn("Дракон и скалк", false),
      new vvNnnUNnVvn("Природный эмбиент", false),
      new vvNnnUNnVvn("Ветрозаряд", false)
   );
   public static final VUVnvvnNN uunNUuunVU = new VUVnvvnNN(
      "Звуки",
      new vvNnnUNnVvn("Взрывы (звук)", false),
      new vvNnnUNnVvn("Поршни", false),
      new vvNnnUNnVvn("Вода и лава", false),
      new vvNnnUNnVvn("Эмбиент (пещеры, мобы)", false),
      new vvNnnUNnVvn("Порталы (звук)", false),
      new vvNnnUNnVvn("Маяк", false),
      new vvNnnUNnVvn("Опыт и уровень", false),
      new vvNnnUNnVvn("Подбор предметов", false),
      new vvNnnUNnVvn("Фейерверки (звук)", false),
      new vvNnnUNnVvn("Нот-блоки", false),
      new vvNnnUNnVvn("Двери и контейнеры", false),
      new vvNnnUNnVvn("Гром и молния", false),
      new vvNnnUNnVvn("Колокол", false),
      new vvNnnUNnVvn("Тотемы (звук)", false),
      new vvNnnUNnVvn("Наковальня", false),
      new vvNnnUNnVvn("Элитра", false),
      new vvNnnUNnVvn("Боссы (рёв)", false),
      new vvNnnUNnVvn("Ветрозаряд и Мейс", false)
   );
   public static final VUVnvvnNN NvnuuuvnVV = new VUVnvvnNN(
      "Мир и сущности",
      new vvNnnUNnVvn("Трава", true),
      new vvNnnUNnVvn("Растения и цветы", true),
      new vvNnnUNnVvn("Листва", false),
      new vvNnnUNnVvn("Снег (покров)", false),
      new vvNnnUNnVvn("Стойки брони", true),
      new vvNnnUNnVvn("Рамки", true),
      new vvNnnUNnVvn("Картины", true),
      new vvNnnUNnVvn("Дроп предметов", false),
      new vvNnnUNnVvn("Опыт-орбы", false),
      new vvNnnUNnVvn("Погода (дождь/снег)", false),
      new vvNnnUNnVvn("Вода (жидкость)", false),
      new vvNnnUNnVvn("Лава (жидкость)", false)
   );
   public static final VUVnvvnNN NnUVNnuvUv = new VUVnvvnNN(
      "Интерфейс", new vvNnnUNnVvn("Диктор", true), new vvNnnUNnVvn("Тосты и ачивки", false), new vvNnnUNnVvn("Анимация тотема", false)
   );
   public static final vvNnnUNnVvn UuuuNNunN = new vvNnnUNnVvn("Не скрывать карты", true).UuUVuuUu(() -> !NvnuuuvnVV.C00OOC00oO("Рамки"));
   public static final NVuVVUNUvV NNVNuUvVn = new NVuVVUNUvV("Свои звуки (через запятую)", "").UuUVuuUu(512);
   public static final NVuVVUNUvV vuNnuUnu = new NVuVVUNUvV("Свои частицы (через запятую)", "").UuUVuuUu(512);
   private static final Removals.NVnVnNnN[] uuvvuNvuUNVV = new Removals.NVnVnNnN[]{
      new Removals.NVnVnNnN("Взрывы (звук)", "explode"),
      new Removals.NVnVnNnN("Поршни", "piston"),
      new Removals.NVnVnNnN("Вода и лава", "water", "lava", "bubble", "splash", "swim"),
      new Removals.NVnVnNnN("Эмбиент (пещеры, мобы)", "ambient"),
      new Removals.NVnVnNnN("Порталы (звук)", "portal"),
      new Removals.NVnVnNnN("Маяк", "beacon"),
      new Removals.NVnVnNnN("Опыт и уровень", "experience_orb", "levelup"),
      new Removals.NVnVnNnN("Подбор предметов", "item.pickup"),
      new Removals.NVnVnNnN("Фейерверки (звук)", "firework"),
      new Removals.NVnVnNnN("Нот-блоки", "note_block"),
      new Removals.NVnVnNnN("Двери и контейнеры", "door", "chest", "barrel", "shulker_box", "ender_chest"),
      new Removals.NVnVnNnN("Гром и молния", "thunder", "lightning"),
      new Removals.NVnVnNnN("Колокол", "bell"),
      new Removals.NVnVnNnN("Тотемы (звук)", "totem"),
      new Removals.NVnVnNnN("Наковальня", "anvil"),
      new Removals.NVnVnNnN("Элитра", "elytra"),
      new Removals.NVnVnNnN("Боссы (рёв)", "wither.spawn", "wither.death", "ender_dragon.death", "ender_dragon.growl"),
      new Removals.NVnVnNnN("Ветрозаряд и Мейс", "wind_charge", "breeze", "mace.smash")
   };
   private static final Removals.NVnVnNnN[] uVvunVUNuUvu = new Removals.NVnVnNnN[]{
      new Removals.NVnVnNnN("Взрывы", "explosion"),
      new Removals.NVnVnNnN("Тотем", "totem_of_undying"),
      new Removals.NVnVnNnN("Эффекты зелий", "effect"),
      new Removals.NVnVnNnN("Криты и удары", "crit", "enchanted_hit", "sweep_attack", "damage_indicator"),
      new Removals.NVnVnNnN("Чары стола", "enchant", "nautilus").UuUVuuUu("enchanted_hit"),
      new Removals.NVnVnNnN("Капли и вода", "water", "splash", "bubble", "fishing", "rain", "lava"),
      new Removals.NVnVnNnN("Редстоун", "dust").UuUVuuUu("falling_dust"),
      new Removals.NVnVnNnN("Дым и огонь", "smoke", "flame", "campfire", "spark"),
      new Removals.NVnVnNnN("Сердечки и деревня", "heart", "angry_villager", "happy_villager"),
      new Removals.NVnVnNnN("Порталы (частицы)", "portal"),
      new Removals.NVnVnNnN("Фейерверки (частицы)", "firework", "flash"),
      new Removals.NVnVnNnN("Дракон и скалк", "sculk", "dragon_breath", "sonic_boom", "shriek", "vibration"),
      new Removals.NVnVnNnN("Природный эмбиент", "white_ash", "spore", "mycelium", "leaves", "snowflake", "cherry"),
      new Removals.NVnVnNnN("Ветрозаряд", "gust")
   };
   private static Removals NVNnnvVnvV;
   private int vUNuuvvnVnv = -1;

   public Removals() {
      NVNnnvVnvV = this;
      this.UuUVuuUu(new nvUuvVvuuN[]{nNunUnVN, VnVuuvVvnNv, vuvvuVuVv, uunNUuunVU, NvnuuuvnVV, UuuuNNunN, NnUVNnuvUv, NNVNuUvVn, vuNnuUnu});
   }

   @Override
   public void UuUVuuUu() {
      super.UuUVuuUu();
      this.vUNuuvvnVnv = this.nUUVuvU();
      this.UnUNVVVNuv();
   }

   @Override
   public void C00OOC00oO() {
      super.C00OOC00oO();
      this.UnUNVVVNuv();
   }

   @vuVvUNNvVNV
   public void UuUVuuUu(nVunNNvuv var1) {
      int var2 = this.nUUVuvU();
      if (var2 != this.vUNuuvvnVnv) {
         this.vUNuuvvnVnv = var2;
         this.UnUNVVVNuv();
      }
   }

   private int nUUVuvU() {
      if (!this.nuUnNvnuUu) {
         return 0;
      } else {
         byte var1 = 1;
         if (NvnuuuvnVV.C00OOC00oO("Трава")) {
            var1 |= 2;
         }

         if (NvnuuuvnVV.C00OOC00oO("Растения и цветы")) {
            var1 |= 4;
         }

         if (NvnuuuvnVV.C00OOC00oO("Листва")) {
            var1 |= 8;
         }

         if (NvnuuuvnVV.C00OOC00oO("Снег (покров)")) {
            var1 |= 16;
         }

         return var1;
      }
   }

   private void UnUNVVVNuv() {
      if (!ru.metaculture.protection.NVnVnNnN.NuunnvnN() && uUnuvNvvNU != null && uUnuvNvvNU.field_1769 != null && uUnuvNvvNU.field_1687 != null) {
         uUnuvNvvNU.field_1769.method_3279();
      }
   }

   public static boolean UuUVuuUu(String var0) {
      return !uVUVnuvnuVuv() ? false : nNunUnVN.C00OOC00oO(var0) || VnVuuvVvnNv.C00OOC00oO(var0) || NvnuuuvnVV.C00OOC00oO(var0) || NnUVNnuvUv.C00OOC00oO(var0);
   }

   public static boolean C00OOC00oO(String var0) {
      return uVUVnuvnuVuv() && NvnuuuvnVV.C00OOC00oO(var0);
   }

   public static boolean UuUVuuUu(class_6880<class_1291> var0) {
      if (!uVUVnuvnuVuv()) {
         return false;
      } else if (var0 == class_1294.field_38092) {
         return VnVuuvVvnNv.C00OOC00oO("Тьма");
      } else if (var0 == class_1294.field_5919) {
         return VnVuuvVvnNv.C00OOC00oO("Слепота");
      } else {
         return var0 == class_1294.field_5916 ? VnVuuvVvnNv.C00OOC00oO("Тошнота (эффект)") : false;
      }
   }

   public static boolean UuUVuuUu(class_2394 var0) {
      return uVUVnuvnuVuv() && vuvvuVuVv.C00OOC00oO("Капли и вода");
   }

   public static boolean UuUVuuUu(class_2960 var0) {
      if (uVUVnuvnuVuv() && var0 != null && UvnvNVnnnnNU()) {
         String var1 = var0.method_12832();

         for (Removals.NVnVnNnN var5 : uuvvuNvuUNVV) {
            if (uunNUuunVU.C00OOC00oO(var5.UuUVuuUu) && var5.UuUVuuUu(var1)) {
               return true;
            }
         }

         return UuUVuuUu(NNVNuUvVn.uUnuvNvvNU(), var0);
      } else {
         return false;
      }
   }

   public static boolean C00OOC00oO(class_2394 var0) {
      if (uVUVnuvnuVuv() && var0 != null && vNVuvnUUnuUn()) {
         class_2960 var1 = class_7923.field_41180.method_10221(var0.method_10295());
         if (var1 == null) {
            return false;
         } else {
            String var2 = var1.method_12832();

            for (Removals.NVnVnNnN var6 : uVvunVUNuUvu) {
               if (vuvvuVuVv.C00OOC00oO(var6.UuUVuuUu) && var6.UuUVuuUu(var2)) {
                  return true;
               }
            }

            return UuUVuuUu(vuNnuUnu.uUnuvNvvNU(), var1);
         }
      } else {
         return false;
      }
   }

   public static boolean UuUVuuUu(class_368 var0) {
      return uVUVnuvnuVuv() && var0 != null && NnUVNnuvUv.C00OOC00oO("Тосты и ачивки")
         ? var0 instanceof class_367 || var0 instanceof class_366 || var0 instanceof class_372 || var0 instanceof class_11469
         : false;
   }

   public static boolean UuuNnUvUuv() {
      return uVUVnuvnuVuv() && NnUVNnuvUv.C00OOC00oO("Диктор");
   }

   private static boolean UuUVuuUu(String var0, class_2960 var1) {
      if (var0 != null && !var0.isBlank()) {
         String var2 = var1.toString();

         for (String var6 : var0.toLowerCase(Locale.ROOT).split(",")) {
            String var7 = var6.trim();
            if (!var7.isEmpty() && var2.contains(var7)) {
               return true;
            }
         }

         return false;
      } else {
         return false;
      }
   }

   private static boolean vNVuvnUUnuUn() {
      for (vvNnnUNnVvn var1 : vuvvuVuVv.vVvUvVVuuNvV) {
         if (var1.uUnuvNvvNU()) {
            return true;
         }
      }

      return !vuNnuUnu.uUnuvNvvNU().isBlank();
   }

   private static boolean UvnvNVnnnnNU() {
      for (vvNnnUNnVvn var1 : uunNUuunVU.vVvUvVVuuNvV) {
         if (var1.uUnuvNvvNU()) {
            return true;
         }
      }

      return !NNVNuUvVn.uUnuvNvvNU().isBlank();
   }

   private static boolean uVUVnuvnuVuv() {
      Removals var0 = NVNnnvnuunNv();
      return var0 != null && var0.nuUnNvnuUu;
   }

   private static Removals NVNnnvnuunNv() {
      if (NVNnnvVnvV != null) {
         return NVNnnvVnvV;
      } else {
         return ru.metaculture.protection.NVnVnNnN.UuUVuuUu != null && ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO != null
            ? ru.metaculture.protection.NVnVnNnN.UuUVuuUu.C00OOC00oO.UuUVuuUu(Removals.class)
            : null;
      }
   }

   static final class NVnVnNnN {
      final String UuUVuuUu;
      final String[] C00OOC00oO;
      String[] uUnuvNvvNU = new String[0];

      NVnVnNnN(String var1, String... var2) {
         this.UuUVuuUu = var1;
         this.C00OOC00oO = var2;
      }

      Removals.NVnVnNnN UuUVuuUu(String... var1) {
         this.uUnuvNvvNU = var1;
         return this;
      }

      boolean UuUVuuUu(String var1) {
         for (String var5 : this.uUnuvNvvNU) {
            if (var1.contains(var5)) {
               return false;
            }
         }

         for (String var9 : this.C00OOC00oO) {
            if (var1.contains(var9)) {
               return true;
            }
         }

         return false;
      }
   }
}
