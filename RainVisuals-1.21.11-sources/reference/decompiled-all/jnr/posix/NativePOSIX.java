package jnr.posix;

import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from NativePOSIX.java
public abstract class NativePOSIX implements POSIX {
   public Pointer allocatePosixSpawnFileActions() {
      return Memory.allocateDirect(this.getRuntime(), 128);
   }

   public Pointer allocatePosixSpawnattr() {
      return Memory.allocateDirect(this.getRuntime(), 128);
   }

   Runtime getRuntime() {
      return Runtime.getRuntime(this.libc());
   }

   public abstract SocketMacros socketMacros();
}
