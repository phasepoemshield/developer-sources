package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from MacOSCmsgHdr.java
class MacOSCmsgHdr extends BaseCmsgHdr {
   public static final MacOSCmsgHdr.Layout layout = new MacOSCmsgHdr.Layout(Runtime.getSystemRuntime());

   @Override
   public void setType(int type) {
      layout.cmsg_type.set(this.memory, type);
   }

   @Override
   public int getLen() {
      return (int)layout.cmsg_len.get(this.memory);
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

   @Override
   public int getType() {
      return layout.cmsg_type.get(this.memory);
   }

   public MacOSCmsgHdr(NativePOSIX posix, Pointer memory) {
      super(posix, memory);
   }

   @Override
   public void setLevel(int level) {
      layout.cmsg_level.set(this.memory, level);
   }

   @Override
   void setLen(int len) {
      layout.cmsg_len.set(this.memory, len);
   }

   @Override
   public int getLevel() {
      return layout.cmsg_level.get(this.memory);
   }

   public MacOSCmsgHdr(NativePOSIX memory, Pointer posix, int totalLen) {
      super(posix, memory, totalLen);
   }

   // $VF: Compiled from MacOSCmsgHdr.java
   public static class Layout extends StructLayout {
      public final StructLayout.Signed32 cmsg_level;
      public final StructLayout.Unsigned32 cmsg_len = new StructLayout.Unsigned32();
      public final StructLayout.Signed32 cmsg_type;

      protected Layout(Runtime runtime) {
         super(runtime);
         this.cmsg_level = new StructLayout.Signed32();
         this.cmsg_type = new StructLayout.Signed32();
      }
   }
}
