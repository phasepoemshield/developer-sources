/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import jnr.constants.Constant;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Errno;
import jnr.constants.platform.Fcntl;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Signal;
import jnr.constants.platform.Sysconf;
import jnr.ffi.LastError;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.TypeAlias;
import jnr.ffi.byref.NumberByReference;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.posix.BaseFileStat;
import jnr.posix.BaseMsgHdr;
import jnr.posix.Crypt;
import jnr.posix.DefaultNativeGroup;
import jnr.posix.DefaultNativeRLimit;
import jnr.posix.DefaultNativeTimespec;
import jnr.posix.DefaultNativeTimeval;
import jnr.posix.FileStat;
import jnr.posix.Group;
import jnr.posix.JavaLibCHelper;
import jnr.posix.JavaTimes;
import jnr.posix.LibC;
import jnr.posix.LibCProvider;
import jnr.posix.MsgHdr;
import jnr.posix.NativePOSIX;
import jnr.posix.NativeTimes;
import jnr.posix.POSIX;
import jnr.posix.POSIXHandler;
import jnr.posix.Passwd;
import jnr.posix.RLimit;
import jnr.posix.SignalHandler;
import jnr.posix.SpawnAttribute;
import jnr.posix.SpawnFileAction;
import jnr.posix.Times;
import jnr.posix.Timespec;
import jnr.posix.Timeval;
import jnr.posix.UnixLibC;
import jnr.posix.util.Java5ProcessMaker;
import jnr.posix.util.MethodName;
import jnr.posix.util.ProcessMaker;

public abstract class BaseNativePOSIX
extends NativePOSIX
implements POSIX {
    protected final Map<Signal, SignalHandler> signalHandlers = new HashMap<Signal, SignalHandler>();
    public static final ToNativeConverter<MsgHdr, Pointer> MsgHdrConverter;
    public static final ToNativeConverter<NativeTimes, Pointer> TimesConverter;
    public static final PointerConverter GROUP;
    protected final POSIXHandler handler;
    public static final ToNativeConverter<Constant, Integer> ConstantConverter;
    private final Crypt crypt;
    protected final JavaLibCHelper helper;
    private final LibC libc;
    public static final ToNativeConverter<FileStat, Pointer> FileStatConverter;

    @Override
    public int pipe(int[] fds) {
        return this.libc().pipe(fds);
    }

    @Override
    public int fchown(int fd, int user, int group) {
        return this.libc().fchown(fd, user, group);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public long[] getgroups() {
        void var3_3;
        int size = this.getgroups(0, null);
        int[] groups2 = new int[size];
        long[] castGroups = new long[size];
        int actualSize = this.getgroups(size, groups2);
        if (actualSize == -1) {
            return null;
        }
        int i = 0;
        while (i < actualSize) {
            void var5_5;
            castGroups[i] = (long)groups2[i] & 0xFFFFFFFFL;
            ++var5_5;
        }
        if (actualSize < size) {
            void var4_4;
            return Arrays.copyOfRange(castGroups, 0, (int)var4_4);
        }
        return var3_3;
    }

    @Override
    public int link(String oldpath, String newpath) {
        return this.libc().link(oldpath, newpath);
    }

    protected BaseNativePOSIX(LibCProvider libcProvider, POSIXHandler handler) {
        this.handler = handler;
        this.libc = libcProvider.getLibC();
        this.crypt = libcProvider.getCrypt();
        this.helper = new JavaLibCHelper(handler);
    }

    @Override
    public final LibC libc() {
        return this.libc;
    }

    @Override
    public Group getgrgid(int which) {
        return this.libc().getgrgid(which);
    }

    @Override
    public int getgid() {
        return this.libc().getgid();
    }

    @Override
    public int getpid() {
        return this.libc().getpid();
    }

    @Override
    public int endpwent() {
        return this.libc().endpwent();
    }

    @Override
    public long sysconf(Sysconf name) {
        switch (name) {
            case _SC_CLK_TCK: {
                return 1000L;
            }
        }
        this.errno(Errno.EOPNOTSUPP.intValue());
        return -1L;
    }

    @Override
    @Deprecated
    public int fcntl(int fd, Fcntl fcntl, int ... args2) {
        if (args2 != null) {
            if (args2.length == 1) {
                return this.fcntl(fd, fcntl, args2[0]);
            }
        }
        throw new IllegalArgumentException("fcntl with variadic int args is unsupported");
    }

    @Override
    public int umask(int mask) {
        return this.libc().umask(mask);
    }

    @Override
    public int getpgid() {
        return this.libc().getpgid();
    }

    @Override
    public abstract FileStat allocateStat();

    @Override
    public int write(int fd, byte[] buf, int n) {
        return this.libc().write(fd, buf, n);
    }

    @Override
    public int getppid() {
        return this.libc().getppid();
    }

    @Override
    public long lseekLong(int fd, long offset, int whence) {
        return this.libc().lseek(fd, offset, whence);
    }

    @Override
    public int endgrent() {
        return this.libc().endgrent();
    }

    static {
        GROUP = new PointerConverter(){

            public Object fromNative(Object arg, FromNativeContext ctx) {
                return arg != null ? new DefaultNativeGroup((Pointer)arg) : null;
            }
        };
        FileStatConverter = new ToNativeConverter<FileStat, Pointer>(){

            @Override
            public Pointer toNative(FileStat value, ToNativeContext context) {
                if (value instanceof BaseFileStat) {
                    return ((BaseFileStat)value).memory;
                }
                if (value instanceof Struct) {
                    return Struct.getMemory((Struct)((Object)value));
                }
                if (value == null) {
                    return null;
                }
                throw new IllegalArgumentException("instance of " + value.getClass() + " is not a struct");
            }

            @Override
            public Class<Pointer> nativeType() {
                return Pointer.class;
            }
        };
        TimesConverter = new ToNativeConverter<NativeTimes, Pointer>(){

            @Override
            public Class<Pointer> nativeType() {
                return Pointer.class;
            }

            @Override
            public Pointer toNative(NativeTimes value, ToNativeContext context) {
                return value.memory;
            }
        };
        ConstantConverter = new ToNativeConverter<Constant, Integer>(){

            @Override
            public Integer toNative(Constant value, ToNativeContext context) {
                return value.intValue();
            }

            @Override
            public Class<Integer> nativeType() {
                return Integer.class;
            }
        };
        MsgHdrConverter = new ToNativeConverter<MsgHdr, Pointer>(){

            @Override
            public Class<Pointer> nativeType() {
                return Pointer.class;
            }

            @Override
            public Pointer toNative(MsgHdr value, ToNativeContext context) {
                if (value instanceof BaseMsgHdr) {
                    return ((BaseMsgHdr)value).memory;
                }
                if (value instanceof Struct) {
                    return Struct.getMemory((Struct)((Object)value));
                }
                if (value == null) {
                    return null;
                }
                throw new IllegalArgumentException("instance of " + value.getClass() + " is not a struct");
            }
        };
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int futimes(int fd, long[] atimeval, long[] mtimeval) {
        void var4_4;
        void var1_1;
        Timeval[] times = null;
        if (atimeval != null) {
            if (mtimeval != null) {
                times = (Timeval[])Struct.arrayOf((Runtime)this.getRuntime(), DefaultNativeTimeval.class, (int)2);
                times[0].setTime(atimeval);
                times[1].setTime(mtimeval);
            }
        }
        return this.libc().futimes((int)var1_1, (Timeval[])var4_4);
    }

    @Override
    public int execv(String path, String[] args2) {
        return this.libc().execv(path, args2);
    }

    @Override
    public int truncate(CharSequence path, long length) {
        return this.libc().truncate(path, length);
    }

    @Override
    public long pwrite(int fd, byte[] buf, long n, long offset) {
        return this.libc().pwrite(fd, buf, n, offset);
    }

    POSIXHandler handler() {
        return this.handler;
    }

    @Override
    public int readlink(CharSequence path, ByteBuffer buf, int bufsize) {
        return this.libc().readlink(path, buf, bufsize);
    }

    @Override
    public Timeval allocateTimeval() {
        return new DefaultNativeTimeval(this.getRuntime());
    }

    @Override
    public int getrlimit(int resource, RLimit rlim) {
        return this.libc().getrlimit(resource, rlim);
    }

    @Override
    public boolean isatty(FileDescriptor fd) {
        return this.isatty(this.helper.getfd(fd)) != 0;
    }

    @Override
    public int setenv(String envName, String envValue, int overwrite) {
        return this.libc().setenv(envName, envValue, overwrite);
    }

    @Override
    public int setrlimit(int resource, long rlimCur, long rlimMax) {
        DefaultNativeRLimit rlim = new DefaultNativeRLimit(this.getRuntime());
        ((RLimit)rlim).init(rlimCur, rlimMax);
        return this.libc().setrlimit(resource, rlim);
    }

    @Override
    public long pread(int fd, byte[] buf, long n, long offset) {
        return this.libc().pread(fd, buf, n, offset);
    }

    @Override
    public int read(int fd, ByteBuffer buf, int n) {
        return this.libc().read(fd, buf, n);
    }

    @Override
    public int setpgid(int pid, int pgid) {
        return this.libc().setpgid(pid, pgid);
    }

    @Override
    public String strerror(int code) {
        return this.libc().strerror(code);
    }

    @Override
    public int open(CharSequence path, int flags, int perm) {
        return this.libc().open(path, flags, perm);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FileStat fstat(int fd) {
        void var2_2;
        FileStat stat = this.allocateStat();
        if (this.fstat(fd, stat) < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "fstat", "" + fd);
        }
        return var2_2;
    }

    @Override
    public int fcntlInt(int fd, Fcntl fcntl, int arg) {
        return this.fcntl(fd, fcntl, arg);
    }

    @Override
    public int execve(String path, String[] args2, String[] env) {
        return this.libc().execve(path, args2, env);
    }

    @Override
    public int mkfifo(String filename, int mode) {
        return ((UnixLibC)this.libc()).mkfifo(filename, mode);
    }

    @Override
    public long pwrite(int fd, ByteBuffer buf, long n, long offset) {
        return this.libc().pwrite(fd, buf, n, offset);
    }

    @Override
    public int fpathconf(int fd, Pathconf name) {
        this.errno(Errno.EOPNOTSUPP.intValue());
        return -1;
    }

    public long posix_spawnp(String path, Collection<? extends SpawnFileAction> fileActions, CharSequence[] argv, CharSequence[] envp) {
        return this.posix_spawnp(path, fileActions, null, argv, envp);
    }

    @Override
    public int utimes(String path, Pointer times) {
        return this.libc().utimes(path, times);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public String readlink(String oldpath) throws IOException {
        void var2_2;
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        int result = this.libc().readlink((CharSequence)oldpath, buffer, buffer.capacity());
        if (result == -1) {
            return null;
        }
        buffer.position(0);
        buffer.limit(result);
        return Charset.defaultCharset().decode((ByteBuffer)var2_2).toString();
    }

    @Override
    public int setrlimit(int resource, RLimit rlim) {
        return this.libc().setrlimit(resource, rlim);
    }

    @Override
    public int getgroups(int size, int[] groups2) {
        return this.libc().getgroups(size, groups2);
    }

    @Override
    public int read(int fd, byte[] buf, int n) {
        return this.libc().read(fd, buf, n);
    }

    @Override
    public int fcntl(int fd, Fcntl fcntl, int arg) {
        return this.libc().fcntl(fd, fcntl.intValue(), arg);
    }

    @Override
    public int utimensat(int dirfd, String path, Pointer times, int flag) {
        return this.libc().utimensat(dirfd, path, times, flag);
    }

    @Override
    public int setpriority(int which, int who, int prio) {
        return this.libc().setpriority(which, who, prio);
    }

    @Override
    public long read(int fd, byte[] buf, long n) {
        return this.libc().read(fd, buf, n);
    }

    protected <T> T unimplementedNull() {
        this.handler().unimplementedError(MethodName.getCallerMethodName());
        return null;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FileStat fstat(FileDescriptor fileDescriptor) {
        void var2_2;
        FileStat stat = this.allocateStat();
        if (this.fstat(fileDescriptor, stat) < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "fstat", "" + this.helper.getfd(fileDescriptor));
        }
        return var2_2;
    }

    @Override
    public int getuid() {
        return this.libc().getuid();
    }

    @Override
    public Passwd getpwent() {
        return this.libc().getpwent();
    }

    @Override
    public int lchown(String filename, int user, int group) {
        try {
            return this.libc().lchown(filename, user, group);
        }
        catch (UnsatisfiedLinkError ule) {
            return this.unimplementedInt();
        }
    }

    @Override
    public int wait(int[] status) {
        return this.libc().wait(status);
    }

    @Override
    public int raise(int sig) {
        return this.libc().raise(sig);
    }

    @Override
    public int pwrite(int fd, byte[] buf, int n, int offset) {
        return this.libc().pwrite(fd, buf, n, offset);
    }

    @Override
    public int dup2(int oldFd, int newFd) {
        return this.libc().dup2(oldFd, newFd);
    }

    @Override
    public String getcwd() {
        int len;
        byte[] cwd = new byte[1024];
        long result = this.libc().getcwd(cwd, 1024);
        if (result == -1L) {
            return null;
        }
        for (len = 0; len < 1024 && cwd[len] != 0; ++len) {
        }
        return new String(cwd, 0, len);
    }

    @Override
    public int waitpid(long pid, int[] status, int flags) {
        return this.libc().waitpid(pid, status, flags);
    }

    @Override
    public int fcntl(int fd, Fcntl fcntl) {
        return this.libc().fcntl(fd, fcntl.intValue());
    }

    @Override
    public int getegid() {
        return this.libc().getegid();
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FileStat stat(String path) {
        void var2_2;
        FileStat stat = this.allocateStat();
        if (this.stat(path, stat) < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "stat", path);
        }
        return var2_2;
    }

    @Override
    public int chdir(String path) {
        return this.libc().chdir(path);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int utimes(String path, long[] atimeval, long[] mtimeval) {
        void var4_4;
        void var1_1;
        Timeval[] times = null;
        if (atimeval != null) {
            if (mtimeval != null) {
                times = (Timeval[])Struct.arrayOf((Runtime)this.getRuntime(), DefaultNativeTimeval.class, (int)2);
                times[0].setTime(atimeval);
                times[1].setTime(mtimeval);
            }
        }
        return this.libc().utimes((CharSequence)var1_1, (Timeval[])var4_4);
    }

    @Override
    public int setsid() {
        return this.libc().setsid();
    }

    @Override
    public long write(int fd, byte[] buf, long n) {
        return this.libc().write(fd, buf, n);
    }

    @Override
    public int setpwent() {
        return this.libc().setpwent();
    }

    @Override
    public int getpriority(int which, int who) {
        return this.libc().getpriority(which, who);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * Unable to fully structure code
     */
    public long posix_spawnp(String path, Collection<? extends SpawnFileAction> fileActions, Collection<? extends SpawnAttribute> spawnAttributes, CharSequence[] argv, CharSequence[] envp) {
        pid = new NumberByReference(TypeAlias.pid_t);
        if (fileActions == null) ** GOTO lbl-1000
        if (!fileActions.isEmpty()) {
            v0 = this.nativeFileActions(fileActions);
        } else lbl-1000:
        // 2 sources

        {
            v0 = null;
        }
        nativeFileActions = v0;
        if (spawnAttributes == null) ** GOTO lbl-1000
        if (!spawnAttributes.isEmpty()) {
            v1 = this.nativeSpawnAttributes(spawnAttributes);
        } else lbl-1000:
        // 2 sources

        {
            v1 = null;
        }
        nativeSpawnAttributes = v1;
        try {
            result = ((UnixLibC)this.libc()).posix_spawnp(pid, path, nativeFileActions, nativeSpawnAttributes, argv, envp);
        }
        finally {
            if (nativeFileActions != null) {
                ((UnixLibC)this.libc()).posix_spawn_file_actions_destroy(nativeFileActions);
            }
            if (nativeSpawnAttributes != null) {
                ((UnixLibC)this.libc()).posix_spawnattr_destroy(nativeSpawnAttributes);
            }
        }
        if (result != 0L) {
            return -1L;
        }
        return var6_6.longValue();
    }

    @Override
    public int chmod(String filename, int mode) {
        return this.libc().chmod(filename, mode);
    }

    @Override
    public int geteuid() {
        return this.libc().geteuid();
    }

    @Override
    public String getenv(String envName) {
        return this.libc().getenv(envName);
    }

    @Override
    public int setuid(int uid) {
        return this.libc().setuid(uid);
    }

    @Override
    public int access(CharSequence path, int amode) {
        return this.libc().access(path, amode);
    }

    @Override
    public String nl_langinfo(int item) {
        return this.libc().nl_langinfo(item);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int futimens(int fd, long[] atimespec, long[] mtimespec) {
        void var4_4;
        void var1_1;
        Timespec[] times = null;
        if (atimespec != null) {
            if (mtimespec != null) {
                times = (Timespec[])Struct.arrayOf((Runtime)this.getRuntime(), DefaultNativeTimespec.class, (int)2);
                times[0].setTime(atimespec);
                times[1].setTime(mtimespec);
            }
        }
        return this.libc().futimens((int)var1_1, (Timespec[])var4_4);
    }

    @Override
    public long write(int fd, ByteBuffer buf, long n) {
        return this.libc().write(fd, buf, n);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int lutimes(String path, long[] atimeval, long[] mtimeval) {
        void var4_4;
        void var1_1;
        Timeval[] times = null;
        if (atimeval != null) {
            if (mtimeval != null) {
                times = (Timeval[])Struct.arrayOf((Runtime)this.getRuntime(), DefaultNativeTimeval.class, (int)2);
                times[0].setTime(atimeval);
                times[1].setTime(mtimeval);
            }
        }
        return this.libc().lutimes((CharSequence)var1_1, (Timeval[])var4_4);
    }

    @Override
    public int ftruncate(int fd, long offset) {
        return this.libc().ftruncate(fd, offset);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public RLimit getrlimit(int resource) {
        void var2_2;
        DefaultNativeRLimit rlim = new DefaultNativeRLimit(this.getRuntime());
        if (this.getrlimit(resource, rlim) < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "rlim");
        }
        return var2_2;
    }

    @Override
    public int close(int fd) {
        return this.libc().close(fd);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public FileStat lstat(String path) {
        void var2_2;
        FileStat stat = this.allocateStat();
        if (this.lstat(path, stat) < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "lstat", path);
        }
        return var2_2;
    }

    @Override
    public int sendmsg(int socket, MsgHdr message, int flags) {
        return this.libc().sendmsg(socket, message, flags);
    }

    @Override
    public int readlink(CharSequence path, Pointer bufPtr, int bufsize) {
        return this.libc().readlink(path, bufPtr, bufsize);
    }

    @Override
    public int getpgrp() {
        return this.libc().getpgrp();
    }

    @Override
    public int dup(int fd) {
        return this.libc().dup(fd);
    }

    @Override
    public int kill(int pid, int signal) {
        return this.kill((long)pid, signal);
    }

    @Override
    public int isatty(int fd) {
        return this.libc().isatty(fd);
    }

    @Override
    public long posix_spawnp(String path, Collection<? extends SpawnFileAction> fileActions, Collection<? extends SpawnAttribute> spawnAttributes, Collection<? extends CharSequence> argv, Collection<? extends CharSequence> envp) {
        CharSequence[] nativeArgv = new CharSequence[argv.size()];
        argv.toArray(nativeArgv);
        CharSequence[] nativeEnv = new CharSequence[envp.size()];
        envp.toArray(nativeEnv);
        return this.posix_spawnp(path, fileActions, spawnAttributes, nativeArgv, nativeEnv);
    }

    @Override
    public int getrlimit(int resource, Pointer rlim) {
        return this.libc().getrlimit(resource, rlim);
    }

    @Override
    public int fstat(int fd, FileStat stat) {
        return this.libc().fstat(fd, stat);
    }

    @Override
    public int setgid(int gid) {
        return this.libc().setgid(gid);
    }

    @Override
    public int write(int fd, ByteBuffer buf, int n) {
        return this.libc().write(fd, buf, n);
    }

    public final Crypt crypt() {
        return this.crypt;
    }

    protected int unimplementedInt() {
        this.handler().unimplementedError(MethodName.getCallerMethodName());
        return -1;
    }

    @Override
    public int errno() {
        return LastError.getLastError(this.getRuntime());
    }

    @Override
    public Passwd getpwuid(int which) {
        return this.libc().getpwuid(which);
    }

    @Override
    public int waitpid(int pid, int[] status, int flags) {
        return this.waitpid((long)pid, status, flags);
    }

    @Override
    public int getdtablesize() {
        return this.libc().getdtablesize();
    }

    @Override
    public int chown(String filename, int user, int group) {
        return this.libc().chown(filename, user, group);
    }

    @Override
    public ProcessMaker newProcessMaker() {
        return new Java5ProcessMaker(this.handler);
    }

    @Override
    public int recvmsg(int socket, MsgHdr message, int flags) {
        return this.libc().recvmsg(socket, message, flags);
    }

    @Override
    public Group getgrent() {
        return this.libc().getgrent();
    }

    @Override
    public CharSequence crypt(CharSequence key, CharSequence salt) {
        Crypt crypt = this.crypt();
        if (crypt == null) {
            return JavaLibCHelper.crypt(key, salt);
        }
        return crypt.crypt(key, salt);
    }

    @Override
    public Pointer environ() {
        return this.getRuntime().getMemoryManager().newPointer(this.libc().environ().get());
    }

    @Override
    public long read(int fd, ByteBuffer buf, long n) {
        return this.libc().read(fd, buf, n);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int mkdir(String path, int mode) {
        void var3_3;
        int res = this.libc().mkdir(path, mode);
        if (res < 0) {
            int errno = this.errno();
            this.handler.error(Errno.valueOf(errno), "mkdir", path);
        }
        return (int)var3_3;
    }

    @Override
    public int unlink(CharSequence path) {
        return this.libc().unlink(path);
    }

    @Override
    public int utimensat(int dirfd, String path, long[] atimespec, long[] mtimespec, int flag) {
        Timespec[] times = null;
        if (atimespec != null && mtimespec != null) {
            times = (Timespec[])Struct.arrayOf((Runtime)this.getRuntime(), DefaultNativeTimespec.class, (int)2);
            times[0].setTime(atimespec);
            times[1].setTime(mtimespec);
        }
        return this.libc().utimensat(dirfd, path, times, flag);
    }

    @Override
    public int pread(int fd, byte[] buf, int n, int offset) {
        return this.libc().pread(fd, buf, n, offset);
    }

    @Override
    public Passwd getpwnam(String which) {
        return this.libc().getpwnam(which);
    }

    @Override
    public int daemon(int nochdir, int noclose) {
        return this.libc().daemon(nochdir, noclose);
    }

    @Override
    public int unsetenv(String envName) {
        return this.libc().unsetenv(envName);
    }

    @Override
    public long pread(int fd, ByteBuffer buf, long n, long offset) {
        return this.libc().pread(fd, buf, n, offset);
    }

    @Override
    public int symlink(String oldpath, String newpath) {
        return this.libc().symlink(oldpath, newpath);
    }

    /*
     * WARNING - void declaration
     */
    private Pointer nativeSpawnAttributes(Collection<? extends SpawnAttribute> spawnAttributes) {
        void var2_2;
        Pointer nativeSpawnAttributes = this.allocatePosixSpawnattr();
        ((UnixLibC)this.libc()).posix_spawnattr_init(nativeSpawnAttributes);
        Iterator<? extends SpawnAttribute> iterator2 = spawnAttributes.iterator();
        while (iterator2.hasNext()) {
            SpawnAttribute action = iterator2.next();
            action.set(this, nativeSpawnAttributes);
        }
        return var2_2;
    }

    @Override
    public int stat(String path, FileStat stat) {
        return this.libc().stat(path, stat);
    }

    @Override
    public int exec(String path, String[] args2, String[] envp) {
        this.handler.unimplementedError("exec unimplemented");
        return -1;
    }

    @Override
    public int lchmod(String filename, int mode) {
        try {
            return this.libc().lchmod(filename, mode);
        }
        catch (UnsatisfiedLinkError ule) {
            return this.unimplementedInt();
        }
    }

    @Override
    public int setrlimit(int resource, Pointer rlim) {
        return this.libc().setrlimit(resource, rlim);
    }

    @Override
    public int exec(String path, String ... args2) {
        this.handler.unimplementedError("exec unimplemented");
        return -1;
    }

    @Override
    public ProcessMaker newProcessMaker(String ... command) {
        return new Java5ProcessMaker(this.handler, command);
    }

    @Override
    public int futimens(int fd, Pointer times) {
        return this.libc().futimens(fd, times);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public byte[] crypt(byte[] key, byte[] salt) {
        void var6_6;
        void var5_5;
        Crypt crypt = this.crypt();
        if (crypt == null) {
            return JavaLibCHelper.crypt(key, salt);
        }
        Pointer ptr = this.crypt().crypt(key, salt);
        if (ptr == null) {
            return null;
        }
        int end = ptr.indexOf(0L, (byte)0);
        byte[] bytes = new byte[end + 1];
        ptr.get(0L, bytes, 0, (int)var5_5);
        return var6_6;
    }

    @Override
    public int seteuid(int euid) {
        return this.libc().seteuid(euid);
    }

    @Override
    public int getpgid(int pid) {
        return this.libc().getpgid(pid);
    }

    @Override
    public long posix_spawnp(String path, Collection<? extends SpawnFileAction> fileActions, Collection<? extends CharSequence> argv, Collection<? extends CharSequence> envp) {
        return this.posix_spawnp(path, fileActions, null, argv, envp);
    }

    @Override
    public int fstat(FileDescriptor fileDescriptor, FileStat stat) {
        int fd = this.helper.getfd(fileDescriptor);
        return this.libc().fstat(fd, stat);
    }

    @Override
    public void errno(int value) {
        LastError.setLastError(this.getRuntime(), value);
    }

    @Override
    public int confstr(Confstr name, ByteBuffer buf, int len) {
        this.errno(Errno.EOPNOTSUPP.intValue());
        return -1;
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public String gethostname() {
        void var1_1;
        int result;
        ByteBuffer buffer = ByteBuffer.allocate(256);
        try {
            result = this.libc().gethostname(buffer, buffer.capacity() - 1);
        }
        catch (UnsatisfiedLinkError e) {
            result = -1;
        }
        if (result == -1) {
            return this.helper.gethostname();
        }
        buffer.position(0);
        while (buffer.hasRemaining() && buffer.get() != 0) {
        }
        buffer.limit(buffer.position() - 1);
        buffer.position(0);
        return Charset.forName("US-ASCII").decode((ByteBuffer)var1_1).toString();
    }

    @Override
    public int lstat(String path, FileStat stat) {
        return this.libc().lstat(path, stat);
    }

    @Override
    public int kill(long pid, int signal) {
        return this.libc().kill(pid, signal);
    }

    @Override
    public String setlocale(int category, String locale) {
        return this.libc().setlocale(category, locale);
    }

    /*
     * WARNING - void declaration
     */
    @Override
    public int rmdir(String path) {
        void var2_2;
        int res = this.libc().rmdir(path);
        if (res < 0) {
            this.handler.error(Errno.valueOf(this.errno()), "rmdir", path);
        }
        return (int)var2_2;
    }

    @Override
    public int socketpair(int domain, int type, int protocol, int[] fds) {
        return this.libc().socketpair(domain, type, protocol, fds);
    }

    /*
     * WARNING - void declaration
     */
    private Pointer nativeFileActions(Collection<? extends SpawnFileAction> fileActions) {
        void var2_2;
        Pointer nativeFileActions = this.allocatePosixSpawnFileActions();
        ((UnixLibC)this.libc()).posix_spawn_file_actions_init(nativeFileActions);
        Iterator<? extends SpawnFileAction> iterator2 = fileActions.iterator();
        while (iterator2.hasNext()) {
            SpawnFileAction action = iterator2.next();
            action.act(this, nativeFileActions);
        }
        return var2_2;
    }

    @Override
    public int pwrite(int fd, ByteBuffer buf, int n, int offset) {
        return this.libc().pwrite(fd, buf, n, offset);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    @Override
    public SignalHandler signal(Signal sig, final SignalHandler handler) {
        Map<Signal, SignalHandler> map = this.signalHandlers;
        synchronized (map) {
            SignalHandler old = this.signalHandlers.get(sig);
            long result = this.libc().signal(sig.intValue(), new LibC.LibCSignalHandler(){

                @Override
                public void signal(int sig) {
                    handler.handle(sig);
                }
            });
            if (result != -1L) {
                this.signalHandlers.put(sig, handler);
            }
            return old;
        }
    }

    @Override
    public int setpgrp(int pid, int pgrp) {
        return this.libc().setpgrp(pid, pgrp);
    }

    @Override
    public int setegid(int egid) {
        return this.libc().setegid(egid);
    }

    @Override
    public int fchmod(int fd, int mode) {
        return this.libc().fchmod(fd, mode);
    }

    public int getfd(FileDescriptor descriptor2) {
        return this.helper.getfd(descriptor2);
    }

    @Override
    public int gettimeofday(Timeval tv) {
        return this.libc().gettimeofday(tv, 0L);
    }

    @Override
    public boolean isNative() {
        return true;
    }

    @Override
    public int fork() {
        return this.libc().fork();
    }

    @Override
    public int setgrent() {
        return this.libc().setgrent();
    }

    @Override
    public String getlogin() {
        return this.libc().getlogin();
    }

    @Override
    public int fdatasync(int fd) {
        return this.libc().fdatasync(fd);
    }

    @Override
    public Times times() {
        return new JavaTimes();
    }

    @Override
    public int pread(int fd, ByteBuffer buf, int n, int offset) {
        return this.libc().pread(fd, buf, n, offset);
    }

    @Override
    public int rename(CharSequence oldName, CharSequence newName) {
        return this.libc().rename(oldName, newName);
    }

    @Override
    public int fsync(int fd) {
        return this.libc().fsync(fd);
    }

    @Override
    public int flock(int fd, int mode) {
        return this.libc().flock(fd, mode);
    }

    @Override
    public int lseek(int fd, long offset, int whence) {
        return (int)this.libc().lseek(fd, offset, whence);
    }

    @Override
    public int readlink(CharSequence path, byte[] buf, int bufsize) {
        return this.libc().readlink(path, buf, bufsize);
    }

    @Override
    public Group getgrnam(String which) {
        return this.libc().getgrnam(which);
    }

    public static abstract class PointerConverter
    implements FromNativeConverter {
        public Class nativeType() {
            return Pointer.class;
        }
    }
}

