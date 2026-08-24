package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.AlreadyBoundException;
import java.nio.channels.IllegalBlockingModeException;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from AFDatagramSocket.java
public abstract class AFDatagramSocket<A extends AFSocketAddress> extends DatagramSocketShim implements AFSocketExtensions, AFSomeSocket {
   private final AtomicBoolean created = new AtomicBoolean(false);
   private final AFDatagramChannel<A> channel;
   private final AFDatagramSocketImpl<A> impl;
   private final AncillaryDataSupport ancillaryDataSupport;
   private final AtomicBoolean deleteOnClose = new AtomicBoolean(true);
   private static final InetSocketAddress WILDCARD_ADDRESS = new InetSocketAddress(0);

   public AFDatagramSocket<A> accept() throws IOException {
      return this.accept1(true);
   }

   @Override
   public final boolean isConnected() {
      return super.isConnected() || this.impl.isConnected();
   }

   public final void listen(int backlog) throws IOException {
      FileDescriptor fdesc = this.getAFImpl().getCore().validFdOrException();
      if (backlog <= 0) {
         backlog = 50;
      }

      NativeUnixSocket.listen(fdesc, backlog);
   }

   public final boolean isDeleteOnClose() {
      return this.deleteOnClose.get();
   }

   @Override
   public final void connect(InetAddress address, int port) {
      throw new IllegalArgumentException("Cannot connect to InetAddress");
   }

   protected static final <A extends AFSocketAddress> AFDatagramSocket<A> newInstance(
      AFDatagramSocket.Constructor<A> remotePort, FileDescriptor localPort, int fdObj, int constructor
   ) throws IOException {
      if (fdObj == null) {
         return newInstance(constructor);
      }

      if (!fdObj.valid()) {
         throw new SocketException("Invalid file descriptor");
      }

      int status = NativeUnixSocket.socketStatus(fdObj);
      if (status == -1) {
         throw new SocketException("Not a valid socket");
      }

      AFDatagramSocket<A> socket = constructor.newSocket(fdObj);
      socket.getAFImpl().updatePorts(localPort, remotePort);
      switch (status) {
         case 0:
            break;
         case 1:
            socket.internalDummyBind();
            break;
         case 2:
            socket.internalDummyConnect();
            break;
         default:
            throw new IllegalStateException("Invalid socketStatus response: " + status);
      }

      return socket;
   }

   public final void setDeleteOnClose(boolean b) {
      this.deleteOnClose.set(b);
   }

   protected abstract AFDatagramChannel<A> newChannel();

   protected static final <A extends AFSocketAddress> AFDatagramSocket<A> newInstance(AFDatagramSocket.Constructor<A> constructor) throws IOException {
      return constructor.newSocket(null);
   }

   protected abstract AFDatagramSocket<A> newDatagramSocketInstance() throws IOException;

   final AFDatagramSocketImpl<A> getAFImpl() {
      if (this.created.compareAndSet(false, true)) {
         try {
            this.getSoTimeout();
         } catch (SocketException var2) {
         }
      }

      return this.impl;
   }

   public final @Nullable A getLocalSocketAddress() {
      if (this.isClosed()) {
         return null;
      } else {
         return !this.isBound() ? null : this.getAFImpl().getLocalSocketAddress();
      }
   }

   @Override
   public final synchronized void connect(SocketAddress addr) throws SocketException {
      if (!this.isBound()) {
         this.internalDummyBind();
      }

      this.internalDummyConnect();

      try {
         this.getAFImpl().connect(AFSocketAddress.preprocessSocketAddress(this.socketAddressClass(), addr, null));
      } catch (SocketException var3) {
         throw var3;
      } catch (IOException var4) {
         throw (SocketException)new SocketException(var4.getMessage()).initCause(var4);
      }
   }

   protected AFDatagramSocket(AFDatagramSocketImpl<A> impl) {
      super(impl);
      this.channel = this.newChannel();
      this.impl = impl;
      this.ancillaryDataSupport = impl.ancillaryDataSupport;
   }

   public final synchronized @Nullable A getRemoteSocketAddress() {
      return this.getAFImpl().getRemoteSocketAddress();
   }

   @SuppressFBWarnings("EI_EXPOSE_REP")
   public AFDatagramChannel<A> getChannel() {
      return this.channel;
   }

   @Override
   public final boolean isBound() {
      return super.isBound() || this.impl.isBound();
   }

   @Override
   public final void send(DatagramPacket p) throws IOException {
      synchronized (p) {
         if (this.isClosed()) {
            throw new SocketException("Socket is closed");
         }

         if (!this.isBound()) {
            this.internalDummyBind();
         }

         this.getAFImpl().send(p);
      }
   }

   @Override
   public <T> T getOption(AFSocketOption<T> name) throws IOException {
      return this.getAFImpl().getCore().getOption(name);
   }

   @Override
   public final boolean isClosed() {
      return super.isClosed() || this.getAFImpl().isClosed();
   }

   protected final Class<? extends AFSocketAddress> socketAddressClass() {
      return this.impl.getAddressFamily().getSocketAddressClass();
   }

   final void internalDummyConnect() throws SocketException {
      super.connect(AFSocketAddress.INTERNAL_DUMMY_DONT_CONNECT);
   }

   @Override
   public void setShutdownOnClose(boolean enabled) {
      this.getAFImpl().getCore().setShutdownOnClose(enabled);
   }

   protected final AFAddressFamily<A> addressFamily() {
      return this.getAFImpl().getAddressFamily();
   }

   protected AFSocketImplExtensions<A> getImplExtensions() {
      return this.getAFImpl(false).getImplExtensions();
   }

   @Override
   public <T> DatagramSocket setOption(AFSocketOption<T> name, T value) throws IOException {
      this.getAFImpl().getCore().setOption(name, value);
      return this;
   }

   AFDatagramSocket<A> accept1(boolean throwOnFail) throws IOException {
      AFDatagramSocket<A> as = this.newDatagramSocketInstance();
      boolean success = this.getAFImpl().accept0(as.getAFImpl(false));
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

   @Override
   public final int getAncillaryReceiveBufferSize() {
      return this.ancillaryDataSupport.getAncillaryReceiveBufferSize();
   }

   @Override
   public final synchronized void bind(SocketAddress addr) throws SocketException {
      boolean isBound = this.isBound();
      if (!isBound || addr != AFSocketAddress.INTERNAL_DUMMY_BIND) {
         if (this.isClosed()) {
            throw new SocketException("Socket is closed");
         }

         if (!isBound) {
            try {
               super.bind(AFSocketAddress.INTERNAL_DUMMY_BIND);
            } catch (AlreadyBoundException var7) {
            } catch (SocketException var8) {
               String epoint = var8.getMessage();
               if (epoint == null || !epoint.contains("already bound")) {
                  throw var8;
               }
            }
         }

         boolean isWildcardBind = WILDCARD_ADDRESS.equals(addr);
         AFSocketAddress var9 = addr != null && !isWildcardBind ? AFSocketAddress.preprocessSocketAddress(this.socketAddressClass(), addr, null) : null;
         if (!(var9 instanceof SentinelSocketAddress)) {
            try {
               this.getAFImpl().bind(var9);
            } catch (SocketException var6) {
               if (!isWildcardBind) {
                  this.getAFImpl().close();
                  throw var6;
               }
            }
         }
      }
   }

   @Override
   public final FileDescriptor getFileDescriptor() throws IOException {
      return this.getAFImpl().getFileDescriptor();
   }

   public final void peek(DatagramPacket p) throws IOException {
      synchronized (p) {
         if (this.isClosed()) {
            throw new SocketException("Socket is closed");
         }

         this.getAFImpl().peekData(p);
      }
   }

   @Override
   public final void ensureAncillaryReceiveBufferSize(int minSize) {
      this.ancillaryDataSupport.ensureAncillaryReceiveBufferSize(minSize);
   }

   @Override
   public final void setAncillaryReceiveBufferSize(int size) {
      this.ancillaryDataSupport.setAncillaryReceiveBufferSize(size);
   }

   @Override
   public final void receive(DatagramPacket p) throws IOException {
      this.getAFImpl().receive(p);
   }

   @Override
   public final void close() {
      if (!this.isClosed()) {
         this.getAFImpl().close();
         boolean wasBound = this.isBound();
         if (wasBound && this.deleteOnClose.get()) {
            InetAddress addr = this.getLocalAddress();
            if (AFInetAddress.isSupportedAddress(addr, this.addressFamily())) {
               try {
                  AFSocketAddress socketAddress = AFSocketAddress.unwrap(addr, 0, this.addressFamily());
                  if (socketAddress != null && socketAddress.hasFilename() && !socketAddress.getFile().delete()) {
                  }
               } catch (IOException var4) {
               }
            }
         }

         super.close();
      }
   }

   final AncillaryDataSupport getAncillaryDataSupport() {
      return this.ancillaryDataSupport;
   }

   final AFDatagramSocketImpl<A> getAFImpl(boolean create) {
      return create ? this.getAFImpl() : this.impl;
   }

   final void internalDummyBind() throws SocketException {
      this.bind(AFSocketAddress.INTERNAL_DUMMY_BIND);
   }

   // $VF: Compiled from AFDatagramSocket.java
   @FunctionalInterface
   public interface Constructor<A extends AFSocketAddress> {
      AFDatagramSocket<A> newSocket(FileDescriptor var1) throws IOException;
   }
}
