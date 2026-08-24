package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.ByteBuffer;
import java.nio.channels.DatagramChannel;
import java.nio.channels.MembershipKey;
import java.util.Set;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from AFDatagramChannel.java
public abstract class AFDatagramChannel<A extends AFSocketAddress> extends DatagramChannel implements AFSocketExtensions, AFSomeSocket, AFSomeSocketChannel {
   private final AFDatagramSocket<A> afSocket;

   protected final AFDatagramSocket<A> getAFSocket() {
      return this.afSocket;
   }

   public final @Nullable A getRemoteAddress() throws IOException {
      return this.getRemoteSocketAddress();
   }

   @Override
   public final Set<SocketOption<?>> supportedOptions() {
      return SocketOptionsMapper.SUPPORTED_SOCKET_OPTIONS;
   }

   @SuppressFBWarnings("EI_EXPOSE_REP")
   public final AFDatagramSocket<A> socket() {
      return this.afSocket;
   }

   @Override
   protected final void implCloseSelectableChannel() throws IOException {
      this.getAFSocket().close();
   }

   @Override
   public final boolean isConnected() {
      return this.afSocket.isConnected();
   }

   public final A receive(ByteBuffer dst) throws IOException {
      return this.afSocket.getAFImpl().receive(dst);
   }

   @Override
   public void setShutdownOnClose(boolean enabled) {
      this.getAFCore().setShutdownOnClose(enabled);
   }

   @Override
   public final long write(ByteBuffer[] length, int offset, int srcs) throws IOException {
      return length == 0 ? 0L : this.write(srcs[offset]);
   }

   public final AFDatagramChannel<A> connect(SocketAddress remote) throws IOException {
      this.afSocket.connect(remote);
      return this;
   }

   @Override
   public final long read(ByteBuffer[] length, int offset, int dsts) throws IOException {
      return length == 0 ? 0L : this.read(dsts[offset]);
   }

   final AFSocketCore getAFCore() {
      return this.afSocket.getAFImpl().getCore();
   }

   public final void setDeleteOnClose(boolean b) {
      this.afSocket.setDeleteOnClose(b);
   }

   public final AFDatagramChannel<A> bind(SocketAddress local) throws IOException {
      this.afSocket.bind(local);
      return this;
   }

   public final boolean isBound() {
      return this.afSocket.isBound();
   }

   @Override
   public final int send(ByteBuffer target, SocketAddress src) throws IOException {
      return this.afSocket.getAFImpl().send(src, target);
   }

   @Override
   public final MembershipKey join(InetAddress group, NetworkInterface interf, InetAddress source) throws IOException {
      throw new UnsupportedOperationException();
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

   @Override
   public final FileDescriptor getFileDescriptor() throws IOException {
      return this.afSocket.getFileDescriptor();
   }

   protected AFDatagramChannel(AFSelectorProvider<A> socket, AFDatagramSocket<A> selectorProvider) {
      super(selectorProvider);
      this.afSocket = socket;
   }

   public final @Nullable A getLocalAddress() throws IOException {
      return this.getLocalSocketAddress();
   }

   @Override
   public final int read(ByteBuffer dst) throws IOException {
      return this.afSocket.getAFImpl().read(dst, null);
   }

   @Override
   public final void setAncillaryReceiveBufferSize(int size) {
      this.afSocket.setAncillaryReceiveBufferSize(size);
   }

   @Override
   public final void ensureAncillaryReceiveBufferSize(int minSize) {
      this.afSocket.ensureAncillaryReceiveBufferSize(minSize);
   }

   public final @Nullable A getRemoteSocketAddress() {
      return this.afSocket.getRemoteSocketAddress();
   }

   @Override
   protected final void implConfigureBlocking(boolean block) throws IOException {
      this.getAFCore().implConfigureBlocking(block);
   }

   @Override
   public final int getAncillaryReceiveBufferSize() {
      return this.afSocket.getAncillaryReceiveBufferSize();
   }

   public final boolean isDeleteOnClose() {
      return this.afSocket.isDeleteOnClose();
   }

   public final <T> AFDatagramChannel<A> setOption(SocketOption<T> name, T value) throws IOException {
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
   public final MembershipKey join(InetAddress group, NetworkInterface interf) throws IOException {
      throw new UnsupportedOperationException();
   }

   public final @Nullable A getLocalSocketAddress() {
      return this.afSocket.getLocalSocketAddress();
   }

   @Override
   public final int write(ByteBuffer src) throws IOException {
      return this.afSocket.getAFImpl().write(src);
   }

   public final AFDatagramChannel<A> disconnect() throws IOException {
      this.afSocket.disconnect();
      return this;
   }
}
