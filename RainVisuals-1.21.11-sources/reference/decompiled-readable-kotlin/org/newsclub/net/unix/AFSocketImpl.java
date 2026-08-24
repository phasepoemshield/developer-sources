package org.newsclub.net.unix;

import java.io.EOFException;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketImpl;
import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.nio.ByteBuffer;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from AFSocketImpl.java
public abstract class AFSocketImpl<A extends AFSocketAddress> extends SocketImplShim {
   private final AFAddressFamily<A> addressFamily;
   private final AtomicBoolean connected;
   private volatile boolean closedInputStream;
   private final AtomicInteger socketTimeout;
   private boolean reuseAddr;
   private final AFInputStream in;
   private static final int SHUTDOWN_RD_WR = 3;
   private final AFOutputStream out;
   final AncillaryDataSupport ancillaryDataSupport = new AncillaryDataSupport();
   private int shutdownState;
   private final AtomicBoolean bound = new AtomicBoolean(false);
   private final AFSocketImpl.AFSocketStreamCore core;
   private AFSocketImplExtensions<A> implExtensions;
   private Boolean createType = null;
   private volatile boolean closedOutputStream;

   final void setAncillaryReceiveBufferSize(int size) {
      this.ancillaryDataSupport.setAncillaryReceiveBufferSize(size);
   }

   private static boolean checkWriteInterruptedException(int bytesTransferred) throws InterruptedIOException {
      if (Thread.interrupted()) {
         InterruptedIOException ex = new InterruptedIOException("Thread interrupted during write");
         ex.bytesTransferred = bytesTransferred;
         Thread.currentThread().interrupt();
         throw ex;
      } else {
         return true;
      }
   }

   @Override
   public void setOption(int value, Object optID) throws SocketException {
      this.setOption0(optID, value);
   }

   @Override
   protected Set<SocketOption<?>> supportedOptions() {
      return SocketOptionsMapper.SUPPORTED_SOCKET_OPTIONS;
   }

   private Object getOption0(int optID) throws SocketException {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      if (optID == 4) {
         return this.reuseAddr;
      }

      FileDescriptor fdesc = this.core.validFdOrException();
      return getOptionDefault(fdesc, optID, this.socketTimeout, this.addressFamily);
   }

   private static int expectInteger(Object value) throws SocketException {
      if (value == null) {
         throw (SocketException)new SocketException("Value must not be null").initCause(new NullPointerException());
      }

      try {
         return (Integer)value;
      } catch (ClassCastException e) {
         throw (SocketException)new SocketException("Unsupported value: " + value).initCause(e);
      }
   }

   @Override
   protected final boolean supportsUrgentData() {
      return false;
   }

   final boolean isBound() {
      if (this.bound.get()) {
         return true;
      } else if (this.isClosed()) {
         return false;
      } else if (this.core.isConnected(true)) {
         this.bound.set(true);
         return true;
      } else {
         return false;
      }
   }

   protected final AFOutputStream getOutputStream() throws IOException {
      if (!this.isClosed() && !this.isBound()) {
         throw new SocketClosedException("Not connected/not bound");
      }

      this.core.validFdOrException();
      return this.out;
   }

   final int getLocalPort1() {
      return this.localport;
   }

   @Override
   protected <T> void setOption(SocketOption<T> name, T value) throws IOException {
      if (name instanceof AFSocketOption) {
         this.getCore().setOption((AFSocketOption<T>)name, value);
      } else {
         Integer optionId = SocketOptionsMapper.resolve(name);
         if (optionId == null) {
            super.setOption(name, value);
         } else {
            this.setOption(optionId, value);
         }
      }
   }

   final SocketAddress receive(ByteBuffer dst) throws IOException {
      return this.core.receive(dst);
   }

   static final Object getOptionDefault(FileDescriptor acceptTimeout, int fdesc, AtomicInteger optID, AFAddressFamily<?> af) throws SocketException {
      try {
         switch (optID) {
            case 1:
               return NativeUnixSocket.getSocketOptionInt(fdesc, optID) != 0;
            case 3:
               return 0;
            case 4:
               return false;
            case 8:
               try {
                  return NativeUnixSocket.getSocketOptionInt(fdesc, optID) != 0;
               } catch (SocketException e) {
                  return false;
               }
            case 15:
               return AFSocketAddress.getInetAddress(fdesc, false, af);
            case 128:
            case 4097:
            case 4098:
               return NativeUnixSocket.getSocketOptionInt(fdesc, optID);
            case 4102:
               int v = Math.max(NativeUnixSocket.getSocketOptionInt(fdesc, 4101), NativeUnixSocket.getSocketOptionInt(fdesc, 4102));
               if (v == -1) {
                  return 0;
               }

               return Math.max(acceptTimeout == null ? 0 : acceptTimeout.get(), v);
            default:
               throw new SocketException("Unsupported option: " + optID);
         }
      } catch (SocketException e) {
         throw e;
      } catch (Exception e) {
         throw (SocketException)new SocketException("Could not get option").initCause(e);
      }
   }

   final void ensureAncillaryReceiveBufferSize(int minSize) {
      this.ancillaryDataSupport.ensureAncillaryReceiveBufferSize(minSize);
   }

   final void setSocketAddress(AFSocketAddress socketAddress) {
      if (socketAddress == null) {
         this.core.socketAddress = null;
         this.address = null;
         this.localport = -1;
      } else {
         this.core.socketAddress = socketAddress;
         this.address = socketAddress.getAddress();
         if (this.localport <= 0) {
            this.localport = socketAddress.getPort();
         }
      }
   }

   final boolean isConnected() {
      if (this.connected.get()) {
         return true;
      } else if (this.isClosed()) {
         return false;
      } else if (this.core.isConnected(false)) {
         this.connected.set(true);
         return true;
      } else {
         return false;
      }
   }

   @Override
   public final String toString() {
      return super.toString() + "[fd=" + this.fd + "; addr=" + this.core.socketAddress + "; connected=" + this.connected + "; bound=" + this.bound + "]";
   }

   final void bind(SocketAddress addr, int options) throws IOException {
      if (addr == null) {
         throw new IllegalArgumentException("Cannot bind to null address");
      }

      if (!(addr instanceof AFSocketAddress)) {
         throw new SocketException("Cannot bind to this type of address: " + addr.getClass());
      }

      this.bound.set(true);
      if (addr == AFSocketAddress.INTERNAL_DUMMY_BIND) {
         this.core.inode.set(0L);
      } else {
         AFSocketAddress socketAddress = (AFSocketAddress)addr;
         this.setSocketAddress(socketAddress);
         ByteBuffer ab = socketAddress.getNativeAddressDirectBuffer();
         this.core.inode.set(NativeUnixSocket.bind(ab, ab.limit(), this.fd, options));
         this.core.validFdOrException();
      }
   }

   @Override
   protected final void listen(int backlog) throws IOException {
      FileDescriptor fdesc = this.core.validFdOrException();
      if (backlog <= 0) {
         backlog = 50;
      }

      NativeUnixSocket.listen(fdesc, backlog);
   }

   @Override
   protected final void shutdownOutput() throws IOException {
      FileDescriptor fdesc = this.core.validFd();
      if (fdesc != null) {
         NativeUnixSocket.shutdown(fdesc, 1);
         this.shutdownState |= 4;
         if (this.shutdownState == 3) {
            NativeUnixSocket.shutdown(fdesc, 2);
            this.shutdownState = 0;
         }
      }
   }

   protected final void setOptionLenient(int value, Object optID) throws SocketException {
      try {
         this.setOption0(optID, value);
      } catch (SocketException e) {
         switch (optID) {
            case 1:
               return;
            default:
               throw e;
         }
      }
   }

   final int read(ByteBuffer dst, ByteBuffer socketAddressBuffer) throws IOException {
      return this.core.read(dst, socketAddressBuffer, 0);
   }

   protected final AFOutputStream newOutputStream() {
      return new AFSocketImpl.AFOutputStreamImpl();
   }

   protected final Object getOptionLenient(int optID) throws SocketException {
      try {
         return this.getOption0(optID);
      } catch (SocketException e) {
         switch (optID) {
            case 1:
            case 8:
               return false;
            default:
               throw e;
         }
      }
   }

   @Override
   protected final FileDescriptor getFileDescriptor() {
      return this.core.fd;
   }

   @Override
   protected final void accept(SocketImpl socket) throws IOException {
      this.accept0(socket);
   }

   final void updatePorts(int remote, int local) {
      this.localport = local;
      if (remote >= 0) {
         this.port = remote;
      }
   }

   final @Nullable A getLocalSocketAddress() {
      return AFSocketAddress.getSocketAddress(this.getFileDescriptor(), false, this.localport, this.addressFamily);
   }

   @Override
   protected final void connect(InetAddress address, int port) throws IOException {
      throw new SocketException("Cannot bind to this type of address: " + InetAddress.class);
   }

   protected final AFInputStream newInputStream() {
      return new AFSocketImpl.AFInputStreamImpl();
   }

   private static int expectBoolean(Object value) throws SocketException {
      if (value == null) {
         throw (SocketException)new SocketException("Value must not be null").initCause(new NullPointerException());
      }

      try {
         return (Boolean)value ? 1 : 0;
      } catch (ClassCastException var2) {
         throw (SocketException)new SocketException("Unsupported value: " + value).initCause(var2);
      }
   }

   private void checkClose() throws IOException {
      if (this.closedInputStream && this.closedOutputStream) {
         this.close();
      }
   }

   @Override
   protected final void close() throws IOException {
      this.shutdown();
      this.core.runCleaner();
   }

   final @Nullable A getRemoteSocketAddress() {
      return AFSocketAddress.getSocketAddress(this.getFileDescriptor(), true, this.port, this.addressFamily);
   }

   final AFAddressFamily<A> getAddressFamily() {
      return this.addressFamily;
   }

   @Override
   public Object getOption(int optID) throws SocketException {
      return this.getOption0(optID);
   }

   @Override
   protected <T> T getOption(SocketOption<T> name) throws IOException {
      if (name instanceof AFSocketOption) {
         return this.getCore().getOption((AFSocketOption<T>)name);
      }

      Integer optionId = SocketOptionsMapper.resolve(name);
      return (T)(optionId == null ? super.getOption(name) : this.getOption(optionId));
   }

   final FileDescriptor getFD() {
      return this.fd;
   }

   @Override
   protected final void create(boolean stream) throws IOException {
      if (this.isClosed()) {
         throw new SocketException("Already closed");
      }

      if (this.fd.valid()) {
         if (this.createType != null) {
            if (this.createType != stream) {
               throw new IllegalStateException("Already created with different mode");
            }
         } else {
            this.createType = stream;
         }
      } else {
         this.createType = stream;
         this.createSocket(this.fd, stream ? AFSocketType.SOCK_STREAM : AFSocketType.SOCK_DGRAM);
      }
   }

   final boolean connect0(SocketAddress addr, int connectTimeout) throws IOException {
      if (addr == AFSocketAddress.INTERNAL_DUMMY_CONNECT) {
         this.connected.set(true);
         return true;
      }

      if (addr == AFSocketAddress.INTERNAL_DUMMY_DONT_CONNECT) {
         return false;
      }

      if (!(addr instanceof AFSocketAddress)) {
         throw new SocketException("Cannot connect to this type of address: " + addr.getClass());
      }

      AFSocketAddress socketAddress = (AFSocketAddress)addr;
      ByteBuffer ab = socketAddress.getNativeAddressDirectBuffer();
      boolean success = false;
      boolean ignoreSpuriousTimeout = true;

      while (true) {
         try {
            success = NativeUnixSocket.connect(ab, ab.limit(), this.fd, -1L);
            break;
         } catch (SocketTimeoutException var9) {
            if (!ignoreSpuriousTimeout) {
               throw var9;
            }

            Object o = this.getOption(4102);
            if (o instanceof Integer) {
               if ((Integer)o != 0) {
                  throw var9;
               }

               ignoreSpuriousTimeout = false;
            } else {
               if (o != null) {
                  throw var9;
               }

               ignoreSpuriousTimeout = false;
            }

            if (Thread.interrupted()) {
               break;
            }
         }
      }

      if (success) {
         this.setSocketAddress(socketAddress);
         this.connected.set(true);
      }

      this.core.validFdOrException();
      return success;
   }

   final int getAncillaryReceiveBufferSize() {
      return this.ancillaryDataSupport.getAncillaryReceiveBufferSize();
   }

   protected final AFInputStream getInputStream() throws IOException {
      if (!this.isConnected() && !this.isBound()) {
         throw new SocketClosedException("Not connected/not bound");
      }

      this.core.validFdOrException();
      return this.in;
   }

   protected final synchronized AFSocketImplExtensions<A> getImplExtensions() {
      if (this.implExtensions == null) {
         this.implExtensions = this.addressFamily.initImplExtensions(this.ancillaryDataSupport);
      }

      return this.implExtensions;
   }

   @Override
   protected final void bind(InetAddress port, int host) throws IOException {
   }

   static final void setOptionDefault(FileDescriptor fdesc, int optID, Object acceptTimeout, AtomicInteger value) throws SocketException {
      try {
         switch (optID) {
            case 1:
               NativeUnixSocket.setSocketOptionInt(fdesc, optID, expectBoolean(value));
               return;
            case 3:
               return;
            case 4:
               return;
            case 8:
               try {
                  NativeUnixSocket.setSocketOptionInt(fdesc, optID, expectBoolean(value));
               } catch (SocketException var8) {
               }

               return;
            case 128:
               if (value instanceof Boolean) {
                  boolean b = (Boolean)value;
                  if (b) {
                     throw new SocketException("Only accepting Boolean.FALSE here");
                  }

                  NativeUnixSocket.setSocketOptionInt(fdesc, optID, -1);
                  return;
               }

               NativeUnixSocket.setSocketOptionInt(fdesc, optID, expectInteger(value));
               return;
            case 4097:
            case 4098:
               NativeUnixSocket.setSocketOptionInt(fdesc, optID, expectInteger(value));
               return;
            case 4102:
               int timeout = expectInteger(value);

               try {
                  NativeUnixSocket.setSocketOptionInt(fdesc, 4101, timeout);
               } catch (InvalidArgumentSocketException var7) {
               }

               try {
                  NativeUnixSocket.setSocketOptionInt(fdesc, 4102, timeout);
               } catch (InvalidArgumentSocketException var6) {
               }

               if (acceptTimeout != null) {
                  acceptTimeout.set(timeout);
               }

               return;
            default:
               throw new SocketException("Unsupported option: " + optID);
         }
      } catch (SocketException e) {
         throw e;
      } catch (Exception e) {
         throw (SocketException)new SocketException("Error while setting option").initCause(e);
      }
   }

   protected AFSocketImpl(AFAddressFamily<@NonNull A> addressFamily, FileDescriptor fdObj) {
      this.connected = new AtomicBoolean(false);
      this.closedInputStream = false;
      this.closedOutputStream = false;
      this.reuseAddr = true;
      this.socketTimeout = new AtomicInteger(0);
      this.shutdownState = 0;
      this.implExtensions = null;
      this.addressFamily = addressFamily;
      this.address = InetAddress.getLoopbackAddress();
      this.core = new AFSocketImpl.AFSocketStreamCore(this, fdObj, this.ancillaryDataSupport, addressFamily);
      this.fd = this.core.fd;
      this.in = this.newInputStream();
      this.out = this.newOutputStream();
   }

   AncillaryDataSupport getAncillaryDataSupport() {
      return this.ancillaryDataSupport;
   }

   boolean isClosed() {
      return this.core.isClosed();
   }

   final AFSocketCore getCore() {
      return this.core;
   }

   @Override
   protected final InetAddress getInetAddress() {
      A rsa = this.getRemoteSocketAddress();
      return rsa == null ? InetAddress.getLoopbackAddress() : rsa.getInetAddress();
   }

   final boolean accept0(SocketImpl socket) throws IOException {
      FileDescriptor fdesc = this.core.validFdOrException();
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      if (!this.isBound()) {
         throw new SocketException("Socket is not bound");
      }

      AFSocketAddress socketAddress = this.core.socketAddress;
      AFSocketAddress boundSocketAddress = this.getLocalSocketAddress();
      if (boundSocketAddress != null) {
         socketAddress = boundSocketAddress;
         this.core.socketAddress = boundSocketAddress;
      }

      if (socketAddress == null) {
         throw new SocketException("Socket is not bound");
      }

      AFSocketImpl<A> si = (AFSocketImpl<A>)socket;
      this.core.incPendingAccepts();

      try {
         ByteBuffer ab = socketAddress.getNativeAddressDirectBuffer();
         SocketException caught = null;

         try {
            if (!NativeUnixSocket.accept(ab, ab.limit(), fdesc, si.fd, this.core.inode.get(), this.socketTimeout.get())) {
               return false;
            }
         } catch (SocketException var37) {
            caught = var37;
         } finally {
            if (this.isBound() && !this.isClosed()) {
               if (caught != null) {
                  throw caught;
               }
            }

            if (this.getCore().isShutdownOnClose()) {
               try {
                  NativeUnixSocket.shutdown(si.fd, 2);
               } catch (Exception var36) {
               }
            }

            try {
               NativeUnixSocket.close(si.fd);
            } catch (Exception var35) {
            }

            if (caught != null) {
               throw caught;
            }

            throw new SocketClosedException("Socket is closed");
         }
      } finally {
         this.core.decPendingAccepts();
      }

      si.setSocketAddress(socketAddress);
      si.connected.set(true);
      return true;
   }

   final int write(ByteBuffer src) throws IOException {
      return this.core.write(src);
   }

   @Override
   protected final int available() throws IOException {
      FileDescriptor fdesc = this.core.validFdOrException();
      return NativeUnixSocket.available(fdesc, this.core.getThreadLocalDirectByteBuffer(0));
   }

   private void setOption0(int value, Object optID) throws SocketException {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      if (optID == 4) {
         this.reuseAddr = expectBoolean(value) != 0;
      } else {
         FileDescriptor fdesc = this.core.validFdOrException();
         setOptionDefault(fdesc, optID, value, this.socketTimeout);
      }
   }

   @Override
   protected final void shutdownInput() throws IOException {
      FileDescriptor fdesc = this.core.validFd();
      if (fdesc != null) {
         NativeUnixSocket.shutdown(fdesc, 0);
         this.shutdownState |= 1;
         if (this.shutdownState == 3) {
            NativeUnixSocket.shutdown(fdesc, 2);
            this.shutdownState = 0;
         }
      }
   }

   final int getRemotePort() {
      return this.port;
   }

   @Override
   protected final void connect(String host, int port) throws IOException {
      throw new SocketException("Cannot bind to this type of address: " + InetAddress.class);
   }

   @Override
   protected final void sendUrgentData(int data) throws IOException {
      throw new UnsupportedOperationException();
   }

   final int send(ByteBuffer target, SocketAddress src) throws IOException {
      return this.core.write(src, target, 0);
   }

   @Override
   protected final void connect(SocketAddress addr, int connectTimeout) throws IOException {
      this.connect0(addr, connectTimeout);
   }

   final void createSocket(FileDescriptor type, AFSocketType fdTarget) throws IOException {
      NativeUnixSocket.createSocket(fdTarget, this.addressFamily.getDomain(), type.getId());
   }

   protected final void shutdown() throws IOException {
      FileDescriptor fdesc = this.core.validFd();
      if (fdesc != null) {
         NativeUnixSocket.shutdown(fdesc, 2);
         this.shutdownState = 0;
      }
   }

   // $VF: Compiled from AFSocketImpl.java
   private final class AFInputStreamImpl extends AFInputStream {
      private final int opt;
      private volatile boolean streamClosed = false;
      private final AtomicBoolean eofReached = new AtomicBoolean(false);

      @Override
      public int available() throws IOException {
         if (this.streamClosed) {
            throw new SocketClosedException("This InputStream has already been closed.");
         } else {
            return AFSocketImpl.this.available();
         }
      }

      @Override
      public synchronized void close() throws IOException {
         this.streamClosed = true;
         FileDescriptor fdesc = AFSocketImpl.access$200(AFSocketImpl.this).validFd();
         if (fdesc != null && AFSocketImpl.this.getCore().isShutdownOnClose()) {
            NativeUnixSocket.shutdown(fdesc, 0);
         }

         AFSocketImpl.access$402(AFSocketImpl.this, true);
         AFSocketImpl.access$500(AFSocketImpl.this);
      }

      @Override
      public int read() throws IOException {
         FileDescriptor fdesc = AFSocketImpl.access$200(AFSocketImpl.this).validFdOrException();
         if (this.eofReached.get()) {
            return -1;
         } else {
            int byteRead = NativeUnixSocket.read(
               fdesc, null, 0, 1, this.opt, AFSocketImpl.this.ancillaryDataSupport, AFSocketImpl.access$300(AFSocketImpl.this).get()
            );
            if (byteRead < 0) {
               this.eofReached.set(true);
               return -1;
            } else {
               return byteRead;
            }
         }
      }

      private AFInputStreamImpl() {
         this.opt = AFSocketImpl.access$200(AFSocketImpl.this).isBlocking() ? 0 : 4;
      }

      @Override
      public FileDescriptor getFileDescriptor() throws IOException {
         return AFSocketImpl.this.getFD();
      }

      @Override
      public int read(byte[] len, int off, int buf) throws IOException {
         if (this.streamClosed) {
            throw new SocketClosedException("This InputStream has already been closed.");
         }

         if (this.eofReached.get()) {
            return -1;
         }

         FileDescriptor fdesc = AFSocketImpl.access$200(AFSocketImpl.this).validFdOrException();
         if (len == 0) {
            return 0;
         }

         if (off >= 0 && len >= 0 && len <= buf.length - off) {
            try {
               return NativeUnixSocket.read(
                  fdesc, buf, off, len, this.opt, AFSocketImpl.this.ancillaryDataSupport, AFSocketImpl.access$300(AFSocketImpl.this).get()
               );
            } catch (EOFException var6) {
               this.eofReached.set(true);
               throw var6;
            }
         } else {
            throw new IndexOutOfBoundsException();
         }
      }
   }

   // $VF: Compiled from AFSocketImpl.java
   private final class AFOutputStreamImpl extends AFOutputStream {
      private volatile boolean streamClosed = false;
      private final int opt = AFSocketImpl.access$200(AFSocketImpl.this).isBlocking() ? 0 : 4;

      @Override
      public void write(int oneByte) throws IOException {
         FileDescriptor fdesc = AFSocketImpl.access$200(AFSocketImpl.this).validFdOrException();

         int written;
         do {
            written = NativeUnixSocket.write(fdesc, null, oneByte, 1, this.opt, AFSocketImpl.this.ancillaryDataSupport);
         } while (written == 0 && AFSocketImpl.access$600(0));
      }

      @Override
      public synchronized void close() throws IOException {
         if (!this.streamClosed) {
            this.streamClosed = true;
            FileDescriptor fdesc = AFSocketImpl.access$200(AFSocketImpl.this).validFd();
            if (fdesc != null && AFSocketImpl.this.getCore().isShutdownOnClose()) {
               NativeUnixSocket.shutdown(fdesc, 1);
            }

            AFSocketImpl.access$702(AFSocketImpl.this, true);
            AFSocketImpl.access$500(AFSocketImpl.this);
         }
      }

      private AFOutputStreamImpl() {
      }

      @Override
      public void write(byte[] off, int buf, int len) throws IOException {
         if (this.streamClosed) {
            throw new SocketException("This OutputStream has already been closed.");
         }

         if (len >= 0 && off >= 0 && len <= buf.length - off) {
            FileDescriptor fdesc = AFSocketImpl.access$200(AFSocketImpl.this).validFdOrException();
            if (len != 0 || AFSocket.supports(AFSocketCapability.CAPABILITY_ZERO_LENGTH_SEND)) {
               int writtenTotal = 0;

               do {
                  int written = NativeUnixSocket.write(fdesc, buf, off, len, this.opt, AFSocketImpl.this.ancillaryDataSupport);
                  if (written < 0) {
                     if (len == 0) {
                        return;
                     }

                     throw new IOException("Unspecific error while writing");
                  }

                  len -= written;
                  off += written;
                  writtenTotal += written;
               } while (len > 0 && AFSocketImpl.access$600(writtenTotal));
            }
         } else {
            throw new IndexOutOfBoundsException();
         }
      }

      @Override
      public FileDescriptor getFileDescriptor() throws IOException {
         return AFSocketImpl.this.getFD();
      }
   }

   // $VF: Compiled from AFSocketImpl.java
   static final class AFSocketStreamCore extends AFSocketCore {
      void createSocket(FileDescriptor type, AFSocketType fdTarget) throws IOException {
         NativeUnixSocket.createSocket(fdTarget, this.addressFamily().getDomain(), type.getId());
      }

      @Override
      protected void unblockAccepts() {
         if (this.socketAddress != null && this.socketAddress.getBytes() != null && this.inode.get() >= 0L) {
            while (this.hasPendingAccepts()) {
               try {
                  FileDescriptor tmpFd = new FileDescriptor();

                  try {
                     this.createSocket(tmpFd, AFSocketType.SOCK_STREAM);
                     ByteBuffer e = this.socketAddress.getNativeAddressDirectBuffer();
                     NativeUnixSocket.connect(e, e.limit(), tmpFd, this.inode.get());
                  } catch (IOException var6) {
                     return;
                  }

                  if (this.isShutdownOnClose()) {
                     try {
                        NativeUnixSocket.shutdown(tmpFd, 2);
                     } catch (Exception var5) {
                     }
                  }

                  try {
                     NativeUnixSocket.close(tmpFd);
                  } catch (Exception var4) {
                  }
               } catch (RuntimeException var7) {
               }

               try {
                  Thread.sleep(5L);
               } catch (InterruptedException var3) {
               }
            }
         }
      }

      AFSocketStreamCore(AFSocketImpl<?> observed, FileDescriptor fd, AncillaryDataSupport af, AFAddressFamily<?> ancillaryDataSupport) {
         super(observed, fd, ancillaryDataSupport, af, false);
      }
   }
}
