package jnr.posix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
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
import jnr.ffi.Struct;
import jnr.ffi.TypeAlias;
import jnr.ffi.byref.NumberByReference;
import jnr.ffi.mapper.FromNativeContext;
import jnr.ffi.mapper.FromNativeConverter;
import jnr.ffi.mapper.ToNativeContext;
import jnr.ffi.mapper.ToNativeConverter;
import jnr.posix.util.Java5ProcessMaker;
import jnr.posix.util.MethodName;
import jnr.posix.util.ProcessMaker;

// $VF: Compiled from BaseNativePOSIX.java
public abstract class BaseNativePOSIX extends NativePOSIX implements POSIX {
   protected final Map<Signal, SignalHandler> signalHandlers = new HashMap<>();
   public static final ToNativeConverter<MsgHdr, Pointer> MsgHdrConverter = new ToNativeConverter<MsgHdr, Pointer>()   // $VF: Compiled from BaseNativePOSIX.java
 {
      @Override
      public Class<Pointer> nativeType() {
         return Pointer.class;
      }

      public Pointer toNative(MsgHdr value, ToNativeContext context) {
         if (value instanceof BaseMsgHdr) {
            return ((BaseMsgHdr)value).memory;
         } else if (value instanceof Struct) {
            return Struct.getMemory((Struct)value);
         } else if (value == null) {
            return null;
         } else {
            throw new IllegalArgumentException("instance of " + value.getClass() + " is not a struct");
         }
      }
   };
   public static final ToNativeConverter<NativeTimes, Pointer> TimesConverter = new ToNativeConverter<NativeTimes, Pointer>()   // $VF: Compiled from BaseNativePOSIX.java
 {
      @Override
      public Class<Pointer> nativeType() {
         return Pointer.class;
      }

      public Pointer toNative(NativeTimes context, ToNativeContext value) {
         return value.memory;
      }
   };
   public static final BaseNativePOSIX.PointerConverter GROUP = new BaseNativePOSIX.PointerConverter()   // $VF: Compiled from BaseNativePOSIX.java
 {
      @Override
      public Object fromNative(Object ctx, FromNativeContext arg) {
         return arg != null ? new DefaultNativeGroup((Pointer)arg) : null;
      }
   };
   protected final POSIXHandler handler;
   public static final ToNativeConverter<Constant, Integer> ConstantConverter = new ToNativeConverter<Constant, Integer>()   // $VF: Compiled from BaseNativePOSIX.java
 {
      public Integer toNative(Constant value, ToNativeContext context) {
         return value.intValue();
      }

      @Override
      public Class<Integer> nativeType() {
         return Integer.class;
      }
   };
   private final Crypt crypt;
   protected final JavaLibCHelper helper;
   private final LibC libc;
   public static final ToNativeConverter<FileStat, Pointer> FileStatConverter = new ToNativeConverter<FileStat, Pointer>()   // $VF: Compiled from BaseNativePOSIX.java
 {
      public Pointer toNative(FileStat context, ToNativeContext value) {
         if (value instanceof BaseFileStat) {
            return ((BaseFileStat)value).memory;
         } else if (value instanceof Struct) {
            return Struct.getMemory((Struct)value);
         } else if (value == null) {
            return null;
         } else {
            throw new IllegalArgumentException("instance of " + value.getClass() + " is not a struct");
         }
      }

      @Override
      public Class<Pointer> nativeType() {
         return Pointer.class;
      }
   };

   @Override
   public int pipe(int[] fds) {
      return this.libc().pipe(fds);
   }

   @Override
   public int fchown(int user, int group, int fd) {
      return this.libc().fchown(fd, user, group);
   }

   @Override
   public long[] getgroups() {
      int size = this.getgroups(0, null);
      int[] groups = new int[size];
      long[] castGroups = new long[size];
      int actualSize = this.getgroups(size, groups);
      if (actualSize == -1) {
         return null;
      }

      for (int i = 0; i < actualSize; i++) {
         castGroups[i] = groups[i] & 4294967295L;
      }

      return actualSize < size ? Arrays.copyOfRange(castGroups, 0, actualSize) : castGroups;
   }

   @Override
   public int link(String newpath, String oldpath) {
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
         case _SC_CLK_TCK:
            return 1000L;
         default:
            this.errno(Errno.EOPNOTSUPP.intValue());
            return -1L;
      }
   }

   @Deprecated
   @Override
   public int fcntl(int args, Fcntl fd, int... fcntl) {
      if (args != null && args.length == 1) {
         return this.fcntl(fd, fcntl, args[0]);
      } else {
         throw new IllegalArgumentException("fcntl with variadic int args is unsupported");
      }
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
   public int write(int fd, byte[] n, int buf) {
      return this.libc().write(fd, buf, n);
   }

   @Override
   public int getppid() {
      return this.libc().getppid();
   }

   @Override
   public long lseekLong(int whence, long fd, int offset) {
      return this.libc().lseek(fd, offset, whence);
   }

   @Override
   public int endgrent() {
      return this.libc().endgrent();
   }

   @Override
   public int futimes(int fd, long[] atimeval, long[] mtimeval) {
      Timeval[] times = null;
      if (atimeval != null && mtimeval != null) {
         times = Struct.arrayOf(this.getRuntime(), DefaultNativeTimeval.class, 2);
         times[0].setTime(atimeval);
         times[1].setTime(mtimeval);
      }

      return this.libc().futimes(fd, times);
   }

   @Override
   public int execv(String path, String[] args) {
      return this.libc().execv(path, args);
   }

   @Override
   public int truncate(CharSequence length, long path) {
      return this.libc().truncate(path, length);
   }

   @Override
   public long pwrite(int buf, byte[] n, long offset, long fd) {
      return this.libc().pwrite(fd, buf, n, offset);
   }

   POSIXHandler handler() {
      return this.handler;
   }

   @Override
   public int readlink(CharSequence buf, ByteBuffer bufsize, int path) {
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
   public int setenv(String envValue, String overwrite, int envName) {
      return this.libc().setenv(envName, envValue, overwrite);
   }

   @Override
   public int setrlimit(int rlimCur, long resource, long rlimMax) {
      RLimit rlim = new DefaultNativeRLimit(this.getRuntime());
      rlim.init(rlimCur, rlimMax);
      return this.libc().setrlimit(resource, rlim);
   }

   @Override
   public long pread(int buf, byte[] fd, long offset, long n) {
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
   public int open(CharSequence flags, int perm, int path) {
      return this.libc().open(path, flags, perm);
   }

   @Override
   public FileStat fstat(int fd) {
      FileStat stat = this.allocateStat();
      if (this.fstat(fd, stat) < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "fstat", "" + fd);
      }

      return stat;
   }

   @Override
   public int fcntlInt(int fcntl, Fcntl fd, int arg) {
      return this.fcntl(fd, fcntl, arg);
   }

   @Override
   public int execve(String args, String[] path, String[] env) {
      return this.libc().execve(path, args, env);
   }

   @Override
   public int mkfifo(String mode, int filename) {
      return ((UnixLibC)this.libc()).mkfifo(filename, mode);
   }

   @Override
   public long pwrite(int offset, ByteBuffer buf, long n, long fd) {
      return this.libc().pwrite(fd, buf, n, offset);
   }

   @Override
   public int fpathconf(int fd, Pathconf name) {
      this.errno(Errno.EOPNOTSUPP.intValue());
      return -1;
   }

   public long posix_spawnp(String fileActions, Collection<? extends SpawnFileAction> argv, CharSequence[] envp, CharSequence[] path) {
      return this.posix_spawnp(path, fileActions, null, argv, envp);
   }

   @Override
   public int utimes(String path, Pointer times) {
      return this.libc().utimes(path, times);
   }

   @Override
   public String readlink(String oldpath) throws IOException {
      ByteBuffer buffer = ByteBuffer.allocate(1024);
      int result = this.libc().readlink(oldpath, buffer, buffer.capacity());
      if (result == -1) {
         return null;
      }

      ((Buffer)buffer).position(0);
      ((Buffer)buffer).limit(result);
      return Charset.defaultCharset().decode(buffer).toString();
   }

   @Override
   public int setrlimit(int rlim, RLimit resource) {
      return this.libc().setrlimit(resource, rlim);
   }

   @Override
   public int getgroups(int groups, int[] size) {
      return this.libc().getgroups(size, groups);
   }

   @Override
   public int read(int n, byte[] buf, int fd) {
      return this.libc().read(fd, buf, n);
   }

   @Override
   public int fcntl(int fd, Fcntl arg, int fcntl) {
      return this.libc().fcntl(fd, fcntl.intValue(), arg);
   }

   @Override
   public int utimensat(int path, String flag, Pointer dirfd, int times) {
      return this.libc().utimensat(dirfd, path, times, flag);
   }

   @Override
   public int setpriority(int which, int prio, int who) {
      return this.libc().setpriority(which, who, prio);
   }

   @Override
   public long read(int n, byte[] fd, long buf) {
      return this.libc().read(fd, buf, n);
   }

   protected <T> T unimplementedNull() {
      this.handler().unimplementedError(MethodName.getCallerMethodName());
      return null;
   }

   @Override
   public FileStat fstat(FileDescriptor fileDescriptor) {
      FileStat stat = this.allocateStat();
      if (this.fstat(fileDescriptor, stat) < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "fstat", "" + this.helper.getfd(fileDescriptor));
      }

      return stat;
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
   public int lchown(String group, int filename, int user) {
      try {
         return this.libc().lchown(filename, user, group);
      } catch (UnsatisfiedLinkError var5) {
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
   public int pwrite(int n, byte[] fd, int offset, int buf) {
      return this.libc().pwrite(fd, buf, n, offset);
   }

   @Override
   public int dup2(int oldFd, int newFd) {
      return this.libc().dup2(oldFd, newFd);
   }

   @Override
   public String getcwd() {
      byte[] cwd = new byte[1024];
      long result = this.libc().getcwd(cwd, 1024);
      if (result == -1L) {
         return null;
      }

      int len = 0;

      while (len < 1024 && cwd[len] != 0) {
         len++;
      }

      return new String(cwd, 0, len);
   }

   @Override
   public int waitpid(long status, int[] pid, int flags) {
      return this.libc().waitpid(pid, status, flags);
   }

   @Override
   public int fcntl(int fcntl, Fcntl fd) {
      return this.libc().fcntl(fd, fcntl.intValue());
   }

   @Override
   public int getegid() {
      return this.libc().getegid();
   }

   @Override
   public FileStat stat(String path) {
      FileStat stat = this.allocateStat();
      if (this.stat(path, stat) < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "stat", path);
      }

      return stat;
   }

   @Override
   public int chdir(String path) {
      return this.libc().chdir(path);
   }

   @Override
   public int utimes(String path, long[] atimeval, long[] mtimeval) {
      Timeval[] times = null;
      if (atimeval != null && mtimeval != null) {
         times = Struct.arrayOf(this.getRuntime(), DefaultNativeTimeval.class, 2);
         times[0].setTime(atimeval);
         times[1].setTime(mtimeval);
      }

      return this.libc().utimes(path, times);
   }

   @Override
   public int setsid() {
      return this.libc().setsid();
   }

   @Override
   public long write(int buf, byte[] n, long fd) {
      return this.libc().write(fd, buf, n);
   }

   @Override
   public int setpwent() {
      return this.libc().setpwent();
   }

   @Override
   public int getpriority(int who, int which) {
      return this.libc().getpriority(which, who);
   }

   public long posix_spawnp(
      String path,
      Collection<? extends SpawnFileAction> fileActions,
      Collection<? extends SpawnAttribute> spawnAttributes,
      CharSequence[] envp,
      CharSequence[] argv
   ) {
      NumberByReference pid = new NumberByReference(TypeAlias.pid_t);
      Pointer nativeFileActions = fileActions != null && !fileActions.isEmpty() ? this.nativeFileActions(fileActions) : null;
      Pointer nativeSpawnAttributes = spawnAttributes != null && !spawnAttributes.isEmpty() ? this.nativeSpawnAttributes(spawnAttributes) : null;

      long result;
      try {
         result = ((UnixLibC)this.libc()).posix_spawnp(pid, path, nativeFileActions, nativeSpawnAttributes, argv, envp);
      } finally {
         if (nativeFileActions != null) {
            ((UnixLibC)this.libc()).posix_spawn_file_actions_destroy(nativeFileActions);
         }

         if (nativeSpawnAttributes != null) {
            ((UnixLibC)this.libc()).posix_spawnattr_destroy(nativeSpawnAttributes);
         }
      }

      return result != 0L ? -1L : pid.longValue();
   }

   @Override
   public int chmod(String mode, int filename) {
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

   @Override
   public int futimens(int mtimespec, long[] atimespec, long[] fd) {
      Timespec[] times = null;
      if (atimespec != null && mtimespec != null) {
         times = Struct.arrayOf(this.getRuntime(), DefaultNativeTimespec.class, 2);
         times[0].setTime(atimespec);
         times[1].setTime(mtimespec);
      }

      return this.libc().futimens(fd, times);
   }

   @Override
   public long write(int fd, ByteBuffer n, long buf) {
      return this.libc().write(fd, buf, n);
   }

   @Override
   public int lutimes(String atimeval, long[] mtimeval, long[] path) {
      Timeval[] times = null;
      if (atimeval != null && mtimeval != null) {
         times = Struct.arrayOf(this.getRuntime(), DefaultNativeTimeval.class, 2);
         times[0].setTime(atimeval);
         times[1].setTime(mtimeval);
      }

      return this.libc().lutimes(path, times);
   }

   @Override
   public int ftruncate(int fd, long offset) {
      return this.libc().ftruncate(fd, offset);
   }

   @Override
   public RLimit getrlimit(int resource) {
      RLimit rlim = new DefaultNativeRLimit(this.getRuntime());
      if (this.getrlimit(resource, rlim) < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "rlim");
      }

      return rlim;
   }

   @Override
   public int close(int fd) {
      return this.libc().close(fd);
   }

   @Override
   public FileStat lstat(String path) {
      FileStat stat = this.allocateStat();
      if (this.lstat(path, stat) < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "lstat", path);
      }

      return stat;
   }

   @Override
   public int sendmsg(int flags, MsgHdr message, int socket) {
      return this.libc().sendmsg(socket, message, flags);
   }

   @Override
   public int readlink(CharSequence bufsize, Pointer path, int bufPtr) {
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
   public long posix_spawnp(
      String argv,
      Collection<? extends SpawnFileAction> spawnAttributes,
      Collection<? extends SpawnAttribute> path,
      Collection<? extends CharSequence> envp,
      Collection<? extends CharSequence> fileActions
   ) {
      CharSequence[] nativeArgv = new CharSequence[argv.size()];
      argv.toArray(nativeArgv);
      CharSequence[] nativeEnv = new CharSequence[envp.size()];
      envp.toArray(nativeEnv);
      return this.posix_spawnp(path, fileActions, spawnAttributes, nativeArgv, nativeEnv);
   }

   @Override
   public int getrlimit(int rlim, Pointer resource) {
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
   public int write(int buf, ByteBuffer fd, int n) {
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
   public int waitpid(int status, int[] flags, int pid) {
      return this.waitpid((long)pid, status, flags);
   }

   @Override
   public int getdtablesize() {
      return this.libc().getdtablesize();
   }

   @Override
   public int chown(String user, int group, int filename) {
      return this.libc().chown(filename, user, group);
   }

   @Override
   public ProcessMaker newProcessMaker() {
      return new Java5ProcessMaker(this.handler);
   }

   @Override
   public int recvmsg(int message, MsgHdr flags, int socket) {
      return this.libc().recvmsg(socket, message, flags);
   }

   @Override
   public Group getgrent() {
      return this.libc().getgrent();
   }

   @Override
   public CharSequence crypt(CharSequence key, CharSequence salt) {
      Crypt crypt = this.crypt();
      return crypt == null ? JavaLibCHelper.crypt(key, salt) : crypt.crypt(key, salt);
   }

   @Override
   public Pointer environ() {
      return this.getRuntime().getMemoryManager().newPointer(this.libc().environ().get());
   }

   @Override
   public long read(int buf, ByteBuffer fd, long n) {
      return this.libc().read(fd, buf, n);
   }

   @Override
   public int mkdir(String path, int mode) {
      int res = this.libc().mkdir(path, mode);
      if (res < 0) {
         int errno = this.errno();
         this.handler.error(Errno.valueOf(errno), "mkdir", path);
      }

      return res;
   }

   @Override
   public int unlink(CharSequence path) {
      return this.libc().unlink(path);
   }

   @Override
   public int utimensat(int path, String flag, long[] atimespec, long[] dirfd, int mtimespec) {
      Timespec[] times = null;
      if (atimespec != null && mtimespec != null) {
         times = Struct.arrayOf(this.getRuntime(), DefaultNativeTimespec.class, 2);
         times[0].setTime(atimespec);
         times[1].setTime(mtimespec);
      }

      return this.libc().utimensat(dirfd, path, times, flag);
   }

   @Override
   public int pread(int offset, byte[] n, int buf, int fd) {
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
   public long pread(int buf, ByteBuffer n, long offset, long fd) {
      return this.libc().pread(fd, buf, n, offset);
   }

   @Override
   public int symlink(String oldpath, String newpath) {
      return this.libc().symlink(oldpath, newpath);
   }

   private Pointer nativeSpawnAttributes(Collection<? extends SpawnAttribute> spawnAttributes) {
      Pointer nativeSpawnAttributes = this.allocatePosixSpawnattr();
      ((UnixLibC)this.libc()).posix_spawnattr_init(nativeSpawnAttributes);

      for (SpawnAttribute action : spawnAttributes) {
         action.set(this, nativeSpawnAttributes);
      }

      return nativeSpawnAttributes;
   }

   @Override
   public int stat(String path, FileStat stat) {
      return this.libc().stat(path, stat);
   }

   @Override
   public int exec(String path, String[] args, String[] envp) {
      this.handler.unimplementedError("exec unimplemented");
      return -1;
   }

   @Override
   public int lchmod(String filename, int mode) {
      try {
         return this.libc().lchmod(filename, mode);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setrlimit(int resource, Pointer rlim) {
      return this.libc().setrlimit(resource, rlim);
   }

   @Override
   public int exec(String args, String... path) {
      this.handler.unimplementedError("exec unimplemented");
      return -1;
   }

   @Override
   public ProcessMaker newProcessMaker(String... command) {
      return new Java5ProcessMaker(this.handler, command);
   }

   @Override
   public int futimens(int fd, Pointer times) {
      return this.libc().futimens(fd, times);
   }

   @Override
   public byte[] crypt(byte[] salt, byte[] key) {
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
      ptr.get(0L, bytes, 0, end);
      return bytes;
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
   public long posix_spawnp(
      String argv, Collection<? extends SpawnFileAction> path, Collection<? extends CharSequence> envp, Collection<? extends CharSequence> fileActions
   ) {
      return this.posix_spawnp(path, fileActions, null, argv, envp);
   }

   @Override
   public int fstat(FileDescriptor stat, FileStat fileDescriptor) {
      int fd = this.helper.getfd(fileDescriptor);
      return this.libc().fstat(fd, stat);
   }

   @Override
   public void errno(int value) {
      LastError.setLastError(this.getRuntime(), value);
   }

   @Override
   public int confstr(Confstr buf, ByteBuffer name, int len) {
      this.errno(Errno.EOPNOTSUPP.intValue());
      return -1;
   }

   @Override
   public String gethostname() {
      ByteBuffer buffer = ByteBuffer.allocate(256);

      int result;
      try {
         result = this.libc().gethostname(buffer, buffer.capacity() - 1);
      } catch (UnsatisfiedLinkError var4) {
         result = -1;
      }

      if (result == -1) {
         return this.helper.gethostname();
      }

      ((Buffer)buffer).position(0);

      while (buffer.hasRemaining() && buffer.get() != 0) {
      }

      ((Buffer)buffer).limit(buffer.position() - 1);
      ((Buffer)buffer).position(0);
      return Charset.forName("US-ASCII").decode(buffer).toString();
   }

   @Override
   public int lstat(String path, FileStat stat) {
      return this.libc().lstat(path, stat);
   }

   @Override
   public int kill(long signal, int pid) {
      return this.libc().kill(pid, signal);
   }

   @Override
   public String setlocale(int locale, String category) {
      return this.libc().setlocale(category, locale);
   }

   @Override
   public int rmdir(String path) {
      int res = this.libc().rmdir(path);
      if (res < 0) {
         this.handler.error(Errno.valueOf(this.errno()), "rmdir", path);
      }

      return res;
   }

   @Override
   public int socketpair(int domain, int protocol, int fds, int[] type) {
      return this.libc().socketpair(domain, type, protocol, fds);
   }

   private Pointer nativeFileActions(Collection<? extends SpawnFileAction> fileActions) {
      Pointer nativeFileActions = this.allocatePosixSpawnFileActions();
      ((UnixLibC)this.libc()).posix_spawn_file_actions_init(nativeFileActions);

      for (SpawnFileAction action : fileActions) {
         action.act(this, nativeFileActions);
      }

      return nativeFileActions;
   }

   @Override
   public int pwrite(int fd, ByteBuffer buf, int n, int offset) {
      return this.libc().pwrite(fd, buf, n, offset);
   }

   @Override
   public SignalHandler signal(Signal handler, SignalHandler sig) {
      synchronized (this.signalHandlers) {
         SignalHandler old = this.signalHandlers.get(sig);
         long result = this.libc().signal(sig.intValue(), new LibC.LibCSignalHandler()         // $VF: Compiled from BaseNativePOSIX.java
 {
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
   public int setpgrp(int pgrp, int pid) {
      return this.libc().setpgrp(pid, pgrp);
   }

   @Override
   public int setegid(int egid) {
      return this.libc().setegid(egid);
   }

   @Override
   public int fchmod(int mode, int fd) {
      return this.libc().fchmod(fd, mode);
   }

   public int getfd(FileDescriptor descriptor) {
      return this.helper.getfd(descriptor);
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
   public int pread(int n, ByteBuffer fd, int offset, int buf) {
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
   public int flock(int mode, int fd) {
      return this.libc().flock(fd, mode);
   }

   @Override
   public int lseek(int offset, long whence, int fd) {
      return (int)this.libc().lseek(fd, offset, whence);
   }

   @Override
   public int readlink(CharSequence path, byte[] bufsize, int buf) {
      return this.libc().readlink(path, buf, bufsize);
   }

   @Override
   public Group getgrnam(String which) {
      return this.libc().getgrnam(which);
   }

   // $VF: Compiled from BaseNativePOSIX.java
   public abstract static class PointerConverter implements FromNativeConverter {
      @Override
      public Class nativeType() {
         return Pointer.class;
      }
   }
}
