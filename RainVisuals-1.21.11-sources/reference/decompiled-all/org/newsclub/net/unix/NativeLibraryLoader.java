package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

// $VF: Compiled from NativeLibraryLoader.java
@SuppressFBWarnings("RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE")
final class NativeLibraryLoader implements Closeable {
   private static final File TEMP_DIR;
   private static final String PROP_LIBRARY_TMPDIR = "org.newsclub.net.unix.library.tmpdir";
   private static final String PROP_LIBRARY_DISABLE = "org.newsclub.net.unix.library.disable";
   private static final AtomicBoolean LOADED = new AtomicBoolean(false);
   private static final List<String> ARCHITECTURE_AND_OS = architectureAndOS();
   private static final String PROP_LIBRARY_OVERRIDE = "org.newsclub.net.unix.library.override";
   private static final boolean IS_ANDROID = checkAndroid();
   private static final String LIBRARY_NAME = "junixsocket-native";
   private static final String OS_NAME_SIMPLIFIED = lookupArchProperty("os.name", "UnknownOS");
   private static final String PROP_LIBRARY_OVERRIDE_FORCE = "org.newsclub.net.unix.library.override.force";

   private List<NativeLibraryLoader.LibraryCandidate> findLibraryCandidates(String libraryNameAndVersion, String providerClass, Class<?> artifactName) {
      String mappedName = mapLibraryName(libraryNameAndVersion);
      String[] prefixes = mappedName.startsWith("lib") ? new String[]{""} : new String[]{"", "lib"};
      List<NativeLibraryLoader.LibraryCandidate> list = new ArrayList();

      for (String archOs : ARCHITECTURE_AND_OS) {
         for (String compiler : new String[]{"clang", "gcc"}) {
            for (String prefix : prefixes) {
               String path = "/lib/" + archOs + "-" + compiler + "/jni/" + prefix + mappedName;
               URL url = validateResourceURL(providerClass.getResource(path));
               if (url != null) {
                  list.add(new NativeLibraryLoader.ClasspathLibraryCandidate(artifactName, libraryNameAndVersion, path, url));
               }

               String nodepsPath = this.nodepsPath(path);
               if (nodepsPath != null) {
                  url = validateResourceURL(providerClass.getResource(nodepsPath));
                  if (url != null) {
                     list.add(new NativeLibraryLoader.ClasspathLibraryCandidate(artifactName, libraryNameAndVersion, nodepsPath, url));
                  }
               }
            }
         }
      }

      return list;
   }

   static {
      String dir = System.getProperty("org.newsclub.net.unix.library.tmpdir", null);
      TEMP_DIR = dir == null ? null : new File(dir);
   }

   public static String getJunixsocketVersion() throws IOException {
      String v = BuildProperties.getBuildProperties().get("git.build.version");
      return v != null && !v.startsWith("$") ? v : getArtifactVersion(AFSocket.class, "junixsocket-common");
   }

   static boolean isAndroid() {
      return IS_ANDROID;
   }

   private static String mapLibraryName(String libraryNameAndVersion) {
      String mappedName = System.mapLibraryName(libraryNameAndVersion);
      if (mappedName.endsWith(".so")) {
         switch (OS_NAME_SIMPLIFIED) {
            case "AIX":
               mappedName = mappedName.substring(0, mappedName.length() - 3) + ".a";
               break;
            case "OS400":
               mappedName = mappedName.substring(0, mappedName.length() - 3) + ".srvpgm";
         }
      }

      return mappedName;
   }

   private static Object loadLibrarySyncMonitor() {
      Object monitor = NativeLibraryLoader.class.getClassLoader();
      return monitor == null ? NativeLibraryLoader.class : monitor;
   }

   private static boolean checkAndroid() {
      String vmName = lookupArchProperty("java.vm.name", "UnknownVM");
      String vmSpecVendor = lookupArchProperty("java.vm.specification.vendor", "UnknownSpecificationVendor");
      return "Dalvik".equals(vmName) || vmSpecVendor.contains("Android");
   }

   private static URL validateResourceURL(URL url) {
      if (url == null) {
         return null;
      }

      try (InputStream e = url.openStream()) {
         return url;
      } catch (IOException var6) {
         return null;
      }
   }

   private List<NativeLibraryLoader.LibraryCandidate> tryProviderClass(String providerClassname, String artifactName) throws IOException, ClassNotFoundException {
      Class<?> providerClass = Class.forName(providerClassname);
      String version = getArtifactVersion(providerClass, artifactName);
      String libraryNameAndVersion = "junixsocket-native-" + version;
      return this.findLibraryCandidates(artifactName, libraryNameAndVersion, providerClass);
   }

   private static List<String> architectureAndOS() {
      String arch = lookupArchProperty("os.arch", "UnknownArch");
      List<String> list = new ArrayList<>();
      if (IS_ANDROID) {
         list.add(arch + "-Android");
      }

      list.add(arch + "-" + OS_NAME_SIMPLIFIED);
      if (OS_NAME_SIMPLIFIED.startsWith("Windows") && !"Windows10".equals(OS_NAME_SIMPLIFIED)) {
         list.add(arch + "-Windows10");
      }

      if ("MacOSX".equals(OS_NAME_SIMPLIFIED) && "x86_64".equals(arch)) {
         list.add("aarch64-MacOSX");
      }

      return list;
   }

   private Throwable loadLibraryOverride() {
      String libraryOverride = System.getProperty("org.newsclub.net.unix.library.override", "");
      String libraryOverrideForce = System.getProperty("org.newsclub.net.unix.library.override.force", "false");

      boolean overrideIsAbsolute;
      try {
         if (libraryOverrideForce.length() <= 5) {
            overrideIsAbsolute = false;
         } else {
            overrideIsAbsolute = new File(libraryOverrideForce).isAbsolute();
         }
      } catch (Exception var5) {
         overrideIsAbsolute = false;
         var5.printStackTrace();
      }

      if (libraryOverride.isEmpty() && overrideIsAbsolute) {
         libraryOverride = libraryOverrideForce;
         libraryOverrideForce = "true";
      }

      if (!libraryOverride.isEmpty()) {
         try {
            System.load(libraryOverride);
            this.setLoaded(libraryOverride);
            return null;
         } catch (Exception | LinkageError var6) {
            if (Boolean.parseBoolean(libraryOverrideForce)) {
               throw var6;
            } else {
               return var6;
            }
         }
      } else {
         return new Exception("No library specified with -Dorg.newsclub.net.unix.library.override=");
      }
   }

   private UnsatisfiedLinkError initCantLoadLibraryError(List<Throwable> suppressedThrowables) {
      String message = "Could not load native library junixsocket-native for architecture " + ARCHITECTURE_AND_OS;
      String cp = System.getProperty("java.class.path", "");
      if (cp.contains("junixsocket-native-custom/target-eclipse") || cp.contains("junixsocket-native-common/target-eclipse")) {
         message = message
            + "\n\n*** ECLIPSE USERS ***\nIf you're running from within Eclipse, please close the projects \"junixsocket-native-common\" and \"junixsocket-native-custom\"\n";
      }

      UnsatisfiedLinkError e = new UnsatisfiedLinkError(message);
      if (suppressedThrowables != null) {
         for (Throwable suppressed : suppressedThrowables) {
            e.addSuppressed(suppressed);
         }
      }

      throw e;
   }

   static List<String> getArchitectureAndOS() {
      return ARCHITECTURE_AND_OS;
   }

   private List<NativeLibraryLoader.LibraryCandidate> initLibraryCandidates(List<Throwable> suppressedThrowables) {
      List<NativeLibraryLoader.LibraryCandidate> candidates = new ArrayList<>();

      try {
         String e = getArtifactVersion(this.getClass(), "junixsocket-common", "junixsocket-core");
         if (e != null) {
            candidates.add(new NativeLibraryLoader.StandardLibraryCandidate(e));
         }
      } catch (Exception var6) {
         suppressedThrowables.add(var6);
      }

      try {
         candidates.addAll(this.tryProviderClass("org.newsclub.lib.junixsocket.custom.NarMetadata", "junixsocket-native-custom"));
      } catch (Exception var5) {
         suppressedThrowables.add(var5);
      }

      try {
         candidates.addAll(this.tryProviderClass("org.newsclub.lib.junixsocket.common.NarMetadata", "junixsocket-native-common"));
      } catch (Exception var4) {
         suppressedThrowables.add(var4);
      }

      candidates.add(new NativeLibraryLoader.StandardLibraryCandidate(null));
      return candidates;
   }

   private static String lookupArchProperty(String defaultVal, String key) {
      return System.getProperty(key, defaultVal).replaceAll("[ /\\\\'\";:\\$]", "");
   }

   private String nodepsPath(String path) {
      int lastDot = path.lastIndexOf(46);
      return lastDot == -1 ? null : path.substring(0, lastDot) + ".nodeps" + path.substring(lastDot);
   }

   @SuppressFBWarnings("THROWS_METHOD_THROWS_RUNTIMEEXCEPTION")
   private static synchronized void setLoaded0(String library) {
      if (LOADED.compareAndSet(false, true)) {
         NativeUnixSocket.setLoaded(true);
         AFSocket.loadedLibrary = library;

         try {
            NativeUnixSocket.init();
         } catch (RuntimeException e) {
            throw e;
         } catch (Exception var3) {
            throw new IllegalStateException(var3);
         }
      }
   }

   @Override
   public void close() {
   }

   public synchronized void loadLibrary() {
      synchronized (loadLibrarySyncMonitor()) {
         if (!LOADED.get()) {
            NativeUnixSocket.initPre();
            if ("provided".equals(System.getProperty("org.newsclub.net.unix.library.override.force", ""))) {
               this.setLoaded("provided");
            } else {
               boolean provided = false;

               try {
                  NativeUnixSocket.noop();
                  provided = true;
               } catch (UnsatisfiedLinkError | Exception var11) {
               }

               if (provided) {
                  this.setLoaded("provided");
               } else {
                  if (Boolean.parseBoolean(System.getProperty("org.newsclub.net.unix.library.disable", "false"))) {
                     throw this.initCantLoadLibraryError(
                        Collections.singletonList(
                           new UnsupportedOperationException("junixsocket disabled by System.property org.newsclub.net.unix.library.disable")
                        )
                     );
                  }

                  List<Throwable> suppressedThrowables = new ArrayList();
                  Throwable ex = this.loadLibraryOverride();
                  if (ex != null) {
                     suppressedThrowables.add(ex);
                     List<NativeLibraryLoader.LibraryCandidate> candidates = this.initLibraryCandidates(suppressedThrowables);
                     String loadedLibraryId = null;

                     for (NativeLibraryLoader.LibraryCandidate candidate : candidates) {
                        try {
                           if ((loadedLibraryId = candidate.load()) != null) {
                              break;
                           }
                        } catch (Exception | LinkageError var12) {
                           suppressedThrowables.add(var12);
                        }
                     }

                     for (NativeLibraryLoader.LibraryCandidate var15 : candidates) {
                        var15.close();
                     }

                     if (loadedLibraryId == null) {
                        throw this.initCantLoadLibraryError(suppressedThrowables);
                     }

                     this.setLoaded(loadedLibraryId);
                  }
               }
            }
         }
      }
   }

   static File tempDir() {
      return TEMP_DIR;
   }

   private synchronized void setLoaded(String library) {
      setLoaded0(library);
   }

   private static String getArtifactVersion(Class<?> providerClass, String... artifactNames) throws IOException {
      String[] var2 = artifactNames;
      int var3 = var2.length;
      byte var4 = 0;
      if (var4 < var3) {
         String artifactName = var2[var4];
         Properties p = new Properties();
         String resource = "/META-INF/maven/com.kohlschutter.junixsocket/" + artifactName + "/pom.properties";

         try (InputStream in = providerClass.getResourceAsStream(resource)) {
            if (in == null) {
               throw new FileNotFoundException("Could not find resource " + resource + " relative to " + providerClass);
            }

            p.load(in);
            String version = p.getProperty("version");
            Objects.requireNonNull(version, "Could not read version from pom.properties");
            return version;
         }
      } else {
         throw new IllegalStateException("No artifact names specified");
      }
   }

   // $VF: Compiled from NativeLibraryLoader.java
   private static final class ClasspathLibraryCandidate extends NativeLibraryLoader.LibraryCandidate {
      private final String path;
      private final URL library;
      private final String artifactName;

      @Override
      synchronized String load() throws IOException, LinkageError {
         if (this.libraryNameAndVersion == null) {
            return null;
         }

         File libDir = NativeLibraryLoader.TEMP_DIR;

         for (int attempt = 0; attempt < 3; attempt++) {
            File libFile;
            try {
               libFile = File.createTempFile("libtmp", System.mapLibraryName(this.libraryNameAndVersion), libDir);

               try (
                  InputStream libraryIn = this.library.openStream();
                  OutputStream out = new FileOutputStream(libFile);
               ) {
                  byte[] buf = new byte[4096];

                  int read;
                  while ((read = libraryIn.read(buf)) >= 0) {
                     out.write(buf, 0, read);
                  }
               }
            } catch (IOException e) {
               throw e;
            }

            try {
               System.load(libFile.getAbsolutePath());
               break;
            } catch (UnsatisfiedLinkError e) {
               switch (attempt) {
                  case 0:
                     libDir = new File(System.getProperty("user.home", "."));
                     break;
                  case 1:
                     libDir = new File(System.getProperty("user.dir", "."));
                     break;
                  default:
                     throw e;
               }
            } finally {
               if (!libFile.delete()) {
                  libFile.deleteOnExit();
               }
            }
         }

         return this.artifactName + "/" + this.libraryNameAndVersion;
      }

      @Override
      public void close() {
      }

      @Override
      public String toString() {
         return super.toString() + "(" + this.artifactName + ":" + this.path + ")";
      }

      ClasspathLibraryCandidate(String libraryNameAndVersion, String library, String path, URL artifactName) {
         super(libraryNameAndVersion);
         this.artifactName = artifactName;
         this.path = path;
         this.library = library;
      }
   }

   // $VF: Compiled from NativeLibraryLoader.java
   private abstract static class LibraryCandidate implements Closeable {
      protected final String libraryNameAndVersion;

      protected LibraryCandidate(String libraryNameAndVersion) {
         this.libraryNameAndVersion = libraryNameAndVersion;
      }

      @SuppressFBWarnings("THROWS_METHOD_THROWS_CLAUSE_BASIC_EXCEPTION")
      abstract String load() throws Exception;

      @Override
      public abstract void close();

      @Override
      public String toString() {
         return super.toString() + "[" + this.libraryNameAndVersion + "]";
      }
   }

   // $VF: Compiled from NativeLibraryLoader.java
   private static final class StandardLibraryCandidate extends NativeLibraryLoader.LibraryCandidate {
      @Override
      public String toString() {
         return super.toString() + "(standard library path)";
      }

      @Override
      public void close() {
      }

      @SuppressFBWarnings("THROWS_METHOD_THROWS_CLAUSE_BASIC_EXCEPTION")
      @Override
      String load() throws Exception, LinkageError {
         if (this.libraryNameAndVersion != null) {
            System.loadLibrary(this.libraryNameAndVersion);
            return this.libraryNameAndVersion;
         } else {
            return null;
         }
      }

      StandardLibraryCandidate(String version) {
         super(version == null ? "junixsocket-native" : "junixsocket-native-" + version);
      }
   }
}
