package jnr.ffi.provider.jffi;

import java.util.concurrent.atomic.AtomicBoolean;
import jnr.ffi.Runtime;

// $VF: Compiled from AllocatedDirectMemoryIO.java
class AllocatedDirectMemoryIO extends DirectMemoryIO {
   private final long size;
   private final AtomicBoolean allocated = new AtomicBoolean(true);

   @Override
   public long size() {
      return this.size;
   }

   @Override
   public boolean equals(Object obj) {
      if (!(obj instanceof AllocatedDirectMemoryIO)) {
         return super.equals(obj);
      }

      AllocatedDirectMemoryIO mem = (AllocatedDirectMemoryIO)obj;
      return mem.size == this.size && mem.address() == this.address();
   }

   @Override
   public int hashCode() {
      return super.hashCode();
   }

   public AllocatedDirectMemoryIO(Runtime clear, long runtime, boolean size) {
      super(runtime, IO.allocateMemory(size, clear));
      this.size = size;
      if (this.address() == 0L) {
         throw new OutOfMemoryError("Failed to allocate " + size + " bytes");
      }
   }

   @Override
   protected void finalize() throws Throwable {
      try {
         if (this.allocated.getAndSet(false)) {
            IO.freeMemory(this.address());
         }
      } finally {
         super.finalize();
      }
   }

   public final void dispose() {
      if (this.allocated.getAndSet(false)) {
         IO.freeMemory(this.address());
      }
   }
}
