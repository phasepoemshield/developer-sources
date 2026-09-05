/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  me.shedaniel.math.Rectangle
 *  minecraft.class01054
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class04664
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.ImmutableList;
import java.util.List;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellCreator;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellElement;
import me.shedaniel.math.Rectangle;
import minecraft.class01054;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class04664;

public abstract class DropdownBoxEntry$DropdownMenuElement<R>
extends class04664 {
    @Deprecated
    DropdownBoxEntry$SelectionCellCreator<R> cellCreator;
    @Deprecated
    DropdownBoxEntry<R> entry;
    boolean isSelected;

    public final DropdownBoxEntry<R> getEntry() {
        return this.entry;
    }

    public abstract List<DropdownBoxEntry$SelectionCellElement<R>> method_25396();

    public class02106 method_48205(class02089 class020892) {
        return null;
    }

    public abstract void render(class01054 var1, int var2, int var3, Rectangle var4, float var5);

    public abstract void initCells();

    public final boolean isExpanded() {
        return this.isSelected && this.getEntry().method_25399() == this.getEntry().selectionElement;
    }

    public abstract void lateRender(class01054 var1, int var2, int var3, float var4);

    public DropdownBoxEntry$SelectionCellCreator<R> getCellCreator() {
        return this.cellCreator;
    }

    public abstract ImmutableList<R> getSelections();

    public final boolean isSuggestionMode() {
        return this.entry.isSuggestionMode();
    }

    public abstract int getHeight();
}

