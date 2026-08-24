/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.BaseFileStat;
import jnr.posix.MacOSPOSIX;
import jnr.posix.NanosecondFileStat;

public final class MacOSFileStat64Inode
extends BaseFileStat
implements NanosecondFileStat {
    private static final Layout64Inode layout = new Layout64Inode(Runtime.getSystemRuntime());

    @Override
    public int gid() {
        return MacOSFileStat64Inode.layout.st_gid.get(this.memory);
    }

    @Override
    public long atime() {
        return MacOSFileStat64Inode.layout.st_atime.get(this.memory);
    }

    @Override
    public long st_size() {
        return MacOSFileStat64Inode.layout.st_size.get(this.memory);
    }

    @Override
    public long blockSize() {
        return MacOSFileStat64Inode.layout.st_blksize.get(this.memory);
    }

    @Override
    public long aTimeNanoSecs() {
        return MacOSFileStat64Inode.layout.st_atimensec.get(this.memory);
    }

    @Override
    public int nlink() {
        return MacOSFileStat64Inode.layout.st_nlink.get(this.memory);
    }

    @Override
    public long blocks() {
        return MacOSFileStat64Inode.layout.st_blocks.get(this.memory);
    }

    @Override
    public int mode() {
        return MacOSFileStat64Inode.layout.st_mode.get(this.memory) & 0xFFFF;
    }

    @Override
    public int uid() {
        return MacOSFileStat64Inode.layout.st_uid.get(this.memory);
    }

    @Override
    public long mtime() {
        return MacOSFileStat64Inode.layout.st_mtime.get(this.memory);
    }

    @Override
    public long ino() {
        return MacOSFileStat64Inode.layout.st_ino.get(this.memory);
    }

    @Override
    public long rdev() {
        return MacOSFileStat64Inode.layout.st_rdev.get(this.memory);
    }

    @Override
    public long dev() {
        return MacOSFileStat64Inode.layout.st_dev.get(this.memory);
    }

    public MacOSFileStat64Inode(MacOSPOSIX posix) {
        super(posix, layout);
    }

    @Override
    public long mTimeNanoSecs() {
        return MacOSFileStat64Inode.layout.st_mtimensec.get(this.memory);
    }

    @Override
    public long cTimeNanoSecs() {
        return MacOSFileStat64Inode.layout.st_ctimensec.get(this.memory);
    }

    @Override
    public long ctime() {
        return MacOSFileStat64Inode.layout.st_ctime.get(this.memory);
    }

    public static class Layout64Inode
    extends StructLayout {
        public final StructLayout.Signed32 st_gid;
        public final StructLayout.Signed64 st_ino;
        public final StructLayout.SignedLong st_birthtimensec;
        public final StructLayout.Signed64 st_qspare1;
        public final StructLayout.Signed64 st_blocks;
        public final StructLayout.Signed32 st_dev = new StructLayout.Signed32();
        public final StructLayout.Signed64 st_qspare0;
        public final StructLayout.Signed64 st_size;
        public final time_t st_birthtime;
        public final StructLayout.Signed32 st_rdev;
        public final StructLayout.Signed16 st_mode = new StructLayout.Signed16();
        public final StructLayout.SignedLong st_mtimensec;
        public final StructLayout.SignedLong st_ctimensec;
        public final StructLayout.Signed16 st_nlink = new StructLayout.Signed16();
        public final time_t st_mtime;
        public final time_t st_atime;
        public final StructLayout.SignedLong st_atimensec;
        public final StructLayout.Signed32 st_flags;
        public final StructLayout.Signed32 st_blksize;
        public final StructLayout.Signed32 st_uid;
        public final StructLayout.Signed32 st_gen;
        public final time_t st_ctime;
        public final StructLayout.Signed32 st_lspare;

        public Layout64Inode(Runtime runtime) {
            super(runtime);
            this.st_ino = new StructLayout.Signed64();
            this.st_uid = new StructLayout.Signed32();
            this.st_gid = new StructLayout.Signed32();
            this.st_rdev = new StructLayout.Signed32();
            this.st_atime = new time_t();
            this.st_atimensec = new StructLayout.SignedLong();
            this.st_mtime = new time_t();
            this.st_mtimensec = new StructLayout.SignedLong();
            this.st_ctime = new time_t();
            this.st_ctimensec = new StructLayout.SignedLong();
            this.st_birthtime = new time_t();
            this.st_birthtimensec = new StructLayout.SignedLong();
            this.st_size = new StructLayout.Signed64();
            this.st_blocks = new StructLayout.Signed64();
            this.st_blksize = new StructLayout.Signed32();
            this.st_flags = new StructLayout.Signed32();
            this.st_gen = new StructLayout.Signed32();
            this.st_lspare = new StructLayout.Signed32();
            this.st_qspare0 = new StructLayout.Signed64();
            this.st_qspare1 = new StructLayout.Signed64();
        }

        public final class time_t
        extends StructLayout.SignedLong {
        }
    }
}

