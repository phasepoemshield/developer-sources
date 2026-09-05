/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.Particle$ParticleData
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_17
 *  com.viaversion.viaversion.api.type.types.version.Types1_18
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viabackwards.protocol.v1_18to1_17_1.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_18to1_17_1.Protocol1_18To1_17_1;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_17;
import com.viaversion.viaversion.api.type.types.version.Types1_18;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.util.TagUtil;

public final class EntityPacketRewriter1_18
extends EntityRewriter<ClientboundPackets1_18, Protocol1_18To1_17_1> {
    public EntityPacketRewriter1_18(Protocol1_18To1_17_1 protocol) {
        super((BackwardsProtocol)protocol);
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            data.setDataType(Types1_17.ENTITY_DATA_TYPES.byId(data.dataType().typeId()));
            EntityDataType type = data.dataType();
            if (type == Types1_17.ENTITY_DATA_TYPES.particleType) {
                Particle particle = (Particle)data.value();
                if (particle.id() == 3) {
                    Particle.ParticleData value = (Particle.ParticleData)particle.getArguments().remove(0);
                    int blockState = (Integer)value.getValue();
                    if (blockState == 7786) {
                        particle.setId(3);
                    } else {
                        particle.setId(2);
                    }
                    return;
                }
                ((Protocol1_18To1_17_1)this.protocol).getParticleRewriter().rewriteParticle(event.user(), particle);
            }
        });
        this.registerEntityDataTypeHandler(Types1_17.ENTITY_DATA_TYPES.itemType, null, null, null, Types1_17.ENTITY_DATA_TYPES.componentType, Types1_17.ENTITY_DATA_TYPES.optionalComponentType);
    }

    protected void registerPackets() {
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_18.SET_ENTITY_DATA, Types1_18.ENTITY_DATA_LIST, Types1_17.ENTITY_DATA_LIST);
        ((Protocol1_18To1_17_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_18.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.read((Type)Types.VAR_INT);
                this.handler(EntityPacketRewriter1_18.this.worldDataTrackerHandler(1));
                this.handler(wrapper -> {
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    ListTag biomes = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"worldgen/biome");
                    for (CompoundTag biome : biomes) {
                        CompoundTag biomeCompound = biome.getCompoundTag("element");
                        StringTag category = biomeCompound.getStringTag("category");
                        if (category.getValue().equals("mountain")) {
                            category.setValue("extreme_hills");
                        }
                        biomeCompound.putFloat("depth", 0.125f);
                        biomeCompound.putFloat("scale", 0.05f);
                    }
                    EntityPacketRewriter1_18.this.tracker(wrapper.user()).setBiomesSent(biomes.size());
                });
            }
        });
        ((Protocol1_18To1_17_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_18.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_18.this.worldDataTrackerHandler(0));
            }
        });
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_17.getTypeFromId((int)typeId);
    }
}

