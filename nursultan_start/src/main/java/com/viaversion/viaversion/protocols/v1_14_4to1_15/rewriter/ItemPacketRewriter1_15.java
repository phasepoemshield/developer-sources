/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 */
package com.viaversion.viaversion.protocols.v1_14_4to1_15.rewriter;

import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_13_2to1_14.packet.ServerboundPackets1_14;
import com.viaversion.viaversion.protocols.v1_14_3to1_14_4.packet.ClientboundPackets1_14_4;
import com.viaversion.viaversion.protocols.v1_14_4to1_15.Protocol1_14_4To1_15;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;

public class ItemPacketRewriter1_15
extends ItemRewriter<ClientboundPackets1_14_4, ServerboundPackets1_14, Protocol1_14_4To1_15> {
    public ItemPacketRewriter1_15(Protocol1_14_4To1_15 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    public void registerPackets() {
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_14_4.UPDATE_RECIPES);
    }
}

