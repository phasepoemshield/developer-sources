/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Locale
extends Enum<Locale>
implements Constant {
    public static final /* enum */ Locale LC_ADDRESS;
    public static final /* enum */ Locale __UNKNOWN_CONSTANT__;
    public static final /* enum */ Locale LC_CTYPE;
    public static final /* enum */ Locale LC_MONETARY;
    public static final /* enum */ Locale LC_MEASUREMENT;
    public static final /* enum */ Locale LC_MESSAGES;
    public static final /* enum */ Locale LC_TELEPHONE;
    private static final /* synthetic */ Locale[] $VALUES;
    private static final ConstantResolver<Locale> resolver;
    public static final /* enum */ Locale LC_PAPER;
    public static final /* enum */ Locale LC_IDENTIFICATION;
    public static final /* enum */ Locale LC_ALL;
    public static final /* enum */ Locale LC_TIME;
    public static final /* enum */ Locale LC_NUMERIC;
    public static final /* enum */ Locale LC_NAME;
    public static final /* enum */ Locale LC_COLLATE;

    public static Locale valueOf(long value) {
        return resolver.valueOf(value);
    }

    public final String description() {
        return resolver.description(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public static Locale valueOf(String name) {
        return Enum.valueOf(Locale.class, name);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public static Locale[] values() {
        return (Locale[])$VALUES.clone();
    }

    static {
        LC_CTYPE = new Locale();
        LC_NUMERIC = new Locale();
        LC_TIME = new Locale();
        LC_COLLATE = new Locale();
        LC_MONETARY = new Locale();
        LC_MESSAGES = new Locale();
        LC_ALL = new Locale();
        LC_PAPER = new Locale();
        LC_NAME = new Locale();
        LC_ADDRESS = new Locale();
        LC_TELEPHONE = new Locale();
        LC_MEASUREMENT = new Locale();
        LC_IDENTIFICATION = new Locale();
        __UNKNOWN_CONSTANT__ = new Locale();
        Locale[] localeArray = new Locale[14];
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
        localeArray[13] = __UNKNOWN_CONSTANT__;
        $VALUES = localeArray;
        resolver = ConstantResolver.getResolver(Locale.class, 20000, 29999);
    }
}

