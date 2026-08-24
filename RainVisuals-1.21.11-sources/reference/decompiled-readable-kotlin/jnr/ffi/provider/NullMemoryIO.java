package jnr.ffi.provider;

import jnr.ffi.Runtime;

// $VF: Compiled from NullMemoryIO.java
public final class NullMemoryIO extends InAccessibleMemoryIO {
   private static final String msg = "attempted access to a NULL memory address";

   public NullMemoryIO(Runtime runtime) {
      super(runtime, 0L, true);
   }

   @Override
   public long size() {
      return Long.MAX_VALUE;
   }

   protected final NullPointerException error() {
      return new NullPointerException("attempted access to a NULL memory address");
   }
}
