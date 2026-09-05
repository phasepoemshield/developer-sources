/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 *  minecraft.class02880
 *  minecraft.class02895
 */
package Nursultan;

import minecraft.class02362;
import minecraft.class02880;
import minecraft.class02895;

public class class09706<B, V>
implements class02362<B, V> {
    final /* synthetic */ class02895 N;
    final /* synthetic */ class02880 y;

    public class09706(class02895 class028952, class02880 class028802) {
        this.N = class028952;
        this.y = class028802;
    }

    public V decode(B b) {
        return (V)this.N.decode(b);
    }

    public void encode(B b, V v) {
        this.y.encode(v, b);
    }
}

