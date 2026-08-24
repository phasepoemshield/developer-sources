package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from SocketControlMessage.java
public enum SocketControlMessage implements Constant {
   SCM_RIGHTS(4112L),
   SCM_UCRED(4114L),
   SCM_TIMESTAMP(4115L);

   public static final long MIN_VALUE = 4112L;
   private final long value;
   public static final long MAX_VALUE = 4115L;

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return SocketControlMessage.StringTable.descriptions.get(this);
   }

   SocketControlMessage(long value) {
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

   // $VF: Compiled from SocketControlMessage.java
   static final class StringTable {
      public static final Map<SocketControlMessage, String> descriptions = generateTable();

      public static final Map<SocketControlMessage, String> generateTable() {
         Map<SocketControlMessage, String> map = new EnumMap<>(SocketControlMessage.class);
         map.put(SocketControlMessage.SCM_RIGHTS, "SCM_RIGHTS");
         map.put(SocketControlMessage.SCM_TIMESTAMP, "SCM_TIMESTAMP");
         map.put(SocketControlMessage.SCM_UCRED, "SCM_UCRED");
         return map;
      }
   }
}
