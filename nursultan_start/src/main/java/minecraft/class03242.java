/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00381
 *  minecraft.class00638
 *  minecraft.class02897
 */
package minecraft;

import minecraft.class00381;
import minecraft.class00638;
import minecraft.class02897;

public abstract class class03242<T extends class00638>
implements class00381<T> {
    public final void method_65081(T t) {
        throw new AssertionError((Object)"This packet should be handled by pipeline");
    }

    public abstract class02897<? extends class03242<T>> method_65080();
}

