package jnr.unixsocket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.ByteBuffer;
import java.nio.channels.Channels;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SocketChannel;
import java.nio.channels.WritableByteChannel;
import java.util.concurrent.atomic.AtomicBoolean;

// $VF: Compiled from UnixSocket.java
public class UnixSocket extends Socket {
   private AtomicBoolean outdown;
   private InputStream in;
   private UnixSocketChannel chan;
   private AtomicBoolean indown;
   private AtomicBoolean closed = new AtomicBoolean(false);
   private OutputStream out;

   @Override
   public boolean getKeepAlive() throws SocketException {
      try {
         return this.chan.getOption(UnixSocketOptions.SO_KEEPALIVE);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
   }

   @Override
   public void setKeepAlive(boolean on) throws SocketException {
      try {
         this.chan.setOption(UnixSocketOptions.SO_KEEPALIVE, on);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
   }

   @Override
   public void connect(SocketAddress addr) throws IOException {
      this.connect(addr, 0);
   }

   @Override
   public void setReceiveBufferSize(int size) throws SocketException {
      try {
         this.chan.setOption(UnixSocketOptions.SO_RCVBUF, size);
      } catch (IOException e) {
         throw (SocketException)new SocketException().initCause(e);
      }
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
   public boolean isConnected() {
      return this.chan.isConnected();
   }

   @Override
   public void shutdownInput() throws IOException {
      if (this.indown.compareAndSet(false, true)) {
         this.chan.shutdownInput();
      }
   }

   @Override
   public InputStream getInputStream() throws IOException {
      if (this.chan.isConnected()) {
         return this.in;
      } else {
         throw new IOException("not connected");
      }
   }

   @Override
   public SocketChannel getChannel() {
      return this.chan;
   }

   @Override
   public InetAddress getInetAddress() {
      return null;
   }

   @Override
   public boolean isInputShutdown() {
      return this.indown.get();
   }

   private void ignore() {
   }

   @Override
   public SocketAddress getLocalSocketAddress() {
      return this.chan.getLocalSocketAddress();
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
   public void shutdownOutput() throws IOException {
      if (this.outdown.compareAndSet(false, true)) {
         this.chan.shutdownOutput();
      }
   }

   public UnixSocket(UnixSocketChannel chan) {
      this.indown = new AtomicBoolean(false);
      this.outdown = new AtomicBoolean(false);
      this.chan = chan;
      this.in = Channels.newInputStream(new UnixSocket.UnselectableByteChannel(chan));
      this.out = Channels.newOutputStream(new UnixSocket.UnselectableByteChannel(chan));
   }

   @Override
   public boolean isClosed() {
      return this.closed.get();
   }

   @Override
   public void connect(SocketAddress timeout, int addr) throws IOException {
      if (addr instanceof UnixSocketAddress) {
         this.chan.connect((UnixSocketAddress)addr);
      } else {
         throw new IllegalArgumentException("address of type " + addr.getClass() + " are not supported. Use " + UnixSocketAddress.class + " instead");
      }
   }

   @Override
   public SocketAddress getRemoteSocketAddress() {
      SocketAddress address = this.chan.getRemoteSocketAddress();
      return address != null ? address : null;
   }

   @Override
   public boolean isBound() {
      return null == this.chan ? false : this.chan.isBound();
   }

   @Override
   public boolean isOutputShutdown() {
      return this.outdown.get();
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
   public void close() throws IOException {
      if (null != this.chan && this.closed.compareAndSet(false, true)) {
         try {
            this.chan.close();
         } catch (IOException var2) {
            this.ignore();
         }
      }
   }

   @Override
   public OutputStream getOutputStream() throws IOException {
      if (this.chan.isConnected()) {
         return this.out;
      } else {
         throw new IOException("not connected");
      }
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
   public void setSoTimeout(int timeout) throws SocketException {
      try {
         this.chan.setOption(UnixSocketOptions.SO_RCVTIMEO, timeout);
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
   public void bind(SocketAddress local) throws IOException {
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

   // $VF: Compiled from UnixSocket.java
   static final class UnselectableByteChannel implements WritableByteChannel, ReadableByteChannel {
      private final UnixSocketChannel channel;

      @Override
      public boolean isOpen() {
         return this.channel.isOpen();
      }

      @Override
      public void close() throws IOException {
         this.channel.close();
      }

      @Override
      public int read(ByteBuffer dst) throws IOException {
         return this.channel.read(dst);
      }

      UnselectableByteChannel(UnixSocketChannel channel) {
         this.channel = channel;
      }

      @Override
      public int write(ByteBuffer src) throws IOException {
         return this.channel.write(src);
      }
   }
}
