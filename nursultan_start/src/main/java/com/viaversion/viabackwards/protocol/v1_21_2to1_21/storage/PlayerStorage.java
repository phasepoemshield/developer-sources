/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.entities.storage.PlayerPositionStorage
 *  com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.PlayerStorage$PlayerInput
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.protocol.packet.PacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2
 */
package com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage;

import com.viaversion.viabackwards.api.entities.storage.PlayerPositionStorage;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.Protocol1_21_2To1_21;
import com.viaversion.viabackwards.protocol.v1_21_2to1_21.storage.PlayerStorage;
import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.protocol.packet.PacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ServerboundPackets1_21_2;

public final class PlayerStorage
extends PlayerPositionStorage {
    private static final PlayerInput EMPTY = new PlayerInput(false, false, false, false, false, false, false);
    private static final float PLAYER_JUMP_HEIGHT = 0.42f;
    private float yaw;
    private float pitch;
    private boolean playerCommandTrackedSneaking;
    private boolean playerCommandTrackedSprinting;
    private PlayerInput lastInput = EMPTY;
    private double prevX;
    private double prevY;
    private double prevZ;

    public void tick(UserConnection user) {
        boolean jump;
        boolean right;
        boolean left;
        boolean backwards;
        double deltaX = this.x() - this.prevX;
        double deltaY = this.y() - this.prevY;
        double deltaZ = this.z() - this.prevZ;
        double magnitude = Math.sqrt(deltaX * deltaX + deltaZ * deltaZ);
        double directionX = magnitude > 0.0 ? deltaX / magnitude : 0.0;
        double directionZ = magnitude > 0.0 ? deltaZ / magnitude : 0.0;
        directionX = Math.max(-1.0, Math.min(1.0, directionX));
        directionZ = Math.max(-1.0, Math.min(1.0, directionZ));
        double angle = Math.toRadians(-this.yaw);
        double newDirectionX = directionX * Math.cos(angle) - directionZ * Math.sin(angle);
        double newDirectionZ = directionX * Math.sin(angle) + directionZ * Math.cos(angle);
        boolean forward = newDirectionZ >= (double)0.65f;
        PlayerInput input = new PlayerInput(forward, backwards = newDirectionZ <= (double)-0.65f, left = newDirectionX >= (double)0.65f, right = newDirectionX <= (double)-0.65f, jump = Math.abs(deltaY - (double)0.42f) <= (double)1.0E-4f, this.playerCommandTrackedSneaking, this.playerCommandTrackedSprinting);
        if (!this.lastInput.equals((Object)input)) {
            PacketWrapper playerInputPacket = PacketWrapper.create((PacketType)ServerboundPackets1_21_2.PLAYER_INPUT, (UserConnection)user);
            byte flags = 0;
            flags = (byte)(flags | (input.forward() ? 1 : 0));
            flags = (byte)(flags | (input.backward() ? 2 : 0));
            flags = (byte)(flags | (input.left() ? 4 : 0));
            flags = (byte)(flags | (input.right() ? 8 : 0));
            flags = (byte)(flags | (input.jump() ? 16 : 0));
            flags = (byte)(flags | (input.sneak() ? 32 : 0));
            flags = (byte)(flags | (input.sprint() ? 64 : 0));
            playerInputPacket.write((Type)Types.BYTE, (Object)flags);
            playerInputPacket.sendToServer(Protocol1_21_2To1_21.class);
            this.lastInput = input;
        }
        this.prevX = this.x();
        this.prevY = this.y();
        this.prevZ = this.z();
    }

    public void setRotation(float yaw, float pitch) {
        this.yaw = yaw;
        this.pitch = pitch;
    }

    public float yaw() {
        return this.yaw;
    }

    public float pitch() {
        return this.pitch;
    }

    public boolean setSneaking(boolean sneaking) {
        boolean changed = this.playerCommandTrackedSneaking != sneaking;
        this.playerCommandTrackedSneaking = sneaking;
        return changed;
    }

    public void setPlayerCommandTrackedSprinting(boolean playerCommandTrackedSprinting) {
        this.playerCommandTrackedSprinting = playerCommandTrackedSprinting;
    }

    public void setPlayerCommandTrackedSneaking(boolean playerCommandTrackedSneaking) {
        this.playerCommandTrackedSneaking = playerCommandTrackedSneaking;
    }
}

