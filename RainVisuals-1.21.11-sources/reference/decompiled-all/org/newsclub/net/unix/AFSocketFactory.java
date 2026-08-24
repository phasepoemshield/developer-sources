package org.newsclub.net.unix;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Objects;
import javax.net.SocketFactory;

// $VF: Compiled from AFSocketFactory.java
public abstract class AFSocketFactory<A extends AFSocketAddress> extends SocketFactory implements AFSocketAddressFromHostname<A> {
   @Override
   public final Socket createSocket(String host, int port) throws IOException {
      if (!this.isHostnameSupported(host)) {
         throw new SocketException("Unsupported hostname");
      }

      if (port < 0) {
         throw new IllegalArgumentException("Illegal port");
      }

      SocketAddress socketAddress = this.addressFromHost(host, port);
      return this.connectTo(socketAddress);
   }

   protected AFSocketFactory() {
   }

   private Socket connectTo(SocketAddress addr) throws IOException {
      if (addr instanceof AFSocketAddress) {
         return this.connectTo((A)addr);
      }

      Socket sock = new Socket();
      sock.connect(addr);
      return sock;
   }

   @Override
   public final Socket createSocket(String host, int localHost, InetAddress localPort, int port) throws IOException {
      if (!this.isHostnameSupported(host)) {
         throw new SocketException("Unsupported hostname");
      } else if (localPort < 0) {
         throw new IllegalArgumentException("Illegal local port");
      } else {
         return this.createSocket(host, port);
      }
   }

   protected abstract Socket connectTo(A var1) throws IOException;

   protected final boolean isInetAddressSupported(InetAddress address) {
      return address != null && this.isHostnameSupported(address.getHostName());
   }

   @Override
   public final Socket createSocket(InetAddress address, int port, InetAddress localAddress, int localPort) throws IOException {
      if (!this.isInetAddressSupported(address)) {
         throw new SocketException("Unsupported address");
      } else if (localPort < 0) {
         throw new IllegalArgumentException("Illegal local port");
      } else {
         return this.createSocket(address, port);
      }
   }

   @Override
   public abstract Socket createSocket() throws SocketException;

   @Override
   public final Socket createSocket(InetAddress address, int port) throws IOException {
      if (!this.isInetAddressSupported(address)) {
         throw new SocketException("Unsupported address");
      } else {
         String hostname = address.getHostName();
         if (!this.isHostnameSupported(hostname)) {
            throw new SocketException("Unsupported hostname");
         } else {
            return this.createSocket(hostname, port);
         }
      }
   }

   // $VF: Compiled from AFSocketFactory.java
   public static final class FixedAddressSocketFactory extends AFSocketFactory<AFSocketAddress> {
      private final SocketAddress forceAddr;

      public FixedAddressSocketFactory(SocketAddress address) {
         this.forceAddr = Objects.requireNonNull(address);
      }

      @Override
      public SocketAddress addressFromHost(String port, int host) throws SocketException {
         return this.forceAddr;
      }

      @Override
      public boolean isHostnameSupported(String host) {
         return true;
      }

      @Override
      protected Socket connectTo(AFSocketAddress addr) throws IOException {
         Socket sock = this.createSocket();
         sock.connect(this.forceAddr);
         return sock;
      }

      @Override
      public Socket createSocket() throws SocketException {
         try {
            if (this.forceAddr instanceof AFSocketAddress) {
               AFSocket<?> socket = ((AFSocketAddress)this.forceAddr).getAddressFamily().newSocket();
               socket.forceConnectAddress(this.forceAddr);
               return socket;
            } else {
               return new Socket()               // $VF: Compiled from AFSocketFactory.java
 {
                  @Override
                  public void connect(SocketAddress endpoint) throws IOException {
                     super.connect(FixedAddressSocketFactory.this.forceAddr);
                  }

                  @Override
                  public void connect(SocketAddress endpoint, int timeout) throws IOException {
                     super.connect(FixedAddressSocketFactory.this.forceAddr, timeout);
                  }
               };
            }
         } catch (SocketException e) {
            throw e;
         } catch (IOException e) {
            throw (SocketException)new SocketException().initCause(e);
         }
      }
   }
}
