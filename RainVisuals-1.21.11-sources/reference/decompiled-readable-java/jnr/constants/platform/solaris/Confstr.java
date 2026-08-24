/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Confstr
extends Enum<Confstr>
implements Constant {
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_LIBS;
    public static final /* enum */ Confstr _CS_V7_ENV;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS;
    public static final long MAX_VALUE = 919L;
    public static final /* enum */ Confstr _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS;
    private final long value;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS;
    private static final /* synthetic */ Confstr[] $VALUES;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_V6_ENV;
    public static final long MIN_VALUE = 65L;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LIBS;
    public static final /* enum */ Confstr _CS_PATH;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LIBS;

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    private Confstr(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    static {
        _CS_PATH = new Confstr(65L);
        _CS_POSIX_V7_ILP32_OFF32_CFLAGS = new Confstr(900L);
        _CS_POSIX_V7_ILP32_OFF32_LDFLAGS = new Confstr(901L);
        _CS_POSIX_V7_ILP32_OFF32_LIBS = new Confstr(902L);
        _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS = new Confstr(904L);
        _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS = new Confstr(905L);
        _CS_POSIX_V7_ILP32_OFFBIG_LIBS = new Confstr(906L);
        _CS_POSIX_V7_LP64_OFF64_CFLAGS = new Confstr(908L);
        _CS_POSIX_V7_LP64_OFF64_LDFLAGS = new Confstr(909L);
        _CS_POSIX_V7_LP64_OFF64_LIBS = new Confstr(910L);
        _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS = new Confstr(912L);
        _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS = new Confstr(913L);
        _CS_POSIX_V7_LPBIG_OFFBIG_LIBS = new Confstr(914L);
        _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS = new Confstr(918L);
        _CS_V7_ENV = new Confstr(919L);
        _CS_POSIX_V6_ILP32_OFF32_CFLAGS = new Confstr(800L);
        _CS_POSIX_V6_ILP32_OFF32_LDFLAGS = new Confstr(801L);
        _CS_POSIX_V6_ILP32_OFF32_LIBS = new Confstr(802L);
        _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS = new Confstr(804L);
        _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS = new Confstr(805L);
        _CS_POSIX_V6_ILP32_OFFBIG_LIBS = new Confstr(806L);
        _CS_POSIX_V6_LP64_OFF64_CFLAGS = new Confstr(808L);
        _CS_POSIX_V6_LP64_OFF64_LDFLAGS = new Confstr(809L);
        _CS_POSIX_V6_LP64_OFF64_LIBS = new Confstr(810L);
        _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS = new Confstr(812L);
        _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS = new Confstr(813L);
        _CS_POSIX_V6_LPBIG_OFFBIG_LIBS = new Confstr(814L);
        _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS = new Confstr(816L);
        _CS_V6_ENV = new Confstr(817L);
        Confstr[] confstrArray = new Confstr[29];
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
        $VALUES = confstrArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static Confstr valueOf(String name) {
        return Enum.valueOf(Confstr.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static Confstr[] values() {
        return (Confstr[])$VALUES.clone();
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
            return map;
        }
    }
}

