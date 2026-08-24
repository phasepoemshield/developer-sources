package org.newsclub.net.unix;

// $VF: Compiled from AFGenericSocketChannel.java
final class AFGenericSocketChannel extends AFSocketChannel<AFGenericSocketAddress> implements AFGenericSocketExtensions {
   AFGenericSocketChannel(AFGenericSocket socket) {
      super(socket, AFGenericSelectorProvider.getInstance());
   }
}
