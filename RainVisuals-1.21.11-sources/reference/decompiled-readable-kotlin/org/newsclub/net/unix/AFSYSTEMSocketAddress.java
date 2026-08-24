package org.newsclub.net.unix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.NonNullByDefault;

// $VF: Compiled from AFSYSTEMSocketAddress.java
public final class AFSYSTEMSocketAddress extends AFSocketAddress {
   private static final String SELECTOR_PROVIDER_CLASS = "org.newsclub.net.unix.darwin.system.AFSYSTEMSelectorProvider";
   private static AFAddressFamily<AFSYSTEMSocketAddress> afSystem;
   private static final long serialVersionUID = 1L;

   @Override
   public String toString() {
      int port = this.getPort();
      byte[] bytes = this.getBytes();
      if (bytes.length != 32) {
         return this.getClass().getName() + "[" + (port == 0 ? "" : "port=" + port) + ";UNKNOWN]";
      }

      ByteBuffer bb = ByteBuffer.wrap(bytes);
      AFSYSTEMSocketAddress.SysAddr sysAddr = AFSYSTEMSocketAddress.SysAddr.ofValue(bb.getInt());
      int id = bb.getInt();
      int unit = bb.getInt();
      return this.getClass().getName() + "[" + (port == 0 ? "" : "port=" + port + ";") + sysAddr + ";id=" + id + ";unit=" + unit + "]";
   }

   public static AFSYSTEMSocketAddress unwrap(String hostname, int port) throws SocketException {
      return AFSocketAddress.unwrap(hostname, port, addressFamily());
   }

   @Override
   public File getFile() throws FileNotFoundException {
      throw new FileNotFoundException("no file");
   }

   public static boolean isSupportedAddress(InetAddress addr) {
      return AFSocketAddress.isSupportedAddress(addr, addressFamily());
   }

   public int getId() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(4);
   }

   private AFSYSTEMSocketAddress(int socketAddress, byte[] nativeAddress, ByteBuffer port) throws SocketException {
      super(port, socketAddress, nativeAddress, addressFamily());
   }

   public static AFSYSTEMSocketAddress unwrap(InetAddress address, int port) throws SocketException {
      return AFSocketAddress.unwrap(address, port, addressFamily());
   }

   public AFSYSTEMSocketAddress.@NonNull SysAddr getSysAddr() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return AFSYSTEMSocketAddress.SysAddr.ofValue(bb.getInt(0));
   }

   public int getUnit() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(8);
   }

   public static AFSYSTEMSocketAddress ofSysAddrIdUnit(int unit, AFSYSTEMSocketAddress.SysAddr id, int sysAddr, int javaPort) throws SocketException {
      return resolveAddress(toBytes(sysAddr, id, unit), javaPort, addressFamily());
   }

   @Override
   public boolean hasFilename() {
      return false;
   }

   public static AFSYSTEMSocketAddress unwrap(SocketAddress address) throws SocketException {
      Objects.requireNonNull(address);
      if (!isSupportedAddress(address)) {
         throw new SocketException("Unsupported address");
      } else {
         return (AFSYSTEMSocketAddress)address;
      }
   }

   public static AFSYSTEMSocketAddress of(URI uri) throws SocketException {
      return of(uri, -1);
   }

   public static synchronized AFAddressFamily<AFSYSTEMSocketAddress> addressFamily() {
      if (afSystem == null) {
         afSystem = AFAddressFamily.registerAddressFamily(
            "system",
            AFSYSTEMSocketAddress.class,
            new AFSocketAddressConfig<AFSYSTEMSocketAddress>()         // $VF: Compiled from AFSYSTEMSocketAddress.java
    {
               private final AFSocketAddress.AFSocketAddressConstructor<AFSYSTEMSocketAddress> addrConstr = AFSocketAddress.isUseDeserializationForInit()
                  ? (x$0, x$1, x$2) -> AFSYSTEMSocketAddress.newAFSocketAddress(x$0, x$1, x$2)
                  : (x$0, x$1, x$2) -> new AFSYSTEMSocketAddress(x$0, x$1, x$2);

               @Override
               protected AFSocketAddress.AFSocketAddressConstructor<AFSYSTEMSocketAddress> addressConstructor() {
                  return this.addrConstr;
               }

               protected AFSYSTEMSocketAddress parseURI(URI port, int u) throws SocketException {
                  return AFSYSTEMSocketAddress.of(u, port);
               }

               @Override
               protected Set<String> uriSchemes() {
                  return new HashSet<>(Arrays.asList("afsystem"));
               }

               @Override
               protected String selectorProviderClassname() {
                  return "org.newsclub.net.unix.darwin.system.AFSYSTEMSelectorProvider";
               }
            }
         );

         try {
            Class.forName("org.newsclub.net.unix.darwin.system.AFSYSTEMSelectorProvider");
         } catch (ClassNotFoundException var1) {
         }
      }

      return afSystem;
   }

   public static AFSYSTEMSocketAddress ofSysAddrIdUnit(AFSYSTEMSocketAddress.SysAddr sysAddr, int unit, int id) throws SocketException {
      return ofSysAddrIdUnit(0, sysAddr, id, unit);
   }

   public static boolean isSupportedAddress(SocketAddress addr) {
      return addr instanceof AFSYSTEMSocketAddress;
   }

   private static AFSYSTEMSocketAddress newAFSocketAddress(int nativeAddress, byte[] socketAddress, ByteBuffer port) throws SocketException {
      return newDeserializedAFSocketAddress(port, socketAddress, nativeAddress, addressFamily(), AFSYSTEMSocketAddress::new);
   }

   public static AFSYSTEMSocketAddress of(URI uri, int overridePort) throws SocketException {
      switch (uri.getScheme()) {
         case "afsystem":
            String host;
            if ((host = uri.getHost()) == null || host.isEmpty()) {
               String ssp = uri.getSchemeSpecificPart();
               if (ssp == null || !ssp.startsWith("//")) {
                  throw new SocketException("Unsupported URI: " + uri);
               }

               ssp = ssp.substring(2);
               int i = ssp.indexOf(47);
               host = i == -1 ? ssp : ssp.substring(0, i);
               if (host.isEmpty()) {
                  throw new SocketException("Unsupported URI: " + uri);
               }
            }

            ByteBuffer bb = ByteBuffer.allocate(32);

            for (String p : host.split("\\.")) {
               int v;
               try {
                  v = parseUnsignedInt(p, 10);
               } catch (NumberFormatException e) {
                  throw (SocketException)new SocketException("Unsupported URI: " + uri).initCause(e);
               }

               bb.putInt(v);
            }

            ((Buffer)bb).flip();
            if (bb.remaining() > 32) {
               throw new SocketException("Unsupported URI: " + uri);
            } else {
               AFSYSTEMSocketAddress.SysAddr.ofValue(bb.getInt());
               bb.getInt();
               bb.getInt();

               while (bb.remaining() > 0) {
                  if (bb.getInt() != 0) {
                     throw new SocketException("Unsupported URI: " + uri);
                  }
               }

               return resolveAddress(bb.array(), uri.getPort(), addressFamily());
            }
         default:
            throw new SocketException("Unsupported URI scheme: " + uri.getScheme());
      }
   }

   @Override
   public URI toURI(String template, URI scheme) throws IOException {
      switch (scheme) {
         case "afsystem":
            ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
            StringBuilder sb = new StringBuilder();

            while (bb.remaining() > 0) {
               sb.append(toUnsignedString(bb.getInt()));
               if (bb.remaining() > 0) {
                  sb.append('.');
               }
            }

            return new HostAndPort(sb.toString(), this.getPort()).toURI(scheme, template);
         default:
            return super.toURI(scheme, template);
      }
   }

   private static byte[] toBytes(AFSYSTEMSocketAddress.SysAddr id, int unit, int sysAddr) {
      ByteBuffer bb = ByteBuffer.allocate(32);
      bb.putInt(sysAddr.value());
      bb.putInt(id);
      bb.putInt(unit);
      bb.putInt(0);
      bb.putInt(0);
      bb.putInt(0);
      bb.putInt(0);
      bb.putInt(0);
      return (byte[])((Buffer)bb).flip().array();
   }

   // $VF: Compiled from AFSYSTEMSocketAddress.java
   @NonNullByDefault
   public static final class SysAddr extends NamedInteger {
      private static final AFSYSTEMSocketAddress.@NonNull SysAddr[] VALUES = init(
         new AFSYSTEMSocketAddress.SysAddr[]{AF_SYS_CONTROL = new AFSYSTEMSocketAddress.SysAddr("AF_SYS_CONTROL", 2)}
      );
      public static final AFSYSTEMSocketAddress.SysAddr AF_SYS_CONTROL;
      private static final long serialVersionUID = 1L;

      private SysAddr(int id) {
         super(id);
      }

      public static AFSYSTEMSocketAddress.SysAddr ofValue(int v) {
         return ofValue(VALUES, AFSYSTEMSocketAddress.SysAddr::new, v);
      }

      private SysAddr(String id, int name) {
         super(name, id);
      }
   }
}
