/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaaprilfools.platform.ViaAprilFoolsConfig
 *  com.viaversion.viaaprilfools.platform.ViaAprilFoolsPlatform
 */
package com.viaversion.viaaprilfools;

import com.viaversion.viaaprilfools.platform.ViaAprilFoolsConfig;
import com.viaversion.viaaprilfools.platform.ViaAprilFoolsPlatform;

public class ViaAprilFools {
    public static final String VERSION = "${version}";
    public static final String IMPL_VERSION = "${impl_version}";
    private static ViaAprilFoolsPlatform platform;
    private static ViaAprilFoolsConfig config;

    private ViaAprilFools() {
    }

    public static void init(ViaAprilFoolsPlatform platform, ViaAprilFoolsConfig config) {
        if (ViaAprilFools.platform != null) {
            throw new IllegalStateException("ViaAprilFools is already initialized");
        }
        ViaAprilFools.platform = platform;
        ViaAprilFools.config = config;
    }

    public static ViaAprilFoolsPlatform getPlatform() {
        return platform;
    }

    public static ViaAprilFoolsConfig getConfig() {
        return config;
    }
}

