/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 */
package com.viaversion.viabackwards.protocol.v1_14_1to1_14;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.protocol.v1_14_1to1_14.rewriter.EntityPacketRewriter1_14_1;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;

public class Protocol1_14_1To1_14
extends BackwardsProtocol<ClientboundPackets1_14, ClientboundPackets1_14, ServerboundPackets1_14, ServerboundPackets1_14> {
    private final EntityPacketRewriter1_14_1 entityRewriter = new EntityPacketRewriter1_14_1(this);

    public Protocol1_14_1To1_14() {
        super(ClientboundPackets1_14.class, ClientboundPackets1_14.class, ServerboundPackets1_14.class, ServerboundPackets1_14.class);
    }

    public void init(UserConnection user) {
        user.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_15.PLAYER));
        user.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
    }

    protected void registerPackets() {
        this.entityRewriter.register();
    }

    public EntityPacketRewriter1_14_1 getEntityRewriter() {
        return this.entityRewriter;
    }
}

