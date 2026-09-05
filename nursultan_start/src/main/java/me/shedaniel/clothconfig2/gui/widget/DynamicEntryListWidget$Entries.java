/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package me.shedaniel.clothconfig2.gui.widget;

import com.google.common.collect.Lists;
import java.util.AbstractList;
import java.util.ArrayList;
import me.shedaniel.clothconfig2.gui.widget.DynamicEntryListWidget;
import me.shedaniel.clothconfig2.gui.widget.DynamicEntryListWidget$Entry;

class DynamicEntryListWidget$Entries
extends AbstractList<E> {
    private final ArrayList<E> items = Lists.newArrayList();
    final /* synthetic */ DynamicEntryListWidget this$0;

    DynamicEntryListWidget$Entries(DynamicEntryListWidget dynamicEntryListWidget) {
        this.this$0 = dynamicEntryListWidget;
    }

    @Override
    public E remove(int n) {
        return (DynamicEntryListWidget$Entry)this.items.remove(n);
    }

    @Override
    public int size() {
        return this.items.size();
    }

    @Override
    public E get(int n) {
        return (DynamicEntryListWidget$Entry)this.items.get(n);
    }

    @Override
    public void clear() {
        this.items.clear();
    }

    @Override
    public void add(int n, E e) {
        this.items.add(n, e);
        ((DynamicEntryListWidget$Entry)e).parent = this.this$0;
    }

    @Override
    public E set(int n, E e) {
        DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry = (DynamicEntryListWidget$Entry)this.items.set(n, e);
        ((DynamicEntryListWidget$Entry)e).parent = this.this$0;
        return dynamicEntryListWidget$Entry;
    }
}

