/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01237
 *  minecraft.class01421
 *  minecraft.class04832
 *  minecraft.class06078
 *  minecraft.class06959
 *  minecraft.class07079
 *  minecraft.class08476
 */
package minecraft;

import minecraft.class01237;
import minecraft.class01421;
import minecraft.class02840;
import minecraft.class04832;
import minecraft.class06078;
import minecraft.class06959;
import minecraft.class07079;
import minecraft.class08476;

@Deprecated
public abstract class class02795<T extends class07079, S extends class08476, M extends class06078<? super S>>
extends class02840<T, S, M> {
    private final M N;
    private final M i;

    public class02795(class04832 class048322, M m, M m2, float f) {
        super(class048322, m, f);
        this.N = m;
        this.i = m2;
    }

    public void method_3936(S s, class01421 class014212, class01237 class012372, class06959 class069592) {
        this.y = ((class08476)s).NB ? this.i : this.N;
        super.method_3936(s, class014212, class012372, class069592);
    }
}

