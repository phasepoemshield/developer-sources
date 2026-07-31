package com.sun.jna;

import java.lang.reflect.InvocationTargetException;

abstract class Klass {
    private Klass() {
    }

    public static <T> T newInstance(Class<T> klass) {
        try {
            return klass.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        }
        catch (IllegalAccessException | IllegalArgumentException | InstantiationException | NoSuchMethodException | SecurityException e2) {
            String msg = "Can't create an instance of " + klass + ", requires a public no-arg constructor: " + e2;
            throw new IllegalArgumentException(msg, e2);
        }
        catch (InvocationTargetException e3) {
            if (e3.getCause() instanceof RuntimeException) {
                throw (RuntimeException)e3.getCause();
            }
            String msg = "Can't create an instance of " + klass + ", requires a public no-arg constructor: " + e3;
            throw new IllegalArgumentException(msg, e3);
        }
    }
}