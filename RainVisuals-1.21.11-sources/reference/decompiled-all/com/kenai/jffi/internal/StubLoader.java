package com.kenai.jffi.internal;

import com.kenai.jffi.Platform;
import com.kenai.jffi.Util;
import java.io.CharArrayWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.security.DigestInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Locale;
import java.util.Properties;

// $VF: Compiled from StubLoader.java
public class StubLoader {
   public static final String TMPDIR_EXEC_ERROR = "Unable to execute or load jffi binary stub from `" + StubLoader.TMPDIR + "`.";
   private static volatile boolean loaded = false;
   private static final String TMPDIR = System.getProperty("java.io.tmpdir");
   private static final String JFFI_EXTRACT_DIR = "jffi.extract.dir";
   private static final String jffiExtractName;
   private static final File jffiExtractDir;
   private static final String bootPropertyFilename = "boot.properties";
   private static final String TMPDIR_ENV = Platform.getPlatform().getOS() == Platform.OS.WINDOWS ? "TEMP" : "TMPDIR";
   private static final String bootLibraryPropertyName = "jffi.boot.library.path";
   public static final String TMPDIR_WRITE_ERROR = "Unable to write jffi binary stub to `" + TMPDIR + "`.";
   private static volatile Throwable failureCause = null;
   private static final String TMPDIR_RECOMMENDATION = "Set `"
      + TMPDIR_ENV
      + "` or Java property `java.io.tmpdir` to a read/write path that is not mounted \"noexec\".";
   public static final int VERSION_MAJOR = getVersionField("MAJOR");
   private static volatile StubLoader.OS os = null;
   private static final String versionClassName = "com.kenai.jffi.Version";
   public static final int VERSION_MINOR = getVersionField("MINOR");
   private static final String JFFI_EXTRACT_NAME = "jffi.extract.name";
   private static volatile StubLoader.CPU cpu = null;
   private static final Locale LOCALE = Locale.ENGLISH;
   private static final String stubLibraryName = String.format("jffi-%d.%d", VERSION_MAJOR, VERSION_MINOR);

   private static String getBootPath() {
      String bootPath = System.getProperty("jffi.boot.library.path");
      if (bootPath != null) {
         return bootPath;
      }

      InputStream is = getResourceAsStream("boot.properties");
      if (is != null) {
         Properties p = new Properties();

         IOException ex;
         try {
            p.load(is);
            ex = p.getProperty("jffi.boot.library.path");
         } catch (IOException var14) {
            return null;
         } finally {
            try {
               is.close();
            } catch (IOException var13) {
            }
         }

         return ex;
      } else {
         return null;
      }
   }

   static {
      String t = System.getProperty("jffi.extract.dir");
      if (t != null) {
         jffiExtractDir = new File(t);
      } else {
         jffiExtractDir = null;
      }

      String extractName = System.getProperty("jffi.extract.name");
      if (extractName != null) {
         jffiExtractName = extractName;
      } else {
         jffiExtractName = null;
      }

      try {
         load();
         loaded = true;
      } catch (Throwable var2) {
         failureCause = var2;
      }
   }

   private static InputStream getResourceAsStream(String resourceName) {
      ClassLoader[] cls = new ClassLoader[]{
         ClassLoader.getSystemClassLoader(), StubLoader.class.getClassLoader(), Thread.currentThread().getContextClassLoader()
      };

      for (ClassLoader cl : cls) {
         InputStream is;
         if (cl != null && (is = cl.getResourceAsStream(resourceName)) != null) {
            return is;
         }
      }

      return null;
   }

   private static int getVersionField(String name) {
      try {
         Class c = Class.forName("com.kenai.jffi.Version");
         return (Integer)c.getField(name).get(c);
      } catch (Throwable t) {
         throw new RuntimeException(t);
      }
   }

   private static StubLoader.OS determineOS() {
      String osName = System.getProperty("os.name").split(" ")[0];
      if (Util.startsWithIgnoreCase(osName, "mac", LOCALE) || Util.startsWithIgnoreCase(osName, "darwin", LOCALE)) {
         return StubLoader.OS.DARWIN;
      } else if (Util.startsWithIgnoreCase(osName, "linux", LOCALE)) {
         return StubLoader.OS.LINUX;
      } else if (Util.startsWithIgnoreCase(osName, "sunos", LOCALE) || Util.startsWithIgnoreCase(osName, "solaris", LOCALE)) {
         return StubLoader.OS.SOLARIS;
      } else if (Util.startsWithIgnoreCase(osName, "aix", LOCALE)) {
         return StubLoader.OS.AIX;
      } else if (Util.startsWithIgnoreCase(osName, "os400", LOCALE) || Util.startsWithIgnoreCase(osName, "os/400", LOCALE)) {
         return StubLoader.OS.IBMI;
      } else if (Util.startsWithIgnoreCase(osName, "openbsd", LOCALE)) {
         return StubLoader.OS.OPENBSD;
      } else if (Util.startsWithIgnoreCase(osName, "freebsd", LOCALE)) {
         return StubLoader.OS.FREEBSD;
      } else if (Util.startsWithIgnoreCase(osName, "dragonfly", LOCALE)) {
         return StubLoader.OS.DRAGONFLY;
      } else if (Util.startsWithIgnoreCase(osName, "windows", LOCALE)) {
         return StubLoader.OS.WINDOWS;
      } else {
         throw new RuntimeException("cannot determine operating system");
      }
   }

   private static String getStubLibraryName() {
      return stubLibraryName;
   }

   private static InputStream getStubLibraryStream() {
      String stubPath = getStubLibraryPath();
      String[] paths = new String[]{stubPath, "/" + stubPath};

      for (String path : paths) {
         InputStream is = getResourceAsStream(path);
         if (is == null && getOS() == StubLoader.OS.DARWIN) {
            is = getResourceAsStream(getAlternateLibraryPath(path));
         }

         if (is != null) {
            return is;
         }
      }

      throw new UnsatisfiedLinkError("could not locate stub library in jar file.  Tried " + Arrays.deepToString(paths));
   }

   private static void unpackLibrary(File sourceIS, InputStream dstFile) throws IOException {
      FileOutputStream os = new FileOutputStream(dstFile);

      try {
         ReadableByteChannel srcChannel = Channels.newChannel(sourceIS);
         long pos = 0L;

         while (sourceIS.available() > 0) {
            pos += os.getChannel().transferFrom(srcChannel, pos, Math.max(4096, sourceIS.available()));
         }
      } catch (Throwable var7) {
         try {
            os.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
         }

         throw var7;
      }

      os.close();
   }

   public static final Throwable getFailureCause() {
      return failureCause;
   }

   public static StubLoader.CPU getCPU() {
      return cpu != null ? cpu : (cpu = determineCPU());
   }

   public static StubLoader.OS getOS() {
      return os != null ? os : (os = determineOS());
   }

   private static IOException tempReadonlyError(IOException ioe) {
      return new IOException(TMPDIR_WRITE_ERROR + " " + TMPDIR_RECOMMENDATION, ioe);
   }

   private static StubLoader.CPU determineCPU() {
      String archString = System.getProperty("os.arch", "unknown");
      if (Util.equalsIgnoreCase("x86", archString, LOCALE)
         || Util.equalsIgnoreCase("i386", archString, LOCALE)
         || Util.equalsIgnoreCase("i86pc", archString, LOCALE)) {
         return StubLoader.CPU.I386;
      }

      if (Util.equalsIgnoreCase("x86_64", archString, LOCALE) || Util.equalsIgnoreCase("amd64", archString, LOCALE)) {
         return StubLoader.CPU.X86_64;
      }

      if (Util.equalsIgnoreCase("ppc", archString, LOCALE) || Util.equalsIgnoreCase("powerpc", archString, LOCALE)) {
         return StubLoader.CPU.PPC;
      }

      if (!Util.equalsIgnoreCase("ppc64", archString, LOCALE) && !Util.equalsIgnoreCase("powerpc64", archString, LOCALE)) {
         if (Util.equalsIgnoreCase("ppc64le", archString, LOCALE) || Util.equalsIgnoreCase("powerpc64le", archString, LOCALE)) {
            return StubLoader.CPU.PPC64LE;
         }

         if (Util.equalsIgnoreCase("s390", archString, LOCALE) || Util.equalsIgnoreCase("s390x", archString, LOCALE)) {
            return StubLoader.CPU.S390X;
         }

         if (Util.equalsIgnoreCase("arm", archString, LOCALE) || Util.equalsIgnoreCase("armv7l", archString, LOCALE)) {
            return StubLoader.CPU.ARM;
         }

         if (Util.equalsIgnoreCase("aarch64", archString, LOCALE)) {
            return StubLoader.CPU.AARCH64;
         }

         if (Util.equalsIgnoreCase("loongarch64", archString, LOCALE)) {
            return StubLoader.CPU.LOONGARCH64;
         }

         if (Util.equalsIgnoreCase("mipsel", archString, LOCALE)) {
            return StubLoader.CPU.MIPSEL;
         }

         if (!Util.equalsIgnoreCase("mips64", archString, LOCALE) && !Util.equalsIgnoreCase("mips64el", archString, LOCALE)) {
            if (Util.equalsIgnoreCase("riscv64", archString, LOCALE)) {
               return StubLoader.CPU.RISCV64;
            }

            for (StubLoader.CPU cpu : StubLoader.CPU.values()) {
               if (Util.equalsIgnoreCase(cpu.name(), archString, LOCALE)) {
                  return cpu;
               }
            }

            throw new RuntimeException("cannot determine CPU");
         } else {
            return StubLoader.CPU.MIPS64EL;
         }
      } else {
         return "little".equals(System.getProperty("sun.cpu.endian")) ? StubLoader.CPU.PPC64LE : StubLoader.CPU.PPC64;
      }
   }

   static File calculateExtractPath(File tmpDirFile) throws IOException {
      File dstFile;
      if (null == tmpDirFile) {
         dstFile = File.createTempFile("jffi", "." + dlExtension());
      } else {
         dstFile = File.createTempFile("jffi", "." + dlExtension(), tmpDirFile);
      }

      dstFile.deleteOnExit();
      return dstFile;
   }

   static File calculateExtractPath(File jffiExtractName, String tmpDirFile) throws IOException {
      if (jffiExtractName == null) {
         return calculateExtractPath(tmpDirFile);
      }

      if (null == jffiExtractName || jffiExtractName.isEmpty()) {
         jffiExtractName = "jffi-" + VERSION_MAJOR + "." + VERSION_MINOR;
      }

      if (!jffiExtractName.endsWith(dlExtension())) {
         jffiExtractName = jffiExtractName + "." + dlExtension();
      }

      File dstFile;
      if (null == tmpDirFile) {
         dstFile = new File(TMPDIR, jffiExtractName);
      } else {
         dstFile = new File(tmpDirFile, jffiExtractName);
      }

      return dstFile;
   }

   private static void verifyExistingLibrary(File sourceIS, InputStream dstFile) throws IOException {
      int sourceSize = sourceIS.available();

      try {
         FileInputStream targetIS = new FileInputStream(dstFile);

         try {
            int targetSize = targetIS.available();
            if (targetSize != sourceSize) {
               throw sizeMismatchError(dstFile, sourceSize, targetSize);
            }

            MessageDigest sourceMD = MessageDigest.getInstance("SHA-256");
            MessageDigest targetMD = MessageDigest.getInstance("SHA-256");
            DigestInputStream sourceDIS = new DigestInputStream(sourceIS, sourceMD);
            DigestInputStream targetDIS = new DigestInputStream(targetIS, targetMD);
            byte[] buf = new byte[8192];

            while (sourceIS.available() > 0) {
               sourceDIS.read(buf);
               targetDIS.read(buf);
            }

            byte[] sourceDigest = sourceMD.digest();
            byte[] targetDigest = targetMD.digest();
            if (!Arrays.equals(sourceDigest, targetDigest)) {
               throw digestMismatchError(dstFile);
            }
         } catch (Throwable var13) {
            try {
               targetIS.close();
            } catch (Throwable var12) {
               var13.addSuppressed(var12);
            }

            throw var13;
         }

         targetIS.close();
      } catch (NoSuchAlgorithmException var14) {
         throw new IOException(var14);
      }
   }

   private static void loadFromJar(File tmpDirFile) throws IOException, LinkageError {
      String jffiExtractName = StubLoader.jffiExtractName;

      File dstFile;
      try {
         InputStream sourceIS = getStubLibraryStream();

         try {
            dstFile = calculateExtractPath(tmpDirFile, jffiExtractName);
            if (jffiExtractName != null && dstFile.exists()) {
               verifyExistingLibrary(dstFile, sourceIS);
            } else {
               unpackLibrary(dstFile, sourceIS);
            }
         } catch (Throwable var8) {
            if (sourceIS != null) {
               try {
                  sourceIS.close();
               } catch (Throwable var6) {
                  var8.addSuppressed(var6);
               }
            }

            throw var8;
         }

         if (sourceIS != null) {
            sourceIS.close();
         }
      } catch (IOException var9) {
         throw tempReadonlyError(var9);
      }

      try {
         System.load(dstFile.getAbsolutePath());
         if (null == jffiExtractName) {
            dstFile.delete();
         }
      } catch (UnsatisfiedLinkError var7) {
         throw tempLoadError(var7);
      }
   }

   private static boolean loadFromBootPath(String errors, String libName, Collection<Throwable> bootPath) {
      String[] dirs = bootPath.split(File.pathSeparator);

      for (int i = 0; i < dirs.length; i++) {
         String soname = System.mapLibraryName(libName);
         File stub = new File(new File(dirs[i], getPlatformName()), soname);
         if (!stub.isFile()) {
            stub = new File(new File(dirs[i]), soname);
         }

         String path = stub.getAbsolutePath();
         if (stub.isFile()) {
            try {
               System.load(path);
               return true;
            } catch (UnsatisfiedLinkError var10) {
               errors.add(var10);
            }
         }

         if (getOS() == StubLoader.OS.DARWIN) {
            path = getAlternateLibraryPath(path);
            if (new File(path).isFile()) {
               try {
                  System.load(path);
                  return true;
               } catch (UnsatisfiedLinkError var9) {
                  errors.add(var9);
               }
            }
         }
      }

      return false;
   }

   private static String getAlternateLibraryPath(String path) {
      return path.endsWith("dylib") ? path.substring(0, path.lastIndexOf("dylib")) + "jnilib" : path.substring(0, path.lastIndexOf("jnilib")) + "dylib";
   }

   private static UnsatisfiedLinkError tempLoadError(UnsatisfiedLinkError ule) {
      return new UnsatisfiedLinkError(TMPDIR_EXEC_ERROR + " " + TMPDIR_RECOMMENDATION + "\n" + ule.getLocalizedMessage());
   }

   public static final boolean isLoaded() {
      return loaded;
   }

   public static String getPlatformName() {
      if (getOS().equals(StubLoader.OS.DARWIN)) {
         return "Darwin";
      }

      String osName = System.getProperty("os.name").split(" ")[0];
      return getCPU().name().toLowerCase(LOCALE) + "-" + osName;
   }

   private static SecurityException digestMismatchError(File dstFile) {
      return new SecurityException("digest mismatch: " + dstFile + " does not match packaged library");
   }

   static String dlExtension() {
      switch (getOS()) {
         case WINDOWS:
            return "dll";
         case DARWIN:
            return "dylib";
         default:
            return "so";
      }
   }

   private static SecurityException sizeMismatchError(File targetSize, int sourceSize, int dstFile) {
      return new SecurityException("file size mismatch: " + dstFile + " (" + targetSize + ") does not match packaged library (" + sourceSize + ")");
   }

   static void load() {
      String libName = getStubLibraryName();
      List<Throwable> errors = new ArrayList<>();
      String bootPath = getBootPath();
      if (bootPath == null || !loadFromBootPath(libName, bootPath, errors)) {
         String libraryPath = System.getProperty("java.library.path");
         if (libraryPath == null || !loadFromBootPath(libName, libraryPath, errors)) {
            if (jffiExtractDir != null) {
               try {
                  loadFromJar(jffiExtractDir);
               } catch (SecurityException var10) {
                  throw var10;
               } catch (Throwable var11) {
                  UnsatisfiedLinkError var14 = new UnsatisfiedLinkError("could not load jffi library from " + jffiExtractDir);
                  var14.initCause(var11);
                  throw var14;
               }
            } else {
               try {
                  loadFromJar(null);
               } catch (SecurityException t) {
                  throw t;
               } catch (Throwable var13) {
                  try {
                     loadFromJar(new File(System.getProperty("user.dir")));
                  } catch (SecurityException t1) {
                     throw t1;
                  } catch (Throwable var9) {
                     errors.add(var9);
                  }

                  if (!errors.isEmpty()) {
                     Collections.reverse(errors);
                     CharArrayWriter caw = new CharArrayWriter();
                     PrintWriter pw = new PrintWriter(caw);

                     for (Throwable t : errors) {
                        t.printStackTrace(pw);
                     }

                     throw new UnsatisfiedLinkError(new String(caw.toCharArray()));
                  }
               }
            }
         }
      }
   }

   private static String getStubLibraryPath() {
      String mappedLibraryName = StubLoader.OS.IBMI.equals(getOS()) ? "lib" + stubLibraryName + ".so" : System.mapLibraryName(stubLibraryName);
      return "jni/" + getPlatformName() + "/" + mappedLibraryName;
   }

   // $VF: Compiled from StubLoader.java
   public enum CPU {
      MIPS64EL,
      LOONGARCH64,
      ARM,
      S390X,
      I386,
      SPARCV9,
      PPC64LE,
      PPC64,
      AARCH64,
      SPARC,
      PPC,
      X86_64,
      UNKNOWN,
      RISCV64,
      MIPSEL;

      @Override
      public String toString() {
         return this.name().toLowerCase(StubLoader.LOCALE);
      }
   }

   // $VF: Compiled from StubLoader.java
   public enum OS {
      DRAGONFLY,
      UNKNOWN,
      WINDOWS,
      ZLINUX,
      IBMI,
      LINUX,
      FREEBSD,
      SOLARIS,
      OPENBSD,
      NETBSD,
      DARWIN,
      AIX;

      @Override
      public String toString() {
         return this.name().toLowerCase(StubLoader.LOCALE);
      }
   }
}
