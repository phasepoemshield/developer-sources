/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.lithium.common;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LithiumMod {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Lithium");
    private static String MOD_VERSION;

    public static Logger logger() {
        if (LOGGER == null) {
            throw new IllegalStateException("Logger not yet available");
        }
        return LOGGER;
    }

    public static String getVersion() {
        if (MOD_VERSION == null) {
            throw new NullPointerException("Mod version hasn't been populated yet");
        }
        return MOD_VERSION;
    }

    public static void onInitialization(String string) {
        MOD_VERSION = string;
    }
}

