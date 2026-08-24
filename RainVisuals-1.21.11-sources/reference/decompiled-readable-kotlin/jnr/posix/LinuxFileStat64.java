package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from LinuxFileStat64.java
public final class LinuxFileStat64 extends BaseFileStat implements NanosecondFileStat {
   private static final LinuxFileStat64.Layout layout = new LinuxFileStat64.Layout(Runtime.getSystemRuntime());

   @Override
   public long cTimeNanoSecs() {
      return layout.st_ctimensec.get(this.memory);
   }

   @Override
   public int gid() {
      return (int)layout.st_gid.get(this.memory);
   }

   @Override
   public long mTimeNanoSecs() {
      return layout.st_mtimensec.get(this.memory);
   }

   @Override
   public long blocks() {
      return layout.st_blocks.get(this.memory);
   }

   @Override
   public int mode() {
      return (int)layout.st_mode.get(this.memory);
   }

   @Override
   public long ctime() {
      return layout.st_ctime.get(this.memory);
   }

   @Override
   public long aTimeNanoSecs() {
      return layout.st_atimensec.get(this.memory);
   }

   @Override
   public long blockSize() {
      return layout.st_blksize.get(this.memory);
   }

   public LinuxFileStat64(LinuxPOSIX posix) {
      super(posix, layout);
   }

   @Override
   public long st_size() {
      return layout.st_size.get(this.memory);
   }

   @Override
   public long mtime() {
      return layout.st_mtime.get(this.memory);
   }

   @Override
   public int uid() {
      return (int)layout.st_uid.get(this.memory);
   }

   @Override
   public long rdev() {
      return layout.st_rdev.get(this.memory);
   }

   @Override
   public long atime() {
      return layout.st_atime.get(this.memory);
   }

   @Override
   public long dev() {
      return layout.st_dev.get(this.memory);
   }

   @Override
   public long ino() {
      return layout.st_ino.get(this.memory);
   }

   @Override
   public int nlink() {
      return (int)layout.st_nlink.get(this.memory);
   }

   // $VF: Compiled from LinuxFileStat64.java
   public static final class Layout extends StructLayout {
      public final StructLayout.blkcnt_t st_blocks;
      public final StructLayout.Signed64 __unused5;
      public final StructLayout.Signed64 __unused6;
      public final StructLayout.blksize_t st_blksize;
      public final StructLayout.SignedLong st_ctimensec;
      public final StructLayout.nlink_t st_nlink;
      public final StructLayout.time_t st_ctime;
      public final StructLayout.mode_t st_mode;
      public final StructLayout.SignedLong st_atimensec;
      public final StructLayout.SignedLong st_mtimensec;
      public final StructLayout.ino_t st_ino;
      public final StructLayout.uid_t st_uid;
      public final StructLayout.off_t st_size;
      public final StructLayout.dev_t st_dev = new StructLayout.dev_t();
      public final StructLayout.time_t st_mtime;
      public final StructLayout.dev_t st_rdev;
      public final StructLayout.time_t st_atime;
      public final StructLayout.gid_t st_gid;
      public final StructLayout.Signed64 __unused4;

      public Layout(Runtime runtime) {
         super(runtime);
         this.st_ino = new StructLayout.ino_t();
         this.st_nlink = new StructLayout.nlink_t();
         this.st_mode = new StructLayout.mode_t();
         this.st_uid = new StructLayout.uid_t();
         this.st_gid = new StructLayout.gid_t();
         this.st_rdev = new StructLayout.dev_t();
         this.st_size = new StructLayout.off_t();
         this.st_blksize = new StructLayout.blksize_t();
         this.st_blocks = new StructLayout.blkcnt_t();
         this.st_atime = new StructLayout.time_t();
         this.st_atimensec = new StructLayout.SignedLong();
         this.st_mtime = new StructLayout.time_t();
         this.st_mtimensec = new StructLayout.SignedLong();
         this.st_ctime = new StructLayout.time_t();
         this.st_ctimensec = new StructLayout.SignedLong();
         this.__unused4 = new StructLayout.Signed64();
         this.__unused5 = new StructLayout.Signed64();
         this.__unused6 = new StructLayout.Signed64();
      }
   }
}
