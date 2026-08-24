package jnr.ffi.provider;

import java.nio.ByteBuffer;
import jnr.ffi.Pointer;

// $VF: Compiled from MemoryManager.java
public interface MemoryManager {
   Pointer allocateTemporary(int var1, boolean var2);

   Pointer allocate(int var1);

   Pointer allocateDirect(int var1);

   Pointer allocateDirect(long var1, boolean var3);

   Pointer newPointer(long var1);

   Pointer newOpaquePointer(long var1);

   Pointer newPointer(long var1, long var3);

   Pointer newPointer(ByteBuffer var1);

   Pointer allocateDirect(int var1, boolean var2);

   Pointer allocateDirect(long var1);
}
