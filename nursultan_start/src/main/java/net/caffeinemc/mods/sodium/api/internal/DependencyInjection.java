/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.api.internal;

import java.lang.reflect.Constructor;

public class DependencyInjection {
    public static <T> T load(Class<T> clazz, String string) {
        Object obj;
        Constructor<?> constructor;
        Class<?> clazz2;
        try {
            clazz2 = Class.forName(string);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException("Could not find implementation", reflectiveOperationException);
        }
        if (!clazz.isAssignableFrom(clazz2)) {
            throw new RuntimeException("Class %s does not implement interface %s".formatted(new Object[]{clazz2.getName(), clazz.getName()}));
        }
        try {
            constructor = clazz2.getConstructor(new Class[0]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException("Could not find default constructor", reflectiveOperationException);
        }
        try {
            obj = constructor.newInstance(new Object[0]);
        }
        catch (ReflectiveOperationException reflectiveOperationException) {
            throw new RuntimeException("Could not instantiate implementation", reflectiveOperationException);
        }
        return clazz.cast(obj);
    }
}

