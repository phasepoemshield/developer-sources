package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketAddress;
import java.net.SocketException;

// $VF: Compiled from AFUNIXSocketChannel.java
public final class AFUNIXSocketChannel extends AFSocketChannel<AFUNIXSocketAddress> implements AFUNIXSocketExtensions {
   public static AFUNIXSocketChannel open(SocketAddress remote) throws IOException {
      return (AFUNIXSocketChannel)AFSocketChannel.<AFUNIXSocketAddress>open(AFUNIXSocket::newLenientInstance, remote);
   }

   public static AFUNIXSocketChannel open() throws IOException {
      return (AFUNIXSocketChannel)AFSocketChannel.<AFUNIXSocketAddress>open(AFUNIXSocket::newLenientInstance);
   }

   @Override
   public FileDescriptor[] getReceivedFileDescriptors() throws IOException {
      return ((AFUNIXSocketExtensions)this.getAFSocket()).getReceivedFileDescriptors();
   }

   @Override
   public void setOutboundFileDescriptors(FileDescriptor... fdescs) throws IOException {
      if (fdescs != null && fdescs.length > 0 && !this.isConnected()) {
         throw new SocketException("Not connected");
      }

      ((AFUNIXSocketExtensions)this.getAFSocket()).setOutboundFileDescriptors(fdescs);
   }

   @Override
   public void clearReceivedFileDescriptors() {
      ((AFUNIXSocketExtensions)this.getAFSocket()).clearReceivedFileDescriptors();
   }

   @Override
   public boolean hasOutboundFileDescriptors() {
      return ((AFUNIXSocketExtensions)this.getAFSocket()).hasOutboundFileDescriptors();
   }

   AFUNIXSocketChannel(AFUNIXSocket socket) {
      super(socket, AFUNIXSelectorProvider.getInstance());
   }

   @Override
   public AFUNIXSocketCredentials getPeerCredentials() throws IOException {
      return ((AFUNIXSocketExtensions)this.getAFSocket()).getPeerCredentials();
   }
}
