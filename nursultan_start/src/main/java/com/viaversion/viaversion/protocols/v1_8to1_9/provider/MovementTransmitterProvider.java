/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.Via
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.platform.providers.Provider
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.protocol.packet.State
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_8to1_9.storage.MovementTracker
 */
package com.viaversion.viaversion.protocols.v1_8to1_9.provider;

import com.viaversion.viaversion.api.Via;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.platform.providers.Provider;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.protocol.packet.State;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_8to1_9.Protocol1_8To1_9;
import com.viaversion.viaversion.protocols.v1_8to1_9.packet.ServerboundPackets1_8;
import com.viaversion.viaversion.protocols.v1_8to1_9.storage.MovementTracker;
import java.util.logging.Level;

public class MovementTransmitterProvider
implements Provider {
    public void sendPlayer(UserConnection userConnection) {
        userConnection.getChannel().eventLoop().execute(() -> {
            if (userConnection.getProtocolInfo().getClientState() != State.PLAY || !userConnection.getEntityTracker(Protocol1_8To1_9.class).hasClientEntityId()) {
                return;
            }
            MovementTracker movementTracker = (MovementTracker)userConnection.get(MovementTracker.class);
            movementTracker.incrementIdlePacket();
            try {
                PacketWrapper playerMovement = PacketWrapper.create((PacketType)ServerboundPackets1_8.MOVE_PLAYER_STATUS_ONLY, (UserConnection)userConnection);
                playerMovement.write((Type)Types.BOOLEAN, (Object)movementTracker.isGround());
                playerMovement.sendToServer(Protocol1_8To1_9.class);
            }
            catch (Throwable e) {
                Via.getPlatform().getLogger().log(Level.WARNING, "Failed to send player movement packet", e);
            }
        });
    }
}

