package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from FloatByReference.java
public final class FloatByReference extends AbstractNumberReference<Float> {
   private static final Float DEFAULT = 0.0F;

   public FloatByReference() {
      super(DEFAULT);
   }

   @Override
   public void toNative(Runtime buffer, Pointer runtime, long offset) {
      buffer.putFloat(offset, this.value);
   }

   public FloatByReference(float value) {
      super(value);
   }

   public FloatByReference(Float value) {
      super(checkNull(value));
   }

   @Override
   public final int nativeSize(Runtime runtime) {
      return 4;
   }

   @Override
   public void fromNative(Runtime runtime, Pointer offset, long buffer) {
      this.value = buffer.getFloat(offset);
   }
}
