/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.windows;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class OpenFlags
extends Enum<OpenFlags>
implements Constant {
    public static final /* enum */ OpenFlags O_APPEND;
    public static final /* enum */ OpenFlags O_ACCMODE;
    public static final /* enum */ OpenFlags O_TRUNC;
    public static final long MAX_VALUE = 32768L;
    public static final /* enum */ OpenFlags O_BINARY;
    public static final /* enum */ OpenFlags O_CREAT;
    private final long value;
    public static final long MIN_VALUE = 0L;
    public static final /* enum */ OpenFlags O_EXCL;
    public static final /* enum */ OpenFlags O_RDONLY;
    public static final /* enum */ OpenFlags O_WRONLY;
    private static final /* synthetic */ OpenFlags[] $VALUES;
    public static final /* enum */ OpenFlags O_RDWR;

    private OpenFlags(long value) {
        this.value = value;
    }

    public static OpenFlags valueOf(String name) {
        return Enum.valueOf(OpenFlags.class, name);
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        O_RDONLY = new OpenFlags(0L);
        O_WRONLY = new OpenFlags(1L);
        O_RDWR = new OpenFlags(2L);
        O_ACCMODE = new OpenFlags(3L);
        O_APPEND = new OpenFlags(8L);
        O_CREAT = new OpenFlags(256L);
        O_TRUNC = new OpenFlags(512L);
        O_EXCL = new OpenFlags(1024L);
        O_BINARY = new OpenFlags(32768L);
        OpenFlags[] openFlagsArray = new OpenFlags[9];
        openFlagsArray[0] = O_RDONLY;
        openFlagsArray[1] = O_WRONLY;
        openFlagsArray[2] = O_RDWR;
        openFlagsArray[3] = O_ACCMODE;
        openFlagsArray[4] = O_APPEND;
        openFlagsArray[5] = O_CREAT;
        openFlagsArray[6] = O_TRUNC;
        openFlagsArray[7] = O_EXCL;
        openFlagsArray[8] = O_BINARY;
        $VALUES = openFlagsArray;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static OpenFlags[] values() {
        return (OpenFlags[])$VALUES.clone();
    }

    static final class StringTable {
        public static final Map<OpenFlags, String> descriptions = StringTable.generateTable();

        public static final Map<OpenFlags, String> generateTable() {
            EnumMap<OpenFlags, String> map = new EnumMap<OpenFlags, String>(OpenFlags.class);
            map.put(O_RDONLY, "O_RDONLY");
            map.put(O_WRONLY, "O_WRONLY");
            map.put(O_RDWR, "O_RDWR");
            map.put(O_ACCMODE, "O_ACCMODE");
            map.put(O_APPEND, "O_APPEND");
            map.put(O_CREAT, "O_CREAT");
            map.put(O_TRUNC, "O_TRUNC");
            map.put(O_EXCL, "O_EXCL");
            map.put(O_BINARY, "O_BINARY");
            return map;
        }

        StringTable() {
        }
    }
}

