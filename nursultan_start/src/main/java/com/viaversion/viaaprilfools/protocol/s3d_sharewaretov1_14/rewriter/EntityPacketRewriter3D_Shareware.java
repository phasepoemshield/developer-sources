/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.entitydata.EntityData
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.rewriter.RewriterBase
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.version.Types1_14
 */
package com.viaversion.viaaprilfools.protocol.s3d_sharewaretov1_14.rewriter;

import com.viaversion.viaaprilfools.protocol.s3d_sharewaretov1_14.Protocol3D_SharewareTo1_14;
import com.viaversion.viaaprilfools.protocol.s3d_sharewaretov1_14.packet.ClientboundPackets3D_Shareware;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.entitydata.EntityData;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.rewriter.RewriterBase;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.version.Types1_14;
import java.util.List;

public class EntityPacketRewriter3D_Shareware
extends RewriterBase<Protocol3D_SharewareTo1_14> {
    public EntityPacketRewriter3D_Shareware(Protocol3D_SharewareTo1_14 protocol) {
        super((Protocol)protocol);
    }

    public void handleEntityData(UserConnection user, List<EntityData> entityDataList) {
        for (EntityData entityData : entityDataList) {
            if (entityData.dataType() != Types1_14.ENTITY_DATA_TYPES.itemType) continue;
            entityData.setValue((Object)((Protocol3D_SharewareTo1_14)this.protocol).getItemRewriter().handleItemToClient(user, (Item)entityData.value()));
        }
    }

    public void registerPackets() {
        ((Protocol3D_SharewareTo1_14)this.protocol).registerClientbound(ClientboundPackets3D_Shareware.ADD_MOB, (PacketHandler)new PacketHandlers(){

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
                this.handler(packetWrapper -> EntityPacketRewriter3D_Shareware.this.handleEntityData(packetWrapper.user(), (List)packetWrapper.get(Types1_14.ENTITY_DATA_LIST, 0)));
            }
        });
        ((Protocol3D_SharewareTo1_14)this.protocol).registerClientbound(ClientboundPackets3D_Shareware.ADD_PLAYER, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.UUID);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.DOUBLE);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types1_14.ENTITY_DATA_LIST);
                this.handler(packetWrapper -> EntityPacketRewriter3D_Shareware.this.handleEntityData(packetWrapper.user(), (List)packetWrapper.get(Types1_14.ENTITY_DATA_LIST, 0)));
            }
        });
        ((Protocol3D_SharewareTo1_14)this.protocol).registerClientbound(ClientboundPackets3D_Shareware.SET_ENTITY_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types1_14.ENTITY_DATA_LIST);
                this.handler(packetWrapper -> EntityPacketRewriter3D_Shareware.this.handleEntityData(packetWrapper.user(), (List)packetWrapper.get(Types1_14.ENTITY_DATA_LIST, 0)));
            }
        });
    }
}

