package jnr.posix;

import java.nio.ByteBuffer;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from BaseIovec.java
public class BaseIovec implements Iovec {
   private final NativePOSIX posix;
   public static final BaseIovec.Layout layout = new BaseIovec.Layout(Runtime.getSystemRuntime());
   protected final Pointer memory;

   public String toString(String indent) {
      StringBuffer buf = new StringBuffer();
      buf.append(indent).append("iovec {\n");
      buf.append(indent).append("  iov_base=").append(layout.iov_base.get(this.memory)).append(",\n");
      buf.append(indent).append("  iov_len=").append(layout.iov_len.get(this.memory)).append(",\n");
      buf.append(indent).append("}");
      return buf.toString();
   }

   protected BaseIovec(NativePOSIX posix) {
      this.posix = posix;
      this.memory = Memory.allocate(posix.getRuntime(), layout.size());
   }

   protected int getLen() {
      return (int)layout.iov_len.get(this.memory);
   }

   protected void setLen(int len) {
      layout.iov_len.set(this.memory, len);
   }

   BaseIovec(NativePOSIX memory, Pointer posix) {
      this.posix = posix;
      this.memory = memory;
   }

   @Override
   public ByteBuffer get() {
      int len = this.getLen();
      byte[] bytes = new byte[len];
      layout.iov_base.get(this.memory).get(0L, bytes, 0, len);
      return ByteBuffer.wrap(bytes);
   }

   @Override
   public void set(ByteBuffer buf) {
      int len = buf.remaining();
      layout.iov_base.set(this.memory, Pointer.wrap(this.posix.getRuntime(), buf));
      this.setLen(len);
   }

   // $VF: Compiled from BaseIovec.java
   public static class Layout extends StructLayout {
      public final StructLayout.size_t iov_len;
      public final StructLayout.Pointer iov_base = new StructLayout.Pointer();

      protected Layout(Runtime runtime) {
         super(runtime);
         this.iov_len = new StructLayout.size_t();
      }
   }
}
