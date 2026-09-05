/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02362
 */
package Nursultan;

import java.util.function.Function;
import minecraft.class02362;

public class class09705<O, V>
implements class02362<O, V> {
    final /* synthetic */ Function N;
    final /* synthetic */ class02362 y;

    public class09705(class02362 class023622, Function function) {
        this.y = class023622;
        this.N = function;
    }

    public V decode(O o) {
        Object r = this.N.apply(o);
        return (V)this.y.decode(r);
    }

    public void encode(O o, V v) {
        Object r = this.N.apply(o);
        this.y.encode(r, v);
    }
}

