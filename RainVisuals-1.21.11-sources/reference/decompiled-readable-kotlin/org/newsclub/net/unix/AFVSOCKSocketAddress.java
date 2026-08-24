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
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// $VF: Compiled from AFVSOCKSocketAddress.java
public final class AFVSOCKSocketAddress extends AFSocketAddress {
   private static final Pattern PAT_VSOCK_URI_HOST_AND_PORT = Pattern.compile(
      "^(?<port>any|[0-9a-fx\\-]+)(\\.(?<cid>any|hypervisor|local|host|[0-9a-fx\\-]+))?(?:\\:(?<javaPort>[0-9]+))?$"
   );
   public static final int VMADDR_PORT_ANY = -1;
   public static final int VMADDR_CID_HOST = 2;
   public static final int VMADDR_CID_LOCAL = 1;
   public static final int VMADDR_CID_HYPERVISOR = 0;
   private static final long serialVersionUID = 1L;
   private static AFAddressFamily<AFVSOCKSocketAddress> afVsock;
   public static final int VMADDR_CID_ANY = -1;

   private static AFVSOCKSocketAddress newAFSocketAddress(int socketAddress, byte[] nativeAddress, ByteBuffer port) throws SocketException {
      return newDeserializedAFSocketAddress(port, socketAddress, nativeAddress, addressFamily(), AFVSOCKSocketAddress::new);
   }

   public static AFVSOCKSocketAddress unwrap(SocketAddress address) throws SocketException {
      Objects.requireNonNull(address);
      if (!isSupportedAddress(address)) {
         throw new SocketException("Unsupported address");
      } else {
         return (AFVSOCKSocketAddress)address;
      }
   }

   @Override
   public String toString() {
      int port = this.getPort();
      byte[] bytes = this.getBytes();
      if (bytes.length != 12) {
         return this.getClass().getName() + "[" + (port == 0 ? "" : "port=" + port) + ";UNKNOWN]";
      }

      ByteBuffer bb = ByteBuffer.wrap(bytes);
      int reserved1 = bb.getInt();
      int vsockPort = bb.getInt();
      int cid = bb.getInt();
      String vsockPortString;
      if (vsockPort >= -1) {
         vsockPortString = Integer.toString(vsockPort);
      } else {
         vsockPortString = String.format(Locale.ENGLISH, "0x%08x", vsockPort);
      }

      String typeString = (reserved1 == 0 ? "" : "reserved1=" + reserved1 + ";") + "vsockPort=" + vsockPortString + ";cid=" + cid;
      return this.getClass().getName() + "[" + (port == 0 ? "" : "port=" + port + ";") + typeString + "]";
   }

   public static AFVSOCKSocketAddress ofAnyHypervisorPort() throws SocketException {
      return ofPortAndCID(-1, 0);
   }

   private static byte[] toBytes(int port, int cid) {
      ByteBuffer bb = ByteBuffer.allocate(12);
      bb.putInt(0);
      bb.putInt(port);
      bb.putInt(cid);
      return bb.flip().array();
   }

   public static AFVSOCKSocketAddress ofAnyHostPort() throws SocketException {
      return ofPortAndCID(-1, 2);
   }

   public static AFVSOCKSocketAddress ofHostPort(int port) throws SocketException {
      return ofPortAndCID(port, 2);
   }

   private static int parseInt(String v) {
      if (v.startsWith("0x")) {
         return parseUnsignedInt(v.substring(2), 16);
      } else {
         return v.startsWith("-") ? Integer.parseInt(v) : parseUnsignedInt(v, 10);
      }
   }

   @Override
   public File getFile() throws FileNotFoundException {
      throw new FileNotFoundException("no file");
   }

   public static boolean isSupportedAddress(SocketAddress addr) {
      return addr instanceof AFVSOCKSocketAddress;
   }

   public int getVSOCKPort() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(4);
   }

   public static boolean isSupportedAddress(InetAddress addr) {
      return AFSocketAddress.isSupportedAddress(addr, addressFamily());
   }

   public static AFVSOCKSocketAddress unwrap(InetAddress port, int address) throws SocketException {
      return AFSocketAddress.unwrap(address, port, addressFamily());
   }

   public static synchronized AFAddressFamily<AFVSOCKSocketAddress> addressFamily() {
      if (afVsock == null) {
         afVsock = AFAddressFamily.registerAddressFamily(
            "vsock",
            AFVSOCKSocketAddress.class,
            new AFSocketAddressConfig<AFVSOCKSocketAddress>()         // $VF: Compiled from AFVSOCKSocketAddress.java
    {
               private final AFSocketAddress.AFSocketAddressConstructor<AFVSOCKSocketAddress> addrConstr = AFSocketAddress.isUseDeserializationForInit()
                  ? AFVSOCKSocketAddress::newAFSocketAddress
                  : AFVSOCKSocketAddress::new;

               @Override
               protected AFSocketAddress.AFSocketAddressConstructor<AFVSOCKSocketAddress> addressConstructor() {
                  return this.addrConstr;
               }

               protected AFVSOCKSocketAddress parseURI(URI port, int u) throws SocketException {
                  return AFVSOCKSocketAddress.of(u, port);
               }

               @Override
               protected String selectorProviderClassname() {
                  return "org.newsclub.net.unix.vsock.AFVSOCKSelectorProvider";
               }

               @Override
               protected Set<String> uriSchemes() {
                  return new HashSet<>(Arrays.asList("vsock", "http+vsock", "https+vsock"));
               }
            }
         );

         try {
            Class.forName("org.newsclub.net.unix.vsock.AFVSOCKSelectorProvider");
         } catch (ClassNotFoundException var1) {
         }
      }

      return afVsock;
   }

   public static AFVSOCKSocketAddress unwrap(String hostname, int port) throws SocketException {
      return AFSocketAddress.unwrap(hostname, port, addressFamily());
   }

   public static AFVSOCKSocketAddress ofPortAndCID(int cid, int port) throws SocketException {
      return ofPortAndCID(-1, port, cid);
   }

   public static AFVSOCKSocketAddress ofHypervisorPort(int port) throws SocketException {
      return ofPortAndCID(port, 0);
   }

   private AFVSOCKSocketAddress(int socketAddress, byte[] port, ByteBuffer nativeAddress) throws SocketException {
      super(port, socketAddress, nativeAddress, addressFamily());
   }

   public static AFVSOCKSocketAddress ofPortAndCID(int cid, int vsockPort, int javaPort) throws SocketException {
      return resolveAddress(toBytes(vsockPort, cid), javaPort, addressFamily());
   }

   public static AFVSOCKSocketAddress of(URI uri, int overridePort) throws SocketException {
      switch (uri.getScheme()) {
         case "vsock":
         case "http+vsock":
         case "https+vsock":
            String host = uri.getHost();
            if (host == null) {
               host = uri.getAuthority();
               if (host != null) {
                  int at = host.indexOf(64);
                  if (at >= 0) {
                     host = host.substring(at + 1);
                  }
               }
            }

            if (host == null) {
               throw new SocketException("Cannot get hostname from URI: " + uri);
            } else {
               try {
                  Matcher m = PAT_VSOCK_URI_HOST_AND_PORT.matcher(host);
                  if (!m.matches()) {
                     throw new SocketException("Invalid VSOCK URI: " + uri);
                  }

                  String cidStr = m.group("cid");
                  String portStr = m.group("port");
                  String javaPortStr = m.group("javaPort");
                  int cid;
                  switch (cidStr == null ? "" : cidStr) {
                     case "":
                     case "any":
                        cid = -1;
                        break;
                     case "hypervisor":
                        cid = 0;
                        break;
                     case "local":
                        cid = 1;
                        break;
                     case "host":
                        cid = 2;
                        break;
                     default:
                        cid = parseInt(cidStr);
                  }

                  int port;
                  switch (portStr == null ? "" : portStr) {
                     case "any":
                     case "":
                        port = -1;
                        break;
                     default:
                        port = parseInt(portStr);
                  }

                  int javaPort = overridePort != -1 ? overridePort : uri.getPort();
                  if (javaPortStr != null && !javaPortStr.isEmpty()) {
                     javaPort = parseInt(javaPortStr);
                  }

                  return ofPortAndCID(javaPort, port, cid);
               } catch (IllegalArgumentException e) {
                  throw (SocketException)new SocketException("Invalid VSOCK URI: " + uri).initCause(e);
               }
            }
         default:
            throw new SocketException("Unsupported URI scheme: " + uri.getScheme());
      }
   }

   public int getVSOCKCID() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(8);
   }

   @Override
   public boolean covers(AFSocketAddress covered) {
      if (super.covers(covered)) {
         return true;
      }

      if (covered instanceof AFVSOCKSocketAddress) {
         AFVSOCKSocketAddress other = (AFVSOCKSocketAddress)covered;
         if (this.getVSOCKCID() == -1) {
            if (this.getVSOCKPort() == -1) {
               return true;
            }

            return this.getVSOCKPort() == other.getVSOCKPort();
         }

         if (this.getVSOCKPort() == -1) {
            return this.getVSOCKCID() == other.getVSOCKCID();
         }
      }

      return this.equals(covered);
   }

   public static AFVSOCKSocketAddress ofAnyLocalPort() throws SocketException {
      return ofPortAndCID(-1, 1);
   }

   public static AFVSOCKSocketAddress ofLocalPort(int port) throws SocketException {
      return ofPortAndCID(port, 1);
   }

   public static AFVSOCKSocketAddress ofAnyPort() throws SocketException {
      return ofPortAndCID(-1, -1);
   }

   @Override
   public boolean hasFilename() {
      return false;
   }

   public static AFVSOCKSocketAddress ofPortWithAnyCID(int port) throws SocketException {
      return ofPortAndCID(port, -1);
   }

   @Override
   public URI toURI(String template, URI scheme) throws IOException {
      switch (scheme) {
         case "vsock":
         case "http+vsock":
         case "https+vsock":
            byte[] bytes = this.getBytes();
            if (bytes.length != 12) {
               return super.toURI(scheme, template);
            }

            StringBuilder sb = new StringBuilder();
            String portStr;
            int port;
            switch (port = this.getVSOCKPort()) {
               case -1:
                  portStr = "any";
                  break;
               default:
                  portStr = toUnsignedString(port);
            }

            sb.append(portStr);
            sb.append('.');
            String cidStr;
            int cid;
            switch (cid = this.getVSOCKCID()) {
               case -1:
                  cidStr = "any";
                  break;
               case 0:
                  cidStr = "hypervisor";
                  break;
               case 1:
                  cidStr = "local";
                  break;
               case 2:
                  cidStr = "host";
                  break;
               default:
                  cidStr = toUnsignedString(cid);
            }

            sb.append(cidStr);
            return new HostAndPort(sb.toString(), this.getPort()).toURI(scheme, template);
         default:
            return super.toURI(scheme, template);
      }
   }

   public int getVSOCKReserved1() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(0);
   }

   public static AFVSOCKSocketAddress of(URI uri) throws SocketException {
      return of(uri, -1);
   }
}
