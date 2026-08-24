package jnr.constants;

import java.nio.ByteOrder;
import java.util.HashMap;
import java.util.Map;

// $VF: Compiled from PlatformConstants.java
public final class PlatformConstants {
   public static final int LITTLE_ENDIAN = 1234;
   public static final boolean FAKE = Boolean.valueOf(System.getProperty("jnr.constants.fake", "true"));
   public static final String NAME = String.format("%s-%s", PlatformConstants.ARCH, PlatformConstants.OS);
   public static final Map<String, String> OS_NAMES = new HashMap<String, String>()   // $VF: Compiled from PlatformConstants.java
 {
      public static final long serialVersionUID = 1L;

      {
         this.put("Mac OS X", "darwin");
         this.put("SunOS", "solaris");
      }
   };
   public static final int BIG_ENDIAN = 4321;
   public static final int BYTE_ORDER = ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN) ? 4321 : 1234;
   public static final String ARCH = initArchitecture();
   public static final Map<String, String> ARCH_NAMES = new HashMap<String, String>()   // $VF: Compiled from PlatformConstants.java
 {
      public static final long serialVersionUID = 1L;

      {
         this.put("x86", "i386");
      }
   };
   private static final PlatformConstants INSTANCE = new PlatformConstants();
   public static final String OS = initOperatingSystem();

   public String getArchPackageName() {
      return String.format("%s.platform.%s.%s", getConstantsPackageName(), OS, ARCH);
   }

   public String[] getPackagePrefixes() {
      return FAKE
         ? new String[]{this.getArchPackageName(), this.getOSPackageName(), this.getFakePackageName()}
         : new String[]{this.getArchPackageName(), this.getOSPackageName()};
   }

   public String getFakePackageName() {
      return String.format("%s.platform.fake", getConstantsPackageName());
   }

   private PlatformConstants() {
   }

   private static String getProperty(String property, String defValue) {
      try {
         return System.getProperty(property, defValue);
      } catch (SecurityException se) {
         return defValue;
      }
   }

   private static String initOperatingSystem() {
      String osname = getProperty("os.name", "unknown").toLowerCase();

      for (String s : OS_NAMES.keySet()) {
         if (s.equalsIgnoreCase(osname)) {
            return OS_NAMES.get(s);
         }
      }

      return osname.startsWith("windows") ? "windows" : osname;
   }

   public String getOSPackageName() {
      return String.format("%s.platform.%s", getConstantsPackageName(), OS);
   }

   private static final String initArchitecture() {
      String arch = getProperty("os.arch", "unknown").toLowerCase();

      for (String s : ARCH_NAMES.keySet()) {
         if (s.equalsIgnoreCase(arch)) {
            return ARCH_NAMES.get(s);
         }
      }

      return arch;
   }

   public static PlatformConstants getPlatform() {
      return INSTANCE;
   }

   private static String getConstantsPackageName() {
      return PlatformConstants.PackageNameResolver.PACKAGE_NAME;
   }

   // $VF: Compiled from PlatformConstants.java
   private static final class PackageNameResolver {
      public static final String PACKAGE_NAME = new PlatformConstants.PackageNameResolver().inferPackageName();

      private String inferPackageName() {
         try {
            Class cls = this.getClass();
            Package pkg = cls.getPackage();
            return pkg != null ? pkg.getName() : cls.getName().substring(0, cls.getName().lastIndexOf(46));
         } catch (NullPointerException var3) {
            return "jnr.constants";
         }
      }
   }
}
