package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.ExcludeFromCodeCoverageGeneratedReport;
import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.Closeable;
import java.io.FileDescriptor;
import java.io.IOException;
import java.lang.ProcessBuilder.Redirect;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.util.concurrent.atomic.AtomicBoolean;

// $VF: Compiled from NativeUnixSocket.java
final class NativeUnixSocket {
   static final int SOCK_STREAM = 1;
   static final int SOCKETSTATUS_UNKNOWN = 0;
   static final int DOMAIN_SYSTEM = 32;
   static final int SOCKETSTATUS_CONNECTED = 2;
   static final int SOCKETSTATUS_BOUND = 1;
   static final int SHUT_RD = 0;
   static final int SHUT_WR = 1;
   static final int DOMAIN_VSOCK = 40;
   static final int SHUT_RD_WR = 2;
   static final int DOMAIN_GENERIC = -1;
   static final int DOMAIN_UNIX = 1;
   static final int SOCK_RDM = 4;
   private static final AtomicBoolean LOADED = new AtomicBoolean(false);
   static final int OPT_NON_SOCKET = 8;
   static final int OPT_PEEK = 2;
   static final int OPT_LOOKUP_SENDER = 1;
   static final int SOCK_DGRAM = 2;
   static final int BIND_OPT_REUSE = 1;
   private static Throwable initError = null;
   static final int OPT_DGRAM_MODE = 16;
   static final int DOMAIN_TIPC = 30;
   static final int SOCK_SEQPACKET = 5;
   static final int OPT_NON_BLOCKING = 4;
   static final int SOCK_RAW = 3;
   static final int SOCKETSTATUS_INVALID = -1;

   static native long bind(ByteBuffer var0, int var1, FileDescriptor var2, int var3) throws IOException;

   static native int sockAddrNativeDataOffset();

   static native FileDescriptor duplicate(FileDescriptor var0, FileDescriptor var1) throws IOException;

   static native int capabilities();

   static native void initServerImpl(ServerSocket var0, AFSocketImpl<?> var1) throws IOException;

   static native int send(FileDescriptor var0, ByteBuffer var1, int var2, int var3, ByteBuffer var4, int var5, int var6, AncillaryDataSupport var7) throws IOException;

   static boolean isLoaded() {
      return LOADED.get();
   }

   static void ensureSupported() throws UnsupportedOperationException {
      if (!isLoaded()) {
         throw unsupportedException();
      }
   }

   static native int getSocketOptionInt(FileDescriptor var0, int var1) throws IOException;

   static native void disconnect(FileDescriptor var0) throws IOException;

   static native void copyFileDescriptor(FileDescriptor var0, FileDescriptor var1) throws IOException;

   static native Socket currentRMISocket();

   static native int maxAddressLength();

   static native int receive(FileDescriptor var0, ByteBuffer var1, int var2, int var3, ByteBuffer var4, int var5, AncillaryDataSupport var6, int var7) throws IOException;

   static native int sockAddrNativeFamilyOffset();

   static native int poll(AFSelector.PollFd var0, int var1) throws IOException;

   static native byte[] sockAddrToBytes(int var0, ByteBuffer var1);

   @SuppressFBWarnings("THROWS_METHOD_THROWS_CLAUSE_BASIC_EXCEPTION")
   static native void destroy() throws Exception;

   static void setLoaded(boolean successful) {
      LOADED.compareAndSet(false, successful);
   }

   static {
      boolean loadSuccessful = false;

      try (NativeLibraryLoader e = new NativeLibraryLoader()) {
         e.loadLibrary();
         loadSuccessful = true;
      } catch (RuntimeException | Error var11) {
         initError = var11;
         StackTraceUtil.printStackTraceSevere(var11);
      } finally {
         setLoaded(loadSuccessful);
      }

      AFAddressFamily.registerAddressFamily("generic", -1, "org.newsclub.net.unix.AFGenericSocketAddress");
      AFAddressFamily.registerAddressFamily("un", 1, "org.newsclub.net.unix.AFUNIXSocketAddress");
      AFAddressFamily.registerAddressFamily("tipc", 30, "org.newsclub.net.unix.AFTIPCSocketAddress");
      AFAddressFamily.registerAddressFamily("vsock", 40, "org.newsclub.net.unix.AFVSOCKSocketAddress");
      AFAddressFamily.registerAddressFamily("system", 32, "org.newsclub.net.unix.AFSYSTEMSocketAddress");
   }

   static native void shutdown(FileDescriptor var0, int var1) throws IOException;

   static native AFUNIXSocketCredentials peerCredentials(FileDescriptor var0, AFUNIXSocketCredentials var1) throws IOException;

   static native void deregisterSelectionKey(AbstractSelectableChannel var0, SelectionKey var1);

   @SuppressFBWarnings("THROWS_METHOD_THROWS_RUNTIMEEXCEPTION")
   static void setPort1(SocketAddress port, int addr) throws SocketException {
      if (port < 0) {
         throw new IllegalArgumentException("port out of range:" + port);
      }

      try {
         setPort(addr, port);
      } catch (RuntimeException e) {
         throw e;
      } catch (Exception var4) {
         throw (SocketException)new SocketException("Could not set port").initCause(var4);
      }
   }

   static native void setSocketOptionInt(FileDescriptor var0, int var1, int var2) throws IOException;

   static native void listen(FileDescriptor var0, int var1) throws IOException;

   static void initPre() {
      tryResolveClass(AbstractSelectableChannel.class.getName());
      tryResolveClass("java.lang.ProcessBuilder$RedirectPipeImpl");
      tryResolveClass(InetSocketAddress.class.getName());
      tryResolveClass(InvalidArgumentSocketException.class.getName());
      tryResolveClass(AddressUnavailableSocketException.class.getName());
      tryResolveClass(OperationNotSupportedSocketException.class.getName());
      tryResolveClass(NoSuchDeviceSocketException.class.getName());
      tryResolveClass(BrokenPipeSocketException.class.getName());
      tryResolveClass(ConnectionResetSocketException.class.getName());
      tryResolveClass(SocketClosedException.class.getName());
   }

   private static void tryResolveClass(String className) {
      try {
         Class.forName(className);
      } catch (Exception var2) {
      }
   }

   static native int socketStatus(FileDescriptor var0) throws IOException;

   static native byte[] tipcGetNodeId(int var0) throws IOException;

   static native int bytesToSockAddr(int var0, ByteBuffer var1, byte[] var2);

   @ExcludeFromCodeCoverageGeneratedReport(reason = "unreachable")
   private NativeUnixSocket() {
      throw new UnsupportedOperationException("No instances");
   }

   static native boolean finishConnect(FileDescriptor var0) throws IOException;

   static native void setPort(SocketAddress var0, int var1);

   static native int vsockGetLocalCID() throws IOException;

   static native void configureBlocking(FileDescriptor var0, boolean var1) throws IOException;

   static native int available(FileDescriptor var0, ByteBuffer var1) throws IOException;

   static UnsupportedOperationException unsupportedException() {
      return !isLoaded()
         ? (UnsupportedOperationException)new UnsupportedOperationException("junixsocket may not be fully supported on this platform").initCause(initError)
         : null;
   }

   static native boolean connect(ByteBuffer var0, int var1, FileDescriptor var2, long var3) throws IOException;

   static Throwable retrieveInitError() {
      return initError;
   }

   static native byte[] tipcGetLinkName(int var0, int var1) throws IOException;

   static native <T> T getSocketOption(FileDescriptor var0, int var1, int var2, Class<T> var3) throws IOException;

   static native void setSocketOption(FileDescriptor var0, int var1, int var2, Object var3) throws IOException;

   static native void attachCloseable(FileDescriptor var0, Closeable var1) throws SocketException;

   static native void createSocket(FileDescriptor var0, int var1, int var2) throws IOException;

   static native byte[] sockname(int var0, FileDescriptor var1, boolean var2);

   static native Redirect initRedirect(FileDescriptor var0);

   static native Class<?> primaryType(FileDescriptor var0) throws IOException;

   static native int systemResolveCtlId(FileDescriptor var0, String var1) throws IOException;

   static native int checkBlocking(FileDescriptor var0) throws IOException;

   static native int sockTypeToNative(int var0) throws IOException;

   static native int sockAddrLength(int var0);

   static native boolean accept(ByteBuffer var0, int var1, FileDescriptor var2, FileDescriptor var3, long var4, int var6) throws IOException;

   static native void noop();

   static native int read(FileDescriptor var0, byte[] var1, int var2, int var3, int var4, AncillaryDataSupport var5, int var6) throws IOException;

   @SuppressFBWarnings("THROWS_METHOD_THROWS_CLAUSE_BASIC_EXCEPTION")
   static native void init() throws Exception;

   static native int write(FileDescriptor var0, byte[] var1, int var2, int var3, int var4, AncillaryDataSupport var5) throws IOException;

   static native int ancillaryBufMinLen();

   static native int getFD(FileDescriptor var0) throws IOException;

   static native void close(FileDescriptor var0) throws IOException;

   static native void initFD(FileDescriptor var0, int var1) throws IOException;

   static native void socketPair(int var0, int var1, FileDescriptor var2, FileDescriptor var3);

   static native boolean initPipe(FileDescriptor var0, FileDescriptor var1, boolean var2) throws IOException;
}
