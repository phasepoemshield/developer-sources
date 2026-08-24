package jnr.constants.platform;

import jnr.constants.Constant;

// $VF: Compiled from LangInfo.java
public enum LangInfo implements Constant {
   DAY_2,
   RADIXCHAR,
   ABDAY_1,
   ABDAY_7,
   DAY_3,
   MON_3,
   MON_1,
   MON_11,
   D_FMT,
   CODESET,
   ABMON_1,
   ABDAY_5,
   ABDAY_4,
   DAY_1,
   D_T_FMT,
   ABMON_3,
   MON_7,
   ABMON_10,
   ABMON_12,
   MON_9,
   ABMON_7,
   __UNKNOWN_CONSTANT__,
   MON_12,
   NOEXPR,
   ABDAY_2,
   CRNCYSTR,
   MON_5,
   ABDAY_3,
   ABMON_8,
   YESEXPR,
   ABMON_5,
   MON_2,
   ABMON_9,
   DAY_5,
   ABMON_4,
   ABMON_6,
   DAY_7,
   MON_4,
   THOUSEP,
   MON_10,
   T_FMT,
   DAY_4,
   ABMON_11,
   ABMON_2,
   MON_6,
   ABDAY_6,
   DAY_6,
   MON_8;

   private static final ConstantResolver<LangInfo> resolver = ConstantResolver.getResolver(LangInfo.class, 20000, 29999);

   @Override
   public final int intValue() {
      return (int)resolver.longValue(this);
   }

   public final String description() {
      return resolver.description(this);
   }

   @Override
   public final String toString() {
      return this.description();
   }

   @Override
   public final long longValue() {
      return resolver.longValue(this);
   }

   @Override
   public final boolean defined() {
      return resolver.defined(this);
   }

   public static LangInfo valueOf(long value) {
      return resolver.valueOf(value);
   }

   public final int value() {
      return (int)resolver.longValue(this);
   }
}
