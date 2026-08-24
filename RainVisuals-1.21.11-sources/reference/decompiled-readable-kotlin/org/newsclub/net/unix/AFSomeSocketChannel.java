package org.newsclub.net.unix;

import java.io.Closeable;
import java.io.IOException;
import java.nio.channels.SelectableChannel;

// $VF: Compiled from AFSomeSocketChannel.java
public interface AFSomeSocketChannel extends Closeable, AFSomeSocketThing, FileDescriptorAccess {
   boolean isBlocking();

   SelectableChannel configureBlocking(boolean var1) throws IOException;
}
