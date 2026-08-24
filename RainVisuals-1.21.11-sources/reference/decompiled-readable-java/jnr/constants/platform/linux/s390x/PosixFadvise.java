/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.s390x;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class PosixFadvise
extends Enum<PosixFadvise>
implements Constant {
    public static final /* enum */ PosixFadvise POSIX_FADV_RANDOM;
    private final long value;
    public static final long MAX_VALUE = 7L;
    public static final long MIN_VALUE = 0L;
    private static final /* synthetic */ PosixFadvise[] $VALUES;
    public static final /* enum */ PosixFadvise POSIX_FADV_DONTNEED;
    public static final /* enum */ PosixFadvise POSIX_FADV_NOREUSE;
    public static final /* enum */ PosixFadvise POSIX_FADV_SEQUENTIAL;
    public static final /* enum */ PosixFadvise POSIX_FADV_WILLNEED;
    public static final /* enum */ PosixFadvise POSIX_FADV_NORMAL;

    @Override
    public final long longValue() {
        return this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    static {
        POSIX_FADV_NORMAL = new PosixFadvise(0L);
        POSIX_FADV_SEQUENTIAL = new PosixFadvise(2L);
        POSIX_FADV_RANDOM = new PosixFadvise(1L);
        POSIX_FADV_NOREUSE = new PosixFadvise(7L);
        POSIX_FADV_WILLNEED = new PosixFadvise(3L);
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

    public static PosixFadvise[] values() {
        return (PosixFadvise[])$VALUES.clone();
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public final int value() {
        return (int)this.value;
    }

    private PosixFadvise(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    public static PosixFadvise valueOf(String name) {
        return Enum.valueOf(PosixFadvise.class, name);
    }

    static final class StringTable {
        public static final Map<PosixFadvise, String> descriptions = StringTable.generateTable();

        StringTable() {
        }

        public static final Map<PosixFadvise, String> generateTable() {
            EnumMap<PosixFadvise, String> map = new EnumMap<PosixFadvise, String>(PosixFadvise.class);
            map.put(POSIX_FADV_NORMAL, "POSIX_FADV_NORMAL");
            map.put(POSIX_FADV_SEQUENTIAL, "POSIX_FADV_SEQUENTIAL");
            map.put(POSIX_FADV_RANDOM, "POSIX_FADV_RANDOM");
            map.put(POSIX_FADV_NOREUSE, "POSIX_FADV_NOREUSE");
            map.put(POSIX_FADV_WILLNEED, "POSIX_FADV_WILLNEED");
            map.put(POSIX_FADV_DONTNEED, "POSIX_FADV_DONTNEED");
            return map;
        }
    }
}

