/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.data.item.ItemHasher
 *  com.viaversion.viaversion.api.minecraft.ClientWorld
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.PacketTracker
 *  com.viaversion.viaversion.exception.InformativeException
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.Channel
 *  io.netty.channel.ChannelFuture
 *  io.netty.handler.codec.CodecException
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.connection;

import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.StorableObject;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.data.item.ItemHasher;
import com.viaversion.viaversion.api.minecraft.ClientWorld;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.PacketTracker;
import com.viaversion.viaversion.exception.InformativeException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.Channel;
import io.netty.channel.ChannelFuture;
import io.netty.handler.codec.CodecException;
import java.util.Collection;
import java.util.Map;
import java.util.UUID;
import java.util.function.Function;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface UserConnection {
    public boolean has(Class<? extends StorableObject> var1);

    public <T extends StorableObject> @Nullable T remove(Class<T> var1);

    public <T extends StorableObject> @Nullable T get(Class<T> var1);

    public void put(StorableObject var1);

    public long getId();

    public boolean isActive();

    public @Nullable Channel getChannel();

    public void sendRawPacket(ByteBuf var1);

    default public boolean isServerSide() {
        return !this.isClientSide();
    }

    public <T extends ItemHasher> @Nullable T getItemHasher(Class<? extends Protocol> var1);

    public Map<Class<?>, StorableObject> getStoredObjects();

    public boolean isClientSide();

    default public void transformOutgoing(ByteBuf buf, Function<Throwable, CodecException> cancelSupplier) throws InformativeException {
        if (this.isClientSide()) {
            this.transformServerbound(buf, cancelSupplier);
        } else {
            this.transformClientbound(buf, cancelSupplier);
        }
    }

    public void clearStoredObjects();

    public void addClientWorld(Class<? extends Protocol> var1, ClientWorld var2);

    public <T extends EntityTracker> @Nullable T getEntityTracker(Class<? extends Protocol> var1);

    public PacketTracker getPacketTracker();

    public Collection<EntityTracker> getEntityTrackers();

    public <T extends ClientWorld> @Nullable T getClientWorld(Class<? extends Protocol> var1);

    default public void transformIncoming(ByteBuf buf, Function<Throwable, CodecException> cancelSupplier) throws InformativeException {
        if (this.isClientSide()) {
            this.transformClientbound(buf, cancelSupplier);
        } else {
            this.transformServerbound(buf, cancelSupplier);
        }
    }

    public ProtocolInfo getProtocolInfo();

    public void addEntityTracker(Class<? extends Protocol> var1, EntityTracker var2);

    public void addItemHasher(Class<? extends Protocol> var1, ItemHasher var2);

    public void disconnect(String var1);

    public void setPendingDisconnect(boolean var1);

    public boolean isPendingDisconnect();

    public boolean shouldTransformPacket();

    default public boolean checkOutgoingPacket() {
        return this.isClientSide() ? this.checkServerboundPacket() : this.checkClientboundPacket();
    }

    public boolean checkServerboundPacket(int var1);

    @Deprecated(forRemoval=true)
    default public boolean checkServerboundPacket() {
        return this.checkServerboundPacket(0);
    }

    public void scheduleSendRawPacket(ByteBuf var1);

    public UUID generatePassthroughToken();

    public void transformServerbound(ByteBuf var1, Function<Throwable, CodecException> var2) throws InformativeException;

    public ChannelFuture sendRawPacketFuture(ByteBuf var1);

    public void sendRawPacketToServer(ByteBuf var1);

    default public boolean shouldApplyBlockProtocol() {
        return this.isServerSide();
    }

    @Deprecated(forRemoval=true)
    default public boolean checkIncomingPacket() {
        return this.isClientSide() ? this.checkClientboundPacket() : this.checkServerboundPacket();
    }

    default public boolean checkIncomingPacket(int bytes) {
        return this.isClientSide() ? this.checkClientboundPacket() : this.checkServerboundPacket(bytes);
    }

    public void transformClientbound(ByteBuf var1, Function<Throwable, CodecException> var2) throws InformativeException;

    public boolean checkClientboundPacket();

    public void setActive(boolean var1);

    public void scheduleSendRawPacketToServer(ByteBuf var1);
}

