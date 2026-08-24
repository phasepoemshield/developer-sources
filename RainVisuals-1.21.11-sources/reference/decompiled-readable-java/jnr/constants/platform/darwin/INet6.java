/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.darwin;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class INet6
extends Enum<INet6>
implements Constant {
    private static final /* synthetic */ INet6[] $VALUES;
    public static final long MIN_VALUE = 46L;
    private final long value;
    public static final /* enum */ INet6 INET6_ADDRSTRLEN = new INet6(46L);
    public static final long MAX_VALUE = 46L;

    @Override
    public final boolean defined() {
        return true;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static INet6[] values() {
        return (INet6[])$VALUES.clone();
    }

    public static INet6 valueOf(String name) {
        return Enum.valueOf(INet6.class, name);
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private INet6(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static {
        INet6[] iNet6Array = new INet6[1];
        iNet6Array[0] = INET6_ADDRSTRLEN;
        $VALUES = iNet6Array;
    }

    static final class StringTable {
        public static final Map<INet6, String> descriptions = StringTable.generateTable();

        public static final Map<INet6, String> generateTable() {
            EnumMap<INet6, String> map = new EnumMap<INet6, String>(INet6.class);
            map.put(INET6_ADDRSTRLEN, "INET6_ADDRSTRLEN");
            return map;
        }

        StringTable() {
        }
    }
}

