/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class Locale
extends Enum<Locale>
implements Constant {
    private static final /* synthetic */ Locale[] $VALUES;
    public static final long MAX_VALUE = 5L;
    public static final long MIN_VALUE = -1L;
    public static final /* enum */ Locale LC_NUMERIC;
    public static final /* enum */ Locale LC_MONETARY;
    public static final /* enum */ Locale LC_ALL;
    private final long value;
    public static final /* enum */ Locale LC_COLLATE;
    public static final /* enum */ Locale LC_CTYPE;
    public static final /* enum */ Locale LC_TIME;
    public static final /* enum */ Locale LC_MESSAGES;

    public static Locale valueOf(String name) {
        return Enum.valueOf(Locale.class, name);
    }

    private Locale(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        LC_CTYPE = new Locale(1L);
        LC_NUMERIC = new Locale(3L);
        LC_TIME = new Locale(4L);
        LC_COLLATE = new Locale(0L);
        LC_MONETARY = new Locale(2L);
        LC_MESSAGES = new Locale(5L);
        LC_ALL = new Locale(-1L);
        Locale[] localeArray = new Locale[7];
        localeArray[0] = LC_CTYPE;
        localeArray[1] = LC_NUMERIC;
        localeArray[2] = LC_TIME;
        localeArray[3] = LC_COLLATE;
        localeArray[4] = LC_MONETARY;
        localeArray[5] = LC_MESSAGES;
        localeArray[6] = LC_ALL;
        $VALUES = localeArray;
    }

    public static Locale[] values() {
        return (Locale[])$VALUES.clone();
    }
}

