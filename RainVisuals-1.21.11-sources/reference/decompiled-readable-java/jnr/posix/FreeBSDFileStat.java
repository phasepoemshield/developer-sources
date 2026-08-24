/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.BaseFileStat;
import jnr.posix.NanosecondFileStat;
import jnr.posix.NativePOSIX;

public final class FreeBSDFileStat
extends BaseFileStat
implements NanosecondFileStat {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());

    @Override
    public long mTimeNanoSecs() {
        return FreeBSDFileStat.layout.st_mtimensec.get(this.memory);
    }

    @Override
    public long cTimeNanoSecs() {
        return FreeBSDFileStat.layout.st_ctimensec.get(this.memory);
    }

    @Override
    public long ctime() {
        return FreeBSDFileStat.layout.st_ctime.get(this.memory);
    }

    @Override
    public long blockSize() {
        return FreeBSDFileStat.layout.st_blksize.get(this.memory);
    }

    @Override
    public long ino() {
        return FreeBSDFileStat.layout.st_ino.get(this.memory);
    }

    @Override
    public long dev() {
        return FreeBSDFileStat.layout.st_dev.get(this.memory);
    }

    public FreeBSDFileStat(NativePOSIX posix) {
        super(posix, layout);
    }

    @Override
    public int mode() {
        return FreeBSDFileStat.layout.st_mode.get(this.memory) & 0xFFFF;
    }

    @Override
    public int uid() {
        return FreeBSDFileStat.layout.st_uid.get(this.memory);
    }

    @Override
    public long blocks() {
        return FreeBSDFileStat.layout.st_blocks.get(this.memory);
    }

    @Override
    public long atime() {
        return FreeBSDFileStat.layout.st_atime.get(this.memory);
    }

    @Override
    public long rdev() {
        return FreeBSDFileStat.layout.st_rdev.get(this.memory);
    }

    @Override
    public long mtime() {
        return FreeBSDFileStat.layout.st_mtime.get(this.memory);
    }

    @Override
    public int gid() {
        return FreeBSDFileStat.layout.st_gid.get(this.memory);
    }

    @Override
    public long aTimeNanoSecs() {
        return FreeBSDFileStat.layout.st_atimensec.get(this.memory);
    }

    @Override
    public int nlink() {
        return FreeBSDFileStat.layout.st_nlink.get(this.memory);
    }

    @Override
    public long st_size() {
        return FreeBSDFileStat.layout.st_size.get(this.memory);
    }

    private static final class Layout
    extends StructLayout {
        public final time_t st_birthtime;
        public final StructLayout.Signed64 st_qspare0;
        public final StructLayout.Signed32 st_uid;
        public final time_t st_mtime;
        public final StructLayout.SignedLong st_mtimensec;
        public final StructLayout.SignedLong st_atimensec;
        public final StructLayout.Signed32 st_gid;
        public final StructLayout.SignedLong st_birthtimensec;
        public final StructLayout.SignedLong st_ctimensec;
        public final time_t st_atime;
        public final StructLayout.Signed32 st_blksize;
        public final StructLayout.Signed64 st_size;
        public final StructLayout.Signed16 st_nlink;
        public final StructLayout.Signed16 st_mode;
        public final StructLayout.Signed32 st_gen;
        public final dev_t st_dev = new dev_t();
        public final dev_t st_rdev;
        public final StructLayout.Signed32 st_ino = new StructLayout.Signed32();
        public final StructLayout.Signed32 st_flags;
        public final time_t st_ctime;
        public final StructLayout.Signed32 st_lspare;
        public final StructLayout.Signed64 st_blocks;

        private Layout(Runtime runtime) {
            super(runtime);
            this.st_mode = new StructLayout.Signed16();
            this.st_nlink = new StructLayout.Signed16();
            this.st_uid = new StructLayout.Signed32();
            this.st_gid = new StructLayout.Signed32();
            this.st_rdev = new dev_t();
            this.st_atime = new time_t();
            this.st_atimensec = new StructLayout.SignedLong();
            this.st_mtime = new time_t();
            this.st_mtimensec = new StructLayout.SignedLong();
            this.st_ctime = new time_t();
            this.st_ctimensec = new StructLayout.SignedLong();
            this.st_size = new StructLayout.Signed64();
            this.st_blocks = new StructLayout.Signed64();
            this.st_blksize = new StructLayout.Signed32();
            this.st_flags = new StructLayout.Signed32();
            this.st_gen = new StructLayout.Signed32();
            this.st_lspare = new StructLayout.Signed32();
            this.st_birthtime = new time_t();
            this.st_birthtimensec = new StructLayout.SignedLong();
            this.st_qspare0 = new StructLayout.Signed64();
        }

        public final class time_t
        extends StructLayout.SignedLong {
        }

        public final class dev_t
        extends StructLayout.Signed32 {
        }
    }
}

