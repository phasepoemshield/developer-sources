package org.newsclub.net.unix;

import java.io.IOException;

// $VF: Compiled from AFGenericServerSocketChannel.java
final class AFGenericServerSocketChannel extends AFServerSocketChannel<AFGenericSocketAddress> {
   AFGenericServerSocketChannel(AFGenericServerSocket socket) {
      super(socket, AFGenericSelectorProvider.getInstance());
   }

   public static AFGenericServerSocketChannel open() throws IOException {
      return AFGenericServerSocket.newInstance().getChannel();
   }

   public AFGenericSocketChannel accept() throws IOException {
      return (AFGenericSocketChannel)super.accept();
   }
}
