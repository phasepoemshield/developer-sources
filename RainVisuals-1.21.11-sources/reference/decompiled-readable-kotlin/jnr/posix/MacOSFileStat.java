package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from MacOSFileStat.java
public final class MacOSFileStat extends BaseFileStat implements NanosecondFileStat {
   private static final MacOSFileStat.Layout layout = new MacOSFileStat.Layout(Runtime.getSystemRuntime());

   @Override
   public long ino() {
      return layout.st_ino.get(this.memory);
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
   public long dev() {
      return layout.st_dev.get(this.memory);
   }

   @Override
   public long blockSize() {
      return layout.st_blksize.get(this.memory);
   }

   public MacOSFileStat(MacOSPOSIX posix) {
      super(posix, layout);
   }

   @Override
   public int gid() {
      return layout.st_gid.get(this.memory);
   }

   @Override
   public int mode() {
      return layout.st_mode.get(this.memory) & 65535;
   }

   @Override
   public long mTimeNanoSecs() {
      return layout.st_mtimensec.get(this.memory);
   }

   @Override
   public int nlink() {
      return layout.st_nlink.get(this.memory);
   }

   @Override
   public long mtime() {
      return layout.st_mtime.get(this.memory);
   }

   @Override
   public int uid() {
      return layout.st_uid.get(this.memory);
   }

   @Override
   public long cTimeNanoSecs() {
      return layout.st_ctimensec.get(this.memory);
   }

   @Override
   public long ctime() {
      return layout.st_ctime.get(this.memory);
   }

   @Override
   public long rdev() {
      return layout.st_rdev.get(this.memory);
   }

   @Override
   public long blocks() {
      return layout.st_blocks.get(this.memory);
   }

   @Override
   public long atime() {
      return layout.st_atime.get(this.memory);
   }

   // $VF: Compiled from MacOSFileStat.java
   public static class Layout extends StructLayout {
      public final StructLayout.Signed32 st_gen;
      public final MacOSFileStat.Layout.time_t st_ctime;
      public final StructLayout.SignedLong st_atimensec;
      public final StructLayout.Signed32 st_ino;
      public final StructLayout.Signed32 st_uid;
      public final StructLayout.Signed32 st_lspare;
      public final StructLayout.Signed64 st_size;
      public final StructLayout.SignedLong st_ctimensec;
      public final MacOSFileStat.Layout.time_t st_atime;
      public final StructLayout.Signed64 st_qspare0;
      public final StructLayout.Signed16 st_mode;
      public final StructLayout.Signed32 st_rdev;
      public final StructLayout.Signed64 st_blocks;
      public final StructLayout.SignedLong st_mtimensec;
      public final StructLayout.Signed32 st_blksize;
      public final StructLayout.Signed16 st_nlink;
      public final StructLayout.Signed32 st_flags;
      public final StructLayout.Signed64 st_qspare1;
      public final StructLayout.Signed32 st_dev = new StructLayout.Signed32();
      public final StructLayout.Signed32 st_gid;
      public final MacOSFileStat.Layout.time_t st_mtime;

      public Layout(Runtime runtime) {
         super(runtime);
         this.st_ino = new StructLayout.Signed32();
         this.st_mode = new StructLayout.Signed16();
         this.st_nlink = new StructLayout.Signed16();
         this.st_uid = new StructLayout.Signed32();
         this.st_gid = new StructLayout.Signed32();
         this.st_rdev = new StructLayout.Signed32();
         this.st_atime = new MacOSFileStat.Layout.time_t();
         this.st_atimensec = new StructLayout.SignedLong();
         this.st_mtime = new MacOSFileStat.Layout.time_t();
         this.st_mtimensec = new StructLayout.SignedLong();
         this.st_ctime = new MacOSFileStat.Layout.time_t();
         this.st_ctimensec = new StructLayout.SignedLong();
         this.st_size = new StructLayout.Signed64();
         this.st_blocks = new StructLayout.Signed64();
         this.st_blksize = new StructLayout.Signed32();
         this.st_flags = new StructLayout.Signed32();
         this.st_gen = new StructLayout.Signed32();
         this.st_lspare = new StructLayout.Signed32();
         this.st_qspare0 = new StructLayout.Signed64();
         this.st_qspare1 = new StructLayout.Signed64();
      }

      // $VF: Compiled from MacOSFileStat.java
      public final class time_t extends StructLayout.SignedLong {
      }
   }
}
