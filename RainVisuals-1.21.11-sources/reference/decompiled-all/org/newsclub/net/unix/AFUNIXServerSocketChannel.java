package org.newsclub.net.unix;

import java.io.IOException;

// $VF: Compiled from AFUNIXServerSocketChannel.java
public final class AFUNIXServerSocketChannel extends AFServerSocketChannel<AFUNIXSocketAddress> {
   public static AFUNIXServerSocketChannel open() throws IOException {
      return AFUNIXServerSocket.newInstance().getChannel();
   }

   public AFUNIXSocketChannel accept() throws IOException {
      return (AFUNIXSocketChannel)super.accept();
   }

   AFUNIXServerSocketChannel(AFUNIXServerSocket socket) {
      super(socket, AFUNIXSelectorProvider.getInstance());
   }
}
