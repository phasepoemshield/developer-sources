package jnr.posix;

import jnr.ffi.Memory;
import jnr.ffi.Pointer;
import jnr.ffi.StructLayout;

// $VF: Compiled from BaseFileStat.java
public abstract class BaseFileStat implements FileStat {
   protected final Pointer memory;
   protected final POSIX posix;

   @Override
   public boolean isNamedPipe() {
      return (this.mode() & 4096) != 0;
   }

   @Override
   public boolean isGroupOwned() {
      return this.groupMember(this.gid());
   }

   @Override
   public int minor(long dev) {
      return (int)(dev & 16777215L);
   }

   @Override
   public boolean isWritableReal() {
      if (this.posix.getuid() == 0) {
         return true;
      } else if (this.isROwned()) {
         return (this.mode() & 128) != 0;
      } else {
         return this.groupMember(this.gid()) ? (this.mode() & 16) != 0 : (this.mode() & 2) != 0;
      }
   }

   @Override
   public int major(long dev) {
      return (int)(dev >> 24) & 0xFF;
   }

   @Override
   public boolean isEmpty() {
      return this.st_size() == 0L;
   }

   @Override
   public boolean isReadableReal() {
      if (this.posix.getuid() == 0) {
         return true;
      } else if (this.isROwned()) {
         return (this.mode() & 256) != 0;
      } else {
         return this.groupMember(this.gid()) ? (this.mode() & 32) != 0 : (this.mode() & 4) != 0;
      }
   }

   @Override
   public boolean isDirectory() {
      return (this.mode() & 61440) == 16384;
   }

   @Override
   public boolean isBlockDev() {
      return (this.mode() & 61440) == 24576;
   }

   @Override
   public boolean isSymlink() {
      return (this.mode() & 61440) == 40960;
   }

   @Override
   public boolean isCharDev() {
      return (this.mode() & 61440) == 8192;
   }

   @Override
   public boolean isIdentical(FileStat other) {
      return this.dev() == other.dev() && this.ino() == other.ino();
   }

   protected BaseFileStat(NativePOSIX layout, StructLayout posix) {
      this.posix = posix;
      this.memory = Memory.allocate(posix.getRuntime(), layout.size());
   }

   @Override
   public boolean isROwned() {
      return this.posix.getuid() == this.uid();
   }

   @Override
   public boolean isSocket() {
      return (this.mode() & 61440) == 49152;
   }

   @Override
   public boolean isSticky() {
      return (this.mode() & 512) != 0;
   }

   @Override
   public String ftype() {
      if (this.isFile()) {
         return "file";
      } else if (this.isDirectory()) {
         return "directory";
      } else if (this.isCharDev()) {
         return "characterSpecial";
      } else if (this.isBlockDev()) {
         return "blockSpecial";
      } else if (this.isFifo()) {
         return "fifo";
      } else if (this.isSymlink()) {
         return "link";
      } else {
         return this.isSocket() ? "socket" : "unknown";
      }
   }

   @Override
   public boolean isWritable() {
      if (this.posix.geteuid() == 0) {
         return true;
      } else if (this.isOwned()) {
         return (this.mode() & 128) != 0;
      } else {
         return this.isGroupOwned() ? (this.mode() & 16) != 0 : (this.mode() & 2) != 0;
      }
   }

   @Override
   public boolean isFifo() {
      return (this.mode() & 61440) == 4096;
   }

   @Override
   public boolean isFile() {
      return (this.mode() & 61440) == 32768;
   }

   @Override
   public boolean groupMember(int gid) {
      return this.posix.getgid() == gid || this.posix.getegid() == gid;
   }

   @Override
   public boolean isExecutableReal() {
      if (this.posix.getuid() == 0) {
         return (this.mode() & 73) != 0;
      } else if (this.isROwned()) {
         return (this.mode() & 64) != 0;
      } else {
         return this.groupMember(this.gid()) ? (this.mode() & 8) != 0 : (this.mode() & 1) != 0;
      }
   }

   @Override
   public boolean isOwned() {
      return this.posix.geteuid() == this.uid();
   }

   @Override
   public boolean isExecutable() {
      if (this.posix.geteuid() == 0) {
         return (this.mode() & 73) != 0;
      } else if (this.isOwned()) {
         return (this.mode() & 64) != 0;
      } else {
         return this.isGroupOwned() ? (this.mode() & 8) != 0 : (this.mode() & 1) != 0;
      }
   }

   @Override
   public boolean isSetgid() {
      return (this.mode() & 1024) != 0;
   }

   @Override
   public boolean isReadable() {
      if (this.posix.geteuid() == 0) {
         return true;
      } else if (this.isOwned()) {
         return (this.mode() & 256) != 0;
      } else {
         return this.isGroupOwned() ? (this.mode() & 32) != 0 : (this.mode() & 4) != 0;
      }
   }

   @Override
   public boolean isSetuid() {
      return (this.mode() & 2048) != 0;
   }
}
