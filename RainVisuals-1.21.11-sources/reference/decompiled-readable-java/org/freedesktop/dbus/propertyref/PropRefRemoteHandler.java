/*
 * Decompiled with CFR 0.152.
 */
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
import org.freedesktop.dbus.propertyref.PropertyRef;
import org.freedesktop.dbus.utils.DBusNamingUtil;
import org.freedesktop.dbus.utils.Util;

public final class PropRefRemoteHandler {
    private static final Method PROP_GET_METHOD;
    private static final Method PROP_SET_METHOD;

    private PropRefRemoteHandler() {
    }

    private static Method getPropertiesMethod(String _method, Class<?> ... _signature) {
        try {
            return Properties.class.getMethod(_method, _signature);
        }
        catch (NoSuchMethodException | SecurityException _ex) {
            throw new DBusExecutionException("Unable to get methods of DBus Properties interface", _ex);
        }
    }

    /*
     * WARNING - void declaration
     */
    public static Object handleDBusBoundProperty(AbstractConnection _conn, RemoteObject _remote, Method _method, Object[] _args) throws DBusException {
        void var3_3;
        void var4_4;
        void var2_2;
        String[] stringArray;
        String name = DBusNamingUtil.getPropertyName(_method);
        DBusProperty.Access access = PropertyRef.accessForMethod(_method);
        Class<?> typeClass = _method.getAnnotation(DBusBoundProperty.class).type();
        Type[] type = null;
        if (TypeRef.class.isAssignableFrom(typeClass)) {
            type = Optional.ofNullable(Util.unwrapTypeRef(typeClass)).map(t -> {
                Type type;
                Type[] typeArray = new Type[1];
                typeArray[0] = type;
                return typeArray;
            }).orElse(null);
        }
        if (type != null) {
            String[] stringArray2 = new String[1];
            stringArray = stringArray2;
            stringArray2[0] = Marshalling.getDBusType(type);
        } else {
            stringArray = null;
        }
        String[] variantType = stringArray;
        if (access == DBusProperty.Access.READ) {
            Type[] typeArray = new Type[1];
            typeArray[0] = _method.getGenericReturnType();
            Object[] objectArray = new Object[2];
            objectArray[0] = DBusNamingUtil.getInterfaceName(_method.getDeclaringClass());
            objectArray[1] = name;
            return RemoteInvocationHandler.executeRemoteMethod(_remote, PROP_GET_METHOD, typeArray, _conn, 0, null, objectArray);
        }
        Type[] typeArray = new Type[1];
        typeArray[0] = _method.getGenericReturnType();
        Object[] objectArray = new Object[3];
        objectArray[0] = DBusNamingUtil.getInterfaceName(var2_2.getDeclaringClass());
        objectArray[1] = var4_4;
        objectArray[2] = var3_3[0];
        return RemoteInvocationHandler.executeRemoteMethod(_remote, PROP_SET_METHOD, variantType, typeArray, _conn, 0, null, objectArray);
    }

    static {
        Class[] classArray = new Class[2];
        classArray[0] = String.class;
        classArray[1] = String.class;
        PROP_GET_METHOD = PropRefRemoteHandler.getPropertiesMethod("Get", classArray);
        Class[] classArray2 = new Class[3];
        classArray2[0] = String.class;
        classArray2[1] = String.class;
        classArray2[2] = Object.class;
        PROP_SET_METHOD = PropRefRemoteHandler.getPropertiesMethod("Set", classArray2);
    }
}

