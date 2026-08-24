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
import jnr.ffi.annotations.Out;
import jnr.posix.util.ProcessMaker;

// $VF: Compiled from POSIX.java
public interface POSIX {
   int fsync(int var1);

   int fdatasync(int var1);

   int exec(String var1, String[] var2, String[] var3);

   long sysconf(Sysconf var1);

   long lseekLong(int var1, long var2, int var4);

   int setpriority(int var1, int var2, int var3);

   ProcessMaker newProcessMaker();

   int unlink(CharSequence var1);

   int setegid(int var1);

   String strerror(int var1);

   int isatty(int var1);

   int fcntlInt(int var1, Fcntl var2, int var3);

   void errno(int var1);

   int futimens(int var1, Pointer var2);

   int truncate(CharSequence var1, long var2);

   int setpgrp(int var1, int var2);

   int pipe(int[] var1);

   int getpgrp();

   String readlink(String var1) throws IOException;

   int fstat(int var1, FileStat var2);

   Times times();

   int write(int var1, ByteBuffer var2, int var3);

   int recvmsg(int var1, MsgHdr var2, int var3);

   int lchmod(String var1, int var2);

   int dup(int var1);

   int setgid(int var1);

   int waitpid(int var1, int[] var2, int var3);

   int write(int var1, byte[] var2, int var3);

   int pwrite(int var1, byte[] var2, int var3, int var4);

   int symlink(String var1, String var2);

   int daemon(int var1, int var2);

   int getdtablesize();

   int dup2(int var1, int var2);

   long read(int var1, byte[] var2, long var3);

   String getcwd();

   String gethostname();

   LibC libc();

   int lutimes(String var1, long[] var2, long[] var3);

   byte[] crypt(byte[] var1, byte[] var2);

   int fpathconf(int var1, Pathconf var2);

   int kill(int var1, int var2);

   FileStat stat(String var1);

   CharSequence crypt(CharSequence var1, CharSequence var2);

   FileStat fstat(FileDescriptor var1);

   long read(int var1, ByteBuffer var2, long var3);

   int geteuid();

   int link(String var1, String var2);

   int read(int var1, byte[] var2, int var3);

   int errno();

   Passwd getpwuid(int var1);

   int pwrite(int var1, ByteBuffer var2, int var3, int var4);

   long posix_spawnp(
      String var1,
      Collection<? extends SpawnFileAction> var2,
      Collection<? extends SpawnAttribute> var3,
      Collection<? extends CharSequence> var4,
      Collection<? extends CharSequence> var5
   );

   String getlogin();

   int flock(int var1, int var2);

   String nl_langinfo(int var1);

   int getgroups(int var1, int[] var2);

   int ftruncate(int var1, long var2);

   int utimensat(int var1, String var2, Pointer var3, int var4);

   int wait(int[] var1);

   int fchmod(int var1, int var2);

   int sendmsg(int var1, MsgHdr var2, int var3);

   Passwd getpwnam(String var1);

   long[] getgroups();

   int getgid();

   Pointer environ();

   boolean isatty(FileDescriptor var1);

   long write(int var1, byte[] var2, long var3);

   RLimit getrlimit(int var1);

   int fchown(int var1, int var2, int var3);

   int confstr(Confstr var1, @Out ByteBuffer var2, int var3);

   int fork();

   int setgrent();

   int readlink(CharSequence var1, Pointer var2, int var3);

   int waitpid(long var1, int[] var3, int var4);

   int chmod(String var1, int var2);

   ProcessMaker newProcessMaker(String... var1);

   int getppid();

   int setrlimit(int var1, Pointer var2);

   long posix_spawnp(String var1, Collection<? extends SpawnFileAction> var2, Collection<? extends CharSequence> var3, Collection<? extends CharSequence> var4);

   int getpgid();

   Timeval allocateTimeval();

   int mkfifo(String var1, int var2);

   int open(CharSequence var1, int var2, int var3);

   int seteuid(int var1);

   String getenv(String var1);

   FileStat fstat(int var1);

   int fcntl(int var1, Fcntl var2);

   int socketpair(int var1, int var2, int var3, int[] var4);

   int futimens(int var1, long[] var2, long[] var3);

   int mkdir(String var1, int var2);

   long pread(int var1, byte[] var2, long var3, long var5);

   boolean isNative();

   String setlocale(int var1, String var2);

   int fcntl(int var1, Fcntl var2, int var3);

   int getuid();

   int readlink(CharSequence var1, ByteBuffer var2, int var3);

   int execv(String var1, String[] var2);

   int endgrent();

   int execve(String var1, String[] var2, String[] var3);

   int close(int var1);

   int futimes(int var1, long[] var2, long[] var3);

   int getrlimit(int var1, Pointer var2);

   Passwd getpwent();

   int raise(int var1);

   FileStat lstat(String var1);

   int setsid();

   int chown(String var1, int var2, int var3);

   Group getgrgid(int var1);

   long write(int var1, ByteBuffer var2, long var3);

   int stat(String var1, FileStat var2);

   int access(CharSequence var1, int var2);

   int getpgid(int var1);

   MsgHdr allocateMsgHdr();

   int utimensat(int var1, String var2, long[] var3, long[] var4, int var5);

   int fstat(FileDescriptor var1, FileStat var2);

   int setpwent();

   int getpriority(int var1, int var2);

   long pwrite(int var1, byte[] var2, long var3, long var5);

   int readlink(CharSequence var1, byte[] var2, int var3);

   int read(int var1, ByteBuffer var2, int var3);

   Group getgrent();

   int getpid();

   int setrlimit(int var1, long var2, long var4);

   int endpwent();

   int getrlimit(int var1, RLimit var2);

   int kill(long var1, int var3);

   int getegid();

   int setenv(String var1, String var2, int var3);

   int rmdir(String var1);

   int pread(int var1, ByteBuffer var2, int var3, int var4);

   @Deprecated
   int fcntl(int var1, Fcntl var2, int... var3);

   long pwrite(int var1, ByteBuffer var2, long var3, long var5);

   int chdir(String var1);

   int umask(int var1);

   int utimes(String var1, Pointer var2);

   int unsetenv(String var1);

   int gettimeofday(Timeval var1);

   int pread(int var1, byte[] var2, int var3, int var4);

   int lseek(int var1, long var2, int var4);

   Group getgrnam(String var1);

   int exec(String var1, String... var2);

   int lstat(String var1, FileStat var2);

   int setpgid(int var1, int var2);

   int setuid(int var1);

   long pread(int var1, ByteBuffer var2, long var3, long var5);

   int rename(CharSequence var1, CharSequence var2);

   SignalHandler signal(Signal var1, SignalHandler var2);

   int setrlimit(int var1, RLimit var2);

   int lchown(String var1, int var2, int var3);

   FileStat allocateStat();

   int utimes(String var1, long[] var2, long[] var3);
}
