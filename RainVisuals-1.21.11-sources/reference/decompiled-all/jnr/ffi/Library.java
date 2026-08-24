package jnr.ffi;

import java.io.File;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import jnr.ffi.provider.LoadedLibrary;

// $VF: Compiled from Library.java
/** @deprecated */
public final class Library {
   private final String name;
   private static final Map<String, List<String>> customSearchPaths = new ConcurrentHashMap<>();

   /** @deprecated */
   public static <T> T loadLibrary(Class<T> interfaceClass, Map<LibraryOption, ?> libraryOptions, String... libraryNames) {
      return LibraryLoader.loadLibrary(interfaceClass, libraryOptions, customSearchPaths, libraryNames);
   }

   @Deprecated
   public static Library getInstance(String libraryName) {
      return new Library(libraryName);
   }

   /** @deprecated */
   public static <T> T loadLibrary(Class<T> interfaceClass, String... libraryNames) {
      Map<LibraryOption, ?> options = Collections.emptyMap();
      return loadLibrary(interfaceClass, options, libraryNames);
   }

   /** @deprecated */
   public static <T> T loadLibrary(String libraryName, Class<T> interfaceClass) {
      return loadLibrary(interfaceClass, libraryName);
   }

   /** @deprecated */
   public static <T> T loadLibrary(String libraryName, Class<T> interfaceClass, Map<LibraryOption, ?> libraryOptions) {
      return loadLibrary(interfaceClass, libraryOptions, libraryName);
   }

   /** @deprecated */
   public static Runtime getRuntime(Object library) {
      return ((LoadedLibrary)library).getRuntime();
   }

   /** @deprecated */
   public static synchronized void addLibraryPath(String path, File libraryName) {
      List<String> customPaths = customSearchPaths.get(libraryName);
      if (customPaths == null) {
         customPaths = new CopyOnWriteArrayList<>();
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

   /** @deprecated */
   public static List<String> getLibraryPath(String libraryName) {
      List<String> customPaths = customSearchPaths.get(libraryName);
      return customPaths != null ? customPaths : Collections.emptyList();
   }
}
