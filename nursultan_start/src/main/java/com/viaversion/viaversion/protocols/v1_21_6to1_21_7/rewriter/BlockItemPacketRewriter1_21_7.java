/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.rewriter.StructuredItemRewriter
 */
package com.viaversion.viaversion.protocols.v1_21_6to1_21_7.rewriter;

import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ClientboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_5to1_21_6.packet.ServerboundPacket1_21_6;
import com.viaversion.viaversion.protocols.v1_21_6to1_21_7.Protocol1_21_6To1_21_7;
import com.viaversion.viaversion.rewriter.StructuredItemRewriter;

public final class BlockItemPacketRewriter1_21_7
extends StructuredItemRewriter<ClientboundPacket1_21_6, ServerboundPacket1_21_6, Protocol1_21_6To1_21_7> {
    public BlockItemPacketRewriter1_21_7(Protocol1_21_6To1_21_7 protocol) {
        super((Protocol)protocol);
    }
}

