package jnr.constants.platform.linux;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from OpenFlags.java
public enum OpenFlags implements Constant {
   O_ACCMODE(3L),
   O_APPEND(1024L),
   O_SYNC(1052672L),
   O_WRONLY(1L),
   O_NONBLOCK(2048L),
   O_CLOEXEC(524288L),
   O_TRUNC(512L),
   O_DIRECTORY(65536L),
   O_RDONLY(0L),
   O_ASYNC(8192L),
   O_CREAT(64L),
   O_FSYNC(1052672L),
   O_NOCTTY(256L),
   O_NOFOLLOW(131072L),
   O_EXCL(128L),
   O_RDWR(2L),
   O_TMPFILE(4259840L);

   private final long value;
   public static final long MAX_VALUE = 4259840L;
   public static final long MIN_VALUE = 0L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   OpenFlags(long value) {
      this.value = value;
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
         map.put(OpenFlags.O_ASYNC, "O_ASYNC");
         map.put(OpenFlags.O_FSYNC, "O_FSYNC");
         map.put(OpenFlags.O_NOFOLLOW, "O_NOFOLLOW");
         map.put(OpenFlags.O_CREAT, "O_CREAT");
         map.put(OpenFlags.O_TRUNC, "O_TRUNC");
         map.put(OpenFlags.O_EXCL, "O_EXCL");
         map.put(OpenFlags.O_DIRECTORY, "O_DIRECTORY");
         map.put(OpenFlags.O_NOCTTY, "O_NOCTTY");
         map.put(OpenFlags.O_TMPFILE, "O_TMPFILE");
         map.put(OpenFlags.O_CLOEXEC, "O_CLOEXEC");
         return map;
      }
   }
}
