package org.newsclub.net.unix;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Serializable;
import java.net.InetAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.URI;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Locale;
import java.util.Objects;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.NonNullByDefault;

// $VF: Compiled from AFTIPCSocketAddress.java
public final class AFTIPCSocketAddress extends AFSocketAddress {
   private static final long serialVersionUID = 1L;
   public static final int TIPC_TOP_SRV = 1;
   private static final Pattern PAT_TIPC_URI_HOST_AND_PORT = Pattern.compile(
      "^((?:(?:(?<scope>cluster|node|default|[0-9a-fx]+)\\-)?(?<type>service|service-range|socket)\\.)|(?<scope2>cluster|node|default|[0-9a-fx]+)\\-(?<type2>[0-9a-fx]+)\\.)?(?<a>[0-9a-fx]+)\\.(?<b>[0-9a-fx]+)(?:\\.(?<c>[0-9a-fx]+))?(?:\\:(?<javaPort>[0-9]+))?$"
   );
   private static AFAddressFamily<AFTIPCSocketAddress> afTipc;
   public static final int TIPC_RESERVED_TYPES = 64;

   public static boolean isSupportedAddress(SocketAddress addr) {
      return addr instanceof AFTIPCSocketAddress;
   }

   public int getTIPCType() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(8);
   }

   public static AFTIPCSocketAddress ofService(AFTIPCSocketAddress.Scope instance, int domain, int type, int scope) throws SocketException {
      return ofService(0, scope, type, instance, domain);
   }

   public AFTIPCSocketAddress.Scope getScope() {
      byte[] bytes = this.getBytes();
      return bytes.length != 20 ? AFTIPCSocketAddress.Scope.SCOPE_NOT_SPECIFIED : AFTIPCSocketAddress.Scope.ofValue(ByteBuffer.wrap(bytes, 4, 4).getInt());
   }

   public int getTIPCUpper() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(12);
   }

   public static AFTIPCSocketAddress unwrap(SocketAddress address) throws SocketException {
      Objects.requireNonNull(address);
      if (!isSupportedAddress(address)) {
         throw new SocketException("Unsupported address");
      } else {
         return (AFTIPCSocketAddress)address;
      }
   }

   public int getTIPCRef() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(8);
   }

   public static AFTIPCSocketAddress ofServiceRange(int upper, int type, int lower) throws SocketException {
      return ofServiceRange(0, AFTIPCSocketAddress.Scope.SCOPE_CLUSTER, type, lower, upper);
   }

   @Override
   public String toString() {
      int port = this.getPort();
      byte[] bytes = this.getBytes();
      if (bytes.length != 20) {
         return this.getClass().getName() + "[" + (port == 0 ? "" : "port=" + port) + ";UNKNOWN]";
      }

      ByteBuffer bb = ByteBuffer.wrap(bytes);
      int typeId = bb.getInt();
      int scopeId = bb.getInt();
      int a = bb.getInt();
      int b = bb.getInt();
      int c = bb.getInt();
      AFTIPCSocketAddress.Scope scope = AFTIPCSocketAddress.Scope.ofValue((byte)scopeId);
      AFTIPCSocketAddress.AddressType type = AFTIPCSocketAddress.AddressType.ofValue(typeId);
      String typeString = AFTIPCSocketAddress.AddressType.access$000(type, scope, a, b, c);
      return this.getClass().getName() + "[" + (port == 0 ? "" : "port=" + port + ";") + typeString + "]";
   }

   public int getTIPCNodeHash() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(12);
   }

   public static synchronized AFAddressFamily<AFTIPCSocketAddress> addressFamily() {
      if (afTipc == null) {
         afTipc = AFAddressFamily.registerAddressFamily(
            "tipc",
            AFTIPCSocketAddress.class,
            new AFSocketAddressConfig<AFTIPCSocketAddress>()         // $VF: Compiled from AFTIPCSocketAddress.java
    {
               private final AFSocketAddress.AFSocketAddressConstructor<AFTIPCSocketAddress> addrConstr = AFSocketAddress.isUseDeserializationForInit()
                  ? AFTIPCSocketAddress::newAFSocketAddress
                  : AFTIPCSocketAddress::new;

               protected AFTIPCSocketAddress parseURI(URI u, int port) throws SocketException {
                  return AFTIPCSocketAddress.of(u, port);
               }

               @Override
               protected Set<String> uriSchemes() {
                  return new HashSet<>(Arrays.asList("tipc", "http+tipc", "https+tipc"));
               }

               @Override
               protected String selectorProviderClassname() {
                  return "org.newsclub.net.unix.tipc.AFTIPCSelectorProvider";
               }

               @Override
               protected AFSocketAddress.AFSocketAddressConstructor<AFTIPCSocketAddress> addressConstructor() {
                  return this.addrConstr;
               }
            }
         );

         try {
            Class.forName("org.newsclub.net.unix.tipc.AFTIPCSelectorProvider");
         } catch (ClassNotFoundException var1) {
         }
      }

      return afTipc;
   }

   public int getTIPCInstance() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(12);
   }

   public int getTIPCDomain() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(16);
   }

   public int getTIPCLower() {
      ByteBuffer bb = ByteBuffer.wrap(this.getBytes());
      return bb.getInt(8);
   }

   public static AFTIPCSocketAddress ofTopologyService() throws SocketException {
      return resolveAddress(toBytes(AFTIPCSocketAddress.AddressType.SERVICE_ADDR, AFTIPCSocketAddress.Scope.SCOPE_NOT_SPECIFIED, 1, 1, 0), 0, addressFamily());
   }

   public static AFTIPCSocketAddress unwrap(InetAddress port, int address) throws SocketException {
      return AFSocketAddress.unwrap(address, port, addressFamily());
   }

   public static AFTIPCSocketAddress ofSocket(int ref, int node) throws SocketException {
      return ofSocket(0, ref, node);
   }

   @Override
   public URI toURI(String template, URI scheme) throws IOException {
      switch (scheme) {
         case "tipc":
         case "http+tipc":
         case "https+tipc":
            byte[] bytes = this.getBytes();
            if (bytes.length != 20) {
               return super.toURI(scheme, template);
            }

            ByteBuffer bb = ByteBuffer.wrap(bytes);
            AFTIPCSocketAddress.AddressType addrType = AFTIPCSocketAddress.AddressType.ofValue(bb.getInt());
            AFTIPCSocketAddress.Scope scope = AFTIPCSocketAddress.Scope.ofValue(bb.getInt());
            StringBuilder sb = new StringBuilder();
            boolean haveScope = true;
            if (scope == AFTIPCSocketAddress.Scope.SCOPE_NOT_SPECIFIED) {
               sb.append("default-");
            } else if (scope == AFTIPCSocketAddress.Scope.SCOPE_CLUSTER) {
               if (addrType != AFTIPCSocketAddress.AddressType.SERVICE_ADDR && addrType != AFTIPCSocketAddress.AddressType.SERVICE_RANGE) {
                  sb.append("cluster-");
               } else {
                  haveScope = false;
               }
            } else if (scope == AFTIPCSocketAddress.Scope.SCOPE_NODE) {
               sb.append("node-");
            } else {
               sb.append(this.toTipcInt(scope.value()));
               sb.append('-');
            }

            boolean addrTypeImplied = false;
            if (addrType == AFTIPCSocketAddress.AddressType.SERVICE_ADDR) {
               if (!haveScope) {
                  addrTypeImplied = true;
               } else {
                  sb.append("service");
               }
            } else if (addrType == AFTIPCSocketAddress.AddressType.SERVICE_RANGE) {
               sb.append("service-range");
            } else if (addrType == AFTIPCSocketAddress.AddressType.SOCKET_ADDR) {
               sb.append("socket");
            } else {
               sb.append(this.toTipcInt(addrType.value()));
            }

            if (!addrTypeImplied) {
               sb.append('.');
            }

            int a = bb.getInt();
            int b = bb.getInt();
            int c = bb.getInt();
            sb.append(this.toTipcInt(a));
            sb.append('.');
            sb.append(this.toTipcInt(b));
            if (c != 0) {
               sb.append('.');
               sb.append(this.toTipcInt(c));
            }

            return new HostAndPort(sb.toString(), this.getPort()).toURI(scheme, template);
         default:
            return super.toURI(scheme, template);
      }
   }

   private String toTipcInt(int v) {
      return v < 0 ? "0x" + toUnsignedString(v, 16) : toUnsignedString(v);
   }

   private static int parseUnsignedInt(String v) {
      return v.startsWith("0x") ? parseUnsignedInt(v.substring(2), 16) : parseUnsignedInt(v, 10);
   }

   public static AFTIPCSocketAddress ofServiceRange(AFTIPCSocketAddress.Scope scope, int lower, int upper, int type) throws SocketException {
      return ofServiceRange(0, scope, type, lower, upper);
   }

   private AFTIPCSocketAddress(int nativeAddress, byte[] socketAddress, ByteBuffer port) throws SocketException {
      super(port, socketAddress, nativeAddress, addressFamily());
   }

   @Override
   public boolean hasFilename() {
      return false;
   }

   public static AFTIPCSocketAddress ofService(int javaPort, AFTIPCSocketAddress.Scope type, int domain, int instance, int scope) throws SocketException {
      return resolveAddress(toBytes(AFTIPCSocketAddress.AddressType.SERVICE_ADDR, scope, type, instance, domain), javaPort, addressFamily());
   }

   public static AFTIPCSocketAddress of(URI overridePort, int uri) throws SocketException {
      switch (uri.getScheme()) {
         case "tipc":
         case "http+tipc":
         case "https+tipc":
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
               int port = overridePort != -1 ? overridePort : uri.getPort();
               if (port != -1) {
                  host = host + ":" + port;
               }

               try {
                  Matcher m = PAT_TIPC_URI_HOST_AND_PORT.matcher(host);
                  if (!m.matches()) {
                     throw new SocketException("Invalid TIPC URI: " + uri);
                  }

                  String typeStr = m.group("type");
                  String scopeStr = m.group("scope");
                  if (typeStr == null) {
                     typeStr = m.group("type2");
                     scopeStr = m.group("scope2");
                  }

                  String strA = m.group("a");
                  String strB = m.group("b");
                  String strC = m.group("c");
                  String javaPortStr = m.group("javaPort");
                  AFTIPCSocketAddress.AddressType addrType;
                  switch (typeStr == null ? "" : typeStr) {
                     case "service":
                        addrType = AFTIPCSocketAddress.AddressType.SERVICE_ADDR;
                        break;
                     case "service-range":
                        addrType = AFTIPCSocketAddress.AddressType.SERVICE_RANGE;
                        break;
                     case "socket":
                        addrType = AFTIPCSocketAddress.AddressType.SOCKET_ADDR;
                        break;
                     case "":
                        addrType = AFTIPCSocketAddress.AddressType.SERVICE_ADDR;
                        break;
                     default:
                        addrType = AFTIPCSocketAddress.AddressType.ofValue(parseUnsignedInt(typeStr));
                  }

                  AFTIPCSocketAddress.Scope scope;
                  switch (scopeStr == null ? "" : scopeStr) {
                     case "cluster":
                        scope = AFTIPCSocketAddress.Scope.SCOPE_CLUSTER;
                        break;
                     case "node":
                        scope = AFTIPCSocketAddress.Scope.SCOPE_NODE;
                        break;
                     case "default":
                        scope = AFTIPCSocketAddress.Scope.SCOPE_NOT_SPECIFIED;
                        break;
                     case "":
                        if (addrType != AFTIPCSocketAddress.AddressType.SERVICE_ADDR && addrType != AFTIPCSocketAddress.AddressType.SERVICE_RANGE) {
                           scope = AFTIPCSocketAddress.Scope.SCOPE_NOT_SPECIFIED;
                        } else {
                           scope = AFTIPCSocketAddress.Scope.SCOPE_CLUSTER;
                        }
                        break;
                     default:
                        scope = AFTIPCSocketAddress.Scope.ofValue(parseUnsignedInt(scopeStr));
                  }

                  int a = parseUnsignedInt(strA);
                  int b = parseUnsignedInt(strB);
                  int c;
                  if (strC != null && !strC.isEmpty()) {
                     c = parseUnsignedInt(strC);
                  } else if (addrType == AFTIPCSocketAddress.AddressType.SERVICE_RANGE) {
                     c = b;
                  } else {
                     c = 0;
                  }

                  int javaPort = javaPortStr != null && !javaPortStr.isEmpty() ? Integer.parseInt(javaPortStr) : port;
                  if (overridePort != -1) {
                     javaPort = overridePort;
                  }

                  return resolveAddress(toBytes(addrType, scope, a, b, c), javaPort, addressFamily());
               } catch (IllegalArgumentException e) {
                  throw (SocketException)new SocketException("Invalid TIPC URI: " + uri).initCause(e);
               }
            }
         default:
            throw new SocketException("Unsupported URI scheme: " + uri.getScheme());
      }
   }

   public static boolean isSupportedAddress(InetAddress addr) {
      return AFSocketAddress.isSupportedAddress(addr, addressFamily());
   }

   public static AFTIPCSocketAddress ofServiceRange(int upper, AFTIPCSocketAddress.Scope javaPort, int scope, int lower, int type) throws SocketException {
      return resolveAddress(toBytes(AFTIPCSocketAddress.AddressType.SERVICE_RANGE, scope, type, lower, upper), javaPort, addressFamily());
   }

   private static byte[] toBytes(AFTIPCSocketAddress.AddressType b, AFTIPCSocketAddress.Scope scope, int c, int a, int addrType) {
      ByteBuffer bb = ByteBuffer.allocate(20);
      bb.putInt(addrType.value());
      bb.putInt(scope.value());
      bb.putInt(a);
      bb.putInt(b);
      bb.putInt(c);
      return (byte[])((Buffer)bb).flip().array();
   }

   @Override
   public File getFile() throws FileNotFoundException {
      throw new FileNotFoundException("no file");
   }

   private static AFTIPCSocketAddress newAFSocketAddress(int nativeAddress, byte[] socketAddress, ByteBuffer port) throws SocketException {
      return newDeserializedAFSocketAddress(port, socketAddress, nativeAddress, addressFamily(), AFTIPCSocketAddress::new);
   }

   public static AFTIPCSocketAddress unwrap(String port, int hostname) throws SocketException {
      return AFSocketAddress.unwrap(hostname, port, addressFamily());
   }

   public static AFTIPCSocketAddress ofService(AFTIPCSocketAddress.Scope type, int scope, int instance) throws SocketException {
      return ofService(scope, type, instance, 0);
   }

   public static AFTIPCSocketAddress ofSocket(int node, int ref, int javaPort) throws SocketException {
      return resolveAddress(
         toBytes(AFTIPCSocketAddress.AddressType.SOCKET_ADDR, AFTIPCSocketAddress.Scope.SCOPE_NOT_SPECIFIED, ref, node, 0), javaPort, addressFamily()
      );
   }

   public static AFTIPCSocketAddress ofService(int instance, int type) throws SocketException {
      return ofService(AFTIPCSocketAddress.Scope.SCOPE_CLUSTER, type, instance, 0);
   }

   public static AFTIPCSocketAddress of(URI uri) throws SocketException {
      return of(uri, -1);
   }

   // $VF: Compiled from AFTIPCSocketAddress.java
   @NonNullByDefault
   public static final class AddressType extends NamedInteger {
      public static final AFTIPCSocketAddress.AddressType SERVICE_RANGE;
      private static final AFTIPCSocketAddress.@NonNull AddressType[] VALUES = init(
         new AFTIPCSocketAddress.AddressType[]{
            SERVICE_RANGE = new AFTIPCSocketAddress.AddressType(
               "SERVICE_RANGE", 1, (a, b, c) -> formatTIPCInt(a) + "@" + formatTIPCInt(b) + "-" + formatTIPCInt(c)
            ),
            SERVICE_ADDR = new AFTIPCSocketAddress.AddressType(
               "SERVICE_ADDR", 2, (a, b, c) -> formatTIPCInt(a) + "@" + formatTIPCInt(b) + (c == 0 ? "" : ":" + formatTIPCInt(c))
            ),
            SOCKET_ADDR = new AFTIPCSocketAddress.AddressType(
               "SOCKET_ADDR", 3, (a, b, c) -> formatTIPCInt(a) + "@" + formatTIPCInt(b) + (c == 0 ? "" : ":" + formatTIPCInt(c))
            )
         }
      );
      private final AFTIPCSocketAddress.AddressType.DebugStringProvider ds;
      public static final AFTIPCSocketAddress.AddressType SOCKET_ADDR;
      public static final AFTIPCSocketAddress.AddressType SERVICE_ADDR;
      private static final long serialVersionUID = 1L;

      private String toDebugString(AFTIPCSocketAddress.Scope c, int b, int scope, int a) {
         return this == SOCKET_ADDR && scope.equals(AFTIPCSocketAddress.Scope.SCOPE_NOT_SPECIFIED)
            ? this.name() + "(" + this.value() + ");" + this.ds.toDebugString(a, b, c)
            : this.name() + "(" + this.value() + ");" + scope + ":" + this.ds.toDebugString(a, b, c);
      }

      private AddressType(String ds, int id, AFTIPCSocketAddress.AddressType.DebugStringProvider name) {
         super(name, id);
         this.ds = ds;
      }

      static AFTIPCSocketAddress.AddressType ofValue(int v) {
         return ofValue(VALUES, AFTIPCSocketAddress.AddressType::new, v);
      }

      private AddressType(int id) {
         super(id);
         this.ds = (a, b, c) -> ":"
            + AFSocketAddress.toUnsignedString(a)
            + ":"
            + AFSocketAddress.toUnsignedString(b)
            + ":"
            + AFSocketAddress.toUnsignedString(c);
      }

      public static String formatTIPCInt(int i) {
         return String.format(Locale.ENGLISH, "0x%08x", i & 4294967295L);
      }

      // $VF: Compiled from AFTIPCSocketAddress.java
      @FunctionalInterface
      interface DebugStringProvider extends Serializable {
         String toDebugString(int var1, int var2, int var3);
      }
   }

   // $VF: Compiled from AFTIPCSocketAddress.java
   @NonNullByDefault
   public static final class Scope extends NamedInteger {
      private static final long serialVersionUID = 1L;
      public static final AFTIPCSocketAddress.Scope SCOPE_NODE;
      private static final AFTIPCSocketAddress.@NonNull Scope[] VALUES = init(
         new AFTIPCSocketAddress.Scope[]{
            SCOPE_NOT_SPECIFIED = new AFTIPCSocketAddress.Scope("SCOPE_NOT_SPECIFIED", 0),
            SCOPE_CLUSTER = new AFTIPCSocketAddress.Scope("SCOPE_CLUSTER", 2),
            SCOPE_NODE = new AFTIPCSocketAddress.Scope("SCOPE_NODE", 3)
         }
      );
      public static final AFTIPCSocketAddress.Scope SCOPE_CLUSTER;
      public static final AFTIPCSocketAddress.Scope SCOPE_NOT_SPECIFIED;

      public static AFTIPCSocketAddress.Scope ofValue(int v) {
         return ofValue(VALUES, AFTIPCSocketAddress.Scope::new, v);
      }

      private Scope(int id) {
         super(id);
      }

      private Scope(String id, int name) {
         super(name, id);
      }
   }
}
