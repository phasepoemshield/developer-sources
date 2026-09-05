/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.features.entity.metadata_handling.WolfHealthTracker1_14_4
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 *  com.viaversion.viaversion.rewriter.entitydata.EntityDataFilter$Builder
 */
package com.viaversion.viaversion.protocols.v1_14_4to1_15.rewriter;

import com.viaversion.viafabricplus.features.entity.metadata_handling.WolfHealthTracker1_14_4;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.Protocol1_14_4To1_15;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.rewriter.EntityRewriter;
import com.viaversion.viaversion.rewriter.entitydata.EntityDataFilter;
import java.util.List;

public class EntityPacketRewriter1_15
extends EntityRewriter<ClientboundPackets1_14_4, Protocol1_14_4To1_15> {
    public EntityPacketRewriter1_15(Protocol1_14_4To1_15 protocol1_14_4To1_15) {
        super((Protocol)protocol1_14_4To1_15);
    }

    private void sendEntityDataPacket(PacketWrapper packetWrapper, int n) {
        List list = (List)packetWrapper.read(Types1_14.ENTITY_DATA_LIST);
        if (list.isEmpty()) {
            return;
        }
        packetWrapper.send(Protocol1_14_4To1_15.class);
        packetWrapper.cancel();
        this.handleEntityData(n, list, packetWrapper.user());
        PacketWrapper packetWrapper2 = PacketWrapper.create((PacketType)ClientboundPackets1_15.SET_ENTITY_DATA, (UserConnection)packetWrapper.user());
        packetWrapper2.write((Type)Types.VAR_INT, (Object)n);
        packetWrapper2.write(Types1_14.ENTITY_DATA_LIST, (Object)list);
        packetWrapper2.send(Protocol1_14_4To1_15.class);
    }

    public int newEntityId(int n) {
        return n >= 4 ? n + 1 : n;
    }

    protected void registerRewrites() {
        this.registerEntityDataTypeHandler(Types1_14.ENTITY_DATA_TYPES.itemType, Types1_14.ENTITY_DATA_TYPES.optionalBlockStateType, Types1_14.ENTITY_DATA_TYPES.particleType);
        this.registerBlockStateHandler((EntityType)EntityTypes1_15.ABSTRACT_MINECART, 10);
        this.filter().type((EntityType)EntityTypes1_15.LIVING_ENTITY).addIndex(12);
        int n = 18;
        EntityDataFilter.Builder builder = this.filter().type((EntityType)EntityTypes1_15.WOLF);
        this.redirect$dhf000$viafabricplus$removeAndTrackHealth(builder, n);
    }

    protected void registerPackets() {
        ((Protocol1_14_4To1_15)this.protocol).replaceClientbound(ClientboundPackets1_14_4.ADD_MOB, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_15 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.map((Type)Types.SHORT);
                this.handler(this.this$0.trackerHandler());
                this.handler(wrapper -> this.this$0.sendEntityDataPacket(wrapper, (Integer)wrapper.get((Type)Types.VAR_INT, 0)));
            }
        });
        ((Protocol1_14_4To1_15)this.protocol).registerClientbound(ClientboundPackets1_14_4.ADD_PLAYER, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_15 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    int entityId = (Integer)wrapper.get((Type)Types.VAR_INT, 0);
                    wrapper.user().getEntityTracker(Protocol1_14_4To1_15.class).addEntity(entityId, (EntityType)EntityTypes1_15.PLAYER);
                    this.this$0.sendEntityDataPacket(wrapper, entityId);
                });
            }
        });
        ((Protocol1_14_4To1_15)this.protocol).registerClientbound(ClientboundPackets1_14_4.RESPAWN, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_15 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.INT);
                this.handler(wrapper -> {
                    int dimensionId;
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_14_4To1_15.class);
                    if (clientWorld.setEnvironment(dimensionId = ((Integer)wrapper.get((Type)Types.INT, 0)).intValue())) {
                        this.this$0.tracker(wrapper.user()).clearEntities();
                    }
                    wrapper.write((Type)Types.LONG, (Object)0L);
                });
            }
        });
        ((Protocol1_14_4To1_15)this.protocol).registerClientbound(ClientboundPackets1_14_4.LOGIN, (PacketHandler)new PacketHandlers(this){
            final /* synthetic */ EntityPacketRewriter1_15 this$0;
            {
                this.this$0 = this$0;
            }

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.INT);
                this.handler(this.this$0.playerTrackerHandler());
                this.handler(wrapper -> wrapper.write((Type)Types.LONG, (Object)0L));
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map(Types.STRING);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> wrapper.write((Type)Types.BOOLEAN, (Object)(!Via.getConfig().is1_15InstantRespawn() ? 1 : 0)));
                this.handler(wrapper -> {
                    int dimension = (Integer)wrapper.get((Type)Types.INT, 1);
                    ClientWorld clientWorld = wrapper.user().getClientWorld(Protocol1_14_4To1_15.class);
                    clientWorld.setEnvironment(dimension);
                });
            }
        });
        this.registerSetEntityData(ClientboundPackets1_14_4.SET_ENTITY_DATA, Types1_14.ENTITY_DATA_LIST);
    }

    public EntityType typeFromId(int n) {
        return EntityTypes1_15.getTypeFromId((int)n);
    }

    private void redirect$dhf000$viafabricplus$removeAndTrackHealth(EntityDataFilter.Builder builder, int n) {
        builder.handler((entityDataHandlerEvent, entityData) -> {
            int n2 = entityDataHandlerEvent.index();
            if (n2 == n) {
                ((WolfHealthTracker1_14_4)entityDataHandlerEvent.user().get(WolfHealthTracker1_14_4.class)).setWolfHealth(entityDataHandlerEvent.entityId(), ((Float)entityData.value()).floatValue());
                entityDataHandlerEvent.cancel();
            } else if (n2 > n) {
                entityDataHandlerEvent.setIndex(n2 - 1);
            }
        });
    }
}

