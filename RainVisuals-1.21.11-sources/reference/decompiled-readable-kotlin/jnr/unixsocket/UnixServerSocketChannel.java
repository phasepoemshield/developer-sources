package jnr.unixsocket;

import java.io.IOException;
import java.nio.channels.ClosedChannelException;
import java.nio.channels.NotYetBoundException;
import java.nio.channels.spi.SelectorProvider;
import jnr.constants.platform.ProtocolFamily;
import jnr.constants.platform.Sock;
import jnr.ffi.byref.IntByReference;
import jnr.unixsocket.impl.AbstractNativeServerSocketChannel;

// $VF: Compiled from UnixServerSocketChannel.java
public class UnixServerSocketChannel extends AbstractNativeServerSocketChannel {
   private final UnixServerSocket socket = new UnixServerSocket(this);

   UnixServerSocketChannel(SelectorProvider provider, int fd) {
      super(provider, fd, 17);
   }

   UnixServerSocketChannel(UnixServerSocket socket) throws IOException {
      super(Native.socket(ProtocolFamily.PF_UNIX, Sock.SOCK_STREAM, 0));
   }

   public UnixSocketChannel accept() throws IOException {
      UnixSocketAddress remote = new UnixSocketAddress();
      SockAddrUnix addr = remote.getStruct();
      int maxLength = addr.getMaximumLength();
      IntByReference len = new IntByReference(maxLength);
      int clientfd = -1;
      this.begin();

      try {
         clientfd = Native.accept(this.getFD(), addr, len);
      } finally {
         this.end(clientfd >= 0);
      }

      if (clientfd < 0) {
         if (this.isBlocking()) {
            switch (Native.getLastError()) {
               case EBADF:
                  throw new ClosedChannelException();
               case EINVAL:
                  throw new NotYetBoundException();
               default:
                  throw new IOException("accept failed: " + Native.getLastErrorString());
            }
         } else {
            return null;
         }
      } else {
         addr.updatePath(len.getValue());
         Native.setBlocking(clientfd, true);
         return new UnixSocketChannel(clientfd);
      }
   }

   public final UnixSocketAddress getLocalSocketAddress() {
      return this.socket.localAddress;
   }

   public final UnixSocketAddress getRemoteSocketAddress() {
      return null;
   }

   public static UnixServerSocketChannel open() throws IOException {
      return (new UnixServerSocket()).channel;
   }

   public final UnixServerSocket socket() {
      return this.socket;
   }
}
