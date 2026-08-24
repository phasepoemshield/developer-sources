package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from ByReference.java
public interface ByReference<T> {
   int nativeSize(Runtime var1);

   void toNative(Runtime var1, Pointer var2, long var3);

   void fromNative(Runtime var1, Pointer var2, long var3);

   T getValue();
}
