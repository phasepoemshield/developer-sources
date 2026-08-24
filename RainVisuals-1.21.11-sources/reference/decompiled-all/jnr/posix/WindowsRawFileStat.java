package jnr.posix;

import jnr.posix.util.WindowsHelpers;
import jnr.posix.windows.CommonFileInformation;

// $VF: Compiled from WindowsRawFileStat.java
public class WindowsRawFileStat extends AbstractJavaFileStat implements NanosecondFileStat {
   private int st_mtime;
   private int st_mode;
   private int st_atime;
   private int st_ctime;
   private long st_size;
   private int st_dev;
   private int st_nlink;
   private long st_atimensec;
   private long st_mtimensec;
   private long st_ctimensec;
   private int st_rdev;

   @Override
   public boolean isIdentical(FileStat other) {
      return this.dev() == other.dev() && this.ino() == other.ino();
   }

   @Override
   public boolean isNamedPipe() {
      return (this.mode() & 4096) != 0;
   }

   @Override
   public boolean isEmpty() {
      return this.st_size() == 0L;
   }

   @Override
   public boolean isGroupOwned() {
      return this.groupMember(this.gid());
   }

   @Override
   public long mtime() {
      return this.st_mtime;
   }

   @Override
   public long atime() {
      return this.st_atime;
   }

   @Override
   public int nlink() {
      return this.st_nlink;
   }

   @Override
   public boolean isFile() {
      return (this.mode() & 61440) == 32768;
   }

   @Override
   public boolean isReadable() {
      if (this.isOwned()) {
         return (this.mode() & 256) != 0;
      } else {
         return this.isGroupOwned() ? (this.mode() & 32) != 0 : (this.mode() & 4) == 0;
      }
   }

   @Override
   public long st_size() {
      return this.st_size;
   }

   @Override
   public long dev() {
      return this.st_dev;
   }

   public void setup(CommonFileInformation fileInfo) {
      long atime = fileInfo.getLastAccessTimeNanoseconds();
      this.st_atimensec = atime % 1000000000L;
      this.st_atime = (int)(atime / 1000000000L);
      long mtime = fileInfo.getLastWriteTimeNanoseconds();
      this.st_mtimensec = mtime % 1000000000L;
      this.st_mtime = (int)(mtime / 1000000000L);
      long ctime = fileInfo.getCreationTimeNanoseconds();
      this.st_ctimensec = ctime % 1000000000L;
      this.st_ctime = (int)(ctime / 1000000000L);
      this.st_size = this.isDirectory() ? 0L : fileInfo.getFileSize();
      this.st_nlink = 1;
      this.st_mode &= -19;
   }

   @Override
   public boolean isExecutableReal() {
      if (this.isROwned()) {
         return (this.mode() & 64) != 0;
      } else {
         return this.groupMember(this.gid()) ? (this.mode() & 8) != 0 : (this.mode() & 1) == 0;
      }
   }

   @Override
   public long ctime() {
      return this.st_ctime;
   }

   @Override
   public boolean isSymlink() {
      return (this.mode() & 61440) == 40960;
   }

   @Override
   public boolean isOwned() {
      return true;
   }

   @Override
   public boolean isSticky() {
      return (this.mode() & 512) != 0;
   }

   public WindowsRawFileStat(POSIX posix, POSIXHandler handler) {
      super(posix, handler);
   }

   @Override
   public long rdev() {
      return this.st_rdev;
   }

   @Override
   public boolean isSetgid() {
      return (this.mode() & 1024) != 0;
   }

   @Override
   public boolean isROwned() {
      return true;
   }

   @Override
   public boolean isFifo() {
      return (this.mode() & 61440) == 4096;
   }

   @Override
   public boolean isDirectory() {
      return (this.mode() & 61440) == 16384;
   }

   public void setup(String fileInfo, CommonFileInformation path) {
      this.st_mode = fileInfo.getMode(path);
      this.setup(fileInfo);
      if (WindowsHelpers.isDriveLetterPath(path)) {
         int letterAsNumber = Character.toUpperCase(path.charAt(0)) - 'A';
         this.st_rdev = letterAsNumber;
         this.st_dev = letterAsNumber;
      }
   }

   @Override
   public boolean isReadableReal() {
      if (this.isROwned()) {
         return (this.mode() & 256) != 0;
      } else {
         return this.groupMember(this.gid()) ? (this.mode() & 32) != 0 : (this.mode() & 4) == 0;
      }
   }

   @Override
   public boolean isSetuid() {
      return (this.mode() & 2048) != 0;
   }

   @Override
   public boolean isWritable() {
      if (this.isOwned()) {
         return (this.mode() & 128) != 0;
      } else {
         return this.isGroupOwned() ? (this.mode() & 16) != 0 : (this.mode() & 2) == 0;
      }
   }

   @Override
   public boolean isWritableReal() {
      if (this.isROwned()) {
         return (this.mode() & 128) != 0;
      } else {
         return this.groupMember(this.gid()) ? (this.mode() & 16) != 0 : (this.mode() & 2) == 0;
      }
   }

   @Override
   public long mTimeNanoSecs() {
      return this.st_mtimensec;
   }

   @Override
   public int mode() {
      return this.st_mode;
   }

   @Override
   public long cTimeNanoSecs() {
      return this.st_ctimensec;
   }

   @Override
   public boolean isExecutable() {
      if (this.isOwned()) {
         return (this.mode() & 64) != 0;
      } else {
         return this.isGroupOwned() ? (this.mode() & 8) != 0 : (this.mode() & 1) == 0;
      }
   }

   @Override
   public boolean isSocket() {
      return (this.mode() & 61440) == 49152;
   }

   @Override
   public long aTimeNanoSecs() {
      return this.st_atimensec;
   }
}
