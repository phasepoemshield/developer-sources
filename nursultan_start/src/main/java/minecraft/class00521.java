/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2ObjectMap
 *  it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2ObjectMap;
import it.unimi.dsi.fastutil.ints.Int2ObjectOpenHashMap;

public class class00521 {
    static final Int2ObjectMap<class00521> N = new Int2ObjectOpenHashMap();
    final int y;

    public class00521(int n) {
        this.y = n;
        N.put(n, (Object)this);
    }
}

