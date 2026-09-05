/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.protocol.v1_12to1_11_1.storage.ShoulderTracker
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12$EntityType
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ClientboundPackets1_12
 *  com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ServerboundPackets1_12
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.SerializerVersion
 */
package com.viaversion.viabackwards.protocol.v1_12to1_11_1;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.rewriter.BlockItemPacketRewriter1_12;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.rewriter.ComponentRewriter1_12;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.rewriter.EntityPacketRewriter1_12;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.rewriter.SoundPacketRewriter1_12;
import com.viaversion.viabackwards.protocol.v1_12to1_11_1.storage.ShoulderTracker;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_12;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ClientboundPackets1_12;
import com.viaversion.viaversion.protocols.v1_11_1to1_12.packet.ServerboundPackets1_12;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ServerboundPackets1_9_3;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.SerializerVersion;

public class Protocol1_12To1_11_1
extends BackwardsProtocol<ClientboundPackets1_12, ClientboundPackets1_9_3, ServerboundPackets1_12, ServerboundPackets1_9_3> {
    private static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.12", "1.11");
    private final EntityPacketRewriter1_12 entityRewriter = new EntityPacketRewriter1_12(this);
    private final BlockItemPacketRewriter1_12 itemRewriter = new BlockItemPacketRewriter1_12(this);
    private final ComponentRewriter1_12 componentRewriter = new ComponentRewriter1_12(this);

    public Protocol1_12To1_11_1() {
        super(ClientboundPackets1_12.class, ClientboundPackets1_9_3.class, ServerboundPackets1_12.class, ServerboundPackets1_9_3.class);
    }

    public void init(UserConnection user) {
        user.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_12.EntityType.PLAYER));
        user.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
        user.put((StorableObject)new ShoulderTracker(user));
    }

    public ComponentRewriter1_12 getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.componentRewriter.registerComponentPacket((ClientboundPacketType)ClientboundPackets1_12.CHAT);
        new SoundPacketRewriter1_12(this).register();
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_12.SET_TITLES, wrapper -> {
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action >= 0 && action <= 2) {
                String component = ((JsonElement)wrapper.read(Types.COMPONENT)).toString();
                wrapper.write(Types.COMPONENT, (Object)ComponentUtil.convertJsonOrEmpty((String)component, (SerializerVersion)SerializerVersion.V1_12, (SerializerVersion)SerializerVersion.V1_9));
            }
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_12.UPDATE_ADVANCEMENTS);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_12.RECIPE);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_12.SELECT_ADVANCEMENTS_TAB);
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_12 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_12 getEntityRewriter() {
        return this.entityRewriter;
    }
}

