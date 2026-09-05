/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.BlockItemPacketRewriter1_14
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.CommandRewriter1_14
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.EntityPacketRewriter1_14
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.PlayerPacketRewriter1_14
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.SoundPacketRewriter1_14
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.ChunkLightStorage
 *  com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.DifficultyStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 */
package com.viaversion.viabackwards.protocol.v1_14to1_13_2;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.data.BackwardsMappingData1_14;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.BlockItemPacketRewriter1_14;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.CommandRewriter1_14;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.EntityPacketRewriter1_14;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.PlayerPacketRewriter1_14;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.rewriter.SoundPacketRewriter1_14;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.ChunkLightStorage;
import com.viaversion.viabackwards.protocol.v1_14to1_13_2.storage.DifficultyStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_14;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ServerboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;

public class Protocol1_14To1_13_2
extends BackwardsProtocol<ClientboundPackets1_14, ClientboundPackets1_13, ServerboundPackets1_14, ServerboundPackets1_13> {
    public static final BackwardsMappingData1_14 MAPPINGS = new BackwardsMappingData1_14();
    private final EntityPacketRewriter1_14 entityRewriter = new EntityPacketRewriter1_14(this);
    private final BlockItemPacketRewriter1_14 itemRewriter = new BlockItemPacketRewriter1_14(this);
    private final BlockRewriter<ClientboundPackets1_14> blockRewriter = BlockRewriter.legacy((Protocol)this);
    private final ParticleRewriter<ClientboundPackets1_14> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_14> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
    private final TagRewriter<ClientboundPackets1_14> tagRewriter = new TagRewriter((Protocol)this);

    public Protocol1_14To1_13_2() {
        super(ClientboundPackets1_14.class, ClientboundPackets1_13.class, ServerboundPackets1_14.class, ServerboundPackets1_13.class);
    }

    public void init(UserConnection user) {
        user.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_14.PLAYER));
        user.addClientWorld(((Object)((Object)this)).getClass(), new ClientWorld());
        if (!user.has(ChunkLightStorage.class)) {
            user.put((StorableObject)new ChunkLightStorage());
        }
        user.put((StorableObject)new DifficultyStorage());
    }

    private static boolean isSet(int mask, int i) {
        return (mask & 1 << i) != 0;
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_14> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_14> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        new CommandRewriter1_14(this).registerDeclareCommands((ClientboundPacketType)ClientboundPackets1_14.COMMANDS);
        new PlayerPacketRewriter1_14(this).register();
        new SoundPacketRewriter1_14(this).register();
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_14.SET_CHUNK_CACHE_CENTER);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_14.SET_CHUNK_CACHE_RADIUS);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_14.UPDATE_TAGS, wrapper -> {
            this.tagRewriter.handle(wrapper, RegistryType.BLOCK);
            this.tagRewriter.handle(wrapper, RegistryType.ITEM);
            this.tagRewriter.handle(wrapper, RegistryType.FLUID);
            int entityTagsSize = (Integer)wrapper.read((Type)Types.VAR_INT);
            for (int i = 0; i < entityTagsSize; ++i) {
                wrapper.read(Types.STRING);
                wrapper.read(Types.VAR_INT_ARRAY_PRIMITIVE);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_14.LIGHT_UPDATE, null, wrapper -> {
            int x = (Integer)wrapper.read((Type)Types.VAR_INT);
            int z = (Integer)wrapper.read((Type)Types.VAR_INT);
            int skyLightMask = (Integer)wrapper.read((Type)Types.VAR_INT);
            int blockLightMask = (Integer)wrapper.read((Type)Types.VAR_INT);
            int emptySkyLightMask = (Integer)wrapper.read((Type)Types.VAR_INT);
            int emptyBlockLightMask = (Integer)wrapper.read((Type)Types.VAR_INT);
            byte[][] skyLight = new byte[16][];
            if (Protocol1_14To1_13_2.isSet(skyLightMask, 0)) {
                wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
            }
            for (int i = 0; i < 16; ++i) {
                if (Protocol1_14To1_13_2.isSet(skyLightMask, i + 1)) {
                    skyLight[i] = (byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                    continue;
                }
                if (!Protocol1_14To1_13_2.isSet(emptySkyLightMask, i + 1)) continue;
                skyLight[i] = ChunkLightStorage.EMPTY_LIGHT;
            }
            if (Protocol1_14To1_13_2.isSet(skyLightMask, 17)) {
                wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
            }
            byte[][] blockLight = new byte[16][];
            if (Protocol1_14To1_13_2.isSet(blockLightMask, 0)) {
                wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
            }
            for (int i = 0; i < 16; ++i) {
                if (Protocol1_14To1_13_2.isSet(blockLightMask, i + 1)) {
                    blockLight[i] = (byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                    continue;
                }
                if (!Protocol1_14To1_13_2.isSet(emptyBlockLightMask, i + 1)) continue;
                blockLight[i] = ChunkLightStorage.EMPTY_LIGHT;
            }
            if (Protocol1_14To1_13_2.isSet(blockLightMask, 17)) {
                wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
            }
            ((ChunkLightStorage)wrapper.user().get(ChunkLightStorage.class)).setStoredLight((byte[][])skyLight, (byte[][])blockLight, x, z);
            wrapper.cancel();
        });
    }

    public TagRewriter<ClientboundPackets1_14> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_14> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_14 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_14 getEntityRewriter() {
        return this.entityRewriter;
    }
}

