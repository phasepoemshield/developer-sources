/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaaprilfools.ViaAprilFools
 */
package com.viaversion.viaaprilfools.api.data;

import com.viaversion.viaaprilfools.ViaAprilFools;
import com.viaversion.viabackwards.api.data.BackwardsMappingDataLoader;
import java.io.File;
import java.util.logging.Logger;

public class VAFBackwardsMappingDataLoader
extends BackwardsMappingDataLoader {
    public static final VAFBackwardsMappingDataLoader INSTANCE = new VAFBackwardsMappingDataLoader();

    public VAFBackwardsMappingDataLoader() {
        super(VAFBackwardsMappingDataLoader.class, "assets/viaaprilfools/data/");
    }

    @Override
    public File getDataFolder() {
        return ViaAprilFools.getPlatform().getDataFolder();
    }

    @Override
    public Logger getLogger() {
        return ViaAprilFools.getPlatform().getLogger();
    }
}

