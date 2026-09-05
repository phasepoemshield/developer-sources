/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.services;

import java.util.ServiceLoader;
import java.util.function.Supplier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Services {
    private static Logger LOGGER = LoggerFactory.getLogger((String)"net.caffeinemc.mods.sodium.client.services.Services");

    public static <T> T load(Class<T> clazz) {
        T t = ServiceLoader.load(clazz).findFirst().orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        LOGGER.debug("Loaded {} for service {}", t, clazz);
        return t;
    }

    public static <T> T loadOr(Class<T> clazz, Supplier<T> supplier) {
        T t = ServiceLoader.load(clazz).findFirst().orElse(supplier.get());
        LOGGER.debug("Loaded {} for service {}", t, clazz);
        return t;
    }
}

