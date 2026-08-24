package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jdt.annotation.NonNull;

// $VF: Compiled from AFSocketChannel.java
public abstract class AFSocketChannel<A extends AFSocketAddress> extends SocketChannel implements AFSocketExtensions, AFSomeSocket, AFSomeSocketChannel {
   private final AtomicBoolean connectPending = new AtomicBoolean(false);
   private final @NonNull AFSocket<A> afSocket;

   @Override
   public final void setAncillaryReceiveBufferSize(int size) {
      this.afSocket.setAncillaryReceiveBufferSize(size);
   }

   @Override
   public final int write(ByteBuffer src) throws IOException {
      return this.afSocket.getAFImpl().write(src);
   }

   final AFSocketCore getAFCore() {
      return this.afSocket.getAFImpl().getCore();
   }

   public final A getLocalSocketAddress() {
      return this.afSocket.getLocalSocketAddress();
   }

   public final AFSocketChannel<A> bind(SocketAddress local) throws IOException {
      this.afSocket.bind(local);
      return this;
   }

   @Override
   public final <T> T getOption(SocketOption<T> name) throws IOException {
      if (name instanceof AFSocketOption) {
         return this.getAFCore().getOption((AFSocketOption<T>)name);
      } else {
         Integer optionId = SocketOptionsMapper.resolve(name);
         if (optionId == null) {
            throw new UnsupportedOperationException("unsupported option");
         } else {
            return (T)this.afSocket.getAFImpl().getOption(optionId);
         }
      }
   }

   public final AFSocketChannel<A> shutdownInput() throws IOException {
      this.afSocket.getAFImpl().shutdownInput();
      return this;
   }

   @SuppressFBWarnings("EI_EXPOSE_REP")
   public final AFSocket<A> socket() {
      return this.afSocket;
   }

   public final <T> AFSocketChannel<A> setOption(SocketOption<T> name, T value) throws IOException {
      if (name instanceof AFSocketOption) {
         this.getAFCore().setOption((AFSocketOption<T>)name, value);
         return this;
      }

      Integer optionId = SocketOptionsMapper.resolve(name);
      if (optionId == null) {
         throw new UnsupportedOperationException("unsupported option");
      }

      this.afSocket.getAFImpl().setOption(optionId, value);
      return this;
   }

   @Override
   public void setShutdownOnClose(boolean enabled) {
      this.getAFCore().setShutdownOnClose(enabled);
   }

   public final A getRemoteAddress() throws IOException {
      return this.getRemoteSocketAddress();
   }

   @Override
   public final void ensureAncillaryReceiveBufferSize(int minSize) {
      this.afSocket.ensureAncillaryReceiveBufferSize(minSize);
   }

   protected final AFSocket<A> getAFSocket() {
      return this.afSocket;
   }

   @Override
   public final long read(ByteBuffer[] dsts, int offset, int length) throws IOException {
      return length == 0 ? 0L : this.read(dsts[offset]);
   }

   @Override
   public final Set<SocketOption<?>> supportedOptions() {
      return SocketOptionsMapper.SUPPORTED_SOCKET_OPTIONS;
   }

   public final A getRemoteSocketAddress() {
      return this.afSocket.getRemoteSocketAddress();
   }

   @Override
   public final int getAncillaryReceiveBufferSize() {
      return this.afSocket.getAncillaryReceiveBufferSize();
   }

   @Override
   public final long write(ByteBuffer[] srcs, int length, int offset) throws IOException {
      return length == 0 ? 0L : this.write(srcs[offset]);
   }

   @Override
   public final boolean isConnectionPending() {
      return this.connectPending.get();
   }

   @Override
   public final String toString() {
      return super.toString() + this.afSocket.toStringSuffix();
   }

   @Override
   protected final void implCloseSelectableChannel() throws IOException {
      this.afSocket.close();
   }

   protected AFSocketChannel(AFSocket<A> sp, AFSelectorProvider<A> socket) {
      super(sp);
      this.afSocket = Objects.requireNonNull(socket);
   }

   protected static final <A extends AFSocketAddress> AFSocketChannel<A> open(AFSocketChannel.AFSocketSupplier<A> remote, SocketAddress supplier) throws IOException {
      AFSocketChannel<A> sc = open(supplier);

      try {
         sc.connect(remote);
      } catch (Throwable var6) {
         try {
            sc.close();
         } catch (Throwable var5) {
            var6.addSuppressed(var5);
         }

         throw var6;
      }

      if (!$assertionsDisabled && !sc.isConnected()) {
         throw new AssertionError();
      } else {
         return sc;
      }
   }

   public final AFSocketChannel<A> shutdownOutput() throws IOException {
      this.afSocket.getAFImpl().shutdownOutput();
      return this;
   }

   @Override
   protected final void implConfigureBlocking(boolean block) throws IOException {
      this.getAFCore().implConfigureBlocking(block);
   }

   protected static final <A extends AFSocketAddress> AFSocketChannel<A> open(AFSocketChannel.AFSocketSupplier<A> supplier) throws IOException {
      return supplier.newInstance().getChannel();
   }

   @Override
   public final boolean finishConnect() throws IOException {
      if (this.isConnected()) {
         return true;
      }

      if (!this.isConnectionPending()) {
         return false;
      }

      boolean connected = NativeUnixSocket.finishConnect(this.afSocket.getFileDescriptor()) || this.isConnected();
      if (connected) {
         this.connectPending.set(false);
      }

      return connected;
   }

   @Override
   public final boolean connect(SocketAddress remote) throws IOException {
      boolean connected = this.afSocket.connect0(remote, 0);
      if (!connected) {
         this.connectPending.set(true);
      }

      return connected;
   }

   @Override
   public final FileDescriptor getFileDescriptor() throws IOException {
      return this.afSocket.getFileDescriptor();
   }

   @Override
   public final int read(ByteBuffer dst) throws IOException {
      return this.afSocket.getAFImpl().read(dst, null);
   }

   @Override
   public final boolean isConnected() {
      boolean connected = this.afSocket.isConnected();
      if (connected) {
         this.connectPending.set(false);
      }

      return connected;
   }

   public final A getLocalAddress() throws IOException {
      return this.getLocalSocketAddress();
   }

   // $VF: Compiled from AFSocketChannel.java
   @FunctionalInterface
   protected interface AFSocketSupplier<A extends AFSocketAddress> {
      AFSocket<A> newInstance() throws IOException;
   }
}
