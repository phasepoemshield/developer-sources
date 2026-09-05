/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap
 */
package com.viaversion.viaversion.util;

import com.viaversion.viaversion.libs.fastutil.ints.Int2IntMap;

public interface Int2IntBiMap
extends Int2IntMap {
    public int put(int var1, int var2);

    public Int2IntBiMap inverse();
}

