package jnr.posix;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from BaseMsgHdr.java
public abstract class BaseMsgHdr implements MsgHdr {
   protected final NativePOSIX posix;
   protected final Pointer memory;

   @Override
   public ByteBuffer[] getIov() {
      int len = this.getIovLen();
      ByteBuffer[] buffers = new ByteBuffer[len];
      Pointer iov = this.getIovPointer();

      for (int i = 0; i < len; i++) {
         Pointer eachPtr = iov.slice(BaseIovec.layout.size() * i);
         BaseIovec eachIov = new BaseIovec(this.posix, eachPtr);
         buffers[i] = eachIov.get();
      }

      return buffers;
   }

   abstract CmsgHdr allocateCmsgHdrInternal(NativePOSIX var1, Pointer var2, int var3);

   abstract void setControlLen(int var1);

   @Override
   public void setName(String name) {
      if (name == null) {
         this.setNamePointer(null);
         this.setNameLen(0);
      } else {
         byte[] nameBytes = name.getBytes(Charset.forName("US-ASCII"));
         Pointer p = Runtime.getSystemRuntime().getMemoryManager().allocateTemporary(nameBytes.length, true);
         p.put(0L, nameBytes, 0, nameBytes.length);
         this.setNamePointer(p);
         this.setNameLen(nameBytes.length);
      }
   }

   abstract Pointer getIovPointer();

   @Override
   public CmsgHdr[] getControls() {
      int len = this.getControlLen();
      if (len == 0) {
         return new CmsgHdr[0];
      }

      List<CmsgHdr> control = new ArrayList();
      int offset = 0;
      Pointer controlPtr = this.getControlPointer();

      while (offset < len) {
         CmsgHdr each = this.allocateCmsgHdrInternal(this.posix, controlPtr.slice(offset), -1);
         offset += this.posix.socketMacros().CMSG_SPACE(each.getLen());
         control.add(each);
      }

      return control.toArray(new CmsgHdr[control.size()]);
   }

   @Override
   public CmsgHdr allocateControl(int dataLength) {
      CmsgHdr[] controls = this.allocateControls(new int[]{dataLength});
      return controls[0];
   }

   abstract void setNameLen(int var1);

   abstract void setIovLen(int var1);

   abstract int getNameLen();

   abstract Pointer getNamePointer();

   @Override
   public CmsgHdr[] allocateControls(int[] dataLengths) {
      CmsgHdr[] cmsgs = new CmsgHdr[dataLengths.length];
      int totalSize = 0;

      for (int ptr = 0; ptr < dataLengths.length; ptr++) {
         totalSize += this.posix.socketMacros().CMSG_SPACE(dataLengths[ptr]);
      }

      Pointer var10 = this.posix.getRuntime().getMemoryManager().allocateDirect(totalSize);
      int offset = 0;

      for (int i = 0; i < dataLengths.length; i++) {
         int eachSpace = this.posix.socketMacros().CMSG_SPACE(dataLengths[i]);
         int len = this.posix.socketMacros().CMSG_LEN(dataLengths[i]);
         CmsgHdr each = this.allocateCmsgHdrInternal(this.posix, var10.slice(offset, eachSpace), len);
         cmsgs[i] = each;
         offset += eachSpace;
      }

      this.setControlPointer(var10);
      this.setControlLen(totalSize);
      return cmsgs;
   }

   @Override
   public String getName() {
      Pointer ptr = this.getNamePointer();
      return ptr == null ? null : ptr.getString(0L, this.getNameLen(), Charset.forName("US-ASCII"));
   }

   abstract int getIovLen();

   protected BaseMsgHdr(NativePOSIX posix, StructLayout layout) {
      this.posix = posix;
      this.memory = posix.getRuntime().getMemoryManager().allocateTemporary(layout.size(), true);
   }

   abstract void setIovPointer(Pointer var1);

   abstract void setNamePointer(Pointer var1);

   abstract void setControlPointer(Pointer var1);

   abstract Pointer getControlPointer();

   @Override
   public void setIov(ByteBuffer[] buffers) {
      Pointer iov = Runtime.getSystemRuntime().getMemoryManager().allocateDirect(BaseIovec.layout.size() * buffers.length);

      for (int i = 0; i < buffers.length; i++) {
         Pointer eachIovecPtr = iov.slice(BaseIovec.layout.size() * i);
         BaseIovec eachIovec = new BaseIovec(this.posix, eachIovecPtr);
         eachIovec.set(buffers[i]);
      }

      this.setIovPointer(iov);
      this.setIovLen(buffers.length);
   }
}
