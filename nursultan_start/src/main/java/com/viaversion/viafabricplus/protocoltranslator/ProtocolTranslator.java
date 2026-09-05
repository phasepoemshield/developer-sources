/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.mojang.authlib.GameProfile
 *  com.mojang.brigadier.arguments.ArgumentType
 *  com.mojang.brigadier.arguments.StringArgumentType
 *  com.mojang.brigadier.builder.ArgumentBuilder
 *  com.mojang.brigadier.builder.LiteralArgumentBuilder
 *  com.mojang.brigadier.builder.RequiredArgumentBuilder
 *  com.viaversion.viaaprilfools.ViaAprilFoolsPlatformImpl
 *  com.viaversion.viabackwards.ViaBackwardsPlatformImpl
 *  com.viaversion.viafabricplus.api.events.ChangeProtocolVersionCallback
 *  com.viaversion.viafabricplus.base.Events
 *  com.viaversion.viafabricplus.injection.access.base.IConnection
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.ProtocolPathEntry
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.api.protocol.version.VersionType
 *  com.viaversion.viaversion.connection.UserConnectionImpl
 *  com.viaversion.viaversion.platform.NoopInjector
 *  com.viaversion.viaversion.platform.ViaChannelInitializer
 *  com.viaversion.viaversion.platform.ViaEncodeHandler
 *  com.viaversion.viaversion.protocol.ProtocolPipelineImpl
 *  dev.kastle.netty.channel.nethernet.config.NetherChannelOption
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelConfig
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelOption
 *  io.netty.channel.ChannelPipeline
 *  io.netty.util.AttributeKey
 *  minecraft.class00642
 *  minecraft.class01683
 *  minecraft.class04453
 *  minecraft.class06202
 *  minecraft.class07529
 *  minecraft.class07536
 *  net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback
 *  net.lenni0451.reflect.stream.RStream
 *  net.lenni0451.reflect.stream.field.FieldWrapper
 *  net.raphimc.viabedrock.ViaBedrockPlatformImpl
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.viabedrock.netty.BatchLengthCodec
 *  net.raphimc.viabedrock.netty.DisconnectHandler
 *  net.raphimc.viabedrock.netty.PacketCodec
 *  net.raphimc.viabedrock.netty.raknet.MessageCodec
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  net.raphimc.vialegacy.netty.PreNettyLengthPrepender
 *  net.raphimc.vialegacy.netty.PreNettyLengthRemover
 *  org.cloudburstmc.netty.channel.raknet.config.RakChannelOption
 */
package com.viaversion.viafabricplus.protocoltranslator;

import com.mojang.authlib.GameProfile;
import com.mojang.brigadier.arguments.ArgumentType;
import com.mojang.brigadier.arguments.StringArgumentType;
import com.mojang.brigadier.builder.ArgumentBuilder;
import com.mojang.brigadier.builder.LiteralArgumentBuilder;
import com.mojang.brigadier.builder.RequiredArgumentBuilder;
import com.viaversion.viaaprilfools.ViaAprilFoolsPlatformImpl;
import com.viaversion.viabackwards.ViaBackwardsPlatformImpl;
import com.viaversion.viafabricplus.api.events.ChangeProtocolVersionCallback;
import com.viaversion.viafabricplus.base.Events;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator$1;
import com.viaversion.viafabricplus.protocoltranslator.impl.command.ViaFabricPlusCommandHandler;
import com.viaversion.viafabricplus.protocoltranslator.impl.platform.ViaFabricPlusViaLegacyPlatform;
import com.viaversion.viafabricplus.protocoltranslator.impl.platform.ViaFabricPlusViaVersionPlatform;
import com.viaversion.viafabricplus.protocoltranslator.impl.viaversion.ViaFabricPlusPlatformLoader;
import com.viaversion.viafabricplus.protocoltranslator.netty.NoReadFlowControlHandler;
import com.viaversion.viafabricplus.protocoltranslator.netty.ViaFabricPlusDecoder;
import com.viaversion.viafabricplus.protocoltranslator.protocol.ViaFabricPlusProtocol;
import com.viaversion.viafabricplus.protocoltranslator.util.NoPacketSendChannel;
import com.viaversion.viaversion.ViaManagerImpl;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.ProtocolPathEntry;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.api.protocol.version.VersionType;
import com.viaversion.viaversion.connection.UserConnectionImpl;
import com.viaversion.viaversion.platform.NoopInjector;
import com.viaversion.viaversion.platform.ViaChannelInitializer;
import com.viaversion.viaversion.platform.ViaEncodeHandler;
import com.viaversion.viaversion.protocol.ProtocolPipelineImpl;
import dev.kastle.netty.channel.nethernet.config.NetherChannelOption;
import io.netty.channel.Channel;
import io.netty.channel.ChannelConfig;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelOption;
import io.netty.channel.ChannelPipeline;
import io.netty.util.AttributeKey;
import java.nio.file.Path;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.ThreadLocalRandom;
import minecraft.class00642;
import minecraft.class01683;
import minecraft.class04453;
import minecraft.class06202;
import minecraft.class07529;
import minecraft.class07536;
import net.fabricmc.fabric.api.client.command.v2.ClientCommandRegistrationCallback;
import net.lenni0451.reflect.stream.RStream;
import net.lenni0451.reflect.stream.field.FieldWrapper;
import net.raphimc.viabedrock.ViaBedrockPlatformImpl;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.netty.BatchLengthCodec;
import net.raphimc.viabedrock.netty.DisconnectHandler;
import net.raphimc.viabedrock.netty.PacketCodec;
import net.raphimc.viabedrock.netty.raknet.MessageCodec;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import net.raphimc.vialegacy.netty.PreNettyLengthPrepender;
import net.raphimc.vialegacy.netty.PreNettyLengthRemover;
import org.cloudburstmc.netty.channel.raknet.config.RakChannelOption;

public final class ProtocolTranslator {
    public static final AttributeKey<class00642> CLIENT_CONNECTION_ATTRIBUTE_KEY = AttributeKey.newInstance((String)"viafabricplus-clientconnection");
    public static final AttributeKey<ProtocolVersion> TARGET_VERSION_ATTRIBUTE_KEY = AttributeKey.newInstance((String)"viafabricplus-targetversion");
    public static final ProtocolVersion NATIVE_VERSION = ProtocolVersion.v1_21_11;
    public static final String VIA_FLOW_CONTROL = "via-flow-control";
    public static final ProtocolVersion AUTO_DETECT_PROTOCOL = new ProtocolTranslator$1(VersionType.SPECIAL, -2, -1, "Auto Detect (1.7+ servers)", null);
    private static ProtocolVersion targetVersion = NATIVE_VERSION;
    private static ProtocolVersion previousVersion = null;

    public static void injectPreviousVersionReset(Channel channel) {
        if (previousVersion == null) {
            return;
        }
        channel.closeFuture().addListener(future -> {
            ProtocolTranslator.setTargetVersion(previousVersion);
            previousVersion = null;
        });
    }

    private static void changeBedrockProtocolName() {
        ProtocolVersion protocolVersion = (ProtocolVersion)RStream.of(BedrockProtocolVersion.class).fields().by("bedrockLatest").get();
        FieldWrapper fieldWrapper = RStream.of((Object)protocolVersion).withSuper().fields().by("name");
        fieldWrapper.set((Object)(String.valueOf(fieldWrapper.get()) + " (Work in progress)"));
    }

    public static UserConnection createDummyUserConnection(ProtocolVersion protocolVersion, ProtocolVersion protocolVersion2) {
        ProtocolPathEntry protocolPathEntry2;
        UserConnectionImpl userConnectionImpl = new UserConnectionImpl((Channel)NoPacketSendChannel.INSTANCE, true);
        ProtocolPipelineImpl protocolPipelineImpl = new ProtocolPipelineImpl((UserConnection)userConnectionImpl);
        List list = Via.getManager().getProtocolManager().getProtocolPath(protocolVersion, protocolVersion2);
        if (list != null) {
            for (ProtocolPathEntry protocolPathEntry2 : list) {
                protocolPipelineImpl.add(protocolPathEntry2.protocol());
                protocolPathEntry2.protocol().init((UserConnection)userConnectionImpl);
            }
        }
        ProtocolInfo protocolInfo = userConnectionImpl.getProtocolInfo();
        protocolInfo.setState(State.PLAY);
        protocolInfo.setProtocolVersion(protocolVersion);
        protocolInfo.setServerProtocolVersion(protocolVersion2);
        protocolPathEntry2 = class06202.Nq();
        if ((class04453)protocolPathEntry2.T_4 != null) {
            GameProfile gameProfile = ((class04453)protocolPathEntry2.T_4).method_7334();
            protocolInfo.setUsername(gameProfile.name());
            protocolInfo.setUuid(gameProfile.id());
        }
        return userConnectionImpl;
    }

    public static CompletableFuture<Void> init(Path path) {
        if (class07529.L() != NATIVE_VERSION.getOriginalVersion()) {
            throw new IllegalStateException("Native version is not the same as the current version");
        }
        ClientCommandRegistrationCallback.EVENT.register((commandDispatcher, class043482) -> {
            ViaFabricPlusCommandHandler viaFabricPlusCommandHandler = (ViaFabricPlusCommandHandler)Via.getManager().getCommandHandler();
            RequiredArgumentBuilder requiredArgumentBuilder = ((RequiredArgumentBuilder)RequiredArgumentBuilder.argument((String)"args", (ArgumentType)StringArgumentType.greedyString()).executes(viaFabricPlusCommandHandler::execute)).suggests(viaFabricPlusCommandHandler::suggestion);
            commandDispatcher.register((LiteralArgumentBuilder)((LiteralArgumentBuilder)LiteralArgumentBuilder.literal((String)"viafabricplus").then((ArgumentBuilder)requiredArgumentBuilder)).executes(viaFabricPlusCommandHandler::execute));
        });
        return CompletableFuture.runAsync(() -> {
            ViaManagerImpl.initAndLoad(new ViaFabricPlusViaVersionPlatform(path.toFile()), (ViaInjector)new NoopInjector(), new ViaFabricPlusCommandHandler(), new ViaFabricPlusPlatformLoader(), new Runnable[]{() -> {
                new ViaBackwardsPlatformImpl();
                new ViaFabricPlusViaLegacyPlatform();
                new ViaAprilFoolsPlatformImpl();
                new ViaBedrockPlatformImpl();
            }});
            ProtocolVersion.register((ProtocolVersion)AUTO_DETECT_PROTOCOL);
            ProtocolTranslator.changeBedrockProtocolName();
            ViaFabricPlusProtocol.INSTANCE.initialize();
        }, (Executor)class07536.B());
    }

    public static void setTargetVersion(ProtocolVersion protocolVersion, boolean bl) {
        if (protocolVersion == null) {
            return;
        }
        ProtocolVersion protocolVersion2 = targetVersion;
        targetVersion = protocolVersion;
        if (protocolVersion2 != protocolVersion) {
            if (bl) {
                previousVersion = protocolVersion2;
            }
            ((ChangeProtocolVersionCallback)Events.CHANGE_PROTOCOL_VERSION.invoker()).onChangeProtocolVersion(protocolVersion2, targetVersion);
        }
    }

    public static void setTargetVersion(ProtocolVersion protocolVersion) {
        ProtocolTranslator.setTargetVersion(protocolVersion, false);
    }

    public static void injectViaPipeline(class00642 class006422, Channel channel) {
        ChannelConfig channelConfig;
        IConnection iConnection = (IConnection)class006422;
        ProtocolVersion protocolVersion = iConnection.viaFabricPlus$getTargetVersion();
        channel.attr(CLIENT_CONNECTION_ATTRIBUTE_KEY).set((Object)class006422);
        channel.attr(TARGET_VERSION_ATTRIBUTE_KEY).set((Object)protocolVersion);
        if (protocolVersion.equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            channelConfig = channel.config();
            channelConfig.setOption(RakChannelOption.RAK_PROTOCOL_VERSION, (Object)11);
            channelConfig.setOption(RakChannelOption.RAK_COMPATIBILITY_MODE, (Object)true);
            channelConfig.setOption(RakChannelOption.RAK_CLIENT_INTERNAL_ADDRESSES, (Object)20);
            channelConfig.setOption(RakChannelOption.RAK_TIME_BETWEEN_SEND_CONNECTION_ATTEMPTS_MS, (Object)500);
            channelConfig.setOption(RakChannelOption.RAK_CONNECT_TIMEOUT, (Object)((Integer)channelConfig.getOption(ChannelOption.CONNECT_TIMEOUT_MILLIS)).longValue());
            channelConfig.setOption(RakChannelOption.RAK_SESSION_TIMEOUT, (Object)30000L);
            channelConfig.setOption(RakChannelOption.RAK_GUID, (Object)ThreadLocalRandom.current().nextLong());
            channelConfig.setOption(NetherChannelOption.NETHER_CLIENT_HANDSHAKE_TIMEOUT_MS, (Object)((Integer)channelConfig.getOption(ChannelOption.CONNECT_TIMEOUT_MILLIS)));
            channelConfig.setOption(NetherChannelOption.NETHER_CLIENT_MAX_HANDSHAKE_ATTEMPTS, (Object)1);
        }
        channelConfig = ViaChannelInitializer.createUserConnection((Channel)channel, (boolean)true);
        iConnection.viaFabricPlus$setUserConnection((UserConnection)channelConfig);
        ChannelPipeline channelPipeline = channel.pipeline();
        channelPipeline.addBefore("inbound_config", "via-decoder", (ChannelHandler)new ViaFabricPlusDecoder((UserConnection)channelConfig));
        channelPipeline.addBefore("encoder", "via-encoder", (ChannelHandler)new ViaEncodeHandler((UserConnection)channelConfig));
        if (protocolVersion.olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4)) {
            channelPipeline.addBefore("splitter", "vialegacy-pre-netty-length-prepender", (ChannelHandler)new PreNettyLengthPrepender((UserConnection)channelConfig));
            channelPipeline.addBefore("prepender", "vialegacy-pre-netty-length-remover", (ChannelHandler)new PreNettyLengthRemover((UserConnection)channelConfig));
        } else if (protocolVersion.equals((Object)BedrockProtocolVersion.bedrockLatest)) {
            channelPipeline.addBefore("splitter", "viabedrock-disconnect-handler", (ChannelHandler)new DisconnectHandler());
            channelPipeline.addBefore("splitter", "viabedrock-raknet-message-codec", (ChannelHandler)new MessageCodec());
            channelPipeline.replace("splitter", "splitter", (ChannelHandler)new BatchLengthCodec());
            channelPipeline.remove("prepender");
            channelPipeline.addBefore("via-decoder", "viabedrock-packet-codec", (ChannelHandler)new PacketCodec());
        }
        channelPipeline.addAfter("via-decoder", VIA_FLOW_CONTROL, (ChannelHandler)new NoReadFlowControlHandler());
        channelConfig.getProtocolInfo().getPipeline().add((Protocol)ViaFabricPlusProtocol.INSTANCE);
    }

    public static ProtocolVersion getTargetVersion() {
        return targetVersion;
    }

    public static ProtocolVersion getTargetVersion(Channel channel) {
        if (!channel.hasAttr(TARGET_VERSION_ATTRIBUTE_KEY)) {
            throw new IllegalStateException("ViaFabricPlus has not injected into that channel yet!");
        }
        return (ProtocolVersion)channel.attr(TARGET_VERSION_ATTRIBUTE_KEY).get();
    }

    public static UserConnection getPlayNetworkUserConnection() {
        class01683 class016832 = class06202.Nq().NE();
        if (class016832 == null) {
            return null;
        }
        return ((IConnection)class016832.M()).viaFabricPlus$getUserConnection();
    }
}

