/*
 * Decompiled with CFR 0.152.
 */
package Nursultan;

import java.util.Collection;
import java.util.LinkedList;

public class class11319<E>
extends LinkedList<E> {
    public Object N_0;

    public class11319(int n) {
        this.u();
        if (n <= 0) {
            throw new IllegalArgumentException("maxSize \u0434\u043e\u043b\u0436\u0435\u043d \u0431\u044b\u0442\u044c \u0431\u043e\u043b\u044c\u0448\u0435 0");
        }
        this.N_0 = n;
    }

    @Override
    public boolean add(E e) {
        super.add(e);
        this.i();
        return true;
    }

    @Override
    public void add(int n, E e) {
        super.add(n, e);
        this.i();
    }

    private void i() {
        while (this.N(this.size())) {
            this.removeFirst();
        }
    }

    @Override
    public boolean addAll(int n, Collection<? extends E> collection) {
        boolean bl = super.addAll(n, collection);
        if (bl) {
            this.i();
        }
        return bl;
    }

    @Override
    public boolean addAll(Collection<? extends E> collection) {
        boolean bl = super.addAll(collection);
        if (bl) {
            this.i();
        }
        return bl;
    }

    private void u() {
        this.N_0 = 0;
    }

    public boolean N(int n) {
        return n > (Integer)this.N_0;
    }
}

