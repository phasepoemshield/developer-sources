/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.vialegacy.api.splitter;

import com.viaversion.viaversion.api.connection.UserConnection;
import io.netty.buffer.ByteBuf;
import java.util.function.BiConsumer;

public interface PreNettyPacketType {
    public BiConsumer<UserConnection, ByteBuf> getPacketReader();
}

