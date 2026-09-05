/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04654
 *  minecraft.class06202
 *  minecraft.class06613
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Collections;
import java.util.List;
import java.util.function.Function;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellElement;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04654;
import minecraft.class06202;
import minecraft.class06613;

public class DropdownBoxEntry$DefaultSelectionCellElement<R>
extends DropdownBoxEntry$SelectionCellElement<R> {
    protected R r;
    protected int x;
    protected int y;
    protected int width;
    protected int height;
    protected boolean rendering;
    protected Function<R, class00392> toTextFunction;

    public DropdownBoxEntry$DefaultSelectionCellElement(R r, Function<R, class00392> function) {
        this.r = r;
        this.toTextFunction = function;
    }

    public List<? extends class04654> method_25396() {
        return Collections.emptyList();
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        boolean bl2;
        boolean bl3 = bl2 = this.rendering && class066132.n() >= (double)this.x && class066132.n() <= (double)(this.x + this.width) && class066132.t() >= (double)this.y && class066132.t() <= (double)(this.y + this.height);
        if (bl2) {
            this.getEntry().selectionElement.topRenderer.setValue(this.r);
            this.getEntry().selectionElement.method_25395(null);
            this.getEntry().selectionElement.dontReFocus = true;
            return true;
        }
        return false;
    }

    @Override
    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, float f) {
        boolean bl;
        this.rendering = true;
        this.x = n3;
        this.y = n4;
        this.width = n5;
        this.height = n6;
        boolean bl2 = bl = n >= n3 && n <= n3 + n5 && n2 >= n4 && n2 <= n4 + n6;
        if (bl) {
            class010542.N(n3 + 1, n4 + 1, n3 + n5 - 1, n4 + n6 - 1, -15132391);
        }
        class010542.y((class01590)class06202.Nq().i_3, this.toTextFunction.apply(this.r).method_30937(), n3 + 6, n4 + 3, bl ? -1 : -7829368);
    }

    @Override
    public void dontRender(class01054 class010542, float f) {
        this.rendering = false;
    }

    @Override
    public class00392 getSearchKey() {
        return this.toTextFunction.apply(this.r);
    }

    @Override
    public R getSelection() {
        return this.r;
    }
}

