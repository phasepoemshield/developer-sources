/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.types.version.Types1_19
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1
 */
package com.viaversion.viabackwards.protocol.v1_19_1to1_19.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_19_1to1_19.Protocol1_19_1To1_19;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.types.version.Types1_19;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;

public final class EntityPacketRewriter1_19_1
extends EntityRewriter<ClientboundPackets1_19_1, Protocol1_19_1To1_19> {
    public EntityPacketRewriter1_19_1(Protocol1_19_1To1_19 protocol) {
        super((BackwardsProtocol)protocol, Types1_19.ENTITY_DATA_TYPES.optionalComponentType, Types1_19.ENTITY_DATA_TYPES.booleanType);
    }

    public void registerRewrites() {
        this.filter().type((EntityType)EntityTypes1_19.ALLAY).cancel(16);
        this.filter().type((EntityType)EntityTypes1_19.ALLAY).cancel(17);
    }

    protected void registerPackets() {
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_19_1.SET_ENTITY_DATA, Types1_19.ENTITY_DATA_LIST);
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_19.getTypeFromId((int)typeId);
    }
}

