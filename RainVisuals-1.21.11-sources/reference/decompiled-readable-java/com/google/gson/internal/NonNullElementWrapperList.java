/*
 * Decompiled with CFR 0.152.
 */
package com.google.gson.internal;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Objects;
import java.util.RandomAccess;

public class NonNullElementWrapperList<E>
extends AbstractList<E>
implements RandomAccess {
    private final ArrayList<E> delegate;

    @Override
    public <T> T[] toArray(T[] a2) {
        return this.delegate.toArray(a2);
    }

    @Override
    public E remove(int index) {
        return this.delegate.remove(index);
    }

    @Override
    public int size() {
        return this.delegate.size();
    }

    @Override
    public int indexOf(Object o) {
        return this.delegate.indexOf(o);
    }

    @Override
    public boolean equals(Object o) {
        return this.delegate.equals(o);
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return this.delegate.retainAll(c);
    }

    @Override
    public E get(int index) {
        return this.delegate.get(index);
    }

    @Override
    public E set(int index, E element) {
        return this.delegate.set(index, this.nonNull(element));
    }

    @Override
    public int lastIndexOf(Object o) {
        return this.delegate.lastIndexOf(o);
    }

    @Override
    public void add(int index, E element) {
        this.delegate.add(index, this.nonNull(element));
    }

    @Override
    public void clear() {
        this.delegate.clear();
    }

    @Override
    public boolean remove(Object o) {
        return this.delegate.remove(o);
    }

    @Override
    public boolean contains(Object o) {
        return this.delegate.contains(o);
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        return this.delegate.removeAll(c);
    }

    @Override
    public Object[] toArray() {
        return this.delegate.toArray();
    }

    public NonNullElementWrapperList(ArrayList<E> delegate) {
        this.delegate = Objects.requireNonNull(delegate);
    }

    @Override
    public int hashCode() {
        return this.delegate.hashCode();
    }

    private E nonNull(E element) {
        if (element == null) {
            throw new NullPointerException("Element must be non-null");
        }
        return element;
    }
}

