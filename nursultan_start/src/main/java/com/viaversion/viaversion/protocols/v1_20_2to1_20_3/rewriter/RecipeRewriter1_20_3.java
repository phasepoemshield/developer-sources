/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.RecipeRewriter1_19_4
 */
package com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.protocols.v1_19_3to1_19_4.rewriter.RecipeRewriter1_19_4;

public class RecipeRewriter1_20_3<C extends ClientboundPacketType>
extends RecipeRewriter1_19_4<C> {
    public RecipeRewriter1_20_3(Protocol<C, ?, ?, ?> protocol) {
        super(protocol);
    }

    protected Type<Item[]> mappedItemArrayType() {
        return this.protocol.getItemRewriter().mappedItemArrayType();
    }

    protected Type<Item[]> itemArrayType() {
        return this.protocol.getItemRewriter().itemArrayType();
    }

    protected Type<Item> mappedItemType() {
        return this.protocol.getItemRewriter().mappedItemType();
    }

    public void handleCraftingShaped(PacketWrapper wrapper) {
        wrapper.passthrough(Types.STRING);
        wrapper.passthrough((Type)Types.VAR_INT);
        int ingredients = (Integer)wrapper.passthrough((Type)Types.VAR_INT) * (Integer)wrapper.passthrough((Type)Types.VAR_INT);
        for (int i = 0; i < ingredients; ++i) {
            this.handleIngredient(wrapper);
        }
        this.handleResult(wrapper);
        wrapper.passthrough((Type)Types.BOOLEAN);
    }

    protected Type<Item> itemType() {
        return this.protocol.getItemRewriter().itemType();
    }
}

