/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockStorage
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.Protocol1_12_2To1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.blockconnections.ConnectionData;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.EntityIdMappings1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.data.ParticleIdMappings1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.rewriter.WorldPacketRewriter1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.storage.BlockStorage;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.util.ComponentUtil;

public class EntityPacketRewriter1_13
extends EntityRewriter<ClientboundPackets1_12_1, Protocol1_12_2To1_13> {
    public EntityPacketRewriter1_13(Protocol1_12_2To1_13 protocol) {
        super((Protocol)protocol);
    }

    public EntityType objectTypeFromId(int type, int data) {
        return EntityTypes1_13.ObjectType.getEntityType((int)type, (int)data);
    }

    public int newEntityId(int id) {
        return EntityIdMappings1_13.getNewId(id);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(typeId -> Types1_13.ENTITY_DATA_TYPES.byId(typeId > 4 ? typeId + 1 : typeId));
        this.filter().dataType(Types1_13.ENTITY_DATA_TYPES.itemType).handler((event, data) -> ((Protocol1_12_2To1_13)this.protocol).getItemRewriter().handleItemToClient(event.user(), (Item)data.value()));
        this.filter().dataType(Types1_13.ENTITY_DATA_TYPES.optionalBlockStateType).handler((event, data) -> {
            int oldId = (Integer)data.value();
            if (oldId != 0) {
                int combined = (oldId & 0xFFF) << 4 | oldId >> 12 & 0xF;
                int newId = WorldPacketRewriter1_13.toNewId(combined);
                data.setValue((Object)newId);
            }
        });
        this.filter().index(0).handler((event, data) -> data.setValue((Object)((byte)((Byte)data.getValue() & 0xFFFFFFEF))));
        this.filter().index(2).handler((event, data) -> {
            if (data.getValue() != null && !((String)data.getValue()).isEmpty()) {
                data.setTypeAndValue(Types1_13.ENTITY_DATA_TYPES.optionalComponentType, (Object)ComponentUtil.legacyToJson((String)((String)data.getValue())));
            } else {
                data.setTypeAndValue(Types1_13.ENTITY_DATA_TYPES.optionalComponentType, null);
            }
        });
        this.filter().type((EntityType)EntityTypes1_13.EntityType.WOLF).index(17).handler((event, data) -> data.setValue((Object)(15 - (Integer)data.getValue())));
        this.filter().type((EntityType)EntityTypes1_13.EntityType.ZOMBIE).addIndex(15);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.ABSTRACT_MINECART).index(9).handler((event, data) -> {
            int oldId = (Integer)data.value();
            int combined = (oldId & 0xFFF) << 4 | oldId >> 12 & 0xF;
            int newId = WorldPacketRewriter1_13.toNewId(combined);
            data.setValue((Object)newId);
        });
        this.filter().type((EntityType)EntityTypes1_13.EntityType.AREA_EFFECT_CLOUD).handler((event, data) -> {
            if (data.id() == 9) {
                int particleId = (Integer)data.value();
                EntityData parameter1Data = event.dataAtIndex(10);
                EntityData parameter2Data = event.dataAtIndex(11);
                int parameter1 = parameter1Data != null ? (Integer)parameter1Data.value() : 0;
                int parameter2 = parameter2Data != null ? (Integer)parameter2Data.value() : 0;
                Particle particle = ParticleIdMappings1_13.rewriteParticle(particleId, new Integer[]{parameter1, parameter2});
                if (particle != null && particle.id() != -1) {
                    event.createExtraData(new EntityData(9, Types1_13.ENTITY_DATA_TYPES.particleType, (Object)particle));
                }
            }
            if (data.id() >= 9) {
                event.cancel();
            }
        });
    }

    protected void registerPackets() {
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                this.handler(wrapper -> {
                    int data;
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    byte type = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    EntityTypes1_13.EntityType entType = EntityTypes1_13.ObjectType.getEntityType((int)type, (int)(data = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue()));
                    if (entType == null) {
                        return;
                    }
                    wrapper.user().getEntityTracker(Protocol1_12_2To1_13.class).addEntity(entityId, (EntityType)entType);
                    if (entType.is((EntityType)EntityTypes1_13.EntityType.FALLING_BLOCK)) {
                        int oldId = (Integer)wrapper.get((Type)Types.INT, 0);
                        int combined = (oldId & 0xFFF) << 4 | oldId >> 12 & 0xF;
                        wrapper.set((Type)Types.INT, 0, (Object)WorldPacketRewriter1_13.toNewId(combined));
                    }
                    if (entType.is((EntityType)EntityTypes1_13.EntityType.ITEM_FRAME)) {
                        switch (data) {
                            case 0: {
                                data = 3;
                                break;
                            }
                            case 1: {
                                data = 4;
                                break;
                            }
                            case 3: {
                                data = 5;
                            }
                        }
                        wrapper.set((Type)Types.INT, 0, (Object)data);
                    }
                });
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map(Types.ENTITY_DATA_LIST1_12, Types1_13.ENTITY_DATA_LIST);
                this.handler(EntityPacketRewriter1_13.this.trackerAndRewriterHandler(Types1_13.ENTITY_DATA_LIST));
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.ENTITY_DATA_LIST1_12, Types1_13.ENTITY_DATA_LIST);
                this.handler(EntityPacketRewriter1_13.this.trackerAndRewriterHandler(Types1_13.ENTITY_DATA_LIST, (EntityType)EntityTypes1_13.EntityType.PLAYER));
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    ClientWorld clientChunks = wrapper.user().getClientWorld(Protocol1_12_2To1_13.class);
                    int dimensionId = (Integer)wrapper.get((Type)Types.INT, 1);
                    clientChunks.setEnvironment(dimensionId);
                });
                this.handler(EntityPacketRewriter1_13.this.playerTrackerHandler());
                this.handler(Protocol1_12_2To1_13.SEND_DECLARE_COMMANDS_AND_TAGS);
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int dimensionId;
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_12_2To1_13.class);
                    if (clientWorld.setEnvironment(dimensionId = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue())) {
                        if (Via.getConfig().isServersideBlockConnections()) {
                            ConnectionData.clearBlockStorage(wrapper.user());
                        }
                        EntityPacketRewriter1_13.this.tracker(wrapper.user()).clearEntities();
                        ((BlockStorage)wrapper.user().get(BlockStorage.class)).clear();
                    }
                });
                this.handler(Protocol1_12_2To1_13.SEND_DECLARE_COMMANDS_AND_TAGS);
            }
        });
        ((Protocol1_12_2To1_13)this.protocol).registerClientbound(ClientboundPackets1_12_1.UPDATE_MOB_EFFECT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.handler(packetWrapper -> {
                    byte flags = (Byte)packetWrapper.read((Type)Types.BYTE);
                    if (Via.getConfig().isNewEffectIndicator()) {
                        flags = (byte)(flags | 4);
                    }
                    packetWrapper.write((Type)Types.BYTE, (Object)flags);
                });
            }
        });
        this.registerRemoveEntities(ClientboundPackets1_12_1.REMOVE_ENTITIES);
        this.registerSetEntityData(ClientboundPackets1_12_1.SET_ENTITY_DATA, Types.ENTITY_DATA_LIST1_12, Types1_13.ENTITY_DATA_LIST);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_13.EntityType.findById((int)type);
    }
}

