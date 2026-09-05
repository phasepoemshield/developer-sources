/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_2
 *  com.viaversion.viaversion.api.protocol.Protocol
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
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.storage.ConfigurationState
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.storage.ConfigurationState$BridgePhase
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_20to1_20_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_20_2;
import com.viaversion.viaversion.api.protocol.Protocol;
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
import com.viaversion.viaversion.protocols.v1_20to1_20_2.Protocol1_20To1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.storage.ConfigurationState;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public final class EntityPacketRewriter1_20_2
extends EntityRewriter<ClientboundPackets1_19_4, Protocol1_20To1_20_2> {
    public EntityPacketRewriter1_20_2(Protocol1_20To1_20_2 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_20_2)Types1_20_2.ENTITY_DATA_TYPES).byId(arg_0));
        this.registerEntityDataTypeHandler(Types1_20_2.ENTITY_DATA_TYPES.itemType, Types1_20_2.ENTITY_DATA_TYPES.blockStateType, Types1_20_2.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_20_2.ENTITY_DATA_TYPES.particleType, null);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19_4.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_19_4.DISPLAY).addIndex(10);
    }

    public void registerPackets() {
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_19_4.SET_ENTITY_DATA, Types1_20.ENTITY_DATA_LIST, Types1_20_2.ENTITY_DATA_LIST);
        ((Protocol1_20To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.ADD_PLAYER, ClientboundPackets1_20_2.ADD_ENTITY, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough(Types.UUID);
            wrapper.write((Type)Types.VAR_INT, (Object)EntityTypes1_19_4.PLAYER.getId());
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            byte yaw = (Byte)wrapper.read((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.write((Type)Types.BYTE, (Object)yaw);
            wrapper.write((Type)Types.BYTE, (Object)yaw);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)0);
            wrapper.write((Type)Types.SHORT, (Object)0);
        });
        ((Protocol1_20To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    wrapper.passthrough((Type)Types.INT);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    byte gamemode = (Byte)wrapper.read((Type)Types.BYTE);
                    byte previousGamemode = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.passthrough(Types.STRING_ARRAY);
                    CompoundTag dimensionRegistry = (CompoundTag)wrapper.read(Types.NAMED_COMPOUND_TAG);
                    String dimensionType = (String)wrapper.read(Types.STRING);
                    String world = (String)wrapper.read(Types.STRING);
                    long seed = (Long)wrapper.read((Type)Types.LONG);
                    EntityPacketRewriter1_20_2.this.trackBiomeSize(wrapper.user(), dimensionRegistry);
                    EntityPacketRewriter1_20_2.this.cacheDimensionData(wrapper.user(), dimensionRegistry);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    wrapper.write(Types.STRING, (Object)dimensionType);
                    wrapper.write(Types.STRING, (Object)world);
                    wrapper.write((Type)Types.LONG, (Object)seed);
                    wrapper.write((Type)Types.BYTE, (Object)gamemode);
                    wrapper.write((Type)Types.BYTE, (Object)previousGamemode);
                    ConfigurationState configurationBridge = (ConfigurationState)wrapper.user().get(ConfigurationState.class);
                    if (!configurationBridge.setLastDimensionRegistry(dimensionRegistry)) {
                        PacketWrapper clientInformationPacket = configurationBridge.clientInformationPacket(wrapper.user());
                        if (clientInformationPacket != null) {
                            clientInformationPacket.scheduleSendToServer(Protocol1_20To1_20_2.class);
                        }
                        return;
                    }
                    if (configurationBridge.bridgePhase() == ConfigurationState.BridgePhase.NONE) {
                        PacketWrapper configurationPacket = wrapper.create((PacketType)ClientboundPackets1_20_2.START_CONFIGURATION);
                        configurationPacket.send(Protocol1_20To1_20_2.class);
                        configurationBridge.setBridgePhase(ConfigurationState.BridgePhase.REENTERING_CONFIGURATION);
                        configurationBridge.setJoinGamePacket(wrapper);
                        wrapper.cancel();
                        return;
                    }
                    configurationBridge.setJoinGamePacket(wrapper);
                    wrapper.cancel();
                    Protocol1_20To1_20_2.sendConfigurationPackets(wrapper.user(), dimensionRegistry, null);
                });
                this.handler(EntityPacketRewriter1_20_2.this.worldDataTrackerHandlerByKey());
            }
        });
        ((Protocol1_20To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough((Type)Types.LONG);
                    wrapper.write((Type)Types.BYTE, (Object)((Short)wrapper.read((Type)Types.UNSIGNED_BYTE)).byteValue());
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    byte dataToKeep = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.passthrough(Types.OPTIONAL_GLOBAL_POSITION);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.write((Type)Types.BYTE, (Object)dataToKeep);
                });
                this.handler(EntityPacketRewriter1_20_2.this.worldDataTrackerHandlerByKey());
            }
        });
        ((Protocol1_20To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.UPDATE_MOB_EFFECT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT) - 1));
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.write(Types.OPTIONAL_COMPOUND_TAG, (Object)((CompoundTag)wrapper.read(Types.OPTIONAL_NAMED_COMPOUND_TAG)));
        });
        ((Protocol1_20To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.REMOVE_MOB_EFFECT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT) - 1));
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_19_4.getTypeFromId((int)type);
    }
}

