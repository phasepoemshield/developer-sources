/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.platform.providers.ViaProviders
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.packet.mapping.PacketMappings
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.exception.CancelException
 *  com.viaversion.viaversion.exception.InformativeException
 *  com.viaversion.viaversion.protocol.packet.PacketWrapperImpl
 *  com.viaversion.viaversion.protocols.base.ClientboundLoginPackets
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9
 *  io.netty.buffer.ByteBuf
 *  io.netty.buffer.ByteBufUtil
 *  net.raphimc.viabedrock.ViaBedrock
 *  net.raphimc.viabedrock.api.util.PacketFactory
 *  net.raphimc.viabedrock.protocol.BedrockProtocol$1
 *  net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayStatus
 *  net.raphimc.viabedrock.protocol.storage.BlobCache
 *  net.raphimc.viabedrock.protocol.storage.ChannelStorage
 *  net.raphimc.viabedrock.protocol.storage.ClientSettingsStorage
 *  net.raphimc.viabedrock.protocol.storage.GameSessionStorage
 *  net.raphimc.viabedrock.protocol.storage.InventoryTracker
 *  net.raphimc.viabedrock.protocol.storage.PacketSyncStorage
 *  net.raphimc.viabedrock.protocol.storage.PlayerListStorage
 *  net.raphimc.viabedrock.protocol.storage.ResourcePackDownloadTracker
 *  net.raphimc.viabedrock.protocol.storage.ScoreboardTracker
 *  net.raphimc.viabedrock.protocol.task.BlobCacheTickTask
 *  net.raphimc.viabedrock.protocol.task.ChunkTrackerTickTask
 *  net.raphimc.viabedrock.protocol.task.EntityTrackerTickTask
 *  net.raphimc.viabedrock.protocol.task.InventoryTrackerTickTask
 *  net.raphimc.viabedrock.protocol.task.KeepAliveTask
 */
package net.raphimc.viabedrock.protocol;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.platform.providers.ViaProviders;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.packet.mapping.PacketMappings;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.exception.CancelException;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.protocol.packet.PacketWrapperImpl;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ClientboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_11to26_1.packet.ServerboundPackets26_1;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundConfigurationPackets1_21_9;
import io.netty.buffer.ByteBuf;
import io.netty.buffer.ByteBufUtil;
import java.util.EnumSet;
import java.util.logging.Level;
import net.raphimc.viabedrock.ViaBedrock;
import net.raphimc.viabedrock.api.protocol.StatelessTransitionProtocol;
import net.raphimc.viabedrock.api.util.PacketFactory;
import net.raphimc.viabedrock.experimental.ExperimentalFeatures;
import net.raphimc.viabedrock.platform.ViaBedrockConfig;
import net.raphimc.viabedrock.protocol.BedrockProtocol;
import net.raphimc.viabedrock.protocol.ClientboundBedrockPackets;
import net.raphimc.viabedrock.protocol.ServerboundBedrockPackets;
import net.raphimc.viabedrock.protocol.data.BedrockMappingData;
import net.raphimc.viabedrock.protocol.data.enums.bedrock.generated.PlayStatus;
import net.raphimc.viabedrock.protocol.packet.ChatPackets;
import net.raphimc.viabedrock.protocol.packet.ClientPlayerPackets;
import net.raphimc.viabedrock.protocol.packet.ConfigurationPackets;
import net.raphimc.viabedrock.protocol.packet.EntityPackets;
import net.raphimc.viabedrock.protocol.packet.HudPackets;
import net.raphimc.viabedrock.protocol.packet.InventoryPackets;
import net.raphimc.viabedrock.protocol.packet.JoinPackets;
import net.raphimc.viabedrock.protocol.packet.LoginPackets;
import net.raphimc.viabedrock.protocol.packet.MultiStatePackets;
import net.raphimc.viabedrock.protocol.packet.OtherPlayerPackets;
import net.raphimc.viabedrock.protocol.packet.PlayPackets;
import net.raphimc.viabedrock.protocol.packet.ResourcePackPackets;
import net.raphimc.viabedrock.protocol.packet.UnhandledPackets;
import net.raphimc.viabedrock.protocol.packet.WorldEffectPackets;
import net.raphimc.viabedrock.protocol.packet.WorldPackets;
import net.raphimc.viabedrock.protocol.provider.BlobCacheProvider;
import net.raphimc.viabedrock.protocol.provider.NettyPipelineProvider;
import net.raphimc.viabedrock.protocol.provider.ResourcePackProvider;
import net.raphimc.viabedrock.protocol.provider.SkinProvider;
import net.raphimc.viabedrock.protocol.storage.BlobCache;
import net.raphimc.viabedrock.protocol.storage.ChannelStorage;
import net.raphimc.viabedrock.protocol.storage.ClientSettingsStorage;
import net.raphimc.viabedrock.protocol.storage.GameSessionStorage;
import net.raphimc.viabedrock.protocol.storage.InventoryTracker;
import net.raphimc.viabedrock.protocol.storage.PacketSyncStorage;
import net.raphimc.viabedrock.protocol.storage.PlayerListStorage;
import net.raphimc.viabedrock.protocol.storage.ResourcePackDownloadTracker;
import net.raphimc.viabedrock.protocol.storage.ScoreboardTracker;
import net.raphimc.viabedrock.protocol.task.BlobCacheTickTask;
import net.raphimc.viabedrock.protocol.task.ChunkTrackerTickTask;
import net.raphimc.viabedrock.protocol.task.EntityTrackerTickTask;
import net.raphimc.viabedrock.protocol.task.InventoryTrackerTickTask;
import net.raphimc.viabedrock.protocol.task.KeepAliveTask;

public class BedrockProtocol
extends StatelessTransitionProtocol<ClientboundBedrockPackets, ClientboundPackets26_1, ServerboundBedrockPackets, ServerboundPackets26_1> {
    public static final BedrockMappingData MAPPINGS = new BedrockMappingData();
    private static final EnumSet<ClientboundBedrockPackets> LOGIN_STATE_WHITELIST = EnumSet.of(ClientboundBedrockPackets.NETWORK_SETTINGS, new ClientboundBedrockPackets[]{ClientboundBedrockPackets.SERVER_TO_CLIENT_HANDSHAKE, ClientboundBedrockPackets.PLAY_STATUS, ClientboundBedrockPackets.DISCONNECT, ClientboundBedrockPackets.PACKET_VIOLATION_WARNING, ClientboundBedrockPackets.NETWORK_STACK_LATENCY});
    private static final EnumSet<ClientboundBedrockPackets> BEFORE_PLAY_STATE_WHITELIST = EnumSet.of(ClientboundBedrockPackets.RESOURCE_PACKS_INFO, new ClientboundBedrockPackets[]{ClientboundBedrockPackets.RESOURCE_PACK_DATA_INFO, ClientboundBedrockPackets.RESOURCE_PACK_CHUNK_DATA, ClientboundBedrockPackets.RESOURCE_PACK_STACK, ClientboundBedrockPackets.BIOME_DEFINITION_LIST, ClientboundBedrockPackets.DIMENSION_DATA, ClientboundBedrockPackets.AVAILABLE_COMMANDS, ClientboundBedrockPackets.START_GAME});

    public BedrockProtocol() {
        super(ClientboundBedrockPackets.class, ClientboundPackets26_1.class, ServerboundBedrockPackets.class, ServerboundPackets26_1.class);
    }

    @Override
    public void transform(Direction direction, State state, PacketWrapper wrapper) throws InformativeException, CancelException {
        if (state == State.STATUS) {
            super.transform(direction, state, wrapper);
            return;
        }
        if (direction == Direction.CLIENTBOUND) {
            State serverState = wrapper.user().getProtocolInfo().getServerState();
            ClientboundBedrockPackets packet = ClientboundBedrockPackets.getPacket(wrapper.getId());
            if (packet == null) {
                ByteBuf content = ((PacketWrapperImpl)wrapper).getInputBuffer();
                ViaBedrock.getPlatform().getLogger().warning("Received unknown packet " + wrapper.getId() + " in state " + String.valueOf(serverState) + " with content: " + ByteBufUtil.hexDump((ByteBuf)content));
                throw CancelException.generate();
            }
            if (serverState == State.LOGIN && !LOGIN_STATE_WHITELIST.contains((Object)packet) && BEFORE_PLAY_STATE_WHITELIST.contains((Object)packet)) {
                ViaBedrock.getPlatform().getLogger().warning("Skipping LOGIN state");
                PacketWrapper playStatus = PacketWrapper.create((PacketType)ClientboundBedrockPackets.PLAY_STATUS, (UserConnection)wrapper.user());
                playStatus.write((Type)Types.INT, (Object)PlayStatus.LoginSuccess.getValue());
                playStatus.send(BedrockProtocol.class, false);
                wrapper.user().getProtocolInfo().setServerState(State.CONFIGURATION);
                serverState = State.CONFIGURATION;
            }
            if (serverState != State.PLAY && !BEFORE_PLAY_STATE_WHITELIST.contains((Object)packet)) {
                ViaBedrock.getPlatform().getLogger().log(Level.WARNING, "Received packet " + String.valueOf((Object)packet) + " outside PLAY state. Ignoring it.");
                throw CancelException.generate();
            }
        }
        super.transform(direction, state, wrapper);
    }

    public void register(ViaProviders providers) {
        providers.require(NettyPipelineProvider.class);
        providers.register(ResourcePackProvider.class, (Provider)ViaBedrock.getConfig().getPackCacheMode().createProvider());
        providers.register(BlobCacheProvider.class, (Provider)ViaBedrock.getConfig().getBlobCacheMode().createProvider());
        providers.register(SkinProvider.class, (Provider)new SkinProvider());
        if (!ViaBedrock.getConfig().getBlobCacheMode().equals((Object)ViaBedrockConfig.BlobCacheMode.DISABLED) && !((BlobCacheProvider)providers.get(BlobCacheProvider.class)).hasBlob(0L)) {
            ((BlobCacheProvider)providers.get(BlobCacheProvider.class)).addBlob(0L, new byte[0]);
        }
        Via.getPlatform().runRepeatingSync((Runnable)new KeepAliveTask(), 20L);
        Via.getPlatform().runRepeatingSync((Runnable)new ChunkTrackerTickTask(), 2L);
        Via.getPlatform().runRepeatingSync((Runnable)new BlobCacheTickTask(), 2L);
        Via.getPlatform().runRepeatingSync((Runnable)new EntityTrackerTickTask(), 1L);
        Via.getPlatform().runRepeatingSync((Runnable)new InventoryTrackerTickTask(), 1L);
        if (ViaBedrock.getConfig().shouldEnableExperimentalFeatures()) {
            ExperimentalFeatures.registerTasks();
        }
    }

    public void init(UserConnection user) {
        user.put((StorableObject)new ClientSettingsStorage("en_us", 12, 0, true, 127, 1, false, true, 0));
        user.put((StorableObject)new GameSessionStorage(user));
        user.put((StorableObject)new ResourcePackDownloadTracker());
        user.put((StorableObject)new BlobCache(user));
        user.put((StorableObject)new PacketSyncStorage(user));
        user.put((StorableObject)new ChannelStorage());
        user.put((StorableObject)new PlayerListStorage());
        user.put((StorableObject)new ScoreboardTracker());
        user.put((StorableObject)new InventoryTracker(user));
        if (ViaBedrock.getConfig().shouldEnableExperimentalFeatures()) {
            ExperimentalFeatures.registerStorages(user);
        }
    }

    protected void registerPackets() {
        LoginPackets.register(this);
        ConfigurationPackets.register(this);
        PlayPackets.register(this);
        MultiStatePackets.register(this);
        ResourcePackPackets.register(this);
        JoinPackets.register(this);
        ChatPackets.register(this);
        ClientPlayerPackets.register(this);
        OtherPlayerPackets.register(this);
        WorldPackets.register(this);
        EntityPackets.register(this);
        HudPackets.register(this);
        InventoryPackets.register(this);
        WorldEffectPackets.register(this);
        UnhandledPackets.register(this);
        if (ViaBedrock.getConfig().shouldEnableExperimentalFeatures()) {
            ExperimentalFeatures.registerPacketTranslators(this);
        }
        for (ClientboundBedrockPackets clientboundBedrockPackets : (ClientboundBedrockPackets[])this.unmappedClientboundPacketType.getEnumConstants()) {
            if (this.hasRegisteredClientbound(clientboundBedrockPackets)) continue;
            this.cancelClientbound(clientboundBedrockPackets);
        }
        for (ClientboundBedrockPackets clientboundBedrockPackets : (ServerboundPackets26_1[])this.unmappedServerboundPacketType.getEnumConstants()) {
            if (this.hasRegisteredServerbound((ServerboundPacketType)clientboundBedrockPackets)) continue;
            this.cancelServerbound((ServerboundPacketType)clientboundBedrockPackets);
        }
    }

    public BedrockMappingData getMappingData() {
        return MAPPINGS;
    }

    public PacketMappings getClientboundMappings() {
        return this.clientboundMappings;
    }

    public PacketMappings getServerboundMappings() {
        return this.serverboundMappings;
    }

    public static void kickForIllegalState(UserConnection user, String reason) {
        BedrockProtocol.kickForIllegalState(user, reason, null);
    }

    public static void kickForIllegalState(UserConnection user, String reason, Throwable e) {
        ViaBedrock.getPlatform().getLogger().log(Level.SEVERE, "Illegal state: " + reason, e);
        ClientboundLoginPackets disconnectPacketType = switch (1.$SwitchMap$com$viaversion$viaversion$api$protocol$packet$State[user.getProtocolInfo().getServerState().ordinal()]) {
            case 1 -> ClientboundLoginPackets.LOGIN_DISCONNECT;
            case 2 -> ClientboundConfigurationPackets1_21_9.DISCONNECT;
            case 3 -> ClientboundPackets26_1.DISCONNECT;
            default -> throw new IllegalStateException("Unexpected state: " + String.valueOf(user.getProtocolInfo().getServerState()));
        };
        try {
            PacketWrapper disconnect = PacketWrapper.create((PacketType)disconnectPacketType, (UserConnection)user);
            PacketFactory.writeJavaDisconnect((PacketWrapper)disconnect, (String)("\u00a74ViaBedrock encountered an error:\n\u00a7c" + reason + "\n\n\u00a7rPlease report this issue on the ViaBedrock GitHub page."));
            disconnect.send(BedrockProtocol.class);
        }
        catch (Throwable throwable) {
            // empty catch block
        }
        if (user.getChannel() != null) {
            user.getChannel().flush();
            user.getChannel().close();
        }
    }

    static {
        BEFORE_PLAY_STATE_WHITELIST.addAll(LOGIN_STATE_WHITELIST);
    }
}

