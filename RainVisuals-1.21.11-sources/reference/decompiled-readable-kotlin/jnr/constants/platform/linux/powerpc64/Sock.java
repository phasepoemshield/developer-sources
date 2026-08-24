package jnr.constants.platform.linux.powerpc64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Sock.java
public enum Sock implements Constant {
   SOCK_RDM(4L),
   SOCK_SEQPACKET(5L),
   SOCK_RAW(3L),
   SOCK_DGRAM(2L),
   SOCK_STREAM(1L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 5L;
   private final long value;

   @Override
   public final String toString() {
      return Sock.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
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
         return map;
      }
   }
}
