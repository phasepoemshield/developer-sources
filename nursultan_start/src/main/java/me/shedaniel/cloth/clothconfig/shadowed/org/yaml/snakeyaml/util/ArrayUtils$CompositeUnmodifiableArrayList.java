/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util;

import java.util.AbstractList;

class ArrayUtils$CompositeUnmodifiableArrayList<E>
extends AbstractList<E> {
    private final E[] array1;
    private final E[] array2;

    ArrayUtils$CompositeUnmodifiableArrayList(E[] EArray, E[] EArray2) {
        this.array1 = EArray;
        this.array2 = EArray2;
    }

    @Override
    public int size() {
        return this.array1.length + this.array2.length;
    }

    @Override
    public E get(int n) {
        E e;
        if (n < this.array1.length) {
            e = this.array1[n];
        } else if (n - this.array1.length < this.array2.length) {
            e = this.array2[n - this.array1.length];
        } else {
            throw new IndexOutOfBoundsException("Index: " + n + ", Size: " + this.size());
        }
        return e;
    }
}

