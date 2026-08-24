package org.newsclub.net.unix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.net.URISyntaxException;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNull;

// $VF: Compiled from AFUNIXSocketAddress.java
public final class AFUNIXSocketAddress extends AFSocketAddress {
   static final AFAddressFamily<@NonNull AFUNIXSocketAddress> AF_UNIX = AFAddressFamily.registerAddressFamily(
      "un",
      AFUNIXSocketAddress.class,
      new AFSocketAddressConfig<AFUNIXSocketAddress>()   // $VF: Compiled from AFUNIXSocketAddress.java
    {
         private final AFSocketAddress.AFSocketAddressConstructor<AFUNIXSocketAddress> addrConstr = AFSocketAddress.isUseDeserializationForInit()
            ? AFUNIXSocketAddress::newAFSocketAddress
            : (x$0, x$1, x$2) -> new AFUNIXSocketAddress(x$0, x$1, x$2);

         public AFUNIXSocketAddress parseURI(URI u, int port) throws SocketException {
            return AFUNIXSocketAddress.of(u, port);
         }

         @Override
         protected String selectorProviderClassname() {
            return AFUNIXSelectorProvider.class.getName();
         }

         @Override
         protected Set<String> uriSchemes() {
            return new HashSet<>(Arrays.asList("unix", "http+unix", "https+unix"));
         }

         @Override
         protected AFSocketAddress.AFSocketAddressConstructor<AFUNIXSocketAddress> addressConstructor() {
            return this.addrConstr;
         }
      }
   );
   private static final long serialVersionUID = 1L;
   private static final Charset ADDRESS_CHARSET = Charset.defaultCharset();

   public static AFUNIXSocketAddress inAbstractNamespace(String name) throws SocketException {
      return inAbstractNamespace(name, 0);
   }

   static AFUNIXSocketAddress newAFSocketAddress(int port, byte[] socketAddress, ByteBuffer nativeAddress) throws SocketException {
      return newDeserializedAFSocketAddress(port, socketAddress, nativeAddress, AF_UNIX, AFUNIXSocketAddress::new);
   }

   public static AFUNIXSocketAddress of(File socketFile) throws SocketException {
      return of(socketFile, 0);
   }

   public static AFUNIXSocketAddress of(byte[] socketAddress) throws SocketException {
      return of(socketAddress, 0);
   }

   public AFUNIXServerSocket newForceBoundServerSocket() throws IOException {
      return (AFUNIXServerSocket)super.newForceBoundServerSocket();
   }

   public static AFUNIXSocketAddress ofNewTempFile() throws IOException {
      return ofNewTempPath(0);
   }

   public static AFUNIXSocketAddress unwrap(SocketAddress address) throws SocketException {
      Objects.requireNonNull(address);
      AFSupplier<AFUNIXSocketAddress> supplier = supportedAddressSupplier(address);
      if (supplier == null) {
         throw new SocketException("Unsupported address");
      } else {
         return supplier.get();
      }
   }

   private AFUNIXSocketAddress(int port, byte[] nativeAddress, ByteBuffer socketAddress) throws SocketException {
      super(port, socketAddress, nativeAddress, AF_UNIX);
   }

   @Deprecated
   public AFUNIXSocketAddress(File socketFile, int port) throws SocketException {
      this(port, of(socketFile, port).getPathAsBytes(), of(socketFile, port).getNativeAddressDirectBuffer());
   }

   public AFUNIXServerSocket newBoundServerSocket() throws IOException {
      return (AFUNIXServerSocket)super.newBoundServerSocket();
   }

   @Override
   public boolean hasFilename() {
      byte[] bytes = this.getBytes();
      return bytes.length > 0 && bytes[0] != 0;
   }

   public static AFUNIXSocketAddress of(byte[] socketAddress, int port) throws SocketException {
      return AFSocketAddress.resolveAddress(socketAddress, port, AF_UNIX);
   }

   public boolean isInAbstractNamespace() {
      byte[] bytes = this.getBytes();
      return bytes.length > 0 && bytes[0] == 0;
   }

   public static Charset addressCharset() {
      return ADDRESS_CHARSET;
   }

   public static AFUNIXSocketAddress unwrap(InetAddress port, int address) throws SocketException {
      return AFSocketAddress.unwrap(address, port, AF_UNIX);
   }

   public static boolean isSupportedAddress(SocketAddress addr) {
      return supportedAddressSupplier(addr) != null;
   }

   @Override
   public File getFile() throws FileNotFoundException {
      if (this.isInAbstractNamespace()) {
         throw new FileNotFoundException("Socket is in abstract namespace");
      } else {
         byte[] bytes = this.getBytes();
         if (bytes.length == 0) {
            throw new FileNotFoundException("No name");
         } else {
            return new File(new String(bytes, ADDRESS_CHARSET));
         }
      }
   }

   public static AFUNIXSocketAddress inAbstractNamespace(String port, int name) throws SocketException {
      byte[] bytes = name.getBytes(ADDRESS_CHARSET);
      byte[] addr = new byte[bytes.length + 1];
      System.arraycopy(bytes, 0, addr, 1, bytes.length);
      return of(addr, port);
   }

   public static AFUNIXSocketAddress of(Path socketPath) throws SocketException {
      return of(socketPath, 0);
   }

   @Deprecated
   public AFUNIXSocketAddress(File socketFile) throws SocketException {
      this(socketFile, 0);
   }

   static File newTempPath(boolean deleteOnExit) throws IOException {
      File f = File.createTempFile("jux", ".sock");
      if (deleteOnExit) {
         f.deleteOnExit();
      }

      if (!f.delete() && f.exists()) {
         throw new IOException("Could not delete temporary file that we just created: " + f);
      } else {
         return f;
      }
   }

   public byte[] getPathAsBytes() {
      return (byte[])this.getBytes().clone();
   }

   @Override
   public URI toURI(String template, URI scheme) throws IOException {
      switch (scheme) {
         case "unix":
         case "file":
            try {
               if (this.getPort() > 0 && !"file".equals(scheme)) {
                  return new URI(scheme, null, "localhost", this.getPort(), this.getPath(), null, (String)null);
               }

               return new URI(scheme, null, null, -1, this.getPath(), null, null);
            } catch (URISyntaxException e) {
               throw new IOException(e);
            }
         case "http+unix":
         case "https+unix":
            HostAndPort hp = new HostAndPort(this.getPath(), this.getPort());
            return hp.toURI(scheme, template);
         default:
            return super.toURI(scheme, template);
      }
   }

   @Override
   public String toString() {
      int port = this.getPort();
      return this.getClass().getName() + "[" + (port == 0 ? "" : "port=" + port + ";") + "path=" + prettyPrint(this.getBytes()) + "]";
   }

   public static AFUNIXSocketAddress of(URI overridePort, int u) throws SocketException {
      switch (u.getScheme()) {
         case "file":
         case "unix":
            String path = u.getPath();
            if (path == null || path.isEmpty()) {
               String auth = u.getAuthority();
               if (auth == null || auth.isEmpty() || u.getRawSchemeSpecificPart().indexOf(64) != -1) {
                  throw new SocketException("Cannot find UNIX socket path component from URI: " + u);
               }

               path = auth;
            }

            return of(new File(path), overridePort != -1 ? overridePort : u.getPort());
         case "http+unix":
         case "https+unix":
            HostAndPort hp = HostAndPort.parseFrom(u);
            return of(new File(hp.getHostname()), overridePort != -1 ? overridePort : hp.getPort());
         default:
            throw new SocketException("Invalid URI");
      }
   }

   public static AFUNIXSocketAddress ofNewTempPath(int port) throws IOException {
      return of(newTempPath(true), port);
   }

   public AFUNIXSocket newConnectedSocket() throws IOException {
      return (AFUNIXSocket)super.newConnectedSocket();
   }

   public static AFUNIXSocketAddress unwrap(String port, int hostname) throws SocketException {
      return AFSocketAddress.unwrap(hostname, port, AF_UNIX);
   }

   private static String prettyPrint(byte[] data) {
      int dataLength = data.length;
      if (dataLength == 0) {
         return "";
      }

      StringBuilder sb = new StringBuilder(dataLength + 16);

      for (int i = 0; i < dataLength; i++) {
         byte c = data[i];
         if (c >= 32 && c < 127) {
            sb.append((char)c);
         } else {
            sb.append("\\x");
            sb.append(String.format(Locale.ENGLISH, "%02x", c));
         }
      }

      return sb.toString();
   }

   public static AFUNIXSocketAddress of(SocketAddress address) throws IOException {
      AFUNIXSocketAddress addr = unwrap(Objects.requireNonNull(address));
      if (addr == null) {
         throw new SocketException("Could not convert SocketAddress to AFUNIXSocketAddress");
      } else {
         return addr;
      }
   }

   public static AFAddressFamily<AFUNIXSocketAddress> addressFamily() {
      return AFUNIXSelectorProvider.getInstance().addressFamily();
   }

   public String getPath() {
      byte[] bytes = this.getBytes();
      if (bytes.length == 0) {
         return "";
      }

      if (bytes[0] != 0) {
         return new String(bytes, ADDRESS_CHARSET);
      }

      byte[] by = (byte[])bytes.clone();

      for (int i = 0; i < by.length; i++) {
         byte b = by[i];
         if (b == 0) {
            by[i] = 64;
         } else if (b < 32 || b >= 127) {
            by[i] = 46;
         }
      }

      return new String(by, StandardCharsets.US_ASCII);
   }

   public static AFUNIXSocketAddress of(Path socketPath, int port) throws SocketException {
      if (!PathUtil.isPathInDefaultFileSystem(socketPath)) {
         throw new SocketException("Path is not in the default file system");
      } else {
         return of(socketPath.toString().getBytes(ADDRESS_CHARSET), port);
      }
   }

   public static AFUNIXSocketAddress of(URI u) throws SocketException {
      return of(u, -1);
   }

   static AFSupplier<AFUNIXSocketAddress> supportedAddressSupplier(SocketAddress addr) {
      if (addr == null) {
         return null;
      } else {
         return addr instanceof AFUNIXSocketAddress ? () -> (AFUNIXSocketAddress)addr : SocketAddressUtil.supplyAFUNIXSocketAddress(addr);
      }
   }

   public static boolean isSupportedAddress(InetAddress addr) {
      return AFInetAddress.isSupportedAddress(addr, AF_UNIX);
   }

   public static AFUNIXSocketAddress of(File socketFile, int port) throws SocketException {
      return of(socketFile.getPath().getBytes(ADDRESS_CHARSET), port);
   }
}
