/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_20_2to1_20.storage.ConfigurationPacketStorage
 *  com.viaversion.viaversion.api.minecraft.GlobalBlockPosition
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_19_4
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_2
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2
 */
package com.viaversion.viabackwards.protocol.v1_20_2to1_20.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_20_2to1_20.Protocol1_20_2To1_20;
import com.viaversion.viabackwards.protocol.v1_20_2to1_20.storage.ConfigurationPacketStorage;
import com.viaversion.viaversion.api.minecraft.GlobalBlockPosition;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_19_4;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20;
import com.viaversion.viaversion.api.type.types.version.Types1_20_2;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;

public final class EntityPacketRewriter1_20_2
extends EntityRewriter<ClientboundPackets1_20_2, Protocol1_20_2To1_20> {
    public EntityPacketRewriter1_20_2(Protocol1_20_2To1_20 protocol) {
        super((BackwardsProtocol)protocol, Types1_20.ENTITY_DATA_TYPES.optionalComponentType, Types1_20.ENTITY_DATA_TYPES.booleanType);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_19_4)Types1_20.ENTITY_DATA_TYPES).byId(arg_0));
        this.registerEntityDataTypeHandler(Types1_20.ENTITY_DATA_TYPES.itemType, Types1_20.ENTITY_DATA_TYPES.blockStateType, Types1_20.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_20.ENTITY_DATA_TYPES.particleType, null, null);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19_4.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_19_4.DISPLAY).removeIndex(10);
    }

    public void registerPackets() {
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_20_2.SET_ENTITY_DATA, Types1_20_2.ENTITY_DATA_LIST, Types1_20.ENTITY_DATA_LIST);
        ((Protocol1_20_2To1_20)this.protocol).replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_2.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough(Types.UUID);
                    int entityType = (Integer)wrapper.read((Type)Types.VAR_INT);
                    EntityPacketRewriter1_20_2.this.tracker(wrapper.user()).addEntity(entityId, EntityPacketRewriter1_20_2.this.typeFromId(entityType));
                    if (entityType != EntityTypes1_19_4.PLAYER.getId()) {
                        wrapper.write((Type)Types.VAR_INT, (Object)entityType);
                        if (entityType == EntityTypes1_19_4.FALLING_BLOCK.getId()) {
                            wrapper.passthrough((Type)Types.DOUBLE);
                            wrapper.passthrough((Type)Types.DOUBLE);
                            wrapper.passthrough((Type)Types.DOUBLE);
                            wrapper.passthrough((Type)Types.BYTE);
                            wrapper.passthrough((Type)Types.BYTE);
                            wrapper.passthrough((Type)Types.BYTE);
                            int blockState = (Integer)wrapper.read((Type)Types.VAR_INT);
                            wrapper.write((Type)Types.VAR_INT, (Object)((Protocol1_20_2To1_20)EntityPacketRewriter1_20_2.this.protocol).getMappingData().getNewBlockStateId(blockState));
                        }
                        return;
                    }
                    wrapper.setPacketType((PacketType)ClientboundPackets1_19_4.ADD_PLAYER);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    wrapper.passthrough((Type)Types.DOUBLE);
                    byte pitch = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.write((Type)Types.BYTE, (Object)pitch);
                    wrapper.read((Type)Types.BYTE);
                    wrapper.read((Type)Types.VAR_INT);
                    short velocityX = (Short)wrapper.read((Type)Types.SHORT);
                    short velocityY = (Short)wrapper.read((Type)Types.SHORT);
                    short velocityZ = (Short)wrapper.read((Type)Types.SHORT);
                    if (velocityX == 0 && velocityY == 0 && velocityZ == 0) {
                        return;
                    }
                    wrapper.send(Protocol1_20_2To1_20.class);
                    wrapper.cancel();
                    PacketWrapper velocityPacket = wrapper.create((PacketType)ClientboundPackets1_19_4.SET_ENTITY_MOTION);
                    velocityPacket.write((Type)Types.VAR_INT, (Object)entityId);
                    velocityPacket.write((Type)Types.SHORT, (Object)velocityX);
                    velocityPacket.write((Type)Types.SHORT, (Object)velocityY);
                    velocityPacket.write((Type)Types.SHORT, (Object)velocityZ);
                    velocityPacket.send(Protocol1_20_2To1_20.class);
                });
            }
        });
        ((Protocol1_20_2To1_20)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    ConfigurationPacketStorage configurationPacketStorage = (ConfigurationPacketStorage)wrapper.user().get(ConfigurationPacketStorage.class);
                    wrapper.passthrough((Type)Types.INT);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    String[] worlds = (String[])wrapper.read(Types.STRING_ARRAY);
                    int maxPlayers = (Integer)wrapper.read((Type)Types.VAR_INT);
                    int viewDistance = (Integer)wrapper.read((Type)Types.VAR_INT);
                    int simulationDistance = (Integer)wrapper.read((Type)Types.VAR_INT);
                    boolean reducedDebugInfo = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    boolean showRespawnScreen = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    wrapper.read((Type)Types.BOOLEAN);
                    String dimensionType = (String)wrapper.read(Types.STRING);
                    String world = (String)wrapper.read(Types.STRING);
                    long seed = (Long)wrapper.read((Type)Types.LONG);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.write(Types.STRING_ARRAY, (Object)worlds);
                    wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)configurationPacketStorage.registry());
                    wrapper.write(Types.STRING, (Object)dimensionType);
                    wrapper.write(Types.STRING, (Object)world);
                    wrapper.write((Type)Types.LONG, (Object)seed);
                    wrapper.write((Type)Types.VAR_INT, (Object)maxPlayers);
                    wrapper.write((Type)Types.VAR_INT, (Object)viewDistance);
                    wrapper.write((Type)Types.VAR_INT, (Object)simulationDistance);
                    wrapper.write((Type)Types.BOOLEAN, (Object)reducedDebugInfo);
                    wrapper.write((Type)Types.BOOLEAN, (Object)showRespawnScreen);
                    EntityPacketRewriter1_20_2.this.worldDataTrackerHandlerByKey().handle(wrapper);
                    wrapper.send(Protocol1_20_2To1_20.class);
                    wrapper.cancel();
                    if (configurationPacketStorage.enabledFeatures() != null) {
                        PacketWrapper featuresPacket = wrapper.create((PacketType)ClientboundPackets1_19_4.UPDATE_ENABLED_FEATURES);
                        featuresPacket.write(Types.STRING_ARRAY, (Object)configurationPacketStorage.enabledFeatures());
                        featuresPacket.send(Protocol1_20_2To1_20.class);
                    }
                    configurationPacketStorage.sendQueuedPackets(wrapper.user());
                });
            }
        });
        ((Protocol1_20_2To1_20)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough((Type)Types.LONG);
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((Byte)wrapper.read((Type)Types.BYTE)).shortValue());
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    GlobalBlockPosition lastDeathPosition = (GlobalBlockPosition)wrapper.read(Types.OPTIONAL_GLOBAL_POSITION);
                    int portalCooldown = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.write(Types.OPTIONAL_GLOBAL_POSITION, (Object)lastDeathPosition);
                    wrapper.write((Type)Types.VAR_INT, (Object)portalCooldown);
                });
                this.handler(EntityPacketRewriter1_20_2.this.worldDataTrackerHandlerByKey());
            }
        });
        ((Protocol1_20_2To1_20)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.UPDATE_MOB_EFFECT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT) + 1));
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BYTE);
            CompoundTag factorData = (CompoundTag)wrapper.read(Types.OPTIONAL_COMPOUND_TAG);
            wrapper.write(Types.OPTIONAL_NAMED_COMPOUND_TAG, (Object)factorData);
        });
        ((Protocol1_20_2To1_20)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.REMOVE_MOB_EFFECT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT) + 1));
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_19_4.getTypeFromId((int)type);
    }
}

