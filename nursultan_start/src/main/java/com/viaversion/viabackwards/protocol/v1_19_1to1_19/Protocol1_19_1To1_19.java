/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.ChatRegistryStorage
 *  com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.ChatRegistryStorage1_19_1
 *  com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.NonceStorage
 *  com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.ReceivedMessagesStorage
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.PlayerMessageSignature
 *  com.viaversion.viaversion.api.minecraft.ProfileKey
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19
 *  com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider
 *  com.viaversion.viaversion.api.minecraft.signature.model.DecoratableMessage
 *  com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata
 *  com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_1
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
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.Protocol1_18_2To1_19
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.Protocol1_19To1_19_1
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.CipherUtil
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Pair
 *  com.viaversion.viaversion.util.TagUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viabackwards.protocol.v1_19_1to1_19;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_19_1to1_19.rewriter.EntityPacketRewriter1_19_1;
import com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.ChatRegistryStorage;
import com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.ChatRegistryStorage1_19_1;
import com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.NonceStorage;
import com.viaversion.viabackwards.protocol.v1_19_1to1_19.storage.ReceivedMessagesStorage;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.PlayerMessageSignature;
import com.viaversion.viaversion.api.minecraft.ProfileKey;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19;
import com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider;
import com.viaversion.viaversion.api.minecraft.signature.model.DecoratableMessage;
import com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_1;
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
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.Protocol1_18_2To1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.Protocol1_19To1_19_1;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.CipherUtil;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Pair;
import com.viaversion.viaversion.util.TagUtil;
import java.security.SignatureException;
import java.util.List;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class Protocol1_19_1To1_19
extends BackwardsProtocol<ClientboundPackets1_19_1, ClientboundPackets1_19, ServerboundPackets1_19_1, ServerboundPackets1_19> {
    public static final int SYSTEM_CHAT_ID = 1;
    public static final int GAME_INFO_ID = 2;
    private static final UUID ZERO_UUID = new UUID(0L, 0L);
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final EntityPacketRewriter1_19_1 entityRewriter = new EntityPacketRewriter1_19_1(this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_19_1> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);

    public Protocol1_19_1To1_19() {
        super(ClientboundPackets1_19_1.class, ClientboundPackets1_19.class, ServerboundPackets1_19_1.class, ServerboundPackets1_19.class);
    }

    public void init(UserConnection user) {
        user.put((StorableObject)new ChatRegistryStorage1_19_1());
        user.put((StorableObject)new ReceivedMessagesStorage());
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_19.PLAYER));
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_19_1> getComponentRewriter() {
        return this.translatableRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_19_1.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.map(Types.NAMED_COMPOUND_TAG);
                this.map(Types.STRING);
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    ChatRegistryStorage chatTypeStorage = (ChatRegistryStorage)wrapper.user().get(ChatRegistryStorage1_19_1.class);
                    chatTypeStorage.clear();
                    CompoundTag registry = (CompoundTag)wrapper.get(Types.NAMED_COMPOUND_TAG, 0);
                    ListTag chatTypes = TagUtil.removeRegistryEntries((CompoundTag)registry, (String)"chat_type", (ListTag)new ListTag(CompoundTag.class));
                    for (CompoundTag chatType : chatTypes) {
                        NumberTag idTag = chatType.getNumberTag("id");
                        chatTypeStorage.addChatType(idTag.asInt(), chatType);
                    }
                    registry.put("minecraft:chat_type", (Tag)Protocol1_18_2To1_19.MAPPINGS.chatRegistry());
                });
                this.handler(Protocol1_19_1To1_19.this.entityRewriter.worldTrackerHandlerByKey());
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_19_1.PLAYER_CHAT, (ClientboundPacketType)ClientboundPackets1_19.SYSTEM_CHAT, wrapper -> {
            int filterMaskType;
            wrapper.read(Types.OPTIONAL_BYTE_ARRAY_PRIMITIVE);
            PlayerMessageSignature signature = (PlayerMessageSignature)wrapper.read(Types.PLAYER_MESSAGE_SIGNATURE);
            if (!signature.uuid().equals(ZERO_UUID) && signature.signatureBytes().length != 0) {
                ReceivedMessagesStorage messagesStorage = (ReceivedMessagesStorage)wrapper.user().get(ReceivedMessagesStorage.class);
                messagesStorage.add(signature);
                if (messagesStorage.tickUnacknowledged() > 64) {
                    messagesStorage.resetUnacknowledgedCount();
                    PacketWrapper chatAckPacket = wrapper.create((PacketType)ServerboundPackets1_19_1.CHAT_ACK);
                    chatAckPacket.write(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY, (Object)messagesStorage.lastSignatures());
                    chatAckPacket.write(Types.OPTIONAL_PLAYER_MESSAGE_SIGNATURE, null);
                    chatAckPacket.sendToServer(Protocol1_19_1To1_19.class);
                }
            }
            String plainMessage = (String)wrapper.read(Types.STRING);
            JsonElement message = null;
            JsonElement decoratedMessage = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
            if (decoratedMessage != null) {
                message = decoratedMessage;
            }
            wrapper.read((Type)Types.LONG);
            wrapper.read((Type)Types.LONG);
            wrapper.read(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY);
            JsonElement unsignedMessage = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
            if (unsignedMessage != null) {
                message = unsignedMessage;
            }
            if (message == null) {
                message = ComponentUtil.plainToJson((String)plainMessage);
            }
            if ((filterMaskType = ((Integer)wrapper.read((Type)Types.VAR_INT)).intValue()) == 2) {
                wrapper.read(Types.LONG_ARRAY_PRIMITIVE);
            }
            int chatTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
            JsonElement senderName = (JsonElement)wrapper.read(Types.COMPONENT);
            JsonElement targetName = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
            decoratedMessage = Protocol1_19_1To1_19.decorateChatMessage((Protocol)this, (ChatRegistryStorage)wrapper.user().get(ChatRegistryStorage1_19_1.class), chatTypeId, senderName, targetName, message);
            if (decoratedMessage == null) {
                wrapper.cancel();
                return;
            }
            this.translatableRewriter.processText(wrapper.user(), decoratedMessage);
            wrapper.write(Types.COMPONENT, (Object)decoratedMessage);
            wrapper.write((Type)Types.VAR_INT, (Object)1);
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_1.SYSTEM_CHAT, wrapper -> {
            JsonElement content = (JsonElement)wrapper.passthrough(Types.COMPONENT);
            this.translatableRewriter.processText(wrapper.user(), content);
            boolean overlay = (Boolean)wrapper.read((Type)Types.BOOLEAN);
            wrapper.write((Type)Types.VAR_INT, (Object)(overlay ? 2 : 1));
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_19.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.LONG);
                this.read(Types.BYTE_ARRAY_PRIMITIVE);
                this.read((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    ChatSession1_19_1 chatSession = (ChatSession1_19_1)wrapper.user().get(ChatSession1_19_1.class);
                    ReceivedMessagesStorage messagesStorage = (ReceivedMessagesStorage)wrapper.user().get(ReceivedMessagesStorage.class);
                    if (chatSession != null) {
                        byte[] signature;
                        UUID sender = wrapper.user().getProtocolInfo().getUuid();
                        String message = (String)wrapper.get(Types.STRING, 0);
                        long timestamp = (Long)wrapper.get((Type)Types.LONG, 0);
                        long salt = (Long)wrapper.get((Type)Types.LONG, 1);
                        MessageMetadata metadata = new MessageMetadata(sender, timestamp, salt);
                        DecoratableMessage decoratableMessage = new DecoratableMessage(message);
                        try {
                            signature = chatSession.signChatMessage(metadata, decoratableMessage, messagesStorage.lastSignatures());
                        }
                        catch (SignatureException e) {
                            throw new RuntimeException(e);
                        }
                        wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)signature);
                        wrapper.write((Type)Types.BOOLEAN, (Object)decoratableMessage.isDecorated());
                    } else {
                        wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)EMPTY_BYTES);
                        wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    }
                    messagesStorage.resetUnacknowledgedCount();
                    wrapper.write(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY, (Object)messagesStorage.lastSignatures());
                    wrapper.write(Types.OPTIONAL_PLAYER_MESSAGE_SIGNATURE, null);
                });
            }
        });
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_19.CHAT_COMMAND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.LONG);
                this.handler(wrapper -> {
                    ReceivedMessagesStorage messagesStorage = (ReceivedMessagesStorage)wrapper.user().get(ReceivedMessagesStorage.class);
                    ChatSession1_19_1 chatSession = (ChatSession1_19_1)wrapper.user().get(ChatSession1_19_1.class);
                    SignableCommandArgumentsProvider argumentsProvider = (SignableCommandArgumentsProvider)Via.getManager().getProviders().get(SignableCommandArgumentsProvider.class);
                    if (chatSession != null && argumentsProvider != null) {
                        int signatures = (Integer)wrapper.read((Type)Types.VAR_INT);
                        for (int i = 0; i < signatures; ++i) {
                            wrapper.read(Types.STRING);
                            wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                        }
                        UUID sender = wrapper.user().getProtocolInfo().getUuid();
                        String command = (String)wrapper.get(Types.STRING, 0);
                        long timestamp = (Long)wrapper.get((Type)Types.LONG, 0);
                        long salt = (Long)wrapper.get((Type)Types.LONG, 1);
                        MessageMetadata metadata = new MessageMetadata(sender, timestamp, salt);
                        List arguments = argumentsProvider.getSignableArguments(command);
                        wrapper.write((Type)Types.VAR_INT, (Object)arguments.size());
                        for (Pair argument : arguments) {
                            byte[] signature;
                            try {
                                signature = chatSession.signChatMessage(metadata, new DecoratableMessage((String)argument.value()), messagesStorage.lastSignatures());
                            }
                            catch (SignatureException e) {
                                throw new RuntimeException(e);
                            }
                            wrapper.write(Types.STRING, (Object)((String)argument.key()));
                            wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)signature);
                        }
                    } else {
                        int signatures = (Integer)wrapper.passthrough((Type)Types.VAR_INT);
                        for (int i = 0; i < signatures; ++i) {
                            wrapper.passthrough(Types.STRING);
                            wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                            wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)EMPTY_BYTES);
                        }
                    }
                    wrapper.passthrough((Type)Types.BOOLEAN);
                    messagesStorage.resetUnacknowledgedCount();
                    wrapper.write(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY, (Object)messagesStorage.lastSignatures());
                    wrapper.write(Types.OPTIONAL_PLAYER_MESSAGE_SIGNATURE, null);
                });
            }
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19_1.SERVER_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.OPTIONAL_COMPONENT);
                this.map(Types.OPTIONAL_STRING);
                this.map((Type)Types.BOOLEAN);
                this.read((Type)Types.BOOLEAN);
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    ProfileKey profileKey = (ProfileKey)wrapper.read(Types.OPTIONAL_PROFILE_KEY);
                    ChatSession1_19_1 chatSession = (ChatSession1_19_1)wrapper.user().get(ChatSession1_19_1.class);
                    wrapper.write(Types.OPTIONAL_PROFILE_KEY, (Object)(chatSession == null ? null : chatSession.getProfileKey()));
                    wrapper.write(Types.OPTIONAL_UUID, (Object)(chatSession == null ? null : chatSession.getUuid()));
                    if (profileKey == null || chatSession != null) {
                        wrapper.user().put((StorableObject)new NonceStorage(null));
                    }
                });
            }
        });
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    if (wrapper.user().has(NonceStorage.class)) {
                        return;
                    }
                    byte[] publicKey = (byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
                    byte[] nonce = (byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
                    wrapper.user().put((StorableObject)new NonceStorage(CipherUtil.encryptNonce((byte[])publicKey, (byte[])nonce)));
                });
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.ENCRYPTION_KEY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BYTE_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    NonceStorage nonceStorage = (NonceStorage)wrapper.user().remove(NonceStorage.class);
                    if (nonceStorage.nonce() == null) {
                        return;
                    }
                    boolean isNonce = (Boolean)wrapper.read((Type)Types.BOOLEAN);
                    wrapper.write((Type)Types.BOOLEAN, (Object)true);
                    if (!isNonce) {
                        wrapper.read((Type)Types.LONG);
                        wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                        wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)nonceStorage.nonce());
                    }
                });
            }
        });
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.CUSTOM_QUERY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    String identifier = (String)wrapper.get(Types.STRING, 0);
                    if (identifier.equals("velocity:player_info")) {
                        byte[] data = (byte[])wrapper.passthrough(Types.REMAINING_BYTES);
                        if (data.length == 1 && data[0] > 1) {
                            data[0] = 1;
                        } else if (data.length == 0) {
                            data = new byte[]{1};
                            wrapper.set(Types.REMAINING_BYTES, 0, (Object)data);
                        } else {
                            Protocol1_19_1To1_19.this.getLogger().warning("Received unexpected data in velocity:player_info (length=" + data.length + ")");
                        }
                    }
                });
            }
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_19_1.CUSTOM_CHAT_COMPLETIONS);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_19_1.DELETE_CHAT);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_19_1.PLAYER_CHAT_HEADER);
    }

    public EntityPacketRewriter1_19_1 getEntityRewriter() {
        return this.entityRewriter;
    }

    public static @Nullable JsonElement decorateChatMessage(Protocol protocol, ChatRegistryStorage chatRegistryStorage, int chatTypeId, JsonElement senderName, @Nullable JsonElement targetName, JsonElement message) {
        CompoundTag chatType = chatRegistryStorage.chatType(chatTypeId);
        if (chatType == null) {
            protocol.getLogger().warning("Chat message has unknown chat type id " + chatTypeId + ". Message: " + String.valueOf(message));
            return null;
        }
        if ((chatType = chatType.getCompoundTag("element").getCompoundTag("chat")) == null) {
            return null;
        }
        return Protocol1_19To1_19_1.translatabaleComponentFromTag((CompoundTag)chatType, (JsonElement)senderName, (JsonElement)targetName, (JsonElement)message);
    }
}

