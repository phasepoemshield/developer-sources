/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.rewriter.ItemRewriter
 *  com.viaversion.viaversion.rewriter.RecipeRewriter
 */
package com.viaversion.viaversion.protocols.v1_16_1to1_16_2.rewriter;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_15_2to1_16.packet.ClientboundPackets1_16;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.Protocol1_16_1To1_16_2;
import com.viaversion.viaversion.protocols.v1_16_1to1_16_2.packet.ServerboundPackets1_16_2;
import com.viaversion.viaversion.rewriter.ItemRewriter;
import com.viaversion.viaversion.rewriter.RecipeRewriter;

public class ItemPacketRewriter1_16_2
extends ItemRewriter<ClientboundPackets1_16, ServerboundPackets1_16_2, Protocol1_16_1To1_16_2> {
    public ItemPacketRewriter1_16_2(Protocol1_16_1To1_16_2 protocol) {
        super((Protocol)protocol, Types.ITEM1_13_2, Types.ITEM1_13_2_SHORT_ARRAY);
    }

    public void registerPackets() {
        ((Protocol1_16_1To1_16_2)this.protocol).registerClientbound(ClientboundPackets1_16.RECIPE, wrapper -> {
            wrapper.passthrough((Type)Types.VAR_INT);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.passthrough((Type)Types.BOOLEAN);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
            wrapper.write((Type)Types.BOOLEAN, (Object)false);
        });
        new RecipeRewriter(this.protocol).register((ClientboundPacketType)ClientboundPackets1_16.UPDATE_RECIPES);
        ((Protocol1_16_1To1_16_2)this.protocol).registerServerbound(ServerboundPackets1_16_2.EDIT_BOOK, wrapper -> this.handleItemToServer(wrapper.user(), (Item)wrapper.passthrough(Types.ITEM1_13_2)));
    }
}

