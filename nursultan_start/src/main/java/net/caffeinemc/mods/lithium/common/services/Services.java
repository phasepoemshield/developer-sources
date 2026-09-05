/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.lithium.common.LithiumMod
 */
package net.caffeinemc.mods.lithium.common.services;

import java.util.ServiceLoader;
import net.caffeinemc.mods.lithium.common.LithiumMod;

public class Services {
    public static <T> T load(Class<T> clazz) {
        T t = ServiceLoader.load(clazz, clazz.getClassLoader()).findFirst().orElseThrow(() -> new NullPointerException("Failed to load service for " + clazz.getName()));
        LithiumMod.logger().debug("Loaded {} for service {}", t, clazz);
        return t;
    }
}

