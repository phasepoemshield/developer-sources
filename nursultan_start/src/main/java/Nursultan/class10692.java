/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00442
 *  minecraft.class00455
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import Nursultan.class10696;
import java.util.Objects;
import minecraft.class00442;
import minecraft.class00455;
import org.jspecify.annotations.Nullable;

class class10692<T> {
    private final class10696<T> y;
    @Nullable T N;

    class10692(class10696<T> class106962) {
        this.y = class106962;
    }

    public @Nullable class00442<T> N(class00455<T> class004552) {
        T t = this.y.get();
        if (!Objects.equals(t, this.N)) {
            this.N = t;
            return class004552.N(t);
        }
        return null;
    }
}

