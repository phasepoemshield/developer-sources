package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from LinuxFileStat32.java
public final class LinuxFileStat32 extends BaseFileStat implements NanosecondFileStat {
   private static final LinuxFileStat32.Layout layout = new LinuxFileStat32.Layout(Runtime.getSystemRuntime());

   @Override
   public long ctime() {
      return layout.st_ctim_sec.get(this.memory);
   }

   @Override
   public long rdev() {
      return layout.st_rdev.get(this.memory);
   }

   @Override
   public long mtime() {
      return layout.st_mtim_sec.get(this.memory);
   }

   @Override
   public long blockSize() {
      return layout.st_blksize.get(this.memory);
   }

   @Override
   public long aTimeNanoSecs() {
      return layout.st_atim_nsec.get(this.memory);
   }

   @Override
   public long atime() {
      return layout.st_atim_sec.get(this.memory);
   }

   @Override
   public long mTimeNanoSecs() {
      return layout.st_mtim_nsec.get(this.memory);
   }

   @Override
   public long st_size() {
      return layout.st_size.get(this.memory);
   }

   @Override
   public int gid() {
      return layout.st_gid.get(this.memory);
   }

   @Override
   public long blocks() {
      return layout.st_blocks.get(this.memory);
   }

   @Override
   public int nlink() {
      return layout.st_nlink.get(this.memory);
   }

   public LinuxFileStat32() {
      this(null);
   }

   public LinuxFileStat32(BaseNativePOSIX posix) {
      super(posix, layout);
   }

   @Override
   public long dev() {
      return layout.st_dev.get(this.memory);
   }

   @Override
   public long cTimeNanoSecs() {
      return layout.st_ctim_nsec.get(this.memory);
   }

   @Override
   public long ino() {
      return layout.st_ino.get(this.memory);
   }

   @Override
   public int mode() {
      return layout.st_mode.get(this.memory) & 65535;
   }

   @Override
   public int uid() {
      return layout.st_uid.get(this.memory);
   }

   // $VF: Compiled from LinuxFileStat32.java
   private static final class Layout extends StructLayout {
      public final StructLayout.Signed32 st_mode;
      public final StructLayout.Signed32 st_blocks;
      public final StructLayout.Signed32 st_atim_nsec;
      public final StructLayout.Signed32 st_atim_sec;
      public final StructLayout.Signed64 st_rdev;
      public final StructLayout.Signed32 st_nlink;
      public final StructLayout.Signed32 st_uid;
      public final StructLayout.Signed16 __pad2;
      public final StructLayout.Signed32 st_gid;
      public final StructLayout.Signed32 st_ctim_sec;
      public final StructLayout.Signed16 __pad1;
      public final StructLayout.Signed64 st_size;
      public final StructLayout.Signed32 st_blksize;
      public final StructLayout.Signed64 st_dev = new StructLayout.Signed64();
      public final StructLayout.Signed32 st_ino;
      public final StructLayout.Signed32 st_ctim_nsec;
      public final StructLayout.Signed32 __unused4;
      public final StructLayout.Signed32 st_mtim_nsec;
      public final StructLayout.Signed64 __unused5;
      public final StructLayout.Signed32 st_mtim_sec;

      private Layout(Runtime runtime) {
         super(runtime);
         this.__pad1 = new StructLayout.Signed16();
         this.st_ino = new StructLayout.Signed32();
         this.st_mode = new StructLayout.Signed32();
         this.st_nlink = new StructLayout.Signed32();
         this.st_uid = new StructLayout.Signed32();
         this.st_gid = new StructLayout.Signed32();
         this.st_rdev = new StructLayout.Signed64();
         this.__pad2 = new StructLayout.Signed16();
         this.st_size = new StructLayout.Signed64();
         this.st_blksize = new StructLayout.Signed32();
         this.st_blocks = new StructLayout.Signed32();
         this.__unused4 = new StructLayout.Signed32();
         this.st_atim_sec = new StructLayout.Signed32();
         this.st_atim_nsec = new StructLayout.Signed32();
         this.st_mtim_sec = new StructLayout.Signed32();
         this.st_mtim_nsec = new StructLayout.Signed32();
         this.st_ctim_sec = new StructLayout.Signed32();
         this.st_ctim_nsec = new StructLayout.Signed32();
         this.__unused5 = new StructLayout.Signed64();
      }
   }
}
