package jnr.posix.windows;

import jnr.ffi.NativeType;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from WindowsFindData.java
public class WindowsFindData extends CommonFileInformation {
   final Struct.UnsignedLong ahigh;
   final Struct.UnsignedLong nFileSizeLow;
   final Struct.UnsignedLong ulow;
   final Struct.UnsignedLong dwReserved1;
   final Struct.UnsignedLong uhigh;
   public static final int MAX_PATH = 260;
   final Struct.UnsignedLong nFileSizeHigh;
   final Struct.UnsignedLong alow;
   final Struct.UnsignedLong chigh;
   final Struct.Padding cFileName;
   final Struct.Padding cAlternateFileName;
   final Struct.UnsignedLong dwFileAttributes = new Struct.UnsignedLong();
   final Struct.UnsignedLong clow = new Struct.UnsignedLong();
   final Struct.UnsignedLong dwReserved0;

   @Override
   public long getFileSizeLow() {
      return this.nFileSizeLow.longValue();
   }

   @Override
   public CommonFileInformation.HackyFileTime getCreationTime() {
      return new CommonFileInformation.HackyFileTime(this.chigh, this.clow);
   }

   @Override
   public CommonFileInformation.HackyFileTime getLastWriteTime() {
      return new CommonFileInformation.HackyFileTime(this.uhigh, this.ulow);
   }

   @Override
   public int getFileAttributes() {
      return this.dwFileAttributes.intValue();
   }

   @Override
   public long getFileSizeHigh() {
      return this.nFileSizeHigh.longValue();
   }

   public WindowsFindData(Runtime runtime) {
      super(runtime);
      this.chigh = new Struct.UnsignedLong();
      this.alow = new Struct.UnsignedLong();
      this.ahigh = new Struct.UnsignedLong();
      this.ulow = new Struct.UnsignedLong();
      this.uhigh = new Struct.UnsignedLong();
      this.nFileSizeHigh = new Struct.UnsignedLong();
      this.nFileSizeLow = new Struct.UnsignedLong();
      this.dwReserved0 = new Struct.UnsignedLong();
      this.dwReserved1 = new Struct.UnsignedLong();
      this.cFileName = new Struct.Padding(NativeType.USHORT, 32767);
      this.cAlternateFileName = new Struct.Padding(NativeType.USHORT, 14);
   }

   @Override
   public CommonFileInformation.HackyFileTime getLastAccessTime() {
      return new CommonFileInformation.HackyFileTime(this.ahigh, this.alow);
   }
}
