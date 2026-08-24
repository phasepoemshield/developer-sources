package jnr.constants.platform.aix;

import jnr.constants.Constant;

// $VF: Compiled from LangInfo.java
public enum LangInfo implements Constant {
   RADIXCHAR(44L),
   ABMON_10(29L),
   D_T_FMT(1L),
   ABMON_2(21L),
   MON_12(43L),
   T_FMT(3L),
   ABDAY_2(7L),
   DAY_1(13L),
   ABDAY_5(10L),
   ABMON_8(27L),
   MON_4(35L),
   DAY_4(16L),
   ABDAY_6(11L),
   MON_11(42L),
   ABMON_6(25L),
   ABMON_3(22L),
   ABMON_5(24L),
   MON_3(34L),
   ABMON_7(26L),
   D_FMT(2L),
   ABDAY_4(9L),
   ABMON_9(28L),
   ABMON_12(31L),
   DAY_2(14L),
   DAY_3(15L),
   MON_6(37L),
   MON_7(38L),
   MON_8(39L),
   CODESET(49L),
   YESEXPR(61L),
   ABMON_1(20L),
   MON_2(33L),
   CRNCYSTR(48L),
   ABMON_4(23L),
   DAY_7(19L),
   MON_10(41L),
   MON_1(32L),
   DAY_6(18L),
   ABDAY_3(8L),
   THOUSEP(45L),
   ABMON_11(30L),
   MON_5(36L),
   DAY_5(17L),
   ABDAY_7(12L),
   NOEXPR(62L),
   MON_9(40L),
   ABDAY_1(6L);

   public static final long MAX_VALUE = 62L;
   private final long value;
   public static final long MIN_VALUE = 1L;

   @Override
   public final boolean defined() {
      return true;
   }

   @Override
   public final long longValue() {
      return this.value;
   }

   LangInfo(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
   }
}
