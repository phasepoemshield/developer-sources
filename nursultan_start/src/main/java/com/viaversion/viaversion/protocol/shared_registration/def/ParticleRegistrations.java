/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13
 *  com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15
 *  com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19
 *  com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5
 *  com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9
 *  com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2
 *  com.viaversion.viaversion.rewriter.ParticleRewriter
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.protocol.shared_registration.def;

import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.ServerboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocols.v1_12_2to1_13.packet.ClientboundPackets1_13;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.packet.ClientboundPackets1_15;
import com.viaversion.viaversion.protocols.v1_18_2to1_19.packet.ClientboundPackets1_19;
import com.viaversion.viaversion.protocols.v1_20_3to1_20_5.packet.ClientboundPackets1_20_5;
import com.viaversion.viaversion.protocols.v1_21_7to1_21_9.packet.ClientboundPackets1_21_9;
import com.viaversion.viaversion.protocols.v1_21to1_21_2.packet.ClientboundPackets1_21_2;
import com.viaversion.viaversion.rewriter.ParticleRewriter;
import org.checkerframework.checker.nullness.qual.Nullable;

final class ParticleRegistrations {
    ParticleRegistrations() {
    }

    static <CU extends ClientboundPacketType, SU extends ServerboundPacketType> @Nullable ParticleRewriter<CU> particle(RegistrationContext<CU, SU> ctx) {
        return (ParticleRewriter)ctx.protocol().getParticleRewriter();
    }

    static <CU extends ClientboundPacketType> void registerParticlePackets1_13(RegistrationContext<CU, ?> ctx, ParticleRewriter<CU> pr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_13.LEVEL_PARTICLES, type -> pr.registerLevelParticles1_13(type, (Type)Types.FLOAT));
    }

    static <CU extends ClientboundPacketType> void registerParticlePackets1_19(RegistrationContext<CU, ?> ctx, ParticleRewriter<CU> pr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.LEVEL_PARTICLES, arg_0 -> pr.registerLevelParticles1_19(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerParticlePackets1_20_5(RegistrationContext<CU, ?> ctx, ParticleRewriter<CU> pr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.LEVEL_PARTICLES, arg_0 -> pr.registerLevelParticles1_20_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_20_5.EXPLODE, arg_0 -> pr.registerExplode1_20_5(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerParticlePackets1_15_2(RegistrationContext<CU, ?> ctx, ParticleRewriter<CU> pr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_15.LEVEL_PARTICLES, type -> pr.registerLevelParticles1_13(type, (Type)Types.DOUBLE));
    }

    static <CU extends ClientboundPacketType> void registerParticlePackets1_21_2(RegistrationContext<CU, ?> ctx, ParticleRewriter<CU> pr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.LEVEL_PARTICLES, arg_0 -> pr.registerLevelParticles1_20_5(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.EXPLODE, arg_0 -> pr.registerExplode1_21_2(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerParticlePackets1_21_9(RegistrationContext<CU, ?> ctx, ParticleRewriter<CU> pr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_9.LEVEL_PARTICLES, arg_0 -> pr.registerLevelParticles1_21_4(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_9.EXPLODE, arg_0 -> pr.registerExplode1_21_9(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerParticlePackets1_20(RegistrationContext<CU, ?> ctx, ParticleRewriter<CU> pr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_19.LEVEL_PARTICLES, arg_0 -> pr.registerLevelParticles1_19(arg_0));
    }

    static <CU extends ClientboundPacketType> void registerParticlePackets1_21_4(RegistrationContext<CU, ?> ctx, ParticleRewriter<CU> pr) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.LEVEL_PARTICLES, arg_0 -> pr.registerLevelParticles1_21_4(arg_0));
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_21_2.EXPLODE, arg_0 -> pr.registerExplode1_21_2(arg_0));
    }
}

