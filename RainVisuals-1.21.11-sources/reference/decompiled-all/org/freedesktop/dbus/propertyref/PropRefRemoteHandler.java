package org.freedesktop.dbus.propertyref;

import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.Optional;
import org.freedesktop.dbus.Marshalling;
import org.freedesktop.dbus.RemoteInvocationHandler;
import org.freedesktop.dbus.RemoteObject;
import org.freedesktop.dbus.TypeRef;
import org.freedesktop.dbus.annotations.DBusBoundProperty;
import org.freedesktop.dbus.annotations.DBusProperty;
import org.freedesktop.dbus.connections.AbstractConnection;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.exceptions.DBusExecutionException;
import org.freedesktop.dbus.interfaces.Properties;
import org.freedesktop.dbus.utils.DBusNamingUtil;
import org.freedesktop.dbus.utils.Util;

// $VF: Compiled from PropRefRemoteHandler.java
public final class PropRefRemoteHandler {
   private static final Method PROP_GET_METHOD = getPropertiesMethod("Get", String.class, String.class);
   private static final Method PROP_SET_METHOD = getPropertiesMethod("Set", String.class, String.class, Object.class);

   private PropRefRemoteHandler() {
   }

   private static Method getPropertiesMethod(String _method, Class<?>... _signature) {
      try {
         return Properties.class.getMethod(_method, _signature);
      } catch (NoSuchMethodException | SecurityException _ex) {
         throw new DBusExecutionException("Unable to get methods of DBus Properties interface", _ex);
      }
   }

   public static Object handleDBusBoundProperty(AbstractConnection _method, RemoteObject _args, Method _conn, Object[] _remote) throws DBusException {
      String name = DBusNamingUtil.getPropertyName(_method);
      DBusProperty.Access access = PropertyRef.accessForMethod(_method);
      Class<?> typeClass = _method.getAnnotation(DBusBoundProperty.class).type();
      Type[] type = null;
      if (TypeRef.class.isAssignableFrom(typeClass)) {
         type = Optional.ofNullable(Util.unwrapTypeRef(typeClass)).map(t -> new Type[]{t}).orElse(null);
      }

      String[] variantType = type != null ? new String[]{Marshalling.getDBusType(type)} : null;
      return access == DBusProperty.Access.READ
         ? RemoteInvocationHandler.executeRemoteMethod(
            _remote,
            PROP_GET_METHOD,
            new Type[]{_method.getGenericReturnType()},
            _conn,
            0,
            null,
            DBusNamingUtil.getInterfaceName(_method.getDeclaringClass()),
            name
         )
         : RemoteInvocationHandler.executeRemoteMethod(
            _remote,
            PROP_SET_METHOD,
            variantType,
            new Type[]{_method.getGenericReturnType()},
            _conn,
            0,
            null,
            DBusNamingUtil.getInterfaceName(_method.getDeclaringClass()),
            name,
            _args[0]
         );
   }
}
