/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_17to1_16_4.storage.PlayerLastCursorItem
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.TagData
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.fastutil.ints.IntArrayList
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.IdRewriteFunction
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viabackwards.protocol.v1_17to1_16_4;

import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.rewriter.BlockItemPacketRewriter1_17;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.rewriter.EntityPacketRewriter1_17;
import com.viaversion.viabackwards.protocol.v1_17to1_16_4.storage.PlayerLastCursorItem;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.TagData;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_17;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.fastutil.ints.IntArrayList;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ClientboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.Protocol1_16_4To1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ClientboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.IdRewriteFunction;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.Key;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public final class Protocol1_17To1_16_4
extends BackwardsProtocol<ClientboundPackets1_17, ClientboundPackets1_16_2, ServerboundPackets1_17, ServerboundPackets1_16_2> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.17", "1.16.2", Protocol1_16_4To1_17.class);
    private static final RegistryType[] TAG_REGISTRY_TYPES = new RegistryType[]{RegistryType.BLOCK, RegistryType.ITEM, RegistryType.FLUID, RegistryType.ENTITY};
    private static final int[] EMPTY_ARRAY = new int[0];
    private final EntityPacketRewriter1_17 entityRewriter = new EntityPacketRewriter1_17(this);
    private final BlockItemPacketRewriter1_17 blockItemPackets = new BlockItemPacketRewriter1_17(this);
    private final ParticleRewriter<ClientboundPackets1_17> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_17> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
    private final TagRewriter<ClientboundPackets1_17> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_17> blockRewriter = BlockRewriter.for1_14((Protocol)this);

    public Protocol1_17To1_16_4() {
        super(ClientboundPackets1_17.class, ClientboundPackets1_16_2.class, ServerboundPackets1_17.class, ServerboundPackets1_16_2.class);
    }

    public void init(UserConnection user) {
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_17.PLAYER));
        user.put((StorableObject)new PlayerLastCursorItem());
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_17> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_17> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17.UPDATE_TAGS, wrapper -> {
            HashMap tags = new HashMap();
            int length = (Integer)wrapper.read((Type)Types.VAR_INT);
            for (int i = 0; i < length; ++i) {
                String resourceKey = Key.stripMinecraftNamespace((String)((String)wrapper.read(Types.STRING)));
                ArrayList<TagData> tagList = new ArrayList<TagData>();
                tags.put(resourceKey, tagList);
                int tagLength = (Integer)wrapper.read((Type)Types.VAR_INT);
                for (int j = 0; j < tagLength; ++j) {
                    String identifier = (String)wrapper.read(Types.STRING);
                    int[] entries = (int[])wrapper.read(Types.VAR_INT_ARRAY_PRIMITIVE);
                    tagList.add(new TagData(identifier, entries));
                }
            }
            for (RegistryType type : TAG_REGISTRY_TYPES) {
                List tagList = (List)tags.get(type.identifier());
                if (tagList == null) {
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                    continue;
                }
                IdRewriteFunction rewriter = this.tagRewriter.getRewriter(type);
                wrapper.write((Type)Types.VAR_INT, (Object)tagList.size());
                for (TagData tagData : tagList) {
                    int[] entries = tagData.entries();
                    if (rewriter != null) {
                        IntArrayList idList = new IntArrayList(entries.length);
                        for (int id : entries) {
                            int mappedId = rewriter.rewrite(id);
                            if (mappedId == -1) continue;
                            idList.add(mappedId);
                        }
                        entries = idList.toArray(EMPTY_ARRAY);
                    }
                    wrapper.write(Types.STRING, (Object)tagData.identifier());
                    wrapper.write(Types.VAR_INT_ARRAY_PRIMITIVE, (Object)entries);
                }
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17.RESOURCE_PACK, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.read((Type)Types.BOOLEAN);
            wrapper.read(Types.OPTIONAL_COMPONENT);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17.EXPLODE, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> wrapper.write((Type)Types.INT, (Object)((Integer)wrapper.read((Type)Types.VAR_INT))));
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17.SET_DEFAULT_SPAWN_POSITION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BLOCK_POSITION1_14);
                this.handler(wrapper -> wrapper.read((Type)Types.FLOAT));
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17.PING, null, wrapper -> {
            wrapper.cancel();
            int id = (Integer)wrapper.read((Type)Types.INT);
            short shortId = (short)id;
            if (id == shortId && ViaBackwards.getConfig().handlePingsAsInvAcknowledgements()) {
                PacketWrapper acknowledgementPacket = wrapper.create((PacketType)ClientboundPackets1_16_2.CONTAINER_ACK);
                acknowledgementPacket.write((Type)Types.UNSIGNED_BYTE, (Object)0);
                acknowledgementPacket.write((Type)Types.SHORT, (Object)shortId);
                acknowledgementPacket.write((Type)Types.BOOLEAN, (Object)false);
                acknowledgementPacket.send(Protocol1_17To1_16_4.class);
                return;
            }
            PacketWrapper pongPacket = wrapper.create((PacketType)ServerboundPackets1_17.PONG);
            pongPacket.write((Type)Types.INT, (Object)id);
            pongPacket.sendToServer(Protocol1_17To1_16_4.class);
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_16_2.CLIENT_INFORMATION, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.UNSIGNED_BYTE);
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> wrapper.write((Type)Types.BOOLEAN, (Object)false));
            }
        });
        this.rewriteTitlePacket(ClientboundPackets1_17.SET_TITLE_TEXT, 0);
        this.rewriteTitlePacket(ClientboundPackets1_17.SET_SUBTITLE_TEXT, 1);
        this.rewriteTitlePacket(ClientboundPackets1_17.SET_ACTION_BAR_TEXT, 2);
        this.mergePacket(ClientboundPackets1_17.SET_TITLES_ANIMATION, ClientboundPackets1_16_2.SET_TITLES, 3);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_17.CLEAR_TITLES, (ClientboundPacketType)ClientboundPackets1_16_2.SET_TITLES, wrapper -> {
            if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                wrapper.write((Type)Types.VAR_INT, (Object)5);
            } else {
                wrapper.write((Type)Types.VAR_INT, (Object)4);
            }
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_17.ADD_VIBRATION_SIGNAL);
    }

    public TagRewriter<ClientboundPackets1_17> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_17> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_17 getItemRewriter() {
        return this.blockItemPackets;
    }

    public EntityPacketRewriter1_17 getEntityRewriter() {
        return this.entityRewriter;
    }

    private void rewriteTitlePacket(ClientboundPackets1_17 newPacketType, int type) {
        this.registerClientbound((ClientboundPacketType)newPacketType, (ClientboundPacketType)ClientboundPackets1_16_2.SET_TITLES, wrapper -> {
            wrapper.write((Type)Types.VAR_INT, (Object)type);
            this.translatableRewriter.processText(wrapper.user(), (JsonElement)wrapper.passthrough(Types.COMPONENT));
        });
    }

    public void mergePacket(ClientboundPackets1_17 newPacketType, ClientboundPackets1_16_2 oldPacketType, int type) {
        this.registerClientbound((ClientboundPacketType)newPacketType, (ClientboundPacketType)oldPacketType, wrapper -> wrapper.write((Type)Types.VAR_INT, (Object)type));
    }
}

