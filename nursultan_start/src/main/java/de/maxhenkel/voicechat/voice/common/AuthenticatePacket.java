/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  io.netty.buffer.ByteBuf
 *  minecraft.class00667
 */
package de.maxhenkel.voicechat.voice.common;

import de.maxhenkel.voicechat.voice.common.Packet;
import de.maxhenkel.voicechat.voice.common.Secret;
import io.netty.buffer.ByteBuf;
import java.util.UUID;
import minecraft.class00667;

public class AuthenticatePacket
implements Packet<AuthenticatePacket> {
    private UUID playerUUID;
    private Secret secret;

    public AuthenticatePacket(UUID uUID, Secret secret) {
        this.playerUUID = uUID;
        this.secret = secret;
    }

    public AuthenticatePacket() {
    }

    @Override
    public void toBytes(class00667 class006672) {
        class006672.N(this.playerUUID);
        this.secret.toBytes((ByteBuf)class006672);
    }

    @Override
    public AuthenticatePacket fromBytes(class00667 class006672) {
        AuthenticatePacket authenticatePacket = new AuthenticatePacket();
        authenticatePacket.playerUUID = class006672.m();
        authenticatePacket.secret = Secret.fromBytes((ByteBuf)class006672);
        return authenticatePacket;
    }

    public UUID getPlayerUUID() {
        return this.playerUUID;
    }

    public Secret getSecret() {
        return this.secret;
    }
}

