/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class LangInfo
extends Enum<LangInfo>
implements Constant {
    public static final /* enum */ LangInfo DAY_2;
    public static final /* enum */ LangInfo RADIXCHAR;
    public static final /* enum */ LangInfo ABDAY_1;
    public static final /* enum */ LangInfo ABDAY_7;
    public static final /* enum */ LangInfo DAY_3;
    public static final /* enum */ LangInfo MON_3;
    public static final /* enum */ LangInfo MON_1;
    public static final /* enum */ LangInfo MON_11;
    public static final /* enum */ LangInfo D_FMT;
    public static final /* enum */ LangInfo CODESET;
    public static final /* enum */ LangInfo ABMON_1;
    public static final /* enum */ LangInfo ABDAY_5;
    public static final /* enum */ LangInfo ABDAY_4;
    public static final /* enum */ LangInfo DAY_1;
    public static final /* enum */ LangInfo D_T_FMT;
    public static final /* enum */ LangInfo ABMON_3;
    public static final /* enum */ LangInfo MON_7;
    public static final /* enum */ LangInfo ABMON_10;
    public static final /* enum */ LangInfo ABMON_12;
    public static final /* enum */ LangInfo MON_9;
    public static final /* enum */ LangInfo ABMON_7;
    public static final /* enum */ LangInfo __UNKNOWN_CONSTANT__;
    public static final /* enum */ LangInfo MON_12;
    public static final /* enum */ LangInfo NOEXPR;
    private static final ConstantResolver<LangInfo> resolver;
    public static final /* enum */ LangInfo ABDAY_2;
    public static final /* enum */ LangInfo CRNCYSTR;
    public static final /* enum */ LangInfo MON_5;
    public static final /* enum */ LangInfo ABDAY_3;
    public static final /* enum */ LangInfo ABMON_8;
    public static final /* enum */ LangInfo YESEXPR;
    public static final /* enum */ LangInfo ABMON_5;
    public static final /* enum */ LangInfo MON_2;
    public static final /* enum */ LangInfo ABMON_9;
    public static final /* enum */ LangInfo DAY_5;
    public static final /* enum */ LangInfo ABMON_4;
    public static final /* enum */ LangInfo ABMON_6;
    public static final /* enum */ LangInfo DAY_7;
    public static final /* enum */ LangInfo MON_4;
    public static final /* enum */ LangInfo THOUSEP;
    public static final /* enum */ LangInfo MON_10;
    public static final /* enum */ LangInfo T_FMT;
    public static final /* enum */ LangInfo DAY_4;
    public static final /* enum */ LangInfo ABMON_11;
    public static final /* enum */ LangInfo ABMON_2;
    public static final /* enum */ LangInfo MON_6;
    public static final /* enum */ LangInfo ABDAY_6;
    private static final /* synthetic */ LangInfo[] $VALUES;
    public static final /* enum */ LangInfo DAY_6;
    public static final /* enum */ LangInfo MON_8;

    static {
        CODESET = new LangInfo();
        D_T_FMT = new LangInfo();
        D_FMT = new LangInfo();
        T_FMT = new LangInfo();
        DAY_1 = new LangInfo();
        DAY_2 = new LangInfo();
        DAY_3 = new LangInfo();
        DAY_4 = new LangInfo();
        DAY_5 = new LangInfo();
        DAY_6 = new LangInfo();
        DAY_7 = new LangInfo();
        ABDAY_1 = new LangInfo();
        ABDAY_2 = new LangInfo();
        ABDAY_3 = new LangInfo();
        ABDAY_4 = new LangInfo();
        ABDAY_5 = new LangInfo();
        ABDAY_6 = new LangInfo();
        ABDAY_7 = new LangInfo();
        MON_1 = new LangInfo();
        MON_2 = new LangInfo();
        MON_3 = new LangInfo();
        MON_4 = new LangInfo();
        MON_5 = new LangInfo();
        MON_6 = new LangInfo();
        MON_7 = new LangInfo();
        MON_8 = new LangInfo();
        MON_9 = new LangInfo();
        MON_10 = new LangInfo();
        MON_11 = new LangInfo();
        MON_12 = new LangInfo();
        ABMON_1 = new LangInfo();
        ABMON_2 = new LangInfo();
        ABMON_3 = new LangInfo();
        ABMON_4 = new LangInfo();
        ABMON_5 = new LangInfo();
        ABMON_6 = new LangInfo();
        ABMON_7 = new LangInfo();
        ABMON_8 = new LangInfo();
        ABMON_9 = new LangInfo();
        ABMON_10 = new LangInfo();
        ABMON_11 = new LangInfo();
        ABMON_12 = new LangInfo();
        RADIXCHAR = new LangInfo();
        THOUSEP = new LangInfo();
        YESEXPR = new LangInfo();
        NOEXPR = new LangInfo();
        CRNCYSTR = new LangInfo();
        __UNKNOWN_CONSTANT__ = new LangInfo();
        LangInfo[] langInfoArray = new LangInfo[48];
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
        langInfoArray[47] = __UNKNOWN_CONSTANT__;
        $VALUES = langInfoArray;
        resolver = ConstantResolver.getResolver(LangInfo.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    public final String toString() {
        return this.description();
    }

    public static LangInfo valueOf(String name) {
        return Enum.valueOf(LangInfo.class, name);
    }

    public static LangInfo[] values() {
        return (LangInfo[])$VALUES.clone();
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

