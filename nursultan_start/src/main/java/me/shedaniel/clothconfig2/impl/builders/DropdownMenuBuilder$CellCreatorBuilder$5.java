/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellCreator
 */
package me.shedaniel.clothconfig2.impl.builders;

import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;

class DropdownMenuBuilder$CellCreatorBuilder$5
extends DropdownBoxEntry.DefaultSelectionCellCreator<T> {
    final /* synthetic */ int val$cellWidth;
    final /* synthetic */ int val$maxItems;

    DropdownMenuBuilder$CellCreatorBuilder$5(int n, int n2) {
        this.val$cellWidth = n;
        this.val$maxItems = n2;
    }

    public int getCellWidth() {
        return this.val$cellWidth;
    }

    public int getDropBoxMaxHeight() {
        return this.getCellHeight() * this.val$maxItems;
    }
}

