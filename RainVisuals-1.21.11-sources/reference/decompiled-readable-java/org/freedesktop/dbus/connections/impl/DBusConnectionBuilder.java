/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.connections.impl;

import java.util.concurrent.ConcurrentMap;
import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfig;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.connections.impl.BaseConnectionBuilder;
import org.freedesktop.dbus.connections.impl.DBusConnection;
import org.freedesktop.dbus.connections.transports.TransportBuilder;
import org.freedesktop.dbus.exceptions.AddressResolvingException;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.utils.AddressBuilder;

public final class DBusConnectionBuilder
extends BaseConnectionBuilder<DBusConnectionBuilder, DBusConnection> {
    private final String machineId;
    private boolean shared = true;

    public static DBusConnectionBuilder forType(DBusConnection.DBusBusType _type) {
        return DBusConnectionBuilder.forType(_type, null);
    }

    public static DBusConnectionBuilder forType(DBusConnection.DBusBusType _type, String _machineIdFile) {
        if (_type == DBusConnection.DBusBusType.SESSION) {
            return DBusConnectionBuilder.forSessionBus(_machineIdFile);
        }
        if (_type == DBusConnection.DBusBusType.SYSTEM) {
            return DBusConnectionBuilder.forSystemBus();
        }
        throw new IllegalArgumentException("Unknown bus type: " + String.valueOf((Object)_type));
    }

    public static DBusConnectionBuilder forSessionBus() {
        return DBusConnectionBuilder.forSessionBus(null);
    }

    private DBusConnectionBuilder(BusAddress _address, String _machineId) {
        super(DBusConnectionBuilder.class, _address);
        this.machineId = _machineId;
    }

    public static DBusConnectionBuilder forSessionBus(String _machineIdFileLocation) {
        BusAddress address = DBusConnectionBuilder.validateTransportAddress(AddressBuilder.getSessionConnection(_machineIdFileLocation));
        return new DBusConnectionBuilder(address, AddressBuilder.getDbusMachineId(_machineIdFileLocation));
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    private DBusConnection getSharedConnection(String _busAddr) {
        ConcurrentMap<String, DBusConnection> concurrentMap = DBusConnection.CONNECTIONS;
        synchronized (concurrentMap) {
            DBusConnection c = (DBusConnection)DBusConnection.CONNECTIONS.get(_busAddr);
            if (c != null) {
                void var3_3;
                if (!c.isConnected()) {
                    DBusConnection.CONNECTIONS.remove(_busAddr);
                    return null;
                }
                return var3_3;
            }
        }
        return null;
    }

    public static DBusConnectionBuilder forAddress(String _address) {
        return new DBusConnectionBuilder(BusAddress.of(_address), AddressBuilder.getDbusMachineId(null));
    }

    public static DBusConnectionBuilder forSystemBus() {
        BusAddress address = DBusConnectionBuilder.validateTransportAddress(AddressBuilder.getSystemConnection());
        return new DBusConnectionBuilder(address, AddressBuilder.getDbusMachineId(null));
    }

    public DBusConnectionBuilder withShared(boolean _shared) {
        this.shared = _shared;
        return this;
    }

    private static BusAddress validateTransportAddress(BusAddress _address) {
        if (TransportBuilder.getRegisteredBusTypes().isEmpty()) {
            throw new IllegalArgumentException("No transports found to connect to DBus. Please add at least one transport provider to your classpath");
        }
        BusAddress address = _address;
        if (!TransportBuilder.getRegisteredBusTypes().contains("UNIX") && address != null && address.isBusType("UNIX")) {
            throw new AddressResolvingException("No transports found to handle UNIX socket connections. Please add a unix-socket transport provider to your classpath");
        }
        if (!TransportBuilder.getRegisteredBusTypes().contains("TCP") && address != null && address.isBusType("TCP")) {
            throw new AddressResolvingException("No transports found to handle TCP connections. Please add a TCP transport provider to your classpath");
        }
        return address;
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     * WARNING - void declaration
     */
    @Override
    public DBusConnection build() throws DBusException {
        void var3_5;
        DBusConnection c;
        ReceivingServiceConfig cfg = this.buildThreadConfig();
        TransportConfig transportCfg = this.buildTransportConfig();
        if (this.shared) {
            ConcurrentMap<String, DBusConnection> concurrentMap = DBusConnection.CONNECTIONS;
            synchronized (concurrentMap) {
                String busAddressStr = transportCfg.getBusAddress().toString();
                c = this.getSharedConnection(busAddressStr);
                if (c != null) {
                    c.concurrentConnections.incrementAndGet();
                    return c;
                }
                c = new DBusConnection(this.shared, this.machineId, transportCfg, cfg);
                DBusConnection.CONNECTIONS.put(busAddressStr, c);
            }
        } else {
            c = new DBusConnection(this.shared, this.machineId, transportCfg, cfg);
        }
        c.setDisconnectCallback(this.getDisconnectCallback());
        c.setWeakReferences(this.isWeakReference());
        var3_5.connectImpl();
        return var3_5;
    }

    public static DBusConnectionBuilder forAddress(BusAddress _address) {
        return new DBusConnectionBuilder(_address, AddressBuilder.getDbusMachineId(null));
    }
}

