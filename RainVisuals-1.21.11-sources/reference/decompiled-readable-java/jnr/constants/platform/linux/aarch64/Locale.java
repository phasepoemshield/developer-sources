/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Locale
extends Enum<Locale>
implements Constant {
    public static final /* enum */ Locale LC_TELEPHONE;
    public static final /* enum */ Locale LC_PAPER;
    public static final /* enum */ Locale LC_MONETARY;
    public static final /* enum */ Locale LC_TIME;
    public static final /* enum */ Locale LC_COLLATE;
    public static final /* enum */ Locale LC_IDENTIFICATION;
    public static final long MAX_VALUE = 12L;
    public static final /* enum */ Locale LC_MEASUREMENT;
    private static final /* synthetic */ Locale[] $VALUES;
    public static final /* enum */ Locale LC_NUMERIC;
    public static final /* enum */ Locale LC_MESSAGES;
    public static final /* enum */ Locale LC_ADDRESS;
    public static final /* enum */ Locale LC_ALL;
    public static final /* enum */ Locale LC_CTYPE;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Locale LC_NAME;
    private final long value;

    @Override
    public final long longValue() {
        return this.value;
    }

    public static Locale valueOf(String name) {
        return Enum.valueOf(Locale.class, name);
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

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    private Locale(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static Locale[] values() {
        return (Locale[])$VALUES.clone();
    }

    static final class StringTable {
        public static final Map<Locale, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<Locale, String> generateTable() {
            EnumMap<Locale, String> map = new EnumMap<Locale, String>(Locale.class);
            map.put(LC_CTYPE, "LC_CTYPE");
            map.put(LC_NUMERIC, "LC_NUMERIC");
            map.put(LC_TIME, "LC_TIME");
            map.put(LC_COLLATE, "LC_COLLATE");
            map.put(LC_MONETARY, "LC_MONETARY");
            map.put(LC_MESSAGES, "LC_MESSAGES");
            map.put(LC_ALL, "LC_ALL");
            map.put(LC_PAPER, "LC_PAPER");
            map.put(LC_NAME, "LC_NAME");
            map.put(LC_ADDRESS, "LC_ADDRESS");
            map.put(LC_TELEPHONE, "LC_TELEPHONE");
            map.put(LC_MEASUREMENT, "LC_MEASUREMENT");
            map.put(LC_IDENTIFICATION, "LC_IDENTIFICATION");
            return map;
        }
    }
}

