/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package minecraft;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.List;
import minecraft.class01202;
import minecraft.class01212;

class class01218<E>
extends AbstractList<E> {
    private final List<E> y = Lists.newArrayList();
    final /* synthetic */ class01212 N;

    class01218(class01212 class012122) {
        this.N = class012122;
    }

    @Override
    public int size() {
        return this.y.size();
    }

    @Override
    public E remove(int n) {
        return (E)((class01202)this.y.remove(n));
    }

    @Override
    public void add(int n, E e) {
        this.y.add(n, e);
        this.N.method_29621(e);
    }

    @Override
    public E get(int n) {
        return (E)((class01202)this.y.get(n));
    }

    @Override
    public E set(int n, E e) {
        class01202 class012022 = (class01202)this.y.set(n, e);
        this.N.method_29621(e);
        return (E)class012022;
    }
}

