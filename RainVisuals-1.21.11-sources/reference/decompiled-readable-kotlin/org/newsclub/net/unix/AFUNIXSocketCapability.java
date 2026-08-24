package org.newsclub.net.unix;

// $VF: Compiled from AFUNIXSocketCapability.java
@Deprecated
public enum AFUNIXSocketCapability {
   CAPABILITY_NATIVE_SOCKETPAIR(5),
   CAPABILITY_FILE_DESCRIPTORS(2),
   CAPABILITY_PEER_CREDENTIALS(0),
   CAPABILITY_DATAGRAMS(4),
   CAPABILITY_ANCILLARY_MESSAGES(1),
   CAPABILITY_ABSTRACT_NAMESPACE(3);

   private final int bitmask;

   AFUNIXSocketCapability(int bit) {
      this.bitmask = 1 << bit;
   }

   int getBitmask() {
      return this.bitmask;
   }
}
