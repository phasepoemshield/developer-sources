/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.compatibility.environment.probe;

import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterInfo;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterVendor;
import org.jspecify.annotations.NonNull;

public record GraphicsAdapterInfo$LinuxPciAdapterInfo(@NonNull GraphicsAdapterVendor vendor, @NonNull String name, String pciVendorId, String pciDeviceId) implements GraphicsAdapterInfo
{
}

