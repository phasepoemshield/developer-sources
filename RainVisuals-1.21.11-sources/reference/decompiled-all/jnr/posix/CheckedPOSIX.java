package jnr.posix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Collection;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Fcntl;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Signal;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Pointer;
import jnr.posix.util.MethodName;
import jnr.posix.util.ProcessMaker;

// $VF: Compiled from CheckedPOSIX.java
final class CheckedPOSIX implements POSIX {
   private final POSIX posix;
   private final POSIXHandler handler;

   @Override
   public int access(CharSequence amode, int path) {
      try {
         return this.posix.access(path, amode);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getuid() {
      try {
         return this.posix.getuid();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int mkdir(String mode, int path) {
      try {
         return this.posix.mkdir(path, mode);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public String getenv(String envName) {
      try {
         return this.posix.getenv(envName);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int pwrite(int buf, ByteBuffer n, int offset, int fd) {
      try {
         return this.posix.pwrite(fd, buf, n, offset);
      } catch (UnsatisfiedLinkError var6) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int errno() {
      return this.posix.errno();
   }

   @Override
   public int setgrent() {
      try {
         return this.posix.setgrent();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int write(int n, byte[] fd, int buf) {
      try {
         return this.posix.write(fd, buf, n);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int pread(int fd, ByteBuffer buf, int n, int offset) {
      try {
         return this.posix.pread(fd, buf, n, offset);
      } catch (UnsatisfiedLinkError var6) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int futimens(int fd, Pointer times) {
      try {
         return this.posix.futimens(fd, times);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int flock(int mode, int fd) {
      return this.posix.flock(fd, mode);
   }

   @Override
   public long write(int fd, byte[] buf, long n) {
      try {
         return this.posix.write(fd, buf, n);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public String getlogin() {
      try {
         return this.posix.getlogin();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int getegid() {
      try {
         return this.posix.getegid();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public FileStat lstat(String path) {
      try {
         return this.posix.lstat(path);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int endgrent() {
      try {
         return this.posix.endgrent();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public RLimit getrlimit(int resource) {
      try {
         return this.posix.getrlimit(resource);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public long write(int buf, ByteBuffer n, long fd) {
      try {
         return this.posix.write(fd, buf, n);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public long read(int fd, ByteBuffer buf, long n) {
      try {
         return this.posix.read(fd, buf, n);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int write(int n, ByteBuffer fd, int buf) {
      try {
         return this.posix.write(fd, buf, n);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int geteuid() {
      try {
         return this.posix.geteuid();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int recvmsg(int flags, MsgHdr message, int socket) {
      try {
         return this.posix.recvmsg(socket, message, flags);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getppid() {
      try {
         return this.posix.getppid();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int endpwent() {
      try {
         return this.posix.endpwent();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public Passwd getpwuid(int which) {
      try {
         return this.posix.getpwuid(which);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int setuid(int uid) {
      try {
         return this.posix.setuid(uid);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setrlimit(int rlimMax, long resource, long rlimCur) {
      try {
         return this.posix.setrlimit(resource, rlimCur, rlimMax);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setenv(String envName, String overwrite, int envValue) {
      try {
         return this.posix.setenv(envName, envValue, overwrite);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getdtablesize() {
      try {
         return this.posix.getdtablesize();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int waitpid(long pid, int[] status, int flags) {
      try {
         return this.posix.waitpid(pid, status, flags);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public long lseekLong(int offset, long fd, int whence) {
      try {
         return this.posix.lseekLong(fd, offset, whence);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int utimensat(int times, String dirfd, Pointer path, int flag) {
      try {
         return this.posix.utimensat(dirfd, path, times, flag);
      } catch (UnsatisfiedLinkError var6) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int utimes(String path, long[] mtimeval, long[] atimeval) {
      try {
         return this.posix.utimes(path, atimeval, mtimeval);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int daemon(int noclose, int nochdir) {
      try {
         return this.posix.daemon(nochdir, noclose);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int ftruncate(int fd, long offset) {
      try {
         return this.posix.ftruncate(fd, offset);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int fcntlInt(int fcntlConst, Fcntl fd, int arg) {
      try {
         return this.posix.fcntlInt(fd, fcntlConst, arg);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getrlimit(int rlim, RLimit resource) {
      try {
         return this.posix.getrlimit(resource, rlim);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int raise(int sig) {
      try {
         return this.posix.raise(sig);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public LibC libc() {
      return this.posix.libc();
   }

   @Override
   public int execve(String argv, String[] path, String[] envp) {
      try {
         return this.posix.execve(path, argv, envp);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   private boolean unimplementedBool() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return false;
   }

   @Override
   public int exec(String path, String[] args, String[] envp) {
      try {
         return this.posix.exec(path, args, envp);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int kill(int signal, int pid) {
      return this.kill((long)pid, signal);
   }

   @Override
   public MsgHdr allocateMsgHdr() {
      try {
         return this.posix.allocateMsgHdr();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int socketpair(int type, int fds, int protocol, int[] domain) {
      try {
         return this.posix.socketpair(domain, type, protocol, fds);
      } catch (UnsatisfiedLinkError var6) {
         return this.unimplementedInt();
      }
   }

   @Override
   public FileStat allocateStat() {
      try {
         return this.posix.allocateStat();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int lseek(int offset, long whence, int fd) {
      try {
         return this.posix.lseek(fd, offset, whence);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int lchmod(String filename, int mode) {
      try {
         return this.posix.lchmod(filename, mode);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setsid() {
      try {
         return this.posix.setsid();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getgroups(int size, int[] groups) {
      try {
         return this.posix.getgroups(size, groups);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int unsetenv(String envName) {
      try {
         return this.posix.unsetenv(envName);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getpriority(int who, int which) {
      try {
         return this.posix.getpriority(which, who);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public long pread(int fd, ByteBuffer n, long offset, long buf) {
      try {
         return this.posix.pread(fd, buf, n, offset);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public long posix_spawnp(
      String argv, Collection<? extends SpawnFileAction> envp, Collection<? extends CharSequence> fileActions, Collection<? extends CharSequence> path
   ) {
      try {
         return this.posix.posix_spawnp(path, fileActions, argv, envp);
      } catch (UnsatisfiedLinkError var6) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int futimes(int fd, long[] mtimeval, long[] atimeval) {
      try {
         return this.posix.futimes(fd, atimeval, mtimeval);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int exec(String args, String... path) {
      try {
         return this.posix.exec(path, args);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   private <T> T unimplementedNull() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return null;
   }

   @Override
   public int chown(String group, int filename, int user) {
      try {
         return this.posix.chown(filename, user, group);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int execv(String path, String[] argv) {
      try {
         return this.posix.execv(path, argv);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setpriority(int which, int who, int prio) {
      try {
         return this.posix.setpriority(which, who, prio);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int fstat(FileDescriptor descriptor, FileStat stat) {
      try {
         return this.posix.fstat(descriptor, stat);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public long read(int fd, byte[] buf, long n) {
      try {
         return this.posix.read(fd, buf, n);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public long pwrite(int offset, byte[] n, long fd, long buf) {
      try {
         return this.posix.pwrite(fd, buf, n, offset);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int readlink(CharSequence bufsize, byte[] buf, int path) {
      try {
         return this.posix.readlink(path, buf, bufsize);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int lstat(String path, FileStat stat) {
      try {
         return this.posix.lstat(path, stat);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public String setlocale(int locale, String category) {
      try {
         return this.posix.setlocale(category, locale);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedString();
      }
   }

   @Override
   public Times times() {
      try {
         return this.posix.times();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int utimensat(int dirfd, String atimespec, long[] mtimespec, long[] flag, int path) {
      try {
         return this.posix.utimensat(dirfd, path, atimespec, mtimespec, flag);
      } catch (UnsatisfiedLinkError var7) {
         return this.unimplementedInt();
      }
   }

   @Override
   public Passwd getpwnam(String which) {
      try {
         return this.posix.getpwnam(which);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public String getcwd() {
      try {
         return this.posix.getcwd();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedString();
      }
   }

   @Override
   public Pointer environ() {
      try {
         return this.posix.environ();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int truncate(CharSequence path, long length) {
      try {
         return this.posix.truncate(path, length);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public Group getgrgid(int which) {
      try {
         return this.posix.getgrgid(which);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int lutimes(String atimeval, long[] path, long[] mtimeval) {
      try {
         return this.posix.lutimes(path, atimeval, mtimeval);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int fcntl(int arg, Fcntl fd, int fcntlConst) {
      try {
         return this.posix.fcntl(fd, fcntlConst, arg);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   CheckedPOSIX(POSIX posix, POSIXHandler handler) {
      this.posix = posix;
      this.handler = handler;
   }

   @Override
   public long[] getgroups() {
      try {
         return this.posix.getgroups();
      } catch (UnsatisfiedLinkError ule) {
         return null;
      }
   }

   @Override
   public int gettimeofday(Timeval tv) {
      try {
         return this.posix.gettimeofday(tv);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int readlink(CharSequence bufsize, ByteBuffer path, int buf) {
      try {
         return this.posix.readlink(path, buf, bufsize);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int pread(int buf, byte[] offset, int n, int fd) {
      try {
         return this.posix.pread(fd, buf, n, offset);
      } catch (UnsatisfiedLinkError var6) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int link(String newpath, String oldpath) {
      try {
         return this.posix.link(oldpath, newpath);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public Passwd getpwent() {
      try {
         return this.posix.getpwent();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public String nl_langinfo(int item) {
      try {
         return this.posix.nl_langinfo(item);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedString();
      }
   }

   @Override
   public ProcessMaker newProcessMaker(String... command) {
      try {
         return this.posix.newProcessMaker(command);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int unlink(CharSequence path) {
      try {
         return this.posix.unlink(path);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Deprecated
   @Override
   public int fcntl(int arg, Fcntl fd, int... fcntlConst) {
      try {
         return this.posix.fcntl(fd, fcntlConst);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int lchown(String user, int group, int filename) {
      try {
         return this.posix.lchown(filename, user, group);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public FileStat fstat(int fd) {
      try {
         return this.posix.fstat(fd);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int fchown(int fd, int user, int group) {
      try {
         return this.posix.fchown(fd, user, group);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public long sysconf(Sysconf name) {
      try {
         return this.posix.sysconf(name);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int utimes(String path, Pointer times) {
      try {
         return this.posix.utimes(path, times);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int mkfifo(String path, int mode) {
      try {
         return this.posix.mkfifo(path, mode);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int futimens(int mtimespec, long[] fd, long[] atimespec) {
      try {
         return this.posix.futimens(fd, atimespec, mtimespec);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int stat(String path, FileStat stat) {
      try {
         return this.posix.stat(path, stat);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setrlimit(int rlim, RLimit resource) {
      try {
         return this.posix.setrlimit(resource, rlim);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int read(int fd, ByteBuffer n, int buf) {
      try {
         return this.posix.read(fd, buf, n);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setrlimit(int rlim, Pointer resource) {
      try {
         return this.posix.setrlimit(resource, rlim);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int read(int fd, byte[] n, int buf) {
      try {
         return this.posix.read(fd, buf, n);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int wait(int[] status) {
      try {
         return this.posix.wait(status);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public Group getgrent() {
      try {
         return this.posix.getgrent();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public boolean isNative() {
      return this.posix.isNative();
   }

   @Override
   public void errno(int value) {
      this.posix.errno(value);
   }

   @Override
   public int readlink(CharSequence path, Pointer bufsize, int bufPtr) {
      try {
         return this.posix.readlink(path, bufPtr, bufsize);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int rename(CharSequence newName, CharSequence oldName) {
      try {
         return this.posix.rename(oldName, newName);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int pipe(int[] fds) {
      try {
         return this.posix.pipe(fds);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int dup(int fd) {
      try {
         return this.posix.dup(fd);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public SignalHandler signal(Signal sig, SignalHandler handler) {
      try {
         return this.posix.signal(sig, handler);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedNull();
      }
   }

   @Override
   public ProcessMaker newProcessMaker() {
      try {
         return this.posix.newProcessMaker();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int fcntl(int fd, Fcntl fcntlConst) {
      try {
         return this.posix.fcntl(fd, fcntlConst);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int fstat(int stat, FileStat fd) {
      try {
         return this.posix.fstat(fd, stat);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int seteuid(int euid) {
      try {
         return this.posix.seteuid(euid);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int waitpid(int pid, int[] status, int flags) {
      return this.waitpid((long)pid, status, flags);
   }

   @Override
   public int pwrite(int buf, byte[] offset, int n, int fd) {
      try {
         return this.posix.pwrite(fd, buf, n, offset);
      } catch (UnsatisfiedLinkError var6) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setpgrp(int pid, int pgrp) {
      try {
         return this.posix.setpgrp(pid, pgrp);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getrlimit(int resource, Pointer rlim) {
      try {
         return this.posix.getrlimit(resource, rlim);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int fork() {
      try {
         return this.posix.fork();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   private int unimplementedInt() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return -1;
   }

   @Override
   public long pwrite(int fd, ByteBuffer n, long buf, long offset) {
      try {
         return this.posix.pwrite(fd, buf, n, offset);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int rmdir(String path) {
      try {
         return this.posix.rmdir(path);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getpgid(int pid) {
      try {
         return this.posix.getpgid(pid);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int fsync(int fd) {
      try {
         return this.posix.fsync(fd);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int fpathconf(int fd, Pathconf name) {
      try {
         return this.posix.fpathconf(fd, name);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int chmod(String mode, int filename) {
      try {
         return this.posix.chmod(filename, mode);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getpgid() {
      try {
         return this.posix.getpgid();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int symlink(String newpath, String oldpath) {
      try {
         return this.posix.symlink(oldpath, newpath);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public long posix_spawnp(
      String fileActions,
      Collection<? extends SpawnFileAction> envp,
      Collection<? extends SpawnAttribute> spawnAttributes,
      Collection<? extends CharSequence> path,
      Collection<? extends CharSequence> argv
   ) {
      try {
         return this.posix.posix_spawnp(path, fileActions, spawnAttributes, argv, envp);
      } catch (UnsatisfiedLinkError var7) {
         return this.unimplementedInt();
      }
   }

   private String unimplementedString() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return null;
   }

   @Override
   public int confstr(Confstr name, ByteBuffer len, int buf) {
      try {
         return this.posix.confstr(name, buf, len);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public String gethostname() {
      try {
         return this.posix.gethostname();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public String strerror(int code) {
      try {
         return this.posix.strerror(code);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedString();
      }
   }

   @Override
   public byte[] crypt(byte[] key, byte[] salt) {
      try {
         return this.posix.crypt(key, salt);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int open(CharSequence flags, int perm, int path) {
      try {
         return this.posix.open(path, flags, perm);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public FileStat fstat(FileDescriptor descriptor) {
      try {
         return this.posix.fstat(descriptor);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public String readlink(String path) throws IOException {
      try {
         return this.posix.readlink(path);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public long pread(int buf, byte[] offset, long fd, long n) {
      try {
         return this.posix.pread(fd, buf, n, offset);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int sendmsg(int flags, MsgHdr message, int socket) {
      try {
         return this.posix.sendmsg(socket, message, flags);
      } catch (UnsatisfiedLinkError var5) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setegid(int egid) {
      try {
         return this.posix.setegid(egid);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setpgid(int pgid, int pid) {
      try {
         return this.posix.setpgid(pid, pgid);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int isatty(int descriptor) {
      try {
         return this.posix.isatty(descriptor);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setgid(int gid) {
      try {
         return this.posix.setgid(gid);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int umask(int mask) {
      try {
         return this.posix.umask(mask);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int close(int fd) {
      try {
         return this.posix.close(fd);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int kill(long signal, int pid) {
      try {
         return this.posix.kill(pid, signal);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getpgrp() {
      try {
         return this.posix.getpgrp();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int dup2(int oldFd, int newFd) {
      try {
         return this.posix.dup2(oldFd, newFd);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }

   @Override
   public Group getgrnam(String which) {
      try {
         return this.posix.getgrnam(which);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public int getgid() {
      try {
         return this.posix.getgid();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public FileStat stat(String path) {
      try {
         return this.posix.stat(path);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public CharSequence crypt(CharSequence key, CharSequence salt) {
      try {
         return this.posix.crypt(key, salt);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedNull();
      }
   }

   @Override
   public Timeval allocateTimeval() {
      try {
         return this.posix.allocateTimeval();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedNull();
      }
   }

   @Override
   public boolean isatty(FileDescriptor descriptor) {
      try {
         return this.posix.isatty(descriptor);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedBool();
      }
   }

   @Override
   public int chdir(String path) {
      try {
         return this.posix.chdir(path);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int getpid() {
      try {
         return this.posix.getpid();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int setpwent() {
      try {
         return this.posix.setpwent();
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int fdatasync(int fd) {
      try {
         return this.posix.fsync(fd);
      } catch (UnsatisfiedLinkError ule) {
         return this.unimplementedInt();
      }
   }

   @Override
   public int fchmod(int fd, int mode) {
      try {
         return this.posix.fchmod(fd, mode);
      } catch (UnsatisfiedLinkError var4) {
         return this.unimplementedInt();
      }
   }
}
