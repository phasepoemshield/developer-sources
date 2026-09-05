/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.sodium.client.util.iterator;

import java.util.Iterator;
import net.caffeinemc.mods.sodium.client.util.iterator.WrappedIterator$Exception;

public class WrappedIterator<T>
implements Iterator<T> {
    private final Iterator<T> delegate;

    public static <T> WrappedIterator<T> create(Iterable<T> iterable) {
        return new WrappedIterator<T>(iterable.iterator());
    }

    private WrappedIterator(Iterator<T> iterator) {
        this.delegate = iterator;
    }

    @Override
    public boolean hasNext() {
        try {
            return this.delegate.hasNext();
        }
        catch (Throwable throwable) {
            throw new WrappedIterator$Exception("Iterator#hasNext() threw unhandled exception", throwable);
        }
    }

    @Override
    public T next() {
        try {
            return this.delegate.next();
        }
        catch (Throwable throwable) {
            throw new WrappedIterator$Exception("Iterator#next() threw unhandled exception", throwable);
        }
    }
}

