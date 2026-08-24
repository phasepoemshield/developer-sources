/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.solaris;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class OpenFlags
extends Enum<OpenFlags>
implements Constant {
    public static final /* enum */ OpenFlags O_DIRECTORY;
    public static final /* enum */ OpenFlags O_NONBLOCK;
    private final long value;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ OpenFlags O_NOCTTY;
    public static final /* enum */ OpenFlags O_CREAT;
    public static final /* enum */ OpenFlags O_WRONLY;
    public static final /* enum */ OpenFlags O_CLOEXEC;
    public static final /* enum */ OpenFlags O_TRUNC;
    public static final /* enum */ OpenFlags O_EXCL;
    public static final /* enum */ OpenFlags O_RDWR;
    public static final /* enum */ OpenFlags O_ACCMODE;
    public static final /* enum */ OpenFlags O_NOFOLLOW;
    public static final /* enum */ OpenFlags O_APPEND;
    public static final long MAX_VALUE = 0x1000000L;
    private static final /* synthetic */ OpenFlags[] $VALUES;
    public static final /* enum */ OpenFlags O_SYNC;
    public static final /* enum */ OpenFlags O_RDONLY;

    @Override
    public final boolean defined() {
        return true;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static OpenFlags[] values() {
        return (OpenFlags[])$VALUES.clone();
    }

    public final int value() {
        return (int)this.value;
    }

    private OpenFlags(long value) {
        this.value = value;
    }

    public static OpenFlags valueOf(String name) {
        return Enum.valueOf(OpenFlags.class, name);
    }

    static {
        O_RDONLY = new OpenFlags(0L);
        O_WRONLY = new OpenFlags(1L);
        O_RDWR = new OpenFlags(2L);
        O_ACCMODE = new OpenFlags(0x600003L);
        O_NONBLOCK = new OpenFlags(128L);
        O_APPEND = new OpenFlags(8L);
        O_SYNC = new OpenFlags(16L);
        O_NOFOLLOW = new OpenFlags(131072L);
        O_CREAT = new OpenFlags(256L);
        O_TRUNC = new OpenFlags(512L);
        O_EXCL = new OpenFlags(1024L);
        O_DIRECTORY = new OpenFlags(0x1000000L);
        O_NOCTTY = new OpenFlags(2048L);
        O_CLOEXEC = new OpenFlags(0x800000L);
        OpenFlags[] openFlagsArray = new OpenFlags[14];
        openFlagsArray[0] = O_RDONLY;
        openFlagsArray[1] = O_WRONLY;
        openFlagsArray[2] = O_RDWR;
        openFlagsArray[3] = O_ACCMODE;
        openFlagsArray[4] = O_NONBLOCK;
        openFlagsArray[5] = O_APPEND;
        openFlagsArray[6] = O_SYNC;
        openFlagsArray[7] = O_NOFOLLOW;
        openFlagsArray[8] = O_CREAT;
        openFlagsArray[9] = O_TRUNC;
        openFlagsArray[10] = O_EXCL;
        openFlagsArray[11] = O_DIRECTORY;
        openFlagsArray[12] = O_NOCTTY;
        openFlagsArray[13] = O_CLOEXEC;
        $VALUES = openFlagsArray;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    static final class StringTable {
        public static final Map<OpenFlags, String> descriptions = StringTable.generateTable();

        public static final Map<OpenFlags, String> generateTable() {
            EnumMap<OpenFlags, String> map = new EnumMap<OpenFlags, String>(OpenFlags.class);
            map.put(O_RDONLY, "O_RDONLY");
            map.put(O_WRONLY, "O_WRONLY");
            map.put(O_RDWR, "O_RDWR");
            map.put(O_ACCMODE, "O_ACCMODE");
            map.put(O_NONBLOCK, "O_NONBLOCK");
            map.put(O_APPEND, "O_APPEND");
            map.put(O_SYNC, "O_SYNC");
            map.put(O_NOFOLLOW, "O_NOFOLLOW");
            map.put(O_CREAT, "O_CREAT");
            map.put(O_TRUNC, "O_TRUNC");
            map.put(O_EXCL, "O_EXCL");
            map.put(O_DIRECTORY, "O_DIRECTORY");
            map.put(O_NOCTTY, "O_NOCTTY");
            map.put(O_CLOEXEC, "O_CLOEXEC");
            return map;
        }

        StringTable() {
        }
    }
}

