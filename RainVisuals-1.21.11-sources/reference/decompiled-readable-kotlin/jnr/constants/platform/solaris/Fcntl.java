package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Fcntl.java
public enum Fcntl implements Constant {
   F_SETFL(4L),
   F_RDLCK(1L),
   F_GETLK(14L),
   F_SETLK(6L),
   F_WRLCK(2L),
   F_UNLCK(3L),
   F_GETFD(1L),
   F_SETFD(2L),
   F_DUPFD(0L),
   F_SETLKW(7L),
   F_SETOWN(24L),
   F_GETOWN(23L),
   F_GETFL(3L);

   public static final long MAX_VALUE = 24L;
   public static final long MIN_VALUE = 0L;
   private final long value;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return Fcntl.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   Fcntl(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   // $VF: Compiled from Fcntl.java
   static final class StringTable {
      public static final Map<Fcntl, String> descriptions = generateTable();

      public static final Map<Fcntl, String> generateTable() {
         Map<Fcntl, String> map = new EnumMap<>(Fcntl.class);
         map.put(Fcntl.F_DUPFD, "F_DUPFD");
         map.put(Fcntl.F_GETFD, "F_GETFD");
         map.put(Fcntl.F_SETFD, "F_SETFD");
         map.put(Fcntl.F_GETFL, "F_GETFL");
         map.put(Fcntl.F_SETFL, "F_SETFL");
         map.put(Fcntl.F_GETOWN, "F_GETOWN");
         map.put(Fcntl.F_SETOWN, "F_SETOWN");
         map.put(Fcntl.F_GETLK, "F_GETLK");
         map.put(Fcntl.F_SETLK, "F_SETLK");
         map.put(Fcntl.F_SETLKW, "F_SETLKW");
         map.put(Fcntl.F_RDLCK, "F_RDLCK");
         map.put(Fcntl.F_UNLCK, "F_UNLCK");
         map.put(Fcntl.F_WRLCK, "F_WRLCK");
         return map;
      }
   }
}
