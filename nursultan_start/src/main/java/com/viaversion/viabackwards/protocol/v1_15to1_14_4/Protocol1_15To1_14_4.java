/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_15to1_14_4.storage.ImmediateRespawnStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4
 *  com.viaversion.viaversion.protocols.v1_14_4to1_15.Protocol1_14_4To1_15
 *  com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 */
package com.viaversion.viabackwards.protocol.v1_15to1_14_4;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_15to1_14_4.rewriter.BlockItemPacketRewriter1_15;
import com.viaversion.viabackwards.protocol.v1_15to1_14_4.rewriter.EntityPacketRewriter1_15;
import com.viaversion.viabackwards.protocol.v1_15to1_14_4.storage.ImmediateRespawnStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_15;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.Protocol1_14_4To1_15;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;

public class Protocol1_15To1_14_4
extends BackwardsProtocol<ClientboundPackets1_15, ClientboundPackets1_14_4, ServerboundPackets1_14, ServerboundPackets1_14> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.15", "1.14", Protocol1_14_4To1_15.class);
    private final EntityPacketRewriter1_15 entityRewriter = new EntityPacketRewriter1_15(this);
    private final BlockItemPacketRewriter1_15 blockItemPackets = new BlockItemPacketRewriter1_15(this);
    private final BlockRewriter<ClientboundPackets1_15> blockRewriter = BlockRewriter.for1_14((Protocol)this);
    private final ParticleRewriter<ClientboundPackets1_15> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_15> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
    private final TagRewriter<ClientboundPackets1_15> tagRewriter = new TagRewriter((Protocol)this);

    public Protocol1_15To1_14_4() {
        super(ClientboundPackets1_15.class, ClientboundPackets1_14_4.class, ServerboundPackets1_14.class, ServerboundPackets1_14.class);
    }

    public void init(UserConnection user) {
        user.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_15.PLAYER));
        user.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
        user.put((StorableObject)new ImmediateRespawnStorage());
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_15> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_15> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_15.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> {
                    PacketWrapper soundPacket = wrapper.create((PacketType)ClientboundPackets1_14_4.SOUND);
                    soundPacket.write((Type)Types.VAR_INT, (Object)243);
                    soundPacket.write((Type)Types.VAR_INT, (Object)4);
                    soundPacket.write((Type)Types.INT, (Object)this.toEffectCoordinate(((Float)wrapper.get((Type)Types.FLOAT, 0)).floatValue()));
                    soundPacket.write((Type)Types.INT, (Object)this.toEffectCoordinate(((Float)wrapper.get((Type)Types.FLOAT, 1)).floatValue()));
                    soundPacket.write((Type)Types.INT, (Object)this.toEffectCoordinate(((Float)wrapper.get((Type)Types.FLOAT, 2)).floatValue()));
                    soundPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(4.0f));
                    soundPacket.write((Type)Types.FLOAT, (Object)Float.valueOf(1.0f));
                    soundPacket.send(Protocol1_15To1_14_4.class);
                });
            }

            private int toEffectCoordinate(float coordinate) {
                return (int)(coordinate * 8.0f);
            }
        });
        this.tagRewriter.register((ClientboundPacketType)ClientboundPackets1_15.UPDATE_TAGS, RegistryType.ENTITY);
    }

    public TagRewriter<ClientboundPackets1_15> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_15> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_15 getItemRewriter() {
        return this.blockItemPackets;
    }

    public EntityPacketRewriter1_15 getEntityRewriter() {
        return this.entityRewriter;
    }
}

