/*
 * Decompiled with CFR 0.152.
 */
package de.maxhenkel.voicechat.configbuilder.custom;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;

public abstract class AbstractValueList<T>
implements List<T> {
    protected final List<T> list;

    protected AbstractValueList(T ... TArray) {
        this(Arrays.asList(TArray));
    }

    protected AbstractValueList(List<T> list) {
        this.list = Collections.unmodifiableList(list);
    }

    @Override
    public T remove(int n) {
        return AbstractValueList.throwException();
    }

    @Override
    public boolean remove(Object object) {
        return (Boolean)AbstractValueList.throwException();
    }

    @Override
    public int size() {
        return this.list.size();
    }

    @Override
    public T get(int n) {
        return this.list.get(n);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object == null || this.getClass() != object.getClass()) {
            return false;
        }
        AbstractValueList abstractValueList = (AbstractValueList)object;
        return Objects.equals(this.list, abstractValueList.list);
    }

    @Override
    public int hashCode() {
        return this.list.hashCode();
    }

    @Override
    public int indexOf(Object object) {
        return this.list.indexOf(object);
    }

    @Override
    public void clear() {
        AbstractValueList.throwException();
    }

    private static <T> T throwException() {
        throw new UnsupportedOperationException("Can't modify config entries");
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.list.lastIndexOf(object);
    }

    @Override
    public boolean isEmpty() {
        return this.list.isEmpty();
    }

    @Override
    public boolean add(T t) {
        return (Boolean)AbstractValueList.throwException();
    }

    @Override
    public void add(int n, T t) {
        AbstractValueList.throwException();
    }

    @Override
    public List<T> subList(int n, int n2) {
        return this.list.subList(n, n2);
    }

    @Override
    public <T> T[] toArray(T[] TArray) {
        return this.list.toArray(TArray);
    }

    @Override
    public Object[] toArray() {
        return this.list.toArray();
    }

    @Override
    public Iterator<T> iterator() {
        return this.list.iterator();
    }

    @Override
    public boolean contains(Object object) {
        return this.list.contains(object);
    }

    @Override
    public boolean addAll(int n, Collection<? extends T> collection) {
        return (Boolean)AbstractValueList.throwException();
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        return (Boolean)AbstractValueList.throwException();
    }

    @Override
    public T set(int n, T t) {
        return AbstractValueList.throwException();
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        return (Boolean)AbstractValueList.throwException();
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        return (Boolean)AbstractValueList.throwException();
    }

    @Override
    public ListIterator<T> listIterator(int n) {
        return this.list.listIterator(n);
    }

    @Override
    public ListIterator<T> listIterator() {
        return this.list.listIterator();
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.list.containsAll(collection);
    }
}

