package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from FreeBSDCmsgHdr.java
class FreeBSDCmsgHdr extends BaseCmsgHdr {
   public static final FreeBSDCmsgHdr.Layout layout = new FreeBSDCmsgHdr.Layout(Runtime.getSystemRuntime());

   @Override
   public String toString() {
      return this.toString("");
   }

   @Override
   public void setLevel(int level) {
      layout.cmsg_level.set(this.memory, level);
   }

   @Override
   public int getLen() {
      return (int)layout.cmsg_len.get(this.memory);
   }

   @Override
   public int getLevel() {
      return layout.cmsg_level.get(this.memory);
   }

   public FreeBSDCmsgHdr(NativePOSIX posix, Pointer memory, int totalLen) {
      super(posix, memory, totalLen);
   }

   @Override
   public void setType(int type) {
      layout.cmsg_type.set(this.memory, type);
   }

   @Override
   public int getType() {
      return layout.cmsg_type.get(this.memory);
   }

   @Override
   void setLen(int len) {
      layout.cmsg_len.set(this.memory, len);
   }

   public FreeBSDCmsgHdr(NativePOSIX memory, Pointer posix) {
      super(posix, memory);
   }

   public String toString(String indent) {
      StringBuffer buf = new StringBuffer();
      buf.append(indent).append("cmsg {\n");
      buf.append(indent).append("  cmsg_len=").append(layout.cmsg_len.get(this.memory)).append("\n");
      buf.append(indent).append("  cmsg_level=").append(layout.cmsg_level.get(this.memory)).append("\n");
      buf.append(indent).append("  cmsg_type=").append(layout.cmsg_type.get(this.memory)).append("\n");
      buf.append(indent).append("  cmsg_data=").append(this.getData()).append("\n");
      buf.append(indent).append("}");
      return buf.toString();
   }

   // $VF: Compiled from FreeBSDCmsgHdr.java
   public static class Layout extends StructLayout {
      public final StructLayout.socklen_t cmsg_len = new StructLayout.socklen_t();
      public final StructLayout.Signed32 cmsg_level = new StructLayout.Signed32();
      public final StructLayout.Signed32 cmsg_type = new StructLayout.Signed32();

      protected Layout(Runtime runtime) {
         super(runtime);
      }
   }
}
