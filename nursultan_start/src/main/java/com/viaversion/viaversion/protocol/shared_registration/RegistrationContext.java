/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Preconditions
 *  com.viaversion.viaversion.api.protocol.AbstractProtocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.protocol.remapper.PacketHandler
 *  com.viaversion.viaversion.api.protocol.version.ProtocolVersion
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocol.shared_registration;

import com.google.common.base.Preconditions;
import com.viaversion.viaversion.api.protocol.AbstractProtocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.protocol.remapper.PacketHandler;
import com.viaversion.viaversion.api.protocol.version.ProtocolVersion;
import com.viaversion.viaversion.protocol.shared_registration.PacketBound;
import java.util.function.Consumer;
import org.checkerframework.checker.nullness.qual.Nullable;

public record RegistrationContext<CU extends ClientboundPacketType, SU extends ServerboundPacketType>(AbstractProtocol<CU, ?, ?, SU> protocol, ProtocolVersion min, @Nullable ProtocolVersion max) {
    public <P extends AbstractProtocol<CU, ?, ?, SU>> P protocol(Class<P> protocolClass) {
        return (P)this.protocol;
    }

    public SU serverboundPacketType(ServerboundPacketType genericPacketType) {
        ServerboundPacketType type = this.protocol.getPacketTypesProvider().unmappedServerboundType(genericPacketType.state(), genericPacketType.getName());
        if (type == null) {
            throw new IllegalArgumentException("Could not find serverbound packet type for " + String.valueOf(genericPacketType.state()) + " " + genericPacketType.getName());
        }
        return (SU)type;
    }

    public CU clientboundPacketType(ClientboundPacketType genericPacketType) {
        ClientboundPacketType type = this.protocol.getPacketTypesProvider().unmappedClientboundType(genericPacketType.state(), genericPacketType.getName());
        if (type == null) {
            throw new IllegalArgumentException("Could not find clientbound packet type for " + String.valueOf(genericPacketType.state()) + " " + genericPacketType.getName() + " in " + this.protocol.getClass().getSimpleName());
        }
        return (CU)type;
    }

    public void clientbound(ClientboundPacketType type, Consumer<CU> action, PacketBound ... markers) {
        if (!this.shouldSkip(markers)) {
            action.accept(this.clientboundPacketType(type));
        }
    }

    public void clientbound(ClientboundPacketType type, Consumer<CU> action) {
        action.accept(this.clientboundPacketType(type));
    }

    public void serverbound(ServerboundPacketType type, Consumer<SU> action, PacketBound ... markers) {
        if (!this.shouldSkip(markers)) {
            action.accept(this.serverboundPacketType(type));
        }
    }

    public void serverbound(ServerboundPacketType type, Consumer<SU> action) {
        action.accept(this.serverboundPacketType(type));
    }

    public void clientboundHandler(ClientboundPacketType type, PacketHandler handler) {
        this.protocol.registerClientbound(this.clientboundPacketType(type), handler);
    }

    public void clientboundHandler(ClientboundPacketType type, PacketHandler handler, PacketBound ... markers) {
        if (!this.shouldSkip(markers)) {
            this.protocol.registerClientbound(this.clientboundPacketType(type), handler);
        }
    }

    public void serverboundHandler(ServerboundPacketType type, PacketHandler handler) {
        this.protocol.registerServerbound(this.serverboundPacketType(type), handler);
    }

    public void serverboundHandler(ServerboundPacketType type, PacketHandler handler, PacketBound ... markers) {
        if (!this.shouldSkip(markers)) {
            this.protocol.registerServerbound(this.serverboundPacketType(type), handler);
        }
    }

    public <P extends AbstractProtocol<CU, ?, ?, SU>> P castProtocol() {
        return (P)this.protocol;
    }

    private boolean shouldSkip(PacketBound ... markers) {
        ProtocolVersion clientVersion;
        if (markers.length == 0) {
            return false;
        }
        ProtocolVersion serverVersion = this.protocol.getServerVersion();
        ProtocolVersion lowerVersion = serverVersion.olderThan(clientVersion = this.protocol.getClientVersion()) ? serverVersion : clientVersion;
        ProtocolVersion higherVersion = serverVersion.newerThan(clientVersion) ? serverVersion : clientVersion;
        block4: for (PacketBound marker : markers) {
            switch (marker) {
                case ADDED_AT_MIN: {
                    if (!lowerVersion.olderThan(this.min)) continue block4;
                    return true;
                }
                case REMOVED_AT_MAX: {
                    Preconditions.checkArgument((this.max != null ? 1 : 0) != 0, (Object)"Cannot use REMOVED_AT_MAX in an open-ended range");
                    if (!higherVersion.newerThanOrEqualTo(this.max)) continue block4;
                    return true;
                }
            }
        }
        return false;
    }
}

