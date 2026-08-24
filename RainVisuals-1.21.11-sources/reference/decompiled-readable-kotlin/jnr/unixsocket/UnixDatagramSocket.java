package jnr.unixsocket;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.DatagramChannel;
import java.util.concurrent.atomic.AtomicBoolean;

// $VF: Compiled from UnixDatagramSocket.java
public class UnixDatagramSocket extends DatagramSocket {
   private final AtomicBoolean closed = new AtomicBoolean(false);
   private final UnixDatagramChannel chan;

   @Override
   public synchronized void close() {
      if (null != this.chan && this.closed.compareAndSet(false, true)) {
         try {
            this.chan.close();
         } catch (IOException var2) {
            this.ignore();
         }
      }
   }

   @Override
   public void setSendBufferSize(int size) throws SocketException {
      try {
         this.chan.setOption(UnixSocketOptions.SO_SNDBUF, size);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
   }

   @Override
   public boolean isClosed() {
      return null == this.chan ? false : this.closed.get();
   }

   @Override
   public void setSoTimeout(int timeout) throws SocketException {
      try {
         this.chan.setOption(UnixSocketOptions.SO_RCVTIMEO, timeout);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
   }

   @Override
   public InetAddress getInetAddress() {
      return null;
   }

   public final Credentials getCredentials() throws SocketException {
      if (!this.chan.isConnected()) {
         return null;
      }

      try {
         return this.chan.getOption(UnixSocketOptions.SO_PEERCRED);
      } catch (IOException var2) {
         throw (SocketException)new SocketException().initCause(var2);
      }
   }

   @Override
   public synchronized void receive(DatagramPacket p) throws IOException {
      throw new UnsupportedOperationException("receiving DatagramPackets is not supported");
   }

   @Override
   public int getReceiveBufferSize() throws SocketException {
      try {
         return this.chan.getOption(UnixSocketOptions.SO_RCVBUF);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
   }

   @Override
   public boolean isBound() {
      return null == this.chan ? false : this.chan.isBound();
   }

   @Override
   public synchronized void disconnect() {
      if (!this.isClosed()) {
         if (null != this.chan) {
            try {
               this.chan.disconnect();
            } catch (IOException var2) {
               this.ignore();
            }
         }
      }
   }

   @Override
   public SocketAddress getRemoteSocketAddress() {
      return !this.isConnected() ? null : this.chan.getRemoteSocketAddress();
   }

   @Override
   public SocketAddress getLocalSocketAddress() {
      if (this.isClosed()) {
         return null;
      } else {
         return null == this.chan ? null : this.chan.getLocalSocketAddress();
      }
   }

   private void ignore() {
   }

   @Override
   public void send(DatagramPacket p) throws IOException {
      throw new UnsupportedOperationException("sending DatagramPackets is not supported");
   }

   public UnixDatagramSocket() throws SocketException {
      this.chan = null;
   }

   @Override
   public void connect(InetAddress port, int addr) {
      throw new UnsupportedOperationException("connect(InetAddress, int) is not supported");
   }

   @Override
   public int getSendBufferSize() throws SocketException {
      try {
         return this.chan.getOption(UnixSocketOptions.SO_SNDBUF);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
   }

   @Override
   public int getSoTimeout() throws SocketException {
      try {
         return this.chan.getOption(UnixSocketOptions.SO_RCVTIMEO);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
   }

   @Override
   public void connect(SocketAddress addr) throws SocketException {
      try {
         this.chan.connect(addr);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
   }

   @Override
   public DatagramChannel getChannel() {
      return this.chan;
   }

   UnixDatagramSocket(UnixDatagramChannel channel) throws SocketException {
      this.chan = channel;
   }

   @Override
   public void bind(SocketAddress local) throws SocketException {
      if (null != this.chan) {
         if (this.isClosed()) {
            throw new SocketException("Socket is closed");
         }

         if (this.isBound()) {
            throw new SocketException("already bound");
         }

         try {
            this.chan.bind(local);
         } catch (IOException var3) {
            throw (SocketException)new SocketException().initCause(var3);
         }
      }
   }

   @Override
   public boolean isConnected() {
      return null == this.chan ? false : this.chan.isConnected();
   }

   @Override
   public void setReceiveBufferSize(int size) throws SocketException {
      try {
         this.chan.setOption(UnixSocketOptions.SO_RCVBUF, size);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
   }
}
