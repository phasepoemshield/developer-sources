package l;

import java.lang.reflect.Constructor;
import java.lang.reflect.Modifier;
import net.minecraft.client.gui.screen.Screen;

public final class Helper395 {
   private static final String ACCOUNT_SCREEN_CLASS = "ru.vidtu.ias.screen.AccountScreen";
   private static boolean initialized;
   private static boolean available;
   private static Constructor<?> accountScreenConstructor;

   private Helper395() {
   }

   public static synchronized void method4053() {
      if (!initialized) {
         initialized = true;

         try {
            Class var0 = Class.forName("ru.vidtu.ias.screen.AccountScreen");
            if (!Screen.class.isAssignableFrom(var0)) {
               throw new IllegalStateException("IAS AccountScreen is not a Minecraft screen");
            }

            accountScreenConstructor = method4057(var0);
            available = true;
         } catch (IllegalStateException | ReflectiveOperationException var1) {
            available = false;
            accountScreenConstructor = null;
            System.err.println("[releon-ias] IAS AccountScreen is not available, shortcut will be disabled: " + var1.getMessage());
         }
      }
   }

   public static synchronized void method4054() {
      initialized = false;
      available = false;
      accountScreenConstructor = null;
   }

   public static synchronized boolean method4055() {
      method4053();
      return available && accountScreenConstructor != null;
   }

   public static synchronized Screen method4056(Screen var0) {
      method4053();
      if (available && accountScreenConstructor != null) {
         try {
            return accountScreenConstructor.getParameterCount() == 0
               ? (Screen)accountScreenConstructor.newInstance()
               : (Screen)accountScreenConstructor.newInstance(var0);
         } catch (ReflectiveOperationException var2) {
            available = false;
            accountScreenConstructor = null;
            System.err.println("[releon-ias] Failed to open IAS AccountScreen, staying on the current screen.");
            return var0;
         }
      } else {
         return var0;
      }
   }

   private static Constructor<?> method4057(Class<?> var0) throws NoSuchMethodException {
      for (Constructor var4 : var0.getConstructors()) {
         if (Modifier.isPublic(var4.getModifiers())) {
            Class[] var5 = var4.getParameterTypes();
            if (var5.length == 0) {
               return var4;
            }

            if (var5.length == 1 && var5[0].isAssignableFrom(Screen.class)) {
               return var4;
            }
         }
      }

      throw new NoSuchMethodException("No supported IAS AccountScreen constructor found");
   }
}
