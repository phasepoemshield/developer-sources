/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.kohlschutter.annotations.compiletime.SuppressFBWarnings
 */
package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.Closeable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;
import org.newsclub.net.unix.AFSocket;
import org.newsclub.net.unix.BuildProperties;
import org.newsclub.net.unix.NativeUnixSocket;

@SuppressFBWarnings(value={"RCN_REDUNDANT_NULLCHECK_OF_NONNULL_VALUE"})
final class NativeLibraryLoader
implements Closeable {
    private static final String PROP_LIBRARY_DISABLE = "org.newsclub.net.unix.library.disable";
    private static final String PROP_LIBRARY_OVERRIDE = "org.newsclub.net.unix.library.override";
    private static final String PROP_LIBRARY_OVERRIDE_FORCE = "org.newsclub.net.unix.library.override.force";
    private static final String PROP_LIBRARY_TMPDIR = "org.newsclub.net.unix.library.tmpdir";
    private static final File TEMP_DIR;
    private static final String OS_NAME_SIMPLIFIED;
    private static final List<String> ARCHITECTURE_AND_OS;
    private static final String LIBRARY_NAME = "junixsocket-native";
    private static final AtomicBoolean LOADED;
    private static final boolean IS_ANDROID;

    NativeLibraryLoader() {
    }

    static File tempDir() {
        return TEMP_DIR;
    }

    /*
     * WARNING - void declaration
     */
    private List<LibraryCandidate> tryProviderClass(String providerClassname, String artifactName) throws IOException, ClassNotFoundException {
        void var3_3;
        Class<?> providerClass = Class.forName(providerClassname);
        String[] stringArray = new String[1];
        stringArray[0] = artifactName;
        String version = NativeLibraryLoader.getArtifactVersion(providerClass, stringArray);
        String libraryNameAndVersion = "junixsocket-native-" + version;
        return this.findLibraryCandidates(artifactName, libraryNameAndVersion, (Class<?>)var3_3);
    }

    public static String getJunixsocketVersion() throws IOException {
        String v = BuildProperties.getBuildProperties().get("git.build.version");
        if (v != null && !v.startsWith("$")) {
            return v;
        }
        String[] stringArray = new String[1];
        stringArray[0] = "junixsocket-common";
        return NativeLibraryLoader.getArtifactVersion(AFSocket.class, stringArray);
    }

    private static String getArtifactVersion(Class<?> providerClass, String ... artifactNames) throws IOException {
        String[] stringArray = artifactNames;
        int n = stringArray.length;
        int n2 = 0;
        if (n2 < n) {
            String artifactName = stringArray[n2];
            Properties p = new Properties();
            String resource = "/META-INF/maven/com.kohlschutter.junixsocket/" + artifactName + "/pom.properties";
            try (InputStream in = providerClass.getResourceAsStream(resource);){
                if (in == null) {
                    throw new FileNotFoundException("Could not find resource " + resource + " relative to " + String.valueOf(providerClass));
                }
                p.load(in);
                String version = p.getProperty("version");
                Objects.requireNonNull(version, "Could not read version from pom.properties");
                String string = version;
                return string;
            }
        }
        throw new IllegalStateException("No artifact names specified");
    }

    private synchronized void setLoaded(String library) {
        NativeLibraryLoader.setLoaded0(library);
    }

    /*
     * WARNING - void declaration
     */
    @SuppressFBWarnings(value={"THROWS_METHOD_THROWS_RUNTIMEEXCEPTION"})
    private static synchronized void setLoaded0(String library) {
        if (LOADED.compareAndSet(false, true)) {
            NativeUnixSocket.setLoaded(true);
            AFSocket.loadedLibrary = library;
            try {
                NativeUnixSocket.init();
            }
            catch (RuntimeException e) {
                throw e;
            }
            catch (Exception e) {
                void var1_2;
                throw new IllegalStateException((Throwable)var1_2);
            }
        }
    }

    /*
     * WARNING - void declaration
     */
    private Throwable loadLibraryOverride() {
        boolean overrideIsAbsolute;
        String libraryOverride = System.getProperty(PROP_LIBRARY_OVERRIDE, "");
        String libraryOverrideForce = System.getProperty(PROP_LIBRARY_OVERRIDE_FORCE, "false");
        try {
            overrideIsAbsolute = libraryOverrideForce.length() <= 5 ? false : new File(libraryOverrideForce).isAbsolute();
        }
        catch (Exception e) {
            overrideIsAbsolute = false;
            e.printStackTrace();
        }
        if (libraryOverride.isEmpty()) {
            if (overrideIsAbsolute) {
                libraryOverride = libraryOverrideForce;
                libraryOverrideForce = "true";
            }
        }
        if (!libraryOverride.isEmpty()) {
            try {
                System.load(libraryOverride);
                this.setLoaded(libraryOverride);
                return null;
            }
            catch (Exception | LinkageError e) {
                void var4_5;
                if (Boolean.parseBoolean(libraryOverrideForce)) {
                    throw var4_5;
                }
                return var4_5;
            }
        }
        return new Exception("No library specified with -Dorg.newsclub.net.unix.library.override=");
    }

    private static Object loadLibrarySyncMonitor() {
        ClassLoader monitor = NativeLibraryLoader.class.getClassLoader();
        if (monitor == null) {
            return NativeLibraryLoader.class;
        }
        return monitor;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    public synchronized void loadLibrary() {
        Object object = NativeLibraryLoader.loadLibrarySyncMonitor();
        synchronized (object) {
            void var6_7;
            if (LOADED.get()) {
                return;
            }
            NativeUnixSocket.initPre();
            if ("provided".equals(System.getProperty(PROP_LIBRARY_OVERRIDE_FORCE, ""))) {
                this.setLoaded("provided");
                return;
            }
            boolean provided = false;
            try {
                NativeUnixSocket.noop();
                provided = true;
            }
            catch (Exception | UnsatisfiedLinkError throwable) {
            }
            if (provided) {
                this.setLoaded("provided");
                return;
            }
            if (Boolean.parseBoolean(System.getProperty(PROP_LIBRARY_DISABLE, "false"))) {
                throw this.initCantLoadLibraryError(Collections.singletonList(new UnsupportedOperationException("junixsocket disabled by System.property org.newsclub.net.unix.library.disable")));
            }
            ArrayList<Throwable> suppressedThrowables = new ArrayList<Throwable>();
            Throwable ex = this.loadLibraryOverride();
            if (ex == null) {
                return;
            }
            suppressedThrowables.add(ex);
            List<LibraryCandidate> candidates = this.initLibraryCandidates(suppressedThrowables);
            String loadedLibraryId = null;
            for (LibraryCandidate candidate : candidates) {
                try {
                    loadedLibraryId = candidate.load();
                    if (loadedLibraryId == null) continue;
                    break;
                }
                catch (Exception | LinkageError e) {
                    suppressedThrowables.add(e);
                }
            }
            for (LibraryCandidate libraryCandidate : candidates) {
                libraryCandidate.close();
            }
            if (loadedLibraryId == null) {
                throw this.initCantLoadLibraryError(suppressedThrowables);
            }
            this.setLoaded((String)var6_7);
        }
    }

    /*
     * WARNING - void declaration
     */
    private UnsatisfiedLinkError initCantLoadLibraryError(List<Throwable> suppressedThrowables) {
        void var4_4;
        String message;
        block6: {
            block5: {
                message = "Could not load native library junixsocket-native for architecture " + String.valueOf(ARCHITECTURE_AND_OS);
                String cp = System.getProperty("java.class.path", "");
                if (cp.contains("junixsocket-native-custom/target-eclipse")) break block5;
                if (!cp.contains("junixsocket-native-common/target-eclipse")) break block6;
            }
            message = message + "\n\n*** ECLIPSE USERS ***\nIf you're running from within Eclipse, please close the projects \"junixsocket-native-common\" and \"junixsocket-native-custom\"\n";
        }
        UnsatisfiedLinkError e = new UnsatisfiedLinkError(message);
        if (suppressedThrowables != null) {
            for (Throwable suppressed : suppressedThrowables) {
                e.addSuppressed(suppressed);
            }
        }
        throw var4_4;
    }

    /*
     * WARNING - void declaration
     */
    private List<LibraryCandidate> initLibraryCandidates(List<Throwable> suppressedThrowables) {
        void var2_2;
        ArrayList<LibraryCandidate> candidates = new ArrayList<LibraryCandidate>();
        try {
            String[] stringArray = new String[2];
            stringArray[0] = "junixsocket-common";
            stringArray[1] = "junixsocket-core";
            String version = NativeLibraryLoader.getArtifactVersion(this.getClass(), stringArray);
            if (version != null) {
                candidates.add(new StandardLibraryCandidate(version));
            }
        }
        catch (Exception e) {
            suppressedThrowables.add(e);
        }
        try {
            candidates.addAll(this.tryProviderClass("org.newsclub.lib.junixsocket.custom.NarMetadata", "junixsocket-native-custom"));
        }
        catch (Exception e) {
            suppressedThrowables.add(e);
        }
        try {
            candidates.addAll(this.tryProviderClass("org.newsclub.lib.junixsocket.common.NarMetadata", "junixsocket-native-common"));
        }
        catch (Exception exception) {
            suppressedThrowables.add(exception);
        }
        candidates.add(new StandardLibraryCandidate(null));
        return var2_2;
    }

    private static String lookupArchProperty(String key, String defaultVal) {
        return System.getProperty(key, defaultVal).replaceAll("[ /\\\\'\";:\\$]", "");
    }

    private static List<String> architectureAndOS() {
        String arch = NativeLibraryLoader.lookupArchProperty("os.arch", "UnknownArch");
        ArrayList<String> list = new ArrayList<String>();
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

    private static boolean checkAndroid() {
        String vmName = NativeLibraryLoader.lookupArchProperty("java.vm.name", "UnknownVM");
        String vmSpecVendor = NativeLibraryLoader.lookupArchProperty("java.vm.specification.vendor", "UnknownSpecificationVendor");
        return "Dalvik".equals(vmName) || vmSpecVendor.contains("Android");
    }

    static boolean isAndroid() {
        return IS_ANDROID;
    }

    static List<String> getArchitectureAndOS() {
        return ARCHITECTURE_AND_OS;
    }

    /*
     * Loose catch block
     */
    private static URL validateResourceURL(URL url) {
        URL uRL;
        InputStream unused;
        block9: {
            if (url == null) {
                return null;
            }
            unused = url.openStream();
            uRL = url;
            if (unused == null) break block9;
            unused.close();
        }
        return uRL;
        {
            catch (Throwable throwable) {
                try {
                    if (unused != null) {
                        try {
                            unused.close();
                        }
                        catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                }
                catch (IOException iOException) {
                    return null;
                }
            }
        }
    }

    private static String mapLibraryName(String libraryNameAndVersion) {
        Object mappedName = System.mapLibraryName(libraryNameAndVersion);
        if (((String)mappedName).endsWith(".so")) {
            switch (OS_NAME_SIMPLIFIED) {
                case "AIX": {
                    mappedName = ((String)mappedName).substring(0, ((String)mappedName).length() - 3) + ".a";
                    break;
                }
                case "OS400": {
                    mappedName = ((String)mappedName).substring(0, ((String)mappedName).length() - 3) + ".srvpgm";
                    break;
                }
            }
        }
        return mappedName;
    }

    /*
     * WARNING - void declaration
     */
    private List<LibraryCandidate> findLibraryCandidates(String artifactName, String libraryNameAndVersion, Class<?> providerClass) {
        void var6_6;
        String[] stringArray;
        String mappedName = NativeLibraryLoader.mapLibraryName(libraryNameAndVersion);
        if (mappedName.startsWith("lib")) {
            String[] stringArray2 = new String[1];
            stringArray = stringArray2;
            stringArray2[0] = "";
        } else {
            String[] stringArray3 = new String[2];
            stringArray3[0] = "";
            stringArray = stringArray3;
            stringArray3[1] = "lib";
        }
        String[] prefixes = stringArray;
        ArrayList<ClasspathLibraryCandidate> list = new ArrayList<ClasspathLibraryCandidate>();
        for (String archOs : ARCHITECTURE_AND_OS) {
            String[] stringArray4 = new String[2];
            stringArray4[0] = "clang";
            stringArray4[1] = "gcc";
            String[] stringArray5 = stringArray4;
            int n = stringArray5.length;
            for (int i = 0; i < n; ++i) {
                String compiler = stringArray5[i];
                String[] stringArray6 = prefixes;
                int n2 = stringArray6.length;
                for (int j = 0; j < n2; ++j) {
                    void var18_18;
                    void var19_19;
                    String nodepsPath;
                    String prefix = stringArray6[j];
                    String path = "/lib/" + archOs + "-" + compiler + "/jni/" + prefix + mappedName;
                    URL url = NativeLibraryLoader.validateResourceURL(providerClass.getResource(path));
                    if (url != null) {
                        list.add(new ClasspathLibraryCandidate(artifactName, libraryNameAndVersion, path, url));
                    }
                    if ((nodepsPath = this.nodepsPath(path)) == null) continue;
                    url = NativeLibraryLoader.validateResourceURL(providerClass.getResource(nodepsPath));
                    if (url == null) continue;
                    list.add(new ClasspathLibraryCandidate(artifactName, libraryNameAndVersion, (String)var19_19, (URL)var18_18));
                }
            }
        }
        return var6_6;
    }

    private String nodepsPath(String path) {
        int lastDot = path.lastIndexOf(46);
        if (lastDot == -1) {
            return null;
        }
        return path.substring(0, lastDot) + ".nodeps" + path.substring(lastDot);
    }

    @Override
    public void close() {
    }

    static {
        OS_NAME_SIMPLIFIED = NativeLibraryLoader.lookupArchProperty("os.name", "UnknownOS");
        ARCHITECTURE_AND_OS = NativeLibraryLoader.architectureAndOS();
        LOADED = new AtomicBoolean(false);
        IS_ANDROID = NativeLibraryLoader.checkAndroid();
        String dir = System.getProperty(PROP_LIBRARY_TMPDIR, null);
        TEMP_DIR = dir == null ? null : new File(dir);
    }

    private static abstract class LibraryCandidate
    implements Closeable {
        protected final String libraryNameAndVersion;

        protected LibraryCandidate(String libraryNameAndVersion) {
            this.libraryNameAndVersion = libraryNameAndVersion;
        }

        @SuppressFBWarnings(value={"THROWS_METHOD_THROWS_CLAUSE_BASIC_EXCEPTION"})
        abstract String load() throws Exception;

        @Override
        public abstract void close();

        public String toString() {
            return super.toString() + "[" + this.libraryNameAndVersion + "]";
        }
    }

    private static final class StandardLibraryCandidate
    extends LibraryCandidate {
        @Override
        public String toString() {
            return super.toString() + "(standard library path)";
        }

        @Override
        public void close() {
        }

        @Override
        @SuppressFBWarnings(value={"THROWS_METHOD_THROWS_CLAUSE_BASIC_EXCEPTION"})
        String load() throws Exception, LinkageError {
            if (this.libraryNameAndVersion != null) {
                System.loadLibrary(this.libraryNameAndVersion);
                return this.libraryNameAndVersion;
            }
            return null;
        }

        StandardLibraryCandidate(String version) {
            super((String)(version == null ? NativeLibraryLoader.LIBRARY_NAME : "junixsocket-native-" + version));
        }
    }

    private static final class ClasspathLibraryCandidate
    extends LibraryCandidate {
        private final String path;
        private final URL library;
        private final String artifactName;

        /*
         * WARNING - Removed try catching itself - possible behaviour change.
         * Unable to fully structure code
         */
        @Override
        synchronized String load() throws IOException, LinkageError {
            if (this.libraryNameAndVersion == null) {
                return null;
            }
            libDir = NativeLibraryLoader.TEMP_DIR;
            block21: for (attempt = 0; attempt < 3; ++attempt) {
                libFile = File.createTempFile("libtmp", System.mapLibraryName(this.libraryNameAndVersion), libDir);
                libraryIn = this.library.openStream();
                try {
                    out = new FileOutputStream(libFile);
                    try {
                        buf = new byte[4096];
                        while ((read = libraryIn.read(buf)) >= 0) {
                            out.write(buf, 0, read);
                        }
                    }
                    finally {
                        out.close();
                    }
                }
                finally {
                    if (libraryIn != null) {
                        libraryIn.close();
                    }
                }
                try {
                    System.load(libFile.getAbsolutePath());
                    break;
                }
                catch (UnsatisfiedLinkError e) {
                    switch (attempt) {
                        case 0: {
                            libDir = new File(System.getProperty("user.home", "."));
                            ** break;
lbl34:
                            // 1 sources

                            continue block21;
                        }
                        case 1: {
                            libDir = new File(System.getProperty("user.dir", "."));
                            ** break;
lbl38:
                            // 1 sources

                            continue block21;
                        }
                        default: {
                            throw e;
                        }
                    }
                }
                finally {
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

        ClasspathLibraryCandidate(String artifactName, String libraryNameAndVersion, String path, URL library) {
            super(libraryNameAndVersion);
            this.artifactName = artifactName;
            this.path = path;
            this.library = library;
        }
    }
}

