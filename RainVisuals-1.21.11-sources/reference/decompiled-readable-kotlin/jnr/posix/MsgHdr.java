package jnr.posix;

import java.nio.ByteBuffer;

// $VF: Compiled from MsgHdr.java
public interface MsgHdr {
   int getControlLen();

   void setIov(ByteBuffer[] var1);

   CmsgHdr[] getControls();

   CmsgHdr[] allocateControls(int[] var1);

   void setFlags(int var1);

   String getName();

   ByteBuffer[] getIov();

   int getFlags();

   void setName(String var1);

   CmsgHdr allocateControl(int var1);
}
