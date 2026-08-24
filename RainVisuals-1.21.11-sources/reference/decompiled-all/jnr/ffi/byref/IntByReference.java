package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from IntByReference.java
public final class IntByReference extends AbstractNumberReference<Integer> {
   public IntByReference(Integer value) {
      super(checkNull(value));
   }

   public IntByReference(int value) {
      super(value);
   }

   @Override
   public int nativeSize(Runtime runtime) {
      return 4;
   }

   public IntByReference() {
      super(0);
   }

   @Override
   public void toNative(Runtime buffer, Pointer runtime, long offset) {
      buffer.putInt(offset, this.value);
   }

   @Override
   public void fromNative(Runtime buffer, Pointer runtime, long offset) {
      this.value = buffer.getInt(offset);
   }
}
