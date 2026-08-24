/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.powerpc64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class ProtocolFamily
extends Enum<ProtocolFamily>
implements Constant {
    private final long value;
    public static final /* enum */ ProtocolFamily PF_UNIX;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ ProtocolFamily PF_IPX;
    public static final /* enum */ ProtocolFamily PF_APPLETALK;
    public static final /* enum */ ProtocolFamily PF_ROUTE;
    public static final /* enum */ ProtocolFamily PF_INET6;
    private static final /* synthetic */ ProtocolFamily[] $VALUES;
    public static final /* enum */ ProtocolFamily PF_INET;
    public static final /* enum */ ProtocolFamily PF_LOCAL;
    public static final /* enum */ ProtocolFamily PF_DECnet;
    public static final /* enum */ ProtocolFamily PF_MAX;
    public static final /* enum */ ProtocolFamily PF_SNA;
    public static final long MAX_VALUE = 44L;
    public static final /* enum */ ProtocolFamily PF_UNSPEC;
    public static final /* enum */ ProtocolFamily PF_KEY;
    public static final /* enum */ ProtocolFamily PF_ISDN;

    static {
        PF_UNSPEC = new ProtocolFamily(0L);
        PF_LOCAL = new ProtocolFamily(1L);
        PF_UNIX = new ProtocolFamily(1L);
        PF_INET = new ProtocolFamily(2L);
        PF_SNA = new ProtocolFamily(22L);
        PF_DECnet = new ProtocolFamily(12L);
        PF_APPLETALK = new ProtocolFamily(5L);
        PF_ROUTE = new ProtocolFamily(16L);
        PF_IPX = new ProtocolFamily(4L);
        PF_ISDN = new ProtocolFamily(34L);
        PF_KEY = new ProtocolFamily(15L);
        PF_INET6 = new ProtocolFamily(10L);
        PF_MAX = new ProtocolFamily(44L);
        ProtocolFamily[] protocolFamilyArray = new ProtocolFamily[13];
        protocolFamilyArray[0] = PF_UNSPEC;
        protocolFamilyArray[1] = PF_LOCAL;
        protocolFamilyArray[2] = PF_UNIX;
        protocolFamilyArray[3] = PF_INET;
        protocolFamilyArray[4] = PF_SNA;
        protocolFamilyArray[5] = PF_DECnet;
        protocolFamilyArray[6] = PF_APPLETALK;
        protocolFamilyArray[7] = PF_ROUTE;
        protocolFamilyArray[8] = PF_IPX;
        protocolFamilyArray[9] = PF_ISDN;
        protocolFamilyArray[10] = PF_KEY;
        protocolFamilyArray[11] = PF_INET6;
        protocolFamilyArray[12] = PF_MAX;
        $VALUES = protocolFamilyArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static ProtocolFamily[] values() {
        return (ProtocolFamily[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static ProtocolFamily valueOf(String name) {
        return Enum.valueOf(ProtocolFamily.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private ProtocolFamily(long value) {
        this.value = value;
    }

    static final class StringTable {
        public static final Map<ProtocolFamily, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<ProtocolFamily, String> generateTable() {
            EnumMap<ProtocolFamily, String> map = new EnumMap<ProtocolFamily, String>(ProtocolFamily.class);
            map.put(PF_UNSPEC, "PF_UNSPEC");
            map.put(PF_LOCAL, "PF_LOCAL");
            map.put(PF_UNIX, "PF_UNIX");
            map.put(PF_INET, "PF_INET");
            map.put(PF_SNA, "PF_SNA");
            map.put(PF_DECnet, "PF_DECnet");
            map.put(PF_APPLETALK, "PF_APPLETALK");
            map.put(PF_ROUTE, "PF_ROUTE");
            map.put(PF_IPX, "PF_IPX");
            map.put(PF_ISDN, "PF_ISDN");
            map.put(PF_KEY, "PF_KEY");
            map.put(PF_INET6, "PF_INET6");
            map.put(PF_MAX, "PF_MAX");
            return map;
        }
    }
}

