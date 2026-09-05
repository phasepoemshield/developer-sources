/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viafabricplus.util.NotificationUtil
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.ProfileKey
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataKey
 *  com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_20_5
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 *  com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.VersionedTypes
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.AcknowledgedMessagesStorage
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ScoreboardTeamStorage
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.TagKeys
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter
 *  com.viaversion.viaversion.util.ProtocolLogger
 *  com.viaversion.viaversion.util.ProtocolUtil
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.protocols.v1_20_3to1_20_5;

import com.viaversion.viafabricplus.util.NotificationUtil;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.ProfileKey;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataKey;
import com.viaversion.viaversion.api.minecraft.data.version.StructuredDataKeys1_20_5;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_20_5;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.api.protocol.packet.provider.SimplePacketTypesProvider;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_20_2;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.VersionedTypes;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundConfigurationPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ClientboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPacket1_20_3;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.packet.ServerboundPackets1_20_3;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.data.MappingData1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundConfigurationPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPacket1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ServerboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.BlockItemPacketRewriter1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.ComponentRewriter1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.EntityPacketRewriter1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter.ParticleRewriter1_20_5;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.AcknowledgedMessagesStorage;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ArmorTrimStorage;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.ScoreboardTeamStorage;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.storage.TagKeys;
import com.viaversion.viaversion.protocols.v1_20to1_20_2.packet.ServerboundConfigurationPackets1_20_2;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.JsonNBTComponentRewriter;
import com.viaversion.viaversion.util.ProtocolLogger;
import com.viaversion.viaversion.util.ProtocolUtil;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Objects;
import java.util.UUID;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public final class Protocol1_20_3To1_20_5
extends AbstractProtocol<ClientboundPacket1_20_3, ClientboundPacket1_20_5, ServerboundPacket1_20_3, ServerboundPacket1_20_5> {
    public static final MappingData1_20_5 MAPPINGS = new MappingData1_20_5();
    public static final ProtocolLogger LOGGER = new ProtocolLogger(Protocol1_20_3To1_20_5.class);
    public static boolean strictErrorHandling = System.getProperty("viaversion.strict-error-handling1_20_5", "true").equalsIgnoreCase("true");
    private final EntityPacketRewriter1_20_5 entityRewriter = new EntityPacketRewriter1_20_5(this);
    private final BlockItemPacketRewriter1_20_5 itemRewriter = new BlockItemPacketRewriter1_20_5(this);
    private final ParticleRewriter1_20_5 particleRewriter = new ParticleRewriter1_20_5((Protocol<ClientboundPacket1_20_3, ?, ?, ?>)this);
    private final TagRewriter<ClientboundPacket1_20_3> tagRewriter = new TagRewriter<ClientboundPacket1_20_3>(this, (Protocol)this){
        final /* synthetic */ Protocol1_20_3To1_20_5 this$0;
        {
            this.this$0 = this$0;
            super(protocol);
        }

        public void handleGeneric(PacketWrapper wrapper) {
            super.handleGeneric(wrapper);
            wrapper.resetReader();
            wrapper.user().put((StorableObject)new TagKeys(wrapper));
        }
    };
    private final ComponentRewriter1_20_5<ClientboundPacket1_20_3> componentRewriter;
    private final BlockRewriter<ClientboundPacket1_20_3> blockRewriter;

    public Protocol1_20_3To1_20_5() {
        super(ClientboundPacket1_20_3.class, ClientboundPacket1_20_5.class, ServerboundPacket1_20_3.class, ServerboundPacket1_20_5.class);
        this.componentRewriter = new ComponentRewriter1_20_5(this, VersionedTypes.V1_20_5.structuredData);
        this.blockRewriter = BlockRewriter.for1_20_2((Protocol)this, ChunkType1_20_2::new);
    }

    public void init(UserConnection userConnection) {
        this.addEntityTracker(userConnection, (EntityTracker)new EntityTrackerBase(userConnection, (EntityType)EntityTypes1_20_5.PLAYER));
        userConnection.put((StorableObject)new AcknowledgedMessagesStorage());
        userConnection.put((StorableObject)new ArmorTrimStorage());
        userConnection.put((StorableObject)new ScoreboardTeamStorage());
    }

    public ProtocolLogger getLogger() {
        return LOGGER;
    }

    public JsonNBTComponentRewriter<ClientboundPacket1_20_3> getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_20_5.initialize((Protocol)this);
        ParticleType.Fillers.fill1_20_5((Protocol)this, (ParticleType)VersionedTypes.V1_20_5.particle);
        VersionedTypes.V1_20_5.structuredData.filler((Protocol)this).add(StructuredDataKey.CUSTOM_DATA).add(StructuredDataKey.MAX_STACK_SIZE).add(StructuredDataKey.MAX_DAMAGE).add(StructuredDataKey.DAMAGE).add(StructuredDataKey.UNBREAKABLE1_20_5).add(StructuredDataKey.RARITY).add(StructuredDataKey.HIDE_TOOLTIP).add(StructuredDataKey.FOOD1_20_5).add(StructuredDataKey.FIRE_RESISTANT).add(StructuredDataKey.CUSTOM_NAME).add(StructuredDataKey.LORE).add(StructuredDataKey.ENCHANTMENTS1_20_5).add(StructuredDataKey.CAN_PLACE_ON1_20_5).add(StructuredDataKey.CAN_BREAK1_20_5).add(StructuredDataKey.ATTRIBUTE_MODIFIERS1_20_5).add(StructuredDataKey.CUSTOM_MODEL_DATA1_20_5).add(StructuredDataKey.HIDE_ADDITIONAL_TOOLTIP).add(StructuredDataKey.REPAIR_COST).add(StructuredDataKey.CREATIVE_SLOT_LOCK).add(StructuredDataKey.ENCHANTMENT_GLINT_OVERRIDE).add(StructuredDataKey.INTANGIBLE_PROJECTILE).add(StructuredDataKey.STORED_ENCHANTMENTS1_20_5).add(StructuredDataKey.DYED_COLOR1_20_5).add(StructuredDataKey.MAP_COLOR).add(StructuredDataKey.MAP_ID).add(StructuredDataKey.MAP_DECORATIONS).add(StructuredDataKey.MAP_POST_PROCESSING).add(StructuredDataKey.POTION_CONTENTS1_20_5).add(StructuredDataKey.SUSPICIOUS_STEW_EFFECTS).add(StructuredDataKey.WRITABLE_BOOK_CONTENT).add(StructuredDataKey.WRITTEN_BOOK_CONTENT).add(StructuredDataKey.TRIM1_20_5).add(StructuredDataKey.DEBUG_STICK_STATE).add(StructuredDataKey.ENTITY_DATA1_20_5).add(StructuredDataKey.BUCKET_ENTITY_DATA).add(StructuredDataKey.BLOCK_ENTITY_DATA1_20_5).add(StructuredDataKey.INSTRUMENT1_20_5).add(StructuredDataKey.RECIPES).add(StructuredDataKey.LODESTONE_TRACKER).add(StructuredDataKey.FIREWORK_EXPLOSION).add(StructuredDataKey.FIREWORKS).add(StructuredDataKey.PROFILE1_20_5).add(StructuredDataKey.NOTE_BLOCK_SOUND).add(StructuredDataKey.BANNER_PATTERNS).add(StructuredDataKey.BASE_COLOR).add(StructuredDataKey.POT_DECORATIONS).add(StructuredDataKey.BLOCK_STATE).add(StructuredDataKey.BEES1_20_5).add(StructuredDataKey.LOCK1_20_5).add(StructuredDataKey.CONTAINER_LOOT).add(StructuredDataKey.TOOL1_20_5).add(StructuredDataKey.ITEM_NAME).add(StructuredDataKey.OMINOUS_BOTTLE_AMPLIFIER).add((Collection)((StructuredDataKeys1_20_5)VersionedTypes.V1_20_5.structuredDataKeys()).keys());
        this.tagRewriter.renameTag(RegistryType.ITEM, "minecraft:axolotl_tempt_items", "minecraft:axolotl_food");
        this.tagRewriter.removeTag(RegistryType.ITEM, "minecraft:tools");
        this.tagRewriter.addEmptyTags(RegistryType.BLOCK, new String[]{"minecraft:badlands_terracotta"});
        this.tagRewriter.addEmptyTags(RegistryType.ITEM, new String[]{"minecraft:enchantable/mace"});
        super.onMappingDataLoaded();
    }

    public ParticleRewriter1_20_5 getParticleRewriter() {
        return this.particleRewriter;
    }

    protected PacketTypesProvider<ClientboundPacket1_20_3, ClientboundPacket1_20_5, ServerboundPacket1_20_3, ServerboundPacket1_20_5> createPacketTypesProvider() {
        return new SimplePacketTypesProvider(ProtocolUtil.packetTypeMap((Class)this.unmappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_3.class, ClientboundConfigurationPackets1_20_3.class}), ProtocolUtil.packetTypeMap((Class)this.mappedClientboundPacketType, (Class[])new Class[]{ClientboundPackets1_20_5.class, ClientboundConfigurationPackets1_20_5.class}), ProtocolUtil.packetTypeMap((Class)this.mappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_3.class, ServerboundConfigurationPackets1_20_2.class}), ProtocolUtil.packetTypeMap((Class)this.unmappedServerboundPacketType, (Class[])new Class[]{ServerboundPackets1_20_5.class, ServerboundConfigurationPackets1_20_5.class}));
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.HELLO, packetWrapper -> {
            packetWrapper.passthrough(Types.STRING);
            packetWrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
            packetWrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
            packetWrapper.write((Type)Types.BOOLEAN, (Object)true);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SERVER_DATA, packetWrapper -> {
            this.componentRewriter.passthroughAndProcess(packetWrapper);
            packetWrapper.passthrough(Types.OPTIONAL_BYTE_ARRAY_PRIMITIVE);
            boolean bl = (Boolean)packetWrapper.read((Type)Types.BOOLEAN);
            AcknowledgedMessagesStorage acknowledgedMessagesStorage = (AcknowledgedMessagesStorage)packetWrapper.user().get(AcknowledgedMessagesStorage.class);
            acknowledgedMessagesStorage.setSecureChatEnforced(bl);
            if (bl) {
                acknowledgedMessagesStorage.sendQueuedChatSession(packetWrapper);
            }
        });
        this.registerServerbound(ServerboundPackets1_20_5.CHAT, packetWrapper -> {
            packetWrapper.passthrough(Types.STRING);
            packetWrapper.passthrough((Type)Types.LONG);
            AcknowledgedMessagesStorage acknowledgedMessagesStorage = (AcknowledgedMessagesStorage)packetWrapper.user().get(AcknowledgedMessagesStorage.class);
            long l = (Long)packetWrapper.read((Type)Types.LONG);
            byte[] byArray = (byte[])packetWrapper.read((Type)Types.OPTIONAL_SIGNATURE_BYTES);
            if (acknowledgedMessagesStorage.isSecureChatEnforced()) {
                packetWrapper.write((Type)Types.LONG, (Object)l);
                packetWrapper.write((Type)Types.OPTIONAL_SIGNATURE_BYTES, (Object)byArray);
            } else {
                packetWrapper.write((Type)Types.LONG, (Object)0L);
                packetWrapper.write((Type)Types.OPTIONAL_SIGNATURE_BYTES, null);
            }
            this.fixChatAck(packetWrapper, acknowledgedMessagesStorage);
        });
        this.registerServerbound(ServerboundPackets1_20_5.CHAT_COMMAND_SIGNED, ServerboundPackets1_20_3.CHAT_COMMAND, packetWrapper -> {
            packetWrapper.passthrough(Types.STRING);
            packetWrapper.passthrough((Type)Types.LONG);
            AcknowledgedMessagesStorage acknowledgedMessagesStorage = (AcknowledgedMessagesStorage)packetWrapper.user().get(AcknowledgedMessagesStorage.class);
            long l = (Long)packetWrapper.read((Type)Types.LONG);
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            if (acknowledgedMessagesStorage.isSecureChatEnforced()) {
                packetWrapper.write((Type)Types.LONG, (Object)l);
                packetWrapper.write((Type)Types.VAR_INT, (Object)n);
                for (int i = 0; i < n; ++i) {
                    packetWrapper.passthrough(Types.STRING);
                    packetWrapper.passthrough((Type)Types.SIGNATURE_BYTES);
                }
            } else {
                packetWrapper.write((Type)Types.LONG, (Object)0L);
                packetWrapper.write((Type)Types.VAR_INT, (Object)0);
                for (int i = 0; i < n; ++i) {
                    packetWrapper.read(Types.STRING);
                    packetWrapper.read((Type)Types.SIGNATURE_BYTES);
                }
            }
            this.fixChatAck(packetWrapper, acknowledgedMessagesStorage);
        });
        this.registerServerbound(ServerboundPackets1_20_5.CHAT_ACK, packetWrapper -> {
            int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
            int n2 = ((AcknowledgedMessagesStorage)packetWrapper.user().get(AcknowledgedMessagesStorage.class)).accumulateAckCount(n);
            if (n2 > 0) {
                packetWrapper.write((Type)Types.VAR_INT, (Object)n2);
            } else {
                packetWrapper.cancel();
            }
        });
        this.registerServerbound(ServerboundPackets1_20_5.CHAT_COMMAND, packetWrapper -> {
            packetWrapper.passthrough(Types.STRING);
            packetWrapper.write((Type)Types.LONG, (Object)System.currentTimeMillis());
            packetWrapper.write((Type)Types.LONG, (Object)0L);
            packetWrapper.write((Type)Types.VAR_INT, (Object)0);
            this.writeSpoofedChatAck(packetWrapper, (AcknowledgedMessagesStorage)packetWrapper.user().get(AcknowledgedMessagesStorage.class));
        });
        this.registerServerbound(ServerboundPackets1_20_5.CHAT_SESSION_UPDATE, packetWrapper -> {
            AcknowledgedMessagesStorage acknowledgedMessagesStorage = (AcknowledgedMessagesStorage)packetWrapper.user().get(AcknowledgedMessagesStorage.class);
            if (acknowledgedMessagesStorage.secureChatEnforced() != null && acknowledgedMessagesStorage.secureChatEnforced().booleanValue()) {
                return;
            }
            UUID uUID = (UUID)packetWrapper.read(Types.UUID);
            ProfileKey profileKey = (ProfileKey)packetWrapper.read(Types.PROFILE_KEY);
            acknowledgedMessagesStorage.queueChatSession(uUID, profileKey);
            packetWrapper.cancel();
        });
        this.appendClientbound((ClientboundPacketType)ClientboundPackets1_20_3.START_CONFIGURATION, packetWrapper -> packetWrapper.user().put((StorableObject)new AcknowledgedMessagesStorage()));
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, packetWrapper -> {
            packetWrapper.passthrough(Types.UUID);
            packetWrapper.passthrough(Types.STRING);
            packetWrapper.passthrough(Types.PROFILE_PROPERTY_ARRAY);
            packetWrapper.write((Type)Types.BOOLEAN, (Object)strictErrorHandling);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_20_3.SET_PLAYER_TEAM, packetWrapper -> {
            String string;
            String string2;
            String[] stringArray;
            ScoreboardTeamStorage scoreboardTeamStorage = (ScoreboardTeamStorage)packetWrapper.user().get(ScoreboardTeamStorage.class);
            String string3 = (String)packetWrapper.passthrough(Types.STRING);
            byte by = (Byte)packetWrapper.passthrough((Type)Types.BYTE);
            if (by == 0) {
                this.componentRewriter.passthroughAndProcess(packetWrapper);
                packetWrapper.passthrough((Type)Types.BYTE);
                packetWrapper.passthrough(Types.STRING);
                packetWrapper.passthrough(Types.STRING);
                packetWrapper.passthrough((Type)Types.VAR_INT);
                this.componentRewriter.passthroughAndProcess(packetWrapper);
                this.componentRewriter.passthroughAndProcess(packetWrapper);
                scoreboardTeamStorage.createTeam(string3);
                stringArray = (String[])packetWrapper.passthrough(Types.STRING_ARRAY);
                scoreboardTeamStorage.addPlayerToTeam(string3, stringArray);
            } else if (by == 1) {
                scoreboardTeamStorage.removeTeam(string3);
            } else if (by == 3) {
                stringArray = (String[])packetWrapper.passthrough(Types.STRING_ARRAY);
                scoreboardTeamStorage.addPlayerToTeam(string3, stringArray);
            }
            if (by != 4) {
                return;
            }
            stringArray = (String[])packetWrapper.read(Types.STRING_ARRAY);
            HashSet<String> hashSet = new HashSet<String>();
            String[] stringArray2 = stringArray;
            int n = stringArray2.length;
            for (int i = 0; i < n && Objects.equals(string2 = scoreboardTeamStorage.getPlayerTeam(string = stringArray2[i]), string3); ++i) {
                scoreboardTeamStorage.removeFromTeam(string3, string);
                hashSet.add(string);
            }
            if (!hashSet.isEmpty()) {
                packetWrapper.write(Types.STRING_ARRAY, (Object)hashSet.toArray(new String[0]));
            } else {
                packetWrapper.cancel();
            }
        });
        this.cancelServerbound(State.LOGIN, ServerboundLoginPackets.COOKIE_RESPONSE.getId());
        this.cancelServerbound(ServerboundConfigurationPackets1_20_5.COOKIE_RESPONSE);
        this.cancelServerbound(ServerboundConfigurationPackets1_20_5.SELECT_KNOWN_PACKS);
        this.cancelServerbound(ServerboundPackets1_20_5.COOKIE_RESPONSE);
        this.cancelServerbound(ServerboundPackets1_20_5.DEBUG_SAMPLE_SUBSCRIPTION);
        this.handler$eae000$viafabricplus$removeCommandHandlers(null);
    }

    public TagRewriter<ClientboundPacket1_20_3> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPacket1_20_3> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData1_20_5 getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_20_5 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_20_5 getEntityRewriter() {
        return this.entityRewriter;
    }

    private void handler$eae000$viafabricplus$removeCommandHandlers(CallbackInfo callbackInfo) {
        this.registerServerbound(ServerboundPackets1_20_5.CHAT, ServerboundPackets1_20_3.CHAT, null, true);
        this.registerServerbound(ServerboundPackets1_20_5.CHAT_ACK, ServerboundPackets1_20_3.CHAT_ACK, null, true);
        this.registerServerbound(ServerboundPackets1_20_5.CHAT_SESSION_UPDATE, ServerboundPackets1_20_3.CHAT_SESSION_UPDATE, null, true);
        this.registerServerbound(ServerboundPackets1_20_5.CHAT_COMMAND_SIGNED, ServerboundPackets1_20_3.CHAT_COMMAND, null, true);
        this.registerServerbound(ServerboundPackets1_20_5.CHAT_COMMAND, ServerboundPackets1_20_3.CHAT_COMMAND, packetWrapper -> {
            NotificationUtil.warnIncompatibilityPacket((String)"1.20.5", (String)"CHAT_COMMAND", (String)"ClientPlayNetworkHandler#sendChatCommand", (String)"ClientPacketListener#sendCommand");
            packetWrapper.cancel();
        }, true);
    }

    private void fixChatAck(PacketWrapper packetWrapper, AcknowledgedMessagesStorage acknowledgedMessagesStorage) {
        int n = (Integer)packetWrapper.read((Type)Types.VAR_INT);
        BitSet bitSet = (BitSet)packetWrapper.read((Type)Types.ACKNOWLEDGED_BIT_SET);
        int n2 = acknowledgedMessagesStorage.updateFromMessage(n, bitSet);
        packetWrapper.write((Type)Types.VAR_INT, (Object)n2);
        packetWrapper.write((Type)Types.ACKNOWLEDGED_BIT_SET, (Object)bitSet);
    }

    private void writeSpoofedChatAck(PacketWrapper packetWrapper, AcknowledgedMessagesStorage acknowledgedMessagesStorage) {
        packetWrapper.write((Type)Types.VAR_INT, (Object)0);
        packetWrapper.write((Type)Types.ACKNOWLEDGED_BIT_SET, (Object)acknowledgedMessagesStorage.createSpoofedAck());
    }
}

