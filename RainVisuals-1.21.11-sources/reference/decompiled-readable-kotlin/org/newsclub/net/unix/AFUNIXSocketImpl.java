package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;

// $VF: Compiled from AFUNIXSocketImpl.java
class AFUNIXSocketImpl extends AFSocketImpl<AFUNIXSocketAddress> {
   AFUNIXSocketCredentials getPeerCredentials() throws IOException {
      return NativeUnixSocket.peerCredentials(this.fd, new AFUNIXSocketCredentials());
   }

   protected AFUNIXSocketImpl(FileDescriptor fdObj) {
      super(AFUNIXSocketAddress.AF_UNIX, fdObj);
   }

   final FileDescriptor[] getReceivedFileDescriptors() {
      return this.ancillaryDataSupport.getReceivedFileDescriptors();
   }

   final void clearReceivedFileDescriptors() {
      this.ancillaryDataSupport.clearReceivedFileDescriptors();
   }

   final void receiveFileDescriptors(int[] fds) throws IOException {
      this.ancillaryDataSupport.receiveFileDescriptors(fds);
   }

   final boolean hasOutboundFileDescriptors() {
      return this.ancillaryDataSupport.hasOutboundFileDescriptors();
   }

   final void setOutboundFileDescriptors(FileDescriptor... fdescs) throws IOException {
      this.ancillaryDataSupport.setOutboundFileDescriptors(fdescs);
   }

   // $VF: Compiled from AFUNIXSocketImpl.java
   static final class Lenient extends AFUNIXSocketImpl {
      Lenient(FileDescriptor fdObj) throws SocketException {
         super(fdObj);
      }

      @Override
      public void setOption(int value, Object optID) throws SocketException {
         super.setOptionLenient(optID, value);
      }

      @Override
      public Object getOption(int optID) throws SocketException {
         return super.getOptionLenient(optID);
      }
   }
}
