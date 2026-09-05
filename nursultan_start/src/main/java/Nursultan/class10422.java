/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04523
 *  minecraft.class04537
 */
package Nursultan;

import java.util.List;
import minecraft.class04523;
import minecraft.class04537;

public class class10422<E>
implements class04537<E> {
    private final class04523<?>[] N;

    public class10422(List<class04523<E>> list) {
        this.N = (class04523[])list.toArray(class04523[]::new);
    }

    public E N(int n) {
        for (class04523<?> var5 : this.N) {
            if ((n -= var5.y()) >= 0) continue;
            return (E)var5.N();
        }
        throw new IllegalStateException(n + " exceeded total weight");
    }
}

