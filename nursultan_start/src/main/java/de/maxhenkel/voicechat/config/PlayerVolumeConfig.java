/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.config;

import de.maxhenkel.voicechat.config.VolumeConfigBase;
import java.nio.file.Path;
import java.util.UUID;

public class PlayerVolumeConfig
extends VolumeConfigBase<UUID> {
    public PlayerVolumeConfig(Path path) {
        super(path);
    }

    @Override
    protected String getConfigName() {
        return "player";
    }

    @Override
    protected String serializeKey(UUID uUID) {
        return uUID.toString();
    }

    @Override
    protected UUID mapKey(String string) {
        return UUID.fromString(string);
    }
}

