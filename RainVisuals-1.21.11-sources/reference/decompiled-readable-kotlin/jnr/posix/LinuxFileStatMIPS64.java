package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from LinuxFileStatMIPS64.java
public final class LinuxFileStatMIPS64 extends BaseFileStat implements NanosecondFileStat {
   private static final LinuxFileStatMIPS64.Layout layout = new LinuxFileStatMIPS64.Layout(Runtime.getSystemRuntime());

   @Override
   public long atime() {
      return layout.st_atime.get(this.memory);
   }

   @Override
   public long st_size() {
      return layout.st_size.get(this.memory);
   }

   @Override
   public long aTimeNanoSecs() {
      return layout.st_atimensec.get(this.memory);
   }

   @Override
   public long blockSize() {
      return layout.st_blksize.get(this.memory);
   }

   @Override
   public long blocks() {
      return layout.st_blocks.get(this.memory);
   }

   @Override
   public long ino() {
      return layout.st_ino.get(this.memory);
   }

   @Override
   public int mode() {
      return (int)layout.st_mode.get(this.memory);
   }

   @Override
   public int nlink() {
      return (int)layout.st_nlink.get(this.memory);
   }

   @Override
   public int uid() {
      return (int)layout.st_uid.get(this.memory);
   }

   @Override
   public int gid() {
      return (int)layout.st_gid.get(this.memory);
   }

   @Override
   public long mtime() {
      return layout.st_mtime.get(this.memory);
   }

   @Override
   public long cTimeNanoSecs() {
      return layout.st_ctimensec.get(this.memory);
   }

   public LinuxFileStatMIPS64(LinuxPOSIX posix) {
      super(posix, layout);
   }

   @Override
   public long rdev() {
      return layout.st_rdev.get(this.memory);
   }

   @Override
   public long mTimeNanoSecs() {
      return layout.st_mtimensec.get(this.memory);
   }

   @Override
   public long ctime() {
      return layout.st_ctime.get(this.memory);
   }

   @Override
   public long dev() {
      return layout.st_dev.get(this.memory);
   }

   // $VF: Compiled from LinuxFileStatMIPS64.java
   public static final class Layout extends StructLayout {
      public final StructLayout.Unsigned64 st_rdev;
      public final StructLayout.Unsigned64 st_mtimensec;
      public final StructLayout.Unsigned32 st_nlink;
      public final StructLayout.Unsigned32 __pad03;
      public final StructLayout.Unsigned32 __pad20;
      public final StructLayout.Unsigned32 __pad02;
      public final StructLayout.Unsigned64 st_ctime;
      public final StructLayout.Unsigned64 st_ctimensec;
      public final StructLayout.Unsigned64 st_dev = new StructLayout.Unsigned64();
      public final StructLayout.Unsigned64 st_ino;
      public final StructLayout.Unsigned32 __pad11;
      public final StructLayout.Unsigned64 st_atimensec;
      public final StructLayout.Unsigned32 __pad12;
      public final StructLayout.Unsigned64 st_mtime;
      public final StructLayout.Signed64 st_size;
      public final StructLayout.Unsigned32 st_gid;
      public final StructLayout.Unsigned64 st_blksize;
      public final StructLayout.Unsigned64 st_blocks;
      public final StructLayout.Unsigned32 st_uid;
      public final StructLayout.Unsigned32 __pad01 = new StructLayout.Unsigned32();
      public final StructLayout.Unsigned64 st_mode;
      public final StructLayout.Unsigned64 st_atime;
      public final StructLayout.Unsigned32 __pad13;

      public Layout(Runtime runtime) {
         super(runtime);
         this.__pad02 = new StructLayout.Unsigned32();
         this.__pad03 = new StructLayout.Unsigned32();
         this.st_ino = new StructLayout.Unsigned64();
         this.st_mode = new StructLayout.Unsigned64();
         this.st_nlink = new StructLayout.Unsigned32();
         this.st_uid = new StructLayout.Unsigned32();
         this.st_gid = new StructLayout.Unsigned32();
         this.st_rdev = new StructLayout.Unsigned64();
         this.__pad11 = new StructLayout.Unsigned32();
         this.__pad12 = new StructLayout.Unsigned32();
         this.__pad13 = new StructLayout.Unsigned32();
         this.st_size = new StructLayout.Signed64();
         this.st_atime = new StructLayout.Unsigned64();
         this.st_atimensec = new StructLayout.Unsigned64();
         this.st_mtime = new StructLayout.Unsigned64();
         this.st_mtimensec = new StructLayout.Unsigned64();
         this.st_ctime = new StructLayout.Unsigned64();
         this.st_ctimensec = new StructLayout.Unsigned64();
         this.st_blksize = new StructLayout.Unsigned64();
         this.__pad20 = new StructLayout.Unsigned32();
         this.st_blocks = new StructLayout.Unsigned64();
      }
   }
}
