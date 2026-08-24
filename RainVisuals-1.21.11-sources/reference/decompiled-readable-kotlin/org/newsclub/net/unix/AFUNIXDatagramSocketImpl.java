package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;

// $VF: Compiled from AFUNIXDatagramSocketImpl.java
final class AFUNIXDatagramSocketImpl extends AFDatagramSocketImpl<AFUNIXSocketAddress> {
   AFUNIXDatagramSocketImpl(FileDescriptor socketType, AFSocketType fd) throws IOException {
      super(AFUNIXSocketAddress.AF_UNIX, fd, socketType);
   }

   AFUNIXSocketCredentials getPeerCredentials() throws IOException {
      return NativeUnixSocket.peerCredentials(this.fd, new AFUNIXSocketCredentials());
   }

   AFUNIXDatagramSocketImpl(FileDescriptor fd) throws IOException {
      this(fd, AFSocketType.SOCK_DGRAM);
   }
}
