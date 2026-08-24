/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class PosixFadvise
extends Enum<PosixFadvise>
implements Constant {
    public static final /* enum */ PosixFadvise POSIX_FADV_RANDOM;
    public static final /* enum */ PosixFadvise POSIX_FADV_NOREUSE;
    public static final /* enum */ PosixFadvise __UNKNOWN_CONSTANT__;
    public static final /* enum */ PosixFadvise POSIX_FADV_SEQUENTIAL;
    public static final /* enum */ PosixFadvise POSIX_FADV_DONTNEED;
    public static final /* enum */ PosixFadvise POSIX_FADV_NORMAL;
    private static final ConstantResolver<PosixFadvise> resolver;
    public static final /* enum */ PosixFadvise POSIX_FADV_WILLNEED;
    private static final /* synthetic */ PosixFadvise[] $VALUES;

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static PosixFadvise valueOf(String name) {
        return Enum.valueOf(PosixFadvise.class, name);
    }

    public static PosixFadvise valueOf(long value) {
        return resolver.valueOf(value);
    }

    public final String toString() {
        return this.description();
    }

    static {
        POSIX_FADV_NORMAL = new PosixFadvise();
        POSIX_FADV_SEQUENTIAL = new PosixFadvise();
        POSIX_FADV_RANDOM = new PosixFadvise();
        POSIX_FADV_NOREUSE = new PosixFadvise();
        POSIX_FADV_WILLNEED = new PosixFadvise();
        POSIX_FADV_DONTNEED = new PosixFadvise();
        __UNKNOWN_CONSTANT__ = new PosixFadvise();
        PosixFadvise[] posixFadviseArray = new PosixFadvise[7];
        posixFadviseArray[0] = POSIX_FADV_NORMAL;
        posixFadviseArray[1] = POSIX_FADV_SEQUENTIAL;
        posixFadviseArray[2] = POSIX_FADV_RANDOM;
        posixFadviseArray[3] = POSIX_FADV_NOREUSE;
        posixFadviseArray[4] = POSIX_FADV_WILLNEED;
        posixFadviseArray[5] = POSIX_FADV_DONTNEED;
        posixFadviseArray[6] = __UNKNOWN_CONSTANT__;
        $VALUES = posixFadviseArray;
        resolver = ConstantResolver.getResolver(PosixFadvise.class, 20000, 29999);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public static PosixFadvise[] values() {
        return (PosixFadvise[])$VALUES.clone();
    }
}

