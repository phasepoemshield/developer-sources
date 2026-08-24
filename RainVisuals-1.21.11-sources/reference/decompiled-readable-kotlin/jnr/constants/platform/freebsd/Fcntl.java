package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Fcntl.java
public enum Fcntl implements Constant {
   F_GETFL(3L),
   F_GETOWN(5L),
   F_RDLCK(1L),
   F_SETOWN(6L),
   F_SETLKW(13L),
   F_GETFD(1L),
   FASYNC(64L),
   F_GETLK(11L),
   FFSYNC(128L),
   FNDELAY(4L),
   FWRITE(2L),
   F_SETLK(12L),
   F_SETFL(4L),
   FREAD(1L),
   F_SETFD(2L),
   FNONBLOCK(4L),
   FAPPEND(8L),
   F_DUPFD(0L),
   F_UNLCK(2L),
   F_RDAHEAD(16L),
   F_WRLCK(3L);

   public static final long MIN_VALUE = 0L;
   private final long value;
   public static final long MAX_VALUE = 128L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   Fcntl(long value) {
      this.value = value;
   }

   @Override
   public final String toString() {
      return Fcntl.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from Fcntl.java
   static final class StringTable {
      public static final Map<Fcntl, String> descriptions = generateTable();

      public static final Map<Fcntl, String> generateTable() {
         Map<Fcntl, String> map = new EnumMap<>(Fcntl.class);
         map.put(Fcntl.FAPPEND, "FAPPEND");
         map.put(Fcntl.FREAD, "FREAD");
         map.put(Fcntl.FWRITE, "FWRITE");
         map.put(Fcntl.FASYNC, "FASYNC");
         map.put(Fcntl.FFSYNC, "FFSYNC");
         map.put(Fcntl.FNONBLOCK, "FNONBLOCK");
         map.put(Fcntl.FNDELAY, "FNDELAY");
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
         map.put(Fcntl.F_RDAHEAD, "F_RDAHEAD");
         map.put(Fcntl.F_RDLCK, "F_RDLCK");
         map.put(Fcntl.F_UNLCK, "F_UNLCK");
         map.put(Fcntl.F_WRLCK, "F_WRLCK");
         return map;
      }
   }
}
