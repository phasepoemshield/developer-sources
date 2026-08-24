package jnr.posix.windows;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from WindowsFileInformation.java
public class WindowsFileInformation extends CommonFileInformation {
   final Struct.UnsignedLong ulow;
   final Struct.UnsignedLong uhigh;
   final Struct.UnsignedLong ahigh;
   final Struct.UnsignedLong dwFileAttributes = new Struct.UnsignedLong();
   final Struct.UnsignedLong nFileSizeHigh;
   final Struct.UnsignedLong nFileSizeLow;
   final Struct.UnsignedLong chigh;
   final Struct.UnsignedLong clow = new Struct.UnsignedLong();
   final Struct.UnsignedLong alow;

   @Override
   public long getFileSizeLow() {
      return this.nFileSizeLow.longValue();
   }

   public WindowsFileInformation(Runtime runtime) {
      super(runtime);
      this.chigh = new Struct.UnsignedLong();
      this.alow = new Struct.UnsignedLong();
      this.ahigh = new Struct.UnsignedLong();
      this.ulow = new Struct.UnsignedLong();
      this.uhigh = new Struct.UnsignedLong();
      this.nFileSizeHigh = new Struct.UnsignedLong();
      this.nFileSizeLow = new Struct.UnsignedLong();
   }

   @Override
   public CommonFileInformation.HackyFileTime getLastWriteTime() {
      return new CommonFileInformation.HackyFileTime(this.uhigh, this.ulow);
   }

   @Override
   public CommonFileInformation.HackyFileTime getCreationTime() {
      return new CommonFileInformation.HackyFileTime(this.chigh, this.clow);
   }

   @Override
   public long getFileSizeHigh() {
      return this.nFileSizeHigh.longValue();
   }

   @Override
   public CommonFileInformation.HackyFileTime getLastAccessTime() {
      return new CommonFileInformation.HackyFileTime(this.ahigh, this.alow);
   }

   @Override
   public int getFileAttributes() {
      return this.dwFileAttributes.intValue();
   }
}
