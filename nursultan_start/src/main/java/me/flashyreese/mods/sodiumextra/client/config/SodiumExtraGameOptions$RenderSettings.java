/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04798
 */
package me.flashyreese.mods.sodiumextra.client.config;

import java.util.EnumMap;
import me.flashyreese.mods.sodiumextra.client.config.FogTypeConfig;
import minecraft.class04798;

public class SodiumExtraGameOptions$RenderSettings {
    public boolean globalFog = true;
    public EnumMap<class04798, FogTypeConfig> fogTypeConfig = new EnumMap(class04798.class);
    public boolean lightUpdates = true;
    public boolean itemFrame = true;
    public boolean armorStand = true;
    public boolean painting = true;
    public boolean piston = true;
    public boolean beaconBeam = true;
    public boolean limitBeaconBeamHeight = false;
    public boolean enchantingTableBook = true;
    public boolean itemFrameNameTag = true;
    public boolean playerNameTag = true;

    public SodiumExtraGameOptions$RenderSettings() {
        this.ensureFogTypeDefaults();
    }

    public void ensureFogTypeDefaults() {
        for (class04798 class047982 : class04798.values()) {
            if (class047982 == class04798.field_27888) continue;
            this.fogTypeConfig.putIfAbsent(class047982, new FogTypeConfig());
        }
    }
}

