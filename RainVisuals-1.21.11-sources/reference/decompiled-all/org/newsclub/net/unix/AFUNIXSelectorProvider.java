package org.newsclub.net.unix;

import com.kohlschutter.annotations.compiletime.SuppressFBWarnings;
import java.io.IOException;
import java.net.ProtocolFamily;
import java.net.SocketAddress;
import org.eclipse.jdt.annotation.NonNull;

// $VF: Compiled from AFUNIXSelectorProvider.java
public final class AFUNIXSelectorProvider extends AFSelectorProvider<AFUNIXSocketAddress> {
   private static final AFUNIXSelectorProvider INSTANCE = new AFUNIXSelectorProvider();
   static final AFAddressFamily<@NonNull AFUNIXSocketAddress> AF_UNIX = AFAddressFamily.registerAddressFamilyImpl(
      "un", AFUNIXSocketAddress.AF_UNIX, new AFAddressFamilyConfig<AFUNIXSocketAddress>()   // $VF: Compiled from AFUNIXSelectorProvider.java
    {
         @Override
         public Class<? extends AFDatagramChannel<AFUNIXSocketAddress>> datagramChannelClass() {
            return AFUNIXDatagramChannel.class;
         }

         @Override
         public Class<? extends AFDatagramSocket<AFUNIXSocketAddress>> datagramSocketClass() {
            return AFUNIXDatagramSocket.class;
         }

         @Override
         public AFSocket.Constructor<AFUNIXSocketAddress> socketConstructor() {
            return AFUNIXSocket::new;
         }

         @Override
         public AFDatagramSocket.Constructor<AFUNIXSocketAddress> datagramSocketConstructor() {
            return AFUNIXDatagramSocket::new;
         }

         @Override
         public Class<? extends AFSocketChannel<AFUNIXSocketAddress>> socketChannelClass() {
            return AFUNIXSocketChannel.class;
         }

         @Override
         public Class<? extends AFServerSocket<AFUNIXSocketAddress>> serverSocketClass() {
            return AFUNIXServerSocket.class;
         }

         @Override
         public Class<? extends AFServerSocketChannel<AFUNIXSocketAddress>> serverSocketChannelClass() {
            return AFUNIXServerSocketChannel.class;
         }

         @Override
         public AFServerSocket.Constructor<AFUNIXSocketAddress> serverSocketConstructor() {
            return AFUNIXServerSocket::new;
         }

         @Override
         public Class<? extends AFSocket<AFUNIXSocketAddress>> socketClass() {
            return AFUNIXSocket.class;
         }
      }
   );

   public AFUNIXDatagramChannel openDatagramChannel(ProtocolFamily family) throws IOException {
      return (AFUNIXDatagramChannel)super.openDatagramChannel(family);
   }

   public AFUNIXDatagramChannel openDatagramChannel(AFSocketType type) throws IOException {
      return AFUNIXDatagramSocket.newInstance(type).getChannel();
   }

   @Override
   protected ProtocolFamily protocolFamily() {
      return AFUNIXProtocolFamily.UNIX;
   }

   public AFUNIXSocketPair<AFUNIXSocketChannel> openSocketChannelPair() throws IOException {
      return (AFUNIXSocketPair<AFUNIXSocketChannel>)super.openSocketChannelPair();
   }

   public AFUNIXSocketChannel openSocketChannel() throws IOException {
      return (AFUNIXSocketChannel)super.openSocketChannel();
   }

   public AFUNIXSocketChannel openSocketChannel(SocketAddress sa) throws IOException {
      return AFUNIXSocket.connectTo(AFUNIXSocketAddress.unwrap(sa)).getChannel();
   }

   @Override
   protected AFAddressFamily<@NonNull AFUNIXSocketAddress> addressFamily() {
      return AFUNIXSocketAddress.AF_UNIX;
   }

   protected AFUNIXSocket newSocket() throws IOException {
      return AFUNIXSocket.newInstance();
   }

   public AFUNIXServerSocketChannel openServerSocketChannel() throws IOException {
      return AFUNIXServerSocket.newInstance().getChannel();
   }

   private AFUNIXSelectorProvider() {
   }

   @Override
   protected <P extends AFSomeSocket> AFSocketPair<P> newSocketPair(P s2, P s1) {
      return new AFUNIXSocketPair<>(s1, s2);
   }

   public AFUNIXSocketPair<AFUNIXDatagramChannel> openDatagramChannelPair() throws IOException {
      return (AFUNIXSocketPair<AFUNIXDatagramChannel>)super.openDatagramChannelPair();
   }

   public AFUNIXDatagramChannel openDatagramChannel() throws IOException {
      return AFUNIXDatagramSocket.newInstance().getChannel();
   }

   public AFUNIXServerSocketChannel openServerSocketChannel(SocketAddress sa) throws IOException {
      return AFUNIXServerSocket.bindOn(AFUNIXSocketAddress.unwrap(sa)).getChannel();
   }

   public static AFUNIXSelectorProvider provider() {
      return getInstance();
   }

   public AFUNIXSocketPair<AFUNIXDatagramChannel> openDatagramChannelPair(AFSocketType type) throws IOException {
      return (AFUNIXSocketPair<AFUNIXDatagramChannel>)super.openDatagramChannelPair(type);
   }

   @SuppressFBWarnings("MS_EXPOSE_REP")
   public static AFUNIXSelectorProvider getInstance() {
      return INSTANCE;
   }
}
