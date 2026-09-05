/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.minecraft.item.StructuredItem
 *  com.viaversion.viaversion.api.protocol.Protocol
 *  com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType
 *  com.viaversion.viaversion.api.protocol.packet.PacketWrapper
 */
package com.viaversion.viaversion.protocols.v1_20_3to1_20_5.rewriter;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.minecraft.item.StructuredItem;
import com.viaversion.viaversion.api.protocol.Protocol;
import com.viaversion.viaversion.api.protocol.packet.ClientboundPacketType;
import com.viaversion.viaversion.api.protocol.packet.PacketWrapper;
import com.viaversion.viaversion.protocols.v1_20_2to1_20_3.rewriter.RecipeRewriter1_20_3;
import java.util.ArrayList;

final class RecipeRewriter1_20_5<C extends ClientboundPacketType>
extends RecipeRewriter1_20_3<C> {
    public RecipeRewriter1_20_5(Protocol<C, ?, ?, ?> protocol) {
        super(protocol);
    }

    protected void handleIngredient(PacketWrapper wrapper) {
        Item[] items = (Item[])wrapper.read(this.itemArrayType());
        ArrayList<Item> newItems = new ArrayList<Item>(items.length);
        for (Item item : items) {
            if (item == null || item.isEmpty()) continue;
            newItems.add(this.rewrite(wrapper.user(), item));
        }
        wrapper.write(this.mappedItemArrayType(), (Object)newItems.toArray(new Item[0]));
    }

    protected void handleResult(PacketWrapper wrapper) {
        Item result = this.rewrite(wrapper.user(), (Item)wrapper.read(this.itemType()));
        if (result == null || result.isEmpty()) {
            result = new StructuredItem(1, 1);
        }
        wrapper.write(this.mappedItemType(), (Object)result);
    }
}

