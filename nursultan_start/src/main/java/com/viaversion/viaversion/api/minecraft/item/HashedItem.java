/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 *  com.viaversion.viaversion.libs.fastutil.ints.IntSet
 */
package com.viaversion.viaversion.api.minecraft.item;

import com.viaversion.viaversion.api.minecraft.item.ItemBase;
import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;
import com.viaversion.viaversion.libs.fastutil.ints.IntSet;

public interface HashedItem
extends ItemBase {
    @Override
    public HashedItem copy();

    public Int2IntMap dataHashesById();

    public IntSet removedDataIds();
}

