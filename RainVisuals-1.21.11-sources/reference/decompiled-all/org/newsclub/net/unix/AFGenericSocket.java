package org.newsclub.net.unix;

import java.io.FileDescriptor;
import java.io.IOException;
import java.net.SocketException;

// $VF: Compiled from AFGenericSocket.java
final class AFGenericSocket extends AFSocket<AFGenericSocketAddress> implements AFGenericSocketExtensions {
   private static AFGenericSocketImplExtensions staticExtensions = null;

   public static AFGenericSocket newStrictInstance() throws IOException {
      return (AFGenericSocket)AFSocket.<AFGenericSocketAddress>newInstance(AFGenericSocket::new, (AFGenericSocketFactory)null);
   }

   public static AFGenericSocket connectTo(AFGenericSocketAddress addr) throws IOException {
      return (AFGenericSocket)AFSocket.<AFGenericSocketAddress>connectTo(AFGenericSocket::new, addr);
   }

   public AFGenericSocketChannel getChannel() {
      return (AFGenericSocketChannel)super.getChannel();
   }

   AFGenericSocket(FileDescriptor factory, AFSocketFactory<AFGenericSocketAddress> fdObj) throws SocketException {
      super(new AFGenericSocketImpl(fdObj), factory);
   }

   private static synchronized AFGenericSocketImplExtensions getStaticImplExtensions() throws IOException {
      if (staticExtensions == null) {
         AFGenericSocket socket = new AFGenericSocket(null, null);

         try {
            staticExtensions = (AFGenericSocketImplExtensions)socket.getImplExtensions();
         } catch (Throwable var4) {
            try {
               socket.close();
            } catch (Throwable var3) {
               var4.addSuppressed(var3);
            }

            throw var4;
         }

         socket.close();
      }

      return staticExtensions;
   }

   static AFGenericSocket newInstance(AFGenericSocketFactory factory) throws SocketException {
      return (AFGenericSocket)AFSocket.<AFGenericSocketAddress>newInstance(AFGenericSocket::new, factory);
   }

   public static boolean isSupported() {
      return AFSocket.isSupported();
   }

   protected AFGenericSocketChannel newChannel() {
      return new AFGenericSocketChannel(this);
   }

   public static AFGenericSocket newInstance() throws IOException {
      return (AFGenericSocket)AFSocket.<AFGenericSocketAddress>newInstance(AFGenericSocket::new, (AFGenericSocketFactory)null);
   }
}
