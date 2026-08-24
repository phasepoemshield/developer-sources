package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketMessage.java
public enum SocketMessage implements Constant {
   MSG_OOB(1L),
   MSG_ERRQUEUE(8192L),
   MSG_NOSIGNAL(16384L),
   MSG_DONTROUTE(4L),
   MSG_RST(4096L),
   MSG_SYN(1024L),
   MSG_FIN(512L),
   MSG_MORE(32768L),
   MSG_CTRUNC(8L),
   MSG_CONFIRM(2048L),
   MSG_PEEK(2L),
   MSG_PROXY(16L),
   MSG_EOR(128L),
   MSG_TRUNC(32L),
   MSG_DONTWAIT(64L),
   MSG_FASTOPEN(536870912L),
   MSG_WAITALL(256L);

   public static final long MAX_VALUE = 536870912L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final long longValue() {
      return this.value;
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
         map.put(SocketMessage.MSG_PROXY, "MSG_PROXY");
         map.put(SocketMessage.MSG_FIN, "MSG_FIN");
         map.put(SocketMessage.MSG_SYN, "MSG_SYN");
         map.put(SocketMessage.MSG_CONFIRM, "MSG_CONFIRM");
         map.put(SocketMessage.MSG_RST, "MSG_RST");
         map.put(SocketMessage.MSG_ERRQUEUE, "MSG_ERRQUEUE");
         map.put(SocketMessage.MSG_NOSIGNAL, "MSG_NOSIGNAL");
         map.put(SocketMessage.MSG_MORE, "MSG_MORE");
         map.put(SocketMessage.MSG_FASTOPEN, "MSG_FASTOPEN");
         return map;
      }
   }
}
