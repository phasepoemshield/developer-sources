package jnr.posix;

import jnr.ffi.Runtime;
import jnr.ffi.StructLayout;

// $VF: Compiled from WindowsFileStat.java
public class WindowsFileStat extends BaseFileStat {
   private static final WindowsFileStat.Layout layout = new WindowsFileStat.Layout(Runtime.getSystemRuntime());

   @Override
   public int mode() {
      return layout.st_mode.get(this.memory) & -19 & 65535;
   }

   @Override
   public int nlink() {
      return layout.st_nlink.get(this.memory);
   }

   @Override
   public long ctime() {
      return layout.st_ctime.get(this.memory);
   }

   @Override
   public long dev() {
      return layout.st_dev.get(this.memory);
   }

   public WindowsFileStat(NativePOSIX posix) {
      super(posix, layout);
   }

   @Override
   public long mtime() {
      return layout.st_mtime.get(this.memory);
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
   public long blocks() {
      return (layout.st_size.get(this.memory) + 512L - 1L) / 512L;
   }

   @Override
   public long st_size() {
      return layout.st_size.get(this.memory);
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
   public long atime() {
      return layout.st_atime.get(this.memory);
   }

   @Override
   public long ino() {
      return layout.st_ino.get(this.memory);
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
   public long blockSize() {
      return 512L;
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
   public long rdev() {
      return layout.st_rdev.get(this.memory);
   }

   @Override
   public int gid() {
      return layout.st_gid.get(this.memory);
   }

   @Override
   public boolean groupMember(int gid) {
      return true;
   }

   @Override
   public int uid() {
      return layout.st_uid.get(this.memory);
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
   public boolean isReadableReal() {
      if (this.isROwned()) {
         return (this.mode() & 256) != 0;
      } else {
         return this.groupMember(this.gid()) ? (this.mode() & 32) != 0 : (this.mode() & 4) == 0;
      }
   }

   @Override
   public String toString() {
      return "st_dev: "
         + layout.st_dev.get(this.memory)
         + ", st_mode: "
         + Integer.toOctalString(this.mode())
         + ", layout.st_nlink: "
         + layout.st_nlink.get(this.memory)
         + ", layout.st_rdev: "
         + layout.st_rdev.get(this.memory)
         + ", layout.st_size: "
         + layout.st_size.get(this.memory)
         + ", layout.st_uid: "
         + layout.st_uid.get(this.memory)
         + ", layout.st_gid: "
         + layout.st_gid.get(this.memory)
         + ", layout.st_atime: "
         + layout.st_atime.get(this.memory)
         + ", layout.st_ctime: "
         + layout.st_ctime.get(this.memory)
         + ", layout.st_mtime: "
         + layout.st_mtime.get(this.memory)
         + ", layout.st_ino: "
         + layout.st_ino.get(this.memory);
   }

   @Override
   public boolean isROwned() {
      return true;
   }

   @Override
   public boolean isOwned() {
      return true;
   }

   // $VF: Compiled from WindowsFileStat.java
   private static final class Layout extends StructLayout {
      public final StructLayout.Signed64 st_size;
      public final StructLayout.Signed16 st_ino;
      public final StructLayout.Signed64 st_mtime;
      public final StructLayout.Signed32 st_rdev;
      public final StructLayout.Signed16 st_mode;
      public final StructLayout.Signed64 st_ctime;
      public final StructLayout.Signed32 st_dev = new StructLayout.Signed32();
      public final StructLayout.Signed16 st_nlink;
      public final StructLayout.Signed64 st_atime;
      public final StructLayout.Signed16 st_uid;
      public final StructLayout.Signed16 st_gid;

      private Layout(Runtime runtime) {
         super(runtime);
         this.st_ino = new StructLayout.Signed16();
         this.st_mode = new StructLayout.Signed16();
         this.st_nlink = new StructLayout.Signed16();
         this.st_uid = new StructLayout.Signed16();
         this.st_gid = new StructLayout.Signed16();
         this.st_rdev = new StructLayout.Signed32();
         this.st_size = new StructLayout.Signed64();
         this.st_atime = new StructLayout.Signed64();
         this.st_mtime = new StructLayout.Signed64();
         this.st_ctime = new StructLayout.Signed64();
      }
   }
}
