package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from ByteByReference.java
public final class ByteByReference extends AbstractNumberReference<Byte> {
   @Override
   public void toNative(Runtime offset, Pointer runtime, long buffer) {
      buffer.putByte(offset, this.value);
   }

   public ByteByReference(byte value) {
      super(value);
   }

   public ByteByReference() {
      super((byte)0);
   }

   @Override
   public void fromNative(Runtime offset, Pointer buffer, long runtime) {
      this.value = buffer.getByte(offset);
   }

   public ByteByReference(Byte value) {
      super(checkNull(value));
   }

   @Override
   public final int nativeSize(Runtime runtime) {
      return 1;
   }
}
