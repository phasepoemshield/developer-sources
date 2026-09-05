/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.storage.SpawnPositionStorage
 *  com.viaversion.viaversion.api.data.ParticleMappings
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_3
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_2
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.rewriter;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.Protocol1_20_3To1_20_2;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.storage.SpawnPositionStorage;
import com.viaversion.viaversion.api.data.ParticleMappings;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_3;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_20_2;
import com.viaversion.viaversion.api.type.types.version.Types1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.util.ComponentUtil;

public final class EntityPacketRewriter1_20_3
extends EntityRewriter<ClientboundPacket1_20_3, Protocol1_20_3To1_20_2> {
    public EntityPacketRewriter1_20_3(Protocol1_20_3To1_20_2 protocol) {
        super((BackwardsProtocol)protocol, Types1_20_2.ENTITY_DATA_TYPES.optionalComponentType, Types1_20_2.ENTITY_DATA_TYPES.booleanType);
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_20_3.BREEZE, (EntityType)EntityTypes1_20_3.BLAZE).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_20_3.WIND_CHARGE, (EntityType)EntityTypes1_20_3.SHULKER_BULLET).jsonName();
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            int pose;
            EntityDataType type = data.dataType();
            if (type == Types1_20_3.ENTITY_DATA_TYPES.componentType) {
                data.setTypeAndValue(Types1_20_2.ENTITY_DATA_TYPES.componentType, (Object)ComponentUtil.tagToJson((Tag)((Tag)data.value())));
                return;
            }
            if (type == Types1_20_3.ENTITY_DATA_TYPES.optionalComponentType) {
                data.setTypeAndValue(Types1_20_2.ENTITY_DATA_TYPES.optionalComponentType, (Object)ComponentUtil.tagToJson((Tag)((Tag)data.value())));
                return;
            }
            if (type == Types1_20_3.ENTITY_DATA_TYPES.particleType) {
                Particle particle = (Particle)data.getValue();
                ParticleMappings particleMappings = ((Protocol1_20_3To1_20_2)this.protocol).getMappingData().getParticleMappings();
                if (particle.id() == particleMappings.id("vibration")) {
                    int positionSourceType = (Integer)particle.removeArgument(0).getValue();
                    if (positionSourceType == 0) {
                        particle.add(0, Types.STRING, (Object)"minecraft:block");
                    } else {
                        particle.add(0, Types.STRING, (Object)"minecraft:entity");
                    }
                }
            } else if (type == Types1_20_3.ENTITY_DATA_TYPES.poseType && (pose = ((Integer)data.value()).intValue()) >= 15) {
                event.cancel();
            }
            data.setDataType(Types1_20_2.ENTITY_DATA_TYPES.byId(type.typeId()));
        });
        this.registerEntityDataTypeHandler(Types1_20_2.ENTITY_DATA_TYPES.itemType, Types1_20_2.ENTITY_DATA_TYPES.blockStateType, Types1_20_2.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_20_2.ENTITY_DATA_TYPES.particleType, Types1_20_2.ENTITY_DATA_TYPES.componentType, Types1_20_2.ENTITY_DATA_TYPES.optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_20_3.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_20_3.TNT).removeIndex(9);
    }

    public void registerPackets() {
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_20_3.SET_ENTITY_DATA, Types1_20_3.ENTITY_DATA_LIST, Types1_20_2.ENTITY_DATA_LIST);
        ((Protocol1_20_3To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_3.REGISTRY_DATA, (PacketHandler)new PacketHandlers(){

            protected void register() {
                this.map(Types.COMPOUND_TAG);
                this.handler(EntityPacketRewriter1_20_3.this.configurationDimensionDataHandler());
                this.handler(EntityPacketRewriter1_20_3.this.configurationBiomeSizeTracker());
            }
        });
        ((Protocol1_20_3To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.LOGIN, (PacketHandler)new PacketHandlers(){

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
                this.handler(EntityPacketRewriter1_20_3.this.spawnPositionHandler());
                this.handler(EntityPacketRewriter1_20_3.this.worldDataTrackerHandlerByKey());
            }
        });
        ((Protocol1_20_3To1_20_2)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_20_3.this.spawnPositionHandler());
                this.handler(EntityPacketRewriter1_20_3.this.worldDataTrackerHandlerByKey());
            }
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_20_3.getTypeFromId((int)type);
    }

    private PacketHandler spawnPositionHandler() {
        return wrapper -> {
            String world = (String)wrapper.get(Types.STRING, 1);
            ((SpawnPositionStorage)wrapper.user().get(SpawnPositionStorage.class)).setDimension(world);
        };
    }
}

