package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

// $VF: Compiled from LangInfo.java
public enum LangInfo implements Constant {
   RADIXCHAR(65536L),
   MON_11(131108L),
   THOUSEP(65537L),
   MON_1(131098L),
   MON_8(131105L),
   ABDAY_1(131072L),
   ABDAY_6(131077L),
   YESEXPR(327680L),
   DAY_1(131079L),
   ABMON_11(131096L),
   DAY_6(131084L),
   CODESET(14L),
   MON_7(131104L),
   MON_6(131103L),
   ABDAY_5(131076L),
   ABMON_10(131095L),
   D_FMT(131113L),
   MON_3(131100L),
   ABMON_12(131097L),
   ABMON_8(131093L),
   MON_2(131099L),
   ABDAY_3(131074L),
   ABDAY_7(131078L),
   DAY_3(131081L),
   NOEXPR(327681L),
   ABMON_7(131092L),
   DAY_2(131080L),
   CRNCYSTR(262159L),
   DAY_7(131085L),
   DAY_5(131083L),
   DAY_4(131082L),
   ABMON_4(131089L),
   ABMON_1(131086L),
   ABMON_3(131088L),
   MON_10(131107L),
   ABMON_5(131090L),
   T_FMT(131114L),
   ABMON_6(131091L),
   ABDAY_4(131075L),
   ABDAY_2(131073L),
   MON_9(131106L),
   MON_12(131109L),
   D_T_FMT(131112L),
   ABMON_2(131087L),
   ABMON_9(131094L),
   MON_5(131102L),
   MON_4(131101L);

   public static final long MAX_VALUE = 327681L;
   public static final long MIN_VALUE = 14L;
   private final long value;

   @Override
   public final long longValue() {
      return this.value;
   }

   @Override
   public final String toString() {
      return LangInfo.StringTable.descriptions.get(this);
   }

   public final int value() {
      return (int)this.value;
   }

   @Override
   public final boolean defined() {
      return true;
   }

   LangInfo(long value) {
      this.value = value;
   }

   @Override
   public final int intValue() {
      return (int)this.value;
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
