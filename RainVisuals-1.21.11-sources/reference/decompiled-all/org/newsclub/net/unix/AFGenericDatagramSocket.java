package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;

// $VF: Compiled from AFGenericDatagramSocket.java
final class AFGenericDatagramSocket extends AFDatagramSocket<AFGenericSocketAddress> implements AFGenericSocketExtensions {
   AFGenericDatagramSocket(FileDescriptor fd, AFSocketType socketType) throws IOException {
      super(new AFGenericDatagramSocketImpl(fd, socketType));
   }

   @Override
   protected AFDatagramSocket<AFGenericSocketAddress> newDatagramSocketInstance() throws IOException {
      return new AFGenericDatagramSocket(null);
   }

   public static AFGenericDatagramSocket newInstance(AFSocketType socketType) throws IOException {
      return (AFGenericDatagramSocket)newInstance(fd -> new AFGenericDatagramSocket(fd, socketType));
   }

   public static AFGenericDatagramSocket newInstance() throws IOException {
      return (AFGenericDatagramSocket)newInstance(AFGenericDatagramSocket::new);
   }

   public AFGenericDatagramChannel getChannel() {
      return (AFGenericDatagramChannel)super.getChannel();
   }

   protected AFGenericDatagramChannel newChannel() {
      return new AFGenericDatagramChannel(this);
   }

   protected AFGenericSocketImplExtensions getImplExtensions() {
      return (AFGenericSocketImplExtensions)super.getImplExtensions();
   }

   AFGenericDatagramSocket(FileDescriptor fd) throws IOException {
      this(fd, AFSocketType.SOCK_DGRAM);
   }
}
