/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 *  com.viaversion.viaversion.rewriter.EntityRewriter
 */
package com.viaversion.viaversion.protocols.v1_14to1_14_1.rewriter;

import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14to1_14_1.Protocol1_14To1_14_1;
import com.viaversion.viaversion.rewriter.EntityRewriter;

public class EntityPacketRewriter1_14_1
extends EntityRewriter<ClientboundPackets1_14, Protocol1_14To1_14_1> {
    public EntityPacketRewriter1_14_1(Protocol1_14To1_14_1 protocol) {
        super((Protocol)protocol);
    }

    protected void registerRewrites() {
        this.filter().type((EntityType)EntityTypes1_14.VILLAGER).addIndex(15);
        this.filter().type((EntityType)EntityTypes1_14.WANDERING_TRADER).addIndex(15);
    }

    protected void registerPackets() {
        ((Protocol1_14To1_14_1)this.protocol).registerClientbound(ClientboundPackets1_14.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.map(Types1_14.ENTITY_DATA_LIST);
                this.handler(EntityPacketRewriter1_14_1.this.trackerAndRewriterHandler(Types1_14.ENTITY_DATA_LIST));
            }
        });
        ((Protocol1_14To1_14_1)this.protocol).registerClientbound(ClientboundPackets1_14.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types1_14.ENTITY_DATA_LIST);
                this.handler(EntityPacketRewriter1_14_1.this.trackerAndRewriterHandler(Types1_14.ENTITY_DATA_LIST, (EntityType)EntityTypes1_14.PLAYER));
            }
        });
        this.registerSetEntityData(ClientboundPackets1_14.SET_ENTITY_DATA, Types1_14.ENTITY_DATA_LIST);
    }

    public EntityType typeFromId(int type) {
        return EntityTypes1_14.getTypeFromId((int)type);
    }
}

