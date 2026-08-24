package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketControlMessage.java
public enum SocketControlMessage implements Constant {
   SCM_TIMESTAMP(2L),
   SCM_CREDS(3L),
   SCM_RIGHTS(1L),
   SCM_BINTIME(4L);

   public static final long MIN_VALUE = 1L;
   private final long value;
   public static final long MAX_VALUE = 4L;

   SocketControlMessage(long value) {
      this.value = value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
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
         map.put(SocketControlMessage.SCM_BINTIME, "SCM_BINTIME");
         map.put(SocketControlMessage.SCM_CREDS, "SCM_CREDS");
         return map;
      }
   }
}
