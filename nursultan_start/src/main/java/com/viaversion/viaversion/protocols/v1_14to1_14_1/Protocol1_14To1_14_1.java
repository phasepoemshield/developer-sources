/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 */
package com.viaversion.viaversion.protocols.v1_14to1_14_1;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14to1_14_1.rewriter.EntityPacketRewriter1_14_1;

public class Protocol1_14To1_14_1
extends AbstractProtocol<ClientboundPackets1_14, ClientboundPackets1_14, ServerboundPackets1_14, ServerboundPackets1_14> {
    private final EntityPacketRewriter1_14_1 entityRewriter = new EntityPacketRewriter1_14_1(this);

    public Protocol1_14To1_14_1() {
        super(ClientboundPackets1_14.class, ClientboundPackets1_14.class, ServerboundPackets1_14.class, ServerboundPackets1_14.class);
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_14.PLAYER));
    }

    protected void registerPackets() {
        this.entityRewriter.register();
    }

    public EntityPacketRewriter1_14_1 getEntityRewriter() {
        return this.entityRewriter;
    }
}

