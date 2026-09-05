/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.autoconfig.util;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.nio.file.Path;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import me.shedaniel.autoconfig.util.fabric.UtilsImpl;

public class Utils {
    private Utils() {
    }

    public static Path getConfigFolder() {
        return UtilsImpl.getConfigFolder();
    }

    public static <T, K, U> Collector<T, ?, Map<K, U>> toLinkedMap(Function<? super T, ? extends K> function, Function<? super T, ? extends U> function2) {
        return Collectors.toMap(function, function2, (object, object2) -> {
            throw new IllegalStateException(String.format("Duplicate key %s", object));
        }, LinkedHashMap::new);
    }

    public static void setUnsafely(Field field, Object object, Object object2) {
        if (object == null) {
            return;
        }
        try {
            field.setAccessible(true);
            field.set(object, object2);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    public static <V> V constructUnsafely(Class<V> clazz) {
        try {
            Constructor<V> constructor = clazz.getDeclaredConstructor(new Class[0]);
            constructor.setAccessible(true);
            return constructor.newInstance(new Object[0]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    public static <V> V getUnsafely(Field field, Object object) {
        if (object == null) {
            return null;
        }
        try {
            field.setAccessible(true);
            return (V)field.get(object);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException(reflectiveOperationException);
        }
    }

    public static <V> V getUnsafely(Field field, Object object, V v) {
        V v2 = Utils.getUnsafely(field, object);
        if (v2 == null) {
            v2 = v;
        }
        return v2;
    }
}

