/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.protocol.shared_registration.PacketBound
 *  com.viaversion.viaversion.protocol.shared_registration.RegistrationContext
 *  com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14
 *  com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3
 */
package com.viaversion.viabackwards.protocol.registration;

import com.viaversion.viabackwards.api.rewriters.SoundRewriter;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.protocol.shared_registration.PacketBound;
import com.viaversion.viaversion.protocol.shared_registration.RegistrationContext;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ClientboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_9_1to1_9_3.packet.ClientboundPackets1_9_3;

final class RegistryRegistrations {
    RegistryRegistrations() {
    }

    static <CU extends ClientboundPacketType> void registerNamedSound1_10(RegistrationContext<CU, ?> ctx) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_9_3.CUSTOM_SOUND, new SoundRewriter(ctx.protocol())::registerNamedSound, new PacketBound[]{PacketBound.REMOVED_AT_MAX});
    }

    static <CU extends ClientboundPacketType> void registerStopSound1_14(RegistrationContext<CU, ?> ctx) {
        ctx.clientbound((ClientboundPacketType)ClientboundPackets1_14.STOP_SOUND, new SoundRewriter(ctx.protocol())::registerStopSound);
    }
}

