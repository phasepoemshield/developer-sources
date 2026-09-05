/*
 * Decompiled with CFR 0.152.
 */
package minecraft;

import java.util.Map;
import java.util.function.IntFunction;
import minecraft.class02362;
import minecraft.class02389;

class class02374<B, M>
implements class02362<B, M> {
    final /* synthetic */ int N;
    final /* synthetic */ class02362 y;
    final /* synthetic */ class02362 L;
    final /* synthetic */ IntFunction u;

    class02374(int n, class02362 class023622, class02362 class023623, IntFunction intFunction) {
        this.N = n;
        this.y = class023622;
        this.L = class023623;
        this.u = intFunction;
    }

    public M decode(B b) {
        int n = class02389.N(b, this.N);
        Map map = (Map)this.u.apply(Math.min(n, 65536));
        for (int i = 0; i < n; ++i) {
            Object object = this.y.decode(b);
            Object object2 = this.L.decode(b);
            map.put(object, object2);
        }
        return (M)map;
    }

    public void encode(B b, M m) {
        class02389.N(b, m.size(), this.N);
        m.forEach((object, object2) -> {
            this.y.encode(b, object);
            this.L.encode(b, object2);
        });
    }
}

