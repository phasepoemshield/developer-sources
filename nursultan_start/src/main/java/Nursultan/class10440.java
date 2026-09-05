/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04523
 *  minecraft.class04537
 */
package Nursultan;

import java.util.Arrays;
import java.util.List;
import minecraft.class04523;
import minecraft.class04537;

public class class10440<E>
implements class04537<E> {
    private final Object[] N;

    public class10440(List<class04523<E>> list, int n) {
        this.N = new Object[n];
        int n2 = 0;
        for (class04523<E> class045232 : list) {
            int n3 = class045232.y();
            Arrays.fill(this.N, n2, n2 + n3, class045232.N());
            n2 += n3;
        }
    }

    public E N(int n) {
        return (E)this.N[n];
    }
}

