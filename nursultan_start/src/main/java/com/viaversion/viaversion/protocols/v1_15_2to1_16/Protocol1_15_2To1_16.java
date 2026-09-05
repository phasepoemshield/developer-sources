/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Joiner
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_16
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonArray
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.gson.JsonObject
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ClientboundStatusPackets
 *  com.viaversion.viaversion.protocols.v1_15_2to1_16.storage.InventoryTracker1_16
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.GsonUtil
 *  com.viaversion.viaversion.util.Key
 */
package com.viaversion.viaversion.protocols.v1_15_2to1_16;

import com.google.common.base.Joiner;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_16;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_16;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonArray;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.gson.JsonObject;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ClientboundStatusPackets;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ServerboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.provider.PlayerAbilitiesProvider;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.rewriter.ComponentRewriter1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.rewriter.EntityPacketRewriter1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.rewriter.ItemPacketRewriter1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.rewriter.WorldPacketRewriter1_16;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.storage.InventoryTracker1_16;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.GsonUtil;
import com.viaversion.viaversion.util.Key;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.UUID;

public class Protocol1_15_2To1_16
extends AbstractProtocol<ClientboundPackets1_15, ClientboundPackets1_16, ServerboundPackets1_14, ServerboundPackets1_16> {
    private static final UUID ZERO_UUID = new UUID(0L, 0L);
    public static final MappingData MAPPINGS = new MappingDataBase("1.15", "1.16");
    private final EntityPacketRewriter1_16 entityRewriter = new EntityPacketRewriter1_16(this);
    private final ItemPacketRewriter1_16 itemRewriter = new ItemPacketRewriter1_16(this);
    private final ParticleRewriter<ClientboundPackets1_15> particleRewriter = new ParticleRewriter((Protocol)this);
    private final ComponentRewriter1_16 componentRewriter = new ComponentRewriter1_16(this);
    private final TagRewriter<ClientboundPackets1_15> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_15> blockRewriter = BlockRewriter.for1_14((Protocol)this);

    public Protocol1_15_2To1_16() {
        super(ClientboundPackets1_15.class, ClientboundPackets1_16.class, ServerboundPackets1_14.class, ServerboundPackets1_16.class);
    }

    public void register(ViaProviders providers) {
        providers.register(PlayerAbilitiesProvider.class, (Provider)new PlayerAbilitiesProvider());
    }

    public void init(UserConnection userConnection) {
        userConnection.addEntityTracker(((Object)((Object)this)).getClass(), (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_16.PLAYER));
        userConnection.put((StorableObject)new InventoryTracker1_16());
    }

    public ComponentRewriter1_16 getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_16.initialize((Protocol)this);
        ParticleType.Fillers.fill1_13_2((Protocol)this, (ParticleType)Types1_16.PARTICLE, (boolean)true);
        this.tagRewriter.addEmptyTags(RegistryType.ITEM, new String[]{"minecraft:crimson_stems", "minecraft:non_flammable_wood", "minecraft:piglin_loved", "minecraft:piglin_repellents", "minecraft:soul_fire_base_blocks", "minecraft:warped_stems"});
        this.tagRewriter.addEmptyTags(RegistryType.BLOCK, new String[]{"minecraft:crimson_stems", "minecraft:guarded_by_piglins", "minecraft:hoglin_repellents", "minecraft:non_flammable_wood", "minecraft:nylium", "minecraft:piglin_repellents", "minecraft:soul_fire_base_blocks", "minecraft:soul_speed_blocks", "minecraft:strider_warm_blocks", "minecraft:warped_stems"});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPackets1_15> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        WorldPacketRewriter1_16.register(this);
        this.tagRewriter.register((ClientboundPacketType)ClientboundPackets1_15.UPDATE_TAGS, RegistryType.ENTITY);
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, wrapper -> {
            UUID uuid = UUID.fromString((String)wrapper.read(Types.STRING));
            wrapper.write(Types.UUID, (Object)uuid);
        });
        this.registerClientbound(State.STATUS, (ClientboundPacketType)ClientboundStatusPackets.STATUS_RESPONSE, wrapper -> {
            String original = (String)wrapper.passthrough(Types.STRING);
            JsonObject object = (JsonObject)GsonUtil.getGson().fromJson(original, JsonObject.class);
            JsonObject players = object.getAsJsonObject("players");
            if (players == null) {
                return;
            }
            JsonArray sample = players.getAsJsonArray("sample");
            if (sample == null) {
                return;
            }
            JsonArray splitSamples = new JsonArray();
            for (JsonElement element : sample) {
                JsonObject playerInfo = element.getAsJsonObject();
                String name = playerInfo.getAsJsonPrimitive("name").getAsString();
                if (name.indexOf(10) == -1) {
                    splitSamples.add((JsonElement)playerInfo);
                    continue;
                }
                String id = playerInfo.getAsJsonPrimitive("id").getAsString();
                for (String s : name.split("\n")) {
                    JsonObject newSample = new JsonObject();
                    newSample.addProperty("name", s);
                    newSample.addProperty("id", id);
                    splitSamples.add((JsonElement)newSample);
                }
            }
            if (splitSamples.size() != sample.size()) {
                players.add("sample", (JsonElement)splitSamples);
                wrapper.set(Types.STRING, 0, (Object)object.toString());
            }
        });
        this.replaceClientbound(ClientboundPackets1_15.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.COMPONENT);
                this.map((Type)Types.BYTE);
                this.handler(wrapper -> {
                    Protocol1_15_2To1_16.this.componentRewriter.processText(wrapper.user(), (JsonElement)wrapper.get(Types.COMPONENT, 0));
                    wrapper.write(Types.UUID, (Object)ZERO_UUID);
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_16.INTERACT, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            int action = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
            if (action == 0 || action == 2) {
                if (action == 2) {
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                    wrapper.passthrough((Type)Types.FLOAT);
                }
                wrapper.passthrough((Type)Types.VAR_INT);
            }
            wrapper.read((Type)Types.BOOLEAN);
        });
        if (Via.getConfig().isIgnoreLong1_16ChannelNames()) {
            this.registerServerbound(ServerboundPackets1_16.CUSTOM_PAYLOAD, (PacketHandler)new PacketHandlers(){

                public void register() {
                    this.map(Types.STRING);
                    this.handler(wrapper -> {
                        String channel = (String)wrapper.get(Types.STRING, 0);
                        String namespacedChannel = Key.namespaced((String)channel);
                        if (channel.length() > 32) {
                            if (Via.getManager().isDebug()) {
                                Protocol1_15_2To1_16.this.getLogger().warning("Ignoring serverbound plugin channel, as it is longer than 32 characters: " + channel);
                            }
                            wrapper.cancel();
                        } else if (namespacedChannel.equals("minecraft:register") || namespacedChannel.equals("minecraft:unregister")) {
                            String[] channels = new String((byte[])wrapper.read(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA), StandardCharsets.UTF_8).split("\u0000");
                            ArrayList<String> checkedChannels = new ArrayList<String>(channels.length);
                            for (String registeredChannel : channels) {
                                if (registeredChannel.length() > 32) {
                                    if (!Via.getManager().isDebug()) continue;
                                    Protocol1_15_2To1_16.this.getLogger().warning("Ignoring serverbound plugin channel register of '" + registeredChannel + "', as it is longer than 32 characters");
                                    continue;
                                }
                                checkedChannels.add(registeredChannel);
                            }
                            if (checkedChannels.isEmpty()) {
                                wrapper.cancel();
                                return;
                            }
                            wrapper.write(Types.SERVERBOUND_CUSTOM_PAYLOAD_DATA, (Object)Joiner.on((char)'\u0000').join(checkedChannels).getBytes(StandardCharsets.UTF_8));
                        }
                    });
                }
            });
        }
        this.registerServerbound(ServerboundPackets1_16.PLAYER_ABILITIES, wrapper -> {
            wrapper.passthrough((Type)Types.BYTE);
            PlayerAbilitiesProvider playerAbilities = (PlayerAbilitiesProvider)Via.getManager().getProviders().get(PlayerAbilitiesProvider.class);
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(playerAbilities.getFlyingSpeed(wrapper.user())));
            wrapper.write((Type)Types.FLOAT, (Object)Float.valueOf(playerAbilities.getWalkingSpeed(wrapper.user())));
        });
        this.cancelServerbound(ServerboundPackets1_16.JIGSAW_GENERATE);
        this.cancelServerbound(ServerboundPackets1_16.SET_JIGSAW_BLOCK);
    }

    public TagRewriter<ClientboundPackets1_15> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_15> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_16 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_16 getEntityRewriter() {
        return this.entityRewriter;
    }
}

