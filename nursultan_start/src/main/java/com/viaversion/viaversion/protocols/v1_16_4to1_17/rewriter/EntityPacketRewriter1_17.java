/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.IntTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viafabricplus.features.classic.world_height.WorldHeightSupport
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17
 *  com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_14
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_16
 *  com.viaversion.viaversion.api.type.types.version.Types1_17
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.util.TagUtil
 */
package com.viaversion.viaversion.protocols.v1_16_4to1_17.rewriter;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.IntTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viafabricplus.features.classic.world_height.WorldHeightSupport;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17;
import com.viaversion.viaversion.api.minecraft.entitydata.types.EntityDataTypes1_14;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_16;
import com.viaversion.viaversion.api.type.types.version.Types1_17;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.util.TagUtil;

public final class EntityPacketRewriter1_17
extends EntityRewriter<ClientboundPackets1_16_2, Protocol1_16_4To1_17> {
    public EntityPacketRewriter1_17(Protocol1_16_4To1_17 protocol1_16_4To1_17) {
        super((Protocol)protocol1_16_4To1_17);
    }

    protected void registerRewrites() {
        this.filter().mapDataType(arg_0 -> ((EntityDataTypes1_14)Types1_17.ENTITY_DATA_TYPES).byId(arg_0));
        this.filter().dataType(Types1_17.ENTITY_DATA_TYPES.poseType).handler((entityDataHandlerEvent, entityData) -> {
            int n = (Integer)entityData.value();
            if (n > 5) {
                entityData.setValue((Object)(n + 1));
            }
        });
        this.registerEntityDataTypeHandler(Types1_17.ENTITY_DATA_TYPES.itemType, Types1_17.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_17.ENTITY_DATA_TYPES.particleType);
        this.filter().type((EntityType)EntityTypes1_17.ENTITY).addIndex(7);
        this.registerBlockStateHandler((EntityType)EntityTypes1_17.ABSTRACT_MINECART, 11);
        this.filter().type((EntityType)EntityTypes1_17.SHULKER).removeIndex(17);
    }

    public void registerPackets() {
        this.registerTracker((ClientboundPacketType)ClientboundPackets1_16_2.ADD_PLAYER, (EntityType)EntityTypes1_17.PLAYER);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_16_2.SET_ENTITY_DATA, Types1_16.ENTITY_DATA_LIST, Types1_17.ENTITY_DATA_LIST);
        ((Protocol1_16_4To1_17)this.protocol).appendClientbound((ClientboundPacketType)ClientboundPackets1_16_2.ADD_ENTITY, packetWrapper -> {
            int n = (Integer)packetWrapper.get((Type)Types.VAR_INT, 1);
            if (n != EntityTypes1_17.ITEM_FRAME.getId()) {
                return;
            }
            int n2 = (Integer)packetWrapper.get((Type)Types.VAR_INT, 0);
            byte by = (Byte)packetWrapper.get((Type)Types.BYTE, 0);
            byte by2 = (Byte)packetWrapper.get((Type)Types.BYTE, 1);
            PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ClientboundPackets1_17.MOVE_ENTITY_ROT, (UserConnection)packetWrapper.user());
            packetWrapper2.write((Type)Types.VAR_INT, (Object)n2);
            packetWrapper2.write((Type)Types.BYTE, (Object)by2);
            packetWrapper2.write((Type)Types.BYTE, (Object)by);
            packetWrapper2.write((Type)Types.BOOLEAN, (Object)false);
            packetWrapper.send(Protocol1_16_4To1_17.class);
            packetWrapper.cancel();
            packetWrapper2.send(Protocol1_16_4To1_17.class);
        });
        ((Protocol1_16_4To1_17)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16_2.REMOVE_ENTITIES, null, packetWrapper -> {
            int[] nArray = (int[])packetWrapper.read(Types.VAR_INT_ARRAY_PRIMITIVE);
            packetWrapper.cancel();
            EntityTracker entityTracker = packetWrapper.user().getEntityTracker(Protocol1_16_4To1_17.class);
            for (int n : nArray) {
                entityTracker.removeEntity(n);
                PacketWrapper packetWrapper2 = packetWrapper.create((PacketType)ClientboundPackets1_17.REMOVE_ENTITY);
                packetWrapper2.write((Type)Types.VAR_INT, (Object)n);
                packetWrapper2.send(Protocol1_16_4To1_17.class);
            }
        });
        PacketHandlers packetHandlers = new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_17 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.handler(wrapper -> {
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    ListTag dimensions = TagUtil.getRegistryEntries((CompoundTag)registry, (String)"dimension_type");
                    for (CompoundTag dimension : dimensions) {
                        CompoundTag dimensionCompound = dimension.getCompoundTag("element");
                        EntityPacketRewriter1_17.addNewDimensionData(dimensionCompound);
                    }
                    CompoundTag currentDimensionTag = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 1);
                    EntityPacketRewriter1_17.addNewDimensionData(currentDimensionTag);
                });
                this.handler(wrapper -> {
                    String world = (String)wrapper.passthrough(Types.STRING);
                    this.this$0.tracker(wrapper.user()).setCurrentWorld(world);
                });
                this.handler(this.this$0.playerTrackerHandler());
            }
        };
        ClientboundPackets1_16_2 clientboundPackets1_16_2 = ClientboundPackets1_16_2.LOGIN;
        Protocol1_16_4To1_17 protocol1_16_4To1_17 = (Protocol1_16_4To1_17)this.protocol;
        this.redirect$dfm000$viafabricplus$handleClassicWorldHeight(protocol1_16_4To1_17, (ClientboundPacketType)clientboundPackets1_16_2, (PacketHandler)packetHandlers);
        packetHandlers = packetWrapper -> {
            CompoundTag compoundTag = (CompoundTag)packetWrapper.passthrough(Types.NAMED_COMPOUND_TAG);
            EntityPacketRewriter1_17.addNewDimensionData(compoundTag);
            String string = (String)packetWrapper.passthrough(Types.STRING);
            this.trackWorld(packetWrapper.user(), string);
        };
        clientboundPackets1_16_2 = ClientboundPackets1_16_2.RESPAWN;
        protocol1_16_4To1_17 = (Protocol1_16_4To1_17)this.protocol;
        this.redirect$dfm000$viafabricplus$handleClassicWorldHeight(protocol1_16_4To1_17, (ClientboundPacketType)clientboundPackets1_16_2, (PacketHandler)packetHandlers);
        packetHandlers = new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_17 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> wrapper.write((Type)Types.VAR_INT, (Object)((Integer)wrapper.read((Type)Types.INT))));
            }
        };
        clientboundPackets1_16_2 = ClientboundPackets1_16_2.UPDATE_ATTRIBUTES;
        protocol1_16_4To1_17 = (Protocol1_16_4To1_17)this.protocol;
        this.redirect$dfm000$viafabricplus$handleClassicWorldHeight(protocol1_16_4To1_17, (ClientboundPacketType)clientboundPackets1_16_2, (PacketHandler)packetHandlers);
        packetHandlers = new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_17 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.create((Type)Types.BOOLEAN, false);
            }
        };
        clientboundPackets1_16_2 = ClientboundPackets1_16_2.PLAYER_POSITION;
        protocol1_16_4To1_17 = (Protocol1_16_4To1_17)this.protocol;
        this.redirect$dfm000$viafabricplus$handleClassicWorldHeight(protocol1_16_4To1_17, (ClientboundPacketType)clientboundPackets1_16_2, (PacketHandler)packetHandlers);
        ((Protocol1_16_4To1_17)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_16_2.PLAYER_COMBAT, null, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            ClientboundPackets1_17 clientboundPackets1_17 = switch (n) {
                case 0 -> ClientboundPackets1_17.PLAYER_COMBAT_ENTER;
                case 1 -> ClientboundPackets1_17.PLAYER_COMBAT_END;
                case 2 -> ClientboundPackets1_17.PLAYER_COMBAT_KILL;
                default -> throw new IllegalArgumentException("Invalid combat type received: " + n);
            };
            if (n == 2) {
                packetWrapper.passthrough((Type)Types.VAR_INT);
                packetWrapper.passthrough((Type)Types.INT);
                ((Protocol1_16_4To1_17)this.protocol).getComponentRewriter().processText(packetWrapper.user(), (JsonElement)packetWrapper.passthrough(Types.COMPONENT));
            }
            packetWrapper.setPacketType((PacketType)clientboundPackets1_17);
        });
        ((Protocol1_16_4To1_17)this.protocol).cancelClientbound((ClientboundPacketType)ClientboundPackets1_16_2.MOVE_ENTITY);
    }

    public EntityType typeFromId(int n) {
        return EntityTypes1_17.getTypeFromId((int)n);
    }

    private void redirect$dfm000$viafabricplus$handleClassicWorldHeight(Protocol1_16_4To1_17 protocol1_16_4To1_17, ClientboundPacketType clientboundPacketType, PacketHandler packetHandler) {
        if (clientboundPacketType == ClientboundPackets1_16_2.LOGIN) {
            packetHandler = WorldHeightSupport.handleJoinGame((PacketHandler)packetHandler);
        }
        if (clientboundPacketType == ClientboundPackets1_16_2.RESPAWN) {
            packetHandler = WorldHeightSupport.handleRespawn((PacketHandler)packetHandler);
        }
        protocol1_16_4To1_17.registerClientbound(clientboundPacketType, packetHandler);
    }

    private static void addNewDimensionData(CompoundTag compoundTag) {
        compoundTag.put("min_y", (Tag)new IntTag(0));
        compoundTag.put("height", (Tag)new IntTag(256));
    }
}

