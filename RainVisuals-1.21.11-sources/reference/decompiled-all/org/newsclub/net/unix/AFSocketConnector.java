package org.newsclub.net.unix;

import java.io.IOException;

// $VF: Compiled from AFSocketConnector.java
public interface AFSocketConnector<A extends AFSocketAddress, T extends AFSocketAddress> {
   AFSocket<? extends T> connect(A var1) throws IOException;
}
