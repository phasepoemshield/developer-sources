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
import com.viaversion.viaversion.api.minecraft.item.ItemBase;
import org.checkerframework.checker.nullness.qual.Nullable;

public interface Item
extends ItemBase {
    default public void setData(short data) {
        throw new UnsupportedOperationException();
    }

    default public boolean isTemplate() {
        return false;
    }

    public static boolean isEmpty(@Nullable Item item) {
        return item == null || item.isEmpty();
    }

    default public short data() {
        return 0;
    }

    @Override
    public Item copy();

    public @Nullable CompoundTag tag();

    public StructuredDataContainer dataContainer();

    public void setTag(@Nullable CompoundTag var1);
}

