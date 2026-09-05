/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.nbt.tag.CompoundTag
 *  com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer
 *  com.viaversion.viaversion.libs.gson.annotations.SerializedName
 *  org.checkerframework.checker.nullness.qual.Nullable
 */
package com.viaversion.viaversion.api.minecraft.item;

import com.viaversion.nbt.tag.CompoundTag;
import com.viaversion.viaversion.api.minecraft.data.StructuredDataContainer;
import com.viaversion.viaversion.api.minecraft.item.Item;
import com.viaversion.viaversion.libs.gson.annotations.SerializedName;
import java.util.Objects;
import org.checkerframework.checker.nullness.qual.Nullable;

public class DataItem
implements Item {
    @SerializedName(value="identifier", alternate={"id"})
    private int identifier;
    private byte amount;
    private short data;
    private CompoundTag tag;

    @Override
    public int amount() {
        return this.amount;
    }

    @Override
    public void setData(short data) {
        this.data = data;
    }

    @Override
    public void setAmount(int amount) {
        if (amount != (byte)amount) {
            throw new IllegalArgumentException("Invalid item amount: " + amount);
        }
        this.amount = (byte)amount;
    }

    public DataItem() {
    }

    public DataItem(int identifier, byte amount, short data, @Nullable CompoundTag tag) {
        this.identifier = identifier;
        this.amount = amount;
        this.data = data;
        this.tag = tag;
    }

    public DataItem(int identifier, byte amount, @Nullable CompoundTag tag) {
        this(identifier, amount, 0, tag);
    }

    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || this.getClass() != o.getClass()) {
            return false;
        }
        DataItem item = (DataItem)o;
        if (this.identifier != item.identifier) {
            return false;
        }
        if (this.amount != item.amount) {
            return false;
        }
        if (this.data != item.data) {
            return false;
        }
        return Objects.equals(this.tag, item.tag);
    }

    public String toString() {
        return "DataItem{identifier=" + this.identifier + ", amount=" + this.amount + ", data=" + this.data + ", tag=" + String.valueOf(this.tag) + "}";
    }

    public int hashCode() {
        int result = this.identifier;
        result = 31 * result + this.amount;
        result = 31 * result + this.data;
        result = 31 * result + (this.tag != null ? this.tag.hashCode() : 0);
        return result;
    }

    @Override
    public short data() {
        return this.data;
    }

    @Override
    public DataItem copy() {
        return new DataItem(this.identifier, this.amount, this.data, this.tag != null ? this.tag.copy() : null);
    }

    @Override
    public @Nullable CompoundTag tag() {
        return this.tag;
    }

    @Override
    public void setIdentifier(int identifier) {
        this.identifier = identifier;
    }

    @Override
    public StructuredDataContainer dataContainer() {
        throw new UnsupportedOperationException();
    }

    @Override
    public int identifier() {
        return this.identifier;
    }

    @Override
    public void setTag(@Nullable CompoundTag tag) {
        this.tag = tag;
    }
}

