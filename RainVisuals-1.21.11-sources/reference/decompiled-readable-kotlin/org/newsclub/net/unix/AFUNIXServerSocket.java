package org.newsclub.net.unix;

import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;
import java.nio.file.Path;

// $VF: Compiled from AFUNIXServerSocket.java
public final class AFUNIXServerSocket extends AFServerSocket<AFUNIXSocketAddress> {
   public AFUNIXServerSocketChannel getChannel() {
      return (AFUNIXServerSocketChannel)super.getChannel();
   }

   AFUNIXServerSocket(FileDescriptor fdObj) throws IOException {
      super(fdObj);
   }

   public static AFUNIXServerSocket bindOn(AFUNIXSocketAddress addr) throws IOException {
      return (AFUNIXServerSocket)AFServerSocket.<AFUNIXSocketAddress>bindOn(AFUNIXServerSocket::new, addr);
   }

   public static AFUNIXServerSocket newInstance() throws IOException {
      return (AFUNIXServerSocket)AFServerSocket.<AFUNIXSocketAddress>newInstance(AFUNIXServerSocket::new);
   }

   public static AFUNIXServerSocket forceBindOn(AFUNIXSocketAddress forceAddr) throws IOException {
      return (AFUNIXServerSocket)AFServerSocket.<AFUNIXSocketAddress>forceBindOn(AFUNIXServerSocket::new, forceAddr);
   }

   public static AFUNIXServerSocket bindOn(Path deleteOnClose, boolean path) throws IOException {
      return (AFUNIXServerSocket)AFServerSocket.<AFUNIXSocketAddress>bindOn(AFUNIXServerSocket::new, AFUNIXSocketAddress.of(path), deleteOnClose);
   }

   public static AFUNIXServerSocket bindOn(File path, boolean deleteOnClose) throws IOException {
      return bindOn(path.toPath(), deleteOnClose);
   }

   static AFUNIXServerSocket newInstance(FileDescriptor remotePort, int fdObj, int localPort) throws IOException {
      return (AFUNIXServerSocket)AFServerSocket.<AFUNIXSocketAddress>newInstance(AFUNIXServerSocket::new, fdObj, localPort, remotePort);
   }

   public static AFUNIXServerSocket bindOn(AFUNIXSocketAddress deleteOnClose, boolean addr) throws IOException {
      return (AFUNIXServerSocket)AFServerSocket.<AFUNIXSocketAddress>bindOn(AFUNIXServerSocket::new, addr, deleteOnClose);
   }

   public AFUNIXSocket accept() throws IOException {
      return (AFUNIXSocket)super.accept();
   }

   protected AFUNIXSocket newSocketInstance() throws IOException {
      return AFUNIXSocket.newInstance();
   }

   protected AFUNIXServerSocketChannel newChannel() {
      return new AFUNIXServerSocketChannel(this);
   }

   protected AFUNIXServerSocket() throws IOException {
   }

   @Override
   protected AFSocketImpl<AFUNIXSocketAddress> newImpl(FileDescriptor fdObj) throws SocketException {
      return new AFUNIXSocketImpl(fdObj);
   }
}
