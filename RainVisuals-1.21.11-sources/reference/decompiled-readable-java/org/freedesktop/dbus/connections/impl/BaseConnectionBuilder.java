/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections.impl;

import java.nio.ByteOrder;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.IDisconnectCallback;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfig;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfigBuilder;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.connections.config.TransportConfigBuilder;
import org.freedesktop.dbus.exceptions.DBusException;

public abstract class BaseConnectionBuilder<R extends BaseConnectionBuilder<R, C>, C extends AbstractConnection> {
    private boolean weakReference = false;
    private final Class<R> returnType;
    private final ReceivingServiceConfigBuilder<R> rsConfigBuilder;
    private final TransportConfigBuilder<?, R> transportConfigBuilder;
    private IDisconnectCallback disconnectCallback;

    public abstract C build() throws DBusException;

    protected ReceivingServiceConfig buildThreadConfig() {
        return this.rsConfigBuilder.build();
    }

    protected BaseConnectionBuilder(Class<R> _returnType, BusAddress _address) {
        this.returnType = _returnType;
        this.rsConfigBuilder = new ReceivingServiceConfigBuilder<BaseConnectionBuilder>(this::self);
        this.transportConfigBuilder = new TransportConfigBuilder(this::self);
        this.transportConfigBuilder.withBusAddress(_address);
    }

    protected IDisconnectCallback getDisconnectCallback() {
        return this.disconnectCallback;
    }

    public TransportConfigBuilder<?, R> transportConfig() {
        return this.transportConfigBuilder;
    }

    public ReceivingServiceConfigBuilder<R> receivingThreadConfig() {
        return this.rsConfigBuilder;
    }

    public static byte getSystemEndianness() {
        return ByteOrder.nativeOrder().equals(ByteOrder.BIG_ENDIAN) ? (byte)66 : 108;
    }

    R self() {
        return (R)((BaseConnectionBuilder)this.returnType.cast(this));
    }

    protected boolean isWeakReference() {
        return this.weakReference;
    }

    protected TransportConfig buildTransportConfig() {
        return this.transportConfigBuilder.build();
    }

    public R withWeakReferences(boolean _weakRef) {
        this.weakReference = _weakRef;
        return this.self();
    }

    public R withDisconnectCallback(IDisconnectCallback _disconnectCallback) {
        this.disconnectCallback = _disconnectCallback;
        return this.self();
    }
}

