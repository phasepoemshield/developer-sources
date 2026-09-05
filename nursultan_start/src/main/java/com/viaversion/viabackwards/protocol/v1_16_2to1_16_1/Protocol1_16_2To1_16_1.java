/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.storage.BiomeStorage
 *  com.viaversion.viabackwards.utils.BackwardsProtocolLogger
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.Protocol1_16_1To1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.ProtocolLogger
 */
package com.viaversion.viabackwards.protocol.v1_16_2to1_16_1;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.rewriter.BlockItemPacketRewriter1_16_2;
import com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.rewriter.CommandRewriter1_16_2;
import com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.rewriter.EntityPacketRewriter1_16_2;
import com.viaversion.viabackwards.protocol.v1_16_2to1_16_1.storage.BiomeStorage;
import com.viaversion.viabackwards.utils.BackwardsProtocolLogger;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16_2;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.Protocol1_16_1To1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.ProtocolLogger;

public class Protocol1_16_2To1_16_1
extends BackwardsProtocol<ClientboundPackets1_16_2, ClientboundPackets1_16, ServerboundPackets1_16_2, ServerboundPackets1_16> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.16.2", "1.16", Protocol1_16_1To1_16_2.class);
    public static final ProtocolLogger LOGGER = new BackwardsProtocolLogger(Protocol1_16_2To1_16_1.class);
    private final EntityPacketRewriter1_16_2 entityRewriter = new EntityPacketRewriter1_16_2(this);
    private final BlockItemPacketRewriter1_16_2 blockItemPackets = new BlockItemPacketRewriter1_16_2(this);
    private final BlockRewriter<ClientboundPackets1_16_2> blockRewriter = BlockRewriter.for1_14((Protocol)this);
    private final ParticleRewriter<ClientboundPackets1_16_2> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_16_2> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
    private final TagRewriter<ClientboundPackets1_16_2> tagRewriter = new TagRewriter((Protocol)this);

    public Protocol1_16_2To1_16_1() {
        super(ClientboundPackets1_16_2.class, ClientboundPackets1_16.class, ServerboundPackets1_16_2.class, ServerboundPackets1_16.class);
    }

    public void init(UserConnection user) {
        user.put((StorableObject)new BiomeStorage());
        user.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_16_2.PLAYER));
    }

    public ProtocolLogger getLogger() {
        return LOGGER;
    }

    private static void sendSeenRecipePacket(int recipeType, PacketWrapper wrapper) {
        boolean open = (Boolean)wrapper.read((Type)Types.BOOLEAN);
        boolean filter = (Boolean)wrapper.read((Type)Types.BOOLEAN);
        PacketWrapper newPacket = wrapper.create((PacketType)ServerboundPackets1_16_2.RECIPE_BOOK_CHANGE_SETTINGS);
        newPacket.write((Type)Types.VAR_INT, (Object)recipeType);
        newPacket.write((Type)Types.BOOLEAN, (Object)open);
        newPacket.write((Type)Types.BOOLEAN, (Object)filter);
        newPacket.sendToServer(Protocol1_16_2To1_16_1.class);
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_16_2> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_16_2> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        new CommandRewriter1_16_2(this).registerDeclareCommands((ClientboundPacketType)ClientboundPackets1_16_2.COMMANDS);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_16_2.CHAT, wrapper -> {
            JsonElement message = (JsonElement)wrapper.passthrough(Types.COMPONENT);
            this.translatableRewriter.processText(wrapper.user(), message);
            byte position = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (position == 2) {
                wrapper.clearPacket();
                wrapper.setPacketType((PacketType)ClientboundPackets1_16.SET_TITLES);
                wrapper.write((Type)Types.VAR_INT, (Object)2);
                wrapper.write(Types.COMPONENT, (Object)message);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_16.RECIPE_BOOK_UPDATE, (ServerboundPacketType)ServerboundPackets1_16_2.RECIPE_BOOK_CHANGE_SETTINGS, wrapper -> {
            int type = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (type == 0) {
                wrapper.passthrough(Types.STRING);
                wrapper.setPacketType((PacketType)ServerboundPackets1_16_2.RECIPE_BOOK_SEEN_RECIPE);
            } else {
                wrapper.cancel();
                for (int i = 0; i < 3; ++i) {
                    Protocol1_16_2To1_16_1.sendSeenRecipePacket(i, wrapper);
                }
            }
        });
        this.tagRewriter.register((ClientboundPacketType)ClientboundPackets1_16_2.UPDATE_TAGS, RegistryType.ENTITY);
    }

    public TagRewriter<ClientboundPackets1_16_2> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_16_2> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_16_2 getItemRewriter() {
        return this.blockItemPackets;
    }

    public EntityPacketRewriter1_16_2 getEntityRewriter() {
        return this.entityRewriter;
    }
}

