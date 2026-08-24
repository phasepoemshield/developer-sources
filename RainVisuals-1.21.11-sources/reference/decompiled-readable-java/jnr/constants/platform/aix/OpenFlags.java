/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.aix;

import jnr.constants.Constant;

public final class OpenFlags
extends Enum<OpenFlags>
implements Constant {
    public static final /* enum */ OpenFlags O_WRONLY;
    private static final /* synthetic */ OpenFlags[] $VALUES;
    public static final /* enum */ OpenFlags O_SYNC;
    public static final /* enum */ OpenFlags O_APPEND;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ OpenFlags O_CREAT;
    public static final /* enum */ OpenFlags O_RDWR;
    public static final /* enum */ OpenFlags O_NONBLOCK;
    private final long value;
    public static final /* enum */ OpenFlags O_NOCTTY;
    public static final /* enum */ OpenFlags O_DIRECTORY;
    public static final long MAX_VALUE = 524288L;
    public static final /* enum */ OpenFlags O_ACCMODE;
    public static final /* enum */ OpenFlags O_TRUNC;
    public static final /* enum */ OpenFlags O_RDONLY;
    public static final /* enum */ OpenFlags O_EXCL;

    private OpenFlags(long value) {
        this.value = value;
    }

    static {
        O_RDONLY = new OpenFlags(0L);
        O_WRONLY = new OpenFlags(1L);
        O_RDWR = new OpenFlags(2L);
        O_ACCMODE = new OpenFlags(3L);
        O_NONBLOCK = new OpenFlags(4L);
        O_APPEND = new OpenFlags(8L);
        O_SYNC = new OpenFlags(16L);
        O_CREAT = new OpenFlags(256L);
        O_TRUNC = new OpenFlags(512L);
        O_EXCL = new OpenFlags(1024L);
        O_DIRECTORY = new OpenFlags(524288L);
        O_NOCTTY = new OpenFlags(2048L);
        OpenFlags[] openFlagsArray = new OpenFlags[12];
        openFlagsArray[0] = O_RDONLY;
        openFlagsArray[1] = O_WRONLY;
        openFlagsArray[2] = O_RDWR;
        openFlagsArray[3] = O_ACCMODE;
        openFlagsArray[4] = O_NONBLOCK;
        openFlagsArray[5] = O_APPEND;
        openFlagsArray[6] = O_SYNC;
        openFlagsArray[7] = O_CREAT;
        openFlagsArray[8] = O_TRUNC;
        openFlagsArray[9] = O_EXCL;
        openFlagsArray[10] = O_DIRECTORY;
        openFlagsArray[11] = O_NOCTTY;
        $VALUES = openFlagsArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static OpenFlags[] values() {
        return (OpenFlags[])$VALUES.clone();
    }

    public static OpenFlags valueOf(String name) {
        return Enum.valueOf(OpenFlags.class, name);
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }
}

