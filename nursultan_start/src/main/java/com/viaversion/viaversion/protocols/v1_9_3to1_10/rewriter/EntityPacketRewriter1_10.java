/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 */
package com.viaversion.viaversion.protocols.v1_9_3to1_10.rewriter;

import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_9;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_3to1_10.Protocol1_9_3To1_10;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import java.util.List;

public class EntityPacketRewriter1_10
extends EntityRewriter<ClientboundPackets1_9_3, Protocol1_9_3To1_10> {
    public EntityPacketRewriter1_10(Protocol1_9_3To1_10 protocol) {
        super(protocol);
    }

    public EntityTypes1_9.EntityType objectTypeFromId(int type, int data) {
        return EntityTypes1_9.ObjectType.getEntityType((int)type, (int)data);
    }

    protected void registerRewrites() {
        this.filter().type((EntityType)EntityTypes1_9.EntityType.POTION).removeIndex(5);
        this.filter().addIndex(5);
    }

    protected void registerPackets() {
        ((Protocol1_9_3To1_10)this.protocol).registerClientbound(ClientboundPackets1_9_3.ADD_ENTITY, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.INT);
            this.objectTrackerHandler().handle(wrapper);
        });
        ((Protocol1_9_3To1_10)this.protocol).registerClientbound(ClientboundPackets1_9_3.ADD_MOB, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            short entityType = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.passthrough((Type)Types.SHORT);
            wrapper.passthrough((Type)Types.SHORT);
            List entityDataList = (List)wrapper.passthrough(Types.ENTITY_DATA_LIST1_9);
            this.trackAndRewrite(wrapper, entityType, entityId);
            this.handleEntityData(entityId, entityDataList, wrapper.user());
        });
        ((Protocol1_9_3To1_10)this.protocol).registerClientbound(ClientboundPackets1_9_3.ADD_PLAYER, wrapper -> {
            int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            List entityDataList = (List)wrapper.passthrough(Types.ENTITY_DATA_LIST1_9);
            this.tracker(wrapper.user()).addEntity(entityId, (EntityType)EntityTypes1_9.EntityType.PLAYER);
            this.handleEntityData(entityId, entityDataList, wrapper.user());
        });
        this.registerSetEntityData(ClientboundPackets1_9_3.SET_ENTITY_DATA, (Type<List<EntityData>>)Types.ENTITY_DATA_LIST1_9);
        this.registerRemoveEntities(ClientboundPackets1_9_3.REMOVE_ENTITIES);
    }

    public EntityTypes1_9.EntityType typeFromId(int type) {
        return EntityTypes1_9.EntityType.findById((int)type);
    }
}

