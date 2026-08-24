package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from OpenBSDFileStat.java
public final class OpenBSDFileStat extends BaseFileStat implements NanosecondFileStat {
   private static final OpenBSDFileStat.Layout layout = new OpenBSDFileStat.Layout(Runtime.getSystemRuntime());

   @Override
   public long blockSize() {
      return layout.st_blksize.get(this.memory);
   }

   public OpenBSDFileStat(NativePOSIX posix) {
      super(posix, layout);
   }

   @Override
   public int gid() {
      return (int)layout.st_gid.get(this.memory);
   }

   @Override
   public long st_size() {
      return layout.st_size.get(this.memory);
   }

   @Override
   public long atime() {
      return layout.st_atime.get(this.memory);
   }

   @Override
   public int uid() {
      return (int)layout.st_uid.get(this.memory);
   }

   @Override
   public long ctime() {
      return layout.st_ctime.get(this.memory);
   }

   @Override
   public int mode() {
      return (int)(layout.st_mode.get(this.memory) & 65535L);
   }

   @Override
   public long mtime() {
      return layout.st_mtime.get(this.memory);
   }

   @Override
   public long ino() {
      return layout.st_ino.get(this.memory);
   }

   @Override
   public long dev() {
      return layout.st_dev.get(this.memory);
   }

   @Override
   public long rdev() {
      return layout.st_rdev.get(this.memory);
   }

   @Override
   public long cTimeNanoSecs() {
      return layout.st_ctimensec.get(this.memory);
   }

   @Override
   public int nlink() {
      return (int)layout.st_nlink.get(this.memory);
   }

   @Override
   public long blocks() {
      return layout.st_blocks.get(this.memory);
   }

   @Override
   public long mTimeNanoSecs() {
      return layout.st_mtimensec.get(this.memory);
   }

   @Override
   public long aTimeNanoSecs() {
      return layout.st_atimensec.get(this.memory);
   }

   // $VF: Compiled from OpenBSDFileStat.java
   private static final class Layout extends StructLayout {
      public final StructLayout.Unsigned32 st_nlink;
      public final StructLayout.Signed64 st_blocks;
      public final StructLayout.Unsigned32 st_blksize;
      public final StructLayout.SignedLong st_birthtimensec;
      public final StructLayout.Unsigned32 st_flags;
      public final StructLayout.Unsigned64 st_ino;
      public final StructLayout.SignedLong st_atimensec;
      public final OpenBSDFileStat.Layout.time_t st_birthtime;
      public final StructLayout.SignedLong st_ctimensec;
      public final OpenBSDFileStat.Layout.time_t st_ctime;
      public final StructLayout.SignedLong st_mtimensec;
      public final StructLayout.Unsigned32 st_gen;
      public final StructLayout.Unsigned32 st_gid;
      public final OpenBSDFileStat.Layout.time_t st_atime;
      public final OpenBSDFileStat.Layout.dev_t st_rdev;
      public final StructLayout.Unsigned32 st_mode = new StructLayout.Unsigned32();
      public final OpenBSDFileStat.Layout.time_t st_mtime;
      public final OpenBSDFileStat.Layout.dev_t st_dev = new OpenBSDFileStat.Layout.dev_t();
      public final StructLayout.Signed64 st_size;
      public final StructLayout.Unsigned32 st_uid;

      private Layout(Runtime runtime) {
         super(runtime);
         this.st_ino = new StructLayout.Unsigned64();
         this.st_nlink = new StructLayout.Unsigned32();
         this.st_uid = new StructLayout.Unsigned32();
         this.st_gid = new StructLayout.Unsigned32();
         this.st_rdev = new OpenBSDFileStat.Layout.dev_t();
         this.st_atime = new OpenBSDFileStat.Layout.time_t();
         this.st_atimensec = new StructLayout.SignedLong();
         this.st_mtime = new OpenBSDFileStat.Layout.time_t();
         this.st_mtimensec = new StructLayout.SignedLong();
         this.st_ctime = new OpenBSDFileStat.Layout.time_t();
         this.st_ctimensec = new StructLayout.SignedLong();
         this.st_size = new StructLayout.Signed64();
         this.st_blocks = new StructLayout.Signed64();
         this.st_blksize = new StructLayout.Unsigned32();
         this.st_flags = new StructLayout.Unsigned32();
         this.st_gen = new StructLayout.Unsigned32();
         this.st_birthtime = new OpenBSDFileStat.Layout.time_t();
         this.st_birthtimensec = new StructLayout.SignedLong();
      }

      // $VF: Compiled from OpenBSDFileStat.java
      public final class dev_t extends StructLayout.Signed32 {
      }

      // $VF: Compiled from OpenBSDFileStat.java
      public final class time_t extends StructLayout.Signed64 {
      }
   }
}
