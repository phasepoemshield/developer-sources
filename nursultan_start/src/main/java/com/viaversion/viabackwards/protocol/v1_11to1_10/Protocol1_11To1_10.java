/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_11to1_10.storage.WindowTracker
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11$EntityType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 */
package com.viaversion.viabackwards.protocol.v1_11to1_10;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_11to1_10.rewriter.BlockItemPacketRewriter1_11;
import com.viaversion.viabackwards.protocol.v1_11to1_10.rewriter.EntityPacketRewriter1_11;
import com.viaversion.viabackwards.protocol.v1_11to1_10.rewriter.PlayerPacketRewriter1_11;
import com.viaversion.viabackwards.protocol.v1_11to1_10.storage.WindowTracker;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_11;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;

public class Protocol1_11To1_10
extends BackwardsProtocol<ClientboundPackets1_9_3, ClientboundPackets1_9_3, ServerboundPackets1_9_3, ServerboundPackets1_9_3> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.11", "1.10");
    private final EntityPacketRewriter1_11 entityRewriter = new EntityPacketRewriter1_11(this);
    private final BlockItemPacketRewriter1_11 itemRewriter = new BlockItemPacketRewriter1_11(this);
    private JsonNBTComponentRewriter<ClientboundPackets1_9_3> componentRewriter;

    public Protocol1_11To1_10() {
        super(ClientboundPackets1_9_3.class, ClientboundPackets1_9_3.class, ServerboundPackets1_9_3.class, ServerboundPackets1_9_3.class);
    }

    public void init(UserConnection user) {
        user.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_11.EntityType.PLAYER));
        user.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
        if (!user.has(WindowTracker.class)) {
            user.put((StorableObject)new WindowTracker());
        }
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_9_3> getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void registerPackets() {
        this.entityRewriter.register();
        this.itemRewriter.register();
        PlayerPacketRewriter1_11.register(this);
        this.componentRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
        this.componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_9_3.CHAT);
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_11 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_11 getEntityRewriter() {
        return this.entityRewriter;
    }
}

