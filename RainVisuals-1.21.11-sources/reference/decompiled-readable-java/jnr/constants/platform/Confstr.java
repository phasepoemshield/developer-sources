/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Confstr
extends Enum<Confstr>
implements Constant {
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS;
    private static final ConstantResolver<Confstr> resolver;
    public static final /* enum */ Confstr _CS_PATH;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_CFLAGS;
    public static final /* enum */ Confstr _CS_GNU_LIBC_VERSION;
    public static final /* enum */ Confstr _CS_GNU_LIBPTHREAD_VERSION;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_V7_ENV;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_LDFLAGS;
    public static final /* enum */ Confstr _CS_V6_ENV;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS;
    public static final /* enum */ Confstr __UNKNOWN_CONSTANT__;
    public static final /* enum */ Confstr _CS_POSIX_V6_LP64_OFF64_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFF32_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFF32_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_LIBS;
    public static final /* enum */ Confstr _CS_POSIX_V7_LP64_OFF64_CFLAGS;
    public static final /* enum */ Confstr _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS;
    private static final /* synthetic */ Confstr[] $VALUES;
    public static final /* enum */ Confstr _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS;

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    public static Confstr valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static Confstr[] values() {
        return (Confstr[])$VALUES.clone();
    }

    public static Confstr valueOf(String name) {
        return Enum.valueOf(Confstr.class, name);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    static {
        _CS_PATH = new Confstr();
        _CS_POSIX_V7_ILP32_OFF32_CFLAGS = new Confstr();
        _CS_POSIX_V7_ILP32_OFF32_LDFLAGS = new Confstr();
        _CS_POSIX_V7_ILP32_OFF32_LIBS = new Confstr();
        _CS_POSIX_V7_ILP32_OFFBIG_CFLAGS = new Confstr();
        _CS_POSIX_V7_ILP32_OFFBIG_LDFLAGS = new Confstr();
        _CS_POSIX_V7_ILP32_OFFBIG_LIBS = new Confstr();
        _CS_POSIX_V7_LP64_OFF64_CFLAGS = new Confstr();
        _CS_POSIX_V7_LP64_OFF64_LDFLAGS = new Confstr();
        _CS_POSIX_V7_LP64_OFF64_LIBS = new Confstr();
        _CS_POSIX_V7_LPBIG_OFFBIG_CFLAGS = new Confstr();
        _CS_POSIX_V7_LPBIG_OFFBIG_LDFLAGS = new Confstr();
        _CS_POSIX_V7_LPBIG_OFFBIG_LIBS = new Confstr();
        _CS_POSIX_V7_WIDTH_RESTRICTED_ENVS = new Confstr();
        _CS_V7_ENV = new Confstr();
        _CS_POSIX_V6_ILP32_OFF32_CFLAGS = new Confstr();
        _CS_POSIX_V6_ILP32_OFF32_LDFLAGS = new Confstr();
        _CS_POSIX_V6_ILP32_OFF32_LIBS = new Confstr();
        _CS_POSIX_V6_ILP32_OFFBIG_CFLAGS = new Confstr();
        _CS_POSIX_V6_ILP32_OFFBIG_LDFLAGS = new Confstr();
        _CS_POSIX_V6_ILP32_OFFBIG_LIBS = new Confstr();
        _CS_POSIX_V6_LP64_OFF64_CFLAGS = new Confstr();
        _CS_POSIX_V6_LP64_OFF64_LDFLAGS = new Confstr();
        _CS_POSIX_V6_LP64_OFF64_LIBS = new Confstr();
        _CS_POSIX_V6_LPBIG_OFFBIG_CFLAGS = new Confstr();
        _CS_POSIX_V6_LPBIG_OFFBIG_LDFLAGS = new Confstr();
        _CS_POSIX_V6_LPBIG_OFFBIG_LIBS = new Confstr();
        _CS_POSIX_V6_WIDTH_RESTRICTED_ENVS = new Confstr();
        _CS_V6_ENV = new Confstr();
        _CS_GNU_LIBC_VERSION = new Confstr();
        _CS_GNU_LIBPTHREAD_VERSION = new Confstr();
        __UNKNOWN_CONSTANT__ = new Confstr();
        Confstr[] confstrArray = new Confstr[32];
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
        confstrArray[31] = __UNKNOWN_CONSTANT__;
        $VALUES = confstrArray;
        resolver = ConstantResolver.getResolver(Confstr.class, 20000, 29999);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }
}

