/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.GameProfile$Property
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_19
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.storage.DimensionRegistryStorage
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.storage.NonceStorage1_19
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.storage.SequenceStorage
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.CommandRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.SoundRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.CipherUtil
 *  com.viaversion.viaversion.util.ComponentUtil
 */
package com.viaversion.viaversion.protocols.v1_18_2to1_19;

import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.GameProfile;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_19;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.data.MappingData1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.provider.AckSequenceProvider;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.rewriter.ComponentRewriter1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.rewriter.EntityPacketRewriter1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.rewriter.ItemPacketRewriter1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.rewriter.WorldPacketRewriter1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.storage.DimensionRegistryStorage;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.storage.NonceStorage1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.storage.SequenceStorage;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.CommandRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.SoundRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.CipherUtil;
import com.viaversion.viaversion.util.ComponentUtil;
import java.util.concurrent.ThreadLocalRandom;

public final class Protocol1_18_2To1_19
extends AbstractProtocol<ClientboundPackets1_18, ClientboundPackets1_19, ServerboundPackets1_17, ServerboundPackets1_19> {
    public static final MappingData1_19 MAPPINGS = new MappingData1_19();
    private final EntityPacketRewriter1_19 entityRewriter = new EntityPacketRewriter1_19(this);
    private final ItemPacketRewriter1_19 itemRewriter = new ItemPacketRewriter1_19(this);
    private final ParticleRewriter<ClientboundPackets1_18> particleRewriter = new ParticleRewriter((Protocol)this);
    private final ComponentRewriter1_19 componentRewriter = new ComponentRewriter1_19((Protocol<ClientboundPackets1_18, ?, ?, ?>)this);
    private final TagRewriter<ClientboundPackets1_18> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_18> blockRewriter = BlockRewriter.for1_18((Protocol)this, ChunkType1_18::new);

    public Protocol1_18_2To1_19() {
        super(ClientboundPackets1_18.class, ClientboundPackets1_19.class, ServerboundPackets1_17.class, ServerboundPackets1_19.class);
    }

    public void register(ViaProviders providers) {
        providers.register(AckSequenceProvider.class, (Provider)new AckSequenceProvider());
    }

    public void init(UserConnection user) {
        if (!user.has(DimensionRegistryStorage.class)) {
            user.put((StorableObject)new DimensionRegistryStorage());
        }
        user.put((StorableObject)new SequenceStorage());
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_19.PLAYER));
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_19.initialize((Protocol)this);
        ParticleType.Fillers.fill1_19((Protocol)this, (ParticleType)Types1_19.PARTICLE);
        this.tagRewriter.removeTag(RegistryType.ITEM, "minecraft:occludes_vibration_signals");
        this.tagRewriter.renameTag(RegistryType.ITEM, "minecraft:carpets", "minecraft:wool_carpets");
        this.tagRewriter.renameTag(RegistryType.BLOCK, "minecraft:carpets", "minecraft:wool_carpets");
        this.tagRewriter.renameTag(RegistryType.BLOCK, "minecraft:polar_bears_spawnable_on_in_frozen_ocean", "minecraft:polar_bears_spawnable_on_alternate");
        this.tagRewriter.addEmptyTags(RegistryType.ITEM, new String[]{"minecraft:chest_boats", "minecraft:dampens_vibrations", "minecraft:mangrove_logs", "minecraft:overworld_natural_logs"});
        this.tagRewriter.addEmptyTags(RegistryType.BLOCK, new String[]{"minecraft:ancient_city_replaceable", "minecraft:convertable_to_mud", "minecraft:dampens_vibrations", "minecraft:frog_prefer_jump_to", "minecraft:frogs_spawnable_on", "minecraft:mangrove_logs", "minecraft:mangrove_logs_can_grow_through", "minecraft:mangrove_roots_can_grow_through", "minecraft:nether_carver_replaceables", "minecraft:overworld_carver_replaceables", "minecraft:overworld_natural_logs", "minecraft:sculk_replaceable", "minecraft:sculk_replaceable_world_gen", "minecraft:snaps_goat_horn"});
        this.tagRewriter.addEmptyTag(RegistryType.ENTITY, "minecraft:frog_food");
        this.tagRewriter.addEmptyTags(RegistryType.GAME_EVENT, new String[]{"minecraft:allay_can_listen", "minecraft:shrieker_can_listen", "minecraft:warden_can_listen"});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPackets1_18> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        WorldPacketRewriter1_19.register(this);
        this.cancelClientbound(ClientboundPackets1_18.ADD_VIBRATION_SIGNAL);
        final SoundRewriter soundRewriter = new SoundRewriter((Protocol)this);
        this.replaceClientbound(ClientboundPackets1_18.SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> wrapper.write((Type)Types.LONG, (Object)Protocol1_18_2To1_19.this.randomLong()));
                this.handler(soundRewriter.getSoundHandler());
            }
        });
        this.replaceClientbound(ClientboundPackets1_18.SOUND_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> wrapper.write((Type)Types.LONG, (Object)Protocol1_18_2To1_19.this.randomLong()));
                this.handler(soundRewriter.getSoundHandler());
            }
        });
        this.registerClientbound(ClientboundPackets1_18.CUSTOM_SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.handler(wrapper -> wrapper.write((Type)Types.LONG, (Object)Protocol1_18_2To1_19.this.randomLong()));
            }
        });
        PacketHandler singleNullTextComponentMapper = wrapper -> wrapper.write(Types.COMPONENT, (Object)this.mapTextComponentIfNull(wrapper.user(), (JsonElement)wrapper.read(Types.COMPONENT)));
        this.registerClientbound(ClientboundPackets1_18.SET_TITLE_TEXT, singleNullTextComponentMapper);
        this.registerClientbound(ClientboundPackets1_18.SET_SUBTITLE_TEXT, singleNullTextComponentMapper);
        this.registerClientbound(ClientboundPackets1_18.SET_ACTION_BAR_TEXT, singleNullTextComponentMapper);
        this.registerClientbound(ClientboundPackets1_18.SET_OBJECTIVE, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                wrapper.write(Types.COMPONENT, (Object)this.mapTextComponentIfNull(wrapper.user(), (JsonElement)wrapper.read(Types.COMPONENT)));
            }
        });
        this.registerClientbound(ClientboundPackets1_18.SET_PLAYER_TEAM, wrapper -> {
            wrapper.passthrough(Types.STRING);
            byte action = (Byte)wrapper.passthrough((Type)Types.BYTE);
            if (action == 0 || action == 2) {
                wrapper.write(Types.COMPONENT, (Object)this.mapTextComponentIfNull(wrapper.user(), (JsonElement)wrapper.read(Types.COMPONENT)));
                wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough(Types.STRING);
                wrapper.passthrough((Type)Types.VAR_INT);
                wrapper.write(Types.COMPONENT, (Object)this.mapTextComponentIfNull(wrapper.user(), (JsonElement)wrapper.read(Types.COMPONENT)));
                wrapper.write(Types.COMPONENT, (Object)this.mapTextComponentIfNull(wrapper.user(), (JsonElement)wrapper.read(Types.COMPONENT)));
            }
        });
        this.registerClientbound(ClientboundPackets1_18.PLAYER_INFO, wrapper -> {
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            int entries = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < entries; ++i) {
                JsonElement displayName;
                wrapper.passthrough(Types.UUID);
                if (action == 0) {
                    wrapper.passthrough(Types.STRING);
                    wrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    wrapper.passthrough((Type)Types.VAR_INT);
                    displayName = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    if (this.isJsonNotNull(displayName)) {
                        wrapper.write(Types.OPTIONAL_COMPONENT, (Object)displayName);
                    } else {
                        wrapper.write(Types.OPTIONAL_COMPONENT, null);
                    }
                    wrapper.write(Types.OPTIONAL_PROFILE_KEY, null);
                    continue;
                }
                if (action == 1 || action == 2) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                    continue;
                }
                if (action != 3) continue;
                displayName = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                if (this.isJsonNotNull(displayName)) {
                    wrapper.write(Types.OPTIONAL_COMPONENT, (Object)displayName);
                    continue;
                }
                wrapper.write(Types.OPTIONAL_COMPONENT, null);
            }
        });
        CommandRewriter commandRewriter = new CommandRewriter((Protocol)this);
        this.registerClientbound(ClientboundPackets1_18.COMMANDS, wrapper -> {
            int size = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            for (int i = 0; i < size; ++i) {
                int nodeType;
                byte flags = (Byte)wrapper.passthrough((Type)Types.BYTE);
                wrapper.passthrough(Types.VAR_INT_ARRAY_PRIMITIVE);
                if ((flags & 8) != 0) {
                    wrapper.passthrough((Type)Types.VAR_INT);
                }
                if ((nodeType = flags & 3) == 1 || nodeType == 2) {
                    wrapper.passthrough(Types.STRING);
                }
                if (nodeType != 2) continue;
                String argumentType = (String)wrapper.read(Types.STRING);
                int argumentTypeId = MAPPINGS.getArgumentTypeMappings().mappedId(argumentType);
                if (argumentTypeId == -1) {
                    this.getLogger().warning("Unknown command argument type: " + argumentType);
                }
                wrapper.write((Type)Types.VAR_INT, (Object)argumentTypeId);
                commandRewriter.handleArgument(wrapper, argumentType);
                if ((flags & 0x10) == 0) continue;
                wrapper.passthrough(Types.STRING);
            }
            wrapper.passthrough((Type)Types.VAR_INT);
        });
        this.registerClientbound(ClientboundPackets1_18.CHAT, ClientboundPackets1_19.SYSTEM_CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.COMPONENT);
                this.handler(wrapper -> {
                    byte type = (Byte)wrapper.read((Type)Types.BYTE);
                    wrapper.write((Type)Types.VAR_INT, (Object)(type == 0 ? (byte)1 : type));
                });
                this.read(Types.UUID);
            }
        });
        this.registerServerbound(ServerboundPackets1_19.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.read((Type)Types.LONG);
                this.read((Type)Types.LONG);
                this.read(Types.BYTE_ARRAY_PRIMITIVE);
                this.read((Type)Types.BOOLEAN);
            }
        });
        this.registerServerbound(ServerboundPackets1_19.CHAT_COMMAND, (ServerboundPacketType)ServerboundPackets1_17.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.read((Type)Types.LONG);
                this.read((Type)Types.LONG);
                this.handler(wrapper -> {
                    String command = (String)wrapper.get(Types.STRING, 0);
                    wrapper.set(Types.STRING, 0, (Object)("/" + command));
                    int signatures = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (int i = 0; i < signatures; ++i) {
                        wrapper.read(Types.STRING);
                        wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                    }
                });
                this.read((Type)Types.BOOLEAN);
            }
        });
        this.cancelServerbound(ServerboundPackets1_19.CHAT_PREVIEW);
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.UUID);
                this.map(Types.STRING);
                this.create(Types.PROFILE_PROPERTY_ARRAY, new GameProfile.Property[0]);
            }
        });
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    byte[] publicKey = (byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
                    byte[] nonce = (byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
                    wrapper.user().put((StorableObject)new NonceStorage1_19(CipherUtil.encryptNonce((byte[])publicKey, (byte[])nonce)));
                });
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.read(Types.OPTIONAL_PROFILE_KEY);
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.ENCRYPTION_KEY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BYTE_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    if (((Boolean)wrapper.read((Type)Types.BOOLEAN)).booleanValue()) {
                        wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
                    } else {
                        NonceStorage1_19 nonceStorage = (NonceStorage1_19)wrapper.user().remove(NonceStorage1_19.class);
                        if (nonceStorage == null) {
                            throw new IllegalArgumentException("Server sent nonce is missing");
                        }
                        wrapper.read((Type)Types.LONG);
                        wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                        wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)nonceStorage.nonce());
                    }
                });
            }
        });
    }

    public TagRewriter<ClientboundPackets1_18> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_18> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData1_19 getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_19 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_19 getEntityRewriter() {
        return this.entityRewriter;
    }

    private long randomLong() {
        return ThreadLocalRandom.current().nextLong();
    }

    public JsonElement mapTextComponentIfNull(UserConnection connection, JsonElement component) {
        if (this.isJsonNotNull(component)) {
            this.componentRewriter.processText(connection, component);
            return component;
        }
        return ComponentUtil.emptyJsonComponent();
    }

    public boolean isJsonNotNull(JsonElement element) {
        return element != null && !element.isJsonNull() && (!element.isJsonArray() || !element.getAsJsonArray().isEmpty());
    }
}

