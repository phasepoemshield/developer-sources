/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelFutureListener
 *  minecraft.class00381
 *  minecraft.class00392
 *  minecraft.class00642
 *  minecraft.class00667
 *  minecraft.class01610
 *  minecraft.class01659
 *  minecraft.class01894
 *  minecraft.class02796
 *  minecraft.class03041
 *  minecraft.class04155
 *  minecraft.class07812
 *  minecraft.class07838
 *  minecraft.class07847
 *  net.fabricmc.fabric.api.networking.v1.LoginPacketSender
 *  net.fabricmc.fabric.api.networking.v1.PacketByteBufs
 *  net.fabricmc.fabric.api.networking.v1.PacketSender
 *  net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents
 *  net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents$Disconnect
 *  net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents$Init
 *  net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents$QueryStart
 *  net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking$LoginQueryResponseHandler
 *  net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl
 *  net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor
 *  org.jspecify.annotations.Nullable
 */
package net.fabricmc.fabric.impl.networking.server;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFutureListener;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.atomic.AtomicReference;
import minecraft.class00381;
import minecraft.class00392;
import minecraft.class00642;
import minecraft.class00667;
import minecraft.class01610;
import minecraft.class01659;
import minecraft.class01894;
import minecraft.class02796;
import minecraft.class03041;
import minecraft.class04155;
import minecraft.class07812;
import minecraft.class07838;
import minecraft.class07847;
import net.fabricmc.fabric.api.networking.v1.LoginPacketSender;
import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.PacketSender;
import net.fabricmc.fabric.api.networking.v1.ServerLoginConnectionEvents;
import net.fabricmc.fabric.api.networking.v1.ServerLoginNetworking;
import net.fabricmc.fabric.impl.networking.AbstractNetworkAddon;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryRequestPayload;
import net.fabricmc.fabric.impl.networking.payload.PacketByteBufLoginQueryResponse;
import net.fabricmc.fabric.impl.networking.server.QueryIdFactory;
import net.fabricmc.fabric.impl.networking.server.ServerNetworkingImpl;
import net.fabricmc.fabric.mixin.networking.accessor.ServerLoginPacketListenerImplAccessor;
import org.jspecify.annotations.Nullable;

public final class ServerLoginNetworkAddon
extends AbstractNetworkAddon<ServerLoginNetworking.LoginQueryResponseHandler>
implements LoginPacketSender {
    private final class00642 connection;
    private final class01610 handler;
    private final class02796 server;
    private final QueryIdFactory queryIdFactory;
    private final Collection<Future<?>> waits = new ConcurrentLinkedQueue();
    private final Map<Integer, class01894> channels = new ConcurrentHashMap<Integer, class01894>();
    private boolean firstQueryTick = true;

    public ServerLoginNetworkAddon(class01610 class016102) {
        super(ServerNetworkingImpl.LOGIN, "ServerLoginNetworkAddon for " + class016102.L());
        this.connection = ((ServerLoginPacketListenerImplAccessor)class016102).getConnection();
        this.handler = class016102;
        this.server = ((ServerLoginPacketListenerImplAccessor)class016102).getServer();
        this.queryIdFactory = QueryIdFactory.create();
    }

    public boolean handle(class07847 class078472) {
        PacketByteBufLoginQueryResponse packetByteBufLoginQueryResponse = (PacketByteBufLoginQueryResponse)class078472.y();
        return this.handle(class078472.N(), packetByteBufLoginQueryResponse == null ? null : packetByteBufLoginQueryResponse.data());
    }

    private boolean handle(int n, @Nullable class00667 class006672) {
        this.logger.debug("Handling inbound login query with id {}", (Object)n);
        class01894 class018942 = this.channels.remove(n);
        if (class018942 == null) {
            this.logger.warn("Query ID {} was received but no query has been associated in {}!", (Object)n, (Object)this.connection);
            return false;
        }
        boolean bl = class006672 != null;
        ServerLoginNetworking.LoginQueryResponseHandler loginQueryResponseHandler = (ServerLoginNetworking.LoginQueryResponseHandler)this.getHandler(class018942);
        if (loginQueryResponseHandler == null) {
            return false;
        }
        class00667 class006673 = bl ? PacketByteBufs.slice((ByteBuf)class006672) : PacketByteBufs.empty();
        try {
            loginQueryResponseHandler.receive(this.server, this.handler, bl, class006673, this.waits::add, (PacketSender)this);
        }
        catch (Throwable throwable) {
            this.logger.error("Encountered exception while handling in channel \"{}\"", (Object)class018942, (Object)throwable);
            throw throwable;
        }
        return true;
    }

    public boolean queryTick() {
        if (this.firstQueryTick) {
            this.sendCompressionPacket();
            ((ServerLoginConnectionEvents.QueryStart)ServerLoginConnectionEvents.QUERY_START.invoker()).onLoginStart(this.handler, this.server, (LoginPacketSender)this, this.waits::add);
            this.firstQueryTick = false;
        }
        AtomicReference atomicReference = new AtomicReference();
        this.waits.removeIf(future -> {
            if (!future.isDone()) {
                return false;
            }
            try {
                future.get();
            }
            catch (ExecutionException executionException) {
                Throwable throwable = executionException.getCause();
                atomicReference.getAndUpdate(throwable2 -> {
                    if (throwable2 == null) {
                        return throwable;
                    }
                    throwable2.addSuppressed(throwable);
                    return throwable2;
                });
            }
            catch (InterruptedException | CancellationException exception) {
                // empty catch block
            }
            return true;
        });
        return this.channels.isEmpty() && this.waits.isEmpty();
    }

    private void sendCompressionPacket() {
        if (this.server.h() >= 0 && !this.connection.method_10756()) {
            this.connection.method_10752((class00381)new class07838(this.server.h()), class03041.N(() -> this.connection.method_10760(this.server.h(), true)));
        }
    }

    public void disconnect(class00392 class003922) {
        Objects.requireNonNull(class003922, "Disconnect reason cannot be null");
        this.connection.method_10747(class003922);
    }

    @Override
    public void invokeDisconnectEvent() {
        ((ServerLoginConnectionEvents.Disconnect)ServerLoginConnectionEvents.DISCONNECT.invoker()).onLoginDisconnect(this.handler, this.server);
    }

    public void registerOutgoingPacket(class07812 class078122) {
        this.channels.put(class078122.N(), class078122.y().comp_1571());
    }

    public class00381<?> createPacket(class01659 class016592) {
        throw new UnsupportedOperationException("Cannot send CustomPayload during login");
    }

    public class00381<?> createPacket(class01894 class018942, class00667 class006672) {
        int n = this.queryIdFactory.nextId();
        return new class07812(n, (class04155)new PacketByteBufLoginQueryRequestPayload(class018942, class006672));
    }

    @Override
    public boolean isReservedChannel(class01894 class018942) {
        return false;
    }

    @Override
    public void invokeInitEvent() {
        ((ServerLoginConnectionEvents.Init)ServerLoginConnectionEvents.INIT.invoker()).onLoginInit(this.handler, this.server);
    }

    @Override
    public void handleUnregistration(class01894 class018942) {
    }

    @Override
    public void handleRegistration(class01894 class018942) {
    }

    public void sendPacket(class00381<?> class003812, ChannelFutureListener channelFutureListener) {
        Objects.requireNonNull(class003812, "Packet cannot be null");
        this.connection.method_10752(class003812, channelFutureListener);
    }
}

