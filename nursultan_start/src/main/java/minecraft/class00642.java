/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09175
 *  Nursultan.class09379
 *  Nursultan.class09380
 *  Nursultan.class09381
 *  Nursultan.class09700
 *  Nursultan.class10961
 *  Nursultan.class10965
 *  Nursultan.class10990
 *  Nursultan.class11797
 *  Nursultan.class11938
 *  baritone.api.BaritoneAPI
 *  baritone.api.IBaritone
 *  baritone.api.event.events.PacketEvent
 *  baritone.api.event.events.type.EventState
 *  com.google.common.collect.Queues
 *  com.llamalad7.mixinextras.injector.wrapoperation.Operation
 *  com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime
 *  com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl
 *  com.llamalad7.mixinextras.sugar.ref.LocalRef
 *  com.mojang.logging.LogUtils
 *  com.viaversion.viafabricplus.ViaFabricPlusImpl
 *  com.viaversion.viafabricplus.base.bedrock.NetherNetInetSocketAddress
 *  com.viaversion.viafabricplus.base.bedrock.NetherNetJsonRpcAddress
 *  com.viaversion.viafabricplus.injection.access.base.IConnection
 *  com.viaversion.viafabricplus.injection.access.base.ILocalSampleLogger
 *  com.viaversion.viafabricplus.injection.access.base.bedrock.IEventLoopGroupHolder
 *  com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator
 *  com.viaversion.viafabricplus.protocoltranslator.netty.RakNetPingEncapsulationCodec
 *  com.viaversion.viafabricplus.save.SaveManager
 *  com.viaversion.viafabricplus.settings.impl.DebugSettings
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  com.viaversion.viaversion.platform.ViaChannelInitializer
 *  de.maxhenkel.voicechat.mixin.ConnectionAccessor
 *  dev.kastle.netty.channel.nethernet.NetherNetChannelFactory
 *  dev.kastle.netty.channel.nethernet.signaling.NetherNetClientSignaling
 *  dev.kastle.netty.channel.nethernet.signaling.NetherNetXboxRpcSignaling
 *  dev.kastle.netty.channel.nethernet.signaling.NetherNetXboxSignaling
 *  dev.kastle.webrtc.PeerConnectionFactory
 *  io.netty.bootstrap.AbstractBootstrap
 *  io.netty.bootstrap.Bootstrap
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFactory
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelFutureListener
 *  io.netty.channel.ChannelHandler
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelInboundHandler
 *  io.netty.channel.ChannelOutboundHandler
 *  io.netty.channel.ChannelPipeline
 *  io.netty.channel.SimpleChannelInboundHandler
 *  io.netty.channel.epoll.EpollDatagramChannel
 *  io.netty.channel.epoll.EpollSocketChannel
 *  io.netty.channel.kqueue.KQueueSocketChannel
 *  io.netty.channel.local.LocalChannel
 *  io.netty.channel.local.LocalServerChannel
 *  io.netty.channel.socket.nio.NioDatagramChannel
 *  io.netty.channel.socket.nio.NioSocketChannel
 *  io.netty.handler.flow.FlowControlHandler
 *  io.netty.handler.timeout.TimeoutException
 *  io.netty.util.concurrent.GenericFutureListener
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00423
 *  minecraft.class00501
 *  minecraft.class00606
 *  minecraft.class01636
 *  minecraft.class01673
 *  minecraft.class01683
 *  minecraft.class02270
 *  minecraft.class02372
 *  minecraft.class02400
 *  minecraft.class02403
 *  minecraft.class02570
 *  minecraft.class02943
 *  minecraft.class03041
 *  minecraft.class03077
 *  minecraft.class03096
 *  minecraft.class03258
 *  minecraft.class03260
 *  minecraft.class03276
 *  minecraft.class03288
 *  minecraft.class03706
 *  minecraft.class04193
 *  minecraft.class04263
 *  minecraft.class04275
 *  minecraft.class04279
 *  minecraft.class04285
 *  minecraft.class04290
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class07529
 *  minecraft.class07536
 *  minecraft.class07814
 *  minecraft.class07821
 *  minecraft.class07825
 *  minecraft.class07834
 *  minecraft.class07844
 *  minecraft.class08355
 *  minecraft.class08363
 *  net.fabricmc.fabric.impl.attachment.sync.SupportedAttachmentsClientConnection
 *  net.fabricmc.fabric.impl.networking.ChannelInfoHolder
 *  net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions
 *  net.fabricmc.fabric.impl.networking.PacketCallbackListener
 *  net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl
 *  net.fabricmc.fabric.impl.networking.VanillaPacketTypes
 *  net.fabricmc.fabric.impl.networking.splitter.FabricPacketMerger
 *  net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter
 *  net.fabricmc.fabric.impl.recipe.ingredient.SupportedIngredientsClientConnection
 *  net.fabricmc.fabric.impl.recipe.sync.SyncedSerializerAwareClientConnection
 *  net.raphimc.minecraftauth.bedrock.model.MinecraftSession
 *  net.raphimc.viabedrock.api.BedrockProtocolVersion
 *  net.raphimc.viabedrock.protocol.RakNetStatusProtocol
 *  net.raphimc.vialegacy.api.LegacyProtocolVersion
 *  org.cloudburstmc.netty.channel.raknet.RakChannelFactory
 *  org.jspecify.annotations.Nullable
 *  org.slf4j.Logger
 *  org.slf4j.Marker
 *  org.slf4j.MarkerFactory
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable
 */
package minecraft;

import Nursultan.class09175;
import Nursultan.class09379;
import Nursultan.class09380;
import Nursultan.class09381;
import Nursultan.class09700;
import Nursultan.class10961;
import Nursultan.class10965;
import Nursultan.class10990;
import Nursultan.class11797;
import Nursultan.class11938;
import baritone.api.BaritoneAPI;
import baritone.api.IBaritone;
import baritone.api.event.events.PacketEvent;
import baritone.api.event.events.type.EventState;
import com.google.common.collect.Queues;
import com.llamalad7.mixinextras.injector.wrapoperation.Operation;
import com.llamalad7.mixinextras.injector.wrapoperation.WrapOperationRuntime;
import com.llamalad7.mixinextras.sugar.impl.ref.generated.LocalRefImpl;
import com.llamalad7.mixinextras.sugar.ref.LocalRef;
import com.mojang.logging.LogUtils;
import com.viaversion.viafabricplus.ViaFabricPlusImpl;
import com.viaversion.viafabricplus.base.bedrock.NetherNetInetSocketAddress;
import com.viaversion.viafabricplus.base.bedrock.NetherNetJsonRpcAddress;
import com.viaversion.viafabricplus.injection.access.base.IConnection;
import com.viaversion.viafabricplus.injection.access.base.ILocalSampleLogger;
import com.viaversion.viafabricplus.injection.access.base.bedrock.IEventLoopGroupHolder;
import com.viaversion.viafabricplus.protocoltranslator.ProtocolTranslator;
import com.viaversion.viafabricplus.protocoltranslator.netty.RakNetPingEncapsulationCodec;
import com.viaversion.viafabricplus.save.SaveManager;
import com.viaversion.viafabricplus.settings.impl.DebugSettings;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.platform.ViaChannelInitializer;
import de.maxhenkel.voicechat.mixin.ConnectionAccessor;
import dev.kastle.netty.channel.nethernet.NetherNetChannelFactory;
import dev.kastle.netty.channel.nethernet.signaling.NetherNetClientSignaling;
import dev.kastle.netty.channel.nethernet.signaling.NetherNetXboxRpcSignaling;
import dev.kastle.netty.channel.nethernet.signaling.NetherNetXboxSignaling;
import dev.kastle.webrtc.PeerConnectionFactory;
import io.netty.bootstrap.AbstractBootstrap;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFactory;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelFutureListener;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandler;
import io.netty.channel.ChannelOutboundHandler;
import io.netty.channel.ChannelPipeline;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.epoll.EpollDatagramChannel;
import io.netty.channel.epoll.EpollSocketChannel;
import io.netty.channel.kqueue.KQueueSocketChannel;
import io.netty.channel.local.LocalChannel;
import io.netty.channel.local.LocalServerChannel;
import io.netty.channel.socket.nio.NioDatagramChannel;
import io.netty.channel.socket.nio.NioSocketChannel;
import io.netty.handler.flow.FlowControlHandler;
import io.netty.handler.timeout.TimeoutException;
import io.netty.util.concurrent.GenericFutureListener;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.SocketAddress;
import java.net.SocketException;
import java.nio.channels.ClosedChannelException;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Queue;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.RejectedExecutionException;
import java.util.function.Consumer;
import javax.crypto.Cipher;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00423;
import minecraft.class00501;
import minecraft.class00606;
import minecraft.class00632;
import minecraft.class00633;
import minecraft.class00634;
import minecraft.class00638;
import minecraft.class00648;
import minecraft.class00657;
import minecraft.class00658;
import minecraft.class00660;
import minecraft.class00666;
import minecraft.class00671;
import minecraft.class01636;
import minecraft.class01673;
import minecraft.class01683;
import minecraft.class02270;
import minecraft.class02372;
import minecraft.class02400;
import minecraft.class02403;
import minecraft.class02570;
import minecraft.class02943;
import minecraft.class03041;
import minecraft.class03077;
import minecraft.class03096;
import minecraft.class03258;
import minecraft.class03260;
import minecraft.class03276;
import minecraft.class03288;
import minecraft.class03706;
import minecraft.class04193;
import minecraft.class04263;
import minecraft.class04275;
import minecraft.class04279;
import minecraft.class04285;
import minecraft.class04290;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class07529;
import minecraft.class07536;
import minecraft.class07814;
import minecraft.class07821;
import minecraft.class07825;
import minecraft.class07834;
import minecraft.class07844;
import minecraft.class08355;
import minecraft.class08363;
import net.fabricmc.fabric.impl.attachment.sync.SupportedAttachmentsClientConnection;
import net.fabricmc.fabric.impl.networking.ChannelInfoHolder;
import net.fabricmc.fabric.impl.networking.NetworkHandlerExtensions;
import net.fabricmc.fabric.impl.networking.PacketCallbackListener;
import net.fabricmc.fabric.impl.networking.PayloadTypeRegistryImpl;
import net.fabricmc.fabric.impl.networking.VanillaPacketTypes;
import net.fabricmc.fabric.impl.networking.splitter.FabricPacketMerger;
import net.fabricmc.fabric.impl.networking.splitter.FabricPacketSplitter;
import net.fabricmc.fabric.impl.recipe.ingredient.SupportedIngredientsClientConnection;
import net.fabricmc.fabric.impl.recipe.sync.SyncedSerializerAwareClientConnection;
import net.raphimc.minecraftauth.bedrock.model.MinecraftSession;
import net.raphimc.viabedrock.api.BedrockProtocolVersion;
import net.raphimc.viabedrock.protocol.RakNetStatusProtocol;
import net.raphimc.vialegacy.api.LegacyProtocolVersion;
import org.cloudburstmc.netty.channel.raknet.RakChannelFactory;
import org.jspecify.annotations.Nullable;
import org.slf4j.Logger;
import org.slf4j.Marker;
import org.slf4j.MarkerFactory;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfoReturnable;

public class class00642
extends SimpleChannelInboundHandler<class00381<?>>
implements class11797,
IConnection,
ConnectionAccessor,
SupportedAttachmentsClientConnection,
ChannelInfoHolder,
SupportedIngredientsClientConnection,
SyncedSerializerAwareClientConnection {
    private static final float field_33280 = 0.75f;
    private static final Logger field_11642 = LogUtils.getLogger();
    public static final Marker field_11641 = MarkerFactory.getMarker((String)"NETWORK");
    public static final Marker field_11639 = (Marker)class07536.N((Object)MarkerFactory.getMarker((String)"NETWORK_PACKETS"), marker -> marker.add(field_11641));
    public static final Marker field_36379 = (Marker)class07536.N((Object)MarkerFactory.getMarker((String)"PACKET_RECEIVED"), marker -> marker.add(field_11639));
    public static final Marker field_36380 = (Marker)class07536.N((Object)MarkerFactory.getMarker((String)"PACKET_SENT"), marker -> marker.add(field_11639));
    private static final class04275<class07825> field_48514 = class04263.y;
    public final class00423 field_11643;
    private volatile boolean field_48515 = true;
    public final Queue<Consumer<class00642>> field_45668;
    public Channel field_11651;
    private SocketAddress field_11645;
    private volatile @Nullable class00638 field_45669;
    private volatile @Nullable class00638 field_11652;
    private @Nullable class02570 field_52180;
    private boolean field_11647;
    private boolean field_11646;
    private int field_11658;
    private int field_11656;
    private float field_11654;
    private float field_11653;
    private int field_11655;
    private boolean field_11640;
    private volatile @Nullable class02570 field_44972;
    public @Nullable class03706 field_45955;
    private Set supportedAttachments = new HashSet();
    private Map playChannels;
    private Set fabric_supportedCustomIngredients = Set.of();
    private Set syncedRecipeSerializers = Set.of();
    private UserConnection viaFabricPlus$userConnection;
    private ProtocolVersion viaFabricPlus$serverVersion;
    private Cipher viaFabricPlus$decryptionCipher;

    public class00642(class00423 class004232) {
        this.field_45668 = Queues.newConcurrentLinkedQueue();
        this.field_11643 = class004232;
        this.m_handler$zil000$fabric_networking_api_v1$initAddedFields_7(class004232, null);
    }

    public /* synthetic */ Channel getChannel() {
        return this.field_11651;
    }

    public void method_10747(class00392 class003922) {
        this.method_60924(new class02570(class003922));
    }

    public UserConnection viaFabricPlus$getUserConnection() {
        return this.viaFabricPlus$userConnection;
    }

    public void viaFabricPlus$setUserConnection(UserConnection userConnection) {
        this.viaFabricPlus$userConnection = userConnection;
    }

    public ProtocolVersion viaFabricPlus$getTargetVersion() {
        return this.viaFabricPlus$serverVersion;
    }

    public void exceptionCaught(ChannelHandlerContext channelHandlerContext, Throwable throwable) {
        this.handler$daa000$viafabricplus$printNetworkingErrors(channelHandlerContext, throwable, null);
        if (throwable instanceof class09175) {
            field_11642.debug("Skipping packet due to errors", throwable.getCause());
            return;
        }
        boolean bl = !this.field_11640;
        this.field_11640 = true;
        if (!this.field_11651.isOpen()) {
            return;
        }
        if (throwable instanceof TimeoutException) {
            field_11642.debug("Timeout", throwable);
            this.method_10747((class00392)class00392.L((String)"disconnect.timeout"));
        } else {
            class05216 class052162 = class00392.N((String)"disconnect.genericReason", (Object[])new Object[]{"Internal Exception: " + String.valueOf(throwable)});
            class00638 class006382 = this.field_11652;
            class02570 class025702 = class006382 != null ? class006382.N((class00392)class052162, throwable) : new class02570((class00392)class052162);
            if (bl) {
                field_11642.debug("Failed to sent packet", throwable);
                if (this.method_36122() == class00423.field_11942) {
                    class07814 class078142 = this.field_48515 ? new class07814((class00392)class052162) : new class00501((class00392)class052162);
                    this.method_10752((class00381<?>)class078142, class03041.N(() -> this.method_60924(class025702)));
                } else {
                    this.method_60924(class025702);
                }
                this.method_10757();
            } else {
                field_11642.debug("Double fault", throwable);
                this.method_60924(class025702);
            }
        }
    }

    public void userEventTriggered(ChannelHandlerContext channelHandlerContext, Object object) throws Exception {
        if (object.getClass().getName().equals("me.steinborn.krypton.mod.shared.misc.KryptonPipelineEvent") && object.toString().equals("COMPRESSION_ENABLED")) {
            ViaChannelInitializer.reorderPipeline((ChannelPipeline)channelHandlerContext.pipeline(), (String)"compress", (String)"decompress");
            ViaFabricPlusImpl.INSTANCE.getLogger().warn("ViaFabricPlus has detected that the Krypton mod is installed. Please note that Krypton is mostly snake oil on the client side, and it is not recommended to use it.");
            return;
        }
        super.userEventTriggered(channelHandlerContext, object);
    }

    public void channelActive(ChannelHandlerContext channelHandlerContext) throws Exception {
        class00642 class006422 = this;
        ChannelHandlerContext channelHandlerContext2 = channelHandlerContext;
        if (this.wrapWithCondition$cpl000$viafabricplus$dontCallChannelActiveTwice(class006422, channelHandlerContext2)) {
            super.channelActive(channelHandlerContext2);
        }
        this.field_11651 = channelHandlerContext.channel();
        this.field_11645 = this.field_11651.remoteAddress();
        if (this.field_44972 != null) {
            this.method_60924(this.field_44972);
        }
    }

    public void channelInactive(ChannelHandlerContext channelHandlerContext) {
        this.m_handler$zil000$fabric_networking_api_v1$disconnectAddon_9(channelHandlerContext, null);
        this.method_10747((class00392)class00392.L((String)"disconnect.endOfStream"));
    }

    public void channelRegistered(ChannelHandlerContext channelHandlerContext) throws Exception {
        super.channelRegistered(channelHandlerContext);
        if (BedrockProtocolVersion.bedrockLatest.equals((Object)((IConnection)this).viaFabricPlus$getTargetVersion())) {
            this.channelActive(channelHandlerContext);
        }
    }

    public Set fabric_getSupportedAttachments() {
        return this.supportedAttachments;
    }

    private void handler$cem000$nursultan$onSend(class00381 class003812, ChannelFutureListener channelFutureListener, boolean bl, CallbackInfo callbackInfo) {
        if (class003812.method_65080().N() == class00423.field_11942) {
            return;
        }
        class10965 class109652 = new class10965(class003812);
        class11938.L().L((Object)class109652);
        if (class109652.y()) {
            callbackInfo.cancel();
        }
    }

    public void viaFabricPlus$setTargetVersion(ProtocolVersion protocolVersion) {
        this.viaFabricPlus$serverVersion = protocolVersion;
    }

    private static void handler$cph000$viafabricplus$setTargetVersion(InetSocketAddress inetSocketAddress, class00606 class006062, class00642 class006422, CallbackInfoReturnable callbackInfoReturnable, LocalRef localRef) {
        ProtocolVersion protocolVersion = ((IConnection)class006422).viaFabricPlus$getTargetVersion();
        if (protocolVersion == null) {
            protocolVersion = ProtocolTranslator.getTargetVersion();
        }
        if (protocolVersion == ProtocolTranslator.AUTO_DETECT_PROTOCOL) {
            protocolVersion = ProtocolTranslator.NATIVE_VERSION;
        }
        ((IConnection)class006422).viaFabricPlus$setTargetVersion(protocolVersion);
    }

    private static void handler$cph000$viafabricplus$setTargetVersion(InetSocketAddress inetSocketAddress, class00606 class006062, class02270 class022702, CallbackInfoReturnable callbackInfoReturnable, class00642 class006422) {
        ILocalSampleLogger iLocalSampleLogger;
        if (class022702 instanceof ILocalSampleLogger && (iLocalSampleLogger = (ILocalSampleLogger)class022702).viaFabricPlus$getForcedVersion() != null) {
            ((IConnection)class006422).viaFabricPlus$setTargetVersion(iLocalSampleLogger.viaFabricPlus$getForcedVersion());
        }
    }

    private void handler$daa000$viafabricplus$printNetworkingErrors(ChannelHandlerContext channelHandlerContext, Throwable throwable, CallbackInfo callbackInfo) {
        if (((Boolean)DebugSettings.INSTANCE.printNetworkingErrorsToLogs.getValue()).booleanValue()) {
            if (throwable instanceof SocketException || throwable instanceof ConnectException) {
                return;
            }
            ViaFabricPlusImpl.INSTANCE.getLogger().error("An exception occurred while handling a packet", throwable);
        }
    }

    private static void handler$cpl001$viafabricplus$setTargetVersion(InetSocketAddress inetSocketAddress, class00606 class006062, class00642 class006422, CallbackInfoReturnable callbackInfoReturnable, LocalRef localRef) {
        ProtocolVersion protocolVersion = ((IConnection)class006422).viaFabricPlus$getTargetVersion();
        if (BedrockProtocolVersion.bedrockLatest.equals((Object)protocolVersion) && (class006062.u() == KQueueSocketChannel.class || inetSocketAddress instanceof NetherNetInetSocketAddress)) {
            class00606 class006063 = class00606.N((boolean)false);
            ((IEventLoopGroupHolder)class006063).viaFabricPlus$setConnecting(((IEventLoopGroupHolder)class006062).viaFabricPlus$isConnecting());
            localRef.set((Object)class006063);
        }
    }

    private void handler$cph000$viafabricplus$reorderCompression(int n, boolean bl, CallbackInfo callbackInfo) {
        ViaChannelInitializer.reorderPipeline((ChannelPipeline)this.field_11651.pipeline(), (String)"compress", (String)"decompress");
    }

    private void handler$cem000$nursultan$onChannelRead0Post(ChannelHandlerContext channelHandlerContext, class00381 class003812, CallbackInfo callbackInfo) {
        if (this.field_11643 == class00423.field_11941) {
            return;
        }
        if (class003812 instanceof class03260) {
            for (class00381 class003813 : ((class03260)class003812).N()) {
                class11938.L().L((Object)new class10961(class003813));
            }
        } else {
            class11938.L().L((Object)new class10961(class003812));
        }
    }

    private void handler$cph000$viafabricplus$storeDecryptionCipher(Cipher cipher, Cipher cipher2, CallbackInfo callbackInfo) {
        if (this.viaFabricPlus$serverVersion != null && this.viaFabricPlus$serverVersion.olderThanOrEqualTo(LegacyProtocolVersion.r1_6_4)) {
            callbackInfo.cancel();
            this.viaFabricPlus$decryptionCipher = cipher;
            if (cipher2 == null) {
                throw new IllegalStateException("Encryption cipher is null");
            }
            this.field_11647 = true;
            this.field_11651.pipeline().addBefore("vialegacy-pre-netty-length-remover", "encrypt", (ChannelHandler)new class00666(cipher2));
        }
    }

    public void method_56329(class04275<?> class042752) {
        if (class042752.y() != this.method_36122()) {
            throw new IllegalStateException("Invalid outbound protocol: " + String.valueOf((Object)class042752.N()));
        }
        class02400 class024002 = class04285.y(class042752);
        class03276 class032762 = class042752.u();
        if (class032762 != null) {
            class03258 class032582 = new class03258(class032762);
            class024002 = class024002.N(channelHandlerContext -> channelHandlerContext.pipeline().addAfter("encoder", "unbundler", (ChannelHandler)class032582));
        }
        boolean bl = class042752.N() == class00648.field_20593;
        class02400 class024003 = class024002.N(channelHandlerContext -> {
            this.field_48515 = bl;
        });
        class00642.method_59851(this.field_11651.writeAndFlush(this.m_modify$zil000$fabric_networking_api_v1$injectFabricPacketSlitterHandlerOutbound_4(class024003, class042752)));
    }

    public boolean method_10758() {
        return this.field_11651 != null && this.field_11651.isOpen();
    }

    public SocketAddress method_10755() {
        return this.field_11645;
    }

    public void method_52915() {
        if (this.method_10758()) {
            this.method_52918();
        } else {
            this.field_45668.add(class00642::method_52918);
        }
    }

    public void method_52906(class00381<?> class003812, @Nullable ChannelFutureListener channelFutureListener, boolean bl) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$cem000$nursultan$onSend(class003812, channelFutureListener, bl, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (this.method_10758()) {
            this.method_10751();
            this.method_10764(class003812, channelFutureListener, bl);
        } else {
            this.field_45668.add(class006422 -> class006422.method_10764(class003812, channelFutureListener, bl));
        }
    }

    public void method_10757() {
        if (this.field_11651 != null) {
            this.field_11651.config().setAutoRead(false);
        }
    }

    public void method_10752(class00381<?> class003812, @Nullable ChannelFutureListener channelFutureListener) {
        this.method_52906(class003812, channelFutureListener, true);
    }

    public void method_60924(class02570 class025702) {
        if (this.field_11651 == null) {
            this.field_44972 = class025702;
        }
        if (this.method_10758()) {
            this.field_11651.close().awaitUninterruptibly();
            this.field_52180 = class025702;
        }
    }

    public void method_10768() {
        class00638 class006382;
        if (this.field_11651 == null || this.field_11651.isOpen()) {
            return;
        }
        if (this.field_11646) {
            field_11642.warn("handleDisconnection() called twice");
            return;
        }
        this.field_11646 = true;
        class00638 class006383 = this.method_10744();
        class00638 class006384 = class006382 = class006383 != null ? class006383 : this.field_45669;
        if (class006382 != null) {
            class02570 class025702 = Objects.requireNonNullElseGet(this.method_60926(), () -> new class02570((class00392)class00392.L((String)"multiplayer.disconnect.generic")));
            this.m_handler$zil000$fabric_networking_api_v1$disconnectAddon_9(null);
            class006382.method_10839(class025702);
        }
    }

    private boolean wrapWithCondition$cpl000$viafabricplus$dontCallChannelActiveTwice(SimpleChannelInboundHandler simpleChannelInboundHandler, ChannelHandlerContext channelHandlerContext) {
        return !BedrockProtocolVersion.bedrockLatest.equals((Object)((IConnection)this).viaFabricPlus$getTargetVersion());
    }

    private static boolean wrapWithCondition$cph000$viafabricplus$dontSetPerformanceLog(class00642 class006422, class02270 class022702) {
        return !(class022702 instanceof ILocalSampleLogger) || ((ILocalSampleLogger)class022702).viaFabricPlus$getForcedVersion() == null;
    }

    public Set fabric_getSyncedRecipeSerializers() {
        return this.syncedRecipeSerializers;
    }

    public Collection fabric_getPendingChannelsNames(class00648 class006483) {
        return this.playChannels.computeIfAbsent(class006483, class006482 -> Collections.newSetFromMap(new ConcurrentHashMap()));
    }

    public void fabric_setSyncedRecipeSerializers(Set set) {
        this.syncedRecipeSerializers = set;
    }

    public class00423 method_36122() {
        return this.field_11643.N();
    }

    public void channelRead0(ChannelHandlerContext channelHandlerContext, class00381<?> class003812) {
        if (!this.field_11651.isOpen()) {
            this.handler$zzo000$baritone$postProcessPacket(channelHandlerContext, class003812, null);
            return;
        }
        class00638 class006382 = this.field_11652;
        if (class006382 == null) {
            throw new IllegalStateException("Received a packet before the packet listener was initialized");
        }
        if (class006382.method_52413(class003812)) {
            try {
                this.handler$zzo000$baritone$preProcessPacket(channelHandlerContext, class003812, null);
                CallbackInfo callbackInfo = new CallbackInfo("", true);
                this.handler$cem000$nursultan$onChannelRead0(channelHandlerContext, class003812, callbackInfo);
                if (callbackInfo.isCancelled()) {
                    return;
                }
                class00642.method_10759(class003812, class006382);
            }
            catch (class03096 class030962) {
            }
            catch (RejectedExecutionException rejectedExecutionException) {
                this.method_10747((class00392)class00392.L((String)"multiplayer.disconnect.server_shutdown"));
            }
            catch (ClassCastException classCastException) {
                field_11642.error("Received {} that couldn't be processed", (Object)class003812.getClass(), (Object)classCastException);
                this.method_10747((class00392)class00392.L((String)"multiplayer.disconnect.invalid_packet"));
            }
            ++this.field_11658;
            this.handler$cem000$nursultan$onChannelRead0Post(channelHandlerContext, class003812, null);
        }
        this.handler$zzo000$baritone$postProcessPacket(channelHandlerContext, class003812, null);
    }

    public void method_10746(Cipher cipher, Cipher cipher2) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$cph000$viafabricplus$storeDecryptionCipher(cipher, cipher2, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        this.field_11647 = true;
        this.field_11651.pipeline().addBefore("splitter", "decrypt", (ChannelHandler)new class00633(cipher));
        this.field_11651.pipeline().addBefore("prepender", "encrypt", (ChannelHandler)new class00666(cipher2));
    }

    public boolean method_10771() {
        return this.field_11647;
    }

    public boolean method_10756() {
        return this.field_11651 instanceof LocalChannel || this.field_11651 instanceof LocalServerChannel;
    }

    public void viaFabricPlus$setupPreNettyDecryption() {
        if (this.viaFabricPlus$decryptionCipher == null) {
            throw new IllegalStateException("Decryption cipher is null");
        }
        this.field_11647 = true;
        this.field_11651.pipeline().addBefore("vialegacy-pre-netty-length-prepender", "decrypt", (ChannelHandler)new class00633(this.viaFabricPlus$decryptionCipher));
    }

    public void method_10760(int n, boolean bl) {
        if (n >= 0) {
            Object object;
            ChannelHandler channelHandler = this.field_11651.pipeline().get("decompress");
            if (channelHandler instanceof class00634) {
                object = (class00634)channelHandler;
                ((class00634)((Object)object)).N(n, bl);
            } else {
                this.field_11651.pipeline().addAfter("splitter", "decompress", (ChannelHandler)new class00634(n, bl));
            }
            channelHandler = this.field_11651.pipeline().get("compress");
            if (channelHandler instanceof class00671) {
                object = (class00671)channelHandler;
                ((class00671)((Object)object)).N(n);
            } else {
                this.field_11651.pipeline().addAfter("prepender", "compress", (ChannelHandler)new class00671(n));
            }
        } else {
            if (this.field_11651.pipeline().get("decompress") instanceof class00634) {
                this.field_11651.pipeline().remove("decompress");
            }
            if (this.field_11651.pipeline().get("compress") instanceof class00671) {
                this.field_11651.pipeline().remove("compress");
            }
        }
        this.handler$cph000$viafabricplus$reorderCompression(n, bl, null);
    }

    public float method_10745() {
        return this.field_11653;
    }

    public float method_10762() {
        return this.field_11654;
    }

    public void fabric_setSupportedCustomIngredients(Set set) {
        this.fabric_supportedCustomIngredients = set;
    }

    private Object m_modify$zil000$fabric_networking_api_v1$injectFabricPacketSlitterHandlerOutbound_4(Object object, class04275 class042752) {
        PayloadTypeRegistryImpl var3 = PayloadTypeRegistryImpl.get((class04275)class042752);
        if (var3 == null) {
            return object;
        }
        return ((class02400)object).N(channelHandlerContext -> {
            FabricPacketSplitter fabricPacketSplitter = new FabricPacketSplitter((class00657)channelHandlerContext.pipeline().get(class00657.class), var3);
            channelHandlerContext.pipeline().addAfter("encoder", "fabric:splitter", (ChannelHandler)fabricPacketSplitter);
        });
    }

    private static AbstractBootstrap wrapOperation$cpl000$viafabricplus$useRakNetChannelFactory$mixinextras$bridge$114(Bootstrap bootstrap, Class clazz, Operation operation, LocalRef localRef, LocalRef localRef2) {
        return class00642.wrapOperation$cpl000$viafabricplus$useRakNetChannelFactory(bootstrap, clazz, operation, (InetSocketAddress)localRef.get(), (class00642)((Object)localRef2.get()));
    }

    private Object m_modify$zil000$fabric_networking_api_v1$injectFabricPacketSlitterHandlerInbound_6(Object object, class04275 class042752) {
        PayloadTypeRegistryImpl var3 = PayloadTypeRegistryImpl.get((class04275)class042752);
        if (var3 == null) {
            return object;
        }
        return ((class02403)object).N(channelHandlerContext -> {
            FabricPacketMerger fabricPacketMerger = new FabricPacketMerger((class00658)channelHandlerContext.pipeline().get(class00658.class), var3, VanillaPacketTypes.get((class04275)class042752));
            channelHandlerContext.pipeline().addAfter("decoder", "fabric:merger", (ChannelHandler)fabricPacketMerger);
        });
    }

    private static ChannelFuture wrapOperation$cpl000$viafabricplus$useRakNetPingHandlers$mixinextras$bridge$115(Bootstrap bootstrap, InetAddress inetAddress, int n, Operation operation, LocalRef localRef, LocalRef localRef2, LocalRef localRef3) {
        return class00642.wrapOperation$cpl000$viafabricplus$useRakNetPingHandlers(bootstrap, inetAddress, n, operation, (InetSocketAddress)localRef.get(), (class00642)((Object)localRef2.get()), (class00606)localRef3.get());
    }

    public void fabric_setSupportedAttachments(Set set) {
        this.supportedAttachments = set;
    }

    public void method_10743(class00381<?> class003812) {
        this.method_10752(class003812, null);
    }

    private void handler$zzo000$baritone$preDispatchPacket(class00381 class003812, ChannelFutureListener channelFutureListener, boolean bl, CallbackInfo callbackInfo) {
        if (this.field_11643 != class00423.field_11942) {
            return;
        }
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (iBaritone.getPlayerContext().player() == null || ((class01683)iBaritone.getPlayerContext().player().y_0).M() != this) continue;
            iBaritone.getGameEventHandler().onSendPacket(new PacketEvent(this, EventState.PRE, class003812));
        }
    }

    private void handler$zzo000$baritone$postProcessPacket(ChannelHandlerContext channelHandlerContext, class00381 class003812, CallbackInfo callbackInfo) {
        if (!this.field_11651.isOpen() || this.field_11643 != class00423.field_11942) {
            return;
        }
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (iBaritone.getPlayerContext().player() == null || ((class01683)iBaritone.getPlayerContext().player().y_0).M() != this) continue;
            iBaritone.getGameEventHandler().onReceivePacket(new PacketEvent(this, EventState.POST, class003812));
        }
    }

    private void handler$cem000$nursultan$onChannelRead0(ChannelHandlerContext channelHandlerContext, class00381 class003812, CallbackInfo callbackInfo) {
        class00642 class006422 = this;
        if (class006422.field_11643 == class00423.field_11941) {
            return;
        }
        if (class003812 instanceof class03260) {
            Iterator iterator = ((class03260)class003812).N().iterator();
            while (iterator.hasNext()) {
                class00381 class003813 = (class00381)iterator.next();
                class10990 class109902 = new class10990(class003813, class006422);
                class11938.L().L((Object)class109902);
                if (!class109902.y()) continue;
                iterator.remove();
            }
        } else {
            class10990 class109903 = new class10990(class003812, class006422);
            class11938.L().L((Object)class109903);
            if (class109903.y()) {
                callbackInfo.cancel();
            }
        }
    }

    private void handler$zzo000$baritone$postDispatchPacket(class00381 class003812, ChannelFutureListener channelFutureListener, boolean bl, CallbackInfo callbackInfo) {
        if (this.field_11643 != class00423.field_11942) {
            return;
        }
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (iBaritone.getPlayerContext().player() == null || ((class01683)iBaritone.getPlayerContext().player().y_0).M() != this) continue;
            iBaritone.getGameEventHandler().onSendPacket(new PacketEvent(this, EventState.POST, class003812));
        }
    }

    private void handler$zzo000$baritone$preProcessPacket(ChannelHandlerContext channelHandlerContext, class00381 class003812, CallbackInfo callbackInfo) {
        if (this.field_11643 != class00423.field_11942) {
            return;
        }
        for (IBaritone iBaritone : BaritoneAPI.getProvider().getAllBaritones()) {
            if (iBaritone.getPlayerContext().player() == null || ((class01683)iBaritone.getPlayerContext().player().y_0).M() != this) continue;
            iBaritone.getGameEventHandler().onReceivePacket(new PacketEvent(this, EventState.PRE, class003812));
        }
    }

    public Set fabric_getSupportedCustomIngredients() {
        return this.fabric_supportedCustomIngredients;
    }

    private static ChannelOutboundHandler method_59853(boolean bl) {
        return bl ? new class08355() : new class00632();
    }

    public void method_52903(String string, int n, class07834 class078342) {
        this.method_52904(string, n, class04290.y, class04290.u, class078342, class04193.field_44974);
    }

    private static String method_56333(boolean bl) {
        return bl ? "encoder" : "outbound_config";
    }

    public static class00642 method_10769(SocketAddress socketAddress) {
        class00642 class006422 = new class00642(class00423.field_11942);
        ((Bootstrap)((Bootstrap)((Bootstrap)new Bootstrap().group(class00606.N().L())).handler((ChannelHandler)new class09381(class006422))).channel(class00606.N().u())).connect(socketAddress).syncUninterruptibly();
        return class006422;
    }

    public void method_52902(String string, int n, class07844 class078442) {
        this.method_52904(string, n, class04279.y, class04279.u, class078442, class04193.field_44975);
    }

    public static ChannelFuture method_52271(InetSocketAddress inetSocketAddress, class00606 class006062, class00642 class006422) {
        LocalRefImpl localRefImpl = new LocalRefImpl();
        localRefImpl.init((Object)class006062);
        class00642.handler$cph000$viafabricplus$setTargetVersion(inetSocketAddress, class006062, class006422, null, (LocalRef)localRefImpl);
        class006062 = (class00606)localRefImpl.dispose();
        LocalRefImpl localRefImpl2 = new LocalRefImpl();
        localRefImpl2.init((Object)class006062);
        class00642.handler$cpl001$viafabricplus$setTargetVersion(inetSocketAddress, class006062, class006422, null, (LocalRef)localRefImpl2);
        class006062 = (class00606)localRefImpl2.dispose();
        Class var6 = class006062.u();
        Bootstrap bootstrap = (Bootstrap)((Bootstrap)new Bootstrap().group(class006062.L())).handler((ChannelHandler)new class09379(class006422));
        Operation operation = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)2, (String)"[io.netty.bootstrap.Bootstrap, java.lang.Class]");
            return ((Bootstrap)objectArray[0]).channel((Class)objectArray[1]);
        };
        LocalRefImpl localRefImpl3 = new LocalRefImpl();
        LocalRefImpl localRefImpl4 = new LocalRefImpl();
        localRefImpl3.init((Object)inetSocketAddress);
        localRefImpl4.init((Object)class006422);
        class006422 = (class00642)((Object)localRefImpl4.dispose());
        inetSocketAddress = (InetSocketAddress)localRefImpl3.dispose();
        int n = inetSocketAddress.getPort();
        InetAddress inetAddress = inetSocketAddress.getAddress();
        bootstrap = (Bootstrap)class00642.wrapOperation$cpl000$viafabricplus$useRakNetChannelFactory$mixinextras$bridge$114(bootstrap, var6, operation, (LocalRef)localRefImpl3, (LocalRef)localRefImpl4);
        Operation operation2 = objectArray -> {
            WrapOperationRuntime.checkArgumentCount((Object[])objectArray, (int)3, (String)"[io.netty.bootstrap.Bootstrap, java.net.InetAddress, int]");
            Object[] objectArray2 = objectArray;
            return ((Bootstrap)objectArray[0]).connect((InetAddress)objectArray2[1], ((Integer)objectArray2[2]).intValue());
        };
        LocalRefImpl localRefImpl5 = new LocalRefImpl();
        LocalRefImpl localRefImpl6 = new LocalRefImpl();
        LocalRefImpl localRefImpl7 = new LocalRefImpl();
        localRefImpl5.init((Object)inetSocketAddress);
        localRefImpl6.init((Object)class006422);
        localRefImpl7.init((Object)class006062);
        class006062 = (class00606)localRefImpl7.dispose();
        class006422 = (class00642)((Object)localRefImpl6.dispose());
        inetSocketAddress = (InetSocketAddress)localRefImpl5.dispose();
        return class00642.wrapOperation$cpl000$viafabricplus$useRakNetPingHandlers$mixinextras$bridge$115(bootstrap, inetAddress, n, operation2, (LocalRef)localRefImpl5, (LocalRef)localRefImpl6, (LocalRef)localRefImpl7);
    }

    private void method_36942(class00381<?> class003812, @Nullable ChannelFutureListener channelFutureListener, boolean bl) {
        if (channelFutureListener != null) {
            (bl ? this.field_11651.writeAndFlush(class003812) : this.field_11651.write(class003812)).addListener((GenericFutureListener)channelFutureListener);
        } else if (bl) {
            this.field_11651.writeAndFlush(class003812, this.field_11651.voidPromise());
        } else {
            this.field_11651.write(class003812, this.field_11651.voidPromise());
        }
    }

    public static void method_48311(ChannelPipeline channelPipeline, class00423 class004232, boolean bl, @Nullable class03706 class037062) {
        class00423 class004233 = class004232.N();
        boolean bl2 = class004232 == class00423.field_11941;
        boolean bl3 = class004233 == class00423.field_11941;
        channelPipeline.addLast("splitter", (ChannelHandler)class00642.method_59852(class037062, bl)).addLast(new ChannelHandler[]{new FlowControlHandler()}).addLast(class00642.method_56334(bl2), bl2 ? new class00658<class07825>(field_48514) : new class02372()).addLast("prepender", (ChannelHandler)class00642.method_59853(bl)).addLast(class00642.method_56333(bl3), bl3 ? new class00657<class07825>(field_48514) : new class09700());
    }

    private void method_56332(class04275<?> class042752, class00638 class006382) {
        this.m_handler$zil000$fabric_networking_api_v1$unwatchAddon_8(class042752, class006382, null);
        Objects.requireNonNull(class006382, "packetListener");
        class00423 class004232 = class006382.N();
        if (class004232 != this.field_11643) {
            throw new IllegalStateException("Trying to set listener for wrong side: connection is " + String.valueOf(this.field_11643) + ", but listener is " + String.valueOf(class004232));
        }
        class00648 class006482 = class006382.y();
        if (class042752.N() != class006482) {
            throw new IllegalStateException("Listener protocol (" + String.valueOf((Object)class006482) + ") does not match requested one " + String.valueOf(class042752));
        }
    }

    private static ChannelInboundHandler method_59852(@Nullable class03706 class037062, boolean bl) {
        if (!bl) {
            return new class00660(class037062);
        }
        if (class037062 != null) {
            return new class02943(class037062);
        }
        return new class08363();
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    public final void method_10751() {
        if (this.field_11651 == null || !this.field_11651.isOpen()) {
            return;
        }
        Queue<Consumer<class00642>> var1 = this.field_45668;
        synchronized (var1) {
            Consumer<class00642> var2;
            while ((var2 = this.field_45668.poll()) != null) {
                var2.accept(this);
            }
        }
    }

    private <S extends class01636, C extends class01673> void method_52904(String string, int n, class04275<S> class042752, class04275<C> class042753, C c, class04193 class041932) {
        if (class042752.N() != class042753.N()) {
            throw new IllegalStateException("Mismatched initial protocols");
        }
        this.field_45669 = c;
        this.method_52905(class006422 -> {
            this.method_56330((class04275)class042753, (class00638)c);
            class006422.method_10764((class00381<?>)new class07821(class07529.y().comp_4027(), string, n, class041932), null, true);
            this.method_56329(class042752);
        });
    }

    public void method_10754() {
        this.method_10751();
        class00638 class006382 = this.field_11652;
        if (class006382 instanceof class03077) {
            ((class03077)class006382).method_18784();
        }
        if (!this.method_10758() && !this.field_11646) {
            this.method_10768();
        }
        if (this.field_11651 != null) {
            this.field_11651.flush();
        }
        if (this.field_11655++ % 20 == 0) {
            this.method_30615();
        }
        if (this.field_45955 != null) {
            this.field_45955.N();
        }
    }

    private static <T extends class00638> void method_10759(class00381<T> class003812, class00638 class006382) {
        class003812.method_65081(class006382);
    }

    private void method_52918() {
        if (this.field_11651.eventLoop().inEventLoop()) {
            this.field_11651.flush();
        } else {
            this.field_11651.eventLoop().execute(() -> this.field_11651.flush());
        }
    }

    public static void method_52911(ChannelPipeline channelPipeline, class00423 class004232) {
        class00642.method_48311(channelPipeline, class004232, true, null);
    }

    private static void method_59851(ChannelFuture channelFuture) {
        try {
            channelFuture.syncUninterruptibly();
        }
        catch (Exception exception) {
            if (exception instanceof ClosedChannelException) {
                field_11642.info("Connection closed during protocol change");
                return;
            }
            throw exception;
        }
    }

    public <S extends class01636, C extends class01673> void method_56326(String string, int n, class04275<S> class042752, class04275<C> class042753, C c, boolean bl) {
        this.method_52904(string, n, class042752, class042753, c, bl ? class04193.field_48227 : class04193.field_44975);
    }

    public String method_52909(boolean bl) {
        if (this.field_11645 == null) {
            return "local";
        }
        if (bl) {
            return this.field_11645.toString();
        }
        return "IP hidden";
    }

    public void method_53859(ChannelPipeline channelPipeline) {
        channelPipeline.addLast("hackfix", (ChannelHandler)new class09380(this)).addLast("packet_handler", (ChannelHandler)this);
    }

    public static class00642 method_10753(InetSocketAddress inetSocketAddress, class00606 class006062, @Nullable class02270 class022702) {
        class02270 class022703;
        class00642 class006422;
        class00642 class006423 = new class00642(class00423.field_11942);
        if (class022702 != null && class00642.wrapWithCondition$cph000$viafabricplus$dontSetPerformanceLog(class006422 = class006423, class022703 = class022702)) {
            class006422.method_53505(class022703);
        }
        class00642.handler$cph000$viafabricplus$setTargetVersion(inetSocketAddress, class006062, class022702, null, class006423);
        class00642.method_52271(inetSocketAddress, class006062, class006423).syncUninterruptibly();
        return class006423;
    }

    public final void method_10764(class00381<?> class003812, @Nullable ChannelFutureListener channelFutureListener, boolean bl) {
        this.handler$zzo000$baritone$preDispatchPacket(class003812, channelFutureListener, bl, null);
        this.m_handler$zil000$fabric_networking_api_v1$checkPacket_11(class003812, channelFutureListener, bl, null);
        this.m_handler$zil000$fabric_networking_api_v1$checkPacket_11(class003812, channelFutureListener, bl, null);
        ++this.field_11656;
        if (this.field_11651.eventLoop().inEventLoop()) {
            this.method_36942(class003812, channelFutureListener, bl);
        } else {
            this.field_11651.eventLoop().execute(() -> this.method_36942(class003812, channelFutureListener, bl));
        }
        this.handler$zzo000$baritone$postDispatchPacket(class003812, channelFutureListener, bl, null);
    }

    public class00423 method_36121() {
        return this.field_11643;
    }

    private static String method_56334(boolean bl) {
        return bl ? "decoder" : "inbound_config";
    }

    public void method_52905(Consumer<class00642> consumer) {
        if (this.method_10758()) {
            this.method_10751();
            consumer.accept(this);
        } else {
            this.field_45668.add(consumer);
        }
    }

    public void method_52912(class00638 class006382) {
        if (this.field_11652 != null) {
            throw new IllegalStateException("Listener already set");
        }
        if (this.field_11643 != class00423.field_11941 || class006382.N() != class00423.field_11941 || class006382.y() != field_48514.N()) {
            throw new IllegalStateException("Invalid initial listener");
        }
        this.field_11652 = class006382;
    }

    protected void method_30615() {
        this.field_11653 = class04995.B((float)0.75f, (float)this.field_11656, (float)this.field_11653);
        this.field_11654 = class04995.B((float)0.75f, (float)this.field_11658, (float)this.field_11654);
        this.field_11656 = 0;
        this.field_11658 = 0;
    }

    public void method_53505(class02270 class022702) {
        this.field_45955 = new class03706(class022702);
    }

    public boolean method_10772() {
        return this.field_11651 == null;
    }

    public void sendPacketSilent(class00381 class003812) {
        if (this.method_10758()) {
            this.method_10751();
            this.method_10764(class003812, null, true);
        } else {
            this.field_45668.add(class006422 -> class006422.method_10764(class003812, null, true));
        }
    }

    public @Nullable class02570 method_60926() {
        return this.field_52180;
    }

    public @Nullable class00638 method_10744() {
        return this.field_11652;
    }

    private void m_handler$zil000$fabric_networking_api_v1$initAddedFields_7(class00423 class004232, CallbackInfo callbackInfo) {
        this.playChannels = new ConcurrentHashMap();
    }

    private void m_handler$zil000$fabric_networking_api_v1$unwatchAddon_8(class04275 class042752, class00638 class006382, CallbackInfo callbackInfo) {
        class00638 class006383 = this.field_11652;
        if (class006383 instanceof NetworkHandlerExtensions) {
            ((NetworkHandlerExtensions)class006383).getAddon().endSession();
        }
    }

    private void m_handler$zil000$fabric_networking_api_v1$disconnectAddon_9(ChannelHandlerContext channelHandlerContext, CallbackInfo callbackInfo) {
        class00638 class006382 = this.field_11652;
        if (class006382 instanceof NetworkHandlerExtensions) {
            ((NetworkHandlerExtensions)class006382).getAddon().handleDisconnect();
        }
    }

    private void m_handler$zil000$fabric_networking_api_v1$disconnectAddon_9(CallbackInfo callbackInfo) {
        class00638 class006382 = this.field_11652;
        if (class006382 instanceof NetworkHandlerExtensions) {
            ((NetworkHandlerExtensions)class006382).getAddon().handleDisconnect();
        }
    }

    private void m_handler$zil000$fabric_networking_api_v1$checkPacket_11(class00381 class003812, ChannelFutureListener channelFutureListener, boolean bl, CallbackInfo callbackInfo) {
        if (this.field_11652 instanceof PacketCallbackListener) {
            ((PacketCallbackListener)this.field_11652).sent(class003812);
        }
    }

    private static ChannelFuture wrapOperation$cpl000$viafabricplus$useRakNetPingHandlers(Bootstrap bootstrap, InetAddress inetAddress, int n, Operation operation, InetSocketAddress inetSocketAddress, class00642 class006422, class00606 class006062) {
        if (BedrockProtocolVersion.bedrockLatest.equals((Object)((IConnection)class006422).viaFabricPlus$getTargetVersion())) {
            if (inetSocketAddress instanceof NetherNetInetSocketAddress) {
                NetherNetInetSocketAddress netherNetInetSocketAddress = (NetherNetInetSocketAddress)inetSocketAddress;
                return bootstrap.connect((SocketAddress)netherNetInetSocketAddress.getNetherNetAddress()).addListeners(new GenericFutureListener[]{ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE, channelFuture -> {
                    if (channelFuture.isSuccess()) {
                        channelFuture.channel().pipeline().remove("viabedrock-raknet-message-codec");
                    }
                }});
            }
            if (!((IEventLoopGroupHolder)class006062).viaFabricPlus$isConnecting()) {
                return bootstrap.register().syncUninterruptibly().channel().bind((SocketAddress)new InetSocketAddress(0)).addListeners(new GenericFutureListener[]{ChannelFutureListener.FIRE_EXCEPTION_ON_FAILURE, channelFuture -> {
                    if (channelFuture.isSuccess()) {
                        channelFuture.channel().pipeline().replace("viabedrock-raknet-message-codec", "viabedrock-ping-encapsulation", (ChannelHandler)new RakNetPingEncapsulationCodec(new InetSocketAddress(inetAddress, n)));
                        channelFuture.channel().pipeline().remove("viabedrock-packet-codec");
                        channelFuture.channel().pipeline().remove("splitter");
                        ((IConnection)class006422).viaFabricPlus$getUserConnection().getProtocolInfo().getPipeline().add((Protocol)RakNetStatusProtocol.INSTANCE);
                    }
                }});
            }
        }
        return (ChannelFuture)operation.call(new Object[]{bootstrap, inetAddress, n});
    }

    private static AbstractBootstrap wrapOperation$cpl000$viafabricplus$useRakNetChannelFactory(Bootstrap bootstrap, Class clazz, Operation operation, InetSocketAddress inetSocketAddress, class00642 class006422) {
        if (BedrockProtocolVersion.bedrockLatest.equals((Object)((IConnection)class006422).viaFabricPlus$getTargetVersion())) {
            if (inetSocketAddress instanceof NetherNetInetSocketAddress) {
                NetherNetInetSocketAddress netherNetInetSocketAddress = (NetherNetInetSocketAddress)inetSocketAddress;
                String string = ((MinecraftSession)SaveManager.INSTANCE.getAccountsSave().getBedrockAccount().getMinecraftSession().getUpToDateUnchecked()).getAuthorizationHeader();
                if (netherNetInetSocketAddress.getNetherNetAddress() instanceof NetherNetJsonRpcAddress) {
                    return bootstrap.channelFactory(NetherNetChannelFactory.client((PeerConnectionFactory)new PeerConnectionFactory(), (NetherNetClientSignaling)new NetherNetXboxRpcSignaling(string)));
                }
                return bootstrap.channelFactory(NetherNetChannelFactory.client((PeerConnectionFactory)new PeerConnectionFactory(), (NetherNetClientSignaling)new NetherNetXboxSignaling(string)));
            }
            if (clazz == NioSocketChannel.class) {
                clazz = NioDatagramChannel.class;
            } else if (clazz == EpollSocketChannel.class) {
                clazz = EpollDatagramChannel.class;
            } else {
                throw new IllegalStateException("Unsupported channel type for RakNet: " + String.valueOf(clazz));
            }
            return bootstrap.channelFactory((ChannelFactory)RakChannelFactory.client(clazz));
        }
        return (AbstractBootstrap)operation.call(new Object[]{bootstrap, clazz});
    }

    public <T extends class00638> void method_56330(class04275<T> class042752, T t) {
        this.method_56332(class042752, t);
        if (class042752.y() != this.method_36121()) {
            throw new IllegalStateException("Invalid inbound protocol: " + String.valueOf((Object)class042752.N()));
        }
        this.field_11652 = t;
        this.field_45669 = null;
        class02403 class024032 = class04285.N(class042752);
        class03276 class032762 = class042752.u();
        if (class032762 != null) {
            class03288 class032882 = new class03288(class032762);
            class024032 = class024032.N(channelHandlerContext -> channelHandlerContext.pipeline().addAfter("decoder", "bundler", (ChannelHandler)class032882));
        }
        class02403 class024033 = class024032;
        class00642.method_59851(this.field_11651.writeAndFlush(this.m_modify$zil000$fabric_networking_api_v1$injectFabricPacketSlitterHandlerInbound_6(class024033, class042752)));
    }
}

