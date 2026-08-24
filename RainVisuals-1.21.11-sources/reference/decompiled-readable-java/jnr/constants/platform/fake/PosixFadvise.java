/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class PosixFadvise
extends Enum<PosixFadvise>
implements Constant {
    public static final /* enum */ PosixFadvise POSIX_FADV_WILLNEED;
    private static final /* synthetic */ PosixFadvise[] $VALUES;
    public static final /* enum */ PosixFadvise POSIX_FADV_NORMAL;
    public static final /* enum */ PosixFadvise POSIX_FADV_RANDOM;
    public static final /* enum */ PosixFadvise POSIX_FADV_SEQUENTIAL;
    public static final long MAX_VALUE = 6L;
    public static final /* enum */ PosixFadvise POSIX_FADV_DONTNEED;
    private final long value;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ PosixFadvise POSIX_FADV_NOREUSE;

    private PosixFadvise(long value) {
        this.value = value;
    }

    static {
        POSIX_FADV_NORMAL = new PosixFadvise(1L);
        POSIX_FADV_SEQUENTIAL = new PosixFadvise(2L);
        POSIX_FADV_RANDOM = new PosixFadvise(3L);
        POSIX_FADV_NOREUSE = new PosixFadvise(4L);
        POSIX_FADV_WILLNEED = new PosixFadvise(5L);
        POSIX_FADV_DONTNEED = new PosixFadvise(6L);
        PosixFadvise[] posixFadviseArray = new PosixFadvise[6];
        posixFadviseArray[0] = POSIX_FADV_NORMAL;
        posixFadviseArray[1] = POSIX_FADV_SEQUENTIAL;
        posixFadviseArray[2] = POSIX_FADV_RANDOM;
        posixFadviseArray[3] = POSIX_FADV_NOREUSE;
        posixFadviseArray[4] = POSIX_FADV_WILLNEED;
        posixFadviseArray[5] = POSIX_FADV_DONTNEED;
        $VALUES = posixFadviseArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static PosixFadvise[] values() {
        return (PosixFadvise[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    public static PosixFadvise valueOf(String name) {
        return Enum.valueOf(PosixFadvise.class, name);
    }

    @Override
    public final boolean defined() {
        return true;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }
}

