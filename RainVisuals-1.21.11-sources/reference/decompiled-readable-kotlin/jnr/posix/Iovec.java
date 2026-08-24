package jnr.posix;

import java.nio.ByteBuffer;

// $VF: Compiled from Iovec.java
public interface Iovec {
   ByteBuffer get();

   void set(ByteBuffer var1);
}
