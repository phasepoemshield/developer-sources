package org.newsclub.net.unix;

import java.io.IOException;

// $VF: Compiled from AFVSOCKSocketImplExtensions.java
public final class AFVSOCKSocketImplExtensions implements AFSocketImplExtensions<AFVSOCKSocketAddress> {
   private final AncillaryDataSupport ancillaryDataSupport;

   public int getLocalCID() throws IOException {
      return NativeUnixSocket.vsockGetLocalCID();
   }

   AFVSOCKSocketImplExtensions(AncillaryDataSupport ancillaryDataSupport) {
      this.ancillaryDataSupport = ancillaryDataSupport;
   }
}
