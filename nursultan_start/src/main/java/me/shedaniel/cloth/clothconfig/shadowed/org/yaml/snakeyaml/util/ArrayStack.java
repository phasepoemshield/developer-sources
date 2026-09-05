/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.cloth.clothconfig.shadowed.org.yaml.snakeyaml.util;

import java.util.ArrayList;

public class ArrayStack<T> {
    private ArrayList<T> stack;

    public ArrayStack(int n) {
        this.stack = new ArrayList(n);
    }

    public void clear() {
        this.stack.clear();
    }

    public boolean isEmpty() {
        return this.stack.isEmpty();
    }

    public void push(T t) {
        this.stack.add(t);
    }

    public T pop() {
        return this.stack.remove(this.stack.size() - 1);
    }
}

