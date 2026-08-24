package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from SolarisFileStat64.java
public class SolarisFileStat64 extends BaseFileStat implements NanosecondFileStat {
   private static final SolarisFileStat64.Layout layout = new SolarisFileStat64.Layout(Runtime.getSystemRuntime());

   public SolarisFileStat64(NativePOSIX posix) {
      super(posix, layout);
   }

   @Override
   public long cTimeNanoSecs() {
      return layout.st_ctim_nsec.get(this.memory);
   }

   @Override
   public int nlink() {
      return layout.st_nlink.get(this.memory);
   }

   @Override
   public long blocks() {
      return layout.st_blocks.get(this.memory);
   }

   @Override
   public long blockSize() {
      return layout.st_blksize.get(this.memory);
   }

   @Override
   public long mtime() {
      return layout.st_mtim_sec.get(this.memory);
   }

   public SolarisFileStat64() {
      this(null);
   }

   @Override
   public int uid() {
      return layout.st_uid.get(this.memory);
   }

   @Override
   public long aTimeNanoSecs() {
      return layout.st_atim_nsec.get(this.memory);
   }

   @Override
   public int mode() {
      return layout.st_mode.get(this.memory) & 65535;
   }

   @Override
   public long rdev() {
      return layout.st_rdev.get(this.memory);
   }

   @Override
   public long mTimeNanoSecs() {
      return layout.st_mtim_nsec.get(this.memory);
   }

   @Override
   public int gid() {
      return layout.st_gid.get(this.memory);
   }

   @Override
   public long st_size() {
      return layout.st_size.get(this.memory);
   }

   @Override
   public long ctime() {
      return layout.st_ctim_sec.get(this.memory);
   }

   @Override
   public long atime() {
      return layout.st_atim_sec.get(this.memory);
   }

   @Override
   public long dev() {
      return layout.st_dev.get(this.memory);
   }

   @Override
   public long ino() {
      return layout.st_ino.get(this.memory);
   }

   // $VF: Compiled from SolarisFileStat64.java
   static final class Layout extends StructLayout {
      public final StructLayout.Signed32 st_nlink;
      public final StructLayout.UnsignedLong st_dev = new StructLayout.UnsignedLong();
      public final StructLayout.Signed64 st_size;
      public final StructLayout.SignedLong st_ctim_sec;
      public final StructLayout.Signed64 st_ino = new StructLayout.Signed64();
      public final StructLayout.Signed8[] st_fstype;
      public final StructLayout.SignedLong st_atim_nsec;
      public final StructLayout.UnsignedLong st_rdev;
      public final StructLayout.SignedLong st_mtim_sec;
      public final StructLayout.Signed32 st_mode = new StructLayout.Signed32();
      public final StructLayout.Signed32 st_uid;
      public final StructLayout.Signed32 st_gid;
      public static final int _ST_FSTYPSZ = 16;
      public final StructLayout.Signed32 st_blksize;
      public final StructLayout.SignedLong st_atim_sec;
      public final StructLayout.SignedLong st_mtim_nsec;
      public final StructLayout.Signed64 st_blocks;
      public final StructLayout.SignedLong st_ctim_nsec;

      Layout(Runtime runtime) {
         super(runtime);
         this.st_nlink = new StructLayout.Signed32();
         this.st_uid = new StructLayout.Signed32();
         this.st_gid = new StructLayout.Signed32();
         this.st_rdev = new StructLayout.UnsignedLong();
         this.st_size = new StructLayout.Signed64();
         this.st_atim_sec = new StructLayout.SignedLong();
         this.st_atim_nsec = new StructLayout.SignedLong();
         this.st_mtim_sec = new StructLayout.SignedLong();
         this.st_mtim_nsec = new StructLayout.SignedLong();
         this.st_ctim_sec = new StructLayout.SignedLong();
         this.st_ctim_nsec = new StructLayout.SignedLong();
         this.st_blksize = new StructLayout.Signed32();
         this.st_blocks = new StructLayout.Signed64();
         this.st_fstype = this.array(new StructLayout.Signed8[16]);
      }
   }
}
