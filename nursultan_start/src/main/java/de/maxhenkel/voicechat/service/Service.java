/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  javax.annotation.Nullable
 *  org.apache.logging.log4j.LogManager
 *  org.apache.logging.log4j.Logger
 */
package de.maxhenkel.voicechat.service;

import java.lang.reflect.InvocationTargetException;
import java.util.ServiceLoader;
import javax.annotation.Nullable;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Service {
    private static Logger LOGGER = LogManager.getLogger((String)"de.maxhenkel.voicechat.service.Service");

    public static <T> T get(Class<T> clazz) {
        return (T)ServiceLoader.load(clazz, clazz.getClassLoader()).findFirst().orElseGet(() -> {
            LOGGER.warn("Failed to load service {} with ServiceLoader", (Object)clazz.getSimpleName());
            try {
                return Service.loadFallback(clazz);
            }
            catch (Exception exception) {
                throw new IllegalStateException("Failed to load service %s".formatted(new Object[]{clazz.getSimpleName()}), exception);
            }
        });
    }

    @Nullable
    private static Class<?> loadClassWithPrefix(Class<?> clazz, String string) {
        try {
            return Class.forName(clazz.getPackageName() + "." + string + clazz.getSimpleName());
        }
        catch (ClassNotFoundException classNotFoundException) {
            return null;
        }
    }

    private static Class<?> loadFallbackClass(Class<?> clazz) throws ClassNotFoundException {
        Class<?> clazz2 = Service.loadClassWithPrefix(clazz, "Fabric");
        if (clazz2 != null) {
            return clazz2;
        }
        clazz2 = Service.loadClassWithPrefix(clazz, "NeoForge");
        if (clazz2 != null) {
            return clazz2;
        }
        clazz2 = Service.loadClassWithPrefix(clazz, "Forge");
        if (clazz2 != null) {
            return clazz2;
        }
        clazz2 = Service.loadClassWithPrefix(clazz, "Quilt");
        if (clazz2 != null) {
            return clazz2;
        }
        clazz2 = Service.loadClassWithPrefix(clazz, "Paper");
        if (clazz2 != null) {
            return clazz2;
        }
        throw new ClassNotFoundException("Implementation of %s not found in package %s".formatted(new Object[]{clazz.getSimpleName(), clazz.getPackageName()}));
    }

    private static <T> T loadFallback(Class<T> clazz) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<?> clazz2 = Service.loadFallbackClass(clazz);
        if (!clazz.isAssignableFrom(clazz2)) {
            throw new ClassNotFoundException("Class %s is not an instance of %s".formatted(new Object[]{clazz2.getSimpleName(), clazz.getSimpleName()}));
        }
        return (T)clazz2.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
    }
}

