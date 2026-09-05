/*
 * Decompiled with CFR 0.152.
 */
package org.xml.sax.helpers;

import com.sun.org.apache.xerces.internal.parsers.SAXParser;
import java.lang.reflect.InvocationTargetException;
import java.util.Objects;

class NewInstance {
    private static final String DEFAULT_PACKAGE = "com.sun.org.apache.xerces.internal";
    private static final String DEFAULT_CLASS = "com.sun.org.apache.xerces.internal.parsers.SAXParser";

    NewInstance() {
    }

    static <T> T newInstance(Class<T> clazz, ClassLoader classLoader, String string) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        ClassLoader classLoader2 = Objects.requireNonNull(classLoader);
        String string2 = Objects.requireNonNull(string);
        if (string2.equals(DEFAULT_CLASS)) {
            return clazz.cast(new SAXParser());
        }
        boolean bl = false;
        if (System.getSecurityManager() != null && string2 != null && string2.startsWith(DEFAULT_PACKAGE)) {
            bl = true;
        }
        Class<?> clazz2 = classLoader2 == null || bl ? Class.forName(string2) : classLoader2.loadClass(string2);
        try {
            return clazz.cast(clazz2.getConstructor(new Class[0]).newInstance(new Object[0]));
        }
        catch (NoSuchMethodException | SecurityException | InvocationTargetException exception) {
            throw new InstantiationException(exception.getMessage());
        }
    }
}

