/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.connection.UserConnection
 *  com.viaversion.viaversion.api.minecraft.Particle
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 */
package com.viaversion.viabackwards.protocol.v1_21_2to1_21.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPacket1_21_2;
import com.viaversion.viaversion.rewriter.ParticleRewriter;

public final class ParticleRewriter1_21_2
extends ParticleRewriter<ClientboundPacket1_21_2> {
    public ParticleRewriter1_21_2(Protocol<ClientboundPacket1_21_2, ?, ?, ?> protocol) {
        super(protocol);
    }

    public void rewriteParticle(UserConnection connection, Particle particle) {
        String identifier = this.protocol.getMappingData().getParticleMappings().identifier(particle.id());
        super.rewriteParticle(connection, particle);
        if (identifier.equals("minecraft:dust_color_transition")) {
            this.argbToVector(particle, 0);
            this.argbToVector(particle, 3);
        } else if (identifier.equals("minecraft:dust")) {
            this.argbToVector(particle, 0);
        } else if (identifier.equals("minecraft:trail")) {
            particle.removeArgument(2);
            particle.removeArgument(1);
            particle.removeArgument(0);
        }
    }

    private void argbToVector(Particle particle, int index) {
        int argb = (Integer)particle.removeArgument(index).getValue();
        float r = (float)(argb >> 16 & 0xFF) / 255.0f;
        float g = (float)(argb >> 8 & 0xFF) / 255.0f;
        float b = (float)(argb & 0xFF) / 255.0f;
        particle.add(index, (Type)Types.FLOAT, (Object)Float.valueOf(r));
        particle.add(index + 1, (Type)Types.FLOAT, (Object)Float.valueOf(g));
        particle.add(index + 2, (Type)Types.FLOAT, (Object)Float.valueOf(b));
    }
}

