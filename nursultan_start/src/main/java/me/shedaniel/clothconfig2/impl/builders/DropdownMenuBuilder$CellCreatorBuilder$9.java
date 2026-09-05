/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellCreator
 *  me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellElement
 *  minecraft.class01894
 *  minecraft.class04206
 *  minecraft.class06584
 *  minecraft.class07310
 */
package me.shedaniel.clothconfig2.impl.builders;

import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.impl.builders.DropdownMenuBuilder$CellCreatorBuilder$9$1;
import minecraft.class01894;
import minecraft.class04206;
import minecraft.class06584;
import minecraft.class07310;

class DropdownMenuBuilder$CellCreatorBuilder$9
extends DropdownBoxEntry.DefaultSelectionCellCreator<class01894> {
    final /* synthetic */ int val$cellHeight;
    final /* synthetic */ int val$cellWidth;
    final /* synthetic */ int val$maxItems;

    public DropdownBoxEntry.SelectionCellElement<class01894> create(class01894 class018942) {
        class06584 class065842 = new class06584((class07310)class04206.B.N(class018942));
        return new DropdownMenuBuilder$CellCreatorBuilder$9$1(this, class018942, this.toTextFunction, class065842);
    }

    DropdownMenuBuilder$CellCreatorBuilder$9(int n, int n2, int n3) {
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

