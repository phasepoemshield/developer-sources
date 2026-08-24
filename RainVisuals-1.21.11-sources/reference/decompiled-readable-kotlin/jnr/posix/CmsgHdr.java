package jnr.posix;

import java.nio.ByteBuffer;

// $VF: Compiled from CmsgHdr.java
public interface CmsgHdr {
   ByteBuffer getData();

   int getLen();

   void setType(int var1);

   int getLevel();

   void setData(ByteBuffer var1);

   int getType();

   void setLevel(int var1);
}
