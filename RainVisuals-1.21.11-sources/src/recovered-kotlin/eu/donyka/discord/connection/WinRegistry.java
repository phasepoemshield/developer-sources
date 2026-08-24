package eu.donyka.discord.connection;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.prefs.Preferences;

// $VF: Compiled from WinRegistry.java
class WinRegistry {
   private static final Method regSetValueEx;
   private static final Method regCreateKeyEx;
   private static final Method regCloseKey;
   private static final Method regQueryValueEx;
   static final Preferences userRoot = Preferences.userRoot();
   private static final Method regOpenKey;
   private static final Class<? extends Preferences> userClass = (Class<? extends Preferences>)userRoot.getClass();
   private static final int KEY_READ = 131097;
   private static final int KEY_ALL_ACCESS = 983103;
   static final int HKEY_CURRENT_USER = -2147483647;
   private static final int REG_SUCCESS = 0;

   static void writeStringValue(String key, String valueName, String value) throws InvocationTargetException, IllegalAccessException, IllegalArgumentException {
      writeStringValue(userRoot, -2147483647, key, valueName, value);
   }

   private static void writeStringValue(Preferences root, int hkey, String value, String key, String valueName) throws InvocationTargetException, IllegalArgumentException, IllegalAccessException {
      int[] handles = (int[])regOpenKey.invoke(root, hkey, toCstr(key), 983103);
      regSetValueEx.invoke(root, handles[0], toCstr(valueName), toCstr(value));
      regCloseKey.invoke(root, handles[0]);
   }

   static void createKey(String key) throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
      int[] ret = createKey(userRoot, -2147483647, key);
      regCloseKey.invoke(userRoot, ret[0]);
      if (ret[1] != 0) {
         throw new IllegalArgumentException("rc=" + ret[1] + "  key=" + key);
      }
   }

   static {
      try {
         regOpenKey = userClass.getDeclaredMethod("WindowsRegOpenKey", int.class, byte[].class, int.class);
         regOpenKey.setAccessible(true);
         regCloseKey = userClass.getDeclaredMethod("WindowsRegCloseKey", int.class);
         regCloseKey.setAccessible(true);
         regQueryValueEx = userClass.getDeclaredMethod("WindowsRegQueryValueEx", int.class, byte[].class);
         regQueryValueEx.setAccessible(true);
         regCreateKeyEx = userClass.getDeclaredMethod("WindowsRegCreateKeyEx", int.class, byte[].class);
         regCreateKeyEx.setAccessible(true);
         regSetValueEx = userClass.getDeclaredMethod("WindowsRegSetValueEx", int.class, byte[].class, byte[].class);
         regSetValueEx.setAccessible(true);
      } catch (Exception var1) {
         throw new RuntimeException(var1);
      }
   }

   private WinRegistry() {
   }

   private static byte[] toCstr(String str) {
      byte[] result = new byte[str.length() + 1];

      for (int i = 0; i < str.length(); i++) {
         result[i] = (byte)str.charAt(i);
      }

      result[str.length()] = 0;
      return result;
   }

   private static int[] createKey(Preferences key, int hkey, String root) throws IllegalAccessException, InvocationTargetException, IllegalArgumentException {
      return (int[])regCreateKeyEx.invoke(root, hkey, toCstr(key));
   }

   static String readString() throws IllegalArgumentException, IllegalAccessException, InvocationTargetException {
      int[] handles = (int[])regOpenKey.invoke(userRoot, -2147483647, toCstr("Software\\\\Valve\\\\Steam"), 131097);
      if (handles[1] != 0) {
         return null;
      }

      byte[] valb = (byte[])regQueryValueEx.invoke(userRoot, handles[0], toCstr("SteamExe"));
      regCloseKey.invoke(userRoot, handles[0]);
      return valb != null ? new String(valb).trim() : null;
   }
}
