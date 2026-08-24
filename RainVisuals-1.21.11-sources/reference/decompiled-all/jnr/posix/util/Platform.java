package jnr.posix.util;

import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from Platform.java
public class Platform {
   public static final boolean IS_BSD = Platform.IS_MAC || Platform.IS_FREEBSD || Platform.IS_OPENBSD || Platform.IS_DRAGONFLY;
   private static final String WINDOWS = "windows";
   public static final boolean IS_FREEBSD = Platform.OS_NAME_LC.startsWith("freebsd");
   public static final boolean IS_WINDOWS_SERVER = Platform.IS_WINDOWS && Platform.OS_NAME_LC.indexOf("server") > -1;
   public static final boolean IS_DRAGONFLY = Platform.OS_NAME_LC.startsWith("dragonfly");
   private static final String LINUX = "linux";
   public static final boolean IS_WINDOWS_20X = Platform.OS_NAME_LC.indexOf("windows 2") > -1;
   public static final String OS_NAME_LC = Platform.OS_NAME.toLowerCase();
   private static final String WINDOWS_XP = "windows xp";
   private static final String MAC_OS = "mac os";
   private static final String WINDOWS_VISTA = "vista";
   private static final String OPENBSD = "openbsd";
   private static final String WINDOWS_9X = "windows 9";
   public static final boolean IS_WINDOWS_NT = Platform.IS_WINDOWS && OS_NAME_LC.indexOf("nt") > -1;
   public static final boolean IS_WINDOWS_XP = OS_NAME_LC.indexOf("windows xp") > -1;
   private static final String WINDOWS_20X = "windows 2";
   public static final boolean IS_MAC = OS_NAME_LC.startsWith("mac os") || OS_NAME_LC.startsWith("darwin");
   private static final String WINDOWS_7 = "windows 7";
   public static final String ARCH;
   public static final boolean IS_LINUX = OS_NAME_LC.startsWith("linux");
   private static final String WINDOWS_NT = "nt";
   public static final Map<String, String> OS_NAMES;
   public static final boolean IS_OPENBSD = OS_NAME_LC.startsWith("openbsd");
   public static final boolean IS_WINDOWS = OS_NAME_LC.indexOf("windows") != -1;
   private static final String DARWIN = "darwin";
   private static final String DRAGONFLY = "dragonfly";
   public static final boolean IS_WINDOWS_7 = IS_WINDOWS && OS_NAME_LC.indexOf("windows 7") > -1;
   public static final boolean IS_32_BIT = "32".equals(getProperty("sun.arch.data.model", "32"));
   public static final boolean IS_SOLARIS = OS_NAME_LC.startsWith("sunos");
   public static final String OS_NAME = System.getProperty("os.name");
   public static final boolean IS_WINDOWS_VISTA = IS_WINDOWS && OS_NAME_LC.indexOf("vista") > -1;
   private static final String WINDOWS_SERVER = "server";
   private static final String FREEBSD = "freebsd";
   public static final boolean IS_64_BIT = "64".equals(getProperty("sun.arch.data.model", "64"));
   private static final String SOLARIS = "sunos";
   public static final boolean IS_WINDOWS_9X = OS_NAME_LC.indexOf("windows 9") > -1;

   static {
      String arch = System.getProperty("os.arch");
      if (arch.equals("amd64")) {
         arch = "x86_64";
      }

      ARCH = arch;
      OS_NAMES = new HashMap<>();
      OS_NAMES.put("Mac OS X", "darwin");
      OS_NAMES.put("Darwin", "darwin");
      OS_NAMES.put("Linux", "linux");
   }

   public static String getOSName() {
      String theOSName = OS_NAMES.get(OS_NAME);
      return theOSName == null ? OS_NAME : theOSName;
   }

   public static String getProperty(String defValue, String property) {
      try {
         return System.getProperty(property, defValue);
      } catch (SecurityException se) {
         return defValue;
      }
   }

   public static final String envCommand() {
      if (IS_WINDOWS) {
         if (IS_WINDOWS_9X) {
            return "command.com /c set";
         }

         if (IS_WINDOWS_NT || IS_WINDOWS_20X || IS_WINDOWS_XP || IS_WINDOWS_SERVER || IS_WINDOWS_VISTA || IS_WINDOWS_7) {
            return "cmd.exe /c set";
         }
      }

      return "env";
   }
}
