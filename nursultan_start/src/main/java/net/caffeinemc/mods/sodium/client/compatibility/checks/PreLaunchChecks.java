/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.platform.PlatformHelper
 *  org.lwjgl.Version
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.compatibility.checks;

import java.net.URL;
import java.security.CodeSource;
import java.security.ProtectionDomain;
import net.caffeinemc.mods.sodium.client.compatibility.checks.BugChecks;
import net.caffeinemc.mods.sodium.client.platform.PlatformHelper;
import org.lwjgl.Version;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class PreLaunchChecks {
    private static Logger LOGGER = LoggerFactory.getLogger((String)"net.caffeinemc.mods.sodium.client.compatibility.checks.PreLaunchChecks");
    private static final String REQUIRED_LWJGL_VERSION = "3.3.3";

    private static boolean isClassLoaded(String string) {
        try {
            Class.forName(string);
            return true;
        }
        catch (ClassNotFoundException classNotFoundException) {
            return false;
        }
    }

    private static boolean isUsingKnownCompatibleLwjglVersion() {
        return Version.getVersion().startsWith(REQUIRED_LWJGL_VERSION);
    }

    public static void checkEnvironment() {
        if (BugChecks.ISSUE_2561) {
            PreLaunchChecks.checkLwjglRuntimeVersion();
        }
    }

    private static String getLwjglCodeSource() {
        try {
            String string;
            URL uRL;
            CodeSource codeSource;
            ProtectionDomain protectionDomain = Version.class.getProtectionDomain();
            if (protectionDomain != null && (codeSource = protectionDomain.getCodeSource()) != null && (uRL = codeSource.getLocation()) != null && (string = uRL.getPath()) != null) {
                string = string.replace('\\', '/');
                string = string.split("!")[0];
                return string;
            }
        }
        catch (Throwable throwable) {
            LOGGER.error("Error while checking code source of LWJGL", throwable);
        }
        return null;
    }

    private static String getLauncherBrand() {
        String string = System.getProperty("minecraft.launcher.brand", "unknown");
        if (string.equals("unknown")) {
            if (PreLaunchChecks.isClassLoaded("com.moonsworth.lunar.genesis.Genesis")) {
                return "Lunar Client";
            }
            if (System.getProperty("lunar.webosr.url") != null) {
                return "Lunar Client";
            }
        }
        return string;
    }

    private static void checkLwjglRuntimeVersion() {
        if (PreLaunchChecks.isUsingKnownCompatibleLwjglVersion()) {
            return;
        }
        String string = PreLaunchChecks.getLauncherBrand();
        String string2 = PreLaunchChecks.getLwjglCodeSource();
        String string3 = null;
        if (string2 != null) {
            String[] stringArray = string2.split("/");
            string3 = stringArray[stringArray.length - 1];
        }
        if (string2 != null) {
            LOGGER.info("Problematic LWJGL version source: {}", (Object)string2);
        }
        boolean bl = !string.equals("minecraft-launcher") && !string.equals("unknown");
        boolean bl2 = false;
        String string4 = null;
        if (bl && string3 != null && (string3.startsWith("lwjgl-") || string2.contains("/lwjgl/"))) {
            bl2 = true;
        }
        if (!bl2 && string2 != null && string2.endsWith("/mods/" + string3)) {
            string4 = string3;
        }
        String string5 = string4 != null ? "This issue seems to be caused by ###MOD###.\n\nRemoving ###MOD### from your mods folder may fix this issue.".replace("###MOD###", string4) : (string.equalsIgnoreCase("prismlauncher") ? "It appears you are using Prism Launcher to start the game. You can likely fix this problem by opening your instance settings and navigating to the Version section in the sidebar." : (bl2 ? "You seem to be using ###LAUNCHER###. This issue is likely caused by ###LAUNCHER###.\n\nYou must change the LWJGL version in your launcher to continue. This is usually controlled by the settings for a profile or instance in your launcher.\n\nIf you need assistance fixing the LWJGL version, you should contact ###LAUNCHER###, not Sodium.".replace("###LAUNCHER###", string) : (bl ? "You seem to be using ###LAUNCHER###.\n\nYou must change the LWJGL version in your launcher to continue. This is usually controlled by the settings for a profile or instance in your launcher.".replace("###LAUNCHER###", string) : "You must change the LWJGL version in your launcher to continue. This is usually controlled by the settings for a profile or instance in your launcher.")));
        String string6 = "The game failed to start because the currently active LWJGL version is not compatible.\n\nInstalled version: ###CURRENT_VERSION###\nRequired version: ###REQUIRED_VERSION###\n\n###ADVICE_STRING###".replace("###CURRENT_VERSION###", Version.getVersion()).replace("###REQUIRED_VERSION###", REQUIRED_LWJGL_VERSION).replace("###ADVICE_STRING###", string5);
        PlatformHelper.showCriticalErrorAndClose(null, (String)"Sodium Renderer - Unsupported LWJGL", (String)string6, (String)"https://link.caffeinemc.net/help/sodium/runtime-issue/lwjgl3/gh-2561");
    }
}

