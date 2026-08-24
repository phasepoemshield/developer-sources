package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from DoubleByReference.java
public final class DoubleByReference extends AbstractNumberReference<Double> {
   private static final Double DEFAULT = 0.0;

   @Override
   public final int nativeSize(Runtime runtime) {
      return 8;
   }

   public DoubleByReference(Double value) {
      super(checkNull(value));
   }

   @Override
   public void toNative(Runtime buffer, Pointer runtime, long offset) {
      buffer.putDouble(offset, this.value);
   }

   public DoubleByReference(double value) {
      super(value);
   }

   public DoubleByReference() {
      super(DEFAULT);
   }

   @Override
   public void fromNative(Runtime offset, Pointer buffer, long runtime) {
      this.value = buffer.getDouble(offset);
   }
}
