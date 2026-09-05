/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.configuration.Config
 */
package net.raphimc.vialegacy.platform;

import com.viaversion.viaversion.api.configuration.Config;

public interface ViaLegacyConfig
extends Config {
    public boolean enableB1_7_3Sprinting();

    public boolean isLegacySkinLoading();

    public boolean isLegacySkullLoading();

    public int getClassicChunkRange();

    public boolean isOldBiomes();

    public boolean enableClassicFly();

    public boolean isDynamicOnground();

    public boolean isSoundEmulation();

    public String getB1_7_3Motd();

    public boolean isIgnoreLong1_8ChannelNames();
}

