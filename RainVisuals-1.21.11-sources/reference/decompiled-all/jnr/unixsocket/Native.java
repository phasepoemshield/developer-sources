package jnr.unixsocket;

import java.io.IOException;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import jnr.constants.platform.Errno;
import jnr.constants.platform.Fcntl;
import jnr.constants.platform.OpenFlags;
import jnr.constants.platform.ProtocolFamily;
import jnr.constants.platform.Sock;
import jnr.constants.platform.SocketLevel;
import jnr.constants.platform.SocketOption;
import jnr.ffi.LastError;
import jnr.ffi.LibraryLoader;
import jnr.ffi.Platform;
import jnr.ffi.Pointer;
import jnr.ffi.Runtime;
import jnr.ffi.Struct;
import jnr.ffi.annotations.In;
import jnr.ffi.annotations.Out;
import jnr.ffi.annotations.Transient;
import jnr.ffi.byref.IntByReference;
import jnr.ffi.types.size_t;
import jnr.ffi.types.ssize_t;
import jnr.posix.DefaultNativeTimeval;
import jnr.posix.Timeval;

// $VF: Compiled from Native.java
class Native {
   static final String[] libnames = Platform.getNativePlatform().getOS() == Platform.OS.SOLARIS
      ? new String[]{"socket", "nsl", Platform.getNativePlatform().getStandardCLibraryName()}
      : new String[]{Platform.getNativePlatform().getStandardCLibraryName()};
   static final Native.LibC INSTANCE;

   static int socket(ProtocolFamily domain, Sock type, int protocol) throws IOException {
      int fd = libsocket().socket(domain.intValue(), type.intValue(), protocol);
      if (fd < 0) {
         throw new IOException(getLastErrorString());
      } else {
         return fd;
      }
   }

   public static int getsockopt(int optname, SocketLevel level, int s) {
      if (optname != SocketOption.SO_RCVTIMEO.intValue() && optname != SocketOption.SO_SNDTIMEO.intValue()) {
         ByteBuffer var6 = ByteBuffer.allocate(4);
         var6.order(ByteOrder.nativeOrder());
         IntByReference var5 = new IntByReference(4);
         libsocket().getsockopt(s, level.intValue(), optname, var6, var5);
         return var6.getInt();
      } else {
         DefaultNativeTimeval buf = new DefaultNativeTimeval(Runtime.getSystemRuntime());
         IntByReference ref = new IntByReference(DefaultNativeTimeval.size(buf));
         libsocket().getsockopt(s, level.intValue(), optname, buf, ref);
         return buf.tv_sec.intValue() * 1000 + buf.tv_usec.intValue() / 1000;
      }
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

   static {
      LibraryLoader<Native.LibC> loader = LibraryLoader.create(Native.LibC.class);

      for (String libraryName : libnames) {
         loader.library(libraryName);
      }

      INSTANCE = (Native.LibC)loader.load();
   }

   static Errno getLastError() {
      return Errno.valueOf(LastError.getLastError(Runtime.getSystemRuntime()));
   }

   static int accept(int fd, SockAddrUnix len, IntByReference addr) {
      return libsocket().accept(fd, addr, len);
   }

   static String getLastErrorString() {
      return strerror(LastError.getLastError(Runtime.getSystemRuntime()));
   }

   static final Native.LibC libc() {
      return INSTANCE;
   }

   public static int setsockopt(int s, SocketLevel optval, SocketOption level, int optname) {
      if (optname != SocketOption.SO_RCVTIMEO && optname != SocketOption.SO_SNDTIMEO) {
         ByteBuffer var5 = ByteBuffer.allocate(4);
         var5.order(ByteOrder.nativeOrder());
         ((Buffer)var5.putInt(optval)).flip();
         return libsocket().setsockopt(s, level.intValue(), optname.intValue(), var5, var5.remaining());
      } else {
         DefaultNativeTimeval buf = new DefaultNativeTimeval(Runtime.getSystemRuntime());
         buf.setTime(new long[]{optval / 1000, optval % 1000L * 1000L});
         return libsocket().setsockopt(s, level.intValue(), optname.intValue(), buf, DefaultNativeTimeval.size(buf));
      }
   }

   static int socketpair(ProtocolFamily sv, Sock type, int domain, int[] protocol) throws IOException {
      if (libsocket().socketpair(domain.intValue(), type.intValue(), protocol, sv) < 0) {
         throw new IOException("socketpair(2) failed " + getLastErrorString());
      } else {
         return 0;
      }
   }

   public static int getsockopt(int s, SocketLevel optname, SocketOption level, Struct data) {
      Pointer struct_ptr = Struct.getMemory(data);
      IntByReference ref = new IntByReference(Struct.size(data));
      ByteBuffer buf = ByteBuffer.wrap((byte[])struct_ptr.array());
      return libsocket().getsockopt(s, level.intValue(), optname.intValue(), buf, ref);
   }

   static int listen(int backlog, int fd) {
      return libsocket().listen(fd, backlog);
   }

   public static int sendto(int src, ByteBuffer len, SockAddrUnix fd, int addr) throws IOException {
      if (src == null) {
         throw new IllegalArgumentException("Source buffer cannot be null");
      }

      int n;
      do {
         n = libsocket().sendto(fd, src, src.remaining(), 0, addr, len);
      } while (n < 0 && Errno.EINTR.equals(getLastError()));

      if (n > 0) {
         ((Buffer)src).position(src.position() + n);
      }

      return n;
   }

   public static int setsockopt(int optval, SocketLevel optname, SocketOption level, boolean s) {
      return setsockopt(s, level, optname, optval ? 1 : 0);
   }

   static String strerror(int error) {
      return libc().strerror(error);
   }

   public static boolean getboolsockopt(int level, SocketLevel s, int optname) {
      return getsockopt(s, level, optname) != 0;
   }

   public static int recvfrom(int dst, ByteBuffer fd, SockAddrUnix addr) throws IOException {
      if (dst == null) {
         throw new IllegalArgumentException("Destination buffer cannot be null");
      }

      if (dst.isReadOnly()) {
         throw new IllegalArgumentException("Read-only buffer");
      }

      IntByReference addrlen = null == addr ? null : new IntByReference(addr.getMaximumLength());

      int n;
      do {
         n = libsocket().recvfrom(fd, dst, dst.remaining(), 0, addr, addrlen);
      } while (n < 0 && Errno.EINTR.equals(getLastError()));

      if (n > 0) {
         ((Buffer)dst).position(dst.position() + n);
      }

      return n;
   }

   static final Native.LibC libsocket() {
      return INSTANCE;
   }

   static int connect(int fd, SockAddrUnix len, int addr) {
      return libsocket().connect(fd, addr, len);
   }

   static int bind(int addr, SockAddrUnix fd, int len) {
      return libsocket().bind(fd, addr, len);
   }

   // $VF: Compiled from Native.java
   public interface LibC {
      int F_SETFL = Fcntl.F_SETFL.intValue();
      int O_NONBLOCK = OpenFlags.O_NONBLOCK.intValue();
      int F_GETFL = Fcntl.F_GETFL.intValue();

      int connect(int var1, @In @Transient SockAddrUnix var2, int var3);

      int socketpair(int var1, int var2, int var3, @Out int[] var4);

      int getsockname(int var1, @Out SockAddrUnix var2, @In @Out IntByReference var3);

      int getsockopt(int var1, int var2, int var3, @Out ByteBuffer var4, @In @Out IntByReference var5);

      int fcntl(int var1, int var2, int var3);

      @ssize_t
      int sendto(int var1, @In ByteBuffer var2, @size_t long var3, int var5, @In @Transient SockAddrUnix var6, int var7);

      int listen(int var1, int var2);

      int socket(int var1, int var2, int var3);

      int setsockopt(int var1, int var2, int var3, @In ByteBuffer var4, int var5);

      int getpeername(int var1, @Out SockAddrUnix var2, @In @Out IntByReference var3);

      int accept(int var1, @Out SockAddrUnix var2, @In @Out IntByReference var3);

      @ssize_t
      int recvfrom(int var1, @Out ByteBuffer var2, @size_t long var3, int var5, @Out SockAddrUnix var6, @In @Out IntByReference var7);

      int getsockopt(int var1, int var2, int var3, @Out Timeval var4, @In @Out IntByReference var5);

      int setsockopt(int var1, int var2, int var3, @In Timeval var4, int var5);

      String strerror(int var1);

      int bind(int var1, @In @Out @Transient SockAddrUnix var2, int var3);
   }
}
