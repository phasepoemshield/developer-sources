package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from Confstr.java
public enum Confstr implements Constant {
   _CS_V6_ENV(15L),
   _CS_POSIX_V7_ILP32_OFF32_LDFLAGS(17L),
   _CS_POSIX_V6_LP64_OFF64_LIBS(10L),
   _CS_POSIX_V7_LP64_OFF64_LIBS(24L),
   _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS(12L),
   _CS_POSIX_V6_ILP32_OFF32_CFLAGS(2L),
   _CS_POSIX_V6_ILP32_OFF32_LDFLAGS(3L),
   _CS_POSIX_V6_LP64_OFF64_LDFLAGS(9L),
   _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS(5L),
   _CS_PATH(1L),
   _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS(26L),
   _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS(20L),
   _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS(19L),
   _CS_POSIX_V6_LP64_OFF64_CFLAGS(8L),
   _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS(14L),
   _CS_V7_ENV(31L),
   _CS_POSIX_V6_LPBIG_OFFBIG_LIBS(13L),
   _CS_POSIX_V6_ILP32_OFFBIG_LIBS(7L),
   _CS_POSIX_V7_ILP32_OFF32_LIBS(18L),
   _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS(25L),
   _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS(6L),
   _CS_POSIX_V7_LP64_OFF64_CFLAGS(22L),
   _CS_POSIX_V7_ILP32_OFF32_CFLAGS(16L),
   _CS_POSIX_V6_ILP32_OFF32_LIBS(4L),
   _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS(11L),
   _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS(30L),
   _CS_POSIX_V7_LP64_OFF64_LDFLAGS(23L),
   _CS_POSIX_V7_LPBIG_OFFBIG_LIBS(27L),
   _CS_POSIX_V7_ILP32_OFFBIG_LIBS(21L);

   public static final long MIN_VALUE = 1L;
   public static final long MAX_VALUE = 31L;
   private final long value;

   Confstr(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return Confstr.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   // $VF: Compiled from Confstr.java
   static final class StringTable {
      public static final Map<Confstr, String> descriptions = generateTable();

      public static final Map<Confstr, String> generateTable() {
         Map<Confstr, String> map = new EnumMap<>(Confstr.class);
         map.put(Confstr._CS_PATH, "_CS_PATH");
         map.put(Confstr._CS_POSIX_V7_ILP32_OFF32_CFLAGS, "_CS_POSIX_V7_ILP32_OFF32_CFLAGS");
         map.put(Confstr._CS_POSIX_V7_ILP32_OFF32_LDFLAGS, "_CS_POSIX_V7_ILP32_OFF32_LDFLAGS");
         map.put(Confstr._CS_POSIX_V7_ILP32_OFF32_LIBS, "_CS_POSIX_V7_ILP32_OFF32_LIBS");
         map.put(Confstr._CS_POSIX_V7_ILP32_OFFBIG_CFLAGS, "_CS_POSIX_V7_ILP32_OFFBIG_CFLAGS");
         map.put(Confstr._CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS, "_CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS");
         map.put(Confstr._CS_POSIX_V7_ILP32_OFFBIG_LIBS, "_CS_POSIX_V7_ILP32_OFFBIG_LIBS");
         map.put(Confstr._CS_POSIX_V7_LP64_OFF64_CFLAGS, "_CS_POSIX_V7_LP64_OFF64_CFLAGS");
         map.put(Confstr._CS_POSIX_V7_LP64_OFF64_LDFLAGS, "_CS_POSIX_V7_LP64_OFF64_LDFLAGS");
         map.put(Confstr._CS_POSIX_V7_LP64_OFF64_LIBS, "_CS_POSIX_V7_LP64_OFF64_LIBS");
         map.put(Confstr._CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS, "_CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS");
         map.put(Confstr._CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS, "_CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS");
         map.put(Confstr._CS_POSIX_V7_LPBIG_OFFBIG_LIBS, "_CS_POSIX_V7_LPBIG_OFFBIG_LIBS");
         map.put(Confstr._CS_POSIX_V7_WIDTH_RESTRICTED_ENVS, "_CS_POSIX_V7_WIDTH_RESTRICTED_ENVS");
         map.put(Confstr._CS_V7_ENV, "_CS_V7_ENV");
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
         map.put(Confstr._CS_V6_ENV, "_CS_V6_ENV");
         return map;
      }
   }
}
