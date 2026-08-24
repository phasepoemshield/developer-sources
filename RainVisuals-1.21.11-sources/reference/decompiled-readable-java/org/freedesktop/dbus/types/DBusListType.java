/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.types;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

public class DBusListType
implements ParameterizedType {
    private final Type v;

    @Override
    public Type getOwnerType() {
        return null;
    }

    @Override
    public Type[] getActualTypeArguments() {
        Type[] typeArray = new Type[1];
        typeArray[0] = this.v;
        return typeArray;
    }

    public DBusListType(Type _v) {
        this.v = _v;
    }

    @Override
    public Type getRawType() {
        return List.class;
    }
}

