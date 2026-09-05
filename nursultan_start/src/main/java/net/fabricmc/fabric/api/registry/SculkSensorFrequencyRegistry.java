/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap
 *  minecraft.class01194
 *  minecraft.class03502
 *  minecraft.class05946
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.fabricmc.fabric.api.registry;

import it.unimi.dsi.fastutil.objects.Reference2IntOpenHashMap;
import minecraft.class01194;
import minecraft.class03502;
import minecraft.class05946;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public final class SculkSensorFrequencyRegistry {
    private static final Logger LOGGER = LoggerFactory.getLogger(SculkSensorFrequencyRegistry.class);

    private SculkSensorFrequencyRegistry() {
    }

    public static void register(class05946<class01194> class059462, int n) {
        if (n <= 0 || n >= 16) {
            throw new IllegalArgumentException("Attempted to register Sculk Sensor frequency for event " + String.valueOf(class059462.N()) + " with frequency " + n + ". Sculk Sensor frequencies must be between 1 and 15 inclusive.");
        }
        Reference2IntOpenHashMap reference2IntOpenHashMap = (Reference2IntOpenHashMap)class03502.w_;
        int n2 = reference2IntOpenHashMap.put(class059462, n);
        if (n2 != 0) {
            LOGGER.debug("Replaced old frequency mapping for {} - was {}, now {}", new Object[]{class059462.N(), n2, n});
        }
    }
}

