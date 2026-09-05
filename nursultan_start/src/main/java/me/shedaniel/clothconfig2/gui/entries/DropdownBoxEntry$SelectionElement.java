/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 *  me.shedaniel.math.Rectangle
 *  minecraft.class01054
 *  minecraft.class01294
 *  minecraft.class04654
 *  minecraft.class04664
 *  minecraft.class06613
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.Lists;
import java.util.List;
import java.util.Objects;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DropdownMenuElement;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellCreator;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionTopCellElement;
import me.shedaniel.math.Rectangle;
import minecraft.class01054;
import minecraft.class01294;
import minecraft.class04654;
import minecraft.class04664;
import minecraft.class06613;

public class DropdownBoxEntry$SelectionElement<R>
extends class04664
implements class01294 {
    protected Rectangle bounds;
    protected boolean active;
    protected DropdownBoxEntry$SelectionTopCellElement<R> topRenderer;
    protected DropdownBoxEntry<R> entry;
    protected DropdownBoxEntry$DropdownMenuElement<R> menu;
    protected boolean dontReFocus = false;

    public DropdownBoxEntry$SelectionElement(DropdownBoxEntry<R> dropdownBoxEntry, Rectangle rectangle, DropdownBoxEntry$DropdownMenuElement<R> dropdownBoxEntry$DropdownMenuElement, DropdownBoxEntry$SelectionTopCellElement<R> dropdownBoxEntry$SelectionTopCellElement, DropdownBoxEntry$SelectionCellCreator<R> dropdownBoxEntry$SelectionCellCreator) {
        this.bounds = rectangle;
        this.entry = dropdownBoxEntry;
        this.menu = Objects.requireNonNull(dropdownBoxEntry$DropdownMenuElement);
        this.menu.entry = dropdownBoxEntry;
        this.menu.cellCreator = Objects.requireNonNull(dropdownBoxEntry$SelectionCellCreator);
        this.menu.initCells();
        this.topRenderer = Objects.requireNonNull(dropdownBoxEntry$SelectionTopCellElement);
        this.topRenderer.entry = dropdownBoxEntry;
    }

    public R getValue() {
        return this.topRenderer.getValue();
    }

    public List<? extends class04654> method_25396() {
        return Lists.newArrayList((Object[])new class04664[]{this.topRenderer, this.menu});
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        class010542.N(this.bounds.x, this.bounds.y, this.bounds.x + this.bounds.width, this.bounds.y + this.bounds.height, this.topRenderer.isSelected ? -1 : -6250336);
        class010542.N(this.bounds.x + 1, this.bounds.y + 1, this.bounds.x + this.bounds.width - 1, this.bounds.y + this.bounds.height - 1, -16777216);
        this.topRenderer.render(class010542, n, n2, this.bounds.x, this.bounds.y, this.bounds.width, this.bounds.height, f);
        this.topRenderer.updateBounds(this.bounds);
        if (this.menu.isExpanded()) {
            this.menu.render(class010542, n, n2, this.bounds, f);
        }
    }

    public boolean method_25405(double d, double d2) {
        return this.bounds.contains(d, d2) || this.menu.isExpanded() && this.menu.method_25405(d, d2);
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.menu.isExpanded()) {
            return this.menu.method_25401(d, d2, d3, d4);
        }
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        this.dontReFocus = false;
        boolean bl2 = super.method_25402(class066132, bl);
        if (this.dontReFocus) {
            this.method_25395(null);
            this.dontReFocus = false;
        }
        return bl2;
    }

    public void lateRender(class01054 class010542, int n, int n2, float f) {
        if (this.menu.isExpanded()) {
            this.menu.lateRender(class010542, n, n2, f);
        }
    }

    @Deprecated
    public DropdownBoxEntry$SelectionTopCellElement<R> getTopRenderer() {
        return this.topRenderer;
    }

    public int getMorePossibleHeight() {
        if (this.menu.isExpanded()) {
            return this.menu.getHeight();
        }
        return -1;
    }
}

