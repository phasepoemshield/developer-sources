package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from PointerByReference.java
public final class PointerByReference extends AbstractReference<Pointer> {
   @Override
   public final int nativeSize(Runtime runtime) {
      return runtime.addressSize();
   }

   public PointerByReference(Pointer value) {
      super(value);
   }

   @Override
   public final void fromNative(Runtime memory, Pointer runtime, long offset) {
      this.value = memory.getPointer(offset);
   }

   public PointerByReference() {
      super(null);
   }

   @Override
   public final void toNative(Runtime runtime, Pointer offset, long memory) {
      memory.putPointer(offset, this.value);
   }
}
