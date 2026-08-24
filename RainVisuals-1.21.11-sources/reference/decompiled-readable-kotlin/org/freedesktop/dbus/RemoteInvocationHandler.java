package org.freedesktop.dbus;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.lang.reflect.Type;
import java.util.Arrays;
import org.freedesktop.dbus.annotations.DBusBoundProperty;
import org.freedesktop.dbus.annotations.MethodNoReply;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.errors.NoReply;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.exceptions.NotConnected;
import org.freedesktop.dbus.interfaces.CallbackHandler;
import org.freedesktop.dbus.interfaces.DBusInterface;
import org.freedesktop.dbus.messages.Error;
import org.freedesktop.dbus.messages.Message;
import org.freedesktop.dbus.messages.MethodCall;
import org.freedesktop.dbus.propertyref.PropRefRemoteHandler;
import org.freedesktop.dbus.utils.DBusNamingUtil;
import org.freedesktop.dbus.utils.LoggingHelper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

// $VF: Compiled from RemoteInvocationHandler.java
public class RemoteInvocationHandler implements InvocationHandler {
   public static final int CALL_TYPE_CALLBACK = 2;
   public static final int CALL_TYPE_SYNC = 0;
   AbstractConnection conn;
   private static final Logger LOGGER = LoggerFactory.getLogger(RemoteInvocationHandler.class);
   public static final int CALL_TYPE_ASYNC = 1;
   RemoteObject remote;

   public static Object executeRemoteMethod(
      RemoteObject _ro, Method _m, AbstractConnection _syncmethod, int _args, CallbackHandler<?> _callback, Object... _conn
   ) throws DBusException {
      return executeRemoteMethod(_ro, _m, new Type[]{_m.getGenericReturnType()}, _conn, _syncmethod, _callback, _args);
   }

   public static Object executeRemoteMethod(
      RemoteObject _m, Method _args, Type[] _callback, AbstractConnection _ro, int _syncmethod, CallbackHandler<?> _types, Object... _conn
   ) throws DBusException {
      return executeRemoteMethod(_ro, _m, null, _types, _conn, _syncmethod, _callback, _args);
   }

   public RemoteInvocationHandler(AbstractConnection _remote, RemoteObject _conn) {
      this.remote = _remote;
      this.conn = _conn;
   }

   @Override
   public Object invoke(Object _proxy, Method _method, Object[] _args) throws Throwable {
      if (_method.getName().equals("isRemote")) {
         return true;
      }

      if (_method.getName().equals("getObjectPath")) {
         return this.remote.getObjectPath();
      }

      if (_method.getName().equals("clone")) {
         return null;
      }

      if (_method.getName().equals("equals")) {
         try {
            if (1 == _args.length) {
               return _args[0] != null && this.remote.equals(((RemoteInvocationHandler)Proxy.getInvocationHandler(_args[0])).remote);
            }
         } catch (IllegalArgumentException var12) {
            return Boolean.FALSE;
         }
      } else {
         if (_method.getName().equals("finalize")) {
            return null;
         }

         if (_method.getName().equals("getClass")) {
            return DBusInterface.class;
         }

         if (_method.getName().equals("hashCode")) {
            return this.remote.hashCode();
         }

         if (_method.getName().equals("notify")) {
            synchronized (this.remote) {
               this.remote.notify();
            }

            return null;
         }

         if (_method.getName().equals("notifyAll")) {
            synchronized (this.remote) {
               this.remote.notifyAll();
            }

            return null;
         }

         if (_method.getName().equals("wait")) {
            synchronized (this.remote) {
               if (_args.length == 0) {
                  this.remote.wait();
               } else if (_args.length == 1 && _args[0] instanceof Long l) {
                  this.remote.wait(l);
               } else if (_args.length == 2 && _args[0] instanceof Long l && _args[1] instanceof Integer i) {
                  this.remote.wait(l, i);
               }

               if (_args.length <= 2) {
                  return null;
               }
            }
         } else {
            if (_method.getName().equals("toString")) {
               return this.remote.toString();
            }

            if (_method.isAnnotationPresent(DBusBoundProperty.class)) {
               return PropRefRemoteHandler.handleDBusBoundProperty(this.conn, this.remote, _method, _args);
            }
         }
      }

      return executeRemoteMethod(this.remote, _method, this.conn, 0, null, _args);
   }

   public static Object convertRV(Object[] _conn, Type[] _types, Method _m, AbstractConnection _rp) throws DBusException {
      Class<? extends Object> c = (Class<? extends Object>)_m.getReturnType();
      Object[] rp = _rp;
      if (rp == null) {
         if (null != c && !void.class.equals(c)) {
            throw new DBusException("Wrong return type (got void, expected a value)");
         } else {
            return null;
         }
      } else {
         try {
            LoggingHelper.logIf(
               LOGGER.isTraceEnabled(),
               () -> LOGGER.trace("Converting return parameters from {} to type {}", Arrays.deepToString(_rp), _m.getGenericReturnType())
            );
            rp = Marshalling.deSerializeParameters(rp, _types, _conn);
         } catch (Exception _ex) {
            LOGGER.debug("Wrong return type.", _ex);
            throw new DBusException(String.format("Wrong return type (failed to de-serialize correct types: %s )", _ex.getMessage()), _ex);
         }

         switch (rp.length) {
            case 0:
               if (null != c && !void.class.equals(c)) {
                  throw new DBusException("Wrong return type (got void, expected a value)");
               }

               return null;
            case 1:
               return rp[0];
            default:
               if (!Tuple.class.isAssignableFrom(c)) {
                  throw new DBusException("Wrong return type (not expecting Tuple)");
               } else {
                  Constructor<? extends Object> cons = (Constructor<? extends Object>)c.getConstructors()[0];

                  try {
                     return cons.newInstance(rp);
                  } catch (Exception _ex) {
                     LOGGER.debug("Error creating tuple instance using reflection", _ex);
                     throw new DBusException(_ex.getMessage());
                  }
               }
         }
      }
   }

   public static Object convertRV(Object[] _rp, Method _m, AbstractConnection _conn) throws DBusException {
      return convertRV(_rp, new Type[]{_m.getGenericReturnType()}, _m, _conn);
   }

   public RemoteObject getRemote() {
      return this.remote;
   }

   public static Object executeRemoteMethod(
      RemoteObject _args,
      Method _m,
      String[] _types,
      Type[] _callback,
      AbstractConnection _syncmethod,
      int _conn,
      CallbackHandler<?> _customSignatures,
      Object... _ro
   ) throws DBusException {
      Type[] ts = _m.getGenericParameterTypes();
      String sig = null;
      Object[] args = _args;
      if (ts.length > 0) {
         try {
            sig = Marshalling.getDBusType(ts);
            args = Marshalling.convertParameters(args, ts, _customSignatures, _conn);
         } catch (DBusException _ex) {
            throw new DBusExecutionException("Failed to construct D-Bus type: " + _ex.getMessage());
         }
      }

      byte flags = 0;
      if (!_ro.isAutostart()) {
         flags = (byte)(flags | 2);
      }

      if (_syncmethod == 1) {
         flags = (byte)(flags | 64);
      }

      if (_m.isAnnotationPresent(MethodNoReply.class)) {
         flags = (byte)(flags | 1);
      }

      MethodCall call;
      try {
         String name = DBusNamingUtil.getMethodName(_m);
         if (null == _ro.getInterface()) {
            call = _conn.getMessageFactory().createMethodCall(null, _ro.getBusName(), _ro.getObjectPath(), null, name, flags, sig, args);
         } else {
            String iface = DBusNamingUtil.getInterfaceName(_ro.getInterface());
            call = _conn.getMessageFactory().createMethodCall(null, _ro.getBusName(), _ro.getObjectPath(), iface, name, flags, sig, args);
         }
      } catch (DBusException _ex) {
         LOGGER.debug("Failed to construct outgoing method call.", _ex);
         throw new DBusExecutionException("Failed to construct outgoing method call: " + _ex.getMessage());
      }

      if (!_conn.isConnected()) {
         throw new NotConnected("Not Connected");
      }

      switch (_syncmethod) {
         case 0:
            _conn.sendMessage(call);
         default:
            if (_m.isAnnotationPresent(MethodNoReply.class)) {
               return null;
            } else {
               Message reply = call.getReply();
               if (null == reply) {
                  throw new NoReply("No reply within specified time");
               } else {
                  if (reply instanceof Error err) {
                     err.throwException();
                  }

                  try {
                     return convertRV(reply.getParameters(), _types, _m, _conn);
                  } catch (DBusException _ex) {
                     LOGGER.debug("", _ex);
                     throw new DBusExecutionException(_ex.getMessage(), _ex);
                  }
               }
            }
         case 1:
            _conn.sendMessage(call);
            return new DBusAsyncReply(call, _m, _conn);
         case 2:
            _conn.queueCallback(call, _m, _callback);
            _conn.sendMessage(call);
            return null;
      }
   }
}
