/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.longs.Long2ByteMap
 *  it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap
 *  it.unimi.dsi.fastutil.objects.ObjectSet
 */
package minecraft;

import it.unimi.dsi.fastutil.longs.Long2ByteMap;
import it.unimi.dsi.fastutil.longs.Long2ByteOpenHashMap;
import it.unimi.dsi.fastutil.objects.ObjectSet;
import minecraft.class04762;
import minecraft.class04778;

class class04766
extends class04762 {
    protected final Long2ByteMap N;
    protected final int y;
    final /* synthetic */ class04778 L;

    protected int L(long l) {
        return this.N.get(l);
    }

    protected class04766(class04778 class047782, int n) {
        this.L = class047782;
        super(n + 2, 16, 256);
        this.N = new Long2ByteOpenHashMap();
        this.y = n;
        this.N.defaultReturnValue((byte)(n + 2));
    }

    @Override
    protected int y(long l) {
        return this.R(l) ? 0 : Integer.MAX_VALUE;
    }

    public void N() {
        this.y(Integer.MAX_VALUE);
    }

    protected void N(long l, int n, int n2) {
    }

    protected void N(long l, int n) {
        byte by = n > this.y ? this.N.remove(l) : this.N.put(l, (byte)n);
        this.N(l, (int)by, n);
    }

    private boolean R(long l) {
        ObjectSet var3 = (ObjectSet)this.L.y.get(l);
        return var3 != null && !var3.isEmpty();
    }
}

