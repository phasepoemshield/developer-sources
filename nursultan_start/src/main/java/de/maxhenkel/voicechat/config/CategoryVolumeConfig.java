/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.config;

import de.maxhenkel.voicechat.config.VolumeConfigBase;
import java.nio.file.Path;

public class CategoryVolumeConfig
extends VolumeConfigBase<String> {
    public static final String OTHER_CATEGORY = "other";

    public CategoryVolumeConfig(Path path) {
        super(path);
    }

    @Override
    protected String getConfigName() {
        return "category";
    }

    @Override
    protected String serializeKey(String string) {
        return string;
    }

    @Override
    protected String mapKey(String string) {
        return string;
    }
}

