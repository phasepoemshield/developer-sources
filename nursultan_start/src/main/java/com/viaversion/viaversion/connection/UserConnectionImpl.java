/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.cache.CacheBuilder
 *  com.viaversion.viafabricplus.protocoltranslator.util.NoPacketSendChannel
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.StorableObject
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.platform.ViaInjector
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketTracker
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.api.type.types.VarIntType
 *  com.viaversion.viaversion.connection.ProtocolInfoImpl
 *  com.viaversion.viaversion.exception.CancelException
 *  com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap
 *  com.viaversion.viaversion.protocol.packet.PacketWrapperImpl
 *  com.viaversion.viaversion.util.ChatColorUtil
 *  com.viaversion.viaversion.util.PipelineUtil
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.channel.ChannelHandlerContext
 *  io.netty.channel.ChannelPipeline
 *  io.netty.handler.codec.CodecException
 *  org.checkerframework.checker.nullness.qual.Nullable
 *  org.spongepowered.asm.mixin.injection.callback.CallbackInfo
 */
package com.viaversion.viaversion.connection;

import com.google.common.cache.CacheBuilder;
import com.viaversion.viafabricplus.protocoltranslator.util.NoPacketSendChannel;
import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.platform.ViaInjector;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketTracker;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.VarIntType;
import com.viaversion.viaversion.connection.ProtocolInfoImpl;
import com.viaversion.viaversion.exception.CancelException;
import com.viaversion.viaversion.exception.InformativeException;
import com.viaversion.viaversion.libs.fastutil.objects.Reference2ObjectOpenHashMap;
import com.viaversion.viaversion.protocol.packet.PacketWrapperImpl;
import com.viaversion.viaversion.util.ChatColorUtil;
import com.viaversion.viaversion.util.PipelineUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelPipeline;
import io.netty.handler.codec.CodecException;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

public class UserConnectionImpl
implements UserConnection {
    private static final int PASSTHROUGH_DATA_BYTES = 18;
    private static final AtomicLong IDS = new AtomicLong();
    private final long id = IDS.incrementAndGet();
    private final Map<Class<?>, StorableObject> storedObjects = new ConcurrentHashMap();
    private final Map<Class<? extends Protocol>, EntityTracker> entityTrackers = new Reference2ObjectOpenHashMap();
    private final Map<Class<? extends Protocol>, ItemHasher> itemHashers = new Reference2ObjectOpenHashMap();
    private final Map<Class<? extends Protocol>, ClientWorld> clientWorlds = new Reference2ObjectOpenHashMap();
    private final PacketTracker packetTracker = new PacketTracker((UserConnection)this);
    private final Set<UUID> passthroughTokens = Collections.newSetFromMap(CacheBuilder.newBuilder().expireAfterWrite(10L, TimeUnit.SECONDS).build().asMap());
    private final ProtocolInfo protocolInfo = new ProtocolInfoImpl();
    private final Channel channel;
    private final boolean clientSide;
    private boolean active = true;
    private boolean pendingDisconnect;

    public boolean has(Class<? extends StorableObject> clazz) {
        return this.storedObjects.containsKey(clazz);
    }

    public UserConnectionImpl(@Nullable Channel channel) {
        this(channel, false);
    }

    public UserConnectionImpl(@Nullable Channel channel, boolean bl) {
        this.channel = channel;
        this.clientSide = bl;
    }

    public <T extends StorableObject> @Nullable T remove(Class<T> clazz) {
        StorableObject storableObject = this.storedObjects.remove(clazz);
        if (storableObject != null) {
            storableObject.onRemove();
        }
        return (T)storableObject;
    }

    public <T extends StorableObject> @Nullable T get(Class<T> clazz) {
        return (T)this.storedObjects.get(clazz);
    }

    public void put(StorableObject storableObject) {
        StorableObject storableObject2 = this.storedObjects.put(storableObject.getClass(), storableObject);
        if (storableObject2 != null) {
            storableObject2.onRemove();
        }
    }

    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        UserConnectionImpl userConnectionImpl = (UserConnectionImpl)object;
        return this.id == userConnectionImpl.id;
    }

    public int hashCode() {
        return Long.hashCode(this.id);
    }

    private void transform(ByteBuf byteBuf, Direction direction, Function<Throwable, CodecException> function) throws InformativeException, CodecException {
        if (!byteBuf.isReadable()) {
            return;
        }
        int n = Types.VAR_INT.readPrimitive(byteBuf);
        if (n == 1000) {
            if (!this.passthroughTokens.remove(Types.UUID.read(byteBuf))) {
                throw new IllegalArgumentException("Invalid token");
            }
            return;
        }
        int n2 = byteBuf.readerIndex();
        PacketWrapperImpl packetWrapperImpl = new PacketWrapperImpl(n, byteBuf, (UserConnection)this);
        try {
            this.protocolInfo.getPipeline().transform(direction, this.protocolInfo.getState(direction), (PacketWrapper)packetWrapperImpl);
        }
        catch (CancelException cancelException) {
            throw function.apply(cancelException);
        }
        this.writeToBuffer(packetWrapperImpl, byteBuf, n, n2);
    }

    public long getId() {
        return this.id;
    }

    public boolean isActive() {
        return this.active;
    }

    public @Nullable Channel getChannel() {
        return this.channel;
    }

    private void handler$dag000$viafabricplus$handleNoPacketSendChannel(ByteBuf byteBuf, boolean bl, CallbackInfo callbackInfo) {
        if (this.channel instanceof NoPacketSendChannel) {
            callbackInfo.cancel();
        }
    }

    private void sendRawPacket(ByteBuf byteBuf, boolean bl) {
        CallbackInfo callbackInfo = new CallbackInfo("", true);
        this.handler$dag000$viafabricplus$handleNoPacketSendChannel(byteBuf, bl, callbackInfo);
        if (callbackInfo.isCancelled()) {
            return;
        }
        if (bl) {
            this.sendRawPacketNow(byteBuf);
        } else {
            try {
                this.channel.eventLoop().execute(() -> this.sendRawPacketNow(byteBuf));
            }
            catch (Throwable throwable) {
                byteBuf.release();
                throwable.printStackTrace();
            }
        }
    }

    public void sendRawPacket(ByteBuf byteBuf) {
        this.sendRawPacket(byteBuf, true);
    }

    public <T extends ItemHasher> @Nullable T getItemHasher(Class<? extends Protocol> clazz) {
        return (T)this.itemHashers.get(clazz);
    }

    public Map<Class<?>, StorableObject> getStoredObjects() {
        return this.storedObjects;
    }

    public boolean isClientSide() {
        return this.clientSide;
    }

    public void clearStoredObjects() {
        for (StorableObject storableObject : this.storedObjects.values()) {
            storableObject.onRemove();
        }
        this.storedObjects.clear();
        this.entityTrackers.clear();
        this.itemHashers.clear();
        this.clientWorlds.clear();
    }

    public void addClientWorld(Class<? extends Protocol> clazz, ClientWorld clientWorld) {
        this.clientWorlds.putIfAbsent(clazz, clientWorld);
    }

    public <T extends EntityTracker> @Nullable T getEntityTracker(Class<? extends Protocol> clazz) {
        return (T)this.entityTrackers.get(clazz);
    }

    public PacketTracker getPacketTracker() {
        return this.packetTracker;
    }

    public Collection<EntityTracker> getEntityTrackers() {
        return this.entityTrackers.values();
    }

    public <T extends ClientWorld> @Nullable T getClientWorld(Class<? extends Protocol> clazz) {
        return (T)this.clientWorlds.get(clazz);
    }

    private void sendRawPacketToServerClientSide(ByteBuf byteBuf, boolean bl) {
        if (bl) {
            this.writeAndFlush(byteBuf);
        } else {
            try {
                this.getChannel().eventLoop().execute(() -> this.writeAndFlush(byteBuf));
            }
            catch (Throwable throwable) {
                throwable.printStackTrace();
                byteBuf.release();
            }
        }
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void sendRawPacketToServerServerSide(ByteBuf byteBuf, boolean bl) {
        block7: {
            int n = this.active ? byteBuf.readableBytes() + 18 : byteBuf.readableBytes();
            ByteBuf byteBuf2 = byteBuf.alloc().buffer(n);
            try {
                ChannelHandlerContext channelHandlerContext = PipelineUtil.getPreviousContext((String)Via.getManager().getInjector().getDecoderName(), (ChannelPipeline)this.channel.pipeline());
                if (this.shouldTransformPacket()) {
                    Types.VAR_INT.writePrimitive(byteBuf2, 1000);
                    Types.UUID.write(byteBuf2, (Object)this.generatePassthroughToken());
                }
                byteBuf2.writeBytes(byteBuf);
                if (bl) {
                    this.fireChannelRead(channelHandlerContext, byteBuf2);
                    break block7;
                }
                try {
                    this.channel.eventLoop().execute(() -> this.fireChannelRead(channelHandlerContext, byteBuf2));
                }
                catch (Throwable throwable) {
                    byteBuf2.release();
                    throw throwable;
                }
            }
            finally {
                byteBuf.release();
            }
        }
    }

    public ProtocolInfo getProtocolInfo() {
        return this.protocolInfo;
    }

    public void addEntityTracker(Class<? extends Protocol> clazz, EntityTracker entityTracker) {
        this.entityTrackers.putIfAbsent(clazz, entityTracker);
    }

    public void addItemHasher(Class<? extends Protocol> clazz, ItemHasher itemHasher) {
        this.itemHashers.putIfAbsent(clazz, itemHasher);
    }

    /*
     * WARNING - Removed try catching itself - possible behaviour change.
     */
    private void writeToBuffer(PacketWrapperImpl packetWrapperImpl, ByteBuf byteBuf, int n, int n2) {
        int n3 = byteBuf.readableBytes();
        if (byteBuf.readerIndex() == n2 && packetWrapperImpl.areStoredPacketValuesEmpty()) {
            if (packetWrapperImpl.getId() == n) {
                byteBuf.setIndex(0, n2 + n3);
                return;
            }
            if (VarIntType.varIntLength((int)packetWrapperImpl.getId()) == VarIntType.varIntLength((int)n)) {
                byteBuf.setIndex(0, 0);
                Types.VAR_INT.writePrimitive(byteBuf, packetWrapperImpl.getId());
                byteBuf.writerIndex(n2 + n3);
                return;
            }
        }
        ByteBuf byteBuf2 = byteBuf.alloc().buffer(n3, n3);
        try {
            byteBuf2.writeBytes(byteBuf, n3);
            byteBuf.setIndex(0, 0);
            packetWrapperImpl.writeProcessedValues(byteBuf);
            byteBuf.writeBytes(byteBuf2);
        }
        finally {
            byteBuf2.release();
        }
    }

    private void fireChannelRead(@Nullable ChannelHandlerContext channelHandlerContext, ByteBuf byteBuf) {
        if (channelHandlerContext != null) {
            channelHandlerContext.fireChannelRead((Object)byteBuf);
        } else {
            this.channel.pipeline().fireChannelRead((Object)byteBuf);
        }
    }

    public void disconnect(String string) {
        if (!this.channel.isOpen() || this.pendingDisconnect) {
            return;
        }
        this.pendingDisconnect = true;
        if (this.isServerSide()) {
            Via.getPlatform().runSync(() -> {
                if (!Via.getPlatform().kickPlayer((UserConnection)this, ChatColorUtil.translateAlternateColorCodes((String)string))) {
                    this.channel.close();
                }
            });
        } else {
            this.channel.close();
        }
    }

    private void sendRawPacketNow(ByteBuf byteBuf) {
        ChannelPipeline channelPipeline = this.getChannel().pipeline();
        ViaInjector viaInjector = Via.getManager().getInjector();
        if (this.clientSide) {
            channelPipeline.context(viaInjector.getDecoderName()).fireChannelRead((Object)byteBuf);
        } else {
            channelPipeline.context(viaInjector.getEncoderName()).writeAndFlush((Object)byteBuf);
        }
    }

    public void setPendingDisconnect(boolean bl) {
        this.pendingDisconnect = bl;
    }

    public boolean isPendingDisconnect() {
        return this.pendingDisconnect;
    }

    public boolean shouldTransformPacket() {
        return this.active;
    }

    public boolean checkServerboundPacket(int n) {
        if (this.pendingDisconnect) {
            return false;
        }
        if (!this.packetTracker.isPacketLimiterEnabled()) {
            return true;
        }
        this.packetTracker.incrementReceived(n);
        return !this.packetTracker.exceedsLimits();
    }

    public void scheduleSendRawPacket(ByteBuf byteBuf) {
        this.sendRawPacket(byteBuf, false);
    }

    public UUID generatePassthroughToken() {
        UUID uUID = UUID.randomUUID();
        this.passthroughTokens.add(uUID);
        return uUID;
    }

    public void transformServerbound(ByteBuf byteBuf, Function<Throwable, CodecException> function) throws InformativeException, CodecException {
        this.transform(byteBuf, Direction.SERVERBOUND, function);
    }

    public ChannelFuture sendRawPacketFuture(ByteBuf byteBuf) {
        if (this.clientSide) {
            this.getChannel().pipeline().context(Via.getManager().getInjector().getDecoderName()).fireChannelRead((Object)byteBuf);
            return this.getChannel().newSucceededFuture();
        }
        return this.channel.pipeline().context(Via.getManager().getInjector().getEncoderName()).writeAndFlush((Object)byteBuf);
    }

    public void sendRawPacketToServer(ByteBuf byteBuf) {
        if (this.clientSide) {
            this.sendRawPacketToServerClientSide(byteBuf, true);
        } else {
            this.sendRawPacketToServerServerSide(byteBuf, true);
        }
    }

    public void transformClientbound(ByteBuf byteBuf, Function<Throwable, CodecException> function) throws InformativeException, CodecException {
        this.transform(byteBuf, Direction.CLIENTBOUND, function);
    }

    public boolean checkClientboundPacket() {
        this.packetTracker.incrementSent();
        return true;
    }

    private void writeAndFlush(ByteBuf byteBuf) {
        this.getChannel().pipeline().context(Via.getManager().getInjector().getEncoderName()).writeAndFlush((Object)byteBuf);
    }

    public void setActive(boolean bl) {
        this.active = bl;
    }

    public void scheduleSendRawPacketToServer(ByteBuf byteBuf) {
        if (this.clientSide) {
            this.sendRawPacketToServerClientSide(byteBuf, false);
        } else {
            this.sendRawPacketToServerServerSide(byteBuf, false);
        }
    }
}

