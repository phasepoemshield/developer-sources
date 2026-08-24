/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class PosixFadvise
extends Enum<PosixFadvise>
implements Constant {
    public static final long MIN_VALUE = 1L;
    public static final long MAX_VALUE = 6L;
    public static final /* enum */ PosixFadvise POSIX_FADV_SEQUENTIAL;
    public static final /* enum */ PosixFadvise POSIX_FADV_NOREUSE;
    private static final /* synthetic */ PosixFadvise[] $VALUES;
    public static final /* enum */ PosixFadvise POSIX_FADV_WILLNEED;
    public static final /* enum */ PosixFadvise POSIX_FADV_RANDOM;
    public static final /* enum */ PosixFadvise POSIX_FADV_DONTNEED;
    public static final /* enum */ PosixFadvise POSIX_FADV_NORMAL;
    private final long value;

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private PosixFadvise(long value) {
        this.value = value;
    }

    public static PosixFadvise[] values() {
        return (PosixFadvise[])$VALUES.clone();
    }

    public static PosixFadvise valueOf(String name) {
        return Enum.valueOf(PosixFadvise.class, name);
    }

    static {
        POSIX_FADV_NORMAL = new PosixFadvise(1L);
        POSIX_FADV_SEQUENTIAL = new PosixFadvise(2L);
        POSIX_FADV_RANDOM = new PosixFadvise(3L);
        POSIX_FADV_NOREUSE = new PosixFadvise(6L);
        POSIX_FADV_WILLNEED = new PosixFadvise(4L);
        POSIX_FADV_DONTNEED = new PosixFadvise(5L);
        PosixFadvise[] posixFadviseArray = new PosixFadvise[6];
        posixFadviseArray[0] = POSIX_FADV_NORMAL;
        posixFadviseArray[1] = POSIX_FADV_SEQUENTIAL;
        posixFadviseArray[2] = POSIX_FADV_RANDOM;
        posixFadviseArray[3] = POSIX_FADV_NOREUSE;
        posixFadviseArray[4] = POSIX_FADV_WILLNEED;
        posixFadviseArray[5] = POSIX_FADV_DONTNEED;
        $VALUES = posixFadviseArray;
    }
}

