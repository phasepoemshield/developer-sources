package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from LangInfo.java
public enum LangInfo implements Constant {
   MON_12(26L),
   CODESET(49L),
   ABDAY_4(11L),
   ABMON_4(30L),
   ABMON_7(33L),
   ABDAY_2(9L),
   ABDAY_7(14L),
   DAY_1(1L),
   NOEXPR(57L),
   YESEXPR(56L),
   ABDAY_3(10L),
   DAY_2(2L),
   MON_4(18L),
   ABMON_10(36L),
   MON_10(24L),
   ABMON_9(35L),
   THOUSEP(40L),
   ABMON_6(32L),
   DAY_6(6L),
   D_FMT(45L),
   DAY_4(4L),
   T_FMT(46L),
   MON_11(25L),
   ABMON_3(29L),
   ABDAY_5(12L),
   MON_9(23L),
   ABMON_11(37L),
   ABDAY_6(13L),
   MON_5(19L),
   DAY_3(3L),
   MON_1(15L),
   MON_2(16L),
   ABDAY_1(8L),
   ABMON_8(34L),
   MON_6(20L),
   CRNCYSTR(43L),
   MON_8(22L),
   DAY_7(7L),
   ABMON_5(31L),
   MON_7(21L),
   ABMON_2(28L),
   RADIXCHAR(39L),
   ABMON_12(38L),
   ABMON_1(27L),
   DAY_5(5L),
   MON_3(17L),
   D_T_FMT(44L);

   private final long value;
   public static final long MAX_VALUE = 57L;
   public static final long MIN_VALUE = 1L;

   @Override
   public final String toString() {
      return LangInfo.StringTable.descriptions.get(this);
   }

   LangInfo(long value) {
      this.value = value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }

   @Override
   public final long longValue() {
      return this.value;
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
