package jnr.ffi.provider;

import jnr.ffi.Pointer;

// $VF: Compiled from ClosureManager.java
public interface ClosureManager {
   <T> Pointer getClosurePointer(Class<? extends T> var1, T var2);

   <T> T newClosure(Class<? extends T> var1, T var2);
}
