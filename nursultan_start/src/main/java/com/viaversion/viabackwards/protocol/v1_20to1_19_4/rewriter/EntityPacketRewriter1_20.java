/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.EntityRewriter
 *  com.viaversion.viaversion.api.minecraft.Quaternion
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_19_4
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_19_4
 *  com.viaversion.viaversion.api.type.types.version.Types1_20
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.protocol.v1_20to1_19_4.rewriter;

import com.google.common.collect.Sets;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.EntityRewriter;
import com.viaversion.viabackwards.protocol.v1_20to1_19_4.Protocol1_20To1_19_4;
import com.viaversion.viaversion.api.minecraft.Quaternion;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_19_4;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_19_4;
import com.viaversion.viaversion.api.type.types.version.Types1_20;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.util.Key;
import java.util.Set;

public final class EntityPacketRewriter1_20
extends EntityRewriter<ClientboundPackets1_19_4, Protocol1_20To1_19_4> {
    private final Set<String> newTrimPatterns = Sets.newHashSet((Object[])new String[]{"host_armor_trim_smithing_template", "raiser_armor_trim_smithing_template", "silence_armor_trim_smithing_template", "shaper_armor_trim_smithing_template", "wayfinder_armor_trim_smithing_template"});
    private static final Quaternion Y_FLIPPED_ROTATION = new Quaternion(0.0f, 1.0f, 0.0f, 0.0f);

    public EntityPacketRewriter1_20(Protocol1_20To1_19_4 protocol) {
        super((BackwardsProtocol)protocol, Types1_19_4.ENTITY_DATA_TYPES.optionalComponentType, Types1_19_4.ENTITY_DATA_TYPES.booleanType);
    }

    public void registerPackets() {
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_19_4.SET_ENTITY_DATA, Types1_20.ENTITY_DATA_LIST, Types1_19_4.ENTITY_DATA_LIST);
        ((Protocol1_20To1_19_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map(Types.OPTIONAL_GLOBAL_POSITION);
                this.read((Type)Types.VAR_INT);
                this.handler(EntityPacketRewriter1_20.this.dimensionDataHandler());
                this.handler(EntityPacketRewriter1_20.this.biomeSizeTracker());
                this.handler(EntityPacketRewriter1_20.this.worldDataTrackerHandlerByKey());
                this.handler(wrapper -> {
                    ListTag values;
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    CompoundTag trimPatternTag = registry.getCompoundTag("minecraft:trim_pattern");
                    if (trimPatternTag != null || (trimPatternTag = registry.getCompoundTag("trim_pattern")) != null) {
                        values = trimPatternTag.getListTag("value", CompoundTag.class);
                    } else {
                        CompoundTag trimPatternRegistry = Protocol1_20To1_19_4.MAPPINGS.getTrimPatternRegistry().copy();
                        registry.put("minecraft:trim_pattern", (Tag)trimPatternRegistry);
                        values = trimPatternRegistry.getListTag("value", CompoundTag.class);
                    }
                    for (CompoundTag entry : values) {
                        CompoundTag element = entry.getCompoundTag("element");
                        StringTag templateItem = element.getStringTag("template_item");
                        if (!EntityPacketRewriter1_20.this.newTrimPatterns.contains(Key.stripMinecraftNamespace((String)templateItem.getValue()))) continue;
                        templateItem.setValue("minecraft:spire_armor_trim_smithing_template");
                    }
                });
            }
        });
        ((Protocol1_20To1_19_4)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_19_4.RESPAWN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map(Types.OPTIONAL_GLOBAL_POSITION);
                this.read((Type)Types.VAR_INT);
                this.handler(EntityPacketRewriter1_20.this.worldDataTrackerHandlerByKey());
            }
        });
    }

    protected void registerRewrites() {
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_19_4)Types1_19_4.ENTITY_DATA_TYPES).byId(arg_0));
        this.registerEntityDataTypeHandler(Types1_19_4.ENTITY_DATA_TYPES.itemType, Types1_19_4.ENTITY_DATA_TYPES.blockStateType, Types1_19_4.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_19_4.ENTITY_DATA_TYPES.particleType, Types1_19_4.ENTITY_DATA_TYPES.componentType, Types1_19_4.ENTITY_DATA_TYPES.optionalComponentType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19_4.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_19_4.ITEM_DISPLAY).handler((event, data) -> {
            if (event.trackedEntity().hasSentEntityData() || event.hasExtraData()) {
                return;
            }
            if (event.dataAtIndex(12) == null) {
                event.createExtraData(new EntityData(12, Types1_19_4.ENTITY_DATA_TYPES.quaternionType, (Object)Y_FLIPPED_ROTATION));
            }
        });
        this.filter().type((EntityType)EntityTypes1_19_4.ITEM_DISPLAY).index(12).handler((event, data) -> {
            Quaternion quaternion = (Quaternion)data.value();
            data.setValue((Object)this.rotateY180(quaternion));
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_19_4.getTypeFromId((int)type);
    }

    private Quaternion rotateY180(Quaternion quaternion) {
        return new Quaternion(-quaternion.z(), quaternion.w(), quaternion.x(), -quaternion.y());
    }
}

