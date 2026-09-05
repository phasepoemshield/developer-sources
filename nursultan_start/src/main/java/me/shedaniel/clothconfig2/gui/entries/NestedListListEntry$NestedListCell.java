/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.AbstractConfigEntry
 *  me.shedaniel.clothconfig2.api.AbstractConfigListEntry
 *  me.shedaniel.clothconfig2.api.ReferenceProvider
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class04654
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Collections;
import java.util.List;
import java.util.Optional;
import me.shedaniel.clothconfig2.api.AbstractConfigEntry;
import me.shedaniel.clothconfig2.api.AbstractConfigListEntry;
import me.shedaniel.clothconfig2.api.ReferenceProvider;
import me.shedaniel.clothconfig2.gui.entries.AbstractListListEntry$AbstractListCell;
import me.shedaniel.clothconfig2.gui.entries.NestedListListEntry;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class04654;

public class NestedListListEntry$NestedListCell<T, INNER extends AbstractConfigListEntry<T>>
extends AbstractListListEntry$AbstractListCell<T, NestedListListEntry$NestedListCell<T, INNER>, NestedListListEntry<T, INNER>>
implements ReferenceProvider<T> {
    final INNER nestedEntry;

    public NestedListListEntry$NestedListCell(T t, NestedListListEntry<T, INNER> nestedListListEntry, INNER INNER) {
        super(t, nestedListListEntry);
        this.nestedEntry = INNER;
    }

    @Override
    public T getValue() {
        return (T)this.nestedEntry.getValue();
    }

    public List<? extends class04654> method_25396() {
        return Collections.singletonList(this.nestedEntry);
    }

    public void method_37020(class03428 class034282) {
    }

    public class03432 method_37018() {
        return class03432.field_33784;
    }

    @Override
    public boolean method_25405(double d, double d2) {
        return super.method_25405(d, d2) || this.nestedEntry.method_25405(d, d2);
    }

    @Override
    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        this.nestedEntry.setParent(((NestedListListEntry)this.listListEntry).getParent());
        this.nestedEntry.setScreen(((NestedListListEntry)this.listListEntry).getConfigScreen());
        this.nestedEntry.render(class010542, n, n2, n3, n4, n5, n6, n7, bl, f);
    }

    @Override
    public void onDelete() {
        super.onDelete();
        ((NestedListListEntry)this.listListEntry).referencableEntries.remove(this.nestedEntry);
        ((NestedListListEntry)this.listListEntry).requestReferenceRebuilding();
    }

    @Override
    public void onAdd() {
        super.onAdd();
        ((NestedListListEntry)this.listListEntry).referencableEntries.add((ReferenceProvider<?>)this.nestedEntry);
        ((NestedListListEntry)this.listListEntry).requestReferenceRebuilding();
    }

    @Override
    public Optional<class00392> getError() {
        return this.nestedEntry.getError();
    }

    @Override
    public boolean isEdited() {
        return super.isEdited() || this.nestedEntry.isEdited();
    }

    @Override
    public boolean isRequiresRestart() {
        return this.nestedEntry.isRequiresRestart();
    }

    @Override
    public void updateSelected(boolean bl) {
        this.nestedEntry.updateSelected(bl);
    }

    @Override
    public void updateBounds(boolean bl, int n, int n2, int n3, int n4) {
        super.updateBounds(bl, n, n2, n3, n4);
        if (bl) {
            this.nestedEntry.setBounds(new Rectangle(n, n2, n3, this.nestedEntry.getItemHeight()));
        } else {
            this.nestedEntry.setBounds(new Rectangle());
        }
    }

    @Override
    public int getCellHeight() {
        return this.nestedEntry.getItemHeight();
    }

    public AbstractConfigEntry<T> provideReferenceEntry() {
        return this.nestedEntry;
    }
}

