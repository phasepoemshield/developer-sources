/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellCreator
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellElement
 *  minecraft.class06581
 *  minecraft.class06584
 *  minecraft.class07310
 */
package me.shedaniel.clothconfig2.impl.builders;

import java.util.function.Function;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$11$1;
import minecraft.class06581;
import minecraft.class06584;
import minecraft.class07310;

class DropdownMenuBuilder$CellCreatorBuilder$11
extends DropdownBoxEntry.DefaultSelectionCellCreator<class06581> {
    final /* synthetic */ int val$cellHeight;
    final /* synthetic */ int val$cellWidth;
    final /* synthetic */ int val$maxItems;

    public DropdownBoxEntry.SelectionCellElement<class06581> create(class06581 class065812) {
        class06584 class065842 = new class06584((class07310)class065812);
        return new DropdownMenuBuilder$CellCreatorBuilder$11$1(this, class065812, this.toTextFunction, class065842);
    }

    DropdownMenuBuilder$CellCreatorBuilder$11(Function function, int n, int n2, int n3) {
        this.val$cellHeight = n;
        this.val$cellWidth = n2;
        this.val$maxItems = n3;
        super(function);
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

