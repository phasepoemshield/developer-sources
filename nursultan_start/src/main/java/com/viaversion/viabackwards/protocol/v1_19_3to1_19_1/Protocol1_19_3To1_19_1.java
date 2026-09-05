/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.data.BackwardsMappingData
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_19_1to1_19.Protocol1_19_1To1_19
 *  com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.ChatRegistryStorage
 *  com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.storage.ChatSessionStorage
 *  com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.storage.ChatTypeStorage1_19_3
 *  com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.storage.NonceStorage
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.PlayerMessageSignature
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3
 *  com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider
 *  com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata
 *  com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_3
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.BitSetType
 *  com.viaversion.viaversion.api.type.types.ByteArrayType
 *  com.viaversion.viaversion.api.type.types.ByteArrayType$OptionalByteArrayType
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.Protocol1_19_1To1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.CommandRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Pair
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_19_3to1_19_1;

import com.google.common.base.Preconditions;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.data.BackwardsMappingData;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_19_1to1_19.Protocol1_19_1To1_19;
import com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.ChatRegistryStorage;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.rewriter.BlockItemPacketRewriter1_19_3;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.rewriter.EntityPacketRewriter1_19_3;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.storage.ChatSessionStorage;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.storage.ChatTypeStorage1_19_3;
import com.viaversion.viabackwards.protocol.v1_19_3to1_19_1.storage.NonceStorage;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.PlayerMessageSignature;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3;
import com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider;
import com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_3;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.BitSetType;
import com.viaversion.viaversion.api.type.types.ByteArrayType;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.Protocol1_19_1To1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.CommandRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Pair;
import java.security.SignatureException;
import java.util.BitSet;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class Protocol1_19_3To1_19_1
extends BackwardsProtocol<ClientboundPackets1_19_3, ClientboundPackets1_19_1, ServerboundPackets1_19_3, ServerboundPackets1_19_1> {
    public static final BackwardsMappingData MAPPINGS = new BackwardsMappingData("1.19.3", "1.19", Protocol1_19_1To1_19_3.class);
    public static final ByteArrayType.OptionalByteArrayType OPTIONAL_SIGNATURE_BYTES_TYPE = new ByteArrayType.OptionalByteArrayType(256);
    public static final ByteArrayType SIGNATURE_BYTES_TYPE = new ByteArrayType(256);
    private final EntityPacketRewriter1_19_3 entityRewriter = new EntityPacketRewriter1_19_3(this);
    private final BlockItemPacketRewriter1_19_3 itemRewriter = new BlockItemPacketRewriter1_19_3(this);
    private final ParticleRewriter<ClientboundPackets1_19_3> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_19_3> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
    private final TagRewriter<ClientboundPackets1_19_3> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_19_3> blockRewriter = BlockRewriter.for1_18((Protocol)this, ChunkType1_18::new);

    public Protocol1_19_3To1_19_1() {
        super(ClientboundPackets1_19_3.class, ClientboundPackets1_19_1.class, ServerboundPackets1_19_3.class, ServerboundPackets1_19_1.class);
    }

    public void init(UserConnection user) {
        user.put((StorableObject)new ChatSessionStorage());
        user.put((StorableObject)new ChatTypeStorage1_19_3());
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_19_3.PLAYER));
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_19_3> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_19_3> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_3.SOUND, wrapper -> {
            String mappedIdentifier = this.rewriteSound(wrapper);
            if (mappedIdentifier != null) {
                wrapper.write(Types.STRING, (Object)mappedIdentifier);
                wrapper.setPacketType((PacketType)ClientboundPackets1_19_1.CUSTOM_SOUND);
            }
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_3.SOUND_ENTITY, wrapper -> {
            String mappedIdentifier = this.rewriteSound(wrapper);
            if (mappedIdentifier == null) {
                return;
            }
            int mappedId = MAPPINGS.getFullSoundMappings().mappedId(mappedIdentifier);
            if (mappedId == -1) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)mappedId);
        });
        this.tagRewriter.addEmptyTag(RegistryType.BLOCK, "minecraft:non_flammable_wood");
        this.tagRewriter.addEmptyTag(RegistryType.ITEM, "minecraft:overworld_natural_logs");
        CommandRewriter commandRewriter = new CommandRewriter((Protocol)this);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_3.COMMANDS, wrapper -> {
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
                int argumentTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                int mappedArgumentTypeId = MAPPINGS.getArgumentTypeMappings().getNewId(argumentTypeId);
                Preconditions.checkArgument((mappedArgumentTypeId != -1 ? 1 : 0) != 0, (Object)("Unknown command argument type id: " + argumentTypeId));
                wrapper.write((Type)Types.VAR_INT, (Object)mappedArgumentTypeId);
                String identifier = MAPPINGS.getArgumentTypeMappings().identifier(argumentTypeId);
                commandRewriter.handleArgument(wrapper, identifier);
                if (identifier.equals("minecraft:gamemode")) {
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                }
                if ((flags & 0x10) == 0) continue;
                wrapper.passthrough(Types.STRING);
            }
            wrapper.passthrough((Type)Types.VAR_INT);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_3.SERVER_DATA, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.HELLO, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.HELLO, (PacketHandler)new /* Unavailable Anonymous Inner Class!! */);
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.ENCRYPTION_KEY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BYTE_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    NonceStorage nonceStorage = (NonceStorage)wrapper.user().remove(NonceStorage.class);
                    boolean isNonce = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    if (!isNonce) {
                        wrapper.read((Type)Types.LONG);
                        wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                        wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)(nonceStorage.nonce() != null ? nonceStorage.nonce() : new byte[]{}));
                    }
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_19_1.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.LONG);
                this.read(Types.BYTE_ARRAY_PRIMITIVE);
                this.read((Type)Types.BOOLEAN);
                this.read(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY);
                this.read(Types.OPTIONAL_PLAYER_MESSAGE_SIGNATURE);
                this.handler(wrapper -> {
                    ChatSession1_19_3 chatSession = (ChatSession1_19_3)wrapper.user().get(ChatSession1_19_3.class);
                    if (chatSession != null) {
                        byte[] signature;
                        String message = (String)wrapper.get(Types.STRING, 0);
                        long timestamp = (Long)wrapper.get((Type)Types.LONG, 0);
                        long salt = (Long)wrapper.get((Type)Types.LONG, 1);
                        MessageMetadata metadata = new MessageMetadata(null, timestamp, salt);
                        try {
                            signature = chatSession.signChatMessage(metadata, message, new PlayerMessageSignature[0]);
                        }
                        catch (SignatureException e) {
                            throw new RuntimeException(e);
                        }
                        wrapper.write((Type)OPTIONAL_SIGNATURE_BYTES_TYPE, (Object)signature);
                    } else {
                        wrapper.write((Type)OPTIONAL_SIGNATURE_BYTES_TYPE, null);
                    }
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                    wrapper.write((Type)new BitSetType(20), (Object)new BitSet(20));
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_19_1.CHAT_COMMAND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.LONG);
                this.handler(wrapper -> {
                    ChatSession1_19_3 chatSession = (ChatSession1_19_3)wrapper.user().get(ChatSession1_19_3.class);
                    SignableCommandArgumentsProvider argumentsProvider = (SignableCommandArgumentsProvider)Via.getManager().getProviders().get(SignableCommandArgumentsProvider.class);
                    String command = (String)wrapper.get(Types.STRING, 0);
                    long timestamp = (Long)wrapper.get((Type)Types.LONG, 0);
                    long salt = (Long)wrapper.get((Type)Types.LONG, 1);
                    int signatures = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (int i = 0; i < signatures; ++i) {
                        wrapper.read(Types.STRING);
                        wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                    }
                    wrapper.read((Type)Types.BOOLEAN);
                    if (chatSession != null && argumentsProvider != null) {
                        MessageMetadata metadata = new MessageMetadata(null, timestamp, salt);
                        List arguments = argumentsProvider.getSignableArguments(command);
                        wrapper.write((Type)Types.VAR_INT, (Object)arguments.size());
                        for (Pair argument : arguments) {
                            byte[] signature;
                            try {
                                signature = chatSession.signChatMessage(metadata, (String)argument.value(), new PlayerMessageSignature[0]);
                            }
                            catch (SignatureException e) {
                                throw new RuntimeException(e);
                            }
                            wrapper.write(Types.STRING, (Object)((String)argument.key()));
                            wrapper.write((Type)SIGNATURE_BYTES_TYPE, (Object)signature);
                        }
                    } else {
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                    }
                    boolean offset = false;
                    BitSet acknowledged = new BitSet(20);
                    wrapper.write((Type)Types.VAR_INT, (Object)0);
                    wrapper.write((Type)new BitSetType(20), (Object)acknowledged);
                });
                this.read(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY);
                this.read(Types.OPTIONAL_PLAYER_MESSAGE_SIGNATURE);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_19_3.PLAYER_CHAT, (ClientboundPacketType)ClientboundPackets1_19_1.SYSTEM_CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read(Types.UUID);
                this.read((Type)Types.VAR_INT);
                this.read((Type)OPTIONAL_SIGNATURE_BYTES_TYPE);
                this.handler(wrapper -> {
                    String plainContent = (String)wrapper.read(Types.STRING);
                    wrapper.read((Type)Types.LONG);
                    wrapper.read((Type)Types.LONG);
                    int lastSeen = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (int i = 0; i < lastSeen; ++i) {
                        int index = (Integer)wrapper.read((Type)Types.VAR_INT);
                        if (index != 0) continue;
                        wrapper.read((Type)SIGNATURE_BYTES_TYPE);
                    }
                    JsonElement unsignedContent = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    JsonElement content = unsignedContent != null ? unsignedContent : ComponentUtil.plainToJson((String)plainContent);
                    Protocol1_19_3To1_19_1.this.translatableRewriter.processText(wrapper.user(), content);
                    int filterMaskType = (Integer)wrapper.read((Type)Types.VAR_INT);
                    if (filterMaskType == 2) {
                        wrapper.read(Types.LONG_ARRAY_PRIMITIVE);
                    }
                    int chatTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                    JsonElement senderName = (JsonElement)wrapper.read(Types.COMPONENT);
                    JsonElement targetName = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    JsonElement result = Protocol1_19_1To1_19.decorateChatMessage((Protocol)Protocol1_19_3To1_19_1.this, (ChatRegistryStorage)((ChatRegistryStorage)wrapper.user().get(ChatTypeStorage1_19_3.class)), (int)chatTypeId, (JsonElement)senderName, (JsonElement)targetName, (JsonElement)content);
                    if (result == null) {
                        wrapper.cancel();
                        return;
                    }
                    wrapper.write(Types.COMPONENT, (Object)result);
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                });
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_19_3.DISGUISED_CHAT, (ClientboundPacketType)ClientboundPackets1_19_1.SYSTEM_CHAT, wrapper -> {
            JsonElement content = (JsonElement)wrapper.read(Types.COMPONENT);
            this.translatableRewriter.processText(wrapper.user(), content);
            int chatTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
            JsonElement senderName = (JsonElement)wrapper.read(Types.COMPONENT);
            JsonElement targetName = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
            JsonElement result = Protocol1_19_1To1_19.decorateChatMessage((Protocol)this, (ChatRegistryStorage)((ChatRegistryStorage)wrapper.user().get(ChatTypeStorage1_19_3.class)), (int)chatTypeId, (JsonElement)senderName, (JsonElement)targetName, (JsonElement)content);
            if (result == null) {
                wrapper.cancel();
                return;
            }
            wrapper.write(Types.COMPONENT, (Object)result);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_19_3.UPDATE_ENABLED_FEATURES);
        this.cancelServerbound((ServerboundPacketType)ServerboundPackets1_19_1.CHAT_PREVIEW);
        this.cancelServerbound((ServerboundPacketType)ServerboundPackets1_19_1.CHAT_ACK);
    }

    public TagRewriter<ClientboundPackets1_19_3> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_19_3> getBlockRewriter() {
        return this.blockRewriter;
    }

    public BackwardsMappingData getMappingData() {
        return MAPPINGS;
    }

    public BlockItemPacketRewriter1_19_3 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_19_3 getEntityRewriter() {
        return this.entityRewriter;
    }

    private @Nullable String rewriteSound(PacketWrapper wrapper) {
        Holder holder = (Holder)wrapper.read((Type)Types.SOUND_EVENT);
        if (holder.hasId()) {
            int mappedId = MAPPINGS.getSoundMappings().getNewId(holder.id());
            if (mappedId == -1) {
                wrapper.cancel();
                return null;
            }
            wrapper.write((Type)Types.VAR_INT, (Object)mappedId);
            return null;
        }
        String soundIdentifier = ((SoundEvent)holder.value()).identifier();
        String mappedIdentifier = MAPPINGS.getMappedNamedSound(soundIdentifier);
        if (mappedIdentifier == null) {
            return soundIdentifier;
        }
        if (mappedIdentifier.isEmpty()) {
            wrapper.cancel();
            return null;
        }
        return mappedIdentifier;
    }
}

