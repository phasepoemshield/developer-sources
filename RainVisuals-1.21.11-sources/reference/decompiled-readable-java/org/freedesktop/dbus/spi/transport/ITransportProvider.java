/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.spi.transport;

import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.connections.transports.AbstractTransport;
import org.freedesktop.dbus.exceptions.TransportConfigurationException;

public interface ITransportProvider {
    public String getSupportedBusType();

    public String getTransportName();

    public AbstractTransport createTransport(BusAddress var1, TransportConfig var2) throws TransportConfigurationException;

    public String createDynamicSessionAddress(boolean var1);
}

