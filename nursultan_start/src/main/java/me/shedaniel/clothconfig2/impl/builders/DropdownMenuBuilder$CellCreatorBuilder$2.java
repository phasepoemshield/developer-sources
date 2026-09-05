/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellCreator
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.function.Function;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;

class DropdownMenuBuilder$CellCreatorBuilder$2
extends DropdownBoxEntry.DefaultSelectionCellCreator<T> {
    final /* synthetic */ int val$cellWidth;

    DropdownMenuBuilder$CellCreatorBuilder$2(Function function, int n) {
        this.val$cellWidth = n;
        super(function);
    }

    public int getCellWidth() {
        return this.val$cellWidth;
    }
}

