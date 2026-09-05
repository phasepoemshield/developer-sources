/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypeMap
 *  com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider
 */
package com.viaversion.viaversion.protocols.base.packet;

import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypeMap;
import com.viaversion.viaversion.api.protocol.packet.provider.PacketTypesProvider;
import com.viaversion.viaversion.protocols.base.ClientboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ClientboundStatusPackets;
import com.viaversion.viaversion.protocols.base.ServerboundHandshakePackets;
import com.viaversion.viaversion.protocols.base.ServerboundLoginPackets;
import com.viaversion.viaversion.protocols.base.ServerboundStatusPackets;
import com.viaversion.viaversion.protocols.base.packet.BaseClientboundPacket;
import com.viaversion.viaversion.protocols.base.packet.BaseServerboundPacket;
import java.util.EnumMap;
import java.util.Map;

public final class BasePacketTypesProvider
implements PacketTypesProvider<BaseClientboundPacket, BaseClientboundPacket, BaseServerboundPacket, BaseServerboundPacket> {
    public static final PacketTypesProvider<BaseClientboundPacket, BaseClientboundPacket, BaseServerboundPacket, BaseServerboundPacket> INSTANCE = new BasePacketTypesProvider();
    private final Map<State, PacketTypeMap<BaseClientboundPacket>> clientboundPacketTypes = new EnumMap<State, PacketTypeMap<BaseClientboundPacket>>(State.class);
    private final Map<State, PacketTypeMap<BaseServerboundPacket>> serverboundPacketTypes = new EnumMap<State, PacketTypeMap<BaseServerboundPacket>>(State.class);

    private BasePacketTypesProvider() {
        this.clientboundPacketTypes.put(State.STATUS, (PacketTypeMap<BaseClientboundPacket>)PacketTypeMap.of(ClientboundStatusPackets.class));
        this.clientboundPacketTypes.put(State.LOGIN, (PacketTypeMap<BaseClientboundPacket>)PacketTypeMap.of(ClientboundLoginPackets.class));
        this.serverboundPacketTypes.put(State.STATUS, (PacketTypeMap<BaseServerboundPacket>)PacketTypeMap.of(ServerboundStatusPackets.class));
        this.serverboundPacketTypes.put(State.HANDSHAKE, (PacketTypeMap<BaseServerboundPacket>)PacketTypeMap.of(ServerboundHandshakePackets.class));
        this.serverboundPacketTypes.put(State.LOGIN, (PacketTypeMap<BaseServerboundPacket>)PacketTypeMap.of(ServerboundLoginPackets.class));
    }

    public Map<State, PacketTypeMap<BaseClientboundPacket>> unmappedClientboundPacketTypes() {
        return this.clientboundPacketTypes;
    }

    public Map<State, PacketTypeMap<BaseServerboundPacket>> unmappedServerboundPacketTypes() {
        return this.serverboundPacketTypes;
    }

    public Map<State, PacketTypeMap<BaseClientboundPacket>> mappedClientboundPacketTypes() {
        return this.unmappedClientboundPacketTypes();
    }

    public Map<State, PacketTypeMap<BaseServerboundPacket>> mappedServerboundPacketTypes() {
        return this.unmappedServerboundPacketTypes();
    }
}

