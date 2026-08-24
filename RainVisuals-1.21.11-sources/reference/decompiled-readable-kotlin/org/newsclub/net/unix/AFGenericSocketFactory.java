package org.newsclub.net.unix;

import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;

// $VF: Compiled from AFGenericSocketFactory.java
abstract class AFGenericSocketFactory extends AFSocketFactory<AFGenericSocketAddress> {
   @Override
   public final Socket createSocket() throws SocketException {
      return this.configure(AFGenericSocket.newInstance(this));
   }

   protected final AFGenericSocket connectTo(AFGenericSocketAddress addr) throws IOException {
      return this.configure(AFGenericSocket.connectTo(addr));
   }

   protected AFGenericSocket configure(AFGenericSocket sock) throws SocketException {
      return sock;
   }

   protected AFGenericSocketFactory() {
   }
}
