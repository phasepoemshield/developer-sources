/*
 * Decompiled with CFR 0.152.
 */
package org.freedesktop.dbus.utils;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.Objects;
import java.util.regex.Pattern;
import org.freedesktop.dbus.annotations.DBusBoundProperty;
import org.freedesktop.dbus.annotations.DBusInterfaceName;
import org.freedesktop.dbus.annotations.DBusMemberName;

public final class DBusNamingUtil {
    private static final Pattern DOLLAR_PATTERN = Pattern.compile("[$]");

    public static String getSignalName(Class<?> _clazz) {
        Objects.requireNonNull(_clazz, "Class must not be null");
        if (_clazz.isAnnotationPresent(DBusMemberName.class)) {
            return _clazz.getAnnotation(DBusMemberName.class).value();
        }
        return _clazz.getSimpleName();
    }

    public static String getAnnotationName(Class<? extends Annotation> _clazz) {
        Objects.requireNonNull(_clazz, "Class must not be null");
        if (_clazz.isAnnotationPresent(DBusInterfaceName.class)) {
            return _clazz.getAnnotation(DBusInterfaceName.class).value();
        }
        return DOLLAR_PATTERN.matcher(_clazz.getName()).replaceAll(".");
    }

    public static String getMethodName(Method _method) {
        Objects.requireNonNull(_method, "method must not be null");
        if (_method.isAnnotationPresent(DBusMemberName.class)) {
            return _method.getAnnotation(DBusMemberName.class).value();
        }
        return _method.getName();
    }

    /*
     * Enabled aggressive block sorting
     */
    public static String getPropertyName(Method _method) {
        String string;
        String lowerCaseName;
        block6: {
            String name;
            block5: {
                block4: {
                    String defName;
                    Objects.requireNonNull(_method, "method must not be null");
                    if (_method.isAnnotationPresent(DBusBoundProperty.class) && !"".equals(defName = _method.getAnnotation(DBusBoundProperty.class).name())) {
                        return defName;
                    }
                    name = _method.getName();
                    lowerCaseName = name.toLowerCase();
                    if (!lowerCaseName.startsWith("get")) break block4;
                    if (!"get".equals(lowerCaseName)) break block5;
                }
                if (!lowerCaseName.startsWith("set")) break block6;
                if ("set".equals(lowerCaseName)) break block6;
            }
            name = name.substring(3);
            return string;
        }
        if (!lowerCaseName.startsWith("is")) return string;
        if ("is".equals(lowerCaseName)) return string;
        return string.substring(2);
    }

    private DBusNamingUtil() {
    }

    public static String getInterfaceName(Class<?> _clazz) {
        Objects.requireNonNull(_clazz, "Class must not be null");
        if (_clazz.isAnnotationPresent(DBusInterfaceName.class)) {
            return _clazz.getAnnotation(DBusInterfaceName.class).value();
        }
        return DOLLAR_PATTERN.matcher(_clazz.getName()).replaceAll(".");
    }
}

