/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18
 *  com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 */
package com.viaversion.viabackwards.protocol.v1_18to1_17_1;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_18to1_17_1.data.BackwardsMappingData1_18;
import com.viaversion.viabackwards.protocol.v1_18to1_17_1.rewriter.BlockItemPacketRewriter1_18;
import com.viaversion.viabackwards.protocol.v1_18to1_17_1.rewriter.EntityPacketRewriter1_18;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_17to1_17_1.packet.ClientboundPackets1_17_1;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;

public final class Protocol1_18To1_17_1
extends BackwardsProtocol<ClientboundPackets1_18, ClientboundPackets1_17_1, ServerboundPackets1_17, ServerboundPackets1_17> {
    private static final BackwardsMappingData1_18 MAPPINGS = new BackwardsMappingData1_18();
    private final EntityPacketRewriter1_18 entityRewriter = new EntityPacketRewriter1_18(this);
    private final BlockItemPacketRewriter1_18 itemRewriter = new BlockItemPacketRewriter1_18(this);
    private final ParticleRewriter<ClientboundPackets1_18> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_18> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
    private final TagRewriter<ClientboundPackets1_18> tagRewriter = new TagRewriter((Protocol)this);

    public Protocol1_18To1_17_1() {
        super(ClientboundPackets1_18.class, ClientboundPackets1_17_1.class, ServerboundPackets1_17.class, ServerboundPackets1_17.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.tagRewriter.addEmptyTag(RegistryType.BLOCK, "minecraft:lava_pool_stone_replaceables");
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_17.CLIENT_INFORMATION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.create((Type)Types.BOOLEAN, true);
            }
        });
        this.appendClientbound((ClientboundPacketType)ClientboundPackets1_18.SET_OBJECTIVE, this.cutName(0, 16));
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_18.SET_DISPLAY_OBJECTIVE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.BYTE);
                this.map(Types.STRING);
                this.handler(Protocol1_18To1_17_1.this.cutName(0, 16));
            }
        });
        this.appendClientbound((ClientboundPacketType)ClientboundPackets1_18.SET_PLAYER_TEAM, this.cutName(0, 16));
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_18.SET_SCORE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.VAR_INT);
                this.map(Types.STRING);
                this.handler(Protocol1_18To1_17_1.this.cutName(0, 40));
                this.handler(Protocol1_18To1_17_1.this.cutName(1, 16));
            }
        });
    }

    private PacketHandler cutName(int index, int maxLength) {
        return wrapper -> {
            String s = (String)wrapper.get(Types.STRING, index);
            if (s.length() > maxLength) {
                wrapper.set(Types.STRING, index, (Object)s.substring(0, maxLength));
            }
        };
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_17.PLAYER));
    }

    public BackwardsMappingData1_18 getMappingData() {
        return MAPPINGS;
    }

    public EntityPacketRewriter1_18 getEntityRewriter() {
        return this.entityRewriter;
    }

    public BlockItemPacketRewriter1_18 getItemRewriter() {
        return this.itemRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_18> getParticleRewriter() {
        return this.particleRewriter;
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_18> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public TagRewriter<ClientboundPackets1_18> getTagRewriter() {
        return this.tagRewriter;
    }
}

