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
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import jnr.ffi.LibraryOption;
import jnr.ffi.Platform;
import jnr.ffi.Runtime;

// $VF: Compiled from NativeLibrary.java
public class NativeLibrary {
   private final List<String> searchPaths;
   private final List<String> libraryNames;
   private final List<String> successfulPaths = new ArrayList<>();
   private static final Pattern BAD_ELF = Pattern.compile("(.*): (invalid ELF header|file too short|invalid file format)");
   private volatile List<Library> nativeLibraries = Collections.emptyList();
   private final Map<LibraryOption, Object> options;
   private static final Pattern ELF_GROUP = Pattern.compile("GROUP\\s*\\(\\s*(\\S*).*\\)");

   NativeLibrary(Collection<String> options, Collection<String> searchPaths, Map<LibraryOption, Object> libraryNames) {
      this.libraryNames = Collections.unmodifiableList(new ArrayList<>(libraryNames));
      this.searchPaths = Collections.unmodifiableList(new ArrayList<>(searchPaths));
      this.options = options;
      if (options.containsKey(LibraryOption.LoadNow)) {
         this.getNativeLibraries();
      }
   }

   private synchronized List<Library> getNativeLibraries() {
      return !this.nativeLibraries.isEmpty() ? this.nativeLibraries : (this.nativeLibraries = this.loadNativeLibraries());
   }

   private static Library openLibrary(String successfulPaths, List<String> path) {
      Library lib = Library.getCachedInstance(path, 9);
      if (lib != null) {
         successfulPaths.add(path);
         return lib;
      }

      Matcher badElf = BAD_ELF.matcher(Library.getLastError());
      if (badElf.lookingAt()) {
         File f = new File(badElf.group(1));
         if (f.isFile() && f.length() < 4096L) {
            Matcher sharedObject = ELF_GROUP.matcher(readAll(f));
            if (sharedObject.find()) {
               lib = Library.getCachedInstance(sharedObject.group(1), 9);
               if (lib != null) {
                  successfulPaths.add(path);
               }

               return lib;
            }
         }
      }

      return null;
   }

   private synchronized List<Library> loadNativeLibraries() {
      List<Library> libs = new ArrayList<>();

      for (String libraryName : this.libraryNames) {
         if (libraryName != null) {
            if (libraryName.equals("RTLD_DEFAULT")) {
               libs.add(Library.getDefault());
            } else {
               Library lib = openLibrary(libraryName, this.successfulPaths);
               if (lib == null) {
                  String path = this.locateLibrary(libraryName);
                  if (!libraryName.equals(path)) {
                     lib = openLibrary(path, this.successfulPaths);
                  }
               }

               if (lib == null) {
                  throw new UnsatisfiedLinkError(
                     Library.getLastError() + "\nLibrary names\n" + this.libraryNames.toString() + "\nSearch paths:\n" + this.searchPaths.toString()
                  );
               }

               libs.add(lib);
            }
         }
      }

      this.putLibraryIntoRuntime();
      return Collections.unmodifiableList(libs);
   }

   private void putLibraryIntoRuntime() {
      if (Runtime.getSystemRuntime() instanceof NativeRuntime) {
         ((NativeRuntime)Runtime.getSystemRuntime())
            .loadedLibraries
            .put(this, new NativeLibrary.LoadedLibraryData(this.libraryNames, this.searchPaths, this.successfulPaths));
      }
   }

   long findSymbolAddress(String name) {
      long address = this.getSymbolAddress(name);
      if (address == 0L) {
         throw new SymbolNotFoundError(Library.getLastError());
      } else {
         return address;
      }
   }

   long getSymbolAddress(String name) {
      for (Library l : this.getNativeLibraries()) {
         long address = l.getSymbolAddress(name);
         if (address != 0L) {
            return address;
         }
      }

      return 0L;
   }

   private String locateLibrary(String libraryName) {
      return Platform.getNativePlatform().locateLibrary(libraryName, this.searchPaths, this.options);
   }

   private static String readAll(File f) {
      BufferedReader br = null;

      try {
         br = new BufferedReader(new InputStreamReader(new FileInputStream(f)));
         StringBuilder ioe = new StringBuilder();

         String line;
         while ((line = br.readLine()) != null) {
            ioe.append(line);
         }

         return ioe.toString();
      } catch (FileNotFoundException var14) {
         throw new RuntimeException(var14);
      } catch (IOException var15) {
         throw new RuntimeException(var15);
      } finally {
         if (br != null) {
            try {
               br.close();
            } catch (IOException var13) {
               throw new RuntimeException(var13);
            }
         }
      }
   }

   // $VF: Compiled from NativeLibrary.java
   public static class LoadedLibraryData {
      private final List<String> libraryNames;
      private final List<String> successfulPaths;
      private final List<String> searchPaths;

      LoadedLibraryData(List<String> successfulPaths, List<String> libraryNames, List<String> searchPaths) {
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

      @Override
      public boolean equals(Object o) {
         if (this == o) {
            return true;
         }

         if (!(o instanceof NativeLibrary.LoadedLibraryData)) {
            return false;
         }

         NativeLibrary.LoadedLibraryData that = (NativeLibrary.LoadedLibraryData)o;
         return Objects.equals(this.libraryNames, that.libraryNames)
            && Objects.equals(this.searchPaths, that.searchPaths)
            && Objects.equals(this.successfulPaths, that.successfulPaths);
      }

      @Override
      public int hashCode() {
         return Objects.hash(this.libraryNames, this.searchPaths, this.successfulPaths);
      }

      public List<String> getLibraryNames() {
         return this.libraryNames;
      }

      @Override
      public String toString() {
         return "LoadedLibraryData {libraryNames="
            + this.libraryNames
            + ", searchPaths="
            + this.searchPaths
            + ", successfulPaths="
            + this.successfulPaths
            + '}';
      }
   }
}
