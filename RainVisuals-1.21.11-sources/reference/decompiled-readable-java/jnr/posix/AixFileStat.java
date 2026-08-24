/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import jnr.ffi.NativeType;
import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;
import jnr.posix.BaseFileStat;
import jnr.posix.NanosecondFileStat;
import jnr.posix.NativePOSIX;

public final class AixFileStat
extends BaseFileStat
implements NanosecondFileStat {
    private static final Layout layout = new Layout(Runtime.getSystemRuntime());

    @Override
    public long ino() {
        return AixFileStat.layout.st_ino.get(this.memory);
    }

    @Override
    public int mode() {
        return (int)AixFileStat.layout.st_mode.get(this.memory) & 0xFFFF;
    }

    @Override
    public int uid() {
        return (int)AixFileStat.layout.st_uid.get(this.memory);
    }

    @Override
    public long dev() {
        return AixFileStat.layout.st_dev.get(this.memory);
    }

    @Override
    public int nlink() {
        return AixFileStat.layout.st_nlink.get(this.memory);
    }

    public AixFileStat(NativePOSIX posix) {
        super(posix, layout);
    }

    @Override
    public long cTimeNanoSecs() {
        return AixFileStat.layout.st_ctime_n.get(this.memory);
    }

    @Override
    public long rdev() {
        return AixFileStat.layout.st_rdev.get(this.memory);
    }

    @Override
    public long blocks() {
        return AixFileStat.layout.st_blocks.get(this.memory);
    }

    @Override
    public int gid() {
        return (int)AixFileStat.layout.st_gid.get(this.memory);
    }

    @Override
    public long ctime() {
        return AixFileStat.layout.st_ctime.get(this.memory);
    }

    @Override
    public long mTimeNanoSecs() {
        return AixFileStat.layout.st_mtime_n.get(this.memory);
    }

    @Override
    public long mtime() {
        return AixFileStat.layout.st_mtime.get(this.memory);
    }

    @Override
    public long aTimeNanoSecs() {
        return AixFileStat.layout.st_atime_n.get(this.memory);
    }

    @Override
    public long atime() {
        return AixFileStat.layout.st_atime.get(this.memory);
    }

    @Override
    public long st_size() {
        return AixFileStat.layout.st_size.get(this.memory);
    }

    @Override
    public long blockSize() {
        return AixFileStat.layout.st_blksize.get(this.memory);
    }

    private static final class Layout
    extends StructLayout {
        public final StructLayout.Signed32 st_atime_n;
        public final StructLayout.Unsigned16 st_flag;
        public final StructLayout.Signed64 st_mtime;
        public final StructLayout.Unsigned32 st_mode;
        public final StructLayout.Unsigned32 st_gid;
        public final StructLayout.Unsigned64 st_dev = new StructLayout.Unsigned64();
        public final StructLayout.Unsigned64 st_blocks;
        public final StructLayout.Signed32 st_pad2;
        public final StructLayout.Unsigned32 st_vfs;
        public final StructLayout.Signed32 st_mtime_n;
        public final StructLayout.Signed32 st_ctime_n;
        public final StructLayout.Unsigned32 st_uid;
        public final StructLayout.Signed64 st_ctime;
        public final StructLayout.Unsigned64 st_rdev;
        public final StructLayout.Padding st_reserved;
        public final StructLayout.Signed16 st_nlink;
        public final StructLayout.Signed32 st_pad1;
        public final StructLayout.Unsigned64 st_blksize;
        public final StructLayout.Signed64 st_atime;
        public final StructLayout.Signed32 st_vfstype;
        public final StructLayout.Unsigned32 st_type;
        public final StructLayout.Signed64 st_size;
        public final StructLayout.Signed32 st_pad3;
        public final StructLayout.Signed64 st_ino = new StructLayout.Signed64();
        public final StructLayout.Unsigned32 st_gen;

        private Layout(Runtime runtime) {
            super(runtime);
            this.st_mode = new StructLayout.Unsigned32();
            this.st_nlink = new StructLayout.Signed16();
            this.st_flag = new StructLayout.Unsigned16();
            this.st_uid = new StructLayout.Unsigned32();
            this.st_gid = new StructLayout.Unsigned32();
            this.st_rdev = new StructLayout.Unsigned64();
            this.st_size = new StructLayout.Signed64();
            this.st_atime = new StructLayout.Signed64();
            this.st_atime_n = new StructLayout.Signed32();
            this.st_pad1 = new StructLayout.Signed32();
            this.st_mtime = new StructLayout.Signed64();
            this.st_mtime_n = new StructLayout.Signed32();
            this.st_pad2 = new StructLayout.Signed32();
            this.st_ctime = new StructLayout.Signed64();
            this.st_ctime_n = new StructLayout.Signed32();
            this.st_pad3 = new StructLayout.Signed32();
            this.st_blksize = new StructLayout.Unsigned64();
            this.st_blocks = new StructLayout.Unsigned64();
            this.st_vfstype = new StructLayout.Signed32();
            this.st_vfs = new StructLayout.Unsigned32();
            this.st_type = new StructLayout.Unsigned32();
            this.st_gen = new StructLayout.Unsigned32();
            this.st_reserved = (StructLayout)this.new StructLayout.Padding(NativeType.UINT, 11);
        }
    }
}

