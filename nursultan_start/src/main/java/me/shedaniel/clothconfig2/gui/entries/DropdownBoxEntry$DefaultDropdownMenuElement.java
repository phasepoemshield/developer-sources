/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.ImmutableList
 *  com.google.common.collect.Lists
 *  me.shedaniel.clothconfig2.ClothConfigInitializer
 *  me.shedaniel.clothconfig2.api.ScrollingContainer
 *  me.shedaniel.math.Rectangle
 *  minecraft.class00392
 *  minecraft.class01054
 *  minecraft.class01590
 *  minecraft.class04995
 *  minecraft.class05216
 *  minecraft.class05936
 *  minecraft.class06202
 *  minecraft.class06613
 *  minecraft.class08394
 */
package me.shedaniel.clothconfig2.gui.entries;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import java.util.Comparator;
import java.util.List;
import me.shedaniel.clothconfig2.ClothConfigInitializer;
import me.shedaniel.clothconfig2.api.scroll.ScrollingContainer;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$DropdownMenuElement;
import me.shedaniel.clothconfig2.gui.entries.DropdownBoxEntry$SelectionCellElement;
import me.shedaniel.math.Rectangle;
import minecraft.class00392;
import minecraft.class01054;
import minecraft.class01590;
import minecraft.class04995;
import minecraft.class05216;
import minecraft.class05936;
import minecraft.class06202;
import minecraft.class06613;
import minecraft.class08394;

public class DropdownBoxEntry$DefaultDropdownMenuElement<R>
extends DropdownBoxEntry$DropdownMenuElement<R> {
    protected ImmutableList<R> selections;
    protected List<DropdownBoxEntry$SelectionCellElement<R>> cells;
    protected List<DropdownBoxEntry$SelectionCellElement<R>> currentElements;
    protected class00392 lastSearchKeyword = class00392.i();
    protected Rectangle lastRectangle;
    protected boolean scrolling;
    protected double scroll;
    protected double target;
    protected long start;
    protected long duration;

    public DropdownBoxEntry$DefaultDropdownMenuElement(ImmutableList<R> immutableList) {
        this.selections = immutableList;
        this.cells = Lists.newArrayList();
        this.currentElements = Lists.newArrayList();
    }

    public void offset(double d, boolean bl) {
        this.scrollTo(this.target + d, bl);
    }

    public void search() {
        if (this.isSuggestionMode()) {
            this.currentElements.clear();
            String string = this.lastSearchKeyword.getString().toLowerCase();
            for (DropdownBoxEntry$SelectionCellElement<R> dropdownBoxEntry$SelectionCellElement2 : this.cells) {
                class00392 class003922 = dropdownBoxEntry$SelectionCellElement2.getSearchKey();
                if (class003922 != null && !class003922.getString().toLowerCase().contains(string)) continue;
                this.currentElements.add(dropdownBoxEntry$SelectionCellElement2);
            }
            if (!string.isEmpty()) {
                Comparator<DropdownBoxEntry$SelectionCellElement> comparator = Comparator.comparingDouble(dropdownBoxEntry$SelectionCellElement -> dropdownBoxEntry$SelectionCellElement.getSearchKey() == null ? Double.MAX_VALUE : this.similarity(dropdownBoxEntry$SelectionCellElement.getSearchKey().getString(), string));
                this.currentElements.sort(comparator.reversed());
            }
            this.scrollTo(0.0, false);
        } else {
            this.currentElements.clear();
            this.currentElements.addAll(this.cells);
        }
    }

    @Override
    public List<DropdownBoxEntry$SelectionCellElement<R>> method_25396() {
        return this.currentElements;
    }

    public boolean method_25405(double d, double d2) {
        return this.isExpanded() && d >= (double)this.lastRectangle.x && d <= (double)(this.lastRectangle.x + this.getCellCreator().getCellWidth()) && d2 >= (double)(this.lastRectangle.y + this.lastRectangle.height) && d2 <= (double)(this.lastRectangle.y + this.lastRectangle.height + this.getHeight() + 1);
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (!this.isExpanded()) {
            return false;
        }
        if (class066132.v() == 0 && this.scrolling) {
            if (class066132.t() < (double)this.lastRectangle.y + (double)this.lastRectangle.height) {
                this.scrollTo(0.0, false);
            } else if (class066132.t() > (double)this.lastRectangle.y + (double)this.lastRectangle.height + (double)this.getHeight()) {
                this.scrollTo(this.getMaxScrollPosition(), false);
            } else {
                double d3 = Math.max(1.0, this.getMaxScrollPosition());
                int n = this.getHeight();
                int n2 = class04995.N((int)((int)((float)(n * n) / (float)this.getMaxScrollPosition())), (int)32, (int)(n - 8));
                double d4 = Math.max(1.0, d3 / (double)(n - n2));
                this.offset(d2 * d4, false);
            }
            this.target = class04995.N((double)this.target, (double)0.0, (double)this.getMaxScrollPosition());
            return true;
        }
        return false;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.method_25405(d, d2) && d4 != 0.0) {
            this.offset(ClothConfigInitializer.getScrollStep() * -d4, true);
            return true;
        }
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!this.isExpanded()) {
            return false;
        }
        this.updateScrollingState(class066132.n(), class066132.t(), class066132.v());
        return super.method_25402(class066132, bl) || this.scrolling;
    }

    @Override
    public void render(class01054 class010542, int n, int n2, Rectangle rectangle, float f) {
        if (!this.getEntry().selectionElement.topRenderer.getSearchTerm().equals((Object)this.lastSearchKeyword)) {
            this.lastSearchKeyword = this.getEntry().selectionElement.topRenderer.getSearchTerm();
            this.search();
        }
        this.updatePosition(f);
        this.lastRectangle = rectangle.clone();
        this.lastRectangle.translate(0, -1);
    }

    protected double similarity(String string, String string2) {
        int n;
        String string3 = string;
        String string4 = string2;
        if (string.length() < string2.length()) {
            string3 = string2;
            string4 = string;
        }
        if ((n = string3.length()) == 0) {
            return 1.0;
        }
        return (double)(n - this.editDistance(string3, string4)) / (double)n;
    }

    @Override
    public void initCells() {
        for (Object object : this.getSelections()) {
            this.cells.add(this.getCellCreator().create(object));
        }
        for (Object object : this.cells) {
            ((DropdownBoxEntry$SelectionCellElement)((Object)object)).entry = this.getEntry();
        }
        this.search();
    }

    @Override
    public void lateRender(class01054 class010542, int n, int n2, float f) {
        int n3 = this.getHeight();
        int n4 = this.getCellCreator().getCellWidth();
        class010542.N(this.lastRectangle.x, this.lastRectangle.y + this.lastRectangle.height, this.lastRectangle.x + n4, this.lastRectangle.y + this.lastRectangle.height + n3 + 1, this.isExpanded() ? -1 : -6250336);
        class010542.N(this.lastRectangle.x + 1, this.lastRectangle.y + this.lastRectangle.height + 1, this.lastRectangle.x + n4 - 1, this.lastRectangle.y + this.lastRectangle.height + n3, -16777216);
        class010542.L(this.lastRectangle.x, this.lastRectangle.y + this.lastRectangle.height + 1, this.lastRectangle.x + n4 - 6, this.lastRectangle.y + this.lastRectangle.height + n3);
        double d = (double)(this.lastRectangle.y + this.lastRectangle.height) - this.scroll;
        for (DropdownBoxEntry$SelectionCellElement<R> class052162 : this.currentElements) {
            if (d + (double)this.getCellCreator().getCellHeight() >= (double)(this.lastRectangle.y + this.lastRectangle.height) && d <= (double)(this.lastRectangle.y + this.lastRectangle.height + n3 + 1)) {
                class010542.N(this.lastRectangle.x + 1, (int)d, this.lastRectangle.x + this.getCellCreator().getCellWidth(), (int)d + this.getCellCreator().getCellHeight(), -16777216);
                class052162.bounds.setBounds(this.lastRectangle.x, (int)d, this.getMaxScrollPosition() > 6.0 ? this.getCellCreator().getCellWidth() - 6 : this.getCellCreator().getCellWidth(), this.getCellCreator().getCellHeight());
                class052162.render(class010542, n, n2, this.lastRectangle.x, (int)d, this.getMaxScrollPosition() > 6.0 ? this.getCellCreator().getCellWidth() - 6 : this.getCellCreator().getCellWidth(), this.getCellCreator().getCellHeight(), f);
            } else {
                class052162.bounds.setBounds(0, 0, 0, 0);
                class052162.dontRender(class010542, f);
            }
            d += (double)this.getCellCreator().getCellHeight();
        }
        class010542.R();
        if (this.currentElements.isEmpty()) {
            class01590 class015902 = (class01590)class06202.Nq().i_3;
            class05216 n6 = class00392.L((String)"text.cloth-config.dropdown.value.unknown");
            class010542.y(class015902, n6.method_30937(), (int)((float)this.lastRectangle.x + (float)this.getCellCreator().getCellWidth() / 2.0f - (float)class015902.N((class05936)n6) / 2.0f), this.lastRectangle.y + this.lastRectangle.height + 3, -1);
        }
        if (this.getMaxScrollPosition() > 6.0) {
            int n5 = this.lastRectangle.x + this.getCellCreator().getCellWidth() - 6;
            int n6 = n5 + 6;
            int n7 = (int)((double)(n3 * n3) / this.getMaxScrollPosition());
            n7 = class04995.N((int)n7, (int)32, (int)(n3 - 8));
            n7 = (int)((double)n7 - Math.min(this.scroll < 0.0 ? (double)((int)(-this.scroll)) : (this.scroll > this.getMaxScrollPosition() ? (double)((int)this.scroll) - this.getMaxScrollPosition() : 0.0), (double)n7 * 0.95));
            n7 = Math.max(10, n7);
            int n8 = (int)Math.min(Math.max((double)((int)this.scroll * (n3 - n7)) / this.getMaxScrollPosition() + (double)(this.lastRectangle.y + this.lastRectangle.height + 1), (double)(this.lastRectangle.y + this.lastRectangle.height + 1)), (double)(this.lastRectangle.y + this.lastRectangle.height + 1 + n3 - n7));
            class010542.N(class08394.Na, ScrollingContainer.SCROLLER_SPRITE, n5, n8, 6, n7);
        }
    }

    public void scrollTo(double d, boolean bl) {
        this.scrollTo(d, bl, ClothConfigInitializer.getScrollDuration());
    }

    public void scrollTo(double d, boolean bl, long l) {
        this.target = me.shedaniel.clothconfig2.api.ScrollingContainer.clampExtension((double)d, (double)this.getMaxScrollPosition());
        if (bl) {
            this.start = System.currentTimeMillis();
            this.duration = l;
        } else {
            this.scroll = this.target;
        }
    }

    public double getMaxScroll() {
        return this.getCellCreator().getCellHeight() * this.currentElements.size();
    }

    private void updatePosition(float f) {
        double[] dArray = new double[]{this.target};
        this.scroll = me.shedaniel.clothconfig2.api.ScrollingContainer.handleScrollingPosition((double[])dArray, (double)this.scroll, (double)this.getMaxScrollPosition(), (float)f, (double)this.start, (double)this.duration);
        this.target = dArray[0];
    }

    protected int editDistance(String string, String string2) {
        string = string.toLowerCase();
        string2 = string2.toLowerCase();
        int[] nArray = new int[string2.length() + 1];
        for (int i = 0; i <= string.length(); ++i) {
            int n = i;
            for (int j = 0; j <= string2.length(); ++j) {
                if (i == 0) {
                    nArray[j] = j;
                    continue;
                }
                if (j <= 0) continue;
                int n2 = nArray[j - 1];
                if (string.charAt(i - 1) != string2.charAt(j - 1)) {
                    n2 = Math.min(Math.min(n2, n), nArray[j]) + 1;
                }
                nArray[j - 1] = n;
                n = n2;
            }
            if (i <= 0) continue;
            nArray[string2.length()] = n;
        }
        return nArray[string2.length()];
    }

    @Override
    public ImmutableList<R> getSelections() {
        return this.selections;
    }

    @Override
    public int getHeight() {
        return Math.max(Math.min(this.getCellCreator().getDropBoxMaxHeight(), (int)this.getMaxScroll()), 14);
    }

    protected double getMaxScrollPosition() {
        return Math.max(0.0, this.getMaxScroll() - (double)this.getHeight());
    }

    protected void updateScrollingState(double d, double d2, int n) {
        this.scrolling = this.isExpanded() && this.lastRectangle != null && n == 0 && d >= (double)this.lastRectangle.x + (double)this.getCellCreator().getCellWidth() - 6.0 && d < (double)(this.lastRectangle.x + this.getCellCreator().getCellWidth());
    }
}

