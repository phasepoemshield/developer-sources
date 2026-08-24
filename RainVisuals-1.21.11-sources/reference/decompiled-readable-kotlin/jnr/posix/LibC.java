package jnr.posix;

import java.nio.ByteBuffer;
import jnr.constants.platform.Confstr;
import jnr.constants.platform.Pathconf;
import jnr.constants.platform.Sysconf;
import jnr.ffi.Pointer;
import jnr.ffi.Variable;
import jnr.ffi.annotations.Delegate;
import jnr.ffi.annotations.Direct;
import jnr.ffi.annotations.IgnoreError;
import jnr.ffi.annotations.In;
import jnr.ffi.annotations.Out;
import jnr.ffi.annotations.Transient;
import jnr.ffi.annotations.Variadic;
import jnr.ffi.byref.IntByReference;
import jnr.ffi.types.clock_t;
import jnr.ffi.types.intptr_t;
import jnr.ffi.types.off_t;
import jnr.ffi.types.size_t;
import jnr.ffi.types.ssize_t;
import jnr.ffi.types.u_int32_t;
import jnr.ffi.types.u_int64_t;

// $VF: Compiled from LibC.java
public interface LibC {
   int setrlimit(int var1, Pointer var2);

   int setpriority(int var1, int var2, int var3);

   int readlink(CharSequence var1, Pointer var2, int var3);

   @IgnoreError
   int getegid();

   int futimens(int var1, @In Pointer var2);

   int setgrent();

   int lstat(CharSequence var1, @Out @Transient FileStat var2);

   @ssize_t
   long read(int var1, @Out ByteBuffer var2, @size_t long var3);

   int ftruncate(int var1, long var2);

   int fdatasync(int var1);

   int fstat(int var1, @Out @Transient FileStat var2);

   String strerror(int var1);

   long sysconf(Sysconf var1);

   int pwrite(int var1, @In ByteBuffer var2, int var3, int var4);

   @Variadic(fixedCount = 2)
   int fcntl(int var1, int var2, Pointer var3);

   int futimens(int var1, Timespec[] var2);

   int gettimeofday(Timeval var1, long var2);

   int getpgid(int var1);

   int getdtablesize();

   int fstat64(int var1, @Out @Transient FileStat var2);

   int rename(CharSequence var1, CharSequence var2);

   NativePasswd getpwent();

   int gethostname(@Out ByteBuffer var1, int var2);

   int chdir(CharSequence var1);

   @clock_t
   long times(@Out @Transient NativeTimes var1);

   int utimensat(int var1, String var2, Timespec[] var3, int var4);

   int write(int var1, @In ByteBuffer var2, int var3);

   int waitpid(long var1, @Out int[] var3, int var4);

   int dup2(int var1, int var2);

   int getpgrp();

   int setenv(CharSequence var1, CharSequence var2, int var3);

   int setgid(int var1);

   int truncate(CharSequence var1, long var2);

   int chown(CharSequence var1, int var2, int var3);

   @IgnoreError
   int geteuid();

   @IgnoreError
   int isatty(int var1);

   @Variadic(fixedCount = 2)
   int fcntl(int var1, int var2, @u_int64_t int var3);

   int raise(int var1);

   int pread(int var1, @Out byte[] var2, int var3, int var4);

   int fpathconf(int var1, Pathconf var2);

   int access(CharSequence var1, int var2);

   @Variadic(fixedCount = 2)
   int open(CharSequence var1, int var2, @u_int32_t int var3);

   @ssize_t
   long read(int var1, @Out byte[] var2, @size_t long var3);

   int syscall(int var1);

   long getcwd(byte[] var1, int var2);

   String setlocale(int var1, String var2);

   int link(CharSequence var1, CharSequence var2);

   int rmdir(CharSequence var1);

   int endgrent();

   int fchmod(int var1, int var2);

   NativePasswd getpwnam(CharSequence var1);

   int lchown(CharSequence var1, int var2, int var3);

   int setsid();

   int wait(@Out int[] var1);

   int stat(CharSequence var1, @Out @Transient FileStat var2);

   int close(int var1);

   int stat64(CharSequence var1, @Out @Transient FileStat var2);

   @ssize_t
   long pwrite(int var1, @In byte[] var2, @size_t long var3, @off_t long var5);

   @IgnoreError
   int getpid();

   int getrlimit(int var1, @Out RLimit var2);

   int getsockopt(int var1, int var2, int var3, @Out ByteBuffer var4, @In @Out IntByReference var5);

   int flock(int var1, int var2);

   int syscall(int var1, int var2, int var3);

   int fchown(int var1, int var2, int var3);

   NativeGroup getgrnam(CharSequence var1);

   int sendmsg(int var1, @In MsgHdr var2, int var3);

   int readlink(CharSequence var1, @Out byte[] var2, int var3);

   int setrlimit(int var1, @In RLimit var2);

   @ssize_t
   long pwrite(int var1, @In ByteBuffer var2, @size_t long var3, @off_t long var5);

   int syscall(int var1, int var2, int var3, int var4);

   int setpwent();

   int getpgid();

   int write(int var1, @In byte[] var2, int var3);

   int lutimes(CharSequence var1, @In Timeval[] var2);

   int pipe(@Out int[] var1);

   int read(int var1, @Out ByteBuffer var2, int var3);

   @IgnoreError
   int getuid();

   @Deprecated
   int fcntl(int var1, int var2, int... var3);

   int symlink(CharSequence var1, CharSequence var2);

   int unsetenv(CharSequence var1);

   @IgnoreError
   int getppid();

   String getlogin();

   @ssize_t
   long pread(int var1, @Out ByteBuffer var2, @size_t long var3, @off_t long var5);

   int setpgid(int var1, int var2);

   int daemon(int var1, int var2);

   int execve(CharSequence var1, @In CharSequence[] var2, @In CharSequence[] var3);

   int kill(int var1, int var2);

   NativeGroup getgrent();

   int confstr(Confstr var1, @Out ByteBuffer var2, int var3);

   int pwrite(int var1, @In byte[] var2, int var3, int var4);

   int setpgrp(int var1, int var2);

   int utimensat(int var1, String var2, @In Pointer var3, int var4);

   int utimes(CharSequence var1, @In Timeval[] var2);

   @Variadic(fixedCount = 2)
   int fcntl(int var1, int var2);

   String getenv(CharSequence var1);

   int execv(CharSequence var1, @In CharSequence[] var2);

   int setegid(int var1);

   @Variadic(fixedCount = 2)
   int fcntl(int var1, int var2, Flock var3);

   int recvmsg(int var1, @Direct MsgHdr var2, int var3);

   @ssize_t
   long write(int var1, @In ByteBuffer var2, @size_t long var3);

   int unlink(CharSequence var1);

   int futimes(int var1, @In Timeval[] var2);

   int mkdir(CharSequence var1, int var2);

   int syscall(int var1, int var2);

   int pread(int var1, @Out ByteBuffer var2, int var3, int var4);

   @intptr_t
   long signal(int var1, LibC.LibCSignalHandler var2);

   int fsync(int var1);

   int getpriority(int var1, int var2);

   int chmod(CharSequence var1, int var2);

   NativeGroup getgrgid(int var1);

   @ssize_t
   long pread(int var1, @Out byte[] var2, @size_t long var3, @off_t long var5);

   @ssize_t
   long write(int var1, @In byte[] var2, @size_t long var3);

   @IgnoreError
   int getgid();

   @IgnoreError
   int umask(int var1);

   int setuid(int var1);

   int kill(long var1, int var3);

   int seteuid(int var1);

   long lseek(int var1, long var2, int var4);

   Variable<Long> environ();

   int lstat64(CharSequence var1, @Out @Transient FileStat var2);

   int read(int var1, @Out byte[] var2, int var3);

   int setsockopt(int var1, int var2, int var3, @In ByteBuffer var4, int var5);

   int getgroups(int var1, int[] var2);

   int dup(int var1);

   int endpwent();

   NativePasswd getpwuid(int var1);

   int lchmod(CharSequence var1, int var2);

   int utimes(String var1, @In Pointer var2);

   int fork();

   String nl_langinfo(int var1);

   int getrlimit(int var1, Pointer var2);

   int socketpair(int var1, int var2, int var3, @Out int[] var4);

   int readlink(CharSequence var1, @Out ByteBuffer var2, int var3);

   // $VF: Compiled from LibC.java
   interface LibCSignalHandler {
      @Delegate
      void signal(int var1);
   }
}
