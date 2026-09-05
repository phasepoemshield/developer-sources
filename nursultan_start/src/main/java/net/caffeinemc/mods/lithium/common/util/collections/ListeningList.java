/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;
import net.caffeinemc.mods.lithium.common.util.collections.ListeningList$1;

public class ListeningList<T>
implements List<T> {
    final List<T> delegate;
    private final Runnable changeCallback;

    protected void onChange() {
        this.changeCallback.run();
    }

    public ListeningList(List<T> list, Runnable runnable) {
        this.delegate = list;
        this.changeCallback = runnable;
    }

    @Override
    public T remove(int n) {
        T t = this.delegate.remove(n);
        this.onChange();
        return t;
    }

    @Override
    public boolean remove(Object object) {
        boolean bl = this.delegate.remove(object);
        this.onChange();
        return bl;
    }

    @Override
    public int size() {
        return this.delegate.size();
    }

    @Override
    public T get(int n) {
        return this.delegate.get(n);
    }

    @Override
    public int indexOf(Object object) {
        return this.delegate.indexOf(object);
    }

    @Override
    public void clear() {
        this.delegate.clear();
        this.onChange();
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.delegate.lastIndexOf(object);
    }

    @Override
    public boolean isEmpty() {
        return this.delegate.isEmpty();
    }

    @Override
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        this.delegate.replaceAll(unaryOperator);
        this.onChange();
    }

    @Override
    public boolean add(T t) {
        boolean bl = this.delegate.add(t);
        this.onChange();
        return bl;
    }

    @Override
    public void add(int n, T t) {
        this.delegate.add(n, t);
        this.onChange();
    }

    @Override
    public List<T> subList(int n, int n2) {
        throw new UnsupportedOperationException();
    }

    @Override
    public Object[] toArray() {
        return this.delegate.toArray();
    }

    @Override
    public <T1> T1[] toArray(T1[] T1Array) {
        return this.delegate.toArray(T1Array);
    }

    @Override
    public Iterator<T> iterator() {
        return this.listIterator();
    }

    @Override
    public Stream<T> stream() {
        return this.delegate.stream();
    }

    @Override
    public boolean contains(Object object) {
        return this.delegate.contains(object);
    }

    @Override
    public Spliterator<T> spliterator() {
        return this.delegate.spliterator();
    }

    @Override
    public boolean addAll(Collection<? extends T> collection) {
        boolean bl = this.delegate.addAll(collection);
        this.onChange();
        return bl;
    }

    @Override
    public boolean addAll(int n, Collection<? extends T> collection) {
        boolean bl = this.delegate.addAll(n, collection);
        this.onChange();
        return bl;
    }

    @Override
    public T set(int n, T t) {
        T t2 = this.delegate.set(n, t);
        this.onChange();
        return t2;
    }

    @Override
    public void forEach(Consumer<? super T> consumer) {
        this.delegate.forEach(consumer);
    }

    @Override
    public void sort(Comparator<? super T> comparator) {
        this.delegate.sort(comparator);
        this.onChange();
    }

    @Override
    public Stream<T> parallelStream() {
        return this.delegate.parallelStream();
    }

    @Override
    public boolean removeIf(Predicate<? super T> predicate) {
        boolean bl = this.delegate.removeIf(predicate);
        this.onChange();
        return bl;
    }

    @Override
    public boolean removeAll(Collection<?> collection) {
        boolean bl = this.delegate.removeAll(collection);
        this.onChange();
        return bl;
    }

    @Override
    public boolean retainAll(Collection<?> collection) {
        boolean bl = this.delegate.retainAll(collection);
        this.onChange();
        return bl;
    }

    @Override
    public ListIterator<T> listIterator() {
        return this.listIterator(0);
    }

    @Override
    public ListIterator<T> listIterator(int n) {
        return new ListeningList$1(this, n);
    }

    @Override
    public boolean containsAll(Collection<?> collection) {
        return this.delegate.containsAll(collection);
    }
}

