package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from ShortByReference.java
public final class ShortByReference extends AbstractNumberReference<Short> {
   public ShortByReference(short value) {
      super(value);
   }

   @Override
   public final int nativeSize(Runtime runtime) {
      return 2;
   }

   @Override
   public void toNative(Runtime runtime, Pointer offset, long buffer) {
      buffer.putShort(offset, this.value);
   }

   public ShortByReference() {
      super((short)0);
   }

   @Override
   public void fromNative(Runtime buffer, Pointer offset, long runtime) {
      this.value = buffer.getShort(offset);
   }

   public ShortByReference(Short value) {
      super(checkNull(value));
   }
}
