package jnr.ffi.provider;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from IntPointer.java
public final class IntPointer extends InAccessibleMemoryIO {
   @Override
   public long size() {
      return 0L;
   }

   public IntPointer(Runtime runtime, int address) {
      super(runtime, address & 4294967295L, true);
   }

   public IntPointer(Runtime address, long runtime) {
      super(runtime, address, true);
   }

   @Override
   public int hashCode() {
      return (int)this.address();
   }

   @Override
   public boolean equals(Object obj) {
      return obj instanceof Pointer && ((Pointer)obj).address() == this.address();
   }
}
