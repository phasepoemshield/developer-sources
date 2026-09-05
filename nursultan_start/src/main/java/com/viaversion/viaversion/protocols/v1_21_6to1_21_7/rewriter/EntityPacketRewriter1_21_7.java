/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_6to1_21_7.rewriter;

import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_6;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_5;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_6to1_21_7.Protocol1_21_6To1_21_7;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public final class EntityPacketRewriter1_21_7
extends EntityRewriter<ClientboundPacket1_21_6, Protocol1_21_6To1_21_7> {
    public EntityPacketRewriter1_21_7(Protocol1_21_6To1_21_7 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        EntityDataTypes1_21_5 entityDataTypes = (EntityDataTypes1_21_5)((Protocol1_21_6To1_21_7)this.protocol).mappedTypes().entityDataTypes();
        this.registerEntityDataTypeHandler(entityDataTypes.itemType, entityDataTypes.blockStateType, entityDataTypes.optionalBlockStateType, entityDataTypes.particleType, entityDataTypes.particlesType, entityDataTypes.componentType, entityDataTypes.optionalComponentType);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_6.getTypeFromId((int)type);
    }
}

