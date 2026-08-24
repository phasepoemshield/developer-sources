package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketMessage.java
public enum SocketMessage implements Constant {
   MSG_WAITALL(8L),
   MSG_DONTROUTE(4L),
   MSG_PEEK(2L),
   MSG_OOB(1L);

   public static final long MAX_VALUE = 8L;
   public static final long MIN_VALUE = 1L;
   private final long value;

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

   @Override
   public final String toString() {
      return SocketMessage.StringTable.descriptions.get(this);
   }

   SocketMessage(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   // $VF: Compiled from SocketMessage.java
   static final class StringTable {
      public static final Map<SocketMessage, String> descriptions = generateTable();

      public static final Map<SocketMessage, String> generateTable() {
         Map<SocketMessage, String> map = new EnumMap<>(SocketMessage.class);
         map.put(SocketMessage.MSG_OOB, "MSG_OOB");
         map.put(SocketMessage.MSG_PEEK, "MSG_PEEK");
         map.put(SocketMessage.MSG_DONTROUTE, "MSG_DONTROUTE");
         map.put(SocketMessage.MSG_WAITALL, "MSG_WAITALL");
         return map;
      }
   }
}
