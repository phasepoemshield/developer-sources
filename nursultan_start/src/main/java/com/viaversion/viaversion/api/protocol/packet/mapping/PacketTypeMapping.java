/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.protocol.packet.mapping;

import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.mapping.PacketMapping;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import org.checkerframework.checker.nullness.qual.Nullable;

final class PacketTypeMapping
implements PacketMapping {
    private final PacketType mappedPacketType;
    private PacketHandler handler;

    @Override
    public void setHandler(@Nullable PacketHandler handler) {
        this.handler = handler;
    }

    PacketTypeMapping(@Nullable PacketType mappedPacketType, @Nullable PacketHandler handler) {
        this.mappedPacketType = mappedPacketType;
        this.handler = handler;
    }

    @Override
    public @Nullable PacketHandler handler() {
        return this.handler;
    }

    @Override
    public void appendHandler(PacketHandler handler) {
        this.handler = this.handler == null ? handler : this.handler.then(handler);
    }

    @Override
    public void applyType(PacketWrapper wrapper) {
        if (this.mappedPacketType != null) {
            wrapper.setPacketType(this.mappedPacketType);
        }
    }
}

