package org.newsclub.net.unix;

import java.net.SocketException;
import java.net.URI;
import java.util.Set;

// $VF: Compiled from AFSocketAddressConfig.java
public abstract class AFSocketAddressConfig<A extends AFSocketAddress> {
   protected AFSocketAddressConfig() {
   }

   protected abstract Set<String> uriSchemes();

   protected abstract A parseURI(URI var1, int var2) throws SocketException;

   protected abstract AFSocketAddress.AFSocketAddressConstructor<A> addressConstructor();

   protected abstract String selectorProviderClassname();
}
