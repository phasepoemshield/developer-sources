/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.entities.storage.EntityPositionHandler
 *  com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.ParticleIdMappings1_12_2
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.ParticleIdMappings1_12_2$ParticleData
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.BackwardsBlockStorage
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.NoteBlockStorage
 *  com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.PlayerPositionStorage1_13
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13$ObjectType
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_12
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_13
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1
 *  com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ServerboundPackets1_12_1
 */
package com.viaversion.viabackwards.protocol.v1_13to1_12_2.rewriter;

import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.entities.storage.EntityPositionHandler;
import com.viaversion.viabackwards.api.rewriters.LegacyEntityRewriter;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.Protocol1_13To1_12_2;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.EntityIdMappings1_12_2;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.PaintingNames1_13;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.data.ParticleIdMappings1_12_2;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.BackwardsBlockStorage;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.NoteBlockStorage;
import com.viaversion.viabackwards.protocol.v1_13to1_12_2.storage.PlayerPositionStorage1_13;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_13;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_12;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_13;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ClientboundPackets1_12_1;
import com.viaversion.viaversion.protocols.v1_12to1_12_1.packet.ServerboundPackets1_12_1;

public class EntityPacketRewriter1_13
extends LegacyEntityRewriter<ClientboundPackets1_13, Protocol1_13To1_12_2> {
    public EntityPacketRewriter1_13(Protocol1_13To1_12_2 protocol) {
        super((BackwardsProtocol)protocol);
    }

    private static double toSet(int field, int bitIndex, double origin, double packetValue) {
        return (field & 1 << bitIndex) != 0 ? origin + packetValue : packetValue;
    }

    public EntityType objectTypeFromId(int typeId, int data) {
        return EntityTypes1_13.ObjectType.getEntityType((int)typeId, (int)data);
    }

    public int newEntityId(int newId) {
        return EntityIdMappings1_12_2.getOldId(newId);
    }

    protected void registerRewrites() {
        this.mapEntityTypeWithData((EntityType)EntityTypes1_13.EntityType.DROWNED, (EntityType)EntityTypes1_13.EntityType.ZOMBIE_VILLAGER).plainName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_13.EntityType.COD, (EntityType)EntityTypes1_13.EntityType.SQUID).plainName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_13.EntityType.SALMON, (EntityType)EntityTypes1_13.EntityType.SQUID).plainName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_13.EntityType.PUFFERFISH, (EntityType)EntityTypes1_13.EntityType.SQUID).plainName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_13.EntityType.TROPICAL_FISH, (EntityType)EntityTypes1_13.EntityType.SQUID).plainName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_13.EntityType.PHANTOM, (EntityType)EntityTypes1_13.EntityType.PARROT).plainName().spawnEntityData(storage -> storage.add(new EntityData(15, (EntityDataType)EntityDataTypes1_12.VAR_INT, (Object)3)));
        this.mapEntityTypeWithData((EntityType)EntityTypes1_13.EntityType.DOLPHIN, (EntityType)EntityTypes1_13.EntityType.SQUID).plainName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_13.EntityType.TURTLE, (EntityType)EntityTypes1_13.EntityType.OCELOT).plainName();
        this.filter().handler((event, data) -> {
            int typeId = data.dataType().typeId();
            if (typeId == 4) {
                JsonElement element = (JsonElement)data.value();
                ((Protocol1_13To1_12_2)this.protocol).translatableRewriter().processText(event.user(), element);
                data.setDataType((EntityDataType)EntityDataTypes1_12.COMPONENT);
            } else if (typeId == 5) {
                JsonElement element = (JsonElement)data.value();
                data.setTypeAndValue((EntityDataType)EntityDataTypes1_12.STRING, (Object)((Protocol1_13To1_12_2)this.protocol).jsonToLegacy(event.user(), element));
            } else if (typeId == 6) {
                Item item = (Item)data.getValue();
                data.setTypeAndValue((EntityDataType)EntityDataTypes1_12.ITEM, (Object)((Protocol1_13To1_12_2)this.protocol).getItemRewriter().handleItemToClient(event.user(), item));
            } else if (typeId == 15) {
                event.cancel();
            } else {
                data.setDataType((EntityDataType)EntityDataTypes1_12.byId((int)(typeId > 5 ? typeId - 1 : typeId)));
            }
        });
        this.filter().type((EntityType)EntityTypes1_13.EntityType.ZOMBIE).removeIndex(15);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.TURTLE).cancel(13);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.TURTLE).cancel(14);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.TURTLE).cancel(15);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.TURTLE).cancel(16);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.TURTLE).cancel(17);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.TURTLE).cancel(18);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.ABSTRACT_FISH).cancel(12);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.ABSTRACT_FISH).cancel(13);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.PHANTOM).cancel(12);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.BOAT).cancel(12);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.TRIDENT).cancel(7);
        this.filter().type((EntityType)EntityTypes1_13.EntityType.WOLF).index(17).handler((event, data) -> data.setValue((Object)(15 - (Integer)data.getValue())));
        this.filter().type((EntityType)EntityTypes1_13.EntityType.AREA_EFFECT_CLOUD).index(9).handler((event, data) -> {
            Particle particle = (Particle)data.getValue();
            ParticleIdMappings1_12_2.ParticleData particleData = ParticleIdMappings1_12_2.getMapping((int)particle.id());
            int firstArg = 0;
            int secondArg = 0;
            int[] particleArgs = particleData.rewriteMeta((Protocol1_13To1_12_2)this.protocol, particle.getArguments());
            if (particleArgs != null && particleArgs.length != 0) {
                if (particleData.getHandler().isBlockHandler() && particleArgs[0] == 0) {
                    particleArgs[0] = 102;
                }
                firstArg = particleArgs[0];
                secondArg = particleArgs.length == 2 ? particleArgs[1] : 0;
            }
            event.createExtraData(new EntityData(9, (EntityDataType)EntityDataTypes1_12.VAR_INT, (Object)particleData.getHistoryId()));
            event.createExtraData(new EntityData(10, (EntityDataType)EntityDataTypes1_12.VAR_INT, (Object)firstArg));
            event.createExtraData(new EntityData(11, (EntityDataType)EntityDataTypes1_12.VAR_INT, (Object)secondArg));
            event.cancel();
        });
    }

    protected void registerPackets() {
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.PLAYER_POSITION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    if (!ViaBackwards.getConfig().isFix1_13FacePlayer()) {
                        return;
                    }
                    PlayerPositionStorage1_13 playerStorage = (PlayerPositionStorage1_13)wrapper.user().get(PlayerPositionStorage1_13.class);
                    byte bitField = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    playerStorage.setX(EntityPacketRewriter1_13.toSet(bitField, 0, playerStorage.x(), (Double)wrapper.get((Type)Types.DOUBLE, 0)));
                    playerStorage.setY(EntityPacketRewriter1_13.toSet(bitField, 1, playerStorage.y(), (Double)wrapper.get((Type)Types.DOUBLE, 1)));
                    playerStorage.setZ(EntityPacketRewriter1_13.toSet(bitField, 2, playerStorage.z(), (Double)wrapper.get((Type)Types.DOUBLE, 2)));
                });
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

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
                this.handler(EntityPacketRewriter1_13.this.getObjectTrackerHandler());
                this.handler(wrapper -> {
                    int data;
                    byte id = (Byte)wrapper.get((Type)Types.BYTE, 0);
                    EntityTypes1_13.ObjectType type = EntityTypes1_13.ObjectType.findById((int)id, (int)(data = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue()));
                    if (type == EntityTypes1_13.ObjectType.FALLING_BLOCK) {
                        int combined = Protocol1_13To1_12_2.MAPPINGS.getNewBlockStateId(data);
                        combined = combined >> 4 & 0xFFF | (combined & 0xF) << 12;
                        wrapper.set((Type)Types.INT, 0, (Object)combined);
                    } else if (type == EntityTypes1_13.ObjectType.ITEM_FRAME) {
                        data = switch (data) {
                            case 3 -> 0;
                            case 4 -> 1;
                            case 5 -> 3;
                            default -> data;
                        };
                        wrapper.set((Type)Types.INT, 0, (Object)data);
                    } else if (type == EntityTypes1_13.ObjectType.TRIDENT) {
                        wrapper.set((Type)Types.BYTE, 0, (Object)((byte)EntityTypes1_13.ObjectType.TIPPED_ARROW.getId()));
                    }
                });
            }
        });
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_13.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_13.EntityType.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_13.ADD_GLOBAL_ENTITY, (EntityType)EntityTypes1_13.EntityType.LIGHTNING_BOLT);
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.map(Types1_13.ENTITY_DATA_LIST, Types.ENTITY_DATA_LIST1_12);
                this.handler(wrapper -> {
                    int type = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
                    EntityTypes1_13.EntityType entityType = EntityTypes1_13.EntityType.findById((int)type);
                    if (entityType == null) {
                        return;
                    }
                    EntityPacketRewriter1_13.this.tracker(wrapper.user()).addEntity(((Integer)wrapper.get((Type)Types.VAR_INT, 0)).intValue(), (EntityType)entityType);
                    int oldId = EntityIdMappings1_12_2.getOldId(type);
                    if (oldId == -1) {
                        if (!EntityPacketRewriter1_13.this.hasData((EntityType)entityType)) {
                            ((Protocol1_13To1_12_2)EntityPacketRewriter1_13.this.protocol).getLogger().warning("Could not find entity type mapping " + type + "/" + String.valueOf(entityType));
                        }
                    } else {
                        wrapper.set((Type)Types.VAR_INT, 1, (Object)oldId);
                    }
                });
                this.handler(EntityPacketRewriter1_13.this.getMobSpawnRewriter1_11(Types.ENTITY_DATA_LIST1_12));
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types1_13.ENTITY_DATA_LIST, Types.ENTITY_DATA_LIST1_12);
                this.handler(EntityPacketRewriter1_13.this.getTrackerAndDataHandler(Types.ENTITY_DATA_LIST1_12, (EntityType)EntityTypes1_13.EntityType.PLAYER));
            }
        });
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.ADD_PAINTING, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.handler(EntityPacketRewriter1_13.this.getTrackerHandler((EntityType)EntityTypes1_13.EntityType.PAINTING));
                this.handler(wrapper -> {
                    int motive = (Integer)wrapper.read((Type)Types.VAR_INT);
                    String title = PaintingNames1_13.getStringId(motive);
                    wrapper.write(Types.STRING, (Object)title);
                });
            }
        });
        this.registerJoinGame((ClientboundPacketType)ClientboundPackets1_13.LOGIN, (EntityType)EntityTypes1_13.EntityType.PLAYER);
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int dimensionId;
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_13To1_12_2.class);
                    if (clientWorld.setEnvironment(dimensionId = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue())) {
                        EntityPacketRewriter1_13.this.tracker(wrapper.user()).clearEntities();
                        ((BackwardsBlockStorage)wrapper.user().get(BackwardsBlockStorage.class)).clear();
                        ((NoteBlockStorage)wrapper.user().get(NoteBlockStorage.class)).clear();
                    }
                });
            }
        });
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_13.SET_ENTITY_DATA, Types1_13.ENTITY_DATA_LIST, Types.ENTITY_DATA_LIST1_12);
        ((Protocol1_13To1_12_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_13.PLAYER_LOOK_AT, null, wrapper -> {
            wrapper.cancel();
            if (!ViaBackwards.getConfig().isFix1_13FacePlayer()) {
                return;
            }
            int anchor = (Integer)wrapper.read((Type)Types.VAR_INT);
            double x = (Double)wrapper.read((Type)Types.DOUBLE);
            double y = (Double)wrapper.read((Type)Types.DOUBLE);
            double z = (Double)wrapper.read((Type)Types.DOUBLE);
            PlayerPositionStorage1_13 positionStorage = (PlayerPositionStorage1_13)wrapper.user().get(PlayerPositionStorage1_13.class);
            PacketWrapper positionAndLook = wrapper.create((PacketType)ClientboundPackets1_12_1.PLAYER_POSITION);
            positionAndLook.write((Type)Types.DOUBLE, (Object)0.0);
            positionAndLook.write((Type)Types.DOUBLE, (Object)0.0);
            positionAndLook.write((Type)Types.DOUBLE, (Object)0.0);
            EntityPositionHandler.writeFacingDegrees((PacketWrapper)positionAndLook, (double)positionStorage.x(), (double)(anchor == 1 ? positionStorage.y() + 1.62 : positionStorage.y()), (double)positionStorage.z(), (double)x, (double)y, (double)z);
            positionAndLook.write((Type)Types.BYTE, (Object)7);
            positionAndLook.write((Type)Types.VAR_INT, (Object)-1);
            positionAndLook.send(Protocol1_13To1_12_2.class);
        });
        PacketHandler movementRemapper = wrapper -> {
            if (!ViaBackwards.getConfig().isFix1_13FacePlayer()) {
                return;
            }
            double x = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double y = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            double z = (Double)wrapper.passthrough((Type)Types.DOUBLE);
            ((PlayerPositionStorage1_13)wrapper.user().get(PlayerPositionStorage1_13.class)).setPosition(x, y, z);
        };
        ((Protocol1_13To1_12_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_12_1.MOVE_PLAYER_POS, movementRemapper);
        ((Protocol1_13To1_12_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_12_1.MOVE_PLAYER_POS_ROT, movementRemapper);
        ((Protocol1_13To1_12_2)this.protocol).registerServerbound((ServerboundPacketType)ServerboundPackets1_12_1.MOVE_VEHICLE, movementRemapper);
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_13.EntityType.findById((int)typeId);
    }
}

