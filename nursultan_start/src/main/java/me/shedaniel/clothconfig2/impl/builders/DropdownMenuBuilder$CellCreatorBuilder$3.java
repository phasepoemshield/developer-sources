/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellCreator
 */
package me.shedaniel.clothconfig2.impl.builders;

import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;

class DropdownMenuBuilder$CellCreatorBuilder$3
extends DropdownBoxEntry.DefaultSelectionCellCreator<T> {
    final /* synthetic */ int val$maxItems;

    DropdownMenuBuilder$CellCreatorBuilder$3(int n) {
        this.val$maxItems = n;
    }

    public int getDropBoxMaxHeight() {
        return this.getCellHeight() * this.val$maxItems;
    }
}

