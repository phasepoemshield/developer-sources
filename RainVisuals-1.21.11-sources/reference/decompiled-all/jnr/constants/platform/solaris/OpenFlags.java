package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from OpenFlags.java
public enum OpenFlags implements Constant {
   O_DIRECTORY(16777216L),
   O_NONBLOCK(128L),
   O_NOCTTY(2048L),
   O_CREAT(256L),
   O_WRONLY(1L),
   O_CLOEXEC(8388608L),
   O_TRUNC(512L),
   O_EXCL(1024L),
   O_RDWR(2L),
   O_ACCMODE(6291459L),
   O_NOFOLLOW(131072L),
   O_APPEND(8L),
   O_SYNC(16L),
   O_RDONLY(0L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 16777216L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final String toString() {
      return OpenFlags.StringTable.descriptions.get(this);
   }

   public final int value() {
      return (int)this.value;
   }

   OpenFlags(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
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
