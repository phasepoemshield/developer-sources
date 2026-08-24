/*
 * Decompiled with CFR 0.152.
 */
package com.kenai.jffi;

import com.kenai.jffi.Foreign;
import com.kenai.jffi.Util;
import java.util.Locale;

public abstract class Platform {
    private final OS os;
    private final int javaVersionMajor;
    private static final Locale LOCALE = Locale.ENGLISH;

    private static boolean startsWithIgnoreCase(String s1, String s2) {
        return s1.startsWith(s2) || s1.toUpperCase(LOCALE).startsWith(s2.toUpperCase(LOCALE)) || s1.toLowerCase(LOCALE).startsWith(s2.toLowerCase(LOCALE));
    }

    private static Platform newWindowsPlatform() {
        return new Windows();
    }

    static /* synthetic */ Platform access$200(OS x0) {
        return Platform.determinePlatform(x0);
    }

    static /* synthetic */ OS access$100() {
        return Platform.determineOS();
    }

    private static Platform newDefaultPlatform(OS os) {
        return new Default(os);
    }

    public String getName() {
        String osName = System.getProperty("os.name").split(" ")[0];
        return this.getCPU().name().toLowerCase(LOCALE) + "-" + osName;
    }

    public final long addressMask() {
        return this.getCPU().addressMask;
    }

    public final OS getOS() {
        return this.os;
    }

    private static Platform newDarwinPlatform() {
        return new Darwin();
    }

    public boolean isSupported() {
        int version = Foreign.getInstance().getVersion();
        if ((version & 0xFFFF00) == (Foreign.VERSION_MAJOR << 16 | Foreign.VERSION_MINOR << 8)) {
            return true;
        }
        throw new UnsatisfiedLinkError("Incorrect native library version");
    }

    public final int addressSize() {
        return this.getCPU().dataModel;
    }

    public String getLibraryNamePattern() {
        return "lib.*\\.so.*$";
    }

    /*
     * WARNING - void declaration
     */
    private Platform(OS os) {
        void var2_2;
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
        }
        catch (Exception exception) {
            version = 8;
        }
        this.javaVersionMajor = var2_2;
    }

    public final CPU getCPU() {
        return ArchHolder.cpu;
    }

    public static final Platform getPlatform() {
        return SingletonHolder.PLATFORM;
    }

    private static final OS determineOS() {
        String osName = System.getProperty("os.name").split(" ")[0];
        if (Platform.startsWithIgnoreCase(osName, "mac") || Platform.startsWithIgnoreCase(osName, "darwin")) {
            return OS.DARWIN;
        }
        if (Platform.startsWithIgnoreCase(osName, "linux")) {
            return OS.LINUX;
        }
        if (Platform.startsWithIgnoreCase(osName, "sunos") || Platform.startsWithIgnoreCase(osName, "solaris")) {
            return OS.SOLARIS;
        }
        if (Platform.startsWithIgnoreCase(osName, "aix")) {
            return OS.AIX;
        }
        if (Platform.startsWithIgnoreCase(osName, "os/400") || Platform.startsWithIgnoreCase(osName, "os400")) {
            return OS.IBMI;
        }
        if (Platform.startsWithIgnoreCase(osName, "openbsd")) {
            return OS.OPENBSD;
        }
        if (Platform.startsWithIgnoreCase(osName, "freebsd")) {
            return OS.FREEBSD;
        }
        if (Platform.startsWithIgnoreCase(osName, "dragonfly")) {
            return OS.DRAGONFLY;
        }
        if (Platform.startsWithIgnoreCase(osName, "windows")) {
            return OS.WINDOWS;
        }
        return OS.UNKNOWN;
    }

    public final int getJavaMajorVersion() {
        return this.javaVersionMajor;
    }

    private static final Platform determinePlatform(OS os) {
        switch (os) {
            case DARWIN: {
                return Platform.newDarwinPlatform();
            }
            case WINDOWS: {
                return Platform.newWindowsPlatform();
            }
        }
        return Platform.newDefaultPlatform(os);
    }

    public abstract int longSize();

    public String mapLibraryName(String libName) {
        if (libName.matches(this.getLibraryNamePattern())) {
            return libName;
        }
        if (OS.IBMI.equals((Object)this.getOS())) {
            return "lib" + libName + ".so";
        }
        return System.mapLibraryName(libName);
    }

    private static final class Default
    extends Platform {
        public Default(OS os) {
            super(os);
        }

        @Override
        public final int longSize() {
            return this.getCPU().dataModel;
        }
    }

    public static final class CPU
    extends Enum<CPU> {
        private static final /* synthetic */ CPU[] $VALUES;
        public static final /* enum */ CPU PPC64;
        public static final /* enum */ CPU RISCV64;
        public static final /* enum */ CPU X86_64;
        public static final /* enum */ CPU UNKNOWN;
        public static final /* enum */ CPU SPARCV9;
        public static final /* enum */ CPU AARCH64;
        public static final /* enum */ CPU MIPS64EL;
        public static final /* enum */ CPU MIPSEL;
        public static final /* enum */ CPU LOONGARCH64;
        public final long addressMask;
        public static final /* enum */ CPU S390X;
        public static final /* enum */ CPU I386;
        public static final /* enum */ CPU ARM;
        public static final /* enum */ CPU PPC64LE;
        public static final /* enum */ CPU SPARC;
        public final int dataModel;
        public static final /* enum */ CPU PPC;

        public String toString() {
            return this.name().toLowerCase(LOCALE);
        }

        public static CPU valueOf(String name) {
            return Enum.valueOf(CPU.class, name);
        }

        public static CPU[] values() {
            return (CPU[])$VALUES.clone();
        }

        private static /* synthetic */ CPU[] $values() {
            CPU[] cPUArray = new CPU[15];
            cPUArray[0] = I386;
            cPUArray[1] = X86_64;
            cPUArray[2] = PPC;
            cPUArray[3] = PPC64;
            cPUArray[4] = PPC64LE;
            cPUArray[5] = SPARC;
            cPUArray[6] = SPARCV9;
            cPUArray[7] = S390X;
            cPUArray[8] = ARM;
            cPUArray[9] = AARCH64;
            cPUArray[10] = LOONGARCH64;
            cPUArray[11] = MIPSEL;
            cPUArray[12] = MIPS64EL;
            cPUArray[13] = RISCV64;
            cPUArray[14] = UNKNOWN;
            return cPUArray;
        }

        private CPU(int dataModel) {
            this.dataModel = dataModel;
            this.addressMask = dataModel == 32 ? 0xFFFFFFFFL : -1L;
        }

        static {
            I386 = new CPU(32);
            X86_64 = new CPU(64);
            PPC = new CPU(32);
            PPC64 = new CPU(64);
            PPC64LE = new CPU(64);
            SPARC = new CPU(32);
            SPARCV9 = new CPU(64);
            S390X = new CPU(64);
            ARM = new CPU(32);
            AARCH64 = new CPU(64);
            LOONGARCH64 = new CPU(64);
            MIPSEL = new CPU(32);
            MIPS64EL = new CPU(64);
            RISCV64 = new CPU(64);
            UNKNOWN = new CPU(64);
            $VALUES = CPU.$values();
        }
    }

    private static final class SingletonHolder {
        static final Platform PLATFORM = Platform.access$200(Platform.access$100());

        private SingletonHolder() {
        }
    }

    public static final class OS
    extends Enum<OS> {
        public static final /* enum */ OS UNKNOWN;
        public static final /* enum */ OS DARWIN;
        public static final /* enum */ OS ZLINUX;
        public static final /* enum */ OS LINUX;
        public static final /* enum */ OS AIX;
        public static final /* enum */ OS WINDOWS;
        public static final /* enum */ OS FREEBSD;
        public static final /* enum */ OS SOLARIS;
        private static final /* synthetic */ OS[] $VALUES;
        public static final /* enum */ OS OPENBSD;
        public static final /* enum */ OS IBMI;
        public static final /* enum */ OS DRAGONFLY;
        public static final /* enum */ OS NETBSD;

        public String toString() {
            return this.name().toLowerCase(LOCALE);
        }

        public static OS valueOf(String name) {
            return Enum.valueOf(OS.class, name);
        }

        private static /* synthetic */ OS[] $values() {
            OS[] oSArray = new OS[12];
            oSArray[0] = DARWIN;
            oSArray[1] = FREEBSD;
            oSArray[2] = NETBSD;
            oSArray[3] = OPENBSD;
            oSArray[4] = DRAGONFLY;
            oSArray[5] = LINUX;
            oSArray[6] = SOLARIS;
            oSArray[7] = WINDOWS;
            oSArray[8] = AIX;
            oSArray[9] = IBMI;
            oSArray[10] = ZLINUX;
            oSArray[11] = UNKNOWN;
            return oSArray;
        }

        public static OS[] values() {
            return (OS[])$VALUES.clone();
        }

        static {
            DARWIN = new OS();
            FREEBSD = new OS();
            NETBSD = new OS();
            OPENBSD = new OS();
            DRAGONFLY = new OS();
            LINUX = new OS();
            SOLARIS = new OS();
            WINDOWS = new OS();
            AIX = new OS();
            IBMI = new OS();
            ZLINUX = new OS();
            UNKNOWN = new OS();
            $VALUES = OS.$values();
        }
    }

    private static final class Windows
    extends Platform {
        @Override
        public String getLibraryNamePattern() {
            return ".*\\.dll$";
        }

        @Override
        public final int longSize() {
            return 32;
        }

        public Windows() {
            super(OS.WINDOWS);
        }
    }

    private static final class Darwin
    extends Platform {
        @Override
        public String mapLibraryName(String libName) {
            if (libName.matches(this.getLibraryNamePattern())) {
                return libName;
            }
            return "lib" + libName + ".dylib";
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
            super(OS.DARWIN);
        }

        @Override
        public String getLibraryNamePattern() {
            return "lib.*\\.(dylib|jnilib)$";
        }
    }

    private static final class ArchHolder {
        public static final CPU cpu = ArchHolder.determineCPU();

        private ArchHolder() {
        }

        /*
         * WARNING - void declaration
         */
        private static CPU determineCPU() {
            String archString = null;
            try {
                archString = Foreign.getInstance().getArch();
            }
            catch (UnsatisfiedLinkError unsatisfiedLinkError) {
                // empty catch block
            }
            if (archString == null || "unknown".equals(archString)) {
                archString = System.getProperty("os.arch", "unknown");
            }
            if (Util.equalsIgnoreCase("x86", archString, LOCALE) || Util.equalsIgnoreCase("i386", archString, LOCALE) || Util.equalsIgnoreCase("i86pc", archString, LOCALE)) {
                return CPU.I386;
            }
            if (Util.equalsIgnoreCase("x86_64", archString, LOCALE) || Util.equalsIgnoreCase("amd64", archString, LOCALE)) {
                return CPU.X86_64;
            }
            if (Util.equalsIgnoreCase("ppc", archString, LOCALE) || Util.equalsIgnoreCase("powerpc", archString, LOCALE)) {
                return CPU.PPC;
            }
            if (Util.equalsIgnoreCase("ppc64", archString, LOCALE) || Util.equalsIgnoreCase("powerpc64", archString, LOCALE)) {
                return CPU.PPC64;
            }
            if (Util.equalsIgnoreCase("ppc64le", archString, LOCALE) || Util.equalsIgnoreCase("powerpc64le", archString, LOCALE)) {
                return CPU.PPC64LE;
            }
            if (Util.equalsIgnoreCase("s390", archString, LOCALE) || Util.equalsIgnoreCase("s390x", archString, LOCALE)) {
                return CPU.S390X;
            }
            if (Util.equalsIgnoreCase("arm", archString, LOCALE) || Util.equalsIgnoreCase("armv7l", archString, LOCALE)) {
                return CPU.ARM;
            }
            if (Util.equalsIgnoreCase("aarch64", archString, LOCALE)) {
                return CPU.AARCH64;
            }
            if (Util.equalsIgnoreCase("loongarch64", archString, LOCALE)) {
                return CPU.LOONGARCH64;
            }
            if (Util.equalsIgnoreCase("mipsel", archString, LOCALE)) {
                return CPU.MIPSEL;
            }
            if (Util.equalsIgnoreCase("mips64", archString, LOCALE) || Util.equalsIgnoreCase("mips64el", archString, LOCALE)) {
                return CPU.MIPS64EL;
            }
            if (Util.equalsIgnoreCase("riscv64", archString, LOCALE)) {
                return CPU.RISCV64;
            }
            CPU[] cPUArray = CPU.values();
            int n = cPUArray.length;
            for (int i = 0; i < n; ++i) {
                void var4_5;
                CPU cpu = cPUArray[i];
                if (!cpu.name().equalsIgnoreCase(archString)) continue;
                return var4_5;
            }
            return CPU.UNKNOWN;
        }
    }
}

