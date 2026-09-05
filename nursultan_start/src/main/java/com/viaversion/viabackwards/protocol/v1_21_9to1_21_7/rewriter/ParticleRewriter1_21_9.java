/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 */
package com.viaversion.viabackwards.protocol.v1_21_9to1_21_7.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPacket1_21_9;
import com.viaversion.viaversion.rewriter.ParticleRewriter;

public final class ParticleRewriter1_21_9
extends ParticleRewriter<ClientboundPacket1_21_9> {
    public ParticleRewriter1_21_9(Protocol<ClientboundPacket1_21_9, ?, ?, ?> protocol) {
        super(protocol);
    }

    public void rewriteParticle(UserConnection connection, Particle particle) {
        super.rewriteParticle(connection, particle);
        String identifier = this.protocol.getMappingData().getParticleMappings().mappedIdentifier(particle.id());
        if ("minecraft:dragon_breath".equals(identifier)) {
            particle.removeArgument(0);
        } else if ("minecraft:flash".equals(identifier)) {
            particle.removeArgument(0);
        } else if ("minecraft:effect".equals(identifier) || "minecraft:instant_effect".equals(identifier)) {
            particle.removeArgument(1);
            particle.removeArgument(0);
        }
    }
}

