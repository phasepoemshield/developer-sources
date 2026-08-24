package jnr.posix;

// $VF: Compiled from FileStat.java
public interface FileStat {
   int S_IROTH = 4;
   int S_IFCHR = 8192;
   int S_IFREG = 32768;
   int S_IFBLK = 24576;
   int ALL_WRITE = 146;
   int S_IFDIR = 16384;
   int S_IRGRP = 32;
   int S_IXGRP = 8;
   int S_ISGID = 1024;
   int S_IFSOCK = 49152;
   int S_ISVTX = 512;
   int S_IFMT = 61440;
   int S_IXOTH = 1;
   int S_IXUSR = 64;
   int S_IRUSR = 256;
   int ALL_READ = 292;
   int S_IFIFO = 4096;
   int S_ISUID = 2048;
   int S_IXUGO = 73;
   int S_IWOTH = 2;
   int S_IWGRP = 16;
   int S_IFLNK = 40960;
   int S_IWUSR = 128;

   boolean isCharDev();

   boolean isWritableReal();

   boolean isEmpty();

   long ctime();

   boolean isIdentical(FileStat var1);

   long ino();

   int gid();

   long blockSize();

   int nlink();

   boolean isSocket();

   boolean isBlockDev();

   boolean isSticky();

   long blocks();

   boolean isFifo();

   boolean isGroupOwned();

   int uid();

   boolean isNamedPipe();

   int minor(long var1);

   boolean isOwned();

   boolean isDirectory();

   int mode();

   boolean isExecutableReal();

   boolean isExecutable();

   long mtime();

   long dev();

   boolean isReadableReal();

   boolean isFile();

   long st_size();

   long rdev();

   int major(long var1);

   boolean isWritable();

   boolean groupMember(int var1);

   boolean isReadable();

   boolean isSetuid();

   String ftype();

   long atime();

   boolean isSetgid();

   boolean isSymlink();

   boolean isROwned();
}
