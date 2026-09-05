/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaaprilfools.ViaAprilFools
 *  com.viaversion.viaversion.api.data.Mappings
 *  com.viaversion.viaversion.api.protocol.Protocol
 */
package com.viaversion.viaaprilfools.api.data;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaaprilfools.ViaAprilFools;
import com.viaversion.viaaprilfools.api.data.VAFBackwardsMappingDataLoader;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viaversion.api.data.Mappings;
import com.viaversion.viaversion.api.protocol.Protocol;
import java.util.logging.Logger;

public class VAFBackwardsMappingData
extends BackwardsMappingData {
    public VAFBackwardsMappingData(String unmappedVersion, String mappedVersion, Class<? extends Protocol<?, ?, ?, ?>> vvProtocolClass) {
        super(unmappedVersion, mappedVersion, vvProtocolClass);
    }

    @Override
    protected Logger getLogger() {
        return ViaAprilFools.getPlatform().getLogger();
    }

    protected Mappings loadMappings(CompoundTag data, String key) {
        return VAFBackwardsMappingDataLoader.INSTANCE.loadMappings(data, key);
    }

    protected CompoundTag readUnmappedIdentifiersFile(String name) {
        return VAFBackwardsMappingDataLoader.INSTANCE.loadNBT(name, true);
    }

    @Override
    protected CompoundTag readMappingsFile(String name) {
        return VAFBackwardsMappingDataLoader.INSTANCE.loadNBTFromDir(name);
    }
}

