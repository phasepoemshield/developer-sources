/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  Nursultan.class09537
 *  Nursultan.class09539
 *  minecraft.class02657
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import Nursultan.class09537;
import Nursultan.class09539;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import minecraft.class02657;
import org.jspecify.annotations.Nullable;

public class class04189<T>
extends AbstractList<T>
implements class02657<T> {
    private static final int N = 1;
    private @Nullable Object[] y;
    private int L;
    private int u;

    private void L() {
        Object[] objectArray = new Object[this.y.length + Math.max(this.y.length >> 1, 1)];
        this.N(objectArray, this.u);
        this.L = 0;
        this.y = objectArray;
    }

    private T L(int n) {
        return (T)this.y[n];
    }

    public class04189() {
        this(1);
    }

    public class04189(int n) {
        this.y = new Object[n];
        this.L = 0;
        this.u = 0;
    }

    @Override
    public T remove(int n) {
        this.y(n);
        int n2 = this.N(n);
        T t = this.L(n2);
        if (n == 0) {
            this.y[n2] = null;
            ++this.L;
        } else if (n == this.u - 1) {
            this.y[n2] = null;
        } else {
            for (int i = n + 1; i < this.u; ++i) {
                this.y[this.N((int)(i - 1))] = this.get(i);
            }
            this.y[this.N((int)(this.u - 1))] = null;
        }
        ++this.modCount;
        --this.u;
        return t;
    }

    @Override
    public int size() {
        return this.u;
    }

    @Override
    public T get(int n) {
        this.y(n);
        return this.L(this.N(n));
    }

    @Override
    public void replaceAll(UnaryOperator<T> unaryOperator) {
        for (int i = 0; i < this.u; ++i) {
            int n = this.N(i);
            this.y[n] = Objects.requireNonNull(unaryOperator.apply(this.L(i)));
        }
    }

    @Override
    public void add(int n, T t) {
        class04189.N(n, this.u + 1);
        Objects.requireNonNull(t);
        if (this.u == this.y.length) {
            this.L();
        }
        int n2 = this.N(n);
        if (n == this.u) {
            this.y[n2] = t;
        } else if (n == 0) {
            --this.L;
            if (this.L < 0) {
                this.L += this.y.length;
            }
            this.y[this.N((int)0)] = t;
        } else {
            for (int i = this.u - 1; i >= n; --i) {
                this.y[this.N((int)(i + 1))] = this.y[this.N(i)];
            }
            this.y[n2] = t;
        }
        ++this.modCount;
        ++this.u;
    }

    @Override
    public T set(int n, T t) {
        this.y(n);
        Objects.requireNonNull(t);
        int n2 = this.N(n);
        T t2 = this.L(n2);
        this.y[n2] = t;
        return t2;
    }

    @Override
    public void forEach(Consumer<? super T> consumer) {
        for (int i = 0; i < this.u; ++i) {
            consumer.accept(this.get(i));
        }
    }

    private void y(int n) {
        class04189.N(n, this.u);
    }

    public class02657<T> y() {
        return new class09539(this, this);
    }

    @Override
    public boolean removeIf(Predicate<? super T> predicate) {
        int n = 0;
        for (int i = 0; i < this.u; ++i) {
            T t = this.get(i);
            if (predicate.test(t)) {
                ++n;
                continue;
            }
            if (n == 0) continue;
            this.y[this.N((int)(i - n))] = t;
            this.y[this.N((int)i)] = null;
        }
        this.modCount += n;
        this.u -= n;
        return n != 0;
    }

    public T getFirst() {
        if (this.u == 0) {
            throw new NoSuchElementException();
        }
        return this.get(0);
    }

    public T getLast() {
        if (this.u == 0) {
            throw new NoSuchElementException();
        }
        return this.get(this.u - 1);
    }

    public void addFirst(T t) {
        this.add(0, t);
    }

    public void addLast(T t) {
        this.add(this.u, t);
    }

    public T removeFirst() {
        if (this.u == 0) {
            throw new NoSuchElementException();
        }
        return this.remove(0);
    }

    public T removeLast() {
        if (this.u == 0) {
            throw new NoSuchElementException();
        }
        return this.remove(this.u - 1);
    }

    public @Nullable T pollFirst() {
        if (this.u == 0) {
            return null;
        }
        return this.removeFirst();
    }

    public @Nullable T pollLast() {
        if (this.u == 0) {
            return null;
        }
        return this.removeLast();
    }

    public boolean offerLast(T t) {
        this.addLast(t);
        return true;
    }

    public @Nullable T peekFirst() {
        if (this.u == 0) {
            return null;
        }
        return this.getFirst();
    }

    public boolean removeFirstOccurrence(Object object) {
        for (int i = 0; i < this.u; ++i) {
            T t = this.get(i);
            if (!Objects.equals(object, t)) continue;
            this.remove(i);
            return true;
        }
        return false;
    }

    public boolean offerFirst(T t) {
        this.addFirst(t);
        return true;
    }

    public @Nullable T peekLast() {
        if (this.u == 0) {
            return null;
        }
        return this.getLast();
    }

    public boolean removeLastOccurrence(Object object) {
        for (int i = this.u - 1; i >= 0; --i) {
            T t = this.get(i);
            if (!Objects.equals(object, t)) continue;
            this.remove(i);
            return true;
        }
        return false;
    }

    public Iterator<T> descendingIterator() {
        return new class09537(this);
    }

    private void N(Object[] objectArray, int n) {
        for (int i = 0; i < n; ++i) {
            objectArray[i] = this.get(i);
        }
    }

    public int N() {
        return this.y.length;
    }

    private int N(int n) {
        return (n + this.L) % this.y.length;
    }

    private static void N(int n, int n2) {
        if (n < 0 || n >= n2) {
            throw new IndexOutOfBoundsException(n);
        }
    }
}

