/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.compatibility.checks;

import net.caffeinemc.mods.sodium.client.compatibility.checks.GraphicsDriverChecks;
import net.caffeinemc.mods.sodium.client.compatibility.environment.GlContextInfo;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.nvidia.NvidiaWorkarounds;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PostLaunchChecks {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Sodium-PostlaunchChecks");

    public static void onContextInitialized(NativeWindowHandle nativeWindowHandle, GlContextInfo glContextInfo) {
        GraphicsDriverChecks.postContextInit(nativeWindowHandle, glContextInfo);
        NvidiaWorkarounds.applyContextChanges(glContextInfo);
        if (PostLaunchChecks.isUsingPojavLauncher()) {
            throw new RuntimeException("It appears that you are using PojavLauncher, which is not supported when using Sodium. Please check your mods list.");
        }
    }

    private static boolean isKnownAndroidPathFragment(String string) {
        return string.matches("/data/user/[0-9]+/net\\.kdt\\.pojavlaunch");
    }

    private static boolean isUsingPojavLauncher() {
        Object object;
        if (System.getenv("POJAV_RENDERER") != null) {
            LOGGER.warn("Detected presence of environment variable POJAV_LAUNCHER, which seems to indicate we are running on Android");
            return true;
        }
        String string = System.getProperty("java.library.path", null);
        if (string != null) {
            object = string.split(":");
            int n = ((String[])object).length;
            for (int i = 0; i < n; ++i) {
                String string2 = object[i];
                if (!PostLaunchChecks.isKnownAndroidPathFragment(string2)) continue;
                LOGGER.warn("Found a library search path which seems to be hosted in an Android filesystem: {}", (Object)string2);
                return true;
            }
        }
        if ((object = System.getProperty("user.home", null)) != null && PostLaunchChecks.isKnownAndroidPathFragment((String)object)) {
            LOGGER.warn("Working directory seems to be hosted in an Android filesystem: {}", object);
        }
        return false;
    }
}

