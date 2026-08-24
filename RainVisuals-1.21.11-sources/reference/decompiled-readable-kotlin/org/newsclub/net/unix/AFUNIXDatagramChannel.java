package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.ProtocolFamily;
import java.net.SocketException;

// $VF: Compiled from AFUNIXDatagramChannel.java
public final class AFUNIXDatagramChannel extends AFDatagramChannel<AFUNIXSocketAddress> implements AFUNIXSocketExtensions {
   AFUNIXDatagramChannel(AFUNIXDatagramSocket socket) {
      super(AFUNIXSelectorProvider.getInstance(), socket);
   }

   public static AFUNIXDatagramChannel open(ProtocolFamily family) throws IOException {
      return AFUNIXSelectorProvider.provider().openDatagramChannel(family);
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

   public static AFUNIXDatagramChannel open() throws IOException {
      return AFUNIXSelectorProvider.provider().openDatagramChannel();
   }

   @Override
   public FileDescriptor[] getReceivedFileDescriptors() throws IOException {
      return ((AFUNIXSocketExtensions)this.getAFSocket()).getReceivedFileDescriptors();
   }

   @Override
   public AFUNIXSocketCredentials getPeerCredentials() throws IOException {
      return ((AFUNIXSocketExtensions)this.getAFSocket()).getPeerCredentials();
   }
}
