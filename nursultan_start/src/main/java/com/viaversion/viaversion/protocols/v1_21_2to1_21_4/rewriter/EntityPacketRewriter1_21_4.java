/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_2to1_21_4.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_21_4;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_21_2;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.Protocol1_21_2To1_21_4;
import com.viaversion.viaversion.protocols.v1_21_2to1_21_4.packet.ServerboundPackets1_21_4;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public final class EntityPacketRewriter1_21_4
extends EntityRewriter<ClientboundPacket1_21_2, Protocol1_21_2To1_21_4> {
    public EntityPacketRewriter1_21_4(Protocol1_21_2To1_21_4 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.dataTypeMapper().register();
        this.registerEntityDataTypeHandler(((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).itemType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).blockStateType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).optionalBlockStateType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).particleType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).particlesType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).componentType, ((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_21_4.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_21_4.CREAKING).addIndex(18);
        this.filter().type((EntityType)EntityTypes1_21_4.SALMON).index(17).handler((event, data) -> {
            String type;
            int typeId = switch (type = (String)data.value()) {
                case "small" -> 0;
                case "large" -> 2;
                default -> 1;
            };
            data.setTypeAndValue(((EntityDataTypes1_21_2)VersionedTypes.V1_21_4.entityDataTypes).varIntType, (Object)typeId);
        });
    }

    public void registerPackets() {
        ((Protocol1_21_2To1_21_4)this.protocol).getRegistryDataRewriter().addHandler("worldgen/biome", (key, biome) -> {
            CompoundTag effectsTag = biome.getCompoundTag("effects");
            CompoundTag musicTag = effectsTag.getCompoundTag("music");
            if (musicTag == null) {
                return;
            }
            ListTag weightedMusicTags = new ListTag(CompoundTag.class);
            CompoundTag weightedMusicTag = new CompoundTag();
            weightedMusicTag.put("data", (Tag)musicTag);
            weightedMusicTag.putInt("weight", 1);
            weightedMusicTags.add((Tag)weightedMusicTag);
            effectsTag.put("music", (Tag)weightedMusicTags);
        });
        ((Protocol1_21_2To1_21_4)this.protocol).registerServerbound(ServerboundPackets1_21_4.MOVE_VEHICLE, wrapper -> {
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.DOUBLE);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.passthrough((Type)Types.FLOAT);
            wrapper.read((Type)Types.BOOLEAN);
        });
        ((Protocol1_21_2To1_21_4)this.protocol).cancelServerbound(ServerboundPackets1_21_4.PLAYER_LOADED);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_21_4.getTypeFromId((int)type);
    }
}

