/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.FloatTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.minecraft.Quaternion
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_19_4
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_19_4
 *  com.viaversion.viaversion.api.type.types.version.Types1_20
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.util.Key
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viaversion.protocols.v1_19_4to1_20.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.FloatTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.minecraft.Quaternion;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_4;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_19_4;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_19_4;
import com.viaversion.viaversion.api.type.types.version.Types1_20;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_4to1_20.Protocol1_19_4To1_20;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.util.Key;
import com.viaversion.viaversion.util.TagUtil;

public final class EntityPacketRewriter1_20
extends EntityRewriter<ClientboundPackets1_19_4, Protocol1_19_4To1_20> {
    private static final Quaternion Y_FLIPPED_ROTATION = new Quaternion(0.0f, 1.0f, 0.0f, 0.0f);

    public EntityPacketRewriter1_20(Protocol1_19_4To1_20 protocol) {
        super((Protocol)protocol);
    }

    public void registerPackets() {
        this.registerSetEntityData(ClientboundPackets1_19_4.SET_ENTITY_DATA, Types1_19_4.ENTITY_DATA_LIST, Types1_20.ENTITY_DATA_LIST);
        ((Protocol1_19_4To1_20)this.protocol).registerClientbound(ClientboundPackets1_19_4.LOGIN, (PacketHandler)new PacketHandlers(){

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
                this.create((Type)Types.VAR_INT, 0);
                this.handler(EntityPacketRewriter1_20.this.dimensionDataHandler());
                this.handler(EntityPacketRewriter1_20.this.biomeSizeTracker());
                this.handler(EntityPacketRewriter1_20.this.worldDataTrackerHandlerByKey());
                this.handler(wrapper -> {
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    ListTag damageTypes = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"damage_type");
                    int highestId = -1;
                    boolean hasOutsideBorder = false;
                    boolean hasGenericKill = false;
                    for (CompoundTag damageType : damageTypes) {
                        int id = damageType.getInt("id");
                        highestId = Math.max(highestId, id);
                        String name = Key.namespaced((String)damageType.getString("name"));
                        if (name.equals("minecraft:outside_border")) {
                            hasOutsideBorder = true;
                            continue;
                        }
                        if (!name.equals("minecraft:generic_kill")) continue;
                        hasGenericKill = true;
                    }
                    if (!hasOutsideBorder) {
                        CompoundTag outsideBorderReason = new CompoundTag();
                        CompoundTag outsideBorderElement = new CompoundTag();
                        outsideBorderElement.put("scaling", (Tag)new StringTag("always"));
                        outsideBorderElement.put("exhaustion", (Tag)new FloatTag(0.0f));
                        outsideBorderElement.put("message_id", (Tag)new StringTag("badRespawnPoint"));
                        outsideBorderReason.put("id", (Tag)new IntTag(highestId + 1));
                        outsideBorderReason.put("name", (Tag)new StringTag("minecraft:outside_border"));
                        outsideBorderReason.put("element", (Tag)outsideBorderElement);
                        damageTypes.add((Tag)outsideBorderReason);
                    }
                    if (!hasGenericKill) {
                        CompoundTag genericKillReason = new CompoundTag();
                        CompoundTag genericKillElement = new CompoundTag();
                        genericKillElement.put("scaling", (Tag)new StringTag("always"));
                        genericKillElement.put("exhaustion", (Tag)new FloatTag(0.0f));
                        genericKillElement.put("message_id", (Tag)new StringTag("badRespawnPoint"));
                        genericKillReason.put("id", (Tag)new IntTag(highestId + 2));
                        genericKillReason.put("name", (Tag)new StringTag("minecraft:generic_kill"));
                        genericKillReason.put("element", (Tag)genericKillElement);
                        damageTypes.add((Tag)genericKillReason);
                    }
                });
            }
        });
        ((Protocol1_19_4To1_20)this.protocol).registerClientbound(ClientboundPackets1_19_4.RESPAWN, (PacketHandler)new PacketHandlers(){

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
                this.create((Type)Types.VAR_INT, 0);
                this.handler(EntityPacketRewriter1_20.this.worldDataTrackerHandlerByKey());
            }
        });
    }

    protected void registerRewrites() {
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_19_4)Types1_20.ENTITY_DATA_TYPES).byId(arg_0));
        this.registerEntityDataTypeHandler(Types1_20.ENTITY_DATA_TYPES.itemType, Types1_20.ENTITY_DATA_TYPES.blockStateType, Types1_20.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_20.ENTITY_DATA_TYPES.particleType, null);
        this.registerBlockStateHandler((EntityType)EntityTypes1_19_4.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_19_4.ITEM_DISPLAY).handler((event, data) -> {
            if (event.trackedEntity().hasSentEntityData() || event.hasExtraData()) {
                return;
            }
            if (event.dataAtIndex(12) == null) {
                event.createExtraData(new EntityData(12, Types1_20.ENTITY_DATA_TYPES.quaternionType, (Object)Y_FLIPPED_ROTATION));
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

