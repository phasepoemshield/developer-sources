/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellCreator
 */
package me.shedaniel.clothconfig2.impl.builders;

import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;

class DropdownMenuBuilder$CellCreatorBuilder$7
extends DropdownBoxEntry.DefaultSelectionCellCreator<T> {
    final /* synthetic */ int val$cellHeight;
    final /* synthetic */ int val$cellWidth;
    final /* synthetic */ int val$maxItems;

    DropdownMenuBuilder$CellCreatorBuilder$7(int n, int n2, int n3) {
        this.val$cellHeight = n;
        this.val$cellWidth = n2;
        this.val$maxItems = n3;
    }

    public int getCellWidth() {
        return this.val$cellWidth;
    }

    public int getCellHeight() {
        return this.val$cellHeight;
    }

    public int getDropBoxMaxHeight() {
        return this.getCellHeight() * this.val$maxItems;
    }
}

