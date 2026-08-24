/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.freebsd.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Confstr
extends Enum<Confstr>
implements Constant {
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LDFLAGS;
    public static final /* enum */ Confstr _CS_PATH;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_CFLAGS;
    public static final long MAX_VALUE = 14L;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_CFLAGS;
    public static final long MIN_VALUE = 1L;
    private static final /* synthetic */ Confstr[] $VALUES;
    private final long value;

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Confstr valueOf(String name) {
        return Enum.valueOf(Confstr.class, name);
    }

    private Confstr(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        _CS_PATH = new Confstr(1L);
        _CS_POSIX_V6_ILP32_OFF32_CFLAGS = new Confstr(2L);
        _CS_POSIX_V6_ILP32_OFF32_LDFLAGS = new Confstr(3L);
        _CS_POSIX_V6_ILP32_OFF32_LIBS = new Confstr(4L);
        _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS = new Confstr(5L);
        _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS = new Confstr(6L);
        _CS_POSIX_V6_ILP32_OFFBIG_LIBS = new Confstr(7L);
        _CS_POSIX_V6_LP64_OFF64_CFLAGS = new Confstr(8L);
        _CS_POSIX_V6_LP64_OFF64_LDFLAGS = new Confstr(9L);
        _CS_POSIX_V6_LP64_OFF64_LIBS = new Confstr(10L);
        _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS = new Confstr(11L);
        _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS = new Confstr(12L);
        _CS_POSIX_V6_LPBIG_OFFBIG_LIBS = new Confstr(13L);
        _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS = new Confstr(14L);
        Confstr[] confstrArray = new Confstr[14];
        confstrArray[0] = _CS_PATH;
        confstrArray[1] = _CS_POSIX_V6_ILP32_OFF32_CFLAGS;
        confstrArray[2] = _CS_POSIX_V6_ILP32_OFF32_LDFLAGS;
        confstrArray[3] = _CS_POSIX_V6_ILP32_OFF32_LIBS;
        confstrArray[4] = _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS;
        confstrArray[5] = _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS;
        confstrArray[6] = _CS_POSIX_V6_ILP32_OFFBIG_LIBS;
        confstrArray[7] = _CS_POSIX_V6_LP64_OFF64_CFLAGS;
        confstrArray[8] = _CS_POSIX_V6_LP64_OFF64_LDFLAGS;
        confstrArray[9] = _CS_POSIX_V6_LP64_OFF64_LIBS;
        confstrArray[10] = _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS;
        confstrArray[11] = _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS;
        confstrArray[12] = _CS_POSIX_V6_LPBIG_OFFBIG_LIBS;
        confstrArray[13] = _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS;
        $VALUES = confstrArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static Confstr[] values() {
        return (Confstr[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static final class StringTable {
        public static final Map<Confstr, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<Confstr, String> generateTable() {
            EnumMap<Confstr, String> map = new EnumMap<Confstr, String>(Confstr.class);
            map.put(_CS_PATH, "_CS_PATH");
            map.put(_CS_POSIX_V6_ILP32_OFF32_CFLAGS, "_CS_POSIX_V6_ILP32_OFF32_CFLAGS");
            map.put(_CS_POSIX_V6_ILP32_OFF32_LDFLAGS, "_CS_POSIX_V6_ILP32_OFF32_LDFLAGS");
            map.put(_CS_POSIX_V6_ILP32_OFF32_LIBS, "_CS_POSIX_V6_ILP32_OFF32_LIBS");
            map.put(_CS_POSIX_V6_ILP32_OFFBIG_CFLAGS, "_CS_POSIX_V6_ILP32_OFFBIG_CFLAGS");
            map.put(_CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS, "_CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS");
            map.put(_CS_POSIX_V6_ILP32_OFFBIG_LIBS, "_CS_POSIX_V6_ILP32_OFFBIG_LIBS");
            map.put(_CS_POSIX_V6_LP64_OFF64_CFLAGS, "_CS_POSIX_V6_LP64_OFF64_CFLAGS");
            map.put(_CS_POSIX_V6_LP64_OFF64_LDFLAGS, "_CS_POSIX_V6_LP64_OFF64_LDFLAGS");
            map.put(_CS_POSIX_V6_LP64_OFF64_LIBS, "_CS_POSIX_V6_LP64_OFF64_LIBS");
            map.put(_CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS, "_CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS");
            map.put(_CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS, "_CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS");
            map.put(_CS_POSIX_V6_LPBIG_OFFBIG_LIBS, "_CS_POSIX_V6_LPBIG_OFFBIG_LIBS");
            map.put(_CS_POSIX_V6_WIDTH_RESTRICTED_ENVS, "_CS_POSIX_V6_WIDTH_RESTRICTED_ENVS");
            return map;
        }
    }
}

