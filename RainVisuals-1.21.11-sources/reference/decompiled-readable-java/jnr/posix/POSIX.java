/*
 * Decompiled with CFR 0.152.
 */
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
import jnr.posix.FileStat;
import jnr.posix.Group;
import jnr.posix.LibC;
import jnr.posix.MsgHdr;
import jnr.posix.Passwd;
import jnr.posix.RLimit;
import jnr.posix.SignalHandler;
import jnr.posix.SpawnAttribute;
import jnr.posix.SpawnFileAction;
import jnr.posix.Times;
import jnr.posix.Timeval;
import jnr.posix.util.ProcessMaker;

public interface POSIX {
    public int fsync(int var1);

    public int fdatasync(int var1);

    public int exec(String var1, String[] var2, String[] var3);

    public long sysconf(Sysconf var1);

    public long lseekLong(int var1, long var2, int var4);

    public int setpriority(int var1, int var2, int var3);

    public ProcessMaker newProcessMaker();

    public int unlink(CharSequence var1);

    public int setegid(int var1);

    public String strerror(int var1);

    public int isatty(int var1);

    public int fcntlInt(int var1, Fcntl var2, int var3);

    public void errno(int var1);

    public int futimens(int var1, Pointer var2);

    public int truncate(CharSequence var1, long var2);

    public int setpgrp(int var1, int var2);

    public int pipe(int[] var1);

    public int getpgrp();

    public String readlink(String var1) throws IOException;

    public int fstat(int var1, FileStat var2);

    public Times times();

    public int write(int var1, ByteBuffer var2, int var3);

    public int recvmsg(int var1, MsgHdr var2, int var3);

    public int lchmod(String var1, int var2);

    public int dup(int var1);

    public int setgid(int var1);

    public int waitpid(int var1, int[] var2, int var3);

    public int write(int var1, byte[] var2, int var3);

    public int pwrite(int var1, byte[] var2, int var3, int var4);

    public int symlink(String var1, String var2);

    public int daemon(int var1, int var2);

    public int getdtablesize();

    public int dup2(int var1, int var2);

    public long read(int var1, byte[] var2, long var3);

    public String getcwd();

    public String gethostname();

    public LibC libc();

    public int lutimes(String var1, long[] var2, long[] var3);

    public byte[] crypt(byte[] var1, byte[] var2);

    public int fpathconf(int var1, Pathconf var2);

    public int kill(int var1, int var2);

    public FileStat stat(String var1);

    public CharSequence crypt(CharSequence var1, CharSequence var2);

    public FileStat fstat(FileDescriptor var1);

    public long read(int var1, ByteBuffer var2, long var3);

    public int geteuid();

    public int link(String var1, String var2);

    public int read(int var1, byte[] var2, int var3);

    public int errno();

    public Passwd getpwuid(int var1);

    public int pwrite(int var1, ByteBuffer var2, int var3, int var4);

    public long posix_spawnp(String var1, Collection<? extends SpawnFileAction> var2, Collection<? extends SpawnAttribute> var3, Collection<? extends CharSequence> var4, Collection<? extends CharSequence> var5);

    public String getlogin();

    public int flock(int var1, int var2);

    public String nl_langinfo(int var1);

    public int getgroups(int var1, int[] var2);

    public int ftruncate(int var1, long var2);

    public int utimensat(int var1, String var2, Pointer var3, int var4);

    public int wait(int[] var1);

    public int fchmod(int var1, int var2);

    public int sendmsg(int var1, MsgHdr var2, int var3);

    public Passwd getpwnam(String var1);

    public long[] getgroups();

    public int getgid();

    public Pointer environ();

    public boolean isatty(FileDescriptor var1);

    public long write(int var1, byte[] var2, long var3);

    public RLimit getrlimit(int var1);

    public int fchown(int var1, int var2, int var3);

    public int confstr(Confstr var1, @Out ByteBuffer var2, int var3);

    public int fork();

    public int setgrent();

    public int readlink(CharSequence var1, Pointer var2, int var3);

    public int waitpid(long var1, int[] var3, int var4);

    public int chmod(String var1, int var2);

    public ProcessMaker newProcessMaker(String ... var1);

    public int getppid();

    public int setrlimit(int var1, Pointer var2);

    public long posix_spawnp(String var1, Collection<? extends SpawnFileAction> var2, Collection<? extends CharSequence> var3, Collection<? extends CharSequence> var4);

    public int getpgid();

    public Timeval allocateTimeval();

    public int mkfifo(String var1, int var2);

    public int open(CharSequence var1, int var2, int var3);

    public int seteuid(int var1);

    public String getenv(String var1);

    public FileStat fstat(int var1);

    public int fcntl(int var1, Fcntl var2);

    public int socketpair(int var1, int var2, int var3, int[] var4);

    public int futimens(int var1, long[] var2, long[] var3);

    public int mkdir(String var1, int var2);

    public long pread(int var1, byte[] var2, long var3, long var5);

    public boolean isNative();

    public String setlocale(int var1, String var2);

    public int fcntl(int var1, Fcntl var2, int var3);

    public int getuid();

    public int readlink(CharSequence var1, ByteBuffer var2, int var3);

    public int execv(String var1, String[] var2);

    public int endgrent();

    public int execve(String var1, String[] var2, String[] var3);

    public int close(int var1);

    public int futimes(int var1, long[] var2, long[] var3);

    public int getrlimit(int var1, Pointer var2);

    public Passwd getpwent();

    public int raise(int var1);

    public FileStat lstat(String var1);

    public int setsid();

    public int chown(String var1, int var2, int var3);

    public Group getgrgid(int var1);

    public long write(int var1, ByteBuffer var2, long var3);

    public int stat(String var1, FileStat var2);

    public int access(CharSequence var1, int var2);

    public int getpgid(int var1);

    public MsgHdr allocateMsgHdr();

    public int utimensat(int var1, String var2, long[] var3, long[] var4, int var5);

    public int fstat(FileDescriptor var1, FileStat var2);

    public int setpwent();

    public int getpriority(int var1, int var2);

    public long pwrite(int var1, byte[] var2, long var3, long var5);

    public int readlink(CharSequence var1, byte[] var2, int var3);

    public int read(int var1, ByteBuffer var2, int var3);

    public Group getgrent();

    public int getpid();

    public int setrlimit(int var1, long var2, long var4);

    public int endpwent();

    public int getrlimit(int var1, RLimit var2);

    public int kill(long var1, int var3);

    public int getegid();

    public int setenv(String var1, String var2, int var3);

    public int rmdir(String var1);

    public int pread(int var1, ByteBuffer var2, int var3, int var4);

    @Deprecated
    public int fcntl(int var1, Fcntl var2, int ... var3);

    public long pwrite(int var1, ByteBuffer var2, long var3, long var5);

    public int chdir(String var1);

    public int umask(int var1);

    public int utimes(String var1, Pointer var2);

    public int unsetenv(String var1);

    public int gettimeofday(Timeval var1);

    public int pread(int var1, byte[] var2, int var3, int var4);

    public int lseek(int var1, long var2, int var4);

    public Group getgrnam(String var1);

    public int exec(String var1, String ... var2);

    public int lstat(String var1, FileStat var2);

    public int setpgid(int var1, int var2);

    public int setuid(int var1);

    public long pread(int var1, ByteBuffer var2, long var3, long var5);

    public int rename(CharSequence var1, CharSequence var2);

    public SignalHandler signal(Signal var1, SignalHandler var2);

    public int setrlimit(int var1, RLimit var2);

    public int lchown(String var1, int var2, int var3);

    public FileStat allocateStat();

    public int utimes(String var1, long[] var2, long[] var3);
}

