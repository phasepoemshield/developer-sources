/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi.provider.jffi;

import com.kenai.jffi.Library;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jnr.ffi.LibraryOption;
import jnr.ffi.Platform;
import jnr.ffi.Runtime;
import jnr.ffi.provider.jffi.NativeRuntime;
import jnr.ffi.provider.jffi.SymbolNotFoundError;

public class NativeLibrary {
    private final List<String> searchPaths;
    private final List<String> libraryNames;
    private final List<String> successfulPaths = new ArrayList<String>();
    private static final Pattern BAD_ELF = Pattern.compile("(.*): (invalid ELF header|file too short|invalid file format)");
    private volatile List<Library> nativeLibraries = Collections.emptyList();
    private final Map<LibraryOption, Object> options;
    private static final Pattern ELF_GROUP = Pattern.compile("GROUP\\s*\\(\\s*(\\S*).*\\)");

    NativeLibrary(Collection<String> libraryNames, Collection<String> searchPaths, Map<LibraryOption, Object> options) {
        this.libraryNames = Collections.unmodifiableList(new ArrayList<String>(libraryNames));
        this.searchPaths = Collections.unmodifiableList(new ArrayList<String>(searchPaths));
        this.options = options;
        if (options.containsKey((Object)LibraryOption.LoadNow)) {
            this.getNativeLibraries();
        }
    }

    private synchronized List<Library> getNativeLibraries() {
        if (!this.nativeLibraries.isEmpty()) {
            return this.nativeLibraries;
        }
        this.nativeLibraries = this.loadNativeLibraries();
        return this.nativeLibraries;
    }

    /*
     * WARNING - void declaration
     */
    private static Library openLibrary(String path, List<String> successfulPaths) {
        Library lib = Library.getCachedInstance(path, 9);
        if (lib != null) {
            successfulPaths.add(path);
            return lib;
        }
        Matcher badElf = BAD_ELF.matcher(Library.getLastError());
        if (badElf.lookingAt()) {
            Matcher sharedObject;
            File f = new File(badElf.group(1));
            if (f.isFile() && f.length() < 4096L && (sharedObject = ELF_GROUP.matcher(NativeLibrary.readAll(f))).find()) {
                void var2_2;
                lib = Library.getCachedInstance(sharedObject.group(1), 9);
                if (lib != null) {
                    successfulPaths.add(path);
                }
                return var2_2;
            }
        }
        return null;
    }

    /*
     * WARNING - void declaration
     */
    private synchronized List<Library> loadNativeLibraries() {
        void var1_1;
        ArrayList<Library> libs = new ArrayList<Library>();
        Iterator<String> iterator2 = this.libraryNames.iterator();
        while (iterator2.hasNext()) {
            String libraryName = iterator2.next();
            if (libraryName == null) continue;
            if (libraryName.equals("RTLD_DEFAULT")) {
                libs.add(Library.getDefault());
                continue;
            }
            Library lib = NativeLibrary.openLibrary(libraryName, this.successfulPaths);
            if (lib == null) {
                String path = this.locateLibrary(libraryName);
                if (!libraryName.equals(path)) {
                    lib = NativeLibrary.openLibrary(path, this.successfulPaths);
                }
            }
            if (lib == null) {
                throw new UnsatisfiedLinkError(Library.getLastError() + "\nLibrary names\n" + this.libraryNames.toString() + "\nSearch paths:\n" + this.searchPaths.toString());
            }
            libs.add(lib);
        }
        this.putLibraryIntoRuntime();
        return Collections.unmodifiableList(var1_1);
    }

    private void putLibraryIntoRuntime() {
        if (Runtime.getSystemRuntime() instanceof NativeRuntime) {
            ((NativeRuntime)Runtime.getSystemRuntime()).loadedLibraries.put(this, new LoadedLibraryData(this.libraryNames, this.searchPaths, this.successfulPaths));
        }
    }

    /*
     * WARNING - void declaration
     */
    long findSymbolAddress(String name) {
        void var2_2;
        long address = this.getSymbolAddress(name);
        if (address == 0L) {
            throw new SymbolNotFoundError(Library.getLastError());
        }
        return (long)var2_2;
    }

    /*
     * WARNING - void declaration
     */
    long getSymbolAddress(String name) {
        Iterator<Library> iterator2 = this.getNativeLibraries().iterator();
        while (iterator2.hasNext()) {
            void var4_4;
            Library l = iterator2.next();
            long address = l.getSymbolAddress(name);
            if (address == 0L) continue;
            return (long)var4_4;
        }
        return 0L;
    }

    private String locateLibrary(String libraryName) {
        return Platform.getNativePlatform().locateLibrary(libraryName, this.searchPaths, this.options);
    }

    /*
     * WARNING - void declaration
     */
    private static String readAll(File f) {
        BufferedReader br = null;
        try {
            String line;
            br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
            StringBuilder sb = new StringBuilder();
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
            String string = sb.toString();
            return string;
        }
        catch (FileNotFoundException e) {
            void ioe;
            throw new RuntimeException((Throwable)ioe);
        }
        catch (IOException ioe) {
            void var2_4;
            throw new RuntimeException((Throwable)var2_4);
        }
        finally {
            if (br != null) {
                try {
                    br.close();
                }
                catch (IOException e) {
                    void var7_9;
                    throw new RuntimeException((Throwable)var7_9);
                }
            }
        }
    }

    public static class LoadedLibraryData {
        private final List<String> libraryNames;
        private final List<String> successfulPaths;
        private final List<String> searchPaths;

        LoadedLibraryData(List<String> libraryNames, List<String> searchPaths, List<String> successfulPaths) {
            this.libraryNames = Collections.unmodifiableList(libraryNames);
            this.searchPaths = Collections.unmodifiableList(searchPaths);
            this.successfulPaths = Collections.unmodifiableList(successfulPaths);
        }

        public List<String> getSearchPaths() {
            return this.searchPaths;
        }

        public List<String> getSuccessfulPaths() {
            return this.successfulPaths;
        }

        /*
         * Enabled force condition propagation
         * Lifted jumps to return sites
         */
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (!(o instanceof LoadedLibraryData)) {
                return false;
            }
            LoadedLibraryData that = (LoadedLibraryData)o;
            if (!Objects.equals(this.libraryNames, that.libraryNames)) return false;
            if (!Objects.equals(this.searchPaths, that.searchPaths)) return false;
            if (!Objects.equals(this.successfulPaths, that.successfulPaths)) return false;
            return true;
        }

        public int hashCode() {
            Object[] objectArray = new Object[3];
            objectArray[0] = this.libraryNames;
            objectArray[1] = this.searchPaths;
            objectArray[2] = this.successfulPaths;
            return Objects.hash(objectArray);
        }

        public List<String> getLibraryNames() {
            return this.libraryNames;
        }

        public String toString() {
            return "LoadedLibraryData {libraryNames=" + this.libraryNames + ", searchPaths=" + this.searchPaths + ", successfulPaths=" + this.successfulPaths + '}';
        }
    }
}

