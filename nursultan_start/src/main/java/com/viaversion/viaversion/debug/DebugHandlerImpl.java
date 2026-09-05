/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.debug.DebugHandler
 *  com.viaversion.viaversion.api.protocol.packet.Direction
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 */
package com.viaversion.viaversion.debug;

import com.viaversion.viaversion.api.debug.DebugHandler;
import com.viaversion.viaversion.api.protocol.packet.Direction;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import java.util.HashSet;
import java.util.Set;

public final class DebugHandlerImpl
implements DebugHandler {
    private final Set<String> packetTypesToLog = new HashSet<String>();
    private final Set<PacketType> clientboundPacketsToLog = new HashSet<PacketType>();
    private final Set<PacketType> serverboundPacketsToLog = new HashSet<PacketType>();
    private boolean logPrePacketTransform = true;
    private boolean logPostPacketTransform;
    private boolean enabled;

    public boolean shouldLog(PacketWrapper wrapper, Direction direction) {
        Set<PacketType> packetTypes;
        if (this.packetTypesToLog.isEmpty() && this.serverboundPacketsToLog.isEmpty() && this.clientboundPacketsToLog.isEmpty()) {
            return true;
        }
        Set<PacketType> set = packetTypes = direction == Direction.SERVERBOUND ? this.serverboundPacketsToLog : this.clientboundPacketsToLog;
        if (wrapper.getPacketType() != null) {
            return this.packetTypesToLog.contains(wrapper.getPacketType().getName()) || packetTypes.contains(wrapper.getPacketType());
        }
        State state = wrapper.user().getProtocolInfo().getState(direction);
        for (PacketType packetType : packetTypes) {
            if (packetType.getId() != wrapper.getId() || packetType.state() != state) continue;
            return true;
        }
        return false;
    }

    public boolean enabled() {
        return this.enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean removePacketTypeToLog(PacketType packetType) {
        return (packetType.direction() == Direction.SERVERBOUND ? this.serverboundPacketsToLog : this.clientboundPacketsToLog).remove(packetType);
    }

    public void addPacketTypeToLog(PacketType packetType) {
        (packetType.direction() == Direction.SERVERBOUND ? this.serverboundPacketsToLog : this.clientboundPacketsToLog).add(packetType);
    }

    public boolean logPostPacketTransform() {
        return this.logPostPacketTransform;
    }

    public boolean logPrePacketTransform() {
        return this.logPrePacketTransform;
    }

    public void setLogPostPacketTransform(boolean logPostPacketTransform) {
        this.logPostPacketTransform = logPostPacketTransform;
    }

    public void clearPacketTypesToLog() {
        this.packetTypesToLog.clear();
        this.serverboundPacketsToLog.clear();
        this.clientboundPacketsToLog.clear();
    }

    public void setLogPrePacketTransform(boolean logPrePacketTransform) {
        this.logPrePacketTransform = logPrePacketTransform;
    }

    public void addPacketTypeNameToLog(String packetTypeName) {
        this.packetTypesToLog.add(packetTypeName);
    }

    public boolean removePacketTypeNameToLog(String packetTypeName) {
        return this.packetTypesToLog.remove(packetTypeName);
    }
}

