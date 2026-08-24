package org.newsclub.net.unix;

import java.io.IOException;

// $VF: Compiled from AFUNIXSocketPair.java
public final class AFUNIXSocketPair<T extends AFSomeSocket> extends AFSocketPair<T> {
   public static AFUNIXSocketPair<AFUNIXDatagramChannel> openDatagram() throws IOException {
      return AFUNIXSelectorProvider.provider().openDatagramChannelPair();
   }

   AFUNIXSocketPair(T socket2, T socket1) {
      super(socket1, socket2);
   }

   public static AFUNIXSocketPair<AFUNIXDatagramChannel> openDatagram(AFSocketType type) throws IOException {
      return AFUNIXSelectorProvider.provider().openDatagramChannelPair(type);
   }

   public static AFUNIXSocketPair<AFUNIXSocketChannel> open() throws IOException {
      return AFUNIXSelectorProvider.provider().openSocketChannelPair();
   }
}
