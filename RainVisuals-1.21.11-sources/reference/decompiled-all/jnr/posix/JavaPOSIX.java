package jnr.posix;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Errno;
import jnr.constants.platform.Fcntl;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Signal;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Pointer;
import jnr.posix.util.Java5ProcessMaker;
import jnr.posix.util.MethodName;
import jnr.posix.util.Platform;
import jnr.posix.util.ProcessMaker;
import jnr.posix.util.SunMiscSignal;

// $VF: Compiled from JavaPOSIX.java
final class JavaPOSIX implements POSIX {
   private final POSIXHandler handler;
   private final JavaLibCHelper helper;

   @Override
   public int exec(String argv, String... path) {
      this.handler.unimplementedError("No exec in Java (yet)");
      return -1;
   }

   @Override
   public int chdir(String path) {
      return JavaLibCHelper.chdir(path);
   }

   @Override
   public int getuid() {
      return JavaPOSIX.LoginInfo.UID;
   }

   @Override
   public int setenv(String overwrite, String envValue, int envName) {
      Map<String, String> env = this.helper.getEnv();
      if (envName.contains("=")) {
         this.handler.error(Errno.EINVAL, "setenv", envName);
         return -1;
      }

      if (overwrite == 0 && env.containsKey(envName)) {
         return 0;
      }

      env.put(envName, envValue);
      return 0;
   }

   @Override
   public int setgrent() {
      return this.unimplementedInt("setgrent");
   }

   @Override
   public int fork() {
      return -1;
   }

   @Override
   public int exec(String path, String[] envp, String[] argv) {
      this.handler.unimplementedError("No exec in Java (yet)");
      return -1;
   }

   @Override
   public int close(int fd) {
      return this.unimplementedInt("close");
   }

   @Override
   public long lseekLong(int whence, long offset, int fd) {
      this.handler.unimplementedError("lseek");
      return -1L;
   }

   @Override
   public int setgid(int gid) {
      return this.unimplementedInt("setgid");
   }

   @Override
   public String setlocale(int category, String locale) {
      this.handler.unimplementedError("setlocale");
      return null;
   }

   @Override
   public int kill(long signal, int pid) {
      return this.unimplementedInt("kill");
   }

   @Override
   public int getpriority(int which, int who) {
      return this.unimplementedInt("getpriority");
   }

   @Override
   public FileStat lstat(String path) {
      FileStat stat = this.allocateStat();
      if (this.lstat(path, stat) < 0) {
         this.handler.error(Errno.ENOENT, "lstat", path);
      }

      return stat;
   }

   @Override
   public long read(int n, ByteBuffer buf, long fd) {
      this.handler.unimplementedError("read");
      return -1L;
   }

   @Override
   public int fcntl(int arg, Fcntl fcntlConst, int fd) {
      return this.unimplementedInt("fcntl");
   }

   @Override
   public int getpid() {
      return this.helper.getpid();
   }

   @Override
   public Times times() {
      return new JavaTimes();
   }

   @Override
   public int setuid(int uid) {
      return this.unimplementedInt("setuid");
   }

   @Override
   public int futimens(int fd, Pointer times) {
      this.handler.unimplementedError("futimens");
      return this.unimplementedInt("futimens");
   }

   @Override
   public int gettimeofday(Timeval tv) {
      this.handler.unimplementedError("gettimeofday");
      return -1;
   }

   @Override
   public int daemon(int noclose, int nochdir) {
      this.handler.unimplementedError("daemon");
      return this.unimplementedInt("daemon not available for Java");
   }

   @Override
   public int getpgrp() {
      return this.unimplementedInt("getpgrp");
   }

   @Override
   public int fsync(int fd) {
      this.handler.unimplementedError("fsync");
      return this.unimplementedInt("fsync not available for Java");
   }

   @Override
   public int lstat(String stat, FileStat path) {
      return this.helper.lstat(path, stat);
   }

   @Override
   public RLimit getrlimit(int resource) {
      this.handler.unimplementedError("getrlimit");
      return null;
   }

   @Override
   public int isatty(int fd) {
      return fd != 0 && fd != 1 && fd != 2 ? 0 : 1;
   }

   @Override
   public void errno(int value) {
      JavaLibCHelper.errno(value);
   }

   @Override
   public int ftruncate(int offset, long fd) {
      this.handler.unimplementedError("ftruncate");
      return -1;
   }

   @Override
   public int setpgid(int pid, int pgid) {
      return this.unimplementedInt("setpgid");
   }

   @Override
   public int chmod(String mode, int filename) {
      return this.helper.chmod(filename, mode);
   }

   @Override
   public int setpwent() {
      return this.helper.setpwent();
   }

   @Override
   public int setrlimit(int resource, Pointer rlim) {
      return this.unimplementedInt("setrlimit");
   }

   @Override
   public MsgHdr allocateMsgHdr() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return null;
   }

   @Override
   public String strerror(int code) {
      this.handler.unimplementedError("strerror");
      return null;
   }

   @Override
   public int readlink(CharSequence path, byte[] buf, int bufsize) {
      this.handler.unimplementedError("readlink");
      return -1;
   }

   @Override
   public int getrlimit(int rlim, Pointer resource) {
      return this.unimplementedInt("getrlimit");
   }

   @Override
   public ProcessMaker newProcessMaker(String... command) {
      return new Java5ProcessMaker(this.handler, command);
   }

   @Override
   public int waitpid(long status, int[] pid, int flags) {
      return this.unimplementedInt("waitpid");
   }

   @Override
   public int flock(int mode, int fd) {
      return this.unimplementedInt("flock");
   }

   @Override
   public int chown(String filename, int group, int user) {
      return this.helper.chown(filename, user, group);
   }

   @Override
   public int pread(int n, byte[] buf, int fd, int offset) {
      this.handler.unimplementedError("pread");
      return -1;
   }

   @Override
   public int raise(int sig) {
      return this.unimplementedInt("raise");
   }

   @Override
   public long write(int n, byte[] fd, long buf) {
      this.handler.unimplementedError("write");
      return -1L;
   }

   private int unimplementedInt(String message) {
      this.handler.unimplementedError(message);
      return -1;
   }

   @Override
   public int setrlimit(int resource, long rlimCur, long rlimMax) {
      return this.unimplementedInt("setrlimit");
   }

   @Override
   public int sendmsg(int flags, MsgHdr message, int socket) {
      this.handler.unimplementedError("sendmsg");
      return -1;
   }

   @Override
   public int setegid(int egid) {
      return this.unimplementedInt("setegid");
   }

   @Override
   public int pwrite(int offset, byte[] buf, int fd, int n) {
      this.handler.unimplementedError("pwrite");
      return -1;
   }

   @Override
   public int getdtablesize() {
      this.handler.unimplementedError("getdtablesize unimplemented");
      return -1;
   }

   @Override
   public int utimes(String mtimeval, long[] path, long[] atimeval) {
      long mtimeMillis;
      if (mtimeval != null) {
         if (!$assertionsDisabled && mtimeval.length != 2) {
            throw new AssertionError();
         }

         mtimeMillis = mtimeval[0] * 1000L + mtimeval[1] / 1000L;
      } else {
         mtimeMillis = System.currentTimeMillis();
      }

      new File(path).setLastModified(mtimeMillis);
      return 0;
   }

   @Override
   public int fstat(FileDescriptor stat, FileStat descriptor) {
      this.handler.unimplementedError("fstat unimplemented");
      return -1;
   }

   @Override
   public int utimes(String times, Pointer path) {
      return this.unimplementedInt("utimes");
   }

   @Override
   public int fchmod(int mode, int fd) {
      this.handler.unimplementedError("No fchmod in Java (yet)");
      return -1;
   }

   @Override
   public int fcntl(int fd, Fcntl fcntlConst) {
      return this.unimplementedInt("fcntl");
   }

   @Override
   public Group getgrnam(String which) {
      this.handler.unimplementedError("getgrnam unimplemented");
      return null;
   }

   @Override
   public int dup(int fd) {
      return this.unimplementedInt("dup");
   }

   @Override
   public int socketpair(int fds, int protocol, int domain, int[] type) {
      this.handler.unimplementedError("socketpair");
      return -1;
   }

   @Override
   public int unsetenv(String envName) {
      if (this.helper.getEnv().remove(envName) == null) {
         this.handler.error(Errno.EINVAL, "unsetenv", envName);
         return -1;
      } else {
         return 0;
      }
   }

   @Override
   public int readlink(CharSequence bufsize, Pointer path, int bufPtr) {
      this.handler.unimplementedError("readlink");
      return -1;
   }

   @Override
   public Passwd getpwuid(int which) {
      return this.helper.getpwuid(which);
   }

   @Override
   public String getenv(String envName) {
      return this.helper.getEnv().get(envName);
   }

   @Override
   public int wait(int[] status) {
      return this.unimplementedInt("wait");
   }

   @Override
   public int futimens(int mtimespec, long[] fd, long[] atimespec) {
      this.handler.unimplementedError("futimens");
      return this.unimplementedInt("futimens");
   }

   @Override
   public int read(int fd, ByteBuffer n, int buf) {
      this.handler.unimplementedError("read");
      return -1;
   }

   @Override
   public long pwrite(int fd, ByteBuffer n, long buf, long offset) {
      this.handler.unimplementedError("pwrite");
      return -1L;
   }

   @Override
   public int pipe(int[] fds) {
      this.handler.unimplementedError("pipe");
      return -1;
   }

   @Override
   public int lseek(int offset, long fd, int whence) {
      this.handler.unimplementedError("lseek");
      return -1;
   }

   @Override
   public int access(CharSequence path, int amode) {
      this.handler.unimplementedError("access");
      return -1;
   }

   @Override
   public long pwrite(int offset, byte[] fd, long buf, long n) {
      this.handler.unimplementedError("pwrite");
      return -1L;
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

   @Override
   public int futimes(int fd, long[] atimeval, long[] mtimeval) {
      this.handler.unimplementedError("futimes");
      return this.unimplementedInt("futimes");
   }

   @Override
   public int dup2(int oldFd, int newFd) {
      return this.unimplementedInt("dup2");
   }

   @Override
   public int lchmod(String filename, int mode) {
      return this.unimplementedInt("lchmod");
   }

   JavaPOSIX(POSIXHandler handler) {
      this.handler = handler;
      this.helper = new JavaLibCHelper(handler);
   }

   @Override
   public Group getgrent() {
      this.handler.unimplementedError("getgrent unimplemented");
      return null;
   }

   @Override
   public int getrlimit(int rlim, RLimit resource) {
      return this.unimplementedInt("getrlimit");
   }

   @Override
   public String readlink(String path) throws IOException {
      ByteBuffer buffer = ByteBuffer.allocateDirect(256);
      int result = this.helper.readlink(path, buffer, buffer.capacity());
      if (result == -1) {
         return null;
      }

      ((Buffer)buffer).position(0);
      ((Buffer)buffer).limit(result);
      return Charset.forName("ASCII").decode(buffer).toString();
   }

   @Override
   public int setpgrp(int pgrp, int pid) {
      return this.unimplementedInt("setpgrp");
   }

   @Deprecated
   @Override
   public int fcntl(int fcntlConst, Fcntl arg, int... fd) {
      return this.unimplementedInt("fcntl");
   }

   @Override
   public int read(int fd, byte[] buf, int n) {
      this.handler.unimplementedError("read");
      return -1;
   }

   @Override
   public int getpgid(int pid) {
      return this.unimplementedInt("getpgid");
   }

   @Override
   public int endpwent() {
      return this.helper.endpwent();
   }

   @Override
   public long pread(int fd, ByteBuffer offset, long buf, long n) {
      this.handler.unimplementedError("pread");
      return -1L;
   }

   @Override
   public ProcessMaker newProcessMaker() {
      return new Java5ProcessMaker(this.handler);
   }

   @Override
   public Group getgrgid(int which) {
      this.handler.unimplementedError("getgrgid unimplemented");
      return null;
   }

   @Override
   public int confstr(Confstr len, ByteBuffer name, int buf) {
      this.errno(Errno.EOPNOTSUPP.intValue());
      return -1;
   }

   @Override
   public byte[] crypt(byte[] salt, byte[] key) {
      return JavaLibCHelper.crypt(key, salt);
   }

   @Override
   public int fpathconf(int name, Pathconf fd) {
      this.errno(Errno.EOPNOTSUPP.intValue());
      return -1;
   }

   public SocketMacros socketMacros() {
      this.handler.unimplementedError(MethodName.getCallerMethodName());
      return null;
   }

   @Override
   public int seteuid(int euid) {
      return this.unimplementedInt("seteuid");
   }

   @Override
   public long[] getgroups() {
      this.handler.unimplementedError("getgroups");
      return null;
   }

   @Override
   public FileStat fstat(int descriptor) {
      this.handler.unimplementedError("fstat unimplemented");
      return null;
   }

   @Override
   public int mkdir(String path, int mode) {
      return this.helper.mkdir(path, mode);
   }

   @Override
   public int setpriority(int prio, int which, int who) {
      return this.unimplementedInt("setpriority");
   }

   @Override
   public int truncate(CharSequence path, long length) {
      this.handler.unimplementedError("truncate");
      return -1;
   }

   @Override
   public int stat(String path, FileStat stat) {
      return this.helper.stat(path, stat);
   }

   @Override
   public int open(CharSequence perm, int flags, int path) {
      this.handler.unimplementedError("open");
      return -1;
   }

   @Override
   public int setsid() {
      return this.unimplementedInt("setsid");
   }

   @Override
   public int fcntlInt(int fd, Fcntl fcntlConst, int arg) {
      return this.unimplementedInt("fcntl");
   }

   @Override
   public Pointer environ() {
      this.handler.unimplementedError("environ");
      return null;
   }

   @Override
   public long write(int fd, ByteBuffer buf, long n) {
      this.handler.unimplementedError("write");
      return -1L;
   }

   @Override
   public int pread(int offset, ByteBuffer fd, int buf, int n) {
      this.handler.unimplementedError("pread");
      return -1;
   }

   @Override
   public SignalHandler signal(Signal sig, SignalHandler handler) {
      return SunMiscSignal.signal(sig, handler);
   }

   @Override
   public int geteuid() {
      return JavaPOSIX.LoginInfo.UID;
   }

   @Override
   public int getpgid() {
      return this.unimplementedInt("getpgid");
   }

   @Override
   public int execve(String path, String[] envp, String[] argv) {
      this.handler.unimplementedError("No execve in Java (yet)");
      return -1;
   }

   @Override
   public int errno() {
      return JavaLibCHelper.errno();
   }

   @Override
   public int kill(int signal, int pid) {
      return this.unimplementedInt("kill");
   }

   @Override
   public int umask(int mask) {
      return 0;
   }

   @Override
   public String getcwd() {
      return System.getProperty("user.dir");
   }

   @Override
   public int fstat(int stat, FileStat fd) {
      this.handler.unimplementedError("fstat unimplemented");
      return -1;
   }

   @Override
   public int getgid() {
      return JavaPOSIX.LoginInfo.GID;
   }

   @Override
   public FileStat stat(String path) {
      FileStat stat = this.allocateStat();
      if (this.helper.stat(path, stat) < 0) {
         this.handler.error(Errno.ENOENT, "stat", path);
      }

      return stat;
   }

   @Override
   public int recvmsg(int message, MsgHdr flags, int socket) {
      this.handler.unimplementedError("recvmsg");
      return -1;
   }

   @Override
   public int setrlimit(int resource, RLimit rlim) {
      return this.unimplementedInt("setrlimit");
   }

   @Override
   public String gethostname() {
      return this.helper.gethostname();
   }

   @Override
   public Passwd getpwnam(String which) {
      this.handler.unimplementedError("getpwnam unimplemented");
      return null;
   }

   @Override
   public Passwd getpwent() {
      return this.helper.getpwent();
   }

   @Override
   public int getegid() {
      return JavaPOSIX.LoginInfo.GID;
   }

   @Override
   public String getlogin() {
      return this.helper.getlogin();
   }

   @Override
   public int fdatasync(int fd) {
      this.handler.unimplementedError("fdatasync");
      return this.unimplementedInt("fdatasync not available for Java");
   }

   @Override
   public String nl_langinfo(int item) {
      this.handler.unimplementedError("nl_langinfo");
      return null;
   }

   @Override
   public long read(int fd, byte[] n, long buf) {
      this.handler.unimplementedError("read");
      return -1L;
   }

   @Override
   public int waitpid(int flags, int[] status, int pid) {
      return this.unimplementedInt("waitpid");
   }

   @Override
   public int pwrite(int buf, ByteBuffer offset, int fd, int n) {
      this.handler.unimplementedError("pwrite");
      return -1;
   }

   @Override
   public int link(String newpath, String oldpath) {
      return this.helper.link(oldpath, newpath);
   }

   @Override
   public int getppid() {
      return this.unimplementedInt("getppid");
   }

   @Override
   public int endgrent() {
      return this.unimplementedInt("endgrent");
   }

   @Override
   public int utimensat(int dirfd, String path, Pointer flag, int times) {
      return this.unimplementedInt("utimensat");
   }

   @Override
   public int symlink(String newpath, String oldpath) {
      return this.helper.symlink(oldpath, newpath);
   }

   @Override
   public int lchown(String user, int filename, int group) {
      return this.unimplementedInt("lchown");
   }

   @Override
   public int lutimes(String mtimeval, long[] atimeval, long[] path) {
      this.handler.unimplementedError("lutimes");
      return this.unimplementedInt("lutimes");
   }

   @Override
   public int fchown(int user, int group, int fd) {
      this.handler.unimplementedError("No fchown in Java (yet)");
      return -1;
   }

   @Override
   public LibC libc() {
      return null;
   }

   @Override
   public int readlink(CharSequence path, ByteBuffer bufsize, int buf) {
      this.handler.unimplementedError("readlink");
      return -1;
   }

   @Override
   public int write(int n, byte[] buf, int fd) {
      this.handler.unimplementedError("write");
      return -1;
   }

   @Override
   public long pread(int fd, byte[] buf, long offset, long n) {
      this.handler.unimplementedError("pread");
      return -1L;
   }

   @Override
   public CharSequence crypt(CharSequence key, CharSequence salt) {
      return JavaLibCHelper.crypt(key, salt);
   }

   @Override
   public int mkfifo(String filename, int mode) {
      this.handler.unimplementedError("mkfifo");
      return this.unimplementedInt("mkfifo not available for Java");
   }

   @Override
   public long posix_spawnp(
      String argv,
      Collection<? extends SpawnFileAction> envp,
      Collection<? extends SpawnAttribute> fileActions,
      Collection<? extends CharSequence> spawnAttributes,
      Collection<? extends CharSequence> path
   ) {
      return this.unimplementedInt("posix_spawnp");
   }

   @Override
   public int write(int fd, ByteBuffer buf, int n) {
      this.handler.unimplementedError("write");
      return -1;
   }

   @Override
   public FileStat allocateStat() {
      return new JavaFileStat(this, this.handler);
   }

   @Override
   public int utimensat(int flag, String atimespec, long[] path, long[] mtimespec, int dirfd) {
      long mtimeMillis;
      if (mtimespec != null) {
         if (!$assertionsDisabled && mtimespec.length != 2) {
            throw new AssertionError();
         }

         mtimeMillis = mtimespec[0] * 1000L + mtimespec[1] / 1000000L;
      } else {
         mtimeMillis = System.currentTimeMillis();
      }

      new File(path).setLastModified(mtimeMillis);
      return 0;
   }

   @Override
   public boolean isNative() {
      return false;
   }

   @Override
   public int execv(String path, String[] argv) {
      this.handler.unimplementedError("No execv in Java (yet)");
      return -1;
   }

   @Override
   public Timeval allocateTimeval() {
      this.handler.unimplementedError("allocateTimeval");
      return null;
   }

   @Override
   public int unlink(CharSequence path) {
      this.handler.unimplementedError("unlink");
      return -1;
   }

   @Override
   public FileStat fstat(FileDescriptor descriptor) {
      this.handler.unimplementedError("fstat unimplemented");
      return null;
   }

   @Override
   public int getgroups(int size, int[] groups) {
      this.handler.unimplementedError("getgroups");
      return this.unimplementedInt("getgroups not available for Java");
   }

   @Override
   public long posix_spawnp(
      String argv, Collection<? extends SpawnFileAction> envp, Collection<? extends CharSequence> path, Collection<? extends CharSequence> fileActions
   ) {
      return this.unimplementedInt("posix_spawnp");
   }

   @Override
   public int rename(CharSequence oldName, CharSequence newName) {
      File oldFile = new File(oldName.toString());
      File newFile = new File(newName.toString());
      return oldFile.renameTo(newFile) ? 0 : -1;
   }

   @Override
   public int rmdir(String path) {
      return this.helper.rmdir(path);
   }

   @Override
   public boolean isatty(FileDescriptor fd) {
      return fd == FileDescriptor.in || fd == FileDescriptor.out || fd == FileDescriptor.err;
   }

   // $VF: Compiled from JavaPOSIX.java
   private static final class FakePasswd implements Passwd {
      @Override
      public String getAccessClass() {
         return "";
      }

      @Override
      public String getShell() {
         return "/bin/sh";
      }

      @Override
      public String getPassword() {
         return "";
      }

      @Override
      public long getUID() {
         return JavaPOSIX.LoginInfo.UID;
      }

      @Override
      public String getGECOS() {
         return this.getLoginName();
      }

      @Override
      public int getPasswdChangeTime() {
         return 0;
      }

      @Override
      public String getLoginName() {
         return JavaPOSIX.LoginInfo.USERNAME;
      }

      @Override
      public int getExpire() {
         return -1;
      }

      @Override
      public long getGID() {
         return JavaPOSIX.LoginInfo.GID;
      }

      @Override
      public String getHome() {
         return "/";
      }
   }

   // $VF: Compiled from JavaPOSIX.java
   private static final class IDHelper {
      private static final String ID_CMD = Platform.IS_SOLARIS ? "/usr/xpg4/bin/id" : "/usr/bin/id";
      private static final int NOBODY = Platform.IS_WINDOWS ? 0 : 32767;

      public static String getString(String option) {
         try {
            Process ex = Runtime.getRuntime().exec(new String[]{ID_CMD, option});
            BufferedReader r = new BufferedReader(new InputStreamReader(ex.getInputStream()));
            return r.readLine();
         } catch (IOException var3) {
            return null;
         }
      }

      public static int getInt(String option) {
         try {
            Process ex = Runtime.getRuntime().exec(new String[]{ID_CMD, option});
            BufferedReader r = new BufferedReader(new InputStreamReader(ex.getInputStream()));
            return Integer.parseInt(r.readLine());
         } catch (IOException ex) {
            return NOBODY;
         } catch (NumberFormatException ex) {
            return NOBODY;
         } catch (SecurityException var5) {
            return NOBODY;
         }
      }
   }

   // $VF: Compiled from JavaPOSIX.java
   static final class LoginInfo {
      public static final String USERNAME = JavaPOSIX.IDHelper.getString("-un");
      public static final int GID = JavaPOSIX.IDHelper.getInt("-g");
      public static final int UID = JavaPOSIX.IDHelper.getInt("-u");
   }
}
