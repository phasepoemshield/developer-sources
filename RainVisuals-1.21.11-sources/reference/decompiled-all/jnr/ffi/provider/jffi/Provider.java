package jnr.ffi.provider.jffi;

import jnr.ffi.Runtime;
import jnr.ffi.provider.FFIProvider;

// $VF: Compiled from Provider.java
public final class Provider extends FFIProvider {
   private final NativeRuntime runtime = NativeRuntime.getInstance();

   @Override
   public <T> jnr.ffi.LibraryLoader<T> createLibraryLoader(Class<T> interfaceClass) {
      return new NativeLibraryLoader<>(interfaceClass);
   }

   @Override
   public final Runtime getRuntime() {
      return this.runtime;
   }
}
