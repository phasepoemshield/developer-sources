/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_10$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_10$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 */
package com.viaversion.viabackwards.protocol.v1_10to1_9_3.rewriter;

import com.viaversion.viabackwards.api.entities.storage.EntityReplacement;
import com.viaversion.viabackwards.api.entities.storage.WrappedEntityData;
import com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter;
import com.viaversion.viabackwards.protocol.v1_10to1_9_3.Protocol1_10To1_9_3;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_10;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import java.util.List;

public class EntityPacketRewriter1_10
extends LegacyEntityRewriter<ClientboundPackets1_9_3, Protocol1_10To1_9_3> {
    public EntityPacketRewriter1_10(Protocol1_10To1_9_3 protocol) {
        super(protocol);
    }

    public EntityType objectTypeFromId(int typeId, int data) {
        return EntityTypes1_10.ObjectType.getEntityType((int)typeId, (int)data);
    }

    protected void registerRewrites() {
        this.mapEntityTypeWithData((EntityType)EntityTypes1_10.EntityType.POLAR_BEAR, (EntityType)EntityTypes1_10.EntityType.SHEEP).plainName();
        this.filter().type((EntityType)EntityTypes1_10.EntityType.POLAR_BEAR).index(13).handler((event, data) -> {
            boolean b = (Boolean)data.getValue();
            data.setTypeAndValue((EntityDataType)EntityDataTypes1_9.BYTE, (Object)(b ? (byte)14 : (byte)0));
        });
        this.filter().type((EntityType)EntityTypes1_10.EntityType.ZOMBIE).index(13).handler((event, data) -> {
            if ((Integer)data.getValue() == 6) {
                data.setValue((Object)0);
            }
        });
        this.filter().type((EntityType)EntityTypes1_10.EntityType.SKELETON).index(12).handler((event, data) -> {
            if ((Integer)data.getValue() == 2) {
                data.setValue((Object)0);
            }
        });
        this.filter().type((EntityType)EntityTypes1_10.EntityType.POTION).addIndex(6);
        this.filter().removeIndex(5);
    }

    protected void registerPackets() {
        ((Protocol1_10To1_9_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.handler(EntityPacketRewriter1_10.this.getObjectTrackerHandler());
                this.handler(EntityPacketRewriter1_10.this.getObjectRewriter(EntityTypes1_11.ObjectType::findById));
                this.handler(((Protocol1_10To1_9_3)EntityPacketRewriter1_10.this.protocol).getItemRewriter().getFallingBlockHandler());
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_9_3.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_10.EntityType.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_9_3.ADD_GLOBAL_ENTITY, (EntityType)EntityTypes1_10.EntityType.LIGHTNING_BOLT);
        ((Protocol1_10To1_9_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map(Types.ENTITY_DATA_LIST1_9);
                this.handler(EntityPacketRewriter1_10.this.getTrackerHandler((Type<Number>)((Type)Types.UNSIGNED_BYTE), 0));
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    EntityType type = EntityPacketRewriter1_10.this.tracker(wrapper.user()).entityType(entityId);
                    if (type == null) {
                        return;
                    }
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    EntityPacketRewriter1_10.this.handleEntityData((Integer)wrapper.get((Type)Types.VAR_INT, 0), entityDataList, wrapper.user());
                    EntityReplacement entityReplacement = EntityPacketRewriter1_10.this.entityDataForType(type);
                    if (entityReplacement != null) {
                        WrappedEntityData storage = new WrappedEntityData(entityDataList);
                        wrapper.set((Type)Types.UNSIGNED_BYTE, 0, (Object)((short)entityReplacement.replacementId()));
                        if (entityReplacement.hasBaseData()) {
                            entityReplacement.defaultData().createData(storage);
                        }
                    }
                });
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_9_3.ADD_PAINTING, (EntityType)EntityTypes1_10.EntityType.PAINTING);
        this.registerJoinGame(ClientboundPackets1_9_3.LOGIN, (EntityType)EntityTypes1_10.EntityType.PLAYER);
        this.registerRespawn(ClientboundPackets1_9_3.RESPAWN);
        ((Protocol1_10To1_9_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.ENTITY_DATA_LIST1_9);
                this.handler(EntityPacketRewriter1_10.this.getTrackerAndDataHandler((Type<List<EntityData>>)Types.ENTITY_DATA_LIST1_9, (EntityType)EntityTypes1_11.EntityType.PLAYER));
            }
        });
        this.registerRemoveEntities((ClientboundPacketType)ClientboundPackets1_9_3.REMOVE_ENTITIES);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_9_3.SET_ENTITY_DATA, Types.ENTITY_DATA_LIST1_9);
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_10.EntityType.findById((int)typeId);
    }
}

