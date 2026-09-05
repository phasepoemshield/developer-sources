/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_16
 *  com.viaversion.viaversion.api.type.types.version.Types1_17
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viabackwards.protocol.v1_17to1_16_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.Protocol1_17To1_16_4;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityDataType;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_16;
import com.viaversion.viaversion.api.type.types.version.Types1_17;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.util.TagUtil;

public final class EntityPacketRewriter1_17
extends EntityRewriter<ClientboundPackets1_17, Protocol1_17To1_16_4> {
    private boolean warned = ViaBackwards.getConfig().bedrockAtY0() || ViaBackwards.getConfig().suppressEmulationWarnings();

    public EntityPacketRewriter1_17(Protocol1_17To1_16_4 protocol) {
        super((BackwardsProtocol)protocol);
    }

    private void reduceExtendedHeight(CompoundTag tag, boolean warn) {
        NumberTag minY = tag.getNumberTag("min_y");
        NumberTag height = tag.getNumberTag("height");
        NumberTag logicalHeight = tag.getNumberTag("logical_height");
        if (minY.asInt() != 0 || height.asInt() > 256 || logicalHeight.asInt() > 256) {
            if (warn && !this.warned) {
                ((Protocol1_17To1_16_4)this.protocol).getLogger().warning("Increased world height is NOT SUPPORTED for 1.16 players and below. They will see a void below y 0 and above 256. You can enable the `bedrock-at-y-0` config option to replace the air with a bedrock layer.");
                this.warned = true;
            }
            tag.putInt("height", Math.min(256, height.asInt()));
            tag.putInt("logical_height", Math.min(256, logicalHeight.asInt()));
        }
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_17.AXOLOTL, (EntityType)EntityTypes1_17.TROPICAL_FISH).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_17.GOAT, (EntityType)EntityTypes1_17.SHEEP).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_17.GLOW_SQUID, (EntityType)EntityTypes1_17.SQUID).jsonName();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_17.GLOW_ITEM_FRAME, (EntityType)EntityTypes1_17.ITEM_FRAME);
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            data.setDataType(Types1_16.ENTITY_DATA_TYPES.byId(data.dataType().typeId()));
            EntityDataType type = data.dataType();
            if (type == Types1_16.ENTITY_DATA_TYPES.particleType) {
                Particle particle = (Particle)data.getValue();
                if (particle.id() == 16) {
                    particle.getArguments().subList(4, 7).clear();
                } else if (particle.id() == 37) {
                    particle.setId(0);
                    particle.getArguments().clear();
                    return;
                }
                ((Protocol1_17To1_16_4)this.protocol).getParticleRewriter().rewriteParticle(event.user(), particle);
            } else if (type == Types1_16.ENTITY_DATA_TYPES.poseType) {
                int pose = (Integer)data.value();
                if (pose == 6) {
                    data.setValue((Object)1);
                } else if (pose > 6) {
                    data.setValue((Object)(pose - 1));
                }
            }
        });
        this.registerEntityDataTypeHandler(Types1_16.ENTITY_DATA_TYPES.itemType, null, Types1_16.ENTITY_DATA_TYPES.optionalBlockStateType, null, Types1_16.ENTITY_DATA_TYPES.componentType, Types1_16.ENTITY_DATA_TYPES.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_17.AXOLOTL).cancel(17);
        this.filter().type((EntityType)EntityTypes1_17.AXOLOTL).cancel(18);
        this.filter().type((EntityType)EntityTypes1_17.AXOLOTL).cancel(19);
        this.filter().type((EntityType)EntityTypes1_17.GLOW_SQUID).cancel(16);
        this.filter().type((EntityType)EntityTypes1_17.GOAT).cancel(17);
        this.filter().type((EntityType)EntityTypes1_17.SHULKER).addIndex(17);
        this.registerBlockStateHandler((EntityType)EntityTypes1_17.ABSTRACT_MINECART, 11);
        this.filter().removeIndex(7);
    }

    protected void registerPackets() {
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_17.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_17.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_17.ADD_PAINTING, (EntityType)EntityTypes1_17.PAINTING);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_17.ADD_PLAYER, (EntityType)EntityTypes1_17.PLAYER);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_17.SET_ENTITY_DATA, Types1_17.ENTITY_DATA_LIST, Types1_16.ENTITY_DATA_LIST);
        ((Protocol1_17To1_16_4)this.protocol).appendClientbound((ClientboundPacketType)ClientboundPackets1_17.ADD_ENTITY, wrapper -> {
            int entityType = (Integer)wrapper.get((Type)Types.VAR_INT, 1);
            if (entityType != EntityTypes1_16_2.ITEM_FRAME.getId()) {
                return;
            }
            int data = (Integer)wrapper.get((Type)Types.INT, 0);
            float pitch = 0.0f;
            float yaw = 0.0f;
            switch (Math.abs(data % 6)) {
                case 0: {
                    pitch = 90.0f;
                    break;
                }
                case 1: {
                    pitch = -90.0f;
                    break;
                }
                case 2: {
                    yaw = 180.0f;
                    break;
                }
                case 4: {
                    yaw = 90.0f;
                    break;
                }
                case 5: {
                    yaw = 270.0f;
                }
            }
            wrapper.set((Type)Types.BYTE, 0, (Object)((byte)(pitch * 256.0f / 360.0f)));
            wrapper.set((Type)Types.BYTE, 1, (Object)((byte)(yaw * 256.0f / 360.0f)));
        });
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.REMOVE_ENTITY, (ClientboundPacketType)ClientboundPackets1_16_2.REMOVE_ENTITIES, wrapper -> {
            int entityId = (Integer)wrapper.read((Type)Types.VAR_INT);
            this.tracker(wrapper.user()).removeEntity(entityId);
            int[] array = new int[]{entityId};
            wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)array);
        });
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    byte previousGamemode = (Byte)wrapper.get((Type)Types.BYTE, 1);
                    if (previousGamemode == -1) {
                        wrapper.set((Type)Types.BYTE, 1, (Object)0);
                    }
                });
                this.handler(EntityPacketRewriter1_17.this.getPlayerTrackerHandler());
                this.handler(EntityPacketRewriter1_17.this.worldDataTrackerHandler(1));
                this.handler(wrapper -> {
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    ListTag biomes = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"worldgen/biome");
                    for (CompoundTag biome : biomes) {
                        CompoundTag biomeCompound = biome.getCompoundTag("element");
                        StringTag category = biomeCompound.getStringTag("category");
                        if (!category.getValue().equalsIgnoreCase("underground")) continue;
                        category.setValue("none");
                    }
                    ListTag dimensions = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"dimension_type");
                    for (CompoundTag dimension : dimensions) {
                        CompoundTag dimensionCompound = dimension.getCompoundTag("element");
                        EntityPacketRewriter1_17.this.reduceExtendedHeight(dimensionCompound, false);
                    }
                    EntityPacketRewriter1_17.this.reduceExtendedHeight((CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 1), true);
                });
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.handler(EntityPacketRewriter1_17.this.worldDataTrackerHandler(0));
                this.handler(wrapper -> EntityPacketRewriter1_17.this.reduceExtendedHeight((CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0), true));
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.PLAYER_POSITION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.read((Type)Types.BOOLEAN);
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.UPDATE_ATTRIBUTES, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> wrapper.write((Type)Types.INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT))));
            }
        });
        ((Protocol1_17To1_16_4)this.protocol).mergePacket(ClientboundPackets1_17.PLAYER_COMBAT_ENTER, ClientboundPackets1_16_2.PLAYER_COMBAT, 0);
        ((Protocol1_17To1_16_4)this.protocol).mergePacket(ClientboundPackets1_17.PLAYER_COMBAT_END, ClientboundPackets1_16_2.PLAYER_COMBAT, 1);
        ((Protocol1_17To1_16_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_17.PLAYER_COMBAT_KILL, (ClientboundPacketType)ClientboundPackets1_16_2.PLAYER_COMBAT, wrapper -> {
            wrapper.write((Type)Types.VAR_INT, (Object)2);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.INT);
            ((Protocol1_17To1_16_4)this.protocol).getComponentRewriter().processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
        });
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_17.getTypeFromId((int)typeId);
    }
}

