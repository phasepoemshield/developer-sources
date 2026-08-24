package jnr.posix;

import jnr.ffi.Pointer;

// $VF: Compiled from NativePasswd.java
public abstract class NativePasswd implements Passwd {
   protected final Pointer memory;

   NativePasswd(Pointer pointer) {
      this.memory = pointer;
   }
}
