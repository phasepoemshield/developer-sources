/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaaprilfools.ViaAprilFools
 *  com.viaversion.viaversion.api.data.MappingDataLoader
 */
package com.viaversion.viaaprilfools.api.data;

import com.viaversion.viaaprilfools.ViaAprilFools;
import com.viaversion.viaversion.api.data.MappingDataLoader;
import java.io.File;
import java.util.logging.Logger;

public class VAFMappingDataLoader
extends MappingDataLoader {
    public static final VAFMappingDataLoader INSTANCE = new VAFMappingDataLoader();

    public VAFMappingDataLoader() {
        super(VAFMappingDataLoader.class, "assets/viaaprilfools/data/");
    }

    public File getDataFolder() {
        return ViaAprilFools.getPlatform().getDataFolder();
    }

    public Logger getLogger() {
        return ViaAprilFools.getPlatform().getLogger();
    }
}

