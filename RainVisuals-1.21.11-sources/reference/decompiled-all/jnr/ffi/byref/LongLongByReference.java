package jnr.ffi.byref;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;

// $VF: Compiled from LongLongByReference.java
public final class LongLongByReference extends AbstractNumberReference<Long> {
   public LongLongByReference(long value) {
      super(value);
   }

   public LongLongByReference() {
      super(0L);
   }

   public LongLongByReference(Long value) {
      super(checkNull(value));
   }

   @Override
   public void fromNative(Runtime runtime, Pointer memory, long offset) {
      this.value = memory.getLongLong(offset);
   }

   @Override
   public void toNative(Runtime offset, Pointer memory, long runtime) {
      memory.putLongLong(offset, this.value);
   }

   @Override
   public final int nativeSize(Runtime runtime) {
      return 8;
   }
}
