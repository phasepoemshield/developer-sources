/*
 * Decompiled with CFR 0.152.
 */
package net.caffeinemc.mods.lithium.common.util.collections;

import java.util.AbstractList;
import java.util.ArrayList;
import java.util.function.Predicate;
import net.caffeinemc.mods.lithium.common.util.collections.PredicateFilterableList;

public class PredicateFilterableList$PredicateFilteredList
extends AbstractList<T> {
    private final Predicate<T> predicate;
    private final ArrayList<T> delegate;
    private int filteredUpToIndex;
    final /* synthetic */ PredicateFilterableList this$0;

    PredicateFilterableList$PredicateFilteredList(PredicateFilterableList predicateFilterableList, Predicate<T> predicate) {
        this.this$0 = predicateFilterableList;
        this.predicate = predicate;
        this.delegate = new ArrayList();
        this.filteredUpToIndex = 0;
    }

    @Override
    public int size() {
        throw new UnsupportedOperationException();
    }

    @Override
    public T get(int n) {
        while (n >= this.delegate.size()) {
            if (this.filteredUpToIndex >= this.this$0.size()) {
                return null;
            }
            Object object = this.this$0.get(this.filteredUpToIndex);
            ++this.filteredUpToIndex;
            if (!this.predicate.test(object)) continue;
            this.delegate.add(object);
        }
        return this.delegate.get(n);
    }
}

