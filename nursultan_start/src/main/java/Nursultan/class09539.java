/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class02657
 *  minecraft.class04189
 *  org.jspecify.annotations.Nullable
 */
package Nursultan;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import minecraft.class02657;
import minecraft.class04189;
import org.jspecify.annotations.Nullable;

public class class09539<T>
extends AbstractList<T>
implements class02657<T> {
    private final class04189<T> y;
    final /* synthetic */ class04189 N;

    /*
     * Ignored method signature, as it can't be verified against descriptor
     */
    public class09539(class04189 class041892, class04189 class041893) {
        this.N = class041892;
        this.y = class041893;
    }

    @Override
    public T remove(int n) {
        return (T)this.y.remove(this.N(n));
    }

    @Override
    public int size() {
        return this.y.size();
    }

    @Override
    public T get(int n) {
        return (T)this.y.get(this.N(n));
    }

    @Override
    public int indexOf(Object object) {
        return this.N(this.y.lastIndexOf(object));
    }

    @Override
    public void clear() {
        this.y.clear();
    }

    @Override
    public int lastIndexOf(Object object) {
        return this.N(this.y.indexOf(object));
    }

    @Override
    public boolean isEmpty() {
        return this.y.isEmpty();
    }

    @Override
    public void add(int n, T t) {
        this.y.add(this.N(n) + 1, t);
    }

    @Override
    public List<T> subList(int n, int n2) {
        return this.y.subList(this.N(n2) + 1, this.N(n) + 1).reversed();
    }

    @Override
    public Iterator<T> iterator() {
        return this.y.descendingIterator();
    }

    @Override
    public boolean contains(Object object) {
        return this.y.contains(object);
    }

    @Override
    public T set(int n, T t) {
        return (T)this.y.set(this.N(n), t);
    }

    public class02657<T> y() {
        return this.y;
    }

    public T getFirst() {
        return (T)this.y.getLast();
    }

    public T getLast() {
        return (T)this.y.getFirst();
    }

    public void addFirst(T t) {
        this.y.addLast(t);
    }

    public void addLast(T t) {
        this.y.addFirst(t);
    }

    public T removeFirst() {
        return (T)this.y.removeLast();
    }

    public T removeLast() {
        return (T)this.y.removeFirst();
    }

    public @Nullable T pollFirst() {
        return (T)this.y.pollLast();
    }

    public @Nullable T pollLast() {
        return (T)this.y.pollFirst();
    }

    public boolean offerLast(T t) {
        return this.y.offerFirst(t);
    }

    public @Nullable T peekFirst() {
        return (T)this.y.peekLast();
    }

    public boolean removeFirstOccurrence(Object object) {
        return this.y.removeLastOccurrence(object);
    }

    public boolean offerFirst(T t) {
        return this.y.offerLast(t);
    }

    public @Nullable T peekLast() {
        return (T)this.y.peekFirst();
    }

    public boolean removeLastOccurrence(Object object) {
        return this.y.removeFirstOccurrence(object);
    }

    public Iterator<T> descendingIterator() {
        return this.y.iterator();
    }

    private int N(int n) {
        return n == -1 ? -1 : this.y.size() - 1 - n;
    }
}

