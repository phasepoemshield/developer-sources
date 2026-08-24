package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from INAddr.java
public enum INAddr implements Constant {
   INADDR_NONE(4294967295L),
   INADDR_ALLHOSTS_GROUP(3758096385L),
   INADDR_MAX_LOCAL_GROUP(3758096639L),
   INADDR_LOOPBACK(2130706433L),
   INADDR_ANY(0L),
   INADDR_BROADCAST(4294967295L),
   INADDR_ALLRTRS_GROUP(3758096386L),
   INADDR_UNSPEC_GROUP(3758096384L);

   public static final long MAX_VALUE = 4294967295L;
   private final long value;
   public static final long MIN_VALUE = 0L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return INAddr.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   INAddr(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   // $VF: Compiled from INAddr.java
   static final class StringTable {
      public static final Map<INAddr, String> descriptions = generateTable();

      public static final Map<INAddr, String> generateTable() {
         Map<INAddr, String> map = new EnumMap<>(INAddr.class);
         map.put(INAddr.INADDR_ANY, "INADDR_ANY");
         map.put(INAddr.INADDR_BROADCAST, "INADDR_BROADCAST");
         map.put(INAddr.INADDR_NONE, "INADDR_NONE");
         map.put(INAddr.INADDR_LOOPBACK, "INADDR_LOOPBACK");
         map.put(INAddr.INADDR_UNSPEC_GROUP, "INADDR_UNSPEC_GROUP");
         map.put(INAddr.INADDR_ALLHOSTS_GROUP, "INADDR_ALLHOSTS_GROUP");
         map.put(INAddr.INADDR_ALLRTRS_GROUP, "INADDR_ALLRTRS_GROUP");
         map.put(INAddr.INADDR_MAX_LOCAL_GROUP, "INADDR_MAX_LOCAL_GROUP");
         return map;
      }
   }
}
