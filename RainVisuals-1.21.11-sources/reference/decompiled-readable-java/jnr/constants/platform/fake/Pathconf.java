/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.fake;

import jnr.constants.Constant;

public final class Pathconf
extends Enum<Pathconf>
implements Constant {
    public static final /* enum */ Pathconf _PC_PIPE_BUF;
    public static final /* enum */ Pathconf _PC_LINK_MAX;
    public static final /* enum */ Pathconf _PC_PRIO_IO;
    public static final long MIN_VALUE = 1L;
    public static final /* enum */ Pathconf _PC_VDISABLE;
    public static final /* enum */ Pathconf _PC_NAME_MAX;
    public static final /* enum */ Pathconf _PC_MAX_INPUT;
    public static final /* enum */ Pathconf _PC_PATH_MAX;
    public static final /* enum */ Pathconf _PC_CHOWN_RESTRICTED;
    public static final /* enum */ Pathconf _PC_ASYNC_IO;
    public static final /* enum */ Pathconf _PC_REC_MIN_XFER_SIZE;
    public static final /* enum */ Pathconf _PC_MAX_CANON;
    public static final long MAX_VALUE = 20L;
    public static final /* enum */ Pathconf _PC_SYNC_IO;
    public static final /* enum */ Pathconf _PC_SYMLINK_MAX;
    public static final /* enum */ Pathconf _PC_FILESIZEBITS;
    private final long value;
    public static final /* enum */ Pathconf _PC_REC_INCR_XFER_SIZE;
    public static final /* enum */ Pathconf _PC_REC_XFER_ALIGN;
    public static final /* enum */ Pathconf _PC_REC_MAX_XFER_SIZE;
    public static final /* enum */ Pathconf _PC_NO_TRUNC;
    public static final /* enum */ Pathconf _PC_2_SYMLINKS;
    public static final /* enum */ Pathconf _PC_ALLOC_SIZE_MIN;
    private static final /* synthetic */ Pathconf[] $VALUES;

    static {
        _PC_FILESIZEBITS = new Pathconf(1L);
        _PC_LINK_MAX = new Pathconf(2L);
        _PC_MAX_CANON = new Pathconf(3L);
        _PC_MAX_INPUT = new Pathconf(4L);
        _PC_NAME_MAX = new Pathconf(5L);
        _PC_PATH_MAX = new Pathconf(6L);
        _PC_PIPE_BUF = new Pathconf(7L);
        _PC_2_SYMLINKS = new Pathconf(8L);
        _PC_ALLOC_SIZE_MIN = new Pathconf(9L);
        _PC_REC_INCR_XFER_SIZE = new Pathconf(10L);
        _PC_REC_MAX_XFER_SIZE = new Pathconf(11L);
        _PC_REC_MIN_XFER_SIZE = new Pathconf(12L);
        _PC_REC_XFER_ALIGN = new Pathconf(13L);
        _PC_SYMLINK_MAX = new Pathconf(14L);
        _PC_CHOWN_RESTRICTED = new Pathconf(15L);
        _PC_NO_TRUNC = new Pathconf(16L);
        _PC_VDISABLE = new Pathconf(17L);
        _PC_ASYNC_IO = new Pathconf(18L);
        _PC_PRIO_IO = new Pathconf(19L);
        _PC_SYNC_IO = new Pathconf(20L);
        Pathconf[] pathconfArray = new Pathconf[20];
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
        $VALUES = pathconfArray;
    }

    private Pathconf(long value) {
        this.value = value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public static Pathconf valueOf(String name) {
        return Enum.valueOf(Pathconf.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static Pathconf[] values() {
        return (Pathconf[])$VALUES.clone();
    }
}

