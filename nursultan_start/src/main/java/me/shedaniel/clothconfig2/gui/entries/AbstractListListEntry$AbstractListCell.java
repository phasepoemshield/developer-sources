/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Rectangle
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Optional;
import me.shedaniel.clothconfig2.gui.entries.AbstractListListEntry;
import me.shedaniel.clothconfig2.gui.entries.BaseListCell;
import me.shedaniel.math.Rectangle;

public abstract class AbstractListListEntry$AbstractListCell<T, SELF extends AbstractListListEntry$AbstractListCell<T, SELF, OUTER_SELF>, OUTER_SELF extends AbstractListListEntry<T, SELF, OUTER_SELF>>
extends BaseListCell {
    protected final OUTER_SELF listListEntry;
    protected final Rectangle cellBounds = new Rectangle();

    public AbstractListListEntry$AbstractListCell(T t, OUTER_SELF OUTER_SELF) {
        this.listListEntry = OUTER_SELF;
        this.setErrorSupplier(() -> Optional.ofNullable(abstractListListEntry.cellErrorSupplier).flatMap(function -> (Optional)function.apply(this.getValue())));
    }

    public abstract T getValue();

    public boolean method_25405(double d, double d2) {
        return this.cellBounds.contains(d, d2);
    }

    @Override
    public void updateBounds(boolean bl, int n, int n2, int n3, int n4) {
        if (bl) {
            this.cellBounds.setBounds(n, n2, n3, n4);
        } else {
            this.cellBounds.setBounds(0, 0, 0, 0);
        }
    }
}

