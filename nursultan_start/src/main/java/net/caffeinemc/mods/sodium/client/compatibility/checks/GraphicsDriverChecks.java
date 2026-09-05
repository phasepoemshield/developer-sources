/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle
 *  net.caffeinemc.mods.sodium.client.platform.PlatformHelper
 *  net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion
 */
package net.caffeinemc.mods.sodium.client.compatibility.checks;

import net.caffeinemc.mods.sodium.client.compatibility.checks.BugChecks;
import net.caffeinemc.mods.sodium.client.compatibility.environment.GlContextInfo;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterVendor;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.intel.IntelWorkarounds;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.nvidia.NvidiaDriverVersion;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.nvidia.NvidiaWorkarounds;
import net.caffeinemc.mods.sodium.client.platform.NativeWindowHandle;
import net.caffeinemc.mods.sodium.client.platform.PlatformHelper;
import net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion;

class GraphicsDriverChecks {
    GraphicsDriverChecks() {
    }

    static void postContextInit(NativeWindowHandle nativeWindowHandle, GlContextInfo glContextInfo) {
        String string;
        WindowsFileVersion windowsFileVersion;
        GraphicsAdapterVendor graphicsAdapterVendor = GraphicsAdapterVendor.fromContext(glContextInfo);
        if (graphicsAdapterVendor == GraphicsAdapterVendor.UNKNOWN) {
            return;
        }
        if (graphicsAdapterVendor == GraphicsAdapterVendor.INTEL && BugChecks.ISSUE_899 && (windowsFileVersion = IntelWorkarounds.findIntelDriverMatchingBug899()) != null) {
            string = windowsFileVersion.toString();
            PlatformHelper.showCriticalErrorAndClose((NativeWindowHandle)nativeWindowHandle, (String)"Sodium Renderer - Unsupported Driver", (String)"The game failed to start because the currently installed Intel Graphics Driver is not compatible.\n\nInstalled version: ###CURRENT_DRIVER###\nRequired version: 10.18.10.5161 (or newer)\n\nPlease click the 'Help' button to read more about how to fix this problem.".replace("###CURRENT_DRIVER###", string), (String)"https://link.caffeinemc.net/help/sodium/graphics-driver/windows/intel/gh-899");
        }
        if (graphicsAdapterVendor == GraphicsAdapterVendor.NVIDIA && BugChecks.ISSUE_1486 && (windowsFileVersion = NvidiaWorkarounds.findNvidiaDriverMatchingBug1486()) != null) {
            string = NvidiaDriverVersion.parse(windowsFileVersion).toString();
            PlatformHelper.showCriticalErrorAndClose((NativeWindowHandle)nativeWindowHandle, (String)"Sodium Renderer - Unsupported Driver", (String)"The game failed to start because the currently installed NVIDIA Graphics Driver is not compatible.\n\nInstalled version: ###CURRENT_DRIVER###\nRequired version: 536.23 (or newer)\n\nPlease click the 'Help' button to read more about how to fix this problem.".replace("###CURRENT_DRIVER###", string), (String)"https://link.caffeinemc.net/help/sodium/graphics-driver/windows/nvidia/gh-1486");
        }
    }
}

