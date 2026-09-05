/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion
 *  net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMT$WDDMAdapterInfo
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.compatibility.workarounds.intel;

import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils;
import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils$OperatingSystem;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterInfo;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterProbe;
import net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMT;
import org.jspecify.annotations.Nullable;

public class IntelWorkarounds {
    public static boolean isUsingIntelGen8OrOlder() {
        if (OsUtils.getOs() != OsUtils$OperatingSystem.WIN) {
            return false;
        }
        for (GraphicsAdapterInfo graphicsAdapterInfo : GraphicsAdapterProbe.getAdapters()) {
            D3DKMT.WDDMAdapterInfo wDDMAdapterInfo;
            String string;
            if (!(graphicsAdapterInfo instanceof D3DKMT.WDDMAdapterInfo) || (string = (wDDMAdapterInfo = (D3DKMT.WDDMAdapterInfo)graphicsAdapterInfo).getOpenGlIcdName()) == null || !string.matches("ig(7|75|8)icd(32|64)\\.dll")) continue;
            return true;
        }
        return false;
    }

    public static @Nullable WindowsFileVersion findIntelDriverMatchingBug899() {
        if (OsUtils.getOs() != OsUtils$OperatingSystem.WIN) {
            return null;
        }
        for (GraphicsAdapterInfo graphicsAdapterInfo : GraphicsAdapterProbe.getAdapters()) {
            D3DKMT.WDDMAdapterInfo wDDMAdapterInfo;
            String string;
            if (!(graphicsAdapterInfo instanceof D3DKMT.WDDMAdapterInfo) || (string = (wDDMAdapterInfo = (D3DKMT.WDDMAdapterInfo)graphicsAdapterInfo).getOpenGlIcdName()) == null) continue;
            WindowsFileVersion windowsFileVersion = wDDMAdapterInfo.openglIcdVersion();
            if (!string.matches("ig7icd(32|64).dll") || windowsFileVersion.z() != 10) continue;
            if (windowsFileVersion.w() >= 5161) continue;
            return windowsFileVersion;
        }
        return null;
    }
}

