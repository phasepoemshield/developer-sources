/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.function.Function;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DefaultSelectionCellElement;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellCreator;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellElement;
import minecraft.class00392;

public class DropdownBoxEntry$DefaultSelectionCellCreator<R>
extends DropdownBoxEntry$SelectionCellCreator<R> {
    protected Function<R, class00392> toTextFunction;

    @Override
    public DropdownBoxEntry$SelectionCellElement<R> create(R r) {
        return new DropdownBoxEntry$DefaultSelectionCellElement<R>(r, this.toTextFunction);
    }

    public DropdownBoxEntry$DefaultSelectionCellCreator(Function<R, class00392> function) {
        this.toTextFunction = function;
    }

    public DropdownBoxEntry$DefaultSelectionCellCreator() {
        this(object -> class00392.y((String)object.toString()));
    }

    @Override
    public int getCellHeight() {
        return 14;
    }

    @Override
    public int getDropBoxMaxHeight() {
        return this.getCellHeight() * 7;
    }
}

