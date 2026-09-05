/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.SoundRewriter
 *  com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.DimensionRegistryStorage
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.EntityTracker1_19
 *  com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.NonceStorage
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider
 *  com.viaversion.viaversion.api.minecraft.signature.model.DecoratableMessage
 *  com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata
 *  com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_0
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandlers
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17
 *  com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.Protocol1_19To1_19_1
 *  com.viaversion.viaversion.protocols.v1_19to1_19_1.data.ChatDecorationResult
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.rewriter.text.ComponentRewriterBase$ReadType
 *  com.viaversion.viaversion.util.Pair
 */
package com.viaversion.viabackwards.protocol.v1_19to1_18_2;

import com.google.common.primitives.Longs;
import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.SoundRewriter;
import com.viaversion.viabackwards.api.rewriters.text.JsonNBTComponentRewriter;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.data.BackwardsMappingData1_19;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.rewriter.BlockItemPacketRewriter1_19;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.rewriter.CommandRewriter1_19;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.rewriter.EntityPacketRewriter1_19;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.DimensionRegistryStorage;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.EntityTracker1_19;
import com.viaversion.viabackwards.protocol.v1_19to1_18_2.storage.NonceStorage;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider;
import com.viaversion.viaversion.api.minecraft.signature.model.DecoratableMessage;
import com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_0;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandlers;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_16_4to1_17.packet.ServerboundPackets1_17;
import com.viaversion.viaversion.protocols.v1_17_1to1_18.packet.ClientboundPackets1_18;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ServerboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.Protocol1_19To1_19_1;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.data.ChatDecorationResult;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.rewriter.text.ComponentRewriterBase;
import com.viaversion.viaversion.util.Pair;
import java.security.SignatureException;
import java.time.Instant;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public final class Protocol1_19To1_18_2
extends BackwardsProtocol<ClientboundPackets1_19, ClientboundPackets1_18, ServerboundPackets1_19, ServerboundPackets1_17> {
    public static final BackwardsMappingData1_19 MAPPINGS = new BackwardsMappingData1_19();
    private static final UUID ZERO_UUID = new UUID(0L, 0L);
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final EntityPacketRewriter1_19 entityRewriter = new EntityPacketRewriter1_19(this);
    private final BlockItemPacketRewriter1_19 blockItemPackets = new BlockItemPacketRewriter1_19(this);
    private final ParticleRewriter<ClientboundPackets1_19> particleRewriter = new ParticleRewriter((Protocol)this);
    private final JsonNBTComponentRewriter<ClientboundPackets1_19> translatableRewriter = new JsonNBTComponentRewriter((BackwardsProtocol)this, ComponentRewriterBase.ReadType.JSON);
    private final TagRewriter<ClientboundPackets1_19> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_19> blockRewriter = BlockRewriter.for1_18((Protocol)this, ChunkType1_18::new);

    public Protocol1_19To1_18_2() {
        super(ClientboundPackets1_19.class, ClientboundPackets1_18.class, ServerboundPackets1_19.class, ServerboundPackets1_17.class);
    }

    protected void registerPackets() {
        super.registerPackets();
        final SoundRewriter soundRewriter = new SoundRewriter((AbstractProtocol)this);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19.SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.read((Type)Types.LONG);
                this.handler(soundRewriter.getSoundHandler());
            }
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19.SOUND_ENTITY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.read((Type)Types.LONG);
                this.handler(soundRewriter.getSoundHandler());
            }
        });
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19.CUSTOM_SOUND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.VAR_INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.INT);
                this.map((Type)Types.FLOAT);
                this.map((Type)Types.FLOAT);
                this.read((Type)Types.LONG);
                this.handler(soundRewriter.getNamedSoundHandler());
            }
        });
        this.tagRewriter.removeTags("minecraft:banner_pattern");
        this.tagRewriter.removeTags("minecraft:instrument");
        this.tagRewriter.removeTags("minecraft:cat_variant");
        this.tagRewriter.removeTags("minecraft:painting_variant");
        this.tagRewriter.addEmptyTag(RegistryType.BLOCK, "minecraft:polar_bears_spawnable_on_in_frozen_ocean");
        this.tagRewriter.renameTag(RegistryType.BLOCK, "minecraft:wool_carpets", "minecraft:carpets");
        this.tagRewriter.renameTag(RegistryType.ITEM, "minecraft:wool_carpets", "minecraft:carpets");
        this.tagRewriter.addEmptyTag(RegistryType.ITEM, "minecraft:occludes_vibration_signals");
        CommandRewriter1_19 commandRewriter = new CommandRewriter1_19(this);
        this.replaceClientbound((ClientboundPacketType)ClientboundPackets1_19.COMMANDS, wrapper -> {
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
                String argumentType = MAPPINGS.getArgumentTypeMappings().identifier(argumentTypeId);
                if (argumentType == null) {
                    this.getLogger().warning("Unknown command argument type id: " + argumentTypeId);
                    argumentType = "minecraft:no";
                }
                wrapper.write(Types.STRING, (Object)commandRewriter.handleArgumentType(argumentType));
                commandRewriter.handleArgument(wrapper, argumentType);
                if ((flags & 0x10) == 0) continue;
                wrapper.passthrough(Types.STRING);
            }
            wrapper.passthrough((Type)Types.VAR_INT);
        });
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_19.SERVER_DATA);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_19.CHAT_PREVIEW);
        this.cancelClientbound((ClientboundPacketType)ClientboundPackets1_19.SET_DISPLAY_CHAT_PREVIEW);
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_19.PLAYER_CHAT, (ClientboundPacketType)ClientboundPackets1_18.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    JsonElement signedContent = (JsonElement)wrapper.read(Types.COMPONENT);
                    JsonElement unsignedContent = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    int chatTypeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                    UUID sender = (UUID)wrapper.read(Types.UUID);
                    JsonElement senderName = (JsonElement)wrapper.read(Types.COMPONENT);
                    JsonElement teamName = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    CompoundTag chatType = ((DimensionRegistryStorage)wrapper.user().get(DimensionRegistryStorage.class)).chatType(chatTypeId);
                    ChatDecorationResult decorationResult = Protocol1_19To1_19_1.decorateChatMessage((CompoundTag)chatType, (int)chatTypeId, (JsonElement)senderName, (JsonElement)teamName, (JsonElement)(unsignedContent != null ? unsignedContent : signedContent));
                    if (decorationResult == null) {
                        wrapper.cancel();
                        return;
                    }
                    Protocol1_19To1_18_2.this.translatableRewriter.processText(wrapper.user(), decorationResult.content());
                    wrapper.write(Types.COMPONENT, (Object)decorationResult.content());
                    wrapper.write((Type)Types.BYTE, (Object)(decorationResult.overlay() ? (byte)2 : (byte)1));
                    wrapper.write(Types.UUID, (Object)sender);
                });
                this.read((Type)Types.LONG);
                this.read((Type)Types.LONG);
                this.read(Types.BYTE_ARRAY_PRIMITIVE);
            }
        });
        this.registerClientbound((ClientboundPacketType)ClientboundPackets1_19.SYSTEM_CHAT, (ClientboundPacketType)ClientboundPackets1_18.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.handler(wrapper -> {
                    JsonElement content = (JsonElement)wrapper.passthrough(Types.COMPONENT);
                    Protocol1_19To1_18_2.this.translatableRewriter.processText(wrapper.user(), content);
                    int typeId = (Integer)wrapper.read((Type)Types.VAR_INT);
                    wrapper.write((Type)Types.BYTE, (Object)(typeId == 2 ? (byte)2 : (byte)0));
                });
                this.create(Types.UUID, ZERO_UUID);
            }
        }, true);
        this.registerServerbound((ServerboundPacketType)ServerboundPackets1_17.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    ChatSession1_19_0 chatSession = (ChatSession1_19_0)wrapper.user().get(ChatSession1_19_0.class);
                    UUID sender = wrapper.user().getProtocolInfo().getUuid();
                    Instant timestamp = Instant.now();
                    long salt = ThreadLocalRandom.current().nextLong();
                    wrapper.write((Type)Types.LONG, (Object)timestamp.toEpochMilli());
                    wrapper.write((Type)Types.LONG, (Object)(chatSession != null ? salt : 0L));
                    String message = (String)wrapper.get(Types.STRING, 0);
                    if (!message.isEmpty() && message.charAt(0) == '/') {
                        String command = message.substring(1);
                        wrapper.setPacketType((PacketType)ServerboundPackets1_19.CHAT_COMMAND);
                        wrapper.set(Types.STRING, 0, (Object)command);
                        SignableCommandArgumentsProvider argumentsProvider = (SignableCommandArgumentsProvider)Via.getManager().getProviders().get(SignableCommandArgumentsProvider.class);
                        if (chatSession != null && argumentsProvider != null) {
                            MessageMetadata metadata = new MessageMetadata(sender, timestamp, salt);
                            List arguments = argumentsProvider.getSignableArguments(command);
                            wrapper.write((Type)Types.VAR_INT, (Object)arguments.size());
                            for (Pair argument : arguments) {
                                byte[] signature;
                                try {
                                    signature = chatSession.signChatMessage(metadata, new DecoratableMessage((String)argument.value()));
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
                    } else if (chatSession != null) {
                        byte[] signature;
                        MessageMetadata metadata = new MessageMetadata(sender, timestamp, salt);
                        DecoratableMessage decoratableMessage = new DecoratableMessage(message);
                        try {
                            signature = chatSession.signChatMessage(metadata, decoratableMessage);
                        }
                        catch (SignatureException e) {
                            throw new RuntimeException(e);
                        }
                        wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)signature);
                    } else {
                        wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)EMPTY_BYTES);
                    }
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                });
            }
        });
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.LOGIN_FINISHED, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.UUID);
                this.map(Types.STRING);
                this.read(Types.PROFILE_PROPERTY_ARRAY);
            }
        });
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.BYTE_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    if (wrapper.user().has(ChatSession1_19_0.class)) {
                        wrapper.user().put((StorableObject)new NonceStorage((byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE)));
                    }
                });
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    ChatSession1_19_0 chatSession = (ChatSession1_19_0)wrapper.user().get(ChatSession1_19_0.class);
                    wrapper.write(Types.OPTIONAL_PROFILE_KEY, (Object)(chatSession == null ? null : chatSession.getProfileKey()));
                });
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.ENCRYPTION_KEY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BYTE_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    ChatSession1_19_0 chatSession = (ChatSession1_19_0)wrapper.user().get(ChatSession1_19_0.class);
                    byte[] verifyToken = (byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                    wrapper.write((Type)Types.BOOLEAN, (Object)(chatSession == null ? 1 : 0));
                    if (chatSession != null) {
                        byte[] signature;
                        long salt = ThreadLocalRandom.current().nextLong();
                        try {
                            signature = chatSession.sign(signer -> {
                                signer.accept((Object)((NonceStorage)wrapper.user().remove(NonceStorage.class)).nonce());
                                signer.accept((Object)Longs.toByteArray((long)salt));
                            });
                        }
                        catch (SignatureException e) {
                            throw new RuntimeException(e);
                        }
                        wrapper.write((Type)Types.LONG, (Object)salt);
                        wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)signature);
                    } else {
                        wrapper.write(Types.BYTE_ARRAY_PRIMITIVE, (Object)verifyToken);
                    }
                });
            }
        });
    }

    public void init(UserConnection user) {
        user.put((StorableObject)new DimensionRegistryStorage());
        this.addEntityTracker(user, (EntityTracker)new EntityTracker1_19(user));
    }

    public BackwardsMappingData1_19 getMappingData() {
        return MAPPINGS;
    }

    public JsonNBTComponentRewriter<ClientboundPackets1_19> getComponentRewriter() {
        return this.translatableRewriter;
    }

    public EntityPacketRewriter1_19 getEntityRewriter() {
        return this.entityRewriter;
    }

    public BlockItemPacketRewriter1_19 getItemRewriter() {
        return this.blockItemPackets;
    }

    public BlockRewriter<ClientboundPackets1_19> getBlockRewriter() {
        return this.blockRewriter;
    }

    public ParticleRewriter<ClientboundPackets1_19> getParticleRewriter() {
        return this.particleRewriter;
    }

    public TagRewriter<ClientboundPackets1_19> getTagRewriter() {
        return this.tagRewriter;
    }
}

