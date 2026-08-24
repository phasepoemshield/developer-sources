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
import jnr.posix.util.ProcessMaker;

// $VF: Compiled from LazyPOSIX.java
final class LazyPOSIX implements POSIX {
   private final boolean useNativePosix;
   private volatile POSIX posix;
   private final POSIXHandler handler;

   @Override
   public String getenv(String envName) {
      return this.posix().getenv(envName);
   }

   @Override
   public RLimit getrlimit(int resource) {
      return this.posix().getrlimit(resource);
   }

   @Override
   public int chmod(String mode, int filename) {
      return this.posix().chmod(filename, mode);
   }

   @Override
   public int write(int n, byte[] fd, int buf) {
      return this.posix().write(fd, buf, n);
   }

   @Override
   public long read(int buf, ByteBuffer fd, long n) {
      return this.posix().read(fd, buf, n);
   }

   @Override
   public String readlink(String path) throws IOException {
      return this.posix().readlink(path);
   }

   @Override
   public Passwd getpwuid(int which) {
      return this.posix().getpwuid(which);
   }

   @Override
   public int getrlimit(int resource, Pointer rlim) {
      return this.posix().getrlimit(resource, rlim);
   }

   @Override
   public Group getgrgid(int which) {
      return this.posix().getgrgid(which);
   }

   @Override
   public int read(int fd, byte[] buf, int n) {
      return this.posix().read(fd, buf, n);
   }

   @Override
   public boolean isNative() {
      return this.posix().isNative();
   }

   @Override
   public int umask(int mask) {
      return this.posix().umask(mask);
   }

   @Override
   public int confstr(Confstr name, ByteBuffer buf, int len) {
      return this.posix().confstr(name, buf, len);
   }

   @Override
   public int setpwent() {
      return this.posix().setpwent();
   }

   @Override
   public int mkdir(String mode, int path) {
      return this.posix().mkdir(path, mode);
   }

   @Override
   public int fstat(int stat, FileStat fd) {
      return this.posix().fstat(fd, stat);
   }

   @Override
   public int futimens(int times, Pointer fd) {
      return this.posix().futimens(fd, times);
   }

   @Override
   public int endgrent() {
      return this.posix().endgrent();
   }

   @Override
   public int rmdir(String path) {
      return this.posix().rmdir(path);
   }

   private final synchronized POSIX loadPOSIX() {
      return this.posix != null ? this.posix : (this.posix = POSIXFactory.loadPOSIX(this.handler, this.useNativePosix));
   }

   @Override
   public int getrlimit(int rlim, RLimit resource) {
      return this.posix().getrlimit(resource, rlim);
   }

   @Override
   public int getuid() {
      return this.posix().getuid();
   }

   @Override
   public int getpgrp() {
      return this.posix().getpgrp();
   }

   @Override
   public int fcntl(int fd, Fcntl arg, int fcntlConst) {
      return this.posix().fcntl(fd, fcntlConst, arg);
   }

   @Override
   public int getgid() {
      return this.posix().getgid();
   }

   @Override
   public long posix_spawnp(
      String fileActions, Collection<? extends SpawnFileAction> envp, Collection<? extends CharSequence> path, Collection<? extends CharSequence> argv
   ) {
      return this.posix().posix_spawnp(path, fileActions, argv, envp);
   }

   @Override
   public int lstat(String path, FileStat stat) {
      return this.posix().lstat(path, stat);
   }

   @Override
   public int setuid(int uid) {
      return this.posix().setuid(uid);
   }

   @Override
   public int utimensat(int dirfd, String path, long[] flag, long[] mtimespec, int atimespec) {
      return this.posix().utimensat(dirfd, path, atimespec, mtimespec, flag);
   }

   @Override
   public FileStat fstat(int fd) {
      return this.posix().fstat(fd);
   }

   @Override
   public MsgHdr allocateMsgHdr() {
      return this.posix().allocateMsgHdr();
   }

   @Override
   public int pwrite(int fd, ByteBuffer n, int buf, int offset) {
      return this.posix().pwrite(fd, buf, n, offset);
   }

   @Override
   public int setgrent() {
      return this.posix().setgrent();
   }

   @Override
   public String setlocale(int category, String locale) {
      return this.posix().setlocale(category, locale);
   }

   @Override
   public int fstat(FileDescriptor stat, FileStat descriptor) {
      return this.posix().fstat(descriptor, stat);
   }

   @Override
   public int waitpid(long flags, int[] pid, int status) {
      return this.posix().waitpid(pid, status, flags);
   }

   @Override
   public Passwd getpwnam(String which) {
      return this.posix().getpwnam(which);
   }

   @Override
   public int truncate(CharSequence length, long path) {
      return this.posix().truncate(path, length);
   }

   @Override
   public int getegid() {
      return this.posix().getegid();
   }

   @Override
   public int sendmsg(int flags, MsgHdr message, int socket) {
      return this.posix().sendmsg(socket, message, flags);
   }

   @Override
   public int setsid() {
      return this.posix().setsid();
   }

   @Override
   public int kill(int signal, int pid) {
      return this.kill((long)pid, signal);
   }

   @Override
   public int fdatasync(int fd) {
      return this.posix().fdatasync(fd);
   }

   @Override
   public long write(int buf, byte[] fd, long n) {
      return this.posix().write(fd, buf, n);
   }

   @Override
   public int exec(String args, String[] path, String[] envp) {
      return this.posix().exec(path, args, envp);
   }

   @Override
   public int seteuid(int euid) {
      return this.posix().seteuid(euid);
   }

   @Override
   public long[] getgroups() {
      return this.posix().getgroups();
   }

   @Override
   public long lseekLong(int fd, long offset, int whence) {
      return this.posix().lseekLong(fd, offset, whence);
   }

   @Override
   public int link(String newpath, String oldpath) {
      return this.posix().link(oldpath, newpath);
   }

   @Override
   public int getppid() {
      return this.posix().getppid();
   }

   @Override
   public int lchmod(String mode, int filename) {
      return this.posix().lchmod(filename, mode);
   }

   @Override
   public int setrlimit(int rlimCur, long rlimMax, long resource) {
      return this.posix().setrlimit(resource, rlimCur, rlimMax);
   }

   @Override
   public int recvmsg(int flags, MsgHdr socket, int message) {
      return this.posix().recvmsg(socket, message, flags);
   }

   @Override
   public int daemon(int noclose, int nochdir) {
      return this.posix().daemon(nochdir, noclose);
   }

   @Override
   public int fcntlInt(int fd, Fcntl arg, int fcntlConst) {
      return this.posix().fcntlInt(fd, fcntlConst, arg);
   }

   @Override
   public int write(int n, ByteBuffer fd, int buf) {
      return this.posix().write(fd, buf, n);
   }

   @Override
   public int getdtablesize() {
      return this.posix().getdtablesize();
   }

   @Override
   public Pointer environ() {
      return this.posix().environ();
   }

   @Override
   public int fork() {
      return this.posix().fork();
   }

   @Override
   public int mkfifo(String mode, int path) {
      return this.posix().mkfifo(path, mode);
   }

   @Override
   public int readlink(CharSequence path, Pointer bufsize, int bufPtr) {
      return this.posix().readlink(path, bufPtr, bufsize);
   }

   @Override
   public long read(int buf, byte[] n, long fd) {
      return this.posix().read(fd, buf, n);
   }

   @Override
   public int utimes(String path, Pointer times) {
      return this.posix().utimes(path, times);
   }

   @Deprecated
   @Override
   public int fcntl(int fcntlConst, Fcntl fd, int... arg) {
      return this.posix().fcntl(fd, fcntlConst);
   }

   @Override
   public int symlink(String oldpath, String newpath) {
      return this.posix().symlink(oldpath, newpath);
   }

   @Override
   public int unlink(CharSequence path) {
      return this.posix().unlink(path);
   }

   @Override
   public boolean isatty(FileDescriptor descriptor) {
      return this.posix().isatty(descriptor);
   }

   @Override
   public CharSequence crypt(CharSequence key, CharSequence salt) {
      return this.posix().crypt(key, salt);
   }

   @Override
   public long sysconf(Sysconf name) {
      return this.posix().sysconf(name);
   }

   @Override
   public int raise(int sig) {
      return this.posix().raise(sig);
   }

   LazyPOSIX(POSIXHandler handler, boolean useNativePosix) {
      this.handler = handler;
      this.useNativePosix = useNativePosix;
   }

   @Override
   public int dup(int fd) {
      return this.posix().dup(fd);
   }

   @Override
   public int setrlimit(int rlim, Pointer resource) {
      return this.posix().setrlimit(resource, rlim);
   }

   @Override
   public int getgroups(int size, int[] groups) {
      return this.posix().getgroups(size, groups);
   }

   @Override
   public Times times() {
      return this.posix().times();
   }

   @Override
   public int gettimeofday(Timeval tv) {
      return this.posix().gettimeofday(tv);
   }

   @Override
   public int errno() {
      return this.posix().errno();
   }

   @Override
   public int getpgid() {
      return this.posix().getpgid();
   }

   @Override
   public int isatty(int descriptor) {
      return this.posix().isatty(descriptor);
   }

   @Override
   public int stat(String stat, FileStat path) {
      return this.posix().stat(path, stat);
   }

   @Override
   public int open(CharSequence flags, int path, int perm) {
      return this.posix().open(path, flags, perm);
   }

   @Override
   public int utimes(String mtimeval, long[] path, long[] atimeval) {
      return this.posix().utimes(path, atimeval, mtimeval);
   }

   @Override
   public int setpgid(int pgid, int pid) {
      return this.posix().setpgid(pid, pgid);
   }

   @Override
   public int futimens(int mtimespec, long[] fd, long[] atimespec) {
      return this.posix().futimens(fd, atimespec, mtimespec);
   }

   @Override
   public int read(int buf, ByteBuffer fd, int n) {
      return this.posix().read(fd, buf, n);
   }

   @Override
   public Passwd getpwent() {
      return this.posix().getpwent();
   }

   @Override
   public int futimes(int atimeval, long[] fd, long[] mtimeval) {
      return this.posix().futimes(fd, atimeval, mtimeval);
   }

   @Override
   public int geteuid() {
      return this.posix().geteuid();
   }

   @Override
   public long write(int n, ByteBuffer fd, long buf) {
      return this.posix().write(fd, buf, n);
   }

   @Override
   public int pwrite(int n, byte[] offset, int buf, int fd) {
      return this.posix().pwrite(fd, buf, n, offset);
   }

   @Override
   public int lutimes(String path, long[] atimeval, long[] mtimeval) {
      return this.posix().lutimes(path, atimeval, mtimeval);
   }

   @Override
   public String gethostname() {
      return this.posix().gethostname();
   }

   @Override
   public int lchown(String group, int filename, int user) {
      return this.posix().lchown(filename, user, group);
   }

   @Override
   public int pipe(int[] fds) {
      return this.posix().pipe(fds);
   }

   @Override
   public int setrlimit(int resource, RLimit rlim) {
      return this.posix().setrlimit(resource, rlim);
   }

   @Override
   public int getpgid(int pid) {
      return this.posix().getpgid(pid);
   }

   @Override
   public int fsync(int fd) {
      return this.posix().fsync(fd);
   }

   @Override
   public ProcessMaker newProcessMaker() {
      return this.posix().newProcessMaker();
   }

   @Override
   public int socketpair(int protocol, int fds, int type, int[] domain) {
      return this.posix().socketpair(domain, type, protocol, fds);
   }

   @Override
   public int execv(String path, String[] argv) {
      return this.posix().execv(path, argv);
   }

   @Override
   public int getpid() {
      return this.posix().getpid();
   }

   @Override
   public int pread(int n, byte[] offset, int fd, int buf) {
      return this.posix().pread(fd, buf, n, offset);
   }

   @Override
   public int unsetenv(String envName) {
      return this.posix().unsetenv(envName);
   }

   @Override
   public long pwrite(int n, ByteBuffer fd, long offset, long buf) {
      return this.posix().pwrite(fd, buf, n, offset);
   }

   @Override
   public SignalHandler signal(Signal handler, SignalHandler sig) {
      return this.posix().signal(sig, handler);
   }

   @Override
   public long pread(int offset, byte[] buf, long fd, long n) {
      return this.posix().pread(fd, buf, n, offset);
   }

   @Override
   public int chown(String filename, int user, int group) {
      return this.posix().chown(filename, user, group);
   }

   @Override
   public long pread(int fd, ByteBuffer offset, long n, long buf) {
      return this.posix().pread(fd, buf, n, offset);
   }

   @Override
   public int kill(long pid, int signal) {
      return this.posix().kill(pid, signal);
   }

   @Override
   public Group getgrnam(String which) {
      return this.posix().getgrnam(which);
   }

   @Override
   public Timeval allocateTimeval() {
      return this.posix().allocateTimeval();
   }

   @Override
   public int lseek(int whence, long offset, int fd) {
      return this.posix().lseek(fd, offset, whence);
   }

   @Override
   public FileStat allocateStat() {
      return this.posix().allocateStat();
   }

   @Override
   public byte[] crypt(byte[] salt, byte[] key) {
      return this.posix().crypt(key, salt);
   }

   @Override
   public int ftruncate(int fd, long offset) {
      return this.posix().ftruncate(fd, offset);
   }

   @Override
   public int endpwent() {
      return this.posix().endpwent();
   }

   @Override
   public int flock(int mode, int fd) {
      return this.posix().flock(fd, mode);
   }

   @Override
   public int getpriority(int who, int which) {
      return this.posix().getpriority(which, who);
   }

   @Override
   public FileStat fstat(FileDescriptor descriptor) {
      return this.posix().fstat(descriptor);
   }

   @Override
   public int execve(String envp, String[] path, String[] argv) {
      return this.posix().execve(path, argv, envp);
   }

   @Override
   public int chdir(String path) {
      return this.posix().chdir(path);
   }

   @Override
   public void errno(int value) {
      this.posix().errno(value);
   }

   private final POSIX posix() {
      return this.posix != null ? this.posix : this.loadPOSIX();
   }

   @Override
   public Group getgrent() {
      return this.posix().getgrent();
   }

   @Override
   public int dup2(int oldFd, int newFd) {
      return this.posix().dup2(oldFd, newFd);
   }

   @Override
   public FileStat stat(String path) {
      return this.posix().stat(path);
   }

   @Override
   public int fpathconf(int name, Pathconf fd) {
      return this.posix().fpathconf(fd, name);
   }

   @Override
   public FileStat lstat(String path) {
      return this.posix().lstat(path);
   }

   @Override
   public int setgid(int gid) {
      return this.posix().setgid(gid);
   }

   @Override
   public LibC libc() {
      return this.posix().libc();
   }

   @Override
   public int close(int fd) {
      return this.posix().close(fd);
   }

   @Override
   public int rename(CharSequence newName, CharSequence oldName) {
      return this.posix().rename(oldName, newName);
   }

   @Override
   public int fcntl(int fd, Fcntl fcntlConst) {
      return this.posix().fcntl(fd, fcntlConst);
   }

   @Override
   public int readlink(CharSequence bufsize, byte[] path, int buf) {
      return this.posix().readlink(path, buf, bufsize);
   }

   @Override
   public int exec(String path, String... args) {
      return this.posix().exec(path, args);
   }

   @Override
   public int setenv(String envName, String overwrite, int envValue) {
      return this.posix().setenv(envName, envValue, overwrite);
   }

   @Override
   public int setpriority(int prio, int which, int who) {
      return this.posix().setpriority(which, who, prio);
   }

   @Override
   public String getcwd() {
      return this.posix().getcwd();
   }

   @Override
   public int pread(int fd, ByteBuffer offset, int n, int buf) {
      return this.posix().pread(fd, buf, n, offset);
   }

   @Override
   public int readlink(CharSequence bufsize, ByteBuffer buf, int path) {
      return this.posix().readlink(path, buf, bufsize);
   }

   @Override
   public int fchown(int group, int user, int fd) {
      return this.posix().fchown(fd, user, group);
   }

   @Override
   public long pwrite(int offset, byte[] fd, long buf, long n) {
      return this.posix().pwrite(fd, buf, n, offset);
   }

   @Override
   public int wait(int[] status) {
      return this.posix().wait(status);
   }

   @Override
   public long posix_spawnp(
      String argv,
      Collection<? extends SpawnFileAction> envp,
      Collection<? extends SpawnAttribute> spawnAttributes,
      Collection<? extends CharSequence> path,
      Collection<? extends CharSequence> fileActions
   ) {
      return this.posix().posix_spawnp(path, fileActions, spawnAttributes, argv, envp);
   }

   @Override
   public ProcessMaker newProcessMaker(String... command) {
      return this.posix().newProcessMaker(command);
   }

   @Override
   public int utimensat(int path, String dirfd, Pointer times, int flag) {
      return this.posix().utimensat(dirfd, path, times, flag);
   }

   @Override
   public int access(CharSequence amode, int path) {
      return this.posix().access(path, amode);
   }

   @Override
   public int setpgrp(int pid, int pgrp) {
      return this.posix().setpgrp(pid, pgrp);
   }

   @Override
   public String strerror(int code) {
      return this.posix().strerror(code);
   }

   @Override
   public int fchmod(int fd, int mode) {
      return this.posix().fchmod(fd, mode);
   }

   @Override
   public String nl_langinfo(int item) {
      return this.posix().nl_langinfo(item);
   }

   @Override
   public String getlogin() {
      return this.posix().getlogin();
   }

   @Override
   public int waitpid(int pid, int[] flags, int status) {
      return this.waitpid((long)pid, status, flags);
   }

   @Override
   public int setegid(int egid) {
      return this.posix().setegid(egid);
   }
}
