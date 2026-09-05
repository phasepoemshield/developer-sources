/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class05905
 */
package minecraft;

import java.util.Iterator;
import java.util.NoSuchElementException;
import minecraft.class05905;

class class05897<T>
implements Iterator<T> {
    private int y;
    private int L = -1;
    final /* synthetic */ class05905 N;

    class05897(class05905 class059052) {
        this.N = class059052;
    }

    @Override
    public void remove() {
        if (this.L == -1) {
            throw new IllegalStateException();
        }
        this.N.y(this.L);
        --this.y;
        this.L = -1;
    }

    @Override
    public boolean hasNext() {
        return this.y < this.N.y;
    }

    @Override
    public T next() {
        if (this.y >= this.N.y) {
            throw new NoSuchElementException();
        }
        this.L = this.y++;
        return (T)this.N.N[this.L];
    }
}

