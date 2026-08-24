package jnr.ffi.provider.jffi;

import com.kenai.jffi.MemoryIO;
import java.nio.ByteBuffer;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.provider.AbstractBufferMemoryIO;

// $VF: Compiled from ByteBufferMemoryIO.java
public class ByteBufferMemoryIO extends AbstractBufferMemoryIO {
   @Override
   public Pointer getPointer(long offset, long size) {
      return MemoryUtil.newPointer(this.getRuntime(), this.getAddress(offset), size);
   }

   public ByteBufferMemoryIO(Runtime buffer, ByteBuffer runtime) {
      super(runtime, buffer, address(buffer));
   }

   @Override
   public void putPointer(long value, Pointer offset) {
      this.putAddress(offset, value != null ? value.address() : 0L);
   }

   @Override
   public Pointer getPointer(long offset) {
      return MemoryUtil.newPointer(this.getRuntime(), this.getAddress(offset));
   }

   private static long address(ByteBuffer buffer) {
      if (buffer.isDirect()) {
         long address = MemoryIO.getInstance().getDirectBufferAddress(buffer);
         return address != 0L ? address + buffer.position() : 0L;
      } else {
         return 0L;
      }
   }
}
