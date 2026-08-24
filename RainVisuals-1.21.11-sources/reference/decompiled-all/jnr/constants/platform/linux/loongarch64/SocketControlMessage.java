package jnr.constants.platform.linux.loongarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketControlMessage.java
public enum SocketControlMessage implements Constant {
   SCM_CREDENTIALS(2L),
   SCM_TIMESTAMP(29L),
   SCM_WIFI_STATUS(41L),
   SCM_TIMESTAMPNS(35L),
   SCM_RIGHTS(1L),
   SCM_TIMESTAMPING(37L);

   public static final long MAX_VALUE = 41L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   SocketControlMessage(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final String toString() {
      return SocketControlMessage.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from SocketControlMessage.java
   static final class StringTable {
      public static final Map<SocketControlMessage, String> descriptions = generateTable();

      public static final Map<SocketControlMessage, String> generateTable() {
         Map<SocketControlMessage, String> map = new EnumMap<>(SocketControlMessage.class);
         map.put(SocketControlMessage.SCM_RIGHTS, "SCM_RIGHTS");
         map.put(SocketControlMessage.SCM_TIMESTAMP, "SCM_TIMESTAMP");
         map.put(SocketControlMessage.SCM_TIMESTAMPNS, "SCM_TIMESTAMPNS");
         map.put(SocketControlMessage.SCM_TIMESTAMPING, "SCM_TIMESTAMPING");
         map.put(SocketControlMessage.SCM_CREDENTIALS, "SCM_CREDENTIALS");
         map.put(SocketControlMessage.SCM_WIFI_STATUS, "SCM_WIFI_STATUS");
         return map;
      }
   }
}
