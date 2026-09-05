/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  me.shedaniel.clothconfig2.api.scroll.ScrollingContainer
 *  me.shedaniel.clothconfig2.impl.EasingMethod
 *  me.shedaniel.math.Rectangle
 *  minecraft.class01054
 *  minecraft.class02566
 *  minecraft.class04995
 *  minecraft.class08394
 */
package me.shedaniel.clothconfig2.api;

import me.shedaniel.clothconfig2.ClothConfigInitializer;
import me.shedaniel.clothconfig2.impl.EasingMethod;
import me.shedaniel.math.Rectangle;
import minecraft.class01054;
import minecraft.class02566;
import minecraft.class04995;
import minecraft.class08394;

@Deprecated
public abstract class ScrollingContainer {
    public double scrollAmount;
    public double scrollTarget;
    public long start;
    public long duration;
    public boolean draggingScrollBar = false;

    public final double clamp(double d) {
        return this.clamp(d, 200.0);
    }

    public final double clamp(double d, double d2) {
        return class04995.N((double)d, (double)(-d2), (double)((double)this.getMaxScroll() + d2));
    }

    public final void offset(double d, boolean bl) {
        this.scrollTo(this.scrollTarget + d, bl);
    }

    public abstract Rectangle getBounds();

    public static double ease(double d, double d2, double d3, EasingMethod easingMethod) {
        return d + (d2 - d) * easingMethod.apply(d3);
    }

    public boolean mouseDragged(double d, double d2, int n, double d3, double d4, boolean bl, double d5) {
        if (n == 0 && this.draggingScrollBar) {
            float f = this.getMaxScrollHeight();
            Rectangle rectangle = this.getBounds();
            int n2 = rectangle.height;
            if (d2 >= (double)rectangle.y && d2 <= (double)rectangle.getMaxY()) {
                double d6 = Math.max(1, this.getMaxScroll());
                double d7 = class04995.N((double)((double)(n2 * n2) / (double)f), (double)32.0, (double)(n2 - 8));
                double d8 = Math.max(1.0, d6 / ((double)n2 - d7));
                float f2 = class04995.N((float)((float)(this.scrollAmount + d4 * d8)), (float)0.0f, (float)this.getMaxScroll());
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

    public final void scrollTo(double d, boolean bl) {
        this.scrollTo(d, bl, ClothConfigInitializer.getScrollDuration());
    }

    public final void scrollTo(double d, boolean bl, long l) {
        this.scrollTarget = this.clamp(d);
        if (bl) {
            this.start = System.currentTimeMillis();
            this.duration = l;
        } else {
            this.scrollAmount = this.scrollTarget;
        }
    }

    public static double clampExtension(double d, double d2) {
        return ScrollingContainer.clampExtension(d, d2, 200.0);
    }

    public static double clampExtension(double d, double d2, double d3) {
        return class04995.N((double)d, (double)(-d3), (double)(d2 + d3));
    }

    public final int getMaxScroll() {
        return Math.max(0, this.getMaxScrollHeight() - this.getBounds().height);
    }

    public void updatePosition(float f) {
        double[] dArray = new double[]{this.scrollTarget};
        this.scrollAmount = ScrollingContainer.handleScrollingPosition(dArray, this.scrollAmount, this.getMaxScroll(), f, this.start, this.duration);
        this.scrollTarget = dArray[0];
    }

    public int getScrollBarX() {
        return this.hasScrollBar() ? this.getBounds().getMaxX() - 6 : this.getBounds().getMaxX();
    }

    public boolean hasScrollBar() {
        return this.getMaxScrollHeight() > this.getBounds().height;
    }

    public abstract int getMaxScrollHeight();

    public void renderScrollBar(class01054 class010542, int n, float f, float f2) {
        if (this.hasScrollBar()) {
            Rectangle rectangle = this.getBounds();
            int n2 = this.getMaxScroll();
            int n3 = rectangle.height * rectangle.height / this.getMaxScrollHeight();
            n3 = class04995.N((int)n3, (int)32, (int)rectangle.height);
            n3 = (int)((double)n3 - Math.min((double)(this.scrollAmount < 0.0 ? (int)(-this.scrollAmount) : (this.scrollAmount > (double)n2 ? (int)this.scrollAmount - n2 : 0)), (double)n3 * 0.95));
            n3 = Math.max(10, n3);
            int n4 = Math.min(Math.max((int)this.scrollAmount * (rectangle.height - n3) / n2 + rectangle.y, rectangle.y), rectangle.getMaxY() - n3);
            int n5 = this.getScrollBarX();
            class010542.N(class08394.Na, me.shedaniel.clothconfig2.api.scroll.ScrollingContainer.SCROLLER_BACKGROUND_SPRITE, n5, rectangle.y, 6, rectangle.height, n);
            class010542.N(class08394.Na, me.shedaniel.clothconfig2.api.scroll.ScrollingContainer.SCROLLER_SPRITE, n5, n4, 6, n3, class02566.y((float)f));
        }
    }

    public void renderScrollBar(class01054 class010542) {
        this.renderScrollBar(class010542, 0, 1.0f, 1.0f);
    }

    public Rectangle getScissorBounds() {
        Rectangle rectangle = this.getBounds();
        if (this.hasScrollBar()) {
            return new Rectangle(rectangle.x, rectangle.y, rectangle.width - 6, rectangle.height);
        }
        return rectangle;
    }

    public static double handleScrollingPosition(double[] dArray, double d, double d2, float f, double d3, double d4) {
        return ScrollingContainer.handleScrollingPosition(dArray, d, d2, f, d3, d4, ClothConfigInitializer.getBounceBackMultiplier(), ClothConfigInitializer.getEasingMethod());
    }

    public static double handleScrollingPosition(double[] dArray, double d, double d2, float f, double d3, double d4, double d5, EasingMethod easingMethod) {
        if (d5 >= 0.0) {
            dArray[0] = ScrollingContainer.clampExtension(dArray[0], d2);
            if (dArray[0] < 0.0) {
                dArray[0] = dArray[0] - dArray[0] * (1.0 - d5) * (double)f / 3.0;
            } else if (dArray[0] > d2) {
                dArray[0] = (dArray[0] - d2) * (1.0 - (1.0 - d5) * (double)f / 3.0) + d2;
            }
        } else {
            dArray[0] = ScrollingContainer.clampExtension(dArray[0], d2, 0.0);
        }
        return ScrollingContainer.ease(d, dArray[0], Math.min(((double)System.currentTimeMillis() - d3) / d4 * (double)f * 3.0, 1.0), easingMethod);
    }

    public boolean updateDraggingState(double d, double d2, int n) {
        double d3;
        if (!this.hasScrollBar()) {
            return false;
        }
        double d4 = this.getMaxScroll();
        Rectangle rectangle = this.getBounds();
        int n2 = rectangle.height;
        if (d4 > (double)n2 && d2 >= (double)rectangle.y && d2 <= (double)rectangle.getMaxY() && d >= (d3 = (double)this.getScrollBarX()) - 1.0 & d <= d3 + 8.0) {
            this.draggingScrollBar = true;
            return true;
        }
        this.draggingScrollBar = false;
        return false;
    }
}

