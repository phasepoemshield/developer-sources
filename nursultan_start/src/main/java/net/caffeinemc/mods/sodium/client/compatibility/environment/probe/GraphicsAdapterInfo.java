/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.NonNull
 */
package net.caffeinemc.mods.sodium.client.compatibility.environment.probe;

import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterVendor;
import org.jspecify.annotations.NonNull;

public interface GraphicsAdapterInfo {
    public @NonNull String name();

    public @NonNull GraphicsAdapterVendor vendor();
}

