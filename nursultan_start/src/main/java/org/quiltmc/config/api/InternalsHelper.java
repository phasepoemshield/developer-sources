/*
 * Decompiled with CFR 0.152.
 */
package org.quiltmc.config.api;

import org.quiltmc.config.api.Config;
import org.quiltmc.config.api.ReflectiveConfig;

public final class InternalsHelper {
    private InternalsHelper() {
    }

    public static void setWrappedConfig(ReflectiveConfig reflectiveConfig, Config config) {
        reflectiveConfig.setWrappedConfig(config);
    }
}

