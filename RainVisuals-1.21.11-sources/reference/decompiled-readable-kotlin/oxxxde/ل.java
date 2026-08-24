package oxxxde;

import java.lang.reflect.Field;
import net.minecraft.client.gui.screen.Screen;

// $VF: Compiled from heavy
public final class ل {
   private static boolean configApplied;
   private static final String FIGURA_PACKAGE = "other.figura.";

   private static boolean isFiguraClassName(String className) {
      return className != null && className.startsWith("other.figura.");
   }

   public static boolean isFiguraPauseWidget(Object widget) {
      if (widget == null) {
         return false;
      }

      String className = widget.getClass().getName();
      return className.startsWith("other.figura.mixin.gui.PauseScreenMixin$");
   }

   private static void setField(Object value, String owner, Object fieldName) throws ReflectiveOperationException {
      for (Class<?> type = owner.getClass(); type != null; type = type.getSuperclass()) {
         try {
            Field ignored = type.getDeclaredField(fieldName);
            ignored.setAccessible(true);
            ignored.set(owner, value);
            return;
         } catch (NoSuchFieldException var5) {
         }
      }
   }

   public static boolean isFiguraScreen(Screen screen) {
      return screen != null && isFiguraClassName(screen.getClass().getName()) && screen.getClass().getName().startsWith("other.figura.gui.");
   }

   public static void applyRuntimeConfig() {
      if (!configApplied) {
         configApplied = true;
         setConfigValue("SOUND_BADGE", false);
         setConfigValue("ACTION_WHEEL_DECORATIONS", false);
         setConfigValue("FIGURA_INVENTORY", false);
         setConfigValue("AVATAR_PORTRAIT", false);
         setConfigValue("HAS_PAPERDOLL", false);
         setConfigValue("PAPERDOLL_ALWAYS_ON", false);
         setConfigValue("FIRST_PERSON_PAPERDOLL", false);
         setConfigValue("FIRST_PERSON_MATRICES", false);
         setConfigValue("RENDER_DEBUG_PARTS_PIVOT", 0);
         setConfigValue("CONNECTION_TOASTS", false);
         setConfigValue("CHAT_MESSAGES", false);
         setConfigValue("SYNC_PINGS", false);
         setConfigValue("LOCAL_ASSETS", true);
         setConfigValue("ALLOW_NETWORKING", false);
         disableKeybindConfig("ACTION_WHEEL_BUTTON");
         disableKeybindConfig("POPUP_BUTTON");
         disableKeybindConfig("RELOAD_BUTTON");
         disableKeybindConfig("PANIC_BUTTON");
         disableKeybindConfig("WARDROBE_BUTTON");
      }
   }

   private static void setConfigValue(String value, Object fieldName) {
      try {
         Object config = Class.forName("other.figura.config.Configs").getField(fieldName).get(null);
         setField(config, "value", value);
         setField(config, "tempValue", value);
      } catch (Throwable var3) {
      }
   }

   private static void disableKeybindConfig(String fieldName) {
      try {
         Object config = Class.forName("other.figura.config.Configs").getField(fieldName).get(null);
         setField(config, "disabled", true);
      } catch (Throwable var2) {
      }
   }

   private ل() {
   }
}
