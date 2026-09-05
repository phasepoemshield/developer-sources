/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 */
package Nursultan;

import minecraft.class02362;

public class class09699<B, V>
implements class02362<B, V> {
    final /* synthetic */ Object N;

    public class09699(Object object) {
        this.N = object;
    }

    public V decode(B b) {
        return (V)this.N;
    }

    public void encode(B b, V v) {
        if (!v.equals(this.N)) {
            throw new IllegalStateException("Can't encode '" + String.valueOf(v) + "', expected '" + String.valueOf(this.N) + "'");
        }
    }
}

