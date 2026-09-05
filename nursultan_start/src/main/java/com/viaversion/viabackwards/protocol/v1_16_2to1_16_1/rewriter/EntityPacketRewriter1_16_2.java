/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.storage.BiomeStorage
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.data.DimensionRegistries1_16
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.rewriter;

import com.google.common.collect.Sets;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.Protocol1_16_2To1_16_1;
import com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.storage.BiomeStorage;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.data.DimensionRegistries1_16;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.TagUtil;
import java.util.Set;

public class EntityPacketRewriter1_16_2
extends EntityRewriter<ClientboundPackets1_16_2, Protocol1_16_2To1_16_1> {
    private final Set<String> oldDimensions = Sets.newHashSet((Object[])new String[]{"minecraft:overworld", "minecraft:the_nether", "minecraft:the_end"});
    private boolean warned;

    public EntityPacketRewriter1_16_2(Protocol1_16_2To1_16_1 protocol) {
        super((BackwardsProtocol)protocol);
    }

    private String getDimensionFromData(CompoundTag dimensionData) {
        StringTag effectsLocation = dimensionData.getStringTag("effects");
        return effectsLocation != null && this.oldDimensions.contains(Key.namespaced((String)effectsLocation.getValue())) ? effectsLocation.getValue() : "minecraft:overworld";
    }

    public void onMappingDataLoaded() {
        super.onMappingDataLoaded();
        this.mapEntityTypeWithData((EntityType)EntityTypes1_16_2.PIGLIN_BRUTE, (EntityType)EntityTypes1_16_2.PIGLIN).jsonName();
    }

    protected void registerRewrites() {
        this.registerEntityDataTypeHandler(Types1_16.ENTITY_DATA_TYPES.itemType, null, Types1_16.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_16.ENTITY_DATA_TYPES.particleType, Types1_16.ENTITY_DATA_TYPES.componentType, Types1_16.ENTITY_DATA_TYPES.optionalComponentType);
        this.filter().type((EntityType)EntityTypes1_16_2.ABSTRACT_PIGLIN).index(15).toIndex(16);
        this.filter().type((EntityType)EntityTypes1_16_2.ABSTRACT_PIGLIN).index(16).toIndex(15);
    }

    protected void registerPackets() {
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_16_2.ADD_EXPERIENCE_ORB, (EntityType)EntityTypes1_16_2.EXPERIENCE_ORB);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_16_2.ADD_PAINTING, (EntityType)EntityTypes1_16_2.PAINTING);
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_16_2.ADD_PLAYER, (EntityType)EntityTypes1_16_2.PLAYER);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_16_2.SET_ENTITY_DATA, Types1_16.ENTITY_DATA_LIST);
        ((Protocol1_16_2To1_16_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16_2.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    boolean hardcore = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    short gamemode = ((Byte)wrapper.read((Type)Types.BYTE)).byteValue();
                    if (hardcore) {
                        gamemode = (short)(gamemode | 8);
                    }
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)gamemode);
                });
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.handler(wrapper -> {
                    CompoundTag registry = (CompoundTag)wrapper.read(Types.NAMED_COMPOUND_TAG);
                    if (wrapper.user().getProtocolInfo().protocolVersion().olderThanOrEqualTo(ProtocolVersion.v1_15_2)) {
                        ListTag biomes = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"worldgen/biome");
                        BiomeStorage biomeStorage = (BiomeStorage)wrapper.user().get(BiomeStorage.class);
                        biomeStorage.clear();
                        for (CompoundTag biome : biomes) {
                            StringTag name = biome.getStringTag("name");
                            NumberTag id = biome.getNumberTag("id");
                            biomeStorage.addBiome(name.getValue(), id.asInt());
                        }
                    } else if (!EntityPacketRewriter1_16_2.this.warned && !ViaBackwards.getConfig().suppressEmulationWarnings()) {
                        EntityPacketRewriter1_16_2.this.warned = true;
                        ((Protocol1_16_2To1_16_1)EntityPacketRewriter1_16_2.this.protocol).getLogger().warning("1.16 and 1.16.1 clients are only partially supported and may have wrong biomes displayed.");
                    }
                    wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)DimensionRegistries1_16.getDimensionsTag());
                    CompoundTag dimensionData = (CompoundTag)wrapper.read(Types.NAMED_COMPOUND_TAG);
                    wrapper.write(Types.STRING, (Object)EntityPacketRewriter1_16_2.this.getDimensionFromData(dimensionData));
                });
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    String world = (String)wrapper.get(Types.STRING, 1);
                    EntityPacketRewriter1_16_2.this.trackWorld(wrapper.user(), world);
                });
                this.map((Type)Types.LONG);
                this.handler(wrapper -> {
                    int maxPlayers = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.write((Type)Types.UNSIGNED_BYTE, (Object)((short)Math.min(maxPlayers, 255)));
                });
                this.handler(EntityPacketRewriter1_16_2.this.getPlayerTrackerHandler());
            }
        });
        ((Protocol1_16_2To1_16_1)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16_2.RESPAWN, wrapper -> {
            CompoundTag dimensionData = (CompoundTag)wrapper.read(Types.NAMED_COMPOUND_TAG);
            wrapper.write(Types.STRING, (Object)this.getDimensionFromData(dimensionData));
            String world = (String)wrapper.passthrough(Types.STRING);
            this.trackWorld(wrapper.user(), world);
        });
    }

    public EntityType typeFromId(int typeId) {
        return EntityTypes1_16_2.getTypeFromId((int)typeId);
    }
}

