/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.api.minecraft.item.HashedItem
 *  com.viaversion.viaversion.api.minecraft.item.HashedStructuredItem
 *  com.viaversion.viaversion.api.type.Type
 *  com.viaversion.viaversion.api.type.Types
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap$Entry
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap
 *  com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 *  com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator
 *  com.viaversion.viaversion.util.Limit
 *  io.netty.buffer.ByteBuf
 */
package com.viaversion.viaversion.api.type.types.item;

import com.viaversion.viaversion.api.minecraft.item.HashedItem;
import com.viaversion.viaversion.api.minecraft.item.HashedStructuredItem;
import com.viaversion.viaversion.api.type.Type;
import com.viaversion.viaversion.api.type.Types;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntOpenHashMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntOpenHashSet;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;
import com.viaversion.viaversion.libs.fastutil.objects.ObjectIterator;
import com.viaversion.viaversion.util.Limit;
import io.netty.buffer.ByteBuf;

public class HashedItemType1_21_5
extends Type<HashedItem> {
    public HashedItemType1_21_5() {
        super(HashedItem.class);
    }

    public void write(ByteBuf buffer, HashedItem value) {
        if (value.isEmpty()) {
            buffer.writeBoolean(false);
            return;
        }
        buffer.writeBoolean(true);
        Types.VAR_INT.writePrimitive(buffer, value.identifier());
        Types.VAR_INT.writePrimitive(buffer, value.amount());
        Types.VAR_INT.writePrimitive(buffer, value.dataHashesById().size());
        for (Int2IntMap.Entry entry : value.dataHashesById().int2IntEntrySet()) {
            Types.VAR_INT.writePrimitive(buffer, entry.getIntKey());
            Types.INT.writePrimitive(buffer, entry.getIntValue());
        }
        Types.VAR_INT.writePrimitive(buffer, value.removedDataIds().size());
        ObjectIterator objectIterator = value.removedDataIds().iterator();
        while (objectIterator.hasNext()) {
            int removedDataId = (Integer)objectIterator.next();
            Types.VAR_INT.writePrimitive(buffer, removedDataId);
        }
    }

    public HashedItem read(ByteBuf buffer) {
        if (!buffer.readBoolean()) {
            return HashedStructuredItem.empty();
        }
        int id = Types.VAR_INT.readPrimitive(buffer);
        int amount = Types.VAR_INT.readPrimitive(buffer);
        int addedComponentsSize = Limit.max((int)Types.VAR_INT.readPrimitive(buffer), (int)256);
        Int2IntOpenHashMap dataHashes = new Int2IntOpenHashMap(addedComponentsSize);
        for (int i = 0; i < addedComponentsSize; ++i) {
            int dataType = Types.VAR_INT.readPrimitive(buffer);
            int hash = Types.INT.readPrimitive(buffer);
            dataHashes.put(dataType, hash);
        }
        int removedComponentsSize = Limit.max((int)Types.VAR_INT.readPrimitive(buffer), (int)256);
        IntOpenHashSet removedData = new IntOpenHashSet(removedComponentsSize);
        for (int i = 0; i < removedComponentsSize; ++i) {
            int dataType = Types.VAR_INT.readPrimitive(buffer);
            removedData.add(dataType);
        }
        return new HashedStructuredItem(id, amount, (Int2IntMap)dataHashes, (IntSet)removedData);
    }
}

