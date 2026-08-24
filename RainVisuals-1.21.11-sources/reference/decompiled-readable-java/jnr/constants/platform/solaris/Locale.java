/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Locale
extends Enum<Locale>
implements Constant {
    public static final /* enum */ Locale LC_CTYPE = new Locale(0L);
    public static final /* enum */ Locale LC_TIME;
    private final long value;
    public static final /* enum */ Locale LC_COLLATE;
    public static final /* enum */ Locale LC_MESSAGES;
    public static final /* enum */ Locale LC_NUMERIC;
    public static final long MAX_VALUE = 6L;
    public static final /* enum */ Locale LC_ALL;
    private static final /* synthetic */ Locale[] $VALUES;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Locale LC_MONETARY;

    public static Locale valueOf(String name) {
        return Enum.valueOf(Locale.class, name);
    }

    public static Locale[] values() {
        return (Locale[])$VALUES.clone();
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        LC_NUMERIC = new Locale(1L);
        LC_TIME = new Locale(2L);
        LC_COLLATE = new Locale(3L);
        LC_MONETARY = new Locale(4L);
        LC_MESSAGES = new Locale(5L);
        LC_ALL = new Locale(6L);
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

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private Locale(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
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
            return map;
        }
    }
}

