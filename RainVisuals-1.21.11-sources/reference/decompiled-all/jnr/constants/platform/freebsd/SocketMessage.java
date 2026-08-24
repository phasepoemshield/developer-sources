package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketMessage.java
public enum SocketMessage implements Constant {
   MSG_DONTWAIT(128L),
   MSG_EOF(256L),
   MSG_COMPAT(32768L),
   MSG_NOSIGNAL(131072L),
   MSG_WAITALL(64L),
   MSG_PEEK(2L),
   MSG_OOB(1L),
   MSG_DONTROUTE(4L),
   MSG_EOR(8L),
   MSG_TRUNC(16L),
   MSG_CTRUNC(32L);

   private final long value;
   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 131072L;

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return SocketMessage.StringTable.descriptions.get(this);
   }

   SocketMessage(long value) {
      this.value = value;
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
         map.put(SocketMessage.MSG_EOF, "MSG_EOF");
         map.put(SocketMessage.MSG_COMPAT, "MSG_COMPAT");
         return map;
      }
   }
}
