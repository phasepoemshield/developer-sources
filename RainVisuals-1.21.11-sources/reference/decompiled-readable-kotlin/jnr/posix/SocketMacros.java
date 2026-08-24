package jnr.posix;

import jnr.ffi.Pointer;

// $VF: Compiled from SocketMacros.java
public interface SocketMacros {
   int CMSG_LEN(int var1);

   Pointer CMSG_DATA(Pointer var1);

   int CMSG_SPACE(int var1);
}
