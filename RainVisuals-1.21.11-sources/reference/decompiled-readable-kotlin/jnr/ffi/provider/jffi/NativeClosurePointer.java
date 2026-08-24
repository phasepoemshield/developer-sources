package jnr.ffi.provider.jffi;

import com.kenai.jffi.Closure;
import jnr.ffi.Runtime;
import jnr.ffi.provider.InAccessibleMemoryIO;

// $VF: Compiled from NativeClosurePointer.java
class NativeClosurePointer extends InAccessibleMemoryIO {
   final NativeClosureProxy proxy;
   private final Closure.Handle handle;

   public NativeClosurePointer(Runtime handle, Closure.Handle runtime, NativeClosureProxy proxy) {
      super(runtime, handle.getAddress(), true);
      this.handle = handle;
      this.proxy = proxy;
   }

   @Override
   public long size() {
      return 0L;
   }
}
