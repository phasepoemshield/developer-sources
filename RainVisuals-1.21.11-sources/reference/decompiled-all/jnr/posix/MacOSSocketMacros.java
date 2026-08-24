package jnr.posix;

import jnr.ffi.Pointer;

// $VF: Compiled from MacOSSocketMacros.java
public class MacOSSocketMacros implements SocketMacros {
   public static final SocketMacros INSTANCE = new MacOSSocketMacros();

   public int __DARWIN_ALIGN32(int x) {
      return x + 3 & -4;
   }

   @Override
   public int CMSG_LEN(int l) {
      return this.__DARWIN_ALIGN32(MacOSCmsgHdr.layout.size()) + l;
   }

   @Override
   public Pointer CMSG_DATA(Pointer cmsg) {
      return cmsg.slice(this.__DARWIN_ALIGN32(MacOSCmsgHdr.layout.size()));
   }

   @Override
   public int CMSG_SPACE(int l) {
      return this.__DARWIN_ALIGN32(MacOSCmsgHdr.layout.size()) + this.__DARWIN_ALIGN32(l);
   }
}
