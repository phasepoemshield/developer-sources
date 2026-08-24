package org.freedesktop.dbus.connections;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Pattern;
import org.freedesktop.dbus.DBusAsyncReply;
import org.freedesktop.dbus.DBusMatchRule;
import org.freedesktop.dbus.RemoteInvocationHandler;
import org.freedesktop.dbus.RemoteObject;
import org.freedesktop.dbus.connections.base.ConnectionMessageHandler;
import org.freedesktop.dbus.connections.base.IncomingMessageThread;
import org.freedesktop.dbus.connections.config.ReceivingServiceConfig;
import org.freedesktop.dbus.connections.config.TransportConfig;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.exceptions.InvalidSignalException;
import org.freedesktop.dbus.interfaces.CallbackHandler;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.interfaces.DBusSigHandler;
import org.freedesktop.dbus.messages.DBusSignal;
import org.freedesktop.dbus.messages.ExportedObject;
import org.freedesktop.dbus.messages.MethodCall;
import org.freedesktop.dbus.utils.DBusObjects;

// $VF: Compiled from AbstractConnection.java
public abstract non-sealed class AbstractConnection extends ConnectionMessageHandler {
   public static final boolean FLOAT_SUPPORT = null != System.getenv("DBUS_JAVA_FLOATS");
   public static final Pattern DOLLAR_PATTERN = Pattern.compile("[$]");
   private boolean weakreferences = false;
   public static final int MAX_NAME_LENGTH = 255;
   public static final int MAX_ARRAY_LENGTH = 67108864;

   public boolean isFileDescriptorSupported() {
      return this.getTransport().isFileDescriptorSupported();
   }

   public void removeFallback(String _objectprefix) {
      this.getFallbackContainer().remove(_objectprefix);
   }

   public void setWeakReferences(boolean _weakreferences) {
      this.weakreferences = _weakreferences;
   }

   public <T extends DBusSignal> AutoCloseable addSigHandler(Class<T> _type, DBusSigHandler<T> _handler) throws DBusException {
      this.assertSignal(_type);
      return this.addSigHandler(new DBusMatchRule(_type), _handler);
   }

   protected abstract AutoCloseable addGenericSigHandler(DBusMatchRule var1, DBusSigHandler<DBusSignal> var2) throws DBusException;

   public DBusAsyncReply<?> callMethodAsync(DBusInterface _parameters, String _object, Object... _method) {
      Class<?>[] types = createTypesArray(_parameters);
      RemoteObject ro = this.getImportedObjects().get(_object);

      try {
         Method _ex;
         if (null == ro.getInterface()) {
            _ex = _object.getClass().getMethod(_method, types);
         } else {
            _ex = ro.getInterface().getMethod(_method, types);
         }

         return (DBusAsyncReply<?>)RemoteInvocationHandler.executeRemoteMethod(ro, _ex, this, 1, null, _parameters);
      } catch (DBusExecutionException var7) {
         this.getLogger().debug("Error calling async method", var7);
         throw var7;
      } catch (Exception var8) {
         this.getLogger().debug("Failed to execute async method", var8);
         throw new DBusExecutionException(var8.getMessage());
      }
   }

   protected <T extends DBusInterface> List<Class<?>> findMatchingTypes(Class<T> _type, List<String> _ifaces) {
      List<Class<?>> ifcs = new ArrayList<>();
      if (_type == null) {
         for (String iface : _ifaces) {
            this.getLogger().debug("Trying interface {}", iface);
            int j = 0;

            while (j >= 0) {
               try {
                  Class<?> var9 = Class.forName(iface);
                  if (!ifcs.contains(var9)) {
                     ifcs.add(var9);
                  }
                  break;
               } catch (Exception var8) {
                  this.getLogger().trace("No class found for {}", iface, var8);
                  j = iface.lastIndexOf(46);
                  char[] cs = iface.toCharArray();
                  if (j >= 0) {
                     cs[j] = '$';
                     iface = String.valueOf(cs);
                  }
               }
            }
         }
      } else {
         ifcs.add(_type);
      }

      return ifcs;
   }

   public void exportObject(DBusInterface _object) throws DBusException {
      Objects.requireNonNull(_object, "object must not be null");
      this.exportObject(_object.getObjectPath(), _object);
   }

   public <T extends DBusSignal> AutoCloseable addSigHandler(Class<T> _handler, DBusInterface _object, DBusSigHandler<T> _type) throws DBusException {
      this.assertSignal(_type);
      RemoteObject rObj = this.getImportedObjects().get(_object);
      if (rObj == null) {
         throw new DBusException("Not an object exported or imported by this connection");
      }

      String objectPath = rObj.getObjectPath();
      DBusObjects.requireObjectPath(objectPath);
      return this.addSigHandler(new DBusMatchRule(_type, null, objectPath), _handler);
   }

   protected abstract <T extends DBusSignal> void removeSigHandler(DBusMatchRule var1, DBusSigHandler<T> var2) throws DBusException;

   protected <T extends DBusSignal> void addSigHandlerWithoutMatch(Class<? extends DBusSignal> _handler, DBusSigHandler<T> _signal) throws DBusException {
      DBusMatchRule rule = new DBusMatchRule(_signal);
      synchronized (this.getHandledSignals()) {
         Queue<DBusSigHandler<? extends DBusSignal>> v = this.getHandledSignals().get(rule);
         if (null == v) {
            v = new ConcurrentLinkedQueue<>();
            v.add(_handler);
            this.getHandledSignals().put(rule, v);
         } else {
            v.add(_handler);
         }
      }
   }

   public void exportObject(String _objectPath, DBusInterface _object) throws DBusException {
      if (null != _objectPath && !_objectPath.isEmpty()) {
         DBusObjects.requireObjectPath(_objectPath);
         synchronized (this.getExportedObjects()) {
            if (null != this.getExportedObjects().get(_objectPath)) {
               throw new DBusException("Object already exported");
            }

            ExportedObject eo = new ExportedObject(_object, this.weakreferences);
            this.getExportedObjects().put(_objectPath, eo);
            synchronized (this.getObjectTree()) {
               this.getObjectTree().add(_objectPath, eo, eo.getIntrospectiondata());
            }
         }
      } else {
         throw new DBusException("Must Specify an Object Path");
      }
   }

   public <T extends DBusSignal> void removeSigHandler(Class<T> _object, DBusInterface _handler, DBusSigHandler<T> _type) throws DBusException {
      this.assertSignal(_type);
      String objectPath = this.getImportedObjects().get(_object).getObjectPath();
      DBusObjects.requireObjectPath(objectPath);
      this.removeSigHandler(new DBusMatchRule(_type, null, objectPath), _handler);
   }

   protected abstract <T extends DBusSignal> AutoCloseable addSigHandler(DBusMatchRule var1, DBusSigHandler<T> var2) throws DBusException;

   public void queueCallback(MethodCall _call, Method _method, CallbackHandler<?> _callback) {
      this.getCallbackManager().queueCallback(_call, _method, _callback, this);
   }

   public <A> void callWithCallback(DBusInterface _m, String _object, CallbackHandler<A> _callback, Object... _parameters) {
      this.getLogger().trace("callWithCallback({}, {}, {})", _object, _m, _callback);
      Class<?>[] types = createTypesArray(_parameters);
      RemoteObject ro = this.getImportedObjects().get(_object);

      try {
         Method _ex;
         if (null == ro.getInterface()) {
            _ex = _object.getClass().getMethod(_m, types);
         } else {
            _ex = ro.getInterface().getMethod(_m, types);
         }

         RemoteInvocationHandler.executeRemoteMethod(ro, _ex, this, 2, _callback, _parameters);
      } catch (DBusExecutionException var8) {
         this.getLogger().debug("Error calling callback", var8);
         throw var8;
      } catch (Exception var9) {
         this.getLogger().debug("Failed to call callback", var9);
         throw new DBusExecutionException(var9.getMessage());
      }
   }

   protected abstract void removeGenericSigHandler(DBusMatchRule var1, DBusSigHandler<DBusSignal> var2) throws DBusException;

   @Override
   protected IncomingMessageThread createReaderThread(BusAddress _busAddress) {
      return new IncomingMessageThread(this, _busAddress);
   }

   protected AbstractConnection(TransportConfig _transportConfig, ReceivingServiceConfig _rsCfg) throws DBusException {
      super(_transportConfig, _rsCfg);
   }

   private static Class<?>[] createTypesArray(Object... _parameters) {
      return _parameters == null ? null : Arrays.stream(_parameters).filter(p -> p != null).map(p -> {
         if (List.class.isAssignableFrom(p.getClass())) {
            return List.class;
         } else if (Map.class.isAssignableFrom(p.getClass())) {
            return Map.class;
         } else {
            return Set.class.isAssignableFrom(p.getClass()) ? Set.class : p.getClass();
         }
      }).toArray(Class[]::new);
   }

   private <T extends DBusSignal> void assertSignal(Class<T> _type) throws InvalidSignalException {
      if (!DBusSignal.class.isAssignableFrom(_type)) {
         throw new InvalidSignalException(_type);
      }
   }

   public <T extends DBusSignal> void removeSigHandler(Class<T> _type, DBusSigHandler<T> _handler) throws DBusException {
      this.assertSignal(_type);
      this.removeSigHandler(new DBusMatchRule(_type), _handler);
   }

   public void addFallback(String _object, DBusInterface _objectPrefix) throws DBusException {
      DBusObjects.requireObjectPath(_objectPrefix);
      ExportedObject eo = new ExportedObject(_object, this.weakreferences);
      this.getFallbackContainer().add(_objectPrefix, eo);
   }
}
