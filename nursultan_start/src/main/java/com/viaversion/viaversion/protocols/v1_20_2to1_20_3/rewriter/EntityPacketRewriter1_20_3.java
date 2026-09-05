/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_3
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_2
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.Protocol1_20_2To1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter;

import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_3;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20_2;
import com.viaversion.viaversion.api.type.types.version.Types1_20_3;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.Protocol1_20_2To1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPacket1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Key;

public final class EntityPacketRewriter1_20_3
extends EntityRewriter<ClientboundPacket1_20_2, Protocol1_20_2To1_20_3> {
    public EntityPacketRewriter1_20_3(Protocol1_20_2To1_20_3 protocol) {
        super((Protocol)protocol);
    }

    public void registerPackets() {
        this.registerSetEntityData(ClientboundPackets1_20_2.SET_ENTITY_DATA, Types1_20_2.ENTITY_DATA_LIST, Types1_20_3.ENTITY_DATA_LIST);
        ((Protocol1_20_2To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_2.REGISTRY_DATA, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map(Types.COMPOUND_TAG);
                this.handler(EntityPacketRewriter1_20_3.this.configurationDimensionDataHandler());
                this.handler(EntityPacketRewriter1_20_3.this.configurationBiomeSizeTracker());
            }
        });
        ((Protocol1_20_2To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map(Types.STRING_ARRAY);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_20_3.this.worldDataTrackerHandlerByKey());
                this.handler(wrapper -> EntityPacketRewriter1_20_3.this.sendChunksSentGameEvent(wrapper));
            }
        });
        ((Protocol1_20_2To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_20_3.this.worldDataTrackerHandlerByKey());
                this.handler(wrapper -> EntityPacketRewriter1_20_3.this.sendChunksSentGameEvent(wrapper));
            }
        });
        ((Protocol1_20_2To1_20_3)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.INITIALIZE_BORDER, this::sendChunksSentGameEvent);
    }

    private void sendChunksSentGameEvent(PacketWrapper wrapper) {
        wrapper.send(Protocol1_20_2To1_20_3.class);
        wrapper.cancel();
        PacketWrapper gameEventPacket = wrapper.create((PacketType)ClientboundPackets1_20_3.GAME_EVENT);
        gameEventPacket.write((Type)Types.UNSIGNED_BYTE, (Object)13);
        gameEventPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(0.0f));
        gameEventPacket.send(Protocol1_20_2To1_20_3.class);
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            EntityDataType type = data.dataType();
            if (type == Types1_20_2.ENTITY_DATA_TYPES.componentType) {
                data.setTypeAndValue(Types1_20_3.ENTITY_DATA_TYPES.componentType, (Object)ComponentUtil.jsonToTag((JsonElement)((JsonElement)data.value())));
            } else if (type == Types1_20_2.ENTITY_DATA_TYPES.optionalComponentType) {
                data.setTypeAndValue(Types1_20_3.ENTITY_DATA_TYPES.optionalComponentType, (Object)ComponentUtil.jsonToTag((JsonElement)((JsonElement)data.value())));
            } else {
                data.setDataType(Types1_20_3.ENTITY_DATA_TYPES.byId(type.typeId()));
            }
        });
        this.filter().dataType(Types1_20_3.ENTITY_DATA_TYPES.particleType).handler((event, data) -> {
            Particle particle = (Particle)data.value();
            ParticleMappings particleMappings = ((Protocol1_20_2To1_20_3)this.protocol).getMappingData().getParticleMappings();
            if (particle.id() == particleMappings.id("vibration")) {
                String resourceLocation = (String)particle.removeArgument(0).getValue();
                if (Key.stripMinecraftNamespace((String)resourceLocation).equals("block")) {
                    particle.add(0, (Type)Types.VAR_INT, (Object)0);
                } else {
                    particle.add(0, (Type)Types.VAR_INT, (Object)1);
                }
            }
        });
        this.registerEntityDataTypeHandler(Types1_20_3.ENTITY_DATA_TYPES.itemType, Types1_20_3.ENTITY_DATA_TYPES.blockStateType, Types1_20_3.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_20_3.ENTITY_DATA_TYPES.particleType, null);
        this.registerBlockStateHandler((EntityType)EntityTypes1_20_3.ABSTRACT_MINECART, 11);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_20_3.getTypeFromId((int)type);
    }
}

