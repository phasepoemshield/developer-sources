package org.freedesktop.dbus.spi.transport;

import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.connections.transports.AbstractTransport;
import org.freedesktop.dbus.exceptions.TransportConfigurationException;

// $VF: Compiled from ITransportProvider.java
public interface ITransportProvider {
   String getSupportedBusType();

   String getTransportName();

   AbstractTransport createTransport(BusAddress var1, TransportConfig var2) throws TransportConfigurationException;

   String createDynamicSessionAddress(boolean var1);
}
