/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.DataItem
 *  com.viaversion.viaversion.api.minecraft.item.Item
 *  com.viaversion.viaversion.api.type.Type
 *  io.netty.buffer.ByteBuf
 */
package net.raphimc.vialegacy.protocol.release.r1_4_2tor1_4_4_5.types;

import com.viaversion.viaversion.api.minecraft.item.DataItem;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.api.type.Type;
import io.netty.buffer.ByteBuf;

public class NbtLessItemType
extends Type<Item> {
    public NbtLessItemType() {
        super(Item.class);
    }

    public void write(ByteBuf buffer, Item item) {
        if (item == null) {
            buffer.writeShort(-1);
        } else {
            buffer.writeShort(item.identifier());
            buffer.writeByte(item.amount());
            buffer.writeShort((int)item.data());
        }
    }

    public Item read(ByteBuf buffer) {
        short id = buffer.readShort();
        if (id < 0) {
            return null;
        }
        DataItem item = new DataItem();
        item.setIdentifier((int)id);
        item.setAmount((int)buffer.readByte());
        item.setData(buffer.readShort());
        return item;
    }
}

