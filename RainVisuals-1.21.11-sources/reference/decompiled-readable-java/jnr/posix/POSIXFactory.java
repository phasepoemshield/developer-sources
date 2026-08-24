/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import jnr.ffi.LibraryLoader;
import jnr.ffi.LibraryOption;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.mapper.FunctionMapper;
import jnr.posix.AixLibC;
import jnr.posix.AixPOSIX;
import jnr.posix.CheckedPOSIX;
import jnr.posix.Crypt;
import jnr.posix.DragonFlyPOSIX;
import jnr.posix.FreeBSDPOSIX;
import jnr.posix.JavaPOSIX;
import jnr.posix.LazyPOSIX;
import jnr.posix.LibC;
import jnr.posix.LibCProvider;
import jnr.posix.LinuxLibC;
import jnr.posix.LinuxPOSIX;
import jnr.posix.MacOSPOSIX;
import jnr.posix.OpenBSDPOSIX;
import jnr.posix.POSIX;
import jnr.posix.POSIXHandler;
import jnr.posix.POSIXTypeMapper;
import jnr.posix.SimpleFunctionMapper;
import jnr.posix.SolarisLibC;
import jnr.posix.SolarisPOSIX;
import jnr.posix.UnixLibC;
import jnr.posix.WindowsLibC;
import jnr.posix.WindowsPOSIX;
import jnr.posix.util.DefaultPOSIXHandler;
import jnr.posix.util.Platform;

public class POSIXFactory {
    private static final Class<Struct> BOGUS_HACK = Struct.class;
    public static final jnr.ffi.Platform NATIVE_PLATFORM = jnr.ffi.Platform.getNativePlatform();
    public static final String STANDARD_C_LIBRARY_NAME = NATIVE_PLATFORM.getStandardCLibraryName();

    public static POSIX loadFreeBSDPOSIX(POSIXHandler handler) {
        return new FreeBSDPOSIX(DefaultLibCProvider.INSTANCE, handler);
    }

    private static FunctionMapper functionMapper() {
        switch (NATIVE_PLATFORM.getOS()) {
            case AIX: {
                return new SimpleFunctionMapper.Builder().map("stat", "stat64x").map("fstat", "fstat64x").map("lstat", "lstat64x").map("stat64", "stat64x").map("fstat64", "fstat64x").map("lstat64", "lstat64x").build();
            }
            case WINDOWS: {
                return new SimpleFunctionMapper.Builder().map("getpid", "_getpid").map("chmod", "_chmod").map("fstat", "_fstat64").map("stat", "_stat64").map("umask", "_umask").map("isatty", "_isatty").map("read", "_read").map("write", "_write").map("close", "_close").map("getcwd", "_getcwd").map("unlink", "_unlink").map("access", "_access").map("open", "_open").map("dup", "_dup").map("dup2", "_dup2").map("lseek", "_lseek").map("ftruncate", "_chsize").build();
            }
            case SOLARIS: {
                return Platform.IS_32_BIT ? new SimpleFunctionMapper.Builder().map("stat", "stat64").map("fstat", "fstat64").map("lstat", "lstat64").build() : null;
            }
        }
        return null;
    }

    public static POSIX loadLinuxPOSIX(POSIXHandler handler) {
        return new LinuxPOSIX(DefaultLibCProvider.INSTANCE, handler);
    }

    /*
     * WARNING - void declaration
     */
    static POSIX loadPOSIX(POSIXHandler handler, boolean useNativePOSIX) {
        POSIX pOSIX;
        POSIX posix;
        block7: {
            posix = null;
            if (useNativePOSIX) {
                try {
                    posix = POSIXFactory.loadNativePOSIX(handler);
                    posix = posix != null ? new CheckedPOSIX(posix, handler) : null;
                    if (handler.isVerbose()) {
                        if (posix != null) {
                            System.err.println("Successfully loaded native POSIX impl.");
                        } else {
                            System.err.println("Failed to load native POSIX impl; falling back on Java impl. Unsupported OS.");
                        }
                    }
                }
                catch (Throwable t) {
                    void var3_3;
                    if (!handler.isVerbose()) break block7;
                    System.err.println("Failed to load native POSIX impl; falling back on Java impl. Stacktrace follows.");
                    var3_3.printStackTrace();
                }
            }
        }
        if (posix == null) {
            POSIXHandler pOSIXHandler;
            pOSIX = POSIXFactory.getJavaPOSIX(pOSIXHandler);
        }
        return pOSIX;
    }

    public static POSIX loadAixPOSIX(POSIXHandler handler) {
        return new AixPOSIX(DefaultLibCProvider.INSTANCE, handler);
    }

    public static POSIX getNativePOSIX(POSIXHandler handler) {
        return POSIXFactory.loadNativePOSIX(handler);
    }

    private static Map<LibraryOption, Object> options() {
        HashMap<LibraryOption, Object> options = new HashMap<LibraryOption, Object>();
        FunctionMapper functionMapper = POSIXFactory.functionMapper();
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
            case LINUX: {
                return LinuxLibC.class;
            }
            case AIX: {
                return AixLibC.class;
            }
            case SOLARIS: {
                return SolarisLibC.class;
            }
            case WINDOWS: {
                return WindowsLibC.class;
            }
        }
        return UnixLibC.class;
    }

    public static POSIX loadOpenBSDPOSIX(POSIXHandler handler) {
        return new OpenBSDPOSIX(DefaultLibCProvider.INSTANCE, handler);
    }

    public static POSIX getPOSIX() {
        return POSIXFactory.getPOSIX(new DefaultPOSIXHandler(), true);
    }

    public static POSIX loadMacOSPOSIX(POSIXHandler handler) {
        return new MacOSPOSIX(DefaultLibCProvider.INSTANCE, handler);
    }

    public static POSIX loadSolarisPOSIX(POSIXHandler handler) {
        return new SolarisPOSIX(DefaultLibCProvider.INSTANCE, handler);
    }

    public static POSIX loadDragonFlyPOSIX(POSIXHandler handler) {
        return new DragonFlyPOSIX(DefaultLibCProvider.INSTANCE, handler);
    }

    public static POSIX getNativePOSIX() {
        return POSIXFactory.getNativePOSIX(new DefaultPOSIXHandler());
    }

    public static POSIX getJavaPOSIX(POSIXHandler handler) {
        return new JavaPOSIX(handler);
    }

    public static POSIX loadWindowsPOSIX(POSIXHandler handler) {
        return new WindowsPOSIX(DefaultLibCProvider.INSTANCE, handler);
    }

    private static String[] libraries() {
        switch (NATIVE_PLATFORM.getOS()) {
            case LINUX: {
                return new String[]{STANDARD_C_LIBRARY_NAME};
            }
            case SOLARIS: {
                return new String[]{"socket", "nsl", STANDARD_C_LIBRARY_NAME};
            }
            case FREEBSD: 
            case DRAGONFLY: 
            case NETBSD: {
                return new String[]{STANDARD_C_LIBRARY_NAME};
            }
            case AIX: {
                String[] stringArray;
                if (Runtime.getSystemRuntime().addressSize() == 4) {
                    String[] stringArray2 = new String[1];
                    stringArray = stringArray2;
                    stringArray2[0] = "libc.a(shr.o)";
                } else {
                    String[] stringArray3 = new String[1];
                    stringArray = stringArray3;
                    stringArray3[0] = "libc.a(shr_64.o)";
                }
                return stringArray;
            }
            case WINDOWS: {
                return new String[]{"msvcrt", "kernel32"};
            }
        }
        return new String[]{STANDARD_C_LIBRARY_NAME};
    }

    public static POSIX getJavaPOSIX() {
        return POSIXFactory.getJavaPOSIX(new DefaultPOSIXHandler());
    }

    private static POSIX loadNativePOSIX(POSIXHandler handler) {
        switch (NATIVE_PLATFORM.getOS()) {
            case DARWIN: {
                return POSIXFactory.loadMacOSPOSIX(handler);
            }
            case LINUX: {
                return POSIXFactory.loadLinuxPOSIX(handler);
            }
            case FREEBSD: {
                return POSIXFactory.loadFreeBSDPOSIX(handler);
            }
            case DRAGONFLY: {
                return POSIXFactory.loadDragonFlyPOSIX(handler);
            }
            case OPENBSD: {
                return POSIXFactory.loadOpenBSDPOSIX(handler);
            }
            case SOLARIS: {
                return POSIXFactory.loadSolarisPOSIX(handler);
            }
            case AIX: {
                return POSIXFactory.loadAixPOSIX(handler);
            }
            case WINDOWS: {
                return POSIXFactory.loadWindowsPOSIX(handler);
            }
        }
        return null;
    }

    private static final class DefaultLibCProvider
    implements LibCProvider {
        public static final LibCProvider INSTANCE = new DefaultLibCProvider();

        @Override
        public final Crypt getCrypt() {
            return SingletonHolder.crypt;
        }

        @Override
        public final LibC getLibC() {
            return SingletonHolder.libc;
        }

        private DefaultLibCProvider() {
        }

        private static final class SingletonHolder {
            public static LibC libc;
            public static Crypt crypt;

            static {
                LibraryLoader libcLoader = LibraryLoader.create(POSIXFactory.libraryInterface());
                libcLoader.searchDefault();
                Object object = POSIXFactory.libraries();
                int n = ((String[])object).length;
                for (int i = 0; i < n; ++i) {
                    String library = object[i];
                    libcLoader.library(library);
                }
                object = POSIXFactory.options().entrySet().iterator();
                while (object.hasNext()) {
                    Map.Entry entry = (Map.Entry)object.next();
                    libcLoader.option((LibraryOption)((Object)entry.getKey()), entry.getValue());
                }
                libcLoader.failImmediately();
                libc = (LibC)libcLoader.load();
                Crypt c = null;
                try {
                    LibraryLoader<Crypt> loader = LibraryLoader.create(Crypt.class).failImmediately();
                    c = loader.load("libcrypt.so.1");
                }
                catch (UnsatisfiedLinkError ule) {
                    try {
                        LibraryLoader<Crypt> loader = LibraryLoader.create(Crypt.class).failImmediately();
                        c = loader.load("crypt");
                    }
                    catch (UnsatisfiedLinkError ule2) {
                        try {
                            LibraryLoader<Crypt> loader = LibraryLoader.create(Crypt.class).failImmediately();
                            object = loader.load(STANDARD_C_LIBRARY_NAME);
                        }
                        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                            // empty catch block
                        }
                    }
                }
                crypt = object;
            }

            private SingletonHolder() {
            }
        }
    }
}

