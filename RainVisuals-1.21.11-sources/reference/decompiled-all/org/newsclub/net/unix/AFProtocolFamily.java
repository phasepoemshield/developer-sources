package org.newsclub.net.unix;

import java.io.IOException;
import java.net.ProtocolFamily;

// $VF: Compiled from AFProtocolFamily.java
public interface AFProtocolFamily extends ProtocolFamily {
   AFServerSocketChannel<?> openServerSocketChannel() throws IOException;

   AFDatagramChannel<?> openDatagramChannel() throws IOException;

   AFSocketChannel<?> openSocketChannel() throws IOException;
}
