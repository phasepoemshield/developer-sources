package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Sock.java
public enum Sock implements Constant {
   SOCK_CLOEXEC(524288L),
   SOCK_RAW(4L),
   SOCK_NONBLOCK(1048576L),
   SOCK_RDM(5L),
   SOCK_DGRAM(1L),
   SOCK_STREAM(2L),
   SOCK_SEQPACKET(6L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 1048576L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   Sock(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final String toString() {
      return Sock.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from Sock.java
   static final class StringTable {
      public static final Map<Sock, String> descriptions = generateTable();

      public static final Map<Sock, String> generateTable() {
         Map<Sock, String> map = new EnumMap<>(Sock.class);
         map.put(Sock.SOCK_STREAM, "SOCK_STREAM");
         map.put(Sock.SOCK_DGRAM, "SOCK_DGRAM");
         map.put(Sock.SOCK_RAW, "SOCK_RAW");
         map.put(Sock.SOCK_RDM, "SOCK_RDM");
         map.put(Sock.SOCK_SEQPACKET, "SOCK_SEQPACKET");
         map.put(Sock.SOCK_NONBLOCK, "SOCK_NONBLOCK");
         map.put(Sock.SOCK_CLOEXEC, "SOCK_CLOEXEC");
         return map;
      }
   }
}
