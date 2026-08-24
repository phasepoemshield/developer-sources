package jnr.posix;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import jnr.ffi.LibraryLoader;
import jnr.ffi.LibraryOption;
import jnr.ffi.Platform;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FunctionMapper;
import jnr.posix.util.DefaultPOSIXHandler;

// $VF: Compiled from POSIXFactory.java
public class POSIXFactory {
   private static final Class<Struct> BOGUS_HACK = Struct.class;
   public static final Platform NATIVE_PLATFORM = Platform.getNativePlatform();
   public static final String STANDARD_C_LIBRARY_NAME = NATIVE_PLATFORM.getStandardCLibraryName();

   public static POSIX loadFreeBSDPOSIX(POSIXHandler handler) {
      return new FreeBSDPOSIX(POSIXFactory.DefaultLibCProvider.INSTANCE, handler);
   }

   private static FunctionMapper functionMapper() {
      switch (NATIVE_PLATFORM.getOS()) {
         case SOLARIS:
            return jnr.posix.util.Platform.IS_32_BIT
               ? new SimpleFunctionMapper.Builder().map("stat", "stat64").map("fstat", "fstat64").map("lstat", "lstat64").build()
               : null;
         case AIX:
            return new SimpleFunctionMapper.Builder()
               .map("stat", "stat64x")
               .map("fstat", "fstat64x")
               .map("lstat", "lstat64x")
               .map("stat64", "stat64x")
               .map("fstat64", "fstat64x")
               .map("lstat64", "lstat64x")
               .build();
         case WINDOWS:
            return new SimpleFunctionMapper.Builder()
               .map("getpid", "_getpid")
               .map("chmod", "_chmod")
               .map("fstat", "_fstat64")
               .map("stat", "_stat64")
               .map("umask", "_umask")
               .map("isatty", "_isatty")
               .map("read", "_read")
               .map("write", "_write")
               .map("close", "_close")
               .map("getcwd", "_getcwd")
               .map("unlink", "_unlink")
               .map("access", "_access")
               .map("open", "_open")
               .map("dup", "_dup")
               .map("dup2", "_dup2")
               .map("lseek", "_lseek")
               .map("ftruncate", "_chsize")
               .build();
         default:
            return null;
      }
   }

   public static POSIX loadLinuxPOSIX(POSIXHandler handler) {
      return new LinuxPOSIX(POSIXFactory.DefaultLibCProvider.INSTANCE, handler);
   }

   static POSIX loadPOSIX(POSIXHandler handler, boolean useNativePOSIX) {
      POSIX posix = null;
      if (useNativePOSIX) {
         try {
            posix = loadNativePOSIX(handler);
            posix = posix != null ? new CheckedPOSIX(posix, handler) : null;
            if (handler.isVerbose()) {
               if (posix != null) {
                  System.err.println("Successfully loaded native POSIX impl.");
               } else {
                  System.err.println("Failed to load native POSIX impl; falling back on Java impl. Unsupported OS.");
               }
            }
         } catch (Throwable var4) {
            if (handler.isVerbose()) {
               System.err.println("Failed to load native POSIX impl; falling back on Java impl. Stacktrace follows.");
               var4.printStackTrace();
            }
         }
      }

      if (posix == null) {
         posix = getJavaPOSIX(handler);
      }

      return posix;
   }

   public static POSIX loadAixPOSIX(POSIXHandler handler) {
      return new AixPOSIX(POSIXFactory.DefaultLibCProvider.INSTANCE, handler);
   }

   public static POSIX getNativePOSIX(POSIXHandler handler) {
      return loadNativePOSIX(handler);
   }

   private static Map<LibraryOption, Object> options() {
      Map<LibraryOption, Object> options = new HashMap<>();
      FunctionMapper functionMapper = functionMapper();
      if (functionMapper != null) {
         options.put(LibraryOption.FunctionMapper, functionMapper);
      }

      options.put(LibraryOption.TypeMapper, POSIXTypeMapper.INSTANCE);
      options.put(LibraryOption.LoadNow, Boolean.TRUE);
      return Collections.unmodifiableMap(options);
   }

   public static POSIX getPOSIX(POSIXHandler handler, boolean useNativePOSIX) {
      return new LazyPOSIX(handler, useNativePOSIX);
   }

   private static Class<? extends LibC> libraryInterface() {
      switch (NATIVE_PLATFORM.getOS()) {
         case LINUX:
            return LinuxLibC.class;
         case FREEBSD:
         case DRAGONFLY:
         case OPENBSD:
         default:
            return UnixLibC.class;
         case SOLARIS:
            return SolarisLibC.class;
         case AIX:
            return AixLibC.class;
         case WINDOWS:
            return WindowsLibC.class;
      }
   }

   public static POSIX loadOpenBSDPOSIX(POSIXHandler handler) {
      return new OpenBSDPOSIX(POSIXFactory.DefaultLibCProvider.INSTANCE, handler);
   }

   public static POSIX getPOSIX() {
      return getPOSIX(new DefaultPOSIXHandler(), true);
   }

   public static POSIX loadMacOSPOSIX(POSIXHandler handler) {
      return new MacOSPOSIX(POSIXFactory.DefaultLibCProvider.INSTANCE, handler);
   }

   public static POSIX loadSolarisPOSIX(POSIXHandler handler) {
      return new SolarisPOSIX(POSIXFactory.DefaultLibCProvider.INSTANCE, handler);
   }

   public static POSIX loadDragonFlyPOSIX(POSIXHandler handler) {
      return new DragonFlyPOSIX(POSIXFactory.DefaultLibCProvider.INSTANCE, handler);
   }

   public static POSIX getNativePOSIX() {
      return getNativePOSIX(new DefaultPOSIXHandler());
   }

   public static POSIX getJavaPOSIX(POSIXHandler handler) {
      return new JavaPOSIX(handler);
   }

   public static POSIX loadWindowsPOSIX(POSIXHandler handler) {
      return new WindowsPOSIX(POSIXFactory.DefaultLibCProvider.INSTANCE, handler);
   }

   private static String[] libraries() {
      switch (NATIVE_PLATFORM.getOS()) {
         case LINUX:
            return new String[]{STANDARD_C_LIBRARY_NAME};
         case FREEBSD:
         case DRAGONFLY:
         case NETBSD:
            return new String[]{STANDARD_C_LIBRARY_NAME};
         case OPENBSD:
         default:
            return new String[]{STANDARD_C_LIBRARY_NAME};
         case SOLARIS:
            return new String[]{"socket", "nsl", STANDARD_C_LIBRARY_NAME};
         case AIX:
            return Runtime.getSystemRuntime().addressSize() == 4 ? new String[]{"libc.a(shr.o)"} : new String[]{"libc.a(shr_64.o)"};
         case WINDOWS:
            return new String[]{"msvcrt", "kernel32"};
      }
   }

   public static POSIX getJavaPOSIX() {
      return getJavaPOSIX(new DefaultPOSIXHandler());
   }

   private static POSIX loadNativePOSIX(POSIXHandler handler) {
      switch (NATIVE_PLATFORM.getOS()) {
         case DARWIN:
            return loadMacOSPOSIX(handler);
         case LINUX:
            return loadLinuxPOSIX(handler);
         case FREEBSD:
            return loadFreeBSDPOSIX(handler);
         case DRAGONFLY:
            return loadDragonFlyPOSIX(handler);
         case OPENBSD:
            return loadOpenBSDPOSIX(handler);
         case SOLARIS:
            return loadSolarisPOSIX(handler);
         case AIX:
            return loadAixPOSIX(handler);
         case WINDOWS:
            return loadWindowsPOSIX(handler);
         default:
            return null;
      }
   }

   // $VF: Compiled from POSIXFactory.java
   private static final class DefaultLibCProvider implements LibCProvider {
      public static final LibCProvider INSTANCE = new POSIXFactory.DefaultLibCProvider();

      @Override
      public final Crypt getCrypt() {
         return POSIXFactory.DefaultLibCProvider.SingletonHolder.crypt;
      }

      @Override
      public final LibC getLibC() {
         return POSIXFactory.DefaultLibCProvider.SingletonHolder.libc;
      }

      // $VF: Compiled from POSIXFactory.java
      private static final class SingletonHolder {
         public static LibC libc;
         public static Crypt crypt;

         static {
            LibraryLoader<? extends LibC> libcLoader = LibraryLoader.create(POSIXFactory.libraryInterface());
            libcLoader.searchDefault();

            for (String loader : POSIXFactory.libraries()) {
               libcLoader.library(loader);
            }

            for (Entry<LibraryOption, Object> var10 : POSIXFactory.options().entrySet()) {
               libcLoader.option((LibraryOption)var10.getKey(), var10.getValue());
            }

            libcLoader.failImmediately();
            libc = libcLoader.load();
            Crypt var9 = null;

            try {
               LibraryLoader<Crypt> var11 = LibraryLoader.create(Crypt.class).failImmediately();
               var9 = (Crypt)var11.load("libcrypt.so.1");
            } catch (UnsatisfiedLinkError var7) {
               try {
                  LibraryLoader<Crypt> var12 = LibraryLoader.create(Crypt.class).failImmediately();
                  var9 = (Crypt)var12.load("crypt");
               } catch (UnsatisfiedLinkError var6) {
                  try {
                     LibraryLoader<Crypt> var13 = LibraryLoader.create(Crypt.class).failImmediately();
                     var9 = (Crypt)var13.load(POSIXFactory.STANDARD_C_LIBRARY_NAME);
                  } catch (UnsatisfiedLinkError var5) {
                  }
               }
            }

            crypt = var9;
         }
      }
   }
}
