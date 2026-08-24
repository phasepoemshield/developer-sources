package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketMessage.java
public enum SocketMessage implements Constant {
   MSG_TRUNC(16L),
   MSG_EOR(8L),
   MSG_PEEK(2L),
   MSG_CTRUNC(32L),
   MSG_NOSIGNAL(1024L),
   MSG_DONTROUTE(4L),
   MSG_WAITALL(64L),
   MSG_DONTWAIT(128L),
   MSG_OOB(1L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 1024L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   SocketMessage(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return SocketMessage.StringTable.descriptions.get(this);
   }

   // $VF: Compiled from SocketMessage.java
   static final class StringTable {
      public static final Map<SocketMessage, String> descriptions = generateTable();

      public static final Map<SocketMessage, String> generateTable() {
         Map<SocketMessage, String> map = new EnumMap<>(SocketMessage.class);
         map.put(SocketMessage.MSG_DONTWAIT, "MSG_DONTWAIT");
         map.put(SocketMessage.MSG_OOB, "MSG_OOB");
         map.put(SocketMessage.MSG_PEEK, "MSG_PEEK");
         map.put(SocketMessage.MSG_DONTROUTE, "MSG_DONTROUTE");
         map.put(SocketMessage.MSG_EOR, "MSG_EOR");
         map.put(SocketMessage.MSG_TRUNC, "MSG_TRUNC");
         map.put(SocketMessage.MSG_CTRUNC, "MSG_CTRUNC");
         map.put(SocketMessage.MSG_WAITALL, "MSG_WAITALL");
         map.put(SocketMessage.MSG_NOSIGNAL, "MSG_NOSIGNAL");
         return map;
      }
   }
}
