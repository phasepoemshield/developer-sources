/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.ints.Int2IntFunction
 *  minecraft.class00394
 *  minecraft.class03042
 *  minecraft.class03063
 *  minecraft.class06029
 *  minecraft.class07209
 *  minecraft.class07295
 */
package minecraft;

import it.unimi.dsi.fastutil.ints.Int2IntFunction;
import minecraft.class00394;
import minecraft.class03042;
import minecraft.class03063;
import minecraft.class06029;
import minecraft.class07209;
import minecraft.class07295;

public class class05993<S extends class00394>
implements class06029<S, Int2IntFunction> {
    public Int2IntFunction N(S s, S s2) {
        return n -> {
            int n2 = class03063.N((class07295)s.G(), (class07209)s.d());
            int n3 = class03063.N((class07295)s2.G(), (class07209)s2.d());
            int n4 = class03042.N((int)n2);
            int n5 = class03042.N((int)n3);
            int n6 = class03042.y((int)n2);
            int n7 = class03042.y((int)n3);
            return class03042.N((int)Math.max(n4, n5), (int)Math.max(n6, n7));
        };
    }

    public Int2IntFunction N(S s) {
        return n -> n;
    }

    public Int2IntFunction y() {
        return n -> n;
    }
}

