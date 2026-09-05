/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.storage.EntityTracker1_19_4
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.Protocol1_19_3To1_19_4
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.CommandRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 */
package com.viaversion.viabackwards.protocol.v1_19_4to1_19_3;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.rewriter.BlockItemPacketRewriter1_19_4;
import com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.rewriter.EntityPacketRewriter1_19_4;
import com.viaversion.viabackwards.protocol.v1_19_4to1_19_3.storage.EntityTracker1_19_4;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.Protocol1_19_3To1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ClientboundPackets1_19_4;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.packet.ServerboundPackets1_19_4;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.CommandRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

public final class Protocol1_19_4To1_19_3
extends BackwardsProtocol<ClientboundPackets1_19_4, ClientboundPackets1_19_3, ServerboundPackets1_19_4, ServerboundPackets1_19_3> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.19.4", "1.19.3", Protocol1_19_3To1_19_4.class);
    private final EntityPacketRewriter1_19_4 entityRewriter = new EntityPacketRewriter1_19_4(this);
    private final BlockItemPacketRewriter1_19_4 itemRewriter = new BlockItemPacketRewriter1_19_4(this);
    private final ParticleRewriter<ClientboundPackets1_19_4> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_19_4> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
    private final TagRewriter<ClientboundPackets1_19_4> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_19_4> blockRewriter = BlockRewriter.for1_18((Protocol)this, ChunkType1_18::new);

    public Protocol1_19_4To1_19_3() {
        super(ClientboundPackets1_19_4.class, ClientboundPackets1_19_3.class, ServerboundPackets1_19_4.class, ServerboundPackets1_19_3.class);
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTracker1_19_4(user));
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_19_4> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_19_4> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        CommandRewriter<ClientboundPackets1_19_4> commandRewriter = new CommandRewriter<ClientboundPackets1_19_4>((Protocol)this){

            public void handleArgument(PacketWrapper wrapper, String argumentType) {
                switch (argumentType) {
                    case "minecraft:heightmap": {
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                        break;
                    }
                    case "minecraft:time": {
                        wrapper.read((Type)Types.INT);
                        break;
                    }
                    case "minecraft:resource": 
                    case "minecraft:resource_or_tag": {
                        String resource = (String)wrapper.read(Types.STRING);
                        wrapper.write(Types.STRING, (Object)(resource.equals("minecraft:damage_type") ? "minecraft:mob_effect" : resource));
                        break;
                    }
                    default: {
                        super.handleArgument(wrapper, argumentType);
                    }
                }
            }
        };
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_4.COMMANDS, arg_0 -> ((CommandRewriter)commandRewriter).handle1_19(arg_0));
        this.tagRewriter.removeTags("minecraft:damage_type");
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_4.SERVER_DATA, wrapper -> {
            JsonElement element = (JsonElement)wrapper.read(Types.COMPONENT);
            this.translatableRewriter.processText(wrapper.user(), element);
            wrapper.write(Types.OPTIONAL_COMPONENT, (Object)element);
            byte[] iconBytes = (byte[])wrapper.read(Types.OPTIONAL_BYTE_ARRAY_PRIMITIVE);
            String iconBase64 = iconBytes != null ? "data:image/png;base64," + new String(Base64.getEncoder().encode(iconBytes), StandardCharsets.UTF_8) : null;
            wrapper.write(Types.OPTIONAL_STRING, iconBase64);
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_19_4.BUNDLE_DELIMITER);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_19_4.CHUNKS_BIOMES);
    }

    public TagRewriter<ClientboundPackets1_19_4> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_19_4> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_19_4 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_19_4 getEntityRewriter() {
        return this.entityRewriter;
    }
}

