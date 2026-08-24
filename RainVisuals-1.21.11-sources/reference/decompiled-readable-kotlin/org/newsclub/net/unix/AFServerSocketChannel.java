package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketOption;
import java.nio.channels.ServerSocketChannel;
import java.util.Objects;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from AFServerSocketChannel.java
public abstract class AFServerSocketChannel<A extends AFSocketAddress> extends ServerSocketChannel implements FileDescriptorAccess, AFSomeSocketChannel {
   private final @NonNull AFServerSocket<A> afSocket;

   @Override
   public void setShutdownOnClose(boolean enabled) {
      this.socket().setShutdownOnClose(enabled);
   }

   @Override
   public final Set<SocketOption<?>> supportedOptions() {
      return SocketOptionsMapper.SUPPORTED_SOCKET_OPTIONS;
   }

   public AFSocketChannel<A> accept() throws IOException {
      AFSocket<A> socket = this.afSocket.accept1(false);
      return socket == null ? null : socket.getChannel();
   }

   @Override
   protected final void implConfigureBlocking(boolean block) throws IOException {
      this.getAFCore().implConfigureBlocking(block);
   }

   @SuppressFBWarnings("EI_EXPOSE_REP")
   public final AFServerSocket<A> socket() {
      return this.afSocket;
   }

   @Override
   public final FileDescriptor getFileDescriptor() throws IOException {
      return this.afSocket.getFileDescriptor();
   }

   public <T> AFServerSocketChannel<A> setOption(SocketOption<T> name, T value) throws IOException {
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

   public final boolean isDeleteOnClose() {
      return this.socket().isDeleteOnClose();
   }

   @Override
   protected final void implCloseSelectableChannel() throws IOException {
      this.afSocket.close();
   }

   final AFSocketCore getAFCore() {
      return this.afSocket.getAFImpl().getCore();
   }

   public final boolean isLocalSocketAddressValid() {
      return this.afSocket.isLocalSocketAddressValid();
   }

   public final @Nullable A getLocalAddress() {
      return this.getLocalSocketAddress();
   }

   @Override
   public <T> T getOption(SocketOption<T> name) throws IOException {
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

   public final @Nullable A getLocalSocketAddress() {
      return this.afSocket.getLocalSocketAddress();
   }

   public final void setDeleteOnClose(boolean b) {
      this.socket().setDeleteOnClose(b);
   }

   protected AFServerSocketChannel(AFServerSocket<A> sp, AFSelectorProvider<A> socket) {
      super(sp);
      this.afSocket = Objects.requireNonNull(socket);
   }

   public final AFServerSocketChannel<A> bind(SocketAddress backlog, int local) throws IOException {
      this.afSocket.bind(local, backlog);
      return this;
   }
}
