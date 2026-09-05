/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.ViaBackwards
 *  com.viaversion.viaversion.api.connection.ProtocolInfo
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.data.entity.EntityTracker
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.connection.StorableObjectTask
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ClientVehicleStorage
 */
package com.viaversion.viabackwards.protocol.v1_21_2to1_21.task;

import com.viaversion.viabackwards.ViaBackwards;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.PlayerStorage;
import com.viaversion.viaversion.api.connection.ProtocolInfo;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.data.entity.EntityTracker;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.connection.StorableObjectTask;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.storage.ClientVehicleStorage;
import java.util.logging.Level;

public final class PlayerPacketsTickTask
extends StorableObjectTask<PlayerStorage> {
    public PlayerPacketsTickTask() {
        super(PlayerStorage.class);
    }

    public void run(UserConnection connection, PlayerStorage storableObject) {
        ProtocolInfo protocolInfo = connection.getProtocolInfo();
        if (protocolInfo.getClientState() != State.PLAY || protocolInfo.getServerState() != State.PLAY) {
            return;
        }
        EntityTracker entityTracker = connection.getEntityTracker(Protocol1_21_2To1_21.class);
        if (!entityTracker.hasClientEntityId()) {
            return;
        }
        try {
            if (!connection.has(ClientVehicleStorage.class)) {
                storableObject.tick(connection);
            }
        }
        catch (Throwable t) {
            ViaBackwards.getPlatform().getLogger().log(Level.SEVERE, "Error while sending player input packet.", t);
        }
        try {
            PacketWrapper clientTickEndPacket = PacketWrapper.create((PacketType)ServerboundPackets1_21_2.CLIENT_TICK_END, (UserConnection)connection);
            clientTickEndPacket.sendToServer(Protocol1_21_2To1_21.class);
        }
        catch (Throwable t) {
            ViaBackwards.getPlatform().getLogger().log(Level.SEVERE, "Error while sending client tick end packet.", t);
        }
    }
}

