/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01894
 *  net.caffeinemc.mods.sodium.client.gui.SodiumDebugEntry
 *  net.caffeinemc.mods.sodium.client.gui.SodiumFpsPercentilesEntry
 *  net.caffeinemc.mods.sodium.client.gui.SodiumOptions
 *  net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation
 *  net.caffeinemc.mods.sodium.mixin.features.gui.hooks.debug.DebugScreenEntriesAccessor
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client;

import java.io.IOException;
import java.util.Map;
import minecraft.class01894;
import net.caffeinemc.mods.sodium.client.console.Console;
import net.caffeinemc.mods.sodium.client.console.message.MessageLevel;
import net.caffeinemc.mods.sodium.client.data.fingerprint.FingerprintMeasure;
import net.caffeinemc.mods.sodium.client.data.fingerprint.HashedFingerprint;
import net.caffeinemc.mods.sodium.client.gui.SodiumDebugEntry;
import net.caffeinemc.mods.sodium.client.gui.SodiumFpsPercentilesEntry;
import net.caffeinemc.mods.sodium.client.gui.SodiumOptions;
import net.caffeinemc.mods.sodium.client.services.PlatformRuntimeInformation;
import net.caffeinemc.mods.sodium.mixin.features.gui.hooks.debug.DebugScreenEntriesAccessor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class SodiumClientMod {
    private static SodiumOptions OPTIONS;
    private static final Logger LOGGER;
    public static final class01894 SODIUM_DEBUG_ENTRY_FULL;
    public static final class01894 SODIUM_DEBUG_ENTRY_REDUCED;
    public static final class01894 SODIUM_FPS_PERCENTILES;
    private static String MOD_VERSION;

    public static Logger logger() {
        if (LOGGER == null) {
            throw new IllegalStateException("Logger not yet available");
        }
        return LOGGER;
    }

    public static SodiumOptions options() {
        if (OPTIONS == null) {
            throw new IllegalStateException("Config not yet available");
        }
        return OPTIONS;
    }

    private static SodiumOptions loadConfig() {
        try {
            return SodiumOptions.loadFromDisk();
        }
        catch (Exception exception) {
            LOGGER.error("Failed to load configuration file", (Throwable)exception);
            LOGGER.error("Using default configuration file in read-only mode");
            Console.instance().logMessage(MessageLevel.SEVERE, "sodium.console.config_not_loaded", true, 12.5);
            SodiumOptions sodiumOptions = SodiumOptions.defaults();
            sodiumOptions.setReadOnly();
            return sodiumOptions;
        }
    }

    public static String getVersion() {
        if (MOD_VERSION == null) {
            throw new NullPointerException("Mod version hasn't been populated yet");
        }
        return MOD_VERSION;
    }

    public static void restoreDefaultOptions() {
        OPTIONS = SodiumOptions.defaults();
        try {
            SodiumOptions.writeToDisk((SodiumOptions)OPTIONS);
        }
        catch (IOException iOException) {
            throw new RuntimeException("Failed to write config file", iOException);
        }
    }

    public static boolean allowDebuggingOptions() {
        return PlatformRuntimeInformation.getInstance().isDevelopmentEnvironment();
    }

    public static void onInitialization(String string) {
        Map map = DebugScreenEntriesAccessor.sodium$getEntries();
        map.put(SODIUM_DEBUG_ENTRY_FULL, new SodiumDebugEntry(true));
        map.put(SODIUM_DEBUG_ENTRY_REDUCED, new SodiumDebugEntry(false));
        map.put(SODIUM_FPS_PERCENTILES, new SodiumFpsPercentilesEntry());
        MOD_VERSION = string;
        OPTIONS = SodiumClientMod.loadConfig();
        try {
            SodiumClientMod.updateFingerprint();
        }
        catch (Throwable throwable) {
            LOGGER.error("Failed to update fingerprint", throwable);
        }
    }

    private static void updateFingerprint() {
        FingerprintMeasure fingerprintMeasure = FingerprintMeasure.create();
        if (fingerprintMeasure == null) {
            return;
        }
        HashedFingerprint hashedFingerprint = null;
        try {
            hashedFingerprint = HashedFingerprint.loadFromDisk();
        }
        catch (Throwable throwable) {
            LOGGER.error("Failed to load existing fingerprint", throwable);
        }
        if (hashedFingerprint == null || !fingerprintMeasure.looselyMatches(hashedFingerprint)) {
            HashedFingerprint.writeToDisk(fingerprintMeasure.hashed());
            SodiumClientMod.OPTIONS.notifications.hasSeenDonationPrompt = false;
            SodiumClientMod.OPTIONS.notifications.hasClearedDonationButton = false;
            try {
                SodiumOptions.writeToDisk((SodiumOptions)OPTIONS);
            }
            catch (IOException iOException) {
                LOGGER.error("Failed to update config file", (Throwable)iOException);
            }
        }
    }

    static {
        LOGGER = LoggerFactory.getLogger((String)"Sodium");
        SODIUM_DEBUG_ENTRY_FULL = class01894.N((String)"sodium", (String)"debug_full");
        SODIUM_DEBUG_ENTRY_REDUCED = class01894.N((String)"sodium", (String)"debug_reduced");
    }
}

