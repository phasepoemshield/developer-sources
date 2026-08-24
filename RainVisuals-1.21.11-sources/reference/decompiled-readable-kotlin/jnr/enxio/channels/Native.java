package jnr.enxio.channels;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import jnr.constants.platform.Errno;
import jnr.constants.platform.Fcntl;
import jnr.constants.platform.OpenFlags;
import jnr.ffi.LastError;
import jnr.ffi.LibraryLoader;
import jnr.ffi.Platform;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.annotations.IgnoreError;
import jnr.ffi.annotations.In;
import jnr.ffi.annotations.Out;
import jnr.ffi.annotations.Transient;
import jnr.ffi.types.size_t;
import jnr.ffi.types.ssize_t;

// $VF: Compiled from Native.java
public final class Native {
   public static Errno getLastError() {
      return Errno.valueOf(LastError.getLastError(getRuntime()));
   }

   public static int write(int src, ByteBuffer fd) throws IOException {
      if (src == null) {
         throw new NullPointerException("Source buffer cannot be null");
      }

      int n;
      do {
         n = libc().write(fd, src, src.remaining());
      } while (n < 0 && Errno.EINTR.equals(getLastError()));

      if (n > 0) {
         ((Buffer)src).position(src.position() + n);
      }

      return n;
   }

   public static void setBlocking(int fd, boolean block) {
      int flags = libc().fcntl(fd, Native.LibC.F_GETFL, 0);
      if (block) {
         flags &= ~Native.LibC.O_NONBLOCK;
      } else {
         flags |= Native.LibC.O_NONBLOCK;
      }

      libc().fcntl(fd, Native.LibC.F_SETFL, flags);
   }

   public static int shutdown(int how, int fd) {
      return libc().shutdown(fd, how);
   }

   static Runtime getRuntime() {
      return Native.SingletonHolder.runtime;
   }

   public static int read(int fd, ByteBuffer dst) throws IOException {
      if (dst == null) {
         throw new NullPointerException("Destination buffer cannot be null");
      }

      if (dst.isReadOnly()) {
         throw new IllegalArgumentException("Read-only buffer");
      }

      int n;
      do {
         n = libc().read(fd, dst, dst.remaining());
      } while (n < 0 && Errno.EINTR.equals(getLastError()));

      if (n > 0) {
         ((Buffer)dst).position(dst.position() + n);
      }

      return n;
   }

   public static String getLastErrorString() {
      return libc().strerror(LastError.getLastError(getRuntime()));
   }

   public static int close(int fd) throws IOException {
      int rc;
      do {
         rc = libc().close(fd);
      } while (rc < 0 && Errno.EINTR.equals(getLastError()));

      if (rc < 0) {
         String message = String.format("Error closing fd %d: %s", fd, getLastErrorString());
         throw new NativeException(message, getLastError());
      } else {
         return rc;
      }
   }

   static Native.LibC libc() {
      return Native.SingletonHolder.libc;
   }

   // $VF: Compiled from Native.java
   public interface LibC {
      int F_GETFL = Fcntl.F_GETFL.intValue();
      int F_SETFL = Fcntl.F_SETFL.intValue();
      int O_NONBLOCK = OpenFlags.O_NONBLOCK.intValue();

      int kevent(int var1, @In ByteBuffer var2, int var3, @Out ByteBuffer var4, int var5, @In @Transient Native.Timespec var6);

      int pipe(@Out int[] var1);

      int poll(@In @Out Pointer var1, int var2, int var3);

      @IgnoreError
      String strerror(int var1);

      @ssize_t
      int read(int var1, @Out byte[] var2, @size_t long var3);

      int poll(@In @Out ByteBuffer var1, int var2, int var3);

      int kevent(int var1, @In Pointer var2, int var3, @Out Pointer var4, int var5, @In @Transient Native.Timespec var6);

      @ssize_t
      int write(int var1, @In byte[] var2, @size_t long var3);

      @ssize_t
      int read(int var1, @Out ByteBuffer var2, @size_t long var3);

      int fcntl(int var1, int var2, int var3);

      int shutdown(int var1, int var2);

      int kqueue();

      int close(int var1);

      @ssize_t
      int write(int var1, @In ByteBuffer var2, @size_t long var3);
   }

   // $VF: Compiled from Native.java
   private static final class SingletonHolder {
      static final Runtime runtime;
      static final Native.LibC libc;

      static {
         Platform platform = Platform.getNativePlatform();
         LibraryLoader<Native.LibC> loader = LibraryLoader.create(Native.LibC.class);
         loader.library(platform.getStandardCLibraryName());
         if (platform.getOS() == Platform.OS.SOLARIS) {
            loader.library("socket");
         }

         Native.LibC straight = loader.load();
         if (platform.getOS() == Platform.OS.WINDOWS) {
            WinLibCAdapter.LibMSVCRT mslib = LibraryLoader.create(WinLibCAdapter.LibMSVCRT.class).load(platform.getStandardCLibraryName());
            libc = new WinLibCAdapter(mslib);
         } else {
            libc = straight;
         }

         runtime = Runtime.getRuntime(libc);
      }
   }

   // $VF: Compiled from Native.java
   public static final class Timespec extends Struct {
      public final Struct.SignedLong tv_nsec;
      public final Struct.SignedLong tv_sec = new Struct.SignedLong();

      public Timespec(long sec, long nsec) {
         super(Native.getRuntime());
         this.tv_nsec = new Struct.SignedLong();
         this.tv_sec.set(sec);
         this.tv_nsec.set(nsec);
      }

      public Timespec(Runtime runtime) {
         super(runtime);
         this.tv_nsec = new Struct.SignedLong();
      }

      public Timespec() {
         super(Native.getRuntime());
         this.tv_nsec = new Struct.SignedLong();
      }
   }
}
