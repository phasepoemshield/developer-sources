/*
 * Decompiled with CFR 0.152.
 */
package jnr.constants.platform.linux.powerpc64;

import java.util.EnumMap;
import java.util.Map;
import jnr.constants.Constant;

public final class PosixFadvise
extends Enum<PosixFadvise>
implements Constant {
    private static final /* synthetic */ PosixFadvise[] $VALUES;
    private final long value;
    public static final long MIN_VALUE = 0L;
    public static final long MAX_VALUE = 5L;
    public static final /* enum */ PosixFadvise POSIX_FADV_WILLNEED;
    public static final /* enum */ PosixFadvise POSIX_FADV_NORMAL;
    public static final /* enum */ PosixFadvise POSIX_FADV_DONTNEED;
    public static final /* enum */ PosixFadvise POSIX_FADV_RANDOM;
    public static final /* enum */ PosixFadvise POSIX_FADV_SEQUENTIAL;
    public static final /* enum */ PosixFadvise POSIX_FADV_NOREUSE;

    static {
        POSIX_FADV_NORMAL = new PosixFadvise(0L);
        POSIX_FADV_SEQUENTIAL = new PosixFadvise(2L);
        POSIX_FADV_RANDOM = new PosixFadvise(1L);
        POSIX_FADV_NOREUSE = new PosixFadvise(5L);
        POSIX_FADV_WILLNEED = new PosixFadvise(3L);
        POSIX_FADV_DONTNEED = new PosixFadvise(4L);
        PosixFadvise[] posixFadviseArray = new PosixFadvise[6];
        posixFadviseArray[0] = POSIX_FADV_NORMAL;
        posixFadviseArray[1] = POSIX_FADV_SEQUENTIAL;
        posixFadviseArray[2] = POSIX_FADV_RANDOM;
        posixFadviseArray[3] = POSIX_FADV_NOREUSE;
        posixFadviseArray[4] = POSIX_FADV_WILLNEED;
        posixFadviseArray[5] = POSIX_FADV_DONTNEED;
        $VALUES = posixFadviseArray;
    }

    public final String toString() {
        return StringTable.descriptions.get(this);
    }

    public static PosixFadvise valueOf(String name) {
        return Enum.valueOf(PosixFadvise.class, name);
    }

    private PosixFadvise(long value) {
        this.value = value;
    }

    @Override
    public final int intValue() {
        return (int)this.value;
    }

    @Override
    public final boolean defined() {
        return true;
    }

    public final int value() {
        return (int)this.value;
    }

    @Override
    public final long longValue() {
        return this.value;
    }

    public static PosixFadvise[] values() {
        return (PosixFadvise[])$VALUES.clone();
    }

    static final class StringTable {
        public static final Map<PosixFadvise, String> descriptions = StringTable.generateTable();

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

        StringTable() {
        }
    }
}

