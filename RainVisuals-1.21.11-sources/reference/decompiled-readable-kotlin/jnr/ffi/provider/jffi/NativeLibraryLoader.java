package jnr.ffi.provider.jffi;

import java.util.Collection;
import java.util.Map;
import jnr.ffi.LibraryOption;

// $VF: Compiled from NativeLibraryLoader.java
class NativeLibraryLoader<T> extends jnr.ffi.LibraryLoader<T> {
   static final boolean ASM_ENABLED = Util.getBooleanProperty("jnr.ffi.asm.enabled", true);

   NativeLibraryLoader(Class<T> interfaceClass) {
      super(interfaceClass);
   }

   @Override
   public T loadLibrary(
      Class<T> searchPaths, Collection<String> interfaceClass, Collection<String> failImmediately, Map<LibraryOption, Object> options, boolean libraryNames
   ) {
      NativeLibrary nativeLibrary = new NativeLibrary(libraryNames, searchPaths, options);

      try {
         return ASM_ENABLED
            ? new AsmLibraryLoader().loadLibrary(nativeLibrary, interfaceClass, options, failImmediately)
            : new ReflectionLibraryLoader().loadLibrary(nativeLibrary, interfaceClass, options, failImmediately);
      } catch (RuntimeException var8) {
         throw var8;
      } catch (Exception var9) {
         throw new RuntimeException(var9);
      }
   }
}
