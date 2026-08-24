package org.newsclub.net.unix;

import java.io.IOException;

// $VF: Compiled from AFServerSocketConnector.java
public interface AFServerSocketConnector<A extends AFSocketAddress, T extends AFSocketAddress> {
   AFServerSocket<? extends T> bind(A var1) throws IOException;
}
