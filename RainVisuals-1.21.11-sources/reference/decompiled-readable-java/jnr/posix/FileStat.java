/*
 * Decompiled with CFR 0.152.
 */
package jnr.posix;

public interface FileStat {
    public static final int S_IROTH = 4;
    public static final int S_IFCHR = 8192;
    public static final int S_IFREG = 32768;
    public static final int S_IFBLK = 24576;
    public static final int ALL_WRITE = 146;
    public static final int S_IFDIR = 16384;
    public static final int S_IRGRP = 32;
    public static final int S_IXGRP = 8;
    public static final int S_ISGID = 1024;
    public static final int S_IFSOCK = 49152;
    public static final int S_ISVTX = 512;
    public static final int S_IFMT = 61440;
    public static final int S_IXOTH = 1;
    public static final int S_IXUSR = 64;
    public static final int S_IRUSR = 256;
    public static final int ALL_READ = 292;
    public static final int S_IFIFO = 4096;
    public static final int S_ISUID = 2048;
    public static final int S_IXUGO = 73;
    public static final int S_IWOTH = 2;
    public static final int S_IWGRP = 16;
    public static final int S_IFLNK = 40960;
    public static final int S_IWUSR = 128;

    public boolean isCharDev();

    public boolean isWritableReal();

    public boolean isEmpty();

    public long ctime();

    public boolean isIdentical(FileStat var1);

    public long ino();

    public int gid();

    public long blockSize();

    public int nlink();

    public boolean isSocket();

    public boolean isBlockDev();

    public boolean isSticky();

    public long blocks();

    public boolean isFifo();

    public boolean isGroupOwned();

    public int uid();

    public boolean isNamedPipe();

    public int minor(long var1);

    public boolean isOwned();

    public boolean isDirectory();

    public int mode();

    public boolean isExecutableReal();

    public boolean isExecutable();

    public long mtime();

    public long dev();

    public boolean isReadableReal();

    public boolean isFile();

    public long st_size();

    public long rdev();

    public int major(long var1);

    public boolean isWritable();

    public boolean groupMember(int var1);

    public boolean isReadable();

    public boolean isSetuid();

    public String ftype();

    public long atime();

    public boolean isSetgid();

    public boolean isSymlink();

    public boolean isROwned();
}

