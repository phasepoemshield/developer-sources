package ru.metaculture.protection;

import java.util.Locale;
import net.minecraft.client.toast.AdvancementToast;
import net.minecraft.client.toast.NowPlayingToast;
import net.minecraft.client.toast.RecipeToast;
import net.minecraft.client.toast.Toast;
import net.minecraft.client.toast.TutorialToast;
import net.minecraft.entity.effect.StatusEffect;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.particle.ParticleEffect;
import net.minecraft.registry.Registries;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.util.Identifier;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Removals",
   O000000000 = "Гибкое отключение мешающих оверлеев, эффектов, частиц и звуков",
   O0000000000 = Category.Misc
)
public class Removals extends Module {
   public static final String O000000000O = "Огонь";
   public static final String O000000000O0 = "Вода";
   public static final String O000000000O00 = "Стена в глазах";
   public static final String O000000000O000 = "Тыква";
   public static final String O000000000O00O = "Порошковый снег";
   public static final String O000000000O0O = "Подзорная труба";
   public static final String O000000000O0O0 = "Портал";
   public static final String O000000000O0OO = "Тошнота (экран)";
   public static final String O000000000OO = "Виньетка";
   public static final String O000000000OO0 = "Тряска от урона";
   public static final String O000000000OO00 = "Тьма";
   public static final String O000000000OO0O = "Слепота";
   public static final String O000000000OOO = "Тошнота (эффект)";
   public static final String O000000000OOO0 = "Туман";
   public static final String O000000000OOOO = "Иконки эффектов";
   public static final String O00000000O = "Взрывы";
   public static final String O00000000O0 = "Тотем";
   public static final String O00000000O00 = "Эффекты зелий";
   public static final String O00000000O000 = "Криты и удары";
   public static final String O00000000O0000 = "Чары стола";
   public static final String O00000000O000O = "Капли и вода";
   public static final String O00000000O00O = "Редстоун";
   public static final String O00000000O00O0 = "Дым и огонь";
   public static final String O00000000O00OO = "Сердечки и деревня";
   public static final String O00000000O0O = "Порталы (частицы)";
   public static final String O00000000O0O0 = "Фейерверки (частицы)";
   public static final String O00000000O0O00 = "Дракон и скалк";
   public static final String O00000000O0O0O = "Природный эмбиент";
   public static final String O00000000O0OO = "Ветрозаряд";
   public static final String O00000000O0OO0 = "Взрывы (звук)";
   public static final String O00000000O0OOO = "Поршни";
   public static final String O00000000OO = "Вода и лава";
   public static final String O00000000OO0 = "Эмбиент (пещеры, мобы)";
   public static final String O00000000OO00 = "Порталы (звук)";
   public static final String O00000000OO000 = "Маяк";
   public static final String O00000000OO00O = "Опыт и уровень";
   public static final String O00000000OO0O = "Подбор предметов";
   public static final String O00000000OO0O0 = "Фейерверки (звук)";
   public static final String O00000000OO0OO = "Нот-блоки";
   public static final String O00000000OOO = "Двери и контейнеры";
   public static final String O00000000OOO0 = "Гром и молния";
   public static final String O00000000OOO00 = "Колокол";
   public static final String O00000000OOO0O = "Тотемы (звук)";
   public static final String O00000000OOOO = "Наковальня";
   public static final String O00000000OOOO0 = "Элитра";
   public static final String O00000000OOOOO = "Боссы (рёв)";
   public static final String O0000000O = "Ветрозаряд и Мейс";
   public static final String O0000000O0 = "Трава";
   public static final String O0000000O00 = "Растения и цветы";
   public static final String O0000000O000 = "Листва";
   public static final String O0000000O0000 = "Снег (покров)";
   public static final String O0000000O00000 = "Стойки брони";
   public static final String O0000000O0000O = "Рамки";
   public static final String O0000000O000O = "Картины";
   public static final String O0000000O000O0 = "Дроп предметов";
   public static final String O0000000O000OO = "Опыт-орбы";
   public static final String O0000000O00O = "Погода (дождь/снег)";
   public static final String O0000000O00O0 = "Диктор";
   public static final String O0000000O00O00 = "Тосты и ачивки";
   public static final String O0000000O00O0O = "Анимация тотема";
   public static final GroupSetting O0000000O00OO = new GroupSetting(
      "Оверлеи экрана",
      new BooleanSetting("Огонь", false),
      new BooleanSetting("Вода", false),
      new BooleanSetting("Стена в глазах", false),
      new BooleanSetting("Тыква", false),
      new BooleanSetting("Порошковый снег", false),
      new BooleanSetting("Подзорная труба", false),
      new BooleanSetting("Портал", false),
      new BooleanSetting("Тошнота (экран)", false),
      new BooleanSetting("Виньетка", false),
      new BooleanSetting("Тряска от урона", false)
   );
   public static final GroupSetting O0000000O00OO0 = new GroupSetting(
      "Эффекты и туман",
      new BooleanSetting("Тьма", false),
      new BooleanSetting("Слепота", false),
      new BooleanSetting("Тошнота (эффект)", false),
      new BooleanSetting("Туман", false),
      new BooleanSetting("Иконки эффектов", false)
   );
   public static final GroupSetting O0000000O00OOO = new GroupSetting(
      "Частицы",
      new BooleanSetting("Взрывы", false),
      new BooleanSetting("Тотем", false),
      new BooleanSetting("Эффекты зелий", false),
      new BooleanSetting("Криты и удары", false),
      new BooleanSetting("Чары стола", false),
      new BooleanSetting("Капли и вода", false),
      new BooleanSetting("Редстоун", false),
      new BooleanSetting("Дым и огонь", false),
      new BooleanSetting("Сердечки и деревня", false),
      new BooleanSetting("Порталы (частицы)", false),
      new BooleanSetting("Фейерверки (частицы)", false),
      new BooleanSetting("Дракон и скалк", false),
      new BooleanSetting("Природный эмбиент", false),
      new BooleanSetting("Ветрозаряд", false)
   );
   public static final GroupSetting O0000000O0O = new GroupSetting(
      "Звуки",
      new BooleanSetting("Взрывы (звук)", false),
      new BooleanSetting("Поршни", false),
      new BooleanSetting("Вода и лава", false),
      new BooleanSetting("Эмбиент (пещеры, мобы)", false),
      new BooleanSetting("Порталы (звук)", false),
      new BooleanSetting("Маяк", false),
      new BooleanSetting("Опыт и уровень", false),
      new BooleanSetting("Подбор предметов", false),
      new BooleanSetting("Фейерверки (звук)", false),
      new BooleanSetting("Нот-блоки", false),
      new BooleanSetting("Двери и контейнеры", false),
      new BooleanSetting("Гром и молния", false),
      new BooleanSetting("Колокол", false),
      new BooleanSetting("Тотемы (звук)", false),
      new BooleanSetting("Наковальня", false),
      new BooleanSetting("Элитра", false),
      new BooleanSetting("Боссы (рёв)", false),
      new BooleanSetting("Ветрозаряд и Мейс", false)
   );
   public static final GroupSetting O0000000O0O0 = new GroupSetting(
      "Мир и сущности",
      new BooleanSetting("Трава", true),
      new BooleanSetting("Растения и цветы", true),
      new BooleanSetting("Листва", false),
      new BooleanSetting("Снег (покров)", false),
      new BooleanSetting("Стойки брони", true),
      new BooleanSetting("Рамки", true),
      new BooleanSetting("Картины", true),
      new BooleanSetting("Дроп предметов", false),
      new BooleanSetting("Опыт-орбы", false),
      new BooleanSetting("Погода (дождь/снег)", false)
   );
   public static final GroupSetting O0000000O0O00 = new GroupSetting(
      "Интерфейс", new BooleanSetting("Диктор", true), new BooleanSetting("Тосты и ачивки", false), new BooleanSetting("Анимация тотема", false)
   );
   public static final BooleanSetting O0000000O0O000 = new BooleanSetting("Не скрывать карты", true).O00000000(() -> !O0000000O0O0.O000000000("Рамки"));
   public static final TextSetting O0000000O0O00O = new TextSetting("Свои звуки (через запятую)", "").O00000000(512);
   public static final TextSetting O0000000O0O0O = new TextSetting("Свои частицы (через запятую)", "").O00000000(512);
   private static final Removals.W95[] O0000000O0O0O0 = new Removals.W95[]{
      new Removals.W95("Взрывы (звук)", "explode"),
      new Removals.W95("Поршни", "piston"),
      new Removals.W95("Вода и лава", "water", "lava", "bubble", "splash", "swim"),
      new Removals.W95("Эмбиент (пещеры, мобы)", "ambient"),
      new Removals.W95("Порталы (звук)", "portal"),
      new Removals.W95("Маяк", "beacon"),
      new Removals.W95("Опыт и уровень", "experience_orb", "levelup"),
      new Removals.W95("Подбор предметов", "item.pickup"),
      new Removals.W95("Фейерверки (звук)", "firework"),
      new Removals.W95("Нот-блоки", "note_block"),
      new Removals.W95("Двери и контейнеры", "door", "chest", "barrel", "shulker_box", "ender_chest"),
      new Removals.W95("Гром и молния", "thunder", "lightning"),
      new Removals.W95("Колокол", "bell"),
      new Removals.W95("Тотемы (звук)", "totem"),
      new Removals.W95("Наковальня", "anvil"),
      new Removals.W95("Элитра", "elytra"),
      new Removals.W95("Боссы (рёв)", "wither.spawn", "wither.death", "ender_dragon.death", "ender_dragon.growl"),
      new Removals.W95("Ветрозаряд и Мейс", "wind_charge", "breeze", "mace.smash")
   };
   private static final Removals.W95[] O0000000O0O0OO = new Removals.W95[]{
      new Removals.W95("Взрывы", "explosion"),
      new Removals.W95("Тотем", "totem_of_undying"),
      new Removals.W95("Эффекты зелий", "effect"),
      new Removals.W95("Криты и удары", "crit", "enchanted_hit", "sweep_attack", "damage_indicator"),
      new Removals.W95("Чары стола", "enchant", "nautilus").O00000000(new String[]{"enchanted_hit"}),
      new Removals.W95("Капли и вода", "water", "splash", "bubble", "fishing", "rain", "lava"),
      new Removals.W95("Редстоун", "dust").O00000000(new String[]{"falling_dust"}),
      new Removals.W95("Дым и огонь", "smoke", "flame", "campfire", "spark"),
      new Removals.W95("Сердечки и деревня", "heart", "angry_villager", "happy_villager"),
      new Removals.W95("Порталы (частицы)", "portal"),
      new Removals.W95("Фейерверки (частицы)", "firework", "flash"),
      new Removals.W95("Дракон и скалк", "sculk", "dragon_breath", "sonic_boom", "shriek", "vibration"),
      new Removals.W95("Природный эмбиент", "white_ash", "spore", "mycelium", "leaves", "snowflake", "cherry"),
      new Removals.W95("Ветрозаряд", "gust")
   };
   private static Removals O0000000O0OO;
   private int O0000000O0OO0 = -1;

   public Removals() {
      O0000000O0OO = this;
      this.O00000000(
         new Setting[]{O0000000O00OO, O0000000O00OO0, O0000000O00OOO, O0000000O0O, O0000000O0O0, O0000000O0O000, O0000000O0O00, O0000000O0O00O, O0000000O0O0O}
      );
   }

   @Override
   public void O00000000() {
      super.O00000000();
      this.O0000000O0OO0 = this.O0000000000O00();
      this.O0000000000O0O();
   }

   @Override
   public void O000000000() {
      super.O000000000();
      this.O0000000000O0O();
   }

   @EventHandler
   public void O00000000(O0000000O00O00 o0000000O00O00) {
      int var2 = this.O0000000000O00();
      if (var2 != this.O0000000O0OO0) {
         this.O0000000O0OO0 = var2;
         this.O0000000000O0O();
      }
   }

   private int O0000000000O00() {
      if (!this.O0000000000000) {
         return 0;
      } else {
         byte var1 = 1;
         if (O0000000O0O0.O000000000("Трава")) {
            var1 |= 2;
         }

         if (O0000000O0O0.O000000000("Растения и цветы")) {
            var1 |= 4;
         }

         if (O0000000O0O0.O000000000("Листва")) {
            var1 |= 8;
         }

         if (O0000000O0O0.O000000000("Снег (покров)")) {
            var1 |= 16;
         }

         return var1;
      }
   }

   private void O0000000000O0O() {
      if (!WildClient.O000000000OO00() && O0000000000 != null && O0000000000.worldRenderer != null && O0000000000.world != null) {
         O0000000000.worldRenderer.reload();
      }
   }

   public static boolean O00000000(String string) {
      return !O0000000000OOO()
         ? false
         : O0000000O00OO.O000000000(string) || O0000000O00OO0.O000000000(string) || O0000000O0O0.O000000000(string) || O0000000O0O00.O000000000(string);
   }

   public static boolean O000000000(String string) {
      return O0000000000OOO() && O0000000O0O0.O000000000(string);
   }

   public static boolean O00000000(RegistryEntry<StatusEffect> registryEntry) {
      if (!O0000000000OOO()) {
         return false;
      } else if (registryEntry == StatusEffects.DARKNESS) {
         return O0000000O00OO0.O000000000("Тьма");
      } else if (registryEntry == StatusEffects.BLINDNESS) {
         return O0000000O00OO0.O000000000("Слепота");
      } else {
         return registryEntry == StatusEffects.NAUSEA ? O0000000O00OO0.O000000000("Тошнота (эффект)") : false;
      }
   }

   public static boolean O00000000(ParticleEffect particleEffect) {
      return O0000000000OOO() && O0000000O00OOO.O000000000("Капли и вода");
   }

   public static boolean O00000000(Identifier identifier) {
      if (O0000000000OOO() && identifier != null && O0000000000OO0()) {
         String var1 = identifier.getPath();

         for (Removals.W95 var5 : O0000000O0O0O0) {
            if (O0000000O0O.O000000000(var5.O00000000) && var5.O00000000(var1)) {
               return true;
            }
         }

         return O00000000(O0000000O0O00O.O0000000000(), identifier);
      } else {
         return false;
      }
   }

   public static boolean O000000000(ParticleEffect particleEffect) {
      if (O0000000000OOO() && particleEffect != null && O0000000000OO()) {
         Identifier var1 = Registries.PARTICLE_TYPE.getId(particleEffect.getType());
         if (var1 == null) {
            return false;
         } else {
            String var2 = var1.getPath();

            for (Removals.W95 var6 : O0000000O0O0OO) {
               if (O0000000O00OOO.O000000000(var6.O00000000) && var6.O00000000(var2)) {
                  return true;
               }
            }

            return O00000000(O0000000O0O0O.O0000000000(), var1);
         }
      } else {
         return false;
      }
   }

   public static boolean O00000000(Toast toast) {
      return O0000000000OOO() && toast != null && O0000000O0O00.O000000000("Тосты и ачивки")
         ? toast instanceof AdvancementToast || toast instanceof RecipeToast || toast instanceof TutorialToast || toast instanceof NowPlayingToast
         : false;
   }

   public static boolean O0000000000O0() {
      return O0000000000OOO() && O0000000O0O00.O000000000("Диктор");
   }

   private static boolean O00000000(String string, Identifier identifier) {
      if (string != null && !string.isBlank()) {
         String var2 = identifier.toString();

         for (String var6 : string.toLowerCase(Locale.ROOT).split(",")) {
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

   private static boolean O0000000000OO() {
      for (BooleanSetting var1 : O0000000O00OOO.O00000000000) {
         if (var1.O0000000000()) {
            return true;
         }
      }

      return !O0000000O0O0O.O0000000000().isBlank();
   }

   private static boolean O0000000000OO0() {
      for (BooleanSetting var1 : O0000000O0O.O00000000000) {
         if (var1.O0000000000()) {
            return true;
         }
      }

      return !O0000000O0O00O.O0000000000().isBlank();
   }

   private static boolean O0000000000OOO() {
      Removals var0 = O000000000O();
      return var0 != null && var0.O0000000000000;
   }

   private static Removals O000000000O() {
      if (O0000000O0OO != null) {
         return O0000000O0OO;
      } else {
         return WildClient.O00000000 != null && WildClient.O00000000.O000000000 != null ? WildClient.O00000000.O000000000.O00000000(Removals.class) : null;
      }
   }

   static final class W95 {
      final String O00000000;
      final String[] O000000000;
      String[] O0000000000 = new String[0];

      W95(String string, String... strings) {
         this.O00000000 = string;
         this.O000000000 = strings;
      }

      Removals.W95 O00000000(String... strings) {
         this.O0000000000 = strings;
         return this;
      }

      boolean O00000000(String string) {
         for (String var5 : this.O0000000000) {
            if (string.contains(var5)) {
               return false;
            }
         }

         for (String var9 : this.O000000000) {
            if (string.contains(var9)) {
               return true;
            }
         }

         return false;
      }
   }
}
