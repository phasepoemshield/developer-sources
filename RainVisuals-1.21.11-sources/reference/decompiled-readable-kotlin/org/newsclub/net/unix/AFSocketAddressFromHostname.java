package org.newsclub.net.unix;

import java.net.SocketAddress;
import java.net.SocketException;

// $VF: Compiled from AFSocketAddressFromHostname.java
public interface AFSocketAddressFromHostname<A extends AFSocketAddress> {
   default boolean isHostnameSupported(String host) {
      return host != null;
   }

   SocketAddress addressFromHost(String var1, int var2) throws SocketException;
}
