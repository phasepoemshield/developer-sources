/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.ClothConfigInitializer
 *  me.shedaniel.clothconfig2.api.ScrollingContainer
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class04995
 *  minecraft.class06202
 *  minecraft.class06613
 */
package me.shedaniel.clothconfig2.gui.widget;

import me.shedaniel.clothconfig2.ClothConfigInitializer;
import me.shedaniel.clothconfig2.api.ScrollingContainer;
import me.shedaniel.clothconfig2.gui.widget.DynamicEntryListWidget;
import me.shedaniel.clothconfig2.gui.widget.DynamicEntryListWidget$Entry;
import me.shedaniel.math.Color;
import me.shedaniel.math.Rectangle;
import me.shedaniel.math.impl.PointHelper;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class04995;
import minecraft.class06202;
import minecraft.class06613;

@Deprecated
public abstract class DynamicNewSmoothScrollingEntryListWidget<E extends DynamicEntryListWidget$Entry<E>>
extends DynamicEntryListWidget<E> {
    protected double target;
    protected boolean smoothScrolling = true;
    protected long start;
    protected long duration;

    public DynamicNewSmoothScrollingEntryListWidget(class06202 class062022, int n, int n2, int n3, int n4, class01894 class018942) {
        super(class062022, n, n2, n3, n4, class018942);
    }

    public void offset(double d, boolean bl) {
        this.scrollTo(this.target + d, bl);
    }

    @Override
    public void method_25394(class01054 class010542, int n, int n2, float f) {
        double[] dArray = new double[]{this.target};
        this.scroll = ScrollingContainer.handleScrollingPosition((double[])dArray, (double)this.scroll, (double)this.getMaxScroll(), (float)f, (double)this.start, (double)this.duration);
        this.target = dArray[0];
        super.method_25394(class010542, n, n2, f);
    }

    @Override
    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (!this.smoothScrolling) {
            return super.method_25403(class066132, d, d2);
        }
        if (this.getFocused() != null && this.method_25397() && class066132.G().v() == 0 && this.getFocused().method_25403(class066132, d, d2)) {
            return true;
        }
        if (class066132.v() == 0 && this.scrolling) {
            if (class066132.t() < (double)this.top) {
                this.capYPosition(0.0);
            } else if (class066132.t() > (double)this.bottom) {
                this.capYPosition(this.getMaxScroll());
            } else {
                double d3 = Math.max(1, this.getMaxScroll());
                int n = this.bottom - this.top;
                int n2 = class04995.N((int)((int)((float)(n * n) / (float)this.getMaxScrollPosition())), (int)32, (int)(n - 8));
                double d4 = Math.max(1.0, d3 / (double)(n - n2));
                this.capYPosition(class04995.N((double)(this.getScroll() + d2 * d4), (double)0.0, (double)this.getMaxScroll()));
            }
            return true;
        }
        return false;
    }

    @Override
    public boolean method_25401(double d, double d2, double d3, double d4) {
        for (DynamicEntryListWidget$Entry dynamicEntryListWidget$Entry : this.visibleChildren()) {
            if (!dynamicEntryListWidget$Entry.method_25401(d, d2, d3, d4)) continue;
            return true;
        }
        if (d4 == 0.0) {
            return false;
        }
        if (!this.smoothScrolling && d4 != 0.0) {
            this.scroll += 16.0 * -d4;
            this.scroll = class04995.N((double)d4, (double)0.0, (double)this.getMaxScroll());
            return true;
        }
        this.offset(ClothConfigInitializer.getScrollStep() * -d4, true);
        return true;
    }

    public void scrollTo(double d, boolean bl, long l) {
        this.target = ScrollingContainer.clampExtension((double)d, (double)this.getMaxScroll());
        if (bl) {
            this.start = System.currentTimeMillis();
            this.duration = l;
        } else {
            this.scroll = this.target;
        }
    }

    public void scrollTo(double d, boolean bl) {
        this.scrollTo(d, bl, ClothConfigInitializer.getScrollDuration());
    }

    @Override
    protected void renderScrollBar(class01054 class010542, int n, int n2, int n3) {
        if (!this.smoothScrolling) {
            super.renderScrollBar(class010542, n, n2, n3);
        } else if (n > 0) {
            int n4 = (this.bottom - this.top) * (this.bottom - this.top) / this.getMaxScrollPosition();
            n4 = class04995.N((int)n4, (int)32, (int)(this.bottom - this.top - 8));
            n4 = (int)((double)n4 - Math.min((double)(this.scroll < 0.0 ? (int)(-this.scroll) : (this.scroll > (double)this.getMaxScroll() ? (int)this.scroll - this.getMaxScroll() : 0)), (double)n4 * 0.95));
            n4 = Math.max(10, n4);
            int n5 = Math.min(Math.max((int)this.getScroll() * (this.bottom - this.top - n4) / n + this.top, this.top), this.bottom - n4);
            int n6 = new Rectangle(n2, n5, n3 - n2, n4).contains(PointHelper.ofMouse()) ? 168 : 128;
            int n7 = new Rectangle(n2, n5, n3 - n2, n4).contains(PointHelper.ofMouse()) ? 222 : 172;
            class010542.N(n2, this.top, n3, this.bottom, -16777216);
            class010542.N(n2, n5, n3, n5 + n4, Color.ofRGBA(n6, n6, n6, 255).getColor());
            class010542.N(n2, n5, n3 - 1, n5 + n4 - 1, Color.ofRGBA(n7, n7, n7, 255).getColor());
        }
    }

    public boolean isSmoothScrolling() {
        return this.smoothScrolling;
    }

    public void setSmoothScrolling(boolean bl) {
        this.smoothScrolling = bl;
    }

    @Override
    public void capYPosition(double d) {
        if (!this.smoothScrolling) {
            this.scroll = class04995.N((double)d, (double)0.0, (double)this.getMaxScroll());
        } else {
            this.scroll = ScrollingContainer.clampExtension((double)d, (double)this.getMaxScroll());
            this.target = ScrollingContainer.clampExtension((double)d, (double)this.getMaxScroll());
        }
    }
}

