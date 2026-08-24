package org.freedesktop.dbus.connections.impl;

import org.freedesktop.dbus.connections.BusAddress;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfig;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.connections.transports.TransportBuilder;
import org.freedesktop.dbus.exceptions.AddressResolvingException;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.utils.AddressBuilder;

// $VF: Compiled from DBusConnectionBuilder.java
public final class DBusConnectionBuilder extends BaseConnectionBuilder<DBusConnectionBuilder, DBusConnection> {
   private final String machineId;
   private boolean shared = true;

   public static DBusConnectionBuilder forType(DBusConnection.DBusBusType _type) {
      return forType(_type, null);
   }

   public static DBusConnectionBuilder forType(DBusConnection.DBusBusType _type, String _machineIdFile) {
      if (_type == DBusConnection.DBusBusType.SESSION) {
         return forSessionBus(_machineIdFile);
      } else if (_type == DBusConnection.DBusBusType.SYSTEM) {
         return forSystemBus();
      } else {
         throw new IllegalArgumentException("Unknown bus type: " + _type);
      }
   }

   public static DBusConnectionBuilder forSessionBus() {
      return forSessionBus(null);
   }

   private DBusConnectionBuilder(BusAddress _address, String _machineId) {
      super(DBusConnectionBuilder.class, _address);
      this.machineId = _machineId;
   }

   public static DBusConnectionBuilder forSessionBus(String _machineIdFileLocation) {
      BusAddress address = validateTransportAddress(AddressBuilder.getSessionConnection(_machineIdFileLocation));
      return new DBusConnectionBuilder(address, AddressBuilder.getDbusMachineId(_machineIdFileLocation));
   }

   private DBusConnection getSharedConnection(String _busAddr) {
      synchronized (DBusConnection.CONNECTIONS) {
         DBusConnection c = DBusConnection.CONNECTIONS.get(_busAddr);
         if (c != null) {
            if (!c.isConnected()) {
               DBusConnection.CONNECTIONS.remove(_busAddr);
               return null;
            }

            return c;
         }
      }

      return null;
   }

   public static DBusConnectionBuilder forAddress(String _address) {
      return new DBusConnectionBuilder(BusAddress.of(_address), AddressBuilder.getDbusMachineId(null));
   }

   public static DBusConnectionBuilder forSystemBus() {
      BusAddress address = validateTransportAddress(AddressBuilder.getSystemConnection());
      return new DBusConnectionBuilder(address, AddressBuilder.getDbusMachineId(null));
   }

   public DBusConnectionBuilder withShared(boolean _shared) {
      this.shared = _shared;
      return this;
   }

   private static BusAddress validateTransportAddress(BusAddress _address) {
      if (TransportBuilder.getRegisteredBusTypes().isEmpty()) {
         throw new IllegalArgumentException("No transports found to connect to DBus. Please add at least one transport provider to your classpath");
      } else {
         BusAddress address = _address;
         if (!TransportBuilder.getRegisteredBusTypes().contains("UNIX") && address != null && address.isBusType("UNIX")) {
            throw new AddressResolvingException(
               "No transports found to handle UNIX socket connections. Please add a unix-socket transport provider to your classpath"
            );
         } else if (!TransportBuilder.getRegisteredBusTypes().contains("TCP") && address != null && address.isBusType("TCP")) {
            throw new AddressResolvingException("No transports found to handle TCP connections. Please add a TCP transport provider to your classpath");
         } else {
            return address;
         }
      }
   }

   public DBusConnection build() throws DBusException {
      ReceivingServiceConfig cfg = this.buildThreadConfig();
      TransportConfig transportCfg = this.buildTransportConfig();
      DBusConnection var8;
      if (this.shared) {
         synchronized (DBusConnection.CONNECTIONS) {
            String busAddressStr = transportCfg.getBusAddress().toString();
            var8 = this.getSharedConnection(busAddressStr);
            if (var8 != null) {
               var8.concurrentConnections.incrementAndGet();
               return var8;
            }

            var8 = new DBusConnection(this.shared, this.machineId, transportCfg, cfg);
            DBusConnection.CONNECTIONS.put(busAddressStr, var8);
         }
      } else {
         var8 = new DBusConnection(this.shared, this.machineId, transportCfg, cfg);
      }

      var8.setDisconnectCallback(this.getDisconnectCallback());
      var8.setWeakReferences(this.isWeakReference());
      var8.connectImpl();
      return var8;
   }

   public static DBusConnectionBuilder forAddress(BusAddress _address) {
      return new DBusConnectionBuilder(_address, AddressBuilder.getDbusMachineId(null));
   }
}
