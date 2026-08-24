/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections.transports;

import java.io.IOException;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Iterator;
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
import org.freedesktop.dbus.connections.transports.AbstractTransport;
import org.freedesktop.dbus.connections.transports.IFileBasedBusAddress;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.InvalidBusAddressException;
import org.freedesktop.dbus.exceptions.TransportConfigurationException;
import org.freedesktop.dbus.exceptions.TransportRegistrationException;
import org.freedesktop.dbus.spi.transport.ITransportProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class TransportBuilder {
    private TransportConfigBuilder<TransportConfigBuilder<?, TransportBuilder>, TransportBuilder> transportConfigBuilder = new TransportConfigBuilder(() -> this);
    private static final Logger LOGGER = LoggerFactory.getLogger(TransportBuilder.class);
    private static final Map<String, ITransportProvider> PROVIDERS = TransportBuilder.getTransportProvider();

    /*
     * WARNING - void declaration
     */
    public AbstractTransport build() throws IOException, DBusException {
        void var4_4;
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
        LOGGER.info("Using transport {} for address {}", (Object)provider.getTransportName(), (Object)config.getBusAddress());
        try {
            transport = provider.createTransport(myBusAddress, config);
            Objects.requireNonNull(transport, "Transport required");
            if (configuredSaslAuthMode > 0) {
                if (config.getSaslConfig().getAuthMode() != configuredSaslAuthMode) {
                    transport.getSaslConfig().setAuthMode(configuredSaslAuthMode);
                }
            }
        }
        catch (TransportConfigurationException _ex) {
            LOGGER.error("Could not initialize transport", _ex);
        }
        if (transport == null) {
            throw new DBusException("Unknown address type " + myBusAddress.getType() + " or no transport provider found for bus type " + myBusAddress.getBusType());
        }
        if (myBusAddress.isListeningSocket() && myBusAddress instanceof IFileBasedBusAddress) {
            IFileBasedBusAddress fbba = (IFileBasedBusAddress)((Object)myBusAddress);
            fbba.updatePermissions(config.getFileOwner(), config.getFileGroup(), config.getFileUnixPermissions());
        }
        transport.setPreConnectCallback(config.getPreConnectCallback());
        if (config.isAutoConnect()) {
            if (!config.isListening()) {
                void var7_8;
                void var8_9;
                SocketChannel c = null;
                int max = Math.max(500, config.getTimeout()) / 500;
                int cnt = 0;
                do {
                    try {
                        ++cnt;
                        c = transport.connect();
                    }
                    catch (IOException _ex) {
                        Object[] objectArray = new Object[3];
                        objectArray[0] = this.getAddress();
                        objectArray[1] = cnt;
                        objectArray[2] = max;
                        LOGGER.debug("Connection to {} failed, reconnect attempt {} of {}", objectArray);
                        if (cnt >= max) {
                            throw _ex;
                        }
                        try {
                            Thread.sleep(500L);
                        }
                        catch (InterruptedException interruptedException) {
                            LOGGER.debug("Interrupted while waiting for connection retry for address {}", (Object)this.getAddress());
                            Thread.currentThread().interrupt();
                        }
                    }
                } while (c == null);
                Object[] objectArray = new Object[3];
                objectArray[0] = this.getAddress();
                objectArray[1] = (int)var8_9;
                objectArray[2] = (int)var7_8;
                LOGGER.debug("Connection to {} established after {} of {} attempts", objectArray);
            }
        }
        return var4_4;
    }

    public static TransportBuilder create(TransportConfig _config) throws InvalidBusAddressException {
        return new TransportBuilder(_config);
    }

    private TransportBuilder(TransportConfig _config) {
        if (_config != null) {
            this.transportConfigBuilder.withConfig(_config);
        }
    }

    public static String createDynamicSession(String _busType, boolean _listeningAddress) {
        Objects.requireNonNull(_busType, "Bustype required");
        ITransportProvider provider = PROVIDERS.get(_busType.toUpperCase(Locale.US));
        if (provider != null) {
            return provider.createDynamicSessionAddress(_listeningAddress);
        }
        return null;
    }

    public static TransportBuilder create() {
        return new TransportBuilder(null);
    }

    /*
     * WARNING - void declaration
     */
    static Map<String, ITransportProvider> getTransportProvider() {
        void var0;
        ConcurrentHashMap<void, void> providers = new ConcurrentHashMap<void, void>();
        try {
            ServiceLoader<ITransportProvider> spiLoader = ServiceLoader.load(ITransportProvider.class, TransportBuilder.class.getClassLoader());
            Iterator<ITransportProvider> iterator2 = spiLoader.iterator();
            while (iterator2.hasNext()) {
                void var3_4;
                void var4_5;
                ITransportProvider provider = iterator2.next();
                String providerBusType = provider.getSupportedBusType();
                if (providerBusType == null) {
                    LOGGER.warn("Transport {} is invalid: No bustype configured", (Object)provider.getClass());
                    continue;
                }
                providerBusType = providerBusType.toUpperCase(Locale.US);
                Object[] objectArray = new Object[3];
                objectArray[0] = provider.getClass().getSimpleName();
                objectArray[1] = provider.getTransportName();
                objectArray[2] = providerBusType;
                LOGGER.debug("Found provider '{}' named '{}' providing bustype '{}'", objectArray);
                if (providers.containsKey(providerBusType)) {
                    throw new TransportRegistrationException("Found transport " + ((ITransportProvider)providers.get(providerBusType)).getClass().getName() + " and " + provider.getClass().getName() + " both providing transport for socket type " + providerBusType + ", please only add one of them to classpath.");
                }
                providers.put(var4_5, var3_4);
            }
            if (providers.isEmpty()) {
                throw new TransportRegistrationException("No dbus-java-transport found in classpath, please add a transport module");
            }
        }
        catch (ServiceConfigurationError serviceConfigurationError) {
            LOGGER.error("Could not initialize service provider.", serviceConfigurationError);
        }
        return var0;
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
        return new ArrayList<String>(PROVIDERS.keySet());
    }

    public BusAddress getAddress() {
        return this.configure().getBusAddress();
    }

    public static TransportBuilder create(BusAddress _address) {
        Objects.requireNonNull(_address, "BusAddress required");
        return new TransportBuilder(new TransportConfig(_address));
    }

    public static TransportBuilder createWithDynamicSession(String _transportType) throws DBusException {
        String dynSession = TransportBuilder.createDynamicSession(_transportType, false);
        if (dynSession == null) {
            throw new DBusException("Could not create dynamic session for transport type '" + _transportType + "'");
        }
        return TransportBuilder.create(dynSession);
    }

    public static final class SaslAuthMode
    extends Enum<SaslAuthMode> {
        private final int authMode;
        public static final /* enum */ SaslAuthMode AUTH_ANONYMOUS = new SaslAuthMode(4);
        public static final /* enum */ SaslAuthMode AUTH_COOKIE = new SaslAuthMode(2);
        private static final /* synthetic */ SaslAuthMode[] $VALUES;
        public static final /* enum */ SaslAuthMode AUTH_EXTERNAL = new SaslAuthMode(1);

        public static SaslAuthMode valueOf(String name) {
            return Enum.valueOf(SaslAuthMode.class, name);
        }

        private SaslAuthMode(int _authMode) {
            this.authMode = _authMode;
        }

        static {
            $VALUES = SaslAuthMode.$values();
        }

        public int getAuthMode() {
            return this.authMode;
        }

        private static /* synthetic */ SaslAuthMode[] $values() {
            SaslAuthMode[] saslAuthModeArray = new SaslAuthMode[3];
            saslAuthModeArray[0] = AUTH_ANONYMOUS;
            saslAuthModeArray[1] = AUTH_COOKIE;
            saslAuthModeArray[2] = AUTH_EXTERNAL;
            return saslAuthModeArray;
        }

        public static SaslAuthMode[] values() {
            return (SaslAuthMode[])$VALUES.clone();
        }
    }
}

