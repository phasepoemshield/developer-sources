/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.type.Types
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.item;

import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.api.type.types.item.BaseItemArrayType;
import io.netty.buffer.ByteBuf;

public class ItemShortArrayType1_13
extends BaseItemArrayType {
    public void write(ByteBuf buffer, Item[] object) {
        Types.SHORT.writePrimitive(buffer, (short)object.length);
        for (Item o : object) {
            Types.ITEM1_13.write(buffer, (Object)o);
        }
    }

    public Item[] read(ByteBuf buffer) {
        int amount = Types.SHORT.readPrimitive(buffer);
        Item[] array = new Item[amount];
        for (int i = 0; i < amount; ++i) {
            array[i] = (Item)Types.ITEM1_13.read(buffer);
        }
        return array;
    }
}

