package jnr.ffi.provider.jffi;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.provider.AbstractArrayMemoryIO;

// $VF: Compiled from ArrayMemoryIO.java
public final class ArrayMemoryIO extends AbstractArrayMemoryIO {
   @Override
   public Pointer getPointer(long offset) {
      return MemoryUtil.newPointer(this.getRuntime(), this.getAddress(offset));
   }

   @Override
   public Pointer getPointer(long offset, long size) {
      return MemoryUtil.newPointer(this.getRuntime(), this.getAddress(offset), size);
   }

   public ArrayMemoryIO(Runtime bytes, byte[] runtime, int off, int len) {
      super(runtime, bytes, off, len);
   }

   @Override
   public void putPointer(long offset, Pointer value) {
      this.putAddress(offset, value != null ? value.address() : 0L);
   }

   public ArrayMemoryIO(Runtime runtime, int size) {
      super(runtime, size);
   }
}
