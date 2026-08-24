/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Map;

public class DBusMapType
implements ParameterizedType {
    private final Type k;
    private final Type v;

    public DBusMapType(Type _k, Type _v) {
        this.k = _k;
        this.v = _v;
    }

    @Override
    public Type[] getActualTypeArguments() {
        Type[] typeArray = new Type[2];
        typeArray[0] = this.k;
        typeArray[1] = this.v;
        return typeArray;
    }

    @Override
    public Type getRawType() {
        return Map.class;
    }

    @Override
    public Type getOwnerType() {
        return null;
    }
}

