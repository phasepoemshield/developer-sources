/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.sun.jna.Platform
 *  com.sun.jna.platform.win32.Kernel32
 *  com.sun.jna.platform.win32.Kernel32Util
 *  com.sun.jna.platform.win32.Tlhelp32$MODULEENTRY32W
 *  net.caffeinemc.mods.sodium.client.platform.MessageBox
 *  net.caffeinemc.mods.sodium.client.platform.MessageBox$IconType
 *  net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle
 *  net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion
 *  net.caffeinemc.mods.sodium.client.platform.windows.api.Kernel32
 *  net.caffeinemc.mods.sodium.client.platform.windows.api.version.Version
 *  net.caffeinemc.mods.sodium.client.platform.windows.api.version.VersionFixedFileInfoStruct
 *  net.caffeinemc.mods.sodium.client.platform.windows.api.version.VersionInfo
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.compatibility.checks;

import com.sun.jna.Platform;
import com.sun.jna.platform.win32.Kernel32;
import com.sun.jna.platform.win32.Kernel32Util;
import com.sun.jna.platform.win32.Tlhelp32;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import net.caffeinemc.mods.sodium.client.compatibility.checks.BugChecks;
import net.caffeinemc.mods.sodium.client.platform.MessageBox;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.Version;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.VersionFixedFileInfoStruct;
import net.caffeinemc.mods.sodium.client.platform.windows.api.version.VersionInfo;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ModuleScanner {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Sodium-Win32ModuleChecks");
    private static final String[] RTSS_HOOKS_MODULE_NAMES = new String[]{"RTSSHooks64.dll", "RTSSHooks.dll"};
    private static final String[] ASUS_GPU_TWEAK_MODULE_NAMES = new String[]{"GTIII-OSD64-GL.dll", "GTIII-OSD-GL.dll", "GTIII-OSD64-VK.dll", "GTIII-OSD-VK.dll", "GTIII-OSD64.dll", "GTIII-OSD.dll"};

    public static void checkModules(NativeWindowHandle nativeWindowHandle) {
        List<String> list;
        try {
            list = ModuleScanner.listModules();
        }
        catch (Throwable throwable) {
            LOGGER.warn("Failed to scan the currently loaded modules", throwable);
            return;
        }
        if (list.isEmpty()) {
            return;
        }
        if (BugChecks.ISSUE_2048 && ModuleScanner.isModuleLoaded(list, RTSS_HOOKS_MODULE_NAMES)) {
            ModuleScanner.checkRTSSModules(nativeWindowHandle);
        }
        if (BugChecks.ISSUE_2637 && ModuleScanner.isModuleLoaded(list, ASUS_GPU_TWEAK_MODULE_NAMES)) {
            ModuleScanner.checkASUSGpuTweakIII(nativeWindowHandle);
        }
    }

    private static void checkASUSGpuTweakIII(NativeWindowHandle nativeWindowHandle) {
        MessageBox.showMessageBox((NativeWindowHandle)nativeWindowHandle, (MessageBox.IconType)MessageBox.IconType.ERROR, (String)"Sodium Renderer", (String)"ASUS GPU Tweak III is not compatible with Minecraft, and causes extreme performance issues and severe graphical corruption when used with Minecraft.\n\nYou *must* do one of the following things to continue:\n\na) Open the settings of ASUS GPU Tweak III, enable the Blacklist option, click \"Browse from file...\", and select the Java runtime (javaw.exe) which is used by Minecraft.\n\nb) Completely uninstall the ASUS GPU Tweak III application.\n\nFor more information on how to solve this problem, click the 'Help' button.", (String)"https://link.caffeinemc.net/help/sodium/incompatible-software/asus-gtiii/gh-2637");
        throw new RuntimeException("ASUS GPU Tweak III is not compatible with Minecraft, see here for more details: https://link.caffeinemc.net/help/sodium/incompatible-software/asus-gtiii/gh-2637");
    }

    private static @Nullable WindowsFileVersion findRTSSModuleVersion() {
        String string;
        long l;
        try {
            l = net.caffeinemc.mods.sodium.client.platform.windows.api.Kernel32.getModuleHandleByNames((String[])RTSS_HOOKS_MODULE_NAMES);
        }
        catch (Throwable throwable) {
            LOGGER.warn("Failed to locate module", throwable);
            return null;
        }
        try {
            string = net.caffeinemc.mods.sodium.client.platform.windows.api.Kernel32.getModuleFileName((long)l);
        }
        catch (Throwable throwable) {
            LOGGER.warn("Failed to get path of module", throwable);
            return null;
        }
        Path path = Path.of(string, new String[0]);
        Path path2 = path.getParent();
        LOGGER.info("Searching directory: {}", (Object)path2);
        Path path3 = path2.resolve("RTSS.exe");
        if (!Files.exists(path3, new LinkOption[0])) {
            LOGGER.warn("Could not find executable: {}", (Object)path3);
            return null;
        }
        LOGGER.info("Parsing file: {}", (Object)path3);
        VersionInfo versionInfo = Version.getModuleFileVersion((String)path3.toAbsolutePath().toString());
        if (versionInfo == null) {
            LOGGER.warn("Couldn't find version structure");
            return null;
        }
        VersionFixedFileInfoStruct versionFixedFileInfoStruct = versionInfo.queryFixedFileInfo();
        if (versionFixedFileInfoStruct == null) {
            LOGGER.warn("Couldn't query file version");
            return null;
        }
        return WindowsFileVersion.fromFileVersion((VersionFixedFileInfoStruct)versionFixedFileInfoStruct);
    }

    private static List<String> listModules() {
        if (!Platform.isWindows()) {
            return List.of();
        }
        int n = Kernel32.INSTANCE.GetCurrentProcessId();
        ArrayList<String> arrayList = new ArrayList<String>();
        for (Tlhelp32.MODULEENTRY32W mODULEENTRY32W : Kernel32Util.getModules((int)n)) {
            arrayList.add(mODULEENTRY32W.szModule());
        }
        return Collections.unmodifiableList(arrayList);
    }

    private static boolean isRTSSCompatible(WindowsFileVersion windowsFileVersion) {
        int n = windowsFileVersion.x();
        int n2 = windowsFileVersion.y();
        int n3 = windowsFileVersion.z();
        return n > 7 || n == 7 && n2 > 3 || n == 7 && n2 == 3 && n3 >= 4;
    }

    private static void checkRTSSModules(NativeWindowHandle nativeWindowHandle) {
        LOGGER.warn("RivaTuner Statistics Server (RTSS) has injected into the process! Attempting to apply workarounds for compatibility...");
        WindowsFileVersion windowsFileVersion = null;
        try {
            windowsFileVersion = ModuleScanner.findRTSSModuleVersion();
        }
        catch (Throwable throwable) {
            LOGGER.warn("Exception thrown while reading file version", throwable);
        }
        if (windowsFileVersion == null) {
            LOGGER.warn("Could not determine version of RivaTuner Statistics Server");
        } else {
            LOGGER.info("Detected RivaTuner Statistics Server version: {}", (Object)windowsFileVersion);
        }
        if (windowsFileVersion == null || !ModuleScanner.isRTSSCompatible(windowsFileVersion)) {
            MessageBox.showMessageBox((NativeWindowHandle)nativeWindowHandle, (MessageBox.IconType)MessageBox.IconType.ERROR, (String)"Sodium Renderer", (String)"You appear to be using an older version of RivaTuner Statistics Server (RTSS) which is not compatible with Sodium.\n\nYou must either update to a newer version (7.3.4 and later) or close the RivaTuner Statistics Server application.\n\nFor more information on how to solve this problem, click the 'Help' button.", (String)"https://link.caffeinemc.net/help/sodium/incompatible-software/rivatuner-statistics-server/gh-2048");
            throw new RuntimeException("The installed version of RivaTuner Statistics Server (RTSS) is not compatible with Sodium, see here for more details: https://link.caffeinemc.net/help/sodium/incompatible-software/rivatuner-statistics-server/gh-2048");
        }
    }

    private static boolean isModuleLoaded(List<String> list, String[] stringArray) {
        for (String string : stringArray) {
            for (String string2 : list) {
                if (!string2.equalsIgnoreCase(string)) continue;
                return true;
            }
        }
        return false;
    }
}

