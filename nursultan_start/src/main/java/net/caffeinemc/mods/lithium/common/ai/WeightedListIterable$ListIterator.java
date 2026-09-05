/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02134
 */
package net.caffeinemc.mods.lithium.common.ai;

import java.util.Iterator;
import minecraft.class02134;

public class WeightedListIterable$ListIterator<U>
implements Iterator<U> {
    private final Iterator<class02134<? extends U>> inner;

    public WeightedListIterable$ListIterator(Iterator<class02134<? extends U>> iterator) {
        this.inner = iterator;
    }

    @Override
    public boolean hasNext() {
        return this.inner.hasNext();
    }

    @Override
    public U next() {
        return (U)this.inner.next().N();
    }
}

