/*
 * Decompiled with CFR 0.152.
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellElement;

public abstract class DropdownBoxEntry$SelectionCellCreator<R> {
    public abstract DropdownBoxEntry$SelectionCellElement<R> create(R var1);

    public int getCellWidth() {
        return 132;
    }

    public abstract int getCellHeight();

    public abstract int getDropBoxMaxHeight();
}

