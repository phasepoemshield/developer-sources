/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Iterators
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.Iterators;
import java.util.AbstractList;
import java.util.Iterator;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.gui.entries.SubCategoryListEntry;

class SubCategoryListEntry$1
extends AbstractList<AbstractConfigListEntry> {
    final /* synthetic */ SubCategoryListEntry this$0;

    SubCategoryListEntry$1(SubCategoryListEntry subCategoryListEntry) {
        this.this$0 = subCategoryListEntry;
    }

    @Override
    public int size() {
        return Iterators.size(this.iterator());
    }

    @Override
    public AbstractConfigListEntry get(int n) {
        return (AbstractConfigListEntry)Iterators.get(this.iterator(), (int)n);
    }

    @Override
    public Iterator<AbstractConfigListEntry> iterator() {
        return Iterators.filter(this.this$0.entries.iterator(), abstractConfigListEntry -> abstractConfigListEntry.isDisplayed() && this.this$0.getConfigScreen() != null && this.this$0.getConfigScreen().matchesSearch(abstractConfigListEntry.getSearchTags()));
    }
}

