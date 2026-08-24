package jnr.ffi;

import java.io.File;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Map.Entry;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $VF: Compiled from Platform.java
public abstract class Platform {
   private final int longSize;
   private static final Locale LOCALE = Locale.ENGLISH;
   private final Platform.OS os;
   private final int addressSize;
   protected final Pattern libPattern;
   private final Platform.CPU cpu;

   private static Platform.OS determineOS() {
      String osName = System.getProperty("os.name").split(" ")[0];
      if (startsWithIgnoreCase(osName, "mac") || startsWithIgnoreCase(osName, "darwin")) {
         return Platform.OS.DARWIN;
      } else if (startsWithIgnoreCase(osName, "linux")) {
         return Platform.OS.LINUX;
      } else if (startsWithIgnoreCase(osName, "sunos") || startsWithIgnoreCase(osName, "solaris")) {
         return Platform.OS.SOLARIS;
      } else if (startsWithIgnoreCase(osName, "aix")) {
         return Platform.OS.AIX;
      } else if (startsWithIgnoreCase(osName, "os400") || startsWithIgnoreCase(osName, "os/400")) {
         return Platform.OS.IBMI;
      } else if (startsWithIgnoreCase(osName, "openbsd")) {
         return Platform.OS.OPENBSD;
      } else if (startsWithIgnoreCase(osName, "freebsd")) {
         return Platform.OS.FREEBSD;
      } else if (startsWithIgnoreCase(osName, "dragonfly")) {
         return Platform.OS.DRAGONFLY;
      } else if (startsWithIgnoreCase(osName, "windows")) {
         return Platform.OS.WINDOWS;
      } else {
         return startsWithIgnoreCase(osName, "midnightbsd") ? Platform.OS.MIDNIGHTBSD : Platform.OS.UNKNOWN;
      }
   }

   private Platform(Platform.OS os) {
      this.os = os;
      this.cpu = determineCPU();
      String libpattern;
      switch (os) {
         case DARWIN:
            libpattern = "lib.*\\.(dylib|jnilib)$";
            break;
         case LINUX:
         default:
            libpattern = "lib.*\\.so.*$";
            break;
         case WINDOWS:
            libpattern = ".*\\.dll$";
            break;
         case IBMI:
            libpattern = "lib.*\\.(so|a\\(shr.o\\)|a\\(shr_64.o\\)|a|so.[\\.0-9]+)$";
      }

      this.libPattern = Pattern.compile(libpattern);
      this.addressSize = calculateAddressSize(this.cpu);
      this.longSize = os == Platform.OS.WINDOWS ? 32 : this.addressSize;
   }

   public String mapLibraryName(String libName) {
      return this.libPattern.matcher(libName).find() ? libName : System.mapLibraryName(libName);
   }

   @Deprecated
   public static Platform getPlatform() {
      return Platform.SingletonHolder.PLATFORM;
   }

   public List<String> libraryLocations(String additionalPaths, List<String> libName) {
      ArrayList<String> result = new ArrayList<>();
      ArrayList<String> libDirs = new ArrayList<>();
      if (additionalPaths != null) {
         libDirs.addAll(additionalPaths);
      }

      libDirs.addAll(LibraryLoader.DefaultLibPaths.PATHS);
      String name = new File(this.locateLibrary(libName, libDirs)).getName();

      for (String libDir : libDirs) {
         File libFile = new File(libDir, name);
         if (libFile.exists()) {
            result.add(libFile.getAbsolutePath());
         }
      }

      return result;
   }

   public final boolean isUnix() {
      return this.os != Platform.OS.WINDOWS;
   }

   private static Platform.CPU determineCPU() {
      String archString = System.getProperty("os.arch");
      if (equalsIgnoreCase("x86", archString)
         || equalsIgnoreCase("i386", archString)
         || equalsIgnoreCase("i86pc", archString)
         || equalsIgnoreCase("i686", archString)) {
         return Platform.CPU.I386;
      }

      if (equalsIgnoreCase("x86_64", archString) || equalsIgnoreCase("amd64", archString)) {
         return Platform.CPU.X86_64;
      }

      if (equalsIgnoreCase("ppc", archString) || equalsIgnoreCase("powerpc", archString)) {
         return Platform.OS.IBMI.equals(determineOS()) ? Platform.CPU.PPC64 : Platform.CPU.PPC;
      }

      if (!equalsIgnoreCase("ppc64", archString) && !equalsIgnoreCase("powerpc64", archString)) {
         if (equalsIgnoreCase("ppc64le", archString) || equalsIgnoreCase("powerpc64le", archString)) {
            return Platform.CPU.PPC64LE;
         }

         if (equalsIgnoreCase("s390", archString) || equalsIgnoreCase("s390x", archString)) {
            return Platform.CPU.S390X;
         }

         if (equalsIgnoreCase("aarch64", archString)) {
            return Platform.CPU.AARCH64;
         }

         if (!equalsIgnoreCase("arm", archString) && !equalsIgnoreCase("armv7l", archString)) {
            if (!equalsIgnoreCase("mips64", archString) && !equalsIgnoreCase("mips64el", archString)) {
               if (equalsIgnoreCase("loongarch64", archString)) {
                  return Platform.CPU.LOONGARCH64;
               }

               if (equalsIgnoreCase("riscv64", archString)) {
                  return Platform.CPU.RISCV64;
               }

               for (Platform.CPU cpu : Platform.CPU.values()) {
                  if (equalsIgnoreCase(cpu.name(), archString)) {
                     return cpu;
                  }
               }

               return Platform.CPU.UNKNOWN;
            } else {
               return Platform.CPU.MIPS64EL;
            }
         } else {
            return Platform.CPU.ARM;
         }
      } else {
         return "little".equals(System.getProperty("sun.cpu.endian")) ? Platform.CPU.PPC64LE : Platform.CPU.PPC64;
      }
   }

   /** @deprecated */
   public final int addressSize() {
      return this.addressSize;
   }

   public String getVersion() {
      return System.getProperty("os.version", null);
   }

   public final boolean is32Bit() {
      return this.addressSize == 32;
   }

   public final Platform.OS getOS() {
      return this.os;
   }

   public int getVersionMajor() {
      List<String> versionNumbers = this.getVersionNumbers();
      return versionNumbers.size() < 1 ? -1 : Integer.parseInt(versionNumbers.get(0));
   }

   private static boolean equalsIgnoreCase(String s1, String s2) {
      return s1.equalsIgnoreCase(s2) || s1.toUpperCase(LOCALE).equals(s2.toUpperCase(LOCALE)) || s1.toLowerCase(LOCALE).equals(s2.toLowerCase(LOCALE));
   }

   public String getStandardCLibraryName() {
      switch (this.os) {
         case LINUX:
            return "libc.so.6";
         case WINDOWS:
            return "msvcrt";
         case IBMI:
         case AIX:
            return this.addressSize == 32 ? "libc.a(shr.o)" : "libc.a(shr_64.o)";
         case UNKNOWN:
         default:
            return "c";
         case SOLARIS:
            return "c";
         case DRAGONFLY:
         case FREEBSD:
         case MIDNIGHTBSD:
         case NETBSD:
            return "c";
      }
   }

   public String getName() {
      return this.cpu + "-" + this.os;
   }

   public final boolean isBSD() {
      return this.os == Platform.OS.FREEBSD
         || this.os == Platform.OS.OPENBSD
         || this.os == Platform.OS.NETBSD
         || this.os == Platform.OS.DARWIN
         || this.os == Platform.OS.DRAGONFLY | this.os == Platform.OS.MIDNIGHTBSD;
   }

   /** @deprecated */
   public final int longSize() {
      return this.longSize;
   }

   public final boolean isLittleEndian() {
      return "little".equals(System.getProperty("sun.cpu.endian"));
   }

   public final boolean isBigEndian() {
      return "big".equals(System.getProperty("sun.cpu.endian"));
   }

   public static Platform getNativePlatform() {
      return Platform.SingletonHolder.PLATFORM;
   }

   public final String getOSName() {
      return System.getProperty("os.name", null);
   }

   public final boolean is64Bit() {
      return this.addressSize == 64;
   }

   public int getVersionMinor() {
      List<String> versionNumbers = this.getVersionNumbers();
      return versionNumbers.size() < 2 ? -1 : Integer.parseInt(versionNumbers.get(1));
   }

   private static Platform determinePlatform() {
      String providerName = System.getProperty("jnr.ffi.provider");

      try {
         Class c = Class.forName(providerName + "$Platform");
         return (Platform)c.newInstance();
      } catch (ClassNotFoundException ex) {
         return determinePlatform(determineOS());
      } catch (IllegalAccessException ex) {
         throw new ExceptionInInitializerError(ex);
      } catch (InstantiationException ex) {
         throw new ExceptionInInitializerError(ex);
      }
   }

   public String locateLibrary(String libName, List<String> libraryPaths, Map<LibraryOption, Object> options) {
      return this.locateLibrary(libName, libraryPaths);
   }

   private List<String> getVersionNumbers() {
      String version = this.getVersion();
      if (version == null) {
         return Collections.emptyList();
      }

      Matcher matcher = Pattern.compile("[\\d]+").matcher(version);
      ArrayList<String> result = new ArrayList<>();

      while (matcher.find()) {
         result.add(matcher.group());
      }

      return result;
   }

   public String locateLibrary(String libraryPath, List<String> libName) {
      String mappedName = this.mapLibraryName(libName);

      for (String path : libraryPath) {
         File libFile = new File(path, mappedName);
         if (libFile.exists()) {
            return libFile.getAbsolutePath();
         }
      }

      return mappedName;
   }

   private static int calculateAddressSize(Platform.CPU cpu) {
      Integer dataModel = Integer.getInteger("sun.arch.data.model");
      if (dataModel == null || dataModel != 32 && dataModel != 64) {
         switch (cpu) {
            case I386:
            case PPC:
            case SPARC:
               dataModel = 32;
               break;
            case X86_64:
            case PPC64:
            case PPC64LE:
            case SPARCV9:
            case S390X:
            case AARCH64:
            case MIPS64EL:
            case LOONGARCH64:
            case RISCV64:
               dataModel = 64;
               break;
            default:
               throw new ExceptionInInitializerError("Cannot determine cpu address size");
         }
      }

      return dataModel;
   }

   public final Platform.CPU getCPU() {
      return this.cpu;
   }

   private static Platform determinePlatform(Platform.OS os) {
      switch (os) {
         case DARWIN:
            return new Platform.Darwin();
         case LINUX:
            return new Platform.Linux();
         case WINDOWS:
            return new Platform.Windows();
         case IBMI:
            return new Platform.IbmI();
         case UNKNOWN:
            return new Platform.Unsupported(os);
         default:
            return new Platform.Default(os);
      }
   }

   private static boolean startsWithIgnoreCase(String s2, String s1) {
      return s1.startsWith(s2) || s1.toUpperCase(LOCALE).startsWith(s2.toUpperCase(LOCALE)) || s1.toLowerCase(LOCALE).startsWith(s2.toLowerCase(LOCALE));
   }

   public Platform(Platform.OS longSize, Platform.CPU cpu, int libPattern, int addressSize, String os) {
      this.os = os;
      this.cpu = cpu;
      this.addressSize = addressSize;
      this.longSize = longSize;
      this.libPattern = Pattern.compile(libPattern);
   }

   // $VF: Compiled from Platform.java
   public enum CPU {
      PPC64LE,
      LOONGARCH64,
      X86_64,
      ARM,
      PPC,
      MIPS64EL,
      RISCV64,
      UNKNOWN,
      PPC64,
      AARCH64,
      S390X,
      SPARC,
      SPARCV9,
      MIPS32,
      I386;

      @Override
      public String toString() {
         return this.name().toLowerCase(Platform.LOCALE);
      }
   }

   // $VF: Compiled from Platform.java
   private static final class Darwin extends Platform.Supported {
      @Override
      public String mapLibraryName(String libName) {
         return this.libPattern.matcher(libName).find() ? libName : "lib" + libName + ".dylib";
      }

      public Darwin() {
         super(Platform.OS.DARWIN);
      }
   }

   // $VF: Compiled from Platform.java
   private static final class Default extends Platform.Supported {
      public Default(Platform.OS os) {
         super(os);
      }
   }

   // $VF: Compiled from Platform.java
   static final class IbmI extends Platform.Supported {
      @Override
      public String mapLibraryName(String libName) {
         return this.libPattern.matcher(libName).find() ? libName : "lib" + libName + ".a(shr_64.o)";
      }

      @Override
      public String locateLibrary(String libraryPaths, List<String> libName) {
         final Pattern versionedLibPattern = Pattern.compile("lib" + libName + "\\.so((?:\\.[0-9]+)*)$");
         final Pattern dotAorSoPattern = Pattern.compile("lib" + libName + "\\.(a|so)$");
         List<File> dotAorSoFiles = new LinkedList<>();
         List<String> searchPaths = new LinkedList<>();
         searchPaths.addAll(libraryPaths);
         searchPaths.add("/QOpenSys/pkgs/lib");
         searchPaths.add("/QOpenSys/usr/lib");
         FilenameFilter filter = new FilenameFilter()         // $VF: Compiled from Platform.java
 {
            @Override
            public boolean accept(File dir, String name) {
               return dotAorSoPattern.matcher(name).matches() || versionedLibPattern.matcher(name).matches();
            }
         };
         Map<String, int[]> matches = new LinkedHashMap();

         for (String bestMatch : searchPaths) {
            if (!bestMatch.toLowerCase(Platform.LOCALE).startsWith("/qsys")) {
               File qualifiedAorSo = new File(bestMatch);
               File[] entry = qualifiedAorSo.listFiles(filter);
               if (entry != null) {
                  for (File file : entry) {
                     if (dotAorSoPattern.matcher(file.getName()).matches()) {
                        dotAorSoFiles.add(file);
                     } else {
                        Matcher matcher = versionedLibPattern.matcher(file.getName());
                        String versionString = matcher.matches() ? matcher.group(1) : "";
                        int[] version;
                        if (versionString != null && !versionString.isEmpty()) {
                           String[] parts = versionString.split("\\.");
                           version = new int[parts.length - 1];

                           for (int i = 1; i < parts.length; i++) {
                              version[i - 1] = Integer.parseInt(parts[i]);
                           }
                        } else {
                           version = new int[0];
                        }

                        matches.put(file.getAbsolutePath(), version);
                     }
                  }
               }
            }
         }

         int[] var22 = null;
         String var23 = null;

         for (Entry<String, int[]> var26 : matches.entrySet()) {
            String var27 = (String)var26.getKey();
            int[] var28 = (int[])var26.getValue();
            if (Platform.Linux.compareVersions(var28, var22) > 0) {
               var23 = var27;
               var22 = var28;
            }
         }

         if (null != var23) {
            return var23;
         }

         if (!dotAorSoFiles.isEmpty()) {
            String var25 = dotAorSoFiles.get(0).getAbsolutePath();
            if (var25.endsWith(".a")) {
               var25 = var25 + "(shr_64.o)";
            }

            return var25;
         } else {
            return this.mapLibraryName(libName);
         }
      }

      public IbmI() {
         super(Platform.OS.IBMI);
      }
   }

   // $VF: Compiled from Platform.java
   static final class Linux extends Platform.Supported {
      @Override
      public String locateLibrary(String options, List<String> libName, Map<LibraryOption, Object> libraryPaths) {
         List<Platform.Linux.Match> matches = this.getMatches(libName, libraryPaths);
         if (matches.isEmpty()) {
            return this.mapLibraryName(libName);
         }

         boolean preferCustom = options != null && options.containsKey(LibraryOption.PreferCustomPaths);
         Collections.sort(matches);
         Platform.Linux.Match best = null;
         if (preferCustom) {
            for (Platform.Linux.Match match : matches) {
               if (match.isCustom) {
                  best = match;
                  break;
               }
            }
         }

         return best != null ? best.path : matches.get(0).path;
      }

      private static int compareVersions(int[] version1, int[] version2) {
         if (version1 == null) {
            return version2 == null ? 0 : -1;
         }

         if (version2 == null) {
            return 1;
         }

         int commonLength = Math.min(version1.length, version2.length);

         for (int i = 0; i < commonLength; i++) {
            if (version1[i] < version2[i]) {
               return -1;
            }

            if (version1[i] > version2[i]) {
               return 1;
            }
         }

         return Integer.compare(version1.length, version2.length);
      }

      @Override
      public String mapLibraryName(String libName) {
         return !"c".equals(libName) && !"libc.so".equals(libName) ? super.mapLibraryName(libName) : "libc.so.6";
      }

      @Override
      public String locateLibrary(String libraryPaths, List<String> libName) {
         return this.locateLibrary(libName, libraryPaths, null);
      }

      private List<Platform.Linux.Match> getMatches(String libName, List<String> libraryPaths) {
         List<String> customPaths = new ArrayList<>();
         if (LibraryLoader.DefaultLibPaths.PATHS.size() > 0 && libraryPaths.size() >= LibraryLoader.DefaultLibPaths.PATHS.size()) {
            String exclude = LibraryLoader.DefaultLibPaths.PATHS.get(0);
            int versionedLibPattern = libraryPaths.lastIndexOf(exclude);

            for (int filter = 0; filter < versionedLibPattern; filter++) {
               customPaths.add(libraryPaths.get(filter));
            }
         } else {
            customPaths.addAll(libraryPaths);
         }

         Pattern var21;
         if (this.getCPU() == Platform.CPU.X86_64) {
            var21 = Pattern.compile(".*(lib[a-z]*32|i[0-9]86).*");
         } else {
            var21 = Pattern.compile(".*(lib[a-z]*64|amd64|x86_64).*");
         }

         final Pattern var22 = Pattern.compile("lib" + libName + "\\.so((?:\\.[0-9]+)*)$");
         FilenameFilter var23 = new FilenameFilter()         // $VF: Compiled from Platform.java
 {
            @Override
            public boolean accept(File name, String dir) {
               return var22.matcher(name).matches();
            }
         };
         List<Platform.Linux.Match> matches = new ArrayList();

         for (String path : libraryPaths) {
            if (!var21.matcher(path).matches()) {
               File libraryPath = new File(path);
               File[] files = libraryPath.listFiles(var23);
               if (files != null) {
                  for (File file : files) {
                     Matcher matcher = var22.matcher(file.getName());
                     String versionString = matcher.matches() ? matcher.group(1) : "";
                     int[] version;
                     if (versionString != null && !versionString.isEmpty()) {
                        String[] match = versionString.split("\\.");
                        version = new int[match.length - 1];

                        for (int i = 1; i < match.length; i++) {
                           version[i - 1] = Integer.parseInt(match[i]);
                        }
                     } else {
                        version = new int[0];
                     }

                     Platform.Linux.Match var24 = new Platform.Linux.Match();
                     var24.path = file.getAbsolutePath();
                     var24.version = version;
                     var24.isCustom = customPaths.contains(path);
                     matches.add(var24);
                  }
               }
            }
         }

         return matches;
      }

      public Linux() {
         super(Platform.OS.LINUX);
      }

      // $VF: Compiled from Platform.java
      private static class Match implements Comparable<Platform.Linux.Match> {
         boolean isCustom;
         int[] version;
         String path;

         private Match() {
         }

         public int compareTo(Platform.Linux.Match o) {
            return Platform.Linux.compareVersions(o.version, this.version);
         }
      }
   }

   // $VF: Compiled from Platform.java
   public enum OS {
      FREEBSD,
      MIDNIGHTBSD,
      NETBSD,
      SOLARIS,
      AIX,
      WINDOWS,
      OPENBSD,
      DRAGONFLY,
      DARWIN,
      LINUX,
      IBMI,
      ZLINUX,
      UNKNOWN;

      @Override
      public String toString() {
         return this.name().toLowerCase(Platform.LOCALE);
      }
   }

   // $VF: Compiled from Platform.java
   private static final class SingletonHolder {
      static final Platform PLATFORM = Platform.determinePlatform();
   }

   // $VF: Compiled from Platform.java
   private static class Supported extends Platform {
      public Supported(Platform.OS os) {
         super(os);
      }
   }

   // $VF: Compiled from Platform.java
   private static class Unsupported extends Platform {
      public Unsupported(Platform.OS os) {
         super(os);
      }
   }

   // $VF: Compiled from Platform.java
   private static class Windows extends Platform.Supported {
      private static final String WINDOWS_VISTA = "windows vista";
      private static final String WINDOWS_8 = "windows 8";
      private static final String WINDOWS_SERVER = "server";
      private static final String WINDOWS_10 = "windows 10";
      private static final String WINDOWS_11 = "windows 11";
      private static final String WINDOWS_7 = "windows 7";

      public boolean isVista() {
         return this.osName().contains("windows vista");
      }

      public boolean isServer() {
         return this.osName().contains("server");
      }

      public boolean is11() {
         return this.osName().contains("windows 11");
      }

      public Windows() {
         super(Platform.OS.WINDOWS);
      }

      private String osName() {
         return System.getProperty("os.name").toLowerCase();
      }

      public boolean is8() {
         return this.osName().contains("windows 8");
      }

      public boolean is10() {
         return this.osName().contains("windows 10");
      }

      public boolean is7() {
         return this.osName().contains("windows 7");
      }
   }
}
