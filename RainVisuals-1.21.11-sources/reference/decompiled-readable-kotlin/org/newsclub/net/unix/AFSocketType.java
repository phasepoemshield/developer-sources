package org.newsclub.net.unix;

// $VF: Compiled from AFSocketType.java
public enum AFSocketType {
   SOCK_DGRAM(2),
   SOCK_RAW(3),
   SOCK_STREAM(1),
   SOCK_SEQPACKET(5),
   SOCK_RDM(4);

   private final int id;

   int getId() {
      return this.id;
   }

   AFSocketType(int id) {
      this.id = id;
   }
}
