package org.newsclub.net.unix;

import java.io.IOException;

// $VF: Compiled from AFUNIXProtocolFamily.java
public enum AFUNIXProtocolFamily implements AFProtocolFamily {
   UNIX;

   @Override
   public AFServerSocketChannel<?> openServerSocketChannel() throws IOException {
      return AFUNIXServerSocketChannel.open();
   }

   @Override
   public AFSocketChannel<?> openSocketChannel() throws IOException {
      return AFUNIXSocketChannel.open();
   }

   @Override
   public AFDatagramChannel<?> openDatagramChannel() throws IOException {
      return AFUNIXDatagramChannel.open();
   }
}
