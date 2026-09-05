/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  it.unimi.dsi.fastutil.objects.ObjectArrays
 *  minecraft.class05897
 *  minecraft.class07536
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import it.unimi.dsi.fastutil.objects.ObjectArrays;
import java.util.AbstractSet;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;
import minecraft.class05897;
import minecraft.class07536;
import org.jspecify.annotations.Nullable;

public class class05905<T>
extends AbstractSet<T>
implements Collection {
    private static final int L = 10;
    private final Comparator<T> u;
    T[] N;
    int y;

    private int L(T t) {
        return Arrays.binarySearch(this.N, 0, this.y, t, this.u);
    }

    private static int L(int n) {
        return -n - 1;
    }

    public T L() {
        return this.i(this.y - 1);
    }

    public class05905(int n, Comparator<T> comparator) {
        this.u = comparator;
        if (n < 0) {
            throw new IllegalArgumentException("Initial capacity (" + n + ") is negative");
        }
        this.N = class05905.N(new Object[n]);
    }

    @Override
    public boolean remove(Object object) {
        int n = this.L(object);
        if (n >= 0) {
            this.y(n);
            return true;
        }
        return false;
    }

    @Override
    public int size() {
        return this.y;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) {
            return true;
        }
        if (object instanceof class05905) {
            class05905 class059052 = (class05905)object;
            if (this.u.equals(class059052.u)) {
                return this.y == class059052.y && Arrays.equals(this.N, class059052.N);
            }
        }
        return super.equals(object);
    }

    @Override
    public void clear() {
        Arrays.fill(this.N, 0, this.y, null);
        this.y = 0;
    }

    @Override
    public boolean add(T t) {
        int n = this.L(t);
        if (n >= 0) {
            return false;
        }
        int n2 = class05905.L(n);
        this.N(t, n2);
        return true;
    }

    @Override
    public Object[] toArray() {
        return Arrays.copyOf(this.N, this.y, Object[].class);
    }

    @Override
    public <U> U[] toArray(U[] UArray) {
        if (UArray.length < this.y) {
            return Arrays.copyOf(this.N, this.y, UArray.getClass());
        }
        System.arraycopy(this.N, 0, UArray, 0, this.y);
        if (UArray.length > this.y) {
            UArray[this.y] = null;
        }
        return UArray;
    }

    @Override
    public Iterator<T> iterator() {
        return new class05897(this);
    }

    private T i(int n) {
        return this.N[n];
    }

    @Override
    public boolean contains(Object object) {
        return this.L(object) >= 0;
    }

    private void u(int n) {
        if (n <= this.N.length) {
            return;
        }
        if (this.N != ObjectArrays.DEFAULT_EMPTY_ARRAY) {
            n = class07536.N((int)this.N.length, (int)n);
        } else if (n < 10) {
            n = 10;
        }
        Object[] objectArray = new Object[n];
        System.arraycopy(this.N, 0, objectArray, 0, this.y);
        this.N = class05905.N(objectArray);
    }

    void y(int n) {
        --this.y;
        if (n != this.y) {
            System.arraycopy(this.N, n + 1, this.N, n, this.y - n);
        }
        this.N[this.y] = null;
    }

    public T y() {
        return this.i(0);
    }

    public @Nullable T y(T t) {
        int n = this.L(t);
        if (n >= 0) {
            return this.i(n);
        }
        return null;
    }

    public boolean removeIf(Predicate predicate) {
        T[] TArray = this.N;
        int n = this.y;
        int n2 = 0;
        for (int i = 0; i < n; ++i) {
            T t = TArray[i];
            if (predicate.test(t)) continue;
            if (n2 != i) {
                TArray[n2] = t;
            }
            ++n2;
        }
        this.y = n2;
        return n != n2;
    }

    public static <T> class05905<T> N(Comparator<T> comparator) {
        return class05905.N(comparator, 10);
    }

    public static <T extends Comparable<T>> class05905<T> N(int n) {
        return new class05905(n, Comparator.naturalOrder());
    }

    public static <T extends Comparable<T>> class05905<T> N() {
        return class05905.N(10);
    }

    public T N(T t) {
        int n = this.L(t);
        if (n >= 0) {
            return this.i(n);
        }
        this.N(t, class05905.L(n));
        return t;
    }

    public static <T> class05905<T> N(Comparator<T> comparator, int n) {
        return new class05905<T>(n, comparator);
    }

    private static <T> T[] N(Object[] objectArray) {
        return objectArray;
    }

    private void N(T t, int n) {
        this.u(this.y + 1);
        if (n != this.y) {
            System.arraycopy(this.N, n, this.N, n + 1, this.y - n);
        }
        this.N[n] = t;
        ++this.y;
    }
}

