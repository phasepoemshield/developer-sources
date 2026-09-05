/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class06025
 *  minecraft.class06029
 */
package Nursultan;

import minecraft.class06025;
import minecraft.class06029;

public final class class10552<S>
implements class06025<S> {
    private final S N;

    public class10552(S s) {
        this.N = s;
    }

    public <T> T apply(class06029<? super S, T> class060292) {
        return (T)class060292.N(this.N);
    }
}

