/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util;

import java.util.AbstractList;

class ArrayUtils$UnmodifiableArrayList<E>
extends AbstractList<E> {
    private final E[] array;

    ArrayUtils$UnmodifiableArrayList(E[] EArray) {
        this.array = EArray;
    }

    @Override
    public int size() {
        return this.array.length;
    }

    @Override
    public E get(int n) {
        if (n >= this.array.length) {
            throw new IndexOutOfBoundsException("Index: " + n + ", Size: " + this.size());
        }
        return this.array[n];
    }
}

