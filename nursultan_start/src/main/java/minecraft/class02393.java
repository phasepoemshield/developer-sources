/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Collection;
import java.util.function.IntFunction;
import minecraft.class02362;
import minecraft.class02389;

class class02393<B, C>
implements class02362<B, C> {
    final /* synthetic */ int N;
    final /* synthetic */ IntFunction y;
    final /* synthetic */ class02362 L;

    class02393(int n, IntFunction intFunction, class02362 class023622) {
        this.N = n;
        this.y = intFunction;
        this.L = class023622;
    }

    public C decode(B b) {
        int n = class02389.N(b, this.N);
        Collection collection = (Collection)this.y.apply(Math.min(n, 65536));
        for (int i = 0; i < n; ++i) {
            collection.add(this.L.decode(b));
        }
        return (C)collection;
    }

    public void encode(B b, C c) {
        class02389.N(b, c.size(), this.N);
        for (Object e : c) {
            this.L.encode(b, e);
        }
    }
}

