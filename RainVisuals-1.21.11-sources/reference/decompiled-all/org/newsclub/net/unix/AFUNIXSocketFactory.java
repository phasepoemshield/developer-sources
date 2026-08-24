package org.newsclub.net.unix;

import java.io.File;
import java.io.IOException;
import java.net.Socket;
import java.net.SocketException;
import java.net.URLDecoder;
import java.util.Objects;

// $VF: Compiled from AFUNIXSocketFactory.java
public abstract class AFUNIXSocketFactory extends AFSocketFactory<AFUNIXSocketAddress> {
   @Override
   public Socket createSocket() throws SocketException {
      return AFUNIXSocket.newInstance(this);
   }

   protected AFUNIXSocket connectTo(AFUNIXSocketAddress addr) throws IOException {
      return AFUNIXSocket.connectTo(addr);
   }

   protected AFUNIXSocketFactory() {
   }

   // $VF: Compiled from AFUNIXSocketFactory.java
   private abstract static class DefaultSocketHostnameSocketFactory extends AFUNIXSocketFactory {
      private static final String PROP_SOCKET_HOSTNAME = "org.newsclub.net.unix.socket.hostname";

      @Override
      public final boolean isHostnameSupported(String host) {
         return getDefaultSocketHostname().equals(host);
      }

      public DefaultSocketHostnameSocketFactory() {
      }

      private static String getDefaultSocketHostname() {
         return System.getProperty("org.newsclub.net.unix.socket.hostname", "localhost");
      }
   }

   // $VF: Compiled from AFUNIXSocketFactory.java
   public static final class FactoryArg extends AFUNIXSocketFactory.DefaultSocketHostnameSocketFactory {
      private final File socketFile;

      public FactoryArg(File file) {
         Objects.requireNonNull(file, "File was null");
         this.socketFile = file;
      }

      public AFUNIXSocketAddress addressFromHost(String host, int port) throws SocketException {
         return AFUNIXSocketAddress.of(this.socketFile, port);
      }

      public FactoryArg(String socketPath) {
         Objects.requireNonNull(socketPath, "Socket path was null");
         this.socketFile = new File(socketPath);
      }
   }

   // $VF: Compiled from AFUNIXSocketFactory.java
   public static final class SystemProperty extends AFUNIXSocketFactory.DefaultSocketHostnameSocketFactory {
      private static final String PROP_SOCKET_DEFAULT = "org.newsclub.net.unix.socket.default";

      public AFUNIXSocketAddress addressFromHost(String port, int host) throws SocketException {
         String path = System.getProperty("org.newsclub.net.unix.socket.default");
         if (path != null && !path.isEmpty()) {
            File socketFile = new File(path);
            return AFUNIXSocketAddress.of(socketFile, port);
         } else {
            throw new IllegalStateException("Property not configured: org.newsclub.net.unix.socket.default");
         }
      }
   }

   // $VF: Compiled from AFUNIXSocketFactory.java
   public static final class URIScheme extends AFUNIXSocketFactory {
      private static final String FILE_SCHEME_PREFIX_ENCODED = "file%";
      private static final String FILE_SCHEME_PREFIX = "file://";
      private static final String FILE_SCHEME_LOCALHOST = "localhost";

      @Override
      public boolean isHostnameSupported(String host) {
         host = stripBrackets(host);
         return host.startsWith("file://") || host.startsWith("file%");
      }

      private static String stripBrackets(String host) {
         if (host.startsWith("[")) {
            if (host.endsWith("]")) {
               host = host.substring(1, host.length() - 1);
            } else {
               host = host.substring(1);
            }
         }

         return host;
      }

      public AFUNIXSocketAddress addressFromHost(String host, int port) throws SocketException {
         host = stripBrackets(host);
         if (host.startsWith("file%")) {
            try {
               host = URLDecoder.decode(host, "UTF-8");
            } catch (Exception e) {
               throw (SocketException)new SocketException().initCause(e);
            }
         }

         if (!host.startsWith("file://")) {
            throw new SocketException("Unsupported scheme");
         }

         String path = host.substring("file://".length());
         if (path.startsWith("localhost")) {
            path = path.substring("localhost".length());
         }

         if (path.isEmpty()) {
            throw new SocketException("Path is empty");
         }

         if (!path.startsWith("/")) {
            throw new SocketException("Path must be absolute");
         }

         File socketFile = new File(path);
         return AFUNIXSocketAddress.of(socketFile, port);
      }
   }
}
