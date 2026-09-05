/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02150
 */
package net.caffeinemc.mods.lithium.common.ai;

import java.util.Iterator;
import minecraft.class02150;

public interface WeightedListIterable<U>
extends Iterable<U> {
    public static <T> Iterable<? extends T> cast(class02150<T> class021502) {
        return (WeightedListIterable)class021502;
    }

    @Override
    public Iterator<U> iterator();
}

