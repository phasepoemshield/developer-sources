/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  minecraft.class01293
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import minecraft.class01293;
import minecraft.class05368;

final class class05379
extends class01293 {
    private final Long2ByteMap y;
    final /* synthetic */ class05368 N;

    protected int L(long l) {
        return this.y.get(l);
    }

    protected class05379(class05368 class053682) {
        this.N = class053682;
        super(7, 16, 256);
        this.y = new Long2ByteOpenHashMap();
        this.y.defaultReturnValue((byte)7);
    }

    protected int y(long l) {
        return this.N.N(l) ? 0 : 7;
    }

    protected void N(long l, int n) {
        if (n > 6) {
            this.y.remove(l);
        } else {
            this.y.put(l, (byte)n);
        }
    }

    public void N() {
        super.y(Integer.MAX_VALUE);
    }
}

