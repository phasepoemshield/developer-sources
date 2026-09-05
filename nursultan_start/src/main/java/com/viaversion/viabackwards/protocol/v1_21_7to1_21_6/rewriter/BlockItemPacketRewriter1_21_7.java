/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viabackwards.api.BackwardsProtocol
 *  com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6
 *  com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6
 */
package com.viaversion.viabackwards.protocol.v1_21_7to1_21_6.rewriter;

import com.viaversion.viabackwards.api.BackwardsProtocol;
import com.viaversion.viabackwards.api.rewriters.BackwardsStructuredItemRewriter;
import com.viaversion.viabackwards.protocol.v1_21_7to1_21_6.Protocol1_21_7To1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;

public final class BlockItemPacketRewriter1_21_7
extends BackwardsStructuredItemRewriter<ClientboundPacket1_21_6, ServerboundPacket1_21_6, Protocol1_21_7To1_21_6> {
    public BlockItemPacketRewriter1_21_7(Protocol1_21_7To1_21_6 protocol) {
        super((BackwardsProtocol)protocol);
    }
}

