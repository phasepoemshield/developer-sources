/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Confstr
extends Enum<Confstr>
implements Constant {
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS;
    public static final /* enum */ Confstr _CS_V7_ENV;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_LDFLAGS;
    public static final /* enum */ Confstr _CS_PATH;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_CFLAGS;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_LIBS;
    public static final /* enum */ Confstr _CS_GNU_LIBPTHREAD_VERSION;
    public static final /* enum */ Confstr _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS;
    public static final /* enum */ Confstr _CS_GNU_LIBC_VERSION;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LDFLAGS;
    private static final /* synthetic */ Confstr[] $VALUES;
    public static final /* enum */ Confstr _CS_V6_ENV;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_CFLAGS;
    public static final long MAX_VALUE = 31L;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_CFLAGS;
    private final long value;

    public static Confstr[] values() {
        return (Confstr[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    private Confstr(long value) {
        this.value = value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Confstr valueOf(String name) {
        return Enum.valueOf(Confstr.class, name);
    }

    public final int value() {
        return (int)this.value;
    }

    static {
        _CS_PATH = new Confstr(1L);
        _CS_POSIX_V7_ILP32_OFF32_CFLAGS = new Confstr(2L);
        _CS_POSIX_V7_ILP32_OFF32_LDFLAGS = new Confstr(3L);
        _CS_POSIX_V7_ILP32_OFF32_LIBS = new Confstr(4L);
        _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS = new Confstr(5L);
        _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS = new Confstr(6L);
        _CS_POSIX_V7_ILP32_OFFBIG_LIBS = new Confstr(7L);
        _CS_POSIX_V7_LP64_OFF64_CFLAGS = new Confstr(8L);
        _CS_POSIX_V7_LP64_OFF64_LDFLAGS = new Confstr(9L);
        _CS_POSIX_V7_LP64_OFF64_LIBS = new Confstr(10L);
        _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS = new Confstr(11L);
        _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS = new Confstr(12L);
        _CS_POSIX_V7_LPBIG_OFFBIG_LIBS = new Confstr(13L);
        _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS = new Confstr(14L);
        _CS_V7_ENV = new Confstr(15L);
        _CS_POSIX_V6_ILP32_OFF32_CFLAGS = new Confstr(16L);
        _CS_POSIX_V6_ILP32_OFF32_LDFLAGS = new Confstr(17L);
        _CS_POSIX_V6_ILP32_OFF32_LIBS = new Confstr(18L);
        _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS = new Confstr(19L);
        _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS = new Confstr(20L);
        _CS_POSIX_V6_ILP32_OFFBIG_LIBS = new Confstr(21L);
        _CS_POSIX_V6_LP64_OFF64_CFLAGS = new Confstr(22L);
        _CS_POSIX_V6_LP64_OFF64_LDFLAGS = new Confstr(23L);
        _CS_POSIX_V6_LP64_OFF64_LIBS = new Confstr(24L);
        _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS = new Confstr(25L);
        _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS = new Confstr(26L);
        _CS_POSIX_V6_LPBIG_OFFBIG_LIBS = new Confstr(27L);
        _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS = new Confstr(28L);
        _CS_V6_ENV = new Confstr(29L);
        _CS_GNU_LIBC_VERSION = new Confstr(30L);
        _CS_GNU_LIBPTHREAD_VERSION = new Confstr(31L);
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
}

