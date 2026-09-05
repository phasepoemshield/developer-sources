/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_16
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_16_1to1_16_2.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.Protocol1_16_1To1_16_2;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public class EntityPacketRewriter1_16_2
extends EntityRewriter<ClientboundPackets1_16, Protocol1_16_1To1_16_2> {
    public EntityPacketRewriter1_16_2(Protocol1_16_1To1_16_2 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.registerEntityDataTypeHandler(Types1_16.ENTITY_DATA_TYPES.itemType, Types1_16.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_16.ENTITY_DATA_TYPES.particleType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_16_2.ABSTRACT_MINECART, 10);
        this.filter().type((EntityType)EntityTypes1_16_2.ABSTRACT_PIGLIN).handler((event, data) -> {
            if (data.id() == 15) {
                data.setId(16);
            } else if (data.id() == 16) {
                data.setId(15);
            }
        });
    }

    protected void registerPackets() {
        this.registerTracker(ClientboundPackets1_16.ADD_PLAYER, (EntityType)EntityTypes1_16_2.PLAYER);
        this.registerSetEntityData(ClientboundPackets1_16.SET_ENTITY_DATA, Types1_16.ENTITY_DATA_LIST);
        ((Protocol1_16_1To1_16_2)this.protocol).registerClientbound(ClientboundPackets1_16.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    short gamemode = (Short)wrapper.read((Type)Types.UNSIGNED_BYTE);
                    wrapper.write((Type)Types.BOOLEAN, (Object)((gamemode & 8) != 0 ? 1 : 0));
                    wrapper.write((Type)Types.BYTE, (Object)((byte)(gamemode & 0xFFFFFFF7)));
                });
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.handler(wrapper -> {
                    wrapper.read(Types.NAMED_COMPOUND_TAG);
                    wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)((Protocol1_16_1To1_16_2)EntityPacketRewriter1_16_2.this.protocol).getMappingData().getDimensionRegistry());
                    String dimensionType = (String)wrapper.read(Types.STRING);
                    wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)EntityPacketRewriter1_16_2.this.getDimensionData(dimensionType));
                });
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    String world = (String)wrapper.get(Types.STRING, 0);
                    EntityPacketRewriter1_16_2.this.tracker(wrapper.user()).setCurrentWorld(world);
                });
                this.map((Type)Types.LONG);
                this.map((Type)Types.UNSIGNED_BYTE, (Type)Types.VAR_INT);
                this.handler(EntityPacketRewriter1_16_2.this.playerTrackerHandler());
            }
        });
        ((Protocol1_16_1To1_16_2)this.protocol).registerClientbound(ClientboundPackets1_16.RESPAWN, wrapper -> {
            String dimensionType = (String)wrapper.read(Types.STRING);
            wrapper.write(Types.NAMED_COMPOUND_TAG, (Object)this.getDimensionData(dimensionType));
            String world = (String)wrapper.passthrough(Types.STRING);
            this.trackWorld(wrapper.user(), world);
        });
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_16_2.getTypeFromId((int)type);
    }

    private CompoundTag getDimensionData(String dimensionType) {
        CompoundTag tag = Protocol1_16_1To1_16_2.MAPPINGS.getDimensionDataMap().get(dimensionType);
        if (tag == null) {
            ((Protocol1_16_1To1_16_2)this.protocol).getLogger().severe("Could not get dimension data of " + dimensionType);
            throw new NullPointerException("Dimension data for " + dimensionType + " is null!");
        }
        return tag.copy();
    }
}

