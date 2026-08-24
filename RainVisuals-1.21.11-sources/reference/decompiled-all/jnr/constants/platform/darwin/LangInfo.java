package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from LangInfo.java
public enum LangInfo implements Constant {
   CRNCYSTR(56L),
   YESEXPR(52L),
   MON_1(21L),
   NOEXPR(53L),
   ABMON_1(33L),
   MON_12(32L),
   MON_2(22L),
   ABMON_11(43L),
   ABDAY_3(16L),
   MON_9(29L),
   THOUSEP(51L),
   DAY_3(9L),
   ABMON_9(41L),
   D_T_FMT(1L),
   ABDAY_6(19L),
   DAY_4(10L),
   ABDAY_7(20L),
   ABDAY_2(15L),
   MON_3(23L),
   DAY_6(12L),
   RADIXCHAR(50L),
   ABDAY_1(14L),
   MON_10(30L),
   ABMON_2(34L),
   MON_6(26L),
   ABMON_8(40L),
   ABDAY_4(17L),
   DAY_1(7L),
   MON_5(25L),
   DAY_5(11L),
   ABMON_10(42L),
   DAY_2(8L),
   MON_4(24L),
   ABDAY_5(18L),
   ABMON_12(44L),
   ABMON_3(35L),
   ABMON_7(39L),
   ABMON_4(36L),
   T_FMT(3L),
   MON_8(28L),
   DAY_7(13L),
   CODESET(0L),
   MON_7(27L),
   ABMON_5(37L),
   MON_11(31L),
   D_FMT(2L),
   ABMON_6(38L);

   private final long value;
   public static final long MIN_VALUE = 0L;
   public static final long MAX_VALUE = 56L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final String toString() {
      return LangInfo.StringTable.descriptions.get(this);
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   LangInfo(long value) {
      this.value = value;
   }

   // $VF: Compiled from LangInfo.java
   static final class StringTable {
      public static final Map<LangInfo, String> descriptions = generateTable();

      public static final Map<LangInfo, String> generateTable() {
         Map<LangInfo, String> map = new EnumMap<>(LangInfo.class);
         map.put(LangInfo.CODESET, "CODESET");
         map.put(LangInfo.D_T_FMT, "D_T_FMT");
         map.put(LangInfo.D_FMT, "D_FMT");
         map.put(LangInfo.T_FMT, "T_FMT");
         map.put(LangInfo.DAY_1, "DAY_1");
         map.put(LangInfo.DAY_2, "DAY_2");
         map.put(LangInfo.DAY_3, "DAY_3");
         map.put(LangInfo.DAY_4, "DAY_4");
         map.put(LangInfo.DAY_5, "DAY_5");
         map.put(LangInfo.DAY_6, "DAY_6");
         map.put(LangInfo.DAY_7, "DAY_7");
         map.put(LangInfo.ABDAY_1, "ABDAY_1");
         map.put(LangInfo.ABDAY_2, "ABDAY_2");
         map.put(LangInfo.ABDAY_3, "ABDAY_3");
         map.put(LangInfo.ABDAY_4, "ABDAY_4");
         map.put(LangInfo.ABDAY_5, "ABDAY_5");
         map.put(LangInfo.ABDAY_6, "ABDAY_6");
         map.put(LangInfo.ABDAY_7, "ABDAY_7");
         map.put(LangInfo.MON_1, "MON_1");
         map.put(LangInfo.MON_2, "MON_2");
         map.put(LangInfo.MON_3, "MON_3");
         map.put(LangInfo.MON_4, "MON_4");
         map.put(LangInfo.MON_5, "MON_5");
         map.put(LangInfo.MON_6, "MON_6");
         map.put(LangInfo.MON_7, "MON_7");
         map.put(LangInfo.MON_8, "MON_8");
         map.put(LangInfo.MON_9, "MON_9");
         map.put(LangInfo.MON_10, "MON_10");
         map.put(LangInfo.MON_11, "MON_11");
         map.put(LangInfo.MON_12, "MON_12");
         map.put(LangInfo.ABMON_1, "ABMON_1");
         map.put(LangInfo.ABMON_2, "ABMON_2");
         map.put(LangInfo.ABMON_3, "ABMON_3");
         map.put(LangInfo.ABMON_4, "ABMON_4");
         map.put(LangInfo.ABMON_5, "ABMON_5");
         map.put(LangInfo.ABMON_6, "ABMON_6");
         map.put(LangInfo.ABMON_7, "ABMON_7");
         map.put(LangInfo.ABMON_8, "ABMON_8");
         map.put(LangInfo.ABMON_9, "ABMON_9");
         map.put(LangInfo.ABMON_10, "ABMON_10");
         map.put(LangInfo.ABMON_11, "ABMON_11");
         map.put(LangInfo.ABMON_12, "ABMON_12");
         map.put(LangInfo.RADIXCHAR, "RADIXCHAR");
         map.put(LangInfo.THOUSEP, "THOUSEP");
         map.put(LangInfo.YESEXPR, "YESEXPR");
         map.put(LangInfo.NOEXPR, "NOEXPR");
         map.put(LangInfo.CRNCYSTR, "CRNCYSTR");
         return map;
      }
   }
}
