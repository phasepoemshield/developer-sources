/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.jsonwebtoken.lang.Classes$ClassLoaderAccessor
 *  io.jsonwebtoken.lang.InstantiationException
 *  io.jsonwebtoken.lang.UnknownClassException
 */
package io.jsonwebtoken.lang;

import io.jsonwebtoken.lang.Classes;
import io.jsonwebtoken.lang.InstantiationException;
import io.jsonwebtoken.lang.UnknownClassException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.URL;

public final class Classes {
    private static final ClassLoaderAccessor THREAD_CL_ACCESSOR = new /* Unavailable Anonymous Inner Class!! */;
    private static final ClassLoaderAccessor CLASS_CL_ACCESSOR = new /* Unavailable Anonymous Inner Class!! */;
    private static final ClassLoaderAccessor SYSTEM_CL_ACCESSOR = new /* Unavailable Anonymous Inner Class!! */;

    private Classes() {
    }

    public static <T> Class<T> forName(String fqcn) throws UnknownClassException {
        Class clazz = THREAD_CL_ACCESSOR.loadClass(fqcn);
        if (clazz == null) {
            clazz = CLASS_CL_ACCESSOR.loadClass(fqcn);
        }
        if (clazz == null) {
            clazz = SYSTEM_CL_ACCESSOR.loadClass(fqcn);
        }
        if (clazz == null) {
            String msg = "Unable to load class named [" + fqcn + "] from the thread context, current, or " + "system/application ClassLoaders.  All heuristics have been exhausted.  Class could not be found.";
            if (fqcn != null && fqcn.startsWith("io.jsonwebtoken.impl")) {
                msg = msg + "  Have you remembered to include the jjwt-impl.jar in your runtime classpath?";
            }
            throw new UnknownClassException(msg);
        }
        return clazz;
    }

    public static InputStream getResourceAsStream(String name) {
        InputStream is = THREAD_CL_ACCESSOR.getResourceStream(name);
        if (is == null) {
            is = CLASS_CL_ACCESSOR.getResourceStream(name);
        }
        if (is == null) {
            is = SYSTEM_CL_ACCESSOR.getResourceStream(name);
        }
        return is;
    }

    private static URL getResource(String name) {
        URL url = THREAD_CL_ACCESSOR.getResource(name);
        if (url == null) {
            url = CLASS_CL_ACCESSOR.getResource(name);
        }
        if (url == null) {
            return SYSTEM_CL_ACCESSOR.getResource(name);
        }
        return url;
    }

    public static boolean isAvailable(String fullyQualifiedClassName) {
        try {
            Classes.forName(fullyQualifiedClassName);
            return true;
        }
        catch (UnknownClassException e) {
            return false;
        }
    }

    public static <T> T newInstance(String fqcn) {
        return Classes.newInstance(Classes.forName(fqcn));
    }

    public static <T> T newInstance(String fqcn, Class<?>[] ctorArgTypes, Object ... args) {
        Class<T> clazz = Classes.forName(fqcn);
        Constructor<T> ctor = Classes.getConstructor(clazz, ctorArgTypes);
        return Classes.instantiate(ctor, args);
    }

    public static <T> T newInstance(String fqcn, Object ... args) {
        return Classes.newInstance(Classes.forName(fqcn), args);
    }

    public static <T> T newInstance(Class<T> clazz) {
        if (clazz == null) {
            String msg = "Class method parameter cannot be null.";
            throw new IllegalArgumentException(msg);
        }
        try {
            return clazz.newInstance();
        }
        catch (Exception e) {
            throw new InstantiationException("Unable to instantiate class [" + clazz.getName() + "]", (Throwable)e);
        }
    }

    public static <T> T newInstance(Class<T> clazz, Object ... args) {
        Class[] argTypes = new Class[args.length];
        for (int i = 0; i < args.length; ++i) {
            argTypes[i] = args[i].getClass();
        }
        Constructor<T> ctor = Classes.getConstructor(clazz, argTypes);
        return Classes.instantiate(ctor, args);
    }

    public static <T> Constructor<T> getConstructor(Class<T> clazz, Class<?> ... argTypes) throws IllegalStateException {
        try {
            return clazz.getConstructor(argTypes);
        }
        catch (NoSuchMethodException e) {
            throw new IllegalStateException(e);
        }
    }

    public static <T> T instantiate(Constructor<T> ctor, Object ... args) {
        try {
            return ctor.newInstance(args);
        }
        catch (Exception e) {
            String msg = "Unable to instantiate instance with constructor [" + ctor + "]";
            throw new InstantiationException(msg, (Throwable)e);
        }
    }

    public static <T> T invokeStatic(String fqcn, String methodName, Class<?>[] argTypes, Object ... args) {
        try {
            Class<T> clazz = Classes.forName(fqcn);
            return Classes.invokeStatic(clazz, methodName, argTypes, args);
        }
        catch (Exception e) {
            String msg = "Unable to invoke class method " + fqcn + "#" + methodName + ".  Ensure the necessary " + "implementation is in the runtime classpath.";
            throw new IllegalStateException(msg, e);
        }
    }

    public static <T> T invokeStatic(Class<?> clazz, String methodName, Class<?>[] argTypes, Object ... args) {
        try {
            Method method = clazz.getDeclaredMethod(methodName, argTypes);
            method.setAccessible(true);
            return (T)method.invoke(null, args);
        }
        catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            Throwable cause = e.getCause();
            if (cause instanceof RuntimeException) {
                throw (RuntimeException)cause;
            }
            String msg = "Unable to invoke class method " + clazz.getName() + "#" + methodName + ". Ensure the necessary implementation is in the runtime classpath.";
            throw new IllegalStateException(msg, e);
        }
    }

    public static <T> T getFieldValue(Object instance, String fieldName, Class<T> fieldType) {
        if (instance == null) {
            return null;
        }
        try {
            Field field = instance.getClass().getDeclaredField(fieldName);
            field.setAccessible(true);
            Object o = field.get(instance);
            return fieldType.cast(o);
        }
        catch (Throwable t) {
            String msg = "Unable to read field " + instance.getClass().getName() + "#" + fieldName + ": " + t.getMessage();
            throw new IllegalStateException(msg, t);
        }
    }
}

