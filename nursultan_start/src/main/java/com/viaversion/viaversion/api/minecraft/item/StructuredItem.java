/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.item;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.item.Item;
import org.checkerframework.checker.nullness.qual.Nullable;

public class StructuredItem
implements Item {
    private final StructuredDataContainer data;
    private int identifier;
    private int amount;

    public static Item[] emptyArray(int size) {
        Item[] items = new Item[size];
        for (int i = 0; i < items.length; ++i) {
            items[i] = StructuredItem.empty();
        }
        return items;
    }

    @Override
    public int amount() {
        return this.amount;
    }

    @Override
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public StructuredItem(int identifier, int amount) {
        this(identifier, amount, new StructuredDataContainer());
    }

    public StructuredItem(int identifier, int amount, StructuredDataContainer data) {
        this.identifier = identifier;
        this.amount = amount;
        this.data = data;
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        StructuredItem that = (StructuredItem)o;
        if (this.identifier != that.identifier) {
            return false;
        }
        if (this.amount != that.amount) {
            return false;
        }
        return this.data.equals(that.data);
    }

    public String toString() {
        return "StructuredItem{data=" + String.valueOf(this.data) + ", identifier=" + this.identifier + ", amount=" + this.amount + "}";
    }

    public int hashCode() {
        int result = this.data.hashCode();
        result = 31 * result + this.identifier;
        result = 31 * result + this.amount;
        return result;
    }

    public static StructuredItem empty() {
        return new StructuredItem(0, 0);
    }

    @Override
    public StructuredItem copy() {
        return new StructuredItem(this.identifier, this.amount, this.data.copy());
    }

    @Override
    public @Nullable CompoundTag tag() {
        return null;
    }

    @Override
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public StructuredDataContainer dataContainer() {
        return this.data;
    }

    @Override
    public int identifier() {
        return this.identifier;
    }

    @Override
    public void setTag(@Nullable CompoundTag tag) {
        throw new UnsupportedOperationException();
    }
}

