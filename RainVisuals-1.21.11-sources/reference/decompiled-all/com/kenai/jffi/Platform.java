package com.kenai.jffi;

import java.util.Locale;

// $VF: Compiled from Platform.java
public abstract class Platform {
   private final Platform.OS os;
   private final int javaVersionMajor;
   private static final Locale LOCALE = Locale.ENGLISH;

   private static boolean startsWithIgnoreCase(String s2, String s1) {
      return s1.startsWith(s2) || s1.toUpperCase(LOCALE).startsWith(s2.toUpperCase(LOCALE)) || s1.toLowerCase(LOCALE).startsWith(s2.toLowerCase(LOCALE));
   }

   private static Platform newWindowsPlatform() {
      return new Platform.Windows();
   }

   private static Platform newDefaultPlatform(Platform.OS os) {
      return new Platform.Default(os);
   }

   public String getName() {
      String osName = System.getProperty("os.name").split(" ")[0];
      return this.getCPU().name().toLowerCase(LOCALE) + "-" + osName;
   }

   public final long addressMask() {
      return this.getCPU().addressMask;
   }

   public final Platform.OS getOS() {
      return this.os;
   }

   private static Platform newDarwinPlatform() {
      return new Platform.Darwin();
   }

   public boolean isSupported() {
      int version = Foreign.getInstance().getVersion();
      if ((version & 16776960) == (Foreign.VERSION_MAJOR << 16 | Foreign.VERSION_MINOR << 8)) {
         return true;
      } else {
         throw new UnsatisfiedLinkError("Incorrect native library version");
      }
   }

   public final int addressSize() {
      return this.getCPU().dataModel;
   }

   public String getLibraryNamePattern() {
      return "lib.*\\.so.*$";
   }

   private Platform(Platform.OS os) {
      this.os = os;
      int version = 8;

      try {
         String versionString = System.getProperty("java.version");
         if (versionString != null) {
            String v = versionString.split("[^0-9.]")[0];
            int dot = v.indexOf(46);
            if (dot != -1) {
               v = v.substring(dot + 1);
            }

            version = Integer.valueOf(v);
         }
      } catch (Exception var6) {
         version = 8;
      }

      this.javaVersionMajor = version;
   }

   public final Platform.CPU getCPU() {
      return Platform.ArchHolder.cpu;
   }

   public static final Platform getPlatform() {
      return Platform.SingletonHolder.PLATFORM;
   }

   private static final Platform.OS determineOS() {
      String osName = System.getProperty("os.name").split(" ")[0];
      if (startsWithIgnoreCase(osName, "mac") || startsWithIgnoreCase(osName, "darwin")) {
         return Platform.OS.DARWIN;
      } else if (startsWithIgnoreCase(osName, "linux")) {
         return Platform.OS.LINUX;
      } else if (startsWithIgnoreCase(osName, "sunos") || startsWithIgnoreCase(osName, "solaris")) {
         return Platform.OS.SOLARIS;
      } else if (startsWithIgnoreCase(osName, "aix")) {
         return Platform.OS.AIX;
      } else if (startsWithIgnoreCase(osName, "os/400") || startsWithIgnoreCase(osName, "os400")) {
         return Platform.OS.IBMI;
      } else if (startsWithIgnoreCase(osName, "openbsd")) {
         return Platform.OS.OPENBSD;
      } else if (startsWithIgnoreCase(osName, "freebsd")) {
         return Platform.OS.FREEBSD;
      } else if (startsWithIgnoreCase(osName, "dragonfly")) {
         return Platform.OS.DRAGONFLY;
      } else {
         return startsWithIgnoreCase(osName, "windows") ? Platform.OS.WINDOWS : Platform.OS.UNKNOWN;
      }
   }

   public final int getJavaMajorVersion() {
      return this.javaVersionMajor;
   }

   private static final Platform determinePlatform(Platform.OS os) {
      switch (os) {
         case DARWIN:
            return newDarwinPlatform();
         case WINDOWS:
            return newWindowsPlatform();
         default:
            return newDefaultPlatform(os);
      }
   }

   public abstract int longSize();

   public String mapLibraryName(String libName) {
      if (libName.matches(this.getLibraryNamePattern())) {
         return libName;
      } else {
         return Platform.OS.IBMI.equals(this.getOS()) ? "lib" + libName + ".so" : System.mapLibraryName(libName);
      }
   }

   // $VF: Compiled from Platform.java
   private static final class ArchHolder {
      public static final Platform.CPU cpu = determineCPU();

      private static Platform.CPU determineCPU() {
         String archString = null;

         try {
            archString = Foreign.getInstance().getArch();
         } catch (UnsatisfiedLinkError var5) {
         }

         if (archString == null || "unknown".equals(archString)) {
            archString = System.getProperty("os.arch", "unknown");
         }

         if (Util.equalsIgnoreCase("x86", archString, Platform.LOCALE)
            || Util.equalsIgnoreCase("i386", archString, Platform.LOCALE)
            || Util.equalsIgnoreCase("i86pc", archString, Platform.LOCALE)) {
            return Platform.CPU.I386;
         }

         if (Util.equalsIgnoreCase("x86_64", archString, Platform.LOCALE) || Util.equalsIgnoreCase("amd64", archString, Platform.LOCALE)) {
            return Platform.CPU.X86_64;
         }

         if (Util.equalsIgnoreCase("ppc", archString, Platform.LOCALE) || Util.equalsIgnoreCase("powerpc", archString, Platform.LOCALE)) {
            return Platform.CPU.PPC;
         }

         if (Util.equalsIgnoreCase("ppc64", archString, Platform.LOCALE) || Util.equalsIgnoreCase("powerpc64", archString, Platform.LOCALE)) {
            return Platform.CPU.PPC64;
         }

         if (Util.equalsIgnoreCase("ppc64le", archString, Platform.LOCALE) || Util.equalsIgnoreCase("powerpc64le", archString, Platform.LOCALE)) {
            return Platform.CPU.PPC64LE;
         }

         if (Util.equalsIgnoreCase("s390", archString, Platform.LOCALE) || Util.equalsIgnoreCase("s390x", archString, Platform.LOCALE)) {
            return Platform.CPU.S390X;
         }

         if (Util.equalsIgnoreCase("arm", archString, Platform.LOCALE) || Util.equalsIgnoreCase("armv7l", archString, Platform.LOCALE)) {
            return Platform.CPU.ARM;
         }

         if (Util.equalsIgnoreCase("aarch64", archString, Platform.LOCALE)) {
            return Platform.CPU.AARCH64;
         }

         if (Util.equalsIgnoreCase("loongarch64", archString, Platform.LOCALE)) {
            return Platform.CPU.LOONGARCH64;
         }

         if (Util.equalsIgnoreCase("mipsel", archString, Platform.LOCALE)) {
            return Platform.CPU.MIPSEL;
         }

         if (!Util.equalsIgnoreCase("mips64", archString, Platform.LOCALE) && !Util.equalsIgnoreCase("mips64el", archString, Platform.LOCALE)) {
            if (Util.equalsIgnoreCase("riscv64", archString, Platform.LOCALE)) {
               return Platform.CPU.RISCV64;
            }

            for (Platform.CPU cpu : Platform.CPU.values()) {
               if (cpu.name().equalsIgnoreCase(archString)) {
                  return cpu;
               }
            }

            return Platform.CPU.UNKNOWN;
         } else {
            return Platform.CPU.MIPS64EL;
         }
      }
   }

   // $VF: Compiled from Platform.java
   public enum CPU {
      PPC64(64),
      RISCV64(64),
      X86_64(64),
      UNKNOWN(64),
      SPARCV9(64),
      AARCH64(64),
      MIPS64EL(64),
      MIPSEL(32),
      LOONGARCH64(64),
      S390X(64),
      I386(32),
      ARM(32),
      PPC64LE(64),
      SPARC(32),
      PPC(32);

      public final long addressMask;
      public final int dataModel;

      @Override
      public String toString() {
         return this.name().toLowerCase(Platform.LOCALE);
      }

      CPU(int dataModel) {
         this.dataModel = dataModel;
         this.addressMask = dataModel == 32 ? 4294967295L : -1L;
      }
   }

   // $VF: Compiled from Platform.java
   private static final class Darwin extends Platform {
      @Override
      public String mapLibraryName(String libName) {
         return libName.matches(this.getLibraryNamePattern()) ? libName : "lib" + libName + ".dylib";
      }

      @Override
      public String getName() {
         return "Darwin";
      }

      @Override
      public final int longSize() {
         return this.getCPU().dataModel;
      }

      public Darwin() {
         super(Platform.OS.DARWIN);
      }

      @Override
      public String getLibraryNamePattern() {
         return "lib.*\\.(dylib|jnilib)$";
      }
   }

   // $VF: Compiled from Platform.java
   private static final class Default extends Platform {
      public Default(Platform.OS os) {
         super(os);
      }

      @Override
      public final int longSize() {
         return this.getCPU().dataModel;
      }
   }

   // $VF: Compiled from Platform.java
   public enum OS {
      UNKNOWN,
      DARWIN,
      ZLINUX,
      LINUX,
      AIX,
      WINDOWS,
      FREEBSD,
      SOLARIS,
      OPENBSD,
      IBMI,
      DRAGONFLY,
      NETBSD;

      @Override
      public String toString() {
         return this.name().toLowerCase(Platform.LOCALE);
      }
   }

   // $VF: Compiled from Platform.java
   private static final class SingletonHolder {
      static final Platform PLATFORM = Platform.determinePlatform(Platform.determineOS());
   }

   // $VF: Compiled from Platform.java
   private static final class Windows extends Platform {
      @Override
      public String getLibraryNamePattern() {
         return ".*\\.dll$";
      }

      @Override
      public final int longSize() {
         return 32;
      }

      public Windows() {
         super(Platform.OS.WINDOWS);
      }
   }
}
