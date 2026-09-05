/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04664
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.List;
import java.util.Optional;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellElement;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04664;

public abstract class DropdownBoxEntry$SelectionTopCellElement<R>
extends class04664 {
    @Deprecated
    private final Rectangle bounds = new Rectangle();
    @Deprecated
    DropdownBoxEntry<R> entry;
    protected boolean isSelected = false;

    public abstract R getValue();

    public DropdownBoxEntry<R> getParent() {
        return this.entry;
    }

    public abstract void setValue(R var1);

    public boolean method_25405(double d, double d2) {
        return this.bounds.contains(d, d2);
    }

    public abstract void render(class01054 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8);

    public final boolean hasError() {
        return this.getError().isPresent();
    }

    public abstract Optional<class00392> getError();

    public boolean isEdited() {
        return this.getConfigError().isPresent();
    }

    public final Optional<class00392> getConfigError() {
        return this.entry.getConfigError();
    }

    public abstract class00392 getSearchTerm();

    void updateBounds(Rectangle rectangle) {
        this.bounds.setBounds(rectangle);
    }

    public final boolean isSuggestionMode() {
        return this.getParent().isSuggestionMode();
    }

    public final boolean hasConfigError() {
        return this.getConfigError().isPresent();
    }

    public final int getPreferredTextColor() {
        return this.getConfigError().isPresent() ? -43691 : -1;
    }

    public void selectFirstRecommendation() {
        List list = this.getParent().selectionElement.menu.method_25396();
        for (DropdownBoxEntry$SelectionCellElement dropdownBoxEntry$SelectionCellElement : list) {
            if (dropdownBoxEntry$SelectionCellElement.getSelection() == null) continue;
            this.setValue(dropdownBoxEntry$SelectionCellElement.getSelection());
            this.getParent().selectionElement.method_25395(null);
            break;
        }
    }
}

