/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  net.caffeinemc.mods.sodium.client.compatibility.checks.PreLaunchChecks
 *  net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterProbe
 *  net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds
 *  net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint
 */
package net.caffeinemc.mods.sodium.fabric;

import net.caffeinemc.mods.sodium.client.compatibility.checks.PreLaunchChecks;
import net.caffeinemc.mods.sodium.client.compatibility.environment.probe.GraphicsAdapterProbe;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds;
import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;

public class SodiumPreLaunch
implements PreLaunchEntrypoint {
    public void onPreLaunch() {
        PreLaunchChecks.checkEnvironment();
        GraphicsAdapterProbe.findAdapters();
        Workarounds.init();
    }
}

