/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.nbt.tag.ByteTag
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.nbt.tag.ListTag
 *  com.viaversion.nbt.tag.NumberTag
 *  com.viaversion.nbt.tag.StringTag
 *  com.viaversion.nbt.tag.Tag
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.ProfileKey
 *  com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider
 *  com.viaversion.viaversion.api.minecraft.signature.model.DecoratableMessage
 *  com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata
 *  com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_0
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.libs.mcstructs.text.Style
 *  com.viaversion.viaversion.libs.mcstructs.text.TextComponent
 *  com.viaversion.viaversion.libs.mcstructs.text.TextFormatting
 *  com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.data.ChatDecorationResult
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.data.ChatRegistry1_19_1
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.storage.ChatTypeStorage
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.storage.NonceStorage1_19_1
 *  com.viaversion.viaversion.util.CipherUtil
 *  com.viaversion.viaversion.util.Pair
 *  com.viaversion.viaversion.util.ProtocolLogger
 *  com.viaversion.viaversion.util.SerializerVersion
 *  com.viaversion.viaversion.util.TagUtil
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocols.v1_19to1_19_1;

import com.google.common.base.Preconditions;
import com.viaversion.nbt.tag.ByteTag;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.nbt.tag.ListTag;
import com.viaversion.nbt.tag.NumberTag;
import com.viaversion.nbt.tag.StringTag;
import com.viaversion.nbt.tag.Tag;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.ProfileKey;
import com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider;
import com.viaversion.viaversion.api.minecraft.signature.model.DecoratableMessage;
import com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_0;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.libs.mcstructs.text.Style;
import com.viaversion.viaversion.libs.mcstructs.text.TextComponent;
import com.viaversion.viaversion.libs.mcstructs.text.TextFormatting;
import com.viaversion.viaversion.libs.mcstructs.text.components.TranslationComponent;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.data.ChatDecorationResult;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.data.ChatRegistry1_19_1;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.storage.ChatTypeStorage;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.storage.NonceStorage1_19_1;
import com.viaversion.viaversion.util.CipherUtil;
import com.viaversion.viaversion.util.Pair;
import com.viaversion.viaversion.util.ProtocolLogger;
import com.viaversion.viaversion.util.SerializerVersion;
import com.viaversion.viaversion.util.TagUtil;
import java.security.SignatureException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import org.checkerframework.checker.nullness.qual.Nullable;

public final class Protocol1_19To1_19_1
extends AbstractProtocol<ClientboundPackets1_19, ClientboundPackets1_19_1, ServerboundPackets1_19, ServerboundPackets1_19_1> {
    public static final ProtocolLogger LOGGER = new ProtocolLogger(Protocol1_19To1_19_1.class);

    public Protocol1_19To1_19_1() {
        super(ClientboundPackets1_19.class, ClientboundPackets1_19_1.class, ServerboundPackets1_19.class, ServerboundPackets1_19_1.class);
    }

    protected void registerPackets() {
        this.registerClientbound(ClientboundPackets1_19.SYSTEM_CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.COMPONENT);
                this.handler(wrapper -> {
                    int type = (Integer)wrapper.read((Type)Types.VAR_INT);
                    boolean overlay = type == 2;
                    wrapper.write((Type)Types.BOOLEAN, (Object)overlay);
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_19.PLAYER_CHAT, ClientboundPackets1_19_1.SYSTEM_CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    JsonElement signedContent = (JsonElement)wrapper.read(Types.COMPONENT);
                    JsonElement unsignedContent = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    int chatTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.read(Types.UUID);
                    JsonElement senderName = (JsonElement)wrapper.read(Types.COMPONENT);
                    JsonElement teamName = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    CompoundTag chatType = ((ChatTypeStorage)wrapper.user().get(ChatTypeStorage.class)).chatType(chatTypeId);
                    ChatDecorationResult decorationResult = Protocol1_19To1_19_1.decorateChatMessage(chatType, chatTypeId, senderName, teamName, unsignedContent != null ? unsignedContent : signedContent);
                    if (decorationResult == null) {
                        wrapper.cancel();
                        return;
                    }
                    wrapper.write(Types.COMPONENT, (Object)decorationResult.content());
                    wrapper.write((Type)Types.BOOLEAN, (Object)decorationResult.overlay());
                });
                this.read((Type)Types.LONG);
                this.read((Type)Types.LONG);
                this.read(Types.BYTE_ARRAY_PRIMITIVE);
            }
        });
        this.registerServerbound(ServerboundPackets1_19_1.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.LONG);
                this.map(Types.BYTE_ARRAY_PRIMITIVE);
                this.map((Type)Types.BOOLEAN);
                this.handler(wrapper -> {
                    ChatSession1_19_0 chatSession = (ChatSession1_19_0)wrapper.user().get(ChatSession1_19_0.class);
                    if (chatSession != null) {
                        byte[] signature;
                        UUID sender = wrapper.user().getProtocolInfo().getUuid();
                        String message = (String)wrapper.get(Types.STRING, 0);
                        long timestamp = (Long)wrapper.get((Type)Types.LONG, 0);
                        long salt = (Long)wrapper.get((Type)Types.LONG, 1);
                        MessageMetadata metadata = new MessageMetadata(sender, timestamp, salt);
                        DecoratableMessage decoratableMessage = new DecoratableMessage(message);
                        try {
                            signature = chatSession.signChatMessage(metadata, decoratableMessage);
                        }
                        catch (SignatureException e) {
                            throw new RuntimeException(e);
                        }
                        wrapper.set(Types.BYTE_ARRAY_PRIMITIVE, 0, (Object)signature);
                        wrapper.set((Type)Types.BOOLEAN, 0, (Object)decoratableMessage.isDecorated());
                    }
                });
                this.read(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY);
                this.read(Types.OPTIONAL_PLAYER_MESSAGE_SIGNATURE);
            }
        });
        this.registerServerbound(ServerboundPackets1_19_1.CHAT_COMMAND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.LONG);
                this.handler(wrapper -> {
                    ChatSession1_19_0 chatSession = (ChatSession1_19_0)wrapper.user().get(ChatSession1_19_0.class);
                    SignableCommandArgumentsProvider argumentsProvider = (SignableCommandArgumentsProvider)Via.getManager().getProviders().get(SignableCommandArgumentsProvider.class);
                    int signatures = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (int i = 0; i < signatures; ++i) {
                        wrapper.read(Types.STRING);
                        wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                    }
                    if (chatSession != null && argumentsProvider != null) {
                        UUID sender = wrapper.user().getProtocolInfo().getUuid();
                        String message = (String)wrapper.get(Types.STRING, 0);
                        long timestamp = (Long)wrapper.get((Type)Types.LONG, 0);
                        long salt = (Long)wrapper.get((Type)Types.LONG, 1);
                        List arguments = argumentsProvider.getSignableArguments(message);
                        wrapper.write((Type)Types.VAR_INT, (Object)arguments.size());
                        for (Pair argument : arguments) {
                            byte[] signature;
                            MessageMetadata metadata = new MessageMetadata(sender, timestamp, salt);
                            DecoratableMessage decoratableMessage = new DecoratableMessage((String)argument.value());
                            try {
                                signature = chatSession.signChatMessage(metadata, decoratableMessage);
                            }
                            catch (SignatureException e) {
                                throw new RuntimeException(e);
                            }
                            wrapper.write(Types.STRING, (Object)((String)argument.key()));
                            wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)signature);
                        }
                    } else {
                        wrapper.write((Type)Types.VAR_INT, (Object)0);
                    }
                });
                this.map((Type)Types.BOOLEAN);
                this.read(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY);
                this.read(Types.OPTIONAL_PLAYER_MESSAGE_SIGNATURE);
            }
        });
        this.cancelServerbound(ServerboundPackets1_19_1.CHAT_ACK);
        this.registerClientbound(ClientboundPackets1_19.LOGIN, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.INT);
                this.map((Type)Types.BOOLEAN);
                this.map((Type)Types.BYTE);
                this.map((Type)Types.BYTE);
                this.map(Types.STRING_ARRAY);
                this.handler(wrapper -> {
                    ChatTypeStorage chatTypeStorage = (ChatTypeStorage)wrapper.user().get(ChatTypeStorage.class);
                    chatTypeStorage.clear();
                    CompoundTag registry = (CompoundTag)wrapper.passthrough(Types.NAMED_COMPOUND_TAG);
                    ListTag chatTypes = TagUtil.removeRegistryEntries((CompoundTag)registry, (String)"chat_type");
                    for (CompoundTag chatType : chatTypes) {
                        NumberTag idTag = chatType.getNumberTag("id");
                        chatTypeStorage.addChatType(idTag.asInt(), chatType);
                    }
                    registry.put("minecraft:chat_type", (Tag)ChatRegistry1_19_1.chatRegistry());
                });
            }
        });
        this.registerClientbound(ClientboundPackets1_19.SERVER_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.OPTIONAL_COMPONENT);
                this.map(Types.OPTIONAL_STRING);
                this.map((Type)Types.BOOLEAN);
                this.create((Type)Types.BOOLEAN, Via.getConfig().enforceSecureChat());
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    ProfileKey profileKey = (ProfileKey)wrapper.read(Types.OPTIONAL_PROFILE_KEY);
                    ChatSession1_19_0 chatSession = (ChatSession1_19_0)wrapper.user().get(ChatSession1_19_0.class);
                    wrapper.write(Types.OPTIONAL_PROFILE_KEY, (Object)(chatSession == null ? null : chatSession.getProfileKey()));
                    if (profileKey == null || chatSession != null) {
                        wrapper.user().put((StorableObject)new NonceStorage1_19_1(null));
                    }
                });
                this.read(Types.OPTIONAL_UUID);
            }
        });
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    if (wrapper.user().has(NonceStorage1_19_1.class)) {
                        return;
                    }
                    byte[] publicKey = (byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
                    byte[] nonce = (byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE);
                    wrapper.user().put((StorableObject)new NonceStorage1_19_1(CipherUtil.encryptNonce((byte[])publicKey, (byte[])nonce)));
                });
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.ENCRYPTION_KEY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BYTE_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    NonceStorage1_19_1 nonceStorage = (NonceStorage1_19_1)wrapper.user().remove(NonceStorage1_19_1.class);
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
                            LOGGER.warning("Received unexpected data in velocity:player_info (length=" + data.length + ")");
                        }
                    }
                });
            }
        });
    }

    public void init(UserConnection connection) {
        connection.put((StorableObject)new ChatTypeStorage());
    }

    public ProtocolLogger getLogger() {
        return LOGGER;
    }

    public static @Nullable ChatDecorationResult decorateChatMessage(CompoundTag chatType, int chatTypeId, JsonElement senderName, @Nullable JsonElement teamName, JsonElement message) {
        CompoundTag decoration;
        if (chatType == null) {
            LOGGER.warning("Chat message has unknown chat type id " + chatTypeId + ". Message: " + String.valueOf(message));
            return null;
        }
        CompoundTag chatData = chatType.getCompoundTag("element").getCompoundTag("chat");
        boolean overlay = false;
        if (chatData == null) {
            chatData = chatType.getCompoundTag("element").getCompoundTag("overlay");
            if (chatData == null) {
                return null;
            }
            overlay = true;
        }
        if ((decoration = chatData.getCompoundTag("decoration")) == null) {
            return new ChatDecorationResult(message, overlay);
        }
        return new ChatDecorationResult(Protocol1_19To1_19_1.translatabaleComponentFromTag(decoration, senderName, teamName, message), overlay);
    }

    public static JsonElement translatabaleComponentFromTag(CompoundTag tag, JsonElement senderName, @Nullable JsonElement targetName, JsonElement message) {
        String translationKey = tag.getStringTag("translation_key").getValue();
        Style style = new Style();
        CompoundTag styleTag = tag.getCompoundTag("style");
        if (styleTag != null) {
            Object textColor;
            StringTag color = styleTag.getStringTag("color");
            if (color != null && (textColor = TextFormatting.getByName((String)color.getValue())) != null) {
                style.setFormatting((TextFormatting)textColor);
            }
            for (Map.Entry entry : TextFormatting.FORMATTINGS.entrySet()) {
                NumberTag formattingTag = styleTag.getNumberTag((String)entry.getKey());
                if (!(formattingTag instanceof ByteTag)) continue;
                boolean value = formattingTag.asBoolean();
                TextFormatting formatting = (TextFormatting)entry.getValue();
                if (formatting == TextFormatting.OBFUSCATED) {
                    style.setObfuscated(Boolean.valueOf(value));
                    continue;
                }
                if (formatting == TextFormatting.BOLD) {
                    style.setBold(Boolean.valueOf(value));
                    continue;
                }
                if (formatting == TextFormatting.STRIKETHROUGH) {
                    style.setStrikethrough(Boolean.valueOf(value));
                    continue;
                }
                if (formatting == TextFormatting.UNDERLINE) {
                    style.setUnderlined(Boolean.valueOf(value));
                    continue;
                }
                if (formatting != TextFormatting.ITALIC) continue;
                style.setItalic(Boolean.valueOf(value));
            }
        }
        ListTag parameters = tag.getListTag("parameters", StringTag.class);
        ArrayList<TextComponent> arguments = new ArrayList<TextComponent>();
        if (parameters != null) {
            for (StringTag element : parameters) {
                JsonElement argument = null;
                switch (element.getValue()) {
                    case "sender": {
                        argument = senderName;
                        break;
                    }
                    case "content": {
                        argument = message;
                        break;
                    }
                    case "team_name": 
                    case "target": {
                        Preconditions.checkNotNull((Object)targetName, (Object)"Team name is null");
                        argument = targetName;
                        break;
                    }
                    default: {
                        LOGGER.warning("Unknown parameter for chat decoration: " + element.getValue());
                    }
                }
                if (argument == null) continue;
                arguments.add(SerializerVersion.V1_18.toComponent(argument));
            }
        }
        return SerializerVersion.V1_18.toJson((TextComponent)new TranslationComponent(translationKey, arguments));
    }
}

