/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.ClothConfigInitializer
 *  me.shedaniel.clothconfig2.api.animator.NumberAnimator
 *  me.shedaniel.math.Rectangle
 *  minecraft.class01054
 *  minecraft.class01894
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class08394
 */
package me.shedaniel.clothconfig2.api.scroll;

import me.shedaniel.clothconfig2.ClothConfigInitializer;
import me.shedaniel.clothconfig2.api.animator.NumberAnimator;
import me.shedaniel.clothconfig2.api.animator.ValueAnimator;
import me.shedaniel.math.Rectangle;
import minecraft.class01054;
import minecraft.class01894;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class08394;

public abstract class ScrollingContainer {
    public static final class01894 SCROLLER_SPRITE = class01894.y((String)"widget/scroller");
    public static final class01894 SCROLLER_BACKGROUND_SPRITE = class01894.y((String)"widget/scroller_background");
    private final NumberAnimator<Double> scroll = ValueAnimator.ofDouble();
    private boolean draggingScrollBar = false;
    private long scrollDuration = ClothConfigInitializer.getScrollDuration();

    public final double clamp(double d) {
        return this.clamp(d, 200.0);
    }

    public final double clamp(double d, double d2) {
        return class04995.N((double)d, (double)(-d2), (double)((double)this.getMaxScroll() + d2));
    }

    public final void offset(double d, boolean bl) {
        this.scrollTo((Double)this.scroll.target() + d, bl);
    }

    public abstract Rectangle getBounds();

    public boolean mouseDragged(double d, double d2, int n, double d3, double d4, boolean bl, double d5) {
        if (n == 0 && this.draggingScrollBar) {
            float f = this.getMaxScrollHeight();
            Rectangle rectangle = this.getBounds();
            int n2 = rectangle.height;
            if (d2 >= (double)rectangle.y && d2 <= (double)rectangle.getMaxY()) {
                double d6 = Math.max(1, this.getMaxScroll());
                double d7 = class04995.N((double)((double)(n2 * n2) / (double)f), (double)32.0, (double)(n2 - 8));
                double d8 = Math.max(1.0, d6 / ((double)n2 - d7));
                float f2 = class04995.N((float)((float)(this.scrollAmount() + d4 * d8)), (float)0.0f, (float)this.getMaxScroll());
                if (bl) {
                    double d9 = (double)Math.round((double)f2 / d5) * d5;
                    this.scrollTo(d9, false);
                } else {
                    this.scrollTo(f2, false);
                }
            }
            return true;
        }
        return false;
    }

    public boolean mouseDragged(double d, double d2, int n, double d3, double d4) {
        return this.mouseDragged(d, d2, n, d3, d4, false, 0.0);
    }

    public final double scrollAmount() {
        return (Double)this.scroll.value();
    }

    public final void scrollTo(double d, boolean bl) {
        this.scrollTo(d, bl, this.scrollDuration);
    }

    public final void scrollTo(double d, boolean bl, long l) {
        if (bl) {
            this.scroll.setTo(d, l);
        } else {
            this.scroll.setAs(d);
        }
    }

    public static double clampExtension(double d, double d2) {
        return ScrollingContainer.clampExtension(d, d2, 200.0);
    }

    public static double clampExtension(double d, double d2, double d3) {
        return class04995.N((double)d, (double)(-d3), (double)(d2 + d3));
    }

    public final int scrollAmountInt() {
        return (int)Math.round((Double)this.scroll.value());
    }

    public final double scrollTarget() {
        return (Double)this.scroll.target();
    }

    public final int getMaxScroll() {
        return Math.max(0, this.getMaxScrollHeight() - this.getBounds().height);
    }

    public void updatePosition(float f) {
        this.scroll.setTarget(ScrollingContainer.handleBounceBack(this.scrollTarget(), this.getMaxScroll(), f));
        this.scroll.update((double)f);
    }

    public int getScrollBarX(int n) {
        return this.hasScrollBar() ? n - 6 : n;
    }

    public boolean hasScrollBar() {
        return this.getMaxScrollHeight() > this.getBounds().height;
    }

    public abstract int getMaxScrollHeight();

    public void renderScrollBar(class01054 class010542, int n, float f) {
        if (this.hasScrollBar()) {
            Rectangle rectangle = this.getBounds();
            int n2 = this.getMaxScroll();
            int n3 = rectangle.height * rectangle.height / this.getMaxScrollHeight();
            n3 = class04995.N((int)n3, (int)32, (int)rectangle.height);
            n3 = (int)((double)n3 - Math.min((double)(this.scrollAmount() < 0.0 ? (int)(-this.scrollAmount()) : (this.scrollAmount() > (double)n2 ? (int)this.scrollAmount() - n2 : 0)), (double)n3 * 0.95));
            n3 = Math.max(10, n3);
            int n4 = Math.min(Math.max((int)this.scrollAmount() * (rectangle.height - n3) / n2 + rectangle.y, rectangle.y), rectangle.getMaxY() - n3);
            int n5 = this.getScrollBarX(rectangle.getMaxX());
            class010542.N(class08394.Na, SCROLLER_BACKGROUND_SPRITE, n5, rectangle.y, 6, rectangle.height, n);
            class010542.N(class08394.Na, SCROLLER_SPRITE, n5, n4, 6, n3, class02566.y((float)f));
        }
    }

    public void renderScrollBar(class01054 class010542) {
        this.renderScrollBar(class010542, class02566.y((int)255), 1.0f);
    }

    public Rectangle getScissorBounds() {
        Rectangle rectangle = this.getBounds();
        if (this.hasScrollBar()) {
            return new Rectangle(rectangle.x, rectangle.y, rectangle.width - 6, rectangle.height);
        }
        return rectangle;
    }

    public void setScrollDuration(long l) {
        this.scrollDuration = l;
    }

    public void setScrollTarget(double d) {
        this.scroll.setTarget(d);
    }

    public static double handleBounceBack(double d, double d2, float f, double d3) {
        if (d3 >= 0.0) {
            if ((d = ScrollingContainer.clampExtension(d, d2)) < 0.0) {
                d -= d * (1.0 - d3) * (double)f / 3.0;
            } else if (d > d2) {
                d = (d - d2) * (1.0 - (1.0 - d3) * (double)f / 3.0) + d2;
            }
        } else {
            d = ScrollingContainer.clampExtension(d, d2, 0.0);
        }
        return d;
    }

    public static double handleBounceBack(double d, double d2, float f) {
        return ScrollingContainer.handleBounceBack(d, d2, f, ClothConfigInitializer.getBounceBackMultiplier());
    }

    public boolean updateDraggingState(double d, double d2, int n) {
        double d3;
        if (!this.hasScrollBar()) {
            return false;
        }
        double d4 = this.getMaxScroll();
        Rectangle rectangle = this.getBounds();
        int n2 = rectangle.height;
        if (d4 > (double)n2 && d2 >= (double)rectangle.y && d2 <= (double)rectangle.getMaxY() && d >= (d3 = (double)this.getScrollBarX(rectangle.getMaxX())) - 1.0 & d <= d3 + 8.0) {
            this.draggingScrollBar = true;
            return true;
        }
        this.draggingScrollBar = false;
        return false;
    }
}

