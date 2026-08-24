/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix.windows;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

public abstract class CommonFileInformation
extends Struct {
    public static final int NANOSECONDS = 1000000000;
    public static int FILE_ATTRIBUTE_DIRECTORY;
    public static int FILE_ATTRIBUTE_READONLY;
    private static final double DAYS_BETWEEN_WINDOWS_AND_UNIX = 134774.4825;
    private static final long NANOSECONDS_TO_UNIX_EPOCH_FROM_WINDOWS = -6802270473709551616L;

    public static long asNanoSeconds(long seconds) {
        return (seconds * 1000L + -6802270473709551L) * 10L;
    }

    public long getLastAccessTimeNanoseconds() {
        return this.epochNanos(this.getLastAccessTime().getLongValue());
    }

    public long getFileSize() {
        return this.getFileSizeHigh() << 32 | this.getFileSizeLow();
    }

    public long getLastWriteTimeNanoseconds() {
        return this.epochNanos(this.getLastWriteTime().getLongValue());
    }

    public abstract long getFileSizeLow();

    public int getMode(String path) {
        int mode;
        block4: {
            block5: {
                int attr = this.getFileAttributes();
                mode = 256;
                if ((attr & FILE_ATTRIBUTE_READONLY) == 0) {
                    mode |= 0x80;
                }
                mode |= (attr & FILE_ATTRIBUTE_DIRECTORY) != 0 ? 16448 : 32768;
                if ((path = path.toLowerCase()) == null) break block4;
                if ((mode & 0x8000) == 0) break block4;
                if (path.endsWith(".bat") || path.endsWith(".cmd") || path.endsWith(".com")) break block5;
                if (!path.endsWith(".exe")) break block4;
            }
            mode |= 0x40;
        }
        mode |= (mode & 0x1C0) >> 3;
        int n = mode | (mode & 0x1C0) >> 6;
        return n;
    }

    public abstract int getFileAttributes();

    private long epochNanos(long windowsNanoChunks) {
        return windowsNanoChunks * 100L - -6802270473709551616L;
    }

    public abstract HackyFileTime getLastWriteTime();

    public abstract long getFileSizeHigh();

    public abstract HackyFileTime getLastAccessTime();

    public abstract HackyFileTime getCreationTime();

    public long getCreationTimeNanoseconds() {
        return this.epochNanos(this.getCreationTime().getLongValue());
    }

    protected CommonFileInformation(Runtime runtime) {
        super(runtime);
    }

    static {
        FILE_ATTRIBUTE_READONLY = 1;
        FILE_ATTRIBUTE_DIRECTORY = 16;
    }

    public class HackyFileTime {
        private final Struct.UnsignedLong dwHighDateTime;
        private final Struct.UnsignedLong dwLowDateTime;

        public HackyFileTime(Struct.UnsignedLong high, Struct.UnsignedLong low) {
            this.dwHighDateTime = high;
            this.dwLowDateTime = low;
        }

        public long getLowDateTime() {
            return this.dwLowDateTime.longValue();
        }

        public long getLongValue() {
            return (this.getHighDateTime() & 0xFFFFFFFFL) << 32 | this.getLowDateTime() & 0xFFFFFFFFL;
        }

        public long getHighDateTime() {
            return this.dwHighDateTime.longValue();
        }
    }
}

