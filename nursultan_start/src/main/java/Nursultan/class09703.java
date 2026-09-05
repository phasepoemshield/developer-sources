/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 *  minecraft.class02874
 *  minecraft.class02895
 */
package Nursultan;

import minecraft.class02362;
import minecraft.class02874;
import minecraft.class02895;

public class class09703<B, V>
implements class02362<B, V> {
    final /* synthetic */ class02895 N;
    final /* synthetic */ class02874 y;

    public class09703(class02895 class028952, class02874 class028742) {
        this.N = class028952;
        this.y = class028742;
    }

    public V decode(B b) {
        return (V)this.N.decode(b);
    }

    public void encode(B b, V v) {
        this.y.encode(b, v);
    }
}

