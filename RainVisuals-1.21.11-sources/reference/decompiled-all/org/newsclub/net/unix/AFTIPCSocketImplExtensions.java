package org.newsclub.net.unix;

import java.io.IOException;
import java.nio.charset.StandardCharsets;

// $VF: Compiled from AFTIPCSocketImplExtensions.java
public final class AFTIPCSocketImplExtensions implements AFSocketImplExtensions<AFTIPCSocketAddress> {
   private final AncillaryDataSupport ancillaryDataSupport;

   public int[] getTIPCDestName() {
      return this.ancillaryDataSupport.getTIPCDestName();
   }

   AFTIPCSocketImplExtensions(AncillaryDataSupport ancillaryDataSupport) {
      this.ancillaryDataSupport = ancillaryDataSupport;
   }

   public byte[] getTIPCNodeId(int peer) throws IOException {
      return NativeUnixSocket.tipcGetNodeId(peer);
   }

   public int[] getTIPCErrInfo() {
      return this.ancillaryDataSupport.getTIPCErrorInfo();
   }

   public String getTIPCLinkName(int peer, int bearerId) throws IOException {
      byte[] name = NativeUnixSocket.tipcGetLinkName(peer, bearerId);
      return name == null ? null : new String(name, StandardCharsets.UTF_8);
   }
}
