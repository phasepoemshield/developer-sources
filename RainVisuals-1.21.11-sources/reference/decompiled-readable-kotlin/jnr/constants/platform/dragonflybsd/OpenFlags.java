package jnr.constants.platform.dragonflybsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from OpenFlags.java
public enum OpenFlags implements Constant {
   O_SHLOCK(16L),
   O_NOCTTY(32768L),
   O_RDWR(2L),
   O_ACCMODE(3L),
   O_SYNC(128L),
   O_APPEND(8L),
   O_CLOEXEC(131072L),
   O_TRUNC(1024L),
   O_WRONLY(1L),
   O_NOFOLLOW(256L),
   O_EXCL(2048L),
   O_FSYNC(128L),
   O_EXLOCK(32L),
   O_ASYNC(64L),
   O_DIRECTORY(134217728L),
   O_CREAT(512L),
   O_NONBLOCK(4L),
   O_RDONLY(0L);

   private final long value;
   public static final long MAX_VALUE = 134217728L;
   public static final long MIN_VALUE = 0L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   OpenFlags(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return OpenFlags.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   // $VF: Compiled from OpenFlags.java
   static final class StringTable {
      public static final Map<OpenFlags, String> descriptions = generateTable();

      public static final Map<OpenFlags, String> generateTable() {
         Map<OpenFlags, String> map = new EnumMap<>(OpenFlags.class);
         map.put(OpenFlags.O_RDONLY, "O_RDONLY");
         map.put(OpenFlags.O_WRONLY, "O_WRONLY");
         map.put(OpenFlags.O_RDWR, "O_RDWR");
         map.put(OpenFlags.O_ACCMODE, "O_ACCMODE");
         map.put(OpenFlags.O_NONBLOCK, "O_NONBLOCK");
         map.put(OpenFlags.O_APPEND, "O_APPEND");
         map.put(OpenFlags.O_SYNC, "O_SYNC");
         map.put(OpenFlags.O_SHLOCK, "O_SHLOCK");
         map.put(OpenFlags.O_EXLOCK, "O_EXLOCK");
         map.put(OpenFlags.O_ASYNC, "O_ASYNC");
         map.put(OpenFlags.O_FSYNC, "O_FSYNC");
         map.put(OpenFlags.O_NOFOLLOW, "O_NOFOLLOW");
         map.put(OpenFlags.O_CREAT, "O_CREAT");
         map.put(OpenFlags.O_TRUNC, "O_TRUNC");
         map.put(OpenFlags.O_EXCL, "O_EXCL");
         map.put(OpenFlags.O_DIRECTORY, "O_DIRECTORY");
         map.put(OpenFlags.O_NOCTTY, "O_NOCTTY");
         map.put(OpenFlags.O_CLOEXEC, "O_CLOEXEC");
         return map;
      }
   }
}
