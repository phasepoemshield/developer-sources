/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterInfo
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterVendor
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt;

import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterInfo;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterVendor;
import net.caffeinemc.mods.sodium.client.platform.windows.WindowsFileVersion;
import net.caffeinemc.mods.sodium.client.platform.windows.api.d3dkmt.D3DKMT;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public record D3DKMT$WDDMAdapterInfo(@NonNull GraphicsAdapterVendor vendor, @NonNull String name, int adapterType, @Nullable String openglIcdFilePath, @Nullable WindowsFileVersion openglIcdVersion) implements GraphicsAdapterInfo
{
    public String toString() {
        return "AdapterInfo{vendor=%s, description='%s', adapterType=0x%08X, openglIcdFilePath='%s', openglIcdVersion=%s}".formatted(new Object[]{this.vendor, this.name, this.adapterType, this.openglIcdFilePath, this.openglIcdVersion});
    }

    public @Nullable String getOpenGlIcdName() {
        return D3DKMT.getOpenGlIcdName(this.openglIcdFilePath);
    }
}

