package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Confstr.java
public enum Confstr implements Constant {
   _CS_POSIX_V6_ILP32_OFF32_CFLAGS(2L),
   _CS_POSIX_V6_ILP32_OFF32_LDFLAGS(3L),
   _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS(11L),
   _CS_POSIX_V6_ILP32_OFFBIG_LIBS(7L),
   _CS_POSIX_V6_LPBIG_OFFBIG_LIBS(13L),
   _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS(12L),
   _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS(14L),
   _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS(5L),
   _CS_POSIX_V6_LP64_OFF64_LDFLAGS(9L),
   _CS_POSIX_V6_LP64_OFF64_LIBS(10L),
   _CS_POSIX_V6_LP64_OFF64_CFLAGS(8L),
   _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS(6L),
   _CS_POSIX_V6_ILP32_OFF32_LIBS(4L),
   _CS_PATH(1L);

   private final long value;
   public static final long MAX_VALUE = 14L;
   public static final long MIN_VALUE = 1L;

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return Confstr.StringTable.descriptions.get(this);
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   Confstr(long value) {
      this.value = value;
   }

   // $VF: Compiled from Confstr.java
   static final class StringTable {
      public static final Map<Confstr, String> descriptions = generateTable();

      public static final Map<Confstr, String> generateTable() {
         Map<Confstr, String> map = new EnumMap<>(Confstr.class);
         map.put(Confstr._CS_PATH, "_CS_PATH");
         map.put(Confstr._CS_POSIX_V6_ILP32_OFF32_CFLAGS, "_CS_POSIX_V6_ILP32_OFF32_CFLAGS");
         map.put(Confstr._CS_POSIX_V6_ILP32_OFF32_LDFLAGS, "_CS_POSIX_V6_ILP32_OFF32_LDFLAGS");
         map.put(Confstr._CS_POSIX_V6_ILP32_OFF32_LIBS, "_CS_POSIX_V6_ILP32_OFF32_LIBS");
         map.put(Confstr._CS_POSIX_V6_ILP32_OFFBIG_CFLAGS, "_CS_POSIX_V6_ILP32_OFFBIG_CFLAGS");
         map.put(Confstr._CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS, "_CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS");
         map.put(Confstr._CS_POSIX_V6_ILP32_OFFBIG_LIBS, "_CS_POSIX_V6_ILP32_OFFBIG_LIBS");
         map.put(Confstr._CS_POSIX_V6_LP64_OFF64_CFLAGS, "_CS_POSIX_V6_LP64_OFF64_CFLAGS");
         map.put(Confstr._CS_POSIX_V6_LP64_OFF64_LDFLAGS, "_CS_POSIX_V6_LP64_OFF64_LDFLAGS");
         map.put(Confstr._CS_POSIX_V6_LP64_OFF64_LIBS, "_CS_POSIX_V6_LP64_OFF64_LIBS");
         map.put(Confstr._CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS, "_CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS");
         map.put(Confstr._CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS, "_CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS");
         map.put(Confstr._CS_POSIX_V6_LPBIG_OFFBIG_LIBS, "_CS_POSIX_V6_LPBIG_OFFBIG_LIBS");
         map.put(Confstr._CS_POSIX_V6_WIDTH_RESTRICTED_ENVS, "_CS_POSIX_V6_WIDTH_RESTRICTED_ENVS");
         return map;
      }
   }
}
