/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.vialegacy.protocol.release.r1_7_6_10tor1_8.types;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;

public class ItemArrayType<T extends Item>
extends Type<Item[]> {
    private final Type<T> itemType;

    public ItemArrayType(Type<T> itemType) {
        super(Item[].class);
        this.itemType = itemType;
    }

    public void write(ByteBuf buffer, Item[] items) {
        buffer.writeShort(items.length);
        for (Item item : items) {
            this.itemType.write(buffer, (Object)item);
        }
    }

    public Item[] read(ByteBuf buffer) {
        int amount = buffer.readShort();
        Item[] items = new Item[amount];
        for (int i = 0; i < amount; ++i) {
            items[i] = (Item)this.itemType.read(buffer);
        }
        return items;
    }
}

