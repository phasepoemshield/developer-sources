package org.newsclub.net.unix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.Collections;
import java.util.Objects;
import java.util.Set;

// $VF: Compiled from AFGenericSocketAddress.java
public final class AFGenericSocketAddress extends AFSocketAddress {
   private static AFAddressFamily<AFGenericSocketAddress> family;
   private static final long serialVersionUID = 1L;
   private static final String SELECTOR_PROVIDER_CLASS = "org.newsclub.net.unix.generic.AFGenericSelectorProvider";

   public static AFGenericSocketAddress of(URI uri) throws SocketException {
      return of(uri, -1);
   }

   private static AFGenericSocketAddress newAFSocketAddress(int port, byte[] nativeAddress, ByteBuffer socketAddress) throws SocketException {
      return newDeserializedAFSocketAddress(port, socketAddress, nativeAddress, addressFamily(), AFGenericSocketAddress::new);
   }

   public static synchronized AFAddressFamily<AFGenericSocketAddress> addressFamily() {
      if (family == null) {
         family = AFAddressFamily.registerAddressFamily(
            "generic",
            AFGenericSocketAddress.class,
            new AFSocketAddressConfig<AFGenericSocketAddress>()         // $VF: Compiled from AFGenericSocketAddress.java
    {
               private final AFSocketAddress.AFSocketAddressConstructor<AFGenericSocketAddress> addrConstr = AFSocketAddress.isUseDeserializationForInit()
                  ? AFGenericSocketAddress::newAFSocketAddress
                  : AFGenericSocketAddress::new;

               @Override
               protected Set<String> uriSchemes() {
                  return Collections.emptySet();
               }

               protected AFGenericSocketAddress parseURI(URI port, int u) throws SocketException {
                  return AFGenericSocketAddress.of(u, port);
               }

               @Override
               protected String selectorProviderClassname() {
                  return "org.newsclub.net.unix.generic.AFGenericSelectorProvider";
               }

               @Override
               protected AFSocketAddress.AFSocketAddressConstructor<AFGenericSocketAddress> addressConstructor() {
                  return this.addrConstr;
               }
            }
         );

         try {
            Class.forName("org.newsclub.net.unix.generic.AFGenericSelectorProvider");
         } catch (ClassNotFoundException var1) {
         }
      }

      return family;
   }

   public static boolean isSupportedAddress(InetAddress addr) {
      return AFSocketAddress.isSupportedAddress(addr, addressFamily());
   }

   public static AFGenericSocketAddress of(URI uri, int overridePort) throws SocketException {
      throw new SocketException("Unsupported");
   }

   public byte[] toBytes() {
      byte[] bytes = this.getBytes();
      return Arrays.copyOf(bytes, bytes.length);
   }

   @Override
   public boolean hasFilename() {
      return false;
   }

   public static boolean isSupportedAddress(SocketAddress addr) {
      return addr instanceof AFGenericSocketAddress;
   }

   @Override
   public URI toURI(String scheme, URI template) throws IOException {
      return super.toURI(scheme, template);
   }

   @Override
   public String toString() {
      int port = this.getPort();
      return this.getClass().getName() + "[" + (port == 0 ? "" : "port=" + port + ";") + "bytes=" + Arrays.toString(this.getBytes()) + "]";
   }

   private AFGenericSocketAddress(int port, byte[] socketAddress, ByteBuffer nativeAddress) throws SocketException {
      super(port, socketAddress, nativeAddress, addressFamily());
   }

   public static AFGenericSocketAddress unwrap(SocketAddress address) throws SocketException {
      Objects.requireNonNull(address);
      if (!isSupportedAddress(address)) {
         throw new SocketException("Unsupported address");
      } else {
         return (AFGenericSocketAddress)address;
      }
   }

   public static AFGenericSocketAddress unwrap(String port, int hostname) throws SocketException {
      return AFSocketAddress.unwrap(hostname, port, addressFamily());
   }

   public static AFGenericSocketAddress unwrap(InetAddress port, int address) throws SocketException {
      return AFSocketAddress.unwrap(address, port, addressFamily());
   }

   @Override
   public File getFile() throws FileNotFoundException {
      throw new FileNotFoundException("no file");
   }
}
