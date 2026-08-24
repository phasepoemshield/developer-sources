/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform;

import jnr.constants.Constant;
import jnr.constants.platform.ConstantResolver;

public final class Pathconf
extends Enum<Pathconf>
implements Constant {
    public static final /* enum */ Pathconf _PC_PIPE_BUF;
    public static final /* enum */ Pathconf _PC_MAX_INPUT;
    public static final /* enum */ Pathconf _PC_ALLOC_SIZE_MIN;
    public static final /* enum */ Pathconf __UNKNOWN_CONSTANT__;
    public static final /* enum */ Pathconf _PC_MAX_CANON;
    private static final ConstantResolver<Pathconf> resolver;
    public static final /* enum */ Pathconf _PC_2_SYMLINKS;
    private static final /* synthetic */ Pathconf[] $VALUES;
    public static final /* enum */ Pathconf _PC_REC_MIN_XFER_SIZE;
    public static final /* enum */ Pathconf _PC_REC_XFER_ALIGN;
    public static final /* enum */ Pathconf _PC_LINK_MAX;
    public static final /* enum */ Pathconf _PC_REC_MAX_XFER_SIZE;
    public static final /* enum */ Pathconf _PC_VDISABLE;
    public static final /* enum */ Pathconf _PC_SYMLINK_MAX;
    public static final /* enum */ Pathconf _PC_NO_TRUNC;
    public static final /* enum */ Pathconf _PC_ASYNC_IO;
    public static final /* enum */ Pathconf _PC_CHOWN_RESTRICTED;
    public static final /* enum */ Pathconf _PC_NAME_MAX;
    public static final /* enum */ Pathconf _PC_REC_INCR_XFER_SIZE;
    public static final /* enum */ Pathconf _PC_PRIO_IO;
    public static final /* enum */ Pathconf _PC_FILESIZEBITS;
    public static final /* enum */ Pathconf _PC_SYNC_IO;
    public static final /* enum */ Pathconf _PC_PATH_MAX;

    public final String toString() {
        return this.description();
    }

    public static Pathconf valueOf(long value) {
        return resolver.valueOf(value);
    }

    public static Pathconf[] values() {
        return (Pathconf[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return resolver.defined(this);
    }

    public final int value() {
        return (int)resolver.longValue(this);
    }

    public static Pathconf valueOf(String name) {
        return Enum.valueOf(Pathconf.class, name);
    }

    @Override
    public final int intValue() {
        return (int)resolver.longValue(this);
    }

    public final String description() {
        return resolver.description(this);
    }

    @Override
    public final long longValue() {
        return resolver.longValue(this);
    }

    static {
        _PC_FILESIZEBITS = new Pathconf();
        _PC_LINK_MAX = new Pathconf();
        _PC_MAX_CANON = new Pathconf();
        _PC_MAX_INPUT = new Pathconf();
        _PC_NAME_MAX = new Pathconf();
        _PC_PATH_MAX = new Pathconf();
        _PC_PIPE_BUF = new Pathconf();
        _PC_2_SYMLINKS = new Pathconf();
        _PC_ALLOC_SIZE_MIN = new Pathconf();
        _PC_REC_INCR_XFER_SIZE = new Pathconf();
        _PC_REC_MAX_XFER_SIZE = new Pathconf();
        _PC_REC_MIN_XFER_SIZE = new Pathconf();
        _PC_REC_XFER_ALIGN = new Pathconf();
        _PC_SYMLINK_MAX = new Pathconf();
        _PC_CHOWN_RESTRICTED = new Pathconf();
        _PC_NO_TRUNC = new Pathconf();
        _PC_VDISABLE = new Pathconf();
        _PC_ASYNC_IO = new Pathconf();
        _PC_PRIO_IO = new Pathconf();
        _PC_SYNC_IO = new Pathconf();
        __UNKNOWN_CONSTANT__ = new Pathconf();
        Pathconf[] pathconfArray = new Pathconf[21];
        pathconfArray[0] = _PC_FILESIZEBITS;
        pathconfArray[1] = _PC_LINK_MAX;
        pathconfArray[2] = _PC_MAX_CANON;
        pathconfArray[3] = _PC_MAX_INPUT;
        pathconfArray[4] = _PC_NAME_MAX;
        pathconfArray[5] = _PC_PATH_MAX;
        pathconfArray[6] = _PC_PIPE_BUF;
        pathconfArray[7] = _PC_2_SYMLINKS;
        pathconfArray[8] = _PC_ALLOC_SIZE_MIN;
        pathconfArray[9] = _PC_REC_INCR_XFER_SIZE;
        pathconfArray[10] = _PC_REC_MAX_XFER_SIZE;
        pathconfArray[11] = _PC_REC_MIN_XFER_SIZE;
        pathconfArray[12] = _PC_REC_XFER_ALIGN;
        pathconfArray[13] = _PC_SYMLINK_MAX;
        pathconfArray[14] = _PC_CHOWN_RESTRICTED;
        pathconfArray[15] = _PC_NO_TRUNC;
        pathconfArray[16] = _PC_VDISABLE;
        pathconfArray[17] = _PC_ASYNC_IO;
        pathconfArray[18] = _PC_PRIO_IO;
        pathconfArray[19] = _PC_SYNC_IO;
        pathconfArray[20] = __UNKNOWN_CONSTANT__;
        $VALUES = pathconfArray;
        resolver = ConstantResolver.getResolver(Pathconf.class, 20000, 29999);
    }
}

