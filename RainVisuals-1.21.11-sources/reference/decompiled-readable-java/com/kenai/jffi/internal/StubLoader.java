/*
 * Decompiled with CFR 0.152.
 */
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
import java.util.Locale;
import java.util.Properties;

public class StubLoader {
    public static final String TMPDIR_EXEC_ERROR;
    private static volatile boolean loaded;
    private static final String TMPDIR;
    private static final String JFFI_EXTRACT_DIR = "jffi.extract.dir";
    private static final String jffiExtractName;
    private static final File jffiExtractDir;
    private static final String bootPropertyFilename = "boot.properties";
    private static final String TMPDIR_ENV;
    private static final String bootLibraryPropertyName = "jffi.boot.library.path";
    public static final String TMPDIR_WRITE_ERROR;
    private static volatile Throwable failureCause;
    private static final String TMPDIR_RECOMMENDATION;
    public static final int VERSION_MAJOR;
    private static volatile OS os;
    private static final String versionClassName = "com.kenai.jffi.Version";
    public static final int VERSION_MINOR;
    private static final String JFFI_EXTRACT_NAME = "jffi.extract.name";
    private static volatile CPU cpu;
    private static final Locale LOCALE;
    private static final String stubLibraryName;

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private static String getBootPath() {
        String bootPath = System.getProperty(bootLibraryPropertyName);
        if (bootPath != null) {
            return bootPath;
        }
        InputStream is = StubLoader.getResourceAsStream(bootPropertyFilename);
        if (is != null) {
            Properties p = new Properties();
            try {
                void ex;
                p.load(is);
                String string = p.getProperty(bootLibraryPropertyName);
                return ex;
            }
            catch (IOException ex) {
                String string = null;
                return string;
            }
            finally {
                try {
                    is.close();
                }
                catch (IOException iOException) {}
            }
        }
        return null;
    }

    static {
        VERSION_MAJOR = StubLoader.getVersionField("MAJOR");
        VERSION_MINOR = StubLoader.getVersionField("MINOR");
        LOCALE = Locale.ENGLISH;
        Object[] objectArray = new Object[2];
        objectArray[0] = VERSION_MAJOR;
        objectArray[1] = VERSION_MINOR;
        stubLibraryName = String.format("jffi-%d.%d", objectArray);
        TMPDIR_ENV = Platform.getPlatform().getOS() == Platform.OS.WINDOWS ? "TEMP" : "TMPDIR";
        TMPDIR = System.getProperty("java.io.tmpdir");
        TMPDIR_RECOMMENDATION = "Set `" + TMPDIR_ENV + "` or Java property `java.io.tmpdir` to a read/write path that is not mounted \"noexec\".";
        TMPDIR_WRITE_ERROR = "Unable to write jffi binary stub to `" + TMPDIR + "`.";
        TMPDIR_EXEC_ERROR = "Unable to execute or load jffi binary stub from `" + TMPDIR + "`.";
        os = null;
        cpu = null;
        failureCause = null;
        loaded = false;
        String extractDir = System.getProperty(JFFI_EXTRACT_DIR);
        jffiExtractDir = extractDir != null ? new File(extractDir) : null;
        String extractName = System.getProperty(JFFI_EXTRACT_NAME);
        jffiExtractName = extractName != null ? extractName : null;
        try {
            StubLoader.load();
            loaded = true;
        }
        catch (Throwable throwable) {
            failureCause = throwable;
        }
    }

    private static InputStream getResourceAsStream(String resourceName) {
        ClassLoader[] cls;
        ClassLoader[] classLoaderArray = new ClassLoader[3];
        classLoaderArray[0] = ClassLoader.getSystemClassLoader();
        classLoaderArray[1] = StubLoader.class.getClassLoader();
        classLoaderArray[2] = Thread.currentThread().getContextClassLoader();
        ClassLoader[] classLoaderArray2 = cls = classLoaderArray;
        int n = classLoaderArray2.length;
        for (int i = 0; i < n; ++i) {
            InputStream inputStream;
            ClassLoader cl = classLoaderArray2[i];
            if (cl == null || (inputStream = cl.getResourceAsStream(resourceName)) == null) continue;
            return inputStream;
        }
        return null;
    }

    private static int getVersionField(String name) {
        try {
            Class<?> c = Class.forName(versionClassName);
            return (Integer)c.getField(name).get(c);
        }
        catch (Throwable t) {
            throw new RuntimeException(t);
        }
    }

    private static OS determineOS() {
        String osName = System.getProperty("os.name").split(" ")[0];
        if (Util.startsWithIgnoreCase(osName, "mac", LOCALE) || Util.startsWithIgnoreCase(osName, "darwin", LOCALE)) {
            return OS.DARWIN;
        }
        if (Util.startsWithIgnoreCase(osName, "linux", LOCALE)) {
            return OS.LINUX;
        }
        if (Util.startsWithIgnoreCase(osName, "sunos", LOCALE) || Util.startsWithIgnoreCase(osName, "solaris", LOCALE)) {
            return OS.SOLARIS;
        }
        if (Util.startsWithIgnoreCase(osName, "aix", LOCALE)) {
            return OS.AIX;
        }
        if (Util.startsWithIgnoreCase(osName, "os400", LOCALE) || Util.startsWithIgnoreCase(osName, "os/400", LOCALE)) {
            return OS.IBMI;
        }
        if (Util.startsWithIgnoreCase(osName, "openbsd", LOCALE)) {
            return OS.OPENBSD;
        }
        if (Util.startsWithIgnoreCase(osName, "freebsd", LOCALE)) {
            return OS.FREEBSD;
        }
        if (Util.startsWithIgnoreCase(osName, "dragonfly", LOCALE)) {
            return OS.DRAGONFLY;
        }
        if (Util.startsWithIgnoreCase(osName, "windows", LOCALE)) {
            return OS.WINDOWS;
        }
        throw new RuntimeException("cannot determine operating system");
    }

    private static String getStubLibraryName() {
        return stubLibraryName;
    }

    /*
     * WARNING - void declaration
     */
    private static InputStream getStubLibraryStream() {
        Object[] paths;
        String stubPath = StubLoader.getStubLibraryPath();
        Object[] objectArray = new String[2];
        objectArray[0] = stubPath;
        objectArray[1] = "/" + stubPath;
        Object[] objectArray2 = paths = objectArray;
        int n = objectArray2.length;
        for (int i = 0; i < n; ++i) {
            void var6_6;
            String path = objectArray2[i];
            InputStream is = StubLoader.getResourceAsStream(path);
            if (is == null && StubLoader.getOS() == OS.DARWIN) {
                is = StubLoader.getResourceAsStream(StubLoader.getAlternateLibraryPath(path));
            }
            if (is == null) continue;
            return var6_6;
        }
        throw new UnsatisfiedLinkError("could not locate stub library in jar file.  Tried " + Arrays.deepToString(paths));
    }

    private static void unpackLibrary(File dstFile, InputStream sourceIS) throws IOException {
        try (FileOutputStream os = new FileOutputStream(dstFile);){
            ReadableByteChannel srcChannel = Channels.newChannel(sourceIS);
            long pos = 0L;
            while (sourceIS.available() > 0) {
                pos += os.getChannel().transferFrom(srcChannel, pos, Math.max(4096, sourceIS.available()));
            }
        }
    }

    public static final Throwable getFailureCause() {
        return failureCause;
    }

    public static CPU getCPU() {
        return cpu != null ? cpu : (cpu = StubLoader.determineCPU());
    }

    public static OS getOS() {
        return os != null ? os : (os = StubLoader.determineOS());
    }

    private static IOException tempReadonlyError(IOException ioe) {
        return new IOException(TMPDIR_WRITE_ERROR + " " + TMPDIR_RECOMMENDATION, ioe);
    }

    /*
     * WARNING - void declaration
     */
    private static CPU determineCPU() {
        String archString = System.getProperty("os.arch", "unknown");
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
            if ("little".equals(System.getProperty("sun.cpu.endian"))) {
                return CPU.PPC64LE;
            }
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
            void var4_4;
            CPU cpu = cPUArray[i];
            if (!Util.equalsIgnoreCase(cpu.name(), archString, LOCALE)) continue;
            return var4_4;
        }
        throw new RuntimeException("cannot determine CPU");
    }

    /*
     * WARNING - void declaration
     */
    static File calculateExtractPath(File tmpDirFile) throws IOException {
        void var1_1;
        File dstFile = null == tmpDirFile ? File.createTempFile("jffi", "." + StubLoader.dlExtension()) : File.createTempFile("jffi", "." + StubLoader.dlExtension(), tmpDirFile);
        dstFile.deleteOnExit();
        return var1_1;
    }

    static File calculateExtractPath(File tmpDirFile, String jffiExtractName) throws IOException {
        File file;
        if (jffiExtractName == null) {
            return StubLoader.calculateExtractPath(tmpDirFile);
        }
        if (null == jffiExtractName || jffiExtractName.isEmpty()) {
            jffiExtractName = "jffi-" + VERSION_MAJOR + "." + VERSION_MINOR;
        }
        if (!jffiExtractName.endsWith(StubLoader.dlExtension())) {
            jffiExtractName = jffiExtractName + "." + StubLoader.dlExtension();
        }
        if (null == tmpDirFile) {
            File dstFile = new File(TMPDIR, jffiExtractName);
        } else {
            file = new File(tmpDirFile, jffiExtractName);
        }
        return file;
    }

    /*
     * WARNING - void declaration
     */
    private static void verifyExistingLibrary(File dstFile, InputStream sourceIS) throws IOException {
        int sourceSize = sourceIS.available();
        try {
            FileInputStream targetIS;
            block8: {
                targetIS = new FileInputStream(dstFile);
                try {
                    byte[] targetDigest;
                    int targetSize = targetIS.available();
                    if (targetSize != sourceSize) {
                        throw StubLoader.sizeMismatchError(dstFile, sourceSize, targetSize);
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
                    if (Arrays.equals(sourceDigest, targetDigest = targetMD.digest())) break block8;
                    throw StubLoader.digestMismatchError(dstFile);
                }
                catch (Throwable throwable) {
                    try {
                        targetIS.close();
                    }
                    catch (Throwable throwable2) {
                        throwable.addSuppressed(throwable2);
                    }
                    throw throwable;
                }
            }
            targetIS.close();
        }
        catch (NoSuchAlgorithmException nsae) {
            void var3_4;
            throw new IOException((Throwable)var3_4);
        }
    }

    private static void loadFromJar(File tmpDirFile) throws IOException, LinkageError {
        File dstFile;
        String jffiExtractName = StubLoader.jffiExtractName;
        try {
            InputStream sourceIS;
            block12: {
                sourceIS = StubLoader.getStubLibraryStream();
                try {
                    dstFile = StubLoader.calculateExtractPath(tmpDirFile, jffiExtractName);
                    if (jffiExtractName != null && dstFile.exists()) {
                        StubLoader.verifyExistingLibrary(dstFile, sourceIS);
                        break block12;
                    }
                    StubLoader.unpackLibrary(dstFile, sourceIS);
                }
                catch (Throwable throwable) {
                    if (sourceIS != null) {
                        try {
                            sourceIS.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
            }
            if (sourceIS != null) {
                sourceIS.close();
            }
        }
        catch (IOException ioe) {
            throw StubLoader.tempReadonlyError(ioe);
        }
        try {
            System.load(dstFile.getAbsolutePath());
            if (null == jffiExtractName) {
                dstFile.delete();
            }
        }
        catch (UnsatisfiedLinkError unsatisfiedLinkError) {
            throw StubLoader.tempLoadError(unsatisfiedLinkError);
        }
    }

    /*
     * WARNING - void declaration
     */
    private static boolean loadFromBootPath(String libName, String bootPath, Collection<Throwable> errors) {
        String[] dirs = bootPath.split(File.pathSeparator);
        int i = 0;
        while (i < dirs.length) {
            void var4_4;
            String soname = System.mapLibraryName(libName);
            File stub = new File(new File(dirs[i], StubLoader.getPlatformName()), soname);
            if (!stub.isFile()) {
                stub = new File(new File(dirs[i]), soname);
            }
            String path = stub.getAbsolutePath();
            if (stub.isFile()) {
                try {
                    System.load(path);
                    return true;
                }
                catch (UnsatisfiedLinkError ex) {
                    errors.add(ex);
                }
            }
            if (StubLoader.getOS() == OS.DARWIN && new File(path = StubLoader.getAlternateLibraryPath(path)).isFile()) {
                try {
                    System.load(path);
                    return true;
                }
                catch (UnsatisfiedLinkError ex) {
                    void var8_10;
                    errors.add((Throwable)var8_10);
                }
            }
            ++var4_4;
        }
        return false;
    }

    private static String getAlternateLibraryPath(String path) {
        if (path.endsWith("dylib")) {
            return path.substring(0, path.lastIndexOf("dylib")) + "jnilib";
        }
        return path.substring(0, path.lastIndexOf("jnilib")) + "dylib";
    }

    private static UnsatisfiedLinkError tempLoadError(UnsatisfiedLinkError ule) {
        return new UnsatisfiedLinkError(TMPDIR_EXEC_ERROR + " " + TMPDIR_RECOMMENDATION + "\n" + ule.getLocalizedMessage());
    }

    public static final boolean isLoaded() {
        return loaded;
    }

    public static String getPlatformName() {
        if (StubLoader.getOS().equals((Object)OS.DARWIN)) {
            return "Darwin";
        }
        String osName = System.getProperty("os.name").split(" ")[0];
        return StubLoader.getCPU().name().toLowerCase(LOCALE) + "-" + osName;
    }

    private static SecurityException digestMismatchError(File dstFile) {
        return new SecurityException("digest mismatch: " + dstFile + " does not match packaged library");
    }

    static String dlExtension() {
        switch (StubLoader.getOS()) {
            case WINDOWS: {
                return "dll";
            }
            case DARWIN: {
                return "dylib";
            }
        }
        return "so";
    }

    private static SecurityException sizeMismatchError(File dstFile, int sourceSize, int targetSize) {
        return new SecurityException("file size mismatch: " + dstFile + " (" + targetSize + ") does not match packaged library (" + sourceSize + ")");
    }

    /*
     * WARNING - void declaration
     */
    static void load() {
        String libName = StubLoader.getStubLibraryName();
        ArrayList<Throwable> errors = new ArrayList<Throwable>();
        String bootPath = StubLoader.getBootPath();
        if (bootPath != null) {
            if (StubLoader.loadFromBootPath(libName, bootPath, errors)) {
                return;
            }
        }
        String libraryPath = System.getProperty("java.library.path");
        if (libraryPath != null) {
            if (StubLoader.loadFromBootPath(libName, libraryPath, errors)) {
                return;
            }
        }
        if (jffiExtractDir != null) {
            try {
                StubLoader.loadFromJar(jffiExtractDir);
                return;
            }
            catch (SecurityException se) {
                void t1;
                throw t1;
            }
            catch (Throwable t1) {
                UnsatisfiedLinkError ule = new UnsatisfiedLinkError("could not load jffi library from " + jffiExtractDir);
                ule.initCause(t1);
                throw ule;
            }
        }
        try {
            StubLoader.loadFromJar(null);
            return;
        }
        catch (SecurityException t) {
            throw t;
        }
        catch (Throwable t) {
            try {
                StubLoader.loadFromJar(new File(System.getProperty("user.dir")));
            }
            catch (SecurityException t1) {
                throw t1;
            }
            catch (Throwable t1) {
                errors.add(t1);
            }
            if (!errors.isEmpty()) {
                Collections.reverse(errors);
                CharArrayWriter caw = new CharArrayWriter();
                PrintWriter pw = new PrintWriter(caw);
                for (Throwable t2 : errors) {
                    t2.printStackTrace(pw);
                }
                throw new UnsatisfiedLinkError(new String(caw.toCharArray()));
            }
            return;
        }
    }

    private static String getStubLibraryPath() {
        String mappedLibraryName = OS.IBMI.equals((Object)StubLoader.getOS()) ? "lib" + stubLibraryName + ".so" : System.mapLibraryName(stubLibraryName);
        return "jni/" + StubLoader.getPlatformName() + "/" + mappedLibraryName;
    }

    public static final class CPU
    extends Enum<CPU> {
        public static final /* enum */ CPU MIPS64EL;
        public static final /* enum */ CPU LOONGARCH64;
        public static final /* enum */ CPU ARM;
        public static final /* enum */ CPU S390X;
        public static final /* enum */ CPU I386;
        public static final /* enum */ CPU SPARCV9;
        public static final /* enum */ CPU PPC64LE;
        private static final /* synthetic */ CPU[] $VALUES;
        public static final /* enum */ CPU PPC64;
        public static final /* enum */ CPU AARCH64;
        public static final /* enum */ CPU SPARC;
        public static final /* enum */ CPU PPC;
        public static final /* enum */ CPU X86_64;
        public static final /* enum */ CPU UNKNOWN;
        public static final /* enum */ CPU RISCV64;
        public static final /* enum */ CPU MIPSEL;

        public String toString() {
            return this.name().toLowerCase(LOCALE);
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

        public static CPU[] values() {
            return (CPU[])$VALUES.clone();
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
            ARM = new CPU();
            AARCH64 = new CPU();
            LOONGARCH64 = new CPU();
            MIPSEL = new CPU();
            MIPS64EL = new CPU();
            RISCV64 = new CPU();
            UNKNOWN = new CPU();
            $VALUES = CPU.$values();
        }

        public static CPU valueOf(String name) {
            return Enum.valueOf(CPU.class, name);
        }
    }

    public static final class OS
    extends Enum<OS> {
        public static final /* enum */ OS DRAGONFLY;
        public static final /* enum */ OS UNKNOWN;
        public static final /* enum */ OS WINDOWS;
        private static final /* synthetic */ OS[] $VALUES;
        public static final /* enum */ OS ZLINUX;
        public static final /* enum */ OS IBMI;
        public static final /* enum */ OS LINUX;
        public static final /* enum */ OS FREEBSD;
        public static final /* enum */ OS SOLARIS;
        public static final /* enum */ OS OPENBSD;
        public static final /* enum */ OS NETBSD;
        public static final /* enum */ OS DARWIN;
        public static final /* enum */ OS AIX;

        public String toString() {
            return this.name().toLowerCase(LOCALE);
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

        public static OS valueOf(String name) {
            return Enum.valueOf(OS.class, name);
        }

        public static OS[] values() {
            return (OS[])$VALUES.clone();
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
    }
}

