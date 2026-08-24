package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Sock.java
public enum Sock implements Constant {
   SOCK_NONBLOCK(2048L),
   SOCK_CLOEXEC(524288L),
   SOCK_RDM(4L),
   SOCK_RAW(3L),
   SOCK_SEQPACKET(5L),
   SOCK_STREAM(1L),
   SOCK_DGRAM(2L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 524288L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return Sock.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   Sock(long value) {
      this.value = value;
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
