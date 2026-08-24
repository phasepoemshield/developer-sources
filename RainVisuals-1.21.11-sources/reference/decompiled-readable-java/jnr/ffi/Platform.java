/*
 * Decompiled with CFR 0.152.
 */
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
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jnr.ffi.LibraryLoader;
import jnr.ffi.LibraryOption;

public abstract class Platform {
    private final int longSize;
    private static final Locale LOCALE = Locale.ENGLISH;
    private final OS os;
    private final int addressSize;
    protected final Pattern libPattern;
    private final CPU cpu;

    private static OS determineOS() {
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
        if (Platform.startsWithIgnoreCase(osName, "os400") || Platform.startsWithIgnoreCase(osName, "os/400")) {
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
        if (Platform.startsWithIgnoreCase(osName, "midnightbsd")) {
            return OS.MIDNIGHTBSD;
        }
        return OS.UNKNOWN;
    }

    private Platform(OS os) {
        String libpattern;
        this.os = os;
        this.cpu = Platform.determineCPU();
        switch (os) {
            case WINDOWS: {
                libpattern = ".*\\.dll$";
                break;
            }
            case DARWIN: {
                libpattern = "lib.*\\.(dylib|jnilib)$";
                break;
            }
            case IBMI: {
                libpattern = "lib.*\\.(so|a\\(shr.o\\)|a\\(shr_64.o\\)|a|so.[\\.0-9]+)$";
                break;
            }
            default: {
                libpattern = "lib.*\\.so.*$";
            }
        }
        this.libPattern = Pattern.compile(libpattern);
        this.addressSize = Platform.calculateAddressSize(this.cpu);
        this.longSize = os == OS.WINDOWS ? 32 : this.addressSize;
    }

    public String mapLibraryName(String libName) {
        if (this.libPattern.matcher(libName).find()) {
            return libName;
        }
        return System.mapLibraryName(libName);
    }

    @Deprecated
    public static Platform getPlatform() {
        return SingletonHolder.PLATFORM;
    }

    /*
     * WARNING - void declaration
     */
    public List<String> libraryLocations(String libName, List<String> additionalPaths) {
        void var3_3;
        ArrayList<String> result = new ArrayList<String>();
        ArrayList<String> libDirs = new ArrayList<String>();
        if (additionalPaths != null) {
            libDirs.addAll(additionalPaths);
        }
        libDirs.addAll(LibraryLoader.DefaultLibPaths.PATHS);
        String name = new File(this.locateLibrary(libName, libDirs)).getName();
        for (String libDir : libDirs) {
            File libFile = new File(libDir, name);
            if (!libFile.exists()) continue;
            result.add(libFile.getAbsolutePath());
        }
        return var3_3;
    }

    public final boolean isUnix() {
        return this.os != OS.WINDOWS;
    }

    /*
     * WARNING - void declaration
     */
    private static CPU determineCPU() {
        String archString = System.getProperty("os.arch");
        if (Platform.equalsIgnoreCase("x86", archString) || Platform.equalsIgnoreCase("i386", archString) || Platform.equalsIgnoreCase("i86pc", archString) || Platform.equalsIgnoreCase("i686", archString)) {
            return CPU.I386;
        }
        if (Platform.equalsIgnoreCase("x86_64", archString) || Platform.equalsIgnoreCase("amd64", archString)) {
            return CPU.X86_64;
        }
        if (Platform.equalsIgnoreCase("ppc", archString) || Platform.equalsIgnoreCase("powerpc", archString)) {
            if (OS.IBMI.equals((Object)Platform.determineOS())) {
                return CPU.PPC64;
            }
            return CPU.PPC;
        }
        if (Platform.equalsIgnoreCase("ppc64", archString) || Platform.equalsIgnoreCase("powerpc64", archString)) {
            if ("little".equals(System.getProperty("sun.cpu.endian"))) {
                return CPU.PPC64LE;
            }
            return CPU.PPC64;
        }
        if (Platform.equalsIgnoreCase("ppc64le", archString) || Platform.equalsIgnoreCase("powerpc64le", archString)) {
            return CPU.PPC64LE;
        }
        if (Platform.equalsIgnoreCase("s390", archString) || Platform.equalsIgnoreCase("s390x", archString)) {
            return CPU.S390X;
        }
        if (Platform.equalsIgnoreCase("aarch64", archString)) {
            return CPU.AARCH64;
        }
        if (Platform.equalsIgnoreCase("arm", archString) || Platform.equalsIgnoreCase("armv7l", archString)) {
            return CPU.ARM;
        }
        if (Platform.equalsIgnoreCase("mips64", archString) || Platform.equalsIgnoreCase("mips64el", archString)) {
            return CPU.MIPS64EL;
        }
        if (Platform.equalsIgnoreCase("loongarch64", archString)) {
            return CPU.LOONGARCH64;
        }
        if (Platform.equalsIgnoreCase("riscv64", archString)) {
            return CPU.RISCV64;
        }
        CPU[] cPUArray = CPU.values();
        int n = cPUArray.length;
        for (int i = 0; i < n; ++i) {
            void var4_4;
            CPU cpu = cPUArray[i];
            if (!Platform.equalsIgnoreCase(cpu.name(), archString)) continue;
            return var4_4;
        }
        return CPU.UNKNOWN;
    }

    public final int addressSize() {
        return this.addressSize;
    }

    public String getVersion() {
        return System.getProperty("os.version", null);
    }

    public final boolean is32Bit() {
        return this.addressSize == 32;
    }

    public final OS getOS() {
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
            case LINUX: {
                return "libc.so.6";
            }
            case SOLARIS: {
                return "c";
            }
            case DRAGONFLY: 
            case FREEBSD: 
            case MIDNIGHTBSD: 
            case NETBSD: {
                return "c";
            }
            case IBMI: 
            case AIX: {
                return this.addressSize == 32 ? "libc.a(shr.o)" : "libc.a(shr_64.o)";
            }
            case WINDOWS: {
                return "msvcrt";
            }
        }
        return "c";
    }

    static /* synthetic */ Platform access$000() {
        return Platform.determinePlatform();
    }

    public String getName() {
        return (Object)((Object)this.cpu) + "-" + (Object)((Object)this.os);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean isBSD() {
        if (this.os == OS.FREEBSD) return true;
        if (this.os == OS.OPENBSD) return true;
        if (this.os == OS.NETBSD) return true;
        if (this.os == OS.DARWIN) return true;
        if (!(this.os == OS.DRAGONFLY | this.os == OS.MIDNIGHTBSD)) return false;
        return true;
    }

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
        return SingletonHolder.PLATFORM;
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
            Class<?> c = Class.forName(providerName + "$Platform");
            return (Platform)c.newInstance();
        }
        catch (ClassNotFoundException ex) {
            return Platform.determinePlatform(Platform.determineOS());
        }
        catch (IllegalAccessException ex) {
            throw new ExceptionInInitializerError(ex);
        }
        catch (InstantiationException ex) {
            throw new ExceptionInInitializerError(ex);
        }
    }

    public String locateLibrary(String libName, List<String> libraryPaths, Map<LibraryOption, Object> options) {
        return this.locateLibrary(libName, libraryPaths);
    }

    /*
     * WARNING - void declaration
     */
    private List<String> getVersionNumbers() {
        void var3_3;
        String version = this.getVersion();
        if (version == null) {
            return Collections.emptyList();
        }
        Matcher matcher = Pattern.compile("[\\d]+").matcher(version);
        ArrayList<String> result = new ArrayList<String>();
        while (matcher.find()) {
            result.add(matcher.group());
        }
        return var3_3;
    }

    /*
     * WARNING - void declaration
     */
    public String locateLibrary(String libName, List<String> libraryPath) {
        void var3_3;
        String mappedName = this.mapLibraryName(libName);
        for (String path : libraryPath) {
            File libFile = new File(path, mappedName);
            if (!libFile.exists()) continue;
            return libFile.getAbsolutePath();
        }
        return var3_3;
    }

    private static int calculateAddressSize(CPU cpu) {
        Integer dataModel = Integer.getInteger("sun.arch.data.model");
        if (dataModel == null || dataModel != 32 && dataModel != 64) {
            switch (cpu) {
                case I386: 
                case PPC: 
                case SPARC: {
                    dataModel = 32;
                    break;
                }
                case X86_64: 
                case PPC64: 
                case PPC64LE: 
                case SPARCV9: 
                case S390X: 
                case AARCH64: 
                case MIPS64EL: 
                case LOONGARCH64: 
                case RISCV64: {
                    dataModel = 64;
                    break;
                }
                default: {
                    throw new ExceptionInInitializerError("Cannot determine cpu address size");
                }
            }
        }
        return dataModel;
    }

    public final CPU getCPU() {
        return this.cpu;
    }

    private static Platform determinePlatform(OS os) {
        switch (os) {
            case DARWIN: {
                return new Darwin();
            }
            case LINUX: {
                return new Linux();
            }
            case WINDOWS: {
                return new Windows();
            }
            case IBMI: {
                return new IbmI();
            }
            case UNKNOWN: {
                return new Unsupported(os);
            }
        }
        return new Default(os);
    }

    private static boolean startsWithIgnoreCase(String s1, String s2) {
        return s1.startsWith(s2) || s1.toUpperCase(LOCALE).startsWith(s2.toUpperCase(LOCALE)) || s1.toLowerCase(LOCALE).startsWith(s2.toLowerCase(LOCALE));
    }

    public Platform(OS os, CPU cpu, int addressSize, int longSize, String libPattern) {
        this.os = os;
        this.cpu = cpu;
        this.addressSize = addressSize;
        this.longSize = longSize;
        this.libPattern = Pattern.compile(libPattern);
    }

    public static final class CPU
    extends Enum<CPU> {
        public static final /* enum */ CPU PPC64LE;
        public static final /* enum */ CPU LOONGARCH64;
        public static final /* enum */ CPU X86_64;
        public static final /* enum */ CPU ARM;
        public static final /* enum */ CPU PPC;
        public static final /* enum */ CPU MIPS64EL;
        public static final /* enum */ CPU RISCV64;
        public static final /* enum */ CPU UNKNOWN;
        public static final /* enum */ CPU PPC64;
        public static final /* enum */ CPU AARCH64;
        public static final /* enum */ CPU S390X;
        public static final /* enum */ CPU SPARC;
        public static final /* enum */ CPU SPARCV9;
        public static final /* enum */ CPU MIPS32;
        public static final /* enum */ CPU I386;
        private static final /* synthetic */ CPU[] $VALUES;

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
            cPUArray[8] = MIPS32;
            cPUArray[9] = ARM;
            cPUArray[10] = AARCH64;
            cPUArray[11] = MIPS64EL;
            cPUArray[12] = LOONGARCH64;
            cPUArray[13] = RISCV64;
            cPUArray[14] = UNKNOWN;
            return cPUArray;
        }

        public String toString() {
            return this.name().toLowerCase(LOCALE);
        }

        public static CPU valueOf(String name) {
            return Enum.valueOf(CPU.class, name);
        }

        static {
            I386 = new CPU();
            X86_64 = new CPU();
            PPC = new CPU();
            PPC64 = new CPU();
            PPC64LE = new CPU();
            SPARC = new CPU();
            SPARCV9 = new CPU();
            S390X = new CPU();
            MIPS32 = new CPU();
            ARM = new CPU();
            AARCH64 = new CPU();
            MIPS64EL = new CPU();
            LOONGARCH64 = new CPU();
            RISCV64 = new CPU();
            UNKNOWN = new CPU();
            $VALUES = CPU.$values();
        }
    }

    private static class Supported
    extends Platform {
        public Supported(OS os) {
            super(os);
        }
    }

    private static final class Default
    extends Supported {
        public Default(OS os) {
            super(os);
        }
    }

    static final class Linux
    extends Supported {
        /*
         * Unable to fully structure code
         */
        @Override
        public String locateLibrary(String libName, List<String> libraryPaths, Map<LibraryOption, Object> options) {
            matches = this.getMatches(libName, libraryPaths);
            if (matches.isEmpty()) {
                return this.mapLibraryName(libName);
            }
            if (options == null) ** GOTO lbl-1000
            if (options.containsKey((Object)LibraryOption.PreferCustomPaths)) {
                v0 = true;
            } else lbl-1000:
            // 2 sources

            {
                v0 = false;
            }
            preferCustom = v0;
            Collections.sort(matches);
            best = null;
            if (preferCustom) {
                for (Match match : matches) {
                    if (!match.isCustom) continue;
                    best = match;
                    break;
                }
            }
            return best != null ? best.path : matches.get((int)0).path;
        }

        /*
         * WARNING - void declaration
         */
        private static int compareVersions(int[] version1, int[] version2) {
            void var1_1;
            int[] nArray;
            if (version1 == null) {
                return version2 == null ? 0 : -1;
            }
            if (version2 == null) {
                return 1;
            }
            int commonLength = Math.min(version1.length, version2.length);
            int i = 0;
            while (i < commonLength) {
                void var3_3;
                if (version1[i] < version2[i]) {
                    return -1;
                }
                if (version1[i] > version2[i]) {
                    return 1;
                }
                ++var3_3;
            }
            return Integer.compare(nArray.length, ((void)var1_1).length);
        }

        @Override
        public String mapLibraryName(String libName) {
            return "c".equals(libName) || "libc.so".equals(libName) ? "libc.so.6" : super.mapLibraryName(libName);
        }

        @Override
        public String locateLibrary(String libName, List<String> libraryPaths) {
            return this.locateLibrary(libName, libraryPaths, null);
        }

        /*
         * Unable to fully structure code
         */
        private List<Match> getMatches(String libName, List<String> libraryPaths) {
            customPaths = new ArrayList<String>();
            if (LibraryLoader.DefaultLibPaths.PATHS.size() <= 0) ** GOTO lbl-1000
            if (libraryPaths.size() >= LibraryLoader.DefaultLibPaths.PATHS.size()) {
                firstSystemPath = LibraryLoader.DefaultLibPaths.PATHS.get(0);
                firstSystemPathIndex = libraryPaths.lastIndexOf(firstSystemPath);
                for (i = 0; i < firstSystemPathIndex; ++i) {
                    customPaths.add(libraryPaths.get(i));
                }
            } else lbl-1000:
            // 2 sources

            {
                customPaths.addAll(libraryPaths);
            }
            exclude = this.getCPU() == CPU.X86_64 ? Pattern.compile(".*(lib[a-z]*32|i[0-9]86).*") : Pattern.compile(".*(lib[a-z]*64|amd64|x86_64).*");
            versionedLibPattern = Pattern.compile("lib" + libName + "\\.so((?:\\.[0-9]+)*)$");
            filter = new FilenameFilter(){

                @Override
                public boolean accept(File dir, String name) {
                    return versionedLibPattern.matcher(name).matches();
                }
            };
            matches = new ArrayList<void>();
            for (String path : libraryPaths) {
                if (exclude.matcher(path).matches() || (files = (libraryPath = new File(path)).listFiles(filter)) == null) continue;
                var12_14 = files;
                var13_15 = var12_14.length;
                for (var14_16 = 0; var14_16 < var13_15; ++var14_16) {
                    file = var12_14[var14_16];
                    matcher = versionedLibPattern.matcher(file.getName());
                    v0 = matcher.matches() ? matcher.group(1) : (versionString = "");
                    if (versionString == null) ** GOTO lbl36
                    if (versionString.isEmpty()) {
lbl36:
                        // 2 sources

                        version = new int[]{};
                    } else {
                        parts = versionString.split("\\.");
                        version = new int[parts.length - 1];
                        i = 1;
                        while (i < parts.length) {
                            version[i - 1] = Integer.parseInt(parts[var20_22]);
                            ++var20_22;
                        }
                    }
                    match = new Match();
                    match.path = file.getAbsolutePath();
                    match.version = version;
                    match.isCustom = customPaths.contains(path);
                    matches.add(var19_21);
                }
            }
            return var7_9;
        }

        public Linux() {
            super(OS.LINUX);
        }

        private static class Match
        implements Comparable<Match> {
            boolean isCustom;
            int[] version;
            String path;

            private Match() {
            }

            @Override
            public int compareTo(Match o) {
                return Linux.compareVersions(o.version, this.version);
            }
        }
    }

    private static class Unsupported
    extends Platform {
        public Unsupported(OS os) {
            super(os);
        }
    }

    static final class IbmI
    extends Supported {
        @Override
        public String mapLibraryName(String libName) {
            if (this.libPattern.matcher(libName).find()) {
                return libName;
            }
            return "lib" + libName + ".a(shr_64.o)";
        }

        /*
         * Unable to fully structure code
         */
        @Override
        public String locateLibrary(String libName, List<String> libraryPaths) {
            versionedLibPattern = Pattern.compile("lib" + libName + "\\.so((?:\\.[0-9]+)*)$");
            dotAorSoPattern = Pattern.compile("lib" + libName + "\\.(a|so)$");
            dotAorSoFiles = new LinkedList<File>();
            searchPaths = new LinkedList<String>();
            searchPaths.addAll(libraryPaths);
            searchPaths.add("/QOpenSys/pkgs/lib");
            searchPaths.add("/QOpenSys/usr/lib");
            filter = new FilenameFilter(){

                /*
                 * Enabled force condition propagation
                 * Lifted jumps to return sites
                 */
                @Override
                public boolean accept(File dir, String name) {
                    if (dotAorSoPattern.matcher(name).matches()) return true;
                    if (!versionedLibPattern.matcher(name).matches()) return false;
                    return true;
                }
            };
            matches = new LinkedHashMap<String, void>();
            for (String path : searchPaths) {
                if (path.toLowerCase(Platform.access$100()).startsWith("/qsys") || (files = (libraryPath = new File(path)).listFiles(filter)) == null) continue;
                var13_13 = files;
                var14_14 = var13_13.length;
                for (var15_16 = 0; var15_16 < var14_14; ++var15_16) {
                    file = var13_13[var15_16];
                    if (dotAorSoPattern.matcher(file.getName()).matches()) {
                        dotAorSoFiles.add(file);
                        continue;
                    }
                    matcher = versionedLibPattern.matcher(file.getName());
                    v0 = matcher.matches() ? matcher.group(1) : (versionString = "");
                    if (versionString == null) ** GOTO lbl31
                    if (versionString.isEmpty()) {
lbl31:
                        // 2 sources

                        version = new int[]{};
                    } else {
                        parts = versionString.split("\\.");
                        version = new int[parts.length - 1];
                        i = 1;
                        while (i < parts.length) {
                            version[i - 1] = Integer.parseInt(parts[i]);
                            ++var21_22;
                        }
                    }
                    matches.put(file.getAbsolutePath(), var19_20);
                }
            }
            bestVersion = null;
            bestMatch = null;
            for (Map.Entry<K, V> entry : matches.entrySet()) {
                file = (String)entry.getKey();
                fileVersion = (int[])entry.getValue();
                if (Linux.access$300(fileVersion, bestVersion) <= 0) continue;
                bestMatch = var13_13;
                bestVersion = var14_15;
            }
            if (null != bestMatch) {
                return bestMatch;
            }
            if (!dotAorSoFiles.isEmpty()) {
                qualifiedAorSo = ((File)dotAorSoFiles.get(0)).getAbsolutePath();
                if (qualifiedAorSo.endsWith(".a")) {
                    var11_11 = qualifiedAorSo + "(shr_64.o)";
                }
                return var11_11;
            }
            return this.mapLibraryName((String)var1_1);
        }

        public IbmI() {
            super(OS.IBMI);
        }
    }

    public static final class OS
    extends Enum<OS> {
        public static final /* enum */ OS FREEBSD;
        private static final /* synthetic */ OS[] $VALUES;
        public static final /* enum */ OS MIDNIGHTBSD;
        public static final /* enum */ OS NETBSD;
        public static final /* enum */ OS SOLARIS;
        public static final /* enum */ OS AIX;
        public static final /* enum */ OS WINDOWS;
        public static final /* enum */ OS OPENBSD;
        public static final /* enum */ OS DRAGONFLY;
        public static final /* enum */ OS DARWIN;
        public static final /* enum */ OS LINUX;
        public static final /* enum */ OS IBMI;
        public static final /* enum */ OS ZLINUX;
        public static final /* enum */ OS UNKNOWN;

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
            MIDNIGHTBSD = new OS();
            UNKNOWN = new OS();
            $VALUES = OS.$values();
        }

        private static /* synthetic */ OS[] $values() {
            OS[] oSArray = new OS[13];
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
            oSArray[11] = MIDNIGHTBSD;
            oSArray[12] = UNKNOWN;
            return oSArray;
        }

        public static OS valueOf(String name) {
            return Enum.valueOf(OS.class, name);
        }

        public String toString() {
            return this.name().toLowerCase(LOCALE);
        }

        public static OS[] values() {
            return (OS[])$VALUES.clone();
        }
    }

    private static class Windows
    extends Supported {
        private static final String WINDOWS_VISTA = "windows vista";
        private static final String WINDOWS_8 = "windows 8";
        private static final String WINDOWS_SERVER = "server";
        private static final String WINDOWS_10 = "windows 10";
        private static final String WINDOWS_11 = "windows 11";
        private static final String WINDOWS_7 = "windows 7";

        public boolean isVista() {
            return this.osName().contains(WINDOWS_VISTA);
        }

        public boolean isServer() {
            return this.osName().contains(WINDOWS_SERVER);
        }

        public boolean is11() {
            return this.osName().contains(WINDOWS_11);
        }

        public Windows() {
            super(OS.WINDOWS);
        }

        private String osName() {
            return System.getProperty("os.name").toLowerCase();
        }

        public boolean is8() {
            return this.osName().contains(WINDOWS_8);
        }

        public boolean is10() {
            return this.osName().contains(WINDOWS_10);
        }

        public boolean is7() {
            return this.osName().contains(WINDOWS_7);
        }
    }

    private static final class SingletonHolder {
        static final Platform PLATFORM = Platform.access$000();

        private SingletonHolder() {
        }
    }

    private static final class Darwin
    extends Supported {
        @Override
        public String mapLibraryName(String libName) {
            if (this.libPattern.matcher(libName).find()) {
                return libName;
            }
            return "lib" + libName + ".dylib";
        }

        public Darwin() {
            super(OS.DARWIN);
        }
    }
}

