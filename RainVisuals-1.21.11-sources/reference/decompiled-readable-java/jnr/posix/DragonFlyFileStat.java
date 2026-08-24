/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.BaseFileStat;
import jnr.posix.NanosecondFileStat;
import jnr.posix.NativePOSIX;

public final class DragonFlyFileStat
extends BaseFileStat
implements NanosecondFileStat {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());

    @Override
    public long atime() {
        return DragonFlyFileStat.layout.st_atim.get(this.memory);
    }

    @Override
    public long ctime() {
        return DragonFlyFileStat.layout.st_ctim.get(this.memory);
    }

    @Override
    public long mTimeNanoSecs() {
        return DragonFlyFileStat.layout.st_mtimnsec.get(this.memory);
    }

    @Override
    public long st_size() {
        return DragonFlyFileStat.layout.st_size.get(this.memory);
    }

    @Override
    public long rdev() {
        return DragonFlyFileStat.layout.st_rdev.get(this.memory);
    }

    @Override
    public long dev() {
        return DragonFlyFileStat.layout.st_dev.get(this.memory);
    }

    @Override
    public int uid() {
        return DragonFlyFileStat.layout.st_uid.get(this.memory);
    }

    @Override
    public long ino() {
        return DragonFlyFileStat.layout.st_ino.get(this.memory);
    }

    @Override
    public long aTimeNanoSecs() {
        return DragonFlyFileStat.layout.st_atimnsec.get(this.memory);
    }

    @Override
    public long blocks() {
        return DragonFlyFileStat.layout.st_blocks.get(this.memory);
    }

    @Override
    public int gid() {
        return DragonFlyFileStat.layout.st_gid.get(this.memory);
    }

    @Override
    public long blockSize() {
        return DragonFlyFileStat.layout.st_blksize.get(this.memory);
    }

    @Override
    public int nlink() {
        return DragonFlyFileStat.layout.st_nlink.get(this.memory);
    }

    @Override
    public long cTimeNanoSecs() {
        return DragonFlyFileStat.layout.st_ctimnsec.get(this.memory);
    }

    @Override
    public int mode() {
        return DragonFlyFileStat.layout.st_mode.get(this.memory) & 0xFFFF;
    }

    @Override
    public long mtime() {
        return DragonFlyFileStat.layout.st_mtim.get(this.memory);
    }

    public DragonFlyFileStat(NativePOSIX posix) {
        super(posix, layout);
    }

    private static final class Layout
    extends StructLayout {
        public final StructLayout.Unsigned16 st_padding1;
        public final time_t st_ctimnsec;
        public final StructLayout.Signed32 st_lspare;
        public final StructLayout.Unsigned16 st_mode;
        public final time_t st_ctim;
        public final StructLayout.Signed32 st_nlink;
        public final StructLayout.Signed32 st_flags;
        public final StructLayout.Signed32 st_gen;
        public final StructLayout.Signed64 st_ino = new StructLayout.Signed64();
        public final time_t st_atimnsec;
        public final time_t st_mtim;
        public final StructLayout.Signed64 st_qspare1;
        public final dev_t st_dev;
        public final StructLayout.Signed64 st_qspare2;
        public final StructLayout.Signed32 st_size;
        public final StructLayout.Signed32 st_blocks;
        public final time_t st_atim;
        public final StructLayout.Signed32 st_blksize;
        public final StructLayout.Signed32 st_uid;
        public final StructLayout.Signed32 st_gid;
        public final dev_t st_rdev;
        public final time_t st_mtimnsec;

        private Layout(Runtime runtime) {
            super(runtime);
            this.st_nlink = new StructLayout.Signed32();
            this.st_dev = new dev_t();
            this.st_mode = new StructLayout.Unsigned16();
            this.st_padding1 = new StructLayout.Unsigned16();
            this.st_uid = new StructLayout.Signed32();
            this.st_gid = new StructLayout.Signed32();
            this.st_rdev = new dev_t();
            this.st_atim = new time_t();
            this.st_atimnsec = new time_t();
            this.st_mtim = new time_t();
            this.st_mtimnsec = new time_t();
            this.st_ctim = new time_t();
            this.st_ctimnsec = new time_t();
            this.st_size = new StructLayout.Signed32();
            this.st_blocks = new StructLayout.Signed32();
            this.st_blksize = new StructLayout.Signed32();
            this.st_flags = new StructLayout.Signed32();
            this.st_gen = new StructLayout.Signed32();
            this.st_lspare = new StructLayout.Signed32();
            this.st_qspare1 = new StructLayout.Signed64();
            this.st_qspare2 = new StructLayout.Signed64();
        }

        public final class dev_t
        extends StructLayout.Unsigned32 {
        }

        public final class time_t
        extends StructLayout.SignedLong {
        }
    }
}

