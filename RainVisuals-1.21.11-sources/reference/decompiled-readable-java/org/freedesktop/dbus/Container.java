/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;
import org.freedesktop.dbus.annotations.Position;
import org.slf4j.LoggerFactory;

public abstract class Container {
    private static final Map<Type, Type[]> TYPE_CACHE = new HashMap<Type, Type[]>();
    private Object[] parameters = null;

    static Type[] getTypeCache(Type _k) {
        return TYPE_CACHE.get(_k);
    }

    public final boolean equals(Object _other) {
        if (this == _other) {
            return true;
        }
        if (_other == null) {
            return false;
        }
        if (_other instanceof Container) {
            Container cont = (Container)_other;
            if (this.getClass().equals(cont.getClass())) {
                return Arrays.equals(this.getParameters(), cont.getParameters());
            }
            return false;
        }
        return false;
    }

    public int hashCode() {
        int prime = 31;
        int result = 1;
        int n = 31 * result + Arrays.deepHashCode(this.parameters);
        return n;
    }

    static void putTypeCache(Type _k, Type[] _v) {
        TYPE_CACHE.put(_k, _v);
    }

    public final Object[] getParameters() {
        if (null != this.parameters) {
            return this.parameters;
        }
        this.setup();
        return this.parameters;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getClass().getName()).append("<");
        if (null == this.parameters) {
            this.setup();
        }
        if (0 == this.parameters.length) {
            return sb.append(">").toString();
        }
        sb.append(Arrays.stream(this.parameters).map(Objects::toString).collect(Collectors.joining(", ")));
        return sb.append(">").toString();
    }

    Container() {
    }

    private void setup() {
        Field[] fs = this.getClass().getDeclaredFields();
        Object[] args2 = new Object[fs.length];
        int diff = 0;
        Field[] fieldArray = fs;
        int n = fieldArray.length;
        for (int i = 0; i < n; ++i) {
            Field f = fieldArray[i];
            if (!f.isAnnotationPresent(Position.class)) {
                ++diff;
                continue;
            }
            Position p = f.getAnnotation(Position.class);
            f.setAccessible(true);
            try {
                args2[p.value()] = f.get(this);
                continue;
            }
            catch (IllegalAccessException _exIa) {
                LoggerFactory.getLogger(this.getClass()).trace("Could not set value", _exIa);
            }
        }
        this.parameters = new Object[args2.length - diff];
        System.arraycopy(args2, 0, this.parameters, 0, this.parameters.length);
    }
}

