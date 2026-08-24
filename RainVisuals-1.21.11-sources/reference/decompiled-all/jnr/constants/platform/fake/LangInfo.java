package jnr.constants.platform.fake;

import jnr.constants.Constant;

// $VF: Compiled from LangInfo.java
public enum LangInfo implements Constant {
   DAY_3(7L),
   RADIXCHAR(43L),
   ABMON_1(31L),
   CRNCYSTR(47L),
   D_FMT(3L),
   D_T_FMT(2L),
   ABMON_2(32L),
   MON_2(20L),
   DAY_2(6L),
   CODESET(1L),
   YESEXPR(45L),
   ABMON_6(36L),
   ABMON_3(33L),
   T_FMT(4L),
   DAY_5(9L),
   ABDAY_3(14L),
   ABMON_9(39L),
   DAY_4(8L),
   ABMON_12(42L),
   ABDAY_1(12L),
   MON_10(28L),
   ABMON_7(37L),
   NOEXPR(46L),
   MON_11(29L),
   MON_1(19L),
   ABMON_11(41L),
   MON_12(30L),
   ABDAY_2(13L),
   MON_8(26L),
   THOUSEP(44L),
   ABMON_5(35L),
   ABDAY_4(15L),
   MON_5(23L),
   MON_9(27L),
   ABDAY_5(16L),
   MON_7(25L),
   DAY_7(11L),
   MON_3(21L),
   DAY_6(10L),
   MON_4(22L),
   ABDAY_7(18L),
   ABMON_4(34L),
   DAY_1(5L),
   ABMON_10(40L),
   ABDAY_6(17L),
   MON_6(24L),
   ABMON_8(38L);

   public static final long MAX_VALUE = 47L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   LangInfo(long value) {
      this.value = value;
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
}
