/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Locale
extends Enum<Locale>
implements Constant {
    public static final /* enum */ Locale LC_NUMERIC;
    public static final /* enum */ Locale LC_MESSAGES;
    public static final /* enum */ Locale LC_NAME;
    public static final /* enum */ Locale LC_MONETARY;
    private final long value;
    public static final /* enum */ Locale LC_TIME;
    public static final /* enum */ Locale LC_COLLATE;
    public static final /* enum */ Locale LC_IDENTIFICATION;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Locale LC_ADDRESS;
    private static final /* synthetic */ Locale[] $VALUES;
    public static final /* enum */ Locale LC_PAPER;
    public static final /* enum */ Locale LC_ALL;
    public static final /* enum */ Locale LC_TELEPHONE;
    public static final long MAX_VALUE = 12L;
    public static final /* enum */ Locale LC_CTYPE;
    public static final /* enum */ Locale LC_MEASUREMENT;

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Locale[] values() {
        return (Locale[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        LC_CTYPE = new Locale(0L);
        LC_NUMERIC = new Locale(1L);
        LC_TIME = new Locale(2L);
        LC_COLLATE = new Locale(3L);
        LC_MONETARY = new Locale(4L);
        LC_MESSAGES = new Locale(5L);
        LC_ALL = new Locale(6L);
        LC_PAPER = new Locale(7L);
        LC_NAME = new Locale(8L);
        LC_ADDRESS = new Locale(9L);
        LC_TELEPHONE = new Locale(10L);
        LC_MEASUREMENT = new Locale(11L);
        LC_IDENTIFICATION = new Locale(12L);
        Locale[] localeArray = new Locale[13];
        localeArray[0] = LC_CTYPE;
        localeArray[1] = LC_NUMERIC;
        localeArray[2] = LC_TIME;
        localeArray[3] = LC_COLLATE;
        localeArray[4] = LC_MONETARY;
        localeArray[5] = LC_MESSAGES;
        localeArray[6] = LC_ALL;
        localeArray[7] = LC_PAPER;
        localeArray[8] = LC_NAME;
        localeArray[9] = LC_ADDRESS;
        localeArray[10] = LC_TELEPHONE;
        localeArray[11] = LC_MEASUREMENT;
        localeArray[12] = LC_IDENTIFICATION;
        $VALUES = localeArray;
    }

    public static Locale valueOf(String name) {
        return Enum.valueOf(Locale.class, name);
    }

    public final int value() {
        return (int)this.value;
    }

    private Locale(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }
}

