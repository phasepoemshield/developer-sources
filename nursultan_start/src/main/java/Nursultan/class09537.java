/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class04189
 */
package Nursultan;

import java.util.Iterator;
import minecraft.class04189;

public class class09537<T>
implements Iterator<T> {
    private int y;
    final /* synthetic */ class04189 N;

    public class09537(class04189 class041892) {
        this.N = class041892;
        this.y = class041892.size() - 1;
    }

    @Override
    public void remove() {
        this.N.remove(this.y + 1);
    }

    @Override
    public boolean hasNext() {
        return this.y >= 0;
    }

    @Override
    public T next() {
        return (T)this.N.get(this.y--);
    }
}

