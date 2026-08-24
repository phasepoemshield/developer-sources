package org.newsclub.net.unix;

// $VF: Compiled from AFGenericDatagramChannel.java
final class AFGenericDatagramChannel extends AFDatagramChannel<AFGenericSocketAddress> implements AFGenericSocketExtensions {
   AFGenericDatagramChannel(AFGenericDatagramSocket socket) {
      super(AFGenericSelectorProvider.getInstance(), socket);
   }
}
