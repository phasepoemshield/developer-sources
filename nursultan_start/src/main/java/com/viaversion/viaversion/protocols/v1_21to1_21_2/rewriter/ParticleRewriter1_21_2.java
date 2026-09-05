/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.minecraft.Particle$ParticleData
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21
 */
package com.viaversion.viaversion.protocols.v1_21to1_21_2.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_20_5to1_21.packet.ClientboundPacket1_21;
import com.viaversion.viaversion.rewriter.ParticleRewriter;

public final class ParticleRewriter1_21_2
extends ParticleRewriter<ClientboundPacket1_21> {
    public ParticleRewriter1_21_2(Protocol<ClientboundPacket1_21, ?, ?, ?> protocol) {
        super(protocol);
    }

    @Override
    public void rewriteParticle(UserConnection connection, Particle particle) {
        super.rewriteParticle(connection, particle);
        String identifier = this.protocol.getMappingData().getParticleMappings().mappedIdentifier(particle.id());
        if ("minecraft:dust_color_transition".equals(identifier)) {
            this.floatsToARGB(particle, 0);
            this.floatsToARGB(particle, 1);
        } else if ("minecraft:dust".equals(identifier)) {
            this.floatsToARGB(particle, 0);
        }
    }

    private void floatsToARGB(Particle particle, int fromIndex) {
        Particle.ParticleData r = particle.removeArgument(fromIndex);
        Particle.ParticleData g = particle.removeArgument(fromIndex);
        Particle.ParticleData b = particle.removeArgument(fromIndex);
        int rgb = 0xFF000000 | (int)(((Float)r.getValue()).floatValue() * 255.0f) << 16 | (int)(((Float)g.getValue()).floatValue() * 255.0f) << 8 | (int)(((Float)b.getValue()).floatValue() * 255.0f);
        particle.add(fromIndex, (Type)Types.INT, (Object)rgb);
    }
}

