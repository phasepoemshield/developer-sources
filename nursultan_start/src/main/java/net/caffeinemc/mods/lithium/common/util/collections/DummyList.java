/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.AbstractList;

public class DummyList<T>
extends AbstractList<T> {
    @Override
    public int size() {
        return 0;
    }

    @Override
    public T get(int n) {
        throw new IndexOutOfBoundsException(n);
    }
}

