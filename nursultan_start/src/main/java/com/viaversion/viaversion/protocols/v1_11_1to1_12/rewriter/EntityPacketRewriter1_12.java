/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12$EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12$ObjectType
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.Protocol1_11_1To1_12
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_11_1to1_12.rewriter;

import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.Protocol1_11_1To1_12;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public class EntityPacketRewriter1_12
extends EntityRewriter<ClientboundPackets1_9_3, Protocol1_11_1To1_12> {
    public EntityPacketRewriter1_12(Protocol1_11_1To1_12 protocol) {
        super((Protocol)protocol);
    }

    public EntityType objectTypeFromId(int type, int data) {
        return EntityTypes1_12.ObjectType.getEntityType((int)type, (int)data);
    }

    protected void registerRewrites() {
        this.filter().handler((event, data) -> {
            if (data.getValue() instanceof Item) {
                data.setValue((Object)((Protocol1_11_1To1_12)this.protocol).getItemRewriter().handleItemToClient(event.user(), (Item)data.value()));
            }
        });
        this.filter().type((EntityType)EntityTypes1_12.EntityType.ABSTRACT_ILLAGER).addIndex(12);
    }

    protected void registerPackets() {
        ((Protocol1_11_1To1_12)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.LOGIN, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        ((Protocol1_11_1To1_12)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.RESPAWN, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        ((Protocol1_11_1To1_12)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.INT);
                this.handler(EntityPacketRewriter1_12.this.objectTrackerHandler());
            }
        });
        ((Protocol1_11_1To1_12)this.protocol).registerClientbound((ClientboundPacketType)ClientboundPackets1_9_3.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.map(Types.ENTITY_DATA_LIST1_9, Types.ENTITY_DATA_LIST1_12);
                this.handler(EntityPacketRewriter1_12.this.trackerAndRewriterHandler(Types.ENTITY_DATA_LIST1_12));
            }
        });
        this.registerRemoveEntities((ClientboundPacketType)ClientboundPackets1_9_3.REMOVE_ENTITIES);
        this.registerSetEntityData((ClientboundPacketType)ClientboundPackets1_9_3.SET_ENTITY_DATA, Types.ENTITY_DATA_LIST1_9, Types.ENTITY_DATA_LIST1_12);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_12.EntityType.findById((int)type);
    }
}

