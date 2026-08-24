package org.newsclub.net.unix;

import java.io.IOException;
import java.net.SocketAddress;

// $VF: Compiled from SocketAddressFilter.java
@FunctionalInterface
public interface SocketAddressFilter {
   SocketAddress apply(SocketAddress var1) throws IOException;
}
