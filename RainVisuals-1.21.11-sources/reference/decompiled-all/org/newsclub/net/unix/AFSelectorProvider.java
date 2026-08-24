package org.newsclub.net.unix;

import java.io.IOException;
import java.net.ProtocolFamily;
import java.net.SocketAddress;
import java.net.StandardProtocolFamily;
import java.nio.channels.DatagramChannel;
import java.nio.channels.Pipe;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.spi.AbstractSelector;
import java.nio.channels.spi.SelectorProvider;
import java.util.Objects;
import org.eclipse.jdt.annotation.NonNull;

// $VF: Compiled from AFSelectorProvider.java
public abstract class AFSelectorProvider<A extends AFSocketAddress> extends SelectorProviderShim {
   private static final SelectorProvider AF_PROVIDER = new SelectorProviderShim()   // $VF: Compiled from AFSelectorProvider.java
 {
      @Override
      public AbstractSelector openSelector() throws IOException {
         throw new UnsupportedOperationException("Use a specific AFSelectorProvider subclass");
      }

      @Override
      public DatagramChannel openDatagramChannel() throws IOException {
         throw new UnsupportedOperationException("Use openDatagramChannel(ProtocolFamily) or a specific AFSelectorProvider subclass");
      }

      @Override
      public SocketChannel openSocketChannel(ProtocolFamily family) throws IOException {
         Objects.requireNonNull(family);
         if (family instanceof AFProtocolFamily) {
            return ((AFProtocolFamily)family).openSocketChannel();
         } else {
            throw new UnsupportedOperationException("Unsupported protocol family");
         }
      }

      @Override
      public SocketChannel openSocketChannel() throws IOException {
         throw new UnsupportedOperationException("Use openSocketChannel(ProtocolFamily) or a specific AFSelectorProvider subclass");
      }

      @Override
      public ServerSocketChannel openServerSocketChannel(ProtocolFamily family) throws IOException {
         Objects.requireNonNull(family);
         if (family instanceof AFProtocolFamily) {
            return ((AFProtocolFamily)family).openServerSocketChannel();
         } else {
            throw new UnsupportedOperationException("Unsupported protocol family");
         }
      }

      @Override
      public Pipe openPipe() throws IOException {
         throw new UnsupportedOperationException("Use a specific AFSelectorProvider subclass");
      }

      @Override
      public DatagramChannel openDatagramChannel(ProtocolFamily family) throws IOException {
         Objects.requireNonNull(family);
         if (family instanceof AFProtocolFamily) {
            return ((AFProtocolFamily)family).openDatagramChannel();
         } else {
            throw new UnsupportedOperationException("Unsupported protocol family");
         }
      }

      @Override
      public ServerSocketChannel openServerSocketChannel() throws IOException {
         throw new UnsupportedOperationException("Use openServerSocketChannel(ProtocolFamily) or a specific AFSelectorProvider subclass");
      }
   };

   public AFServerSocketChannel<A> openServerSocketChannel(ProtocolFamily family) throws IOException {
      Objects.requireNonNull(family);
      if (!this.protocolFamily().equals(family) && (!(family instanceof StandardProtocolFamily) || !this.protocolFamily().name().equals(family.name()))) {
         throw new UnsupportedOperationException("Protocol family not supported");
      } else {
         return this.openServerSocketChannel();
      }
   }

   protected AFSelectorProvider() {
   }

   public abstract AFSocketChannel<A> openSocketChannel(SocketAddress var1) throws IOException;

   protected abstract <Y extends AFSomeSocket> AFSocketPair<Y> newSocketPair(Y var1, Y var2);

   public AFSocketChannel<A> openSocketChannel(ProtocolFamily family) throws IOException {
      Objects.requireNonNull(family);
      if (!this.protocolFamily().equals(family) && (!(family instanceof StandardProtocolFamily) || !this.protocolFamily().name().equals(family.name()))) {
         throw new UnsupportedOperationException("Protocol family not supported");
      } else {
         return this.openSocketChannel();
      }
   }

   public AFSocketPair<? extends AFDatagramChannel<A>> openDatagramChannelPair() throws IOException {
      return this.openDatagramChannelPair(AFSocketType.SOCK_DGRAM);
   }

   public AFSocketPair<? extends AFSocketChannel<A>> openSocketChannelPair() throws IOException {
      AFSocketChannel<A> s1 = this.openSocketChannel();
      AFSocketChannel<A> s2 = this.openSocketChannel();
      NativeUnixSocket.socketPair(this.domainId(), 1, s1.getAFCore().fd, s2.getAFCore().fd);
      s1.socket().internalDummyConnect();
      s2.socket().internalDummyConnect();
      return this.newSocketPair(s1, s2);
   }

   protected abstract AFAddressFamily<@NonNull A> addressFamily();

   @Override
   public final AbstractSelector openSelector() throws IOException {
      return new AFSelector(this);
   }

   public abstract AFDatagramChannel<A> openDatagramChannel() throws IOException;

   protected final int domainId() {
      return this.addressFamily().getDomain();
   }

   public AFDatagramChannel<A> openDatagramChannel(ProtocolFamily family) throws IOException {
      Objects.requireNonNull(family);
      if (!this.protocolFamily().equals(family) && (!(family instanceof StandardProtocolFamily) || !this.protocolFamily().name().equals(family.name()))) {
         throw new UnsupportedOperationException("Protocol family not supported");
      } else {
         return this.openDatagramChannel();
      }
   }

   public abstract AFServerSocketChannel<A> openServerSocketChannel() throws IOException;

   final AFPipe openSelectablePipe() throws IOException {
      return this.newPipe(true);
   }

   public static SelectorProvider provider() {
      return AF_PROVIDER;
   }

   public AFSocketChannel<A> openSocketChannel() throws IOException {
      return this.newSocket().getChannel();
   }

   public abstract AFDatagramChannel<A> openDatagramChannel(AFSocketType var1) throws IOException;

   protected abstract ProtocolFamily protocolFamily();

   public final AFPipe openPipe() throws IOException {
      return this.newPipe(false);
   }

   protected abstract AFSocket<A> newSocket() throws IOException;

   public abstract AFServerSocketChannel<A> openServerSocketChannel(SocketAddress var1) throws IOException;

   public AFSocketPair<? extends AFDatagramChannel<A>> openDatagramChannelPair(AFSocketType type) throws IOException {
      ProtocolFamily pf = this.protocolFamily();
      AFDatagramChannel<A> s1 = this.openDatagramChannel(pf);
      AFDatagramChannel<A> s2 = this.openDatagramChannel(pf);
      NativeUnixSocket.socketPair(this.domainId(), type.getId(), s1.getAFCore().fd, s2.getAFCore().fd);
      s1.socket().internalDummyBind();
      s2.socket().internalDummyBind();
      s1.socket().internalDummyConnect();
      s2.socket().internalDummyConnect();
      return this.newSocketPair(s1, s2);
   }

   private AFPipe newPipe(boolean selectable) throws IOException {
      return new AFPipe(this, selectable);
   }
}
