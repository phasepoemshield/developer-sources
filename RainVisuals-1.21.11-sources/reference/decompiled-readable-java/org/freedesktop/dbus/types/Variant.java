/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.types;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Objects;
import org.freedesktop.dbus.Marshalling;
import org.freedesktop.dbus.exceptions.DBusException;
import org.freedesktop.dbus.utils.DBusObjects;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Variant<T> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final Type type;
    private final T value;
    private final String sig;

    public String toString() {
        return "[" + String.valueOf(this.value) + "]";
    }

    public T getValue() {
        return this.value;
    }

    public Type getType() {
        return this.type;
    }

    public int hashCode() {
        Object[] objectArray = new Object[1];
        objectArray[0] = this.value;
        return Objects.hash(objectArray);
    }

    /*
     * WARNING - void declaration
     */
    public Variant(T _value, Type _type) throws IllegalArgumentException {
        void var1_1;
        DBusObjects.requireNotNull(_value, () -> new IllegalArgumentException("Can't wrap Null in a Variant"));
        this.type = _type;
        try {
            String[] ss = Marshalling.getDBusType(_type);
            if (ss.length != 1) {
                throw new IllegalArgumentException("Can't wrap a multi-valued type in a Variant: " + String.valueOf(_type));
            }
            this.sig = ss[0];
        }
        catch (DBusException _ex) {
            void var3_4;
            this.logger.debug("Cannot create variant", _ex);
            Object[] objectArray = new Object[2];
            objectArray[0] = _type;
            objectArray[1] = var3_4.getMessage();
            throw new IllegalArgumentException(String.format("Can't wrap %s in an unqualified Variant (%s).", objectArray));
        }
        this.value = var1_1;
    }

    public boolean equals(Object _obj) {
        if (this == _obj) {
            return true;
        }
        if (!(_obj instanceof Variant)) {
            return false;
        }
        Variant other = (Variant)_obj;
        return Objects.equals(this.value, other.value);
    }

    public String getSig() {
        return this.sig;
    }

    /*
     * WARNING - void declaration
     */
    public Variant(T _value) throws IllegalArgumentException {
        void var1_1;
        DBusObjects.requireNotNull(_value, () -> new IllegalArgumentException("Can't wrap Null in a Variant"));
        this.type = _value.getClass();
        try {
            String[] ss = Marshalling.getDBusType(_value.getClass(), true);
            if (ss.length != 1) {
                throw new IllegalArgumentException("Can't wrap a multi-valued type in a Variant: " + String.valueOf(this.type));
            }
            this.sig = ss[0];
        }
        catch (DBusException _ex) {
            this.logger.debug("Cannot create variant", _ex);
            Object[] objectArray = new Object[2];
            objectArray[0] = _value.getClass();
            objectArray[1] = _ex.getMessage();
            throw new IllegalArgumentException(String.format("Can't wrap %s in an unqualified Variant (%s).", objectArray));
        }
        this.value = var1_1;
    }

    /*
     * WARNING - void declaration
     */
    public Variant(T _value, String _sig) throws IllegalArgumentException {
        void var1_1;
        DBusObjects.requireNotNull(_value, () -> new IllegalArgumentException("Can't wrap Null in a Variant"));
        this.sig = _sig;
        try {
            ArrayList<Type> ts = new ArrayList<Type>();
            Marshalling.getJavaType(_sig, ts, 1);
            if (ts.size() != 1) {
                throw new IllegalArgumentException("Can't wrap multiple or no types in a Variant: " + _sig);
            }
            this.type = (Type)ts.get(0);
        }
        catch (DBusException _ex) {
            void var3_4;
            this.logger.debug("Cannot create variant", _ex);
            Object[] objectArray = new Object[2];
            objectArray[0] = _sig;
            objectArray[1] = var3_4.getMessage();
            throw new IllegalArgumentException(String.format("Can''t wrap %s in an unqualified Variant (%s).", objectArray));
        }
        this.value = var1_1;
    }
}

