/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.io.FileDescriptor;
import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Errno;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.PosixFadvise;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.mapper.FromNativeContext;
import jnr.posix.BaseNativePOSIX;
import jnr.posix.FileStat;
import jnr.posix.LibCProvider;
import jnr.posix.Linux;
import jnr.posix.LinuxFileStat32;
import jnr.posix.LinuxFileStat64;
import jnr.posix.LinuxFileStatAARCH64;
import jnr.posix.LinuxFileStatLOONGARCH64;
import jnr.posix.LinuxFileStatMIPS64;
import jnr.posix.LinuxFileStatSPARCV9;
import jnr.posix.LinuxLibC;
import jnr.posix.LinuxMsgHdr;
import jnr.posix.LinuxPasswd;
import jnr.posix.LinuxSocketMacros;
import jnr.posix.MsgHdr;
import jnr.posix.NativeTimes;
import jnr.posix.POSIXHandler;
import jnr.posix.SocketMacros;
import jnr.posix.Times;
import jnr.posix.util.Platform;

final class LinuxPOSIX
extends BaseNativePOSIX
implements Linux {
    public static final BaseNativePOSIX.PointerConverter PASSWD = new BaseNativePOSIX.PointerConverter(){

        public Object fromNative(Object arg, FromNativeContext ctx) {
            return arg != null ? new LinuxPasswd((Pointer)arg) : null;
        }
    };
    private final int statVersion;
    private volatile boolean use_xstat64;
    private volatile boolean use_lxstat64;
    private volatile boolean use_fxstat64;

    @Override
    public long sysconf(Sysconf name) {
        return this.libc().sysconf(name);
    }

    @Override
    public int ioprio_get(int which, int who) {
        Syscall.ABI abi = Syscall.abi();
        if (abi == null) {
            this.handler.unimplementedError("ioprio_get");
            return -1;
        }
        return this.libc().syscall(abi.__NR_ioprio_get(), which, who);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FileStat fstat(int fd) {
        void var2_2;
        FileStat stat = this.allocateStat();
        int ret = this.fstat(fd, stat);
        if (ret < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "fstat", Integer.toString(fd));
        }
        return var2_2;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FileStat stat(String path) {
        void var2_2;
        FileStat stat = this.allocateStat();
        int ret = this.stat(path, stat);
        if (ret < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "stat", path);
        }
        return var2_2;
    }

    @Override
    public int confstr(Confstr name, ByteBuffer buf, int len) {
        return this.libc().confstr(name, buf, len);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FileStat fstat(FileDescriptor fileDescriptor) {
        void var2_2;
        FileStat stat = this.allocateStat();
        int fd = this.helper.getfd(fileDescriptor);
        int ret = this.fstat(fd, stat);
        if (ret < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "fstat", Integer.toString(fd));
        }
        return var2_2;
    }

    @Override
    public Pointer allocatePosixSpawnFileActions() {
        return Memory.allocateDirect(this.getRuntime(), 80);
    }

    @Override
    public MsgHdr allocateMsgHdr() {
        return new LinuxMsgHdr(this);
    }

    private final int old_lstat(String path, FileStat stat) {
        try {
            return super.lstat(path, stat);
        }
        catch (UnsatisfiedLinkError ex) {
            this.handler.unimplementedError("lstat");
            return -1;
        }
    }

    @Override
    public int fpathconf(int fd, Pathconf name) {
        return this.libc().fpathconf(fd, name);
    }

    @Override
    public FileStat allocateStat() {
        if (Platform.IS_32_BIT) {
            return new LinuxFileStat32(this);
        }
        if ("aarch64".equals(Platform.ARCH)) {
            return new LinuxFileStatAARCH64(this);
        }
        if ("sparcv9".equals(Platform.ARCH)) {
            return new LinuxFileStatSPARCV9(this);
        }
        if ("loongarch64".equals(Platform.ARCH)) {
            return new LinuxFileStatLOONGARCH64(this);
        }
        if (Platform.ARCH.contains("mips64")) {
            return new LinuxFileStatMIPS64(this);
        }
        return new LinuxFileStat64(this);
    }

    private int old_fstat(int fd, FileStat stat) {
        try {
            return super.fstat(fd, stat);
        }
        catch (UnsatisfiedLinkError ex2) {
            this.handler.unimplementedError("fstat");
            return -1;
        }
    }

    @Override
    public Times times() {
        return NativeTimes.times(this);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FileStat lstat(String path) {
        void var2_2;
        FileStat stat = this.allocateStat();
        int ret = this.lstat(path, stat);
        if (ret < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "lstat", path);
        }
        return var2_2;
    }

    @Override
    public int ioprio_set(int which, int who, int ioprio) {
        Syscall.ABI abi = Syscall.abi();
        if (abi == null) {
            this.handler.unimplementedError("ioprio_set");
            return -1;
        }
        return this.libc().syscall(abi.__NR_ioprio_set(), which, who, ioprio);
    }

    private final int old_stat(String path, FileStat stat) {
        try {
            return super.stat(path, stat);
        }
        catch (UnsatisfiedLinkError ex) {
            this.handler.unimplementedError("stat");
            return -1;
        }
    }

    @Override
    public int stat(String path, FileStat stat) {
        if (this.use_xstat64) {
            try {
                return ((LinuxLibC)this.libc()).__xstat64(this.statVersion, path, stat);
            }
            catch (UnsatisfiedLinkError ex) {
                this.use_xstat64 = false;
                return this.old_stat(path, stat);
            }
        }
        return this.old_stat(path, stat);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int fstat(int fd, FileStat stat) {
        void var2_2;
        if (this.use_fxstat64) {
            try {
                void var3_3;
                int ret = ((LinuxLibC)this.libc()).__fxstat64(this.statVersion, fd, stat);
                if (ret < 0) {
                    this.handler.error(Errno.valueOf(this.errno()), "fstat", Integer.toString(fd));
                }
                return (int)var3_3;
            }
            catch (UnsatisfiedLinkError ex) {
                this.use_fxstat64 = false;
                return this.old_fstat(fd, stat);
            }
        }
        return this.old_fstat(fd, (FileStat)var2_2);
    }

    @Override
    public SocketMacros socketMacros() {
        return LinuxSocketMacros.INSTANCE;
    }

    @Override
    public int lstat(String path, FileStat stat) {
        if (this.use_lxstat64) {
            try {
                return ((LinuxLibC)this.libc()).__lxstat64(this.statVersion, path, stat);
            }
            catch (UnsatisfiedLinkError ex) {
                this.use_lxstat64 = false;
                return this.old_lstat(path, stat);
            }
        }
        return this.old_lstat(path, stat);
    }

    @Override
    public int fstat(FileDescriptor fileDescriptor, FileStat stat) {
        return this.fstat(this.helper.getfd(fileDescriptor), stat);
    }

    @Override
    public int posix_fadvise(int fd, long offset, long len, PosixFadvise advise) {
        return ((LinuxLibC)this.libc()).posix_fadvise(fd, offset, len, advise.intValue());
    }

    @Override
    public Pointer allocatePosixSpawnattr() {
        return Memory.allocateDirect(this.getRuntime(), 336);
    }

    /*
     * Enabled aggressive block sorting
     */
    LinuxPOSIX(LibCProvider libcProvider, POSIXHandler handler) {
        block5: {
            block4: {
                super(libcProvider, handler);
                this.use_fxstat64 = true;
                this.use_lxstat64 = true;
                this.use_xstat64 = true;
                if (Platform.IS_32_BIT || "sparcv9".equals(Platform.ARCH)) break block4;
                if (!Platform.ARCH.contains("mips64")) break block5;
            }
            this.statVersion = 3;
            return;
        }
        FileStat stat = this.allocateStat();
        if (((LinuxLibC)this.libc()).__xstat64(0, "/dev/null", stat) < 0) {
            this.statVersion = 1;
            return;
        }
        this.statVersion = 0;
    }

    public static final class Syscall {
        static final ABI _ABI_PPC64;
        static final ABI _ABI_LOONGARCH64;
        static final ABI _ABI_X86_32;
        static final ABI _ABI_AARCH64;
        static final ABI _ABI_MIPS64;
        static final ABI _ABI_X86_64;
        static final ABI _ABI_SPARCV9;

        public static ABI abi() {
            if ("x86_64".equals(Platform.ARCH)) {
                if (Platform.IS_64_BIT) {
                    return _ABI_X86_64;
                }
            } else {
                if ("i386".equals(Platform.ARCH)) {
                    return _ABI_X86_32;
                }
                if ("aarch64".equals(Platform.ARCH)) {
                    return _ABI_AARCH64;
                }
                if ("sparcv9".equals(Platform.ARCH)) {
                    return _ABI_SPARCV9;
                }
                if (Platform.ARCH.contains("ppc64")) {
                    return _ABI_PPC64;
                }
                if (Platform.ARCH.contains("mips64")) {
                    return _ABI_MIPS64;
                }
                if (Platform.ARCH.contains("loongarch64")) {
                    return _ABI_LOONGARCH64;
                }
            }
            return null;
        }

        static {
            _ABI_X86_32 = new ABI_X86_32();
            _ABI_X86_64 = new ABI_X86_64();
            _ABI_AARCH64 = new ABI_AARCH64();
            _ABI_SPARCV9 = new ABI_SPARCV9();
            _ABI_PPC64 = new ABI_PPC64();
            _ABI_MIPS64 = new ABI_MIPS64();
            _ABI_LOONGARCH64 = new ABI_LOONGARCH64();
        }

        static final class ABI_AARCH64
        implements ABI {
            ABI_AARCH64() {
            }

            @Override
            public int __NR_ioprio_get() {
                return 31;
            }

            @Override
            public int __NR_ioprio_set() {
                return 30;
            }
        }

        static final class ABI_LOONGARCH64
        implements ABI {
            @Override
            public int __NR_ioprio_set() {
                return 30;
            }

            ABI_LOONGARCH64() {
            }

            @Override
            public int __NR_ioprio_get() {
                return 31;
            }
        }

        static final class ABI_PPC64
        implements ABI {
            ABI_PPC64() {
            }

            @Override
            public int __NR_ioprio_set() {
                return 273;
            }

            @Override
            public int __NR_ioprio_get() {
                return 274;
            }
        }

        static final class ABI_X86_64
        implements ABI {
            @Override
            public int __NR_ioprio_get() {
                return 252;
            }

            @Override
            public int __NR_ioprio_set() {
                return 251;
            }

            ABI_X86_64() {
            }
        }

        static final class ABI_X86_32
        implements ABI {
            @Override
            public int __NR_ioprio_get() {
                return 290;
            }

            ABI_X86_32() {
            }

            @Override
            public int __NR_ioprio_set() {
                return 289;
            }
        }

        static final class ABI_SPARCV9
        implements ABI {
            @Override
            public int __NR_ioprio_get() {
                return 218;
            }

            @Override
            public int __NR_ioprio_set() {
                return 196;
            }

            ABI_SPARCV9() {
            }
        }

        static final class ABI_MIPS64
        implements ABI {
            @Override
            public int __NR_ioprio_get() {
                return 5274;
            }

            ABI_MIPS64() {
            }

            @Override
            public int __NR_ioprio_set() {
                return 5273;
            }
        }

        static interface ABI {
            public int __NR_ioprio_get();

            public int __NR_ioprio_set();
        }
    }
}

