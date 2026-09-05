/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.entities.storage.WrappedEntityData
 *  com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_11to1_10.data.SplashPotionMappings1_10
 *  com.viaversion.viabackwards.protocol.v1_11to1_10.storage.ChestedHorseStorage
 *  com.viaversion.viaversion.api.data.entity.StoredEntityData
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entities.ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 */
package com.viaversion.viabackwards.protocol.v1_11to1_10.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.entities.storage.WrappedEntityData;
import com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter;
import com.viaversion.viabackwards.protocol.v1_11to1_10.Protocol1_11To1_10;
import com.viaversion.viabackwards.protocol.v1_11to1_10.data.SplashPotionMappings1_10;
import com.viaversion.viabackwards.protocol.v1_11to1_10.storage.ChestedHorseStorage;
import com.viaversion.viaversion.api.data.entity.StoredEntityData;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11;
import com.viaversion.viaversion.api.minecraft.entities.ObjectType;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_9;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import java.util.List;

public class EntityPacketRewriter1_11
extends LegacyEntityRewriter<ClientboundPackets1_9_3, Protocol1_11To1_10> {
    public EntityPacketRewriter1_11(Protocol1_11To1_10 protocol) {
        super((BackwardsProtocol)protocol);
    }

    public EntityType objectTypeFromId(int typeId, int data) {
        return EntityTypes1_11.ObjectType.getEntityType((int)typeId, (int)data);
    }

    protected void registerRewrites() {
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.ELDER_GUARDIAN, (EntityType)EntityTypes1_11.EntityType.GUARDIAN);
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.WITHER_SKELETON, (EntityType)EntityTypes1_11.EntityType.SKELETON).spawnEntityData(storage -> storage.add(this.getSkeletonTypeData(1)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.STRAY, (EntityType)EntityTypes1_11.EntityType.SKELETON).plainName().spawnEntityData(storage -> storage.add(this.getSkeletonTypeData(2)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.HUSK, (EntityType)EntityTypes1_11.EntityType.ZOMBIE).plainName().spawnEntityData(storage -> this.handleZombieType(storage, 6));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.ZOMBIE_VILLAGER, (EntityType)EntityTypes1_11.EntityType.ZOMBIE).spawnEntityData(storage -> this.handleZombieType(storage, 1));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.HORSE, (EntityType)EntityTypes1_11.EntityType.HORSE).spawnEntityData(storage -> storage.add(this.getHorseDataType(0)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.DONKEY, (EntityType)EntityTypes1_11.EntityType.HORSE).spawnEntityData(storage -> storage.add(this.getHorseDataType(1)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.MULE, (EntityType)EntityTypes1_11.EntityType.HORSE).spawnEntityData(storage -> storage.add(this.getHorseDataType(2)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.SKELETON_HORSE, (EntityType)EntityTypes1_11.EntityType.HORSE).spawnEntityData(storage -> storage.add(this.getHorseDataType(4)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.ZOMBIE_HORSE, (EntityType)EntityTypes1_11.EntityType.HORSE).spawnEntityData(storage -> storage.add(this.getHorseDataType(3)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.EVOKER_FANGS, (EntityType)EntityTypes1_11.EntityType.SHULKER);
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.EVOKER, (EntityType)EntityTypes1_11.EntityType.VILLAGER).plainName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.VEX, (EntityType)EntityTypes1_11.EntityType.BAT).plainName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.VINDICATOR, (EntityType)EntityTypes1_11.EntityType.VILLAGER).plainName().spawnEntityData(storage -> storage.add(new EntityData(13, (EntityDataType)EntityDataTypes1_9.VAR_INT, (Object)4)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.LLAMA, (EntityType)EntityTypes1_11.EntityType.HORSE).plainName().spawnEntityData(storage -> storage.add(this.getHorseDataType(1)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_11.EntityType.LLAMA_SPIT, (EntityType)EntityTypes1_11.EntityType.SNOWBALL);
        this.mapObjectType((ObjectType)EntityTypes1_11.ObjectType.LLAMA_SPIT, (ObjectType)EntityTypes1_11.ObjectType.SNOWBALL, -1);
        this.mapObjectType((ObjectType)EntityTypes1_11.ObjectType.EVOKER_FANGS, (ObjectType)EntityTypes1_11.ObjectType.FALLING_BLOCK, 4294);
        this.filter().type((EntityType)EntityTypes1_11.EntityType.GUARDIAN).index(12).handler((event, data) -> {
            int bitmask;
            boolean b = (Boolean)data.getValue();
            int n = bitmask = b ? 2 : 0;
            if (event.entityType() == EntityTypes1_11.EntityType.ELDER_GUARDIAN) {
                bitmask |= 4;
            }
            data.setTypeAndValue((EntityDataType)EntityDataTypes1_9.BYTE, (Object)((byte)bitmask));
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.ABSTRACT_SKELETON).index(12).toIndex(13);
        this.filter().type((EntityType)EntityTypes1_11.EntityType.ZOMBIE).handler((event, data) -> {
            switch (data.id()) {
                case 13: {
                    event.cancel();
                    break;
                }
                case 14: {
                    event.setIndex(15);
                    break;
                }
                case 15: {
                    event.setIndex(14);
                    break;
                }
                case 16: {
                    event.setIndex(13);
                    data.setValue((Object)(1 + (Integer)data.getValue()));
                }
            }
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.EVOKER).index(12).handler((event, data) -> {
            event.setIndex(13);
            data.setTypeAndValue((EntityDataType)EntityDataTypes1_9.VAR_INT, (Object)((Byte)data.getValue()).intValue());
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.VEX).index(12).handler((event, data) -> data.setValue((Object)0));
        this.filter().type((EntityType)EntityTypes1_11.EntityType.VINDICATOR).index(12).handler((event, data) -> {
            event.setIndex(13);
            data.setTypeAndValue((EntityDataType)EntityDataTypes1_9.VAR_INT, (Object)(((Number)data.getValue()).intValue() == 1 ? 2 : 4));
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.ABSTRACT_HORSE).index(13).handler((event, data) -> {
            StoredEntityData entityData = this.storedEntityData(event);
            byte b = (Byte)data.getValue();
            if (entityData.has(ChestedHorseStorage.class) && ((ChestedHorseStorage)entityData.get(ChestedHorseStorage.class)).isChested()) {
                b = (byte)(b | 8);
                data.setValue((Object)b);
            }
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.CHESTED_HORSE).handler((event, data) -> {
            StoredEntityData entityData = this.storedEntityData(event);
            if (!entityData.has(ChestedHorseStorage.class)) {
                entityData.put((Object)new ChestedHorseStorage());
            }
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.HORSE).index(16).toIndex(17);
        this.filter().type((EntityType)EntityTypes1_11.EntityType.CHESTED_HORSE).index(15).handler((event, data) -> {
            StoredEntityData entityData = this.storedEntityData(event);
            ChestedHorseStorage storage = (ChestedHorseStorage)entityData.get(ChestedHorseStorage.class);
            boolean b = (Boolean)data.getValue();
            storage.setChested(b);
            event.cancel();
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.LLAMA).handler((event, data) -> {
            StoredEntityData entityData = this.storedEntityData(event);
            ChestedHorseStorage storage = (ChestedHorseStorage)entityData.get(ChestedHorseStorage.class);
            int index = event.index();
            switch (index) {
                case 16: {
                    storage.setLiamaStrength(((Integer)data.getValue()).intValue());
                    event.cancel();
                    break;
                }
                case 17: {
                    storage.setLiamaCarpetColor(((Integer)data.getValue()).intValue());
                    event.cancel();
                    break;
                }
                case 18: {
                    storage.setLiamaVariant(((Integer)data.getValue()).intValue());
                    event.cancel();
                }
            }
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.ABSTRACT_HORSE).index(14).toIndex(16);
        this.filter().type((EntityType)EntityTypes1_11.EntityType.VILLAGER).index(13).handler((event, data) -> {
            if ((Integer)data.getValue() == 5) {
                data.setValue((Object)0);
            }
        });
        this.filter().type((EntityType)EntityTypes1_11.EntityType.SHULKER).cancel(15);
    }

    protected void registerPackets() {
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LEVEL_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map(Types.BLOCK_POSITION1_8);
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int type = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (type == 2002 || type == 2007) {
                        int mappedData;
                        if (type == 2007) {
                            wrapper.set((Type)Types.INT, 0, (Object)2002);
                        }
                        if ((mappedData = SplashPotionMappings1_10.getOldData((int)((Integer)wrapper.get((Type)Types.INT, 1)))) != -1) {
                            wrapper.set((Type)Types.INT, 1, (Object)mappedData);
                        }
                    }
                });
            }
        });
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                this.handler(EntityPacketRewriter1_11.this.getObjectTrackerHandler());
                this.handler(EntityPacketRewriter1_11.this.getObjectRewriter(EntityTypes1_11.ObjectType::findById));
                this.handler(((Protocol1_11To1_10)EntityPacketRewriter1_11.this.protocol).getItemRewriter().getFallingBlockHandler());
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_9_3.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_11.EntityType.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_9_3.ADD_GLOBAL_ENTITY, (EntityType)EntityTypes1_11.EntityType.LIGHTNING_BOLT);
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_MOB, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT, (Type)Types.UNSIGNED_BYTE);
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
                this.handler(EntityPacketRewriter1_11.this.getTrackerHandler((Type)Types.UNSIGNED_BYTE, 0));
                this.handler(EntityPacketRewriter1_11.this.getMobSpawnRewriter(Types.ENTITY_DATA_LIST1_9));
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    if (entityDataList.isEmpty()) {
                        entityDataList.add(new EntityData(0, (EntityDataType)EntityDataTypes1_9.BYTE, (Object)0));
                    }
                });
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_9_3.ADD_PAINTING, (EntityType)EntityTypes1_11.EntityType.PAINTING);
        this.registerJoinGame((ClientboundPacketType)ClientboundPackets1_9_3.LOGIN, (EntityType)EntityTypes1_11.EntityType.PLAYER);
        this.registerRespawn((ClientboundPacketType)ClientboundPackets1_9_3.RESPAWN);
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.ENTITY_DATA_LIST1_9);
                this.handler(EntityPacketRewriter1_11.this.getTrackerAndDataHandler(Types.ENTITY_DATA_LIST1_9, (EntityType)EntityTypes1_11.EntityType.PLAYER));
                this.handler(wrapper -> {
                    List entityDataList = (List)wrapper.get(Types.ENTITY_DATA_LIST1_9, 0);
                    if (entityDataList.isEmpty()) {
                        entityDataList.add(new EntityData(0, (EntityDataType)EntityDataTypes1_9.BYTE, (Object)0));
                    }
                });
            }
        });
        this.registerRemoveEntities((ClientboundPacketType)ClientboundPackets1_9_3.REMOVE_ENTITIES);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_9_3.SET_ENTITY_DATA, Types.ENTITY_DATA_LIST1_9);
        ((Protocol1_11To1_10)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ENTITY_EVENT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.INT, 0);
                    if (entityId != EntityPacketRewriter1_11.this.tracker(wrapper.user()).clientEntityId()) {
                        return;
                    }
                    byte entityStatus = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    if (entityStatus == 35) {
                        wrapper.clearPacket();
                        wrapper.setPacketType((PacketType)ClientboundPackets1_9_3.GAME_EVENT);
                        wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)10);
                        wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
                    }
                });
            }
        });
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_11.EntityType.findById((int)typeId);
    }

    private EntityData getHorseDataType(int type) {
        return new EntityData(14, (EntityDataType)EntityDataTypes1_9.VAR_INT, (Object)type);
    }

    private EntityData getZombieTypeData(int type) {
        return new EntityData(13, (EntityDataType)EntityDataTypes1_9.VAR_INT, (Object)type);
    }

    private void handleZombieType(WrappedEntityData storage, int type) {
        EntityData meta = storage.get(13);
        if (meta == null) {
            storage.add(this.getZombieTypeData(type));
        }
    }

    private EntityData getSkeletonTypeData(int type) {
        return new EntityData(12, (EntityDataType)EntityDataTypes1_9.VAR_INT, (Object)type);
    }
}

