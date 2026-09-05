/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.api.ConfigScreen
 */
package me.shedaniel.clothconfig2.gui.widget;

import com.google.common.collect.Iterators;
import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.ConfigScreen;
import me.shedaniel.clothconfig2.gui.widget.SearchFieldEntry;

class SearchFieldEntry$1
extends AbstractList<AbstractConfigEntry<AbstractConfigEntry<?>>> {
    final /* synthetic */ List val$entries;
    final /* synthetic */ ConfigScreen val$screen;
    final /* synthetic */ SearchFieldEntry this$0;

    SearchFieldEntry$1(SearchFieldEntry searchFieldEntry, List list, ConfigScreen configScreen) {
        this.this$0 = searchFieldEntry;
        this.val$entries = list;
        this.val$screen = configScreen;
    }

    @Override
    public AbstractConfigEntry<AbstractConfigEntry<?>> remove(int n) {
        AbstractConfigEntry<AbstractConfigEntry<?>> abstractConfigEntry = this.get(n);
        return this.val$entries.remove(abstractConfigEntry) ? abstractConfigEntry : null;
    }

    @Override
    public boolean remove(Object object) {
        return this.val$entries.remove(object);
    }

    @Override
    public int size() {
        return Iterators.size(this.iterator());
    }

    @Override
    public AbstractConfigEntry<AbstractConfigEntry<?>> get(int n) {
        return (AbstractConfigEntry)Iterators.get(this.iterator(), (int)n);
    }

    @Override
    public void clear() {
        this.val$entries.clear();
    }

    @Override
    public void add(int n, AbstractConfigEntry<AbstractConfigEntry<?>> abstractConfigEntry) {
        this.val$entries.add(n, abstractConfigEntry);
    }

    @Override
    public Iterator<AbstractConfigEntry<AbstractConfigEntry<?>>> iterator() {
        if (this.this$0.editBox.method_1882().isEmpty()) {
            return this.val$entries.iterator();
        }
        return Iterators.filter(this.val$entries.iterator(), abstractConfigEntry -> abstractConfigEntry.isDisplayed() && this.val$screen.matchesSearch(abstractConfigEntry.getSearchTags()));
    }
}

