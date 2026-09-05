/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jspecify.annotations.Nullable
 */
package minecraft;

import java.io.Serializable;
import java.util.Deque;
import java.util.List;
import java.util.RandomAccess;
import org.jspecify.annotations.Nullable;

public interface class02657<T>
extends Serializable,
Cloneable,
Deque<T>,
List<T>,
RandomAccess {
    @Override
    default public T remove() {
        return this.removeFirst();
    }

    @Override
    default public @Nullable T peek() {
        return (T)this.peekFirst();
    }

    public class02657<T> y();

    @Override
    public T getFirst();

    @Override
    public T getLast();

    @Override
    default public T element() {
        return this.getFirst();
    }

    @Override
    public void addFirst(T var1);

    @Override
    public void addLast(T var1);

    @Override
    public T removeFirst();

    @Override
    public T removeLast();

    @Override
    default public @Nullable T poll() {
        return (T)this.pollFirst();
    }

    @Override
    default public void push(T t) {
        this.addFirst(t);
    }

    @Override
    default public T pop() {
        return this.removeFirst();
    }

    @Override
    default public boolean offer(T t) {
        return this.offerLast(t);
    }
}

