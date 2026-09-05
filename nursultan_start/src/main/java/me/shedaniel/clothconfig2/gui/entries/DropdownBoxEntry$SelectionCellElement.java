/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class04664
 */
package me.shedaniel.clothconfig2.gui.entries;

import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class04664;

public abstract class DropdownBoxEntry$SelectionCellElement<R>
extends class04664 {
    @Deprecated
    final Rectangle bounds = new Rectangle();
    @Deprecated
    DropdownBoxEntry<R> entry;

    public final DropdownBoxEntry<R> getEntry() {
        return this.entry;
    }

    public boolean method_25405(double d, double d2) {
        return this.bounds.contains(d, d2);
    }

    public abstract void render(class01054 var1, int var2, int var3, int var4, int var5, int var6, int var7, float var8);

    public abstract void dontRender(class01054 var1, float var2);

    public abstract class00392 getSearchKey();

    public abstract R getSelection();
}

