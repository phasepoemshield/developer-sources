package jnr.ffi.provider.jffi;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.provider.BoundedMemoryIO;

// $VF: Compiled from MemoryUtil.java
public final class MemoryUtil {
   static Pointer newPointer(Runtime runtime, int ptr) {
      return ptr != 0 ? new DirectMemoryIO(runtime, ptr) : null;
   }

   static Pointer newPointer(Runtime runtime, long size, long ptr) {
      return ptr != 0L ? new BoundedMemoryIO(new DirectMemoryIO(runtime, ptr), 0L, size) : null;
   }

   static Pointer newPointer(Runtime runtime, long ptr) {
      return ptr != 0L ? new DirectMemoryIO(runtime, ptr) : null;
   }

   private MemoryUtil() {
   }
}
