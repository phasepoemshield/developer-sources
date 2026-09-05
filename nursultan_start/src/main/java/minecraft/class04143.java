/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04782
 */
package minecraft;

import minecraft.class04118;
import minecraft.class04119;
import minecraft.class04140;
import minecraft.class04782;

class class04143<E>
extends class04119<E> {
    final /* synthetic */ class04140 N;

    class04143(class04140 class041402) {
        this.N = class041402;
    }

    public String toString() {
        return this.method_46910();
    }

    @Override
    public boolean trigger(class04782 class047822, E e, long l) {
        class04118 class041182 = (class04118)this.N.N(class047822, e, l);
        if (class041182 == null) {
            return false;
        }
        return class041182.trigger(class047822, e, l);
    }

    @Override
    public String method_46910() {
        return "OneShot[" + this.N.N() + "]";
    }
}

