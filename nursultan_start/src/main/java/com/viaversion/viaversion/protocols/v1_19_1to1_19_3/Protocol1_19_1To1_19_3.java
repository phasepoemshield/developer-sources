/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.primitives.Longs
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.MappingData
 *  com.viaversion.viaversion.api.data.MappingDataBase
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.minecraft.Holder
 *  com.viaversion.viaversion.api.minecraft.PlayerMessageSignature
 *  com.viaversion.viaversion.api.minecraft.RegistryType
 *  com.viaversion.viaversion.api.minecraft.SoundEvent
 *  com.viaversion.viaversion.api.minecraft.entities.EntityType
 *  com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3
 *  com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider
 *  com.viaversion.viaversion.api.minecraft.signature.model.DecoratableMessage
 *  com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata
 *  com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_1
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
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
 *  com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType
 *  com.viaversion.viaversion.api.type.types.misc.ParticleType$Fillers
 *  com.viaversion.viaversion.api.type.types.version.Types1_19_3
 *  com.viaversion.viaversion.data.entity.EntityTrackerBase
 *  com.viaversion.viaversion.libs.gson.JsonElement
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.base.ServerboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.storage.NonceStorage1_19_3
 *  com.viaversion.viaversion.protocols.v1_19_1to1_19_3.storage.ReceivedMessagesStorage
 *  com.viaversion.viaversion.rewriter.BlockRewriter
 *  com.viaversion.viaversion.rewriter.CommandRewriter
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  com.viaversion.viaversion.rewriter.TagRewriter
 *  com.viaversion.viaversion.util.ComponentUtil
 *  com.viaversion.viaversion.util.Pair
 */
package com.viaversion.viaversion.protocols.v1_19_1to1_19_3;

import com.google.common.primitives.Longs;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.MappingData;
import com.viaversion.viaversion.api.data.MappingDataBase;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.minecraft.Holder;
import com.viaversion.viaversion.api.minecraft.PlayerMessageSignature;
import com.viaversion.viaversion.api.minecraft.RegistryType;
import com.viaversion.viaversion.api.minecraft.SoundEvent;
import com.viaversion.viaversion.api.minecraft.entities.EntityType;
import com.viaversion.viaversion.api.minecraft.entities.EntityTypes1_19_3;
import com.viaversion.viaversion.api.minecraft.signature.SignableCommandArgumentsProvider;
import com.viaversion.viaversion.api.minecraft.signature.model.DecoratableMessage;
import com.viaversion.viaversion.api.minecraft.signature.model.MessageMetadata;
import com.viaversion.viaversion.api.minecraft.signature.storage.ChatSession1_19_1;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
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
import com.viaversion.viaversion.api.type.types.chunk.ChunkType1_18;
import com.viaversion.viaversion.api.type.types.misc.ParticleType;
import com.viaversion.viaversion.api.type.types.version.Types1_19_3;
import com.viaversion.viaversion.data.entity.EntityTrackerBase;
import com.viaversion.viaversion.libs.gson.JsonElement;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ClientboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.packet.ServerboundPackets1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.rewriter.ComponentRewriter1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.rewriter.EntityPacketRewriter1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.rewriter.ItemPacketRewriter1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.storage.NonceStorage1_19_3;
import com.viaversion.viaversion.protocols.v1_19_1to1_19_3.storage.ReceivedMessagesStorage;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ClientboundPackets1_19_1;
import com.viaversion.viaversion.protocols.v1_19to1_19_1.packet.ServerboundPackets1_19_1;
import com.viaversion.viaversion.rewriter.BlockRewriter;
import com.viaversion.viaversion.rewriter.CommandRewriter;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import com.viaversion.viaversion.rewriter.TagRewriter;
import com.viaversion.viaversion.util.ComponentUtil;
import com.viaversion.viaversion.util.Pair;
import java.security.SignatureException;
import java.util.List;
import java.util.UUID;
import java.util.concurrent.ThreadLocalRandom;

public final class Protocol1_19_1To1_19_3
extends AbstractProtocol<ClientboundPackets1_19_1, ClientboundPackets1_19_3, ServerboundPackets1_19_1, ServerboundPackets1_19_3> {
    public static final MappingData MAPPINGS = new MappingDataBase("1.19", "1.19.3");
    private static final UUID ZERO_UUID = new UUID(0L, 0L);
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final EntityPacketRewriter1_19_3 entityRewriter = new EntityPacketRewriter1_19_3(this);
    private final ItemPacketRewriter1_19_3 itemRewriter = new ItemPacketRewriter1_19_3(this);
    private final ParticleRewriter<ClientboundPackets1_19_1> particleRewriter = new ParticleRewriter((Protocol)this);
    private final ComponentRewriter1_19_3 componentRewriter = new ComponentRewriter1_19_3((Protocol<ClientboundPackets1_19_1, ?, ?, ?>)this);
    private final TagRewriter<ClientboundPackets1_19_1> tagRewriter = new TagRewriter((Protocol)this);
    private final BlockRewriter<ClientboundPackets1_19_1> blockRewriter = BlockRewriter.for1_18((Protocol)this, ChunkType1_18::new);

    public Protocol1_19_1To1_19_3() {
        super(ClientboundPackets1_19_1.class, ClientboundPackets1_19_3.class, ServerboundPackets1_19_1.class, ServerboundPackets1_19_3.class);
    }

    public void init(UserConnection user) {
        user.put((StorableObject)new ReceivedMessagesStorage());
        this.addEntityTracker(user, (EntityTracker)new EntityTrackerBase(user, (EntityType)EntityTypes1_19_3.PLAYER));
    }

    public ComponentRewriter1_19_3 getComponentRewriter() {
        return this.componentRewriter;
    }

    protected void onMappingDataLoaded() {
        EntityTypes1_19_3.initialize((Protocol)this);
        ParticleType.Fillers.fill1_19((Protocol)this, (ParticleType)Types1_19_3.PARTICLE);
        this.tagRewriter.removeTag(RegistryType.ITEM, "minecraft:overworld_natural_logs");
        this.tagRewriter.removeTag(RegistryType.BLOCK, "minecraft:non_flammable_wood");
        super.onMappingDataLoaded();
    }

    public ParticleRewriter<ClientboundPackets1_19_1> getParticleRewriter() {
        return this.particleRewriter;
    }

    protected void registerPackets() {
        super.registerPackets();
        PacketHandler soundHandler = wrapper -> {
            int soundId = (Integer)wrapper.read((Type)Types.VAR_INT);
            soundId = MAPPINGS.getSoundMappings().getNewId(soundId);
            if (soundId == -1) {
                wrapper.cancel();
                return;
            }
            wrapper.write((Type)Types.SOUND_EVENT, (Object)Holder.of((int)soundId));
        };
        this.replaceClientbound(ClientboundPackets1_19_1.SOUND_ENTITY, soundHandler);
        this.replaceClientbound(ClientboundPackets1_19_1.SOUND, soundHandler);
        this.registerClientbound(ClientboundPackets1_19_1.CUSTOM_SOUND, ClientboundPackets1_19_3.SOUND, wrapper -> {
            String soundIdentifier = (String)wrapper.read(Types.STRING);
            wrapper.write((Type)Types.SOUND_EVENT, (Object)Holder.of((Object)new SoundEvent(soundIdentifier, null)));
        });
        CommandRewriter<ClientboundPackets1_19_1> commandRewriter = new CommandRewriter<ClientboundPackets1_19_1>((Protocol)this){

            public void handleArgument(PacketWrapper wrapper, String argumentType) {
                switch (argumentType) {
                    case "minecraft:item_enchantment": {
                        wrapper.write(Types.STRING, (Object)"minecraft:enchantment");
                        break;
                    }
                    case "minecraft:mob_effect": {
                        wrapper.write(Types.STRING, (Object)"minecraft:mob_effect");
                        break;
                    }
                    case "minecraft:entity_summon": {
                        wrapper.write(Types.STRING, (Object)"minecraft:entity_type");
                        break;
                    }
                    default: {
                        super.handleArgument(wrapper, argumentType);
                    }
                }
            }
        };
        this.replaceClientbound(ClientboundPackets1_19_1.COMMANDS, arg_0 -> ((CommandRewriter)commandRewriter).handle1_19(arg_0));
        this.replaceClientbound(ClientboundPackets1_19_1.SERVER_DATA, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.OPTIONAL_COMPONENT);
                this.map(Types.OPTIONAL_STRING);
                this.read((Type)Types.BOOLEAN);
            }
        });
        this.registerClientbound(ClientboundPackets1_19_1.PLAYER_CHAT, ClientboundPackets1_19_3.DISGUISED_CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.read(Types.OPTIONAL_BYTE_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    int filterMaskType;
                    PlayerMessageSignature signature = (PlayerMessageSignature)wrapper.read(Types.PLAYER_MESSAGE_SIGNATURE);
                    if (!signature.uuid().equals(ZERO_UUID) && signature.signatureBytes().length != 0) {
                        ReceivedMessagesStorage messagesStorage = (ReceivedMessagesStorage)wrapper.user().get(ReceivedMessagesStorage.class);
                        messagesStorage.add(signature);
                        if (messagesStorage.tickUnacknowledged() > 64) {
                            messagesStorage.resetUnacknowledgedCount();
                            PacketWrapper chatAckPacket = wrapper.create((PacketType)ServerboundPackets1_19_1.CHAT_ACK);
                            chatAckPacket.write(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY, (Object)messagesStorage.lastSignatures());
                            chatAckPacket.write(Types.OPTIONAL_PLAYER_MESSAGE_SIGNATURE, null);
                            chatAckPacket.sendToServer(Protocol1_19_1To1_19_3.class);
                        }
                    }
                    String plainMessage = (String)wrapper.read(Types.STRING);
                    JsonElement decoratedMessage = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    wrapper.read((Type)Types.LONG);
                    wrapper.read((Type)Types.LONG);
                    wrapper.read(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY);
                    JsonElement unsignedMessage = (JsonElement)wrapper.read(Types.OPTIONAL_COMPONENT);
                    if (unsignedMessage != null) {
                        decoratedMessage = unsignedMessage;
                    }
                    if (decoratedMessage == null) {
                        decoratedMessage = ComponentUtil.plainToJson((String)plainMessage);
                    }
                    if ((filterMaskType = ((Integer)wrapper.read((Type)Types.VAR_INT)).intValue()) == 2) {
                        wrapper.read(Types.LONG_ARRAY_PRIMITIVE);
                    }
                    wrapper.write(Types.COMPONENT, (Object)decoratedMessage);
                });
            }
        });
        this.registerServerbound(ServerboundPackets1_19_3.CHAT_COMMAND, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.LONG);
                this.handler(wrapper -> {
                    ChatSession1_19_1 chatSession = (ChatSession1_19_1)wrapper.user().get(ChatSession1_19_1.class);
                    ReceivedMessagesStorage messagesStorage = (ReceivedMessagesStorage)wrapper.user().get(ReceivedMessagesStorage.class);
                    int signatures = (Integer)wrapper.read((Type)Types.VAR_INT);
                    for (int i = 0; i < signatures; ++i) {
                        wrapper.read(Types.STRING);
                        wrapper.read((Type)Types.SIGNATURE_BYTES);
                    }
                    SignableCommandArgumentsProvider argumentsProvider = (SignableCommandArgumentsProvider)Via.getManager().getProviders().get(SignableCommandArgumentsProvider.class);
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
                                signature = chatSession.signChatMessage(metadata, decoratableMessage, messagesStorage.lastSignatures());
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
                    wrapper.write((Type)Types.BOOLEAN, (Object)false);
                    messagesStorage.resetUnacknowledgedCount();
                    wrapper.write(Types.PLAYER_MESSAGE_SIGNATURE_ARRAY, (Object)messagesStorage.lastSignatures());
                    wrapper.write(Types.OPTIONAL_PLAYER_MESSAGE_SIGNATURE, null);
                });
                this.read((Type)Types.VAR_INT);
                this.read((Type)Types.ACKNOWLEDGED_BIT_SET);
            }
        });
        this.registerServerbound(ServerboundPackets1_19_3.CHAT, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map((Type)Types.LONG);
                this.map((Type)Types.LONG);
                this.read((Type)Types.OPTIONAL_SIGNATURE_BYTES);
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
                this.read((Type)Types.VAR_INT);
                this.read((Type)Types.ACKNOWLEDGED_BIT_SET);
            }
        });
        this.registerClientbound(State.LOGIN, (ClientboundPacketType)ClientboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.map(Types.BYTE_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    if (wrapper.user().has(ChatSession1_19_1.class)) {
                        wrapper.user().put((StorableObject)new NonceStorage1_19_3((byte[])wrapper.passthrough(Types.BYTE_ARRAY_PRIMITIVE)));
                    }
                });
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.HELLO, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.STRING);
                this.handler(wrapper -> {
                    ChatSession1_19_1 chatSession = (ChatSession1_19_1)wrapper.user().get(ChatSession1_19_1.class);
                    wrapper.write(Types.OPTIONAL_PROFILE_KEY, (Object)(chatSession == null ? null : chatSession.getProfileKey()));
                });
                this.map(Types.OPTIONAL_UUID);
            }
        });
        this.registerServerbound(State.LOGIN, (ServerboundPacketType)ServerboundLoginPackets.ENCRYPTION_KEY, (PacketHandler)new PacketHandlers(){

            public void register() {
                this.map(Types.BYTE_ARRAY_PRIMITIVE);
                this.handler(wrapper -> {
                    ChatSession1_19_1 chatSession = (ChatSession1_19_1)wrapper.user().get(ChatSession1_19_1.class);
                    byte[] verifyToken = (byte[])wrapper.read(Types.BYTE_ARRAY_PRIMITIVE);
                    wrapper.write((Type)Types.BOOLEAN, (Object)(chatSession == null ? 1 : 0));
                    if (chatSession != null) {
                        byte[] signature;
                        long salt = ThreadLocalRandom.current().nextLong();
                        try {
                            signature = chatSession.sign(signer -> {
                                signer.accept((Object)((NonceStorage1_19_3)wrapper.user().remove(NonceStorage1_19_3.class)).nonce());
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
        this.cancelServerbound(ServerboundPackets1_19_3.CHAT_SESSION_UPDATE);
        this.cancelClientbound(ClientboundPackets1_19_1.DELETE_CHAT);
        this.cancelClientbound(ClientboundPackets1_19_1.PLAYER_CHAT_HEADER);
        this.cancelClientbound(ClientboundPackets1_19_1.CHAT_PREVIEW);
        this.cancelClientbound(ClientboundPackets1_19_1.SET_DISPLAY_CHAT_PREVIEW);
        this.cancelServerbound(ServerboundPackets1_19_3.CHAT_ACK);
    }

    public TagRewriter<ClientboundPackets1_19_1> getTagRewriter() {
        return this.tagRewriter;
    }

    public BlockRewriter<ClientboundPackets1_19_1> getBlockRewriter() {
        return this.blockRewriter;
    }

    public MappingData getMappingData() {
        return MAPPINGS;
    }

    public ItemPacketRewriter1_19_3 getItemRewriter() {
        return this.itemRewriter;
    }

    public EntityPacketRewriter1_19_3 getEntityRewriter() {
        return this.entityRewriter;
    }
}

