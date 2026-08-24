package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from OpenFlags.java
public enum OpenFlags implements Constant {
   O_APPEND(8L),
   O_ACCMODE(3L),
   O_TRUNC(512L),
   O_BINARY(32768L),
   O_CREAT(256L),
   O_EXCL(1024L),
   O_RDONLY(0L),
   O_WRONLY(1L),
   O_RDWR(2L);

   public static final long MAX_VALUE = 32768L;
   private final long value;
   public static final long MIN_VALUE = 0L;

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

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
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
         map.put(OpenFlags.O_APPEND, "O_APPEND");
         map.put(OpenFlags.O_CREAT, "O_CREAT");
         map.put(OpenFlags.O_TRUNC, "O_TRUNC");
         map.put(OpenFlags.O_EXCL, "O_EXCL");
         map.put(OpenFlags.O_BINARY, "O_BINARY");
         return map;
      }
   }
}
