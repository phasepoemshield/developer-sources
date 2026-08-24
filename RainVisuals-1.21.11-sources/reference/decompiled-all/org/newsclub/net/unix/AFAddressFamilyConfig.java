package org.newsclub.net.unix;

// $VF: Compiled from AFAddressFamilyConfig.java
public abstract class AFAddressFamilyConfig<A extends AFSocketAddress> {
   protected abstract AFServerSocket.Constructor<A> serverSocketConstructor();

   protected abstract Class<? extends AFServerSocketChannel<A>> serverSocketChannelClass();

   protected abstract Class<? extends AFSocket<A>> socketClass();

   protected abstract AFDatagramSocket.Constructor<A> datagramSocketConstructor();

   protected AFAddressFamilyConfig() {
   }

   protected abstract Class<? extends AFDatagramSocket<A>> datagramSocketClass();

   protected abstract Class<? extends AFServerSocket<A>> serverSocketClass();

   protected abstract AFSocket.Constructor<A> socketConstructor();

   protected abstract Class<? extends AFDatagramChannel<A>> datagramChannelClass();

   protected abstract Class<? extends AFSocketChannel<A>> socketChannelClass();
}
