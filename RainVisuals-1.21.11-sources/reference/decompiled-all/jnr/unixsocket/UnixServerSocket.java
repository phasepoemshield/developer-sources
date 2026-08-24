package jnr.unixsocket;

import java.io.IOException;
import java.net.SocketAddress;
import java.nio.channels.UnsupportedAddressTypeException;

// $VF: Compiled from UnixServerSocket.java
public class UnixServerSocket {
   final UnixServerSocketChannel channel;
   final int fd;
   volatile UnixSocketAddress localAddress;

   public void bind(SocketAddress endpoint) throws IOException {
      this.bind(endpoint, 128);
   }

   public UnixSocket accept() throws IOException {
      return new UnixSocket(this.channel.accept());
   }

   UnixServerSocket(UnixServerSocketChannel channel) {
      this.channel = channel;
      this.fd = channel.getFD();
   }

   public void bind(SocketAddress endpoint, int backlog) throws IOException {
      if (null != endpoint && !(endpoint instanceof UnixSocketAddress)) {
         throw new UnsupportedAddressTypeException();
      }

      this.localAddress = Common.bind(this.fd, (UnixSocketAddress)endpoint);
      if (Native.listen(this.fd, backlog) < 0) {
         throw new IOException(Native.getLastErrorString());
      }
   }

   public UnixServerSocket() throws IOException {
      this.channel = new UnixServerSocketChannel(this);
      this.fd = this.channel.getFD();
   }
}
