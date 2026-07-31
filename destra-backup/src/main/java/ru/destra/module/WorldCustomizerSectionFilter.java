package ru.destra.module;

import java.util.function.Supplier;
import ru.destra.setting.ModeSetting;
import ru.destra.setting.Setting;

/**
 * ClickGUI section filter for WorldCustomizer: wraps each setting's visibility so only the
 * selected category (Туман / Небо / Погода / Время) is shown.
 */
public final class WorldCustomizerSectionFilter {
   public static final String ALL = "Все";
   public static final String FOG = "Туман";
   public static final String SKY = "Небо";
   public static final String WEATHER = "Погода";
   public static final String TIME = "Время";

   private WorldCustomizerSectionFilter() {
   }

   @SuppressWarnings("unchecked")
   public static void install(WorldCustomizerModule module, ModeSetting section) {
      if (module == null || section == null || module.settings == null) {
         return;
      }
      for (Object raw : module.settings) {
         if (!(raw instanceof Setting setting) || setting == section) {
            continue;
         }
         Supplier previous = setting.visibilityCondition;
         if (previous == null) {
            previous = () -> Boolean.TRUE;
         }
         final Supplier prev = previous;
         final String label = setting.name == null ? "" : setting.name;
         setting.visibilityCondition = () -> {
            Object visible = prev.get();
            if (!(visible instanceof Boolean) || !((Boolean) visible)) {
               return Boolean.FALSE;
            }
            return matches(section, label) ? Boolean.TRUE : Boolean.FALSE;
         };
      }
   }

   static boolean matches(ModeSetting section, String label) {
      if (section == null || section.is(ALL)) {
         return true;
      }
      String bucket = bucketFor(label);
      if (bucket == null) {
         // Unknown / shared (e.g. color) — show in Fog and Sky sections, or always when not filtered tightly
         return section.is(FOG) || section.is(SKY);
      }
      return section.is(bucket);
   }

   static String bucketFor(String label) {
      if (label == null || label.isEmpty()) {
         return null;
      }
      // Cyrillic labels from WorldCustomizerModule
      if (label.contains("туман") || label.contains("Туман") || label.contains("дальност") || label.contains("Плотность")
         || label.contains("Режим тумана")) {
         return FOG;
      }
      if (label.contains("неб") || label.contains("Неб") || label.contains("Шейдер") || label.contains("шейдер")
         || label.contains("Аврора") || label.contains("Стиль шейдера")) {
         return SKY;
      }
      if (label.contains("погод") || label.contains("Погод")) {
         return WEATHER;
      }
      if (label.contains("время") || label.contains("Время") || label.contains("Кастомное")) {
         return TIME;
      }
      // "Цвет" / "Цвет темы" shared by fog+sky
      if (label.contains("Цвет") || label.contains("цвет")) {
         return null;
      }
      return null;
   }
}
