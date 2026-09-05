/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.platform;

import net.caffeinemc.mods.sodium.client.platform.MessageBox;
import net.caffeinemc.mods.sodium.client.platform.MessageBox$IconType;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PlatformHelper {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Sodium-EarlyDriverScanner");

    public static void showCriticalErrorAndClose(@Nullable NativeWindowHandle nativeWindowHandle, @NonNull String string, @NonNull String string2, @NonNull String string3) {
        LOGGER.error("###ERROR_DESCRIPTION###\n\nFor more information, please see: ###HELP_URL###".replace("###ERROR_DESCRIPTION###", string2).replace("###HELP_URL###", string3));
        MessageBox.showMessageBox(nativeWindowHandle, MessageBox$IconType.ERROR, string, string2, string3);
        System.exit(1);
    }
}

