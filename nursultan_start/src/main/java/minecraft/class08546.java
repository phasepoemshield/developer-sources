/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class08542
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.util.function.Function;
import minecraft.class08542;
import org.jspecify.annotations.Nullable;

public class class08546<C extends class08542<C>, D> {
    private final Function<C, D> N;
    private @Nullable C y;
    private @Nullable D L;

    public class08546(Function<C, D> function) {
        this.N = function;
    }

    public D N(C c) {
        if (c == this.y && this.L != null) {
            return this.L;
        }
        D d = this.N.apply(c);
        this.L = d;
        this.y = c;
        c.N(this);
        return d;
    }

    public void N() {
        this.L = null;
        this.y = null;
    }
}

