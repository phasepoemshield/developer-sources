package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketLevel.java
public enum SocketLevel implements Constant {
   SOL_SOCKET(1L),
   SOL_UDP(17L),
   SOL_IPV6(41L),
   SOL_TCP(6L),
   SOL_IP(0L);

   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 41L;
   private final long value;

   @Override
   public final String toString() {
      return SocketLevel.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   SocketLevel(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   // $VF: Compiled from SocketLevel.java
   static final class StringTable {
      public static final Map<SocketLevel, String> descriptions = generateTable();

      public static final Map<SocketLevel, String> generateTable() {
         Map<SocketLevel, String> map = new EnumMap<>(SocketLevel.class);
         map.put(SocketLevel.SOL_SOCKET, "SOL_SOCKET");
         map.put(SocketLevel.SOL_IP, "SOL_IP");
         map.put(SocketLevel.SOL_TCP, "SOL_TCP");
         map.put(SocketLevel.SOL_UDP, "SOL_UDP");
         map.put(SocketLevel.SOL_IPV6, "SOL_IPV6");
         return map;
      }
   }
}
