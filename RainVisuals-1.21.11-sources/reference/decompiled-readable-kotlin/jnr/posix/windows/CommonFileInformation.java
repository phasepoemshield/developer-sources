package jnr.posix.windows;

import jnr.ffi.Runtime;
import jnr.ffi.Struct;

// $VF: Compiled from CommonFileInformation.java
public abstract class CommonFileInformation extends Struct {
   public static final int NANOSECONDS = 1000000000;
   public static int FILE_ATTRIBUTE_DIRECTORY = 16;
   public static int FILE_ATTRIBUTE_READONLY = 1;
   private static final double DAYS_BETWEEN_WINDOWS_AND_UNIX = 134774.4825;
   private static final long NANOSECONDS_TO_UNIX_EPOCH_FROM_WINDOWS = -6802270473709551616L;

   public static long asNanoSeconds(long seconds) {
      return (seconds * 1000L + -6802270473709551L) * 10L;
   }

   public long getLastAccessTimeNanoseconds() {
      return this.epochNanos(this.getLastAccessTime().getLongValue());
   }

   public long getFileSize() {
      return this.getFileSizeHigh() << 32 | this.getFileSizeLow();
   }

   public long getLastWriteTimeNanoseconds() {
      return this.epochNanos(this.getLastWriteTime().getLongValue());
   }

   public abstract long getFileSizeLow();

   public int getMode(java.lang.String path) {
      int attr = this.getFileAttributes();
      int mode = 256;
      if ((attr & FILE_ATTRIBUTE_READONLY) == 0) {
         mode |= 128;
      }

      mode |= (attr & FILE_ATTRIBUTE_DIRECTORY) != 0 ? 16448 : 32768;
      path = path.toLowerCase();
      if (path != null && (mode & 32768) != 0 && (path.endsWith(".bat") || path.endsWith(".cmd") || path.endsWith(".com") || path.endsWith(".exe"))) {
         mode |= 64;
      }

      mode |= (mode & 448) >> 3;
      return mode | (mode & 448) >> 6;
   }

   public abstract int getFileAttributes();

   private long epochNanos(long windowsNanoChunks) {
      return windowsNanoChunks * 100L - -6802270473709551616L;
   }

   public abstract CommonFileInformation.HackyFileTime getLastWriteTime();

   public abstract long getFileSizeHigh();

   public abstract CommonFileInformation.HackyFileTime getLastAccessTime();

   public abstract CommonFileInformation.HackyFileTime getCreationTime();

   public long getCreationTimeNanoseconds() {
      return this.epochNanos(this.getCreationTime().getLongValue());
   }

   protected CommonFileInformation(Runtime runtime) {
      super(runtime);
   }

   // $VF: Compiled from CommonFileInformation.java
   public class HackyFileTime {
      private final Struct.UnsignedLong dwHighDateTime;
      private final Struct.UnsignedLong dwLowDateTime;

      public HackyFileTime(Struct.UnsignedLong low, Struct.UnsignedLong high) {
         this.dwHighDateTime = high;
         this.dwLowDateTime = low;
      }

      public long getLowDateTime() {
         return this.dwLowDateTime.longValue();
      }

      public long getLongValue() {
         return (this.getHighDateTime() & 4294967295L) << 32 | this.getLowDateTime() & 4294967295L;
      }

      public long getHighDateTime() {
         return this.dwHighDateTime.longValue();
      }
   }
}
