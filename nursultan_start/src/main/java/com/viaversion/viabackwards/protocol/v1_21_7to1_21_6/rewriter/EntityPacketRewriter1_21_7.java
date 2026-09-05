/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6
 */
package com.viaversion.viabackwards.protocol.v1_21_7to1_21_6.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_21_7to1_21_6.Protocol1_21_7To1_21_6;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;

public final class EntityPacketRewriter1_21_7
extends EntityRewriter<ClientboundPacket1_21_6, Protocol1_21_7To1_21_6> {
    public EntityPacketRewriter1_21_7(Protocol1_21_7To1_21_6 protocol) {
        super((BackwardsProtocol)protocol, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_6.entityDataTypes).optionalComponentType, ((EntityDataTypes1_21_5)VersionedTypes.V1_21_6.entityDataTypes).booleanType);
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_5 mappedEntityDataTypes = (EntityDataTypes1_21_5)VersionedTypes.V1_21_6.entityDataTypes;
        this.registerEntityDataTypeHandler1_20_3(mappedEntityDataTypes.itemType, mappedEntityDataTypes.blockStateType, mappedEntityDataTypes.optionalBlockStateType, mappedEntityDataTypes.particleType, mappedEntityDataTypes.particlesType, mappedEntityDataTypes.componentType, mappedEntityDataTypes.optionalComponentType);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_6.getTypeFromId((int)type);
    }
}

