/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.storage.ResourcepackIDStorage
 *  com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.storage.SpawnPositionStorage
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.BlockPosition
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_3
 *  com.viaversion.viaversion.api.minecraft.item.Item
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
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.fastutil.Pair
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.Protocol1_20_2To1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundConfigurationPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPacket1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPacket1_20_2
 *  com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.ProtocolUtil
 */
package com.viaversion.viabackwards.protocol.v1_20_3to1_20_2;

import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.rewriter.BlockItemPacketRewriter1_20_3;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.rewriter.BlockPacketRewriter1_20_3;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.rewriter.EntityPacketRewriter1_20_3;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.storage.ResourcepackIDStorage;
import com.viaversion.viabackwards.protocol.v1_20_3to1_20_2.storage.SpawnPositionStorage;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.BlockPosition;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_3;
import com.viaversion.viaversion.api.minecraft.item.Item;
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
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.fastutil.Pair;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.CommandRewriter1_19_4;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.Protocol1_20_2To1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPacket1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ClientboundPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPacket1_20_2;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundPackets1_20_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.ProtocolUtil;
import java.util.BitSet;
import java.util.UUID;

public final class Protocol1_20_3To1_20_2
extends BackwardsProtocol<ClientboundPacket1_20_3, ClientboundPacket1_20_2, ServerboundPacket1_20_3, ServerboundPacket1_20_2> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.20.3", "1.20.2", Protocol1_20_2To1_20_3.class);
    private final EntityPacketRewriter1_20_3 entityRewriter = new EntityPacketRewriter1_20_3(this);
    private final BlockItemPacketRewriter1_20_3 itemRewriter = new BlockItemPacketRewriter1_20_3(this);
    private final ParticleRewriter<ClientboundPacket1_20_3> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPacket1_20_3> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.NBT);
    private final TagRewriter<ClientboundPacket1_20_3> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPacket1_20_3> blockRewriter = new BlockPacketRewriter1_20_3(this);

    public Protocol1_20_3To1_20_2() {
        super(ClientboundPacket1_20_3.class, ClientboundPacket1_20_2.class, ServerboundPacket1_20_3.class, ServerboundPacket1_20_2.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        CommandRewriter1_19_4<ClientboundPacket1_20_3> commandRewriter = new CommandRewriter1_19_4<ClientboundPacket1_20_3>((Protocol)this){

            public void handleArgument(PacketWrapper wrapper, String argumentType) {
                if (argumentType.equals("minecraft:style")) {
                    wrapper.write((Type)Types.VAR_INT, (Object)1);
                } else {
                    super.handleArgument(wrapper, argumentType);
                }
            }
        };
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.COMMANDS, arg_0 -> ((CommandRewriter1_19_4)commandRewriter).handle1_19(arg_0));
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.RESET_SCORE, (ClientboundPacketType)ClientboundPackets1_20_2.SET_SCORE, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.write((Type)Types.VAR_INT, (Object)1);
            String objectiveName = (String)wrapper.read(Types.OPTIONAL_STRING);
            wrapper.write(Types.STRING, (Object)(objectiveName != null ? objectiveName : ""));
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_SCORE, wrapper -> {
            wrapper.passthrough(Types.STRING);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.clearInputBuffer();
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_OBJECTIVE, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                this.convertComponent(wrapper);
                wrapper.passthrough((Type)Types.VAR_INT);
                wrapper.clearInputBuffer();
            }
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_20_3.TICKING_STATE);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_20_3.TICKING_STEP);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_20_2.SET_JIGSAW_BLOCK, wrapper -> {
            wrapper.passthrough(Types.BLOCK_POSITION1_14);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
            wrapper.write((Type)Types.VAR_INT, (Object)0);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.UPDATE_ADVANCEMENTS, wrapper -> {
            wrapper.passthrough((Type)Types.BOOLEAN);
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.OPTIONAL_STRING);
                if (((Boolean)wrapper.passthrough((Type)Types.BOOLEAN)).booleanValue()) {
                    this.convertComponent(wrapper);
                    this.convertComponent(wrapper);
                    Item icon = this.itemRewriter.handleItemToClient(wrapper.user(), (Item)wrapper.read(Types.ITEM1_20_2));
                    wrapper.write(Types.ITEM1_20_2, (Object)icon);
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
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.COMMAND_SUGGESTIONS, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.VAR_INT);
            int suggestions = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < suggestions; ++i) {
                wrapper.passthrough(Types.STRING);
                this.convertOptionalComponent(wrapper);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.MAP_ITEM_DATA, wrapper -> {
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
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.BOSS_EVENT, wrapper -> {
            wrapper.passthrough(Types.UUID);
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action == 0 || action == 3) {
                this.convertComponent(wrapper);
            }
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.PLAYER_CHAT, wrapper -> {
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
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_PLAYER_TEAM, wrapper -> {
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
        this.replaceClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_3.DISCONNECT, this::convertComponent);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.DISCONNECT, this::convertComponent);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.RESOURCE_PACK_PUSH, (ClientboundPacketType)ClientboundPackets1_20_2.RESOURCE_PACK, this.resourcePackHandler());
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SERVER_DATA, this::convertComponent);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_ACTION_BAR_TEXT, this::convertComponent);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_TITLE_TEXT, this::convertComponent);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_SUBTITLE_TEXT, this::convertComponent);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.DISGUISED_CHAT, wrapper -> {
            this.convertComponent(wrapper);
            wrapper.passthrough((Type)Types.VAR_INT);
            this.convertComponent(wrapper);
            this.convertOptionalComponent(wrapper);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SYSTEM_CHAT, this::convertComponent);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.OPEN_SCREEN, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int containerTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
            int mappedContainerTypeId = MAPPINGS.getMenuMappings().getNewId(containerTypeId);
            if (mappedContainerTypeId == -1) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)mappedContainerTypeId);
            this.convertComponent(wrapper);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.TAB_LIST, wrapper -> {
            this.convertComponent(wrapper);
            this.convertComponent(wrapper);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.PLAYER_COMBAT_KILL, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.handler(wrapper -> Protocol1_20_3To1_20_2.this.convertComponent(wrapper));
            }
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.PLAYER_INFO_UPDATE, wrapper -> {
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
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_DEFAULT_SPAWN_POSITION, wrapper -> {
            BlockPosition position = (BlockPosition)wrapper.passthrough(Types.BLOCK_POSITION1_14);
            float angle = ((Float)wrapper.passthrough((Type)Types.FLOAT)).floatValue();
            ((SpawnPositionStorage)wrapper.user().get(SpawnPositionStorage.class)).setSpawnPosition(Pair.of((Object)position, (Object)Float.valueOf(angle)));
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_20_3.GAME_EVENT, wrapper -> {
            short reason = (Short)wrapper.passthrough((Type)Types.UNSIGNED_BYTE);
            if (reason == 13) {
                wrapper.cancel();
                Pair spawnPositionAndAngle = ((SpawnPositionStorage)wrapper.user().get(SpawnPositionStorage.class)).getSpawnPosition();
                PacketWrapper spawnPosition = wrapper.create((PacketType)ClientboundPackets1_20_2.SET_DEFAULT_SPAWN_POSITION);
                spawnPosition.write(Types.BLOCK_POSITION1_14, (Object)((BlockPosition)spawnPositionAndAngle.first()));
                spawnPosition.write((Type)Types.FLOAT, (Object)((Float)spawnPositionAndAngle.second()));
                spawnPosition.send(Protocol1_20_3To1_20_2.class, true);
            }
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_20_3.RESOURCE_PACK_POP);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_20_2.RESOURCE_PACK, this.resourcePackStatusHandler());
        this.cancelClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_3.RESOURCE_PACK_POP);
        this.registerServerbound((ServerboundPacketType)ServerboundConfigurationPackets1_20_2.RESOURCE_PACK, this.resourcePackStatusHandler());
        this.registerClientbound((ClientboundPacketType)ClientboundConfigurationPackets1_20_3.RESOURCE_PACK_PUSH, (ClientboundPacketType)ClientboundConfigurationPackets1_20_2.RESOURCE_PACK, this.resourcePackHandler());
    }

    private PacketHandler resourcePackStatusHandler() {
        return wrapper -> {
            ResourcepackIDStorage storage = (ResourcepackIDStorage)wrapper.user().get(ResourcepackIDStorage.class);
            wrapper.write(Types.UUID, (Object)(storage != null ? storage.uuid() : UUID.randomUUID()));
        };
    }

    private PacketHandler resourcePackHandler() {
        return wrapper -> {
            UUID uuid = (UUID)wrapper.read(Types.UUID);
            wrapper.user().put((StorableObject)new ResourcepackIDStorage(uuid));
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough(Types.STRING);
            wrapper.passthrough((Type)Types.BOOLEAN);
            this.convertOptionalComponent(wrapper);
        };
    }

    private void convertComponent(PacketWrapper wrapper) {
        Tag tag = (Tag)wrapper.read(Types.TRUSTED_TAG);
        this.translatableRewriter.processTag(wrapper.user(), tag);
        wrapper.write(Types.COMPONENT, (Object)ComponentUtil.tagToJson((Tag)tag));
    }

    private void convertOptionalComponent(PacketWrapper wrapper) {
        Tag tag = (Tag)wrapper.read(Types.TRUSTED_OPTIONAL_TAG);
        this.translatableRewriter.processTag(wrapper.user(), tag);
        wrapper.write(Types.OPTIONAL_COMPONENT, (Object)ComponentUtil.tagToJson((Tag)tag));
    }

    public void init(UserConnection connection) {
        connection.put((StorableObject)new SpawnPositionStorage());
        this.addEntityTracker(connection, (EntityTracker)new EntityTrackerBase(connection, (EntityType)EntityTypes1_20_3.PLAYER));
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_20_3 getItemRewriter() {
        return this.itemRewriter;
    }

    public BlockRewriter<ClientboundPacket1_20_3> getBlockRewriter() {
        return this.blockRewriter;
    }

    public ParticleRewriter<ClientboundPacket1_20_3> getParticleRewriter() {
        return this.particleRewriter;
    }

    public EntityPacketRewriter1_20_3 getEntityRewriter() {
        return this.entityRewriter;
    }

    public JsonNBTComponentRewriter<ClientboundPacket1_20_3> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public TagRewriter<ClientboundPacket1_20_3> getTagRewriter() {
        return this.tagRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_20_3, ClientboundPacket1_20_2, ServerboundPacket1_20_3, ServerboundPacket1_20_2> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_3.class, ClientboundConfigurationPackets1_20_3.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_2.class, ClientboundConfigurationPackets1_20_2.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_3.class, ServerboundConfigurationPackets1_20_2.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_2.class, ServerboundConfigurationPackets1_20_2.class}));
    }
}

