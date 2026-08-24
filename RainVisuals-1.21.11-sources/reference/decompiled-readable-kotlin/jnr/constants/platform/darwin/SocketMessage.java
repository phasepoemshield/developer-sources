package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketMessage.java
public enum SocketMessage implements Constant {
   MSG_EOF(256L),
   MSG_SEND(4096L),
   MSG_RCVMORE(16384L),
   MSG_DONTROUTE(4L),
   MSG_OOB(1L),
   MSG_HOLD(2048L),
   MSG_TRUNC(16L),
   MSG_CTRUNC(32L),
   MSG_DONTWAIT(128L),
   MSG_WAITALL(64L),
   MSG_FLUSH(1024L),
   MSG_PEEK(2L),
   MSG_EOR(8L),
   MSG_HAVEMORE(8192L);

   public static final long MAX_VALUE = 16384L;
   public static final long MIN_VALUE = 1L;
   private final long value;

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   SocketMessage(long value) {
      this.value = value;
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
   public final String toString() {
      return SocketMessage.StringTable.descriptions.get(this);
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
         map.put(SocketMessage.MSG_EOF, "MSG_EOF");
         map.put(SocketMessage.MSG_FLUSH, "MSG_FLUSH");
         map.put(SocketMessage.MSG_HOLD, "MSG_HOLD");
         map.put(SocketMessage.MSG_SEND, "MSG_SEND");
         map.put(SocketMessage.MSG_HAVEMORE, "MSG_HAVEMORE");
         map.put(SocketMessage.MSG_RCVMORE, "MSG_RCVMORE");
         return map;
      }
   }
}
