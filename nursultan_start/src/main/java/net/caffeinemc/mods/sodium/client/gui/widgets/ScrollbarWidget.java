/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class02089
 *  minecraft.class02106
 *  minecraft.class03428
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.api.util.ColorABGR
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 *  org.jspecify.annotations.NonNull
 *  org.jspecify.annotations.Nullable
 */
package net.caffeinemc.mods.sodium.client.gui.widgets;

import java.util.function.IntConsumer;
import minecraft.class01054;
import minecraft.class02089;
import minecraft.class02106;
import minecraft.class03428;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.api.util.ColorABGR;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;
import org.jspecify.annotations.NonNull;
import org.jspecify.annotations.Nullable;

public class ScrollbarWidget
extends AbstractWidget {
    private static final int COLOR = ColorABGR.pack((int)50, (int)50, (int)50, (int)150);
    private static final int HIGHLIGHT_COLOR = ColorABGR.pack((int)100, (int)100, (int)100, (int)150);
    private final boolean horizontal;
    private final boolean alwaysShow;
    private int visible;
    private int total;
    private int scrollAmount;
    private long lastScrollTime;
    private boolean dragging;
    private final IntConsumer onScrollChange;

    public ScrollbarWidget(Dim2i dim2i, boolean bl, boolean bl2, IntConsumer intConsumer) {
        super(dim2i);
        this.horizontal = bl;
        this.alwaysShow = bl2;
        this.onScrollChange = intConsumer;
    }

    public ScrollbarWidget(Dim2i dim2i, boolean bl, boolean bl2) {
        this(dim2i, bl, bl2, null);
    }

    public ScrollbarWidget(Dim2i dim2i, IntConsumer intConsumer) {
        this(dim2i, false, false, intConsumer);
    }

    public @Nullable class02106 method_48205(class02089 class020892) {
        return null;
    }

    public void method_25394(@NonNull class01054 class010542, int n, int n2, float f) {
        if (!this.canScroll()) {
            return;
        }
        boolean bl = this.method_25405(n, n2);
        if (bl) {
            this.lastScrollTime = Math.max(this.lastScrollTime, System.currentTimeMillis() - 500L);
        }
        long l = System.currentTimeMillis();
        long l2 = l - this.lastScrollTime;
        if (this.alwaysShow || bl || this.dragging || l2 < 1000L) {
            int n3;
            int n4;
            int n5;
            int n6;
            class010542.N(this.getX(), this.getY(), this.getX() + this.getWidth(), this.getY() + this.getHeight(), COLOR);
            if (this.horizontal) {
                n6 = this.getX() + this.getHighlightStart(this.getWidth());
                n5 = this.getY();
                n4 = n6 + this.getHighlightLength(this.getWidth());
                n3 = n5 + this.getHeight();
            } else {
                n6 = this.getX();
                n5 = this.getY() + this.getHighlightStart(this.getHeight());
                n4 = n6 + this.getWidth();
                n3 = n5 + this.getHighlightLength(this.getHeight());
            }
            class010542.N(n6, n5, n4, n3, HIGHLIGHT_COLOR);
        }
    }

    public void method_37020(class03428 class034282) {
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.dragging) {
            this.scroll((int)Math.round(this.horizontal ? d : d2 * ((double)this.total / (double)this.visible)));
            return true;
        }
        return false;
    }

    public boolean method_25406(class06613 class066132) {
        this.dragging = false;
        this.lastScrollTime = Math.max(this.lastScrollTime, System.currentTimeMillis() - 500L);
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (!this.method_25405(class066132.n(), class066132.t()) || !this.canScroll()) {
            return false;
        }
        if (this.isMouseOverHighlight(class066132.n(), class066132.t())) {
            this.dragging = true;
        } else if (this.horizontal) {
            this.scroll(class066132.n() > (double)this.getHighlightStart(this.getWidth()) ? this.getWidth() : -this.getWidth());
        } else {
            this.scroll(class066132.t() > (double)this.getHighlightStart(this.getHeight()) ? this.getHeight() : -this.getHeight());
        }
        return true;
    }

    private int getHighlightStart(int n) {
        return (int)Math.round((double)this.scrollAmount / (double)this.total * (double)n);
    }

    private int getHighlightLength(int n) {
        return (int)Math.round((double)this.visible / (double)this.total * (double)n);
    }

    private boolean setScrollAndNotify(int n) {
        if (n != this.scrollAmount) {
            this.scrollAmount = n;
            if (this.onScrollChange != null) {
                this.onScrollChange.accept(this.scrollAmount);
            }
            return true;
        }
        return false;
    }

    public void setScrollbarContext(int n) {
        this.setScrollbarContext(this.horizontal ? this.getWidth() : this.getHeight(), n);
    }

    public void setScrollbarContext(int n, int n2) {
        this.visible = n;
        this.total = n2;
        this.setScrollAndNotify(Math.max(0, Math.min(n2 - n, this.scrollAmount)));
    }

    private boolean isMouseOverHighlight(double d, double d2) {
        int n;
        int n2;
        int n3;
        int n4;
        if (this.horizontal) {
            n4 = this.getX() + this.getHighlightStart(this.getWidth());
            n3 = this.getY();
            n2 = n4 + this.getHighlightLength(this.getWidth());
            n = n3 + this.getHeight();
        } else {
            n4 = this.getX();
            n3 = this.getY() + this.getHighlightStart(this.getHeight());
            n2 = n4 + this.getWidth();
            n = n3 + this.getHighlightLength(this.getHeight());
        }
        return d >= (double)n4 && d <= (double)n2 && d2 >= (double)n3 && d2 <= (double)n;
    }

    public boolean canScroll() {
        return this.total > this.visible;
    }

    public int getScrollAmount() {
        return this.scrollAmount;
    }

    public void scroll(int n) {
        this.scrollTo(this.scrollAmount + n);
    }

    public void scrollTo(int n) {
        if (this.setScrollAndNotify(Math.max(0, Math.min(this.total - this.visible, n)))) {
            this.lastScrollTime = System.currentTimeMillis();
        }
    }
}

