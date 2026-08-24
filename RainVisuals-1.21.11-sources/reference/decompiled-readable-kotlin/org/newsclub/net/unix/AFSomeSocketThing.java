package org.newsclub.net.unix;

import java.io.Closeable;
import java.net.SocketAddress;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from AFSomeSocketThing.java
public interface AFSomeSocketThing extends FileDescriptorAccess, Closeable {
   void setShutdownOnClose(boolean var1);

   @Nullable SocketAddress getLocalSocketAddress();
}
