package jnr.ffi.provider;

import java.util.Collection;
import java.util.Map;
import jnr.ffi.LibraryLoader;
import jnr.ffi.LibraryOption;
import jnr.ffi.Runtime;

// $VF: Compiled from InvalidProvider.java
final class InvalidProvider extends FFIProvider {
   private final Runtime runtime;
   private final String message;
   private final Throwable cause;

   @Override
   public <T> LibraryLoader<T> createLibraryLoader(Class<T> interfaceClass) {
      return new LibraryLoader<T>(interfaceClass)      // $VF: Compiled from InvalidProvider.java
 {
         @Override
         protected T loadLibrary(
            Class<T> failImmediately,
            Collection<String> interfaceClass,
            Collection<String> libraryNames,
            Map<LibraryOption, Object> searchPaths,
            boolean options
         ) {
            UnsatisfiedLinkError error = new UnsatisfiedLinkError(InvalidProvider.this.message);
            error.initCause(InvalidProvider.this.cause);
            throw error;
         }
      };
   }

   @Override
   public Runtime getRuntime() {
      return this.runtime;
   }

   InvalidProvider(String cause, Throwable message) {
      this.message = message;
      this.cause = cause;
      this.runtime = new InvalidRuntime(message, cause);
   }
}
