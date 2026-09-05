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
package com.viaversion.viaversion.protocols.v1_21_7to1_21_9.rewriter;

import com.viaversion.viaversion.api.connection.UserConnection;
import com.viaversion.viaversion.api.minecraft.Particle;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.rewriter.ParticleRewriter;

public final class ParticleRewriter1_21_9
extends ParticleRewriter<ClientboundPacket1_21_6> {
    public ParticleRewriter1_21_9(Protocol<ClientboundPacket1_21_6, ?, ?, ?> protocol) {
        super(protocol);
    }

    public void rewriteParticle(UserConnection connection, Particle particle) {
        super.rewriteParticle(connection, particle);
        String identifier = this.protocol.getMappingData().getParticleMappings().mappedIdentifier(particle.id());
        if ("minecraft:dragon_breath".equals(identifier)) {
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(1.0f));
        } else if ("minecraft:flash".equals(identifier)) {
            particle.add((Type)Types.INT, (Object)-1);
        } else if ("minecraft:effect".equals(identifier) || "minecraft:instant_effect".equals(identifier)) {
            particle.add((Type)Types.INT, (Object)-1);
            particle.add((Type)Types.FLOAT, (Object)Float.valueOf(1.0f));
        }
    }
}

