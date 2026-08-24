package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;

// $VF: Compiled from AFGenericServerSocket.java
final class AFGenericServerSocket extends AFServerSocket<AFGenericSocketAddress> {
   public static AFGenericServerSocket newInstance() throws IOException {
      return (AFGenericServerSocket)AFServerSocket.<AFGenericSocketAddress>newInstance(AFGenericServerSocket::new);
   }

   AFGenericServerSocket(FileDescriptor fdObj) throws IOException {
      super(fdObj);
   }

   public AFGenericSocket accept() throws IOException {
      return (AFGenericSocket)super.accept();
   }

   public static AFGenericServerSocket bindOn(AFGenericSocketAddress addr, boolean deleteOnClose) throws IOException {
      return (AFGenericServerSocket)AFServerSocket.<AFGenericSocketAddress>bindOn(AFGenericServerSocket::new, addr, deleteOnClose);
   }

   public static AFGenericServerSocket forceBindOn(AFGenericSocketAddress forceAddr) throws IOException {
      return (AFGenericServerSocket)AFServerSocket.<AFGenericSocketAddress>forceBindOn(AFGenericServerSocket::new, forceAddr);
   }

   @Override
   protected AFSocket<AFGenericSocketAddress> newSocketInstance() throws IOException {
      return AFGenericSocket.newInstance();
   }

   @Override
   protected AFServerSocketChannel<AFGenericSocketAddress> newChannel() {
      return new AFGenericServerSocketChannel(this);
   }

   public AFGenericServerSocketChannel getChannel() {
      return (AFGenericServerSocketChannel)super.getChannel();
   }

   public static AFGenericServerSocket bindOn(AFGenericSocketAddress addr) throws IOException {
      return (AFGenericServerSocket)AFServerSocket.<AFGenericSocketAddress>bindOn(AFGenericServerSocket::new, addr);
   }

   static AFGenericServerSocket newInstance(FileDescriptor remotePort, int localPort, int fdObj) throws IOException {
      return (AFGenericServerSocket)AFServerSocket.<AFGenericSocketAddress>newInstance(AFGenericServerSocket::new, fdObj, localPort, remotePort);
   }

   @Override
   protected AFSocketImpl<AFGenericSocketAddress> newImpl(FileDescriptor fdObj) throws SocketException {
      return new AFGenericSocketImpl(fdObj);
   }
}
