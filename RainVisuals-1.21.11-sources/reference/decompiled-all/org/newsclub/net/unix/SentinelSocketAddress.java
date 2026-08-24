package org.newsclub.net.unix;

import java.io.File;
import java.io.FileNotFoundException;

// $VF: Compiled from SentinelSocketAddress.java
final class SentinelSocketAddress extends AFSocketAddress {
   private static final long serialVersionUID = 1L;

   @Override
   public File getFile() throws FileNotFoundException {
      throw new FileNotFoundException();
   }

   SentinelSocketAddress(int port) {
      super(SentinelSocketAddress.class, port);
   }

   @Override
   public boolean hasFilename() {
      return false;
   }
}
