/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class03428
 *  minecraft.class03432
 *  minecraft.class04654
 *  minecraft.class04927
 *  minecraft.class06202
 */
package me.shedaniel.clothconfig2.gui.entries;

import java.util.Collections;
import java.util.List;
import java.util.Objects;
import me.shedaniel.clothconfig2.gui.entries.AbstractListListEntry$AbstractListCell;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry;
import me.shedaniel.clothconfig2.gui.entries.AbstractTextFieldListListEntry$AbstractTextFieldListCell$1;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class03428;
import minecraft.class03432;
import minecraft.class04654;
import minecraft.class04927;
import minecraft.class06202;

public abstract class AbstractTextFieldListListEntry$AbstractTextFieldListCell<T, SELF extends AbstractTextFieldListListEntry$AbstractTextFieldListCell<T, SELF, OUTER_SELF>, OUTER_SELF extends AbstractTextFieldListListEntry<T, SELF, OUTER_SELF>>
extends AbstractListListEntry$AbstractListCell<T, SELF, OUTER_SELF> {
    protected class04927 widget;
    boolean isSelected;
    private boolean isHovered;

    public AbstractTextFieldListListEntry$AbstractTextFieldListCell(T t, OUTER_SELF OUTER_SELF) {
        super(t, OUTER_SELF);
        T t2 = this.substituteDefault(t);
        this.widget = new AbstractTextFieldListListEntry$AbstractTextFieldListCell$1(this, (class01590)class06202.Nq().i_3, 0, 0, 100, 18, (class00392)class00392.i());
        this.widget.method_1890(this::isValidText);
        this.widget.method_1880(Integer.MAX_VALUE);
        this.widget.method_1858(false);
        this.widget.method_1852(Objects.toString(t2));
        this.widget.method_1870(false);
        this.widget.method_1863(string -> this.widget.method_1868(this.getPreferredTextColor()));
    }

    public List<? extends class04654> method_25396() {
        return Collections.singletonList(this.widget);
    }

    public void method_37020(class03428 class034282) {
        this.widget.method_37020(class034282);
    }

    public class03432 method_37018() {
        return this.isSelected ? class03432.field_33786 : (this.isHovered ? class03432.field_33785 : class03432.field_33784);
    }

    @Override
    public void render(class01054 class010542, int n, int n2, int n3, int n4, int n5, int n6, int n7, boolean bl, float f) {
        this.widget.method_25358(n4 - 12);
        this.widget.method_46421(n3);
        this.widget.method_46419(n2 + 1);
        this.widget.method_1888(((AbstractTextFieldListListEntry)this.listListEntry).isEditable());
        this.widget.method_25394(class010542, n6, n7, f);
        this.isHovered = this.widget.method_25405((double)n6, (double)n7);
        if (bl && ((AbstractTextFieldListListEntry)this.listListEntry).isEditable()) {
            class010542.N(n3, n2 + 12, n3 + n4 - 12, n2 + 13, this.getConfigError().isPresent() ? -43691 : -2039584);
        }
    }

    @Override
    public void updateSelected(boolean bl) {
        this.isSelected = bl;
    }

    protected abstract boolean isValidText(String var1);

    @Override
    public int getCellHeight() {
        return 20;
    }

    protected abstract T substituteDefault(T var1);
}

