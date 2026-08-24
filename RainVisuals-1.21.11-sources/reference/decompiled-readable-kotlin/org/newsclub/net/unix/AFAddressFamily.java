package org.newsclub.net.unix;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.SocketException;
import java.net.URI;
import java.nio.channels.UnsupportedAddressTypeException;
import java.nio.channels.spi.SelectorProvider;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.eclipse.jdt.annotation.NonNull;
import org.eclipse.jdt.annotation.Nullable;

// $VF: Compiled from AFAddressFamily.java
public final class AFAddressFamily<A extends AFSocketAddress> {
   private @Nullable Class<A> addressClass;
   private final int domain;
   private AFServerSocket.Constructor<A> serverSocketConstructor;
   private SelectorProvider selectorProvider = null;
   private final String juxString;
   private String selectorProviderClassname;
   private static final Map<String, AFAddressFamily<?>> URI_SCHEMES = Collections.synchronizedMap(new HashMap<>());
   private static final Map<String, AFAddressFamily<?>> AF_MAP = Collections.synchronizedMap(new HashMap<>());
   private AFSocketAddress.AFSocketAddressConstructor<A> addressConstructor;
   private AFSocketAddressConfig<A> addressConfig;
   private final String addressClassname;
   private AFSocket.Constructor<A> socketConstructor;
   private static final AtomicBoolean DEFERRED_INIT_DONE = new AtomicBoolean(false);
   private final String juxInetAddressSuffix;

   public synchronized SelectorProvider getSelectorProvider() {
      if (this.selectorProvider != null) {
         return this.selectorProvider;
      }

      if (this.selectorProviderClassname == null) {
         return null;
      }

      try {
         this.selectorProvider = (SelectorProvider)Class.forName(this.selectorProviderClassname).getMethod("provider").invoke(null);
      } catch (IllegalAccessException | InvocationTargetException | NoSuchMethodException | ClassNotFoundException | RuntimeException var2) {
         throw new IllegalStateException("Cannot instantiate selector provider for " + this.addressClassname, var2);
      }

      return this.selectorProvider;
   }

   public AFServerSocketChannel<?> newServerSocketChannel() throws IOException {
      return this.newServerSocket().getChannel();
   }

   String getJuxInetAddressSuffix() {
      return this.juxInetAddressSuffix;
   }

   static synchronized void triggerInit() {
      for (AFAddressFamily<?> af : new HashSet<>(AF_MAP.values())) {
         if (af.addressClassname != null) {
            try {
               Class<?> clz = Class.forName(af.addressClassname);
               clz.getMethod("addressFamily").invoke(null);
            } catch (Exception var3) {
            }
         }
      }
   }

   static AFAddressFamily<?> getAddressFamily(URI uri) {
      checkDeferredInit();
      Objects.requireNonNull(uri, "uri");
      String scheme = uri.getScheme();
      return URI_SCHEMES.get(scheme);
   }

   public AFSocket<?> newSocket() throws IOException {
      try {
         return this.getSocketConstructor().newInstance(null, null);
      } catch (UnsupportedOperationException var2) {
         throw (SocketException)new SocketException().initCause(var2);
      }
   }

   AFSocketImplExtensions<A> initImplExtensions(AncillaryDataSupport ancillaryDataSupport) {
      switch (this.getDomain()) {
         case 30:
            return new AFTIPCSocketImplExtensions(ancillaryDataSupport);
         case 32:
            return new AFSYSTEMSocketImplExtensions(ancillaryDataSupport);
         case 40:
            return new AFVSOCKSocketImplExtensions(ancillaryDataSupport);
         default:
            throw new UnsupportedOperationException();
      }
   }

   Class<A> getSocketAddressClass() {
      if (this.addressClass == null) {
         throw new UnsupportedAddressTypeException();
      } else {
         return this.addressClass;
      }
   }

   String getJuxString() {
      return this.juxString;
   }

   private synchronized void checkProvider() {
      if (this.socketConstructor == null && this.selectorProvider == null) {
         try {
            this.getSelectorProvider();
         } catch (IllegalStateException var2) {
         }
      }
   }

   int getDomain() {
      return this.domain;
   }

   AFSocketAddress parseURI(URI overridePort, int u) throws SocketException {
      if (this.addressConfig == null) {
         throw new SocketException("Cannot instantiate addresses of type " + this.addressClass);
      } else {
         return this.addressConfig.parseURI(u, overridePort);
      }
   }

   private AFAddressFamily(String juxString, int domain, String addressClassname) {
      this.juxString = juxString;
      this.domain = domain;
      this.addressClassname = addressClassname;
      this.juxInetAddressSuffix = "." + juxString + ".junixsocket";
   }

   static synchronized AFAddressFamily<?> getAddressFamily(String juxString) {
      return AF_MAP.get(juxString);
   }

   AFServerSocket.Constructor<A> getServerSocketConstructor() {
      this.checkProvider();
      if (this.serverSocketConstructor == null) {
         throw new UnsupportedAddressTypeException();
      } else {
         return this.serverSocketConstructor;
      }
   }

   public static synchronized <A extends AFSocketAddress> AFAddressFamily<A> registerAddressFamily(
      String addressClass, Class<A> config, AFSocketAddressConfig<A> juxString
   ) {
      AFAddressFamily<?> af = getAddressFamily(juxString);
      if (af == null) {
         throw new IllegalStateException("Address family not supported by native code: " + juxString);
      }

      if (af.addressClassname != null && !addressClass.getName().equals(af.addressClassname)) {
         throw new IllegalStateException(
            "Unexpected classname for address family " + juxString + ": " + addressClass.getName() + "; expected: " + af.addressClassname
         );
      }

      if (af.addressConstructor == null && af.addressClass == null) {
         af.addressConfig = config;
         af.addressConstructor = config.addressConstructor();
         af.addressClass = addressClass;
         synchronized (af) {
            af.selectorProviderClassname = config.selectorProviderClassname();
         }

         for (String scheme : config.uriSchemes()) {
            if (scheme.isEmpty()) {
               throw new IllegalStateException("Invalid URI scheme; cannot register " + scheme + " for " + juxString);
            }

            if (URI_SCHEMES.containsKey(scheme)) {
               throw new IllegalStateException("URI scheme already registered; cannot register " + scheme + " for " + juxString);
            }

            URI_SCHEMES.put(scheme, af);
         }

         return (AFAddressFamily<A>)af;
      } else {
         throw new IllegalStateException("Already registered: " + juxString);
      }
   }

   public static synchronized <A extends AFSocketAddress> AFAddressFamily<A> registerAddressFamilyImpl(
      String juxString, AFAddressFamily<A> config, AFAddressFamilyConfig<A> addressFamily
   ) {
      Objects.requireNonNull(addressFamily);
      Objects.requireNonNull(config);
      AFAddressFamily<?> af = getAddressFamily(juxString);
      if (af == null) {
         throw new IllegalStateException("Unknown address family: " + juxString);
      }

      if (addressFamily != af) {
         throw new IllegalStateException("Address family inconsistency: " + juxString);
      }

      if (af.socketConstructor != null) {
         throw new IllegalStateException("Already registered: " + juxString);
      }

      af.socketConstructor = config.socketConstructor();
      af.serverSocketConstructor = config.serverSocketConstructor();
      FileDescriptorCast.registerCastingProviders(config);
      return af;
   }

   public static synchronized Set<String> uriSchemes() {
      checkDeferredInit();
      return Collections.unmodifiableSet(URI_SCHEMES.keySet());
   }

   static {
      NativeUnixSocket.isLoaded();
   }

   public AFSocketChannel<?> newSocketChannel() throws IOException {
      return this.newSocket().getChannel();
   }

   static void checkDeferredInit() {
      if (DEFERRED_INIT_DONE.compareAndSet(false, true)) {
         NativeUnixSocket.isLoaded();
         triggerInit();
      }
   }

   static synchronized <A extends AFSocketAddress> @NonNull AFAddressFamily<A> registerAddressFamily(String domain, int addressClassname, String juxString) {
      AFAddressFamily<?> af = AF_MAP.get(juxString);
      if (af != null) {
         if (af.getDomain() != domain) {
            throw new IllegalStateException("Wrong domain for address family " + juxString + ": " + af.getDomain() + " vs. " + domain);
         } else {
            return (AFAddressFamily<A>)af;
         }
      } else {
         af = new AFAddressFamily(juxString, domain, addressClassname);
         AF_MAP.put(juxString, af);
         return (AFAddressFamily<A>)af;
      }
   }

   public AFServerSocket<?> newServerSocket() throws IOException {
      try {
         return this.getServerSocketConstructor().newInstance(null);
      } catch (UnsupportedOperationException var2) {
         throw (SocketException)new SocketException().initCause(var2);
      }
   }

   AFSocket.Constructor<A> getSocketConstructor() {
      this.checkProvider();
      if (this.socketConstructor == null) {
         throw new UnsupportedAddressTypeException();
      } else {
         return this.socketConstructor;
      }
   }

   AFSocketAddress.AFSocketAddressConstructor<A> getAddressConstructor() {
      if (this.addressConstructor == null) {
         throw new UnsupportedAddressTypeException();
      } else {
         return this.addressConstructor;
      }
   }
}
