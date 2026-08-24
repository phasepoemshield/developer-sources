package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;

// $VF: Compiled from AFUNIXDatagramSocket.java
public final class AFUNIXDatagramSocket extends AFDatagramSocket<AFUNIXSocketAddress> implements AFUNIXSocketExtensions {
   @Override
   public void setOutboundFileDescriptors(FileDescriptor... fdescs) throws IOException {
      if (fdescs != null && fdescs.length > 0 && !this.isConnected()) {
         throw new SocketException("Not connected");
      }

      this.getAncillaryDataSupport().setOutboundFileDescriptors(fdescs);
   }

   @Override
   public FileDescriptor[] getReceivedFileDescriptors() throws IOException {
      return this.getAncillaryDataSupport().getReceivedFileDescriptors();
   }

   AFUNIXDatagramSocket(FileDescriptor fd) throws IOException {
      super(new AFUNIXDatagramSocketImpl(fd));
   }

   @Override
   public boolean hasOutboundFileDescriptors() {
      return this.getAncillaryDataSupport().hasOutboundFileDescriptors();
   }

   public static AFUNIXDatagramSocket newInstance() throws IOException {
      return (AFUNIXDatagramSocket)newInstance(AFUNIXDatagramSocket::new);
   }

   static AFUNIXDatagramSocket newInstance(FileDescriptor localPort, int fdObj, int remotePort) throws IOException {
      return (AFUNIXDatagramSocket)newInstance(AFUNIXDatagramSocket::new, fdObj, localPort, remotePort);
   }

   @Override
   protected AFDatagramSocket<AFUNIXSocketAddress> newDatagramSocketInstance() throws IOException {
      return new AFUNIXDatagramSocket(null);
   }

   public AFUNIXDatagramChannel getChannel() {
      return (AFUNIXDatagramChannel)super.getChannel();
   }

   private AFUNIXDatagramSocket(FileDescriptor fd, AFSocketType socketType) throws IOException {
      super(new AFUNIXDatagramSocketImpl(fd, socketType));
   }

   protected AFUNIXDatagramChannel newChannel() {
      return new AFUNIXDatagramChannel(this);
   }

   @Override
   public AFUNIXSocketCredentials getPeerCredentials() throws IOException {
      if (!this.isClosed() && this.isConnected()) {
         return ((AFUNIXDatagramSocketImpl)this.getAFImpl()).getPeerCredentials();
      } else {
         throw new SocketException("Not connected");
      }
   }

   @Override
   public void clearReceivedFileDescriptors() {
      this.getAncillaryDataSupport().clearReceivedFileDescriptors();
   }

   public static AFUNIXDatagramSocket newInstance(AFSocketType socketType) throws IOException {
      return (AFUNIXDatagramSocket)newInstance(fd -> new AFUNIXDatagramSocket(fd, socketType));
   }
}
