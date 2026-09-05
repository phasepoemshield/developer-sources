/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  minecraft.class01054
 *  minecraft.class03255
 *  minecraft.class04995
 *  minecraft.class06601
 *  minecraft.class06613
 *  net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget
 *  net.caffeinemc.mods.sodium.client.util.Dim2i
 */
package me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components;

import java.util.function.Consumer;
import me.flashyreese.mods.reeses_sodium_options.client.gui.frame.components.ScrollBarComponent$ScrollDirection;
import minecraft.class01054;
import minecraft.class03255;
import minecraft.class04995;
import minecraft.class06601;
import minecraft.class06613;
import net.caffeinemc.mods.sodium.client.gui.widgets.AbstractWidget;
import net.caffeinemc.mods.sodium.client.util.Dim2i;

public class ScrollBarComponent
extends AbstractWidget {
    protected static final int SCROLL_STEP = 6;
    private final ScrollBarComponent$ScrollDirection mode;
    private final int contentLength;
    private final int visibleAreaLength;
    private final int maxContentOffset;
    private final Consumer<Integer> offsetChangeListener;
    private final Dim2i extraScrollArea;
    private int offset = 0;
    private boolean isDragging;
    private Dim2i scrollThumb = null;
    private int scrollThumbClickOffset;

    public ScrollBarComponent(Dim2i dim2i, ScrollBarComponent$ScrollDirection scrollBarComponent$ScrollDirection, int n, int n2, Consumer<Integer> consumer) {
        this(dim2i, scrollBarComponent$ScrollDirection, n, n2, consumer, null);
    }

    public ScrollBarComponent(Dim2i dim2i, ScrollBarComponent$ScrollDirection scrollBarComponent$ScrollDirection, int n, int n2, Consumer<Integer> consumer, Dim2i dim2i2) {
        super(dim2i);
        this.mode = scrollBarComponent$ScrollDirection;
        this.contentLength = n;
        this.visibleAreaLength = n2;
        this.offsetChangeListener = consumer;
        this.maxContentOffset = this.contentLength - this.visibleAreaLength;
        this.extraScrollArea = dim2i2;
        this.updateThumbLocation();
    }

    public int getOffset() {
        return this.offset;
    }

    public void setOffset(int n) {
        this.offset = class04995.N((int)n, (int)0, (int)this.maxContentOffset);
        this.updateThumbLocation();
        this.offsetChangeListener.accept(this.offset);
    }

    public boolean method_25404(class06601 class066012) {
        int n;
        if (!this.method_25370()) {
            return false;
        }
        switch (class066012.v()) {
            case 265: {
                int n2 = this.getOffset() - 6;
                break;
            }
            case 264: {
                int n2 = this.getOffset() + 6;
                break;
            }
            case 263: {
                int n2;
                if (this.mode == ScrollBarComponent$ScrollDirection.HORIZONTAL) {
                    n2 = this.getOffset() - 6;
                    break;
                }
                n2 = this.getOffset();
                break;
            }
            case 262: {
                int n2;
                if (this.mode == ScrollBarComponent$ScrollDirection.HORIZONTAL) {
                    n2 = this.getOffset() + 6;
                    break;
                }
                n2 = this.getOffset();
                break;
            }
            default: {
                int n2 = n = this.getOffset();
            }
        }
        if (n != this.getOffset()) {
            this.setOffset(n);
            return true;
        }
        return false;
    }

    public void method_25394(class01054 class010542, int n, int n2, float f) {
        this.drawBorder(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), -5592406);
        this.drawRect(class010542, this.scrollThumb.x(), this.scrollThumb.y(), this.scrollThumb.getLimitX(), this.scrollThumb.getLimitY(), -5592406);
        if (this.method_25370()) {
            this.drawBorder(class010542, this.getX(), this.getY(), this.getLimitX(), this.getLimitY(), -1);
        }
    }

    public class03255 method_48202() {
        return new class03255(this.getX(), this.getY(), this.getWidth(), this.getHeight());
    }

    public boolean method_25403(class06613 class066132, double d, double d2) {
        if (this.isDragging) {
            int n = this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? this.scrollThumb.height() : this.scrollThumb.width();
            int n2 = this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? this.getHeight() : this.getWidth();
            int n3 = (int)(((this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? class066132.t() : class066132.n()) - (double)this.scrollThumbClickOffset - (double)(this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? this.getY() : this.getX()) - (double)n / 2.0) * (double)this.maxContentOffset / (double)(n2 - n));
            this.setOffset(n3);
            return true;
        }
        return false;
    }

    public boolean method_25401(double d, double d2, double d3, double d4) {
        if (this.method_25405(d, d2) || this.extraScrollArea != null && this.extraScrollArea.containsCursor(d, d2)) {
            this.setOffset(this.offset - (int)d4 * 6);
            return true;
        }
        return false;
    }

    public boolean method_25406(class06613 class066132) {
        if (class066132.v() == 0) {
            this.isDragging = false;
        }
        return false;
    }

    public boolean method_25402(class06613 class066132, boolean bl) {
        if (this.method_25405(class066132.n(), class066132.t())) {
            if (this.scrollThumb.containsCursor(class066132.n(), class066132.t())) {
                this.scrollThumbClickOffset = (int)(this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? class066132.t() - (double)this.scrollThumb.getCenterY() : class066132.n() - (double)this.scrollThumb.getCenterX());
                this.isDragging = true;
            } else {
                int n = this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? this.scrollThumb.height() : this.scrollThumb.width();
                int n2 = this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? this.getHeight() : this.getWidth();
                int n3 = (int)(((this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? class066132.t() - (double)this.getY() : class066132.n() - (double)this.getX()) - (double)n / 2.0) * (double)this.maxContentOffset / (double)(n2 - n));
                this.setOffset(n3);
                this.isDragging = false;
            }
            return true;
        }
        this.isDragging = false;
        return false;
    }

    public void updateThumbLocation() {
        int n = this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? this.getHeight() : this.getWidth() - 6;
        int n2 = this.visibleAreaLength * n / this.contentLength;
        int n3 = this.visibleAreaLength - n2;
        int n4 = this.offset * n3 / this.maxContentOffset;
        this.scrollThumb = new Dim2i(this.getX() + 2 + (this.mode == ScrollBarComponent$ScrollDirection.HORIZONTAL ? n4 : 0), this.getY() + 2 + (this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? n4 : 0), (this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? this.getWidth() : n2) - 4, (this.mode == ScrollBarComponent$ScrollDirection.VERTICAL ? n2 : this.getHeight()) - 4);
    }
}

