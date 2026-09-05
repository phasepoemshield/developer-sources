/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_3
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_20_3
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.BlockItemPacketRewriter1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.EntityPacketRewriter1_20_3
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundConfigurationPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPacket1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPacket1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viaversion.protocols.v1_20_2to1_20_3;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_3;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_20_3;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.BlockItemPacketRewriter1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.EntityPacketRewriter1_20_3;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPacket1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPacket1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.ProtocolUtil;
import java.nio.charset.StandardCharsets;
import java.util.BitSet;
import java.util.UUID;

public final class Protocol1_20_2To1_20_3
extends AbstractProtocol<ClientboundPacket1_20_2, ClientboundPacket1_20_3, ServerboundPacket1_20_2, ServerboundPacket1_20_3> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.20.2", "1.20.3");
    private final BlockItemPacketRewriter1_20_3 itemRewriter = new BlockItemPacketRewriter1_20_3(this);
    private final ParticleRewriter<ClientboundPacket1_20_2> particleRewriter = new ParticleRewriter((Protocol)this);
    private final EntityPacketRewriter1_20_3 entityRewriter = new EntityPacketRewriter1_20_3(this);
    private final TagRewriter<ClientboundPacket1_20_2> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_20_2> blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_20_2::new);

    public Protocol1_20_2To1_20_3() {
        super(ClientboundPacket1_20_2.class, ClientboundPacket1_20_3.class, ServerboundPacket1_20_2.class, ServerboundPacket1_20_3.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        this.cancelServerbound((ServerboundPacketType)ServerboundPackets1_20_3.CONTAINER_SLOT_STATE_CHANGED);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SET_SCORE, wrapper -> {
            wrapper.passthrough(Types.STRING);
            int action = (Integer)wrapper.read((Type)Types.VAR_INT);
            String objectiveName = (String)wrapper.read(Types.STRING);
            if (action == 1) {
                wrapper.write(Types.OPTIONAL_STRING, (Object)(objectiveName.isEmpty() ? null : objectiveName));
                wrapper.setPacketType((PacketType)ClientboundPackets1_20_3.RESET_SCORE);
                return;
            }
            wrapper.write(Types.STRING, (Object)objectiveName);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.write(Types.TRUSTED_OPTIONAL_TAG, null);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SET_OBJECTIVE, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                this.convertComponent(wrapper);
                int render = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                if (render == 0 && Via.getConfig().hideScoreboardNumbers()) {
                    wrapper.write((Type)Types.BOOLEAN, (Object)true);
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                } else {
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                }
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_20_3.SET_JIGSAW_BLOCK, wrapper -> {
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.read((Type)Types.VAR_INT);
            wrapper.read((Type)Types.VAR_INT);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_2.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    this.convertComponent(wrapper);
                    this.convertComponent(wrapper);
                    this.itemRewriter.handleItemToClient(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_20_2));
                    wrapper.passthrough((Type)Types.VAR_INT);
                    int flags = (Integer)wrapper.passthrough((Type)Types.INT);
                    if ((flags & 1) != 0) {
                        wrapper.passthrough(Types.STRING);
                    }
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                int requirements = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int array = 0; array < requirements; ++array) {
                    wrapper.passthrough(Types.STRING_ARRAY);
                }
                wrapper.passthrough((Type)Types.BOOLEAN);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.COMMAND_SUGGESTIONS, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            int suggestions = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < suggestions; ++i) {
                wrapper.passthrough(Types.STRING);
                this.convertOptionalComponent(wrapper);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.MAP_ITEM_DATA, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BYTE);
            wrapper.passthrough((Type)Types.BOOLEAN);
            if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                int icons = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                for (int i = 0; i < icons; ++i) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BYTE);
                    wrapper.passthrough((Type)Types.BYTE);
                    this.convertOptionalComponent(wrapper);
                }
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.BOSS_EVENT, wrapper -> {
            wrapper.passthrough(Types.UUID);
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action == 0 || action == 3) {
                this.convertComponent(wrapper);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.PLAYER_CHAT, wrapper -> {
            wrapper.passthrough(Types.UUID);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.OPTIONAL_SIGNATURE_BYTES);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.LONG);
            wrapper.passthrough((Type)Types.LONG);
            int lastSeen = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < lastSeen; ++i) {
                int index = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                if (index != 0) continue;
                wrapper.passthrough((Type)Types.SIGNATURE_BYTES);
            }
            this.convertOptionalComponent(wrapper);
            int filterMaskType = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (filterMaskType == 2) {
                wrapper.passthrough(Types.LONG_ARRAY_PRIMITIVE);
            }
            wrapper.passthrough((Type)Types.VAR_INT);
            this.convertComponent(wrapper);
            this.convertOptionalComponent(wrapper);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SET_PLAYER_TEAM, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                this.convertComponent(wrapper);
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough((Type)Types.VAR_INT);
                this.convertComponent(wrapper);
                this.convertComponent(wrapper);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_2.DISCONNECT, this::convertComponent);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.DISCONNECT, this::convertComponent);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.RESOURCE_PACK, ClientboundPackets1_20_3.RESOURCE_PACK_PUSH, this.resourcePackHandler(ClientboundPackets1_20_3.RESOURCE_PACK_POP));
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SERVER_DATA, this::convertComponent);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SET_ACTION_BAR_TEXT, this::convertComponent);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SET_TITLE_TEXT, this::convertComponent);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SET_SUBTITLE_TEXT, this::convertComponent);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.DISGUISED_CHAT, wrapper -> {
            this.convertComponent(wrapper);
            wrapper.passthrough((Type)Types.VAR_INT);
            this.convertComponent(wrapper);
            this.convertOptionalComponent(wrapper);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.SYSTEM_CHAT, this::convertComponent);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_2.OPEN_SCREEN, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int containerTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
            wrapper.write((Type)Types.VAR_INT, (Object)MAPPINGS.getMenuMappings().getNewId(containerTypeId));
            this.convertComponent(wrapper);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.TAB_LIST, wrapper -> {
            this.convertComponent(wrapper);
            this.convertComponent(wrapper);
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.PLAYER_COMBAT_KILL, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> Protocol1_20_2To1_20_3.this.convertComponent(wrapper));
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_2.PLAYER_INFO_UPDATE, wrapper -> {
            BitSet actions = (BitSet)wrapper.passthrough((Type)Types.PROFILE_ACTIONS_ENUM1_19_3);
            int entries = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < entries; ++i) {
                wrapper.passthrough(Types.UUID);
                if (actions.get(0)) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                }
                if (actions.get(1) && ((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    wrapper.passthrough(Types.UUID);
                    wrapper.passthrough(Types.PROFILE_KEY);
                }
                if (actions.get(2)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                if (actions.get(3)) {
                    wrapper.passthrough((Type)Types.BOOLEAN);
                }
                if (actions.get(4)) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                if (!actions.get(5)) continue;
                this.convertOptionalComponent(wrapper);
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_20_3.RESOURCE_PACK, this.resourcePackStatusHandler());
        this.registerServerbound((ServerboundPacketType)ServerboundConfigurationPackets1_20_2.RESOURCE_PACK, this.resourcePackStatusHandler());
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_2.RESOURCE_PACK, ClientboundConfigurationPackets1_20_3.RESOURCE_PACK_PUSH, this.resourcePackHandler(ClientboundConfigurationPackets1_20_3.RESOURCE_PACK_POP));
    }

    private PacketHandler resourcePackStatusHandler() {
        return wrapper -> {
            wrapper.read(Types.UUID);
            int action = (Integer)wrapper.read((Type)Types.VAR_INT);
            if (action == 4) {
                wrapper.cancel();
            } else if (action > 4) {
                wrapper.write((Type)Types.VAR_INT, (Object)2);
            } else {
                wrapper.write((Type)Types.VAR_INT, (Object)action);
            }
        };
    }

    private PacketHandler resourcePackHandler(ClientboundPacketType popType) {
        return wrapper -> {
            PacketWrapper dropPacksPacket = wrapper.create((PacketType)popType);
            dropPacksPacket.write(Types.OPTIONAL_UUID, null);
            dropPacksPacket.send(Protocol1_20_2To1_20_3.class);
            String url = (String)wrapper.read(Types.STRING);
            String hash = (String)wrapper.read(Types.STRING);
            wrapper.write(Types.UUID, (Object)UUID.nameUUIDFromBytes(url.getBytes(StandardCharsets.UTF_8)));
            wrapper.write(Types.STRING, (Object)url);
            wrapper.write(Types.STRING, (Object)hash);
            wrapper.passthrough((Type)Types.BOOLEAN);
            this.convertOptionalComponent(wrapper);
        };
    }

    private void convertComponent(PacketWrapper wrapper) {
        wrapper.write(Types.TRUSTED_TAG, (Object)ComponentUtil.jsonToTag((JsonElement)((JsonElement)wrapper.read(Types.COMPONENT))));
    }

    private void convertOptionalComponent(PacketWrapper wrapper) {
        wrapper.write(Types.TRUSTED_OPTIONAL_TAG, (Object)ComponentUtil.jsonToTag((JsonElement)((JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT))));
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_20_3.initialize((Protocol)this);
        ParticleType.Fillers.fill1_20_3((Protocol)this, (ParticleType)Types1_20_3.PARTICLE);
        super.onMappingDataLoaded();
    }

    public void init(UserConnection connection) {
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_20_3.PLAYER));
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_20_3 getItemRewriter() {
        return this.itemRewriter;
    }

    public BlockRewriter<ClientboundPacket1_20_2> getBlockRewriter() {
        return this.blockRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_20_2> getParticleRewriter() {
        return this.particleRewriter;
    }

    public EntityPacketRewriter1_20_3 getEntityRewriter() {
        return this.entityRewriter;
    }

    public TagRewriter<ClientboundPacket1_20_2> getTagRewriter() {
        return this.tagRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_20_2, ClientboundPacket1_20_3, ServerboundPacket1_20_2, ServerboundPacket1_20_3> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_2.class, ClientboundConfigurationPackets1_20_2.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_3.class, ClientboundConfigurationPackets1_20_3.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_2.class, ServerboundConfigurationPackets1_20_2.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_3.class, ServerboundConfigurationPackets1_20_2.class}));
    }
}

