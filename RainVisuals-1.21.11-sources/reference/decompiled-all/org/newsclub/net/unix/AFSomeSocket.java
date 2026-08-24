package org.newsclub.net.unix;

import java.net.SocketAddress;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from AFSomeSocket.java
public interface AFSomeSocket extends AFSomeSocketThing {
   @Nullable SocketAddress getRemoteSocketAddress();
}
