/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.aarch64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class Pathconf
extends Enum<Pathconf>
implements Constant {
    public static final /* enum */ Pathconf _PC_SYNC_IO;
    private static final /* synthetic */ Pathconf[] $VALUES;
    public static final /* enum */ Pathconf _PC_REC_MAX_XFER_SIZE;
    public static final /* enum */ Pathconf _PC_MAX_CANON;
    public static final /* enum */ Pathconf _PC_PIPE_BUF;
    public static final /* enum */ Pathconf _PC_LINK_MAX;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ Pathconf _PC_ASYNC_IO;
    public static final /* enum */ Pathconf _PC_MAX_INPUT;
    public static final /* enum */ Pathconf _PC_REC_XFER_ALIGN;
    private final long value;
    public static final /* enum */ Pathconf _PC_CHOWN_RESTRICTED;
    public static final /* enum */ Pathconf _PC_NO_TRUNC;
    public static final long MAX_VALUE = 20L;
    public static final /* enum */ Pathconf _PC_ALLOC_SIZE_MIN;
    public static final /* enum */ Pathconf _PC_2_SYMLINKS;
    public static final /* enum */ Pathconf _PC_REC_MIN_XFER_SIZE;
    public static final /* enum */ Pathconf _PC_PRIO_IO;
    public static final /* enum */ Pathconf _PC_FILESIZEBITS;
    public static final /* enum */ Pathconf _PC_NAME_MAX;
    public static final /* enum */ Pathconf _PC_SYMLINK_MAX;
    public static final /* enum */ Pathconf _PC_PATH_MAX;
    public static final /* enum */ Pathconf _PC_VDISABLE;
    public static final /* enum */ Pathconf _PC_REC_INCR_XFER_SIZE;

    @Override
    public final long longValue() {
        return this.value;
    }

    private Pathconf(long value) {
        this.value = value;
    }

    public static Pathconf valueOf(String name) {
        return Enum.valueOf(Pathconf.class, name);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static Pathconf[] values() {
        return (Pathconf[])$VALUES.clone();
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        _PC_FILESIZEBITS = new Pathconf(13L);
        _PC_LINK_MAX = new Pathconf(0L);
        _PC_MAX_CANON = new Pathconf(1L);
        _PC_MAX_INPUT = new Pathconf(2L);
        _PC_NAME_MAX = new Pathconf(3L);
        _PC_PATH_MAX = new Pathconf(4L);
        _PC_PIPE_BUF = new Pathconf(5L);
        _PC_2_SYMLINKS = new Pathconf(20L);
        _PC_ALLOC_SIZE_MIN = new Pathconf(18L);
        _PC_REC_INCR_XFER_SIZE = new Pathconf(14L);
        _PC_REC_MAX_XFER_SIZE = new Pathconf(15L);
        _PC_REC_MIN_XFER_SIZE = new Pathconf(16L);
        _PC_REC_XFER_ALIGN = new Pathconf(17L);
        _PC_SYMLINK_MAX = new Pathconf(19L);
        _PC_CHOWN_RESTRICTED = new Pathconf(6L);
        _PC_NO_TRUNC = new Pathconf(7L);
        _PC_VDISABLE = new Pathconf(8L);
        _PC_ASYNC_IO = new Pathconf(10L);
        _PC_PRIO_IO = new Pathconf(11L);
        _PC_SYNC_IO = new Pathconf(9L);
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

    public final int value() {
        return (int)this.value;
    }

    static final class StringTable {
        public static final Map<Pathconf, String> descriptions = StringTable.generateTable();

        public static final Map<Pathconf, String> generateTable() {
            EnumMap<Pathconf, String> map = new EnumMap<Pathconf, String>(Pathconf.class);
            map.put(_PC_FILESIZEBITS, "_PC_FILESIZEBITS");
            map.put(_PC_LINK_MAX, "_PC_LINK_MAX");
            map.put(_PC_MAX_CANON, "_PC_MAX_CANON");
            map.put(_PC_MAX_INPUT, "_PC_MAX_INPUT");
            map.put(_PC_NAME_MAX, "_PC_NAME_MAX");
            map.put(_PC_PATH_MAX, "_PC_PATH_MAX");
            map.put(_PC_PIPE_BUF, "_PC_PIPE_BUF");
            map.put(_PC_2_SYMLINKS, "_PC_2_SYMLINKS");
            map.put(_PC_ALLOC_SIZE_MIN, "_PC_ALLOC_SIZE_MIN");
            map.put(_PC_REC_INCR_XFER_SIZE, "_PC_REC_INCR_XFER_SIZE");
            map.put(_PC_REC_MAX_XFER_SIZE, "_PC_REC_MAX_XFER_SIZE");
            map.put(_PC_REC_MIN_XFER_SIZE, "_PC_REC_MIN_XFER_SIZE");
            map.put(_PC_REC_XFER_ALIGN, "_PC_REC_XFER_ALIGN");
            map.put(_PC_SYMLINK_MAX, "_PC_SYMLINK_MAX");
            map.put(_PC_CHOWN_RESTRICTED, "_PC_CHOWN_RESTRICTED");
            map.put(_PC_NO_TRUNC, "_PC_NO_TRUNC");
            map.put(_PC_VDISABLE, "_PC_VDISABLE");
            map.put(_PC_ASYNC_IO, "_PC_ASYNC_IO");
            map.put(_PC_PRIO_IO, "_PC_PRIO_IO");
            map.put(_PC_SYNC_IO, "_PC_SYNC_IO");
            return map;
        }

        StringTable() {
        }
    }
}

