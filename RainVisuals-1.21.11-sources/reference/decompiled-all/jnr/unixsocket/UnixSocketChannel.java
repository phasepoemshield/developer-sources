package jnr.unixsocket;

import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.SocketChannel;
import java.nio.channels.UnsupportedAddressTypeException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import jnr.constants.platform.Errno;
import jnr.constants.platform.ProtocolFamily;
import jnr.constants.platform.Sock;
import jnr.ffi.LastError;
import jnr.ffi.Runtime;
import jnr.unixsocket.impl.AbstractNativeSocketChannel;

// $VF: Compiled from UnixSocketChannel.java
public class UnixSocketChannel extends AbstractNativeSocketChannel {
   private final ReadWriteLock stateLock;
   private UnixSocketAddress remoteAddress = null;
   private UnixSocketChannel.State state;
   private UnixSocketAddress localAddress = null;
   private final BindHandler bindHandler;

   private boolean doConnect(SockAddrUnix remote) throws IOException {
      if (Native.connect(this.getFD(), remote, remote.length()) != 0) {
         Errno error = Errno.valueOf(LastError.getLastError(Runtime.getSystemRuntime()));
         switch (error) {
            case EAGAIN:
            case EWOULDBLOCK:
               return false;
            default:
               throw new IOException(error.toString());
         }
      } else {
         return true;
      }
   }

   @Override
   public boolean isConnectionPending() {
      this.stateLock.readLock().lock();
      boolean isConnectionPending = this.state == UnixSocketChannel.State.CONNECTING;
      this.stateLock.readLock().unlock();
      return isConnectionPending;
   }

   public UnixSocket socket() {
      return new UnixSocket(this);
   }

   public final UnixSocketAddress getLocalSocketAddress() {
      if (this.localAddress != null) {
         return this.localAddress;
      }

      this.localAddress = Common.getsockname(this.getFD());
      return this.localAddress;
   }

   public static final UnixSocketChannel fromFD(int fd) {
      return new UnixSocketChannel(fd);
   }

   @Override
   public int write(ByteBuffer src) throws IOException {
      if (this.isConnected()) {
         return super.write(src);
      } else if (this.isIdle()) {
         return 0;
      } else {
         throw new ClosedChannelException();
      }
   }

   public final UnixSocketAddress getRemoteSocketAddress() {
      if (!this.isConnected()) {
         return null;
      }

      if (this.remoteAddress != null) {
         return this.remoteAddress;
      }

      this.remoteAddress = Common.getpeername(this.getFD());
      return this.remoteAddress;
   }

   UnixSocketChannel(int fd, UnixSocketChannel.State initialBoundState, boolean initialState) {
      super(fd);
      this.stateLock = new ReentrantReadWriteLock();
      this.stateLock.writeLock().lock();

      try {
         this.state = initialState;
         this.bindHandler = new BindHandler(initialBoundState);
      } finally {
         this.stateLock.writeLock().unlock();
      }
   }

   boolean isBound() {
      return this.bindHandler.isBound();
   }

   @Override
   public long write(ByteBuffer[] offset, int srcs, int length) throws IOException {
      if (this.isConnected()) {
         return super.write(srcs, offset, length);
      } else if (this.isIdle()) {
         return 0L;
      } else {
         throw new ClosedChannelException();
      }
   }

   public synchronized UnixSocketChannel bind(SocketAddress local) throws IOException {
      this.localAddress = this.bindHandler.bind(this.getFD(), local);
      return this;
   }

   public boolean connect(UnixSocketAddress remote) throws IOException {
      this.remoteAddress = remote;
      if (!this.doConnect(this.remoteAddress.getStruct())) {
         this.stateLock.writeLock().lock();
         this.state = UnixSocketChannel.State.CONNECTING;
         this.stateLock.writeLock().unlock();
         return false;
      } else {
         this.stateLock.writeLock().lock();
         this.state = UnixSocketChannel.State.CONNECTED;
         this.stateLock.writeLock().unlock();
         return true;
      }
   }

   UnixSocketChannel() throws IOException {
      this(Native.socket(ProtocolFamily.PF_UNIX, Sock.SOCK_STREAM, 0));
   }

   @Override
   public boolean connect(SocketAddress remote) throws IOException {
      if (remote instanceof UnixSocketAddress) {
         return this.connect((UnixSocketAddress)remote);
      } else {
         throw new UnsupportedAddressTypeException();
      }
   }

   public static final UnixSocketChannel[] pair() throws IOException {
      int[] sockets = new int[]{-1, -1};
      Native.socketpair(ProtocolFamily.PF_UNIX, Sock.SOCK_STREAM, 0, sockets);
      return new UnixSocketChannel[]{
         new UnixSocketChannel(sockets[0], UnixSocketChannel.State.CONNECTED, true), new UnixSocketChannel(sockets[1], UnixSocketChannel.State.CONNECTED, true)
      };
   }

   @Override
   public SocketAddress getRemoteAddress() throws IOException {
      return this.remoteAddress;
   }

   public static final UnixSocketChannel open(UnixSocketAddress remote) throws IOException {
      UnixSocketChannel channel = new UnixSocketChannel();

      try {
         channel.connect(remote);
         return channel;
      } catch (IOException e) {
         channel.close();
         throw e;
      }
   }

   @Override
   public int read(ByteBuffer dst) throws IOException {
      if (this.isConnected()) {
         return super.read(dst);
      } else if (this.isIdle()) {
         return 0;
      } else {
         throw new ClosedChannelException();
      }
   }

   public static final UnixSocketChannel open() throws IOException {
      return new UnixSocketChannel();
   }

   private boolean isIdle() {
      this.stateLock.readLock().lock();
      boolean result = this.state == UnixSocketChannel.State.IDLE;
      this.stateLock.readLock().unlock();
      return result;
   }

   UnixSocketChannel(int fd) {
      this(fd, UnixSocketChannel.State.CONNECTED, false);
   }

   @Override
   public <T> T getOption(SocketOption<T> name) throws IOException {
      if (!this.supportedOptions().contains(name)) {
         throw new UnsupportedOperationException("'" + name + "' not supported");
      } else {
         return Common.getSocketOption(this.getFD(), name);
      }
   }

   @Override
   public boolean isConnected() {
      this.stateLock.readLock().lock();
      boolean result = this.state == UnixSocketChannel.State.CONNECTED;
      this.stateLock.readLock().unlock();
      return result;
   }

   @Override
   public <T> SocketChannel setOption(SocketOption<T> value, T name) throws IOException {
      if (name == null) {
         throw new IllegalArgumentException("name may not be null");
      }

      if (!this.supportedOptions().contains(name)) {
         throw new UnsupportedOperationException("'" + name + "' not supported");
      }

      Common.setSocketOption(this.getFD(), name, value);
      return this;
   }

   @Override
   public SocketAddress getLocalAddress() throws IOException {
      return this.localAddress;
   }

   @Override
   public final Set<SocketOption<?>> supportedOptions() {
      return UnixSocketChannel.DefaultOptionsHolder.defaultOptions;
   }

   public static final UnixSocketChannel create() throws IOException {
      return new UnixSocketChannel();
   }

   @Override
   public boolean finishConnect() throws IOException {
      this.stateLock.writeLock().lock();

      try {
         switch (this.state) {
            case CONNECTED:
               return true;
            case CONNECTING:
               if (!this.doConnect(this.remoteAddress.getStruct())) {
                  return false;
               }

               this.state = UnixSocketChannel.State.CONNECTED;
               return true;
            default:
               throw new IllegalStateException("socket is not waiting for connect to complete");
         }
      } finally {
         this.stateLock.writeLock().unlock();
      }
   }

   // $VF: Compiled from UnixSocketChannel.java
   private static class DefaultOptionsHolder {
      static final Set<SocketOption<?>> defaultOptions = defaultOptions();

      private static Set<SocketOption<?>> defaultOptions() {
         HashSet<SocketOption<?>> set = new HashSet(5);
         set.add(UnixSocketOptions.SO_SNDBUF);
         set.add(UnixSocketOptions.SO_SNDTIMEO);
         set.add(UnixSocketOptions.SO_RCVBUF);
         set.add(UnixSocketOptions.SO_RCVTIMEO);
         set.add(UnixSocketOptions.SO_PEERCRED);
         set.add(UnixSocketOptions.SO_KEEPALIVE);
         set.add(UnixSocketOptions.SO_PASSCRED);
         return Collections.unmodifiableSet(set);
      }
   }

   // $VF: Compiled from UnixSocketChannel.java
   enum State {
      UNINITIALIZED,
      CONNECTING,
      CONNECTED,
      IDLE;
   }
}
