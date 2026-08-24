package org.freedesktop.dbus.connections.impl;

import java.io.IOException;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Queue;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.Collectors;
import org.freedesktop.dbus.DBusMatchRule;
import org.freedesktop.dbus.RemoteInvocationHandler;
import org.freedesktop.dbus.RemoteObject;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.connections.IDisconnectAction;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfig;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.exceptions.InvalidBusNameException;
import org.freedesktop.dbus.exceptions.InvalidObjectPathException;
import org.freedesktop.dbus.exceptions.NotConnected;
import org.freedesktop.dbus.interfaces.DBus;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.DBusSigHandler;
import org.freedesktop.dbus.interfaces.Introspectable;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.messages.ExportedObject;
import org.freedesktop.dbus.types.UInt32;
import org.freedesktop.dbus.utils.CommonRegexPattern;
import org.freedesktop.dbus.utils.DBusObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from DBusConnection.java
public final class DBusConnection extends AbstractConnection {
   final AtomicInteger concurrentConnections;
   private final boolean shared;
   static final ConcurrentMap<String, DBusConnection> CONNECTIONS = new ConcurrentHashMap<>();
   private final Logger logger = LoggerFactory.getLogger(this.getClass());
   private final String machineId;
   private final List<String> busnames;
   private DBus dbus;
   private boolean registered;

   @Override
   public <T extends DBusInterface> T getExportedObject(String _path, String _source, Class<T> _type) throws DBusException {
      ExportedObject o;
      synchronized (this.getExportedObjects()) {
         o = this.getExportedObjects().get(_path);
      }

      if (null != o && o.getObject().get() == null) {
         this.unExportObject(_path);
         o = null;
      }

      if (null != o) {
         return (T)o.getObject().get();
      } else if (null == _source) {
         throw new DBusException("Not an object exported by this connection and no remote specified");
      } else {
         return this.dynamicProxy(_source, _path, _type);
      }
   }

   public DBusInterface getPeerRemoteObject(String _objectpath, String _busname) throws InvalidBusNameException, DBusException {
      DBusObjects.requireBusNameOrConnectionId(_busname);
      String unique = this.dbus.GetNameOwner(_busname);
      return this.dynamicProxy(unique, _objectpath, null);
   }

   public DBusInterface getRemoteObject(String _busname, String _objectpath) throws DBusException, InvalidBusNameException, InvalidObjectPathException {
      DBusObjects.requireBusNameOrConnectionId(_busname);
      DBusObjects.requireObjectPath(_objectpath);
      return this.dynamicProxy(_busname, _objectpath, null);
   }

   @Override
   public void close() throws IOException {
      this.disconnect();
   }

   DBusConnection(boolean _machineId, String _shared, TransportConfig _rsCfg, ReceivingServiceConfig _tranportCfg) throws DBusException {
      super(_tranportCfg, _rsCfg);
      this.concurrentConnections = new AtomicInteger(1);
      this.busnames = new ArrayList<>();
      this.machineId = _machineId;
      this.shared = _shared;
   }

   public String getUniqueName() {
      return this.busnames.get(0);
   }

   public <T extends DBusSignal> void removeSigHandler(Class<T> _type, String _source, DBusSigHandler<T> _handler) throws DBusException {
      this.validateSignal(_type, _source);
      this.removeSigHandler(new DBusMatchRule(_type, _source, null), _handler);
   }

   @Override
   public synchronized void disconnect() {
      if (this.isConnected()) {
         if (this.shared) {
            synchronized (CONNECTIONS) {
               DBusConnection connection = CONNECTIONS.get(this.getAddress().toString());
               if (connection != null) {
                  if (connection.getConcurrentConnections().get() <= 1) {
                     CONNECTIONS.remove(this.getAddress().toString());
                     super.disconnect();
                  } else {
                     this.logger.debug("Still {} connections left, decreasing connection counter", connection.getConcurrentConnections().get() - 1);
                     Optional.ofNullable(this.getDisconnectCallback()).ifPresent(cb -> cb.requestedDisconnect(connection.getConcurrentConnections().get()));
                     connection.getConcurrentConnections().decrementAndGet();
                  }
               }
            }
         } else {
            IDisconnectAction var5 = () -> {
               synchronized (this.busnames) {
                  List<String> lBusNames = this.busnames.stream().filter(DBusObjects::validateBusName).collect(Collectors.toList());
                  lBusNames.forEach(busName -> {
                     try {
                        this.releaseBusName(busName);
                     } catch (DBusException _ex) {
                        this.logger.error("Error while releasing busName '" + busName + "'.", _ex);
                     }
                  });
               }

               Map<String, ExportedObject> var9 = this.getExportedObjects();
               synchronized (var9) {
                  for (String key : var9.keySet().stream().filter(f -> f != null).collect(Collectors.toList())) {
                     this.unExportObject(key);
                  }
               }
            };
            super.disconnect(var5, null);
         }
      }
   }

   @Override
   public <T extends DBusSignal> AutoCloseable addSigHandler(DBusMatchRule _handler, DBusSigHandler<T> _rule) throws DBusException {
      Objects.requireNonNull(_rule, "Match rule cannot be null");
      Objects.requireNonNull(_handler, "Handler cannot be null");
      AtomicBoolean addMatch = new AtomicBoolean(false);
      Queue<DBusSigHandler<? extends DBusSignal>> dbusSignalList = this.getHandledSignals().computeIfAbsent(_rule, v -> {
         Queue<DBusSigHandler<? extends DBusSignal>> signalList = new ConcurrentLinkedQueue<>();
         addMatch.set(true);
         return signalList;
      });
      dbusSignalList.add(_handler);
      if (addMatch.get()) {
         try {
            this.dbus.AddMatch(_rule.toString());
         } catch (DBusExecutionException var6) {
            this.logger.debug("Cannot add match rule: " + _rule.toString(), var6);
            throw new DBusException("Cannot add match rule.", var6);
         }
      }

      return new AutoCloseable()      // $VF: Compiled from DBusConnection.java
 {
         @Override
         public void close() throws DBusException {
            DBusConnection.this.removeSigHandler(_rule, _handler);
         }
      };
   }

   @Override
   protected <T extends DBusSignal> void removeSigHandler(DBusMatchRule _rule, DBusSigHandler<T> _handler) throws DBusException {
      Queue<DBusSigHandler<? extends DBusSignal>> dbusSignalList = this.getHandledSignals().get(_rule);
      if (null != dbusSignalList) {
         dbusSignalList.remove(_handler);
         if (dbusSignalList.isEmpty()) {
            this.getHandledSignals().remove(_rule);

            try {
               this.dbus.RemoveMatch(_rule.toString());
            } catch (NotConnected var5) {
               this.logger.debug("No connection.", var5);
            } catch (DBusExecutionException var6) {
               this.logger.debug("Error removing signal", var6);
               throw new DBusException(var6);
            }
         }
      }
   }

   @Override
   public void removeGenericSigHandler(DBusMatchRule _handler, DBusSigHandler<DBusSignal> _rule) throws DBusException {
      Queue<DBusSigHandler<DBusSignal>> genericSignalsList = this.getGenericHandledSignals().get(_rule);
      if (null != genericSignalsList) {
         genericSignalsList.remove(_handler);
         if (genericSignalsList.isEmpty()) {
            this.getGenericHandledSignals().remove(_rule);

            try {
               this.dbus.RemoveMatch(_rule.toString());
            } catch (NotConnected var5) {
               this.logger.debug("No connection.", var5);
            } catch (DBusExecutionException var6) {
               this.logger.debug("Error removing generic signal", var6);
               throw new DBusException(var6);
            }
         }
      }
   }

   private <T extends DBusSignal> void validateSignal(Class<T> _type, String _source) throws DBusException {
      if (!DBusSignal.class.isAssignableFrom(_type)) {
         throw new ClassCastException("Not A DBus Signal");
      }

      DBusObjects.requireNotBusName(_source, "Cannot watch for signals based on well known bus name as source. Only unique names supported");
      DBusObjects.requireConnectionId(_source);
   }

   public <T extends DBusInterface> T dynamicProxy(String _path, String _type, Class<T> _source) throws DBusException {
      this.logger.debug("Introspecting {} on {} for dynamic proxy creation", _path, _source);

      try {
         Introspectable _ex = this.getRemoteObject(_source, _path, Introspectable.class);
         String data = _ex.Introspect();
         this.logger.trace("Got introspection data: {}", data);
         String[] tags = CommonRegexPattern.PROXY_SPLIT_PATTERN.split(data);
         List<String> ifaces = Arrays.stream(tags)
            .filter(t -> t.startsWith("interface"))
            .map(t -> CommonRegexPattern.IFACE_PATTERN.matcher(t).replaceAll("$1"))
            .map(i -> i.startsWith("org.freedesktop.DBus.") ? CommonRegexPattern.DBUS_IFACE_PATTERN.matcher(i).replaceAll("$1") : i)
            .collect(Collectors.toList());
         List<Class<?>> ifcs = this.findMatchingTypes(_type, ifaces);
         if (ifcs.isEmpty()) {
            ifcs.add(DBusInterface.class);
         }

         RemoteObject ro = new RemoteObject(_source, _path, _type, false);
         DBusInterface newi = (DBusInterface)Proxy.newProxyInstance(
            ((Class)ifcs.get(0)).getClassLoader(), ifcs.toArray(Class[]::new), new RemoteInvocationHandler(this, ro)
         );
         this.getImportedObjects().put(newi, ro);
         return (T)newi;
      } catch (Exception var11) {
         this.logger.debug("Cannot create proxy object", var11);
         throw new DBusException(String.format("Failed to create proxy object for %s exported by %s. Reason: %s", _path, _source, var11.getMessage()));
      }
   }

   public void releaseBusName(String _busname) throws DBusException {
      DBusObjects.requireBusName(_busname);

      try {
         this.dbus.ReleaseName(_busname);
      } catch (DBusExecutionException _ex) {
         this.logger.debug("Failed to release bus name", _ex);
         throw new DBusException(_ex.getMessage());
      }

      synchronized (this.busnames) {
         this.busnames.remove(_busname);
      }
   }

   public <T extends DBusSignal> void removeSigHandler(Class<T> _handler, String _type, DBusInterface _source, DBusSigHandler<T> _object) throws DBusException {
      this.validateSignal(_type, _source);
      String objectPath = this.getImportedObjects().get(_object).getObjectPath();
      DBusObjects.requireObjectPath(objectPath);
      this.removeSigHandler(new DBusMatchRule(_type, _source, objectPath), _handler);
   }

   void connectImpl() throws DBusException {
      try {
         this.listen();
      } catch (IOException _ex) {
         throw new DBusException(_ex);
      }

      DBusSigHandler<?> h = new DBusConnection.SigHandler();
      this.addSigHandlerWithoutMatch(DBus.NameAcquired.class, h);
      if (this.getTransportConfig().isRegisterSelf() && this.getTransport().isConnected()) {
         this.register();
      }
   }

   public void register() throws DBusException {
      if (!this.registered) {
         this.dbus = this.getRemoteObject("org.freedesktop.DBus", "/org/freedesktop/DBus", DBus.class);

         try {
            this.busnames.add(this.dbus.Hello());
            this.registered = true;
         } catch (DBusExecutionException var2) {
            this.logger.debug("Error while doing 'Hello' handshake", var2);
            throw new DBusException(var2.getMessage(), var2);
         }
      }
   }

   @Override
   public DBusInterface getExportedObject(String _path, String _source) throws DBusException {
      return this.getExportedObject(_source, _path, null);
   }

   public <I extends DBusInterface> I getRemoteObject(String _busname, String _type, Class<I> _objectpath) throws DBusException {
      return this.getRemoteObject(_busname, _objectpath, _type, true);
   }

   @Override
   public AutoCloseable addGenericSigHandler(DBusMatchRule _handler, DBusSigHandler<DBusSignal> _rule) throws DBusException {
      AtomicBoolean addMatch = new AtomicBoolean(false);
      Queue<DBusSigHandler<DBusSignal>> genericSignalsList = this.getGenericHandledSignals().computeIfAbsent(_rule, v -> {
         Queue<DBusSigHandler<DBusSignal>> signalsList = new ConcurrentLinkedQueue<>();
         addMatch.set(true);
         return signalsList;
      });
      genericSignalsList.add(_handler);
      if (addMatch.get()) {
         try {
            this.dbus.AddMatch(_rule.toString());
         } catch (DBusExecutionException var6) {
            this.logger.debug("Error adding signal handler", var6);
            throw new DBusException(var6.getMessage());
         }
      }

      return new AutoCloseable()      // $VF: Compiled from DBusConnection.java
 {
         @Override
         public void close() throws DBusException {
            DBusConnection.this.removeGenericSigHandler(_rule, _handler);
         }
      };
   }

   public <T extends DBusSignal> AutoCloseable addSigHandler(Class<T> _source, String _type, DBusInterface _handler, DBusSigHandler<T> _object) throws DBusException {
      this.validateSignal(_type, _source);
      String objectPath = this.getImportedObjects().get(_object).getObjectPath();
      DBusObjects.requireObjectPath(objectPath);
      this.addSigHandler(new DBusMatchRule(_type, _source, objectPath), _handler);
      return new AutoCloseable()      // $VF: Compiled from DBusConnection.java
 {
         @Override
         public void close() throws DBusException {
            DBusConnection.this.removeSigHandler(_type, _source, _object, _handler);
         }
      };
   }

   public String[] getNames() {
      Set<String> names = new TreeSet<>();
      names.addAll(this.busnames);
      return names.toArray(String[]::new);
   }

   public <I extends DBusInterface> I getRemoteObject(String _busname, String _autostart, Class<I> _objectpath, boolean _type) throws DBusException {
      if (_type == null) {
         throw new ClassCastException("Not A DBus Interface");
      }

      DBusObjects.requireBusNameOrConnectionId(_busname);
      DBusObjects.requireObjectPath(_objectpath);
      if (!DBusInterface.class.isAssignableFrom(_type)) {
         throw new ClassCastException("Not A DBus Interface");
      }

      if (_type.getName().equals(_type.getSimpleName())) {
         throw new DBusException("DBusInterfaces cannot be declared outside a package");
      }

      RemoteObject ro = new RemoteObject(_busname, _objectpath, _type, _autostart);
      I i = (DBusInterface)Proxy.newProxyInstance(_type.getClassLoader(), new Class[]{_type}, new RemoteInvocationHandler(this, ro));
      this.getImportedObjects().put(i, ro);
      return (I)i;
   }

   public void requestBusName(String _busname) throws DBusException {
      DBusObjects.requireBusName(_busname);

      UInt32 rv;
      try {
         rv = this.dbus.RequestName(_busname, new UInt32(6L));
      } catch (DBusExecutionException _exDb) {
         this.logger.debug("Failed to request bus name", _exDb);
         throw new DBusException(_exDb);
      }

      if (rv.intValue() != 2 && rv.intValue() != 3) {
         synchronized (this.busnames) {
            this.busnames.add(_busname);
         }
      } else {
         throw new DBusException("Failed to register bus name");
      }
   }

   @Override
   public String getMachineId() {
      return this.machineId;
   }

   public <I extends DBusInterface> I getPeerRemoteObject(String _objectpath, String _type, Class<I> _busname) throws DBusException {
      return this.getPeerRemoteObject(_busname, _objectpath, _type, true);
   }

   public <I extends DBusInterface> I getPeerRemoteObject(String _objectpath, String _busname, Class<I> _autostart, boolean _type) throws DBusException, InvalidBusNameException {
      if (null == _busname) {
         throw new InvalidBusNameException();
      }

      DBusObjects.requireBusNameOrConnectionId(_busname);
      String unique = this.dbus.GetNameOwner(_busname);
      return this.getRemoteObject(unique, _objectpath, _type, _autostart);
   }

   public <T extends DBusSignal> AutoCloseable addSigHandler(Class<T> _type, String _source, DBusSigHandler<T> _handler) throws DBusException {
      this.validateSignal(_type, _source);
      this.addSigHandler(new DBusMatchRule(_type, _source, null), _handler);
      return new AutoCloseable()      // $VF: Compiled from DBusConnection.java
 {
         @Override
         public void close() throws DBusException {
            DBusConnection.this.removeSigHandler(_type, _source, _handler);
         }
      };
   }

   private AtomicInteger getConcurrentConnections() {
      return this.concurrentConnections;
   }

   // $VF: Compiled from DBusConnection.java
   public enum DBusBusType {
      SYSTEM,
      SESSION;
   }

   // $VF: Compiled from DBusConnection.java
   private final class SigHandler implements DBusSigHandler<DBusSignal> {
      @Override
      public void handle(DBusSignal _signal) {
         if (_signal instanceof DBus.NameAcquired na) {
            synchronized (DBusConnection.this.busnames) {
               DBusConnection.this.busnames.add(na.name);
            }
         }
      }
   }
}
