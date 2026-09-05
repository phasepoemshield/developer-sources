/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.slf4j.Logger
 *  org.slf4j.LoggerFactory
 */
package net.caffeinemc.mods.sodium.client.compatibility.workarounds;

import java.util.Collections;
import java.util.EnumSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils;
import net.caffeinemc.mods.sodium.client.compatibility.environment.OsUtils$OperatingSystem;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.Workarounds$Reference;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.amd.AmdWorkarounds;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.intel.IntelWorkarounds;
import net.caffeinemc.mods.sodium.client.compatibility.workarounds.nvidia.NvidiaWorkarounds;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Workarounds {
    private static final Logger LOGGER = LoggerFactory.getLogger((String)"Sodium-Workarounds");
    private static final AtomicReference<Set<Workarounds$Reference>> ACTIVE_WORKAROUNDS = new AtomicReference<EnumSet<Workarounds$Reference>>(EnumSet.noneOf(Workarounds$Reference.class));

    public static void init() {
        Set<Workarounds$Reference> set = Workarounds.findNecessaryWorkarounds();
        if (!set.isEmpty()) {
            LOGGER.warn("Sodium has applied one or more workarounds to prevent crashes or other issues on your system: [{}]", (Object)set.stream().map(Enum::name).collect(Collectors.joining(", ")));
            LOGGER.warn("This is not necessarily an issue, but it may result in certain features or optimizations being disabled. You can sometimes fix these issues by upgrading your graphics driver.");
        }
        ACTIVE_WORKAROUNDS.set(set);
    }

    private static Set<Workarounds$Reference> findNecessaryWorkarounds() {
        EnumSet<Workarounds$Reference> enumSet = EnumSet.noneOf(Workarounds$Reference.class);
        OsUtils$OperatingSystem osUtils$OperatingSystem = OsUtils.getOs();
        if (NvidiaWorkarounds.isNvidiaGraphicsCardPresent()) {
            enumSet.add(Workarounds$Reference.NVIDIA_THREADED_OPTIMIZATIONS_BROKEN);
        }
        if (AmdWorkarounds.isAmdGraphicsCardPresent() && osUtils$OperatingSystem == OsUtils$OperatingSystem.WIN) {
            enumSet.add(Workarounds$Reference.AMD_GAME_OPTIMIZATION_BROKEN);
        }
        if (IntelWorkarounds.isUsingIntelGen8OrOlder()) {
            enumSet.add(Workarounds$Reference.INTEL_FRAMEBUFFER_BLIT_CRASH_WHEN_UNFOCUSED);
            enumSet.add(Workarounds$Reference.INTEL_DEPTH_BUFFER_COMPARISON_UNRELIABLE);
        }
        if (osUtils$OperatingSystem == OsUtils$OperatingSystem.LINUX) {
            enumSet.add(Workarounds$Reference.NO_ERROR_CONTEXT_UNSUPPORTED);
        }
        return Collections.unmodifiableSet(enumSet);
    }

    public static boolean isWorkaroundEnabled(Workarounds$Reference workarounds$Reference) {
        return ACTIVE_WORKAROUNDS.get().contains((Object)workarounds$Reference);
    }
}

