/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class NameInfo
extends Enum<NameInfo>
implements Constant {
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ NameInfo NI_NUMERICSERV;
    private final long value;
    public static final /* enum */ NameInfo NI_NUMERICHOST;
    public static final /* enum */ NameInfo NI_MAXHOST;
    public static final /* enum */ NameInfo NI_MAXSERV;
    public static final /* enum */ NameInfo NI_NOFQDN;
    private static final /* synthetic */ NameInfo[] $VALUES;
    public static final /* enum */ NameInfo NI_NAMEREQD;
    public static final /* enum */ NameInfo NI_DGRAM;
    public static final long MAX_VALUE = 1025L;

    public final int value() {
        return (int)this.value;
    }

    static {
        NI_MAXHOST = new NameInfo(1025L);
        NI_MAXSERV = new NameInfo(32L);
        NI_NOFQDN = new NameInfo(1L);
        NI_NUMERICHOST = new NameInfo(2L);
        NI_NAMEREQD = new NameInfo(4L);
        NI_NUMERICSERV = new NameInfo(8L);
        NI_DGRAM = new NameInfo(16L);
        NameInfo[] nameInfoArray = new NameInfo[7];
        nameInfoArray[0] = NI_MAXHOST;
        nameInfoArray[1] = NI_MAXSERV;
        nameInfoArray[2] = NI_NOFQDN;
        nameInfoArray[3] = NI_NUMERICHOST;
        nameInfoArray[4] = NI_NAMEREQD;
        nameInfoArray[5] = NI_NUMERICSERV;
        nameInfoArray[6] = NI_DGRAM;
        $VALUES = nameInfoArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    private NameInfo(long value) {
        this.value = value;
    }

    public static NameInfo[] values() {
        return (NameInfo[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static NameInfo valueOf(String name) {
        return Enum.valueOf(NameInfo.class, name);
    }

    static final class StringTable {
        public static final Map<NameInfo, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<NameInfo, String> generateTable() {
            EnumMap<NameInfo, String> map = new EnumMap<NameInfo, String>(NameInfo.class);
            map.put(NI_MAXHOST, "NI_MAXHOST");
            map.put(NI_MAXSERV, "NI_MAXSERV");
            map.put(NI_NOFQDN, "NI_NOFQDN");
            map.put(NI_NUMERICHOST, "NI_NUMERICHOST");
            map.put(NI_NAMEREQD, "NI_NAMEREQD");
            map.put(NI_NUMERICSERV, "NI_NUMERICSERV");
            map.put(NI_DGRAM, "NI_DGRAM");
            return map;
        }
    }
}

