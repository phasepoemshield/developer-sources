/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.BaseFileStat;
import jnr.posix.NanosecondFileStat;
import jnr.posix.NativePOSIX;

public class SolarisFileStat32
extends BaseFileStat
implements NanosecondFileStat {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());

    @Override
    public long ctime() {
        return SolarisFileStat32.layout.st_ctim_sec.get(this.memory);
    }

    @Override
    public long blockSize() {
        return SolarisFileStat32.layout.st_blksize.get(this.memory);
    }

    public SolarisFileStat32(NativePOSIX posix) {
        super(posix, layout);
    }

    @Override
    public long st_size() {
        return SolarisFileStat32.layout.st_size.get(this.memory);
    }

    @Override
    public int mode() {
        return SolarisFileStat32.layout.st_mode.get(this.memory) & 0xFFFF;
    }

    @Override
    public long aTimeNanoSecs() {
        return SolarisFileStat32.layout.st_atim_nsec.get(this.memory);
    }

    @Override
    public int nlink() {
        return SolarisFileStat32.layout.st_nlink.get(this.memory);
    }

    @Override
    public long dev() {
        return SolarisFileStat32.layout.st_dev.get(this.memory);
    }

    @Override
    public long atime() {
        return SolarisFileStat32.layout.st_atim_sec.get(this.memory);
    }

    @Override
    public long rdev() {
        return SolarisFileStat32.layout.st_rdev.get(this.memory);
    }

    @Override
    public long ino() {
        return SolarisFileStat32.layout.st_ino.get(this.memory);
    }

    @Override
    public int gid() {
        return SolarisFileStat32.layout.st_gid.get(this.memory);
    }

    @Override
    public long cTimeNanoSecs() {
        return SolarisFileStat32.layout.st_ctim_nsec.get(this.memory);
    }

    @Override
    public int uid() {
        return SolarisFileStat32.layout.st_uid.get(this.memory);
    }

    @Override
    public long mtime() {
        return SolarisFileStat32.layout.st_mtim_sec.get(this.memory);
    }

    @Override
    public long mTimeNanoSecs() {
        return SolarisFileStat32.layout.st_mtim_nsec.get(this.memory);
    }

    @Override
    public long blocks() {
        return SolarisFileStat32.layout.st_blocks.get(this.memory);
    }

    static final class Layout
    extends StructLayout {
        public final StructLayout.SignedLong[] st_pad2;
        public final StructLayout.Signed32 st_atim_nsec;
        public final StructLayout.Signed64 st_ino;
        public final StructLayout.Signed32 st_uid;
        public final StructLayout.Signed32 st_blksize;
        public final StructLayout.Signed32 st_mtim_nsec;
        public final StructLayout.Signed32 st_gid;
        public final StructLayout.Signed32 st_atim_sec;
        public final StructLayout.Signed64 st_blocks;
        public final StructLayout.Signed32 st_ctim_sec;
        public final StructLayout.Signed8[] st_fstype;
        public final StructLayout.Signed64 st_size;
        public final StructLayout.Signed32 st_rdev;
        public final StructLayout.SignedLong[] st_pad4;
        public final StructLayout.Signed32 st_nlink;
        public final StructLayout.Signed32 st_mode;
        public final StructLayout.Signed32 st_mtim_sec;
        public final StructLayout.Signed32 st_dev = new StructLayout.Signed32(this);
        public final StructLayout.SignedLong[] st_pad1 = (StructLayout.SignedLong[])this.array(new StructLayout.SignedLong[3]);
        public final StructLayout.Signed32 st_ctim_nsec;
        public static final int _ST_FSTYPSZ = 16;

        Layout(Runtime runtime) {
            super(runtime);
            this.st_ino = new StructLayout.Signed64(this);
            this.st_mode = new StructLayout.Signed32(this);
            this.st_nlink = new StructLayout.Signed32(this);
            this.st_uid = new StructLayout.Signed32(this);
            this.st_gid = new StructLayout.Signed32(this);
            this.st_rdev = new StructLayout.Signed32(this);
            this.st_pad2 = (StructLayout.SignedLong[])this.array(new StructLayout.SignedLong[2]);
            this.st_size = new StructLayout.Signed64(this);
            this.st_atim_sec = new StructLayout.Signed32(this);
            this.st_atim_nsec = new StructLayout.Signed32(this);
            this.st_mtim_sec = new StructLayout.Signed32(this);
            this.st_mtim_nsec = new StructLayout.Signed32(this);
            this.st_ctim_sec = new StructLayout.Signed32(this);
            this.st_ctim_nsec = new StructLayout.Signed32(this);
            this.st_blksize = new StructLayout.Signed32(this);
            this.st_blocks = new StructLayout.Signed64(this);
            this.st_fstype = (StructLayout.Signed8[])this.array(new StructLayout.Signed8[16]);
            this.st_pad4 = (StructLayout.SignedLong[])this.array(new StructLayout.SignedLong[8]);
        }
    }
}

