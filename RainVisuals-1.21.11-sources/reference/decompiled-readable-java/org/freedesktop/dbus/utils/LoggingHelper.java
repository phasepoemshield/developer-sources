/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.utils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public final class LoggingHelper {
    public static void logIf(boolean _enabled, Runnable _loggerCall) {
        if (_enabled) {
            _loggerCall.run();
        }
    }

    public static String arraysVeryDeepString(Object[] _array) {
        if (_array == null) {
            return null;
        }
        return String.join((CharSequence)", ", LoggingHelper.arraysVeryDeepStringRecursive(_array));
    }

    /*
     * WARNING - void declaration
     */
    private static List<String> arraysVeryDeepStringRecursive(Object[] _array) {
        void var1_1;
        if (_array == null) {
            return null;
        }
        ArrayList<String> result = new ArrayList<String>();
        Object[] objectArray = _array;
        int n = objectArray.length;
        for (int i = 0; i < n; ++i) {
            Object object = objectArray[i];
            if (object == null) {
                result.add("(null)");
                continue;
            }
            if (object.getClass().isArray()) {
                if (object.getClass().getComponentType().isPrimitive()) {
                    result.add(LoggingHelper.convertToString(object));
                    continue;
                }
                result.add(LoggingHelper.convertToString(LoggingHelper.arraysVeryDeepStringRecursive((Object[])object)));
                continue;
            }
            if (object instanceof Collection) {
                Collection col = (Collection)object;
                result.add(LoggingHelper.convertToString(LoggingHelper.arraysVeryDeepStringRecursive(col.toArray())));
                continue;
            }
            result.add(LoggingHelper.convertToString(object));
        }
        return var1_1;
    }

    static String convertToString(Object _obj) {
        if (_obj == null) {
            return null;
        }
        if (_obj.getClass().isArray() && _obj.getClass().getComponentType().isPrimitive()) {
            if (_obj.getClass().getComponentType() == Boolean.TYPE) {
                return Arrays.toString((boolean[])_obj);
            }
            if (_obj.getClass().getComponentType() == Character.TYPE) {
                return Arrays.toString((char[])_obj);
            }
            if (_obj.getClass().getComponentType() == Integer.TYPE) {
                return Arrays.toString((int[])_obj);
            }
            if (_obj.getClass().getComponentType() == Float.TYPE) {
                return Arrays.toString((float[])_obj);
            }
            if (_obj.getClass().getComponentType() == Double.TYPE) {
                return Arrays.toString((double[])_obj);
            }
            if (_obj.getClass().getComponentType() == Byte.TYPE) {
                return Arrays.toString((byte[])_obj);
            }
            if (_obj.getClass().getComponentType() == Long.TYPE) {
                return Arrays.toString((long[])_obj);
            }
        }
        return Objects.toString(_obj);
    }

    private LoggingHelper() {
    }
}

