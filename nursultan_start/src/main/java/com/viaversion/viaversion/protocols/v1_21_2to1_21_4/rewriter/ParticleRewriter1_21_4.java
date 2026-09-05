/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_2to1_21_4.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import java.util.concurrent.ThreadLocalRandom;

public final class ParticleRewriter1_21_4
extends ParticleRewriter<ClientboundPacket1_21_2> {
    public ParticleRewriter1_21_4(Protocol<ClientboundPacket1_21_2, ?, ?, ?> protocol) {
        super(protocol);
    }

    public void rewriteParticle(UserConnection connection, Particle particle) {
        super.rewriteParticle(connection, particle);
        String identifier = this.protocol.getMappingData().getParticleMappings().mappedIdentifier(particle.id());
        if ("minecraft:trail".equals(identifier)) {
            particle.add((Type)Types.VAR_INT, (Object)(ThreadLocalRandom.current().nextInt(40) + 10));
        }
    }
}

