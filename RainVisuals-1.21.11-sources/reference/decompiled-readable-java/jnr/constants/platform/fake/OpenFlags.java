/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class OpenFlags
extends Enum<OpenFlags>
implements Constant {
    public static final /* enum */ OpenFlags O_SYNC;
    private static final /* synthetic */ OpenFlags[] $VALUES;
    private final long value;
    public static final /* enum */ OpenFlags O_EVTONLY;
    public static final /* enum */ OpenFlags O_NOFOLLOW;
    public static final /* enum */ OpenFlags O_SHLOCK;
    public static final /* enum */ OpenFlags O_ASYNC;
    public static final /* enum */ OpenFlags O_CLOEXEC;
    public static final /* enum */ OpenFlags O_BINARY;
    public static final /* enum */ OpenFlags O_APPEND;
    public static final /* enum */ OpenFlags O_RDWR;
    public static final /* enum */ OpenFlags O_RDONLY;
    public static final /* enum */ OpenFlags O_TMPFILE;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ OpenFlags O_TRUNC;
    public static final /* enum */ OpenFlags O_ACCMODE;
    public static final /* enum */ OpenFlags O_EXCL;
    public static final /* enum */ OpenFlags O_CREAT;
    public static final /* enum */ OpenFlags O_EXLOCK;
    public static final /* enum */ OpenFlags O_DIRECTORY;
    public static final /* enum */ OpenFlags O_NOCTTY;
    public static final /* enum */ OpenFlags O_NONBLOCK;
    public static final /* enum */ OpenFlags O_SYMLINK;
    public static final long MAX_VALUE = 0x200000L;
    public static final /* enum */ OpenFlags O_WRONLY;
    public static final /* enum */ OpenFlags O_FSYNC;

    public static OpenFlags[] values() {
        return (OpenFlags[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        O_RDONLY = new OpenFlags(1L);
        O_WRONLY = new OpenFlags(2L);
        O_RDWR = new OpenFlags(4L);
        O_ACCMODE = new OpenFlags(8L);
        O_NONBLOCK = new OpenFlags(16L);
        O_APPEND = new OpenFlags(32L);
        O_SYNC = new OpenFlags(64L);
        O_SHLOCK = new OpenFlags(128L);
        O_EXLOCK = new OpenFlags(256L);
        O_ASYNC = new OpenFlags(512L);
        O_FSYNC = new OpenFlags(1024L);
        O_NOFOLLOW = new OpenFlags(2048L);
        O_CREAT = new OpenFlags(4096L);
        O_TRUNC = new OpenFlags(8192L);
        O_EXCL = new OpenFlags(16384L);
        O_EVTONLY = new OpenFlags(32768L);
        O_DIRECTORY = new OpenFlags(65536L);
        O_SYMLINK = new OpenFlags(131072L);
        O_BINARY = new OpenFlags(262144L);
        O_NOCTTY = new OpenFlags(524288L);
        O_TMPFILE = new OpenFlags(0x100000L);
        O_CLOEXEC = new OpenFlags(0x200000L);
        OpenFlags[] openFlagsArray = new OpenFlags[22];
        openFlagsArray[0] = O_RDONLY;
        openFlagsArray[1] = O_WRONLY;
        openFlagsArray[2] = O_RDWR;
        openFlagsArray[3] = O_ACCMODE;
        openFlagsArray[4] = O_NONBLOCK;
        openFlagsArray[5] = O_APPEND;
        openFlagsArray[6] = O_SYNC;
        openFlagsArray[7] = O_SHLOCK;
        openFlagsArray[8] = O_EXLOCK;
        openFlagsArray[9] = O_ASYNC;
        openFlagsArray[10] = O_FSYNC;
        openFlagsArray[11] = O_NOFOLLOW;
        openFlagsArray[12] = O_CREAT;
        openFlagsArray[13] = O_TRUNC;
        openFlagsArray[14] = O_EXCL;
        openFlagsArray[15] = O_EVTONLY;
        openFlagsArray[16] = O_DIRECTORY;
        openFlagsArray[17] = O_SYMLINK;
        openFlagsArray[18] = O_BINARY;
        openFlagsArray[19] = O_NOCTTY;
        openFlagsArray[20] = O_TMPFILE;
        openFlagsArray[21] = O_CLOEXEC;
        $VALUES = openFlagsArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    private OpenFlags(long value) {
        this.value = value;
    }

    public final int value() {
        return (int)this.value;
    }

    public static OpenFlags valueOf(String name) {
        return Enum.valueOf(OpenFlags.class, name);
    }
}

