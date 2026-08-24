package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from OpenFlags.java
public enum OpenFlags implements Constant {
   O_CREAT(256L),
   O_WRONLY(1L),
   O_TMPFILE(4259840L),
   O_RDONLY(0L),
   O_APPEND(8L),
   O_NONBLOCK(128L),
   O_SYNC(16400L),
   O_NOCTTY(2048L),
   O_DIRECTORY(65536L),
   O_CLOEXEC(524288L),
   O_RDWR(2L),
   O_NOFOLLOW(131072L),
   O_ASYNC(4096L),
   O_ACCMODE(3L),
   O_TRUNC(512L),
   O_FSYNC(16400L),
   O_EXCL(1024L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 4259840L;

   OpenFlags(long value) {
      this.value = value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return OpenFlags.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
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
