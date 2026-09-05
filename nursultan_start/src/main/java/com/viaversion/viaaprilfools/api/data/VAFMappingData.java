/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaaprilfools.ViaAprilFools
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.Mappings
 */
package com.viaversion.viaaprilfools.api.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaaprilfools.ViaAprilFools;
import com.viaversion.viaaprilfools.api.data.VAFMappingDataLoader;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.Mappings;
import java.util.logging.Logger;

public class VAFMappingData
extends MappingDataBase {
    public VAFMappingData(String unmappedVersion, String mappedVersion) {
        super(unmappedVersion, mappedVersion);
    }

    protected Logger getLogger() {
        return ViaAprilFools.getPlatform().getLogger();
    }

    protected Mappings loadMappings(CompoundTag data, String key) {
        return VAFMappingDataLoader.INSTANCE.loadMappings(data, key);
    }

    protected CompoundTag readMappedIdentifiersFile(String name) {
        return VAFMappingDataLoader.INSTANCE.loadNBT(name, true);
    }

    protected CompoundTag readMappingsFile(String name) {
        return VAFMappingDataLoader.INSTANCE.loadNBT(name, true);
    }
}

