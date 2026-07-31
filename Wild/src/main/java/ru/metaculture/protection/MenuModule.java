package ru.metaculture.protection;

import net.minecraft.client.MinecraftClient;
import org.wild.module.api.Module;
import org.wild.module.api.ModuleRegister;

@ModuleRegister(
   O00000000 = "Menu",
   O000000000 = "Настройки клиента",
   O0000000000 = Category.Visuals
)
public class MenuModule extends Module {
   public static MenuModule O000000000O;
   private static final float O0000000O0000O = 0.86F;
   private static final float O0000000O000O = 0.86F;
   public static final String O000000000O0 = "Графика";
   public static final String O000000000O00 = "Эффекты";
   public static final String O000000000O000 = "Темы";
   public static final String O000000000O00O = "Производительность";
   public static final ModeSetting O000000000O0O = new ModeSetting("Категория", "Графика", "Графика", "Эффекты", "Темы", "Производительность");
   public static final NumberSetting O000000000O0O0 = new NumberSetting("Качество графики", 2.0F, 0.0F, 3.0F, 1.0F, false)
      .O00000000(O000000O000O0.O000000000())
      .O00000000(() -> !O000000000O0O.O000000000("Графика"));
   public static final BooleanSetting O000000000O0OO = new BooleanSetting("Применять пресет автоматически", true)
      .O00000000(() -> !O000000000O0O.O000000000("Графика"));
   public static final ModeSetting O000000000OO = new ModeSetting("Стиль анимаций", "Smooth", "Smooth", "Snappy", "Bouncy", "Cinematic", "Linear")
      .O00000000(() -> !O000000000O0O.O000000000("Графика"));
   public static final NumberSetting O000000000OO0 = new NumberSetting("Масштаб GUI", 0.86F, 0.55F, 1.7F, 0.01F, false).O00000000(() -> true);
   public static final NumberSetting O000000000OO00 = new NumberSetting("Масштаб панели темы", 0.86F, 0.55F, 1.7F, 0.01F, false).O00000000(() -> true);
   public static final BooleanSetting O000000000OO0O = new BooleanSetting("Волны клика", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O000000000OOO = new BooleanSetting("Волны темы", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O000000000OOO0 = new BooleanSetting("Ударная волна темы", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O000000000OOOO = new BooleanSetting("Размытие скролла", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O = new BooleanSetting("Переходы карт", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O0 = new BooleanSetting("Переходы экрана", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O00 = new BooleanSetting("Дрейф цвета темы", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O000 = new BooleanSetting("Внутреннее свечение", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O0000 = new BooleanSetting("Зерно плёнки", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O000O = new BooleanSetting("Пульсация хотбара", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O00O = new BooleanSetting("Анимации статусов", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O00O0 = new BooleanSetting("Вспышка урона", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O00OO = new BooleanSetting("Пульсация регенерации", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O0O = new BooleanSetting("Тряска при низком здоровье", true)
      .O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O0O0 = new BooleanSetting("След курсора в меню", true).O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final BooleanSetting O00000000O0O00 = new BooleanSetting("Параллакс главного меню", true)
      .O00000000(() -> !O000000000O0O.O000000000("Эффекты"));
   public static final ColorSetting O00000000O0O0O = new ColorSetting("Акцент темы", 66.0F, 0.64F, 1.0F).O000000000(() -> !O000000000O0O.O000000000("Темы"));
   public static final ColorSetting O00000000O0OO = new ColorSetting("Цвет панели", 68.0F, 0.28F, 0.08F).O000000000(() -> !O000000000O0O.O000000000("Темы"));
   public static final ColorSetting O00000000O0OO0 = new ColorSetting("Цвет поверхности", 68.0F, 0.24F, 0.12F)
      .O000000000(() -> !O000000000O0O.O000000000("Темы"));
   public static final ColorSetting O00000000O0OOO = new ColorSetting("Цвет обводки", 68.0F, 0.32F, 0.38F).O000000000(() -> !O000000000O0O.O000000000("Темы"));
   public static final ColorSetting O00000000OO = new ColorSetting("Цвет текста", 0.0F, 0.0F, 1.0F).O000000000(() -> !O000000000O0O.O000000000("Темы"));
   public static final ColorSetting O00000000OO0 = new ColorSetting("Цвет приглушённого текста", 68.0F, 0.14F, 0.62F)
      .O000000000(() -> !O000000000O0O.O000000000("Темы"));
   public static final String O00000000OO00 = "Стандарт";
   public static final String O00000000OO000 = "Голограмма";
   public static final ModeSetting O00000000OO00O = new ModeSetting("Фон ClickGUI", "Голограмма", "Стандарт", "Голограмма")
      .O00000000(() -> !O000000000O0O.O000000000("Темы"));
   public static final O000000O00 O00000000OO0O = new O000000O00("Foundry Shader", O00000OOOO00O.BACKGROUND)
      .O0000000000(() -> !O000000000O0O.O000000000("Темы"));
   public static final NumberSetting O00000000OO0O0 = new NumberSetting("Максимальный блюр", 32.0F, 8.0F, 64.0F, 1.0F, false)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final NumberSetting O00000000OO0OO = new NumberSetting("Иридисцентный отлив", 0.6F, 0.0F, 1.0F, 0.01F, true)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final NumberSetting O00000000OOO = new NumberSetting("Притяжение к курсору", 0.18F, 0.0F, 0.4F, 0.01F, false)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final NumberSetting O00000000OOO0 = new NumberSetting("Радиус прозрачности у курсора", 0.28F, 0.05F, 0.6F, 0.01F, false)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final NumberSetting O00000000OOO00 = new NumberSetting("Размер островков", 1.8F, 0.8F, 3.5F, 0.05F, false)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final NumberSetting O00000000OOO0O = new NumberSetting("Скорость течения", 0.55F, 0.0F, 1.5F, 0.01F, false)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final NumberSetting O00000000OOOO = new NumberSetting("Контраст островков", 0.55F, 0.0F, 1.0F, 0.01F, true)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final NumberSetting O00000000OOOO0 = new NumberSetting("Виньетка", 0.35F, 0.0F, 1.0F, 0.01F, true)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final NumberSetting O00000000OOOOO = new NumberSetting("Яркость", 0.55F, 0.0F, 1.0F, 0.01F, true)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final NumberSetting O0000000O = new NumberSetting("Насыщенность", 0.45F, 0.0F, 1.0F, 0.01F, true)
      .O00000000(() -> !O000000000O0O.O000000000("Темы") || !O00000000OO00O.O000000000("Голограмма"));
   public static final BooleanSetting O0000000O0 = new BooleanSetting("Упрощённые тени HUD", false)
      .O00000000(() -> !O000000000O0O.O000000000("Производительность"));
   public static final BooleanSetting O0000000O00 = new BooleanSetting("Отключить блюр", false)
      .O00000000(() -> !O000000000O0O.O000000000("Производительность"));
   public static final BooleanSetting O0000000O000 = new BooleanSetting("Быстрые анимации", false)
      .O00000000(() -> !O000000000O0O.O000000000("Производительность"));
   public static final BooleanSetting O0000000O0000 = new BooleanSetting("Пропускать частицы клиента", false)
      .O00000000(() -> !O000000000O0O.O000000000("Производительность"));
   private static int O0000000O000O0 = -1;
   public static final BooleanSetting O0000000O00000 = new BooleanSetting("Auto GUI scale initialized", false).O00000000(() -> true);

   public MenuModule() {
      O000000000O = this;
      this.O00000000000O0 = "Menu";
      this.O000000000000 = 344;
      this.O00000000(
         new Setting[]{
            O000000000O0O,
            O000000000O0O0,
            O000000000O0OO,
            O000000000OO,
            O000000000OO0,
            O000000000OO00,
            O0000000O00000,
            O000000000OO0O,
            O000000000OOO,
            O000000000OOO0,
            O000000000OOOO,
            O00000000O,
            O00000000O0,
            O00000000O00,
            O00000000O000,
            O00000000O0000,
            O00000000O000O,
            O00000000O00O,
            O00000000O00O0,
            O00000000O00OO,
            O00000000O0O,
            O00000000O0O0,
            O00000000O0O00,
            O00000000O0O0O,
            O00000000O0OO,
            O00000000O0OO0,
            O00000000O0OOO,
            O00000000OO,
            O00000000OO0,
            O00000000OO00O,
            O00000000OO0O,
            O00000000OO0O0,
            O00000000OO0OO,
            O00000000OOO,
            O00000000OOO0,
            O00000000OOO00,
            O00000000OOO0O,
            O00000000OOOO,
            O00000000OOOO0,
            O00000000OOOOO,
            O0000000O,
            O0000000O0,
            O0000000O00,
            O0000000O000,
            O0000000O0000
         }
      );
   }

   public static boolean O00000000(BooleanSetting o0000000OOO0O0) {
      O0000000000O0();

      try {
         return o0000000OOO0O0 == null || o0000000OOO0O0.O0000000000();
      } catch (Throwable var2) {
         return true;
      }
   }

   public static void O0000000000O0() {
      try {
         if (!O000000000O0OO.O0000000000()) {
            O0000000O000O0 = (int)O000000000O0O0.O00000000000;
            return;
         }

         int var0 = Math.round(O000000000O0O0.O00000000000);
         if (var0 != O0000000O000O0) {
            O0000000O000O0 = var0;
            O000000O000O0.O00000000(var0).O0000000000();
         }
      } catch (Throwable var1) {
      }
   }

   public static O000000O000O0 O0000000000O00() {
      return O000000O000O0.O00000000(Math.round(O000000000O0O0.O00000000000));
   }

   public static void O00000000(int i) {
      int var1 = Math.max(0, Math.min(O000000O000O0.values().length - 1, i));
      O000000000O0O0.O00000000000 = var1;
      if (O000000000O0OO.O0000000000()) {
         O0000000O000O0 = var1;
         O000000O000O0.O00000000(var1).O0000000000();
      }
   }

   public static void O0000000000O0O() {
      int var0 = O000000O000O0.ULTRA.ordinal();
      O000000000O0O0.O00000000000 = var0;
      O0000000O000O0 = var0;
   }

   public static MenuModule O0000000000OO() {
      return O000000000O;
   }

   public static void O0000000000OO0() {
      Theme.CUSTOM
         .O00000000(
            O00000000O0O0O.O0000000000(),
            O00000000O0OO.O0000000000(),
            O00000000O0OO0.O0000000000(),
            O00000000O0OOO.O0000000000(),
            O00000000OO.O0000000000(),
            O00000000OO0.O0000000000()
         );
   }

   public static void O00000000(MinecraftClient minecraftClient, O0000O0000 o0000O0000) {
      if (O0000000O00000 != null && !O0000000O00000.O0000000000()) {
         if (minecraftClient != null && minecraftClient.getWindow() != null && o0000O0000 != null) {
            int var2 = minecraftClient.getWindow().getFramebufferWidth();
            int var3 = minecraftClient.getWindow().getFramebufferHeight();
            if (var2 > 0 && var3 > 0) {
               if (!(Math.abs(O000000000OO0.O0000000000() - 0.86F) > 0.005F) && !(Math.abs(O000000000OO00.O0000000000() - 0.86F) > 0.005F)) {
                  float var4 = O00000000(minecraftClient);
                  float var5 = Math.min(var2, var3);
                  float var6 = O00000000(var5 * 0.025F, 18.0F, 42.0F);
                  float var7 = Math.min((var2 - var6 * 2.0F) / o0000O0000.O0000000000(), (var3 - var6 * 2.0F) / o0000O0000.O00000000000());
                  float var8 = var2 / Math.max(1.0F, (float)var3);
                  float var9 = var8 > 2.05F ? 0.58F : (var8 < 1.45F ? 0.74F : 0.68F);
                  float var10 = var8 > 2.05F ? 0.8F : 0.76F;
                  float var11 = Math.min(var2 * var9 / o0000O0000.O0000000000(), var3 * var10 / o0000O0000.O00000000000());
                  var11 = O00000000(Math.min(var11, var7), o0000O0000.O000000000O00(), o0000O0000.O000000000O000());
                  float var12 = O00000000(var11 / Math.max(0.001F, var4), O000000000OO0.O000000000000, O000000000OO0.O0000000000000);
                  O000000000OO0.O00000000(var12);
                  O000000000OO00.O00000000(O00000000(var12 * 0.94F, O000000000OO00.O000000000000, O000000000OO00.O0000000000000));
                  O0000000O00000.O000000000(true);
                  O0000000000OOO();
               } else {
                  O0000000O00000.O000000000(true);
                  O0000000000OOO();
               }
            }
         }
      }
   }

   private static float O00000000(MinecraftClient minecraftClient) {
      float var1;
      try {
         var1 = Math.max(1.0F, (float)minecraftClient.getWindow().getScaleFactor());
      } catch (Throwable var4) {
         int var3 = Math.max(1, minecraftClient.getWindow().getScaledWidth());
         var1 = Math.max(1.0F, (float)minecraftClient.getWindow().getFramebufferWidth() / var3);
      }

      return 0.68F + Math.min(var1, 2.0F) * 0.28F;
   }

   private static float O00000000(float f, float g, float h) {
      return Math.max(g, Math.min(h, f));
   }

   private static void O0000000000OOO() {
      if (WildClient.O00000000 != null && WildClient.O00000000.O0000000000O00 != null) {
         WildClient.O00000000.O0000000000O00.O0000000000();
      }
   }
}
