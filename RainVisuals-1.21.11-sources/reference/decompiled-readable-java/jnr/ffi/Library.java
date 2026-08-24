/*
 * Decompiled with CFR 0.152.
 */
package jnr.ffi;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jnr.ffi.LibraryLoader;
import jnr.ffi.LibraryOption;
import jnr.ffi.Runtime;
import jnr.ffi.provider.LoadedLibrary;

public final class Library {
    private final String name;
    private static final Map<String, List<String>> customSearchPaths = new ConcurrentHashMap<String, List<String>>();

    public static <T> T loadLibrary(Class<T> interfaceClass, Map<LibraryOption, ?> libraryOptions, String ... libraryNames) {
        return LibraryLoader.loadLibrary(interfaceClass, libraryOptions, customSearchPaths, libraryNames);
    }

    @Deprecated
    public static Library getInstance(String libraryName) {
        return new Library(libraryName);
    }

    public static <T> T loadLibrary(Class<T> interfaceClass, String ... libraryNames) {
        Map options = Collections.emptyMap();
        return Library.loadLibrary(interfaceClass, options, libraryNames);
    }

    public static <T> T loadLibrary(String libraryName, Class<T> interfaceClass) {
        String[] stringArray = new String[1];
        stringArray[0] = libraryName;
        return Library.loadLibrary(interfaceClass, stringArray);
    }

    public static <T> T loadLibrary(String libraryName, Class<T> interfaceClass, Map<LibraryOption, ?> libraryOptions) {
        String[] stringArray = new String[1];
        stringArray[0] = libraryName;
        return Library.loadLibrary(interfaceClass, libraryOptions, stringArray);
    }

    public static Runtime getRuntime(Object library) {
        return ((LoadedLibrary)library).getRuntime();
    }

    public static synchronized void addLibraryPath(String libraryName, File path) {
        List<String> customPaths = customSearchPaths.get(libraryName);
        if (customPaths == null) {
            customPaths = new CopyOnWriteArrayList<String>();
            customSearchPaths.put(libraryName, customPaths);
        }
        customPaths.add(path.getAbsolutePath());
    }

    @Deprecated
    public String getName() {
        return this.name;
    }

    private Library(String libraryName) {
        this.name = libraryName;
    }

    public static List<String> getLibraryPath(String libraryName) {
        List<String> customPaths = customSearchPaths.get(libraryName);
        if (customPaths != null) {
            return customPaths;
        }
        return Collections.emptyList();
    }
}

