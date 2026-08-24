package org.newsclub.net.unix;

import java.io.UnsupportedEncodingException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.net.UnknownHostException;
import java.nio.charset.StandardCharsets;
import java.util.Locale;
import java.util.Objects;

// $VF: Compiled from AFInetAddress.java
class AFInetAddress {
   private static final byte[] LOCAL_AF = new byte[]{127, 0, 0, -81};
   static final String INETADDR_SUFFIX = ".junixsocket";
   private static final String MARKER_HEX_ENCODING = "%%";
   private static final char PREFIX = '[';

   static final InetAddress wrapAddress(byte[] socketAddress, AFAddressFamily<?> af) {
      Objects.requireNonNull(af);
      if (socketAddress != null && socketAddress.length != 0) {
         String hostname = createUnresolvedHostname(socketAddress, af);
         byte[] bytes = hostname.getBytes(StandardCharsets.UTF_8);
         if (bytes.length > 255) {
            throw new IllegalStateException("junixsocket address is too long to wrap as InetAddress");
         }

         try {
            return InetAddress.getByAddress(hostname, LOCAL_AF);
         } catch (UnknownHostException var5) {
            throw new IllegalStateException(var5);
         }
      } else {
         return null;
      }
   }

   static final String createUnresolvedHostname(byte[] af, AFAddressFamily<?> socketAddress) {
      StringBuilder sb = new StringBuilder(1 + socketAddress.length + ".junixsocket".length() + 8);
      sb.append('[');

      try {
         sb.append(URLEncoder.encode(new String(socketAddress, StandardCharsets.ISO_8859_1), StandardCharsets.ISO_8859_1.toString()));
      } catch (UnsupportedEncodingException var6) {
         throw new IllegalStateException(var6);
      }

      sb.append('.');
      sb.append(af.getJuxString());
      sb.append(".junixsocket");
      String str = sb.toString();
      if (str.length() >= 64 && str.getBytes(StandardCharsets.UTF_8).length > 255) {
         sb.setLength(0);
         sb.append('[');
         sb.append("%%");
         int i = 0;

         for (int n = socketAddress.length; i < n; i++) {
            sb.append(String.format(Locale.ENGLISH, "%02x", socketAddress[i]));
         }

         sb.append('.');
         sb.append(af.getJuxString());
         sb.append(".junixsocket");
         return sb.toString();
      } else {
         return str;
      }
   }

   static boolean isSupportedAddress(InetAddress af, AFAddressFamily<?> addr) {
      if (addr instanceof Inet4Address && addr.isLoopbackAddress()) {
         String hostname = addr.getHostName();
         return hostname.endsWith(af.getJuxInetAddressSuffix());
      } else {
         return false;
      }
   }

   static final byte[] unwrapAddress(String hostname, AFAddressFamily<?> af) throws SocketException {
      Objects.requireNonNull(hostname);
      if (!hostname.endsWith(".junixsocket")) {
         throw new SocketException("Unsupported address");
      }

      int end = hostname.length() - ".junixsocket".length();
      int domDot = -1;

      for (int i = end + -1; i >= 0; i--) {
         char c = hostname.charAt(i);
         if (c == '.') {
            domDot = i;
            break;
         }
      }

      String var14 = hostname.substring(domDot + 1, end);
      if (AFAddressFamily.getAddressFamily(var14) != af) {
         throw new SocketException("Incompatible address");
      }

      String encodedHostname = hostname.substring(1, domDot);
      if (!encodedHostname.startsWith("%%")) {
         try {
            return URLDecoder.decode(encodedHostname, StandardCharsets.ISO_8859_1.toString()).getBytes(StandardCharsets.ISO_8859_1);
         } catch (UnsupportedEncodingException var13) {
            throw new IllegalStateException(var13);
         }
      } else {
         int e = encodedHostname.length();
         if ((e & 1) == 1) {
            throw new IllegalStateException("Length of hex-encoded wrapping must be even");
         }

         byte[] unwrapped = new byte[(e - 2) / 2];
         int i = 2;
         int n = encodedHostname.length();

         for (int o = 0; i < n; o++) {
            int v = Integer.parseInt(encodedHostname.substring(i, i + 2), 16);
            unwrapped[o] = (byte)(v & 0xFF);
            i += 2;
         }

         return unwrapped;
      }
   }

   static final byte[] unwrapAddress(InetAddress addr, AFAddressFamily<?> af) throws SocketException {
      Objects.requireNonNull(addr);
      if (!isSupportedAddress(addr, af)) {
         throw new SocketException("Unsupported address");
      }

      String hostname = addr.getHostName();

      try {
         return unwrapAddress(hostname, af);
      } catch (IllegalArgumentException var4) {
         throw (SocketException)new SocketException("Unsupported address").initCause(var4);
      }
   }
}
