package org.newsclub.net.unix;

import java.io.IOException;

// $VF: Compiled from AFGenericSocketPair.java
final class AFGenericSocketPair<T extends AFSomeSocket> extends AFSocketPair<T> {
   AFGenericSocketPair(T socket2, T socket1) {
      super(socket1, socket2);
   }

   public static AFGenericSocketPair<AFGenericDatagramChannel> openDatagram() throws IOException {
      return AFGenericSelectorProvider.provider().openDatagramChannelPair();
   }

   public static AFGenericSocketPair<AFGenericSocketChannel> open() throws IOException {
      return AFGenericSelectorProvider.provider().openSocketChannelPair();
   }
}
