/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class OpenFlags
extends Enum<OpenFlags>
implements Constant {
    public static final /* enum */ OpenFlags O_TRUNC;
    private static final ConstantResolver<OpenFlags> resolver;
    public static final /* enum */ OpenFlags O_NOFOLLOW;
    public static final /* enum */ OpenFlags O_NONBLOCK;
    public static final /* enum */ OpenFlags O_RDONLY;
    public static final /* enum */ OpenFlags O_ACCMODE;
    public static final /* enum */ OpenFlags O_DIRECTORY;
    public static final /* enum */ OpenFlags O_CLOEXEC;
    public static final /* enum */ OpenFlags O_SYMLINK;
    public static final /* enum */ OpenFlags O_APPEND;
    public static final /* enum */ OpenFlags O_SHLOCK;
    public static final /* enum */ OpenFlags __UNKNOWN_CONSTANT__;
    public static final /* enum */ OpenFlags O_EXCL;
    public static final /* enum */ OpenFlags O_WRONLY;
    public static final /* enum */ OpenFlags O_ASYNC;
    public static final /* enum */ OpenFlags O_FSYNC;
    public static final /* enum */ OpenFlags O_TMPFILE;
    public static final /* enum */ OpenFlags O_NOCTTY;
    public static final /* enum */ OpenFlags O_SYNC;
    public static final /* enum */ OpenFlags O_RDWR;
    public static final /* enum */ OpenFlags O_BINARY;
    private static final /* synthetic */ OpenFlags[] $VALUES;
    public static final /* enum */ OpenFlags O_EXLOCK;
    public static final /* enum */ OpenFlags O_CREAT;
    public static final /* enum */ OpenFlags O_EVTONLY;

    public final int value() {
        return (int)resolver.longValue(this);
    }

    static {
        O_RDONLY = new OpenFlags();
        O_WRONLY = new OpenFlags();
        O_RDWR = new OpenFlags();
        O_ACCMODE = new OpenFlags();
        O_NONBLOCK = new OpenFlags();
        O_APPEND = new OpenFlags();
        O_SYNC = new OpenFlags();
        O_SHLOCK = new OpenFlags();
        O_EXLOCK = new OpenFlags();
        O_ASYNC = new OpenFlags();
        O_FSYNC = new OpenFlags();
        O_NOFOLLOW = new OpenFlags();
        O_CREAT = new OpenFlags();
        O_TRUNC = new OpenFlags();
        O_EXCL = new OpenFlags();
        O_EVTONLY = new OpenFlags();
        O_DIRECTORY = new OpenFlags();
        O_SYMLINK = new OpenFlags();
        O_BINARY = new OpenFlags();
        O_NOCTTY = new OpenFlags();
        O_TMPFILE = new OpenFlags();
        O_CLOEXEC = new OpenFlags();
        __UNKNOWN_CONSTANT__ = new OpenFlags();
        OpenFlags[] openFlagsArray = new OpenFlags[23];
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
        openFlagsArray[22] = __UNKNOWN_CONSTANT__;
        $VALUES = openFlagsArray;
        resolver = ConstantResolver.getBitmaskResolver(OpenFlags.class);
    }

    public static OpenFlags[] values() {
        return (OpenFlags[])$VALUES.clone();
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    public final String toString() {
        return this.description();
    }

    public static OpenFlags valueOf(String name) {
        return Enum.valueOf(OpenFlags.class, name);
    }

    public static OpenFlags valueOf(long value) {
        return resolver.valueOf(value);
    }

    public final String description() {
        return resolver.description(this);
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }
}

