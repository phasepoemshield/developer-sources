/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.exception.CancelException
 *  com.viaversion.viaversion.exception.InformativeException
 *  io.netty.buffer.ByteBuf
 *  io.netty.channel.ChannelFuture
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.protocol.packet;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.exception.CancelException;
import com.viaversion.viaversion.exception.InformativeException;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelFuture;
import java.util.List;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface PacketWrapper {
    public static final int PASSTHROUGH_ID = 1000;

    public PacketWrapper create(int var1, PacketHandler var2) throws InformativeException;

    public PacketWrapper create(int var1);

    public PacketWrapper create(PacketType var1, PacketHandler var2) throws InformativeException;

    public PacketWrapper create(PacketType var1);

    public static PacketWrapper create(@Nullable PacketType packetType, UserConnection connection) {
        return PacketWrapper.create(packetType, null, connection);
    }

    public static PacketWrapper create(@Nullable PacketType packetType, @Nullable ByteBuf inputBuffer, UserConnection connection) {
        return Via.getManager().getProtocolManager().createPacketWrapper(packetType, inputBuffer, connection);
    }

    @Deprecated
    public static PacketWrapper create(int packetId, @Nullable ByteBuf inputBuffer, UserConnection connection) {
        return Via.getManager().getProtocolManager().createPacketWrapper(packetId, inputBuffer, connection);
    }

    @Deprecated
    public void setId(int var1);

    public boolean isCancelled();

    public <T> T get(Type<T> var1, int var2) throws InformativeException;

    public void apply(Direction var1, State var2, List<Protocol> var3) throws InformativeException, CancelException;

    public <T> void set(Type<T> var1, int var2, @Nullable T var3) throws InformativeException;

    public <T> void write(Type<T> var1, @Nullable T var2);

    public <T> T read(Type<T> var1) throws InformativeException;

    public int getId();

    default public void cancel() {
        this.setCancelled(true);
    }

    @Deprecated
    public boolean is(Type var1, int var2);

    public boolean isReadable(Type var1, int var2);

    public UserConnection user();

    public void scheduleSendToServerRaw() throws InformativeException;

    public void setCancelled(boolean var1);

    public void passthroughAll() throws InformativeException;

    public void sendToServer(Class<? extends Protocol> var1, boolean var2) throws InformativeException;

    default public void sendToServer(Class<? extends Protocol> protocol) throws InformativeException {
        this.sendToServer(protocol, true);
    }

    public void clearInputBuffer();

    public ChannelFuture sendFutureRaw() throws InformativeException;

    public void scheduleSendRaw() throws InformativeException;

    public void clearPacket();

    default public void scheduleSend(Class<? extends Protocol> protocol) throws InformativeException {
        this.scheduleSend(protocol, true);
    }

    public void scheduleSend(Class<? extends Protocol> var1, boolean var2) throws InformativeException;

    public void resetReader();

    public <T> T passthroughAndMap(Type<?> var1, Type<T> var2) throws InformativeException;

    public @Nullable PacketType getPacketType();

    public void writeToBuffer(ByteBuf var1) throws InformativeException;

    default public void send(Class<? extends Protocol> protocol) throws InformativeException {
        this.send(protocol, true);
    }

    public void send(Class<? extends Protocol> var1, boolean var2) throws InformativeException;

    public void setPacketType(@Nullable PacketType var1);

    public void rewindReader(int var1);

    public void sendToServerRaw() throws InformativeException;

    public void consumeReadsOnly(Runnable var1);

    public <T> T passthrough(Type<T> var1) throws InformativeException;

    public void scheduleSendToServer(Class<? extends Protocol> var1, boolean var2) throws InformativeException;

    default public void scheduleSendToServer(Class<? extends Protocol> protocol) throws InformativeException {
        this.scheduleSendToServer(protocol, true);
    }

    public ChannelFuture sendFuture(Class<? extends Protocol> var1) throws InformativeException;

    public void sendRaw() throws InformativeException;
}

