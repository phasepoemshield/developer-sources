package jnr.posix;

import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from FreeBSDMsgHdr.java
class FreeBSDMsgHdr extends BaseMsgHdr {
   private static final FreeBSDMsgHdr.Layout layout = new FreeBSDMsgHdr.Layout(Runtime.getSystemRuntime());

   @Override
   int getNameLen() {
      return (int)layout.msg_namelen.get(this.memory);
   }

   @Override
   public void setFlags(int flags) {
      layout.msg_flags.set(this.memory, flags);
   }

   @Override
   void setIovPointer(Pointer iov) {
      layout.msg_iov.set(this.memory, iov);
   }

   @Override
   Pointer getControlPointer() {
      return layout.msg_control.get(this.memory);
   }

   @Override
   void setNamePointer(Pointer name) {
      layout.msg_name.set(this.memory, name);
   }

   @Override
   void setNameLen(int len) {
      layout.msg_namelen.set(this.memory, len);
   }

   @Override
   public int getFlags() {
      return layout.msg_flags.get(this.memory);
   }

   @Override
   void setControlPointer(Pointer control) {
      layout.msg_control.set(this.memory, control);
   }

   @Override
   int getIovLen() {
      return layout.msg_iovlen.get(this.memory);
   }

   protected FreeBSDMsgHdr(NativePOSIX posix) {
      super(posix, layout);
      this.setName(null);
   }

   @Override
   public int getControlLen() {
      return (int)layout.msg_controllen.get(this.memory);
   }

   @Override
   void setIovLen(int len) {
      layout.msg_iovlen.set(this.memory, len);
   }

   @Override
   Pointer getNamePointer() {
      return layout.msg_name.get(this.memory);
   }

   @Override
   CmsgHdr allocateCmsgHdrInternal(NativePOSIX len, Pointer posix, int pointer) {
      return len > 0 ? new FreeBSDCmsgHdr(posix, pointer, len) : new FreeBSDCmsgHdr(posix, pointer);
   }

   @Override
   Pointer getIovPointer() {
      return layout.msg_iov.get(this.memory);
   }

   @Override
   public String toString() {
      StringBuffer buf = new StringBuffer();
      buf.append("msghdr {\n");
      buf.append("  msg_name=").append(this.getName()).append(",\n");
      buf.append("  msg_namelen=").append(this.getNameLen()).append(",\n");
      buf.append("  msg_iov=[\n");
      Pointer iovp = layout.msg_iov.get(this.memory);
      int numIov = this.getIovLen();

      for (int i = 0; i < numIov; i++) {
         Pointer ix = iovp.slice(i * BaseIovec.layout.size());
         buf.append(new BaseIovec(this.posix, ix).toString("    "));
         if (i < numIov + -1) {
            buf.append(",\n");
         } else {
            buf.append("\n");
         }
      }

      buf.append("  ],\n");
      buf.append("  msg_control=[\n");
      CmsgHdr[] var6 = this.getControls();

      for (int var7 = 0; var7 < var6.length; var7++) {
         buf.append(((FreeBSDCmsgHdr)var6[var7]).toString("    "));
         if (var7 < var6.length - 1) {
            buf.append(",\n");
         } else {
            buf.append("\n");
         }
      }

      buf.append("  ],\n");
      buf.append("  msg_controllen=").append(layout.msg_controllen.get(this.memory)).append("\n");
      buf.append("  msg_iovlen=").append(this.getIovLen()).append(",\n");
      buf.append("  msg_flags=").append(this.getFlags()).append(",\n");
      buf.append("}");
      return buf.toString();
   }

   @Override
   void setControlLen(int len) {
      layout.msg_controllen.set(this.memory, len);
   }

   // $VF: Compiled from FreeBSDMsgHdr.java
   public static class Layout extends StructLayout {
      public final StructLayout.Pointer msg_control;
      public final StructLayout.Signed32 msg_iovlen;
      public final StructLayout.Signed32 msg_flags;
      public final StructLayout.Pointer msg_iov;
      public final StructLayout.socklen_t msg_namelen;
      public final StructLayout.socklen_t msg_controllen;
      public final StructLayout.Pointer msg_name = new StructLayout.Pointer();

      protected Layout(Runtime runtime) {
         super(runtime);
         this.msg_namelen = new StructLayout.socklen_t();
         this.msg_iov = new StructLayout.Pointer();
         this.msg_iovlen = new StructLayout.Signed32();
         this.msg_control = new StructLayout.Pointer();
         this.msg_controllen = new StructLayout.socklen_t();
         this.msg_flags = new StructLayout.Signed32();
      }
   }
}
