/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.mips64el;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Confstr
extends Enum<Confstr>
implements Constant {
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LDFLAGS;
    public static final /* enum */ Confstr _CS_GNU_LIBC_VERSION;
    public static final long MAX_VALUE = 1149L;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS;
    private final long value;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_LIBS;
    public static final /* enum */ Confstr _CS_PATH;
    public static final /* enum */ Confstr _CS_V7_ENV;
    public static final /* enum */ Confstr _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS;
    public static final /* enum */ Confstr _CS_V6_ENV;
    private static final /* synthetic */ Confstr[] $VALUES;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_CFLAGS;
    public static final /* enum */ Confstr _CS_GNU_LIBPTHREAD_VERSION;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS;

    public static Confstr[] values() {
        return (Confstr[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
    }

    private Confstr(long value) {
        this.value = value;
    }

    static {
        _CS_PATH = new Confstr(0L);
        _CS_POSIX_V7_ILP32_OFF32_CFLAGS = new Confstr(1132L);
        _CS_POSIX_V7_ILP32_OFF32_LDFLAGS = new Confstr(1133L);
        _CS_POSIX_V7_ILP32_OFF32_LIBS = new Confstr(1134L);
        _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS = new Confstr(1136L);
        _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS = new Confstr(1137L);
        _CS_POSIX_V7_ILP32_OFFBIG_LIBS = new Confstr(1138L);
        _CS_POSIX_V7_LP64_OFF64_CFLAGS = new Confstr(1140L);
        _CS_POSIX_V7_LP64_OFF64_LDFLAGS = new Confstr(1141L);
        _CS_POSIX_V7_LP64_OFF64_LIBS = new Confstr(1142L);
        _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS = new Confstr(1144L);
        _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS = new Confstr(1145L);
        _CS_POSIX_V7_LPBIG_OFFBIG_LIBS = new Confstr(1146L);
        _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS = new Confstr(5L);
        _CS_V7_ENV = new Confstr(1149L);
        _CS_POSIX_V6_ILP32_OFF32_CFLAGS = new Confstr(1116L);
        _CS_POSIX_V6_ILP32_OFF32_LDFLAGS = new Confstr(1117L);
        _CS_POSIX_V6_ILP32_OFF32_LIBS = new Confstr(1118L);
        _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS = new Confstr(1120L);
        _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS = new Confstr(1121L);
        _CS_POSIX_V6_ILP32_OFFBIG_LIBS = new Confstr(1122L);
        _CS_POSIX_V6_LP64_OFF64_CFLAGS = new Confstr(1124L);
        _CS_POSIX_V6_LP64_OFF64_LDFLAGS = new Confstr(1125L);
        _CS_POSIX_V6_LP64_OFF64_LIBS = new Confstr(1126L);
        _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS = new Confstr(1128L);
        _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS = new Confstr(1129L);
        _CS_POSIX_V6_LPBIG_OFFBIG_LIBS = new Confstr(1130L);
        _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS = new Confstr(1L);
        _CS_V6_ENV = new Confstr(1148L);
        _CS_GNU_LIBC_VERSION = new Confstr(2L);
        _CS_GNU_LIBPTHREAD_VERSION = new Confstr(3L);
        Confstr[] confstrArray = new Confstr[31];
        confstrArray[0] = _CS_PATH;
        confstrArray[1] = _CS_POSIX_V7_ILP32_OFF32_CFLAGS;
        confstrArray[2] = _CS_POSIX_V7_ILP32_OFF32_LDFLAGS;
        confstrArray[3] = _CS_POSIX_V7_ILP32_OFF32_LIBS;
        confstrArray[4] = _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS;
        confstrArray[5] = _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS;
        confstrArray[6] = _CS_POSIX_V7_ILP32_OFFBIG_LIBS;
        confstrArray[7] = _CS_POSIX_V7_LP64_OFF64_CFLAGS;
        confstrArray[8] = _CS_POSIX_V7_LP64_OFF64_LDFLAGS;
        confstrArray[9] = _CS_POSIX_V7_LP64_OFF64_LIBS;
        confstrArray[10] = _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS;
        confstrArray[11] = _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS;
        confstrArray[12] = _CS_POSIX_V7_LPBIG_OFFBIG_LIBS;
        confstrArray[13] = _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS;
        confstrArray[14] = _CS_V7_ENV;
        confstrArray[15] = _CS_POSIX_V6_ILP32_OFF32_CFLAGS;
        confstrArray[16] = _CS_POSIX_V6_ILP32_OFF32_LDFLAGS;
        confstrArray[17] = _CS_POSIX_V6_ILP32_OFF32_LIBS;
        confstrArray[18] = _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS;
        confstrArray[19] = _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS;
        confstrArray[20] = _CS_POSIX_V6_ILP32_OFFBIG_LIBS;
        confstrArray[21] = _CS_POSIX_V6_LP64_OFF64_CFLAGS;
        confstrArray[22] = _CS_POSIX_V6_LP64_OFF64_LDFLAGS;
        confstrArray[23] = _CS_POSIX_V6_LP64_OFF64_LIBS;
        confstrArray[24] = _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS;
        confstrArray[25] = _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS;
        confstrArray[26] = _CS_POSIX_V6_LPBIG_OFFBIG_LIBS;
        confstrArray[27] = _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS;
        confstrArray[28] = _CS_V6_ENV;
        confstrArray[29] = _CS_GNU_LIBC_VERSION;
        confstrArray[30] = _CS_GNU_LIBPTHREAD_VERSION;
        $VALUES = confstrArray;
    }

    public static Confstr valueOf(String name) {
        return Enum.valueOf(Confstr.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
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
            map.put(_CS_POSIX_V7_ILP32_OFF32_CFLAGS, "_CS_POSIX_V7_ILP32_OFF32_CFLAGS");
            map.put(_CS_POSIX_V7_ILP32_OFF32_LDFLAGS, "_CS_POSIX_V7_ILP32_OFF32_LDFLAGS");
            map.put(_CS_POSIX_V7_ILP32_OFF32_LIBS, "_CS_POSIX_V7_ILP32_OFF32_LIBS");
            map.put(_CS_POSIX_V7_ILP32_OFFBIG_CFLAGS, "_CS_POSIX_V7_ILP32_OFFBIG_CFLAGS");
            map.put(_CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS, "_CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS");
            map.put(_CS_POSIX_V7_ILP32_OFFBIG_LIBS, "_CS_POSIX_V7_ILP32_OFFBIG_LIBS");
            map.put(_CS_POSIX_V7_LP64_OFF64_CFLAGS, "_CS_POSIX_V7_LP64_OFF64_CFLAGS");
            map.put(_CS_POSIX_V7_LP64_OFF64_LDFLAGS, "_CS_POSIX_V7_LP64_OFF64_LDFLAGS");
            map.put(_CS_POSIX_V7_LP64_OFF64_LIBS, "_CS_POSIX_V7_LP64_OFF64_LIBS");
            map.put(_CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS, "_CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS");
            map.put(_CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS, "_CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS");
            map.put(_CS_POSIX_V7_LPBIG_OFFBIG_LIBS, "_CS_POSIX_V7_LPBIG_OFFBIG_LIBS");
            map.put(_CS_POSIX_V7_WIDTH_RESTRICTED_ENVS, "_CS_POSIX_V7_WIDTH_RESTRICTED_ENVS");
            map.put(_CS_V7_ENV, "_CS_V7_ENV");
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
            map.put(_CS_V6_ENV, "_CS_V6_ENV");
            map.put(_CS_GNU_LIBC_VERSION, "_CS_GNU_LIBC_VERSION");
            map.put(_CS_GNU_LIBPTHREAD_VERSION, "_CS_GNU_LIBPTHREAD_VERSION");
            return map;
        }
    }
}

