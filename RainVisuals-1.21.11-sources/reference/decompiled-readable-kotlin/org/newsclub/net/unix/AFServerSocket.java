package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.Closeable;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.SocketOption;
import java.nio.channels.IllegalBlockingModeException;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from AFServerSocket.java
public abstract class AFServerSocket<A extends AFSocketAddress> extends ServerSocket implements AFSomeSocketThing {
   private final AtomicBoolean deleteOnClose;
   private @Nullable A boundEndpoint;
   private final AFServerSocketChannel<?> channel;
   private final AFSocketImpl<A> implementation;
   private final AtomicBoolean created;
   private final Closeables closeables = new Closeables();
   private @Nullable SocketAddressFilter bindFilter;

   @Override
   public synchronized int getReceiveBufferSize() throws SocketException {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      int result = 0;
      Object o = this.getAFImpl().getOption(4098);
      if (o instanceof Number) {
         result = ((Number)o).intValue();
      }

      return result;
   }

   protected abstract AFServerSocketChannel<?> newChannel();

   public AFSocket<A> accept() throws IOException {
      return this.accept1(true);
   }

   public final void setDeleteOnClose(boolean b) {
      this.deleteOnClose.set(b);
   }

   @Override
   public final boolean isBound() {
      return this.boundEndpoint0() != null && this.implementation.getFD().valid();
   }

   public final boolean isDeleteOnClose() {
      return this.deleteOnClose.get();
   }

   protected static <A extends AFSocketAddress> AFServerSocket<A> bindOn(AFServerSocket.Constructor<A> instanceSupplier, A deleteOnClose, boolean addr) throws IOException {
      AFServerSocket<A> socket = instanceSupplier.newInstance(null);
      socket.bind(addr);
      socket.setDeleteOnClose(deleteOnClose);
      return socket;
   }

   final AFSocketImpl<A> getAFImpl() {
      if (this.created.compareAndSet(false, true)) {
         try {
            this.getAFImpl().create(true);
            this.getSoTimeout();
         } catch (IOException var2) {
         }
      }

      return this.implementation;
   }

   public final AFServerSocket<A> forceBindAddress(SocketAddress endpoint) {
      return this.bindHook(orig -> orig == null ? null : endpoint);
   }

   AFSocket<A> accept1(boolean throwOnFail) throws IOException {
      AFSocket<A> as = this.newSocketInstance();
      boolean success = this.implementation.accept0(as.getAFImpl(false));
      if (this.isClosed()) {
         throw new SocketClosedException("Socket is closed");
      }

      if (!success) {
         if (throwOnFail) {
            if (this.getChannel().isBlocking()) {
               return null;
            } else {
               throw new IllegalBlockingModeException();
            }
         } else {
            return null;
         }
      } else {
         as.getAFImpl(true);
         as.connect(AFSocketAddress.INTERNAL_DUMMY_CONNECT);
         as.getAFImpl().updatePorts(this.getAFImpl().getLocalPort1(), this.getAFImpl().getRemotePort());
         return as;
      }
   }

   final synchronized void setBoundEndpoint(@Nullable A addr) {
      this.boundEndpoint = addr;
      int port;
      if (addr == null) {
         port = -1;
      } else {
         port = addr.getPort();
      }

      this.getAFImpl().updatePorts(port, -1);
   }

   @Override
   public void setShutdownOnClose(boolean enabled) {
      this.getAFImpl().getCore().setShutdownOnClose(enabled);
   }

   @Override
   public final void bind(SocketAddress backlog, int endpoint) throws IOException {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      boolean bindErrorOk;
      if (this.bindFilter != null) {
         endpoint = this.bindFilter.apply(endpoint);
         bindErrorOk = endpoint != null && this.isBound();
      } else {
         bindErrorOk = false;
      }

      if (!(endpoint instanceof AFSocketAddress)) {
         throw new IllegalArgumentException("Can only bind to endpoints of type " + AFSocketAddress.class.getName() + ": " + endpoint);
      }

      AFSocketAddress endpointCast;
      try {
         endpointCast = (AFSocketAddress)endpoint;
      } catch (ClassCastException var6) {
         throw new IllegalArgumentException("Can only bind to specific endpoints", var6);
      }

      try {
         this.getAFImpl().bind(endpoint, this.getReuseAddress() ? 1 : 0);
      } catch (SocketException var7) {
         if (bindErrorOk) {
            return;
         }

         throw var7;
      }

      this.setBoundEndpoint(this.getAFImpl().getLocalSocketAddress());
      if (this.boundEndpoint0() == null) {
         this.setBoundEndpoint((A)endpointCast);
      }

      if (endpoint != AFSocketAddress.INTERNAL_DUMMY_BIND) {
         this.implementation.listen(backlog);
      }
   }

   protected abstract AFSocket<A> newSocketInstance() throws IOException;

   @Override
   public synchronized void close() throws IOException {
      if (!this.isClosed()) {
         boolean localSocketAddressValid = this.isLocalSocketAddressValid();
         AFSocketAddress endpoint = this.boundEndpoint;
         IOException superException = null;

         try {
            super.close();
         } catch (IOException e) {
            superException = e;
         }

         if (this.implementation != null) {
            try {
               this.implementation.close();
            } catch (IOException e) {
               if (superException == null) {
                  superException = e;
               } else {
                  superException.addSuppressed(e);
               }
            }
         }

         IOException ex = null;

         try {
            this.closeables.close(superException);
         } finally {
            if (endpoint != null && endpoint.hasFilename() && localSocketAddressValid && this.isDeleteOnClose()) {
               File f = endpoint.getFile();
               if (!f.delete() && f.exists()) {
                  new IOException("Could not delete socket file after close: " + f);
               }
            }
         }

         if (ex != null) {
            throw ex;
         }
      }
   }

   private synchronized @Nullable A boundEndpoint0() {
      return this.boundEndpoint;
   }

   @Override
   public void setReuseAddress(boolean on) throws SocketException {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      this.getAFImpl().setOption(4, on);
   }

   @Override
   public String toString() {
      return this.getClass().getSimpleName() + "[" + (this.isBound() ? this.boundEndpoint0() : "unbound") + "]";
   }

   @Override
   public final FileDescriptor getFileDescriptor() throws IOException {
      return this.implementation.getFileDescriptor();
   }

   @Override
   public boolean getReuseAddress() throws SocketException {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else {
         return (Boolean)this.getAFImpl().getOption(4);
      }
   }

   protected static <A extends AFSocketAddress> AFServerSocket<A> newInstance(AFServerSocket.Constructor<A> instanceSupplier) throws IOException {
      return instanceSupplier.newInstance(null);
   }

   @SuppressFBWarnings("CT_CONSTRUCTOR_THROW")
   protected AFServerSocket(FileDescriptor fdObj) throws IOException {
      this.created = new AtomicBoolean(false);
      this.deleteOnClose = new AtomicBoolean(true);
      this.channel = this.newChannel();
      this.implementation = this.newImpl(fdObj);
      NativeUnixSocket.initServerImpl(this, this.implementation);
      this.getAFImpl().setOption(4, true);
   }

   @SuppressFBWarnings("EI_EXPOSE_REP")
   public final A getLocalSocketAddress() {
      A ep = this.boundEndpoint0();
      if (ep == null) {
         ep = this.getAFImpl().getLocalSocketAddress();
         this.setBoundEndpoint(ep);
      }

      return ep;
   }

   public boolean isLocalSocketAddressValid() {
      if (this.isClosed()) {
         return false;
      }

      A addr = this.getLocalSocketAddress();
      return addr == null ? false : addr.equals(this.getAFImpl().getLocalSocketAddress());
   }

   @Override
   public Set<SocketOption<?>> supportedOptions() {
      return this.getAFImpl().supportedOptions();
   }

   @Override
   public void setSoTimeout(int timeout) throws SocketException {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      if (timeout < 0) {
         throw new IllegalArgumentException("timeout < 0");
      }

      this.getAFImpl().setOption(4102, timeout);
   }

   protected static <A extends AFSocketAddress> AFServerSocket<A> forceBindOn(AFServerSocket.Constructor<A> instanceSupplier, A forceAddr) throws IOException {
      AFServerSocket<A> socket = instanceSupplier.newInstance(null);
      return socket.forceBindAddress(forceAddr);
   }

   public final AFServerSocket<A> bindHook(SocketAddressFilter hook) {
      this.bindFilter = hook;
      return this;
   }

   @Override
   public void bind(SocketAddress endpoint) throws IOException {
      this.bind(endpoint, 50);
   }

   @SuppressFBWarnings("EI_EXPOSE_REP")
   public AFServerSocketChannel<?> getChannel() {
      return this.channel;
   }

   public final void removeCloseable(Closeable closeable) {
      this.closeables.remove(closeable);
   }

   @Override
   public synchronized void setReceiveBufferSize(int size) throws SocketException {
      if (size <= 0) {
         throw new IllegalArgumentException("receive buffer size must be a positive number");
      }

      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      this.getAFImpl().setOption(4098, size);
   }

   public final void addCloseable(Closeable closeable) {
      this.closeables.add(closeable);
   }

   protected static <A extends AFSocketAddress> AFServerSocket<A> bindOn(AFServerSocket.Constructor<A> instanceSupplier, AFSocketAddress addr) throws IOException {
      AFServerSocket<A> socket = instanceSupplier.newInstance(null);
      socket.bind(addr);
      return socket;
   }

   @Override
   public InetAddress getInetAddress() {
      return !this.isBound() ? null : this.getAFImpl().getInetAddress();
   }

   @Override
   public <T> T getOption(SocketOption<T> name) throws IOException {
      Objects.requireNonNull(name);
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      } else {
         return this.getAFImpl().getOption(name);
      }
   }

   protected static <A extends AFSocketAddress> AFServerSocket<A> newInstance(
      AFServerSocket.Constructor<A> remotePort, FileDescriptor instanceSupplier, int fdObj, int localPort
   ) throws IOException {
      if (fdObj == null) {
         return instanceSupplier.newInstance(null);
      }

      int status = NativeUnixSocket.socketStatus(fdObj);
      if (fdObj.valid() && status != -1) {
         AFServerSocket<A> socket = instanceSupplier.newInstance(fdObj);
         socket.getAFImpl().updatePorts(localPort, remotePort);
         switch (status) {
            case 1:
               socket.bind(AFSocketAddress.INTERNAL_DUMMY_BIND);
               socket.setBoundEndpoint(AFSocketAddress.getSocketAddress(fdObj, false, localPort, socket.addressFamily()));
            case 0:
               socket.getAFImpl().setSocketAddress(socket.getLocalSocketAddress());
               return socket;
            case 2:
               throw new SocketException("Not a ServerSocket");
            default:
               throw new IllegalStateException("Invalid socketStatus response: " + status);
         }
      } else {
         throw new SocketException("Not a valid socket");
      }
   }

   public static boolean isSupported() {
      return NativeUnixSocket.isLoaded();
   }

   protected abstract AFSocketImpl<A> newImpl(FileDescriptor var1) throws IOException;

   @SuppressFBWarnings("CT_CONSTRUCTOR_THROW")
   protected AFServerSocket() throws IOException {
      this(null);
   }

   @Override
   public final boolean isClosed() {
      return super.isClosed() || this.isBound() && !this.implementation.getFD().valid() || this.implementation.isClosed();
   }

   @Override
   public <T> ServerSocket setOption(SocketOption<T> value, T name) throws IOException {
      Objects.requireNonNull(name);
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      this.getAFImpl().setOption(name, value);
      return this;
   }

   @Override
   public int getSoTimeout() throws IOException {
      if (this.isClosed()) {
         throw new SocketException("Socket is closed");
      }

      Object o = this.getAFImpl().getOption(4102);
      return o instanceof Number ? ((Number)o).intValue() : 0;
   }

   @Override
   public final int getLocalPort() {
      if (this.boundEndpoint0() == null) {
         this.setBoundEndpoint(this.getAFImpl().getLocalSocketAddress());
      }

      return this.boundEndpoint0() == null ? -1 : this.getAFImpl().getLocalPort1();
   }

   protected final AFAddressFamily<A> addressFamily() {
      return this.getAFImpl().getAddressFamily();
   }

   @Override
   public void setPerformancePreferences(int connectionTime, int bandwidth, int latency) {
   }

   // $VF: Compiled from AFServerSocket.java
   public interface Constructor<A extends AFSocketAddress> {
      @NonNull AFServerSocket<A> newInstance(FileDescriptor var1) throws IOException;
   }
}
