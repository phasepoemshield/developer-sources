package org.freedesktop.dbus.connections.transports;

import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.connections.config.TransportConfigBuilder;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.InvalidBusAddressException;
import org.freedesktop.dbus.exceptions.TransportConfigurationException;
import org.freedesktop.dbus.exceptions.TransportRegistrationException;
import org.freedesktop.dbus.spi.transport.ITransportProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from TransportBuilder.java
public final class TransportBuilder {
   private TransportConfigBuilder<TransportConfigBuilder<?, TransportBuilder>, TransportBuilder> transportConfigBuilder = new TransportConfigBuilder<>(
      () -> this
   );
   private static final Logger LOGGER = LoggerFactory.getLogger(TransportBuilder.class);
   private static final Map<String, ITransportProvider> PROVIDERS = getTransportProvider();

   public AbstractTransport build() throws IOException, DBusException {
      BusAddress myBusAddress = this.getAddress();
      TransportConfig config = this.transportConfigBuilder.build();
      if (myBusAddress == null) {
         throw new DBusException("Transport requires a BusAddress, use withBusAddress() to configure before building");
      }

      int configuredSaslAuthMode = config.getSaslConfig().getAuthMode();
      AbstractTransport transport = null;
      ITransportProvider provider = PROVIDERS.get(config.getBusAddress().getBusType());
      if (provider == null) {
         throw new DBusException("No transport provider found for bustype " + config.getBusAddress().getBusType());
      }

      LOGGER.info("Using transport {} for address {}", provider.getTransportName(), config.getBusAddress());

      try {
         transport = provider.createTransport(myBusAddress, config);
         Objects.requireNonNull(transport, "Transport required");
         if (configuredSaslAuthMode > 0 && config.getSaslConfig().getAuthMode() != configuredSaslAuthMode) {
            transport.getSaslConfig().setAuthMode(configuredSaslAuthMode);
         }
      } catch (TransportConfigurationException var12) {
         LOGGER.error("Could not initialize transport", var12);
      }

      if (transport == null) {
         throw new DBusException("Unknown address type " + myBusAddress.getType() + " or no transport provider found for bus type " + myBusAddress.getBusType());
      }

      if (myBusAddress.isListeningSocket() && myBusAddress instanceof IFileBasedBusAddress c) {
         c.updatePermissions(config.getFileOwner(), config.getFileGroup(), config.getFileUnixPermissions());
      }

      transport.setPreConnectCallback(config.getPreConnectCallback());
      if (config.isAutoConnect() && !config.isListening()) {
         SocketChannel var14 = null;
         int max = Math.max(500, config.getTimeout()) / 500;
         int cnt = 0;

         do {
            try {
               cnt++;
               var14 = transport.connect();
            } catch (IOException var13) {
               LOGGER.debug("Connection to {} failed, reconnect attempt {} of {}", this.getAddress(), cnt, max);
               if (cnt >= max) {
                  throw var13;
               }

               try {
                  Thread.sleep(500L);
               } catch (InterruptedException var11) {
                  LOGGER.debug("Interrupted while waiting for connection retry for address {}", this.getAddress());
                  Thread.currentThread().interrupt();
               }
            }
         } while (var14 == null);

         LOGGER.debug("Connection to {} established after {} of {} attempts", this.getAddress(), cnt, max);
      }

      return transport;
   }

   public static TransportBuilder create(TransportConfig _config) throws InvalidBusAddressException {
      return new TransportBuilder(_config);
   }

   private TransportBuilder(TransportConfig _config) {
      if (_config != null) {
         this.transportConfigBuilder.withConfig(_config);
      }
   }

   public static String createDynamicSession(String _listeningAddress, boolean _busType) {
      Objects.requireNonNull(_busType, "Bustype required");
      ITransportProvider provider = PROVIDERS.get(_busType.toUpperCase(Locale.US));
      return provider != null ? provider.createDynamicSessionAddress(_listeningAddress) : null;
   }

   public static TransportBuilder create() {
      return new TransportBuilder(null);
   }

   static Map<String, ITransportProvider> getTransportProvider() {
      Map<String, ITransportProvider> providers = new ConcurrentHashMap<>();

      try {
         for (ITransportProvider provider : ServiceLoader.load(ITransportProvider.class, TransportBuilder.class.getClassLoader())) {
            String providerBusType = provider.getSupportedBusType();
            if (providerBusType == null) {
               LOGGER.warn("Transport {} is invalid: No bustype configured", provider.getClass());
            } else {
               providerBusType = providerBusType.toUpperCase(Locale.US);
               LOGGER.debug(
                  "Found provider '{}' named '{}' providing bustype '{}'", provider.getClass().getSimpleName(), provider.getTransportName(), providerBusType
               );
               if (providers.containsKey(providerBusType)) {
                  throw new TransportRegistrationException(
                     "Found transport "
                        + providers.get(providerBusType).getClass().getName()
                        + " and "
                        + provider.getClass().getName()
                        + " both providing transport for socket type "
                        + providerBusType
                        + ", please only add one of them to classpath."
                  );
               }

               providers.put(providerBusType, provider);
            }
         }

         if (providers.isEmpty()) {
            throw new TransportRegistrationException("No dbus-java-transport found in classpath, please add a transport module");
         }
      } catch (ServiceConfigurationError var5) {
         LOGGER.error("Could not initialize service provider.", var5);
      }

      return providers;
   }

   public static TransportBuilder create(String _address) throws InvalidBusAddressException {
      TransportConfig cfg = new TransportConfig();
      cfg.setBusAddress(BusAddress.of(_address));
      return new TransportBuilder(cfg);
   }

   public TransportConfigBuilder<TransportConfigBuilder<?, TransportBuilder>, TransportBuilder> configure() {
      return this.transportConfigBuilder;
   }

   public static List<String> getRegisteredBusTypes() {
      return new ArrayList<>(PROVIDERS.keySet());
   }

   public BusAddress getAddress() {
      return this.configure().getBusAddress();
   }

   public static TransportBuilder create(BusAddress _address) {
      Objects.requireNonNull(_address, "BusAddress required");
      return new TransportBuilder(new TransportConfig(_address));
   }

   public static TransportBuilder createWithDynamicSession(String _transportType) throws DBusException {
      String dynSession = createDynamicSession(_transportType, false);
      if (dynSession == null) {
         throw new DBusException("Could not create dynamic session for transport type '" + _transportType + "'");
      } else {
         return create(dynSession);
      }
   }

   // $VF: Compiled from TransportBuilder.java
   public enum SaslAuthMode {
      AUTH_ANONYMOUS(4),
      AUTH_COOKIE(2),
      AUTH_EXTERNAL(1);

      private final int authMode;

      SaslAuthMode(int _authMode) {
         this.authMode = _authMode;
      }

      public int getAuthMode() {
         return this.authMode;
      }
   }
}
