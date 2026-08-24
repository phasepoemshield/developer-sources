/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.openbsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class LangInfo
extends Enum<LangInfo>
implements Constant {
    public static final /* enum */ LangInfo ABMON_9;
    public static final /* enum */ LangInfo ABDAY_1;
    public static final /* enum */ LangInfo D_FMT;
    public static final /* enum */ LangInfo THOUSEP;
    public static final /* enum */ LangInfo ABMON_3;
    public static final /* enum */ LangInfo DAY_6;
    public static final /* enum */ LangInfo ABMON_1;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ LangInfo ABDAY_7;
    public static final /* enum */ LangInfo DAY_3;
    public static final /* enum */ LangInfo MON_10;
    public static final /* enum */ LangInfo ABMON_4;
    public static final /* enum */ LangInfo DAY_2;
    public static final /* enum */ LangInfo RADIXCHAR;
    public static final /* enum */ LangInfo YESEXPR;
    public static final /* enum */ LangInfo ABMON_6;
    public static final /* enum */ LangInfo MON_3;
    public static final /* enum */ LangInfo MON_8;
    public static final /* enum */ LangInfo ABMON_10;
    public static final /* enum */ LangInfo MON_6;
    public static final long MAX_VALUE = 51L;
    private static final /* synthetic */ LangInfo[] $VALUES;
    public static final /* enum */ LangInfo DAY_1;
    public static final /* enum */ LangInfo ABMON_5;
    public static final /* enum */ LangInfo D_T_FMT;
    public static final /* enum */ LangInfo MON_5;
    public static final /* enum */ LangInfo MON_1;
    public static final /* enum */ LangInfo DAY_5;
    public static final /* enum */ LangInfo MON_9;
    public static final /* enum */ LangInfo ABDAY_4;
    public static final /* enum */ LangInfo ABDAY_5;
    public static final /* enum */ LangInfo MON_7;
    public static final /* enum */ LangInfo ABDAY_6;
    public static final /* enum */ LangInfo CRNCYSTR;
    public static final /* enum */ LangInfo ABMON_2;
    public static final /* enum */ LangInfo ABMON_12;
    public static final /* enum */ LangInfo MON_12;
    public static final /* enum */ LangInfo ABMON_7;
    public static final /* enum */ LangInfo DAY_4;
    public static final /* enum */ LangInfo MON_4;
    public static final /* enum */ LangInfo CODESET;
    public static final /* enum */ LangInfo DAY_7;
    public static final /* enum */ LangInfo ABMON_8;
    public static final /* enum */ LangInfo MON_2;
    public static final /* enum */ LangInfo ABMON_11;
    public static final /* enum */ LangInfo MON_11;
    public static final /* enum */ LangInfo ABDAY_3;
    private final long value;
    public static final /* enum */ LangInfo T_FMT;
    public static final /* enum */ LangInfo ABDAY_2;
    public static final /* enum */ LangInfo NOEXPR;

    public static LangInfo[] values() {
        return (LangInfo[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        CODESET = new LangInfo(51L);
        D_T_FMT = new LangInfo(0L);
        D_FMT = new LangInfo(1L);
        T_FMT = new LangInfo(2L);
        DAY_1 = new LangInfo(6L);
        DAY_2 = new LangInfo(7L);
        DAY_3 = new LangInfo(8L);
        DAY_4 = new LangInfo(9L);
        DAY_5 = new LangInfo(10L);
        DAY_6 = new LangInfo(11L);
        DAY_7 = new LangInfo(12L);
        ABDAY_1 = new LangInfo(13L);
        ABDAY_2 = new LangInfo(14L);
        ABDAY_3 = new LangInfo(15L);
        ABDAY_4 = new LangInfo(16L);
        ABDAY_5 = new LangInfo(17L);
        ABDAY_6 = new LangInfo(18L);
        ABDAY_7 = new LangInfo(19L);
        MON_1 = new LangInfo(20L);
        MON_2 = new LangInfo(21L);
        MON_3 = new LangInfo(22L);
        MON_4 = new LangInfo(23L);
        MON_5 = new LangInfo(24L);
        MON_6 = new LangInfo(25L);
        MON_7 = new LangInfo(26L);
        MON_8 = new LangInfo(27L);
        MON_9 = new LangInfo(28L);
        MON_10 = new LangInfo(29L);
        MON_11 = new LangInfo(30L);
        MON_12 = new LangInfo(31L);
        ABMON_1 = new LangInfo(32L);
        ABMON_2 = new LangInfo(33L);
        ABMON_3 = new LangInfo(34L);
        ABMON_4 = new LangInfo(35L);
        ABMON_5 = new LangInfo(36L);
        ABMON_6 = new LangInfo(37L);
        ABMON_7 = new LangInfo(38L);
        ABMON_8 = new LangInfo(39L);
        ABMON_9 = new LangInfo(40L);
        ABMON_10 = new LangInfo(41L);
        ABMON_11 = new LangInfo(42L);
        ABMON_12 = new LangInfo(43L);
        RADIXCHAR = new LangInfo(44L);
        THOUSEP = new LangInfo(45L);
        YESEXPR = new LangInfo(47L);
        NOEXPR = new LangInfo(49L);
        CRNCYSTR = new LangInfo(50L);
        LangInfo[] langInfoArray = new LangInfo[47];
        langInfoArray[0] = CODESET;
        langInfoArray[1] = D_T_FMT;
        langInfoArray[2] = D_FMT;
        langInfoArray[3] = T_FMT;
        langInfoArray[4] = DAY_1;
        langInfoArray[5] = DAY_2;
        langInfoArray[6] = DAY_3;
        langInfoArray[7] = DAY_4;
        langInfoArray[8] = DAY_5;
        langInfoArray[9] = DAY_6;
        langInfoArray[10] = DAY_7;
        langInfoArray[11] = ABDAY_1;
        langInfoArray[12] = ABDAY_2;
        langInfoArray[13] = ABDAY_3;
        langInfoArray[14] = ABDAY_4;
        langInfoArray[15] = ABDAY_5;
        langInfoArray[16] = ABDAY_6;
        langInfoArray[17] = ABDAY_7;
        langInfoArray[18] = MON_1;
        langInfoArray[19] = MON_2;
        langInfoArray[20] = MON_3;
        langInfoArray[21] = MON_4;
        langInfoArray[22] = MON_5;
        langInfoArray[23] = MON_6;
        langInfoArray[24] = MON_7;
        langInfoArray[25] = MON_8;
        langInfoArray[26] = MON_9;
        langInfoArray[27] = MON_10;
        langInfoArray[28] = MON_11;
        langInfoArray[29] = MON_12;
        langInfoArray[30] = ABMON_1;
        langInfoArray[31] = ABMON_2;
        langInfoArray[32] = ABMON_3;
        langInfoArray[33] = ABMON_4;
        langInfoArray[34] = ABMON_5;
        langInfoArray[35] = ABMON_6;
        langInfoArray[36] = ABMON_7;
        langInfoArray[37] = ABMON_8;
        langInfoArray[38] = ABMON_9;
        langInfoArray[39] = ABMON_10;
        langInfoArray[40] = ABMON_11;
        langInfoArray[41] = ABMON_12;
        langInfoArray[42] = RADIXCHAR;
        langInfoArray[43] = THOUSEP;
        langInfoArray[44] = YESEXPR;
        langInfoArray[45] = NOEXPR;
        langInfoArray[46] = CRNCYSTR;
        $VALUES = langInfoArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static LangInfo valueOf(String name) {
        return Enum.valueOf(LangInfo.class, name);
    }

    private LangInfo(long value) {
        this.value = value;
    }

    static final class StringTable {
        public static final Map<LangInfo, String> descriptions = StringTable.generateTable();

        public static final Map<LangInfo, String> generateTable() {
            EnumMap<LangInfo, String> map = new EnumMap<LangInfo, String>(LangInfo.class);
            map.put(CODESET, "CODESET");
            map.put(D_T_FMT, "D_T_FMT");
            map.put(D_FMT, "D_FMT");
            map.put(T_FMT, "T_FMT");
            map.put(DAY_1, "DAY_1");
            map.put(DAY_2, "DAY_2");
            map.put(DAY_3, "DAY_3");
            map.put(DAY_4, "DAY_4");
            map.put(DAY_5, "DAY_5");
            map.put(DAY_6, "DAY_6");
            map.put(DAY_7, "DAY_7");
            map.put(ABDAY_1, "ABDAY_1");
            map.put(ABDAY_2, "ABDAY_2");
            map.put(ABDAY_3, "ABDAY_3");
            map.put(ABDAY_4, "ABDAY_4");
            map.put(ABDAY_5, "ABDAY_5");
            map.put(ABDAY_6, "ABDAY_6");
            map.put(ABDAY_7, "ABDAY_7");
            map.put(MON_1, "MON_1");
            map.put(MON_2, "MON_2");
            map.put(MON_3, "MON_3");
            map.put(MON_4, "MON_4");
            map.put(MON_5, "MON_5");
            map.put(MON_6, "MON_6");
            map.put(MON_7, "MON_7");
            map.put(MON_8, "MON_8");
            map.put(MON_9, "MON_9");
            map.put(MON_10, "MON_10");
            map.put(MON_11, "MON_11");
            map.put(MON_12, "MON_12");
            map.put(ABMON_1, "ABMON_1");
            map.put(ABMON_2, "ABMON_2");
            map.put(ABMON_3, "ABMON_3");
            map.put(ABMON_4, "ABMON_4");
            map.put(ABMON_5, "ABMON_5");
            map.put(ABMON_6, "ABMON_6");
            map.put(ABMON_7, "ABMON_7");
            map.put(ABMON_8, "ABMON_8");
            map.put(ABMON_9, "ABMON_9");
            map.put(ABMON_10, "ABMON_10");
            map.put(ABMON_11, "ABMON_11");
            map.put(ABMON_12, "ABMON_12");
            map.put(RADIXCHAR, "RADIXCHAR");
            map.put(THOUSEP, "THOUSEP");
            map.put(YESEXPR, "YESEXPR");
            map.put(NOEXPR, "NOEXPR");
            map.put(CRNCYSTR, "CRNCYSTR");
            return map;
        }

        StringTable() {
        }
    }
}

